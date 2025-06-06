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
// source: google/cloud/datacatalog/v1beta1/gcs_fileset_spec.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public interface GcsFileSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.GcsFileSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filePath.
   */
  java.lang.String getFilePath();

  /**
   *
   *
   * <pre>
   * Required. The full file path. Example: `gs://bucket_name/a/b.txt`.
   * </pre>
   *
   * <code>string file_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString getFilePathBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the Cloud Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the gcsTimestamps field is set.
   */
  boolean hasGcsTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the Cloud Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The gcsTimestamps.
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestamps getGcsTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the Cloud Storage file.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps gcs_timestamps = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestampsOrBuilder getGcsTimestampsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The size of the file, in bytes.
   * </pre>
   *
   * <code>int64 size_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sizeBytes.
   */
  long getSizeBytes();
}
