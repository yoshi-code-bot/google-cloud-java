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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tpu.v2alpha1;

public interface NetworkEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.NetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The internal IP address of this network endpoint.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();

  /**
   *
   *
   * <pre>
   * The internal IP address of this network endpoint.
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * The port of this network endpoint.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.AccessConfig access_config = 5;</code>
   *
   * @return Whether the accessConfig field is set.
   */
  boolean hasAccessConfig();

  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.AccessConfig access_config = 5;</code>
   *
   * @return The accessConfig.
   */
  com.google.cloud.tpu.v2alpha1.AccessConfig getAccessConfig();

  /**
   *
   *
   * <pre>
   * The access config for the TPU worker.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2alpha1.AccessConfig access_config = 5;</code>
   */
  com.google.cloud.tpu.v2alpha1.AccessConfigOrBuilder getAccessConfigOrBuilder();
}
