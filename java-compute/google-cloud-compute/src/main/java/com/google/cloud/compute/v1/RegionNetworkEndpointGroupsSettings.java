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

package com.google.cloud.compute.v1;

import static com.google.cloud.compute.v1.RegionNetworkEndpointGroupsClient.ListNetworkEndpointsPagedResponse;
import static com.google.cloud.compute.v1.RegionNetworkEndpointGroupsClient.ListPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.compute.v1.stub.RegionNetworkEndpointGroupsStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RegionNetworkEndpointGroupsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of get:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionNetworkEndpointGroupsSettings.Builder regionNetworkEndpointGroupsSettingsBuilder =
 *     RegionNetworkEndpointGroupsSettings.newBuilder();
 * regionNetworkEndpointGroupsSettingsBuilder
 *     .getSettings()
 *     .setRetrySettings(
 *         regionNetworkEndpointGroupsSettingsBuilder
 *             .getSettings()
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
 * RegionNetworkEndpointGroupsSettings regionNetworkEndpointGroupsSettings =
 *     regionNetworkEndpointGroupsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for attachNetworkEndpoints:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionNetworkEndpointGroupsSettings.Builder regionNetworkEndpointGroupsSettingsBuilder =
 *     RegionNetworkEndpointGroupsSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * regionNetworkEndpointGroupsSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RegionNetworkEndpointGroupsSettings
    extends ClientSettings<RegionNetworkEndpointGroupsSettings> {

  /** Returns the object with the settings used for calls to attachNetworkEndpoints. */
  public UnaryCallSettings<AttachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation>
      attachNetworkEndpointsSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings())
        .attachNetworkEndpointsSettings();
  }

  /** Returns the object with the settings used for calls to attachNetworkEndpoints. */
  public OperationCallSettings<
          AttachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation, Operation>
      attachNetworkEndpointsOperationSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings())
        .attachNetworkEndpointsOperationSettings();
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteRegionNetworkEndpointGroupRequest, Operation> deleteSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).deleteSettings();
  }

  /** Returns the object with the settings used for calls to delete. */
  public OperationCallSettings<DeleteRegionNetworkEndpointGroupRequest, Operation, Operation>
      deleteOperationSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).deleteOperationSettings();
  }

  /** Returns the object with the settings used for calls to detachNetworkEndpoints. */
  public UnaryCallSettings<DetachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation>
      detachNetworkEndpointsSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings())
        .detachNetworkEndpointsSettings();
  }

  /** Returns the object with the settings used for calls to detachNetworkEndpoints. */
  public OperationCallSettings<
          DetachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation, Operation>
      detachNetworkEndpointsOperationSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings())
        .detachNetworkEndpointsOperationSettings();
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionNetworkEndpointGroupRequest, NetworkEndpointGroup>
      getSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).getSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertRegionNetworkEndpointGroupRequest, Operation> insertSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).insertSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public OperationCallSettings<InsertRegionNetworkEndpointGroupRequest, Operation, Operation>
      insertOperationSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).insertOperationSettings();
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListRegionNetworkEndpointGroupsRequest, NetworkEndpointGroupList, ListPagedResponse>
      listSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings()).listSettings();
  }

  /** Returns the object with the settings used for calls to listNetworkEndpoints. */
  public PagedCallSettings<
          ListNetworkEndpointsRegionNetworkEndpointGroupsRequest,
          NetworkEndpointGroupsListNetworkEndpoints,
          ListNetworkEndpointsPagedResponse>
      listNetworkEndpointsSettings() {
    return ((RegionNetworkEndpointGroupsStubSettings) getStubSettings())
        .listNetworkEndpointsSettings();
  }

  public static final RegionNetworkEndpointGroupsSettings create(
      RegionNetworkEndpointGroupsStubSettings stub) throws IOException {
    return new RegionNetworkEndpointGroupsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RegionNetworkEndpointGroupsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RegionNetworkEndpointGroupsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RegionNetworkEndpointGroupsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RegionNetworkEndpointGroupsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return RegionNetworkEndpointGroupsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RegionNetworkEndpointGroupsStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RegionNetworkEndpointGroupsStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RegionNetworkEndpointGroupsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RegionNetworkEndpointGroupsSettings. */
  public static class Builder
      extends ClientSettings.Builder<RegionNetworkEndpointGroupsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(RegionNetworkEndpointGroupsStubSettings.newBuilder(clientContext));
    }

    protected Builder(RegionNetworkEndpointGroupsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RegionNetworkEndpointGroupsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(RegionNetworkEndpointGroupsStubSettings.newBuilder());
    }

    public RegionNetworkEndpointGroupsStubSettings.Builder getStubSettingsBuilder() {
      return ((RegionNetworkEndpointGroupsStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to attachNetworkEndpoints. */
    public UnaryCallSettings.Builder<
            AttachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation>
        attachNetworkEndpointsSettings() {
      return getStubSettingsBuilder().attachNetworkEndpointsSettings();
    }

    /** Returns the builder for the settings used for calls to attachNetworkEndpoints. */
    public OperationCallSettings.Builder<
            AttachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation, Operation>
        attachNetworkEndpointsOperationSettings() {
      return getStubSettingsBuilder().attachNetworkEndpointsOperationSettings();
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteRegionNetworkEndpointGroupRequest, Operation>
        deleteSettings() {
      return getStubSettingsBuilder().deleteSettings();
    }

    /** Returns the builder for the settings used for calls to delete. */
    public OperationCallSettings.Builder<
            DeleteRegionNetworkEndpointGroupRequest, Operation, Operation>
        deleteOperationSettings() {
      return getStubSettingsBuilder().deleteOperationSettings();
    }

    /** Returns the builder for the settings used for calls to detachNetworkEndpoints. */
    public UnaryCallSettings.Builder<
            DetachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation>
        detachNetworkEndpointsSettings() {
      return getStubSettingsBuilder().detachNetworkEndpointsSettings();
    }

    /** Returns the builder for the settings used for calls to detachNetworkEndpoints. */
    public OperationCallSettings.Builder<
            DetachNetworkEndpointsRegionNetworkEndpointGroupRequest, Operation, Operation>
        detachNetworkEndpointsOperationSettings() {
      return getStubSettingsBuilder().detachNetworkEndpointsOperationSettings();
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionNetworkEndpointGroupRequest, NetworkEndpointGroup>
        getSettings() {
      return getStubSettingsBuilder().getSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertRegionNetworkEndpointGroupRequest, Operation>
        insertSettings() {
      return getStubSettingsBuilder().insertSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public OperationCallSettings.Builder<
            InsertRegionNetworkEndpointGroupRequest, Operation, Operation>
        insertOperationSettings() {
      return getStubSettingsBuilder().insertOperationSettings();
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionNetworkEndpointGroupsRequest, NetworkEndpointGroupList, ListPagedResponse>
        listSettings() {
      return getStubSettingsBuilder().listSettings();
    }

    /** Returns the builder for the settings used for calls to listNetworkEndpoints. */
    public PagedCallSettings.Builder<
            ListNetworkEndpointsRegionNetworkEndpointGroupsRequest,
            NetworkEndpointGroupsListNetworkEndpoints,
            ListNetworkEndpointsPagedResponse>
        listNetworkEndpointsSettings() {
      return getStubSettingsBuilder().listNetworkEndpointsSettings();
    }

    @Override
    public RegionNetworkEndpointGroupsSettings build() throws IOException {
      return new RegionNetworkEndpointGroupsSettings(this);
    }
  }
}
