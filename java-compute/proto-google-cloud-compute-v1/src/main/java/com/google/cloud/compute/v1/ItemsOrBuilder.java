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

public interface ItemsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Items)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be less than 128 bytes in length. This is reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();

  /**
   *
   *
   * <pre>
   * Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be less than 128 bytes in length. This is reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return The key.
   */
  java.lang.String getKey();

  /**
   *
   *
   * <pre>
   * Key for the metadata entry. Keys must conform to the following regexp: [a-zA-Z0-9-_]+, and be less than 128 bytes in length. This is reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project.
   * </pre>
   *
   * <code>optional string key = 106079;</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();

  /**
   *
   *
   * <pre>
   * Value for the metadata entry. These are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on values is that their size must be less than or equal to 262144 bytes (256 KiB).
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();

  /**
   *
   *
   * <pre>
   * Value for the metadata entry. These are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on values is that their size must be less than or equal to 262144 bytes (256 KiB).
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();

  /**
   *
   *
   * <pre>
   * Value for the metadata entry. These are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on values is that their size must be less than or equal to 262144 bytes (256 KiB).
   * </pre>
   *
   * <code>optional string value = 111972721;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();
}
