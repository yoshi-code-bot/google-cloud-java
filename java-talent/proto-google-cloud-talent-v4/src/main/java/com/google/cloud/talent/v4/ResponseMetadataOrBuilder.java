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
// source: google/cloud/talent/v4/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4;

public interface ResponseMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.ResponseMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique id associated with this call.
   * This id is logged for tracking purposes.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * A unique id associated with this call.
   * This id is logged for tracking purposes.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
