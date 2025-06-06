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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/classification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class ClassificationPredictionResultProto {
  private ClassificationPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/classification.proto"
          + "\0229google.cloud.aiplatform.v1beta1.schema"
          + ".predict.prediction\"Y\n\036ClassificationPre"
          + "dictionResult\022\013\n\003ids\030\001 \003(\003\022\025\n\rdisplay_na"
          + "mes\030\002 \003(\t\022\023\n\013confidences\030\003 \003(\002B\377\002\n=com.g"
          + "oogle.cloud.aiplatform.v1beta1.schema.pr"
          + "edict.predictionB#ClassificationPredicti"
          + "onResultProtoP\001Z]cloud.google.com/go/aip"
          + "latform/apiv1beta1/schema/predict/predic"
          + "tion/predictionpb;predictionpb\252\0029Google."
          + "Cloud.AIPlatform.V1Beta1.Schema.Predict."
          + "Prediction\312\0029Google\\Cloud\\AIPlatform\\V1b"
          + "eta1\\Schema\\Predict\\Prediction\352\002?Google:"
          + ":Cloud::AIPlatform::V1beta1::Schema::Pre"
          + "dict::Predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_ClassificationPredictionResult_descriptor,
            new java.lang.String[] {
              "Ids", "DisplayNames", "Confidences",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
