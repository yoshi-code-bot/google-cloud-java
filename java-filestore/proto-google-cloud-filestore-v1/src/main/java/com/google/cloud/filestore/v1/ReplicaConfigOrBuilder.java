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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.filestore.v1;

public interface ReplicaConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.ReplicaConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The replica state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.ReplicaConfig.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The replica state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.ReplicaConfig.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.filestore.v1.ReplicaConfig.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the replication state, if
   * available.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1.ReplicaConfig.StateReason state_reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the stateReasons.
   */
  java.util.List<com.google.cloud.filestore.v1.ReplicaConfig.StateReason> getStateReasonsList();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the replication state, if
   * available.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1.ReplicaConfig.StateReason state_reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of stateReasons.
   */
  int getStateReasonsCount();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the replication state, if
   * available.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1.ReplicaConfig.StateReason state_reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The stateReasons at the given index.
   */
  com.google.cloud.filestore.v1.ReplicaConfig.StateReason getStateReasons(int index);

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the replication state, if
   * available.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1.ReplicaConfig.StateReason state_reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for stateReasons.
   */
  java.util.List<java.lang.Integer> getStateReasonsValueList();

  /**
   *
   *
   * <pre>
   * Output only. Additional information about the replication state, if
   * available.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.filestore.v1.ReplicaConfig.StateReason state_reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of stateReasons at the given index.
   */
  int getStateReasonsValue(int index);

  /**
   *
   *
   * <pre>
   * Optional. The peer instance.
   * </pre>
   *
   * <code>
   * string peer_instance = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The peerInstance.
   */
  java.lang.String getPeerInstance();

  /**
   *
   *
   * <pre>
   * Optional. The peer instance.
   * </pre>
   *
   * <code>
   * string peer_instance = 3 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for peerInstance.
   */
  com.google.protobuf.ByteString getPeerInstanceBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the latest replication snapshot taken on the
   * active instance and is already replicated safely.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_active_sync_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastActiveSyncTime field is set.
   */
  boolean hasLastActiveSyncTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the latest replication snapshot taken on the
   * active instance and is already replicated safely.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_active_sync_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastActiveSyncTime.
   */
  com.google.protobuf.Timestamp getLastActiveSyncTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the latest replication snapshot taken on the
   * active instance and is already replicated safely.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_active_sync_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastActiveSyncTimeOrBuilder();
}
