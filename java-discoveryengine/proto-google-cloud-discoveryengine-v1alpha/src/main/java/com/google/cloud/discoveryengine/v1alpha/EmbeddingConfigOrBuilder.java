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
// source: google/cloud/discoveryengine/v1alpha/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface EmbeddingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.EmbeddingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full field path in the schema mapped as embedding field.
   * </pre>
   *
   * <code>string field_path = 1;</code>
   *
   * @return The fieldPath.
   */
  java.lang.String getFieldPath();

  /**
   *
   *
   * <pre>
   * Full field path in the schema mapped as embedding field.
   * </pre>
   *
   * <code>string field_path = 1;</code>
   *
   * @return The bytes for fieldPath.
   */
  com.google.protobuf.ByteString getFieldPathBytes();
}
