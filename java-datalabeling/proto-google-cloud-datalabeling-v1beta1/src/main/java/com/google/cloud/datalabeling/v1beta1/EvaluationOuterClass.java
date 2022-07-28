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
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

package com.google.cloud.datalabeling.v1beta1;

public final class EvaluationOuterClass {
  private EvaluationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Evaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Evaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_PrCurve_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_PrCurve_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_PrCurve_ConfidenceMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_PrCurve_ConfidenceMetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_ConfusionMatrixEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_ConfusionMatrixEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_Row_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_Row_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/datalabeling/v1beta1/eval"
          + "uation.proto\022!google.cloud.datalabeling."
          + "v1beta1\032\034google/api/annotations.proto\032\031g"
          + "oogle/api/resource.proto\0322google/cloud/d"
          + "atalabeling/v1beta1/annotation.proto\032;go"
          + "ogle/cloud/datalabeling/v1beta1/annotati"
          + "on_spec_set.proto\032\037google/protobuf/times"
          + "tamp.proto\"\366\003\n\nEvaluation\022\014\n\004name\030\001 \001(\t\022"
          + "C\n\006config\030\002 \001(\01323.google.cloud.datalabel"
          + "ing.v1beta1.EvaluationConfig\022;\n\027evaluati"
          + "on_job_run_time\030\003 \001(\0132\032.google.protobuf."
          + "Timestamp\022/\n\013create_time\030\004 \001(\0132\032.google."
          + "protobuf.Timestamp\022P\n\022evaluation_metrics"
          + "\030\005 \001(\01324.google.cloud.datalabeling.v1bet"
          + "a1.EvaluationMetrics\022J\n\017annotation_type\030"
          + "\006 \001(\01621.google.cloud.datalabeling.v1beta"
          + "1.AnnotationType\022\034\n\024evaluated_item_count"
          + "\030\007 \001(\003:k\352Ah\n&datalabeling.googleapis.com"
          + "/Evaluation\022>projects/{project}/datasets"
          + "/{dataset}/evaluations/{evaluation}\"\221\001\n\020"
          + "EvaluationConfig\022j\n\037bounding_box_evaluat"
          + "ion_options\030\001 \001(\0132?.google.cloud.datalab"
          + "eling.v1beta1.BoundingBoxEvaluationOptio"
          + "nsH\000B\021\n\017vertical_option\"5\n\034BoundingBoxEv"
          + "aluationOptions\022\025\n\riou_threshold\030\001 \001(\002\"\331"
          + "\001\n\021EvaluationMetrics\022Z\n\026classification_m"
          + "etrics\030\001 \001(\01328.google.cloud.datalabeling"
          + ".v1beta1.ClassificationMetricsH\000\022]\n\030obje"
          + "ct_detection_metrics\030\002 \001(\01329.google.clou"
          + "d.datalabeling.v1beta1.ObjectDetectionMe"
          + "tricsH\000B\t\n\007metrics\"\243\001\n\025ClassificationMet"
          + "rics\022<\n\010pr_curve\030\001 \001(\0132*.google.cloud.da"
          + "talabeling.v1beta1.PrCurve\022L\n\020confusion_"
          + "matrix\030\002 \001(\01322.google.cloud.datalabeling"
          + ".v1beta1.ConfusionMatrix\"V\n\026ObjectDetect"
          + "ionMetrics\022<\n\010pr_curve\030\001 \001(\0132*.google.cl"
          + "oud.datalabeling.v1beta1.PrCurve\"\346\003\n\007PrC"
          + "urve\022J\n\017annotation_spec\030\001 \001(\01321.google.c"
          + "loud.datalabeling.v1beta1.AnnotationSpec"
          + "\022\030\n\020area_under_curve\030\002 \001(\002\022e\n\032confidence"
          + "_metrics_entries\030\003 \003(\0132A.google.cloud.da"
          + "talabeling.v1beta1.PrCurve.ConfidenceMet"
          + "ricsEntry\022\036\n\026mean_average_precision\030\004 \001("
          + "\002\032\355\001\n\026ConfidenceMetricsEntry\022\034\n\024confiden"
          + "ce_threshold\030\001 \001(\002\022\016\n\006recall\030\002 \001(\002\022\021\n\tpr"
          + "ecision\030\003 \001(\002\022\020\n\010f1_score\030\004 \001(\002\022\022\n\nrecal"
          + "l_at1\030\005 \001(\002\022\025\n\rprecision_at1\030\006 \001(\002\022\024\n\014f1"
          + "_score_at1\030\007 \001(\002\022\022\n\nrecall_at5\030\010 \001(\002\022\025\n\r"
          + "precision_at5\030\t \001(\002\022\024\n\014f1_score_at5\030\n \001("
          + "\002\"\374\002\n\017ConfusionMatrix\022C\n\003row\030\001 \003(\01326.goo"
          + "gle.cloud.datalabeling.v1beta1.Confusion"
          + "Matrix.Row\032v\n\024ConfusionMatrixEntry\022J\n\017an"
          + "notation_spec\030\001 \001(\01321.google.cloud.datal"
          + "abeling.v1beta1.AnnotationSpec\022\022\n\nitem_c"
          + "ount\030\002 \001(\005\032\253\001\n\003Row\022J\n\017annotation_spec\030\001 "
          + "\001(\01321.google.cloud.datalabeling.v1beta1."
          + "AnnotationSpec\022X\n\007entries\030\002 \003(\0132G.google"
          + ".cloud.datalabeling.v1beta1.ConfusionMat"
          + "rix.ConfusionMatrixEntryB\347\001\n%com.google."
          + "cloud.datalabeling.v1beta1P\001ZMgoogle.gol"
          + "ang.org/genproto/googleapis/cloud/datala"
          + "beling/v1beta1;datalabeling\252\002!Google.Clo"
          + "ud.DataLabeling.V1Beta1\312\002!Google\\Cloud\\D"
          + "ataLabeling\\V1beta1\352\002$Google::Cloud::Dat"
          + "aLabeling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_Evaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_Evaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Evaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "Config",
              "EvaluationJobRunTime",
              "CreateTime",
              "EvaluationMetrics",
              "AnnotationType",
              "EvaluatedItemCount",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationConfig_descriptor,
            new java.lang.String[] {
              "BoundingBoxEvaluationOptions", "VerticalOption",
            });
    internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_BoundingBoxEvaluationOptions_descriptor,
            new java.lang.String[] {
              "IouThreshold",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationMetrics_descriptor,
            new java.lang.String[] {
              "ClassificationMetrics", "ObjectDetectionMetrics", "Metrics",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetrics_descriptor,
            new java.lang.String[] {
              "PrCurve", "ConfusionMatrix",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionMetrics_descriptor,
            new java.lang.String[] {
              "PrCurve",
            });
    internal_static_google_cloud_datalabeling_v1beta1_PrCurve_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datalabeling_v1beta1_PrCurve_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_PrCurve_descriptor,
            new java.lang.String[] {
              "AnnotationSpec",
              "AreaUnderCurve",
              "ConfidenceMetricsEntries",
              "MeanAveragePrecision",
            });
    internal_static_google_cloud_datalabeling_v1beta1_PrCurve_ConfidenceMetricsEntry_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_PrCurve_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_PrCurve_ConfidenceMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_PrCurve_ConfidenceMetricsEntry_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold",
              "Recall",
              "Precision",
              "F1Score",
              "RecallAt1",
              "PrecisionAt1",
              "F1ScoreAt1",
              "RecallAt5",
              "PrecisionAt5",
              "F1ScoreAt5",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_descriptor,
            new java.lang.String[] {
              "Row",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_ConfusionMatrixEntry_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_ConfusionMatrixEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_ConfusionMatrixEntry_descriptor,
            new java.lang.String[] {
              "AnnotationSpec", "ItemCount",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_Row_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_Row_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ConfusionMatrix_Row_descriptor,
            new java.lang.String[] {
              "AnnotationSpec", "Entries",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}