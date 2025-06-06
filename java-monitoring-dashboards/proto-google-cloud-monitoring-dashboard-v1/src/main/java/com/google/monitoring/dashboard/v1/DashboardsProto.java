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
// source: google/monitoring/dashboard/v1/dashboard.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public final class DashboardsProto {
  private DashboardsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Dashboard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_Dashboard_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_Dashboard_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ".google/monitoring/dashboard/v1/dashboard.proto\022\036google.monitoring.dashboard.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0325google/monitoring/dashboard/v1/dashboard_filter.proto\032,goo"
          + "gle/monitoring/dashboard/v1/layouts.proto\"\372\004\n"
          + "\tDashboard\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\014\n"
          + "\004etag\030\004 \001(\t\022A\n"
          + "\013grid_layout\030\005"
          + " \001(\0132*.google.monitoring.dashboard.v1.GridLayoutH\000\022E\n\r"
          + "mosaic_layout\030\006"
          + " \001(\0132,.google.monitoring.dashboard.v1.MosaicLayoutH\000\022?\n\n"
          + "row_layout\030\010 \001(\0132).google.monitoring.dashboard.v1.RowLayoutH\000\022E\n\r"
          + "column_layout\030\t"
          + " \001(\0132,.google.monitoring.dashboard.v1.ColumnLayoutH\000\022J\n"
          + "\021dashboard_filters\030\013"
          + " \003(\0132/.google.monitoring.dashboard.v1.DashboardFilter\022E\n"
          + "\006labels\030\014 \003("
          + "\01325.google.monitoring.dashboard.v1.Dashboard.LabelsEntry\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:S\352AP\n"
          + "#monitoring"
          + ".googleapis.com/Dashboard\022)projects/{project}/dashboards/{dashboard}B\010\n"
          + "\006layoutB\370\001\n"
          + "\"com.google.monitoring.dashboard.v1B\017DashboardsProtoP\001ZFcloud.google.com/go/mo"
          + "nitoring/dashboard/apiv1/dashboardpb;dashboardpb\252\002$Google.Cloud.Monitoring.Dashb"
          + "oard.V1\312\002$Google\\Cloud\\Monitoring\\Dashbo"
          + "ard\\V1\352\002(Google::Cloud::Monitoring::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.DashboardFilterProto.getDescriptor(),
              com.google.monitoring.dashboard.v1.LayoutsProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Dashboard_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Etag",
              "GridLayout",
              "MosaicLayout",
              "RowLayout",
              "ColumnLayout",
              "DashboardFilters",
              "Labels",
              "Layout",
            });
    internal_static_google_monitoring_dashboard_v1_Dashboard_LabelsEntry_descriptor =
        internal_static_google_monitoring_dashboard_v1_Dashboard_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_Dashboard_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_Dashboard_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.dashboard.v1.DashboardFilterProto.getDescriptor();
    com.google.monitoring.dashboard.v1.LayoutsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
