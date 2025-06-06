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
// source: google/cloud/oracledatabase/v1/entitlement.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oracledatabase.v1;

public interface EntitlementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oracledatabase.v1.Entitlement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the Entitlement resource with the format:
   * projects/{project}/locations/{region}/entitlements/{entitlement}
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
   * Identifier. The name of the Entitlement resource with the format:
   * projects/{project}/locations/{region}/entitlements/{entitlement}
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
   * Details of the OCI Cloud Account.
   * </pre>
   *
   * <code>.google.cloud.oracledatabase.v1.CloudAccountDetails cloud_account_details = 2;</code>
   *
   * @return Whether the cloudAccountDetails field is set.
   */
  boolean hasCloudAccountDetails();

  /**
   *
   *
   * <pre>
   * Details of the OCI Cloud Account.
   * </pre>
   *
   * <code>.google.cloud.oracledatabase.v1.CloudAccountDetails cloud_account_details = 2;</code>
   *
   * @return The cloudAccountDetails.
   */
  com.google.cloud.oracledatabase.v1.CloudAccountDetails getCloudAccountDetails();

  /**
   *
   *
   * <pre>
   * Details of the OCI Cloud Account.
   * </pre>
   *
   * <code>.google.cloud.oracledatabase.v1.CloudAccountDetails cloud_account_details = 2;</code>
   */
  com.google.cloud.oracledatabase.v1.CloudAccountDetailsOrBuilder getCloudAccountDetailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Google Cloud Marketplace order ID (aka entitlement ID)
   * </pre>
   *
   * <code>string entitlement_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The entitlementId.
   */
  java.lang.String getEntitlementId();

  /**
   *
   *
   * <pre>
   * Output only. Google Cloud Marketplace order ID (aka entitlement ID)
   * </pre>
   *
   * <code>string entitlement_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for entitlementId.
   */
  com.google.protobuf.ByteString getEntitlementIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Entitlement State.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.Entitlement.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Entitlement State.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.Entitlement.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.oracledatabase.v1.Entitlement.State getState();
}
