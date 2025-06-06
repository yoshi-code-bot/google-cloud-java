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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

public interface SkaffoldVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.SkaffoldVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Release version number. For example, "1.20.3".
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   *
   * @return Whether the maintenanceModeTime field is set.
   */
  boolean hasMaintenanceModeTime();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   *
   * @return The maintenanceModeTime.
   */
  com.google.protobuf.Timestamp getMaintenanceModeTime();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will enter maintenance mode.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp maintenance_mode_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMaintenanceModeTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   *
   * @return Whether the supportExpirationTime field is set.
   */
  boolean hasSupportExpirationTime();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   *
   * @return The supportExpirationTime.
   */
  com.google.protobuf.Timestamp getSupportExpirationTime();

  /**
   *
   *
   * <pre>
   * The time at which this version of Skaffold will no longer be supported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp support_expiration_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSupportExpirationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   *
   * @return Whether the supportEndDate field is set.
   */
  boolean hasSupportEndDate();

  /**
   *
   *
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   *
   * @return The supportEndDate.
   */
  com.google.type.Date getSupportEndDate();

  /**
   *
   *
   * <pre>
   * Date when this version is expected to no longer be supported.
   * </pre>
   *
   * <code>.google.type.Date support_end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getSupportEndDateOrBuilder();
}
