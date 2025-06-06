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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface UpdateChannelPartnerRepricingConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.UpdateChannelPartnerRepricingConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelPartnerRepricingConfig field is set.
   */
  boolean hasChannelPartnerRepricingConfig();

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelPartnerRepricingConfig.
   */
  com.google.cloud.channel.v1.ChannelPartnerRepricingConfig getChannelPartnerRepricingConfig();

  /**
   *
   *
   * <pre>
   * Required. The ChannelPartnerRepricingConfig object to update.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.ChannelPartnerRepricingConfig channel_partner_repricing_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.ChannelPartnerRepricingConfigOrBuilder
      getChannelPartnerRepricingConfigOrBuilder();
}
