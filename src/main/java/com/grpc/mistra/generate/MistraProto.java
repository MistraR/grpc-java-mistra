// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package com.grpc.mistra.generate;

public final class MistraProto {
    private MistraProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_mistra_MistraRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_mistra_MistraRequest_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_mistra_MistraResponse_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_mistra_MistraResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\020helloworld.proto\022\006mistra\"\035\n\rMistraRequ" +
                        "est\022\014\n\004name\030\001 \001(\t\"!\n\016MistraResponse\022\017\n\007m" +
                        "essage\030\001 \001(\t2J\n\rMistraService\0229\n\010SayHell" +
                        "o\022\025.mistra.MistraRequest\032\026.mistra.Mistra" +
                        "ResponseB)\n\030com.grpc.mistra.generateB\013Mi" +
                        "straProtoP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_mistra_MistraRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_mistra_MistraRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_mistra_MistraRequest_descriptor,
                new String[]{"Name",});
        internal_static_mistra_MistraResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_mistra_MistraResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_mistra_MistraResponse_descriptor,
                new String[]{"Message",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
