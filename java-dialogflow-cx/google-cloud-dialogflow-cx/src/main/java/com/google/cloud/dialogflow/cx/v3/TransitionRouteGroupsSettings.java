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

package com.google.cloud.dialogflow.cx.v3;

import static com.google.cloud.dialogflow.cx.v3.TransitionRouteGroupsClient.ListLocationsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3.TransitionRouteGroupsClient.ListTransitionRouteGroupsPagedResponse;

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
import com.google.cloud.dialogflow.cx.v3.stub.TransitionRouteGroupsStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link TransitionRouteGroupsClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dialogflow.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getTransitionRouteGroup:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TransitionRouteGroupsSettings.Builder transitionRouteGroupsSettingsBuilder =
 *     TransitionRouteGroupsSettings.newBuilder();
 * transitionRouteGroupsSettingsBuilder
 *     .getTransitionRouteGroupSettings()
 *     .setRetrySettings(
 *         transitionRouteGroupsSettingsBuilder
 *             .getTransitionRouteGroupSettings()
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
 * TransitionRouteGroupsSettings transitionRouteGroupsSettings =
 *     transitionRouteGroupsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class TransitionRouteGroupsSettings extends ClientSettings<TransitionRouteGroupsSettings> {

  /** Returns the object with the settings used for calls to listTransitionRouteGroups. */
  public PagedCallSettings<
          ListTransitionRouteGroupsRequest,
          ListTransitionRouteGroupsResponse,
          ListTransitionRouteGroupsPagedResponse>
      listTransitionRouteGroupsSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings())
        .listTransitionRouteGroupsSettings();
  }

  /** Returns the object with the settings used for calls to getTransitionRouteGroup. */
  public UnaryCallSettings<GetTransitionRouteGroupRequest, TransitionRouteGroup>
      getTransitionRouteGroupSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings())
        .getTransitionRouteGroupSettings();
  }

  /** Returns the object with the settings used for calls to createTransitionRouteGroup. */
  public UnaryCallSettings<CreateTransitionRouteGroupRequest, TransitionRouteGroup>
      createTransitionRouteGroupSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings())
        .createTransitionRouteGroupSettings();
  }

  /** Returns the object with the settings used for calls to updateTransitionRouteGroup. */
  public UnaryCallSettings<UpdateTransitionRouteGroupRequest, TransitionRouteGroup>
      updateTransitionRouteGroupSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings())
        .updateTransitionRouteGroupSettings();
  }

  /** Returns the object with the settings used for calls to deleteTransitionRouteGroup. */
  public UnaryCallSettings<DeleteTransitionRouteGroupRequest, Empty>
      deleteTransitionRouteGroupSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings())
        .deleteTransitionRouteGroupSettings();
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings()).listLocationsSettings();
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return ((TransitionRouteGroupsStubSettings) getStubSettings()).getLocationSettings();
  }

  public static final TransitionRouteGroupsSettings create(TransitionRouteGroupsStubSettings stub)
      throws IOException {
    return new TransitionRouteGroupsSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return TransitionRouteGroupsStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return TransitionRouteGroupsStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return TransitionRouteGroupsStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return TransitionRouteGroupsStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return TransitionRouteGroupsStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return TransitionRouteGroupsStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return TransitionRouteGroupsStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TransitionRouteGroupsStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected TransitionRouteGroupsSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for TransitionRouteGroupsSettings. */
  public static class Builder
      extends ClientSettings.Builder<TransitionRouteGroupsSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(TransitionRouteGroupsStubSettings.newBuilder(clientContext));
    }

    protected Builder(TransitionRouteGroupsSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(TransitionRouteGroupsStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(TransitionRouteGroupsStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(TransitionRouteGroupsStubSettings.newHttpJsonBuilder());
    }

    public TransitionRouteGroupsStubSettings.Builder getStubSettingsBuilder() {
      return ((TransitionRouteGroupsStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to listTransitionRouteGroups. */
    public PagedCallSettings.Builder<
            ListTransitionRouteGroupsRequest,
            ListTransitionRouteGroupsResponse,
            ListTransitionRouteGroupsPagedResponse>
        listTransitionRouteGroupsSettings() {
      return getStubSettingsBuilder().listTransitionRouteGroupsSettings();
    }

    /** Returns the builder for the settings used for calls to getTransitionRouteGroup. */
    public UnaryCallSettings.Builder<GetTransitionRouteGroupRequest, TransitionRouteGroup>
        getTransitionRouteGroupSettings() {
      return getStubSettingsBuilder().getTransitionRouteGroupSettings();
    }

    /** Returns the builder for the settings used for calls to createTransitionRouteGroup. */
    public UnaryCallSettings.Builder<CreateTransitionRouteGroupRequest, TransitionRouteGroup>
        createTransitionRouteGroupSettings() {
      return getStubSettingsBuilder().createTransitionRouteGroupSettings();
    }

    /** Returns the builder for the settings used for calls to updateTransitionRouteGroup. */
    public UnaryCallSettings.Builder<UpdateTransitionRouteGroupRequest, TransitionRouteGroup>
        updateTransitionRouteGroupSettings() {
      return getStubSettingsBuilder().updateTransitionRouteGroupSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTransitionRouteGroup. */
    public UnaryCallSettings.Builder<DeleteTransitionRouteGroupRequest, Empty>
        deleteTransitionRouteGroupSettings() {
      return getStubSettingsBuilder().deleteTransitionRouteGroupSettings();
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
    public TransitionRouteGroupsSettings build() throws IOException {
      return new TransitionRouteGroupsSettings(this);
    }
  }
}
