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

import static com.google.cloud.discoveryengine.v1beta.EngineServiceClient.ListEnginesPagedResponse;

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
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.discoveryengine.v1beta.CreateEngineMetadata;
import com.google.cloud.discoveryengine.v1beta.CreateEngineRequest;
import com.google.cloud.discoveryengine.v1beta.DeleteEngineMetadata;
import com.google.cloud.discoveryengine.v1beta.DeleteEngineRequest;
import com.google.cloud.discoveryengine.v1beta.Engine;
import com.google.cloud.discoveryengine.v1beta.GetEngineRequest;
import com.google.cloud.discoveryengine.v1beta.ListEnginesRequest;
import com.google.cloud.discoveryengine.v1beta.ListEnginesResponse;
import com.google.cloud.discoveryengine.v1beta.PauseEngineRequest;
import com.google.cloud.discoveryengine.v1beta.ResumeEngineRequest;
import com.google.cloud.discoveryengine.v1beta.TuneEngineMetadata;
import com.google.cloud.discoveryengine.v1beta.TuneEngineRequest;
import com.google.cloud.discoveryengine.v1beta.TuneEngineResponse;
import com.google.cloud.discoveryengine.v1beta.UpdateEngineRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EngineServiceStub}.
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
 * of updateEngine:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EngineServiceStubSettings.Builder engineServiceSettingsBuilder =
 *     EngineServiceStubSettings.newBuilder();
 * engineServiceSettingsBuilder
 *     .updateEngineSettings()
 *     .setRetrySettings(
 *         engineServiceSettingsBuilder
 *             .updateEngineSettings()
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
 * EngineServiceStubSettings engineServiceSettings = engineServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createEngine:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EngineServiceStubSettings.Builder engineServiceSettingsBuilder =
 *     EngineServiceStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * engineServiceSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class EngineServiceStubSettings extends StubSettings<EngineServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateEngineRequest, Operation> createEngineSettings;
  private final OperationCallSettings<CreateEngineRequest, Engine, CreateEngineMetadata>
      createEngineOperationSettings;
  private final UnaryCallSettings<DeleteEngineRequest, Operation> deleteEngineSettings;
  private final OperationCallSettings<DeleteEngineRequest, Empty, DeleteEngineMetadata>
      deleteEngineOperationSettings;
  private final UnaryCallSettings<UpdateEngineRequest, Engine> updateEngineSettings;
  private final UnaryCallSettings<GetEngineRequest, Engine> getEngineSettings;
  private final PagedCallSettings<ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>
      listEnginesSettings;
  private final UnaryCallSettings<PauseEngineRequest, Engine> pauseEngineSettings;
  private final UnaryCallSettings<ResumeEngineRequest, Engine> resumeEngineSettings;
  private final UnaryCallSettings<TuneEngineRequest, Operation> tuneEngineSettings;
  private final OperationCallSettings<TuneEngineRequest, TuneEngineResponse, TuneEngineMetadata>
      tuneEngineOperationSettings;

  private static final PagedListDescriptor<ListEnginesRequest, ListEnginesResponse, Engine>
      LIST_ENGINES_PAGE_STR_DESC =
          new PagedListDescriptor<ListEnginesRequest, ListEnginesResponse, Engine>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEnginesRequest injectToken(ListEnginesRequest payload, String token) {
              return ListEnginesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEnginesRequest injectPageSize(ListEnginesRequest payload, int pageSize) {
              return ListEnginesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEnginesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEnginesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Engine> extractResources(ListEnginesResponse payload) {
              return payload.getEnginesList();
            }
          };

  private static final PagedListResponseFactory<
          ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>
      LIST_ENGINES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>() {
            @Override
            public ApiFuture<ListEnginesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEnginesRequest, ListEnginesResponse> callable,
                ListEnginesRequest request,
                ApiCallContext context,
                ApiFuture<ListEnginesResponse> futureResponse) {
              PageContext<ListEnginesRequest, ListEnginesResponse, Engine> pageContext =
                  PageContext.create(callable, LIST_ENGINES_PAGE_STR_DESC, request, context);
              return ListEnginesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createEngine. */
  public UnaryCallSettings<CreateEngineRequest, Operation> createEngineSettings() {
    return createEngineSettings;
  }

  /** Returns the object with the settings used for calls to createEngine. */
  public OperationCallSettings<CreateEngineRequest, Engine, CreateEngineMetadata>
      createEngineOperationSettings() {
    return createEngineOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteEngine. */
  public UnaryCallSettings<DeleteEngineRequest, Operation> deleteEngineSettings() {
    return deleteEngineSettings;
  }

  /** Returns the object with the settings used for calls to deleteEngine. */
  public OperationCallSettings<DeleteEngineRequest, Empty, DeleteEngineMetadata>
      deleteEngineOperationSettings() {
    return deleteEngineOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateEngine. */
  public UnaryCallSettings<UpdateEngineRequest, Engine> updateEngineSettings() {
    return updateEngineSettings;
  }

  /** Returns the object with the settings used for calls to getEngine. */
  public UnaryCallSettings<GetEngineRequest, Engine> getEngineSettings() {
    return getEngineSettings;
  }

  /** Returns the object with the settings used for calls to listEngines. */
  public PagedCallSettings<ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>
      listEnginesSettings() {
    return listEnginesSettings;
  }

  /** Returns the object with the settings used for calls to pauseEngine. */
  public UnaryCallSettings<PauseEngineRequest, Engine> pauseEngineSettings() {
    return pauseEngineSettings;
  }

  /** Returns the object with the settings used for calls to resumeEngine. */
  public UnaryCallSettings<ResumeEngineRequest, Engine> resumeEngineSettings() {
    return resumeEngineSettings;
  }

  /** Returns the object with the settings used for calls to tuneEngine. */
  public UnaryCallSettings<TuneEngineRequest, Operation> tuneEngineSettings() {
    return tuneEngineSettings;
  }

  /** Returns the object with the settings used for calls to tuneEngine. */
  public OperationCallSettings<TuneEngineRequest, TuneEngineResponse, TuneEngineMetadata>
      tuneEngineOperationSettings() {
    return tuneEngineOperationSettings;
  }

  public EngineServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcEngineServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonEngineServiceStub.create(this);
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
            "gapic", GaxProperties.getLibraryVersion(EngineServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(EngineServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EngineServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected EngineServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createEngineSettings = settingsBuilder.createEngineSettings().build();
    createEngineOperationSettings = settingsBuilder.createEngineOperationSettings().build();
    deleteEngineSettings = settingsBuilder.deleteEngineSettings().build();
    deleteEngineOperationSettings = settingsBuilder.deleteEngineOperationSettings().build();
    updateEngineSettings = settingsBuilder.updateEngineSettings().build();
    getEngineSettings = settingsBuilder.getEngineSettings().build();
    listEnginesSettings = settingsBuilder.listEnginesSettings().build();
    pauseEngineSettings = settingsBuilder.pauseEngineSettings().build();
    resumeEngineSettings = settingsBuilder.resumeEngineSettings().build();
    tuneEngineSettings = settingsBuilder.tuneEngineSettings().build();
    tuneEngineOperationSettings = settingsBuilder.tuneEngineOperationSettings().build();
  }

  /** Builder for EngineServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<EngineServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateEngineRequest, Operation> createEngineSettings;
    private final OperationCallSettings.Builder<CreateEngineRequest, Engine, CreateEngineMetadata>
        createEngineOperationSettings;
    private final UnaryCallSettings.Builder<DeleteEngineRequest, Operation> deleteEngineSettings;
    private final OperationCallSettings.Builder<DeleteEngineRequest, Empty, DeleteEngineMetadata>
        deleteEngineOperationSettings;
    private final UnaryCallSettings.Builder<UpdateEngineRequest, Engine> updateEngineSettings;
    private final UnaryCallSettings.Builder<GetEngineRequest, Engine> getEngineSettings;
    private final PagedCallSettings.Builder<
            ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>
        listEnginesSettings;
    private final UnaryCallSettings.Builder<PauseEngineRequest, Engine> pauseEngineSettings;
    private final UnaryCallSettings.Builder<ResumeEngineRequest, Engine> resumeEngineSettings;
    private final UnaryCallSettings.Builder<TuneEngineRequest, Operation> tuneEngineSettings;
    private final OperationCallSettings.Builder<
            TuneEngineRequest, TuneEngineResponse, TuneEngineMetadata>
        tuneEngineOperationSettings;
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

      createEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createEngineOperationSettings = OperationCallSettings.newBuilder();
      deleteEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteEngineOperationSettings = OperationCallSettings.newBuilder();
      updateEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listEnginesSettings = PagedCallSettings.newBuilder(LIST_ENGINES_PAGE_STR_FACT);
      pauseEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resumeEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      tuneEngineSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      tuneEngineOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createEngineSettings,
              deleteEngineSettings,
              updateEngineSettings,
              getEngineSettings,
              listEnginesSettings,
              pauseEngineSettings,
              resumeEngineSettings,
              tuneEngineSettings);
      initDefaults(this);
    }

    protected Builder(EngineServiceStubSettings settings) {
      super(settings);

      createEngineSettings = settings.createEngineSettings.toBuilder();
      createEngineOperationSettings = settings.createEngineOperationSettings.toBuilder();
      deleteEngineSettings = settings.deleteEngineSettings.toBuilder();
      deleteEngineOperationSettings = settings.deleteEngineOperationSettings.toBuilder();
      updateEngineSettings = settings.updateEngineSettings.toBuilder();
      getEngineSettings = settings.getEngineSettings.toBuilder();
      listEnginesSettings = settings.listEnginesSettings.toBuilder();
      pauseEngineSettings = settings.pauseEngineSettings.toBuilder();
      resumeEngineSettings = settings.resumeEngineSettings.toBuilder();
      tuneEngineSettings = settings.tuneEngineSettings.toBuilder();
      tuneEngineOperationSettings = settings.tuneEngineOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createEngineSettings,
              deleteEngineSettings,
              updateEngineSettings,
              getEngineSettings,
              listEnginesSettings,
              pauseEngineSettings,
              resumeEngineSettings,
              tuneEngineSettings);
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
          .createEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listEnginesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .pauseEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .resumeEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .tuneEngineSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createEngineOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateEngineRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Engine.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(CreateEngineMetadata.class))
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
          .deleteEngineOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteEngineRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteEngineMetadata.class))
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
          .tuneEngineOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings.<TuneEngineRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(TuneEngineResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(TuneEngineMetadata.class))
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

    /** Returns the builder for the settings used for calls to createEngine. */
    public UnaryCallSettings.Builder<CreateEngineRequest, Operation> createEngineSettings() {
      return createEngineSettings;
    }

    /** Returns the builder for the settings used for calls to createEngine. */
    public OperationCallSettings.Builder<CreateEngineRequest, Engine, CreateEngineMetadata>
        createEngineOperationSettings() {
      return createEngineOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteEngine. */
    public UnaryCallSettings.Builder<DeleteEngineRequest, Operation> deleteEngineSettings() {
      return deleteEngineSettings;
    }

    /** Returns the builder for the settings used for calls to deleteEngine. */
    public OperationCallSettings.Builder<DeleteEngineRequest, Empty, DeleteEngineMetadata>
        deleteEngineOperationSettings() {
      return deleteEngineOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateEngine. */
    public UnaryCallSettings.Builder<UpdateEngineRequest, Engine> updateEngineSettings() {
      return updateEngineSettings;
    }

    /** Returns the builder for the settings used for calls to getEngine. */
    public UnaryCallSettings.Builder<GetEngineRequest, Engine> getEngineSettings() {
      return getEngineSettings;
    }

    /** Returns the builder for the settings used for calls to listEngines. */
    public PagedCallSettings.Builder<
            ListEnginesRequest, ListEnginesResponse, ListEnginesPagedResponse>
        listEnginesSettings() {
      return listEnginesSettings;
    }

    /** Returns the builder for the settings used for calls to pauseEngine. */
    public UnaryCallSettings.Builder<PauseEngineRequest, Engine> pauseEngineSettings() {
      return pauseEngineSettings;
    }

    /** Returns the builder for the settings used for calls to resumeEngine. */
    public UnaryCallSettings.Builder<ResumeEngineRequest, Engine> resumeEngineSettings() {
      return resumeEngineSettings;
    }

    /** Returns the builder for the settings used for calls to tuneEngine. */
    public UnaryCallSettings.Builder<TuneEngineRequest, Operation> tuneEngineSettings() {
      return tuneEngineSettings;
    }

    /** Returns the builder for the settings used for calls to tuneEngine. */
    public OperationCallSettings.Builder<TuneEngineRequest, TuneEngineResponse, TuneEngineMetadata>
        tuneEngineOperationSettings() {
      return tuneEngineOperationSettings;
    }

    @Override
    public EngineServiceStubSettings build() throws IOException {
      return new EngineServiceStubSettings(this);
    }
  }
}
