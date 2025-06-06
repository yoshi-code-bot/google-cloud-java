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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface GuestOsDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GuestOsDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the operating system.
   * </pre>
   *
   * <code>string os_name = 1;</code>
   *
   * @return The osName.
   */
  java.lang.String getOsName();

  /**
   *
   *
   * <pre>
   * The name of the operating system.
   * </pre>
   *
   * <code>string os_name = 1;</code>
   *
   * @return The bytes for osName.
   */
  com.google.protobuf.ByteString getOsNameBytes();

  /**
   *
   *
   * <pre>
   * What family the OS belong to, if known.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.OperatingSystemFamily family = 2;</code>
   *
   * @return The enum numeric value on the wire for family.
   */
  int getFamilyValue();

  /**
   *
   *
   * <pre>
   * What family the OS belong to, if known.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.OperatingSystemFamily family = 2;</code>
   *
   * @return The family.
   */
  com.google.cloud.migrationcenter.v1.OperatingSystemFamily getFamily();

  /**
   *
   *
   * <pre>
   * The version of the operating system.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * The version of the operating system.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * OS and app configuration.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestConfigDetails config = 4;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();

  /**
   *
   *
   * <pre>
   * OS and app configuration.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestConfigDetails config = 4;</code>
   *
   * @return The config.
   */
  com.google.cloud.migrationcenter.v1.GuestConfigDetails getConfig();

  /**
   *
   *
   * <pre>
   * OS and app configuration.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestConfigDetails config = 4;</code>
   */
  com.google.cloud.migrationcenter.v1.GuestConfigDetailsOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Runtime information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestRuntimeDetails runtime = 5;</code>
   *
   * @return Whether the runtime field is set.
   */
  boolean hasRuntime();

  /**
   *
   *
   * <pre>
   * Runtime information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestRuntimeDetails runtime = 5;</code>
   *
   * @return The runtime.
   */
  com.google.cloud.migrationcenter.v1.GuestRuntimeDetails getRuntime();

  /**
   *
   *
   * <pre>
   * Runtime information.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.GuestRuntimeDetails runtime = 5;</code>
   */
  com.google.cloud.migrationcenter.v1.GuestRuntimeDetailsOrBuilder getRuntimeOrBuilder();
}
