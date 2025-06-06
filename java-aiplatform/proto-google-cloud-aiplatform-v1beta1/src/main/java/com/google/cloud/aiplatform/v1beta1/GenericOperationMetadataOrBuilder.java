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
// source: google/cloud/aiplatform/v1beta1/operation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface GenericOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GenericOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard Google Cloud error details.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status partial_failures = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.rpc.Status> getPartialFailuresList();

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard Google Cloud error details.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status partial_failures = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.Status getPartialFailures(int index);

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard Google Cloud error details.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status partial_failures = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPartialFailuresCount();

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard Google Cloud error details.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status partial_failures = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialFailuresOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * This field should never exceed 20 entries.
   * Status details field will contain standard Google Cloud error details.
   * </pre>
   *
   * <code>
   * repeated .google.rpc.Status partial_failures = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * If the operation has finished (successfully or not), this is the finish
   * time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * If the operation has finished (successfully or not), this is the finish
   * time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was updated for the last time.
   * If the operation has finished (successfully or not), this is the finish
   * time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
