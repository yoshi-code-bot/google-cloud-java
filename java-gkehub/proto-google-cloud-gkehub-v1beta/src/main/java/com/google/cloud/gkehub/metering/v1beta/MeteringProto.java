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
// source: google/cloud/gkehub/v1beta/metering/metering.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.metering.v1beta;

public final class MeteringProto {
  private MeteringProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_metering_v1beta_MembershipState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_metering_v1beta_MembershipState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/gkehub/v1beta/metering/me"
          + "tering.proto\022#google.cloud.gkehub.meteri"
          + "ng.v1beta\032\037google/protobuf/timestamp.pro"
          + "to\"\201\001\n\017MembershipState\0229\n\025last_measureme"
          + "nt_time\030\001 \001(\0132\032.google.protobuf.Timestam"
          + "p\0223\n+precise_last_measured_cluster_vcpu_"
          + "capacity\030\003 \001(\002B\365\001\n\'com.google.cloud.gkeh"
          + "ub.metering.v1betaB\rMeteringProtoP\001ZCclo"
          + "ud.google.com/go/gkehub/metering/apiv1be"
          + "ta/meteringpb;meteringpb\252\002#Google.Cloud."
          + "GkeHub.Metering.V1Beta\312\002#Google\\Cloud\\Gk"
          + "eHub\\Metering\\V1beta\352\002\'Google::Cloud::Gk"
          + "eHub::Metering::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_metering_v1beta_MembershipState_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_metering_v1beta_MembershipState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_metering_v1beta_MembershipState_descriptor,
            new java.lang.String[] {
              "LastMeasurementTime", "PreciseLastMeasuredClusterVcpuCapacity",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
