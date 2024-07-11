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

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
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
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the SecurityCenter service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class SecurityCenterStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<BulkMuteFindingsRequest, BulkMuteFindingsResponse, Empty>
      bulkMuteFindingsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: bulkMuteFindingsOperationCallable()");
  }

  public UnaryCallable<BulkMuteFindingsRequest, Operation> bulkMuteFindingsCallable() {
    throw new UnsupportedOperationException("Not implemented: bulkMuteFindingsCallable()");
  }

  public UnaryCallable<
          CreateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      createSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<CreateSourceRequest, Source> createSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: createSourceCallable()");
  }

  public UnaryCallable<CreateFindingRequest, Finding> createFindingCallable() {
    throw new UnsupportedOperationException("Not implemented: createFindingCallable()");
  }

  public UnaryCallable<CreateMuteConfigRequest, MuteConfig> createMuteConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createMuteConfigCallable()");
  }

  public UnaryCallable<CreateNotificationConfigRequest, NotificationConfig>
      createNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: createNotificationConfigCallable()");
  }

  public UnaryCallable<DeleteMuteConfigRequest, Empty> deleteMuteConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteMuteConfigCallable()");
  }

  public UnaryCallable<DeleteNotificationConfigRequest, Empty> deleteNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteNotificationConfigCallable()");
  }

  public UnaryCallable<DeleteSecurityHealthAnalyticsCustomModuleRequest, Empty>
      deleteSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<GetSimulationRequest, Simulation> getSimulationCallable() {
    throw new UnsupportedOperationException("Not implemented: getSimulationCallable()");
  }

  public UnaryCallable<GetValuedResourceRequest, ValuedResource> getValuedResourceCallable() {
    throw new UnsupportedOperationException("Not implemented: getValuedResourceCallable()");
  }

  public UnaryCallable<GetBigQueryExportRequest, BigQueryExport> getBigQueryExportCallable() {
    throw new UnsupportedOperationException("Not implemented: getBigQueryExportCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<GetMuteConfigRequest, MuteConfig> getMuteConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getMuteConfigCallable()");
  }

  public UnaryCallable<GetNotificationConfigRequest, NotificationConfig>
      getNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getNotificationConfigCallable()");
  }

  public UnaryCallable<GetOrganizationSettingsRequest, OrganizationSettings>
      getOrganizationSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getOrganizationSettingsCallable()");
  }

  public UnaryCallable<
          GetEffectiveSecurityHealthAnalyticsCustomModuleRequest,
          EffectiveSecurityHealthAnalyticsCustomModule>
      getEffectiveSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getEffectiveSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<
          GetSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      getSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<GetSourceRequest, Source> getSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: getSourceCallable()");
  }

  @Deprecated
  public UnaryCallable<GroupAssetsRequest, GroupAssetsPagedResponse> groupAssetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: groupAssetsPagedCallable()");
  }

  @Deprecated
  public UnaryCallable<GroupAssetsRequest, GroupAssetsResponse> groupAssetsCallable() {
    throw new UnsupportedOperationException("Not implemented: groupAssetsCallable()");
  }

  public UnaryCallable<GroupFindingsRequest, GroupFindingsPagedResponse>
      groupFindingsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: groupFindingsPagedCallable()");
  }

  public UnaryCallable<GroupFindingsRequest, GroupFindingsResponse> groupFindingsCallable() {
    throw new UnsupportedOperationException("Not implemented: groupFindingsCallable()");
  }

  @Deprecated
  public UnaryCallable<ListAssetsRequest, ListAssetsPagedResponse> listAssetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAssetsPagedCallable()");
  }

  @Deprecated
  public UnaryCallable<ListAssetsRequest, ListAssetsResponse> listAssetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAssetsCallable()");
  }

  public UnaryCallable<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesPagedResponse>
      listDescendantSecurityHealthAnalyticsCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDescendantSecurityHealthAnalyticsCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListDescendantSecurityHealthAnalyticsCustomModulesRequest,
          ListDescendantSecurityHealthAnalyticsCustomModulesResponse>
      listDescendantSecurityHealthAnalyticsCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDescendantSecurityHealthAnalyticsCustomModulesCallable()");
  }

  public UnaryCallable<ListFindingsRequest, ListFindingsPagedResponse> listFindingsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listFindingsPagedCallable()");
  }

  public UnaryCallable<ListFindingsRequest, ListFindingsResponse> listFindingsCallable() {
    throw new UnsupportedOperationException("Not implemented: listFindingsCallable()");
  }

  public UnaryCallable<ListMuteConfigsRequest, ListMuteConfigsPagedResponse>
      listMuteConfigsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listMuteConfigsPagedCallable()");
  }

  public UnaryCallable<ListMuteConfigsRequest, ListMuteConfigsResponse> listMuteConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listMuteConfigsCallable()");
  }

  public UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsPagedResponse>
      listNotificationConfigsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listNotificationConfigsPagedCallable()");
  }

  public UnaryCallable<ListNotificationConfigsRequest, ListNotificationConfigsResponse>
      listNotificationConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listNotificationConfigsCallable()");
  }

  public UnaryCallable<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse>
      listEffectiveSecurityHealthAnalyticsCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEffectiveSecurityHealthAnalyticsCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest,
          ListEffectiveSecurityHealthAnalyticsCustomModulesResponse>
      listEffectiveSecurityHealthAnalyticsCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEffectiveSecurityHealthAnalyticsCustomModulesCallable()");
  }

  public UnaryCallable<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesPagedResponse>
      listSecurityHealthAnalyticsCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listSecurityHealthAnalyticsCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListSecurityHealthAnalyticsCustomModulesRequest,
          ListSecurityHealthAnalyticsCustomModulesResponse>
      listSecurityHealthAnalyticsCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listSecurityHealthAnalyticsCustomModulesCallable()");
  }

  public UnaryCallable<ListSourcesRequest, ListSourcesPagedResponse> listSourcesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSourcesPagedCallable()");
  }

  public UnaryCallable<ListSourcesRequest, ListSourcesResponse> listSourcesCallable() {
    throw new UnsupportedOperationException("Not implemented: listSourcesCallable()");
  }

  @Deprecated
  public OperationCallable<RunAssetDiscoveryRequest, RunAssetDiscoveryResponse, Empty>
      runAssetDiscoveryOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: runAssetDiscoveryOperationCallable()");
  }

  @Deprecated
  public UnaryCallable<RunAssetDiscoveryRequest, Operation> runAssetDiscoveryCallable() {
    throw new UnsupportedOperationException("Not implemented: runAssetDiscoveryCallable()");
  }

  public UnaryCallable<SetFindingStateRequest, Finding> setFindingStateCallable() {
    throw new UnsupportedOperationException("Not implemented: setFindingStateCallable()");
  }

  public UnaryCallable<SetMuteRequest, Finding> setMuteCallable() {
    throw new UnsupportedOperationException("Not implemented: setMuteCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public UnaryCallable<
          SimulateSecurityHealthAnalyticsCustomModuleRequest,
          SimulateSecurityHealthAnalyticsCustomModuleResponse>
      simulateSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: simulateSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<UpdateExternalSystemRequest, ExternalSystem> updateExternalSystemCallable() {
    throw new UnsupportedOperationException("Not implemented: updateExternalSystemCallable()");
  }

  public UnaryCallable<UpdateFindingRequest, Finding> updateFindingCallable() {
    throw new UnsupportedOperationException("Not implemented: updateFindingCallable()");
  }

  public UnaryCallable<UpdateMuteConfigRequest, MuteConfig> updateMuteConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateMuteConfigCallable()");
  }

  public UnaryCallable<UpdateNotificationConfigRequest, NotificationConfig>
      updateNotificationConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateNotificationConfigCallable()");
  }

  public UnaryCallable<UpdateOrganizationSettingsRequest, OrganizationSettings>
      updateOrganizationSettingsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateOrganizationSettingsCallable()");
  }

  public UnaryCallable<
          UpdateSecurityHealthAnalyticsCustomModuleRequest, SecurityHealthAnalyticsCustomModule>
      updateSecurityHealthAnalyticsCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateSecurityHealthAnalyticsCustomModuleCallable()");
  }

  public UnaryCallable<UpdateSourceRequest, Source> updateSourceCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSourceCallable()");
  }

  public UnaryCallable<UpdateSecurityMarksRequest, SecurityMarks> updateSecurityMarksCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSecurityMarksCallable()");
  }

  public UnaryCallable<CreateBigQueryExportRequest, BigQueryExport> createBigQueryExportCallable() {
    throw new UnsupportedOperationException("Not implemented: createBigQueryExportCallable()");
  }

  public UnaryCallable<DeleteBigQueryExportRequest, Empty> deleteBigQueryExportCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBigQueryExportCallable()");
  }

  public UnaryCallable<UpdateBigQueryExportRequest, BigQueryExport> updateBigQueryExportCallable() {
    throw new UnsupportedOperationException("Not implemented: updateBigQueryExportCallable()");
  }

  public UnaryCallable<ListBigQueryExportsRequest, ListBigQueryExportsPagedResponse>
      listBigQueryExportsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBigQueryExportsPagedCallable()");
  }

  public UnaryCallable<ListBigQueryExportsRequest, ListBigQueryExportsResponse>
      listBigQueryExportsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBigQueryExportsCallable()");
  }

  public UnaryCallable<
          CreateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      createEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<DeleteEventThreatDetectionCustomModuleRequest, Empty>
      deleteEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<GetEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      getEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesPagedResponse>
      listDescendantEventThreatDetectionCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDescendantEventThreatDetectionCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListDescendantEventThreatDetectionCustomModulesRequest,
          ListDescendantEventThreatDetectionCustomModulesResponse>
      listDescendantEventThreatDetectionCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listDescendantEventThreatDetectionCustomModulesCallable()");
  }

  public UnaryCallable<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesPagedResponse>
      listEventThreatDetectionCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEventThreatDetectionCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListEventThreatDetectionCustomModulesRequest,
          ListEventThreatDetectionCustomModulesResponse>
      listEventThreatDetectionCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEventThreatDetectionCustomModulesCallable()");
  }

  public UnaryCallable<
          UpdateEventThreatDetectionCustomModuleRequest, EventThreatDetectionCustomModule>
      updateEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<
          ValidateEventThreatDetectionCustomModuleRequest,
          ValidateEventThreatDetectionCustomModuleResponse>
      validateEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: validateEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<
          GetEffectiveEventThreatDetectionCustomModuleRequest,
          EffectiveEventThreatDetectionCustomModule>
      getEffectiveEventThreatDetectionCustomModuleCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: getEffectiveEventThreatDetectionCustomModuleCallable()");
  }

  public UnaryCallable<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesPagedResponse>
      listEffectiveEventThreatDetectionCustomModulesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEffectiveEventThreatDetectionCustomModulesPagedCallable()");
  }

  public UnaryCallable<
          ListEffectiveEventThreatDetectionCustomModulesRequest,
          ListEffectiveEventThreatDetectionCustomModulesResponse>
      listEffectiveEventThreatDetectionCustomModulesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listEffectiveEventThreatDetectionCustomModulesCallable()");
  }

  public UnaryCallable<
          BatchCreateResourceValueConfigsRequest, BatchCreateResourceValueConfigsResponse>
      batchCreateResourceValueConfigsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchCreateResourceValueConfigsCallable()");
  }

  public UnaryCallable<DeleteResourceValueConfigRequest, Empty>
      deleteResourceValueConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteResourceValueConfigCallable()");
  }

  public UnaryCallable<GetResourceValueConfigRequest, ResourceValueConfig>
      getResourceValueConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: getResourceValueConfigCallable()");
  }

  public UnaryCallable<ListResourceValueConfigsRequest, ListResourceValueConfigsPagedResponse>
      listResourceValueConfigsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listResourceValueConfigsPagedCallable()");
  }

  public UnaryCallable<ListResourceValueConfigsRequest, ListResourceValueConfigsResponse>
      listResourceValueConfigsCallable() {
    throw new UnsupportedOperationException("Not implemented: listResourceValueConfigsCallable()");
  }

  public UnaryCallable<UpdateResourceValueConfigRequest, ResourceValueConfig>
      updateResourceValueConfigCallable() {
    throw new UnsupportedOperationException("Not implemented: updateResourceValueConfigCallable()");
  }

  public UnaryCallable<ListValuedResourcesRequest, ListValuedResourcesPagedResponse>
      listValuedResourcesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listValuedResourcesPagedCallable()");
  }

  public UnaryCallable<ListValuedResourcesRequest, ListValuedResourcesResponse>
      listValuedResourcesCallable() {
    throw new UnsupportedOperationException("Not implemented: listValuedResourcesCallable()");
  }

  public UnaryCallable<ListAttackPathsRequest, ListAttackPathsPagedResponse>
      listAttackPathsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttackPathsPagedCallable()");
  }

  public UnaryCallable<ListAttackPathsRequest, ListAttackPathsResponse> listAttackPathsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAttackPathsCallable()");
  }

  @Override
  public abstract void close();
}
