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
// source: google/cloud/developerconnect/v1/developer_connect.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.developerconnect.v1;

public interface GitProxyConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.developerconnect.v1.GitProxyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Setting this to true allows the git proxy to be used for
   * performing git operations on the repositories linked in the connection.
   * </pre>
   *
   * <code>bool enabled = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();
}
