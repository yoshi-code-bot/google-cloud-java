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
// source: google/shopping/merchant/accounts/v1beta/omnichannelsettings.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

public interface RequestInventoryVerificationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.accounts.v1beta.RequestInventoryVerificationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The omnichannel setting that was updated.
   * </pre>
   *
   * <code>.google.shopping.merchant.accounts.v1beta.OmnichannelSetting omnichannel_setting = 1;
   * </code>
   *
   * @return Whether the omnichannelSetting field is set.
   */
  boolean hasOmnichannelSetting();

  /**
   *
   *
   * <pre>
   * The omnichannel setting that was updated.
   * </pre>
   *
   * <code>.google.shopping.merchant.accounts.v1beta.OmnichannelSetting omnichannel_setting = 1;
   * </code>
   *
   * @return The omnichannelSetting.
   */
  com.google.shopping.merchant.accounts.v1beta.OmnichannelSetting getOmnichannelSetting();

  /**
   *
   *
   * <pre>
   * The omnichannel setting that was updated.
   * </pre>
   *
   * <code>.google.shopping.merchant.accounts.v1beta.OmnichannelSetting omnichannel_setting = 1;
   * </code>
   */
  com.google.shopping.merchant.accounts.v1beta.OmnichannelSettingOrBuilder
      getOmnichannelSettingOrBuilder();
}
