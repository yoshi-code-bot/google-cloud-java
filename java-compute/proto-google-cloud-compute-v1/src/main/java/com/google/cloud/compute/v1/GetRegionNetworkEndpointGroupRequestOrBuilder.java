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

public interface GetRegionNetworkEndpointGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRegionNetworkEndpointGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The networkEndpointGroup.
   */
  java.lang.String getNetworkEndpointGroup();

  /**
   *
   *
   * <pre>
   * The name of the network endpoint group. It should comply with RFC1035.
   * </pre>
   *
   * <code>string network_endpoint_group = 433907078 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for networkEndpointGroup.
   */
  com.google.protobuf.ByteString getNetworkEndpointGroupBytes();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The project.
   */
  java.lang.String getProject();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The name of the region where the network endpoint group is located. It should comply with RFC1035.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();

  /**
   *
   *
   * <pre>
   * The name of the region where the network endpoint group is located. It should comply with RFC1035.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();
}
