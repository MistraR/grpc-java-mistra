package com.grpc.mistra.generate;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 声明一个服务名称
 * </pre>
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.11.0)",
        comments = "Source: helloworld.proto")
public final class MistraServiceGrpc {

    private MistraServiceGrpc() {
    }

    public static final String SERVICE_NAME = "mistra.MistraService";

    // Static method descriptors that strictly reflect the proto.
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    @Deprecated // Use {@link #getSayHelloMethod()} instead.
    public static final io.grpc.MethodDescriptor<MistraRequest,
            MistraResponse> METHOD_SAY_HELLO = getSayHelloMethodHelper();

    private static volatile io.grpc.MethodDescriptor<MistraRequest,
            MistraResponse> getSayHelloMethod;

    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
    public static io.grpc.MethodDescriptor<MistraRequest,
            MistraResponse> getSayHelloMethod() {
        return getSayHelloMethodHelper();
    }

    private static io.grpc.MethodDescriptor<MistraRequest,
            MistraResponse> getSayHelloMethodHelper() {
        io.grpc.MethodDescriptor<MistraRequest, MistraResponse> getSayHelloMethod;
        if ((getSayHelloMethod = MistraServiceGrpc.getSayHelloMethod) == null) {
            synchronized (MistraServiceGrpc.class) {
                if ((getSayHelloMethod = MistraServiceGrpc.getSayHelloMethod) == null) {
                    MistraServiceGrpc.getSayHelloMethod = getSayHelloMethod =
                            io.grpc.MethodDescriptor.<MistraRequest, MistraResponse>newBuilder()
                                    .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                                    .setFullMethodName(generateFullMethodName(
                                            "mistra.MistraService", "SayHello"))
                                    .setSampledToLocalTracing(true)
                                    .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            MistraRequest.getDefaultInstance()))
                                    .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                            MistraResponse.getDefaultInstance()))
                                    .setSchemaDescriptor(new MistraServiceMethodDescriptorSupplier("SayHello"))
                                    .build();
                }
            }
        }
        return getSayHelloMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MistraServiceStub newStub(io.grpc.Channel channel) {
        return new MistraServiceStub(channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MistraServiceBlockingStub newBlockingStub(
            io.grpc.Channel channel) {
        return new MistraServiceBlockingStub(channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MistraServiceFutureStub newFutureStub(
            io.grpc.Channel channel) {
        return new MistraServiceFutureStub(channel);
    }

    /**
     * <pre>
     * 声明一个服务名称
     * </pre>
     */
    public static abstract class MistraServiceImplBase implements io.grpc.BindableService {

        /**
         * <pre>
         * 请求参数MistraRequest   响应参数MistraResponse
         * </pre>
         */
        public void sayHello(MistraRequest request,
                             io.grpc.stub.StreamObserver<MistraResponse> responseObserver) {
            asyncUnimplementedUnaryCall(getSayHelloMethodHelper(), responseObserver);
        }

        @Override
        public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            getSayHelloMethodHelper(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            MistraRequest,
                                            MistraResponse>(
                                            this, METHODID_SAY_HELLO)))
                    .build();
        }
    }

    /**
     * <pre>
     * 声明一个服务名称
     * </pre>
     */
    public static final class MistraServiceStub extends io.grpc.stub.AbstractStub<MistraServiceStub> {
        private MistraServiceStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MistraServiceStub(io.grpc.Channel channel,
                                  io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MistraServiceStub build(io.grpc.Channel channel,
                                          io.grpc.CallOptions callOptions) {
            return new MistraServiceStub(channel, callOptions);
        }

        /**
         * <pre>
         * 请求参数MistraRequest   响应参数MistraResponse
         * </pre>
         */
        public void sayHello(MistraRequest request,
                             io.grpc.stub.StreamObserver<MistraResponse> responseObserver) {
            asyncUnaryCall(
                    getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request, responseObserver);
        }
    }

    /**
     * <pre>
     * 声明一个服务名称
     * </pre>
     */
    public static final class MistraServiceBlockingStub extends io.grpc.stub.AbstractStub<MistraServiceBlockingStub> {
        private MistraServiceBlockingStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MistraServiceBlockingStub(io.grpc.Channel channel,
                                          io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MistraServiceBlockingStub build(io.grpc.Channel channel,
                                                  io.grpc.CallOptions callOptions) {
            return new MistraServiceBlockingStub(channel, callOptions);
        }

        /**
         * <pre>
         * 请求参数MistraRequest   响应参数MistraResponse
         * </pre>
         */
        public MistraResponse sayHello(MistraRequest request) {
            return blockingUnaryCall(
                    getChannel(), getSayHelloMethodHelper(), getCallOptions(), request);
        }
    }

    /**
     * <pre>
     * 声明一个服务名称
     * </pre>
     */
    public static final class MistraServiceFutureStub extends io.grpc.stub.AbstractStub<MistraServiceFutureStub> {
        private MistraServiceFutureStub(io.grpc.Channel channel) {
            super(channel);
        }

        private MistraServiceFutureStub(io.grpc.Channel channel,
                                        io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @Override
        protected MistraServiceFutureStub build(io.grpc.Channel channel,
                                                io.grpc.CallOptions callOptions) {
            return new MistraServiceFutureStub(channel, callOptions);
        }

        /**
         * <pre>
         * 请求参数MistraRequest   响应参数MistraResponse
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<MistraResponse> sayHello(
                MistraRequest request) {
            return futureUnaryCall(
                    getChannel().newCall(getSayHelloMethodHelper(), getCallOptions()), request);
        }
    }

    private static final int METHODID_SAY_HELLO = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final MistraServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(MistraServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_SAY_HELLO:
                    serviceImpl.sayHello((MistraRequest) request,
                            (io.grpc.stub.StreamObserver<MistraResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @Override
        @SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(
                io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    private static abstract class MistraServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
        MistraServiceBaseDescriptorSupplier() {
        }

        @Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return MistraProto.getDescriptor();
        }

        @Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MistraService");
        }
    }

    private static final class MistraServiceFileDescriptorSupplier
            extends MistraServiceBaseDescriptorSupplier {
        MistraServiceFileDescriptorSupplier() {
        }
    }

    private static final class MistraServiceMethodDescriptorSupplier
            extends MistraServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
        private final String methodName;

        MistraServiceMethodDescriptorSupplier(String methodName) {
            this.methodName = methodName;
        }

        @Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (MistraServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new MistraServiceFileDescriptorSupplier())
                            .addMethod(getSayHelloMethodHelper())
                            .build();
                }
            }
        }
        return result;
    }
}
