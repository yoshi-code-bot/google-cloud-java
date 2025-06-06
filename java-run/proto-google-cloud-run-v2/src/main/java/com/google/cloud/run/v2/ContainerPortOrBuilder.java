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
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

public interface ContainerPortOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ContainerPort)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If specified, used to specify which protocol to use.
   * Allowed values are "http1" and "h2c".
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
   * If specified, used to specify which protocol to use.
   * Allowed values are "http1" and "h2c".
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
   * Port number the container listens on.
   * This must be a valid TCP port number, 0 &lt; container_port &lt; 65536.
   * </pre>
   *
   * <code>int32 container_port = 3;</code>
   *
   * @return The containerPort.
   */
  int getContainerPort();
}
