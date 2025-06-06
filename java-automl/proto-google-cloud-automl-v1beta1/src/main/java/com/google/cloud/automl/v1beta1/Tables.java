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
// source: google/cloud/automl/v1beta1/tables.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public final class Tables {
  private Tables() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/automl/v1beta1/tables.pro"
          + "to\022\033google.cloud.automl.v1beta1\0320google/"
          + "cloud/automl/v1beta1/classification.prot"
          + "o\032-google/cloud/automl/v1beta1/column_sp"
          + "ec.proto\032,google/cloud/automl/v1beta1/da"
          + "ta_items.proto\032,google/cloud/automl/v1be"
          + "ta1/data_stats.proto\032(google/cloud/autom"
          + "l/v1beta1/ranges.proto\032,google/cloud/aut"
          + "oml/v1beta1/regression.proto\032*google/clo"
          + "ud/automl/v1beta1/temporal.proto\032\034google"
          + "/protobuf/struct.proto\032\037google/protobuf/"
          + "timestamp.proto\"\260\003\n\025TablesDatasetMetadat"
          + "a\022\035\n\025primary_table_spec_id\030\001 \001(\t\022\035\n\025targ"
          + "et_column_spec_id\030\002 \001(\t\022\035\n\025weight_column"
          + "_spec_id\030\003 \001(\t\022\035\n\025ml_use_column_spec_id\030"
          + "\004 \001(\t\022t\n\032target_column_correlations\030\006 \003("
          + "\0132P.google.cloud.automl.v1beta1.TablesDa"
          + "tasetMetadata.TargetColumnCorrelationsEn"
          + "try\0225\n\021stats_update_time\030\007 \001(\0132\032.google."
          + "protobuf.Timestamp\032n\n\035TargetColumnCorrel"
          + "ationsEntry\022\013\n\003key\030\001 \001(\t\022<\n\005value\030\002 \001(\0132"
          + "-.google.cloud.automl.v1beta1.Correlatio"
          + "nStats:\0028\001\"\226\004\n\023TablesModelMetadata\022-\n#op"
          + "timization_objective_recall_value\030\021 \001(\002H"
          + "\000\0220\n&optimization_objective_precision_va"
          + "lue\030\022 \001(\002H\000\022C\n\022target_column_spec\030\002 \001(\0132"
          + "\'.google.cloud.automl.v1beta1.ColumnSpec"
          + "\022K\n\032input_feature_column_specs\030\003 \003(\0132\'.g"
          + "oogle.cloud.automl.v1beta1.ColumnSpec\022\036\n"
          + "\026optimization_objective\030\004 \001(\t\022T\n\030tables_"
          + "model_column_info\030\005 \003(\01322.google.cloud.a"
          + "utoml.v1beta1.TablesModelColumnInfo\022%\n\035t"
          + "rain_budget_milli_node_hours\030\006 \001(\003\022#\n\033tr"
          + "ain_cost_milli_node_hours\030\007 \001(\003\022\036\n\026disab"
          + "le_early_stopping\030\014 \001(\010B*\n(additional_op"
          + "timization_objective_config\"\375\001\n\020TablesAn"
          + "notation\022\r\n\005score\030\001 \001(\002\022E\n\023prediction_in"
          + "terval\030\004 \001(\0132(.google.cloud.automl.v1bet"
          + "a1.DoubleRange\022%\n\005value\030\002 \001(\0132\026.google.p"
          + "rotobuf.Value\022T\n\030tables_model_column_inf"
          + "o\030\003 \003(\01322.google.cloud.automl.v1beta1.Ta"
          + "blesModelColumnInfo\022\026\n\016baseline_score\030\005 "
          + "\001(\002\"j\n\025TablesModelColumnInfo\022\030\n\020column_s"
          + "pec_name\030\001 \001(\t\022\033\n\023column_display_name\030\002 "
          + "\001(\t\022\032\n\022feature_importance\030\003 \001(\002B\233\001\n\037com."
          + "google.cloud.automl.v1beta1P\001Z7cloud.goo"
          + "gle.com/go/automl/apiv1beta1/automlpb;au"
          + "tomlpb\312\002\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036G"
          + "oogle::Cloud::AutoML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.ColumnSpecOuterClass.getDescriptor(),
              com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
              com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor(),
              com.google.cloud.automl.v1beta1.RangesProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor(),
              com.google.cloud.automl.v1beta1.Temporal.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor,
            new java.lang.String[] {
              "PrimaryTableSpecId",
              "TargetColumnSpecId",
              "WeightColumnSpecId",
              "MlUseColumnSpecId",
              "TargetColumnCorrelations",
              "StatsUpdateTime",
            });
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesDatasetMetadata_TargetColumnCorrelationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesModelMetadata_descriptor,
            new java.lang.String[] {
              "OptimizationObjectiveRecallValue",
              "OptimizationObjectivePrecisionValue",
              "TargetColumnSpec",
              "InputFeatureColumnSpecs",
              "OptimizationObjective",
              "TablesModelColumnInfo",
              "TrainBudgetMilliNodeHours",
              "TrainCostMilliNodeHours",
              "DisableEarlyStopping",
              "AdditionalOptimizationObjectiveConfig",
            });
    internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_TablesAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesAnnotation_descriptor,
            new java.lang.String[] {
              "Score", "PredictionInterval", "Value", "TablesModelColumnInfo", "BaselineScore",
            });
    internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TablesModelColumnInfo_descriptor,
            new java.lang.String[] {
              "ColumnSpecName", "ColumnDisplayName", "FeatureImportance",
            });
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.ColumnSpecOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
    com.google.cloud.automl.v1beta1.DataStatsOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.RangesProto.getDescriptor();
    com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Temporal.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
