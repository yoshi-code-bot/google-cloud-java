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
// source: google/api/apikeys/v2/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.api.apikeys.v2;

public interface RestrictionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.Restrictions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The HTTP referrers (websites) that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.BrowserKeyRestrictions browser_key_restrictions = 1;</code>
   *
   * @return Whether the browserKeyRestrictions field is set.
   */
  boolean hasBrowserKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The HTTP referrers (websites) that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.BrowserKeyRestrictions browser_key_restrictions = 1;</code>
   *
   * @return The browserKeyRestrictions.
   */
  com.google.api.apikeys.v2.BrowserKeyRestrictions getBrowserKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The HTTP referrers (websites) that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.BrowserKeyRestrictions browser_key_restrictions = 1;</code>
   */
  com.google.api.apikeys.v2.BrowserKeyRestrictionsOrBuilder getBrowserKeyRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The IP addresses of callers that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.ServerKeyRestrictions server_key_restrictions = 2;</code>
   *
   * @return Whether the serverKeyRestrictions field is set.
   */
  boolean hasServerKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The IP addresses of callers that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.ServerKeyRestrictions server_key_restrictions = 2;</code>
   *
   * @return The serverKeyRestrictions.
   */
  com.google.api.apikeys.v2.ServerKeyRestrictions getServerKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The IP addresses of callers that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.ServerKeyRestrictions server_key_restrictions = 2;</code>
   */
  com.google.api.apikeys.v2.ServerKeyRestrictionsOrBuilder getServerKeyRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The Android apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.AndroidKeyRestrictions android_key_restrictions = 3;</code>
   *
   * @return Whether the androidKeyRestrictions field is set.
   */
  boolean hasAndroidKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The Android apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.AndroidKeyRestrictions android_key_restrictions = 3;</code>
   *
   * @return The androidKeyRestrictions.
   */
  com.google.api.apikeys.v2.AndroidKeyRestrictions getAndroidKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The Android apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.AndroidKeyRestrictions android_key_restrictions = 3;</code>
   */
  com.google.api.apikeys.v2.AndroidKeyRestrictionsOrBuilder getAndroidKeyRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The iOS apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.IosKeyRestrictions ios_key_restrictions = 4;</code>
   *
   * @return Whether the iosKeyRestrictions field is set.
   */
  boolean hasIosKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The iOS apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.IosKeyRestrictions ios_key_restrictions = 4;</code>
   *
   * @return The iosKeyRestrictions.
   */
  com.google.api.apikeys.v2.IosKeyRestrictions getIosKeyRestrictions();

  /**
   *
   *
   * <pre>
   * The iOS apps that are allowed to use the key.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.IosKeyRestrictions ios_key_restrictions = 4;</code>
   */
  com.google.api.apikeys.v2.IosKeyRestrictionsOrBuilder getIosKeyRestrictionsOrBuilder();

  /**
   *
   *
   * <pre>
   * A restriction for a specific service and optionally one or
   * more specific methods. Requests are allowed if they
   * match any of these restrictions. If no restrictions are
   * specified, all targets are allowed.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.ApiTarget api_targets = 5;</code>
   */
  java.util.List<com.google.api.apikeys.v2.ApiTarget> getApiTargetsList();

  /**
   *
   *
   * <pre>
   * A restriction for a specific service and optionally one or
   * more specific methods. Requests are allowed if they
   * match any of these restrictions. If no restrictions are
   * specified, all targets are allowed.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.ApiTarget api_targets = 5;</code>
   */
  com.google.api.apikeys.v2.ApiTarget getApiTargets(int index);

  /**
   *
   *
   * <pre>
   * A restriction for a specific service and optionally one or
   * more specific methods. Requests are allowed if they
   * match any of these restrictions. If no restrictions are
   * specified, all targets are allowed.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.ApiTarget api_targets = 5;</code>
   */
  int getApiTargetsCount();

  /**
   *
   *
   * <pre>
   * A restriction for a specific service and optionally one or
   * more specific methods. Requests are allowed if they
   * match any of these restrictions. If no restrictions are
   * specified, all targets are allowed.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.ApiTarget api_targets = 5;</code>
   */
  java.util.List<? extends com.google.api.apikeys.v2.ApiTargetOrBuilder>
      getApiTargetsOrBuilderList();

  /**
   *
   *
   * <pre>
   * A restriction for a specific service and optionally one or
   * more specific methods. Requests are allowed if they
   * match any of these restrictions. If no restrictions are
   * specified, all targets are allowed.
   * </pre>
   *
   * <code>repeated .google.api.apikeys.v2.ApiTarget api_targets = 5;</code>
   */
  com.google.api.apikeys.v2.ApiTargetOrBuilder getApiTargetsOrBuilder(int index);

  com.google.api.apikeys.v2.Restrictions.ClientRestrictionsCase getClientRestrictionsCase();
}
