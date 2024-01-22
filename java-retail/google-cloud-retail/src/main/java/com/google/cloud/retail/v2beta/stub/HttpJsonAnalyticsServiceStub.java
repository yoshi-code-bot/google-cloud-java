/*
 * Copyright 2023 Google LLC
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

package com.google.cloud.retail.v2beta.stub;

import com.google.api.HttpRule;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.httpjson.longrunning.stub.HttpJsonOperationsStub;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2beta.ExportAnalyticsMetricsRequest;
import com.google.cloud.retail.v2beta.ExportAnalyticsMetricsResponse;
import com.google.cloud.retail.v2beta.ExportMetadata;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.Operation;
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
 * REST stub implementation for the AnalyticsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonAnalyticsServiceStub extends AnalyticsServiceStub {
  private static final TypeRegistry typeRegistry =
      TypeRegistry.newBuilder()
          .add(ExportMetadata.getDescriptor())
          .add(ExportAnalyticsMetricsResponse.getDescriptor())
          .build();

  private static final ApiMethodDescriptor<ExportAnalyticsMetricsRequest, Operation>
      exportAnalyticsMetricsMethodDescriptor =
          ApiMethodDescriptor.<ExportAnalyticsMetricsRequest, Operation>newBuilder()
              .setFullMethodName(
                  "google.cloud.retail.v2beta.AnalyticsService/ExportAnalyticsMetrics")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ExportAnalyticsMetricsRequest>newBuilder()
                      .setPath(
                          "/v2beta/{catalog=projects/*/locations/*/catalogs/*}:exportAnalyticsMetrics",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ExportAnalyticsMetricsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "catalog", request.getCatalog());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ExportAnalyticsMetricsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearCatalog().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .setOperationSnapshotFactory(
                  (ExportAnalyticsMetricsRequest request, Operation response) ->
                      HttpJsonOperationSnapshot.create(response))
              .build();

  private final UnaryCallable<ExportAnalyticsMetricsRequest, Operation>
      exportAnalyticsMetricsCallable;
  private final OperationCallable<
          ExportAnalyticsMetricsRequest, ExportAnalyticsMetricsResponse, ExportMetadata>
      exportAnalyticsMetricsOperationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonOperationsStub httpJsonOperationsStub;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAnalyticsServiceStub create(AnalyticsServiceStubSettings settings)
      throws IOException {
    return new HttpJsonAnalyticsServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAnalyticsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonAnalyticsServiceStub(
        AnalyticsServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonAnalyticsServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAnalyticsServiceStub(
        AnalyticsServiceStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAnalyticsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAnalyticsServiceStub(
      AnalyticsServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonAnalyticsServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAnalyticsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonAnalyticsServiceStub(
      AnalyticsServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.httpJsonOperationsStub =
        HttpJsonOperationsStub.create(
            clientContext,
            callableFactory,
            typeRegistry,
            ImmutableMap.<String, HttpRule>builder()
                .put(
                    "google.longrunning.Operations.GetOperation",
                    HttpRule.newBuilder()
                        .setGet(
                            "/v2beta/{name=projects/*/locations/*/catalogs/*/branches/*/operations/*}")
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet(
                                    "/v2beta/{name=projects/*/locations/*/catalogs/*/operations/*}")
                                .build())
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/v2beta/{name=projects/*/locations/*/operations/*}")
                                .build())
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/v2beta/{name=projects/*/operations/*}")
                                .build())
                        .build())
                .put(
                    "google.longrunning.Operations.ListOperations",
                    HttpRule.newBuilder()
                        .setGet("/v2beta/{name=projects/*/locations/*/catalogs/*}/operations")
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/v2beta/{name=projects/*/locations/*}/operations")
                                .build())
                        .addAdditionalBindings(
                            HttpRule.newBuilder()
                                .setGet("/v2beta/{name=projects/*}/operations")
                                .build())
                        .build())
                .build());

    HttpJsonCallSettings<ExportAnalyticsMetricsRequest, Operation>
        exportAnalyticsMetricsTransportSettings =
            HttpJsonCallSettings.<ExportAnalyticsMetricsRequest, Operation>newBuilder()
                .setMethodDescriptor(exportAnalyticsMetricsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("catalog", String.valueOf(request.getCatalog()));
                      return builder.build();
                    })
                .build();

    this.exportAnalyticsMetricsCallable =
        callableFactory.createUnaryCallable(
            exportAnalyticsMetricsTransportSettings,
            settings.exportAnalyticsMetricsSettings(),
            clientContext);
    this.exportAnalyticsMetricsOperationCallable =
        callableFactory.createOperationCallable(
            exportAnalyticsMetricsTransportSettings,
            settings.exportAnalyticsMetricsOperationSettings(),
            clientContext,
            httpJsonOperationsStub);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(exportAnalyticsMetricsMethodDescriptor);
    return methodDescriptors;
  }

  public HttpJsonOperationsStub getHttpJsonOperationsStub() {
    return httpJsonOperationsStub;
  }

  @Override
  public UnaryCallable<ExportAnalyticsMetricsRequest, Operation> exportAnalyticsMetricsCallable() {
    return exportAnalyticsMetricsCallable;
  }

  @Override
  public OperationCallable<
          ExportAnalyticsMetricsRequest, ExportAnalyticsMetricsResponse, ExportMetadata>
      exportAnalyticsMetricsOperationCallable() {
    return exportAnalyticsMetricsOperationCallable;
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
