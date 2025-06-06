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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface RegionInstanceGroupsSetNamedPortsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();

  /**
   *
   *
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();

  /**
   *
   *
   * <pre>
   * The fingerprint of the named ports information for this instance group. Use this optional property to prevent conflicts when multiple users change the named ports settings concurrently. Obtain the fingerprint with the instanceGroups.get method. Then, include the fingerprint in your request to ensure that you do not overwrite changes that were applied from another concurrent request.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NamedPort> getNamedPortsList();

  /**
   *
   *
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPort getNamedPorts(int index);

  /**
   *
   *
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  int getNamedPortsCount();

  /**
   *
   *
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NamedPortOrBuilder>
      getNamedPortsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of named ports to set for this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPortOrBuilder getNamedPortsOrBuilder(int index);
}
