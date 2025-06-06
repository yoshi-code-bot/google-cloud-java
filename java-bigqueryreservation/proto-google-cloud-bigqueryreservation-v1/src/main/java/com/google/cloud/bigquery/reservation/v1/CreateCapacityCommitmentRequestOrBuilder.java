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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.reservation.v1;

public interface CreateCapacityCommitmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent reservation. E.g.,
   *    `projects/myproject/locations/US`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent reservation. E.g.,
   *    `projects/myproject/locations/US`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   *
   * @return Whether the capacityCommitment field is set.
   */
  boolean hasCapacityCommitment();

  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   *
   * @return The capacityCommitment.
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitment getCapacityCommitment();

  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   */
  com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder
      getCapacityCommitmentOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, fail the request if another project in the organization has a
   * capacity commitment.
   * </pre>
   *
   * <code>bool enforce_single_admin_project_per_org = 4;</code>
   *
   * @return The enforceSingleAdminProjectPerOrg.
   */
  boolean getEnforceSingleAdminProjectPerOrg();

  /**
   *
   *
   * <pre>
   * The optional capacity commitment ID. Capacity commitment name will be
   * generated automatically if this field is empty.
   * This field must only contain lower case alphanumeric characters or dashes.
   * The first and last character cannot be a dash. Max length is 64 characters.
   * NOTE: this ID won't be kept if the capacity commitment is split or merged.
   * </pre>
   *
   * <code>string capacity_commitment_id = 5;</code>
   *
   * @return The capacityCommitmentId.
   */
  java.lang.String getCapacityCommitmentId();

  /**
   *
   *
   * <pre>
   * The optional capacity commitment ID. Capacity commitment name will be
   * generated automatically if this field is empty.
   * This field must only contain lower case alphanumeric characters or dashes.
   * The first and last character cannot be a dash. Max length is 64 characters.
   * NOTE: this ID won't be kept if the capacity commitment is split or merged.
   * </pre>
   *
   * <code>string capacity_commitment_id = 5;</code>
   *
   * @return The bytes for capacityCommitmentId.
   */
  com.google.protobuf.ByteString getCapacityCommitmentIdBytes();
}
