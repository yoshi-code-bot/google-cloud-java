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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.clouderrorreporting.v1beta1;

public interface TrackingIssueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.TrackingIssue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A URL pointing to a related entry in an issue tracking system.
   * Example: `https://github.com/user/project/issues/4`
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();

  /**
   *
   *
   * <pre>
   * A URL pointing to a related entry in an issue tracking system.
   * Example: `https://github.com/user/project/issues/4`
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();
}
