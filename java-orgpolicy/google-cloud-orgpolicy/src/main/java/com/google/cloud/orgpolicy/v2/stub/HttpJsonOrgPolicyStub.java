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

package com.google.cloud.orgpolicy.v2.stub;

import static com.google.cloud.orgpolicy.v2.OrgPolicyClient.ListConstraintsPagedResponse;
import static com.google.cloud.orgpolicy.v2.OrgPolicyClient.ListCustomConstraintsPagedResponse;
import static com.google.cloud.orgpolicy.v2.OrgPolicyClient.ListPoliciesPagedResponse;

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
import com.google.cloud.orgpolicy.v2.CreateCustomConstraintRequest;
import com.google.cloud.orgpolicy.v2.CreatePolicyRequest;
import com.google.cloud.orgpolicy.v2.CustomConstraint;
import com.google.cloud.orgpolicy.v2.DeleteCustomConstraintRequest;
import com.google.cloud.orgpolicy.v2.DeletePolicyRequest;
import com.google.cloud.orgpolicy.v2.GetCustomConstraintRequest;
import com.google.cloud.orgpolicy.v2.GetEffectivePolicyRequest;
import com.google.cloud.orgpolicy.v2.GetPolicyRequest;
import com.google.cloud.orgpolicy.v2.ListConstraintsRequest;
import com.google.cloud.orgpolicy.v2.ListConstraintsResponse;
import com.google.cloud.orgpolicy.v2.ListCustomConstraintsRequest;
import com.google.cloud.orgpolicy.v2.ListCustomConstraintsResponse;
import com.google.cloud.orgpolicy.v2.ListPoliciesRequest;
import com.google.cloud.orgpolicy.v2.ListPoliciesResponse;
import com.google.cloud.orgpolicy.v2.Policy;
import com.google.cloud.orgpolicy.v2.UpdateCustomConstraintRequest;
import com.google.cloud.orgpolicy.v2.UpdatePolicyRequest;
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
 * REST stub implementation for the OrgPolicy service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
