/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.discoveryengine.v1alpha;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service for managing
 * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/discoveryengine/v1alpha/data_store_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataStoreServiceGrpc {

  private DataStoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME =
      "google.cloud.discoveryengine.v1alpha.DataStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest,
          com.google.longrunning.Operation>
      getCreateDataStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataStore",
      requestType = com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest,
          com.google.longrunning.Operation>
      getCreateDataStoreMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest,
            com.google.longrunning.Operation>
        getCreateDataStoreMethod;
    if ((getCreateDataStoreMethod = DataStoreServiceGrpc.getCreateDataStoreMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getCreateDataStoreMethod = DataStoreServiceGrpc.getCreateDataStoreMethod) == null) {
          DataStoreServiceGrpc.getCreateDataStoreMethod =
              getCreateDataStoreMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataStore"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier("CreateDataStore"))
                      .build();
        }
      }
    }
    return getCreateDataStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest,
          com.google.cloud.discoveryengine.v1alpha.DataStore>
      getGetDataStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataStore",
      requestType = com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest.class,
      responseType = com.google.cloud.discoveryengine.v1alpha.DataStore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest,
          com.google.cloud.discoveryengine.v1alpha.DataStore>
      getGetDataStoreMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest,
            com.google.cloud.discoveryengine.v1alpha.DataStore>
        getGetDataStoreMethod;
    if ((getGetDataStoreMethod = DataStoreServiceGrpc.getGetDataStoreMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getGetDataStoreMethod = DataStoreServiceGrpc.getGetDataStoreMethod) == null) {
          DataStoreServiceGrpc.getGetDataStoreMethod =
              getGetDataStoreMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest,
                          com.google.cloud.discoveryengine.v1alpha.DataStore>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataStore"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.DataStore
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier("GetDataStore"))
                      .build();
        }
      }
    }
    return getGetDataStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest,
          com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
      getListDataStoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataStores",
      requestType = com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest.class,
      responseType = com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest,
          com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
      getListDataStoresMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest,
            com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
        getListDataStoresMethod;
    if ((getListDataStoresMethod = DataStoreServiceGrpc.getListDataStoresMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getListDataStoresMethod = DataStoreServiceGrpc.getListDataStoresMethod) == null) {
          DataStoreServiceGrpc.getListDataStoresMethod =
              getListDataStoresMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest,
                          com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataStores"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier("ListDataStores"))
                      .build();
        }
      }
    }
    return getListDataStoresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest,
          com.google.longrunning.Operation>
      getDeleteDataStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataStore",
      requestType = com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest.class,
      responseType = com.google.longrunning.Operation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest,
          com.google.longrunning.Operation>
      getDeleteDataStoreMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest,
            com.google.longrunning.Operation>
        getDeleteDataStoreMethod;
    if ((getDeleteDataStoreMethod = DataStoreServiceGrpc.getDeleteDataStoreMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getDeleteDataStoreMethod = DataStoreServiceGrpc.getDeleteDataStoreMethod) == null) {
          DataStoreServiceGrpc.getDeleteDataStoreMethod =
              getDeleteDataStoreMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataStore"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier("DeleteDataStore"))
                      .build();
        }
      }
    }
    return getDeleteDataStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest,
          com.google.cloud.discoveryengine.v1alpha.DataStore>
      getUpdateDataStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataStore",
      requestType = com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest.class,
      responseType = com.google.cloud.discoveryengine.v1alpha.DataStore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest,
          com.google.cloud.discoveryengine.v1alpha.DataStore>
      getUpdateDataStoreMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest,
            com.google.cloud.discoveryengine.v1alpha.DataStore>
        getUpdateDataStoreMethod;
    if ((getUpdateDataStoreMethod = DataStoreServiceGrpc.getUpdateDataStoreMethod) == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getUpdateDataStoreMethod = DataStoreServiceGrpc.getUpdateDataStoreMethod) == null) {
          DataStoreServiceGrpc.getUpdateDataStoreMethod =
              getUpdateDataStoreMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest,
                          com.google.cloud.discoveryengine.v1alpha.DataStore>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataStore"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.DataStore
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier("UpdateDataStore"))
                      .build();
        }
      }
    }
    return getUpdateDataStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
      getGetDocumentProcessingConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDocumentProcessingConfig",
      requestType =
          com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest.class,
      responseType = com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
      getGetDocumentProcessingConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest,
            com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
        getGetDocumentProcessingConfigMethod;
    if ((getGetDocumentProcessingConfigMethod =
            DataStoreServiceGrpc.getGetDocumentProcessingConfigMethod)
        == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getGetDocumentProcessingConfigMethod =
                DataStoreServiceGrpc.getGetDocumentProcessingConfigMethod)
            == null) {
          DataStoreServiceGrpc.getGetDocumentProcessingConfigMethod =
              getGetDocumentProcessingConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest,
                          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetDocumentProcessingConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha
                                  .GetDocumentProcessingConfigRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier(
                              "GetDocumentProcessingConfig"))
                      .build();
        }
      }
    }
    return getGetDocumentProcessingConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
      getUpdateDocumentProcessingConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDocumentProcessingConfig",
      requestType =
          com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest.class,
      responseType = com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest,
          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
      getUpdateDocumentProcessingConfigMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest,
            com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
        getUpdateDocumentProcessingConfigMethod;
    if ((getUpdateDocumentProcessingConfigMethod =
            DataStoreServiceGrpc.getUpdateDocumentProcessingConfigMethod)
        == null) {
      synchronized (DataStoreServiceGrpc.class) {
        if ((getUpdateDocumentProcessingConfigMethod =
                DataStoreServiceGrpc.getUpdateDocumentProcessingConfigMethod)
            == null) {
          DataStoreServiceGrpc.getUpdateDocumentProcessingConfigMethod =
              getUpdateDocumentProcessingConfigMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.discoveryengine.v1alpha
                              .UpdateDocumentProcessingConfigRequest,
                          com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateDocumentProcessingConfig"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha
                                  .UpdateDocumentProcessingConfigRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataStoreServiceMethodDescriptorSupplier(
                              "UpdateDocumentProcessingConfig"))
                      .build();
        }
      }
    }
    return getUpdateDocumentProcessingConfigMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static DataStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceStub>() {
          @java.lang.Override
          public DataStoreServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataStoreServiceStub(channel, callOptions);
          }
        };
    return DataStoreServiceStub.newStub(factory, channel);
  }

  /** Creates a new blocking-style stub that supports all types of calls on the service */
  public static DataStoreServiceBlockingV2Stub newBlockingV2Stub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingV2Stub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingV2Stub>() {
          @java.lang.Override
          public DataStoreServiceBlockingV2Stub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataStoreServiceBlockingV2Stub(channel, callOptions);
          }
        };
    return DataStoreServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataStoreServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceBlockingStub>() {
          @java.lang.Override
          public DataStoreServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataStoreServiceBlockingStub(channel, callOptions);
          }
        };
    return DataStoreServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static DataStoreServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<DataStoreServiceFutureStub>() {
          @java.lang.Override
          public DataStoreServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new DataStoreServiceFutureStub(channel, callOptions);
          }
        };
    return DataStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * Creates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * DataStore is for storing
     * [Documents][google.cloud.discoveryengine.v1alpha.Document]. To serve these
     * documents for Search, or Recommendation use case, an
     * [Engine][google.cloud.discoveryengine.v1alpha.Engine] needs to be created
     * separately.
     * </pre>
     */
    default void createDataStore(
        com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getCreateDataStoreMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    default void getDataStore(
        com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetDataStoreMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s
     * associated with the project.
     * </pre>
     */
    default void listDataStores(
        com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListDataStoresMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    default void deleteDataStore(
        com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getDeleteDataStoreMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]
     * </pre>
     */
    default void updateDataStore(
        com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateDataStoreMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    default void getDocumentProcessingConfig(
        com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetDocumentProcessingConfigMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig]
     * is a singleon resource of
     * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]. It's empty
     * when [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] is
     * created. The first call to this method will set up
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    default void updateDocumentProcessingConfig(
        com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUpdateDocumentProcessingConfigMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataStoreService.
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public abstract static class DataStoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return DataStoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataStoreService.
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public static final class DataStoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataStoreServiceStub> {
    private DataStoreServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * DataStore is for storing
     * [Documents][google.cloud.discoveryengine.v1alpha.Document]. To serve these
     * documents for Search, or Recommendation use case, an
     * [Engine][google.cloud.discoveryengine.v1alpha.Engine] needs to be created
     * separately.
     * </pre>
     */
    public void createDataStore(
        com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataStoreMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public void getDataStore(
        com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataStoreMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s
     * associated with the project.
     * </pre>
     */
    public void listDataStores(
        com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataStoresMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public void deleteDataStore(
        com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataStoreMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]
     * </pre>
     */
    public void updateDataStore(
        com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataStoreMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public void getDocumentProcessingConfig(
        com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDocumentProcessingConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates the
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig]
     * is a singleon resource of
     * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]. It's empty
     * when [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] is
     * created. The first call to this method will set up
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public void updateDocumentProcessingConfig(
        com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDocumentProcessingConfigMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataStoreService.
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public static final class DataStoreServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DataStoreServiceBlockingV2Stub> {
    private DataStoreServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * DataStore is for storing
     * [Documents][google.cloud.discoveryengine.v1alpha.Document]. To serve these
     * documents for Search, or Recommendation use case, an
     * [Engine][google.cloud.discoveryengine.v1alpha.Engine] needs to be created
     * separately.
     * </pre>
     */
    public com.google.longrunning.Operation createDataStore(
        com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DataStore getDataStore(
        com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s
     * associated with the project.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse listDataStores(
        com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataStoresMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.longrunning.Operation deleteDataStore(
        com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DataStore updateDataStore(
        com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
        getDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentProcessingConfigMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig]
     * is a singleon resource of
     * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]. It's empty
     * when [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] is
     * created. The first call to this method will set up
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
        updateDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest
                request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDocumentProcessingConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DataStoreService.
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public static final class DataStoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataStoreServiceBlockingStub> {
    private DataStoreServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * DataStore is for storing
     * [Documents][google.cloud.discoveryengine.v1alpha.Document]. To serve these
     * documents for Search, or Recommendation use case, an
     * [Engine][google.cloud.discoveryengine.v1alpha.Engine] needs to be created
     * separately.
     * </pre>
     */
    public com.google.longrunning.Operation createDataStore(
        com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DataStore getDataStore(
        com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s
     * associated with the project.
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse listDataStores(
        com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataStoresMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.longrunning.Operation deleteDataStore(
        com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DataStore updateDataStore(
        com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataStoreMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
        getDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentProcessingConfigMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig]
     * is a singleon resource of
     * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]. It's empty
     * when [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] is
     * created. The first call to this method will set up
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig
        updateDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest
                request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDocumentProcessingConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataStoreService.
   *
   * <pre>
   * Service for managing
   * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] configuration.
   * </pre>
   */
  public static final class DataStoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataStoreServiceFutureStub> {
    private DataStoreServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataStoreServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * DataStore is for storing
     * [Documents][google.cloud.discoveryengine.v1alpha.Document]. To serve these
     * documents for Search, or Recommendation use case, an
     * [Engine][google.cloud.discoveryengine.v1alpha.Engine] needs to be created
     * separately.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createDataStore(com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataStoreMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1alpha.DataStore>
        getDataStore(com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataStoreMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all the [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]s
     * associated with the project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>
        listDataStores(com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataStoresMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        deleteDataStore(com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataStoreMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates a [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1alpha.DataStore>
        updateDataStore(com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataStoreMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
        getDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDocumentProcessingConfigMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates the
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig]
     * is a singleon resource of
     * [DataStore][google.cloud.discoveryengine.v1alpha.DataStore]. It's empty
     * when [DataStore][google.cloud.discoveryengine.v1alpha.DataStore] is
     * created. The first call to this method will set up
     * [DocumentProcessingConfig][google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig].
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>
        updateDocumentProcessingConfig(
            com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest
                request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDocumentProcessingConfigMethod(), getCallOptions()),
          request);
    }
  }

  private static final int METHODID_CREATE_DATA_STORE = 0;
  private static final int METHODID_GET_DATA_STORE = 1;
  private static final int METHODID_LIST_DATA_STORES = 2;
  private static final int METHODID_DELETE_DATA_STORE = 3;
  private static final int METHODID_UPDATE_DATA_STORE = 4;
  private static final int METHODID_GET_DOCUMENT_PROCESSING_CONFIG = 5;
  private static final int METHODID_UPDATE_DOCUMENT_PROCESSING_CONFIG = 6;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATA_STORE:
          serviceImpl.createDataStore(
              (com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_DATA_STORE:
          serviceImpl.getDataStore(
              (com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>)
                  responseObserver);
          break;
        case METHODID_LIST_DATA_STORES:
          serviceImpl.listDataStores(
              (com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_DATA_STORE:
          serviceImpl.deleteDataStore(
              (com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_STORE:
          serviceImpl.updateDataStore(
              (com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.discoveryengine.v1alpha.DataStore>)
                  responseObserver);
          break;
        case METHODID_GET_DOCUMENT_PROCESSING_CONFIG:
          serviceImpl.getDocumentProcessingConfig(
              (com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>)
                  responseObserver);
          break;
        case METHODID_UPDATE_DOCUMENT_PROCESSING_CONFIG:
          serviceImpl.updateDocumentProcessingConfig(
              (com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest)
                  request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getCreateDataStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest,
                    com.google.longrunning.Operation>(service, METHODID_CREATE_DATA_STORE)))
        .addMethod(
            getGetDataStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.GetDataStoreRequest,
                    com.google.cloud.discoveryengine.v1alpha.DataStore>(
                    service, METHODID_GET_DATA_STORE)))
        .addMethod(
            getListDataStoresMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.ListDataStoresRequest,
                    com.google.cloud.discoveryengine.v1alpha.ListDataStoresResponse>(
                    service, METHODID_LIST_DATA_STORES)))
        .addMethod(
            getDeleteDataStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.DeleteDataStoreRequest,
                    com.google.longrunning.Operation>(service, METHODID_DELETE_DATA_STORE)))
        .addMethod(
            getUpdateDataStoreMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.UpdateDataStoreRequest,
                    com.google.cloud.discoveryengine.v1alpha.DataStore>(
                    service, METHODID_UPDATE_DATA_STORE)))
        .addMethod(
            getGetDocumentProcessingConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.GetDocumentProcessingConfigRequest,
                    com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>(
                    service, METHODID_GET_DOCUMENT_PROCESSING_CONFIG)))
        .addMethod(
            getUpdateDocumentProcessingConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.google.cloud.discoveryengine.v1alpha.UpdateDocumentProcessingConfigRequest,
                    com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfig>(
                    service, METHODID_UPDATE_DOCUMENT_PROCESSING_CONFIG)))
        .build();
  }

  private abstract static class DataStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.discoveryengine.v1alpha.DataStoreServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataStoreService");
    }
  }

  private static final class DataStoreServiceFileDescriptorSupplier
      extends DataStoreServiceBaseDescriptorSupplier {
    DataStoreServiceFileDescriptorSupplier() {}
  }

  private static final class DataStoreServiceMethodDescriptorSupplier
      extends DataStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataStoreServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new DataStoreServiceFileDescriptorSupplier())
                      .addMethod(getCreateDataStoreMethod())
                      .addMethod(getGetDataStoreMethod())
                      .addMethod(getListDataStoresMethod())
                      .addMethod(getDeleteDataStoreMethod())
                      .addMethod(getUpdateDataStoreMethod())
                      .addMethod(getGetDocumentProcessingConfigMethod())
                      .addMethod(getUpdateDocumentProcessingConfigMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
