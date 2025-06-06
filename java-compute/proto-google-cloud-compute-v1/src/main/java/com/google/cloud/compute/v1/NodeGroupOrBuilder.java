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

public interface NodeGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies how autoscaling should behave.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupAutoscalingPolicy autoscaling_policy = 221950041;
   * </code>
   *
   * @return Whether the autoscalingPolicy field is set.
   */
  boolean hasAutoscalingPolicy();

  /**
   *
   *
   * <pre>
   * Specifies how autoscaling should behave.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupAutoscalingPolicy autoscaling_policy = 221950041;
   * </code>
   *
   * @return The autoscalingPolicy.
   */
  com.google.cloud.compute.v1.NodeGroupAutoscalingPolicy getAutoscalingPolicy();

  /**
   *
   *
   * <pre>
   * Specifies how autoscaling should behave.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupAutoscalingPolicy autoscaling_policy = 221950041;
   * </code>
   */
  com.google.cloud.compute.v1.NodeGroupAutoscalingPolicyOrBuilder getAutoscalingPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();

  /**
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();

  /**
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
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
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
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
   * [Output Only] The type of the resource. Always compute#nodeGroup for node group.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   *
   * @return Whether the locationHint field is set.
   */
  boolean hasLocationHint();

  /**
   *
   *
   * <pre>
   * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   *
   * @return The locationHint.
   */
  java.lang.String getLocationHint();

  /**
   *
   *
   * <pre>
   * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
   * </pre>
   *
   * <code>optional string location_hint = 350519505;</code>
   *
   * @return The bytes for locationHint.
   */
  com.google.protobuf.ByteString getLocationHintBytes();

  /**
   *
   *
   * <pre>
   * Specifies the frequency of planned maintenance events. The accepted values are: `AS_NEEDED` and `RECURRENT`.
   * Check the MaintenanceInterval enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_interval = 403368049;</code>
   *
   * @return Whether the maintenanceInterval field is set.
   */
  boolean hasMaintenanceInterval();

  /**
   *
   *
   * <pre>
   * Specifies the frequency of planned maintenance events. The accepted values are: `AS_NEEDED` and `RECURRENT`.
   * Check the MaintenanceInterval enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_interval = 403368049;</code>
   *
   * @return The maintenanceInterval.
   */
  java.lang.String getMaintenanceInterval();

  /**
   *
   *
   * <pre>
   * Specifies the frequency of planned maintenance events. The accepted values are: `AS_NEEDED` and `RECURRENT`.
   * Check the MaintenanceInterval enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_interval = 403368049;</code>
   *
   * @return The bytes for maintenanceInterval.
   */
  com.google.protobuf.ByteString getMaintenanceIntervalBytes();

  /**
   *
   *
   * <pre>
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
   * Check the MaintenancePolicy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_policy = 528327646;</code>
   *
   * @return Whether the maintenancePolicy field is set.
   */
  boolean hasMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
   * Check the MaintenancePolicy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_policy = 528327646;</code>
   *
   * @return The maintenancePolicy.
   */
  java.lang.String getMaintenancePolicy();

  /**
   *
   *
   * <pre>
   * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
   * Check the MaintenancePolicy enum for the list of possible values.
   * </pre>
   *
   * <code>optional string maintenance_policy = 528327646;</code>
   *
   * @return The bytes for maintenancePolicy.
   */
  com.google.protobuf.ByteString getMaintenancePolicyBytes();

  /**
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupMaintenanceWindow maintenance_window = 186374812;
   * </code>
   *
   * @return Whether the maintenanceWindow field is set.
   */
  boolean hasMaintenanceWindow();

  /**
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupMaintenanceWindow maintenance_window = 186374812;
   * </code>
   *
   * @return The maintenanceWindow.
   */
  com.google.cloud.compute.v1.NodeGroupMaintenanceWindow getMaintenanceWindow();

  /**
   * <code>
   * optional .google.cloud.compute.v1.NodeGroupMaintenanceWindow maintenance_window = 186374812;
   * </code>
   */
  com.google.cloud.compute.v1.NodeGroupMaintenanceWindowOrBuilder getMaintenanceWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * URL of the node template to create the node group from.
   * </pre>
   *
   * <code>optional string node_template = 323154455;</code>
   *
   * @return Whether the nodeTemplate field is set.
   */
  boolean hasNodeTemplate();

  /**
   *
   *
   * <pre>
   * URL of the node template to create the node group from.
   * </pre>
   *
   * <code>optional string node_template = 323154455;</code>
   *
   * @return The nodeTemplate.
   */
  java.lang.String getNodeTemplate();

  /**
   *
   *
   * <pre>
   * URL of the node template to create the node group from.
   * </pre>
   *
   * <code>optional string node_template = 323154455;</code>
   *
   * @return The bytes for nodeTemplate.
   */
  com.google.protobuf.ByteString getNodeTemplateBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Share-settings for the node group
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ShareSettings share_settings = 266668163;</code>
   *
   * @return Whether the shareSettings field is set.
   */
  boolean hasShareSettings();

  /**
   *
   *
   * <pre>
   * Share-settings for the node group
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ShareSettings share_settings = 266668163;</code>
   *
   * @return The shareSettings.
   */
  com.google.cloud.compute.v1.ShareSettings getShareSettings();

  /**
   *
   *
   * <pre>
   * Share-settings for the node group
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ShareSettings share_settings = 266668163;</code>
   */
  com.google.cloud.compute.v1.ShareSettingsOrBuilder getShareSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The total number of nodes in the node group.
   * </pre>
   *
   * <code>optional int32 size = 3530753;</code>
   *
   * @return Whether the size field is set.
   */
  boolean hasSize();

  /**
   *
   *
   * <pre>
   * [Output Only] The total number of nodes in the node group.
   * </pre>
   *
   * <code>optional int32 size = 3530753;</code>
   *
   * @return The size.
   */
  int getSize();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();

  /**
   *
   *
   * <pre>
   *
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the zone where the node group resides, such as us-central1-a.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
