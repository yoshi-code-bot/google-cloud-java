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
// source: google/dataflow/v1beta3/metrics.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface WorkItemDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.WorkItemDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of this work item.
   * </pre>
   *
   * <code>string task_id = 1;</code>
   *
   * @return The taskId.
   */
  java.lang.String getTaskId();

  /**
   *
   *
   * <pre>
   * Name of this work item.
   * </pre>
   *
   * <code>string task_id = 1;</code>
   *
   * @return The bytes for taskId.
   */
  com.google.protobuf.ByteString getTaskIdBytes();

  /**
   *
   *
   * <pre>
   * Attempt ID of this work item
   * </pre>
   *
   * <code>string attempt_id = 2;</code>
   *
   * @return The attemptId.
   */
  java.lang.String getAttemptId();

  /**
   *
   *
   * <pre>
   * Attempt ID of this work item
   * </pre>
   *
   * <code>string attempt_id = 2;</code>
   *
   * @return The bytes for attemptId.
   */
  com.google.protobuf.ByteString getAttemptIdBytes();

  /**
   *
   *
   * <pre>
   * Start time of this work item attempt.
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
   * Start time of this work item attempt.
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
   * Start time of this work item attempt.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End time of this work item attempt.
   *
   * If the work item is completed, this is the actual end time of the work
   * item.  Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * End time of this work item attempt.
   *
   * If the work item is completed, this is the actual end time of the work
   * item.  Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * End time of this work item attempt.
   *
   * If the work item is completed, this is the actual end time of the work
   * item.  Otherwise, it is the predicted end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * State of this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ExecutionState state = 5;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * State of this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ExecutionState state = 5;</code>
   *
   * @return The state.
   */
  com.google.dataflow.v1beta3.ExecutionState getState();

  /**
   *
   *
   * <pre>
   * Progress of this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 6;</code>
   *
   * @return Whether the progress field is set.
   */
  boolean hasProgress();

  /**
   *
   *
   * <pre>
   * Progress of this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 6;</code>
   *
   * @return The progress.
   */
  com.google.dataflow.v1beta3.ProgressTimeseries getProgress();

  /**
   *
   *
   * <pre>
   * Progress of this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ProgressTimeseries progress = 6;</code>
   */
  com.google.dataflow.v1beta3.ProgressTimeseriesOrBuilder getProgressOrBuilder();

  /**
   *
   *
   * <pre>
   * Metrics for this work item.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 7;</code>
   */
  java.util.List<com.google.dataflow.v1beta3.MetricUpdate> getMetricsList();

  /**
   *
   *
   * <pre>
   * Metrics for this work item.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 7;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdate getMetrics(int index);

  /**
   *
   *
   * <pre>
   * Metrics for this work item.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 7;</code>
   */
  int getMetricsCount();

  /**
   *
   *
   * <pre>
   * Metrics for this work item.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 7;</code>
   */
  java.util.List<? extends com.google.dataflow.v1beta3.MetricUpdateOrBuilder>
      getMetricsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Metrics for this work item.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.MetricUpdate metrics = 7;</code>
   */
  com.google.dataflow.v1beta3.MetricUpdateOrBuilder getMetricsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Information about straggler detections for this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.StragglerInfo straggler_info = 8;</code>
   *
   * @return Whether the stragglerInfo field is set.
   */
  boolean hasStragglerInfo();

  /**
   *
   *
   * <pre>
   * Information about straggler detections for this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.StragglerInfo straggler_info = 8;</code>
   *
   * @return The stragglerInfo.
   */
  com.google.dataflow.v1beta3.StragglerInfo getStragglerInfo();

  /**
   *
   *
   * <pre>
   * Information about straggler detections for this work item.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.StragglerInfo straggler_info = 8;</code>
   */
  com.google.dataflow.v1beta3.StragglerInfoOrBuilder getStragglerInfoOrBuilder();
}
