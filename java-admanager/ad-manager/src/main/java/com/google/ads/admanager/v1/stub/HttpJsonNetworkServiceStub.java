/*
 * Copyright 2024 Google LLC
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

package com.google.ads.admanager.v1.stub;

import com.google.ads.admanager.v1.GetNetworkRequest;
import com.google.ads.admanager.v1.ListNetworksRequest;
import com.google.ads.admanager.v1.ListNetworksResponse;
import com.google.ads.admanager.v1.Network;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the NetworkService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonNetworkServiceStub extends NetworkServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<GetNetworkRequest, Network> getNetworkMethodDescriptor =
      ApiMethodDescriptor.<GetNetworkRequest, Network>newBuilder()
          .setFullMethodName("google.ads.admanager.v1.NetworkService/GetNetwork")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetNetworkRequest>newBuilder()
                  .setPath(
                      "/v1/{name=networks/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetNetworkRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetNetworkRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Network>newBuilder()
                  .setDefaultInstance(Network.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<ListNetworksRequest, ListNetworksResponse>
      listNetworksMethodDescriptor =
          ApiMethodDescriptor.<ListNetworksRequest, ListNetworksResponse>newBuilder()
              .setFullMethodName("google.ads.admanager.v1.NetworkService/ListNetworks")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListNetworksRequest>newBuilder()
                      .setPath(
                          "/v1/networks",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListNetworksRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListNetworksRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListNetworksResponse>newBuilder()
                      .setDefaultInstance(ListNetworksResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<GetNetworkRequest, Network> getNetworkCallable;
  private final UnaryCallable<ListNetworksRequest, ListNetworksResponse> listNetworksCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonNetworkServiceStub create(NetworkServiceStubSettings settings)
      throws IOException {
    return new HttpJsonNetworkServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonNetworkServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonNetworkServiceStub(
        NetworkServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonNetworkServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonNetworkServiceStub(
        NetworkServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonNetworkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonNetworkServiceStub(
      NetworkServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonNetworkServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonNetworkServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonNetworkServiceStub(
      NetworkServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetNetworkRequest, Network> getNetworkTransportSettings =
        HttpJsonCallSettings.<GetNetworkRequest, Network>newBuilder()
            .setMethodDescriptor(getNetworkMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListNetworksRequest, ListNetworksResponse> listNetworksTransportSettings =
        HttpJsonCallSettings.<ListNetworksRequest, ListNetworksResponse>newBuilder()
            .setMethodDescriptor(listNetworksMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.getNetworkCallable =
        callableFactory.createUnaryCallable(
            getNetworkTransportSettings, settings.getNetworkSettings(), clientContext);
    this.listNetworksCallable =
        callableFactory.createUnaryCallable(
            listNetworksTransportSettings, settings.listNetworksSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(getNetworkMethodDescriptor);
    methodDescriptors.add(listNetworksMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<GetNetworkRequest, Network> getNetworkCallable() {
    return getNetworkCallable;
  }

  @Override
  public UnaryCallable<ListNetworksRequest, ListNetworksResponse> listNetworksCallable() {
    return listNetworksCallable;
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
