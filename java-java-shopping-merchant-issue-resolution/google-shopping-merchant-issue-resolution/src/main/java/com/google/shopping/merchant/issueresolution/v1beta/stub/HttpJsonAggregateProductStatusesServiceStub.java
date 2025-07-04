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

package com.google.shopping.merchant.issueresolution.v1beta.stub;

import static com.google.shopping.merchant.issueresolution.v1beta.AggregateProductStatusesServiceClient.ListAggregateProductStatusesPagedResponse;

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
import com.google.shopping.merchant.issueresolution.v1beta.ListAggregateProductStatusesRequest;
import com.google.shopping.merchant.issueresolution.v1beta.ListAggregateProductStatusesResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the AggregateProductStatusesService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonAggregateProductStatusesServiceStub
    extends AggregateProductStatusesServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<
          ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
      listAggregateProductStatusesMethodDescriptor =
          ApiMethodDescriptor
              .<ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
                  newBuilder()
              .setFullMethodName(
                  "google.shopping.merchant.issueresolution.v1beta.AggregateProductStatusesService/ListAggregateProductStatuses")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListAggregateProductStatusesRequest>newBuilder()
                      .setPath(
                          "/issueresolution/v1beta/{parent=accounts/*}/aggregateProductStatuses",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListAggregateProductStatusesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListAggregateProductStatusesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "filter", request.getFilter());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListAggregateProductStatusesResponse>newBuilder()
                      .setDefaultInstance(ListAggregateProductStatusesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<
          ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
      listAggregateProductStatusesCallable;
  private final UnaryCallable<
          ListAggregateProductStatusesRequest, ListAggregateProductStatusesPagedResponse>
      listAggregateProductStatusesPagedCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAggregateProductStatusesServiceStub create(
      AggregateProductStatusesServiceStubSettings settings) throws IOException {
    return new HttpJsonAggregateProductStatusesServiceStub(
        settings, ClientContext.create(settings));
  }

  public static final HttpJsonAggregateProductStatusesServiceStub create(
      ClientContext clientContext) throws IOException {
    return new HttpJsonAggregateProductStatusesServiceStub(
        AggregateProductStatusesServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonAggregateProductStatusesServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAggregateProductStatusesServiceStub(
        AggregateProductStatusesServiceStubSettings.newHttpJsonBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAggregateProductStatusesServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonAggregateProductStatusesServiceStub(
      AggregateProductStatusesServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonAggregateProductStatusesServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAggregateProductStatusesServiceStub, using the given
   * settings. This is protected so that it is easy to make a subclass, but otherwise, the static
   * factory methods should be preferred.
   */
  protected HttpJsonAggregateProductStatusesServiceStub(
      AggregateProductStatusesServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
        listAggregateProductStatusesTransportSettings =
            HttpJsonCallSettings
                .<ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
                    newBuilder()
                .setMethodDescriptor(listAggregateProductStatusesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();

    this.listAggregateProductStatusesCallable =
        callableFactory.createUnaryCallable(
            listAggregateProductStatusesTransportSettings,
            settings.listAggregateProductStatusesSettings(),
            clientContext);
    this.listAggregateProductStatusesPagedCallable =
        callableFactory.createPagedCallable(
            listAggregateProductStatusesTransportSettings,
            settings.listAggregateProductStatusesSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listAggregateProductStatusesMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<ListAggregateProductStatusesRequest, ListAggregateProductStatusesResponse>
      listAggregateProductStatusesCallable() {
    return listAggregateProductStatusesCallable;
  }

  @Override
  public UnaryCallable<
          ListAggregateProductStatusesRequest, ListAggregateProductStatusesPagedResponse>
      listAggregateProductStatusesPagedCallable() {
    return listAggregateProductStatusesPagedCallable;
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
