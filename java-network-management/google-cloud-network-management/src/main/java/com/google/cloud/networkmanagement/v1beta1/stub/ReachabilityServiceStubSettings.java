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

package com.google.cloud.networkmanagement.v1beta1.stub;

import static com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceClient.ListConnectivityTestsPagedResponse;
import static com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceClient.ListLocationsPagedResponse;

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
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.networkmanagement.v1beta1.ConnectivityTest;
import com.google.cloud.networkmanagement.v1beta1.CreateConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1beta1.DeleteConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1beta1.GetConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1beta1.ListConnectivityTestsRequest;
import com.google.cloud.networkmanagement.v1beta1.ListConnectivityTestsResponse;
import com.google.cloud.networkmanagement.v1beta1.OperationMetadata;
import com.google.cloud.networkmanagement.v1beta1.RerunConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1beta1.UpdateConnectivityTestRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ReachabilityServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (networkmanagement.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getConnectivityTest:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ReachabilityServiceStubSettings.Builder reachabilityServiceSettingsBuilder =
 *     ReachabilityServiceStubSettings.newBuilder();
 * reachabilityServiceSettingsBuilder
 *     .getConnectivityTestSettings()
 *     .setRetrySettings(
 *         reachabilityServiceSettingsBuilder
 *             .getConnectivityTestSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * ReachabilityServiceStubSettings reachabilityServiceSettings =
 *     reachabilityServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createConnectivityTest:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ReachabilityServiceStubSettings.Builder reachabilityServiceSettingsBuilder =
 *     ReachabilityServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * reachabilityServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ReachabilityServiceStubSettings extends StubSettings<ReachabilityServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          ListConnectivityTestsRequest,
          ListConnectivityTestsResponse,
          ListConnectivityTestsPagedResponse>
      listConnectivityTestsSettings;
  private final UnaryCallSettings<GetConnectivityTestRequest, ConnectivityTest>
      getConnectivityTestSettings;
  private final UnaryCallSettings<CreateConnectivityTestRequest, Operation>
      createConnectivityTestSettings;
  private final OperationCallSettings<
          CreateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      createConnectivityTestOperationSettings;
  private final UnaryCallSettings<UpdateConnectivityTestRequest, Operation>
      updateConnectivityTestSettings;
  private final OperationCallSettings<
          UpdateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      updateConnectivityTestOperationSettings;
  private final UnaryCallSettings<RerunConnectivityTestRequest, Operation>
      rerunConnectivityTestSettings;
  private final OperationCallSettings<
          RerunConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      rerunConnectivityTestOperationSettings;
  private final UnaryCallSettings<DeleteConnectivityTestRequest, Operation>
      deleteConnectivityTestSettings;
  private final OperationCallSettings<DeleteConnectivityTestRequest, Empty, OperationMetadata>
      deleteConnectivityTestOperationSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;

  private static final PagedListDescriptor<
          ListConnectivityTestsRequest, ListConnectivityTestsResponse, ConnectivityTest>
      LIST_CONNECTIVITY_TESTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListConnectivityTestsRequest, ListConnectivityTestsResponse, ConnectivityTest>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConnectivityTestsRequest injectToken(
                ListConnectivityTestsRequest payload, String token) {
              return ListConnectivityTestsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListConnectivityTestsRequest injectPageSize(
                ListConnectivityTestsRequest payload, int pageSize) {
              return ListConnectivityTestsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListConnectivityTestsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConnectivityTestsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ConnectivityTest> extractResources(
                ListConnectivityTestsResponse payload) {
              return payload.getResourcesList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListConnectivityTestsRequest,
          ListConnectivityTestsResponse,
          ListConnectivityTestsPagedResponse>
      LIST_CONNECTIVITY_TESTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConnectivityTestsRequest,
              ListConnectivityTestsResponse,
              ListConnectivityTestsPagedResponse>() {
            @Override
            public ApiFuture<ListConnectivityTestsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConnectivityTestsRequest, ListConnectivityTestsResponse> callable,
                ListConnectivityTestsRequest request,
                ApiCallContext context,
                ApiFuture<ListConnectivityTestsResponse> futureResponse) {
              PageContext<
                      ListConnectivityTestsRequest, ListConnectivityTestsResponse, ConnectivityTest>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONNECTIVITY_TESTS_PAGE_STR_DESC, request, context);
              return ListConnectivityTestsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listConnectivityTests. */
  public PagedCallSettings<
          ListConnectivityTestsRequest,
          ListConnectivityTestsResponse,
          ListConnectivityTestsPagedResponse>
      listConnectivityTestsSettings() {
    return listConnectivityTestsSettings;
  }

  /** Returns the object with the settings used for calls to getConnectivityTest. */
  public UnaryCallSettings<GetConnectivityTestRequest, ConnectivityTest>
      getConnectivityTestSettings() {
    return getConnectivityTestSettings;
  }

  /** Returns the object with the settings used for calls to createConnectivityTest. */
  public UnaryCallSettings<CreateConnectivityTestRequest, Operation>
      createConnectivityTestSettings() {
    return createConnectivityTestSettings;
  }

  /** Returns the object with the settings used for calls to createConnectivityTest. */
  public OperationCallSettings<CreateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      createConnectivityTestOperationSettings() {
    return createConnectivityTestOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateConnectivityTest. */
  public UnaryCallSettings<UpdateConnectivityTestRequest, Operation>
      updateConnectivityTestSettings() {
    return updateConnectivityTestSettings;
  }

  /** Returns the object with the settings used for calls to updateConnectivityTest. */
  public OperationCallSettings<UpdateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      updateConnectivityTestOperationSettings() {
    return updateConnectivityTestOperationSettings;
  }

  /** Returns the object with the settings used for calls to rerunConnectivityTest. */
  public UnaryCallSettings<RerunConnectivityTestRequest, Operation>
      rerunConnectivityTestSettings() {
    return rerunConnectivityTestSettings;
  }

  /** Returns the object with the settings used for calls to rerunConnectivityTest. */
  public OperationCallSettings<RerunConnectivityTestRequest, ConnectivityTest, OperationMetadata>
      rerunConnectivityTestOperationSettings() {
    return rerunConnectivityTestOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteConnectivityTest. */
  public UnaryCallSettings<DeleteConnectivityTestRequest, Operation>
      deleteConnectivityTestSettings() {
    return deleteConnectivityTestSettings;
  }

  /** Returns the object with the settings used for calls to deleteConnectivityTest. */
  public OperationCallSettings<DeleteConnectivityTestRequest, Empty, OperationMetadata>
      deleteConnectivityTestOperationSettings() {
    return deleteConnectivityTestOperationSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  public ReachabilityServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcReachabilityServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonReachabilityServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "networkmanagement";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "networkmanagement.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "networkmanagement.mtls.googleapis.com:443";
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
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ReachabilityServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(ReachabilityServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ReachabilityServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected ReachabilityServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listConnectivityTestsSettings = settingsBuilder.listConnectivityTestsSettings().build();
    getConnectivityTestSettings = settingsBuilder.getConnectivityTestSettings().build();
    createConnectivityTestSettings = settingsBuilder.createConnectivityTestSettings().build();
    createConnectivityTestOperationSettings =
        settingsBuilder.createConnectivityTestOperationSettings().build();
    updateConnectivityTestSettings = settingsBuilder.updateConnectivityTestSettings().build();
    updateConnectivityTestOperationSettings =
        settingsBuilder.updateConnectivityTestOperationSettings().build();
    rerunConnectivityTestSettings = settingsBuilder.rerunConnectivityTestSettings().build();
    rerunConnectivityTestOperationSettings =
        settingsBuilder.rerunConnectivityTestOperationSettings().build();
    deleteConnectivityTestSettings = settingsBuilder.deleteConnectivityTestSettings().build();
    deleteConnectivityTestOperationSettings =
        settingsBuilder.deleteConnectivityTestOperationSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
  }

  /** Builder for ReachabilityServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<ReachabilityServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListConnectivityTestsRequest,
            ListConnectivityTestsResponse,
            ListConnectivityTestsPagedResponse>
        listConnectivityTestsSettings;
    private final UnaryCallSettings.Builder<GetConnectivityTestRequest, ConnectivityTest>
        getConnectivityTestSettings;
    private final UnaryCallSettings.Builder<CreateConnectivityTestRequest, Operation>
        createConnectivityTestSettings;
    private final OperationCallSettings.Builder<
            CreateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        createConnectivityTestOperationSettings;
    private final UnaryCallSettings.Builder<UpdateConnectivityTestRequest, Operation>
        updateConnectivityTestSettings;
    private final OperationCallSettings.Builder<
            UpdateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        updateConnectivityTestOperationSettings;
    private final UnaryCallSettings.Builder<RerunConnectivityTestRequest, Operation>
        rerunConnectivityTestSettings;
    private final OperationCallSettings.Builder<
            RerunConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        rerunConnectivityTestOperationSettings;
    private final UnaryCallSettings.Builder<DeleteConnectivityTestRequest, Operation>
        deleteConnectivityTestSettings;
    private final OperationCallSettings.Builder<
            DeleteConnectivityTestRequest, Empty, OperationMetadata>
        deleteConnectivityTestOperationSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listConnectivityTestsSettings =
          PagedCallSettings.newBuilder(LIST_CONNECTIVITY_TESTS_PAGE_STR_FACT);
      getConnectivityTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createConnectivityTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createConnectivityTestOperationSettings = OperationCallSettings.newBuilder();
      updateConnectivityTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateConnectivityTestOperationSettings = OperationCallSettings.newBuilder();
      rerunConnectivityTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      rerunConnectivityTestOperationSettings = OperationCallSettings.newBuilder();
      deleteConnectivityTestSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteConnectivityTestOperationSettings = OperationCallSettings.newBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConnectivityTestsSettings,
              getConnectivityTestSettings,
              createConnectivityTestSettings,
              updateConnectivityTestSettings,
              rerunConnectivityTestSettings,
              deleteConnectivityTestSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
      initDefaults(this);
    }

    protected Builder(ReachabilityServiceStubSettings settings) {
      super(settings);

      listConnectivityTestsSettings = settings.listConnectivityTestsSettings.toBuilder();
      getConnectivityTestSettings = settings.getConnectivityTestSettings.toBuilder();
      createConnectivityTestSettings = settings.createConnectivityTestSettings.toBuilder();
      createConnectivityTestOperationSettings =
          settings.createConnectivityTestOperationSettings.toBuilder();
      updateConnectivityTestSettings = settings.updateConnectivityTestSettings.toBuilder();
      updateConnectivityTestOperationSettings =
          settings.updateConnectivityTestOperationSettings.toBuilder();
      rerunConnectivityTestSettings = settings.rerunConnectivityTestSettings.toBuilder();
      rerunConnectivityTestOperationSettings =
          settings.rerunConnectivityTestOperationSettings.toBuilder();
      deleteConnectivityTestSettings = settings.deleteConnectivityTestSettings.toBuilder();
      deleteConnectivityTestOperationSettings =
          settings.deleteConnectivityTestOperationSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listConnectivityTestsSettings,
              getConnectivityTestSettings,
              createConnectivityTestSettings,
              updateConnectivityTestSettings,
              rerunConnectivityTestSettings,
              deleteConnectivityTestSettings,
              listLocationsSettings,
              getLocationSettings,
              setIamPolicySettings,
              getIamPolicySettings,
              testIamPermissionsSettings);
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
          .listConnectivityTestsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getConnectivityTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createConnectivityTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateConnectivityTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .rerunConnectivityTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .deleteConnectivityTestSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createConnectivityTestOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateConnectivityTestRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConnectivityTest.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateConnectivityTestOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateConnectivityTestRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConnectivityTest.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .rerunConnectivityTestOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RerunConnectivityTestRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(ConnectivityTest.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteConnectivityTestOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteConnectivityTestRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(45000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(300000L))
                      .build()));

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

    /** Returns the builder for the settings used for calls to listConnectivityTests. */
    public PagedCallSettings.Builder<
            ListConnectivityTestsRequest,
            ListConnectivityTestsResponse,
            ListConnectivityTestsPagedResponse>
        listConnectivityTestsSettings() {
      return listConnectivityTestsSettings;
    }

    /** Returns the builder for the settings used for calls to getConnectivityTest. */
    public UnaryCallSettings.Builder<GetConnectivityTestRequest, ConnectivityTest>
        getConnectivityTestSettings() {
      return getConnectivityTestSettings;
    }

    /** Returns the builder for the settings used for calls to createConnectivityTest. */
    public UnaryCallSettings.Builder<CreateConnectivityTestRequest, Operation>
        createConnectivityTestSettings() {
      return createConnectivityTestSettings;
    }

    /** Returns the builder for the settings used for calls to createConnectivityTest. */
    public OperationCallSettings.Builder<
            CreateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        createConnectivityTestOperationSettings() {
      return createConnectivityTestOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateConnectivityTest. */
    public UnaryCallSettings.Builder<UpdateConnectivityTestRequest, Operation>
        updateConnectivityTestSettings() {
      return updateConnectivityTestSettings;
    }

    /** Returns the builder for the settings used for calls to updateConnectivityTest. */
    public OperationCallSettings.Builder<
            UpdateConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        updateConnectivityTestOperationSettings() {
      return updateConnectivityTestOperationSettings;
    }

    /** Returns the builder for the settings used for calls to rerunConnectivityTest. */
    public UnaryCallSettings.Builder<RerunConnectivityTestRequest, Operation>
        rerunConnectivityTestSettings() {
      return rerunConnectivityTestSettings;
    }

    /** Returns the builder for the settings used for calls to rerunConnectivityTest. */
    public OperationCallSettings.Builder<
            RerunConnectivityTestRequest, ConnectivityTest, OperationMetadata>
        rerunConnectivityTestOperationSettings() {
      return rerunConnectivityTestOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConnectivityTest. */
    public UnaryCallSettings.Builder<DeleteConnectivityTestRequest, Operation>
        deleteConnectivityTestSettings() {
      return deleteConnectivityTestSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConnectivityTest. */
    public OperationCallSettings.Builder<DeleteConnectivityTestRequest, Empty, OperationMetadata>
        deleteConnectivityTestOperationSettings() {
      return deleteConnectivityTestOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    @Override
    public ReachabilityServiceStubSettings build() throws IOException {
      return new ReachabilityServiceStubSettings(this);
    }
  }
}
