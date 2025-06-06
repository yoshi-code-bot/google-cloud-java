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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

public interface DeployPolicyResourceSelectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeployPolicyResourceSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a delivery pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipelineAttribute delivery_pipeline = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the deliveryPipeline field is set.
   */
  boolean hasDeliveryPipeline();

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a delivery pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipelineAttribute delivery_pipeline = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The deliveryPipeline.
   */
  com.google.cloud.deploy.v1.DeliveryPipelineAttribute getDeliveryPipeline();

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a delivery pipeline.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.DeliveryPipelineAttribute delivery_pipeline = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.DeliveryPipelineAttributeOrBuilder getDeliveryPipelineOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetAttribute target = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the target field is set.
   */
  boolean hasTarget();

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetAttribute target = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The target.
   */
  com.google.cloud.deploy.v1.TargetAttribute getTarget();

  /**
   *
   *
   * <pre>
   * Optional. Contains attributes about a target.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetAttribute target = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetAttributeOrBuilder getTargetOrBuilder();
}
