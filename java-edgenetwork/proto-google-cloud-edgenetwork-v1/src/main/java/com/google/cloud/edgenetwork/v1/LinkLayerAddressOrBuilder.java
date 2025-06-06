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
// source: google/cloud/edgenetwork/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgenetwork.v1;

public interface LinkLayerAddressOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgenetwork.v1.LinkLayerAddress)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The MAC address of this neighbor.
   * </pre>
   *
   * <code>string mac_address = 1;</code>
   *
   * @return The macAddress.
   */
  java.lang.String getMacAddress();

  /**
   *
   *
   * <pre>
   * The MAC address of this neighbor.
   * </pre>
   *
   * <code>string mac_address = 1;</code>
   *
   * @return The bytes for macAddress.
   */
  com.google.protobuf.ByteString getMacAddressBytes();

  /**
   *
   *
   * <pre>
   * The IP address of this neighbor.
   * </pre>
   *
   * <code>string ip_address = 2;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();

  /**
   *
   *
   * <pre>
   * The IP address of this neighbor.
   * </pre>
   *
   * <code>string ip_address = 2;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();
}
