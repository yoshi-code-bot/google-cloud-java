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
// source: google/cloud/batch/v1alpha/resource_allowance.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.batch.v1alpha;

public interface UsageResourceAllowanceSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.UsageResourceAllowanceSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Spec type is unique for each usage ResourceAllowance.
   * Batch now only supports type as "cpu-core-hours" for CPU usage consumption
   * tracking.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The type.
   */
  java.lang.String getType();

  /**
   *
   *
   * <pre>
   * Required. Spec type is unique for each usage ResourceAllowance.
   * Batch now only supports type as "cpu-core-hours" for CPU usage consumption
   * tracking.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. Threshold of a UsageResourceAllowance limiting how many resources
   * can be consumed for each type.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceSpec.Limit limit = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the limit field is set.
   */
  boolean hasLimit();

  /**
   *
   *
   * <pre>
   * Required. Threshold of a UsageResourceAllowance limiting how many resources
   * can be consumed for each type.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceSpec.Limit limit = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The limit.
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceSpec.Limit getLimit();

  /**
   *
   *
   * <pre>
   * Required. Threshold of a UsageResourceAllowance limiting how many resources
   * can be consumed for each type.
   * </pre>
   *
   * <code>
   * .google.cloud.batch.v1alpha.UsageResourceAllowanceSpec.Limit limit = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.batch.v1alpha.UsageResourceAllowanceSpec.LimitOrBuilder getLimitOrBuilder();
}
