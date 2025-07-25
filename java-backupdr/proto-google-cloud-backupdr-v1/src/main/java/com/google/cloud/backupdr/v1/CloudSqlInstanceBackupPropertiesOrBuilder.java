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
// source: google/cloud/backupdr/v1/backupvault_cloudsql.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface CloudSqlInstanceBackupPropertiesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.CloudSqlInstanceBackupProperties)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The installed database version of the Cloud SQL instance
   * when the backup was taken.
   * </pre>
   *
   * <code>string database_installed_version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The databaseInstalledVersion.
   */
  java.lang.String getDatabaseInstalledVersion();

  /**
   *
   *
   * <pre>
   * Output only. The installed database version of the Cloud SQL instance
   * when the backup was taken.
   * </pre>
   *
   * <code>string database_installed_version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for databaseInstalledVersion.
   */
  com.google.protobuf.ByteString getDatabaseInstalledVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the backup is a final backup.
   * </pre>
   *
   * <code>bool final_backup = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The finalBackup.
   */
  boolean getFinalBackup();

  /**
   *
   *
   * <pre>
   * Output only. The source instance of the backup.
   * Format:
   * projects/{project}/instances/{instance}
   * </pre>
   *
   * <code>
   * string source_instance = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sourceInstance.
   */
  java.lang.String getSourceInstance();

  /**
   *
   *
   * <pre>
   * Output only. The source instance of the backup.
   * Format:
   * projects/{project}/instances/{instance}
   * </pre>
   *
   * <code>
   * string source_instance = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sourceInstance.
   */
  com.google.protobuf.ByteString getSourceInstanceBytes();

  /**
   *
   *
   * <pre>
   * Output only. The tier (or machine type) for this instance. Example:
   * `db-custom-1-3840`
   * </pre>
   *
   * <code>string instance_tier = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceTier.
   */
  java.lang.String getInstanceTier();

  /**
   *
   *
   * <pre>
   * Output only. The tier (or machine type) for this instance. Example:
   * `db-custom-1-3840`
   * </pre>
   *
   * <code>string instance_tier = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceTier.
   */
  com.google.protobuf.ByteString getInstanceTierBytes();
}
