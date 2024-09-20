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

package com.google.cloud.resourcemanager.v3.stub;

import static com.google.cloud.resourcemanager.v3.TagBindingsClient.ListEffectiveTagsPagedResponse;
import static com.google.cloud.resourcemanager.v3.TagBindingsClient.ListTagBindingsPagedResponse;

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
import com.google.cloud.resourcemanager.v3.CreateTagBindingMetadata;
import com.google.cloud.resourcemanager.v3.CreateTagBindingRequest;
import com.google.cloud.resourcemanager.v3.DeleteTagBindingMetadata;
import com.google.cloud.resourcemanager.v3.DeleteTagBindingRequest;
import com.google.cloud.resourcemanager.v3.EffectiveTag;
import com.google.cloud.resourcemanager.v3.ListEffectiveTagsRequest;
import com.google.cloud.resourcemanager.v3.ListEffectiveTagsResponse;
import com.google.cloud.resourcemanager.v3.ListTagBindingsRequest;
import com.google.cloud.resourcemanager.v3.ListTagBindingsResponse;
import com.google.cloud.resourcemanager.v3.TagBinding;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link TagBindingsStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (cloudresourcemanager.googleapis.com) and default port (443)
 *       are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of listTagBindings:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TagBindingsStubSettings.Builder tagBindingsSettingsBuilder =
 *     TagBindingsStubSettings.newBuilder();
 * tagBindingsSettingsBuilder
 *     .listTagBindingsSettings()
 *     .setRetrySettings(
 *         tagBindingsSettingsBuilder
 *             .listTagBindingsSettings()
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
 * TagBindingsStubSettings tagBindingsSettings = tagBindingsSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for createTagBinding:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * TagBindingsStubSettings.Builder tagBindingsSettingsBuilder =
 *     TagBindingsStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelay(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * tagBindingsSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class TagBindingsStubSettings extends StubSettings<TagBindingsStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .build();

  private final PagedCallSettings<
          ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
      listTagBindingsSettings;
  private final UnaryCallSettings<CreateTagBindingRequest, Operation> createTagBindingSettings;
  private final OperationCallSettings<CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
      createTagBindingOperationSettings;
  private final UnaryCallSettings<DeleteTagBindingRequest, Operation> deleteTagBindingSettings;
  private final OperationCallSettings<DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
      deleteTagBindingOperationSettings;
  private final PagedCallSettings<
          ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
      listEffectiveTagsSettings;

  private static final PagedListDescriptor<
          ListTagBindingsRequest, ListTagBindingsResponse, TagBinding>
      LIST_TAG_BINDINGS_PAGE_STR_DESC =
          new PagedListDescriptor<ListTagBindingsRequest, ListTagBindingsResponse, TagBinding>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTagBindingsRequest injectToken(
                ListTagBindingsRequest payload, String token) {
              return ListTagBindingsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTagBindingsRequest injectPageSize(
                ListTagBindingsRequest payload, int pageSize) {
              return ListTagBindingsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTagBindingsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTagBindingsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<TagBinding> extractResources(ListTagBindingsResponse payload) {
              return payload.getTagBindingsList();
            }
          };

  private static final PagedListDescriptor<
          ListEffectiveTagsRequest, ListEffectiveTagsResponse, EffectiveTag>
      LIST_EFFECTIVE_TAGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEffectiveTagsRequest, ListEffectiveTagsResponse, EffectiveTag>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEffectiveTagsRequest injectToken(
                ListEffectiveTagsRequest payload, String token) {
              return ListEffectiveTagsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListEffectiveTagsRequest injectPageSize(
                ListEffectiveTagsRequest payload, int pageSize) {
              return ListEffectiveTagsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListEffectiveTagsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEffectiveTagsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EffectiveTag> extractResources(ListEffectiveTagsResponse payload) {
              return payload.getEffectiveTagsList();
            }
          };

  private static final PagedListResponseFactory<
          ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
      LIST_TAG_BINDINGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>() {
            @Override
            public ApiFuture<ListTagBindingsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTagBindingsRequest, ListTagBindingsResponse> callable,
                ListTagBindingsRequest request,
                ApiCallContext context,
                ApiFuture<ListTagBindingsResponse> futureResponse) {
              PageContext<ListTagBindingsRequest, ListTagBindingsResponse, TagBinding> pageContext =
                  PageContext.create(callable, LIST_TAG_BINDINGS_PAGE_STR_DESC, request, context);
              return ListTagBindingsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
      LIST_EFFECTIVE_TAGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEffectiveTagsRequest,
              ListEffectiveTagsResponse,
              ListEffectiveTagsPagedResponse>() {
            @Override
            public ApiFuture<ListEffectiveTagsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListEffectiveTagsRequest, ListEffectiveTagsResponse> callable,
                ListEffectiveTagsRequest request,
                ApiCallContext context,
                ApiFuture<ListEffectiveTagsResponse> futureResponse) {
              PageContext<ListEffectiveTagsRequest, ListEffectiveTagsResponse, EffectiveTag>
                  pageContext =
                      PageContext.create(
                          callable, LIST_EFFECTIVE_TAGS_PAGE_STR_DESC, request, context);
              return ListEffectiveTagsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to listTagBindings. */
  public PagedCallSettings<
          ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
      listTagBindingsSettings() {
    return listTagBindingsSettings;
  }

  /** Returns the object with the settings used for calls to createTagBinding. */
  public UnaryCallSettings<CreateTagBindingRequest, Operation> createTagBindingSettings() {
    return createTagBindingSettings;
  }

  /** Returns the object with the settings used for calls to createTagBinding. */
  public OperationCallSettings<CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
      createTagBindingOperationSettings() {
    return createTagBindingOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteTagBinding. */
  public UnaryCallSettings<DeleteTagBindingRequest, Operation> deleteTagBindingSettings() {
    return deleteTagBindingSettings;
  }

  /** Returns the object with the settings used for calls to deleteTagBinding. */
  public OperationCallSettings<DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
      deleteTagBindingOperationSettings() {
    return deleteTagBindingOperationSettings;
  }

  /** Returns the object with the settings used for calls to listEffectiveTags. */
  public PagedCallSettings<
          ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
      listEffectiveTagsSettings() {
    return listEffectiveTagsSettings;
  }

  public TagBindingsStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcTagBindingsStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonTagBindingsStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "cloudresourcemanager";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "cloudresourcemanager.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "cloudresourcemanager.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(TagBindingsStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(TagBindingsStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return TagBindingsStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected TagBindingsStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    listTagBindingsSettings = settingsBuilder.listTagBindingsSettings().build();
    createTagBindingSettings = settingsBuilder.createTagBindingSettings().build();
    createTagBindingOperationSettings = settingsBuilder.createTagBindingOperationSettings().build();
    deleteTagBindingSettings = settingsBuilder.deleteTagBindingSettings().build();
    deleteTagBindingOperationSettings = settingsBuilder.deleteTagBindingOperationSettings().build();
    listEffectiveTagsSettings = settingsBuilder.listEffectiveTagsSettings().build();
  }

  /** Builder for TagBindingsStubSettings. */
  public static class Builder extends StubSettings.Builder<TagBindingsStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final PagedCallSettings.Builder<
            ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
        listTagBindingsSettings;
    private final UnaryCallSettings.Builder<CreateTagBindingRequest, Operation>
        createTagBindingSettings;
    private final OperationCallSettings.Builder<
            CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
        createTagBindingOperationSettings;
    private final UnaryCallSettings.Builder<DeleteTagBindingRequest, Operation>
        deleteTagBindingSettings;
    private final OperationCallSettings.Builder<
            DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
        deleteTagBindingOperationSettings;
    private final PagedCallSettings.Builder<
            ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
        listEffectiveTagsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      listTagBindingsSettings = PagedCallSettings.newBuilder(LIST_TAG_BINDINGS_PAGE_STR_FACT);
      createTagBindingSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createTagBindingOperationSettings = OperationCallSettings.newBuilder();
      deleteTagBindingSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTagBindingOperationSettings = OperationCallSettings.newBuilder();
      listEffectiveTagsSettings = PagedCallSettings.newBuilder(LIST_EFFECTIVE_TAGS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listTagBindingsSettings,
              createTagBindingSettings,
              deleteTagBindingSettings,
              listEffectiveTagsSettings);
      initDefaults(this);
    }

    protected Builder(TagBindingsStubSettings settings) {
      super(settings);

      listTagBindingsSettings = settings.listTagBindingsSettings.toBuilder();
      createTagBindingSettings = settings.createTagBindingSettings.toBuilder();
      createTagBindingOperationSettings = settings.createTagBindingOperationSettings.toBuilder();
      deleteTagBindingSettings = settings.deleteTagBindingSettings.toBuilder();
      deleteTagBindingOperationSettings = settings.deleteTagBindingOperationSettings.toBuilder();
      listEffectiveTagsSettings = settings.listEffectiveTagsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              listTagBindingsSettings,
              createTagBindingSettings,
              deleteTagBindingSettings,
              listEffectiveTagsSettings);
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
          .listTagBindingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createTagBindingSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteTagBindingSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listEffectiveTagsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTagBindingOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateTagBindingRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(TagBinding.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(CreateTagBindingMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteTagBindingOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTagBindingRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Empty.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(DeleteTagBindingMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
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

    /** Returns the builder for the settings used for calls to listTagBindings. */
    public PagedCallSettings.Builder<
            ListTagBindingsRequest, ListTagBindingsResponse, ListTagBindingsPagedResponse>
        listTagBindingsSettings() {
      return listTagBindingsSettings;
    }

    /** Returns the builder for the settings used for calls to createTagBinding. */
    public UnaryCallSettings.Builder<CreateTagBindingRequest, Operation>
        createTagBindingSettings() {
      return createTagBindingSettings;
    }

    /** Returns the builder for the settings used for calls to createTagBinding. */
    public OperationCallSettings.Builder<
            CreateTagBindingRequest, TagBinding, CreateTagBindingMetadata>
        createTagBindingOperationSettings() {
      return createTagBindingOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTagBinding. */
    public UnaryCallSettings.Builder<DeleteTagBindingRequest, Operation>
        deleteTagBindingSettings() {
      return deleteTagBindingSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTagBinding. */
    public OperationCallSettings.Builder<DeleteTagBindingRequest, Empty, DeleteTagBindingMetadata>
        deleteTagBindingOperationSettings() {
      return deleteTagBindingOperationSettings;
    }

    /** Returns the builder for the settings used for calls to listEffectiveTags. */
    public PagedCallSettings.Builder<
            ListEffectiveTagsRequest, ListEffectiveTagsResponse, ListEffectiveTagsPagedResponse>
        listEffectiveTagsSettings() {
      return listEffectiveTagsSettings;
    }

    @Override
    public TagBindingsStubSettings build() throws IOException {
      return new TagBindingsStubSettings(this);
    }
  }
}
