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
// source: google/cloud/datacatalog/v1beta1/usage.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public final class Usage {
  private Usage() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_UsageStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_UsageStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/datacatalog/v1beta1/usage"
          + ".proto\022 google.cloud.datacatalog.v1beta1"
          + "\032\037google/protobuf/timestamp.proto\"\221\001\n\nUs"
          + "ageStats\022\031\n\021total_completions\030\001 \001(\002\022\026\n\016t"
          + "otal_failures\030\002 \001(\002\022\033\n\023total_cancellatio"
          + "ns\030\003 \001(\002\0223\n+total_execution_time_for_com"
          + "pletions_millis\030\004 \001(\002\"\223\002\n\013UsageSignal\022/\n"
          + "\013update_time\030\001 \001(\0132\032.google.protobuf.Tim"
          + "estamp\022h\n\027usage_within_time_range\030\002 \003(\0132"
          + "G.google.cloud.datacatalog.v1beta1.Usage"
          + "Signal.UsageWithinTimeRangeEntry\032i\n\031Usag"
          + "eWithinTimeRangeEntry\022\013\n\003key\030\001 \001(\t\022;\n\005va"
          + "lue\030\002 \001(\0132,.google.cloud.datacatalog.v1b"
          + "eta1.UsageStats:\0028\001B\334\001\n$com.google.cloud"
          + ".datacatalog.v1beta1P\001ZFcloud.google.com"
          + "/go/datacatalog/apiv1beta1/datacatalogpb"
          + ";datacatalogpb\252\002 Google.Cloud.DataCatalo"
          + "g.V1Beta1\312\002 Google\\Cloud\\DataCatalog\\V1b"
          + "eta1\352\002#Google::Cloud::DataCatalog::V1bet"
          + "a1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1beta1_UsageStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_UsageStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_UsageStats_descriptor,
            new java.lang.String[] {
              "TotalCompletions",
              "TotalFailures",
              "TotalCancellations",
              "TotalExecutionTimeForCompletionsMillis",
            });
    internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor,
            new java.lang.String[] {
              "UpdateTime", "UsageWithinTimeRange",
            });
    internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_descriptor =
        internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_UsageSignal_UsageWithinTimeRangeEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
