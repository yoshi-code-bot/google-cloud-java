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
// source: google/cloud/documentai/v1/document_io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1;

public final class DocumentIoProto {
  private DocumentIoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_RawDocument_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_RawDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_GcsDocument_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsDocuments_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_OcrConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_OcrConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_OcrConfig_Hints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_OcrConfig_Hints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_OcrConfig_PremiumFeatures_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_OcrConfig_PremiumFeatures_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/documentai/v1/document_io"
          + ".proto\022\032google.cloud.documentai.v1\032 goog"
          + "le/protobuf/field_mask.proto\"G\n\013RawDocum"
          + "ent\022\017\n\007content\030\001 \001(\014\022\021\n\tmime_type\030\002 \001(\t\022"
          + "\024\n\014display_name\030\003 \001(\t\"1\n\013GcsDocument\022\017\n\007"
          + "gcs_uri\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\"J\n\014GcsD"
          + "ocuments\022:\n\tdocuments\030\001 \003(\0132\'.google.clo"
          + "ud.documentai.v1.GcsDocument\"#\n\tGcsPrefi"
          + "x\022\026\n\016gcs_uri_prefix\030\001 \001(\t\"\245\001\n\031BatchDocum"
          + "entsInputConfig\022;\n\ngcs_prefix\030\001 \001(\0132%.go"
          + "ogle.cloud.documentai.v1.GcsPrefixH\000\022A\n\r"
          + "gcs_documents\030\002 \001(\0132(.google.cloud.docum"
          + "entai.v1.GcsDocumentsH\000B\010\n\006source\"\205\003\n\024Do"
          + "cumentOutputConfig\022]\n\021gcs_output_config\030"
          + "\001 \001(\0132@.google.cloud.documentai.v1.Docum"
          + "entOutputConfig.GcsOutputConfigH\000\032\376\001\n\017Gc"
          + "sOutputConfig\022\017\n\007gcs_uri\030\001 \001(\t\022.\n\nfield_"
          + "mask\030\002 \001(\0132\032.google.protobuf.FieldMask\022h"
          + "\n\017sharding_config\030\003 \001(\0132O.google.cloud.d"
          + "ocumentai.v1.DocumentOutputConfig.GcsOut"
          + "putConfig.ShardingConfig\032@\n\016ShardingConf"
          + "ig\022\027\n\017pages_per_shard\030\001 \001(\005\022\025\n\rpages_ove"
          + "rlap\030\002 \001(\005B\r\n\013destination\"\362\003\n\tOcrConfig\022"
          + ":\n\005hints\030\002 \001(\0132+.google.cloud.documentai"
          + ".v1.OcrConfig.Hints\022!\n\031enable_native_pdf"
          + "_parsing\030\003 \001(\010\022#\n\033enable_image_quality_s"
          + "cores\030\004 \001(\010\022\034\n\024advanced_ocr_options\030\005 \003("
          + "\t\022\025\n\renable_symbol\030\006 \001(\010\022\036\n\022compute_styl"
          + "e_info\030\010 \001(\010B\002\030\001\022)\n!disable_character_bo"
          + "xes_detection\030\n \001(\010\022O\n\020premium_features\030"
          + "\013 \001(\01325.google.cloud.documentai.v1.OcrCo"
          + "nfig.PremiumFeatures\032\037\n\005Hints\022\026\n\016languag"
          + "e_hints\030\001 \003(\t\032o\n\017PremiumFeatures\022\'\n\037enab"
          + "le_selection_mark_detection\030\003 \001(\010\022\032\n\022com"
          + "pute_style_info\030\004 \001(\010\022\027\n\017enable_math_ocr"
          + "\030\005 \001(\010B\315\001\n\036com.google.cloud.documentai.v"
          + "1B\017DocumentIoProtoP\001Z>cloud.google.com/g"
          + "o/documentai/apiv1/documentaipb;document"
          + "aipb\252\002\032Google.Cloud.DocumentAI.V1\312\002\032Goog"
          + "le\\Cloud\\DocumentAI\\V1\352\002\035Google::Cloud::"
          + "DocumentAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1_RawDocument_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_RawDocument_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_RawDocument_descriptor,
            new java.lang.String[] {
              "Content", "MimeType", "DisplayName",
            });
    internal_static_google_cloud_documentai_v1_GcsDocument_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1_GcsDocument_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_GcsDocument_descriptor,
            new java.lang.String[] {
              "GcsUri", "MimeType",
            });
    internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1_GcsDocuments_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_GcsDocuments_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1_GcsPrefix_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_GcsPrefix_descriptor,
            new java.lang.String[] {
              "GcsUriPrefix",
            });
    internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_BatchDocumentsInputConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "GcsDocuments", "Source",
            });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsOutputConfig", "Destination",
            });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentOutputConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsUri", "FieldMask", "ShardingConfig",
            });
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor =
        internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_DocumentOutputConfig_GcsOutputConfig_ShardingConfig_descriptor,
            new java.lang.String[] {
              "PagesPerShard", "PagesOverlap",
            });
    internal_static_google_cloud_documentai_v1_OcrConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_documentai_v1_OcrConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_OcrConfig_descriptor,
            new java.lang.String[] {
              "Hints",
              "EnableNativePdfParsing",
              "EnableImageQualityScores",
              "AdvancedOcrOptions",
              "EnableSymbol",
              "ComputeStyleInfo",
              "DisableCharacterBoxesDetection",
              "PremiumFeatures",
            });
    internal_static_google_cloud_documentai_v1_OcrConfig_Hints_descriptor =
        internal_static_google_cloud_documentai_v1_OcrConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_documentai_v1_OcrConfig_Hints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_OcrConfig_Hints_descriptor,
            new java.lang.String[] {
              "LanguageHints",
            });
    internal_static_google_cloud_documentai_v1_OcrConfig_PremiumFeatures_descriptor =
        internal_static_google_cloud_documentai_v1_OcrConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_documentai_v1_OcrConfig_PremiumFeatures_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_OcrConfig_PremiumFeatures_descriptor,
            new java.lang.String[] {
              "EnableSelectionMarkDetection", "ComputeStyleInfo", "EnableMathOcr",
            });
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
