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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

public interface BackgroundJobLogEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.BackgroundJobLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The background job log entry ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * The background job log entry ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The type of job that was executed.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.BackgroundJobType job_type = 2;</code>
   *
   * @return The enum numeric value on the wire for jobType.
   */
  int getJobTypeValue();

  /**
   *
   *
   * <pre>
   * The type of job that was executed.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.BackgroundJobType job_type = 2;</code>
   *
   * @return The jobType.
   */
  com.google.cloud.clouddms.v1.BackgroundJobType getJobType();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 4;</code>
   *
   * @return Whether the finishTime field is set.
   */
  boolean hasFinishTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 4;</code>
   *
   * @return The finishTime.
   */
  com.google.protobuf.Timestamp getFinishTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the background job was finished.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp finish_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getFinishTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Job completion state, i.e. the final state after the job
   * completed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.JobCompletionState completion_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for completionState.
   */
  int getCompletionStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Job completion state, i.e. the final state after the job
   * completed.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.JobCompletionState completion_state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completionState.
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.JobCompletionState getCompletionState();

  /**
   *
   *
   * <pre>
   * Output only. Job completion comment, such as how many entities were seeded,
   * how many warnings were found during conversion, and similar information.
   * </pre>
   *
   * <code>string completion_comment = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The completionComment.
   */
  java.lang.String getCompletionComment();

  /**
   *
   *
   * <pre>
   * Output only. Job completion comment, such as how many entities were seeded,
   * how many warnings were found during conversion, and similar information.
   * </pre>
   *
   * <code>string completion_comment = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for completionComment.
   */
  com.google.protobuf.ByteString getCompletionCommentBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the client requested the conversion workspace to be
   * committed after a successful completion of the job.
   * </pre>
   *
   * <code>bool request_autocommit = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requestAutocommit.
   */
  boolean getRequestAutocommit();

  /**
   *
   *
   * <pre>
   * Output only. Seed job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.SeedJobDetails seed_job_details = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the seedJobDetails field is set.
   */
  boolean hasSeedJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Seed job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.SeedJobDetails seed_job_details = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The seedJobDetails.
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.SeedJobDetails getSeedJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Seed job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.SeedJobDetails seed_job_details = 100 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.SeedJobDetailsOrBuilder
      getSeedJobDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Import rules job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ImportRulesJobDetails import_rules_job_details = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the importRulesJobDetails field is set.
   */
  boolean hasImportRulesJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Import rules job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ImportRulesJobDetails import_rules_job_details = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The importRulesJobDetails.
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ImportRulesJobDetails
      getImportRulesJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Import rules job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ImportRulesJobDetails import_rules_job_details = 101 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ImportRulesJobDetailsOrBuilder
      getImportRulesJobDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Convert job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ConvertJobDetails convert_job_details = 102 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the convertJobDetails field is set.
   */
  boolean hasConvertJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Convert job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ConvertJobDetails convert_job_details = 102 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The convertJobDetails.
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ConvertJobDetails getConvertJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Convert job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ConvertJobDetails convert_job_details = 102 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ConvertJobDetailsOrBuilder
      getConvertJobDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Apply job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ApplyJobDetails apply_job_details = 103 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the applyJobDetails field is set.
   */
  boolean hasApplyJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Apply job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ApplyJobDetails apply_job_details = 103 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The applyJobDetails.
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ApplyJobDetails getApplyJobDetails();

  /**
   *
   *
   * <pre>
   * Output only. Apply job details.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.BackgroundJobLogEntry.ApplyJobDetails apply_job_details = 103 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.ApplyJobDetailsOrBuilder
      getApplyJobDetailsOrBuilder();

  com.google.cloud.clouddms.v1.BackgroundJobLogEntry.JobDetailsCase getJobDetailsCase();
}
