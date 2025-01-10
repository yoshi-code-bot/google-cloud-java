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

package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionInstanceGroupManagersClient.ListErrorsPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagersClient.ListManagedInstancesPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagersClient.ListPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagersClient.ListPerInstanceConfigsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.httpjson.ProtoOperationTransformers;
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
import com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.CreateInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.GetRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.InstanceManagedByIgmError;
import com.google.cloud.compute.v1.ListErrorsRegionInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsRegionInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ListRegionInstanceGroupManagersRequest;
import com.google.cloud.compute.v1.ManagedInstance;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.PerInstanceConfig;
import com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.RegionInstanceGroupManagerList;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstanceConfigsResp;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse;
import com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.ResumeInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.StartInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.StopInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.SuspendInstancesRegionInstanceGroupManagerRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RegionInstanceGroupManagersStub}.
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
 * RegionInstanceGroupManagersStubSettings.Builder regionInstanceGroupManagersSettingsBuilder =
 *     RegionInstanceGroupManagersStubSettings.newBuilder();
 * regionInstanceGroupManagersSettingsBuilder
 *     .getSettings()
 *     .setRetrySettings(
 *         regionInstanceGroupManagersSettingsBuilder
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
 * RegionInstanceGroupManagersStubSettings regionInstanceGroupManagersSettings =
 *     regionInstanceGroupManagersSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for abandonInstances:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RegionInstanceGroupManagersStubSettings.Builder regionInstanceGroupManagersSettingsBuilder =
 *     RegionInstanceGroupManagersStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelayDuration(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * regionInstanceGroupManagersSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class RegionInstanceGroupManagersStubSettings
    extends StubSettings<RegionInstanceGroupManagersStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerRequest, Operation>
      abandonInstancesSettings;
  private final OperationCallSettings<
          AbandonInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      abandonInstancesOperationSettings;
  private final UnaryCallSettings<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation>
      applyUpdatesToInstancesSettings;
  private final OperationCallSettings<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      applyUpdatesToInstancesOperationSettings;
  private final UnaryCallSettings<CreateInstancesRegionInstanceGroupManagerRequest, Operation>
      createInstancesSettings;
  private final OperationCallSettings<
          CreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      createInstancesOperationSettings;
  private final UnaryCallSettings<DeleteRegionInstanceGroupManagerRequest, Operation>
      deleteSettings;
  private final OperationCallSettings<DeleteRegionInstanceGroupManagerRequest, Operation, Operation>
      deleteOperationSettings;
  private final UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerRequest, Operation>
      deleteInstancesSettings;
  private final OperationCallSettings<
          DeleteInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      deleteInstancesOperationSettings;
  private final UnaryCallSettings<
          DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      deletePerInstanceConfigsSettings;
  private final OperationCallSettings<
          DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      deletePerInstanceConfigsOperationSettings;
  private final UnaryCallSettings<GetRegionInstanceGroupManagerRequest, InstanceGroupManager>
      getSettings;
  private final UnaryCallSettings<InsertRegionInstanceGroupManagerRequest, Operation>
      insertSettings;
  private final OperationCallSettings<InsertRegionInstanceGroupManagerRequest, Operation, Operation>
      insertOperationSettings;
  private final PagedCallSettings<
          ListRegionInstanceGroupManagersRequest, RegionInstanceGroupManagerList, ListPagedResponse>
      listSettings;
  private final PagedCallSettings<
          ListErrorsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      listErrorsSettings;
  private final PagedCallSettings<
          ListManagedInstancesRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesPagedResponse>
      listManagedInstancesSettings;
  private final PagedCallSettings<
          ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      listPerInstanceConfigsSettings;
  private final UnaryCallSettings<PatchRegionInstanceGroupManagerRequest, Operation> patchSettings;
  private final OperationCallSettings<PatchRegionInstanceGroupManagerRequest, Operation, Operation>
      patchOperationSettings;
  private final UnaryCallSettings<
          PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      patchPerInstanceConfigsSettings;
  private final OperationCallSettings<
          PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      patchPerInstanceConfigsOperationSettings;
  private final UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerRequest, Operation>
      recreateInstancesSettings;
  private final OperationCallSettings<
          RecreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      recreateInstancesOperationSettings;
  private final UnaryCallSettings<ResizeRegionInstanceGroupManagerRequest, Operation>
      resizeSettings;
  private final OperationCallSettings<ResizeRegionInstanceGroupManagerRequest, Operation, Operation>
      resizeOperationSettings;
  private final UnaryCallSettings<ResumeInstancesRegionInstanceGroupManagerRequest, Operation>
      resumeInstancesSettings;
  private final OperationCallSettings<
          ResumeInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      resumeInstancesOperationSettings;
  private final UnaryCallSettings<SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation>
      setInstanceTemplateSettings;
  private final OperationCallSettings<
          SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation, Operation>
      setInstanceTemplateOperationSettings;
  private final UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerRequest, Operation>
      setTargetPoolsSettings;
  private final OperationCallSettings<
          SetTargetPoolsRegionInstanceGroupManagerRequest, Operation, Operation>
      setTargetPoolsOperationSettings;
  private final UnaryCallSettings<StartInstancesRegionInstanceGroupManagerRequest, Operation>
      startInstancesSettings;
  private final OperationCallSettings<
          StartInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      startInstancesOperationSettings;
  private final UnaryCallSettings<StopInstancesRegionInstanceGroupManagerRequest, Operation>
      stopInstancesSettings;
  private final OperationCallSettings<
          StopInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      stopInstancesOperationSettings;
  private final UnaryCallSettings<SuspendInstancesRegionInstanceGroupManagerRequest, Operation>
      suspendInstancesSettings;
  private final OperationCallSettings<
          SuspendInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      suspendInstancesOperationSettings;
  private final UnaryCallSettings<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      updatePerInstanceConfigsSettings;
  private final OperationCallSettings<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      updatePerInstanceConfigsOperationSettings;

  private static final PagedListDescriptor<
          ListRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagerList,
          InstanceGroupManager>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagerList,
              InstanceGroupManager>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRegionInstanceGroupManagersRequest injectToken(
                ListRegionInstanceGroupManagersRequest payload, String token) {
              return ListRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRegionInstanceGroupManagersRequest injectPageSize(
                ListRegionInstanceGroupManagersRequest payload, int pageSize) {
              return ListRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRegionInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(RegionInstanceGroupManagerList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceGroupManager> extractResources(
                RegionInstanceGroupManagerList payload) {
              return payload.getItemsList();
            }
          };

  private static final PagedListDescriptor<
          ListErrorsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          InstanceManagedByIgmError>
      LIST_ERRORS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListErrorsRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListErrorsResponse,
              InstanceManagedByIgmError>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListErrorsRegionInstanceGroupManagersRequest injectToken(
                ListErrorsRegionInstanceGroupManagersRequest payload, String token) {
              return ListErrorsRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListErrorsRegionInstanceGroupManagersRequest injectPageSize(
                ListErrorsRegionInstanceGroupManagersRequest payload, int pageSize) {
              return ListErrorsRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListErrorsRegionInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(RegionInstanceGroupManagersListErrorsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<InstanceManagedByIgmError> extractResources(
                RegionInstanceGroupManagersListErrorsResponse payload) {
              return payload.getItemsList();
            }
          };

  private static final PagedListDescriptor<
          ListManagedInstancesRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ManagedInstance>
      LIST_MANAGED_INSTANCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListManagedInstancesRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListInstancesResponse,
              ManagedInstance>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListManagedInstancesRegionInstanceGroupManagersRequest injectToken(
                ListManagedInstancesRegionInstanceGroupManagersRequest payload, String token) {
              return ListManagedInstancesRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListManagedInstancesRegionInstanceGroupManagersRequest injectPageSize(
                ListManagedInstancesRegionInstanceGroupManagersRequest payload, int pageSize) {
              return ListManagedInstancesRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListManagedInstancesRegionInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                RegionInstanceGroupManagersListInstancesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ManagedInstance> extractResources(
                RegionInstanceGroupManagersListInstancesResponse payload) {
              return payload.getManagedInstancesList();
            }
          };

  private static final PagedListDescriptor<
          ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          PerInstanceConfig>
      LIST_PER_INSTANCE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListInstanceConfigsResp,
              PerInstanceConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPerInstanceConfigsRegionInstanceGroupManagersRequest injectToken(
                ListPerInstanceConfigsRegionInstanceGroupManagersRequest payload, String token) {
              return ListPerInstanceConfigsRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListPerInstanceConfigsRegionInstanceGroupManagersRequest injectPageSize(
                ListPerInstanceConfigsRegionInstanceGroupManagersRequest payload, int pageSize) {
              return ListPerInstanceConfigsRegionInstanceGroupManagersRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListPerInstanceConfigsRegionInstanceGroupManagersRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(
                RegionInstanceGroupManagersListInstanceConfigsResp payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<PerInstanceConfig> extractResources(
                RegionInstanceGroupManagersListInstanceConfigsResp payload) {
              return payload.getItemsList();
            }
          };

  private static final PagedListResponseFactory<
          ListRegionInstanceGroupManagersRequest, RegionInstanceGroupManagerList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagerList,
              ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListRegionInstanceGroupManagersRequest, RegionInstanceGroupManagerList>
                    callable,
                ListRegionInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<RegionInstanceGroupManagerList> futureResponse) {
              PageContext<
                      ListRegionInstanceGroupManagersRequest,
                      RegionInstanceGroupManagerList,
                      InstanceGroupManager>
                  pageContext = PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListErrorsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      LIST_ERRORS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListErrorsRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListErrorsResponse,
              ListErrorsPagedResponse>() {
            @Override
            public ApiFuture<ListErrorsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListErrorsRegionInstanceGroupManagersRequest,
                        RegionInstanceGroupManagersListErrorsResponse>
                    callable,
                ListErrorsRegionInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<RegionInstanceGroupManagersListErrorsResponse> futureResponse) {
              PageContext<
                      ListErrorsRegionInstanceGroupManagersRequest,
                      RegionInstanceGroupManagersListErrorsResponse,
                      InstanceManagedByIgmError>
                  pageContext =
                      PageContext.create(callable, LIST_ERRORS_PAGE_STR_DESC, request, context);
              return ListErrorsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListManagedInstancesRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesPagedResponse>
      LIST_MANAGED_INSTANCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListManagedInstancesRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListInstancesResponse,
              ListManagedInstancesPagedResponse>() {
            @Override
            public ApiFuture<ListManagedInstancesPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListManagedInstancesRegionInstanceGroupManagersRequest,
                        RegionInstanceGroupManagersListInstancesResponse>
                    callable,
                ListManagedInstancesRegionInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<RegionInstanceGroupManagersListInstancesResponse> futureResponse) {
              PageContext<
                      ListManagedInstancesRegionInstanceGroupManagersRequest,
                      RegionInstanceGroupManagersListInstancesResponse,
                      ManagedInstance>
                  pageContext =
                      PageContext.create(
                          callable, LIST_MANAGED_INSTANCES_PAGE_STR_DESC, request, context);
              return ListManagedInstancesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      LIST_PER_INSTANCE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
              RegionInstanceGroupManagersListInstanceConfigsResp,
              ListPerInstanceConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListPerInstanceConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
                        RegionInstanceGroupManagersListInstanceConfigsResp>
                    callable,
                ListPerInstanceConfigsRegionInstanceGroupManagersRequest request,
                ApiCallContext context,
                ApiFuture<RegionInstanceGroupManagersListInstanceConfigsResp> futureResponse) {
              PageContext<
                      ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
                      RegionInstanceGroupManagersListInstanceConfigsResp,
                      PerInstanceConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_PER_INSTANCE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListPerInstanceConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to abandonInstances. */
  public UnaryCallSettings<AbandonInstancesRegionInstanceGroupManagerRequest, Operation>
      abandonInstancesSettings() {
    return abandonInstancesSettings;
  }

  /** Returns the object with the settings used for calls to abandonInstances. */
  public OperationCallSettings<
          AbandonInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      abandonInstancesOperationSettings() {
    return abandonInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to applyUpdatesToInstances. */
  public UnaryCallSettings<ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation>
      applyUpdatesToInstancesSettings() {
    return applyUpdatesToInstancesSettings;
  }

  /** Returns the object with the settings used for calls to applyUpdatesToInstances. */
  public OperationCallSettings<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      applyUpdatesToInstancesOperationSettings() {
    return applyUpdatesToInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to createInstances. */
  public UnaryCallSettings<CreateInstancesRegionInstanceGroupManagerRequest, Operation>
      createInstancesSettings() {
    return createInstancesSettings;
  }

  /** Returns the object with the settings used for calls to createInstances. */
  public OperationCallSettings<
          CreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      createInstancesOperationSettings() {
    return createInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteRegionInstanceGroupManagerRequest, Operation> deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public OperationCallSettings<DeleteRegionInstanceGroupManagerRequest, Operation, Operation>
      deleteOperationSettings() {
    return deleteOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstances. */
  public UnaryCallSettings<DeleteInstancesRegionInstanceGroupManagerRequest, Operation>
      deleteInstancesSettings() {
    return deleteInstancesSettings;
  }

  /** Returns the object with the settings used for calls to deleteInstances. */
  public OperationCallSettings<
          DeleteInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      deleteInstancesOperationSettings() {
    return deleteInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to deletePerInstanceConfigs. */
  public UnaryCallSettings<DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      deletePerInstanceConfigsSettings() {
    return deletePerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to deletePerInstanceConfigs. */
  public OperationCallSettings<
          DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      deletePerInstanceConfigsOperationSettings() {
    return deletePerInstanceConfigsOperationSettings;
  }

  /** Returns the object with the settings used for calls to get. */
  public UnaryCallSettings<GetRegionInstanceGroupManagerRequest, InstanceGroupManager>
      getSettings() {
    return getSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertRegionInstanceGroupManagerRequest, Operation> insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public OperationCallSettings<InsertRegionInstanceGroupManagerRequest, Operation, Operation>
      insertOperationSettings() {
    return insertOperationSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<
          ListRegionInstanceGroupManagersRequest, RegionInstanceGroupManagerList, ListPagedResponse>
      listSettings() {
    return listSettings;
  }

  /** Returns the object with the settings used for calls to listErrors. */
  public PagedCallSettings<
          ListErrorsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListErrorsResponse,
          ListErrorsPagedResponse>
      listErrorsSettings() {
    return listErrorsSettings;
  }

  /** Returns the object with the settings used for calls to listManagedInstances. */
  public PagedCallSettings<
          ListManagedInstancesRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstancesResponse,
          ListManagedInstancesPagedResponse>
      listManagedInstancesSettings() {
    return listManagedInstancesSettings;
  }

  /** Returns the object with the settings used for calls to listPerInstanceConfigs. */
  public PagedCallSettings<
          ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp,
          ListPerInstanceConfigsPagedResponse>
      listPerInstanceConfigsSettings() {
    return listPerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public UnaryCallSettings<PatchRegionInstanceGroupManagerRequest, Operation> patchSettings() {
    return patchSettings;
  }

  /** Returns the object with the settings used for calls to patch. */
  public OperationCallSettings<PatchRegionInstanceGroupManagerRequest, Operation, Operation>
      patchOperationSettings() {
    return patchOperationSettings;
  }

  /** Returns the object with the settings used for calls to patchPerInstanceConfigs. */
  public UnaryCallSettings<PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      patchPerInstanceConfigsSettings() {
    return patchPerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to patchPerInstanceConfigs. */
  public OperationCallSettings<
          PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      patchPerInstanceConfigsOperationSettings() {
    return patchPerInstanceConfigsOperationSettings;
  }

  /** Returns the object with the settings used for calls to recreateInstances. */
  public UnaryCallSettings<RecreateInstancesRegionInstanceGroupManagerRequest, Operation>
      recreateInstancesSettings() {
    return recreateInstancesSettings;
  }

  /** Returns the object with the settings used for calls to recreateInstances. */
  public OperationCallSettings<
          RecreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      recreateInstancesOperationSettings() {
    return recreateInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to resize. */
  public UnaryCallSettings<ResizeRegionInstanceGroupManagerRequest, Operation> resizeSettings() {
    return resizeSettings;
  }

  /** Returns the object with the settings used for calls to resize. */
  public OperationCallSettings<ResizeRegionInstanceGroupManagerRequest, Operation, Operation>
      resizeOperationSettings() {
    return resizeOperationSettings;
  }

  /** Returns the object with the settings used for calls to resumeInstances. */
  public UnaryCallSettings<ResumeInstancesRegionInstanceGroupManagerRequest, Operation>
      resumeInstancesSettings() {
    return resumeInstancesSettings;
  }

  /** Returns the object with the settings used for calls to resumeInstances. */
  public OperationCallSettings<
          ResumeInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      resumeInstancesOperationSettings() {
    return resumeInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to setInstanceTemplate. */
  public UnaryCallSettings<SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation>
      setInstanceTemplateSettings() {
    return setInstanceTemplateSettings;
  }

  /** Returns the object with the settings used for calls to setInstanceTemplate. */
  public OperationCallSettings<
          SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation, Operation>
      setInstanceTemplateOperationSettings() {
    return setInstanceTemplateOperationSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPools. */
  public UnaryCallSettings<SetTargetPoolsRegionInstanceGroupManagerRequest, Operation>
      setTargetPoolsSettings() {
    return setTargetPoolsSettings;
  }

  /** Returns the object with the settings used for calls to setTargetPools. */
  public OperationCallSettings<
          SetTargetPoolsRegionInstanceGroupManagerRequest, Operation, Operation>
      setTargetPoolsOperationSettings() {
    return setTargetPoolsOperationSettings;
  }

  /** Returns the object with the settings used for calls to startInstances. */
  public UnaryCallSettings<StartInstancesRegionInstanceGroupManagerRequest, Operation>
      startInstancesSettings() {
    return startInstancesSettings;
  }

  /** Returns the object with the settings used for calls to startInstances. */
  public OperationCallSettings<
          StartInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      startInstancesOperationSettings() {
    return startInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to stopInstances. */
  public UnaryCallSettings<StopInstancesRegionInstanceGroupManagerRequest, Operation>
      stopInstancesSettings() {
    return stopInstancesSettings;
  }

  /** Returns the object with the settings used for calls to stopInstances. */
  public OperationCallSettings<StopInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      stopInstancesOperationSettings() {
    return stopInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to suspendInstances. */
  public UnaryCallSettings<SuspendInstancesRegionInstanceGroupManagerRequest, Operation>
      suspendInstancesSettings() {
    return suspendInstancesSettings;
  }

  /** Returns the object with the settings used for calls to suspendInstances. */
  public OperationCallSettings<
          SuspendInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
      suspendInstancesOperationSettings() {
    return suspendInstancesOperationSettings;
  }

  /** Returns the object with the settings used for calls to updatePerInstanceConfigs. */
  public UnaryCallSettings<UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
      updatePerInstanceConfigsSettings() {
    return updatePerInstanceConfigsSettings;
  }

  /** Returns the object with the settings used for calls to updatePerInstanceConfigs. */
  public OperationCallSettings<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
      updatePerInstanceConfigsOperationSettings() {
    return updatePerInstanceConfigsOperationSettings;
  }

  public RegionInstanceGroupManagersStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonRegionInstanceGroupManagersStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "compute";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "compute.mtls.googleapis.com:443";
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

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RegionInstanceGroupManagersStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
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

  protected RegionInstanceGroupManagersStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    abandonInstancesSettings = settingsBuilder.abandonInstancesSettings().build();
    abandonInstancesOperationSettings = settingsBuilder.abandonInstancesOperationSettings().build();
    applyUpdatesToInstancesSettings = settingsBuilder.applyUpdatesToInstancesSettings().build();
    applyUpdatesToInstancesOperationSettings =
        settingsBuilder.applyUpdatesToInstancesOperationSettings().build();
    createInstancesSettings = settingsBuilder.createInstancesSettings().build();
    createInstancesOperationSettings = settingsBuilder.createInstancesOperationSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    deleteOperationSettings = settingsBuilder.deleteOperationSettings().build();
    deleteInstancesSettings = settingsBuilder.deleteInstancesSettings().build();
    deleteInstancesOperationSettings = settingsBuilder.deleteInstancesOperationSettings().build();
    deletePerInstanceConfigsSettings = settingsBuilder.deletePerInstanceConfigsSettings().build();
    deletePerInstanceConfigsOperationSettings =
        settingsBuilder.deletePerInstanceConfigsOperationSettings().build();
    getSettings = settingsBuilder.getSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    insertOperationSettings = settingsBuilder.insertOperationSettings().build();
    listSettings = settingsBuilder.listSettings().build();
    listErrorsSettings = settingsBuilder.listErrorsSettings().build();
    listManagedInstancesSettings = settingsBuilder.listManagedInstancesSettings().build();
    listPerInstanceConfigsSettings = settingsBuilder.listPerInstanceConfigsSettings().build();
    patchSettings = settingsBuilder.patchSettings().build();
    patchOperationSettings = settingsBuilder.patchOperationSettings().build();
    patchPerInstanceConfigsSettings = settingsBuilder.patchPerInstanceConfigsSettings().build();
    patchPerInstanceConfigsOperationSettings =
        settingsBuilder.patchPerInstanceConfigsOperationSettings().build();
    recreateInstancesSettings = settingsBuilder.recreateInstancesSettings().build();
    recreateInstancesOperationSettings =
        settingsBuilder.recreateInstancesOperationSettings().build();
    resizeSettings = settingsBuilder.resizeSettings().build();
    resizeOperationSettings = settingsBuilder.resizeOperationSettings().build();
    resumeInstancesSettings = settingsBuilder.resumeInstancesSettings().build();
    resumeInstancesOperationSettings = settingsBuilder.resumeInstancesOperationSettings().build();
    setInstanceTemplateSettings = settingsBuilder.setInstanceTemplateSettings().build();
    setInstanceTemplateOperationSettings =
        settingsBuilder.setInstanceTemplateOperationSettings().build();
    setTargetPoolsSettings = settingsBuilder.setTargetPoolsSettings().build();
    setTargetPoolsOperationSettings = settingsBuilder.setTargetPoolsOperationSettings().build();
    startInstancesSettings = settingsBuilder.startInstancesSettings().build();
    startInstancesOperationSettings = settingsBuilder.startInstancesOperationSettings().build();
    stopInstancesSettings = settingsBuilder.stopInstancesSettings().build();
    stopInstancesOperationSettings = settingsBuilder.stopInstancesOperationSettings().build();
    suspendInstancesSettings = settingsBuilder.suspendInstancesSettings().build();
    suspendInstancesOperationSettings = settingsBuilder.suspendInstancesOperationSettings().build();
    updatePerInstanceConfigsSettings = settingsBuilder.updatePerInstanceConfigsSettings().build();
    updatePerInstanceConfigsOperationSettings =
        settingsBuilder.updatePerInstanceConfigsOperationSettings().build();
  }

  /** Builder for RegionInstanceGroupManagersStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RegionInstanceGroupManagersStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<
            AbandonInstancesRegionInstanceGroupManagerRequest, Operation>
        abandonInstancesSettings;
    private final OperationCallSettings.Builder<
            AbandonInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        abandonInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation>
        applyUpdatesToInstancesSettings;
    private final OperationCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        applyUpdatesToInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            CreateInstancesRegionInstanceGroupManagerRequest, Operation>
        createInstancesSettings;
    private final OperationCallSettings.Builder<
            CreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        createInstancesOperationSettings;
    private final UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerRequest, Operation>
        deleteSettings;
    private final OperationCallSettings.Builder<
            DeleteRegionInstanceGroupManagerRequest, Operation, Operation>
        deleteOperationSettings;
    private final UnaryCallSettings.Builder<
            DeleteInstancesRegionInstanceGroupManagerRequest, Operation>
        deleteInstancesSettings;
    private final OperationCallSettings.Builder<
            DeleteInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        deleteInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        deletePerInstanceConfigsSettings;
    private final OperationCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        deletePerInstanceConfigsOperationSettings;
    private final UnaryCallSettings.Builder<
            GetRegionInstanceGroupManagerRequest, InstanceGroupManager>
        getSettings;
    private final UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerRequest, Operation>
        insertSettings;
    private final OperationCallSettings.Builder<
            InsertRegionInstanceGroupManagerRequest, Operation, Operation>
        insertOperationSettings;
    private final PagedCallSettings.Builder<
            ListRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagerList,
            ListPagedResponse>
        listSettings;
    private final PagedCallSettings.Builder<
            ListErrorsRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListErrorsResponse,
            ListErrorsPagedResponse>
        listErrorsSettings;
    private final PagedCallSettings.Builder<
            ListManagedInstancesRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListInstancesResponse,
            ListManagedInstancesPagedResponse>
        listManagedInstancesSettings;
    private final PagedCallSettings.Builder<
            ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListInstanceConfigsResp,
            ListPerInstanceConfigsPagedResponse>
        listPerInstanceConfigsSettings;
    private final UnaryCallSettings.Builder<PatchRegionInstanceGroupManagerRequest, Operation>
        patchSettings;
    private final OperationCallSettings.Builder<
            PatchRegionInstanceGroupManagerRequest, Operation, Operation>
        patchOperationSettings;
    private final UnaryCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        patchPerInstanceConfigsSettings;
    private final OperationCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        patchPerInstanceConfigsOperationSettings;
    private final UnaryCallSettings.Builder<
            RecreateInstancesRegionInstanceGroupManagerRequest, Operation>
        recreateInstancesSettings;
    private final OperationCallSettings.Builder<
            RecreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        recreateInstancesOperationSettings;
    private final UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerRequest, Operation>
        resizeSettings;
    private final OperationCallSettings.Builder<
            ResizeRegionInstanceGroupManagerRequest, Operation, Operation>
        resizeOperationSettings;
    private final UnaryCallSettings.Builder<
            ResumeInstancesRegionInstanceGroupManagerRequest, Operation>
        resumeInstancesSettings;
    private final OperationCallSettings.Builder<
            ResumeInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        resumeInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation>
        setInstanceTemplateSettings;
    private final OperationCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation, Operation>
        setInstanceTemplateOperationSettings;
    private final UnaryCallSettings.Builder<
            SetTargetPoolsRegionInstanceGroupManagerRequest, Operation>
        setTargetPoolsSettings;
    private final OperationCallSettings.Builder<
            SetTargetPoolsRegionInstanceGroupManagerRequest, Operation, Operation>
        setTargetPoolsOperationSettings;
    private final UnaryCallSettings.Builder<
            StartInstancesRegionInstanceGroupManagerRequest, Operation>
        startInstancesSettings;
    private final OperationCallSettings.Builder<
            StartInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        startInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            StopInstancesRegionInstanceGroupManagerRequest, Operation>
        stopInstancesSettings;
    private final OperationCallSettings.Builder<
            StopInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        stopInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            SuspendInstancesRegionInstanceGroupManagerRequest, Operation>
        suspendInstancesSettings;
    private final OperationCallSettings.Builder<
            SuspendInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        suspendInstancesOperationSettings;
    private final UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        updatePerInstanceConfigsSettings;
    private final OperationCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        updatePerInstanceConfigsOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      abandonInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      abandonInstancesOperationSettings = OperationCallSettings.newBuilder();
      applyUpdatesToInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      applyUpdatesToInstancesOperationSettings = OperationCallSettings.newBuilder();
      createInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createInstancesOperationSettings = OperationCallSettings.newBuilder();
      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteOperationSettings = OperationCallSettings.newBuilder();
      deleteInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteInstancesOperationSettings = OperationCallSettings.newBuilder();
      deletePerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deletePerInstanceConfigsOperationSettings = OperationCallSettings.newBuilder();
      getSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      insertOperationSettings = OperationCallSettings.newBuilder();
      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);
      listErrorsSettings = PagedCallSettings.newBuilder(LIST_ERRORS_PAGE_STR_FACT);
      listManagedInstancesSettings =
          PagedCallSettings.newBuilder(LIST_MANAGED_INSTANCES_PAGE_STR_FACT);
      listPerInstanceConfigsSettings =
          PagedCallSettings.newBuilder(LIST_PER_INSTANCE_CONFIGS_PAGE_STR_FACT);
      patchSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchOperationSettings = OperationCallSettings.newBuilder();
      patchPerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      patchPerInstanceConfigsOperationSettings = OperationCallSettings.newBuilder();
      recreateInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      recreateInstancesOperationSettings = OperationCallSettings.newBuilder();
      resizeSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resizeOperationSettings = OperationCallSettings.newBuilder();
      resumeInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      resumeInstancesOperationSettings = OperationCallSettings.newBuilder();
      setInstanceTemplateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setInstanceTemplateOperationSettings = OperationCallSettings.newBuilder();
      setTargetPoolsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setTargetPoolsOperationSettings = OperationCallSettings.newBuilder();
      startInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startInstancesOperationSettings = OperationCallSettings.newBuilder();
      stopInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      stopInstancesOperationSettings = OperationCallSettings.newBuilder();
      suspendInstancesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      suspendInstancesOperationSettings = OperationCallSettings.newBuilder();
      updatePerInstanceConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updatePerInstanceConfigsOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesSettings,
              applyUpdatesToInstancesSettings,
              createInstancesSettings,
              deleteSettings,
              deleteInstancesSettings,
              deletePerInstanceConfigsSettings,
              getSettings,
              insertSettings,
              listSettings,
              listErrorsSettings,
              listManagedInstancesSettings,
              listPerInstanceConfigsSettings,
              patchSettings,
              patchPerInstanceConfigsSettings,
              recreateInstancesSettings,
              resizeSettings,
              resumeInstancesSettings,
              setInstanceTemplateSettings,
              setTargetPoolsSettings,
              startInstancesSettings,
              stopInstancesSettings,
              suspendInstancesSettings,
              updatePerInstanceConfigsSettings);
      initDefaults(this);
    }

    protected Builder(RegionInstanceGroupManagersStubSettings settings) {
      super(settings);

      abandonInstancesSettings = settings.abandonInstancesSettings.toBuilder();
      abandonInstancesOperationSettings = settings.abandonInstancesOperationSettings.toBuilder();
      applyUpdatesToInstancesSettings = settings.applyUpdatesToInstancesSettings.toBuilder();
      applyUpdatesToInstancesOperationSettings =
          settings.applyUpdatesToInstancesOperationSettings.toBuilder();
      createInstancesSettings = settings.createInstancesSettings.toBuilder();
      createInstancesOperationSettings = settings.createInstancesOperationSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      deleteOperationSettings = settings.deleteOperationSettings.toBuilder();
      deleteInstancesSettings = settings.deleteInstancesSettings.toBuilder();
      deleteInstancesOperationSettings = settings.deleteInstancesOperationSettings.toBuilder();
      deletePerInstanceConfigsSettings = settings.deletePerInstanceConfigsSettings.toBuilder();
      deletePerInstanceConfigsOperationSettings =
          settings.deletePerInstanceConfigsOperationSettings.toBuilder();
      getSettings = settings.getSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      insertOperationSettings = settings.insertOperationSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();
      listErrorsSettings = settings.listErrorsSettings.toBuilder();
      listManagedInstancesSettings = settings.listManagedInstancesSettings.toBuilder();
      listPerInstanceConfigsSettings = settings.listPerInstanceConfigsSettings.toBuilder();
      patchSettings = settings.patchSettings.toBuilder();
      patchOperationSettings = settings.patchOperationSettings.toBuilder();
      patchPerInstanceConfigsSettings = settings.patchPerInstanceConfigsSettings.toBuilder();
      patchPerInstanceConfigsOperationSettings =
          settings.patchPerInstanceConfigsOperationSettings.toBuilder();
      recreateInstancesSettings = settings.recreateInstancesSettings.toBuilder();
      recreateInstancesOperationSettings = settings.recreateInstancesOperationSettings.toBuilder();
      resizeSettings = settings.resizeSettings.toBuilder();
      resizeOperationSettings = settings.resizeOperationSettings.toBuilder();
      resumeInstancesSettings = settings.resumeInstancesSettings.toBuilder();
      resumeInstancesOperationSettings = settings.resumeInstancesOperationSettings.toBuilder();
      setInstanceTemplateSettings = settings.setInstanceTemplateSettings.toBuilder();
      setInstanceTemplateOperationSettings =
          settings.setInstanceTemplateOperationSettings.toBuilder();
      setTargetPoolsSettings = settings.setTargetPoolsSettings.toBuilder();
      setTargetPoolsOperationSettings = settings.setTargetPoolsOperationSettings.toBuilder();
      startInstancesSettings = settings.startInstancesSettings.toBuilder();
      startInstancesOperationSettings = settings.startInstancesOperationSettings.toBuilder();
      stopInstancesSettings = settings.stopInstancesSettings.toBuilder();
      stopInstancesOperationSettings = settings.stopInstancesOperationSettings.toBuilder();
      suspendInstancesSettings = settings.suspendInstancesSettings.toBuilder();
      suspendInstancesOperationSettings = settings.suspendInstancesOperationSettings.toBuilder();
      updatePerInstanceConfigsSettings = settings.updatePerInstanceConfigsSettings.toBuilder();
      updatePerInstanceConfigsOperationSettings =
          settings.updatePerInstanceConfigsOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              abandonInstancesSettings,
              applyUpdatesToInstancesSettings,
              createInstancesSettings,
              deleteSettings,
              deleteInstancesSettings,
              deletePerInstanceConfigsSettings,
              getSettings,
              insertSettings,
              listSettings,
              listErrorsSettings,
              listManagedInstancesSettings,
              listPerInstanceConfigsSettings,
              patchSettings,
              patchPerInstanceConfigsSettings,
              recreateInstancesSettings,
              resizeSettings,
              resumeInstancesSettings,
              setInstanceTemplateSettings,
              setTargetPoolsSettings,
              startInstancesSettings,
              stopInstancesSettings,
              suspendInstancesSettings,
              updatePerInstanceConfigsSettings);
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

    private static Builder initDefaults(Builder builder) {
      builder
          .abandonInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .applyUpdatesToInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deletePerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listErrorsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listManagedInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listPerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .patchSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .patchPerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .recreateInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .resizeSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .resumeInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setInstanceTemplateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .setTargetPoolsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .startInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .stopInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .suspendInstancesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updatePerInstanceConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .abandonInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<AbandonInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .applyUpdatesToInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .createInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .deleteOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .deleteInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .deletePerInstanceConfigsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .insertOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .patchOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .patchPerInstanceConfigsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .recreateInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RecreateInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .resizeOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ResizeRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .resumeInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<ResumeInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .setInstanceTemplateOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetInstanceTemplateRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .setTargetPoolsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SetTargetPoolsRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .startInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StartInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .stopInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<StopInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .suspendInstancesOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<SuspendInstancesRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
                      .build()));

      builder
          .updatePerInstanceConfigsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, OperationSnapshot>
                      newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelayDuration(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelayDuration(Duration.ofMillis(20000L))
                      .setInitialRpcTimeoutDuration(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeoutDuration(Duration.ZERO)
                      .setTotalTimeoutDuration(Duration.ofMillis(600000L))
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

    /** Returns the builder for the settings used for calls to abandonInstances. */
    public UnaryCallSettings.Builder<AbandonInstancesRegionInstanceGroupManagerRequest, Operation>
        abandonInstancesSettings() {
      return abandonInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to abandonInstances. */
    public OperationCallSettings.Builder<
            AbandonInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        abandonInstancesOperationSettings() {
      return abandonInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to applyUpdatesToInstances. */
    public UnaryCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation>
        applyUpdatesToInstancesSettings() {
      return applyUpdatesToInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to applyUpdatesToInstances. */
    public OperationCallSettings.Builder<
            ApplyUpdatesToInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        applyUpdatesToInstancesOperationSettings() {
      return applyUpdatesToInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to createInstances. */
    public UnaryCallSettings.Builder<CreateInstancesRegionInstanceGroupManagerRequest, Operation>
        createInstancesSettings() {
      return createInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to createInstances. */
    public OperationCallSettings.Builder<
            CreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        createInstancesOperationSettings() {
      return createInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteRegionInstanceGroupManagerRequest, Operation>
        deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public OperationCallSettings.Builder<
            DeleteRegionInstanceGroupManagerRequest, Operation, Operation>
        deleteOperationSettings() {
      return deleteOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstances. */
    public UnaryCallSettings.Builder<DeleteInstancesRegionInstanceGroupManagerRequest, Operation>
        deleteInstancesSettings() {
      return deleteInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to deleteInstances. */
    public OperationCallSettings.Builder<
            DeleteInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        deleteInstancesOperationSettings() {
      return deleteInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deletePerInstanceConfigs. */
    public UnaryCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        deletePerInstanceConfigsSettings() {
      return deletePerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to deletePerInstanceConfigs. */
    public OperationCallSettings.Builder<
            DeletePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        deletePerInstanceConfigsOperationSettings() {
      return deletePerInstanceConfigsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to get. */
    public UnaryCallSettings.Builder<GetRegionInstanceGroupManagerRequest, InstanceGroupManager>
        getSettings() {
      return getSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertRegionInstanceGroupManagerRequest, Operation>
        insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public OperationCallSettings.Builder<
            InsertRegionInstanceGroupManagerRequest, Operation, Operation>
        insertOperationSettings() {
      return insertOperationSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<
            ListRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagerList,
            ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    /** Returns the builder for the settings used for calls to listErrors. */
    public PagedCallSettings.Builder<
            ListErrorsRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListErrorsResponse,
            ListErrorsPagedResponse>
        listErrorsSettings() {
      return listErrorsSettings;
    }

    /** Returns the builder for the settings used for calls to listManagedInstances. */
    public PagedCallSettings.Builder<
            ListManagedInstancesRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListInstancesResponse,
            ListManagedInstancesPagedResponse>
        listManagedInstancesSettings() {
      return listManagedInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to listPerInstanceConfigs. */
    public PagedCallSettings.Builder<
            ListPerInstanceConfigsRegionInstanceGroupManagersRequest,
            RegionInstanceGroupManagersListInstanceConfigsResp,
            ListPerInstanceConfigsPagedResponse>
        listPerInstanceConfigsSettings() {
      return listPerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public UnaryCallSettings.Builder<PatchRegionInstanceGroupManagerRequest, Operation>
        patchSettings() {
      return patchSettings;
    }

    /** Returns the builder for the settings used for calls to patch. */
    public OperationCallSettings.Builder<
            PatchRegionInstanceGroupManagerRequest, Operation, Operation>
        patchOperationSettings() {
      return patchOperationSettings;
    }

    /** Returns the builder for the settings used for calls to patchPerInstanceConfigs. */
    public UnaryCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        patchPerInstanceConfigsSettings() {
      return patchPerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to patchPerInstanceConfigs. */
    public OperationCallSettings.Builder<
            PatchPerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        patchPerInstanceConfigsOperationSettings() {
      return patchPerInstanceConfigsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to recreateInstances. */
    public UnaryCallSettings.Builder<RecreateInstancesRegionInstanceGroupManagerRequest, Operation>
        recreateInstancesSettings() {
      return recreateInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to recreateInstances. */
    public OperationCallSettings.Builder<
            RecreateInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        recreateInstancesOperationSettings() {
      return recreateInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to resize. */
    public UnaryCallSettings.Builder<ResizeRegionInstanceGroupManagerRequest, Operation>
        resizeSettings() {
      return resizeSettings;
    }

    /** Returns the builder for the settings used for calls to resize. */
    public OperationCallSettings.Builder<
            ResizeRegionInstanceGroupManagerRequest, Operation, Operation>
        resizeOperationSettings() {
      return resizeOperationSettings;
    }

    /** Returns the builder for the settings used for calls to resumeInstances. */
    public UnaryCallSettings.Builder<ResumeInstancesRegionInstanceGroupManagerRequest, Operation>
        resumeInstancesSettings() {
      return resumeInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to resumeInstances. */
    public OperationCallSettings.Builder<
            ResumeInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        resumeInstancesOperationSettings() {
      return resumeInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setInstanceTemplate. */
    public UnaryCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation>
        setInstanceTemplateSettings() {
      return setInstanceTemplateSettings;
    }

    /** Returns the builder for the settings used for calls to setInstanceTemplate. */
    public OperationCallSettings.Builder<
            SetInstanceTemplateRegionInstanceGroupManagerRequest, Operation, Operation>
        setInstanceTemplateOperationSettings() {
      return setInstanceTemplateOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setTargetPools. */
    public UnaryCallSettings.Builder<SetTargetPoolsRegionInstanceGroupManagerRequest, Operation>
        setTargetPoolsSettings() {
      return setTargetPoolsSettings;
    }

    /** Returns the builder for the settings used for calls to setTargetPools. */
    public OperationCallSettings.Builder<
            SetTargetPoolsRegionInstanceGroupManagerRequest, Operation, Operation>
        setTargetPoolsOperationSettings() {
      return setTargetPoolsOperationSettings;
    }

    /** Returns the builder for the settings used for calls to startInstances. */
    public UnaryCallSettings.Builder<StartInstancesRegionInstanceGroupManagerRequest, Operation>
        startInstancesSettings() {
      return startInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to startInstances. */
    public OperationCallSettings.Builder<
            StartInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        startInstancesOperationSettings() {
      return startInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to stopInstances. */
    public UnaryCallSettings.Builder<StopInstancesRegionInstanceGroupManagerRequest, Operation>
        stopInstancesSettings() {
      return stopInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to stopInstances. */
    public OperationCallSettings.Builder<
            StopInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        stopInstancesOperationSettings() {
      return stopInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to suspendInstances. */
    public UnaryCallSettings.Builder<SuspendInstancesRegionInstanceGroupManagerRequest, Operation>
        suspendInstancesSettings() {
      return suspendInstancesSettings;
    }

    /** Returns the builder for the settings used for calls to suspendInstances. */
    public OperationCallSettings.Builder<
            SuspendInstancesRegionInstanceGroupManagerRequest, Operation, Operation>
        suspendInstancesOperationSettings() {
      return suspendInstancesOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updatePerInstanceConfigs. */
    public UnaryCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation>
        updatePerInstanceConfigsSettings() {
      return updatePerInstanceConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to updatePerInstanceConfigs. */
    public OperationCallSettings.Builder<
            UpdatePerInstanceConfigsRegionInstanceGroupManagerRequest, Operation, Operation>
        updatePerInstanceConfigsOperationSettings() {
      return updatePerInstanceConfigsOperationSettings;
    }

    @Override
    public RegionInstanceGroupManagersStubSettings build() throws IOException {
      return new RegionInstanceGroupManagersStubSettings(this);
    }
  }
}
