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

public interface ScreenshotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Screenshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return Whether the contents field is set.
   */
  boolean hasContents();

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return The contents.
   */
  java.lang.String getContents();

  /**
   *
   *
   * <pre>
   * [Output Only] The Base64-encoded screenshot data.
   * </pre>
   *
   * <code>optional string contents = 506419994;</code>
   *
   * @return The bytes for contents.
   */
  com.google.protobuf.ByteString getContentsBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#screenshot for the screenshots.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();
}
