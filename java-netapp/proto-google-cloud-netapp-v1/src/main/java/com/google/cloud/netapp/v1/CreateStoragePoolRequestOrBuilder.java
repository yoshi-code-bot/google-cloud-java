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
// source: google/cloud/netapp/v1/storage_pool.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

public interface CreateStoragePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.CreateStoragePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Id of the requesting storage pool. Must be unique within the
   * parent resource. Must contain only letters, numbers and hyphen, with the
   * first character a letter, the last a letter or a number, and a 63 character
   * maximum.
   * </pre>
   *
   * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The storagePoolId.
   */
  java.lang.String getStoragePoolId();

  /**
   *
   *
   * <pre>
   * Required. Id of the requesting storage pool. Must be unique within the
   * parent resource. Must contain only letters, numbers and hyphen, with the
   * first character a letter, the last a letter or a number, and a 63 character
   * maximum.
   * </pre>
   *
   * <code>string storage_pool_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for storagePoolId.
   */
  com.google.protobuf.ByteString getStoragePoolIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the storagePool field is set.
   */
  boolean hasStoragePool();

  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The storagePool.
   */
  com.google.cloud.netapp.v1.StoragePool getStoragePool();

  /**
   *
   *
   * <pre>
   * Required. The required parameters to create a new storage pool.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.StoragePool storage_pool = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.StoragePoolOrBuilder getStoragePoolOrBuilder();
}
