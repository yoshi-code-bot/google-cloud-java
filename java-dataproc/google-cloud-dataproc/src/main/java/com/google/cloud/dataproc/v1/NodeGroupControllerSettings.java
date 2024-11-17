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

package com.google.cloud.dataproc.v1;

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
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dataproc.v1.stub.NodeGroupControllerStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link NodeGroupControllerClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dataproc.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of getNodeGroup:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * NodeGroupControllerSettings.Builder nodeGroupControllerSettingsBuilder =
 *     NodeGroupControllerSettings.newBuilder();
 * nodeGroupControllerSettingsBuilder
 *     .getNodeGroupSettings()
 *     .setRetrySettings(
 *         nodeGroupControllerSettingsBuilder
 *             .getNodeGroupSettings()
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
 * NodeGroupControllerSettings nodeGroupControllerSettings =
 *     nodeGroupControllerSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createNodeGroup:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * NodeGroupControllerSettings.Builder nodeGroupControllerSettingsBuilder =
 *     NodeGroupControllerSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * nodeGroupControllerSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class NodeGroupControllerSettings extends ClientSettings<NodeGroupControllerSettings> {

  /** Returns the object with the settings used for calls to createNodeGroup. */
  public UnaryCallSettings<CreateNodeGroupRequest, Operation> createNodeGroupSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).createNodeGroupSettings();
  }

  /** Returns the object with the settings used for calls to createNodeGroup. */
  public OperationCallSettings<CreateNodeGroupRequest, NodeGroup, NodeGroupOperationMetadata>
      createNodeGroupOperationSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).createNodeGroupOperationSettings();
  }

  /** Returns the object with the settings used for calls to resizeNodeGroup. */
  public UnaryCallSettings<ResizeNodeGroupRequest, Operation> resizeNodeGroupSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).resizeNodeGroupSettings();
  }

  /** Returns the object with the settings used for calls to resizeNodeGroup. */
  public OperationCallSettings<ResizeNodeGroupRequest, NodeGroup, NodeGroupOperationMetadata>
      resizeNodeGroupOperationSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).resizeNodeGroupOperationSettings();
  }

  /** Returns the object with the settings used for calls to getNodeGroup. */
  public UnaryCallSettings<GetNodeGroupRequest, NodeGroup> getNodeGroupSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).getNodeGroupSettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((NodeGroupControllerStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  public static final NodeGroupControllerSettings create(NodeGroupControllerStubSettings stub)
      throws IOException {
    return new NodeGroupControllerSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return NodeGroupControllerStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return NodeGroupControllerStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return NodeGroupControllerStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return NodeGroupControllerStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return NodeGroupControllerStubSettings.defaultGrpcTransportProviderBuilder();
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return NodeGroupControllerStubSettings.defaultHttpJsonTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return NodeGroupControllerStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return NodeGroupControllerStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected NodeGroupControllerSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for NodeGroupControllerSettings. */
  public static class Builder extends ClientSettings.Builder<NodeGroupControllerSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(NodeGroupControllerStubSettings.newBuilder(clientContext));
    }

    protected Builder(NodeGroupControllerSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(NodeGroupControllerStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(NodeGroupControllerStubSettings.newBuilder());
    }

    private static Builder createHttpJsonDefault() {
      return new Builder(NodeGroupControllerStubSettings.newHttpJsonBuilder());
    }

    public NodeGroupControllerStubSettings.Builder getStubSettingsBuilder() {
      return ((NodeGroupControllerStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createNodeGroup. */
    public UnaryCallSettings.Builder<CreateNodeGroupRequest, Operation> createNodeGroupSettings() {
      return getStubSettingsBuilder().createNodeGroupSettings();
    }

    /** Returns the builder for the settings used for calls to createNodeGroup. */
    public OperationCallSettings.Builder<
            CreateNodeGroupRequest, NodeGroup, NodeGroupOperationMetadata>
        createNodeGroupOperationSettings() {
      return getStubSettingsBuilder().createNodeGroupOperationSettings();
    }

    /** Returns the builder for the settings used for calls to resizeNodeGroup. */
    public UnaryCallSettings.Builder<ResizeNodeGroupRequest, Operation> resizeNodeGroupSettings() {
      return getStubSettingsBuilder().resizeNodeGroupSettings();
    }

    /** Returns the builder for the settings used for calls to resizeNodeGroup. */
    public OperationCallSettings.Builder<
            ResizeNodeGroupRequest, NodeGroup, NodeGroupOperationMetadata>
        resizeNodeGroupOperationSettings() {
      return getStubSettingsBuilder().resizeNodeGroupOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getNodeGroup. */
    public UnaryCallSettings.Builder<GetNodeGroupRequest, NodeGroup> getNodeGroupSettings() {
      return getStubSettingsBuilder().getNodeGroupSettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    @Override
    public NodeGroupControllerSettings build() throws IOException {
      return new NodeGroupControllerSettings(this);
    }
  }
}
