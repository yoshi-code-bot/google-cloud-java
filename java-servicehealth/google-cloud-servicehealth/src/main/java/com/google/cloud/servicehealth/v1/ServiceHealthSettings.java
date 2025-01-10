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

package com.google.cloud.servicehealth.v1;

import static com.google.cloud.servicehealth.v1.ServiceHealthClient.ListEventsPagedResponse;
import static com.google.cloud.servicehealth.v1.ServiceHealthClient.ListLocationsPagedResponse;
import static com.google.cloud.servicehealth.v1.ServiceHealthClient.ListOrganizationEventsPagedResponse;
import static com.google.cloud.servicehealth.v1.ServiceHealthClient.ListOrganizationImpactsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.servicehealth.v1.stub.ServiceHealthStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link ServiceHealthClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (servicehealth.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getEvent:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * ServiceHealthSettings.Builder serviceHealthSettingsBuilder = ServiceHealthSettings.newBuilder();
 * serviceHealthSettingsBuilder
 *     .getEventSettings()
 *     .setRetrySettings(
 *         serviceHealthSettingsBuilder
 *             .getEventSettings()
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
 * ServiceHealthSettings serviceHealthSettings = serviceHealthSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class ServiceHealthSettings extends ClientSettings<ServiceHealthSettings> {

  /** Returns the object with the settings used for calls to listEvents. */
  public PagedCallSettings<ListEventsRequest, ListEventsResponse, ListEventsPagedResponse>
      listEventsSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).listEventsSettings();
  }

  /** Returns the object with the settings used for calls to getEvent. */
  public UnaryCallSettings<GetEventRequest, Event> getEventSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).getEventSettings();
  }

  /** Returns the object with the settings used for calls to listOrganizationEvents. */
  public PagedCallSettings<
          ListOrganizationEventsRequest,
          ListOrganizationEventsResponse,
          ListOrganizationEventsPagedResponse>
      listOrganizationEventsSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).listOrganizationEventsSettings();
  }

  /** Returns the object with the settings used for calls to getOrganizationEvent. */
  public UnaryCallSettings<GetOrganizationEventRequest, OrganizationEvent>
      getOrganizationEventSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).getOrganizationEventSettings();
  }

  /** Returns the object with the settings used for calls to listOrganizationImpacts. */
  public PagedCallSettings<
          ListOrganizationImpactsRequest,
          ListOrganizationImpactsResponse,
          ListOrganizationImpactsPagedResponse>
      listOrganizationImpactsSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).listOrganizationImpactsSettings();
  }

  /** Returns the object with the settings used for calls to getOrganizationImpact. */
  public UnaryCallSettings<GetOrganizationImpactRequest, OrganizationImpact>
      getOrganizationImpactSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).getOrganizationImpactSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((ServiceHealthStubSettings) getStubSettings()).getLocationSettings();
  }

  public static final ServiceHealthSettings create(ServiceHealthStubSettings stub)
      throws IOException {
    return new ServiceHealthSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return ServiceHealthStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return ServiceHealthStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return ServiceHealthStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return ServiceHealthStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return ServiceHealthStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return ServiceHealthStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return ServiceHealthStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ServiceHealthStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected ServiceHealthSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for ServiceHealthSettings. */
  public static class Builder extends ClientSettings.Builder<ServiceHealthSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(ServiceHealthStubSettings.newBuilder(clientContext));
    }

    protected Builder(ServiceHealthSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(ServiceHealthStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(ServiceHealthStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(ServiceHealthStubSettings.newHttpJsonBuilder());
    }

    public ServiceHealthStubSettings.Builder getStubSettingsBuilder() {
      return ((ServiceHealthStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listEvents. */
    public PagedCallSettings.Builder<ListEventsRequest, ListEventsResponse, ListEventsPagedResponse>
        listEventsSettings() {
      return getStubSettingsBuilder().listEventsSettings();
    }

    /** Returns the builder for the settings used for calls to getEvent. */
    public UnaryCallSettings.Builder<GetEventRequest, Event> getEventSettings() {
      return getStubSettingsBuilder().getEventSettings();
    }

    /** Returns the builder for the settings used for calls to listOrganizationEvents. */
    public PagedCallSettings.Builder<
            ListOrganizationEventsRequest,
            ListOrganizationEventsResponse,
            ListOrganizationEventsPagedResponse>
        listOrganizationEventsSettings() {
      return getStubSettingsBuilder().listOrganizationEventsSettings();
    }

    /** Returns the builder for the settings used for calls to getOrganizationEvent. */
    public UnaryCallSettings.Builder<GetOrganizationEventRequest, OrganizationEvent>
        getOrganizationEventSettings() {
      return getStubSettingsBuilder().getOrganizationEventSettings();
    }

    /** Returns the builder for the settings used for calls to listOrganizationImpacts. */
    public PagedCallSettings.Builder<
            ListOrganizationImpactsRequest,
            ListOrganizationImpactsResponse,
            ListOrganizationImpactsPagedResponse>
        listOrganizationImpactsSettings() {
      return getStubSettingsBuilder().listOrganizationImpactsSettings();
    }

    /** Returns the builder for the settings used for calls to getOrganizationImpact. */
    public UnaryCallSettings.Builder<GetOrganizationImpactRequest, OrganizationImpact>
        getOrganizationImpactSettings() {
      return getStubSettingsBuilder().getOrganizationImpactSettings();
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return getStubSettingsBuilder().listLocationsSettings();
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getStubSettingsBuilder().getLocationSettings();
    }

    @Override
    public ServiceHealthSettings build() throws IOException {
      return new ServiceHealthSettings(this);
    }
  }
}
