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
// source: google/cloud/securitycenter/v2/external_system.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public interface ExternalSystemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.ExternalSystem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full resource name of the external system. The following list
   * shows some examples:
   *
   * + `organizations/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `organizations/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * + `folders/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `folders/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * + `projects/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `projects/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
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
   * Full resource name of the external system. The following list
   * shows some examples:
   *
   * + `organizations/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `organizations/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * + `folders/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `folders/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
   * + `projects/1234/sources/5678/findings/123456/externalSystems/jira`
   * +
   * `projects/1234/sources/5678/locations/us/findings/123456/externalSystems/jira`
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
   * References primary/secondary etc assignees in the external system.
   * </pre>
   *
   * <code>repeated string assignees = 2;</code>
   *
   * @return A list containing the assignees.
   */
  java.util.List<java.lang.String> getAssigneesList();

  /**
   *
   *
   * <pre>
   * References primary/secondary etc assignees in the external system.
   * </pre>
   *
   * <code>repeated string assignees = 2;</code>
   *
   * @return The count of assignees.
   */
  int getAssigneesCount();

  /**
   *
   *
   * <pre>
   * References primary/secondary etc assignees in the external system.
   * </pre>
   *
   * <code>repeated string assignees = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The assignees at the given index.
   */
  java.lang.String getAssignees(int index);

  /**
   *
   *
   * <pre>
   * References primary/secondary etc assignees in the external system.
   * </pre>
   *
   * <code>repeated string assignees = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assignees at the given index.
   */
  com.google.protobuf.ByteString getAssigneesBytes(int index);

  /**
   *
   *
   * <pre>
   * The identifier that's used to track the finding's corresponding case in the
   * external system.
   * </pre>
   *
   * <code>string external_uid = 3;</code>
   *
   * @return The externalUid.
   */
  java.lang.String getExternalUid();

  /**
   *
   *
   * <pre>
   * The identifier that's used to track the finding's corresponding case in the
   * external system.
   * </pre>
   *
   * <code>string external_uid = 3;</code>
   *
   * @return The bytes for externalUid.
   */
  com.google.protobuf.ByteString getExternalUidBytes();

  /**
   *
   *
   * <pre>
   * The most recent status of the finding's corresponding case, as reported by
   * the external system.
   * </pre>
   *
   * <code>string status = 4;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();

  /**
   *
   *
   * <pre>
   * The most recent status of the finding's corresponding case, as reported by
   * the external system.
   * </pre>
   *
   * <code>string status = 4;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();

  /**
   *
   *
   * <pre>
   * The time when the case was last updated, as reported by the external
   * system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp external_system_update_time = 5;</code>
   *
   * @return Whether the externalSystemUpdateTime field is set.
   */
  boolean hasExternalSystemUpdateTime();

  /**
   *
   *
   * <pre>
   * The time when the case was last updated, as reported by the external
   * system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp external_system_update_time = 5;</code>
   *
   * @return The externalSystemUpdateTime.
   */
  com.google.protobuf.Timestamp getExternalSystemUpdateTime();

  /**
   *
   *
   * <pre>
   * The time when the case was last updated, as reported by the external
   * system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp external_system_update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExternalSystemUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The link to the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>string case_uri = 6;</code>
   *
   * @return The caseUri.
   */
  java.lang.String getCaseUri();

  /**
   *
   *
   * <pre>
   * The link to the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>string case_uri = 6;</code>
   *
   * @return The bytes for caseUri.
   */
  com.google.protobuf.ByteString getCaseUriBytes();

  /**
   *
   *
   * <pre>
   * The priority of the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>string case_priority = 7;</code>
   *
   * @return The casePriority.
   */
  java.lang.String getCasePriority();

  /**
   *
   *
   * <pre>
   * The priority of the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>string case_priority = 7;</code>
   *
   * @return The bytes for casePriority.
   */
  com.google.protobuf.ByteString getCasePriorityBytes();

  /**
   *
   *
   * <pre>
   * The SLA of the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_sla = 9;</code>
   *
   * @return Whether the caseSla field is set.
   */
  boolean hasCaseSla();

  /**
   *
   *
   * <pre>
   * The SLA of the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_sla = 9;</code>
   *
   * @return The caseSla.
   */
  com.google.protobuf.Timestamp getCaseSla();

  /**
   *
   *
   * <pre>
   * The SLA of the finding's corresponding case in the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_sla = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCaseSlaOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the case was created, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_create_time = 10;</code>
   *
   * @return Whether the caseCreateTime field is set.
   */
  boolean hasCaseCreateTime();

  /**
   *
   *
   * <pre>
   * The time when the case was created, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_create_time = 10;</code>
   *
   * @return The caseCreateTime.
   */
  com.google.protobuf.Timestamp getCaseCreateTime();

  /**
   *
   *
   * <pre>
   * The time when the case was created, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_create_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCaseCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the case was closed, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_close_time = 11;</code>
   *
   * @return Whether the caseCloseTime field is set.
   */
  boolean hasCaseCloseTime();

  /**
   *
   *
   * <pre>
   * The time when the case was closed, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_close_time = 11;</code>
   *
   * @return The caseCloseTime.
   */
  com.google.protobuf.Timestamp getCaseCloseTime();

  /**
   *
   *
   * <pre>
   * The time when the case was closed, as reported by the external system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp case_close_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCaseCloseTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the ticket, if any, that is being used to track the
   * resolution of the issue that is identified by this finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.ExternalSystem.TicketInfo ticket_info = 8;</code>
   *
   * @return Whether the ticketInfo field is set.
   */
  boolean hasTicketInfo();

  /**
   *
   *
   * <pre>
   * Information about the ticket, if any, that is being used to track the
   * resolution of the issue that is identified by this finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.ExternalSystem.TicketInfo ticket_info = 8;</code>
   *
   * @return The ticketInfo.
   */
  com.google.cloud.securitycenter.v2.ExternalSystem.TicketInfo getTicketInfo();

  /**
   *
   *
   * <pre>
   * Information about the ticket, if any, that is being used to track the
   * resolution of the issue that is identified by this finding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.ExternalSystem.TicketInfo ticket_info = 8;</code>
   */
  com.google.cloud.securitycenter.v2.ExternalSystem.TicketInfoOrBuilder getTicketInfoOrBuilder();
}
