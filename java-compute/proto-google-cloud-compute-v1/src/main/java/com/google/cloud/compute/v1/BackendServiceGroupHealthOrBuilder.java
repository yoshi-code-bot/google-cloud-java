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

public interface BackendServiceGroupHealthOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceGroupHealth)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Metadata defined as annotations on the network endpoint group.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code>
   */
  java.util.List<com.google.cloud.compute.v1.HealthStatus> getHealthStatusList();

  /**
   *
   *
   * <pre>
   * Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code>
   */
  com.google.cloud.compute.v1.HealthStatus getHealthStatus(int index);

  /**
   *
   *
   * <pre>
   * Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code>
   */
  int getHealthStatusCount();

  /**
   *
   *
   * <pre>
   * Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.HealthStatusOrBuilder>
      getHealthStatusOrBuilderList();

  /**
   *
   *
   * <pre>
   * Health state of the backend instances or endpoints in requested instance or network endpoint group, determined based on configured health checks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.HealthStatus health_status = 380545845;</code>
   */
  com.google.cloud.compute.v1.HealthStatusOrBuilder getHealthStatusOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of backend services.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();
}
