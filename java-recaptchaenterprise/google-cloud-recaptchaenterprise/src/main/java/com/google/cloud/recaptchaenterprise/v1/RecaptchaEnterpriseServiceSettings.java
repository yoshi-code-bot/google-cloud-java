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

package com.google.cloud.recaptchaenterprise.v1;

import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListFirewallPoliciesPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListIpOverridesPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListKeysPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListRelatedAccountGroupMembershipsPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListRelatedAccountGroupsPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.SearchRelatedAccountGroupMembershipsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.recaptchaenterprise.v1.stub.RecaptchaEnterpriseServiceStubSettings;
import com.google.protobuf.Empty;
import com.google.recaptchaenterprise.v1.AddIpOverrideRequest;
import com.google.recaptchaenterprise.v1.AddIpOverrideResponse;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentResponse;
import com.google.recaptchaenterprise.v1.Assessment;
import com.google.recaptchaenterprise.v1.CreateAssessmentRequest;
import com.google.recaptchaenterprise.v1.CreateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.CreateKeyRequest;
import com.google.recaptchaenterprise.v1.DeleteFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.DeleteKeyRequest;
import com.google.recaptchaenterprise.v1.FirewallPolicy;
import com.google.recaptchaenterprise.v1.GetFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.GetKeyRequest;
import com.google.recaptchaenterprise.v1.GetMetricsRequest;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.ListIpOverridesRequest;
import com.google.recaptchaenterprise.v1.ListIpOverridesResponse;
import com.google.recaptchaenterprise.v1.ListKeysRequest;
import com.google.recaptchaenterprise.v1.ListKeysResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse;
import com.google.recaptchaenterprise.v1.Metrics;
import com.google.recaptchaenterprise.v1.MigrateKeyRequest;
import com.google.recaptchaenterprise.v1.RemoveIpOverrideRequest;
import com.google.recaptchaenterprise.v1.RemoveIpOverrideResponse;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyRequest;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.UpdateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.UpdateKeyRequest;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RecaptchaEnterpriseServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (recaptchaenterprise.googleapis.com) and default port (443) are
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
 * of createAssessment:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RecaptchaEnterpriseServiceSettings.Builder recaptchaEnterpriseServiceSettingsBuilder =
 *     RecaptchaEnterpriseServiceSettings.newBuilder();
 * recaptchaEnterpriseServiceSettingsBuilder
 *     .createAssessmentSettings()
 *     .setRetrySettings(
 *         recaptchaEnterpriseServiceSettingsBuilder
 *             .createAssessmentSettings()
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
 * RecaptchaEnterpriseServiceSettings recaptchaEnterpriseServiceSettings =
 *     recaptchaEnterpriseServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class RecaptchaEnterpriseServiceSettings
    extends ClientSettings<RecaptchaEnterpriseServiceSettings> {

  /** Returns the object with the settings used for calls to createAssessment. */
  public UnaryCallSettings<CreateAssessmentRequest, Assessment> createAssessmentSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).createAssessmentSettings();
  }

  /** Returns the object with the settings used for calls to annotateAssessment. */
  public UnaryCallSettings<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
      annotateAssessmentSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .annotateAssessmentSettings();
  }

  /** Returns the object with the settings used for calls to createKey. */
  public UnaryCallSettings<CreateKeyRequest, Key> createKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).createKeySettings();
  }

  /** Returns the object with the settings used for calls to listKeys. */
  public PagedCallSettings<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
      listKeysSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).listKeysSettings();
  }

  /** Returns the object with the settings used for calls to retrieveLegacySecretKey. */
  public UnaryCallSettings<RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
      retrieveLegacySecretKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .retrieveLegacySecretKeySettings();
  }

  /** Returns the object with the settings used for calls to getKey. */
  public UnaryCallSettings<GetKeyRequest, Key> getKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).getKeySettings();
  }

  /** Returns the object with the settings used for calls to updateKey. */
  public UnaryCallSettings<UpdateKeyRequest, Key> updateKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).updateKeySettings();
  }

  /** Returns the object with the settings used for calls to deleteKey. */
  public UnaryCallSettings<DeleteKeyRequest, Empty> deleteKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).deleteKeySettings();
  }

  /** Returns the object with the settings used for calls to migrateKey. */
  public UnaryCallSettings<MigrateKeyRequest, Key> migrateKeySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).migrateKeySettings();
  }

  /** Returns the object with the settings used for calls to addIpOverride. */
  public UnaryCallSettings<AddIpOverrideRequest, AddIpOverrideResponse> addIpOverrideSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).addIpOverrideSettings();
  }

  /** Returns the object with the settings used for calls to removeIpOverride. */
  public UnaryCallSettings<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
      removeIpOverrideSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).removeIpOverrideSettings();
  }

  /** Returns the object with the settings used for calls to listIpOverrides. */
  public PagedCallSettings<
          ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
      listIpOverridesSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).listIpOverridesSettings();
  }

  /** Returns the object with the settings used for calls to getMetrics. */
  public UnaryCallSettings<GetMetricsRequest, Metrics> getMetricsSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).getMetricsSettings();
  }

  /** Returns the object with the settings used for calls to createFirewallPolicy. */
  public UnaryCallSettings<CreateFirewallPolicyRequest, FirewallPolicy>
      createFirewallPolicySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .createFirewallPolicySettings();
  }

  /** Returns the object with the settings used for calls to listFirewallPolicies. */
  public PagedCallSettings<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          ListFirewallPoliciesPagedResponse>
      listFirewallPoliciesSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .listFirewallPoliciesSettings();
  }

  /** Returns the object with the settings used for calls to getFirewallPolicy. */
  public UnaryCallSettings<GetFirewallPolicyRequest, FirewallPolicy> getFirewallPolicySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings()).getFirewallPolicySettings();
  }

  /** Returns the object with the settings used for calls to updateFirewallPolicy. */
  public UnaryCallSettings<UpdateFirewallPolicyRequest, FirewallPolicy>
      updateFirewallPolicySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .updateFirewallPolicySettings();
  }

  /** Returns the object with the settings used for calls to deleteFirewallPolicy. */
  public UnaryCallSettings<DeleteFirewallPolicyRequest, Empty> deleteFirewallPolicySettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .deleteFirewallPolicySettings();
  }

  /** Returns the object with the settings used for calls to reorderFirewallPolicies. */
  public UnaryCallSettings<ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
      reorderFirewallPoliciesSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .reorderFirewallPoliciesSettings();
  }

  /** Returns the object with the settings used for calls to listRelatedAccountGroups. */
  public PagedCallSettings<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          ListRelatedAccountGroupsPagedResponse>
      listRelatedAccountGroupsSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .listRelatedAccountGroupsSettings();
  }

  /** Returns the object with the settings used for calls to listRelatedAccountGroupMemberships. */
  public PagedCallSettings<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          ListRelatedAccountGroupMembershipsPagedResponse>
      listRelatedAccountGroupMembershipsSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .listRelatedAccountGroupMembershipsSettings();
  }

  /**
   * Returns the object with the settings used for calls to searchRelatedAccountGroupMemberships.
   */
  public PagedCallSettings<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          SearchRelatedAccountGroupMembershipsPagedResponse>
      searchRelatedAccountGroupMembershipsSettings() {
    return ((RecaptchaEnterpriseServiceStubSettings) getStubSettings())
        .searchRelatedAccountGroupMembershipsSettings();
  }

  public static final RecaptchaEnterpriseServiceSettings create(
      RecaptchaEnterpriseServiceStubSettings stub) throws IOException {
    return new RecaptchaEnterpriseServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return RecaptchaEnterpriseServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return RecaptchaEnterpriseServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return RecaptchaEnterpriseServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return RecaptchaEnterpriseServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return RecaptchaEnterpriseServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return RecaptchaEnterpriseServiceStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return RecaptchaEnterpriseServiceStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected RecaptchaEnterpriseServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for RecaptchaEnterpriseServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<RecaptchaEnterpriseServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(RecaptchaEnterpriseServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(RecaptchaEnterpriseServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(RecaptchaEnterpriseServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(RecaptchaEnterpriseServiceStubSettings.newBuilder());
    }

    public RecaptchaEnterpriseServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((RecaptchaEnterpriseServiceStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to createAssessment. */
    public UnaryCallSettings.Builder<CreateAssessmentRequest, Assessment>
        createAssessmentSettings() {
      return getStubSettingsBuilder().createAssessmentSettings();
    }

    /** Returns the builder for the settings used for calls to annotateAssessment. */
    public UnaryCallSettings.Builder<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
        annotateAssessmentSettings() {
      return getStubSettingsBuilder().annotateAssessmentSettings();
    }

    /** Returns the builder for the settings used for calls to createKey. */
    public UnaryCallSettings.Builder<CreateKeyRequest, Key> createKeySettings() {
      return getStubSettingsBuilder().createKeySettings();
    }

    /** Returns the builder for the settings used for calls to listKeys. */
    public PagedCallSettings.Builder<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
        listKeysSettings() {
      return getStubSettingsBuilder().listKeysSettings();
    }

    /** Returns the builder for the settings used for calls to retrieveLegacySecretKey. */
    public UnaryCallSettings.Builder<
            RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
        retrieveLegacySecretKeySettings() {
      return getStubSettingsBuilder().retrieveLegacySecretKeySettings();
    }

    /** Returns the builder for the settings used for calls to getKey. */
    public UnaryCallSettings.Builder<GetKeyRequest, Key> getKeySettings() {
      return getStubSettingsBuilder().getKeySettings();
    }

    /** Returns the builder for the settings used for calls to updateKey. */
    public UnaryCallSettings.Builder<UpdateKeyRequest, Key> updateKeySettings() {
      return getStubSettingsBuilder().updateKeySettings();
    }

    /** Returns the builder for the settings used for calls to deleteKey. */
    public UnaryCallSettings.Builder<DeleteKeyRequest, Empty> deleteKeySettings() {
      return getStubSettingsBuilder().deleteKeySettings();
    }

    /** Returns the builder for the settings used for calls to migrateKey. */
    public UnaryCallSettings.Builder<MigrateKeyRequest, Key> migrateKeySettings() {
      return getStubSettingsBuilder().migrateKeySettings();
    }

    /** Returns the builder for the settings used for calls to addIpOverride. */
    public UnaryCallSettings.Builder<AddIpOverrideRequest, AddIpOverrideResponse>
        addIpOverrideSettings() {
      return getStubSettingsBuilder().addIpOverrideSettings();
    }

    /** Returns the builder for the settings used for calls to removeIpOverride. */
    public UnaryCallSettings.Builder<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
        removeIpOverrideSettings() {
      return getStubSettingsBuilder().removeIpOverrideSettings();
    }

    /** Returns the builder for the settings used for calls to listIpOverrides. */
    public PagedCallSettings.Builder<
            ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
        listIpOverridesSettings() {
      return getStubSettingsBuilder().listIpOverridesSettings();
    }

    /** Returns the builder for the settings used for calls to getMetrics. */
    public UnaryCallSettings.Builder<GetMetricsRequest, Metrics> getMetricsSettings() {
      return getStubSettingsBuilder().getMetricsSettings();
    }

    /** Returns the builder for the settings used for calls to createFirewallPolicy. */
    public UnaryCallSettings.Builder<CreateFirewallPolicyRequest, FirewallPolicy>
        createFirewallPolicySettings() {
      return getStubSettingsBuilder().createFirewallPolicySettings();
    }

    /** Returns the builder for the settings used for calls to listFirewallPolicies. */
    public PagedCallSettings.Builder<
            ListFirewallPoliciesRequest,
            ListFirewallPoliciesResponse,
            ListFirewallPoliciesPagedResponse>
        listFirewallPoliciesSettings() {
      return getStubSettingsBuilder().listFirewallPoliciesSettings();
    }

    /** Returns the builder for the settings used for calls to getFirewallPolicy. */
    public UnaryCallSettings.Builder<GetFirewallPolicyRequest, FirewallPolicy>
        getFirewallPolicySettings() {
      return getStubSettingsBuilder().getFirewallPolicySettings();
    }

    /** Returns the builder for the settings used for calls to updateFirewallPolicy. */
    public UnaryCallSettings.Builder<UpdateFirewallPolicyRequest, FirewallPolicy>
        updateFirewallPolicySettings() {
      return getStubSettingsBuilder().updateFirewallPolicySettings();
    }

    /** Returns the builder for the settings used for calls to deleteFirewallPolicy. */
    public UnaryCallSettings.Builder<DeleteFirewallPolicyRequest, Empty>
        deleteFirewallPolicySettings() {
      return getStubSettingsBuilder().deleteFirewallPolicySettings();
    }

    /** Returns the builder for the settings used for calls to reorderFirewallPolicies. */
    public UnaryCallSettings.Builder<
            ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
        reorderFirewallPoliciesSettings() {
      return getStubSettingsBuilder().reorderFirewallPoliciesSettings();
    }

    /** Returns the builder for the settings used for calls to listRelatedAccountGroups. */
    public PagedCallSettings.Builder<
            ListRelatedAccountGroupsRequest,
            ListRelatedAccountGroupsResponse,
            ListRelatedAccountGroupsPagedResponse>
        listRelatedAccountGroupsSettings() {
      return getStubSettingsBuilder().listRelatedAccountGroupsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to listRelatedAccountGroupMemberships.
     */
    public PagedCallSettings.Builder<
            ListRelatedAccountGroupMembershipsRequest,
            ListRelatedAccountGroupMembershipsResponse,
            ListRelatedAccountGroupMembershipsPagedResponse>
        listRelatedAccountGroupMembershipsSettings() {
      return getStubSettingsBuilder().listRelatedAccountGroupMembershipsSettings();
    }

    /**
     * Returns the builder for the settings used for calls to searchRelatedAccountGroupMemberships.
     */
    public PagedCallSettings.Builder<
            SearchRelatedAccountGroupMembershipsRequest,
            SearchRelatedAccountGroupMembershipsResponse,
            SearchRelatedAccountGroupMembershipsPagedResponse>
        searchRelatedAccountGroupMembershipsSettings() {
      return getStubSettingsBuilder().searchRelatedAccountGroupMembershipsSettings();
    }

    @Override
    public RecaptchaEnterpriseServiceSettings build() throws IOException {
      return new RecaptchaEnterpriseServiceSettings(this);
    }
  }
}
