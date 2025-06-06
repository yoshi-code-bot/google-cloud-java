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
// source: google/cloud/devicestreaming/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.devicestreaming.v1;

public interface AndroidDeviceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.devicestreaming.v1.AndroidDevice)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The id of the Android device to be used.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string android_model_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The androidModelId.
   */
  java.lang.String getAndroidModelId();

  /**
   *
   *
   * <pre>
   * Required. The id of the Android device to be used.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string android_model_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for androidModelId.
   */
  com.google.protobuf.ByteString getAndroidModelIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The id of the Android OS version to be used.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string android_version_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The androidVersionId.
   */
  java.lang.String getAndroidVersionId();

  /**
   *
   *
   * <pre>
   * Required. The id of the Android OS version to be used.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string android_version_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for androidVersionId.
   */
  com.google.protobuf.ByteString getAndroidVersionIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The locale the test device used for testing.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The locale.
   */
  java.lang.String getLocale();

  /**
   *
   *
   * <pre>
   * Optional. The locale the test device used for testing.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString getLocaleBytes();

  /**
   *
   *
   * <pre>
   * Optional. How the device is oriented during the test.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string orientation = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orientation.
   */
  java.lang.String getOrientation();

  /**
   *
   *
   * <pre>
   * Optional. How the device is oriented during the test.
   * Use the TestEnvironmentDiscoveryService to get supported options.
   * </pre>
   *
   * <code>string orientation = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orientation.
   */
  com.google.protobuf.ByteString getOrientationBytes();
}
