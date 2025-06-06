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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.v1beta1;

public interface OnPremClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.OnPremCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
   * example:
   *
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The resourceLink.
   */
  java.lang.String getResourceLink();

  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
   * example:
   *
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for resourceLink.
   */
  com.google.protobuf.ByteString getResourceLinkBytes();

  /**
   *
   *
   * <pre>
   * Output only. If cluster_missing is set then it denotes that
   * API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no
   * longer exists.
   * </pre>
   *
   * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterMissing.
   */
  boolean getClusterMissing();

  /**
   *
   *
   * <pre>
   * Immutable. Whether the cluster is an admin cluster.
   * </pre>
   *
   * <code>bool admin_cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The adminCluster.
   */
  boolean getAdminCluster();

  /**
   *
   *
   * <pre>
   * Immutable. The on prem cluster's type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterType.
   */
  int getClusterTypeValue();

  /**
   *
   *
   * <pre>
   * Immutable. The on prem cluster's type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The clusterType.
   */
  com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType getClusterType();
}
