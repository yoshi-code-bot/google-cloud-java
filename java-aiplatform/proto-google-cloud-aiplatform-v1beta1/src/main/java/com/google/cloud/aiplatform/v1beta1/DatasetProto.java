/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/dataset.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DatasetProto {
  private DatasetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Dataset_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Dataset_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_DataItemLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExportDataConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/aiplatform/v1beta1/datase"
          + "t.proto\022\037google.cloud.aiplatform.v1beta1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0325google/cloud/aipla"
          + "tform/v1beta1/encryption_spec.proto\032(goo"
          + "gle/cloud/aiplatform/v1beta1/io.proto\032\034g"
          + "oogle/protobuf/struct.proto\032\037google/prot"
          + "obuf/timestamp.proto\"\277\004\n\007Dataset\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\030"
          + "\n\013description\030\020 \001(\tB\003\340A\001\022 \n\023metadata_sch"
          + "ema_uri\030\003 \001(\tB\003\340A\002\022-\n\010metadata\030\010 \001(\0132\026.g"
          + "oogle.protobuf.ValueB\003\340A\002\0224\n\013create_time"
          + "\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "4\n\013update_time\030\005 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\022\014\n\004etag\030\006 \001(\t\022D\n\006labels\030\007 "
          + "\003(\01324.google.cloud.aiplatform.v1beta1.Da"
          + "taset.LabelsEntry\022H\n\017encryption_spec\030\013 \001"
          + "(\0132/.google.cloud.aiplatform.v1beta1.Enc"
          + "ryptionSpec\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001:b\352A_\n!aiplatform.goog"
          + "leapis.com/Dataset\022:projects/{project}/l"
          + "ocations/{location}/datasets/{dataset}\"\226"
          + "\002\n\020ImportDataConfig\022@\n\ngcs_source\030\001 \001(\0132"
          + "*.google.cloud.aiplatform.v1beta1.GcsSou"
          + "rceH\000\022_\n\020data_item_labels\030\002 \003(\0132E.google"
          + ".cloud.aiplatform.v1beta1.ImportDataConf"
          + "ig.DataItemLabelsEntry\022\036\n\021import_schema_"
          + "uri\030\004 \001(\tB\003\340A\002\0325\n\023DataItemLabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\010\n\006source\""
          + "\211\001\n\020ExportDataConfig\022J\n\017gcs_destination\030"
          + "\001 \001(\0132/.google.cloud.aiplatform.v1beta1."
          + "GcsDestinationH\000\022\032\n\022annotations_filter\030\002"
          + " \001(\tB\r\n\013destinationB\351\001\n#com.google.cloud"
          + ".aiplatform.v1beta1B\014DatasetProtoP\001ZIgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/aiplatform/v1beta1;aiplatform\252\002\037Google."
          + "Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\"
          + "AIPlatform\\V1beta1\352\002\"Google::Cloud::AIPl"
          + "atform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Dataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Dataset_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Dataset_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Dataset_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "DataItemLabels", "ImportSchemaUri", "Source",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_DataItemLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ImportDataConfig_DataItemLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ExportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "AnnotationsFilter", "Destination",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}