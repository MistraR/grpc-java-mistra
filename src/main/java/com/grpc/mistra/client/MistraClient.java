package com.grpc.mistra.client;


import com.grpc.mistra.generate.MistraRequest;
import com.grpc.mistra.generate.MistraResponse;
import com.grpc.mistra.generate.MistraServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @Author: WangRui
 * @Date: 2018/11/27
 * Time: 14:46
 * Description:
 */
public class MistraClient {

    private final ManagedChannel channel;
    private final MistraServiceGrpc.MistraServiceBlockingStub blockingStub;

    public MistraClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();

        blockingStub = MistraServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        MistraRequest request = MistraRequest.newBuilder().setName(name).build();
        MistraResponse response = blockingStub.sayHello(request);
        System.out.println(response.getMessage());

    }

    public static void main(String[] args) throws InterruptedException {
        MistraClient client = new MistraClient("127.0.0.1", 8001);
        System.out.println("-------------------客户端开始访问请求-------------------");
        for (int i = 0; i < 10; i++) {
            client.greet("你若想生存，绝处也能缝生: " + i);
        }
    }
}
