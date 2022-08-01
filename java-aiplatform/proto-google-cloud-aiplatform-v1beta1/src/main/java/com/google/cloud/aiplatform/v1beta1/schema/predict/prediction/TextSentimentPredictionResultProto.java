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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/text_sentiment.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class TextSentimentPredictionResultProto {
  private TextSentimentPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextSentimentPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextSentimentPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/text_sentiment.proto"
          + "\0229google.cloud.aiplatform.v1beta1.schema"
          + ".predict.prediction\032\034google/api/annotati"
          + "ons.proto\"2\n\035TextSentimentPredictionResu"
          + "lt\022\021\n\tsentiment\030\001 \001(\005B\204\003\n=com.google.clo"
          + "ud.aiplatform.v1beta1.schema.predict.pre"
          + "dictionB\"TextSentimentPredictionResultPr"
          + "otoP\001Zcgoogle.golang.org/genproto/google"
          + "apis/cloud/aiplatform/v1beta1/schema/pre"
          + "dict/prediction;prediction\252\0029Google.Clou"
          + "d.AIPlatform.V1Beta1.Schema.Predict.Pred"
          + "iction\312\0029Google\\Cloud\\AIPlatform\\V1beta1"
          + "\\Schema\\Predict\\Prediction\352\002?Google::Clo"
          + "ud::AIPlatform::V1beta1::Schema::Predict"
          + "::Predictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextSentimentPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextSentimentPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextSentimentPredictionResult_descriptor,
            new java.lang.String[] {
              "Sentiment",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}