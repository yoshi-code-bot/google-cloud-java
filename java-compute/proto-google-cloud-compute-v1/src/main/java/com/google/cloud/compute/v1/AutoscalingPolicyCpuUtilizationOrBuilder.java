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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface AutoscalingPolicyCpuUtilizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AutoscalingPolicyCpuUtilization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return Whether the predictiveMethod field is set.
   */
  boolean hasPredictiveMethod();

  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return The predictiveMethod.
   */
  java.lang.String getPredictiveMethod();

  /**
   *
   *
   * <pre>
   * Indicates whether predictive autoscaling based on CPU metric is enabled. Valid values are: * NONE (default). No predictive method is used. The autoscaler scales the group to meet current demand based on real-time metrics. * OPTIMIZE_AVAILABILITY. Predictive autoscaling improves availability by monitoring daily and weekly load patterns and scaling out ahead of anticipated demand.
   * Check the PredictiveMethod enum for the list of possible values.
   * </pre>
   *
   * <code>optional string predictive_method = 390220737;</code>
   *
   * @return The bytes for predictiveMethod.
   */
  com.google.protobuf.ByteString getPredictiveMethodBytes();

  /**
   *
   *
   * <pre>
   * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return Whether the utilizationTarget field is set.
   */
  boolean hasUtilizationTarget();

  /**
   *
   *
   * <pre>
   * The target CPU utilization that the autoscaler maintains. Must be a float value in the range (0, 1]. If not specified, the default is 0.6. If the CPU level is below the target utilization, the autoscaler scales in the number of instances until it reaches the minimum number of instances you specified or until the average CPU of your instances reaches the target utilization. If the average CPU is above the target utilization, the autoscaler scales out until it reaches the maximum number of instances you specified or until the average utilization reaches the target utilization.
   * </pre>
   *
   * <code>optional double utilization_target = 215905870;</code>
   *
   * @return The utilizationTarget.
   */
  double getUtilizationTarget();
}
