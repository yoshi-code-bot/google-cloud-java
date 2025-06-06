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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgecontainer.v1;

public interface MaintenancePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.MaintenancePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   *
   * @return Whether the window field is set.
   */
  boolean hasWindow();

  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   *
   * @return The window.
   */
  com.google.cloud.edgecontainer.v1.MaintenanceWindow getWindow();

  /**
   *
   *
   * <pre>
   * Specifies the maintenance window in which maintenance may be performed.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.MaintenanceWindow window = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.MaintenanceWindowOrBuilder getWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Exclusions to automatic maintenance. Non-emergency maintenance
   * should not occur in these windows. Each exclusion has a unique name and may
   * be active or expired. The max number of maintenance exclusions allowed at a
   * given time is 3.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.MaintenanceExclusionWindow maintenance_exclusions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.edgecontainer.v1.MaintenanceExclusionWindow>
      getMaintenanceExclusionsList();

  /**
   *
   *
   * <pre>
   * Optional. Exclusions to automatic maintenance. Non-emergency maintenance
   * should not occur in these windows. Each exclusion has a unique name and may
   * be active or expired. The max number of maintenance exclusions allowed at a
   * given time is 3.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.MaintenanceExclusionWindow maintenance_exclusions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.MaintenanceExclusionWindow getMaintenanceExclusions(int index);

  /**
   *
   *
   * <pre>
   * Optional. Exclusions to automatic maintenance. Non-emergency maintenance
   * should not occur in these windows. Each exclusion has a unique name and may
   * be active or expired. The max number of maintenance exclusions allowed at a
   * given time is 3.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.MaintenanceExclusionWindow maintenance_exclusions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getMaintenanceExclusionsCount();

  /**
   *
   *
   * <pre>
   * Optional. Exclusions to automatic maintenance. Non-emergency maintenance
   * should not occur in these windows. Each exclusion has a unique name and may
   * be active or expired. The max number of maintenance exclusions allowed at a
   * given time is 3.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.MaintenanceExclusionWindow maintenance_exclusions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.edgecontainer.v1.MaintenanceExclusionWindowOrBuilder>
      getMaintenanceExclusionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Exclusions to automatic maintenance. Non-emergency maintenance
   * should not occur in these windows. Each exclusion has a unique name and may
   * be active or expired. The max number of maintenance exclusions allowed at a
   * given time is 3.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.MaintenanceExclusionWindow maintenance_exclusions = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.MaintenanceExclusionWindowOrBuilder
      getMaintenanceExclusionsOrBuilder(int index);
}
