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
// source: google/cloud/automl/v1beta1/temporal.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public interface TimeSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TimeSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   *
   * @return Whether the startTimeOffset field is set.
   */
  boolean hasStartTimeOffset();

  /**
   *
   *
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   *
   * @return The startTimeOffset.
   */
  com.google.protobuf.Duration getStartTimeOffset();

  /**
   *
   *
   * <pre>
   * Start of the time segment (inclusive), represented as the duration since
   * the example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration start_time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getStartTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   *
   * @return Whether the endTimeOffset field is set.
   */
  boolean hasEndTimeOffset();

  /**
   *
   *
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   *
   * @return The endTimeOffset.
   */
  com.google.protobuf.Duration getEndTimeOffset();

  /**
   *
   *
   * <pre>
   * End of the time segment (exclusive), represented as the duration since the
   * example start.
   * </pre>
   *
   * <code>.google.protobuf.Duration end_time_offset = 2;</code>
   */
  com.google.protobuf.DurationOrBuilder getEndTimeOffsetOrBuilder();
}
