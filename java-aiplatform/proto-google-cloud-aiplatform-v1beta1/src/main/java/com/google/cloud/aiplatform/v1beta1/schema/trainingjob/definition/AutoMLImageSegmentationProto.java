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
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_image_segmentation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public final class AutoMLImageSegmentationProto {
  private AutoMLImageSegmentationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n]google/cloud/aiplatform/v1beta1/schema"
          + "/trainingjob/definition/automl_image_seg"
          + "mentation.proto\022=google.cloud.aiplatform"
          + ".v1beta1.schema.trainingjob.definition\"\371"
          + "\001\n\027AutoMlImageSegmentation\022l\n\006inputs\030\001 \001"
          + "(\0132\\.google.cloud.aiplatform.v1beta1.sch"
          + "ema.trainingjob.definition.AutoMlImageSe"
          + "gmentationInputs\022p\n\010metadata\030\002 \001(\0132^.goo"
          + "gle.cloud.aiplatform.v1beta1.schema.trai"
          + "ningjob.definition.AutoMlImageSegmentati"
          + "onMetadata\"\316\002\n\035AutoMlImageSegmentationIn"
          + "puts\022z\n\nmodel_type\030\001 \001(\0162f.google.cloud."
          + "aiplatform.v1beta1.schema.trainingjob.de"
          + "finition.AutoMlImageSegmentationInputs.M"
          + "odelType\022\037\n\027budget_milli_node_hours\030\002 \001("
          + "\003\022\025\n\rbase_model_id\030\003 \001(\t\"y\n\tModelType\022\032\n"
          + "\026MODEL_TYPE_UNSPECIFIED\020\000\022\031\n\025CLOUD_HIGH_"
          + "ACCURACY_1\020\001\022\030\n\024CLOUD_LOW_ACCURACY_1\020\002\022\033"
          + "\n\027MOBILE_TF_LOW_LATENCY_1\020\003\"\277\002\n\037AutoMlIm"
          + "ageSegmentationMetadata\022\035\n\025cost_milli_no"
          + "de_hours\030\001 \001(\003\022\223\001\n\026successful_stop_reaso"
          + "n\030\002 \001(\0162s.google.cloud.aiplatform.v1beta"
          + "1.schema.trainingjob.definition.AutoMlIm"
          + "ageSegmentationMetadata.SuccessfulStopRe"
          + "ason\"g\n\024SuccessfulStopReason\022&\n\"SUCCESSF"
          + "UL_STOP_REASON_UNSPECIFIED\020\000\022\022\n\016BUDGET_R"
          + "EACHED\020\001\022\023\n\017MODEL_CONVERGED\020\002B\214\003\nAcom.go"
          + "ogle.cloud.aiplatform.v1beta1.schema.tra"
          + "iningjob.definitionB\034AutoMLImageSegmenta"
          + "tionProtoP\001Zacloud.google.com/go/aiplatf"
          + "orm/apiv1beta1/schema/trainingjob/defini"
          + "tion/definitionpb;definitionpb\252\002=Google."
          + "Cloud.AIPlatform.V1Beta1.Schema.Training"
          + "Job.Definition\312\002=Google\\Cloud\\AIPlatform"
          + "\\V1beta1\\Schema\\TrainingJob\\Definition\352\002"
          + "CGoogle::Cloud::AIPlatform::V1beta1::Sch"
          + "ema::TrainingJob::Definitionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentation_descriptor,
            new java.lang.String[] {
              "Inputs", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationInputs_descriptor,
            new java.lang.String[] {
              "ModelType", "BudgetMilliNodeHours", "BaseModelId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_trainingjob_definition_AutoMlImageSegmentationMetadata_descriptor,
            new java.lang.String[] {
              "CostMilliNodeHours", "SuccessfulStopReason",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
