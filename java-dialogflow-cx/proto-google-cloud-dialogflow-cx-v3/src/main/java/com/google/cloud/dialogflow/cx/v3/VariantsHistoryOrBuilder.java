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
// source: google/cloud/dialogflow/cx/v3/experiment.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

public interface VariantsHistoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.VariantsHistory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.VersionVariants version_variants = 1;</code>
   *
   * @return Whether the versionVariants field is set.
   */
  boolean hasVersionVariants();

  /**
   *
   *
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.VersionVariants version_variants = 1;</code>
   *
   * @return The versionVariants.
   */
  com.google.cloud.dialogflow.cx.v3.VersionVariants getVersionVariants();

  /**
   *
   *
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.VersionVariants version_variants = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.VersionVariantsOrBuilder getVersionVariantsOrBuilder();

  /**
   *
   *
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.cloud.dialogflow.cx.v3.VariantsHistory.VariantsCase getVariantsCase();
}
