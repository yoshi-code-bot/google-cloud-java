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
// source: google/cloud/discoveryengine/v1alpha/sample_query_set.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public interface SampleQuerySetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.SampleQuerySet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The full resource name of the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet], in
   * the format of
   * `projects/{project}/locations/{location}/sampleQuerySets/{sample_query_set}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The full resource name of the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet], in
   * the format of
   * `projects/{project}/locations/{location}/sampleQuerySets/{sample_query_set}`.
   *
   * This field must be a UTF-8 encoded string with a length limit of 1024
   * characters.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The sample query set display name.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The sample query set display name.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet] was
   * created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet] was
   * created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet] was
   * created at.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The description of the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet].
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * The description of the
   * [SampleQuerySet][google.cloud.discoveryengine.v1alpha.SampleQuerySet].
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
