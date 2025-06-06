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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmmigration.v1;

public interface VmwareSourceDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmmigration.v1.VmwareSourceDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The credentials username.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();

  /**
   *
   *
   * <pre>
   * The credentials username.
   * </pre>
   *
   * <code>string username = 1;</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Input only. The credentials password. This is write only and can not be
   * read in a GET operation.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The password.
   */
  java.lang.String getPassword();

  /**
   *
   *
   * <pre>
   * Input only. The credentials password. This is write only and can not be
   * read in a GET operation.
   * </pre>
   *
   * <code>string password = 2 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * The ip address of the vcenter this Source represents.
   * </pre>
   *
   * <code>string vcenter_ip = 3;</code>
   *
   * @return The vcenterIp.
   */
  java.lang.String getVcenterIp();

  /**
   *
   *
   * <pre>
   * The ip address of the vcenter this Source represents.
   * </pre>
   *
   * <code>string vcenter_ip = 3;</code>
   *
   * @return The bytes for vcenterIp.
   */
  com.google.protobuf.ByteString getVcenterIpBytes();

  /**
   *
   *
   * <pre>
   * The thumbprint representing the certificate for the vcenter.
   * </pre>
   *
   * <code>string thumbprint = 4;</code>
   *
   * @return The thumbprint.
   */
  java.lang.String getThumbprint();

  /**
   *
   *
   * <pre>
   * The thumbprint representing the certificate for the vcenter.
   * </pre>
   *
   * <code>string thumbprint = 4;</code>
   *
   * @return The bytes for thumbprint.
   */
  com.google.protobuf.ByteString getThumbprintBytes();
}
