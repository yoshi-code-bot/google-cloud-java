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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.8
package com.google.cloudbuild.v1;

public interface BuiltImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.BuiltImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Name used to push the container image to Google Container Registry, as
   * presented to `docker push`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Docker Registry 2.0 digest.
   * </pre>
   *
   * <code>string digest = 3;</code>
   *
   * @return The digest.
   */
  java.lang.String getDigest();

  /**
   *
   *
   * <pre>
   * Docker Registry 2.0 digest.
   * </pre>
   *
   * <code>string digest = 3;</code>
   *
   * @return The bytes for digest.
   */
  com.google.protobuf.ByteString getDigestBytes();

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the pushTiming field is set.
   */
  boolean hasPushTiming();

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pushTiming.
   */
  com.google.cloudbuild.v1.TimeSpan getPushTiming();

  /**
   *
   *
   * <pre>
   * Output only. Stores timing information for pushing the specified image.
   * </pre>
   *
   * <code>
   * .google.devtools.cloudbuild.v1.TimeSpan push_timing = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloudbuild.v1.TimeSpanOrBuilder getPushTimingOrBuilder();
}
