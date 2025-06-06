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

public interface ShareSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ShareSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;
   * </code>
   */
  int getProjectMapCount();

  /**
   *
   *
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;
   * </code>
   */
  boolean containsProjectMap(java.lang.String key);

  /** Use {@link #getProjectMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
      getProjectMap();

  /**
   *
   *
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
      getProjectMapMap();

  /**
   *
   *
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.ShareSettingsProjectConfig defaultValue);

  /**
   *
   *
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;
   * </code>
   */
  com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   *
   * @return Whether the shareType field is set.
   */
  boolean hasShareType();

  /**
   *
   *
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   *
   * @return The shareType.
   */
  java.lang.String getShareType();

  /**
   *
   *
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   *
   * @return The bytes for shareType.
   */
  com.google.protobuf.ByteString getShareTypeBytes();
}
