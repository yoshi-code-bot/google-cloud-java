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

public interface ReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Reservation for aggregated resources, providing shape flexibility.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationAggregateReservation aggregate_reservation = 291567948;
   * </code>
   *
   * @return Whether the aggregateReservation field is set.
   */
  boolean hasAggregateReservation();

  /**
   *
   *
   * <pre>
   * Reservation for aggregated resources, providing shape flexibility.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationAggregateReservation aggregate_reservation = 291567948;
   * </code>
   *
   * @return The aggregateReservation.
   */
  com.google.cloud.compute.v1.AllocationAggregateReservation getAggregateReservation();

  /**
   *
   *
   * <pre>
   * Reservation for aggregated resources, providing shape flexibility.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationAggregateReservation aggregate_reservation = 291567948;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationAggregateReservationOrBuilder
      getAggregateReservationOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
   * </pre>
   *
   * <code>optional string commitment = 482134805;</code>
   *
   * @return Whether the commitment field is set.
   */
  boolean hasCommitment();

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
   * </pre>
   *
   * <code>optional string commitment = 482134805;</code>
   *
   * @return The commitment.
   */
  java.lang.String getCommitment();

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to a parent commitment. This field displays for reservations that are tied to a commitment.
   * </pre>
   *
   * <code>optional string commitment = 482134805;</code>
   *
   * @return The bytes for commitment.
   */
  com.google.protobuf.ByteString getCommitmentBytes();

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
   * Duration time relative to reservation creation when Compute Engine will automatically delete this resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration delete_after_duration = 323997099;</code>
   *
   * @return Whether the deleteAfterDuration field is set.
   */
  boolean hasDeleteAfterDuration();

  /**
   *
   *
   * <pre>
   * Duration time relative to reservation creation when Compute Engine will automatically delete this resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration delete_after_duration = 323997099;</code>
   *
   * @return The deleteAfterDuration.
   */
  com.google.cloud.compute.v1.Duration getDeleteAfterDuration();

  /**
   *
   *
   * <pre>
   * Duration time relative to reservation creation when Compute Engine will automatically delete this resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration delete_after_duration = 323997099;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getDeleteAfterDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
   * </pre>
   *
   * <code>optional string delete_at_time = 83294405;</code>
   *
   * @return Whether the deleteAtTime field is set.
   */
  boolean hasDeleteAtTime();

  /**
   *
   *
   * <pre>
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
   * </pre>
   *
   * <code>optional string delete_at_time = 83294405;</code>
   *
   * @return The deleteAtTime.
   */
  java.lang.String getDeleteAtTime();

  /**
   *
   *
   * <pre>
   * Absolute time in future when the reservation will be auto-deleted by Compute Engine. Timestamp is represented in RFC3339 text format.
   * </pre>
   *
   * <code>optional string delete_at_time = 83294405;</code>
   *
   * @return The bytes for deleteAtTime.
   */
  com.google.protobuf.ByteString getDeleteAtTimeBytes();

  /**
   *
   *
   * <pre>
   * Specifies the deployment strategy for this reservation.
   * Check the DeploymentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string deployment_type = 396722292;</code>
   *
   * @return Whether the deploymentType field is set.
   */
  boolean hasDeploymentType();

  /**
   *
   *
   * <pre>
   * Specifies the deployment strategy for this reservation.
   * Check the DeploymentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string deployment_type = 396722292;</code>
   *
   * @return The deploymentType.
   */
  java.lang.String getDeploymentType();

  /**
   *
   *
   * <pre>
   * Specifies the deployment strategy for this reservation.
   * Check the DeploymentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string deployment_type = 396722292;</code>
   *
   * @return The bytes for deploymentType.
   */
  com.google.protobuf.ByteString getDeploymentTypeBytes();

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
   *
   *
   * <pre>
   * Indicates whether Compute Engine allows unplanned maintenance for your VMs; for example, to fix hardware errors.
   * </pre>
   *
   * <code>optional bool enable_emergent_maintenance = 353759497;</code>
   *
   * @return Whether the enableEmergentMaintenance field is set.
   */
  boolean hasEnableEmergentMaintenance();

  /**
   *
   *
   * <pre>
   * Indicates whether Compute Engine allows unplanned maintenance for your VMs; for example, to fix hardware errors.
   * </pre>
   *
   * <code>optional bool enable_emergent_maintenance = 353759497;</code>
   *
   * @return The enableEmergentMaintenance.
   */
  boolean getEnableEmergentMaintenance();

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
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
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
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
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
   * [Output Only] Type of the resource. Always compute#reservations for reservations.
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
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations that are tied to multiple commitments.
   * </pre>
   *
   * <code>repeated string linked_commitments = 470957784;</code>
   *
   * @return A list containing the linkedCommitments.
   */
  java.util.List<java.lang.String> getLinkedCommitmentsList();

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations that are tied to multiple commitments.
   * </pre>
   *
   * <code>repeated string linked_commitments = 470957784;</code>
   *
   * @return The count of linkedCommitments.
   */
  int getLinkedCommitmentsCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations that are tied to multiple commitments.
   * </pre>
   *
   * <code>repeated string linked_commitments = 470957784;</code>
   *
   * @param index The index of the element to return.
   * @return The linkedCommitments at the given index.
   */
  java.lang.String getLinkedCommitments(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Full or partial URL to parent commitments. This field displays for reservations that are tied to multiple commitments.
   * </pre>
   *
   * <code>repeated string linked_commitments = 470957784;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the linkedCommitments at the given index.
   */
  com.google.protobuf.ByteString getLinkedCommitmentsBytes(int index);

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
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with Google Cloud managed services.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationReservationSharingPolicy reservation_sharing_policy = 205970120;
   * </code>
   *
   * @return Whether the reservationSharingPolicy field is set.
   */
  boolean hasReservationSharingPolicy();

  /**
   *
   *
   * <pre>
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with Google Cloud managed services.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationReservationSharingPolicy reservation_sharing_policy = 205970120;
   * </code>
   *
   * @return The reservationSharingPolicy.
   */
  com.google.cloud.compute.v1.AllocationReservationSharingPolicy getReservationSharingPolicy();

  /**
   *
   *
   * <pre>
   * Specify the reservation sharing policy. If unspecified, the reservation will not be shared with Google Cloud managed services.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationReservationSharingPolicy reservation_sharing_policy = 205970120;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationReservationSharingPolicyOrBuilder
      getReservationSharingPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource policies to be added to this reservation. The key is defined by user, and the value is resource policy url. This is to define placement policy with reservation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_policies = 22220385;</code>
   */
  int getResourcePoliciesCount();

  /**
   *
   *
   * <pre>
   * Resource policies to be added to this reservation. The key is defined by user, and the value is resource policy url. This is to define placement policy with reservation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_policies = 22220385;</code>
   */
  boolean containsResourcePolicies(java.lang.String key);

  /** Use {@link #getResourcePoliciesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourcePolicies();

  /**
   *
   *
   * <pre>
   * Resource policies to be added to this reservation. The key is defined by user, and the value is resource policy url. This is to define placement policy with reservation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_policies = 22220385;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourcePoliciesMap();

  /**
   *
   *
   * <pre>
   * Resource policies to be added to this reservation. The key is defined by user, and the value is resource policy url. This is to define placement policy with reservation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_policies = 22220385;</code>
   */
  /* nullable */
  java.lang.String getResourcePoliciesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Resource policies to be added to this reservation. The key is defined by user, and the value is resource policy url. This is to define placement policy with reservation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_policies = 22220385;</code>
   */
  java.lang.String getResourcePoliciesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * [Output Only] Status information for Reservation resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatus resource_status = 249429315;
   * </code>
   *
   * @return Whether the resourceStatus field is set.
   */
  boolean hasResourceStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] Status information for Reservation resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatus resource_status = 249429315;
   * </code>
   *
   * @return The resourceStatus.
   */
  com.google.cloud.compute.v1.AllocationResourceStatus getResourceStatus();

  /**
   *
   *
   * <pre>
   * [Output Only] Status information for Reservation resource.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AllocationResourceStatus resource_status = 249429315;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationResourceStatusOrBuilder getResourceStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool satisfies_pzs = 480964267;</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined fully-qualified URL for this resource.
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
   * [Output Only] Server-defined fully-qualified URL for this resource.
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
   * [Output Only] Server-defined fully-qualified URL for this resource.
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
   * Specify share-settings to create a shared reservation. This property is optional. For more information about the syntax and options for this field and its subfields, see the guide for creating a shared reservation.
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
   * Specify share-settings to create a shared reservation. This property is optional. For more information about the syntax and options for this field and its subfields, see the guide for creating a shared reservation.
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
   * Specify share-settings to create a shared reservation. This property is optional. For more information about the syntax and options for this field and its subfields, see the guide for creating a shared reservation.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ShareSettings share_settings = 266668163;</code>
   */
  com.google.cloud.compute.v1.ShareSettingsOrBuilder getShareSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Reservation for instances with specific machine shapes.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationSpecificSKUReservation specific_reservation = 404901951;
   * </code>
   *
   * @return Whether the specificReservation field is set.
   */
  boolean hasSpecificReservation();

  /**
   *
   *
   * <pre>
   * Reservation for instances with specific machine shapes.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationSpecificSKUReservation specific_reservation = 404901951;
   * </code>
   *
   * @return The specificReservation.
   */
  com.google.cloud.compute.v1.AllocationSpecificSKUReservation getSpecificReservation();

  /**
   *
   *
   * <pre>
   * Reservation for instances with specific machine shapes.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.AllocationSpecificSKUReservation specific_reservation = 404901951;
   * </code>
   */
  com.google.cloud.compute.v1.AllocationSpecificSKUReservationOrBuilder
      getSpecificReservationOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
   * </pre>
   *
   * <code>optional bool specific_reservation_required = 226550687;</code>
   *
   * @return Whether the specificReservationRequired field is set.
   */
  boolean hasSpecificReservationRequired();

  /**
   *
   *
   * <pre>
   * Indicates whether the reservation can be consumed by VMs with affinity for "any" reservation. If the field is set, then only VMs that target the reservation by name can consume from this reservation.
   * </pre>
   *
   * <code>optional bool specific_reservation_required = 226550687;</code>
   *
   * @return The specificReservationRequired.
   */
  boolean getSpecificReservationRequired();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being allocated. - READY: Reservation resources have been allocated, and the reservation is ready for use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in progress.
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
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being allocated. - READY: Reservation resources have been allocated, and the reservation is ready for use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in progress.
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
   * [Output Only] The status of the reservation. - CREATING: Reservation resources are being allocated. - READY: Reservation resources have been allocated, and the reservation is ready for use. - DELETING: Reservation deletion is in progress. - UPDATING: Reservation update is in progress.
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
   * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
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
   * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
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
   * Zone in which the reservation resides. A zone must be provided if the reservation is created within a commitment.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
