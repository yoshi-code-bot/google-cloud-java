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
// source: google/cloud/alloydb/v1beta/csql_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1beta;

public final class CsqlResourcesProto {
  private CsqlResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_alloydb_v1beta_CloudSQLBackupRunSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_alloydb_v1beta_CloudSQLBackupRunSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/alloydb/v1beta/csql_resou"
          + "rces.proto\022\033google.cloud.alloydb.v1beta\032"
          + "\037google/api/field_behavior.proto\"`\n\027Clou"
          + "dSQLBackupRunSource\022\017\n\007project\030\001 \001(\t\022\030\n\013"
          + "instance_id\030\002 \001(\tB\003\340A\002\022\032\n\rbackup_run_id\030"
          + "\003 \001(\003B\003\340A\002B\317\001\n\037com.google.cloud.alloydb."
          + "v1betaB\022CsqlResourcesProtoP\001Z9cloud.goog"
          + "le.com/go/alloydb/apiv1beta/alloydbpb;al"
          + "loydbpb\252\002\033Google.Cloud.AlloyDb.V1Beta\312\002\033"
          + "Google\\Cloud\\AlloyDb\\V1beta\352\002\036Google::Cl"
          + "oud::AlloyDB::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_alloydb_v1beta_CloudSQLBackupRunSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_alloydb_v1beta_CloudSQLBackupRunSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_alloydb_v1beta_CloudSQLBackupRunSource_descriptor,
            new java.lang.String[] {
              "Project", "InstanceId", "BackupRunId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
