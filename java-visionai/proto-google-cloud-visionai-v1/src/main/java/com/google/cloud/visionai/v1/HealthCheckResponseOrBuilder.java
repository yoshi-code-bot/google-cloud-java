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
// source: google/cloud/visionai/v1/health_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface HealthCheckResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.HealthCheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether the cluster is in healthy state or not.
   * </pre>
   *
   * <code>bool healthy = 1;</code>
   *
   * @return The healthy.
   */
  boolean getHealthy();

  /**
   *
   *
   * <pre>
   * Reason of why the cluster is in unhealthy state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The reason.
   */
  java.lang.String getReason();

  /**
   *
   *
   * <pre>
   * Reason of why the cluster is in unhealthy state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString getReasonBytes();

  /**
   *
   *
   * <pre>
   * Other information of the cluster client may be interested.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ClusterInfo cluster_info = 3;</code>
   *
   * @return Whether the clusterInfo field is set.
   */
  boolean hasClusterInfo();

  /**
   *
   *
   * <pre>
   * Other information of the cluster client may be interested.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ClusterInfo cluster_info = 3;</code>
   *
   * @return The clusterInfo.
   */
  com.google.cloud.visionai.v1.ClusterInfo getClusterInfo();

  /**
   *
   *
   * <pre>
   * Other information of the cluster client may be interested.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ClusterInfo cluster_info = 3;</code>
   */
  com.google.cloud.visionai.v1.ClusterInfoOrBuilder getClusterInfoOrBuilder();
}
