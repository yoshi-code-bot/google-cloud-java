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

package com.google.shopping.merchant.ordertracking.v1beta.stub;

import com.google.api.core.BetaApi;
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
import com.google.shopping.merchant.ordertracking.v1beta.CreateOrderTrackingSignalRequest;
import com.google.shopping.merchant.ordertracking.v1beta.OrderTrackingSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the OrderTrackingSignalsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonOrderTrackingSignalsServiceStub extends OrderTrackingSignalsServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<CreateOrderTrackingSignalRequest, OrderTrackingSignal>
      createOrderTrackingSignalMethodDescriptor =
          ApiMethodDescriptor.<CreateOrderTrackingSignalRequest, OrderTrackingSignal>newBuilder()
              .setFullMethodName(
                  "google.shopping.merchant.ordertracking.v1beta.OrderTrackingSignalsService/CreateOrderTrackingSignal")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateOrderTrackingSignalRequest>newBuilder()
                      .setPath(
                          "/ordertracking/v1beta/{parent=accounts/*}/ordertrackingsignals",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateOrderTrackingSignalRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateOrderTrackingSignalRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields,
                                "orderTrackingSignalId",
                                request.getOrderTrackingSignalId());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "orderTrackingSignal",
                                      request.getOrderTrackingSignal(),
                                      true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<OrderTrackingSignal>newBuilder()
                      .setDefaultInstance(OrderTrackingSignal.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<CreateOrderTrackingSignalRequest, OrderTrackingSignal>
      createOrderTrackingSignalCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonOrderTrackingSignalsServiceStub create(
      OrderTrackingSignalsServiceStubSettings settings) throws IOException {
    return new HttpJsonOrderTrackingSignalsServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonOrderTrackingSignalsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonOrderTrackingSignalsServiceStub(
        OrderTrackingSignalsServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonOrderTrackingSignalsServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonOrderTrackingSignalsServiceStub(
        OrderTrackingSignalsServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonOrderTrackingSignalsServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonOrderTrackingSignalsServiceStub(
      OrderTrackingSignalsServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonOrderTrackingSignalsServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonOrderTrackingSignalsServiceStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonOrderTrackingSignalsServiceStub(
      OrderTrackingSignalsServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreateOrderTrackingSignalRequest, OrderTrackingSignal>
        createOrderTrackingSignalTransportSettings =
            HttpJsonCallSettings.<CreateOrderTrackingSignalRequest, OrderTrackingSignal>newBuilder()
                .setMethodDescriptor(createOrderTrackingSignalMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.createOrderTrackingSignalCallable =
        callableFactory.createUnaryCallable(
            createOrderTrackingSignalTransportSettings,
            settings.createOrderTrackingSignalSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(createOrderTrackingSignalMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<CreateOrderTrackingSignalRequest, OrderTrackingSignal>
      createOrderTrackingSignalCallable() {
    return createOrderTrackingSignalCallable;
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
