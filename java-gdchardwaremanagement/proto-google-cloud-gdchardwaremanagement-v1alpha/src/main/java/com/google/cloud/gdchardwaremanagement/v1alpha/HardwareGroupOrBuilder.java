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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface HardwareGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of this hardware group.
   * Format:
   * `projects/{project}/locations/{location}/orders/{order}/hardwareGroups/{hardware_group}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. Name of this hardware group.
   * Format:
   * `projects/{project}/locations/{location}/orders/{order}/hardwareGroups/{hardware_group}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time when this hardware group was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Labels associated with this hardware group as key value pairs.
   * For more information about labels, see [Create and manage
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels associated with this hardware group as key value pairs.
   * For more information about labels, see [Create and manage
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels associated with this hardware group as key value pairs.
   * For more information about labels, see [Create and manage
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels associated with this hardware group as key value pairs.
   * For more information about labels, see [Create and manage
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Labels associated with this hardware group as key value pairs.
   * For more information about labels, see [Create and manage
   * labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels).
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. Number of hardware in this HardwareGroup.
   * </pre>
   *
   * <code>int32 hardware_count = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hardwareCount.
   */
  int getHardwareCount();

  /**
   *
   *
   * <pre>
   * Required. Configuration for hardware in this HardwareGroup.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareConfig config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();

  /**
   *
   *
   * <pre>
   * Required. Configuration for hardware in this HardwareGroup.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareConfig config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareConfig getConfig();

  /**
   *
   *
   * <pre>
   * Required. Configuration for hardware in this HardwareGroup.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareConfig config = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Name of the site where the hardware in this HardwareGroup will be
   * delivered.
   * Format: `projects/{project}/locations/{location}/sites/{site}`
   * </pre>
   *
   * <code>
   * string site = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The site.
   */
  java.lang.String getSite();

  /**
   *
   *
   * <pre>
   * Required. Name of the site where the hardware in this HardwareGroup will be
   * delivered.
   * Format: `projects/{project}/locations/{location}/sites/{site}`
   * </pre>
   *
   * <code>
   * string site = 7 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for site.
   */
  com.google.protobuf.ByteString getSiteBytes();

  /**
   *
   *
   * <pre>
   * Output only. Current state of this HardwareGroup.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Current state of this HardwareGroup.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup.State getState();

  /**
   *
   *
   * <pre>
   * Optional. Name of the zone that the hardware in this HardwareGroup belongs
   * to. Format: `projects/{project}/locations/{location}/zones/{zone}`
   * </pre>
   *
   * <code>
   * string zone = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * Optional. Name of the zone that the hardware in this HardwareGroup belongs
   * to. Format: `projects/{project}/locations/{location}/zones/{zone}`
   * </pre>
   *
   * <code>
   * string zone = 9 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * Optional. Requested installation date for the hardware in this
   * HardwareGroup. Filled in by the customer.
   * </pre>
   *
   * <code>
   * .google.type.Date requested_installation_date = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the requestedInstallationDate field is set.
   */
  boolean hasRequestedInstallationDate();

  /**
   *
   *
   * <pre>
   * Optional. Requested installation date for the hardware in this
   * HardwareGroup. Filled in by the customer.
   * </pre>
   *
   * <code>
   * .google.type.Date requested_installation_date = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The requestedInstallationDate.
   */
  com.google.type.Date getRequestedInstallationDate();

  /**
   *
   *
   * <pre>
   * Optional. Requested installation date for the hardware in this
   * HardwareGroup. Filled in by the customer.
   * </pre>
   *
   * <code>
   * .google.type.Date requested_installation_date = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.type.DateOrBuilder getRequestedInstallationDateOrBuilder();
}
