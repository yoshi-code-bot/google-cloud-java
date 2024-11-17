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

package com.google.cloud.discoveryengine.v1beta;

import static com.google.cloud.discoveryengine.v1beta.DataStoreServiceClient.ListDataStoresPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.discoveryengine.v1beta.stub.DataStoreServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DataStoreServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (discoveryengine.googleapis.com) and default port (443) are
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
 * of getDataStore:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataStoreServiceSettings.Builder dataStoreServiceSettingsBuilder =
 *     DataStoreServiceSettings.newBuilder();
 * dataStoreServiceSettingsBuilder
 *     .getDataStoreSettings()
 *     .setRetrySettings(
 *         dataStoreServiceSettingsBuilder
 *             .getDataStoreSettings()
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
 * DataStoreServiceSettings dataStoreServiceSettings = dataStoreServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createDataStore:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataStoreServiceSettings.Builder dataStoreServiceSettingsBuilder =
 *     DataStoreServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * dataStoreServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class DataStoreServiceSettings extends ClientSettings<DataStoreServiceSettings> {

  /** Returns the object with the settings used for calls to createDataStore. */
  public UnaryCallSettings<CreateDataStoreRequest, Operation> createDataStoreSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).createDataStoreSettings();
  }

  /** Returns the object with the settings used for calls to createDataStore. */
  public OperationCallSettings<CreateDataStoreRequest, DataStore, CreateDataStoreMetadata>
      createDataStoreOperationSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).createDataStoreOperationSettings();
  }

  /** Returns the object with the settings used for calls to getDataStore. */
  public UnaryCallSettings<GetDataStoreRequest, DataStore> getDataStoreSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).getDataStoreSettings();
  }

  /** Returns the object with the settings used for calls to listDataStores. */
  public PagedCallSettings<
          ListDataStoresRequest, ListDataStoresResponse, ListDataStoresPagedResponse>
      listDataStoresSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).listDataStoresSettings();
  }

  /** Returns the object with the settings used for calls to deleteDataStore. */
  public UnaryCallSettings<DeleteDataStoreRequest, Operation> deleteDataStoreSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).deleteDataStoreSettings();
  }

  /** Returns the object with the settings used for calls to deleteDataStore. */
  public OperationCallSettings<DeleteDataStoreRequest, Empty, DeleteDataStoreMetadata>
      deleteDataStoreOperationSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).deleteDataStoreOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateDataStore. */
  public UnaryCallSettings<UpdateDataStoreRequest, DataStore> updateDataStoreSettings() {
    return ((DataStoreServiceStubSettings) getStubSettings()).updateDataStoreSettings();
  }

  public static final DataStoreServiceSettings create(DataStoreServiceStubSettings stub)
      throws IOException {
    return new DataStoreServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return DataStoreServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return DataStoreServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DataStoreServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return DataStoreServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return DataStoreServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return DataStoreServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return DataStoreServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DataStoreServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected DataStoreServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for DataStoreServiceSettings. */
  public static class Builder extends ClientSettings.Builder<DataStoreServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(DataStoreServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(DataStoreServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(DataStoreServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(DataStoreServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(DataStoreServiceStubSettings.newHttpJsonBuilder());
    }

    public DataStoreServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((DataStoreServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createDataStore. */
    public UnaryCallSettings.Builder<CreateDataStoreRequest, Operation> createDataStoreSettings() {
      return getStubSettingsBuilder().createDataStoreSettings();
    }

    /** Returns the builder for the settings used for calls to createDataStore. */
    public OperationCallSettings.Builder<CreateDataStoreRequest, DataStore, CreateDataStoreMetadata>
        createDataStoreOperationSettings() {
      return getStubSettingsBuilder().createDataStoreOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getDataStore. */
    public UnaryCallSettings.Builder<GetDataStoreRequest, DataStore> getDataStoreSettings() {
      return getStubSettingsBuilder().getDataStoreSettings();
    }

    /** Returns the builder for the settings used for calls to listDataStores. */
    public PagedCallSettings.Builder<
            ListDataStoresRequest, ListDataStoresResponse, ListDataStoresPagedResponse>
        listDataStoresSettings() {
      return getStubSettingsBuilder().listDataStoresSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataStore. */
    public UnaryCallSettings.Builder<DeleteDataStoreRequest, Operation> deleteDataStoreSettings() {
      return getStubSettingsBuilder().deleteDataStoreSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDataStore. */
    public OperationCallSettings.Builder<DeleteDataStoreRequest, Empty, DeleteDataStoreMetadata>
        deleteDataStoreOperationSettings() {
      return getStubSettingsBuilder().deleteDataStoreOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateDataStore. */
    public UnaryCallSettings.Builder<UpdateDataStoreRequest, DataStore> updateDataStoreSettings() {
      return getStubSettingsBuilder().updateDataStoreSettings();
    }

    @Override
    public DataStoreServiceSettings build() throws IOException {
      return new DataStoreServiceSettings(this);
    }
  }
}
