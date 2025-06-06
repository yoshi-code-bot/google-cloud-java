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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface JobTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.JobTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique resource name for the triggeredJob, assigned by the service when the
   * triggeredJob is created, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
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
   * Unique resource name for the triggeredJob, assigned by the service when the
   * triggeredJob is created, for example
   * `projects/dlp-test-project/jobTriggers/53234423`.
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
   * Display name (max 100 chars)
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Display name (max 100 chars)
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * User provided description (max 256 chars)
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * User provided description (max 256 chars)
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * For inspect jobs, a snapshot of the configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 4;</code>
   *
   * @return Whether the inspectJob field is set.
   */
  boolean hasInspectJob();

  /**
   *
   *
   * <pre>
   * For inspect jobs, a snapshot of the configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 4;</code>
   *
   * @return The inspectJob.
   */
  com.google.privacy.dlp.v2.InspectJobConfig getInspectJob();

  /**
   *
   *
   * <pre>
   * For inspect jobs, a snapshot of the configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectJobConfig inspect_job = 4;</code>
   */
  com.google.privacy.dlp.v2.InspectJobConfigOrBuilder getInspectJobOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of triggers which will be OR'ed together. Only one in the list
   * needs to trigger for a job to be started. The list may contain only
   * a single Schedule trigger and must have at least one object.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger.Trigger triggers = 5;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.JobTrigger.Trigger> getTriggersList();

  /**
   *
   *
   * <pre>
   * A list of triggers which will be OR'ed together. Only one in the list
   * needs to trigger for a job to be started. The list may contain only
   * a single Schedule trigger and must have at least one object.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger.Trigger triggers = 5;</code>
   */
  com.google.privacy.dlp.v2.JobTrigger.Trigger getTriggers(int index);

  /**
   *
   *
   * <pre>
   * A list of triggers which will be OR'ed together. Only one in the list
   * needs to trigger for a job to be started. The list may contain only
   * a single Schedule trigger and must have at least one object.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger.Trigger triggers = 5;</code>
   */
  int getTriggersCount();

  /**
   *
   *
   * <pre>
   * A list of triggers which will be OR'ed together. Only one in the list
   * needs to trigger for a job to be started. The list may contain only
   * a single Schedule trigger and must have at least one object.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger.Trigger triggers = 5;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.JobTrigger.TriggerOrBuilder>
      getTriggersOrBuilderList();

  /**
   *
   *
   * <pre>
   * A list of triggers which will be OR'ed together. Only one in the list
   * needs to trigger for a job to be started. The list may contain only
   * a single Schedule trigger and must have at least one object.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger.Trigger triggers = 5;</code>
   */
  com.google.privacy.dlp.v2.JobTrigger.TriggerOrBuilder getTriggersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the trigger was activated.
   * Repeated errors may result in the JobTrigger automatically being paused.
   * Will return the last 100 errors. Whenever the JobTrigger is modified
   * this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.Error> getErrorsList();

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the trigger was activated.
   * Repeated errors may result in the JobTrigger automatically being paused.
   * Will return the last 100 errors. Whenever the JobTrigger is modified
   * this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.Error getErrors(int index);

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the trigger was activated.
   * Repeated errors may result in the JobTrigger automatically being paused.
   * Will return the last 100 errors. Whenever the JobTrigger is modified
   * this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the trigger was activated.
   * Repeated errors may result in the JobTrigger automatically being paused.
   * Will return the last 100 errors. Whenever the JobTrigger is modified
   * this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ErrorOrBuilder> getErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the trigger was activated.
   * Repeated errors may result in the JobTrigger automatically being paused.
   * Will return the last 100 errors. Whenever the JobTrigger is modified
   * this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.ErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a triggeredJob.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this trigger executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastRunTime field is set.
   */
  boolean hasLastRunTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this trigger executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastRunTime.
   */
  com.google.protobuf.Timestamp getLastRunTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this trigger executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A status for this trigger.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.JobTrigger.Status status = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();

  /**
   *
   *
   * <pre>
   * Required. A status for this trigger.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.JobTrigger.Status status = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The status.
   */
  com.google.privacy.dlp.v2.JobTrigger.Status getStatus();

  com.google.privacy.dlp.v2.JobTrigger.JobCase getJobCase();
}
