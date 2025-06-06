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

public interface InstanceGroupManagerResourcePoliciesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerResourcePolicies)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return Whether the workloadPolicy field is set.
   */
  boolean hasWorkloadPolicy();

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return The workloadPolicy.
   */
  java.lang.String getWorkloadPolicy();

  /**
   *
   *
   * <pre>
   * The URL of the workload policy that is specified for this managed instance group. It can be a full or partial URL. For example, the following are all valid URLs to a workload policy: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
   * </pre>
   *
   * <code>optional string workload_policy = 114721530;</code>
   *
   * @return The bytes for workloadPolicy.
   */
  com.google.protobuf.ByteString getWorkloadPolicyBytes();
}
