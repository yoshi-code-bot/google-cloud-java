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
// source: google/cloud/aiplatform/v1/schema/predict/instance/image_object_detection.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1.schema.predict.instance;

public final class ImageObjectDetectionPredictionInstanceProto {
  private ImageObjectDetectionPredictionInstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/cloud/aiplatform/v1/schema/pred"
          + "ict/instance/image_object_detection.prot"
          + "o\0222google.cloud.aiplatform.v1.schema.pre"
          + "dict.instance\"L\n&ImageObjectDetectionPre"
          + "dictionInstance\022\017\n\007content\030\001 \001(\t\022\021\n\tmime"
          + "_type\030\002 \001(\tB\340\002\n6com.google.cloud.aiplatf"
          + "orm.v1.schema.predict.instanceB+ImageObj"
          + "ectDetectionPredictionInstanceProtoP\001ZRc"
          + "loud.google.com/go/aiplatform/apiv1/sche"
          + "ma/predict/instance/instancepb;instancep"
          + "b\252\0022Google.Cloud.AIPlatform.V1.Schema.Pr"
          + "edict.Instance\312\0022Google\\Cloud\\AIPlatform"
          + "\\V1\\Schema\\Predict\\Instance\352\0028Google::Cl"
          + "oud::AIPlatform::V1::Schema::Predict::In"
          + "stanceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageObjectDetectionPredictionInstance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_predict_instance_ImageObjectDetectionPredictionInstance_descriptor,
            new java.lang.String[] {
              "Content", "MimeType",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
