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
// source: google/cloud/backupdr/v1/backupplanassociation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface RuleConfigInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.RuleConfigInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Backup Rule id fetched from backup plan.
   * </pre>
   *
   * <code>string rule_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The ruleId.
   */
  java.lang.String getRuleId();

  /**
   *
   *
   * <pre>
   * Output only. Backup Rule id fetched from backup plan.
   * </pre>
   *
   * <code>string rule_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString getRuleIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The last backup state for rule.
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.RuleConfigInfo.LastBackupState last_backup_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for lastBackupState.
   */
  int getLastBackupStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The last backup state for rule.
   * </pre>
   *
   * <code>
   * .google.cloud.backupdr.v1.RuleConfigInfo.LastBackupState last_backup_state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastBackupState.
   */
  com.google.cloud.backupdr.v1.RuleConfigInfo.LastBackupState getLastBackupState();

  /**
   *
   *
   * <pre>
   * Output only. google.rpc.Status object to store the last backup error.
   * </pre>
   *
   * <code>.google.rpc.Status last_backup_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastBackupError field is set.
   */
  boolean hasLastBackupError();

  /**
   *
   *
   * <pre>
   * Output only. google.rpc.Status object to store the last backup error.
   * </pre>
   *
   * <code>.google.rpc.Status last_backup_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastBackupError.
   */
  com.google.rpc.Status getLastBackupError();

  /**
   *
   *
   * <pre>
   * Output only. google.rpc.Status object to store the last backup error.
   * </pre>
   *
   * <code>.google.rpc.Status last_backup_error = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getLastBackupErrorOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The point in time when the last successful backup was captured
   * from the source.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastSuccessfulBackupConsistencyTime field is set.
   */
  boolean hasLastSuccessfulBackupConsistencyTime();

  /**
   *
   *
   * <pre>
   * Output only. The point in time when the last successful backup was captured
   * from the source.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastSuccessfulBackupConsistencyTime.
   */
  com.google.protobuf.Timestamp getLastSuccessfulBackupConsistencyTime();

  /**
   *
   *
   * <pre>
   * Output only. The point in time when the last successful backup was captured
   * from the source.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_successful_backup_consistency_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastSuccessfulBackupConsistencyTimeOrBuilder();
}
