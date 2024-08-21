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

package com.google.cloud.dialogflow.v2beta1.stub;

import static com.google.cloud.dialogflow.v2beta1.GeneratorsClient.ListGeneratorsPagedResponse;
import static com.google.cloud.dialogflow.v2beta1.GeneratorsClient.ListLocationsPagedResponse;

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
import com.google.cloud.dialogflow.v2beta1.CreateGeneratorRequest;
import com.google.cloud.dialogflow.v2beta1.DeleteGeneratorRequest;
import com.google.cloud.dialogflow.v2beta1.Generator;
import com.google.cloud.dialogflow.v2beta1.GetGeneratorRequest;
import com.google.cloud.dialogflow.v2beta1.ListGeneratorsRequest;
import com.google.cloud.dialogflow.v2beta1.ListGeneratorsResponse;
import com.google.cloud.dialogflow.v2beta1.UpdateGeneratorRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.protobuf.Empty;
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
 * REST stub implementation for the Generators service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonGeneratorsStub extends GeneratorsStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<CreateGeneratorRequest, Generator>
      createGeneratorMethodDescriptor =
          ApiMethodDescriptor.<CreateGeneratorRequest, Generator>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Generators/CreateGenerator")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateGeneratorRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*/locations/*}/generators",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths("/v2beta1/{parent=projects/*}/generators")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "generatorId", request.getGeneratorId());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("generator", request.getGenerator(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Generator>newBuilder()
                      .setDefaultInstance(Generator.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetGeneratorRequest, Generator>
      getGeneratorMethodDescriptor =
          ApiMethodDescriptor.<GetGeneratorRequest, Generator>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Generators/GetGenerator")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetGeneratorRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*/locations/*/generators/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Generator>newBuilder()
                      .setDefaultInstance(Generator.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListGeneratorsRequest, ListGeneratorsResponse>
      listGeneratorsMethodDescriptor =
          ApiMethodDescriptor.<ListGeneratorsRequest, ListGeneratorsResponse>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Generators/ListGenerators")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListGeneratorsRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{parent=projects/*/locations/*}/generators",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListGeneratorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths("/v2beta1/{parent=projects/*}/generators")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListGeneratorsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListGeneratorsResponse>newBuilder()
                      .setDefaultInstance(ListGeneratorsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteGeneratorRequest, Empty>
      deleteGeneratorMethodDescriptor =
          ApiMethodDescriptor.<DeleteGeneratorRequest, Empty>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Generators/DeleteGenerator")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteGeneratorRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*/locations/*/generators/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateGeneratorRequest, Generator>
      updateGeneratorMethodDescriptor =
          ApiMethodDescriptor.<UpdateGeneratorRequest, Generator>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.v2beta1.Generators/UpdateGenerator")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateGeneratorRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{generator.name=projects/*/locations/*/generators/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "generator.name", request.getGenerator().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateGeneratorRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("generator", request.getGenerator(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Generator>newBuilder()
                      .setDefaultInstance(Generator.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          ApiMethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListLocationsRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*}/locations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListLocationsResponse>newBuilder()
                      .setDefaultInstance(ListLocationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetLocationRequest, Location>
      getLocationMethodDescriptor =
          ApiMethodDescriptor.<GetLocationRequest, Location>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/GetLocation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetLocationRequest>newBuilder()
                      .setPath(
                          "/v2beta1/{name=projects/*/locations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Location>newBuilder()
                      .setDefaultInstance(Location.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<CreateGeneratorRequest, Generator> createGeneratorCallable;
  private final UnaryCallable<GetGeneratorRequest, Generator> getGeneratorCallable;
  private final UnaryCallable<ListGeneratorsRequest, ListGeneratorsResponse> listGeneratorsCallable;
  private final UnaryCallable<ListGeneratorsRequest, ListGeneratorsPagedResponse>
      listGeneratorsPagedCallable;
  private final UnaryCallable<DeleteGeneratorRequest, Empty> deleteGeneratorCallable;
  private final UnaryCallable<UpdateGeneratorRequest, Generator> updateGeneratorCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonGeneratorsStub create(GeneratorsStubSettings settings)
      throws IOException {
    return new HttpJsonGeneratorsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonGeneratorsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonGeneratorsStub(
        GeneratorsStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonGeneratorsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonGeneratorsStub(
        GeneratorsStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonGeneratorsStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonGeneratorsStub(GeneratorsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonGeneratorsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonGeneratorsStub, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonGeneratorsStub(
      GeneratorsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<CreateGeneratorRequest, Generator> createGeneratorTransportSettings =
        HttpJsonCallSettings.<CreateGeneratorRequest, Generator>newBuilder()
            .setMethodDescriptor(createGeneratorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetGeneratorRequest, Generator> getGeneratorTransportSettings =
        HttpJsonCallSettings.<GetGeneratorRequest, Generator>newBuilder()
            .setMethodDescriptor(getGeneratorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListGeneratorsRequest, ListGeneratorsResponse>
        listGeneratorsTransportSettings =
            HttpJsonCallSettings.<ListGeneratorsRequest, ListGeneratorsResponse>newBuilder()
                .setMethodDescriptor(listGeneratorsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<DeleteGeneratorRequest, Empty> deleteGeneratorTransportSettings =
        HttpJsonCallSettings.<DeleteGeneratorRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteGeneratorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdateGeneratorRequest, Generator> updateGeneratorTransportSettings =
        HttpJsonCallSettings.<UpdateGeneratorRequest, Generator>newBuilder()
            .setMethodDescriptor(updateGeneratorMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("generator.name", String.valueOf(request.getGenerator().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<ListLocationsRequest, ListLocationsResponse>
        listLocationsTransportSettings =
            HttpJsonCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
                .setMethodDescriptor(listLocationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        HttpJsonCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.createGeneratorCallable =
        callableFactory.createUnaryCallable(
            createGeneratorTransportSettings, settings.createGeneratorSettings(), clientContext);
    this.getGeneratorCallable =
        callableFactory.createUnaryCallable(
            getGeneratorTransportSettings, settings.getGeneratorSettings(), clientContext);
    this.listGeneratorsCallable =
        callableFactory.createUnaryCallable(
            listGeneratorsTransportSettings, settings.listGeneratorsSettings(), clientContext);
    this.listGeneratorsPagedCallable =
        callableFactory.createPagedCallable(
            listGeneratorsTransportSettings, settings.listGeneratorsSettings(), clientContext);
    this.deleteGeneratorCallable =
        callableFactory.createUnaryCallable(
            deleteGeneratorTransportSettings, settings.deleteGeneratorSettings(), clientContext);
    this.updateGeneratorCallable =
        callableFactory.createUnaryCallable(
            updateGeneratorTransportSettings, settings.updateGeneratorSettings(), clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(createGeneratorMethodDescriptor);
    methodDescriptors.add(getGeneratorMethodDescriptor);
    methodDescriptors.add(listGeneratorsMethodDescriptor);
    methodDescriptors.add(deleteGeneratorMethodDescriptor);
    methodDescriptors.add(updateGeneratorMethodDescriptor);
    methodDescriptors.add(listLocationsMethodDescriptor);
    methodDescriptors.add(getLocationMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<CreateGeneratorRequest, Generator> createGeneratorCallable() {
    return createGeneratorCallable;
  }

  @Override
  public UnaryCallable<GetGeneratorRequest, Generator> getGeneratorCallable() {
    return getGeneratorCallable;
  }

  @Override
  public UnaryCallable<ListGeneratorsRequest, ListGeneratorsResponse> listGeneratorsCallable() {
    return listGeneratorsCallable;
  }

  @Override
  public UnaryCallable<ListGeneratorsRequest, ListGeneratorsPagedResponse>
      listGeneratorsPagedCallable() {
    return listGeneratorsPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteGeneratorRequest, Empty> deleteGeneratorCallable() {
    return deleteGeneratorCallable;
  }

  @Override
  public UnaryCallable<UpdateGeneratorRequest, Generator> updateGeneratorCallable() {
    return updateGeneratorCallable;
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
