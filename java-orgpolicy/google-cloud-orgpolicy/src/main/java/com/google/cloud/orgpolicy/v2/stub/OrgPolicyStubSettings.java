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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.orgpolicy.v2.Constraint;
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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link OrgPolicyStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (orgpolicy.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getPolicy to 30 seconds:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * OrgPolicyStubSettings.Builder orgPolicySettingsBuilder = OrgPolicyStubSettings.newBuilder();
 * orgPolicySettingsBuilder
 *     .getPolicySettings()
 *     .setRetrySettings(
 *         orgPolicySettingsBuilder
 *             .getPolicySettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * OrgPolicyStubSettings orgPolicySettings = orgPolicySettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class OrgPolicyStubSettings extends StubSettings<OrgPolicyStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>
      listConstraintsSettings;
  private final PagedCallSettings<
          ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>
      listPoliciesSettings;
  private final UnaryCallSettings<GetPolicyRequest, Policy> getPolicySettings;
  private final UnaryCallSettings<GetEffectivePolicyRequest, Policy> getEffectivePolicySettings;
  private final UnaryCallSettings<CreatePolicyRequest, Policy> createPolicySettings;
  private final UnaryCallSettings<UpdatePolicyRequest, Policy> updatePolicySettings;
  private final UnaryCallSettings<DeletePolicyRequest, Empty> deletePolicySettings;
  private final UnaryCallSettings<CreateCustomConstraintRequest, CustomConstraint>
      createCustomConstraintSettings;
  private final UnaryCallSettings<UpdateCustomConstraintRequest, CustomConstraint>
      updateCustomConstraintSettings;
  private final UnaryCallSettings<GetCustomConstraintRequest, CustomConstraint>
      getCustomConstraintSettings;
  private final PagedCallSettings<
          ListCustomConstraintsRequest,
          ListCustomConstraintsResponse,
          ListCustomConstraintsPagedResponse>
      listCustomConstraintsSettings;
  private final UnaryCallSettings<DeleteCustomConstraintRequest, Empty>
      deleteCustomConstraintSettings;

  private static final PagedListDescriptor<
          ListConstraintsRequest, ListConstraintsResponse, Constraint>
      LIST_CONSTRAINTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListConstraintsRequest, ListConstraintsResponse, Constraint>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConstraintsRequest injectToken(
                ListConstraintsRequest payload, String token) {
              return ListConstraintsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListConstraintsRequest injectPageSize(
                ListConstraintsRequest payload, int pageSize) {
              return ListConstraintsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListConstraintsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConstraintsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Constraint> extractResources(ListConstraintsResponse payload) {
              return payload.getConstraintsList() == null
                  ? ImmutableList.<Constraint>of()
                  : payload.getConstraintsList();
            }
          };

  private static final PagedListDescriptor<ListPoliciesRequest, ListPoliciesResponse, Policy>
      LIST_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListPoliciesRequest, ListPoliciesResponse, Policy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPoliciesRequest injectToken(ListPoliciesRequest payload, String token) {
              return ListPoliciesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPoliciesRequest injectPageSize(ListPoliciesRequest payload, int pageSize) {
              return ListPoliciesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPoliciesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPoliciesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Policy> extractResources(ListPoliciesResponse payload) {
              return payload.getPoliciesList() == null
                  ? ImmutableList.<Policy>of()
                  : payload.getPoliciesList();
            }
          };

  private static final PagedListDescriptor<
          ListCustomConstraintsRequest, ListCustomConstraintsResponse, CustomConstraint>
      LIST_CUSTOM_CONSTRAINTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCustomConstraintsRequest, ListCustomConstraintsResponse, CustomConstraint>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomConstraintsRequest injectToken(
                ListCustomConstraintsRequest payload, String token) {
              return ListCustomConstraintsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCustomConstraintsRequest injectPageSize(
                ListCustomConstraintsRequest payload, int pageSize) {
              return ListCustomConstraintsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCustomConstraintsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomConstraintsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<CustomConstraint> extractResources(
                ListCustomConstraintsResponse payload) {
              return payload.getCustomConstraintsList() == null
                  ? ImmutableList.<CustomConstraint>of()
                  : payload.getCustomConstraintsList();
            }
          };

  private static final PagedListResponseFactory<
          ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>
      LIST_CONSTRAINTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>() {
            @Override
            public ApiFuture<ListConstraintsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConstraintsRequest, ListConstraintsResponse> callable,
                ListConstraintsRequest request,
                ApiCallContext context,
                ApiFuture<ListConstraintsResponse> futureResponse) {
              PageContext<ListConstraintsRequest, ListConstraintsResponse, Constraint> pageContext =
                  PageContext.create(callable, LIST_CONSTRAINTS_PAGE_STR_DESC, request, context);
              return ListConstraintsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>
      LIST_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPoliciesRequest, ListPoliciesResponse> callable,
                ListPoliciesRequest request,
                ApiCallContext context,
                ApiFuture<ListPoliciesResponse> futureResponse) {
              PageContext<ListPoliciesRequest, ListPoliciesResponse, Policy> pageContext =
                  PageContext.create(callable, LIST_POLICIES_PAGE_STR_DESC, request, context);
              return ListPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListCustomConstraintsRequest,
          ListCustomConstraintsResponse,
          ListCustomConstraintsPagedResponse>
      LIST_CUSTOM_CONSTRAINTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomConstraintsRequest,
              ListCustomConstraintsResponse,
              ListCustomConstraintsPagedResponse>() {
            @Override
            public ApiFuture<ListCustomConstraintsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCustomConstraintsRequest, ListCustomConstraintsResponse> callable,
                ListCustomConstraintsRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomConstraintsResponse> futureResponse) {
              PageContext<
                      ListCustomConstraintsRequest, ListCustomConstraintsResponse, CustomConstraint>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CUSTOM_CONSTRAINTS_PAGE_STR_DESC, request, context);
              return ListCustomConstraintsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listConstraints. */
  public PagedCallSettings<
          ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>
      listConstraintsSettings() {
    return listConstraintsSettings;
  }

  /** Returns the object with the settings used for calls to listPolicies. */
  public PagedCallSettings<ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>
      listPoliciesSettings() {
    return listPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to getPolicy. */
  public UnaryCallSettings<GetPolicyRequest, Policy> getPolicySettings() {
    return getPolicySettings;
  }

  /** Returns the object with the settings used for calls to getEffectivePolicy. */
  public UnaryCallSettings<GetEffectivePolicyRequest, Policy> getEffectivePolicySettings() {
    return getEffectivePolicySettings;
  }

  /** Returns the object with the settings used for calls to createPolicy. */
  public UnaryCallSettings<CreatePolicyRequest, Policy> createPolicySettings() {
    return createPolicySettings;
  }

  /** Returns the object with the settings used for calls to updatePolicy. */
  public UnaryCallSettings<UpdatePolicyRequest, Policy> updatePolicySettings() {
    return updatePolicySettings;
  }

  /** Returns the object with the settings used for calls to deletePolicy. */
  public UnaryCallSettings<DeletePolicyRequest, Empty> deletePolicySettings() {
    return deletePolicySettings;
  }

  /** Returns the object with the settings used for calls to createCustomConstraint. */
  public UnaryCallSettings<CreateCustomConstraintRequest, CustomConstraint>
      createCustomConstraintSettings() {
    return createCustomConstraintSettings;
  }

  /** Returns the object with the settings used for calls to updateCustomConstraint. */
  public UnaryCallSettings<UpdateCustomConstraintRequest, CustomConstraint>
      updateCustomConstraintSettings() {
    return updateCustomConstraintSettings;
  }

  /** Returns the object with the settings used for calls to getCustomConstraint. */
  public UnaryCallSettings<GetCustomConstraintRequest, CustomConstraint>
      getCustomConstraintSettings() {
    return getCustomConstraintSettings;
  }

  /** Returns the object with the settings used for calls to listCustomConstraints. */
  public PagedCallSettings<
          ListCustomConstraintsRequest,
          ListCustomConstraintsResponse,
          ListCustomConstraintsPagedResponse>
      listCustomConstraintsSettings() {
    return listCustomConstraintsSettings;
  }

  /** Returns the object with the settings used for calls to deleteCustomConstraint. */
  public UnaryCallSettings<DeleteCustomConstraintRequest, Empty> deleteCustomConstraintSettings() {
    return deleteCustomConstraintSettings;
  }

  public OrgPolicyStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcOrgPolicyStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonOrgPolicyStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "orgpolicy";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "orgpolicy.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "orgpolicy.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(OrgPolicyStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(OrgPolicyStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return OrgPolicyStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected OrgPolicyStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listConstraintsSettings = settingsBuilder.listConstraintsSettings().build();
    listPoliciesSettings = settingsBuilder.listPoliciesSettings().build();
    getPolicySettings = settingsBuilder.getPolicySettings().build();
    getEffectivePolicySettings = settingsBuilder.getEffectivePolicySettings().build();
    createPolicySettings = settingsBuilder.createPolicySettings().build();
    updatePolicySettings = settingsBuilder.updatePolicySettings().build();
    deletePolicySettings = settingsBuilder.deletePolicySettings().build();
    createCustomConstraintSettings = settingsBuilder.createCustomConstraintSettings().build();
    updateCustomConstraintSettings = settingsBuilder.updateCustomConstraintSettings().build();
    getCustomConstraintSettings = settingsBuilder.getCustomConstraintSettings().build();
    listCustomConstraintsSettings = settingsBuilder.listCustomConstraintsSettings().build();
    deleteCustomConstraintSettings = settingsBuilder.deleteCustomConstraintSettings().build();
  }

  /** Builder for OrgPolicyStubSettings. */
  public static class Builder extends StubSettings.Builder<OrgPolicyStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>
        listConstraintsSettings;
    private final PagedCallSettings.Builder<
            ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>
        listPoliciesSettings;
    private final UnaryCallSettings.Builder<GetPolicyRequest, Policy> getPolicySettings;
    private final UnaryCallSettings.Builder<GetEffectivePolicyRequest, Policy>
        getEffectivePolicySettings;
    private final UnaryCallSettings.Builder<CreatePolicyRequest, Policy> createPolicySettings;
    private final UnaryCallSettings.Builder<UpdatePolicyRequest, Policy> updatePolicySettings;
    private final UnaryCallSettings.Builder<DeletePolicyRequest, Empty> deletePolicySettings;
    private final UnaryCallSettings.Builder<CreateCustomConstraintRequest, CustomConstraint>
        createCustomConstraintSettings;
    private final UnaryCallSettings.Builder<UpdateCustomConstraintRequest, CustomConstraint>
        updateCustomConstraintSettings;
    private final UnaryCallSettings.Builder<GetCustomConstraintRequest, CustomConstraint>
        getCustomConstraintSettings;
    private final PagedCallSettings.Builder<
            ListCustomConstraintsRequest,
            ListCustomConstraintsResponse,
            ListCustomConstraintsPagedResponse>
        listCustomConstraintsSettings;
    private final UnaryCallSettings.Builder<DeleteCustomConstraintRequest, Empty>
        deleteCustomConstraintSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(10000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listConstraintsSettings = PagedCallSettings.newBuilder(LIST_CONSTRAINTS_PAGE_STR_FACT);
      listPoliciesSettings = PagedCallSettings.newBuilder(LIST_POLICIES_PAGE_STR_FACT);
      getPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEffectivePolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updatePolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deletePolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createCustomConstraintSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateCustomConstraintSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getCustomConstraintSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCustomConstraintsSettings =
          PagedCallSettings.newBuilder(LIST_CUSTOM_CONSTRAINTS_PAGE_STR_FACT);
      deleteCustomConstraintSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConstraintsSettings,
              listPoliciesSettings,
              getPolicySettings,
              getEffectivePolicySettings,
              createPolicySettings,
              updatePolicySettings,
              deletePolicySettings,
              createCustomConstraintSettings,
              updateCustomConstraintSettings,
              getCustomConstraintSettings,
              listCustomConstraintsSettings,
              deleteCustomConstraintSettings);
      initDefaults(this);
    }

    protected Builder(OrgPolicyStubSettings settings) {
      super(settings);

      listConstraintsSettings = settings.listConstraintsSettings.toBuilder();
      listPoliciesSettings = settings.listPoliciesSettings.toBuilder();
      getPolicySettings = settings.getPolicySettings.toBuilder();
      getEffectivePolicySettings = settings.getEffectivePolicySettings.toBuilder();
      createPolicySettings = settings.createPolicySettings.toBuilder();
      updatePolicySettings = settings.updatePolicySettings.toBuilder();
      deletePolicySettings = settings.deletePolicySettings.toBuilder();
      createCustomConstraintSettings = settings.createCustomConstraintSettings.toBuilder();
      updateCustomConstraintSettings = settings.updateCustomConstraintSettings.toBuilder();
      getCustomConstraintSettings = settings.getCustomConstraintSettings.toBuilder();
      listCustomConstraintsSettings = settings.listCustomConstraintsSettings.toBuilder();
      deleteCustomConstraintSettings = settings.deleteCustomConstraintSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConstraintsSettings,
              listPoliciesSettings,
              getPolicySettings,
              getEffectivePolicySettings,
              createPolicySettings,
              updatePolicySettings,
              deletePolicySettings,
              createCustomConstraintSettings,
              updateCustomConstraintSettings,
              getCustomConstraintSettings,
              listCustomConstraintsSettings,
              deleteCustomConstraintSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .listConstraintsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getEffectivePolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updatePolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deletePolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCustomConstraintSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateCustomConstraintSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getCustomConstraintSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCustomConstraintsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteCustomConstraintSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to listConstraints. */
    public PagedCallSettings.Builder<
            ListConstraintsRequest, ListConstraintsResponse, ListConstraintsPagedResponse>
        listConstraintsSettings() {
      return listConstraintsSettings;
    }

    /** Returns the builder for the settings used for calls to listPolicies. */
    public PagedCallSettings.Builder<
            ListPoliciesRequest, ListPoliciesResponse, ListPoliciesPagedResponse>
        listPoliciesSettings() {
      return listPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to getPolicy. */
    public UnaryCallSettings.Builder<GetPolicyRequest, Policy> getPolicySettings() {
      return getPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getEffectivePolicy. */
    public UnaryCallSettings.Builder<GetEffectivePolicyRequest, Policy>
        getEffectivePolicySettings() {
      return getEffectivePolicySettings;
    }

    /** Returns the builder for the settings used for calls to createPolicy. */
    public UnaryCallSettings.Builder<CreatePolicyRequest, Policy> createPolicySettings() {
      return createPolicySettings;
    }

    /** Returns the builder for the settings used for calls to updatePolicy. */
    public UnaryCallSettings.Builder<UpdatePolicyRequest, Policy> updatePolicySettings() {
      return updatePolicySettings;
    }

    /** Returns the builder for the settings used for calls to deletePolicy. */
    public UnaryCallSettings.Builder<DeletePolicyRequest, Empty> deletePolicySettings() {
      return deletePolicySettings;
    }

    /** Returns the builder for the settings used for calls to createCustomConstraint. */
    public UnaryCallSettings.Builder<CreateCustomConstraintRequest, CustomConstraint>
        createCustomConstraintSettings() {
      return createCustomConstraintSettings;
    }

    /** Returns the builder for the settings used for calls to updateCustomConstraint. */
    public UnaryCallSettings.Builder<UpdateCustomConstraintRequest, CustomConstraint>
        updateCustomConstraintSettings() {
      return updateCustomConstraintSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomConstraint. */
    public UnaryCallSettings.Builder<GetCustomConstraintRequest, CustomConstraint>
        getCustomConstraintSettings() {
      return getCustomConstraintSettings;
    }

    /** Returns the builder for the settings used for calls to listCustomConstraints. */
    public PagedCallSettings.Builder<
            ListCustomConstraintsRequest,
            ListCustomConstraintsResponse,
            ListCustomConstraintsPagedResponse>
        listCustomConstraintsSettings() {
      return listCustomConstraintsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteCustomConstraint. */
    public UnaryCallSettings.Builder<DeleteCustomConstraintRequest, Empty>
        deleteCustomConstraintSettings() {
      return deleteCustomConstraintSettings;
    }

    @Override
    public OrgPolicyStubSettings build() throws IOException {
      return new OrgPolicyStubSettings(this);
    }
  }
}
