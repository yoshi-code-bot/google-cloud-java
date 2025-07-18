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
// source: google/cloud/licensemanager/v1/api_entities.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.licensemanager.v1;

public interface BillingInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.licensemanager.v1.BillingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. This type of billing uses user count for computing total
   * charge.
   * </pre>
   *
   * <code>
   * .google.cloud.licensemanager.v1.UserCountBillingInfo user_count_billing = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the userCountBilling field is set.
   */
  boolean hasUserCountBilling();

  /**
   *
   *
   * <pre>
   * Required. This type of billing uses user count for computing total
   * charge.
   * </pre>
   *
   * <code>
   * .google.cloud.licensemanager.v1.UserCountBillingInfo user_count_billing = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The userCountBilling.
   */
  com.google.cloud.licensemanager.v1.UserCountBillingInfo getUserCountBilling();

  /**
   *
   *
   * <pre>
   * Required. This type of billing uses user count for computing total
   * charge.
   * </pre>
   *
   * <code>
   * .google.cloud.licensemanager.v1.UserCountBillingInfo user_count_billing = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.licensemanager.v1.UserCountBillingInfoOrBuilder getUserCountBillingOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the billing starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Output only. When the billing starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Output only. When the billing starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. When the billing ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. When the billing ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. When the billing ends.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  com.google.cloud.licensemanager.v1.BillingInfo.CurrentBillingInfoCase getCurrentBillingInfoCase();
}
