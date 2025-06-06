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

public interface StatefulPolicyPreservedStateDiskDeviceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.StatefulPolicyPreservedStateDiskDevice)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   *
   * @return Whether the autoDelete field is set.
   */
  boolean hasAutoDelete();

  /**
   *
   *
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   *
   * @return The autoDelete.
   */
  java.lang.String getAutoDelete();

  /**
   *
   *
   * <pre>
   * These stateful disks will never be deleted during autohealing, update or VM instance recreate operations. This flag is used to configure if the disk should be deleted after it is no longer used by the group, e.g. when the given instance or the whole group is deleted. Note: disks attached in READ_ONLY mode cannot be auto-deleted.
   * Check the AutoDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string auto_delete = 464761403;</code>
   *
   * @return The bytes for autoDelete.
   */
  com.google.protobuf.ByteString getAutoDeleteBytes();
}
