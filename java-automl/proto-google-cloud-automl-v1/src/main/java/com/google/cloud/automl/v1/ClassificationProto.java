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
// source: google/cloud/automl/v1/classification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

public final class ClassificationProto {
  private ClassificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfidenceMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_Row_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_Row_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "+google/cloud/automl/v1/classification.proto\022\026google.cloud.automl.v1\")\n"
          + "\030ClassificationAnnotation\022\r\n"
          + "\005score\030\001 \001(\002\"\201\007\n"
          + "\037ClassificationEvaluationMetrics\022\016\n"
          + "\006au_prc\030\001 \001(\002\022\016\n"
          + "\006au_roc\030\006 \001(\002\022\020\n"
          + "\010log_loss\030\007 \001(\002\022p\n"
          + "\030confidence_metrics_entry\030\003 \003(\0132N.googl"
          + "e.cloud.automl.v1.ClassificationEvaluationMetrics.ConfidenceMetricsEntry\022a\n"
          + "\020confusion_matrix\030\004 \001(\0132G.google.cloud.automl"
          + ".v1.ClassificationEvaluationMetrics.ConfusionMatrix\022\032\n"
          + "\022annotation_spec_id\030\005 \003(\t\032\374\002\n"
          + "\026ConfidenceMetricsEntry\022\034\n"
          + "\024confidence_threshold\030\001 \001(\002\022\032\n"
          + "\022position_threshold\030\016 \001(\005\022\016\n"
          + "\006recall\030\002 \001(\002\022\021\n"
          + "\tprecision\030\003 \001(\002\022\033\n"
          + "\023false_positive_rate\030\010 \001(\002\022\020\n"
          + "\010f1_score\030\004 \001(\002\022\022\n\n"
          + "recall_at1\030\005 \001(\002\022\025\n\r"
          + "precision_at1\030\006 \001(\002\022\037\n"
          + "\027false_positive_rate_at1\030\t \001(\002\022\024\n"
          + "\014f1_score_at1\030\007 \001(\002\022\033\n"
          + "\023true_positive_count\030\n"
          + " \001(\003\022\034\n"
          + "\024false_positive_count\030\013 \001(\003\022\034\n"
          + "\024false_negative_count\030\014 \001(\003\022\033\n"
          + "\023true_negative_count\030\r"
          + " \001(\003\032\273\001\n"
          + "\017ConfusionMatrix\022\032\n"
          + "\022annotation_spec_id\030\001 \003(\t\022\024\n"
          + "\014display_name\030\003 \003(\t\022X\n"
          + "\003row\030\002 \003(\0132K.google.cloud"
          + ".automl.v1.ClassificationEvaluationMetrics.ConfusionMatrix.Row\032\034\n"
          + "\003Row\022\025\n\r"
          + "example_count\030\001 \003(\005*Y\n"
          + "\022ClassificationType\022#\n"
          + "\037CLASSIFICATION_TYPE_UNSPECIFIED\020\000\022\016\n\n"
          + "MULTICLASS\020\001\022\016\n\n"
          + "MULTILABEL\020\002B\265\001\n"
          + "\032com.google.cloud.automl.v1B\023ClassificationProtoP\001Z2c"
          + "loud.google.com/go/automl/apiv1/automlpb"
          + ";automlpb\252\002\026Google.Cloud.AutoML.V1\312\002\026Goo"
          + "gle\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_ClassificationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ClassificationAnnotation_descriptor,
            new java.lang.String[] {
              "Score",
            });
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "AuPrc",
              "AuRoc",
              "LogLoss",
              "ConfidenceMetricsEntry",
              "ConfusionMatrix",
              "AnnotationSpecId",
            });
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfidenceMetricsEntry_descriptor =
        internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfidenceMetricsEntry_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold",
              "PositionThreshold",
              "Recall",
              "Precision",
              "FalsePositiveRate",
              "F1Score",
              "RecallAt1",
              "PrecisionAt1",
              "FalsePositiveRateAt1",
              "F1ScoreAt1",
              "TruePositiveCount",
              "FalsePositiveCount",
              "FalseNegativeCount",
              "TrueNegativeCount",
            });
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_descriptor =
        internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_descriptor,
            new java.lang.String[] {
              "AnnotationSpecId", "DisplayName", "Row",
            });
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_Row_descriptor =
        internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_Row_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_ClassificationEvaluationMetrics_ConfusionMatrix_Row_descriptor,
            new java.lang.String[] {
              "ExampleCount",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
