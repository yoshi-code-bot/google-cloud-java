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
// source: google/cloud/cloudcontrolspartner/v1/ekm_connections.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.cloudcontrolspartner.v1;

public final class EkmConnectionsProto {
  private EkmConnectionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnections_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnections_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_GetEkmConnectionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_GetEkmConnectionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_ConnectionError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_ConnectionError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/cloudcontrolspartner/v1/e"
          + "km_connections.proto\022$google.cloud.cloud"
          + "controlspartner.v1\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\"\230"
          + "\002\n\016EkmConnections\022\021\n\004name\030\001 \001(\tB\003\340A\010\022L\n\017"
          + "ekm_connections\030\002 \003(\01323.google.cloud.clo"
          + "udcontrolspartner.v1.EkmConnection:\244\001\352A\240"
          + "\001\n2cloudcontrolspartner.googleapis.com/E"
          + "kmConnections\022jorganizations/{organizati"
          + "on}/locations/{location}/customers/{cust"
          + "omer}/workloads/{workload}/ekmConnection"
          + "s\"d\n\030GetEkmConnectionsRequest\022H\n\004name\030\001 "
          + "\001(\tB:\340A\002\372A4\n2cloudcontrolspartner.google"
          + "apis.com/EkmConnections\"\244\003\n\rEkmConnectio"
          + "n\022\027\n\017connection_name\030\001 \001(\t\022b\n\020connection"
          + "_state\030\002 \001(\0162C.google.cloud.cloudcontrol"
          + "spartner.v1.EkmConnection.ConnectionStat"
          + "eB\003\340A\003\022]\n\020connection_error\030\003 \001(\0132C.googl"
          + "e.cloud.cloudcontrolspartner.v1.EkmConne"
          + "ction.ConnectionError\032>\n\017ConnectionError"
          + "\022\024\n\014error_domain\030\001 \001(\t\022\025\n\rerror_message\030"
          + "\002 \001(\t\"w\n\017ConnectionState\022 \n\034CONNECTION_S"
          + "TATE_UNSPECIFIED\020\000\022\r\n\tAVAILABLE\020\001\022\021\n\rNOT"
          + "_AVAILABLE\020\002\022\t\n\005ERROR\020\003\022\025\n\021PERMISSION_DE"
          + "NIED\020\004B\227\002\n(com.google.cloud.cloudcontrol"
          + "spartner.v1B\023EkmConnectionsProtoP\001Z\\clou"
          + "d.google.com/go/cloudcontrolspartner/api"
          + "v1/cloudcontrolspartnerpb;cloudcontrolsp"
          + "artnerpb\252\002$Google.Cloud.CloudControlsPar"
          + "tner.V1\312\002$Google\\Cloud\\CloudControlsPart"
          + "ner\\V1\352\002\'Google::Cloud::CloudControlsPar"
          + "tner::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnections_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnections_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnections_descriptor,
            new java.lang.String[] {
              "Name", "EkmConnections",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_GetEkmConnectionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1_GetEkmConnectionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_GetEkmConnectionsRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_descriptor,
            new java.lang.String[] {
              "ConnectionName", "ConnectionState", "ConnectionError",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_ConnectionError_descriptor =
        internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_ConnectionError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1_EkmConnection_ConnectionError_descriptor,
            new java.lang.String[] {
              "ErrorDomain", "ErrorMessage",
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
  }

  // @@protoc_insertion_point(outer_class_scope)
}
