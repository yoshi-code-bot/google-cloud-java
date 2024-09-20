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

package com.google.cloud.securitycenter.v1.stub;

import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.GroupFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAssetsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListAttackPathsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListBigQueryExportsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListDescendantEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListEffectiveEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListEventThreatDetectionCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListFindingsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListMuteConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListNotificationConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListResourceValueConfigsPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListSecurityHealthAnalyticsCustomModulesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListSourcesPagedResponse;
import static com.google.cloud.securitycenter.v1.SecurityCenterClient.ListValuedResourcesPagedResponse;

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
import com.google.cloud.securitycenter.v1.AttackPath;
import com.google.cloud.securitycenter.v1.BatchCreateResourceValueConfigsRequest;
import com.google.cloud.securitycenter.v1.BatchCreateResourceValueConfigsResponse;
import com.google.cloud.securitycenter.v1.BigQueryExport;
import com.google.cloud.securitycenter.v1.BulkMuteFindingsRequest;
import com.google.cloud.securitycenter.v1.BulkMuteFindingsResponse;
import com.google.cloud.securitycenter.v1.CreateBigQueryExportRequest;
import com.google.cloud.securitycenter.v1.CreateEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.CreateFindingRequest;
import com.google.cloud.securitycenter.v1.CreateMuteConfigRequest;
import com.google.cloud.securitycenter.v1.CreateNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.CreateSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.CreateSourceRequest;
import com.google.cloud.securitycenter.v1.DeleteBigQueryExportRequest;
import com.google.cloud.securitycenter.v1.DeleteEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.DeleteMuteConfigRequest;
import com.google.cloud.securitycenter.v1.DeleteNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.DeleteResourceValueConfigRequest;
import com.google.cloud.securitycenter.v1.DeleteSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.EffectiveEventThreatDetectionCustomModule;
import com.google.cloud.securitycenter.v1.EffectiveSecurityHealthAnalyticsCustomModule;
import com.google.cloud.securitycenter.v1.EventThreatDetectionCustomModule;
import com.google.cloud.securitycenter.v1.ExternalSystem;
import com.google.cloud.securitycenter.v1.Finding;
import com.google.cloud.securitycenter.v1.GetBigQueryExportRequest;
import com.google.cloud.securitycenter.v1.GetEffectiveEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.GetEffectiveSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.GetEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.GetMuteConfigRequest;
import com.google.cloud.securitycenter.v1.GetNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.GetOrganizationSettingsRequest;
import com.google.cloud.securitycenter.v1.GetResourceValueConfigRequest;
import com.google.cloud.securitycenter.v1.GetSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.GetSimulationRequest;
import com.google.cloud.securitycenter.v1.GetSourceRequest;
import com.google.cloud.securitycenter.v1.GetValuedResourceRequest;
import com.google.cloud.securitycenter.v1.GroupAssetsRequest;
import com.google.cloud.securitycenter.v1.GroupAssetsResponse;
import com.google.cloud.securitycenter.v1.GroupFindingsRequest;
import com.google.cloud.securitycenter.v1.GroupFindingsResponse;
import com.google.cloud.securitycenter.v1.GroupResult;
import com.google.cloud.securitycenter.v1.ListAssetsRequest;
import com.google.cloud.securitycenter.v1.ListAssetsResponse;
import com.google.cloud.securitycenter.v1.ListAttackPathsRequest;
import com.google.cloud.securitycenter.v1.ListAttackPathsResponse;
import com.google.cloud.securitycenter.v1.ListBigQueryExportsRequest;
import com.google.cloud.securitycenter.v1.ListBigQueryExportsResponse;
import com.google.cloud.securitycenter.v1.ListDescendantEventThreatDetectionCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListDescendantEventThreatDetectionCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListDescendantSecurityHealthAnalyticsCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListDescendantSecurityHealthAnalyticsCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListEffectiveEventThreatDetectionCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListEffectiveEventThreatDetectionCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListEffectiveSecurityHealthAnalyticsCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListEffectiveSecurityHealthAnalyticsCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListEventThreatDetectionCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListEventThreatDetectionCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListFindingsRequest;
import com.google.cloud.securitycenter.v1.ListFindingsResponse;
import com.google.cloud.securitycenter.v1.ListMuteConfigsRequest;
import com.google.cloud.securitycenter.v1.ListMuteConfigsResponse;
import com.google.cloud.securitycenter.v1.ListNotificationConfigsRequest;
import com.google.cloud.securitycenter.v1.ListNotificationConfigsResponse;
import com.google.cloud.securitycenter.v1.ListResourceValueConfigsRequest;
import com.google.cloud.securitycenter.v1.ListResourceValueConfigsResponse;
import com.google.cloud.securitycenter.v1.ListSecurityHealthAnalyticsCustomModulesRequest;
import com.google.cloud.securitycenter.v1.ListSecurityHealthAnalyticsCustomModulesResponse;
import com.google.cloud.securitycenter.v1.ListSourcesRequest;
import com.google.cloud.securitycenter.v1.ListSourcesResponse;
import com.google.cloud.securitycenter.v1.ListValuedResourcesRequest;
import com.google.cloud.securitycenter.v1.ListValuedResourcesResponse;
import com.google.cloud.securitycenter.v1.MuteConfig;
import com.google.cloud.securitycenter.v1.NotificationConfig;
import com.google.cloud.securitycenter.v1.OrganizationSettings;
import com.google.cloud.securitycenter.v1.ResourceValueConfig;
import com.google.cloud.securitycenter.v1.RunAssetDiscoveryRequest;
import com.google.cloud.securitycenter.v1.RunAssetDiscoveryResponse;
import com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomModule;
import com.google.cloud.securitycenter.v1.SecurityMarks;
import com.google.cloud.securitycenter.v1.SetFindingStateRequest;
import com.google.cloud.securitycenter.v1.SetMuteRequest;
import com.google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.SimulateSecurityHealthAnalyticsCustomModuleResponse;
import com.google.cloud.securitycenter.v1.Simulation;
import com.google.cloud.securitycenter.v1.Source;
import com.google.cloud.securitycenter.v1.UpdateBigQueryExportRequest;
import com.google.cloud.securitycenter.v1.UpdateEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.UpdateExternalSystemRequest;
import com.google.cloud.securitycenter.v1.UpdateFindingRequest;
import com.google.cloud.securitycenter.v1.UpdateMuteConfigRequest;
import com.google.cloud.securitycenter.v1.UpdateNotificationConfigRequest;
import com.google.cloud.securitycenter.v1.UpdateOrganizationSettingsRequest;
import com.google.cloud.securitycenter.v1.UpdateResourceValueConfigRequest;
import com.google.cloud.securitycenter.v1.UpdateSecurityHealthAnalyticsCustomModuleRequest;
import com.google.cloud.securitycenter.v1.UpdateSecurityMarksRequest;
import com.google.cloud.securitycenter.v1.UpdateSourceRequest;
import com.google.cloud.securitycenter.v1.ValidateEventThreatDetectionCustomModuleRequest;
import com.google.cloud.securitycenter.v1.ValidateEventThreatDetectionCustomModuleResponse;
import com.google.cloud.securitycenter.v1.ValuedResource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link SecurityCenterStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (securitycenter.googleapis.com) and default port (443) are
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
 * of createSecurityHealthAnalyticsCustomModule:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecurityCenterStubSettings.Builder securityCenterSettingsBuilder =
 *     SecurityCenterStubSettings.newBuilder();
 * securityCenterSettingsBuilder
 *     .createSecurityHealthAnalyticsCustomModuleSettings()
 *     .setRetrySettings(
 *         securityCenterSettingsBuilder
 *             .createSecurityHealthAnalyticsCustomModuleSettings()
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
 * SecurityCenterStubSettings securityCenterSettings = securityCenterSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 *
 * <p>To configure the RetrySettings of a Long Running Operation method, create an
 * OperationTimedPollAlgorithm object and update the RPC's polling algorithm. For example, to
 * configure the RetrySettings for bulkMuteFindings:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SecurityCenterStubSettings.Builder securityCenterSettingsBuilder =
 *     SecurityCenterStubSettings.newBuilder();
 * TimedRetryAlgorithm timedRetryAlgorithm =
 *     OperationalTimedPollAlgorithm.create(
 *         RetrySettings.newBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofMillis(500))
 *             .setRetryDelayMultiplier(1.5)
 *             .setMaxRetryDelay(Duration.ofMillis(5000))
 *             .setTotalTimeoutDuration(Duration.ofHours(24))
 *             .build());
 * securityCenterSettingsBuilder
 *     .createClusterOperationSettings()
 *     .setPollingAlgorithm(timedRetryAlgorithm)
 *     .build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class SecurityCenterStubSettings extends StubSettings<SecurityCenterStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<BulkMuteFindingsRequest, Operation> bulkMuteFindingsSettings;
  private final OperationCallSettings<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
      bulkMuteFindingsOperationSettings;
  private final UnaryCallSettings<
          CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      createSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<CreateSourceRequest, Source> createSourceSettings;
  private final UnaryCallSettings<CreateFindingRequest, Finding> createFindingSettings;
  private final UnaryCallSettings<CreateMuteConfigRequest, MuteConfig> createMuteConfigSettings;
  private final UnaryCallSettings<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigSettings;
  private final UnaryCallSettings<DeleteMuteConfigRequest, Empty> deleteMuteConfigSettings;
  private final UnaryCallSettings<DeleteNotificationConfigRequest, Empty>
      deleteNotificationConfigSettings;
  private final UnaryCallSettings<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
      deleteSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<GetSimulationRequest, Simulation> getSimulationSettings;
  private final UnaryCallSettings<GetValuedResourceRequest, ValuedResource>
      getValuedResourceSettings;
  private final UnaryCallSettings<GetBigQueryExportRequest, BigQueryExport>
      getBigQueryExportSettings;
  private final UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings;
  private final UnaryCallSettings<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings;
  private final UnaryCallSettings<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigSettings;
  private final UnaryCallSettings<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsSettings;
  private final UnaryCallSettings<
          GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
          EffectiveSecurityHealthAnalyticsCustomModule>
      getEffectiveSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<
          GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      getSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<GetSourceRequest, Source> getSourceSettings;
  private final PagedCallSettings<GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
      groupAssetsSettings;
  private final PagedCallSettings<
          GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
      groupFindingsSettings;
  private final PagedCallSettings<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
      listAssetsSettings;
  private final PagedCallSettings<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
          ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
      listDescendantSecurityHealthAnalyticsCustomModulesSettings;
  private final PagedCallSettings<
          ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      listFindingsSettings;
  private final PagedCallSettings<
          ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
      listMuteConfigsSettings;
  private final PagedCallSettings<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          ListNotificationConfigsPagedResponse>
      listNotificationConfigsSettings;
  private final PagedCallSettings<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
          ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
      listEffectiveSecurityHealthAnalyticsCustomModulesSettings;
  private final PagedCallSettings<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse,
          ListSecurityHealthAnalyticsCustomModulesPagedResponse>
      listSecurityHealthAnalyticsCustomModulesSettings;
  private final PagedCallSettings<ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
      listSourcesSettings;
  private final UnaryCallSettings<RunAssetDiscoveryRequest, Operation> runAssetDiscoverySettings;
  private final OperationCallSettings<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationSettings;
  private final UnaryCallSettings<SetFindingStateRequest, Finding> setFindingStateSettings;
  private final UnaryCallSettings<SetMuteRequest, Finding> setMuteSettings;
  private final UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings;
  private final UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings;
  private final UnaryCallSettings<
          SimulateSecurityHealthAnalyticsCustomModuleRequest,
          SimulateSecurityHealthAnalyticsCustomModuleResponse>
      simulateSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<UpdateExternalSystemRequest, ExternalSystem>
      updateExternalSystemSettings;
  private final UnaryCallSettings<UpdateFindingRequest, Finding> updateFindingSettings;
  private final UnaryCallSettings<UpdateMuteConfigRequest, MuteConfig> updateMuteConfigSettings;
  private final UnaryCallSettings<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigSettings;
  private final UnaryCallSettings<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsSettings;
  private final UnaryCallSettings<
          UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      updateSecurityHealthAnalyticsCustomModuleSettings;
  private final UnaryCallSettings<UpdateSourceRequest, Source> updateSourceSettings;
  private final UnaryCallSettings<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksSettings;
  private final UnaryCallSettings<CreateBigQueryExportRequest, BigQueryExport>
      createBigQueryExportSettings;
  private final UnaryCallSettings<DeleteBigQueryExportRequest, Empty> deleteBigQueryExportSettings;
  private final UnaryCallSettings<UpdateBigQueryExportRequest, BigQueryExport>
      updateBigQueryExportSettings;
  private final PagedCallSettings<
          ListBigQueryExportsRequest, ListBigQueryExportsResponse, ListBigQueryExportsPagedResponse>
      listBigQueryExportsSettings;
  private final UnaryCallSettings<
          CreateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      createEventThreatDetectionCustomModuleSettings;
  private final UnaryCallSettings<DeleteEventThreatDetectionCustomModuleRequest, Empty>
      deleteEventThreatDetectionCustomModuleSettings;
  private final UnaryCallSettings<
          GetEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      getEventThreatDetectionCustomModuleSettings;
  private final PagedCallSettings<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesResponse,
          ListDescendantEventThreatDetectionCustomModulesPagedResponse>
      listDescendantEventThreatDetectionCustomModulesSettings;
  private final PagedCallSettings<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesResponse,
          ListEventThreatDetectionCustomModulesPagedResponse>
      listEventThreatDetectionCustomModulesSettings;
  private final UnaryCallSettings<
          UpdateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      updateEventThreatDetectionCustomModuleSettings;
  private final UnaryCallSettings<
          ValidateEventThreatDetectionCustomModuleRequest,
          ValidateEventThreatDetectionCustomModuleResponse>
      validateEventThreatDetectionCustomModuleSettings;
  private final UnaryCallSettings<
          GetEffectiveEventThreatDetectionCustomModuleRequest,
          EffectiveEventThreatDetectionCustomModule>
      getEffectiveEventThreatDetectionCustomModuleSettings;
  private final PagedCallSettings<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesResponse,
          ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
      listEffectiveEventThreatDetectionCustomModulesSettings;
  private final UnaryCallSettings<
          BatchCreateResourceValueConfigsRequest, BatchCreateResourceValueConfigsResponse>
      batchCreateResourceValueConfigsSettings;
  private final UnaryCallSettings<DeleteResourceValueConfigRequest, Empty>
      deleteResourceValueConfigSettings;
  private final UnaryCallSettings<GetResourceValueConfigRequest, ResourceValueConfig>
      getResourceValueConfigSettings;
  private final PagedCallSettings<
          ListResourceValueConfigsRequest,
          ListResourceValueConfigsResponse,
          ListResourceValueConfigsPagedResponse>
      listResourceValueConfigsSettings;
  private final UnaryCallSettings<UpdateResourceValueConfigRequest, ResourceValueConfig>
      updateResourceValueConfigSettings;
  private final PagedCallSettings<
          ListValuedResourcesRequest, ListValuedResourcesResponse, ListValuedResourcesPagedResponse>
      listValuedResourcesSettings;
  private final PagedCallSettings<
          ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>
      listAttackPathsSettings;

  private static final PagedListDescriptor<GroupAssetsRequest, GroupAssetsResponse, GroupResult>
      GROUP_ASSETS_PAGE_STR_DESC =
          new PagedListDescriptor<GroupAssetsRequest, GroupAssetsResponse, GroupResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public GroupAssetsRequest injectToken(GroupAssetsRequest payload, String token) {
              return GroupAssetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public GroupAssetsRequest injectPageSize(GroupAssetsRequest payload, int pageSize) {
              return GroupAssetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(GroupAssetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(GroupAssetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<GroupResult> extractResources(GroupAssetsResponse payload) {
              return payload.getGroupByResultsList();
            }
          };

  private static final PagedListDescriptor<GroupFindingsRequest, GroupFindingsResponse, GroupResult>
      GROUP_FINDINGS_PAGE_STR_DESC =
          new PagedListDescriptor<GroupFindingsRequest, GroupFindingsResponse, GroupResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public GroupFindingsRequest injectToken(GroupFindingsRequest payload, String token) {
              return GroupFindingsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public GroupFindingsRequest injectPageSize(GroupFindingsRequest payload, int pageSize) {
              return GroupFindingsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(GroupFindingsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(GroupFindingsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<GroupResult> extractResources(GroupFindingsResponse payload) {
              return payload.getGroupByResultsList();
            }
          };

  private static final PagedListDescriptor<
          ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
      LIST_ASSETS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAssetsRequest injectToken(ListAssetsRequest payload, String token) {
              return ListAssetsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAssetsRequest injectPageSize(ListAssetsRequest payload, int pageSize) {
              return ListAssetsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAssetsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAssetsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ListAssetsResponse.ListAssetsResult> extractResources(
                ListAssetsResponse payload) {
              return payload.getListAssetsResultsList();
            }
          };

  private static final PagedListDescriptor<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
          SecurityHealthAnalyticsCustomModule>
      LIST_DESCENDANT_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
              ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
              SecurityHealthAnalyticsCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDescendantSecurityHealthAnalyticsCustomModulesRequest injectToken(
                ListDescendantSecurityHealthAnalyticsCustomModulesRequest payload, String token) {
              return ListDescendantSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListDescendantSecurityHealthAnalyticsCustomModulesRequest injectPageSize(
                ListDescendantSecurityHealthAnalyticsCustomModulesRequest payload, int pageSize) {
              return ListDescendantSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListDescendantSecurityHealthAnalyticsCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                ListDescendantSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SecurityHealthAnalyticsCustomModule> extractResources(
                ListDescendantSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getSecurityHealthAnalyticsCustomModulesList();
            }
          };

  private static final PagedListDescriptor<
          ListFindingsRequest, ListFindingsResponse, ListFindingsResponse.ListFindingsResult>
      LIST_FINDINGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListFindingsRequest,
              ListFindingsResponse,
              ListFindingsResponse.ListFindingsResult>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListFindingsRequest injectToken(ListFindingsRequest payload, String token) {
              return ListFindingsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListFindingsRequest injectPageSize(ListFindingsRequest payload, int pageSize) {
              return ListFindingsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListFindingsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListFindingsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ListFindingsResponse.ListFindingsResult> extractResources(
                ListFindingsResponse payload) {
              return payload.getListFindingsResultsList();
            }
          };

  private static final PagedListDescriptor<
          ListMuteConfigsRequest, ListMuteConfigsResponse, MuteConfig>
      LIST_MUTE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<ListMuteConfigsRequest, ListMuteConfigsResponse, MuteConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMuteConfigsRequest injectToken(
                ListMuteConfigsRequest payload, String token) {
              return ListMuteConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListMuteConfigsRequest injectPageSize(
                ListMuteConfigsRequest payload, int pageSize) {
              return ListMuteConfigsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListMuteConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMuteConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MuteConfig> extractResources(ListMuteConfigsResponse payload) {
              return payload.getMuteConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListNotificationConfigsRequest, ListNotificationConfigsResponse, NotificationConfig>
      LIST_NOTIFICATION_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListNotificationConfigsRequest,
              ListNotificationConfigsResponse,
              NotificationConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListNotificationConfigsRequest injectToken(
                ListNotificationConfigsRequest payload, String token) {
              return ListNotificationConfigsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListNotificationConfigsRequest injectPageSize(
                ListNotificationConfigsRequest payload, int pageSize) {
              return ListNotificationConfigsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListNotificationConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListNotificationConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<NotificationConfig> extractResources(
                ListNotificationConfigsResponse payload) {
              return payload.getNotificationConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
          EffectiveSecurityHealthAnalyticsCustomModule>
      LIST_EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
              ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
              EffectiveSecurityHealthAnalyticsCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEffectiveSecurityHealthAnalyticsCustomModulesRequest injectToken(
                ListEffectiveSecurityHealthAnalyticsCustomModulesRequest payload, String token) {
              return ListEffectiveSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListEffectiveSecurityHealthAnalyticsCustomModulesRequest injectPageSize(
                ListEffectiveSecurityHealthAnalyticsCustomModulesRequest payload, int pageSize) {
              return ListEffectiveSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListEffectiveSecurityHealthAnalyticsCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                ListEffectiveSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EffectiveSecurityHealthAnalyticsCustomModule> extractResources(
                ListEffectiveSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getEffectiveSecurityHealthAnalyticsCustomModulesList();
            }
          };

  private static final PagedListDescriptor<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse,
          SecurityHealthAnalyticsCustomModule>
      LIST_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListSecurityHealthAnalyticsCustomModulesRequest,
              ListSecurityHealthAnalyticsCustomModulesResponse,
              SecurityHealthAnalyticsCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSecurityHealthAnalyticsCustomModulesRequest injectToken(
                ListSecurityHealthAnalyticsCustomModulesRequest payload, String token) {
              return ListSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListSecurityHealthAnalyticsCustomModulesRequest injectPageSize(
                ListSecurityHealthAnalyticsCustomModulesRequest payload, int pageSize) {
              return ListSecurityHealthAnalyticsCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListSecurityHealthAnalyticsCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                ListSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<SecurityHealthAnalyticsCustomModule> extractResources(
                ListSecurityHealthAnalyticsCustomModulesResponse payload) {
              return payload.getSecurityHealthAnalyticsCustomModulesList();
            }
          };

  private static final PagedListDescriptor<ListSourcesRequest, ListSourcesResponse, Source>
      LIST_SOURCES_PAGE_STR_DESC =
          new PagedListDescriptor<ListSourcesRequest, ListSourcesResponse, Source>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListSourcesRequest injectToken(ListSourcesRequest payload, String token) {
              return ListSourcesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListSourcesRequest injectPageSize(ListSourcesRequest payload, int pageSize) {
              return ListSourcesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListSourcesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListSourcesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Source> extractResources(ListSourcesResponse payload) {
              return payload.getSourcesList();
            }
          };

  private static final PagedListDescriptor<
          ListBigQueryExportsRequest, ListBigQueryExportsResponse, BigQueryExport>
      LIST_BIG_QUERY_EXPORTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListBigQueryExportsRequest, ListBigQueryExportsResponse, BigQueryExport>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListBigQueryExportsRequest injectToken(
                ListBigQueryExportsRequest payload, String token) {
              return ListBigQueryExportsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListBigQueryExportsRequest injectPageSize(
                ListBigQueryExportsRequest payload, int pageSize) {
              return ListBigQueryExportsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListBigQueryExportsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListBigQueryExportsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<BigQueryExport> extractResources(ListBigQueryExportsResponse payload) {
              return payload.getBigQueryExportsList();
            }
          };

  private static final PagedListDescriptor<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesResponse,
          EventThreatDetectionCustomModule>
      LIST_DESCENDANT_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListDescendantEventThreatDetectionCustomModulesRequest,
              ListDescendantEventThreatDetectionCustomModulesResponse,
              EventThreatDetectionCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDescendantEventThreatDetectionCustomModulesRequest injectToken(
                ListDescendantEventThreatDetectionCustomModulesRequest payload, String token) {
              return ListDescendantEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListDescendantEventThreatDetectionCustomModulesRequest injectPageSize(
                ListDescendantEventThreatDetectionCustomModulesRequest payload, int pageSize) {
              return ListDescendantEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListDescendantEventThreatDetectionCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                ListDescendantEventThreatDetectionCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EventThreatDetectionCustomModule> extractResources(
                ListDescendantEventThreatDetectionCustomModulesResponse payload) {
              return payload.getEventThreatDetectionCustomModulesList();
            }
          };

  private static final PagedListDescriptor<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesResponse,
          EventThreatDetectionCustomModule>
      LIST_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEventThreatDetectionCustomModulesRequest,
              ListEventThreatDetectionCustomModulesResponse,
              EventThreatDetectionCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEventThreatDetectionCustomModulesRequest injectToken(
                ListEventThreatDetectionCustomModulesRequest payload, String token) {
              return ListEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListEventThreatDetectionCustomModulesRequest injectPageSize(
                ListEventThreatDetectionCustomModulesRequest payload, int pageSize) {
              return ListEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListEventThreatDetectionCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListEventThreatDetectionCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EventThreatDetectionCustomModule> extractResources(
                ListEventThreatDetectionCustomModulesResponse payload) {
              return payload.getEventThreatDetectionCustomModulesList();
            }
          };

  private static final PagedListDescriptor<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesResponse,
          EffectiveEventThreatDetectionCustomModule>
      LIST_EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListEffectiveEventThreatDetectionCustomModulesRequest,
              ListEffectiveEventThreatDetectionCustomModulesResponse,
              EffectiveEventThreatDetectionCustomModule>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListEffectiveEventThreatDetectionCustomModulesRequest injectToken(
                ListEffectiveEventThreatDetectionCustomModulesRequest payload, String token) {
              return ListEffectiveEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListEffectiveEventThreatDetectionCustomModulesRequest injectPageSize(
                ListEffectiveEventThreatDetectionCustomModulesRequest payload, int pageSize) {
              return ListEffectiveEventThreatDetectionCustomModulesRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(
                ListEffectiveEventThreatDetectionCustomModulesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(
                ListEffectiveEventThreatDetectionCustomModulesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<EffectiveEventThreatDetectionCustomModule> extractResources(
                ListEffectiveEventThreatDetectionCustomModulesResponse payload) {
              return payload.getEffectiveEventThreatDetectionCustomModulesList();
            }
          };

  private static final PagedListDescriptor<
          ListResourceValueConfigsRequest, ListResourceValueConfigsResponse, ResourceValueConfig>
      LIST_RESOURCE_VALUE_CONFIGS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListResourceValueConfigsRequest,
              ListResourceValueConfigsResponse,
              ResourceValueConfig>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListResourceValueConfigsRequest injectToken(
                ListResourceValueConfigsRequest payload, String token) {
              return ListResourceValueConfigsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListResourceValueConfigsRequest injectPageSize(
                ListResourceValueConfigsRequest payload, int pageSize) {
              return ListResourceValueConfigsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListResourceValueConfigsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListResourceValueConfigsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ResourceValueConfig> extractResources(
                ListResourceValueConfigsResponse payload) {
              return payload.getResourceValueConfigsList();
            }
          };

  private static final PagedListDescriptor<
          ListValuedResourcesRequest, ListValuedResourcesResponse, ValuedResource>
      LIST_VALUED_RESOURCES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListValuedResourcesRequest, ListValuedResourcesResponse, ValuedResource>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListValuedResourcesRequest injectToken(
                ListValuedResourcesRequest payload, String token) {
              return ListValuedResourcesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListValuedResourcesRequest injectPageSize(
                ListValuedResourcesRequest payload, int pageSize) {
              return ListValuedResourcesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListValuedResourcesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListValuedResourcesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ValuedResource> extractResources(ListValuedResourcesResponse payload) {
              return payload.getValuedResourcesList();
            }
          };

  private static final PagedListDescriptor<
          ListAttackPathsRequest, ListAttackPathsResponse, AttackPath>
      LIST_ATTACK_PATHS_PAGE_STR_DESC =
          new PagedListDescriptor<ListAttackPathsRequest, ListAttackPathsResponse, AttackPath>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAttackPathsRequest injectToken(
                ListAttackPathsRequest payload, String token) {
              return ListAttackPathsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAttackPathsRequest injectPageSize(
                ListAttackPathsRequest payload, int pageSize) {
              return ListAttackPathsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAttackPathsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAttackPathsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AttackPath> extractResources(ListAttackPathsResponse payload) {
              return payload.getAttackPathsList();
            }
          };

  private static final PagedListResponseFactory<
          GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
      GROUP_ASSETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>() {
            @Override
            public ApiFuture<GroupAssetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<GroupAssetsRequest, GroupAssetsResponse> callable,
                GroupAssetsRequest request,
                ApiCallContext context,
                ApiFuture<GroupAssetsResponse> futureResponse) {
              PageContext<GroupAssetsRequest, GroupAssetsResponse, GroupResult> pageContext =
                  PageContext.create(callable, GROUP_ASSETS_PAGE_STR_DESC, request, context);
              return GroupAssetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
      GROUP_FINDINGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>() {
            @Override
            public ApiFuture<GroupFindingsPagedResponse> getFuturePagedResponse(
                UnaryCallable<GroupFindingsRequest, GroupFindingsResponse> callable,
                GroupFindingsRequest request,
                ApiCallContext context,
                ApiFuture<GroupFindingsResponse> futureResponse) {
              PageContext<GroupFindingsRequest, GroupFindingsResponse, GroupResult> pageContext =
                  PageContext.create(callable, GROUP_FINDINGS_PAGE_STR_DESC, request, context);
              return GroupFindingsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
      LIST_ASSETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>() {
            @Override
            public ApiFuture<ListAssetsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAssetsRequest, ListAssetsResponse> callable,
                ListAssetsRequest request,
                ApiCallContext context,
                ApiFuture<ListAssetsResponse> futureResponse) {
              PageContext<
                      ListAssetsRequest, ListAssetsResponse, ListAssetsResponse.ListAssetsResult>
                  pageContext =
                      PageContext.create(callable, LIST_ASSETS_PAGE_STR_DESC, request, context);
              return ListAssetsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
          ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
      LIST_DESCENDANT_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
              ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
              ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
                            ListDescendantSecurityHealthAnalyticsCustomModulesResponse>
                        callable,
                    ListDescendantSecurityHealthAnalyticsCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListDescendantSecurityHealthAnalyticsCustomModulesResponse>
                        futureResponse) {
              PageContext<
                      ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
                      ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
                      SecurityHealthAnalyticsCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_DESCENDANT_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      LIST_FINDINGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>() {
            @Override
            public ApiFuture<ListFindingsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListFindingsRequest, ListFindingsResponse> callable,
                ListFindingsRequest request,
                ApiCallContext context,
                ApiFuture<ListFindingsResponse> futureResponse) {
              PageContext<
                      ListFindingsRequest,
                      ListFindingsResponse,
                      ListFindingsResponse.ListFindingsResult>
                  pageContext =
                      PageContext.create(callable, LIST_FINDINGS_PAGE_STR_DESC, request, context);
              return ListFindingsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
      LIST_MUTE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListMuteConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListMuteConfigsRequest, ListMuteConfigsResponse> callable,
                ListMuteConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListMuteConfigsResponse> futureResponse) {
              PageContext<ListMuteConfigsRequest, ListMuteConfigsResponse, MuteConfig> pageContext =
                  PageContext.create(callable, LIST_MUTE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListMuteConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          ListNotificationConfigsPagedResponse>
      LIST_NOTIFICATION_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListNotificationConfigsRequest,
              ListNotificationConfigsResponse,
              ListNotificationConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListNotificationConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsResponse>
                    callable,
                ListNotificationConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListNotificationConfigsResponse> futureResponse) {
              PageContext<
                      ListNotificationConfigsRequest,
                      ListNotificationConfigsResponse,
                      NotificationConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_NOTIFICATION_CONFIGS_PAGE_STR_DESC, request, context);
              return ListNotificationConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
          ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
      LIST_EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
              ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
              ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
                            ListEffectiveSecurityHealthAnalyticsCustomModulesResponse>
                        callable,
                    ListEffectiveSecurityHealthAnalyticsCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListEffectiveSecurityHealthAnalyticsCustomModulesResponse>
                        futureResponse) {
              PageContext<
                      ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
                      ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
                      EffectiveSecurityHealthAnalyticsCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse,
          ListSecurityHealthAnalyticsCustomModulesPagedResponse>
      LIST_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSecurityHealthAnalyticsCustomModulesRequest,
              ListSecurityHealthAnalyticsCustomModulesResponse,
              ListSecurityHealthAnalyticsCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListSecurityHealthAnalyticsCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListSecurityHealthAnalyticsCustomModulesRequest,
                            ListSecurityHealthAnalyticsCustomModulesResponse>
                        callable,
                    ListSecurityHealthAnalyticsCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListSecurityHealthAnalyticsCustomModulesResponse> futureResponse) {
              PageContext<
                      ListSecurityHealthAnalyticsCustomModulesRequest,
                      ListSecurityHealthAnalyticsCustomModulesResponse,
                      SecurityHealthAnalyticsCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListSecurityHealthAnalyticsCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
      LIST_SOURCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>() {
            @Override
            public ApiFuture<ListSourcesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListSourcesRequest, ListSourcesResponse> callable,
                ListSourcesRequest request,
                ApiCallContext context,
                ApiFuture<ListSourcesResponse> futureResponse) {
              PageContext<ListSourcesRequest, ListSourcesResponse, Source> pageContext =
                  PageContext.create(callable, LIST_SOURCES_PAGE_STR_DESC, request, context);
              return ListSourcesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListBigQueryExportsRequest, ListBigQueryExportsResponse, ListBigQueryExportsPagedResponse>
      LIST_BIG_QUERY_EXPORTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListBigQueryExportsRequest,
              ListBigQueryExportsResponse,
              ListBigQueryExportsPagedResponse>() {
            @Override
            public ApiFuture<ListBigQueryExportsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListBigQueryExportsRequest, ListBigQueryExportsResponse> callable,
                ListBigQueryExportsRequest request,
                ApiCallContext context,
                ApiFuture<ListBigQueryExportsResponse> futureResponse) {
              PageContext<ListBigQueryExportsRequest, ListBigQueryExportsResponse, BigQueryExport>
                  pageContext =
                      PageContext.create(
                          callable, LIST_BIG_QUERY_EXPORTS_PAGE_STR_DESC, request, context);
              return ListBigQueryExportsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesResponse,
          ListDescendantEventThreatDetectionCustomModulesPagedResponse>
      LIST_DESCENDANT_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDescendantEventThreatDetectionCustomModulesRequest,
              ListDescendantEventThreatDetectionCustomModulesResponse,
              ListDescendantEventThreatDetectionCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListDescendantEventThreatDetectionCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListDescendantEventThreatDetectionCustomModulesRequest,
                            ListDescendantEventThreatDetectionCustomModulesResponse>
                        callable,
                    ListDescendantEventThreatDetectionCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListDescendantEventThreatDetectionCustomModulesResponse>
                        futureResponse) {
              PageContext<
                      ListDescendantEventThreatDetectionCustomModulesRequest,
                      ListDescendantEventThreatDetectionCustomModulesResponse,
                      EventThreatDetectionCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_DESCENDANT_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListDescendantEventThreatDetectionCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesResponse,
          ListEventThreatDetectionCustomModulesPagedResponse>
      LIST_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEventThreatDetectionCustomModulesRequest,
              ListEventThreatDetectionCustomModulesResponse,
              ListEventThreatDetectionCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListEventThreatDetectionCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListEventThreatDetectionCustomModulesRequest,
                            ListEventThreatDetectionCustomModulesResponse>
                        callable,
                    ListEventThreatDetectionCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListEventThreatDetectionCustomModulesResponse> futureResponse) {
              PageContext<
                      ListEventThreatDetectionCustomModulesRequest,
                      ListEventThreatDetectionCustomModulesResponse,
                      EventThreatDetectionCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListEventThreatDetectionCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesResponse,
          ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
      LIST_EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListEffectiveEventThreatDetectionCustomModulesRequest,
              ListEffectiveEventThreatDetectionCustomModulesResponse,
              ListEffectiveEventThreatDetectionCustomModulesPagedResponse>() {
            @Override
            public ApiFuture<ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListEffectiveEventThreatDetectionCustomModulesRequest,
                            ListEffectiveEventThreatDetectionCustomModulesResponse>
                        callable,
                    ListEffectiveEventThreatDetectionCustomModulesRequest request,
                    ApiCallContext context,
                    ApiFuture<ListEffectiveEventThreatDetectionCustomModulesResponse>
                        futureResponse) {
              PageContext<
                      ListEffectiveEventThreatDetectionCustomModulesRequest,
                      ListEffectiveEventThreatDetectionCustomModulesResponse,
                      EffectiveEventThreatDetectionCustomModule>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_DESC,
                          request,
                          context);
              return ListEffectiveEventThreatDetectionCustomModulesPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListResourceValueConfigsRequest,
          ListResourceValueConfigsResponse,
          ListResourceValueConfigsPagedResponse>
      LIST_RESOURCE_VALUE_CONFIGS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListResourceValueConfigsRequest,
              ListResourceValueConfigsResponse,
              ListResourceValueConfigsPagedResponse>() {
            @Override
            public ApiFuture<ListResourceValueConfigsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListResourceValueConfigsRequest, ListResourceValueConfigsResponse>
                    callable,
                ListResourceValueConfigsRequest request,
                ApiCallContext context,
                ApiFuture<ListResourceValueConfigsResponse> futureResponse) {
              PageContext<
                      ListResourceValueConfigsRequest,
                      ListResourceValueConfigsResponse,
                      ResourceValueConfig>
                  pageContext =
                      PageContext.create(
                          callable, LIST_RESOURCE_VALUE_CONFIGS_PAGE_STR_DESC, request, context);
              return ListResourceValueConfigsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListValuedResourcesRequest, ListValuedResourcesResponse, ListValuedResourcesPagedResponse>
      LIST_VALUED_RESOURCES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListValuedResourcesRequest,
              ListValuedResourcesResponse,
              ListValuedResourcesPagedResponse>() {
            @Override
            public ApiFuture<ListValuedResourcesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListValuedResourcesRequest, ListValuedResourcesResponse> callable,
                ListValuedResourcesRequest request,
                ApiCallContext context,
                ApiFuture<ListValuedResourcesResponse> futureResponse) {
              PageContext<ListValuedResourcesRequest, ListValuedResourcesResponse, ValuedResource>
                  pageContext =
                      PageContext.create(
                          callable, LIST_VALUED_RESOURCES_PAGE_STR_DESC, request, context);
              return ListValuedResourcesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>
      LIST_ATTACK_PATHS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>() {
            @Override
            public ApiFuture<ListAttackPathsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAttackPathsRequest, ListAttackPathsResponse> callable,
                ListAttackPathsRequest request,
                ApiCallContext context,
                ApiFuture<ListAttackPathsResponse> futureResponse) {
              PageContext<ListAttackPathsRequest, ListAttackPathsResponse, AttackPath> pageContext =
                  PageContext.create(callable, LIST_ATTACK_PATHS_PAGE_STR_DESC, request, context);
              return ListAttackPathsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to bulkMuteFindings. */
  public UnaryCallSettings<BulkMuteFindingsRequest, Operation> bulkMuteFindingsSettings() {
    return bulkMuteFindingsSettings;
  }

  /** Returns the object with the settings used for calls to bulkMuteFindings. */
  public OperationCallSettings<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
      bulkMuteFindingsOperationSettings() {
    return bulkMuteFindingsOperationSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * createSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      createSecurityHealthAnalyticsCustomModuleSettings() {
    return createSecurityHealthAnalyticsCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to createSource. */
  public UnaryCallSettings<CreateSourceRequest, Source> createSourceSettings() {
    return createSourceSettings;
  }

  /** Returns the object with the settings used for calls to createFinding. */
  public UnaryCallSettings<CreateFindingRequest, Finding> createFindingSettings() {
    return createFindingSettings;
  }

  /** Returns the object with the settings used for calls to createMuteConfig. */
  public UnaryCallSettings<CreateMuteConfigRequest, MuteConfig> createMuteConfigSettings() {
    return createMuteConfigSettings;
  }

  /** Returns the object with the settings used for calls to createNotificationConfig. */
  public UnaryCallSettings<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigSettings() {
    return createNotificationConfigSettings;
  }

  /** Returns the object with the settings used for calls to deleteMuteConfig. */
  public UnaryCallSettings<DeleteMuteConfigRequest, Empty> deleteMuteConfigSettings() {
    return deleteMuteConfigSettings;
  }

  /** Returns the object with the settings used for calls to deleteNotificationConfig. */
  public UnaryCallSettings<DeleteNotificationConfigRequest, Empty>
      deleteNotificationConfigSettings() {
    return deleteNotificationConfigSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * deleteSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
      deleteSecurityHealthAnalyticsCustomModuleSettings() {
    return deleteSecurityHealthAnalyticsCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to getSimulation. */
  public UnaryCallSettings<GetSimulationRequest, Simulation> getSimulationSettings() {
    return getSimulationSettings;
  }

  /** Returns the object with the settings used for calls to getValuedResource. */
  public UnaryCallSettings<GetValuedResourceRequest, ValuedResource> getValuedResourceSettings() {
    return getValuedResourceSettings;
  }

  /** Returns the object with the settings used for calls to getBigQueryExport. */
  public UnaryCallSettings<GetBigQueryExportRequest, BigQueryExport> getBigQueryExportSettings() {
    return getBigQueryExportSettings;
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return getIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to getMuteConfig. */
  public UnaryCallSettings<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings() {
    return getMuteConfigSettings;
  }

  /** Returns the object with the settings used for calls to getNotificationConfig. */
  public UnaryCallSettings<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigSettings() {
    return getNotificationConfigSettings;
  }

  /** Returns the object with the settings used for calls to getOrganizationSettings. */
  public UnaryCallSettings<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsSettings() {
    return getOrganizationSettingsSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * getEffectiveSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
          EffectiveSecurityHealthAnalyticsCustomModule>
      getEffectiveSecurityHealthAnalyticsCustomModuleSettings() {
    return getEffectiveSecurityHealthAnalyticsCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to getSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      getSecurityHealthAnalyticsCustomModuleSettings() {
    return getSecurityHealthAnalyticsCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to getSource. */
  public UnaryCallSettings<GetSourceRequest, Source> getSourceSettings() {
    return getSourceSettings;
  }

  /**
   * Returns the object with the settings used for calls to groupAssets.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public PagedCallSettings<GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
      groupAssetsSettings() {
    return groupAssetsSettings;
  }

  /** Returns the object with the settings used for calls to groupFindings. */
  public PagedCallSettings<GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
      groupFindingsSettings() {
    return groupFindingsSettings;
  }

  /**
   * Returns the object with the settings used for calls to listAssets.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public PagedCallSettings<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
      listAssetsSettings() {
    return listAssetsSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listDescendantSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
          ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
      listDescendantSecurityHealthAnalyticsCustomModulesSettings() {
    return listDescendantSecurityHealthAnalyticsCustomModulesSettings;
  }

  /** Returns the object with the settings used for calls to listFindings. */
  public PagedCallSettings<ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
      listFindingsSettings() {
    return listFindingsSettings;
  }

  /** Returns the object with the settings used for calls to listMuteConfigs. */
  public PagedCallSettings<
          ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
      listMuteConfigsSettings() {
    return listMuteConfigsSettings;
  }

  /** Returns the object with the settings used for calls to listNotificationConfigs. */
  public PagedCallSettings<
          ListNotificationConfigsRequest,
          ListNotificationConfigsResponse,
          ListNotificationConfigsPagedResponse>
      listNotificationConfigsSettings() {
    return listNotificationConfigsSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listEffectiveSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
          ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
      listEffectiveSecurityHealthAnalyticsCustomModulesSettings() {
    return listEffectiveSecurityHealthAnalyticsCustomModulesSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listSecurityHealthAnalyticsCustomModules.
   */
  public PagedCallSettings<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse,
          ListSecurityHealthAnalyticsCustomModulesPagedResponse>
      listSecurityHealthAnalyticsCustomModulesSettings() {
    return listSecurityHealthAnalyticsCustomModulesSettings;
  }

  /** Returns the object with the settings used for calls to listSources. */
  public PagedCallSettings<ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
      listSourcesSettings() {
    return listSourcesSettings;
  }

  /**
   * Returns the object with the settings used for calls to runAssetDiscovery.
   *
   * @deprecated This method is deprecated and will be removed in the next major version update.
   */
  @Deprecated
  public UnaryCallSettings<RunAssetDiscoveryRequest, Operation> runAssetDiscoverySettings() {
    return runAssetDiscoverySettings;
  }

  /** Returns the object with the settings used for calls to runAssetDiscovery. */
  public OperationCallSettings<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationSettings() {
    return runAssetDiscoveryOperationSettings;
  }

  /** Returns the object with the settings used for calls to setFindingState. */
  public UnaryCallSettings<SetFindingStateRequest, Finding> setFindingStateSettings() {
    return setFindingStateSettings;
  }

  /** Returns the object with the settings used for calls to setMute. */
  public UnaryCallSettings<SetMuteRequest, Finding> setMuteSettings() {
    return setMuteSettings;
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return setIamPolicySettings;
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return testIamPermissionsSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * simulateSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          SimulateSecurityHealthAnalyticsCustomModuleRequest,
          SimulateSecurityHealthAnalyticsCustomModuleResponse>
      simulateSecurityHealthAnalyticsCustomModuleSettings() {
    return simulateSecurityHealthAnalyticsCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to updateExternalSystem. */
  public UnaryCallSettings<UpdateExternalSystemRequest, ExternalSystem>
      updateExternalSystemSettings() {
    return updateExternalSystemSettings;
  }

  /** Returns the object with the settings used for calls to updateFinding. */
  public UnaryCallSettings<UpdateFindingRequest, Finding> updateFindingSettings() {
    return updateFindingSettings;
  }

  /** Returns the object with the settings used for calls to updateMuteConfig. */
  public UnaryCallSettings<UpdateMuteConfigRequest, MuteConfig> updateMuteConfigSettings() {
    return updateMuteConfigSettings;
  }

  /** Returns the object with the settings used for calls to updateNotificationConfig. */
  public UnaryCallSettings<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigSettings() {
    return updateNotificationConfigSettings;
  }

  /** Returns the object with the settings used for calls to updateOrganizationSettings. */
  public UnaryCallSettings<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsSettings() {
    return updateOrganizationSettingsSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * updateSecurityHealthAnalyticsCustomModule.
   */
  public UnaryCallSettings<
          UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      updateSecurityHealthAnalyticsCustomModuleSettings() {
    return updateSecurityHealthAnalyticsCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to updateSource. */
  public UnaryCallSettings<UpdateSourceRequest, Source> updateSourceSettings() {
    return updateSourceSettings;
  }

  /** Returns the object with the settings used for calls to updateSecurityMarks. */
  public UnaryCallSettings<UpdateSecurityMarksRequest, SecurityMarks>
      updateSecurityMarksSettings() {
    return updateSecurityMarksSettings;
  }

  /** Returns the object with the settings used for calls to createBigQueryExport. */
  public UnaryCallSettings<CreateBigQueryExportRequest, BigQueryExport>
      createBigQueryExportSettings() {
    return createBigQueryExportSettings;
  }

  /** Returns the object with the settings used for calls to deleteBigQueryExport. */
  public UnaryCallSettings<DeleteBigQueryExportRequest, Empty> deleteBigQueryExportSettings() {
    return deleteBigQueryExportSettings;
  }

  /** Returns the object with the settings used for calls to updateBigQueryExport. */
  public UnaryCallSettings<UpdateBigQueryExportRequest, BigQueryExport>
      updateBigQueryExportSettings() {
    return updateBigQueryExportSettings;
  }

  /** Returns the object with the settings used for calls to listBigQueryExports. */
  public PagedCallSettings<
          ListBigQueryExportsRequest, ListBigQueryExportsResponse, ListBigQueryExportsPagedResponse>
      listBigQueryExportsSettings() {
    return listBigQueryExportsSettings;
  }

  /**
   * Returns the object with the settings used for calls to createEventThreatDetectionCustomModule.
   */
  public UnaryCallSettings<
          CreateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      createEventThreatDetectionCustomModuleSettings() {
    return createEventThreatDetectionCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to deleteEventThreatDetectionCustomModule.
   */
  public UnaryCallSettings<DeleteEventThreatDetectionCustomModuleRequest, Empty>
      deleteEventThreatDetectionCustomModuleSettings() {
    return deleteEventThreatDetectionCustomModuleSettings;
  }

  /** Returns the object with the settings used for calls to getEventThreatDetectionCustomModule. */
  public UnaryCallSettings<
          GetEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      getEventThreatDetectionCustomModuleSettings() {
    return getEventThreatDetectionCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listDescendantEventThreatDetectionCustomModules.
   */
  public PagedCallSettings<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesResponse,
          ListDescendantEventThreatDetectionCustomModulesPagedResponse>
      listDescendantEventThreatDetectionCustomModulesSettings() {
    return listDescendantEventThreatDetectionCustomModulesSettings;
  }

  /**
   * Returns the object with the settings used for calls to listEventThreatDetectionCustomModules.
   */
  public PagedCallSettings<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesResponse,
          ListEventThreatDetectionCustomModulesPagedResponse>
      listEventThreatDetectionCustomModulesSettings() {
    return listEventThreatDetectionCustomModulesSettings;
  }

  /**
   * Returns the object with the settings used for calls to updateEventThreatDetectionCustomModule.
   */
  public UnaryCallSettings<
          UpdateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      updateEventThreatDetectionCustomModuleSettings() {
    return updateEventThreatDetectionCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * validateEventThreatDetectionCustomModule.
   */
  public UnaryCallSettings<
          ValidateEventThreatDetectionCustomModuleRequest,
          ValidateEventThreatDetectionCustomModuleResponse>
      validateEventThreatDetectionCustomModuleSettings() {
    return validateEventThreatDetectionCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * getEffectiveEventThreatDetectionCustomModule.
   */
  public UnaryCallSettings<
          GetEffectiveEventThreatDetectionCustomModuleRequest,
          EffectiveEventThreatDetectionCustomModule>
      getEffectiveEventThreatDetectionCustomModuleSettings() {
    return getEffectiveEventThreatDetectionCustomModuleSettings;
  }

  /**
   * Returns the object with the settings used for calls to
   * listEffectiveEventThreatDetectionCustomModules.
   */
  public PagedCallSettings<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesResponse,
          ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
      listEffectiveEventThreatDetectionCustomModulesSettings() {
    return listEffectiveEventThreatDetectionCustomModulesSettings;
  }

  /** Returns the object with the settings used for calls to batchCreateResourceValueConfigs. */
  public UnaryCallSettings<
          BatchCreateResourceValueConfigsRequest, BatchCreateResourceValueConfigsResponse>
      batchCreateResourceValueConfigsSettings() {
    return batchCreateResourceValueConfigsSettings;
  }

  /** Returns the object with the settings used for calls to deleteResourceValueConfig. */
  public UnaryCallSettings<DeleteResourceValueConfigRequest, Empty>
      deleteResourceValueConfigSettings() {
    return deleteResourceValueConfigSettings;
  }

  /** Returns the object with the settings used for calls to getResourceValueConfig. */
  public UnaryCallSettings<GetResourceValueConfigRequest, ResourceValueConfig>
      getResourceValueConfigSettings() {
    return getResourceValueConfigSettings;
  }

  /** Returns the object with the settings used for calls to listResourceValueConfigs. */
  public PagedCallSettings<
          ListResourceValueConfigsRequest,
          ListResourceValueConfigsResponse,
          ListResourceValueConfigsPagedResponse>
      listResourceValueConfigsSettings() {
    return listResourceValueConfigsSettings;
  }

  /** Returns the object with the settings used for calls to updateResourceValueConfig. */
  public UnaryCallSettings<UpdateResourceValueConfigRequest, ResourceValueConfig>
      updateResourceValueConfigSettings() {
    return updateResourceValueConfigSettings;
  }

  /** Returns the object with the settings used for calls to listValuedResources. */
  public PagedCallSettings<
          ListValuedResourcesRequest, ListValuedResourcesResponse, ListValuedResourcesPagedResponse>
      listValuedResourcesSettings() {
    return listValuedResourcesSettings;
  }

  /** Returns the object with the settings used for calls to listAttackPaths. */
  public PagedCallSettings<
          ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>
      listAttackPathsSettings() {
    return listAttackPathsSettings;
  }

  public SecurityCenterStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcSecurityCenterStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonSecurityCenterStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "securitycenter";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "securitycenter.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "securitycenter.mtls.googleapis.com:443";
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
            "gapic", GaxProperties.getLibraryVersion(SecurityCenterStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(SecurityCenterStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return SecurityCenterStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
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

  protected SecurityCenterStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    bulkMuteFindingsSettings = settingsBuilder.bulkMuteFindingsSettings().build();
    bulkMuteFindingsOperationSettings = settingsBuilder.bulkMuteFindingsOperationSettings().build();
    createSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.createSecurityHealthAnalyticsCustomModuleSettings().build();
    createSourceSettings = settingsBuilder.createSourceSettings().build();
    createFindingSettings = settingsBuilder.createFindingSettings().build();
    createMuteConfigSettings = settingsBuilder.createMuteConfigSettings().build();
    createNotificationConfigSettings = settingsBuilder.createNotificationConfigSettings().build();
    deleteMuteConfigSettings = settingsBuilder.deleteMuteConfigSettings().build();
    deleteNotificationConfigSettings = settingsBuilder.deleteNotificationConfigSettings().build();
    deleteSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.deleteSecurityHealthAnalyticsCustomModuleSettings().build();
    getSimulationSettings = settingsBuilder.getSimulationSettings().build();
    getValuedResourceSettings = settingsBuilder.getValuedResourceSettings().build();
    getBigQueryExportSettings = settingsBuilder.getBigQueryExportSettings().build();
    getIamPolicySettings = settingsBuilder.getIamPolicySettings().build();
    getMuteConfigSettings = settingsBuilder.getMuteConfigSettings().build();
    getNotificationConfigSettings = settingsBuilder.getNotificationConfigSettings().build();
    getOrganizationSettingsSettings = settingsBuilder.getOrganizationSettingsSettings().build();
    getEffectiveSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.getEffectiveSecurityHealthAnalyticsCustomModuleSettings().build();
    getSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.getSecurityHealthAnalyticsCustomModuleSettings().build();
    getSourceSettings = settingsBuilder.getSourceSettings().build();
    groupAssetsSettings = settingsBuilder.groupAssetsSettings().build();
    groupFindingsSettings = settingsBuilder.groupFindingsSettings().build();
    listAssetsSettings = settingsBuilder.listAssetsSettings().build();
    listDescendantSecurityHealthAnalyticsCustomModulesSettings =
        settingsBuilder.listDescendantSecurityHealthAnalyticsCustomModulesSettings().build();
    listFindingsSettings = settingsBuilder.listFindingsSettings().build();
    listMuteConfigsSettings = settingsBuilder.listMuteConfigsSettings().build();
    listNotificationConfigsSettings = settingsBuilder.listNotificationConfigsSettings().build();
    listEffectiveSecurityHealthAnalyticsCustomModulesSettings =
        settingsBuilder.listEffectiveSecurityHealthAnalyticsCustomModulesSettings().build();
    listSecurityHealthAnalyticsCustomModulesSettings =
        settingsBuilder.listSecurityHealthAnalyticsCustomModulesSettings().build();
    listSourcesSettings = settingsBuilder.listSourcesSettings().build();
    runAssetDiscoverySettings = settingsBuilder.runAssetDiscoverySettings().build();
    runAssetDiscoveryOperationSettings =
        settingsBuilder.runAssetDiscoveryOperationSettings().build();
    setFindingStateSettings = settingsBuilder.setFindingStateSettings().build();
    setMuteSettings = settingsBuilder.setMuteSettings().build();
    setIamPolicySettings = settingsBuilder.setIamPolicySettings().build();
    testIamPermissionsSettings = settingsBuilder.testIamPermissionsSettings().build();
    simulateSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.simulateSecurityHealthAnalyticsCustomModuleSettings().build();
    updateExternalSystemSettings = settingsBuilder.updateExternalSystemSettings().build();
    updateFindingSettings = settingsBuilder.updateFindingSettings().build();
    updateMuteConfigSettings = settingsBuilder.updateMuteConfigSettings().build();
    updateNotificationConfigSettings = settingsBuilder.updateNotificationConfigSettings().build();
    updateOrganizationSettingsSettings =
        settingsBuilder.updateOrganizationSettingsSettings().build();
    updateSecurityHealthAnalyticsCustomModuleSettings =
        settingsBuilder.updateSecurityHealthAnalyticsCustomModuleSettings().build();
    updateSourceSettings = settingsBuilder.updateSourceSettings().build();
    updateSecurityMarksSettings = settingsBuilder.updateSecurityMarksSettings().build();
    createBigQueryExportSettings = settingsBuilder.createBigQueryExportSettings().build();
    deleteBigQueryExportSettings = settingsBuilder.deleteBigQueryExportSettings().build();
    updateBigQueryExportSettings = settingsBuilder.updateBigQueryExportSettings().build();
    listBigQueryExportsSettings = settingsBuilder.listBigQueryExportsSettings().build();
    createEventThreatDetectionCustomModuleSettings =
        settingsBuilder.createEventThreatDetectionCustomModuleSettings().build();
    deleteEventThreatDetectionCustomModuleSettings =
        settingsBuilder.deleteEventThreatDetectionCustomModuleSettings().build();
    getEventThreatDetectionCustomModuleSettings =
        settingsBuilder.getEventThreatDetectionCustomModuleSettings().build();
    listDescendantEventThreatDetectionCustomModulesSettings =
        settingsBuilder.listDescendantEventThreatDetectionCustomModulesSettings().build();
    listEventThreatDetectionCustomModulesSettings =
        settingsBuilder.listEventThreatDetectionCustomModulesSettings().build();
    updateEventThreatDetectionCustomModuleSettings =
        settingsBuilder.updateEventThreatDetectionCustomModuleSettings().build();
    validateEventThreatDetectionCustomModuleSettings =
        settingsBuilder.validateEventThreatDetectionCustomModuleSettings().build();
    getEffectiveEventThreatDetectionCustomModuleSettings =
        settingsBuilder.getEffectiveEventThreatDetectionCustomModuleSettings().build();
    listEffectiveEventThreatDetectionCustomModulesSettings =
        settingsBuilder.listEffectiveEventThreatDetectionCustomModulesSettings().build();
    batchCreateResourceValueConfigsSettings =
        settingsBuilder.batchCreateResourceValueConfigsSettings().build();
    deleteResourceValueConfigSettings = settingsBuilder.deleteResourceValueConfigSettings().build();
    getResourceValueConfigSettings = settingsBuilder.getResourceValueConfigSettings().build();
    listResourceValueConfigsSettings = settingsBuilder.listResourceValueConfigsSettings().build();
    updateResourceValueConfigSettings = settingsBuilder.updateResourceValueConfigSettings().build();
    listValuedResourcesSettings = settingsBuilder.listValuedResourcesSettings().build();
    listAttackPathsSettings = settingsBuilder.listAttackPathsSettings().build();
  }

  /** Builder for SecurityCenterStubSettings. */
  public static class Builder extends StubSettings.Builder<SecurityCenterStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<BulkMuteFindingsRequest, Operation>
        bulkMuteFindingsSettings;
    private final OperationCallSettings.Builder<
            BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
        bulkMuteFindingsOperationSettings;
    private final UnaryCallSettings.Builder<
            CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        createSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<CreateSourceRequest, Source> createSourceSettings;
    private final UnaryCallSettings.Builder<CreateFindingRequest, Finding> createFindingSettings;
    private final UnaryCallSettings.Builder<CreateMuteConfigRequest, MuteConfig>
        createMuteConfigSettings;
    private final UnaryCallSettings.Builder<CreateNotificationConfigRequest, NotificationConfig>
        createNotificationConfigSettings;
    private final UnaryCallSettings.Builder<DeleteMuteConfigRequest, Empty>
        deleteMuteConfigSettings;
    private final UnaryCallSettings.Builder<DeleteNotificationConfigRequest, Empty>
        deleteNotificationConfigSettings;
    private final UnaryCallSettings.Builder<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
        deleteSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<GetSimulationRequest, Simulation> getSimulationSettings;
    private final UnaryCallSettings.Builder<GetValuedResourceRequest, ValuedResource>
        getValuedResourceSettings;
    private final UnaryCallSettings.Builder<GetBigQueryExportRequest, BigQueryExport>
        getBigQueryExportSettings;
    private final UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings;
    private final UnaryCallSettings.Builder<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings;
    private final UnaryCallSettings.Builder<GetNotificationConfigRequest, NotificationConfig>
        getNotificationConfigSettings;
    private final UnaryCallSettings.Builder<GetOrganizationSettingsRequest, OrganizationSettings>
        getOrganizationSettingsSettings;
    private final UnaryCallSettings.Builder<
            GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
            EffectiveSecurityHealthAnalyticsCustomModule>
        getEffectiveSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<
            GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        getSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<GetSourceRequest, Source> getSourceSettings;
    private final PagedCallSettings.Builder<
            GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
        groupAssetsSettings;
    private final PagedCallSettings.Builder<
            GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
        groupFindingsSettings;
    private final PagedCallSettings.Builder<
            ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
        listAssetsSettings;
    private final PagedCallSettings.Builder<
            ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
            ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
            ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
        listDescendantSecurityHealthAnalyticsCustomModulesSettings;
    private final PagedCallSettings.Builder<
            ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
        listFindingsSettings;
    private final PagedCallSettings.Builder<
            ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
        listMuteConfigsSettings;
    private final PagedCallSettings.Builder<
            ListNotificationConfigsRequest,
            ListNotificationConfigsResponse,
            ListNotificationConfigsPagedResponse>
        listNotificationConfigsSettings;
    private final PagedCallSettings.Builder<
            ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
            ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
            ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
        listEffectiveSecurityHealthAnalyticsCustomModulesSettings;
    private final PagedCallSettings.Builder<
            ListSecurityHealthAnalyticsCustomModulesRequest,
            ListSecurityHealthAnalyticsCustomModulesResponse,
            ListSecurityHealthAnalyticsCustomModulesPagedResponse>
        listSecurityHealthAnalyticsCustomModulesSettings;
    private final PagedCallSettings.Builder<
            ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
        listSourcesSettings;
    private final UnaryCallSettings.Builder<RunAssetDiscoveryRequest, Operation>
        runAssetDiscoverySettings;
    private final OperationCallSettings.Builder<
            RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
        runAssetDiscoveryOperationSettings;
    private final UnaryCallSettings.Builder<SetFindingStateRequest, Finding>
        setFindingStateSettings;
    private final UnaryCallSettings.Builder<SetMuteRequest, Finding> setMuteSettings;
    private final UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings;
    private final UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings;
    private final UnaryCallSettings.Builder<
            SimulateSecurityHealthAnalyticsCustomModuleRequest,
            SimulateSecurityHealthAnalyticsCustomModuleResponse>
        simulateSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<UpdateExternalSystemRequest, ExternalSystem>
        updateExternalSystemSettings;
    private final UnaryCallSettings.Builder<UpdateFindingRequest, Finding> updateFindingSettings;
    private final UnaryCallSettings.Builder<UpdateMuteConfigRequest, MuteConfig>
        updateMuteConfigSettings;
    private final UnaryCallSettings.Builder<UpdateNotificationConfigRequest, NotificationConfig>
        updateNotificationConfigSettings;
    private final UnaryCallSettings.Builder<UpdateOrganizationSettingsRequest, OrganizationSettings>
        updateOrganizationSettingsSettings;
    private final UnaryCallSettings.Builder<
            UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        updateSecurityHealthAnalyticsCustomModuleSettings;
    private final UnaryCallSettings.Builder<UpdateSourceRequest, Source> updateSourceSettings;
    private final UnaryCallSettings.Builder<UpdateSecurityMarksRequest, SecurityMarks>
        updateSecurityMarksSettings;
    private final UnaryCallSettings.Builder<CreateBigQueryExportRequest, BigQueryExport>
        createBigQueryExportSettings;
    private final UnaryCallSettings.Builder<DeleteBigQueryExportRequest, Empty>
        deleteBigQueryExportSettings;
    private final UnaryCallSettings.Builder<UpdateBigQueryExportRequest, BigQueryExport>
        updateBigQueryExportSettings;
    private final PagedCallSettings.Builder<
            ListBigQueryExportsRequest,
            ListBigQueryExportsResponse,
            ListBigQueryExportsPagedResponse>
        listBigQueryExportsSettings;
    private final UnaryCallSettings.Builder<
            CreateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        createEventThreatDetectionCustomModuleSettings;
    private final UnaryCallSettings.Builder<DeleteEventThreatDetectionCustomModuleRequest, Empty>
        deleteEventThreatDetectionCustomModuleSettings;
    private final UnaryCallSettings.Builder<
            GetEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        getEventThreatDetectionCustomModuleSettings;
    private final PagedCallSettings.Builder<
            ListDescendantEventThreatDetectionCustomModulesRequest,
            ListDescendantEventThreatDetectionCustomModulesResponse,
            ListDescendantEventThreatDetectionCustomModulesPagedResponse>
        listDescendantEventThreatDetectionCustomModulesSettings;
    private final PagedCallSettings.Builder<
            ListEventThreatDetectionCustomModulesRequest,
            ListEventThreatDetectionCustomModulesResponse,
            ListEventThreatDetectionCustomModulesPagedResponse>
        listEventThreatDetectionCustomModulesSettings;
    private final UnaryCallSettings.Builder<
            UpdateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        updateEventThreatDetectionCustomModuleSettings;
    private final UnaryCallSettings.Builder<
            ValidateEventThreatDetectionCustomModuleRequest,
            ValidateEventThreatDetectionCustomModuleResponse>
        validateEventThreatDetectionCustomModuleSettings;
    private final UnaryCallSettings.Builder<
            GetEffectiveEventThreatDetectionCustomModuleRequest,
            EffectiveEventThreatDetectionCustomModule>
        getEffectiveEventThreatDetectionCustomModuleSettings;
    private final PagedCallSettings.Builder<
            ListEffectiveEventThreatDetectionCustomModulesRequest,
            ListEffectiveEventThreatDetectionCustomModulesResponse,
            ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
        listEffectiveEventThreatDetectionCustomModulesSettings;
    private final UnaryCallSettings.Builder<
            BatchCreateResourceValueConfigsRequest, BatchCreateResourceValueConfigsResponse>
        batchCreateResourceValueConfigsSettings;
    private final UnaryCallSettings.Builder<DeleteResourceValueConfigRequest, Empty>
        deleteResourceValueConfigSettings;
    private final UnaryCallSettings.Builder<GetResourceValueConfigRequest, ResourceValueConfig>
        getResourceValueConfigSettings;
    private final PagedCallSettings.Builder<
            ListResourceValueConfigsRequest,
            ListResourceValueConfigsResponse,
            ListResourceValueConfigsPagedResponse>
        listResourceValueConfigsSettings;
    private final UnaryCallSettings.Builder<UpdateResourceValueConfigRequest, ResourceValueConfig>
        updateResourceValueConfigSettings;
    private final PagedCallSettings.Builder<
            ListValuedResourcesRequest,
            ListValuedResourcesResponse,
            ListValuedResourcesPagedResponse>
        listValuedResourcesSettings;
    private final PagedCallSettings.Builder<
            ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>
        listAttackPathsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_1_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "retry_policy_3_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "no_retry_2_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_0_params", settings);
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
      definitions.put("retry_policy_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(480000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(480000L))
              .setTotalTimeout(Duration.ofMillis(480000L))
              .build();
      definitions.put("retry_policy_3_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(480000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(480000L))
              .setTotalTimeout(Duration.ofMillis(480000L))
              .build();
      definitions.put("no_retry_2_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      bulkMuteFindingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      bulkMuteFindingsOperationSettings = OperationCallSettings.newBuilder();
      createSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      createSourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createFindingSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createMuteConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createNotificationConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteMuteConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteNotificationConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSimulationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getValuedResourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getBigQueryExportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getMuteConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getNotificationConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getOrganizationSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEffectiveSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getSourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      groupAssetsSettings = PagedCallSettings.newBuilder(GROUP_ASSETS_PAGE_STR_FACT);
      groupFindingsSettings = PagedCallSettings.newBuilder(GROUP_FINDINGS_PAGE_STR_FACT);
      listAssetsSettings = PagedCallSettings.newBuilder(LIST_ASSETS_PAGE_STR_FACT);
      listDescendantSecurityHealthAnalyticsCustomModulesSettings =
          PagedCallSettings.newBuilder(
              LIST_DESCENDANT_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT);
      listFindingsSettings = PagedCallSettings.newBuilder(LIST_FINDINGS_PAGE_STR_FACT);
      listMuteConfigsSettings = PagedCallSettings.newBuilder(LIST_MUTE_CONFIGS_PAGE_STR_FACT);
      listNotificationConfigsSettings =
          PagedCallSettings.newBuilder(LIST_NOTIFICATION_CONFIGS_PAGE_STR_FACT);
      listEffectiveSecurityHealthAnalyticsCustomModulesSettings =
          PagedCallSettings.newBuilder(
              LIST_EFFECTIVE_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT);
      listSecurityHealthAnalyticsCustomModulesSettings =
          PagedCallSettings.newBuilder(LIST_SECURITY_HEALTH_ANALYTICS_CUSTOM_MODULES_PAGE_STR_FACT);
      listSourcesSettings = PagedCallSettings.newBuilder(LIST_SOURCES_PAGE_STR_FACT);
      runAssetDiscoverySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      runAssetDiscoveryOperationSettings = OperationCallSettings.newBuilder();
      setFindingStateSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setMuteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      setIamPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      testIamPermissionsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      simulateSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateExternalSystemSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateFindingSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateMuteConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateNotificationConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateOrganizationSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSecurityHealthAnalyticsCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSourceSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateSecurityMarksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createBigQueryExportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteBigQueryExportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateBigQueryExportSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listBigQueryExportsSettings =
          PagedCallSettings.newBuilder(LIST_BIG_QUERY_EXPORTS_PAGE_STR_FACT);
      createEventThreatDetectionCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteEventThreatDetectionCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEventThreatDetectionCustomModuleSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDescendantEventThreatDetectionCustomModulesSettings =
          PagedCallSettings.newBuilder(
              LIST_DESCENDANT_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT);
      listEventThreatDetectionCustomModulesSettings =
          PagedCallSettings.newBuilder(LIST_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT);
      updateEventThreatDetectionCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      validateEventThreatDetectionCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      getEffectiveEventThreatDetectionCustomModuleSettings =
          UnaryCallSettings.newUnaryCallSettingsBuilder();
      listEffectiveEventThreatDetectionCustomModulesSettings =
          PagedCallSettings.newBuilder(
              LIST_EFFECTIVE_EVENT_THREAT_DETECTION_CUSTOM_MODULES_PAGE_STR_FACT);
      batchCreateResourceValueConfigsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteResourceValueConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getResourceValueConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listResourceValueConfigsSettings =
          PagedCallSettings.newBuilder(LIST_RESOURCE_VALUE_CONFIGS_PAGE_STR_FACT);
      updateResourceValueConfigSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listValuedResourcesSettings =
          PagedCallSettings.newBuilder(LIST_VALUED_RESOURCES_PAGE_STR_FACT);
      listAttackPathsSettings = PagedCallSettings.newBuilder(LIST_ATTACK_PATHS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              bulkMuteFindingsSettings,
              createSecurityHealthAnalyticsCustomModuleSettings,
              createSourceSettings,
              createFindingSettings,
              createMuteConfigSettings,
              createNotificationConfigSettings,
              deleteMuteConfigSettings,
              deleteNotificationConfigSettings,
              deleteSecurityHealthAnalyticsCustomModuleSettings,
              getSimulationSettings,
              getValuedResourceSettings,
              getBigQueryExportSettings,
              getIamPolicySettings,
              getMuteConfigSettings,
              getNotificationConfigSettings,
              getOrganizationSettingsSettings,
              getEffectiveSecurityHealthAnalyticsCustomModuleSettings,
              getSecurityHealthAnalyticsCustomModuleSettings,
              getSourceSettings,
              groupAssetsSettings,
              groupFindingsSettings,
              listAssetsSettings,
              listDescendantSecurityHealthAnalyticsCustomModulesSettings,
              listFindingsSettings,
              listMuteConfigsSettings,
              listNotificationConfigsSettings,
              listEffectiveSecurityHealthAnalyticsCustomModulesSettings,
              listSecurityHealthAnalyticsCustomModulesSettings,
              listSourcesSettings,
              runAssetDiscoverySettings,
              setFindingStateSettings,
              setMuteSettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              simulateSecurityHealthAnalyticsCustomModuleSettings,
              updateExternalSystemSettings,
              updateFindingSettings,
              updateMuteConfigSettings,
              updateNotificationConfigSettings,
              updateOrganizationSettingsSettings,
              updateSecurityHealthAnalyticsCustomModuleSettings,
              updateSourceSettings,
              updateSecurityMarksSettings,
              createBigQueryExportSettings,
              deleteBigQueryExportSettings,
              updateBigQueryExportSettings,
              listBigQueryExportsSettings,
              createEventThreatDetectionCustomModuleSettings,
              deleteEventThreatDetectionCustomModuleSettings,
              getEventThreatDetectionCustomModuleSettings,
              listDescendantEventThreatDetectionCustomModulesSettings,
              listEventThreatDetectionCustomModulesSettings,
              updateEventThreatDetectionCustomModuleSettings,
              validateEventThreatDetectionCustomModuleSettings,
              getEffectiveEventThreatDetectionCustomModuleSettings,
              listEffectiveEventThreatDetectionCustomModulesSettings,
              batchCreateResourceValueConfigsSettings,
              deleteResourceValueConfigSettings,
              getResourceValueConfigSettings,
              listResourceValueConfigsSettings,
              updateResourceValueConfigSettings,
              listValuedResourcesSettings,
              listAttackPathsSettings);
      initDefaults(this);
    }

    protected Builder(SecurityCenterStubSettings settings) {
      super(settings);

      bulkMuteFindingsSettings = settings.bulkMuteFindingsSettings.toBuilder();
      bulkMuteFindingsOperationSettings = settings.bulkMuteFindingsOperationSettings.toBuilder();
      createSecurityHealthAnalyticsCustomModuleSettings =
          settings.createSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      createSourceSettings = settings.createSourceSettings.toBuilder();
      createFindingSettings = settings.createFindingSettings.toBuilder();
      createMuteConfigSettings = settings.createMuteConfigSettings.toBuilder();
      createNotificationConfigSettings = settings.createNotificationConfigSettings.toBuilder();
      deleteMuteConfigSettings = settings.deleteMuteConfigSettings.toBuilder();
      deleteNotificationConfigSettings = settings.deleteNotificationConfigSettings.toBuilder();
      deleteSecurityHealthAnalyticsCustomModuleSettings =
          settings.deleteSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      getSimulationSettings = settings.getSimulationSettings.toBuilder();
      getValuedResourceSettings = settings.getValuedResourceSettings.toBuilder();
      getBigQueryExportSettings = settings.getBigQueryExportSettings.toBuilder();
      getIamPolicySettings = settings.getIamPolicySettings.toBuilder();
      getMuteConfigSettings = settings.getMuteConfigSettings.toBuilder();
      getNotificationConfigSettings = settings.getNotificationConfigSettings.toBuilder();
      getOrganizationSettingsSettings = settings.getOrganizationSettingsSettings.toBuilder();
      getEffectiveSecurityHealthAnalyticsCustomModuleSettings =
          settings.getEffectiveSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      getSecurityHealthAnalyticsCustomModuleSettings =
          settings.getSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      getSourceSettings = settings.getSourceSettings.toBuilder();
      groupAssetsSettings = settings.groupAssetsSettings.toBuilder();
      groupFindingsSettings = settings.groupFindingsSettings.toBuilder();
      listAssetsSettings = settings.listAssetsSettings.toBuilder();
      listDescendantSecurityHealthAnalyticsCustomModulesSettings =
          settings.listDescendantSecurityHealthAnalyticsCustomModulesSettings.toBuilder();
      listFindingsSettings = settings.listFindingsSettings.toBuilder();
      listMuteConfigsSettings = settings.listMuteConfigsSettings.toBuilder();
      listNotificationConfigsSettings = settings.listNotificationConfigsSettings.toBuilder();
      listEffectiveSecurityHealthAnalyticsCustomModulesSettings =
          settings.listEffectiveSecurityHealthAnalyticsCustomModulesSettings.toBuilder();
      listSecurityHealthAnalyticsCustomModulesSettings =
          settings.listSecurityHealthAnalyticsCustomModulesSettings.toBuilder();
      listSourcesSettings = settings.listSourcesSettings.toBuilder();
      runAssetDiscoverySettings = settings.runAssetDiscoverySettings.toBuilder();
      runAssetDiscoveryOperationSettings = settings.runAssetDiscoveryOperationSettings.toBuilder();
      setFindingStateSettings = settings.setFindingStateSettings.toBuilder();
      setMuteSettings = settings.setMuteSettings.toBuilder();
      setIamPolicySettings = settings.setIamPolicySettings.toBuilder();
      testIamPermissionsSettings = settings.testIamPermissionsSettings.toBuilder();
      simulateSecurityHealthAnalyticsCustomModuleSettings =
          settings.simulateSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      updateExternalSystemSettings = settings.updateExternalSystemSettings.toBuilder();
      updateFindingSettings = settings.updateFindingSettings.toBuilder();
      updateMuteConfigSettings = settings.updateMuteConfigSettings.toBuilder();
      updateNotificationConfigSettings = settings.updateNotificationConfigSettings.toBuilder();
      updateOrganizationSettingsSettings = settings.updateOrganizationSettingsSettings.toBuilder();
      updateSecurityHealthAnalyticsCustomModuleSettings =
          settings.updateSecurityHealthAnalyticsCustomModuleSettings.toBuilder();
      updateSourceSettings = settings.updateSourceSettings.toBuilder();
      updateSecurityMarksSettings = settings.updateSecurityMarksSettings.toBuilder();
      createBigQueryExportSettings = settings.createBigQueryExportSettings.toBuilder();
      deleteBigQueryExportSettings = settings.deleteBigQueryExportSettings.toBuilder();
      updateBigQueryExportSettings = settings.updateBigQueryExportSettings.toBuilder();
      listBigQueryExportsSettings = settings.listBigQueryExportsSettings.toBuilder();
      createEventThreatDetectionCustomModuleSettings =
          settings.createEventThreatDetectionCustomModuleSettings.toBuilder();
      deleteEventThreatDetectionCustomModuleSettings =
          settings.deleteEventThreatDetectionCustomModuleSettings.toBuilder();
      getEventThreatDetectionCustomModuleSettings =
          settings.getEventThreatDetectionCustomModuleSettings.toBuilder();
      listDescendantEventThreatDetectionCustomModulesSettings =
          settings.listDescendantEventThreatDetectionCustomModulesSettings.toBuilder();
      listEventThreatDetectionCustomModulesSettings =
          settings.listEventThreatDetectionCustomModulesSettings.toBuilder();
      updateEventThreatDetectionCustomModuleSettings =
          settings.updateEventThreatDetectionCustomModuleSettings.toBuilder();
      validateEventThreatDetectionCustomModuleSettings =
          settings.validateEventThreatDetectionCustomModuleSettings.toBuilder();
      getEffectiveEventThreatDetectionCustomModuleSettings =
          settings.getEffectiveEventThreatDetectionCustomModuleSettings.toBuilder();
      listEffectiveEventThreatDetectionCustomModulesSettings =
          settings.listEffectiveEventThreatDetectionCustomModulesSettings.toBuilder();
      batchCreateResourceValueConfigsSettings =
          settings.batchCreateResourceValueConfigsSettings.toBuilder();
      deleteResourceValueConfigSettings = settings.deleteResourceValueConfigSettings.toBuilder();
      getResourceValueConfigSettings = settings.getResourceValueConfigSettings.toBuilder();
      listResourceValueConfigsSettings = settings.listResourceValueConfigsSettings.toBuilder();
      updateResourceValueConfigSettings = settings.updateResourceValueConfigSettings.toBuilder();
      listValuedResourcesSettings = settings.listValuedResourcesSettings.toBuilder();
      listAttackPathsSettings = settings.listAttackPathsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              bulkMuteFindingsSettings,
              createSecurityHealthAnalyticsCustomModuleSettings,
              createSourceSettings,
              createFindingSettings,
              createMuteConfigSettings,
              createNotificationConfigSettings,
              deleteMuteConfigSettings,
              deleteNotificationConfigSettings,
              deleteSecurityHealthAnalyticsCustomModuleSettings,
              getSimulationSettings,
              getValuedResourceSettings,
              getBigQueryExportSettings,
              getIamPolicySettings,
              getMuteConfigSettings,
              getNotificationConfigSettings,
              getOrganizationSettingsSettings,
              getEffectiveSecurityHealthAnalyticsCustomModuleSettings,
              getSecurityHealthAnalyticsCustomModuleSettings,
              getSourceSettings,
              groupAssetsSettings,
              groupFindingsSettings,
              listAssetsSettings,
              listDescendantSecurityHealthAnalyticsCustomModulesSettings,
              listFindingsSettings,
              listMuteConfigsSettings,
              listNotificationConfigsSettings,
              listEffectiveSecurityHealthAnalyticsCustomModulesSettings,
              listSecurityHealthAnalyticsCustomModulesSettings,
              listSourcesSettings,
              runAssetDiscoverySettings,
              setFindingStateSettings,
              setMuteSettings,
              setIamPolicySettings,
              testIamPermissionsSettings,
              simulateSecurityHealthAnalyticsCustomModuleSettings,
              updateExternalSystemSettings,
              updateFindingSettings,
              updateMuteConfigSettings,
              updateNotificationConfigSettings,
              updateOrganizationSettingsSettings,
              updateSecurityHealthAnalyticsCustomModuleSettings,
              updateSourceSettings,
              updateSecurityMarksSettings,
              createBigQueryExportSettings,
              deleteBigQueryExportSettings,
              updateBigQueryExportSettings,
              listBigQueryExportsSettings,
              createEventThreatDetectionCustomModuleSettings,
              deleteEventThreatDetectionCustomModuleSettings,
              getEventThreatDetectionCustomModuleSettings,
              listDescendantEventThreatDetectionCustomModulesSettings,
              listEventThreatDetectionCustomModulesSettings,
              updateEventThreatDetectionCustomModuleSettings,
              validateEventThreatDetectionCustomModuleSettings,
              getEffectiveEventThreatDetectionCustomModuleSettings,
              listEffectiveEventThreatDetectionCustomModulesSettings,
              batchCreateResourceValueConfigsSettings,
              deleteResourceValueConfigSettings,
              getResourceValueConfigSettings,
              listResourceValueConfigsSettings,
              updateResourceValueConfigSettings,
              listValuedResourcesSettings,
              listAttackPathsSettings);
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
          .bulkMuteFindingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createSourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createFindingSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createMuteConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createNotificationConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .deleteMuteConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteNotificationConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .deleteSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .getSimulationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getValuedResourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getBigQueryExportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getMuteConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getNotificationConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getOrganizationSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getEffectiveSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .getSourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .groupAssetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .groupFindingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .listAssetsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .listDescendantSecurityHealthAnalyticsCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listFindingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_3_params"));

      builder
          .listMuteConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listNotificationConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listEffectiveSecurityHealthAnalyticsCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listSecurityHealthAnalyticsCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .listSourcesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .runAssetDiscoverySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .setFindingStateSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .setMuteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .setIamPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .testIamPermissionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_1_params"));

      builder
          .simulateSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateExternalSystemSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateFindingSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateMuteConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateNotificationConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateOrganizationSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateSecurityHealthAnalyticsCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateSourceSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateSecurityMarksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .createBigQueryExportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteBigQueryExportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateBigQueryExportSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listBigQueryExportsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listDescendantEventThreatDetectionCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listEventThreatDetectionCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .validateEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getEffectiveEventThreatDetectionCustomModuleSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listEffectiveEventThreatDetectionCustomModulesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .batchCreateResourceValueConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteResourceValueConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getResourceValueConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listResourceValueConfigsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateResourceValueConfigSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listValuedResourcesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listAttackPathsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .bulkMuteFindingsOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<BulkMuteFindingsRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(BulkMuteFindingsResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Empty.class))
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
          .runAssetDiscoveryOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<RunAssetDiscoveryRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  RunAssetDiscoveryResponse.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(Empty.class))
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

    /** Returns the builder for the settings used for calls to bulkMuteFindings. */
    public UnaryCallSettings.Builder<BulkMuteFindingsRequest, Operation>
        bulkMuteFindingsSettings() {
      return bulkMuteFindingsSettings;
    }

    /** Returns the builder for the settings used for calls to bulkMuteFindings. */
    public OperationCallSettings.Builder<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
        bulkMuteFindingsOperationSettings() {
      return bulkMuteFindingsOperationSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * createSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        createSecurityHealthAnalyticsCustomModuleSettings() {
      return createSecurityHealthAnalyticsCustomModuleSettings;
    }

    /** Returns the builder for the settings used for calls to createSource. */
    public UnaryCallSettings.Builder<CreateSourceRequest, Source> createSourceSettings() {
      return createSourceSettings;
    }

    /** Returns the builder for the settings used for calls to createFinding. */
    public UnaryCallSettings.Builder<CreateFindingRequest, Finding> createFindingSettings() {
      return createFindingSettings;
    }

    /** Returns the builder for the settings used for calls to createMuteConfig. */
    public UnaryCallSettings.Builder<CreateMuteConfigRequest, MuteConfig>
        createMuteConfigSettings() {
      return createMuteConfigSettings;
    }

    /** Returns the builder for the settings used for calls to createNotificationConfig. */
    public UnaryCallSettings.Builder<CreateNotificationConfigRequest, NotificationConfig>
        createNotificationConfigSettings() {
      return createNotificationConfigSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMuteConfig. */
    public UnaryCallSettings.Builder<DeleteMuteConfigRequest, Empty> deleteMuteConfigSettings() {
      return deleteMuteConfigSettings;
    }

    /** Returns the builder for the settings used for calls to deleteNotificationConfig. */
    public UnaryCallSettings.Builder<DeleteNotificationConfigRequest, Empty>
        deleteNotificationConfigSettings() {
      return deleteNotificationConfigSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * deleteSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
        deleteSecurityHealthAnalyticsCustomModuleSettings() {
      return deleteSecurityHealthAnalyticsCustomModuleSettings;
    }

    /** Returns the builder for the settings used for calls to getSimulation. */
    public UnaryCallSettings.Builder<GetSimulationRequest, Simulation> getSimulationSettings() {
      return getSimulationSettings;
    }

    /** Returns the builder for the settings used for calls to getValuedResource. */
    public UnaryCallSettings.Builder<GetValuedResourceRequest, ValuedResource>
        getValuedResourceSettings() {
      return getValuedResourceSettings;
    }

    /** Returns the builder for the settings used for calls to getBigQueryExport. */
    public UnaryCallSettings.Builder<GetBigQueryExportRequest, BigQueryExport>
        getBigQueryExportSettings() {
      return getBigQueryExportSettings;
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to getMuteConfig. */
    public UnaryCallSettings.Builder<GetMuteConfigRequest, MuteConfig> getMuteConfigSettings() {
      return getMuteConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getNotificationConfig. */
    public UnaryCallSettings.Builder<GetNotificationConfigRequest, NotificationConfig>
        getNotificationConfigSettings() {
      return getNotificationConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getOrganizationSettings. */
    public UnaryCallSettings.Builder<GetOrganizationSettingsRequest, OrganizationSettings>
        getOrganizationSettingsSettings() {
      return getOrganizationSettingsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * getEffectiveSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
            EffectiveSecurityHealthAnalyticsCustomModule>
        getEffectiveSecurityHealthAnalyticsCustomModuleSettings() {
      return getEffectiveSecurityHealthAnalyticsCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * getSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        getSecurityHealthAnalyticsCustomModuleSettings() {
      return getSecurityHealthAnalyticsCustomModuleSettings;
    }

    /** Returns the builder for the settings used for calls to getSource. */
    public UnaryCallSettings.Builder<GetSourceRequest, Source> getSourceSettings() {
      return getSourceSettings;
    }

    /**
     * Returns the builder for the settings used for calls to groupAssets.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public PagedCallSettings.Builder<
            GroupAssetsRequest, GroupAssetsResponse, GroupAssetsPagedResponse>
        groupAssetsSettings() {
      return groupAssetsSettings;
    }

    /** Returns the builder for the settings used for calls to groupFindings. */
    public PagedCallSettings.Builder<
            GroupFindingsRequest, GroupFindingsResponse, GroupFindingsPagedResponse>
        groupFindingsSettings() {
      return groupFindingsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listAssets.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public PagedCallSettings.Builder<ListAssetsRequest, ListAssetsResponse, ListAssetsPagedResponse>
        listAssetsSettings() {
      return listAssetsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listDescendantSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
            ListDescendantSecurityHealthAnalyticsCustomModulesResponse,
            ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
        listDescendantSecurityHealthAnalyticsCustomModulesSettings() {
      return listDescendantSecurityHealthAnalyticsCustomModulesSettings;
    }

    /** Returns the builder for the settings used for calls to listFindings. */
    public PagedCallSettings.Builder<
            ListFindingsRequest, ListFindingsResponse, ListFindingsPagedResponse>
        listFindingsSettings() {
      return listFindingsSettings;
    }

    /** Returns the builder for the settings used for calls to listMuteConfigs. */
    public PagedCallSettings.Builder<
            ListMuteConfigsRequest, ListMuteConfigsResponse, ListMuteConfigsPagedResponse>
        listMuteConfigsSettings() {
      return listMuteConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to listNotificationConfigs. */
    public PagedCallSettings.Builder<
            ListNotificationConfigsRequest,
            ListNotificationConfigsResponse,
            ListNotificationConfigsPagedResponse>
        listNotificationConfigsSettings() {
      return listNotificationConfigsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listEffectiveSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
            ListEffectiveSecurityHealthAnalyticsCustomModulesResponse,
            ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
        listEffectiveSecurityHealthAnalyticsCustomModulesSettings() {
      return listEffectiveSecurityHealthAnalyticsCustomModulesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listSecurityHealthAnalyticsCustomModules.
     */
    public PagedCallSettings.Builder<
            ListSecurityHealthAnalyticsCustomModulesRequest,
            ListSecurityHealthAnalyticsCustomModulesResponse,
            ListSecurityHealthAnalyticsCustomModulesPagedResponse>
        listSecurityHealthAnalyticsCustomModulesSettings() {
      return listSecurityHealthAnalyticsCustomModulesSettings;
    }

    /** Returns the builder for the settings used for calls to listSources. */
    public PagedCallSettings.Builder<
            ListSourcesRequest, ListSourcesResponse, ListSourcesPagedResponse>
        listSourcesSettings() {
      return listSourcesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to runAssetDiscovery.
     *
     * @deprecated This method is deprecated and will be removed in the next major version update.
     */
    @Deprecated
    public UnaryCallSettings.Builder<RunAssetDiscoveryRequest, Operation>
        runAssetDiscoverySettings() {
      return runAssetDiscoverySettings;
    }

    /** Returns the builder for the settings used for calls to runAssetDiscovery. */
    public OperationCallSettings.Builder<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
        runAssetDiscoveryOperationSettings() {
      return runAssetDiscoveryOperationSettings;
    }

    /** Returns the builder for the settings used for calls to setFindingState. */
    public UnaryCallSettings.Builder<SetFindingStateRequest, Finding> setFindingStateSettings() {
      return setFindingStateSettings;
    }

    /** Returns the builder for the settings used for calls to setMute. */
    public UnaryCallSettings.Builder<SetMuteRequest, Finding> setMuteSettings() {
      return setMuteSettings;
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return setIamPolicySettings;
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return testIamPermissionsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * simulateSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            SimulateSecurityHealthAnalyticsCustomModuleRequest,
            SimulateSecurityHealthAnalyticsCustomModuleResponse>
        simulateSecurityHealthAnalyticsCustomModuleSettings() {
      return simulateSecurityHealthAnalyticsCustomModuleSettings;
    }

    /** Returns the builder for the settings used for calls to updateExternalSystem. */
    public UnaryCallSettings.Builder<UpdateExternalSystemRequest, ExternalSystem>
        updateExternalSystemSettings() {
      return updateExternalSystemSettings;
    }

    /** Returns the builder for the settings used for calls to updateFinding. */
    public UnaryCallSettings.Builder<UpdateFindingRequest, Finding> updateFindingSettings() {
      return updateFindingSettings;
    }

    /** Returns the builder for the settings used for calls to updateMuteConfig. */
    public UnaryCallSettings.Builder<UpdateMuteConfigRequest, MuteConfig>
        updateMuteConfigSettings() {
      return updateMuteConfigSettings;
    }

    /** Returns the builder for the settings used for calls to updateNotificationConfig. */
    public UnaryCallSettings.Builder<UpdateNotificationConfigRequest, NotificationConfig>
        updateNotificationConfigSettings() {
      return updateNotificationConfigSettings;
    }

    /** Returns the builder for the settings used for calls to updateOrganizationSettings. */
    public UnaryCallSettings.Builder<UpdateOrganizationSettingsRequest, OrganizationSettings>
        updateOrganizationSettingsSettings() {
      return updateOrganizationSettingsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * updateSecurityHealthAnalyticsCustomModule.
     */
    public UnaryCallSettings.Builder<
            UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
        updateSecurityHealthAnalyticsCustomModuleSettings() {
      return updateSecurityHealthAnalyticsCustomModuleSettings;
    }

    /** Returns the builder for the settings used for calls to updateSource. */
    public UnaryCallSettings.Builder<UpdateSourceRequest, Source> updateSourceSettings() {
      return updateSourceSettings;
    }

    /** Returns the builder for the settings used for calls to updateSecurityMarks. */
    public UnaryCallSettings.Builder<UpdateSecurityMarksRequest, SecurityMarks>
        updateSecurityMarksSettings() {
      return updateSecurityMarksSettings;
    }

    /** Returns the builder for the settings used for calls to createBigQueryExport. */
    public UnaryCallSettings.Builder<CreateBigQueryExportRequest, BigQueryExport>
        createBigQueryExportSettings() {
      return createBigQueryExportSettings;
    }

    /** Returns the builder for the settings used for calls to deleteBigQueryExport. */
    public UnaryCallSettings.Builder<DeleteBigQueryExportRequest, Empty>
        deleteBigQueryExportSettings() {
      return deleteBigQueryExportSettings;
    }

    /** Returns the builder for the settings used for calls to updateBigQueryExport. */
    public UnaryCallSettings.Builder<UpdateBigQueryExportRequest, BigQueryExport>
        updateBigQueryExportSettings() {
      return updateBigQueryExportSettings;
    }

    /** Returns the builder for the settings used for calls to listBigQueryExports. */
    public PagedCallSettings.Builder<
            ListBigQueryExportsRequest,
            ListBigQueryExportsResponse,
            ListBigQueryExportsPagedResponse>
        listBigQueryExportsSettings() {
      return listBigQueryExportsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * createEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<
            CreateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        createEventThreatDetectionCustomModuleSettings() {
      return createEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * deleteEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<DeleteEventThreatDetectionCustomModuleRequest, Empty>
        deleteEventThreatDetectionCustomModuleSettings() {
      return deleteEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to getEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        getEventThreatDetectionCustomModuleSettings() {
      return getEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listDescendantEventThreatDetectionCustomModules.
     */
    public PagedCallSettings.Builder<
            ListDescendantEventThreatDetectionCustomModulesRequest,
            ListDescendantEventThreatDetectionCustomModulesResponse,
            ListDescendantEventThreatDetectionCustomModulesPagedResponse>
        listDescendantEventThreatDetectionCustomModulesSettings() {
      return listDescendantEventThreatDetectionCustomModulesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listEventThreatDetectionCustomModules.
     */
    public PagedCallSettings.Builder<
            ListEventThreatDetectionCustomModulesRequest,
            ListEventThreatDetectionCustomModulesResponse,
            ListEventThreatDetectionCustomModulesPagedResponse>
        listEventThreatDetectionCustomModulesSettings() {
      return listEventThreatDetectionCustomModulesSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * updateEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<
            UpdateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
        updateEventThreatDetectionCustomModuleSettings() {
      return updateEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * validateEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<
            ValidateEventThreatDetectionCustomModuleRequest,
            ValidateEventThreatDetectionCustomModuleResponse>
        validateEventThreatDetectionCustomModuleSettings() {
      return validateEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * getEffectiveEventThreatDetectionCustomModule.
     */
    public UnaryCallSettings.Builder<
            GetEffectiveEventThreatDetectionCustomModuleRequest,
            EffectiveEventThreatDetectionCustomModule>
        getEffectiveEventThreatDetectionCustomModuleSettings() {
      return getEffectiveEventThreatDetectionCustomModuleSettings;
    }

    /**
     * Returns the builder for the settings used for calls to
     * listEffectiveEventThreatDetectionCustomModules.
     */
    public PagedCallSettings.Builder<
            ListEffectiveEventThreatDetectionCustomModulesRequest,
            ListEffectiveEventThreatDetectionCustomModulesResponse,
            ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
        listEffectiveEventThreatDetectionCustomModulesSettings() {
      return listEffectiveEventThreatDetectionCustomModulesSettings;
    }

    /** Returns the builder for the settings used for calls to batchCreateResourceValueConfigs. */
    public UnaryCallSettings.Builder<
            BatchCreateResourceValueConfigsRequest, BatchCreateResourceValueConfigsResponse>
        batchCreateResourceValueConfigsSettings() {
      return batchCreateResourceValueConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteResourceValueConfig. */
    public UnaryCallSettings.Builder<DeleteResourceValueConfigRequest, Empty>
        deleteResourceValueConfigSettings() {
      return deleteResourceValueConfigSettings;
    }

    /** Returns the builder for the settings used for calls to getResourceValueConfig. */
    public UnaryCallSettings.Builder<GetResourceValueConfigRequest, ResourceValueConfig>
        getResourceValueConfigSettings() {
      return getResourceValueConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listResourceValueConfigs. */
    public PagedCallSettings.Builder<
            ListResourceValueConfigsRequest,
            ListResourceValueConfigsResponse,
            ListResourceValueConfigsPagedResponse>
        listResourceValueConfigsSettings() {
      return listResourceValueConfigsSettings;
    }

    /** Returns the builder for the settings used for calls to updateResourceValueConfig. */
    public UnaryCallSettings.Builder<UpdateResourceValueConfigRequest, ResourceValueConfig>
        updateResourceValueConfigSettings() {
      return updateResourceValueConfigSettings;
    }

    /** Returns the builder for the settings used for calls to listValuedResources. */
    public PagedCallSettings.Builder<
            ListValuedResourcesRequest,
            ListValuedResourcesResponse,
            ListValuedResourcesPagedResponse>
        listValuedResourcesSettings() {
      return listValuedResourcesSettings;
    }

    /** Returns the builder for the settings used for calls to listAttackPaths. */
    public PagedCallSettings.Builder<
            ListAttackPathsRequest, ListAttackPathsResponse, ListAttackPathsPagedResponse>
        listAttackPathsSettings() {
      return listAttackPathsSettings;
    }

    @Override
    public SecurityCenterStubSettings build() throws IOException {
      return new SecurityCenterStubSettings(this);
    }
  }
}
