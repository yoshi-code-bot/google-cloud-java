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

public interface PromoteReplicaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.PromoteReplicaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the instance, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the peer instance to promote, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * The peer instance is required if the operation is called on an active
   * instance.
   * </pre>
   *
   * <code>
   * string peer_instance = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The peerInstance.
   */
  java.lang.String getPeerInstance();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the peer instance to promote, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`.
   * The peer instance is required if the operation is called on an active
   * instance.
   * </pre>
   *
   * <code>
   * string peer_instance = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for peerInstance.
   */
  com.google.protobuf.ByteString getPeerInstanceBytes();
}
