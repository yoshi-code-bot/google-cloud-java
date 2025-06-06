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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.videointelligence.v1p3beta1;

public interface DetectedAttributeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.DetectedAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the attribute, for example, glasses, dark_glasses, mouth_open.
   * A full list of supported type names will be provided in the document.
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
   * The name of the attribute, for example, glasses, dark_glasses, mouth_open.
   * A full list of supported type names will be provided in the document.
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
   * Detected attribute confidence. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   *
   * @return The confidence.
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * Text value of the detection result. For example, the value for "HairColor"
   * can be "black", "blonde", etc.
   * </pre>
   *
   * <code>string value = 3;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();

  /**
   *
   *
   * <pre>
   * Text value of the detection result. For example, the value for "HairColor"
   * can be "black", "blonde", etc.
   * </pre>
   *
   * <code>string value = 3;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();
}
