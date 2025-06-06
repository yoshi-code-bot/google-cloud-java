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
// source: google/cloud/gkebackup/v1/volume.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkebackup.v1;

public interface VolumeRestoreOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.VolumeRestore)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Full name of the VolumeRestore resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;&#47;volumeRestores/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Full name of the VolumeRestore resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;&#47;restores/&#42;&#47;volumeRestores/&#42;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this VolumeRestore resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The full name of the VolumeBackup from which the volume will
   * be restored. Format:
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;&#47;volumeBackups/&#42;`.
   * </pre>
   *
   * <code>string volume_backup = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeBackup.
   */
  java.lang.String getVolumeBackup();

  /**
   *
   *
   * <pre>
   * Output only. The full name of the VolumeBackup from which the volume will
   * be restored. Format:
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;&#47;backups/&#42;&#47;volumeBackups/&#42;`.
   * </pre>
   *
   * <code>string volume_backup = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for volumeBackup.
   */
  com.google.protobuf.ByteString getVolumeBackupBytes();

  /**
   *
   *
   * <pre>
   * Output only. The reference to the target Kubernetes PVC to be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName target_pvc = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the targetPvc field is set.
   */
  boolean hasTargetPvc();

  /**
   *
   *
   * <pre>
   * Output only. The reference to the target Kubernetes PVC to be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName target_pvc = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The targetPvc.
   */
  com.google.cloud.gkebackup.v1.NamespacedName getTargetPvc();

  /**
   *
   *
   * <pre>
   * Output only. The reference to the target Kubernetes PVC to be restored.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.NamespacedName target_pvc = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder getTargetPvcOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A storage system-specific opaque handler to the underlying
   * volume created for the target PVC from the volume backup.
   * </pre>
   *
   * <code>string volume_handle = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeHandle.
   */
  java.lang.String getVolumeHandle();

  /**
   *
   *
   * <pre>
   * Output only. A storage system-specific opaque handler to the underlying
   * volume created for the target PVC from the volume backup.
   * </pre>
   *
   * <code>string volume_handle = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for volumeHandle.
   */
  com.google.protobuf.ByteString getVolumeHandleBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of volume provisioned
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeRestore.VolumeType volume_type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for volumeType.
   */
  int getVolumeTypeValue();

  /**
   *
   *
   * <pre>
   * Output only. The type of volume provisioned
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeRestore.VolumeType volume_type = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The volumeType.
   */
  com.google.cloud.gkebackup.v1.VolumeRestore.VolumeType getVolumeType();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume
   * restoration completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume
   * restoration completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the associated underlying volume
   * restoration completed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp complete_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this VolumeRestore.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeRestore.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of this VolumeRestore.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.VolumeRestore.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkebackup.v1.VolumeRestore.State getState();

  /**
   *
   *
   * <pre>
   * Output only. A human readable message explaining why the VolumeRestore is
   * in its current state.
   * </pre>
   *
   * <code>string state_message = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();

  /**
   *
   *
   * <pre>
   * Output only. A human readable message explaining why the VolumeRestore is
   * in its current state.
   * </pre>
   *
   * <code>string state_message = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a volume restore from overwriting each
   * other. It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform volume restore updates in order to avoid
   * race conditions.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a volume restore from overwriting each
   * other. It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform volume restore updates in order to avoid
   * race conditions.
   * </pre>
   *
   * <code>string etag = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
