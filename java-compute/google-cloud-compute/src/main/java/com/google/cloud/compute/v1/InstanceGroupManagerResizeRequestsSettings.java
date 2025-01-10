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

import static com.google.cloud.compute.v1.InstanceGroupManagerResizeRequestsClient.ListPagedResponse;

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
import com.google.cloud.compute.v1.stub.InstanceGroupManagerResizeRequestsStubSettings;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link InstanceGroupManagerResizeRequestsClient}.
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
 * InstanceGroupManagerResizeRequestsSettings.Builder
 *     instanceGroupManagerResizeRequestsSettingsBuilder =
 *         InstanceGroupManagerResizeRequestsSettings.newBuilder();
 * instanceGroupManagerResizeRequestsSettingsBuilder
 *     .getSettings()
 *     .setRetrySettings(
 *         instanceGroupManagerResizeRequestsSettingsBuilder
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
 * InstanceGroupManagerResizeRequestsSettings instanceGroupManagerResizeRequestsSettings =
 *     instanceGroupManagerResizeRequestsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for cancel:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * InstanceGroupManagerResizeRequestsSettings.Builder
 *     instanceGroupManagerResizeRequestsSettingsBuilder =
 *         InstanceGroupManagerResizeRequestsSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * instanceGroupManagerResizeRequestsSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class InstanceGroupManagerResizeRequestsSettings
    extends ClientSettings<InstanceGroupManagerResizeRequestsSettings> {

  /** Returns the object with the settings used for calls to cancel. */
  public UnaryCallSettings<CancelInstanceGroupManagerResizeRequestRequest, Operation>
      cancelSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings()).cancelSettings();
  }

  /** Returns the object with the settings used for calls to cancel. */
  public OperationCallSettings<CancelInstanceGroupManagerResizeRequestRequest, Operation, Operation>
      cancelOperationSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings())
        .cancelOperationSettings();
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteInstanceGroupManagerResizeRequestRequest, Operation>
      deleteSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings()).deleteSettings();
  }

  /** Returns the object with the settings used for calls to delete. */
  public OperationCallSettings<DeleteInstanceGroupManagerResizeRequestRequest, Operation, Operation>
      deleteOperationSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings())
        .deleteOperationSettings();
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<
          GetInstanceGroupManagerResizeRequestRequest, InstanceGroupManagerResizeRequest>
      getSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings()).getSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertInstanceGroupManagerResizeRequestRequest, Operation>
      insertSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings()).insertSettings();
  }

  /** Returns the object with the settings used for calls to insert. */
  public OperationCallSettings<InsertInstanceGroupManagerResizeRequestRequest, Operation, Operation>
      insertOperationSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings())
        .insertOperationSettings();
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListInstanceGroupManagerResizeRequestsRequest,
          InstanceGroupManagerResizeRequestsListResponse,
          ListPagedResponse>
      listSettings() {
    return ((InstanceGroupManagerResizeRequestsStubSettings) getStubSettings()).listSettings();
  }

  public static final InstanceGroupManagerResizeRequestsSettings create(
      InstanceGroupManagerResizeRequestsStubSettings stub) throws IOException {
    return new InstanceGroupManagerResizeRequestsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstanceGroupManagerResizeRequestsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return InstanceGroupManagerResizeRequestsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return InstanceGroupManagerResizeRequestsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return InstanceGroupManagerResizeRequestsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstanceGroupManagerResizeRequestsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return InstanceGroupManagerResizeRequestsStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return InstanceGroupManagerResizeRequestsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected InstanceGroupManagerResizeRequestsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for InstanceGroupManagerResizeRequestsSettings. */
  public static class Builder
      extends ClientSettings.Builder<InstanceGroupManagerResizeRequestsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(InstanceGroupManagerResizeRequestsStubSettings.newBuilder(clientContext));
    }

    protected Builder(InstanceGroupManagerResizeRequestsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(InstanceGroupManagerResizeRequestsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(InstanceGroupManagerResizeRequestsStubSettings.newBuilder());
    }

    public InstanceGroupManagerResizeRequestsStubSettings.Builder getStubSettingsBuilder() {
      return ((InstanceGroupManagerResizeRequestsStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to cancel. */
    public UnaryCallSettings.Builder<CancelInstanceGroupManagerResizeRequestRequest, Operation>
        cancelSettings() {
      return getStubSettingsBuilder().cancelSettings();
    }

    /** Returns the builder for the settings used for calls to cancel. */
    public OperationCallSettings.Builder<
            CancelInstanceGroupManagerResizeRequestRequest, Operation, Operation>
        cancelOperationSettings() {
      return getStubSettingsBuilder().cancelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteInstanceGroupManagerResizeRequestRequest, Operation>
        deleteSettings() {
      return getStubSettingsBuilder().deleteSettings();
    }

    /** Returns the builder for the settings used for calls to delete. */
    public OperationCallSettings.Builder<
            DeleteInstanceGroupManagerResizeRequestRequest, Operation, Operation>
        deleteOperationSettings() {
      return getStubSettingsBuilder().deleteOperationSettings();
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<
            GetInstanceGroupManagerResizeRequestRequest, InstanceGroupManagerResizeRequest>
        getSettings() {
      return getStubSettingsBuilder().getSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertInstanceGroupManagerResizeRequestRequest, Operation>
        insertSettings() {
      return getStubSettingsBuilder().insertSettings();
    }

    /** Returns the builder for the settings used for calls to insert. */
    public OperationCallSettings.Builder<
            InsertInstanceGroupManagerResizeRequestRequest, Operation, Operation>
        insertOperationSettings() {
      return getStubSettingsBuilder().insertOperationSettings();
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListInstanceGroupManagerResizeRequestsRequest,
            InstanceGroupManagerResizeRequestsListResponse,
            ListPagedResponse>
        listSettings() {
      return getStubSettingsBuilder().listSettings();
    }

    @Override
    public InstanceGroupManagerResizeRequestsSettings build() throws IOException {
      return new InstanceGroupManagerResizeRequestsSettings(this);
    }
  }
}
