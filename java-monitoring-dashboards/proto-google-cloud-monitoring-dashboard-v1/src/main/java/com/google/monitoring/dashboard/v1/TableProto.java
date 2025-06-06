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
// source: google/monitoring/dashboard/v1/table.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public final class TableProto {
  private TableProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/monitoring/dashboard/v1/table.p"
          + "roto\022\036google.monitoring.dashboard.v1\032\037go"
          + "ogle/api/field_behavior.proto\032,google/mo"
          + "nitoring/dashboard/v1/metrics.proto\032:goo"
          + "gle/monitoring/dashboard/v1/table_displa"
          + "y_options.proto\032\036google/protobuf/duratio"
          + "n.proto\"\322\005\n\017TimeSeriesTable\022T\n\tdata_sets"
          + "\030\001 \003(\0132<.google.monitoring.dashboard.v1."
          + "TimeSeriesTable.TableDataSetB\003\340A\002\022f\n\024met"
          + "ric_visualization\030\002 \001(\0162C.google.monitor"
          + "ing.dashboard.v1.TimeSeriesTable.MetricV"
          + "isualizationB\003\340A\001\022\\\n\017column_settings\030\004 \003"
          + "(\0132>.google.monitoring.dashboard.v1.Time"
          + "SeriesTable.ColumnSettingsB\003\340A\001\032\223\002\n\014Tabl"
          + "eDataSet\022O\n\021time_series_query\030\001 \001(\0132/.go"
          + "ogle.monitoring.dashboard.v1.TimeSeriesQ"
          + "ueryB\003\340A\002\022\033\n\016table_template\030\002 \001(\tB\003\340A\001\022<"
          + "\n\024min_alignment_period\030\003 \001(\0132\031.google.pr"
          + "otobuf.DurationB\003\340A\001\022W\n\025table_display_op"
          + "tions\030\004 \001(\01323.google.monitoring.dashboar"
          + "d.v1.TableDisplayOptionsB\003\340A\001\032;\n\016ColumnS"
          + "ettings\022\023\n\006column\030\001 \001(\tB\003\340A\002\022\024\n\007visible\030"
          + "\002 \001(\010B\003\340A\002\"P\n\023MetricVisualization\022$\n MET"
          + "RIC_VISUALIZATION_UNSPECIFIED\020\000\022\n\n\006NUMBE"
          + "R\020\001\022\007\n\003BAR\020\002B\363\001\n\"com.google.monitoring.d"
          + "ashboard.v1B\nTableProtoP\001ZFcloud.google."
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
              com.google.monitoring.dashboard.v1.TableDisplayOptionsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor,
            new java.lang.String[] {
              "DataSets", "MetricVisualization", "ColumnSettings",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor =
        internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_TableDataSet_descriptor,
            new java.lang.String[] {
              "TimeSeriesQuery", "TableTemplate", "MinAlignmentPeriod", "TableDisplayOptions",
            });
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor =
        internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_TimeSeriesTable_ColumnSettings_descriptor,
            new java.lang.String[] {
              "Column", "Visible",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.MetricsProto.getDescriptor();
    com.google.monitoring.dashboard.v1.TableDisplayOptionsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
