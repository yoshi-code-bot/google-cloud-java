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

package com.google.cloud.discoveryengine.v1beta.stub;

import com.google.api.core.ApiFunction;
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
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryRequest;
import com.google.cloud.discoveryengine.v1beta.AdvancedCompleteQueryResponse;
import com.google.cloud.discoveryengine.v1beta.CompleteQueryRequest;
import com.google.cloud.discoveryengine.v1beta.CompleteQueryResponse;
import com.google.cloud.discoveryengine.v1beta.ImportCompletionSuggestionsMetadata;
import com.google.cloud.discoveryengine.v1beta.ImportCompletionSuggestionsRequest;
import com.google.cloud.discoveryengine.v1beta.ImportCompletionSuggestionsResponse;
import com.google.cloud.discoveryengine.v1beta.ImportSuggestionDenyListEntriesMetadata;
import com.google.cloud.discoveryengine.v1beta.ImportSuggestionDenyListEntriesRequest;
import com.google.cloud.discoveryengine.v1beta.ImportSuggestionDenyListEntriesResponse;
import com.google.cloud.discoveryengine.v1beta.PurgeCompletionSuggestionsMetadata;
import com.google.cloud.discoveryengine.v1beta.PurgeCompletionSuggestionsRequest;
import com.google.cloud.discoveryengine.v1beta.PurgeCompletionSuggestionsResponse;
import com.google.cloud.discoveryengine.v1beta.PurgeSuggestionDenyListEntriesMetadata;
import com.google.cloud.discoveryengine.v1beta.PurgeSuggestionDenyListEntriesRequest;
import com.google.cloud.discoveryengine.v1beta.PurgeSuggestionDenyListEntriesResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link CompletionServiceStub}.
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
 * of completeQuery:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CompletionServiceStubSettings.Builder completionServiceSettingsBuilder =
 *     CompletionServiceStubSettings.newBuilder();
 * completionServiceSettingsBuilder
 *     .completeQuerySettings()
 *     .setRetrySettings(
 *         completionServiceSettingsBuilder
 *             .completeQuerySettings()
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
 * CompletionServiceStubSettings completionServiceSettings =
 *     completionServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for importSuggestionDenyListEntries:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CompletionServiceStubSettings.Builder completionServiceSettingsBuilder =
 *     CompletionServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * completionServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class CompletionServiceStubSettings extends StubSettings<CompletionServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CompleteQueryRequest, CompleteQueryResponse>
      completeQuerySettings;
  private final UnaryCallSettings<AdvancedCompleteQueryRequest, AdvancedCompleteQueryResponse>
      advancedCompleteQuerySettings;
  private final UnaryCallSettings<ImportSuggestionDenyListEntriesRequest, Operation>
      importSuggestionDenyListEntriesSettings;
  private final OperationCallSettings<
          ImportSuggestionDenyListEntriesRequest,
          ImportSuggestionDenyListEntriesResponse,
          ImportSuggestionDenyListEntriesMetadata>
      importSuggestionDenyListEntriesOperationSettings;
  private final UnaryCallSettings<PurgeSuggestionDenyListEntriesRequest, Operation>
      purgeSuggestionDenyListEntriesSettings;
  private final OperationCallSettings<
          PurgeSuggestionDenyListEntriesRequest,
          PurgeSuggestionDenyListEntriesResponse,
          PurgeSuggestionDenyListEntriesMetadata>
      purgeSuggestionDenyListEntriesOperationSettings;
  private final UnaryCallSettings<ImportCompletionSuggestionsRequest, Operation>
      importCompletionSuggestionsSettings;
  private final OperationCallSettings<
          ImportCompletionSuggestionsRequest,
          ImportCompletionSuggestionsResponse,
          ImportCompletionSuggestionsMetadata>
      importCompletionSuggestionsOperationSettings;
  private final UnaryCallSettings<PurgeCompletionSuggestionsRequest, Operation>
      purgeCompletionSuggestionsSettings;
  private final OperationCallSettings<
          PurgeCompletionSuggestionsRequest,
          PurgeCompletionSuggestionsResponse,
          PurgeCompletionSuggestionsMetadata>
      purgeCompletionSuggestionsOperationSettings;

  /** Returns the object with the settings used for calls to completeQuery. */
  public UnaryCallSettings<CompleteQueryRequest, CompleteQueryResponse> completeQuerySettings() {
    return completeQuerySettings;
  }

  /** Returns the object with the settings used for calls to advancedCompleteQuery. */
  public UnaryCallSettings<AdvancedCompleteQueryRequest, AdvancedCompleteQueryResponse>
      advancedCompleteQuerySettings() {
    return advancedCompleteQuerySettings;
  }

  /** Returns the object with the settings used for calls to importSuggestionDenyListEntries. */
  public UnaryCallSettings<ImportSuggestionDenyListEntriesRequest, Operation>
      importSuggestionDenyListEntriesSettings() {
    return importSuggestionDenyListEntriesSettings;
  }

  /** Returns the object with the settings used for calls to importSuggestionDenyListEntries. */
  public OperationCallSettings<
          ImportSuggestionDenyListEntriesRequest,
          ImportSuggestionDenyListEntriesResponse,
          ImportSuggestionDenyListEntriesMetadata>
      importSuggestionDenyListEntriesOperationSettings() {
    return importSuggestionDenyListEntriesOperationSettings;
  }

  /** Returns the object with the settings used for calls to purgeSuggestionDenyListEntries. */
  public UnaryCallSettings<PurgeSuggestionDenyListEntriesRequest, Operation>
      purgeSuggestionDenyListEntriesSettings() {
    return purgeSuggestionDenyListEntriesSettings;
  }

  /** Returns the object with the settings used for calls to purgeSuggestionDenyListEntries. */
  public OperationCallSettings<
          PurgeSuggestionDenyListEntriesRequest,
          PurgeSuggestionDenyListEntriesResponse,
          PurgeSuggestionDenyListEntriesMetadata>
      purgeSuggestionDenyListEntriesOperationSettings() {
    return purgeSuggestionDenyListEntriesOperationSettings;
  }

  /** Returns the object with the settings used for calls to importCompletionSuggestions. */
  public UnaryCallSettings<ImportCompletionSuggestionsRequest, Operation>
      importCompletionSuggestionsSettings() {
    return importCompletionSuggestionsSettings;
  }

  /** Returns the object with the settings used for calls to importCompletionSuggestions. */
  public OperationCallSettings<
          ImportCompletionSuggestionsRequest,
          ImportCompletionSuggestionsResponse,
          ImportCompletionSuggestionsMetadata>
      importCompletionSuggestionsOperationSettings() {
    return importCompletionSuggestionsOperationSettings;
  }

  /** Returns the object with the settings used for calls to purgeCompletionSuggestions. */
  public UnaryCallSettings<PurgeCompletionSuggestionsRequest, Operation>
      purgeCompletionSuggestionsSettings() {
    return purgeCompletionSuggestionsSettings;
  }

  /** Returns the object with the settings used for calls to purgeCompletionSuggestions. */
  public OperationCallSettings<
          PurgeCompletionSuggestionsRequest,
          PurgeCompletionSuggestionsResponse,
          PurgeCompletionSuggestionsMetadata>
      purgeCompletionSuggestionsOperationSettings() {
    return purgeCompletionSuggestionsOperationSettings;
  }

  public CompletionServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcCompletionServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonCompletionServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "discoveryengine";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "discoveryengine.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "discoveryengine.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(CompletionServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(CompletionServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return CompletionServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected CompletionServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    completeQuerySettings = settingsBuilder.completeQuerySettings().build();
    advancedCompleteQuerySettings = settingsBuilder.advancedCompleteQuerySettings().build();
    importSuggestionDenyListEntriesSettings =
        settingsBuilder.importSuggestionDenyListEntriesSettings().build();
    importSuggestionDenyListEntriesOperationSettings =
        settingsBuilder.importSuggestionDenyListEntriesOperationSettings().build();
    purgeSuggestionDenyListEntriesSettings =
        settingsBuilder.purgeSuggestionDenyListEntriesSettings().build();
    purgeSuggestionDenyListEntriesOperationSettings =
        settingsBuilder.purgeSuggestionDenyListEntriesOperationSettings().build();
    importCompletionSuggestionsSettings =
        settingsBuilder.importCompletionSuggestionsSettings().build();
    importCompletionSuggestionsOperationSettings =
        settingsBuilder.importCompletionSuggestionsOperationSettings().build();
    purgeCompletionSuggestionsSettings =
        settingsBuilder.purgeCompletionSuggestionsSettings().build();
    purgeCompletionSuggestionsOperationSettings =
        settingsBuilder.purgeCompletionSuggestionsOperationSettings().build();
  }

  /** Builder for CompletionServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<CompletionServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CompleteQueryRequest, CompleteQueryResponse>
        completeQuerySettings;
    private final UnaryCallSettings.Builder<
            AdvancedCompleteQueryRequest, AdvancedCompleteQueryResponse>
        advancedCompleteQuerySettings;
    private final UnaryCallSettings.Builder<ImportSuggestionDenyListEntriesRequest, Operation>
        importSuggestionDenyListEntriesSettings;
    private final OperationCallSettings.Builder<
            ImportSuggestionDenyListEntriesRequest,
            ImportSuggestionDenyListEntriesResponse,
            ImportSuggestionDenyListEntriesMetadata>
        importSuggestionDenyListEntriesOperationSettings;
    private final UnaryCallSettings.Builder<PurgeSuggestionDenyListEntriesRequest, Operation>
        purgeSuggestionDenyListEntriesSettings;
    private final OperationCallSettings.Builder<
            PurgeSuggestionDenyListEntriesRequest,
            PurgeSuggestionDenyListEntriesResponse,
            PurgeSuggestionDenyListEntriesMetadata>
        purgeSuggestionDenyListEntriesOperationSettings;
    private final UnaryCallSettings.Builder<ImportCompletionSuggestionsRequest, Operation>
        importCompletionSuggestionsSettings;
    private final OperationCallSettings.Builder<
            ImportCompletionSuggestionsRequest,
            ImportCompletionSuggestionsResponse,
            ImportCompletionSuggestionsMetadata>
        importCompletionSuggestionsOperationSettings;
    private final UnaryCallSettings.Builder<PurgeCompletionSuggestionsRequest, Operation>
        purgeCompletionSuggestionsSettings;
    private final OperationCallSettings.Builder<
            PurgeCompletionSuggestionsRequest,
            PurgeCompletionSuggestionsResponse,
            PurgeCompletionSuggestionsMetadata>
        purgeCompletionSuggestionsOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(5000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(5000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(5000L))
              .setTotalTimeoutDuration(Duration.ofMillis(5000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      completeQuerySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      advancedCompleteQuerySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importSuggestionDenyListEntriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importSuggestionDenyListEntriesOperationSettings = OperationCallSettings.newBuilder();
      purgeSuggestionDenyListEntriesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeSuggestionDenyListEntriesOperationSettings = OperationCallSettings.newBuilder();
      importCompletionSuggestionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      importCompletionSuggestionsOperationSettings = OperationCallSettings.newBuilder();
      purgeCompletionSuggestionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      purgeCompletionSuggestionsOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              completeQuerySettings,
              advancedCompleteQuerySettings,
              importSuggestionDenyListEntriesSettings,
              purgeSuggestionDenyListEntriesSettings,
              importCompletionSuggestionsSettings,
              purgeCompletionSuggestionsSettings);
      initDefaults(this);
    }

    protected Builder(CompletionServiceStubSettings settings) {
      super(settings);

      completeQuerySettings = settings.completeQuerySettings.toBuilder();
      advancedCompleteQuerySettings = settings.advancedCompleteQuerySettings.toBuilder();
      importSuggestionDenyListEntriesSettings =
          settings.importSuggestionDenyListEntriesSettings.toBuilder();
      importSuggestionDenyListEntriesOperationSettings =
          settings.importSuggestionDenyListEntriesOperationSettings.toBuilder();
      purgeSuggestionDenyListEntriesSettings =
          settings.purgeSuggestionDenyListEntriesSettings.toBuilder();
      purgeSuggestionDenyListEntriesOperationSettings =
          settings.purgeSuggestionDenyListEntriesOperationSettings.toBuilder();
      importCompletionSuggestionsSettings =
          settings.importCompletionSuggestionsSettings.toBuilder();
      importCompletionSuggestionsOperationSettings =
          settings.importCompletionSuggestionsOperationSettings.toBuilder();
      purgeCompletionSuggestionsSettings = settings.purgeCompletionSuggestionsSettings.toBuilder();
      purgeCompletionSuggestionsOperationSettings =
          settings.purgeCompletionSuggestionsOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              completeQuerySettings,
              advancedCompleteQuerySettings,
              importSuggestionDenyListEntriesSettings,
              purgeSuggestionDenyListEntriesSettings,
              importCompletionSuggestionsSettings,
              purgeCompletionSuggestionsSettings);
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
          .completeQuerySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .advancedCompleteQuerySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .importSuggestionDenyListEntriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .purgeSuggestionDenyListEntriesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .importCompletionSuggestionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .purgeCompletionSuggestionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .importSuggestionDenyListEntriesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ImportSuggestionDenyListEntriesRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ImportSuggestionDenyListEntriesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ImportSuggestionDenyListEntriesMetadata.class))
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
          .purgeSuggestionDenyListEntriesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PurgeSuggestionDenyListEntriesRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  PurgeSuggestionDenyListEntriesResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  PurgeSuggestionDenyListEntriesMetadata.class))
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
          .importCompletionSuggestionsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ImportCompletionSuggestionsRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  ImportCompletionSuggestionsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  ImportCompletionSuggestionsMetadata.class))
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
          .purgeCompletionSuggestionsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PurgeCompletionSuggestionsRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  PurgeCompletionSuggestionsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  PurgeCompletionSuggestionsMetadata.class))
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

    /** Returns the builder for the settings used for calls to completeQuery. */
    public UnaryCallSettings.Builder<CompleteQueryRequest, CompleteQueryResponse>
        completeQuerySettings() {
      return completeQuerySettings;
    }

    /** Returns the builder for the settings used for calls to advancedCompleteQuery. */
    public UnaryCallSettings.Builder<AdvancedCompleteQueryRequest, AdvancedCompleteQueryResponse>
        advancedCompleteQuerySettings() {
      return advancedCompleteQuerySettings;
    }

    /** Returns the builder for the settings used for calls to importSuggestionDenyListEntries. */
    public UnaryCallSettings.Builder<ImportSuggestionDenyListEntriesRequest, Operation>
        importSuggestionDenyListEntriesSettings() {
      return importSuggestionDenyListEntriesSettings;
    }

    /** Returns the builder for the settings used for calls to importSuggestionDenyListEntries. */
    public OperationCallSettings.Builder<
            ImportSuggestionDenyListEntriesRequest,
            ImportSuggestionDenyListEntriesResponse,
            ImportSuggestionDenyListEntriesMetadata>
        importSuggestionDenyListEntriesOperationSettings() {
      return importSuggestionDenyListEntriesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to purgeSuggestionDenyListEntries. */
    public UnaryCallSettings.Builder<PurgeSuggestionDenyListEntriesRequest, Operation>
        purgeSuggestionDenyListEntriesSettings() {
      return purgeSuggestionDenyListEntriesSettings;
    }

    /** Returns the builder for the settings used for calls to purgeSuggestionDenyListEntries. */
    public OperationCallSettings.Builder<
            PurgeSuggestionDenyListEntriesRequest,
            PurgeSuggestionDenyListEntriesResponse,
            PurgeSuggestionDenyListEntriesMetadata>
        purgeSuggestionDenyListEntriesOperationSettings() {
      return purgeSuggestionDenyListEntriesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to importCompletionSuggestions. */
    public UnaryCallSettings.Builder<ImportCompletionSuggestionsRequest, Operation>
        importCompletionSuggestionsSettings() {
      return importCompletionSuggestionsSettings;
    }

    /** Returns the builder for the settings used for calls to importCompletionSuggestions. */
    public OperationCallSettings.Builder<
            ImportCompletionSuggestionsRequest,
            ImportCompletionSuggestionsResponse,
            ImportCompletionSuggestionsMetadata>
        importCompletionSuggestionsOperationSettings() {
      return importCompletionSuggestionsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to purgeCompletionSuggestions. */
    public UnaryCallSettings.Builder<PurgeCompletionSuggestionsRequest, Operation>
        purgeCompletionSuggestionsSettings() {
      return purgeCompletionSuggestionsSettings;
    }

    /** Returns the builder for the settings used for calls to purgeCompletionSuggestions. */
    public OperationCallSettings.Builder<
            PurgeCompletionSuggestionsRequest,
            PurgeCompletionSuggestionsResponse,
            PurgeCompletionSuggestionsMetadata>
        purgeCompletionSuggestionsOperationSettings() {
      return purgeCompletionSuggestionsOperationSettings;
    }

    @Override
    public CompletionServiceStubSettings build() throws IOException {
      return new CompletionServiceStubSettings(this);
    }
  }
}
