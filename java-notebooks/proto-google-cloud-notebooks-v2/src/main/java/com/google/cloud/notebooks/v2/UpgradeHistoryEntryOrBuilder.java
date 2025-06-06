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
// source: google/cloud/notebooks/v2/instance.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.notebooks.v2;

public interface UpgradeHistoryEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v2.UpgradeHistoryEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The snapshot of the boot disk of this notebook instance before
   * upgrade.
   * </pre>
   *
   * <code>string snapshot = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The snapshot.
   */
  java.lang.String getSnapshot();

  /**
   *
   *
   * <pre>
   * Optional. The snapshot of the boot disk of this notebook instance before
   * upgrade.
   * </pre>
   *
   * <code>string snapshot = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for snapshot.
   */
  com.google.protobuf.ByteString getSnapshotBytes();

  /**
   *
   *
   * <pre>
   * Optional. The VM image before this instance upgrade.
   * </pre>
   *
   * <code>string vm_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The vmImage.
   */
  java.lang.String getVmImage();

  /**
   *
   *
   * <pre>
   * Optional. The VM image before this instance upgrade.
   * </pre>
   *
   * <code>string vm_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for vmImage.
   */
  com.google.protobuf.ByteString getVmImageBytes();

  /**
   *
   *
   * <pre>
   * Optional. The container image before this instance upgrade.
   * </pre>
   *
   * <code>string container_image = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The containerImage.
   */
  java.lang.String getContainerImage();

  /**
   *
   *
   * <pre>
   * Optional. The container image before this instance upgrade.
   * </pre>
   *
   * <code>string container_image = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for containerImage.
   */
  com.google.protobuf.ByteString getContainerImageBytes();

  /**
   *
   *
   * <pre>
   * Optional. The framework of this notebook instance.
   * </pre>
   *
   * <code>string framework = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The framework.
   */
  java.lang.String getFramework();

  /**
   *
   *
   * <pre>
   * Optional. The framework of this notebook instance.
   * </pre>
   *
   * <code>string framework = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for framework.
   */
  com.google.protobuf.ByteString getFrameworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. The version of the notebook instance before this upgrade.
   * </pre>
   *
   * <code>string version = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Optional. The version of the notebook instance before this upgrade.
   * </pre>
   *
   * <code>string version = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of this instance upgrade history entry.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.UpgradeHistoryEntry.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The state of this instance upgrade history entry.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.UpgradeHistoryEntry.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.notebooks.v2.UpgradeHistoryEntry.State getState();

  /**
   *
   *
   * <pre>
   * Immutable. The time that this instance upgrade history entry is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Immutable. The time that this instance upgrade history entry is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Immutable. The time that this instance upgrade history entry is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Action. Rolloback or Upgrade.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.UpgradeHistoryEntry.Action action = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();

  /**
   *
   *
   * <pre>
   * Optional. Action. Rolloback or Upgrade.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v2.UpgradeHistoryEntry.Action action = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The action.
   */
  com.google.cloud.notebooks.v2.UpgradeHistoryEntry.Action getAction();

  /**
   *
   *
   * <pre>
   * Optional. Target VM Version, like m63.
   * </pre>
   *
   * <code>string target_version = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The targetVersion.
   */
  java.lang.String getTargetVersion();

  /**
   *
   *
   * <pre>
   * Optional. Target VM Version, like m63.
   * </pre>
   *
   * <code>string target_version = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for targetVersion.
   */
  com.google.protobuf.ByteString getTargetVersionBytes();
}
