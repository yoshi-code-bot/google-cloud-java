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
// source: google/cloud/documentai/v1beta3/evaluation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

public final class DocumentAiEvaluation {
  private DocumentAiEvaluation() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_EvaluationReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_EvaluationReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/documentai/v1beta3/evalua"
          + "tion.proto\022\037google.cloud.documentai.v1be"
          + "ta3\032\031google/api/resource.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\215\002\n\023EvaluationRe"
          + "ference\022\021\n\toperation\030\001 \001(\t\022=\n\nevaluation"
          + "\030\002 \001(\tB)\372A&\n$documentai.googleapis.com/E"
          + "valuation\022N\n\021aggregate_metrics\030\004 \001(\01323.g"
          + "oogle.cloud.documentai.v1beta3.Evaluatio"
          + "n.Metrics\022T\n\027aggregate_metrics_exact\030\005 \001"
          + "(\01323.google.cloud.documentai.v1beta3.Eva"
          + "luation.Metrics\"\215\016\n\nEvaluation\022\014\n\004name\030\001"
          + " \001(\t\022/\n\013create_time\030\002 \001(\0132\032.google.proto"
          + "buf.Timestamp\022O\n\021document_counters\030\005 \001(\013"
          + "24.google.cloud.documentai.v1beta3.Evalu"
          + "ation.Counters\022`\n\024all_entities_metrics\030\003"
          + " \001(\0132B.google.cloud.documentai.v1beta3.E"
          + "valuation.MultiConfidenceMetrics\022V\n\016enti"
          + "ty_metrics\030\004 \003(\0132>.google.cloud.document"
          + "ai.v1beta3.Evaluation.EntityMetricsEntry"
          + "\022\024\n\014kms_key_name\030\006 \001(\t\022\034\n\024kms_key_versio"
          + "n_name\030\007 \001(\t\032\215\001\n\010Counters\022\035\n\025input_docum"
          + "ents_count\030\001 \001(\005\022\037\n\027invalid_documents_co"
          + "unt\030\002 \001(\005\022\036\n\026failed_documents_count\030\003 \001("
          + "\005\022!\n\031evaluated_documents_count\030\004 \001(\005\032\315\002\n"
          + "\007Metrics\022\021\n\tprecision\030\001 \001(\002\022\016\n\006recall\030\002 "
          + "\001(\002\022\020\n\010f1_score\030\003 \001(\002\022#\n\033predicted_occur"
          + "rences_count\030\004 \001(\005\022&\n\036ground_truth_occur"
          + "rences_count\030\005 \001(\005\022 \n\030predicted_document"
          + "_count\030\n \001(\005\022#\n\033ground_truth_document_co"
          + "unt\030\013 \001(\005\022\034\n\024true_positives_count\030\006 \001(\005\022"
          + "\035\n\025false_positives_count\030\007 \001(\005\022\035\n\025false_"
          + "negatives_count\030\010 \001(\005\022\035\n\025total_documents"
          + "_count\030\t \001(\005\032x\n\026ConfidenceLevelMetrics\022\030"
          + "\n\020confidence_level\030\001 \001(\002\022D\n\007metrics\030\002 \001("
          + "\01323.google.cloud.documentai.v1beta3.Eval"
          + "uation.Metrics\032\200\004\n\026MultiConfidenceMetric"
          + "s\022d\n\030confidence_level_metrics\030\001 \003(\0132B.go"
          + "ogle.cloud.documentai.v1beta3.Evaluation"
          + ".ConfidenceLevelMetrics\022j\n\036confidence_le"
          + "vel_metrics_exact\030\004 \003(\0132B.google.cloud.d"
          + "ocumentai.v1beta3.Evaluation.ConfidenceL"
          + "evelMetrics\022\r\n\005auprc\030\002 \001(\002\022#\n\033estimated_"
          + "calibration_error\030\003 \001(\002\022\023\n\013auprc_exact\030\005"
          + " \001(\002\022)\n!estimated_calibration_error_exac"
          + "t\030\006 \001(\002\022d\n\014metrics_type\030\007 \001(\0162N.google.c"
          + "loud.documentai.v1beta3.Evaluation.Multi"
          + "ConfidenceMetrics.MetricsType\":\n\013Metrics"
          + "Type\022\034\n\030METRICS_TYPE_UNSPECIFIED\020\000\022\r\n\tAG"
          + "GREGATE\020\001\032x\n\022EntityMetricsEntry\022\013\n\003key\030\001"
          + " \001(\t\022Q\n\005value\030\002 \001(\0132B.google.cloud.docum"
          + "entai.v1beta3.Evaluation.MultiConfidence"
          + "Metrics:\0028\001:\251\001\352A\245\001\n$documentai.googleapi"
          + "s.com/Evaluation\022}projects/{project}/loc"
          + "ations/{location}/processors/{processor}"
          + "/processorVersions/{processor_version}/e"
          + "valuations/{evaluation}B\353\001\n#com.google.c"
          + "loud.documentai.v1beta3B\024DocumentAiEvalu"
          + "ationP\001ZCcloud.google.com/go/documentai/"
          + "apiv1beta3/documentaipb;documentaipb\252\002\037G"
          + "oogle.Cloud.DocumentAI.V1Beta3\312\002\037Google\\"
          + "Cloud\\DocumentAI\\V1beta3\352\002\"Google::Cloud"
          + "::DocumentAI::V1beta3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta3_EvaluationReference_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta3_EvaluationReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_EvaluationReference_descriptor,
            new java.lang.String[] {
              "Operation", "Evaluation", "AggregateMetrics", "AggregateMetricsExact",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "DocumentCounters",
              "AllEntitiesMetrics",
              "EntityMetrics",
              "KmsKeyName",
              "KmsKeyVersionName",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_Counters_descriptor,
            new java.lang.String[] {
              "InputDocumentsCount",
              "InvalidDocumentsCount",
              "FailedDocumentsCount",
              "EvaluatedDocumentsCount",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_Metrics_descriptor,
            new java.lang.String[] {
              "Precision",
              "Recall",
              "F1Score",
              "PredictedOccurrencesCount",
              "GroundTruthOccurrencesCount",
              "PredictedDocumentCount",
              "GroundTruthDocumentCount",
              "TruePositivesCount",
              "FalsePositivesCount",
              "FalseNegativesCount",
              "TotalDocumentsCount",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_ConfidenceLevelMetrics_descriptor,
            new java.lang.String[] {
              "ConfidenceLevel", "Metrics",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_MultiConfidenceMetrics_descriptor,
            new java.lang.String[] {
              "ConfidenceLevelMetrics",
              "ConfidenceLevelMetricsExact",
              "Auprc",
              "EstimatedCalibrationError",
              "AuprcExact",
              "EstimatedCalibrationErrorExact",
              "MetricsType",
            });
    internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor =
        internal_static_google_cloud_documentai_v1beta3_Evaluation_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta3_Evaluation_EntityMetricsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
