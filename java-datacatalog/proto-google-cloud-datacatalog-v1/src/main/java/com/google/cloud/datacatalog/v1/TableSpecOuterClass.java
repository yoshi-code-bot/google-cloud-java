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
// source: google/cloud/datacatalog/v1/table_spec.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

public final class TableSpecOuterClass {
  private TableSpecOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_BigQueryTableSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_BigQueryTableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_ViewSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ViewSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_TableSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_TableSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/datacatalog/v1/table_spec"
          + ".proto\022\033google.cloud.datacatalog.v1\032\037goo"
          + "gle/api/field_behavior.proto\032\031google/api"
          + "/resource.proto\"\350\001\n\021BigQueryTableSpec\022L\n"
          + "\021table_source_type\030\001 \001(\0162,.google.cloud."
          + "datacatalog.v1.TableSourceTypeB\003\340A\003\022:\n\tv"
          + "iew_spec\030\002 \001(\0132%.google.cloud.datacatalo"
          + "g.v1.ViewSpecH\000\022<\n\ntable_spec\030\003 \001(\0132&.go"
          + "ogle.cloud.datacatalog.v1.TableSpecH\000B\013\n"
          + "\ttype_spec\"#\n\010ViewSpec\022\027\n\nview_query\030\001 \001"
          + "(\tB\003\340A\003\"L\n\tTableSpec\022?\n\rgrouped_entry\030\001 "
          + "\001(\tB(\340A\003\372A\"\n datacatalog.googleapis.com/"
          + "Entry\"\255\001\n\027BigQueryDateShardedSpec\0229\n\007dat"
          + "aset\030\001 \001(\tB(\340A\003\372A\"\n datacatalog.googleap"
          + "is.com/Entry\022\031\n\014table_prefix\030\002 \001(\tB\003\340A\003\022"
          + "\030\n\013shard_count\030\003 \001(\003B\003\340A\003\022\"\n\025latest_shar"
          + "d_resource\030\004 \001(\tB\003\340A\003*{\n\017TableSourceType"
          + "\022!\n\035TABLE_SOURCE_TYPE_UNSPECIFIED\020\000\022\021\n\rB"
          + "IGQUERY_VIEW\020\002\022\022\n\016BIGQUERY_TABLE\020\005\022\036\n\032BI"
          + "GQUERY_MATERIALIZED_VIEW\020\007B\303\001\n\037com.googl"
          + "e.cloud.datacatalog.v1P\001ZAcloud.google.c"
          + "om/go/datacatalog/apiv1/datacatalogpb;da"
          + "tacatalogpb\252\002\033Google.Cloud.DataCatalog.V"
          + "1\312\002\033Google\\Cloud\\DataCatalog\\V1\352\002\036Google"
          + "::Cloud::DataCatalog::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1_BigQueryTableSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_BigQueryTableSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_BigQueryTableSpec_descriptor,
            new java.lang.String[] {
              "TableSourceType", "ViewSpec", "TableSpec", "TypeSpec",
            });
    internal_static_google_cloud_datacatalog_v1_ViewSpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_ViewSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_ViewSpec_descriptor,
            new java.lang.String[] {
              "ViewQuery",
            });
    internal_static_google_cloud_datacatalog_v1_TableSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_TableSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_TableSpec_descriptor,
            new java.lang.String[] {
              "GroupedEntry",
            });
    internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1_BigQueryDateShardedSpec_descriptor,
            new java.lang.String[] {
              "Dataset", "TablePrefix", "ShardCount", "LatestShardResource",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
