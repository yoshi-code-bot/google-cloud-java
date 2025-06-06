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
// source: google/cloud/aiplatform/v1/data_item.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class DataItemProto {
  private DataItemProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DataItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DataItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DataItem_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DataItem_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "*google/cloud/aiplatform/v1/data_item.p"
          + "roto\022\032google.cloud.aiplatform.v1\032\037google"
          + "/api/field_behavior.proto\032\031google/api/re"
          + "source.proto\032\034google/protobuf/struct.proto\032\037google/protobuf/timestamp.proto\"\363\003\n"
          + "\010DataItem\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022E\n"
          + "\006labels\030\003 \003(\01320.google"
          + ".cloud.aiplatform.v1.DataItem.LabelsEntryB\003\340A\001\022,\n"
          + "\007payload\030\004 \001(\0132\026.google.protobuf.ValueB\003\340A\002\022\021\n"
          + "\004etag\030\007 \001(\tB\003\340A\001\022\032\n\r"
          + "satisfies_pzs\030\n"
          + " \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\013 \001(\010B\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:y\352Av\n"
          + "\"aiplatform.googleapis.com/DataItem\022Pprojects/{project}/loca"
          + "tions/{location}/datasets/{dataset}/dataItems/{data_item}B\313\001\n"
          + "\036com.google.cloud.aiplatform.v1B\r"
          + "DataItemProtoP\001Z>cloud.google.com/go/aiplatform/apiv1/aiplatformpb"
          + ";aiplatformpb\252\002\032Google.Cloud.AIPlatform."
          + "V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google"
          + "::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_DataItem_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_DataItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DataItem_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Payload",
              "Etag",
              "SatisfiesPzs",
              "SatisfiesPzi",
            });
    internal_static_google_cloud_aiplatform_v1_DataItem_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_DataItem_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_DataItem_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DataItem_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
