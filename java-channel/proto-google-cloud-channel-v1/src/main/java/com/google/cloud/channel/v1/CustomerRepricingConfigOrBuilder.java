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
// source: google/cloud/channel/v1/repricing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface CustomerRepricingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.CustomerRepricingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the CustomerRepricingConfig.
   * Format:
   * accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
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
   * Output only. Resource name of the CustomerRepricingConfig.
   * Format:
   * accounts/{account_id}/customers/{customer_id}/customerRepricingConfigs/{id}.
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
   * Required. The configuration for bill modifications made by a reseller
   * before sending it to customers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingConfig repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the repricingConfig field is set.
   */
  boolean hasRepricingConfig();

  /**
   *
   *
   * <pre>
   * Required. The configuration for bill modifications made by a reseller
   * before sending it to customers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingConfig repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The repricingConfig.
   */
  com.google.cloud.channel.v1.RepricingConfig getRepricingConfig();

  /**
   *
   *
   * <pre>
   * Required. The configuration for bill modifications made by a reseller
   * before sending it to customers.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingConfig repricing_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.RepricingConfigOrBuilder getRepricingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp of an update to the repricing rule. If `update_time`
   * is after
   * [RepricingConfig.effective_invoice_month][google.cloud.channel.v1.RepricingConfig.effective_invoice_month]
   * then it indicates this was set mid-month.
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
   * Output only. Timestamp of an update to the repricing rule. If `update_time`
   * is after
   * [RepricingConfig.effective_invoice_month][google.cloud.channel.v1.RepricingConfig.effective_invoice_month]
   * then it indicates this was set mid-month.
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
   * Output only. Timestamp of an update to the repricing rule. If `update_time`
   * is after
   * [RepricingConfig.effective_invoice_month][google.cloud.channel.v1.RepricingConfig.effective_invoice_month]
   * then it indicates this was set mid-month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
