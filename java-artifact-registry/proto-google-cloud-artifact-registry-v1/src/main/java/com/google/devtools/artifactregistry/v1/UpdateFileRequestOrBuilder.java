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
// source: google/devtools/artifactregistry/v1/file.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface UpdateFileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.UpdateFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The File that replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.File file = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the file field is set.
   */
  boolean hasFile();

  /**
   *
   *
   * <pre>
   * Required. The File that replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.File file = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The file.
   */
  com.google.devtools.artifactregistry.v1.File getFile();

  /**
   *
   *
   * <pre>
   * Required. The File that replaces the resource on the server.
   * </pre>
   *
   * <code>
   * .google.devtools.artifactregistry.v1.File file = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.devtools.artifactregistry.v1.FileOrBuilder getFileOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. For the `FieldMask`
   * definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
