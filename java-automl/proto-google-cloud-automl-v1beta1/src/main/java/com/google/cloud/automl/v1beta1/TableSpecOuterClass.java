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
// source: google/cloud/automl/v1beta1/table_spec.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class TableSpecOuterClass {
  private TableSpecOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TableSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TableSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/automl/v1beta1/table_spec"
          + ".proto\022\033google.cloud.automl.v1beta1\032\031goo"
          + "gle/api/resource.proto\032$google/cloud/aut"
          + "oml/v1beta1/io.proto\"\301\002\n\tTableSpec\022\014\n\004na"
          + "me\030\001 \001(\t\022\033\n\023time_column_spec_id\030\002 \001(\t\022\021\n"
          + "\trow_count\030\003 \001(\003\022\027\n\017valid_row_count\030\004 \001("
          + "\003\022\024\n\014column_count\030\007 \001(\003\022?\n\rinput_configs"
          + "\030\005 \003(\0132(.google.cloud.automl.v1beta1.Inp"
          + "utConfig\022\014\n\004etag\030\006 \001(\t:x\352Au\n\037automl.goog"
          + "leapis.com/TableSpec\022Rprojects/{project}"
          + "/locations/{location}/datasets/{dataset}"
          + "/tableSpecs/{table_spec}B\233\001\n\037com.google."
          + "cloud.automl.v1beta1P\001Z7cloud.google.com"
          + "/go/automl/apiv1beta1/automlpb;automlpb\312"
          + "\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::"
          + "Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Io.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TableSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TableSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TableSpec_descriptor,
            new java.lang.String[] {
              "Name",
              "TimeColumnSpecId",
              "RowCount",
              "ValidRowCount",
              "ColumnCount",
              "InputConfigs",
              "Etag",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Io.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
