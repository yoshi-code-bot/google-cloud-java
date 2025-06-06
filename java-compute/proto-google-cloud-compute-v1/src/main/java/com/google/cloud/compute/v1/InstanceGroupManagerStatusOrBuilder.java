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

public interface InstanceGroupManagerStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] Status of all-instances configuration on the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig all_instances_config = 112596737;
   * </code>
   *
   * @return Whether the allInstancesConfig field is set.
   */
  boolean hasAllInstancesConfig();

  /**
   *
   *
   * <pre>
   * [Output only] Status of all-instances configuration on the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig all_instances_config = 112596737;
   * </code>
   *
   * @return The allInstancesConfig.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig getAllInstancesConfig();

  /**
   *
   *
   * <pre>
   * [Output only] Status of all-instances configuration on the group.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig all_instances_config = 112596737;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfigOrBuilder
      getAllInstancesConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Autoscaler that targets this instance group manager.
   * </pre>
   *
   * <code>optional string autoscaler = 517258967;</code>
   *
   * @return Whether the autoscaler field is set.
   */
  boolean hasAutoscaler();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Autoscaler that targets this instance group manager.
   * </pre>
   *
   * <code>optional string autoscaler = 517258967;</code>
   *
   * @return The autoscaler.
   */
  java.lang.String getAutoscaler();

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the Autoscaler that targets this instance group manager.
   * </pre>
   *
   * <code>optional string autoscaler = 517258967;</code>
   *
   * @return The bytes for autoscaler.
   */
  com.google.protobuf.ByteString getAutoscalerBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
   * </pre>
   *
   * <code>optional bool is_stable = 108410864;</code>
   *
   * @return Whether the isStable field is set.
   */
  boolean hasIsStable();

  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
   * </pre>
   *
   * <code>optional bool is_stable = 108410864;</code>
   *
   * @return The isStable.
   */
  boolean getIsStable();

  /**
   *
   *
   * <pre>
   * [Output Only] Stateful status of the given Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusStateful stateful = 244462412;
   * </code>
   *
   * @return Whether the stateful field is set.
   */
  boolean hasStateful();

  /**
   *
   *
   * <pre>
   * [Output Only] Stateful status of the given Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusStateful stateful = 244462412;
   * </code>
   *
   * @return The stateful.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusStateful getStateful();

  /**
   *
   *
   * <pre>
   * [Output Only] Stateful status of the given Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusStateful stateful = 244462412;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusStatefulOrBuilder getStatefulOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusVersionTarget version_target = 289386200;
   * </code>
   *
   * @return Whether the versionTarget field is set.
   */
  boolean hasVersionTarget();

  /**
   *
   *
   * <pre>
   * [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusVersionTarget version_target = 289386200;
   * </code>
   *
   * @return The versionTarget.
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusVersionTarget getVersionTarget();

  /**
   *
   *
   * <pre>
   * [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.InstanceGroupManagerStatusVersionTarget version_target = 289386200;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceGroupManagerStatusVersionTargetOrBuilder
      getVersionTargetOrBuilder();
}
