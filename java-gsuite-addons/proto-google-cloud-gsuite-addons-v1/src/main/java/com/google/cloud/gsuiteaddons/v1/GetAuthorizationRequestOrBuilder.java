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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gsuiteaddons.v1;

public interface GetAuthorizationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gsuiteaddons.v1.GetAuthorizationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the project for which to get the Google Workspace add-ons
   * authorization information.
   *
   * Example: `projects/my_project/authorization`.
   * </pre>
   *
   * <code>
   * string name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Name of the project for which to get the Google Workspace add-ons
   * authorization information.
   *
   * Example: `projects/my_project/authorization`.
   * </pre>
   *
   * <code>
   * string name = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
