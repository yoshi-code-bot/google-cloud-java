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
// source: google/cloud/osconfig/v1alpha/inventory.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.osconfig.v1alpha;

public interface InventoryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.Inventory)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The `Inventory` API resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/inventory`
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The `Inventory` API resource name.
   *
   * Format:
   * `projects/{project_number}/locations/{location}/instances/{instance_id}/inventory`
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Base level operating system information for the VM.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.Inventory.OsInfo os_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the osInfo field is set.
   */
  boolean hasOsInfo();

  /**
   *
   *
   * <pre>
   * Output only. Base level operating system information for the VM.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.Inventory.OsInfo os_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The osInfo.
   */
  com.google.cloud.osconfig.v1alpha.Inventory.OsInfo getOsInfo();

  /**
   *
   *
   * <pre>
   * Output only. Base level operating system information for the VM.
   * </pre>
   *
   * <code>
   * .google.cloud.osconfig.v1alpha.Inventory.OsInfo os_info = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.Inventory.OsInfoOrBuilder getOsInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item. The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.osconfig.v1alpha.Inventory.Item&gt; items = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getItemsCount();

  /**
   *
   *
   * <pre>
   * Output only. Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item. The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.osconfig.v1alpha.Inventory.Item&gt; items = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsItems(java.lang.String key);

  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1alpha.Inventory.Item> getItems();

  /**
   *
   *
   * <pre>
   * Output only. Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item. The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.osconfig.v1alpha.Inventory.Item&gt; items = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.osconfig.v1alpha.Inventory.Item> getItemsMap();

  /**
   *
   *
   * <pre>
   * Output only. Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item. The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.osconfig.v1alpha.Inventory.Item&gt; items = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.osconfig.v1alpha.Inventory.Item getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.osconfig.v1alpha.Inventory.Item defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Inventory items related to the VM keyed by an opaque unique identifier for
   * each inventory item. The identifier is unique to each distinct and
   * addressable inventory item and will change, when there is a new package
   * version.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.osconfig.v1alpha.Inventory.Item&gt; items = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.Inventory.Item getItemsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of the last reported inventory for the VM.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
