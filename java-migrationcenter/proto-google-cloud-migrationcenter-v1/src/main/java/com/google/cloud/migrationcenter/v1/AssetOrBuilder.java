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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full name of the asset.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The full name of the asset.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the asset was created.
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
   * Output only. The timestamp when the asset was created.
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
   * Output only. The timestamp when the asset was created.
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
   * Output only. The timestamp when the asset was last updated.
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
   * Output only. The timestamp when the asset was last updated.
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
   * Output only. The timestamp when the asset was last updated.
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
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
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
   * Labels as key value pairs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Generic asset attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 5;</code>
   */
  int getAttributesCount();

  /**
   *
   *
   * <pre>
   * Generic asset attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 5;</code>
   */
  boolean containsAttributes(java.lang.String key);

  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAttributes();

  /**
   *
   *
   * <pre>
   * Generic asset attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAttributesMap();

  /**
   *
   *
   * <pre>
   * Generic asset attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 5;</code>
   */
  /* nullable */
  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Generic asset attributes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 5;</code>
   */
  java.lang.String getAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Asset information specific for virtual and physical
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineDetails machine_details = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the machineDetails field is set.
   */
  boolean hasMachineDetails();

  /**
   *
   *
   * <pre>
   * Output only. Asset information specific for virtual and physical
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineDetails machine_details = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The machineDetails.
   */
  com.google.cloud.migrationcenter.v1.MachineDetails getMachineDetails();

  /**
   *
   *
   * <pre>
   * Output only. Asset information specific for virtual and physical
   * machines.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.MachineDetails machine_details = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.MachineDetailsOrBuilder getMachineDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The list of insights associated with the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.InsightList insight_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the insightList field is set.
   */
  boolean hasInsightList();

  /**
   *
   *
   * <pre>
   * Output only. The list of insights associated with the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.InsightList insight_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The insightList.
   */
  com.google.cloud.migrationcenter.v1.InsightList getInsightList();

  /**
   *
   *
   * <pre>
   * Output only. The list of insights associated with the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.InsightList insight_list = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.InsightListOrBuilder getInsightListOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Performance data for the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetPerformanceData performance_data = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the performanceData field is set.
   */
  boolean hasPerformanceData();

  /**
   *
   *
   * <pre>
   * Output only. Performance data for the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetPerformanceData performance_data = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The performanceData.
   */
  com.google.cloud.migrationcenter.v1.AssetPerformanceData getPerformanceData();

  /**
   *
   *
   * <pre>
   * Output only. Performance data for the asset.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetPerformanceData performance_data = 21 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.AssetPerformanceDataOrBuilder getPerformanceDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The list of sources contributing to the asset.
   * </pre>
   *
   * <code>
   * repeated string sources = 22 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the sources.
   */
  java.util.List<java.lang.String> getSourcesList();

  /**
   *
   *
   * <pre>
   * Output only. The list of sources contributing to the asset.
   * </pre>
   *
   * <code>
   * repeated string sources = 22 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of sources.
   */
  int getSourcesCount();

  /**
   *
   *
   * <pre>
   * Output only. The list of sources contributing to the asset.
   * </pre>
   *
   * <code>
   * repeated string sources = 22 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The sources at the given index.
   */
  java.lang.String getSources(int index);

  /**
   *
   *
   * <pre>
   * Output only. The list of sources contributing to the asset.
   * </pre>
   *
   * <code>
   * repeated string sources = 22 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the sources at the given index.
   */
  com.google.protobuf.ByteString getSourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The list of groups that the asset is assigned to.
   * </pre>
   *
   * <code>
   * repeated string assigned_groups = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the assignedGroups.
   */
  java.util.List<java.lang.String> getAssignedGroupsList();

  /**
   *
   *
   * <pre>
   * Output only. The list of groups that the asset is assigned to.
   * </pre>
   *
   * <code>
   * repeated string assigned_groups = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of assignedGroups.
   */
  int getAssignedGroupsCount();

  /**
   *
   *
   * <pre>
   * Output only. The list of groups that the asset is assigned to.
   * </pre>
   *
   * <code>
   * repeated string assigned_groups = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The assignedGroups at the given index.
   */
  java.lang.String getAssignedGroups(int index);

  /**
   *
   *
   * <pre>
   * Output only. The list of groups that the asset is assigned to.
   * </pre>
   *
   * <code>
   * repeated string assigned_groups = 23 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assignedGroups at the given index.
   */
  com.google.protobuf.ByteString getAssignedGroupsBytes(int index);

  com.google.cloud.migrationcenter.v1.Asset.AssetDetailsCase getAssetDetailsCase();
}
