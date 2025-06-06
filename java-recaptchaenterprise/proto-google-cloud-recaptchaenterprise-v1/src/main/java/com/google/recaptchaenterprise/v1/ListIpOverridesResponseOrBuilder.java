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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

public interface ListIpOverridesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.ListIpOverridesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * IP Overrides details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_overrides = 1;</code>
   */
  java.util.List<com.google.recaptchaenterprise.v1.IpOverrideData> getIpOverridesList();

  /**
   *
   *
   * <pre>
   * IP Overrides details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_overrides = 1;</code>
   */
  com.google.recaptchaenterprise.v1.IpOverrideData getIpOverrides(int index);

  /**
   *
   *
   * <pre>
   * IP Overrides details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_overrides = 1;</code>
   */
  int getIpOverridesCount();

  /**
   *
   *
   * <pre>
   * IP Overrides details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_overrides = 1;</code>
   */
  java.util.List<? extends com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder>
      getIpOverridesOrBuilderList();

  /**
   *
   *
   * <pre>
   * IP Overrides details.
   * </pre>
   *
   * <code>repeated .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_overrides = 1;</code>
   */
  com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder getIpOverridesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. If this field is empty, no keys
   * remain in the results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. If this field is empty, no keys
   * remain in the results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
