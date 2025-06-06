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
// source: google/cloud/financialservices/v1/engine_version.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.financialservices.v1;

public final class EngineVersionProto {
  private EngineVersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_financialservices_v1_EngineVersion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_financialservices_v1_EngineVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_financialservices_v1_ListEngineVersionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_financialservices_v1_ListEngineVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_financialservices_v1_ListEngineVersionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_financialservices_v1_ListEngineVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_financialservices_v1_GetEngineVersionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_financialservices_v1_GetEngineVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "6google/cloud/financialservices/v1/engine_version.proto\022!google.cloud.financial"
          + "services.v1\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\0328google/"
          + "cloud/financialservices/v1/line_of_busin"
          + "ess.proto\032\037google/protobuf/timestamp.proto\"\267\004\n\r"
          + "EngineVersion\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\003\340A\010\022J\n"
          + "\005state\030\002 \001(\01626.google.cloud.financi"
          + "alservices.v1.EngineVersion.StateB\003\340A\003\022G\n"
          + "\036expected_limitation_start_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022C\n"
          + "\032expected_decommission_time\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022P\n"
          + "\020line_of_business\030\005"
          + " \001(\01621.google.cloud.financialservices.v1.LineOfBusinessB\003\340A\003\"K\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006ACTIVE\020\001\022\013\n"
          + "\007LIMITED\020\002\022\022\n"
          + "\016DECOMMISSIONED\020\003:\226\001\352A\222\001\n"
          + ".financialservices.googleapis.com/EngineVersion\022`proj"
          + "ects/{project_num}/locations/{location}/"
          + "instances/{instance}/engineVersions/{engine_version}\"\273\001\n"
          + "\031ListEngineVersionsRequest\022A\n"
          + "\006parent\030\001 \001(\tB1\340A\002\372A+\n"
          + ")financialservices.googleapis.com/Instance\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\225\001\n"
          + "\032ListEngineVersionsResponse\022I\n"
          + "\017engine_versions\030\001"
          + " \003(\01320.google.cloud.financialservices.v1.EngineVersion\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"_\n"
          + "\027GetEngineVersionRequest\022D\n"
          + "\004name\030\001 \001(\tB6\340A\002\372A0\n"
          + ".financialservices.googleapis.com/EngineVersionB\201\002\n"
          + "%com.google.cloud.financialservices.v1B\022EngineVersionProtoP\001ZSclo"
          + "ud.google.com/go/financialservices/apiv1/financialservicespb;financialservicespb"
          + "\252\002!Google.Cloud.FinancialServices.V1\312\002!G"
          + "oogle\\Cloud\\FinancialServices\\V1\352\002$Googl"
          + "e::Cloud::FinancialServices::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.financialservices.v1.LineOfBusinessProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_financialservices_v1_EngineVersion_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_financialservices_v1_EngineVersion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_financialservices_v1_EngineVersion_descriptor,
            new java.lang.String[] {
              "Name",
              "State",
              "ExpectedLimitationStartTime",
              "ExpectedDecommissionTime",
              "LineOfBusiness",
            });
    internal_static_google_cloud_financialservices_v1_ListEngineVersionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_financialservices_v1_ListEngineVersionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_financialservices_v1_ListEngineVersionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_financialservices_v1_ListEngineVersionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_financialservices_v1_ListEngineVersionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_financialservices_v1_ListEngineVersionsResponse_descriptor,
            new java.lang.String[] {
              "EngineVersions", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_financialservices_v1_GetEngineVersionRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_financialservices_v1_GetEngineVersionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_financialservices_v1_GetEngineVersionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.financialservices.v1.LineOfBusinessProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
