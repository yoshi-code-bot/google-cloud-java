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
// source: google/cloud/backupdr/v1/backupvault.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface BackupApplianceBackupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.BackupApplianceBackupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the backup appliance.
   * </pre>
   *
   * <code>string backup_appliance_name = 1;</code>
   *
   * @return The backupApplianceName.
   */
  java.lang.String getBackupApplianceName();

  /**
   *
   *
   * <pre>
   * The name of the backup appliance.
   * </pre>
   *
   * <code>string backup_appliance_name = 1;</code>
   *
   * @return The bytes for backupApplianceName.
   */
  com.google.protobuf.ByteString getBackupApplianceNameBytes();

  /**
   *
   *
   * <pre>
   * The ID of the backup appliance.
   * </pre>
   *
   * <code>int64 backup_appliance_id = 2;</code>
   *
   * @return The backupApplianceId.
   */
  long getBackupApplianceId();

  /**
   *
   *
   * <pre>
   * The ID of the SLA of this application.
   * </pre>
   *
   * <code>int64 sla_id = 3;</code>
   *
   * @return The slaId.
   */
  long getSlaId();

  /**
   *
   *
   * <pre>
   * The name of the application.
   * </pre>
   *
   * <code>string application_name = 4;</code>
   *
   * @return The applicationName.
   */
  java.lang.String getApplicationName();

  /**
   *
   *
   * <pre>
   * The name of the application.
   * </pre>
   *
   * <code>string application_name = 4;</code>
   *
   * @return The bytes for applicationName.
   */
  com.google.protobuf.ByteString getApplicationNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the host where the application is running.
   * </pre>
   *
   * <code>string host_name = 5;</code>
   *
   * @return The hostName.
   */
  java.lang.String getHostName();

  /**
   *
   *
   * <pre>
   * The name of the host where the application is running.
   * </pre>
   *
   * <code>string host_name = 5;</code>
   *
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString getHostNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the SLT associated with the application.
   * </pre>
   *
   * <code>string slt_name = 6;</code>
   *
   * @return The sltName.
   */
  java.lang.String getSltName();

  /**
   *
   *
   * <pre>
   * The name of the SLT associated with the application.
   * </pre>
   *
   * <code>string slt_name = 6;</code>
   *
   * @return The bytes for sltName.
   */
  com.google.protobuf.ByteString getSltNameBytes();

  /**
   *
   *
   * <pre>
   * The name of the SLP associated with the application.
   * </pre>
   *
   * <code>string slp_name = 7;</code>
   *
   * @return The slpName.
   */
  java.lang.String getSlpName();

  /**
   *
   *
   * <pre>
   * The name of the SLP associated with the application.
   * </pre>
   *
   * <code>string slp_name = 7;</code>
   *
   * @return The bytes for slpName.
   */
  com.google.protobuf.ByteString getSlpNameBytes();
}
