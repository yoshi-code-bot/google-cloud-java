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

package com.google.cloud.maintenance.api.v1beta.stub;

import static com.google.cloud.maintenance.api.v1beta.MaintenanceClient.ListLocationsPagedResponse;
import static com.google.cloud.maintenance.api.v1beta.MaintenanceClient.ListResourceMaintenancesPagedResponse;
import static com.google.cloud.maintenance.api.v1beta.MaintenanceClient.SummarizeMaintenancesPagedResponse;

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
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.maintenance.api.v1beta.GetResourceMaintenanceRequest;
import com.google.cloud.maintenance.api.v1beta.ListResourceMaintenancesRequest;
import com.google.cloud.maintenance.api.v1beta.ListResourceMaintenancesResponse;
import com.google.cloud.maintenance.api.v1beta.MaintenanceSummary;
import com.google.cloud.maintenance.api.v1beta.ResourceMaintenance;
import com.google.cloud.maintenance.api.v1beta.SummarizeMaintenancesRequest;
import com.google.cloud.maintenance.api.v1beta.SummarizeMaintenancesResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link MaintenanceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (maintenance.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getResourceMaintenance:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * MaintenanceStubSettings.Builder maintenanceSettingsBuilder =
 *     MaintenanceStubSettings.newBuilder();
 * maintenanceSettingsBuilder
 *     .getResourceMaintenanceSettings()
 *     .setRetrySettings(
 *         maintenanceSettingsBuilder
 *             .getResourceMaintenanceSettings()
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
 * MaintenanceStubSettings maintenanceSettings = maintenanceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class MaintenanceStubSettings extends StubSettings<MaintenanceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final PagedCallSettings<
          SummarizeMaintenancesRequest,
          SummarizeMaintenancesResponse,
          SummarizeMaintenancesPagedResponse>
      summarizeMaintenancesSettings;
  private final PagedCallSettings<
          ListResourceMaintenancesRequest,
          ListResourceMaintenancesResponse,
          ListResourceMaintenancesPagedResponse>
      listResourceMaintenancesSettings;
  private final UnaryCallSettings<GetResourceMaintenanceRequest, ResourceMaintenance>
      getResourceMaintenanceSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          SummarizeMaintenancesRequest, SummarizeMaintenancesResponse, MaintenanceSummary>
      SUMMARIZE_MAINTENANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              SummarizeMaintenancesRequest, SummarizeMaintenancesResponse, MaintenanceSummary>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SummarizeMaintenancesRequest injectToken(
                SummarizeMaintenancesRequest payload, String token) {
              return SummarizeMaintenancesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public SummarizeMaintenancesRequest injectPageSize(
                SummarizeMaintenancesRequest payload, int pageSize) {
              return SummarizeMaintenancesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(SummarizeMaintenancesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SummarizeMaintenancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MaintenanceSummary> extractResources(
                SummarizeMaintenancesResponse payload) {
              return payload.getMaintenancesList();
            }
          };

  private static final PagedListDescriptor<
          ListResourceMaintenancesRequest, ListResourceMaintenancesResponse, ResourceMaintenance>
      LIST_RESOURCE_MAINTENANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListResourceMaintenancesRequest,
              ListResourceMaintenancesResponse,
              ResourceMaintenance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListResourceMaintenancesRequest injectToken(
                ListResourceMaintenancesRequest payload, String token) {
              return ListResourceMaintenancesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListResourceMaintenancesRequest injectPageSize(
                ListResourceMaintenancesRequest payload, int pageSize) {
              return ListResourceMaintenancesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListResourceMaintenancesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListResourceMaintenancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ResourceMaintenance> extractResources(
                ListResourceMaintenancesResponse payload) {
              return payload.getResourceMaintenancesList();
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
          SummarizeMaintenancesRequest,
          SummarizeMaintenancesResponse,
          SummarizeMaintenancesPagedResponse>
      SUMMARIZE_MAINTENANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SummarizeMaintenancesRequest,
              SummarizeMaintenancesResponse,
              SummarizeMaintenancesPagedResponse>() {
            @Override
            public ApiFuture<SummarizeMaintenancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<SummarizeMaintenancesRequest, SummarizeMaintenancesResponse> callable,
                SummarizeMaintenancesRequest request,
                ApiCallContext context,
                ApiFuture<SummarizeMaintenancesResponse> futureResponse) {
              PageContext<
                      SummarizeMaintenancesRequest,
                      SummarizeMaintenancesResponse,
                      MaintenanceSummary>
                  pageContext =
                      PageContext.create(
                          callable, SUMMARIZE_MAINTENANCES_PAGE_STR_DESC, request, context);
              return SummarizeMaintenancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListResourceMaintenancesRequest,
          ListResourceMaintenancesResponse,
          ListResourceMaintenancesPagedResponse>
      LIST_RESOURCE_MAINTENANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListResourceMaintenancesRequest,
              ListResourceMaintenancesResponse,
              ListResourceMaintenancesPagedResponse>() {
            @Override
            public ApiFuture<ListResourceMaintenancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListResourceMaintenancesRequest, ListResourceMaintenancesResponse>
                    callable,
                ListResourceMaintenancesRequest request,
                ApiCallContext context,
                ApiFuture<ListResourceMaintenancesResponse> futureResponse) {
              PageContext<
                      ListResourceMaintenancesRequest,
                      ListResourceMaintenancesResponse,
                      ResourceMaintenance>
                  pageContext =
                      PageContext.create(
                          callable, LIST_RESOURCE_MAINTENANCES_PAGE_STR_DESC, request, context);
              return ListResourceMaintenancesPagedResponse.createAsync(pageContext, futureResponse);
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

  /** Returns the object with the settings used for calls to summarizeMaintenances. */
  public PagedCallSettings<
          SummarizeMaintenancesRequest,
          SummarizeMaintenancesResponse,
          SummarizeMaintenancesPagedResponse>
      summarizeMaintenancesSettings() {
    return summarizeMaintenancesSettings;
  }

  /** Returns the object with the settings used for calls to listResourceMaintenances. */
  public PagedCallSettings<
          ListResourceMaintenancesRequest,
          ListResourceMaintenancesResponse,
          ListResourceMaintenancesPagedResponse>
      listResourceMaintenancesSettings() {
    return listResourceMaintenancesSettings;
  }

  /** Returns the object with the settings used for calls to getResourceMaintenance. */
  public UnaryCallSettings<GetResourceMaintenanceRequest, ResourceMaintenance>
      getResourceMaintenanceSettings() {
    return getResourceMaintenanceSettings;
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

  public MaintenanceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcMaintenanceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonMaintenanceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "maintenance";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "maintenance.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "maintenance.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(MaintenanceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(MaintenanceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return MaintenanceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected MaintenanceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    summarizeMaintenancesSettings = settingsBuilder.summarizeMaintenancesSettings().build();
    listResourceMaintenancesSettings = settingsBuilder.listResourceMaintenancesSettings().build();
    getResourceMaintenanceSettings = settingsBuilder.getResourceMaintenanceSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for MaintenanceStubSettings. */
  public static class Builder extends StubSettings.Builder<MaintenanceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            SummarizeMaintenancesRequest,
            SummarizeMaintenancesResponse,
            SummarizeMaintenancesPagedResponse>
        summarizeMaintenancesSettings;
    private final PagedCallSettings.Builder<
            ListResourceMaintenancesRequest,
            ListResourceMaintenancesResponse,
            ListResourceMaintenancesPagedResponse>
        listResourceMaintenancesSettings;
    private final UnaryCallSettings.Builder<GetResourceMaintenanceRequest, ResourceMaintenance>
        getResourceMaintenanceSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      summarizeMaintenancesSettings =
          PagedCallSettings.newBuilder(SUMMARIZE_MAINTENANCES_PAGE_STR_FACT);
      listResourceMaintenancesSettings =
          PagedCallSettings.newBuilder(LIST_RESOURCE_MAINTENANCES_PAGE_STR_FACT);
      getResourceMaintenanceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              summarizeMaintenancesSettings,
              listResourceMaintenancesSettings,
              getResourceMaintenanceSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(MaintenanceStubSettings settings) {
      super(settings);

      summarizeMaintenancesSettings = settings.summarizeMaintenancesSettings.toBuilder();
      listResourceMaintenancesSettings = settings.listResourceMaintenancesSettings.toBuilder();
      getResourceMaintenanceSettings = settings.getResourceMaintenanceSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              summarizeMaintenancesSettings,
              listResourceMaintenancesSettings,
              getResourceMaintenanceSettings,
              listLocationsSettings,
              getLocationSettings);
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
          .summarizeMaintenancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listResourceMaintenancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getResourceMaintenanceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

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

    /** Returns the builder for the settings used for calls to summarizeMaintenances. */
    public PagedCallSettings.Builder<
            SummarizeMaintenancesRequest,
            SummarizeMaintenancesResponse,
            SummarizeMaintenancesPagedResponse>
        summarizeMaintenancesSettings() {
      return summarizeMaintenancesSettings;
    }

    /** Returns the builder for the settings used for calls to listResourceMaintenances. */
    public PagedCallSettings.Builder<
            ListResourceMaintenancesRequest,
            ListResourceMaintenancesResponse,
            ListResourceMaintenancesPagedResponse>
        listResourceMaintenancesSettings() {
      return listResourceMaintenancesSettings;
    }

    /** Returns the builder for the settings used for calls to getResourceMaintenance. */
    public UnaryCallSettings.Builder<GetResourceMaintenanceRequest, ResourceMaintenance>
        getResourceMaintenanceSettings() {
      return getResourceMaintenanceSettings;
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

    @Override
    public MaintenanceStubSettings build() throws IOException {
      return new MaintenanceStubSettings(this);
    }
  }
}
