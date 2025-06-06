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
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.video.stitcher.v1;

public interface AkamaiCdnKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.AkamaiCdnKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input only. Token key for the Akamai CDN edge configuration.
   * </pre>
   *
   * <code>bytes token_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The tokenKey.
   */
  com.google.protobuf.ByteString getTokenKey();
}
