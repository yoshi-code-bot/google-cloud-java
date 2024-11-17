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

package com.google.cloud.discoveryengine.v1alpha;

import static com.google.cloud.discoveryengine.v1alpha.SchemaServiceClient.ListSchemasPagedResponse;

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
import com.google.cloud.discoveryengine.v1alpha.stub.SchemaServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link SchemaServiceClient}.
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
 * of getSchema:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SchemaServiceSettings.Builder schemaServiceSettingsBuilder = SchemaServiceSettings.newBuilder();
 * schemaServiceSettingsBuilder
 *     .getSchemaSettings()
 *     .setRetrySettings(
 *         schemaServiceSettingsBuilder
 *             .getSchemaSettings()
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
 * SchemaServiceSettings schemaServiceSettings = schemaServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createSchema:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SchemaServiceSettings.Builder schemaServiceSettingsBuilder = SchemaServiceSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * schemaServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SchemaServiceSettings extends ClientSettings<SchemaServiceSettings> {

  /** Returns the object with the settings used for calls to getSchema. */
  public UnaryCallSettings<GetSchemaRequest, Schema> getSchemaSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).getSchemaSettings();
  }

  /** Returns the object with the settings used for calls to listSchemas. */
  public PagedCallSettings<ListSchemasRequest, ListSchemasResponse, ListSchemasPagedResponse>
      listSchemasSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).listSchemasSettings();
  }

  /** Returns the object with the settings used for calls to createSchema. */
  public UnaryCallSettings<CreateSchemaRequest, Operation> createSchemaSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).createSchemaSettings();
  }

  /** Returns the object with the settings used for calls to createSchema. */
  public OperationCallSettings<CreateSchemaRequest, Schema, CreateSchemaMetadata>
      createSchemaOperationSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).createSchemaOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateSchema. */
  public UnaryCallSettings<UpdateSchemaRequest, Operation> updateSchemaSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).updateSchemaSettings();
  }

  /** Returns the object with the settings used for calls to updateSchema. */
  public OperationCallSettings<UpdateSchemaRequest, Schema, UpdateSchemaMetadata>
      updateSchemaOperationSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).updateSchemaOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteSchema. */
  public UnaryCallSettings<DeleteSchemaRequest, Operation> deleteSchemaSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).deleteSchemaSettings();
  }

  /** Returns the object with the settings used for calls to deleteSchema. */
  public OperationCallSettings<DeleteSchemaRequest, Empty, DeleteSchemaMetadata>
      deleteSchemaOperationSettings() {
    return ((SchemaServiceStubSettings) getStubSettings()).deleteSchemaOperationSettings();
  }

  public static final SchemaServiceSettings create(SchemaServiceStubSettings stub)
      throws IOException {
    return new SchemaServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return SchemaServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return SchemaServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return SchemaServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return SchemaServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return SchemaServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return SchemaServiceStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return SchemaServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SchemaServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected SchemaServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for SchemaServiceSettings. */
  public static class Builder extends ClientSettings.Builder<SchemaServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(SchemaServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(SchemaServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(SchemaServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(SchemaServiceStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(SchemaServiceStubSettings.newHttpJsonBuilder());
    }

    public SchemaServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((SchemaServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to getSchema. */
    public UnaryCallSettings.Builder<GetSchemaRequest, Schema> getSchemaSettings() {
      return getStubSettingsBuilder().getSchemaSettings();
    }

    /** Returns the builder for the settings used for calls to listSchemas. */
    public PagedCallSettings.Builder<
            ListSchemasRequest, ListSchemasResponse, ListSchemasPagedResponse>
        listSchemasSettings() {
      return getStubSettingsBuilder().listSchemasSettings();
    }

    /** Returns the builder for the settings used for calls to createSchema. */
    public UnaryCallSettings.Builder<CreateSchemaRequest, Operation> createSchemaSettings() {
      return getStubSettingsBuilder().createSchemaSettings();
    }

    /** Returns the builder for the settings used for calls to createSchema. */
    public OperationCallSettings.Builder<CreateSchemaRequest, Schema, CreateSchemaMetadata>
        createSchemaOperationSettings() {
      return getStubSettingsBuilder().createSchemaOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateSchema. */
    public UnaryCallSettings.Builder<UpdateSchemaRequest, Operation> updateSchemaSettings() {
      return getStubSettingsBuilder().updateSchemaSettings();
    }

    /** Returns the builder for the settings used for calls to updateSchema. */
    public OperationCallSettings.Builder<UpdateSchemaRequest, Schema, UpdateSchemaMetadata>
        updateSchemaOperationSettings() {
      return getStubSettingsBuilder().updateSchemaOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSchema. */
    public UnaryCallSettings.Builder<DeleteSchemaRequest, Operation> deleteSchemaSettings() {
      return getStubSettingsBuilder().deleteSchemaSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSchema. */
    public OperationCallSettings.Builder<DeleteSchemaRequest, Empty, DeleteSchemaMetadata>
        deleteSchemaOperationSettings() {
      return getStubSettingsBuilder().deleteSchemaOperationSettings();
    }

    @Override
    public SchemaServiceSettings build() throws IOException {
      return new SchemaServiceSettings(this);
    }
  }
}
