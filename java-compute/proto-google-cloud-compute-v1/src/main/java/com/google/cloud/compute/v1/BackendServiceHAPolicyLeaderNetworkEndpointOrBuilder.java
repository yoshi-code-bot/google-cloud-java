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

public interface BackendServiceHAPolicyLeaderNetworkEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceHAPolicyLeaderNetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the VM instance of the leader network endpoint. The instance must already be attached to the NEG specified in the haPolicy.leader.backendGroup. The name must be 1-63 characters long, and comply with RFC1035. Authorization requires the following IAM permission on the specified resource instance: compute.instances.use
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();

  /**
   *
   *
   * <pre>
   * The name of the VM instance of the leader network endpoint. The instance must already be attached to the NEG specified in the haPolicy.leader.backendGroup. The name must be 1-63 characters long, and comply with RFC1035. Authorization requires the following IAM permission on the specified resource instance: compute.instances.use
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();

  /**
   *
   *
   * <pre>
   * The name of the VM instance of the leader network endpoint. The instance must already be attached to the NEG specified in the haPolicy.leader.backendGroup. The name must be 1-63 characters long, and comply with RFC1035. Authorization requires the following IAM permission on the specified resource instance: compute.instances.use
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();
}
