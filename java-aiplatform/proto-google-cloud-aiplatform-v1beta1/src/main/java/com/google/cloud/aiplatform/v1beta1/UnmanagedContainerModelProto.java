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
// source: google/cloud/aiplatform/v1beta1/unmanaged_container_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class UnmanagedContainerModelProto {
  private UnmanagedContainerModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UnmanagedContainerModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UnmanagedContainerModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/aiplatform/v1beta1/unmana"
          + "ged_container_model.proto\022\037google.cloud."
          + "aiplatform.v1beta1\032\037google/api/field_beh"
          + "avior.proto\032+google/cloud/aiplatform/v1b"
          + "eta1/model.proto\"\315\001\n\027UnmanagedContainerM"
          + "odel\022\024\n\014artifact_uri\030\001 \001(\t\022J\n\020predict_sc"
          + "hemata\030\002 \001(\01320.google.cloud.aiplatform.v"
          + "1beta1.PredictSchemata\022P\n\016container_spec"
          + "\030\003 \001(\01323.google.cloud.aiplatform.v1beta1"
          + ".ModelContainerSpecB\003\340A\004B\363\001\n#com.google."
          + "cloud.aiplatform.v1beta1B\034UnmanagedConta"
          + "inerModelProtoP\001ZCcloud.google.com/go/ai"
          + "platform/apiv1beta1/aiplatformpb;aiplatf"
          + "ormpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312"
          + "\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goog"
          + "le::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_UnmanagedContainerModel_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UnmanagedContainerModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UnmanagedContainerModel_descriptor,
            new java.lang.String[] {
              "ArtifactUri", "PredictSchemata", "ContainerSpec",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