@BetaApi
public class HttpJsonOrgPolicyStub extends OrgPolicyStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<ListConstraintsRequest, ListConstraintsResponse>
      listConstraintsMethodDescriptor =
          ApiMethodDescriptor.<ListConstraintsRequest, ListConstraintsResponse>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/ListConstraints")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListConstraintsRequest>newBuilder()
                      .setPath(
                          "/v2/{parent=projects/*}/constraints",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListConstraintsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{parent=folders/*}/constraints",
                          "/v2/{parent=organizations/*}/constraints")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListConstraintsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListConstraintsResponse>newBuilder()
                      .setDefaultInstance(ListConstraintsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListPoliciesRequest, ListPoliciesResponse>
      listPoliciesMethodDescriptor =
          ApiMethodDescriptor.<ListPoliciesRequest, ListPoliciesResponse>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/ListPolicies")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListPoliciesRequest>newBuilder()
                      .setPath(
                          "/v2/{parent=projects/*}/policies",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListPoliciesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{parent=folders/*}/policies",
                          "/v2/{parent=organizations/*}/policies")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListPoliciesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListPoliciesResponse>newBuilder()
                      .setDefaultInstance(ListPoliciesResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetPolicyRequest, Policy> getPolicyMethodDescriptor =
      ApiMethodDescriptor.<GetPolicyRequest, Policy>newBuilder()
          .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/GetPolicy")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetPolicyRequest>newBuilder()
                  .setPath(
                      "/v2/{name=projects/*/policies/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetPolicyRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setAdditionalPaths(
                      "/v2/{name=folders/*/policies/*}", "/v2/{name=organizations/*/policies/*}")
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetPolicyRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Policy>newBuilder()
                  .setDefaultInstance(Policy.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<GetEffectivePolicyRequest, Policy>
      getEffectivePolicyMethodDescriptor =
          ApiMethodDescriptor.<GetEffectivePolicyRequest, Policy>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/GetEffectivePolicy")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetEffectivePolicyRequest>newBuilder()
                      .setPath(
                          "/v2/{name=projects/*/policies/*}:getEffectivePolicy",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetEffectivePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{name=folders/*/policies/*}:getEffectivePolicy",
                          "/v2/{name=organizations/*/policies/*}:getEffectivePolicy")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetEffectivePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Policy>newBuilder()
                      .setDefaultInstance(Policy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<CreatePolicyRequest, Policy>
      createPolicyMethodDescriptor =
          ApiMethodDescriptor.<CreatePolicyRequest, Policy>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/CreatePolicy")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreatePolicyRequest>newBuilder()
                      .setPath(
                          "/v2/{parent=projects/*}/policies",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreatePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{parent=folders/*}/policies",
                          "/v2/{parent=organizations/*}/policies")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreatePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("policy", request.getPolicy(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Policy>newBuilder()
                      .setDefaultInstance(Policy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdatePolicyRequest, Policy>
      updatePolicyMethodDescriptor =
          ApiMethodDescriptor.<UpdatePolicyRequest, Policy>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/UpdatePolicy")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdatePolicyRequest>newBuilder()
                      .setPath(
                          "/v2/{policy.name=projects/*/policies/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdatePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "policy.name", request.getPolicy().getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{policy.name=folders/*/policies/*}",
                          "/v2/{policy.name=organizations/*/policies/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdatePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("policy", request.getPolicy(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Policy>newBuilder()
                      .setDefaultInstance(Policy.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeletePolicyRequest, Empty>
      deletePolicyMethodDescriptor =
          ApiMethodDescriptor.<DeletePolicyRequest, Empty>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/DeletePolicy")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeletePolicyRequest>newBuilder()
                      .setPath(
                          "/v2/{name=projects/*/policies/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeletePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setAdditionalPaths(
                          "/v2/{name=folders/*/policies/*}",
                          "/v2/{name=organizations/*/policies/*}")
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeletePolicyRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "etag", request.getEtag());
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

  private static final ApiMethodDescriptor<CreateCustomConstraintRequest, CustomConstraint>
      createCustomConstraintMethodDescriptor =
          ApiMethodDescriptor.<CreateCustomConstraintRequest, CustomConstraint>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/CreateCustomConstraint")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateCustomConstraintRequest>newBuilder()
                      .setPath(
                          "/v2/{parent=organizations/*}/customConstraints",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("customConstraint", request.getCustomConstraint(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CustomConstraint>newBuilder()
                      .setDefaultInstance(CustomConstraint.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateCustomConstraintRequest, CustomConstraint>
      updateCustomConstraintMethodDescriptor =
          ApiMethodDescriptor.<UpdateCustomConstraintRequest, CustomConstraint>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/UpdateCustomConstraint")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateCustomConstraintRequest>newBuilder()
                      .setPath(
                          "/v2/{customConstraint.name=organizations/*/customConstraints/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "customConstraint.name",
                                request.getCustomConstraint().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("customConstraint", request.getCustomConstraint(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CustomConstraint>newBuilder()
                      .setDefaultInstance(CustomConstraint.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetCustomConstraintRequest, CustomConstraint>
      getCustomConstraintMethodDescriptor =
          ApiMethodDescriptor.<GetCustomConstraintRequest, CustomConstraint>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/GetCustomConstraint")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetCustomConstraintRequest>newBuilder()
                      .setPath(
                          "/v2/{name=organizations/*/customConstraints/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<CustomConstraint>newBuilder()
                      .setDefaultInstance(CustomConstraint.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListCustomConstraintsRequest, ListCustomConstraintsResponse>
      listCustomConstraintsMethodDescriptor =
          ApiMethodDescriptor
              .<ListCustomConstraintsRequest, ListCustomConstraintsResponse>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/ListCustomConstraints")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListCustomConstraintsRequest>newBuilder()
                      .setPath(
                          "/v2/{parent=organizations/*}/customConstraints",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListCustomConstraintsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListCustomConstraintsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListCustomConstraintsResponse>newBuilder()
                      .setDefaultInstance(ListCustomConstraintsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteCustomConstraintRequest, Empty>
      deleteCustomConstraintMethodDescriptor =
          ApiMethodDescriptor.<DeleteCustomConstraintRequest, Empty>newBuilder()
              .setFullMethodName("google.cloud.orgpolicy.v2.OrgPolicy/DeleteCustomConstraint")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteCustomConstraintRequest>newBuilder()
                      .setPath(
                          "/v2/{name=organizations/*/customConstraints/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCustomConstraintRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteCustomConstraintRequest> serializer =
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

  private final UnaryCallable<ListConstraintsRequest, ListConstraintsResponse>
      listConstraintsCallable;
  private final UnaryCallable<ListConstraintsRequest, ListConstraintsPagedResponse>
      listConstraintsPagedCallable;
  private final UnaryCallable<ListPoliciesRequest, ListPoliciesResponse> listPoliciesCallable;
  private final UnaryCallable<ListPoliciesRequest, ListPoliciesPagedResponse>
      listPoliciesPagedCallable;
  private final UnaryCallable<GetPolicyRequest, Policy> getPolicyCallable;
  private final UnaryCallable<GetEffectivePolicyRequest, Policy> getEffectivePolicyCallable;
  private final UnaryCallable<CreatePolicyRequest, Policy> createPolicyCallable;
  private final UnaryCallable<UpdatePolicyRequest, Policy> updatePolicyCallable;
  private final UnaryCallable<DeletePolicyRequest, Empty> deletePolicyCallable;
  private final UnaryCallable<CreateCustomConstraintRequest, CustomConstraint>
      createCustomConstraintCallable;
  private final UnaryCallable<UpdateCustomConstraintRequest, CustomConstraint>
      updateCustomConstraintCallable;
  private final UnaryCallable<GetCustomConstraintRequest, CustomConstraint>
      getCustomConstraintCallable;
  private final UnaryCallable<ListCustomConstraintsRequest, ListCustomConstraintsResponse>
      listCustomConstraintsCallable;
  private final UnaryCallable<ListCustomConstraintsRequest, ListCustomConstraintsPagedResponse>
      listCustomConstraintsPagedCallable;
  private final UnaryCallable<DeleteCustomConstraintRequest, Empty> deleteCustomConstraintCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonOrgPolicyStub create(OrgPolicyStubSettings settings)
      throws IOException {
    return new HttpJsonOrgPolicyStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonOrgPolicyStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonOrgPolicyStub(
        OrgPolicyStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonOrgPolicyStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonOrgPolicyStub(
        OrgPolicyStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonOrgPolicyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonOrgPolicyStub(OrgPolicyStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonOrgPolicyCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonOrgPolicyStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonOrgPolicyStub(
      OrgPolicyStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ListConstraintsRequest, ListConstraintsResponse>
        listConstraintsTransportSettings =
            HttpJsonCallSettings.<ListConstraintsRequest, ListConstraintsResponse>newBuilder()
                .setMethodDescriptor(listConstraintsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListPoliciesRequest, ListPoliciesResponse> listPoliciesTransportSettings =
        HttpJsonCallSettings.<ListPoliciesRequest, ListPoliciesResponse>newBuilder()
            .setMethodDescriptor(listPoliciesMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetPolicyRequest, Policy> getPolicyTransportSettings =
        HttpJsonCallSettings.<GetPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getPolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<GetEffectivePolicyRequest, Policy> getEffectivePolicyTransportSettings =
        HttpJsonCallSettings.<GetEffectivePolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getEffectivePolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreatePolicyRequest, Policy> createPolicyTransportSettings =
        HttpJsonCallSettings.<CreatePolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(createPolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<UpdatePolicyRequest, Policy> updatePolicyTransportSettings =
        HttpJsonCallSettings.<UpdatePolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(updatePolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("policy.name", String.valueOf(request.getPolicy().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<DeletePolicyRequest, Empty> deletePolicyTransportSettings =
        HttpJsonCallSettings.<DeletePolicyRequest, Empty>newBuilder()
            .setMethodDescriptor(deletePolicyMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateCustomConstraintRequest, CustomConstraint>
        createCustomConstraintTransportSettings =
            HttpJsonCallSettings.<CreateCustomConstraintRequest, CustomConstraint>newBuilder()
                .setMethodDescriptor(createCustomConstraintMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<UpdateCustomConstraintRequest, CustomConstraint>
        updateCustomConstraintTransportSettings =
            HttpJsonCallSettings.<UpdateCustomConstraintRequest, CustomConstraint>newBuilder()
                .setMethodDescriptor(updateCustomConstraintMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "custom_constraint.name",
                          String.valueOf(request.getCustomConstraint().getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetCustomConstraintRequest, CustomConstraint>
        getCustomConstraintTransportSettings =
            HttpJsonCallSettings.<GetCustomConstraintRequest, CustomConstraint>newBuilder()
                .setMethodDescriptor(getCustomConstraintMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListCustomConstraintsRequest, ListCustomConstraintsResponse>
        listCustomConstraintsTransportSettings =
            HttpJsonCallSettings
                .<ListCustomConstraintsRequest, ListCustomConstraintsResponse>newBuilder()
                .setMethodDescriptor(listCustomConstraintsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<DeleteCustomConstraintRequest, Empty>
        deleteCustomConstraintTransportSettings =
            HttpJsonCallSettings.<DeleteCustomConstraintRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteCustomConstraintMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();

    this.listConstraintsCallable =
        callableFactory.createUnaryCallable(
            listConstraintsTransportSettings, settings.listConstraintsSettings(), clientContext);
    this.listConstraintsPagedCallable =
        callableFactory.createPagedCallable(
            listConstraintsTransportSettings, settings.listConstraintsSettings(), clientContext);
    this.listPoliciesCallable =
        callableFactory.createUnaryCallable(
            listPoliciesTransportSettings, settings.listPoliciesSettings(), clientContext);
    this.listPoliciesPagedCallable =
        callableFactory.createPagedCallable(
            listPoliciesTransportSettings, settings.listPoliciesSettings(), clientContext);
    this.getPolicyCallable =
        callableFactory.createUnaryCallable(
            getPolicyTransportSettings, settings.getPolicySettings(), clientContext);
    this.getEffectivePolicyCallable =
        callableFactory.createUnaryCallable(
            getEffectivePolicyTransportSettings,
            settings.getEffectivePolicySettings(),
            clientContext);
    this.createPolicyCallable =
        callableFactory.createUnaryCallable(
            createPolicyTransportSettings, settings.createPolicySettings(), clientContext);
    this.updatePolicyCallable =
        callableFactory.createUnaryCallable(
            updatePolicyTransportSettings, settings.updatePolicySettings(), clientContext);
    this.deletePolicyCallable =
        callableFactory.createUnaryCallable(
            deletePolicyTransportSettings, settings.deletePolicySettings(), clientContext);
    this.createCustomConstraintCallable =
        callableFactory.createUnaryCallable(
            createCustomConstraintTransportSettings,
            settings.createCustomConstraintSettings(),
            clientContext);
    this.updateCustomConstraintCallable =
        callableFactory.createUnaryCallable(
            updateCustomConstraintTransportSettings,
            settings.updateCustomConstraintSettings(),
            clientContext);
    this.getCustomConstraintCallable =
        callableFactory.createUnaryCallable(
            getCustomConstraintTransportSettings,
            settings.getCustomConstraintSettings(),
            clientContext);
    this.listCustomConstraintsCallable =
        callableFactory.createUnaryCallable(
            listCustomConstraintsTransportSettings,
            settings.listCustomConstraintsSettings(),
            clientContext);
    this.listCustomConstraintsPagedCallable =
        callableFactory.createPagedCallable(
            listCustomConstraintsTransportSettings,
            settings.listCustomConstraintsSettings(),
            clientContext);
    this.deleteCustomConstraintCallable =
        callableFactory.createUnaryCallable(
            deleteCustomConstraintTransportSettings,
            settings.deleteCustomConstraintSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listConstraintsMethodDescriptor);
    methodDescriptors.add(listPoliciesMethodDescriptor);
    methodDescriptors.add(getPolicyMethodDescriptor);
    methodDescriptors.add(getEffectivePolicyMethodDescriptor);
    methodDescriptors.add(createPolicyMethodDescriptor);
    methodDescriptors.add(updatePolicyMethodDescriptor);
    methodDescriptors.add(deletePolicyMethodDescriptor);
    methodDescriptors.add(createCustomConstraintMethodDescriptor);
    methodDescriptors.add(updateCustomConstraintMethodDescriptor);
    methodDescriptors.add(getCustomConstraintMethodDescriptor);
    methodDescriptors.add(listCustomConstraintsMethodDescriptor);
    methodDescriptors.add(deleteCustomConstraintMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<ListConstraintsRequest, ListConstraintsResponse> listConstraintsCallable() {
    return listConstraintsCallable;
  }

  @Override
  public UnaryCallable<ListConstraintsRequest, ListConstraintsPagedResponse>
      listConstraintsPagedCallable() {
    return listConstraintsPagedCallable;
  }

  @Override
  public UnaryCallable<ListPoliciesRequest, ListPoliciesResponse> listPoliciesCallable() {
    return listPoliciesCallable;
  }

  @Override
  public UnaryCallable<ListPoliciesRequest, ListPoliciesPagedResponse> listPoliciesPagedCallable() {
    return listPoliciesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPolicyRequest, Policy> getPolicyCallable() {
    return getPolicyCallable;
  }

  @Override
  public UnaryCallable<GetEffectivePolicyRequest, Policy> getEffectivePolicyCallable() {
    return getEffectivePolicyCallable;
  }

  @Override
  public UnaryCallable<CreatePolicyRequest, Policy> createPolicyCallable() {
    return createPolicyCallable;
  }

  @Override
  public UnaryCallable<UpdatePolicyRequest, Policy> updatePolicyCallable() {
    return updatePolicyCallable;
  }

  @Override
  public UnaryCallable<DeletePolicyRequest, Empty> deletePolicyCallable() {
    return deletePolicyCallable;
  }

  @Override
  public UnaryCallable<CreateCustomConstraintRequest, CustomConstraint>
      createCustomConstraintCallable() {
    return createCustomConstraintCallable;
  }

  @Override
  public UnaryCallable<UpdateCustomConstraintRequest, CustomConstraint>
      updateCustomConstraintCallable() {
    return updateCustomConstraintCallable;
  }

  @Override
  public UnaryCallable<GetCustomConstraintRequest, CustomConstraint> getCustomConstraintCallable() {
    return getCustomConstraintCallable;
  }

  @Override
  public UnaryCallable<ListCustomConstraintsRequest, ListCustomConstraintsResponse>
      listCustomConstraintsCallable() {
    return listCustomConstraintsCallable;
  }

  @Override
  public UnaryCallable<ListCustomConstraintsRequest, ListCustomConstraintsPagedResponse>
      listCustomConstraintsPagedCallable() {
    return listCustomConstraintsPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteCustomConstraintRequest, Empty> deleteCustomConstraintCallable() {
    return deleteCustomConstraintCallable;
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
