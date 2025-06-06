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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface SubmitUserDeletionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.SubmitUserDeletionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Analytics [user
   * ID](https://firebase.google.com/docs/analytics/userid).
   * </pre>
   *
   * <code>string user_id = 2;</code>
   *
   * @return Whether the userId field is set.
   */
  boolean hasUserId();

  /**
   *
   *
   * <pre>
   * Google Analytics [user
   * ID](https://firebase.google.com/docs/analytics/userid).
   * </pre>
   *
   * <code>string user_id = 2;</code>
   *
   * @return The userId.
   */
  java.lang.String getUserId();

  /**
   *
   *
   * <pre>
   * Google Analytics [user
   * ID](https://firebase.google.com/docs/analytics/userid).
   * </pre>
   *
   * <code>string user_id = 2;</code>
   *
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString getUserIdBytes();

  /**
   *
   *
   * <pre>
   * Google Analytics [client
   * ID](https://support.google.com/analytics/answer/11593727).
   * </pre>
   *
   * <code>string client_id = 3;</code>
   *
   * @return Whether the clientId field is set.
   */
  boolean hasClientId();

  /**
   *
   *
   * <pre>
   * Google Analytics [client
   * ID](https://support.google.com/analytics/answer/11593727).
   * </pre>
   *
   * <code>string client_id = 3;</code>
   *
   * @return The clientId.
   */
  java.lang.String getClientId();

  /**
   *
   *
   * <pre>
   * Google Analytics [client
   * ID](https://support.google.com/analytics/answer/11593727).
   * </pre>
   *
   * <code>string client_id = 3;</code>
   *
   * @return The bytes for clientId.
   */
  com.google.protobuf.ByteString getClientIdBytes();

  /**
   *
   *
   * <pre>
   * Firebase [application instance
   * ID](https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.html#getAppInstanceId).
   * </pre>
   *
   * <code>string app_instance_id = 4;</code>
   *
   * @return Whether the appInstanceId field is set.
   */
  boolean hasAppInstanceId();

  /**
   *
   *
   * <pre>
   * Firebase [application instance
   * ID](https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.html#getAppInstanceId).
   * </pre>
   *
   * <code>string app_instance_id = 4;</code>
   *
   * @return The appInstanceId.
   */
  java.lang.String getAppInstanceId();

  /**
   *
   *
   * <pre>
   * Firebase [application instance
   * ID](https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.html#getAppInstanceId).
   * </pre>
   *
   * <code>string app_instance_id = 4;</code>
   *
   * @return The bytes for appInstanceId.
   */
  com.google.protobuf.ByteString getAppInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * The un-hashed, unencrypted, [user-provided
   * data](https://support.google.com/analytics/answer/14077171).
   * </pre>
   *
   * <code>string user_provided_data = 5;</code>
   *
   * @return Whether the userProvidedData field is set.
   */
  boolean hasUserProvidedData();

  /**
   *
   *
   * <pre>
   * The un-hashed, unencrypted, [user-provided
   * data](https://support.google.com/analytics/answer/14077171).
   * </pre>
   *
   * <code>string user_provided_data = 5;</code>
   *
   * @return The userProvidedData.
   */
  java.lang.String getUserProvidedData();

  /**
   *
   *
   * <pre>
   * The un-hashed, unencrypted, [user-provided
   * data](https://support.google.com/analytics/answer/14077171).
   * </pre>
   *
   * <code>string user_provided_data = 5;</code>
   *
   * @return The bytes for userProvidedData.
   */
  com.google.protobuf.ByteString getUserProvidedDataBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the property to submit user deletion for.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The name of the property to submit user deletion for.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  com.google.analytics.admin.v1alpha.SubmitUserDeletionRequest.UserCase getUserCase();
}
