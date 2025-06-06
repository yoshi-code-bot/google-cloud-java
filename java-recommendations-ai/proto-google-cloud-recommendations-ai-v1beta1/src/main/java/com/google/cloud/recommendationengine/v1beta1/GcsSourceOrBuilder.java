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
// source: google/cloud/recommendationengine/v1beta1/import.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommendationengine.v1beta1;

public interface GcsSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the inputUris.
   */
  java.util.List<java.lang.String> getInputUrisList();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of inputUris.
   */
  int getInputUrisCount();

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The inputUris at the given index.
   */
  java.lang.String getInputUris(int index);

  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage URIs to input files. URI can be up to
   * 2000 characters long. URIs can match the full object path (for example,
   * `gs://bucket/directory/object.json`) or a pattern matching one or more
   * files, such as `gs://bucket/directory/&#42;.json`. A request can
   * contain at most 100 files, and each file can be up to 2 GB. See
   * [Importing catalog information](/recommendations-ai/docs/upload-catalog)
   * for the expected file format and setup instructions.
   * </pre>
   *
   * <code>repeated string input_uris = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the inputUris at the given index.
   */
  com.google.protobuf.ByteString getInputUrisBytes(int index);
}
