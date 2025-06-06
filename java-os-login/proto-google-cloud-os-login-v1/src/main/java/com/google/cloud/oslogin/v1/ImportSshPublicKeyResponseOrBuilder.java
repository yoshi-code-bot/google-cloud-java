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
// source: google/cloud/oslogin/v1/oslogin.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oslogin.v1;

public interface ImportSshPublicKeyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   *
   * @return Whether the loginProfile field is set.
   */
  boolean hasLoginProfile();

  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   *
   * @return The loginProfile.
   */
  com.google.cloud.oslogin.v1.LoginProfile getLoginProfile();

  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   */
  com.google.cloud.oslogin.v1.LoginProfileOrBuilder getLoginProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   *
   * @return The details.
   */
  java.lang.String getDetails();

  /**
   *
   *
   * <pre>
   * Detailed information about import results.
   * </pre>
   *
   * <code>string details = 2;</code>
   *
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString getDetailsBytes();
}
