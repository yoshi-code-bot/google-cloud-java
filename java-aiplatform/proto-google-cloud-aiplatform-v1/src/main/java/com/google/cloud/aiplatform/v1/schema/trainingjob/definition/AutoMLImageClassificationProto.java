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
// source:
// google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_classification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public final class AutoMLImageClassificationProto {
  private AutoMLImageClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nZgoogle/cloud/aiplatform/v1/schema/trai"
          + "ningjob/definition/automl_image_classifi"
          + "cation.proto\0228google.cloud.aiplatform.v1"
          + ".schema.trainingjob.definition\"\365\001\n\031AutoM"
          + "lImageClassification\022i\n\006inputs\030\001 \001(\0132Y.g"
          + "oogle.cloud.aiplatform.v1.schema.trainin"
          + "gjob.definition.AutoMlImageClassificatio"
          + "nInputs\022m\n\010metadata\030\002 \001(\0132[.google.cloud"
          + ".aiplatform.v1.schema.trainingjob.defini"
          + "tion.AutoMlImageClassificationMetadata\"\223"
          + "\003\n\037AutoMlImageClassificationInputs\022w\n\nmo"
          + "del_type\030\001 \001(\0162c.google.cloud.aiplatform"
          + ".v1.schema.trainingjob.definition.AutoMl"
          + "ImageClassificationInputs.ModelType\022\025\n\rb"
          + "ase_model_id\030\002 \001(\t\022\037\n\027budget_milli_node_"
          + "hours\030\003 \001(\003\022\036\n\026disable_early_stopping\030\004 "
          + "\001(\010\022\023\n\013multi_label\030\005 \001(\010\"\211\001\n\tModelType\022\032"
          + "\n\026MODEL_TYPE_UNSPECIFIED\020\000\022\t\n\005CLOUD\020\001\022\033\n"
          + "\027MOBILE_TF_LOW_LATENCY_1\020\002\022\031\n\025MOBILE_TF_"
          + "VERSATILE_1\020\003\022\035\n\031MOBILE_TF_HIGH_ACCURACY"
          + "_1\020\004\"\276\002\n!AutoMlImageClassificationMetada"
          + "ta\022\035\n\025cost_milli_node_hours\030\001 \001(\003\022\220\001\n\026su"
          + "ccessful_stop_reason\030\002 \001(\0162p.google.clou"
          + "d.aiplatform.v1.schema.trainingjob.defin"
          + "ition.AutoMlImageClassificationMetadata."
          + "SuccessfulStopReason\"g\n\024SuccessfulStopRe"
          + "ason\022&\n\"SUCCESSFUL_STOP_REASON_UNSPECIFI"
          + "ED\020\000\022\022\n\016BUDGET_REACHED\020\001\022\023\n\017MODEL_CONVER"
          + "GED\020\002B\365\002\n<com.google.cloud.aiplatform.v1"
          + ".schema.trainingjob.definitionB\036AutoMLIm"
          + "ageClassificationProtoP\001Z\\cloud.google.c"
          + "om/go/aiplatform/apiv1/schema/trainingjo"
          + "b/definition/definitionpb;definitionpb\252\002"
          + "8Google.Cloud.AIPlatform.V1.Schema.Train"
          + "ingJob.Definition\312\0028Google\\Cloud\\AIPlatf"
          + "orm\\V1\\Schema\\TrainingJob\\Definition\352\002>G"
          + "oogle::Cloud::AIPlatform::V1::Schema::Tr"
          + "ainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassification_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassification_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationInputs_descriptor,
            new java.lang.String[] {
              "ModelType",
              "BaseModelId",
              "BudgetMilliNodeHours",
              "DisableEarlyStopping",
              "MultiLabel",
            });
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_schema_trainingjob_definition_AutoMlImageClassificationMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
