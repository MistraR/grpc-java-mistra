package com.grpc.mistra.server;


import com.grpc.mistra.generate.MistraRequest;
import com.grpc.mistra.generate.MistraResponse;
import com.grpc.mistra.generate.MistraServiceGrpc;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

/**
 * @Author: WangRui
 * @Date: 2018/11/27
 * Time: 14:46
 * Description:
 */
public class MistraServer {

    private int port = 8851;
    private Server server;

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService((BindableService) new MistraHelloWorldImpl())
                .build()
                .start();

        System.out.println("service start...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {

                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                MistraServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }


    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {

        final MistraServer server = new MistraServer();
        server.start();
        server.blockUntilShutdown();
    }


    // 实现 定义一个实现服务接口的类
    private class MistraHelloWorldImpl extends MistraServiceGrpc.MistraServiceImplBase {

        @Override
        public void sayHello(MistraRequest mistraRequest, StreamObserver<MistraResponse> responseObserver) {
            // 具体其他丰富的业务实现代码

            System.err.println("service:" + mistraRequest.getName());
            MistraResponse reply = MistraResponse.newBuilder().setMessage(("Hello: " + mistraRequest.getName())).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }
}
