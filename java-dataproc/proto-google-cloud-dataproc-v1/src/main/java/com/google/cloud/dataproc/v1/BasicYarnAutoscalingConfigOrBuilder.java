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
// source: google/cloud/dataproc/v1/autoscaling_policies.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface BasicYarnAutoscalingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.BasicYarnAutoscalingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Timeout for YARN graceful decommissioning of Node Managers.
   * Specifies the duration to wait for jobs to complete before forcefully
   * removing workers (and potentially interrupting jobs). Only applicable to
   * downscaling operations.
   *
   * Bounds: [0s, 1d].
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gracefulDecommissionTimeout field is set.
   */
  boolean hasGracefulDecommissionTimeout();

  /**
   *
   *
   * <pre>
   * Required. Timeout for YARN graceful decommissioning of Node Managers.
   * Specifies the duration to wait for jobs to complete before forcefully
   * removing workers (and potentially interrupting jobs). Only applicable to
   * downscaling operations.
   *
   * Bounds: [0s, 1d].
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gracefulDecommissionTimeout.
   */
  com.google.protobuf.Duration getGracefulDecommissionTimeout();

  /**
   *
   *
   * <pre>
   * Required. Timeout for YARN graceful decommissioning of Node Managers.
   * Specifies the duration to wait for jobs to complete before forcefully
   * removing workers (and potentially interrupting jobs). Only applicable to
   * downscaling operations.
   *
   * Bounds: [0s, 1d].
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration graceful_decommission_timeout = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getGracefulDecommissionTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Fraction of average YARN pending memory in the last cooldown
   * period for which to add workers. A scale-up factor of 1.0 will result in
   * scaling up so that there is no pending memory remaining after the update
   * (more aggressive scaling). A scale-up factor closer to 0 will result in a
   * smaller magnitude of scaling up (less aggressive scaling). See [How
   * autoscaling
   * works](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/autoscaling#how_autoscaling_works)
   * for more information.
   *
   * Bounds: [0.0, 1.0].
   * </pre>
   *
   * <code>double scale_up_factor = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scaleUpFactor.
   */
  double getScaleUpFactor();

  /**
   *
   *
   * <pre>
   * Required. Fraction of average YARN pending memory in the last cooldown
   * period for which to remove workers. A scale-down factor of 1 will result in
   * scaling down so that there is no available memory remaining after the
   * update (more aggressive scaling). A scale-down factor of 0 disables
   * removing workers, which can be beneficial for autoscaling a single job.
   * See [How autoscaling
   * works](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/autoscaling#how_autoscaling_works)
   * for more information.
   *
   * Bounds: [0.0, 1.0].
   * </pre>
   *
   * <code>double scale_down_factor = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The scaleDownFactor.
   */
  double getScaleDownFactor();

  /**
   *
   *
   * <pre>
   * Optional. Minimum scale-up threshold as a fraction of total cluster size
   * before scaling occurs. For example, in a 20-worker cluster, a threshold of
   * 0.1 means the autoscaler must recommend at least a 2-worker scale-up for
   * the cluster to scale. A threshold of 0 means the autoscaler will scale up
   * on any recommended change.
   *
   * Bounds: [0.0, 1.0]. Default: 0.0.
   * </pre>
   *
   * <code>double scale_up_min_worker_fraction = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The scaleUpMinWorkerFraction.
   */
  double getScaleUpMinWorkerFraction();

  /**
   *
   *
   * <pre>
   * Optional. Minimum scale-down threshold as a fraction of total cluster size
   * before scaling occurs. For example, in a 20-worker cluster, a threshold of
   * 0.1 means the autoscaler must recommend at least a 2 worker scale-down for
   * the cluster to scale. A threshold of 0 means the autoscaler will scale down
   * on any recommended change.
   *
   * Bounds: [0.0, 1.0]. Default: 0.0.
   * </pre>
   *
   * <code>double scale_down_min_worker_fraction = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The scaleDownMinWorkerFraction.
   */
  double getScaleDownMinWorkerFraction();
}
