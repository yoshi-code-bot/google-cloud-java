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

public interface ListAssociationsFirewallPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ListAssociationsFirewallPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The target resource to list associations. It is an organization, or a folder.
   * </pre>
   *
   * <code>optional string target_resource = 467318524;</code>
   *
   * @return Whether the targetResource field is set.
   */
  boolean hasTargetResource();

  /**
   *
   *
   * <pre>
   * The target resource to list associations. It is an organization, or a folder.
   * </pre>
   *
   * <code>optional string target_resource = 467318524;</code>
   *
   * @return The targetResource.
   */
  java.lang.String getTargetResource();

  /**
   *
   *
   * <pre>
   * The target resource to list associations. It is an organization, or a folder.
   * </pre>
   *
   * <code>optional string target_resource = 467318524;</code>
   *
   * @return The bytes for targetResource.
   */
  com.google.protobuf.ByteString getTargetResourceBytes();
}
