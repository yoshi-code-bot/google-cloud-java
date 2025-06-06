/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.aiplatform.v1.stub;

import static com.google.cloud.aiplatform.v1.GenAiCacheServiceClient.ListCachedContentsPagedResponse;
import static com.google.cloud.aiplatform.v1.GenAiCacheServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1.CachedContent;
import com.google.cloud.aiplatform.v1.CreateCachedContentRequest;
import com.google.cloud.aiplatform.v1.DeleteCachedContentRequest;
import com.google.cloud.aiplatform.v1.GetCachedContentRequest;
import com.google.cloud.aiplatform.v1.ListCachedContentsRequest;
import com.google.cloud.aiplatform.v1.ListCachedContentsResponse;
import com.google.cloud.aiplatform.v1.UpdateCachedContentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the GenAiCacheService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcGenAiCacheServiceStub extends GenAiCacheServiceStub {
  private static final MethodDescriptor<CreateCachedContentRequest, CachedContent>
      createCachedContentMethodDescriptor =
          MethodDescriptor.<CreateCachedContentRequest, CachedContent>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1.GenAiCacheService/CreateCachedContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCachedContentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CachedContent.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetCachedContentRequest, CachedContent>
      getCachedContentMethodDescriptor =
          MethodDescriptor.<GetCachedContentRequest, CachedContent>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1.GenAiCacheService/GetCachedContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCachedContentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CachedContent.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateCachedContentRequest, CachedContent>
      updateCachedContentMethodDescriptor =
          MethodDescriptor.<UpdateCachedContentRequest, CachedContent>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1.GenAiCacheService/UpdateCachedContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateCachedContentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CachedContent.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteCachedContentRequest, Empty>
      deleteCachedContentMethodDescriptor =
          MethodDescriptor.<DeleteCachedContentRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1.GenAiCacheService/DeleteCachedContent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteCachedContentRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListCachedContentsRequest, ListCachedContentsResponse>
      listCachedContentsMethodDescriptor =
          MethodDescriptor.<ListCachedContentsRequest, ListCachedContentsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.aiplatform.v1.GenAiCacheService/ListCachedContents")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListCachedContentsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListCachedContentsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<SetIamPolicyRequest, Policy> setIamPolicyMethodDescriptor =
      MethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/SetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<GetIamPolicyRequest, Policy> getIamPolicyMethodDescriptor =
      MethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.iam.v1.IAMPolicy/GetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          MethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.iam.v1.IAMPolicy/TestIamPermissions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateCachedContentRequest, CachedContent>
      createCachedContentCallable;
  private final UnaryCallable<GetCachedContentRequest, CachedContent> getCachedContentCallable;
  private final UnaryCallable<UpdateCachedContentRequest, CachedContent>
      updateCachedContentCallable;
  private final UnaryCallable<DeleteCachedContentRequest, Empty> deleteCachedContentCallable;
  private final UnaryCallable<ListCachedContentsRequest, ListCachedContentsResponse>
      listCachedContentsCallable;
  private final UnaryCallable<ListCachedContentsRequest, ListCachedContentsPagedResponse>
      listCachedContentsPagedCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcGenAiCacheServiceStub create(GenAiCacheServiceStubSettings settings)
      throws IOException {
    return new GrpcGenAiCacheServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcGenAiCacheServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcGenAiCacheServiceStub(
        GenAiCacheServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcGenAiCacheServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcGenAiCacheServiceStub(
        GenAiCacheServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcGenAiCacheServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGenAiCacheServiceStub(
      GenAiCacheServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcGenAiCacheServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcGenAiCacheServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcGenAiCacheServiceStub(
      GenAiCacheServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateCachedContentRequest, CachedContent>
        createCachedContentTransportSettings =
            GrpcCallSettings.<CreateCachedContentRequest, CachedContent>newBuilder()
                .setMethodDescriptor(createCachedContentMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetCachedContentRequest, CachedContent> getCachedContentTransportSettings =
        GrpcCallSettings.<GetCachedContentRequest, CachedContent>newBuilder()
            .setMethodDescriptor(getCachedContentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UpdateCachedContentRequest, CachedContent>
        updateCachedContentTransportSettings =
            GrpcCallSettings.<UpdateCachedContentRequest, CachedContent>newBuilder()
                .setMethodDescriptor(updateCachedContentMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "cached_content.name",
                          String.valueOf(request.getCachedContent().getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeleteCachedContentRequest, Empty> deleteCachedContentTransportSettings =
        GrpcCallSettings.<DeleteCachedContentRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteCachedContentMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListCachedContentsRequest, ListCachedContentsResponse>
        listCachedContentsTransportSettings =
            GrpcCallSettings.<ListCachedContentsRequest, ListCachedContentsResponse>newBuilder()
                .setMethodDescriptor(listCachedContentsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        GrpcCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        GrpcCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            GrpcCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource", String.valueOf(request.getResource()));
                      return builder.build();
                    })
                .build();

    this.createCachedContentCallable =
        callableFactory.createUnaryCallable(
            createCachedContentTransportSettings,
            settings.createCachedContentSettings(),
            clientContext);
    this.getCachedContentCallable =
        callableFactory.createUnaryCallable(
            getCachedContentTransportSettings, settings.getCachedContentSettings(), clientContext);
    this.updateCachedContentCallable =
        callableFactory.createUnaryCallable(
            updateCachedContentTransportSettings,
            settings.updateCachedContentSettings(),
            clientContext);
    this.deleteCachedContentCallable =
        callableFactory.createUnaryCallable(
            deleteCachedContentTransportSettings,
            settings.deleteCachedContentSettings(),
            clientContext);
    this.listCachedContentsCallable =
        callableFactory.createUnaryCallable(
            listCachedContentsTransportSettings,
            settings.listCachedContentsSettings(),
            clientContext);
    this.listCachedContentsPagedCallable =
        callableFactory.createPagedCallable(
            listCachedContentsTransportSettings,
            settings.listCachedContentsSettings(),
            clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateCachedContentRequest, CachedContent> createCachedContentCallable() {
    return createCachedContentCallable;
  }

  @Override
  public UnaryCallable<GetCachedContentRequest, CachedContent> getCachedContentCallable() {
    return getCachedContentCallable;
  }

  @Override
  public UnaryCallable<UpdateCachedContentRequest, CachedContent> updateCachedContentCallable() {
    return updateCachedContentCallable;
  }

  @Override
  public UnaryCallable<DeleteCachedContentRequest, Empty> deleteCachedContentCallable() {
    return deleteCachedContentCallable;
  }

  @Override
  public UnaryCallable<ListCachedContentsRequest, ListCachedContentsResponse>
      listCachedContentsCallable() {
    return listCachedContentsCallable;
  }

  @Override
  public UnaryCallable<ListCachedContentsRequest, ListCachedContentsPagedResponse>
      listCachedContentsPagedCallable() {
    return listCachedContentsPagedCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
