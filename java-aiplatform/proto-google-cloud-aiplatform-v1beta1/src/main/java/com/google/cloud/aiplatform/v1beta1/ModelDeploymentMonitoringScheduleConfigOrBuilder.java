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
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ModelDeploymentMonitoringScheduleConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The model monitoring job scheduling interval. It will be rounded
   * up to next full hour. This defines how often the monitoring jobs are
   * triggered.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the monitorInterval field is set.
   */
  boolean hasMonitorInterval();

  /**
   *
   *
   * <pre>
   * Required. The model monitoring job scheduling interval. It will be rounded
   * up to next full hour. This defines how often the monitoring jobs are
   * triggered.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The monitorInterval.
   */
  com.google.protobuf.Duration getMonitorInterval();

  /**
   *
   *
   * <pre>
   * Required. The model monitoring job scheduling interval. It will be rounded
   * up to next full hour. This defines how often the monitoring jobs are
   * triggered.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_interval = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getMonitorIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The time window of the prediction data being included in each prediction
   * dataset. This window specifies how long the data should be collected from
   * historical model results for each run. If not set,
   * [ModelDeploymentMonitoringScheduleConfig.monitor_interval][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig.monitor_interval]
   * will be used. e.g. If currently the cutoff time is 2022-01-08 14:30:00 and
   * the monitor_window is set to be 3600, then data from 2022-01-08 13:30:00 to
   * 2022-01-08 14:30:00 will be retrieved and aggregated to calculate the
   * monitoring statistics.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_window = 2;</code>
   *
   * @return Whether the monitorWindow field is set.
   */
  boolean hasMonitorWindow();

  /**
   *
   *
   * <pre>
   * The time window of the prediction data being included in each prediction
   * dataset. This window specifies how long the data should be collected from
   * historical model results for each run. If not set,
   * [ModelDeploymentMonitoringScheduleConfig.monitor_interval][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig.monitor_interval]
   * will be used. e.g. If currently the cutoff time is 2022-01-08 14:30:00 and
   * the monitor_window is set to be 3600, then data from 2022-01-08 13:30:00 to
   * 2022-01-08 14:30:00 will be retrieved and aggregated to calculate the
   * monitoring statistics.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_window = 2;</code>
   *
   * @return The monitorWindow.
   */
  com.google.protobuf.Duration getMonitorWindow();

  /**
   *
   *
   * <pre>
   * The time window of the prediction data being included in each prediction
   * dataset. This window specifies how long the data should be collected from
   * historical model results for each run. If not set,
   * [ModelDeploymentMonitoringScheduleConfig.monitor_interval][google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringScheduleConfig.monitor_interval]
   * will be used. e.g. If currently the cutoff time is 2022-01-08 14:30:00 and
   * the monitor_window is set to be 3600, then data from 2022-01-08 13:30:00 to
   * 2022-01-08 14:30:00 will be retrieved and aggregated to calculate the
   * monitoring statistics.
   * </pre>
   *
   * <code>.google.protobuf.Duration monitor_window = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getMonitorWindowOrBuilder();
}
