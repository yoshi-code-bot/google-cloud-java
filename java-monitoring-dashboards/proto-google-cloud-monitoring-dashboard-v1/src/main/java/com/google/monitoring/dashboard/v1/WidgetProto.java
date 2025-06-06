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
// source: google/monitoring/dashboard/v1/widget.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public final class WidgetProto {
  private WidgetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Widget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Widget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/monitoring/dashboard/v1/widget."
          + "proto\022\036google.monitoring.dashboard.v1\032\037g"
          + "oogle/api/field_behavior.proto\032/google/m"
          + "onitoring/dashboard/v1/alertchart.proto\032"
          + "6google/monitoring/dashboard/v1/collapsi"
          + "ble_group.proto\032:google/monitoring/dashb"
          + "oard/v1/error_reporting_panel.proto\0322goo"
          + "gle/monitoring/dashboard/v1/incident_lis"
          + "t.proto\032/google/monitoring/dashboard/v1/"
          + "logs_panel.proto\032-google/monitoring/dash"
          + "board/v1/piechart.proto\032.google/monitori"
          + "ng/dashboard/v1/scorecard.proto\0323google/"
          + "monitoring/dashboard/v1/section_header.p"
          + "roto\0326google/monitoring/dashboard/v1/sin"
          + "gle_view_group.proto\032*google/monitoring/"
          + "dashboard/v1/table.proto\032)google/monitor"
          + "ing/dashboard/v1/text.proto\032,google/moni"
          + "toring/dashboard/v1/xychart.proto\032\033googl"
          + "e/protobuf/empty.proto\"\250\007\n\006Widget\022\022\n\005tit"
          + "le\030\001 \001(\tB\003\340A\001\022;\n\010xy_chart\030\002 \001(\0132\'.google"
          + ".monitoring.dashboard.v1.XyChartH\000\022>\n\tsc"
          + "orecard\030\003 \001(\0132).google.monitoring.dashbo"
          + "ard.v1.ScorecardH\000\0224\n\004text\030\004 \001(\0132$.googl"
          + "e.monitoring.dashboard.v1.TextH\000\022\'\n\005blan"
          + "k\030\005 \001(\0132\026.google.protobuf.EmptyH\000\022A\n\013ale"
          + "rt_chart\030\007 \001(\0132*.google.monitoring.dashb"
          + "oard.v1.AlertChartH\000\022L\n\021time_series_tabl"
          + "e\030\010 \001(\0132/.google.monitoring.dashboard.v1"
          + ".TimeSeriesTableH\000\022M\n\021collapsible_group\030"
          + "\t \001(\01320.google.monitoring.dashboard.v1.C"
          + "ollapsibleGroupH\000\022?\n\nlogs_panel\030\n \001(\0132)."
          + "google.monitoring.dashboard.v1.LogsPanel"
          + "H\000\022E\n\rincident_list\030\014 \001(\0132,.google.monit"
          + "oring.dashboard.v1.IncidentListH\000\022=\n\tpie"
          + "_chart\030\016 \001(\0132(.google.monitoring.dashboa"
          + "rd.v1.PieChartH\000\022T\n\025error_reporting_pane"
          + "l\030\023 \001(\01323.google.monitoring.dashboard.v1"
          + ".ErrorReportingPanelH\000\022G\n\016section_header"
          + "\030\025 \001(\0132-.google.monitoring.dashboard.v1."
          + "SectionHeaderH\000\022L\n\021single_view_group\030\026 \001"
          + "(\0132/.google.monitoring.dashboard.v1.Sing"
          + "leViewGroupH\000\022\017\n\002id\030\021 \001(\tB\003\340A\001B\t\n\007conten"
          + "tB\364\001\n\"com.google.monitoring.dashboard.v1"
          + "B\013WidgetProtoP\001ZFcloud.google.com/go/mon"
          + "itoring/dashboard/apiv1/dashboardpb;dash"
          + "boardpb\252\002$Google.Cloud.Monitoring.Dashbo"
          + "ard.V1\312\002$Google\\Cloud\\Monitoring\\Dashboa"
          + "rd\\V1\352\002(Google::Cloud::Monitoring::Dashb"
          + "oard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.AlertChartProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.CollapsibleGroupProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.ErrorReportingPanelProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.IncidentListProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.LogsPanelProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.PieChartProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.ScorecardProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.SectionHeaderProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.SingleViewGroupProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.TableProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.TextProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.XyChartProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Widget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Widget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Widget_descriptor,
            new java.lang.String[] {
              "Title",
              "XyChart",
              "Scorecard",
              "Text",
              "Blank",
              "AlertChart",
              "TimeSeriesTable",
              "CollapsibleGroup",
              "LogsPanel",
              "IncidentList",
              "PieChart",
              "ErrorReportingPanel",
              "SectionHeader",
              "SingleViewGroup",
              "Id",
              "Content",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.monitoring.dashboard.v1.AlertChartProto.getDescriptor();
    com.google.monitoring.dashboard.v1.CollapsibleGroupProto.getDescriptor();
    com.google.monitoring.dashboard.v1.ErrorReportingPanelProto.getDescriptor();
    com.google.monitoring.dashboard.v1.IncidentListProto.getDescriptor();
    com.google.monitoring.dashboard.v1.LogsPanelProto.getDescriptor();
    com.google.monitoring.dashboard.v1.PieChartProto.getDescriptor();
    com.google.monitoring.dashboard.v1.ScorecardProto.getDescriptor();
    com.google.monitoring.dashboard.v1.SectionHeaderProto.getDescriptor();
    com.google.monitoring.dashboard.v1.SingleViewGroupProto.getDescriptor();
    com.google.monitoring.dashboard.v1.TableProto.getDescriptor();
    com.google.monitoring.dashboard.v1.TextProto.getDescriptor();
    com.google.monitoring.dashboard.v1.XyChartProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
