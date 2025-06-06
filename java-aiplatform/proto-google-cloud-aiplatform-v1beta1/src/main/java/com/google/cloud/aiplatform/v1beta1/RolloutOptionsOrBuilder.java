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
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface RolloutOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RolloutOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Absolute count of replicas allowed to be unavailable.
   * </pre>
   *
   * <code>int32 max_unavailable_replicas = 3;</code>
   *
   * @return Whether the maxUnavailableReplicas field is set.
   */
  boolean hasMaxUnavailableReplicas();

  /**
   *
   *
   * <pre>
   * Absolute count of replicas allowed to be unavailable.
   * </pre>
   *
   * <code>int32 max_unavailable_replicas = 3;</code>
   *
   * @return The maxUnavailableReplicas.
   */
  int getMaxUnavailableReplicas();

  /**
   *
   *
   * <pre>
   * Percentage of replicas allowed to be unavailable.
   * For autoscaling deployments, this refers to the target replica count.
   * </pre>
   *
   * <code>int32 max_unavailable_percentage = 4;</code>
   *
   * @return Whether the maxUnavailablePercentage field is set.
   */
  boolean hasMaxUnavailablePercentage();

  /**
   *
   *
   * <pre>
   * Percentage of replicas allowed to be unavailable.
   * For autoscaling deployments, this refers to the target replica count.
   * </pre>
   *
   * <code>int32 max_unavailable_percentage = 4;</code>
   *
   * @return The maxUnavailablePercentage.
   */
  int getMaxUnavailablePercentage();

  /**
   *
   *
   * <pre>
   * Absolute count of allowed additional replicas.
   * </pre>
   *
   * <code>int32 max_surge_replicas = 5;</code>
   *
   * @return Whether the maxSurgeReplicas field is set.
   */
  boolean hasMaxSurgeReplicas();

  /**
   *
   *
   * <pre>
   * Absolute count of allowed additional replicas.
   * </pre>
   *
   * <code>int32 max_surge_replicas = 5;</code>
   *
   * @return The maxSurgeReplicas.
   */
  int getMaxSurgeReplicas();

  /**
   *
   *
   * <pre>
   * Percentage of allowed additional replicas.
   * For autoscaling deployments, this refers to the target replica count.
   * </pre>
   *
   * <code>int32 max_surge_percentage = 6;</code>
   *
   * @return Whether the maxSurgePercentage field is set.
   */
  boolean hasMaxSurgePercentage();

  /**
   *
   *
   * <pre>
   * Percentage of allowed additional replicas.
   * For autoscaling deployments, this refers to the target replica count.
   * </pre>
   *
   * <code>int32 max_surge_percentage = 6;</code>
   *
   * @return The maxSurgePercentage.
   */
  int getMaxSurgePercentage();

  /**
   *
   *
   * <pre>
   * ID of the DeployedModel that this deployment should replace.
   * </pre>
   *
   * <code>string previous_deployed_model = 1;</code>
   *
   * @return The previousDeployedModel.
   */
  java.lang.String getPreviousDeployedModel();

  /**
   *
   *
   * <pre>
   * ID of the DeployedModel that this deployment should replace.
   * </pre>
   *
   * <code>string previous_deployed_model = 1;</code>
   *
   * @return The bytes for previousDeployedModel.
   */
  com.google.protobuf.ByteString getPreviousDeployedModelBytes();

  /**
   *
   *
   * <pre>
   * Output only. Read-only. Revision number determines the relative priority of
   * DeployedModels in the same rollout. The DeployedModel with the largest
   * revision number specifies the intended state of the deployment.
   * </pre>
   *
   * <code>int32 revision_number = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The revisionNumber.
   */
  int getRevisionNumber();

  com.google.cloud.aiplatform.v1beta1.RolloutOptions.MaxUnavailableCase getMaxUnavailableCase();

  com.google.cloud.aiplatform.v1beta1.RolloutOptions.MaxSurgeCase getMaxSurgeCase();
}
