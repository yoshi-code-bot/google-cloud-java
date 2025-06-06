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
// source: google/chat/v1/space.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface CreateSpaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.CreateSpaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The `displayName` and `spaceType` fields must be populated.  Only
   * `SpaceType.SPACE`  and `SpaceType.GROUP_CHAT` are supported.
   * `SpaceType.GROUP_CHAT` can only be used if `importMode` is set to true.
   *
   * If you receive the error message `ALREADY_EXISTS`,
   * try a different `displayName`. An existing space within the Google
   * Workspace organization might already use this display name.
   *
   *
   * The space `name` is assigned on the server so anything specified in this
   * field will be ignored.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the space field is set.
   */
  boolean hasSpace();

  /**
   *
   *
   * <pre>
   * Required. The `displayName` and `spaceType` fields must be populated.  Only
   * `SpaceType.SPACE`  and `SpaceType.GROUP_CHAT` are supported.
   * `SpaceType.GROUP_CHAT` can only be used if `importMode` is set to true.
   *
   * If you receive the error message `ALREADY_EXISTS`,
   * try a different `displayName`. An existing space within the Google
   * Workspace organization might already use this display name.
   *
   *
   * The space `name` is assigned on the server so anything specified in this
   * field will be ignored.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The space.
   */
  com.google.chat.v1.Space getSpace();

  /**
   *
   *
   * <pre>
   * Required. The `displayName` and `spaceType` fields must be populated.  Only
   * `SpaceType.SPACE`  and `SpaceType.GROUP_CHAT` are supported.
   * `SpaceType.GROUP_CHAT` can only be used if `importMode` is set to true.
   *
   * If you receive the error message `ALREADY_EXISTS`,
   * try a different `displayName`. An existing space within the Google
   * Workspace organization might already use this display name.
   *
   *
   * The space `name` is assigned on the server so anything specified in this
   * field will be ignored.
   * </pre>
   *
   * <code>.google.chat.v1.Space space = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.chat.v1.SpaceOrBuilder getSpaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for this request.
   * A random UUID is recommended.
   * Specifying an existing request ID returns the space created with that ID
   * instead of creating a new space.
   * Specifying an existing request ID from the same Chat app with a different
   * authenticated user returns an error.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Optional. A unique identifier for this request.
   * A random UUID is recommended.
   * Specifying an existing request ID returns the space created with that ID
   * instead of creating a new space.
   * Specifying an existing request ID from the same Chat app with a different
   * authenticated user returns an error.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
