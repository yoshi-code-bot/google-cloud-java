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
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.lifesciences.v2beta;

public interface ContainerStoppedEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.ContainerStoppedEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The numeric ID of the action that started this container.
   * </pre>
   *
   * <code>int32 action_id = 1;</code>
   *
   * @return The actionId.
   */
  int getActionId();

  /**
   *
   *
   * <pre>
   * The exit status of the container.
   * </pre>
   *
   * <code>int32 exit_status = 2;</code>
   *
   * @return The exitStatus.
   */
  int getExitStatus();

  /**
   *
   *
   * <pre>
   * The tail end of any content written to standard error by the container.
   * If the content emits large amounts of debugging noise or contains
   * sensitive information, you can prevent the content from being printed by
   * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
   *
   * Note that only a small amount of the end of the stream is captured here.
   * The entire stream is stored in the `/google/logs` directory mounted into
   * each action, and can be copied off the machine as described elsewhere.
   * </pre>
   *
   * <code>string stderr = 3;</code>
   *
   * @return The stderr.
   */
  java.lang.String getStderr();

  /**
   *
   *
   * <pre>
   * The tail end of any content written to standard error by the container.
   * If the content emits large amounts of debugging noise or contains
   * sensitive information, you can prevent the content from being printed by
   * setting the `DISABLE_STANDARD_ERROR_CAPTURE` flag.
   *
   * Note that only a small amount of the end of the stream is captured here.
   * The entire stream is stored in the `/google/logs` directory mounted into
   * each action, and can be copied off the machine as described elsewhere.
   * </pre>
   *
   * <code>string stderr = 3;</code>
   *
   * @return The bytes for stderr.
   */
  com.google.protobuf.ByteString getStderrBytes();
}
