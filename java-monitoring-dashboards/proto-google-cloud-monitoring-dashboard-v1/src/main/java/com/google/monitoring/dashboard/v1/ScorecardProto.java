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
// source: google/monitoring/dashboard/v1/scorecard.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public final class ScorecardProto {
  private ScorecardProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/monitoring/dashboard/v1/scoreca"
          + "rd.proto\022\036google.monitoring.dashboard.v1"
          + "\032\037google/api/field_behavior.proto\032,googl"
          + "e/monitoring/dashboard/v1/metrics.proto\032"
          + "\036google/protobuf/duration.proto\032\033google/"
          + "protobuf/empty.proto\"\311\004\n\tScorecard\022O\n\021ti"
          + "me_series_query\030\001 \001(\0132/.google.monitorin"
          + "g.dashboard.v1.TimeSeriesQueryB\003\340A\002\022I\n\ng"
          + "auge_view\030\004 \001(\01323.google.monitoring.dash"
          + "board.v1.Scorecard.GaugeViewH\000\022T\n\020spark_"
          + "chart_view\030\005 \001(\01328.google.monitoring.das"
          + "hboard.v1.Scorecard.SparkChartViewH\000\022,\n\n"
          + "blank_view\030\007 \001(\0132\026.google.protobuf.Empty"
          + "H\000\022=\n\nthresholds\030\006 \003(\0132).google.monitori"
          + "ng.dashboard.v1.Threshold\0325\n\tGaugeView\022\023"
          + "\n\013lower_bound\030\001 \001(\001\022\023\n\013upper_bound\030\002 \001(\001"
          + "\032\230\001\n\016SparkChartView\022M\n\020spark_chart_type\030"
          + "\001 \001(\0162..google.monitoring.dashboard.v1.S"
          + "parkChartTypeB\003\340A\002\0227\n\024min_alignment_peri"
          + "od\030\002 \001(\0132\031.google.protobuf.DurationB\013\n\td"
          + "ata_viewB\367\001\n\"com.google.monitoring.dashb"
          + "oard.v1B\016ScorecardProtoP\001ZFcloud.google."
          + "com/go/monitoring/dashboard/apiv1/dashbo"
          + "ardpb;dashboardpb\252\002$Google.Cloud.Monitor"
          + "ing.Dashboard.V1\312\002$Google\\Cloud\\Monitori"
          + "ng\\Dashboard\\V1\352\002(Google::Cloud::Monitor"
          + "ing::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Scorecard_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor,
            new java.lang.String[] {
              "TimeSeriesQuery",
              "GaugeView",
              "SparkChartView",
              "BlankView",
              "Thresholds",
              "DataView",
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor =
        internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_GaugeView_descriptor,
            new java.lang.String[] {
              "LowerBound", "UpperBound",
            });
    internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor =
        internal_static_google_monitoring_dashboard_v1_Scorecard_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Scorecard_SparkChartView_descriptor,
            new java.lang.String[] {
              "SparkChartType", "MinAlignmentPeriod",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
