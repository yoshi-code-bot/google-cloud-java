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
// source: google/cloud/aiplatform/v1beta1/reservation_affinity.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class ReservationAffinityProto {
  private ReservationAffinityProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ReservationAffinity_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ReservationAffinity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ":google/cloud/aiplatform/v1beta1/reservation_affinity.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\"\247\002\n"
          + "\023ReservationAffinity\022a\n"
          + "\031reservation_affinity_type\030\001"
          + " \001(\01629.google.cloud.aiplatform.v1beta1.ReservationAffinity.TypeB\003\340A\002\022\020\n"
          + "\003key\030\002 \001(\tB\003\340A\001\022:\n"
          + "\006values\030\003 \003(\tB*\340A\001\372A$\n"
          + "\"compute.googleapis.com/Reservation\"_\n"
          + "\004Type\022\024\n"
          + "\020TYPE_UNSPECIFIED\020\000\022\022\n"
          + "\016NO_RESERVATION\020\001\022\023\n"
          + "\017ANY_RESERVATION\020\002\022\030\n"
          + "\024SPECIFIC_RESERVATION\020\003B\344\002\n"
          + "#com.google.cloud.aiplatform.v1beta1B\030ReservationAffinityProtoP\001Z"
          + "Ccloud.google.com/go/aiplatform/apiv1bet"
          + "a1/aiplatformpb;aiplatformpb\252\002\037Google.Cl"
          + "oud.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AI"
          + "Platform\\V1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1\352Ar\n"
          + "\"compute.googleapis.com/Reservation\022Lprojects/{project_id_or_nu"
          + "mber}/zones/{zone}/reservations/{reservation_name}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ReservationAffinity_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ReservationAffinity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ReservationAffinity_descriptor,
            new java.lang.String[] {
              "ReservationAffinityType", "Key", "Values",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
