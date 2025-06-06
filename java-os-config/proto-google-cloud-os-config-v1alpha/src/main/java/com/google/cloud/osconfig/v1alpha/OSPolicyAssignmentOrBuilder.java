/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.osconfig.v1alpha;

public interface OSPolicyAssignmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.OSPolicyAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}`
   *
   * This field is ignored when you create an OS policy assignment.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id}`
   *
   * This field is ignored when you create an OS policy assignment.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * OS policy assignment description.
   * Length of the description is limited to 1024 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * OS policy assignment description.
   * Length of the description is limited to 1024 characters.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. List of OS policies to be applied to the VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicy os_policies = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.osconfig.v1alpha.OSPolicy> getOsPoliciesList();

  /**
   *
   *
   * <pre>
   * Required. List of OS policies to be applied to the VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicy os_policies = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicy getOsPolicies(int index);

  /**
   *
   *
   * <pre>
   * Required. List of OS policies to be applied to the VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicy os_policies = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getOsPoliciesCount();

  /**
   *
   *
   * <pre>
   * Required. List of OS policies to be applied to the VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicy os_policies = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1alpha.OSPolicyOrBuilder>
      getOsPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. List of OS policies to be applied to the VMs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicy os_policies = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyOrBuilder getOsPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. Filter to select VMs.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.InstanceFilter instance_filter = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the instanceFilter field is set.
   */
  boolean hasInstanceFilter();

  /**
   *
   *
   * <pre>
   * Required. Filter to select VMs.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.InstanceFilter instance_filter = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The instanceFilter.
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.InstanceFilter getInstanceFilter();

  /**
   *
   *
   * <pre>
   * Required. Filter to select VMs.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.InstanceFilter instance_filter = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.InstanceFilterOrBuilder
      getInstanceFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Rollout to deploy the OS policy assignment.
   * A rollout is triggered in the following situations:
   * 1) OSPolicyAssignment is created.
   * 2) OSPolicyAssignment is updated and the update contains changes to one of
   * the following fields:
   *    - instance_filter
   *    - os_policies
   * 3) OSPolicyAssignment is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.Rollout rollout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rollout field is set.
   */
  boolean hasRollout();

  /**
   *
   *
   * <pre>
   * Required. Rollout to deploy the OS policy assignment.
   * A rollout is triggered in the following situations:
   * 1) OSPolicyAssignment is created.
   * 2) OSPolicyAssignment is updated and the update contains changes to one of
   * the following fields:
   *    - instance_filter
   *    - os_policies
   * 3) OSPolicyAssignment is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.Rollout rollout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rollout.
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.Rollout getRollout();

  /**
   *
   *
   * <pre>
   * Required. Rollout to deploy the OS policy assignment.
   * A rollout is triggered in the following situations:
   * 1) OSPolicyAssignment is created.
   * 2) OSPolicyAssignment is updated and the update contains changes to one of
   * the following fields:
   *    - instance_filter
   *    - os_policies
   * 3) OSPolicyAssignment is deleted.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.Rollout rollout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.RolloutOrBuilder getRolloutOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The assignment revision ID
   * A new revision is committed whenever a rollout is triggered for a OS policy
   * assignment
   * </pre>
   *
   * <code>string revision_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Output only. The assignment revision ID
   * A new revision is committed whenever a rollout is triggered for a OS policy
   * assignment
   * </pre>
   *
   * <code>string revision_id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The etag for this OS policy assignment.
   * If this is provided on update, it must match the server's etag.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * The etag for this OS policy assignment.
   * If this is provided on update, it must match the server's etag.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. OS policy assignment rollout state
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.RolloutState rollout_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for rolloutState.
   */
  int getRolloutStateValue();

  /**
   *
   *
   * <pre>
   * Output only. OS policy assignment rollout state
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.OSPolicyAssignment.RolloutState rollout_state = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The rolloutState.
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment.RolloutState getRolloutState();

  /**
   *
   *
   * <pre>
   * Output only. Indicates that this revision has been successfully rolled out in this zone
   * and new VMs will be assigned OS policies from this revision.
   *
   * For a given OS policy assignment, there is only one revision with a value
   * of `true` for this field.
   * </pre>
   *
   * <code>bool baseline = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The baseline.
   */
  boolean getBaseline();

  /**
   *
   *
   * <pre>
   * Output only. Indicates that this revision deletes the OS policy assignment.
   * </pre>
   *
   * <code>bool deleted = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The deleted.
   */
  boolean getDeleted();

  /**
   *
   *
   * <pre>
   * Output only. Indicates that reconciliation is in progress for the revision.
   * This value is `true` when the `rollout_state` is one of:
   * * IN_PROGRESS
   * * CANCELLING
   * </pre>
   *
   * <code>bool reconciling = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. Server generated unique id for the OS policy assignment resource.
   * </pre>
   *
   * <code>string uid = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. Server generated unique id for the OS policy assignment resource.
   * </pre>
   *
   * <code>string uid = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();
}
