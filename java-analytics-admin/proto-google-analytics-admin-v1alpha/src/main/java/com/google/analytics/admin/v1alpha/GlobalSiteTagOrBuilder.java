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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface GlobalSiteTagOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.GlobalSiteTag)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this GlobalSiteTag resource.
   * Format: properties/{property_id}/dataStreams/{stream_id}/globalSiteTag
   * Example: "properties/123/dataStreams/456/globalSiteTag"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Resource name for this GlobalSiteTag resource.
   * Format: properties/{property_id}/dataStreams/{stream_id}/globalSiteTag
   * Example: "properties/123/dataStreams/456/globalSiteTag"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. JavaScript code snippet to be pasted as the first item into the
   * head tag of every webpage to measure.
   * </pre>
   *
   * <code>string snippet = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The snippet.
   */
  java.lang.String getSnippet();

  /**
   *
   *
   * <pre>
   * Immutable. JavaScript code snippet to be pasted as the first item into the
   * head tag of every webpage to measure.
   * </pre>
   *
   * <code>string snippet = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for snippet.
   */
  com.google.protobuf.ByteString getSnippetBytes();
}
