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
// source: google/cloud/cloudcontrolspartner/v1/violations.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.cloudcontrolspartner.v1;

public interface ViolationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1.Violation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * `organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/violations/{violation}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * `organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}/violations/{violation}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Description for the Violation.
   * e.g. OrgPolicy gcp.resourceLocations has non compliant value.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Output only. Description for the Violation.
   * e.g. OrgPolicy gcp.resourceLocations has non compliant value.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which triggered the Violation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the beginTime field is set.
   */
  boolean hasBeginTime();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which triggered the Violation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The beginTime.
   */
  com.google.protobuf.Timestamp getBeginTime();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which triggered the Violation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp begin_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getBeginTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last time when the Violation record was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last time when the Violation record was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last time when the Violation record was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which fixed the Violation.
   * If the violation is ACTIVE this will be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the resolveTime field is set.
   */
  boolean hasResolveTime();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which fixed the Violation.
   * If the violation is ACTIVE this will be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The resolveTime.
   */
  com.google.protobuf.Timestamp getResolveTime();

  /**
   *
   *
   * <pre>
   * Output only. Time of the event which fixed the Violation.
   * If the violation is ACTIVE this will be empty.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp resolve_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getResolveTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Category under which this violation is mapped.
   * e.g. Location, Service Usage, Access, Encryption, etc.
   * </pre>
   *
   * <code>string category = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The category.
   */
  java.lang.String getCategory();

  /**
   *
   *
   * <pre>
   * Output only. Category under which this violation is mapped.
   * e.g. Location, Service Usage, Access, Encryption, etc.
   * </pre>
   *
   * <code>string category = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString getCategoryBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the violation
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1.Violation.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the violation
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1.Violation.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.cloudcontrolspartner.v1.Violation.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. Name of the OrgPolicy which was modified with
   * non-compliant change and resulted this violation. Format:
   *  `projects/{project_number}/policies/{constraint_name}`
   *  `folders/{folder_id}/policies/{constraint_name}`
   *  `organizations/{organization_id}/policies/{constraint_name}`
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The nonCompliantOrgPolicy.
   */
  java.lang.String getNonCompliantOrgPolicy();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. Name of the OrgPolicy which was modified with
   * non-compliant change and resulted this violation. Format:
   *  `projects/{project_number}/policies/{constraint_name}`
   *  `folders/{folder_id}/policies/{constraint_name}`
   *  `organizations/{organization_id}/policies/{constraint_name}`
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 8 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for nonCompliantOrgPolicy.
   */
  com.google.protobuf.ByteString getNonCompliantOrgPolicyBytes();

  /**
   *
   *
   * <pre>
   * The folder_id of the violation
   * </pre>
   *
   * <code>int64 folder_id = 9;</code>
   *
   * @return The folderId.
   */
  long getFolderId();

  /**
   *
   *
   * <pre>
   * Output only. Compliance violation remediation
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1.Violation.Remediation remediation = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the remediation field is set.
   */
  boolean hasRemediation();

  /**
   *
   *
   * <pre>
   * Output only. Compliance violation remediation
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1.Violation.Remediation remediation = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The remediation.
   */
  com.google.cloud.cloudcontrolspartner.v1.Violation.Remediation getRemediation();

  /**
   *
   *
   * <pre>
   * Output only. Compliance violation remediation
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1.Violation.Remediation remediation = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.cloudcontrolspartner.v1.Violation.RemediationOrBuilder getRemediationOrBuilder();
}
