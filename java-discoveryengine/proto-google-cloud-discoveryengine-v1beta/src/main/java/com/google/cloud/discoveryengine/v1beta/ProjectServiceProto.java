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
// source: google/cloud/discoveryengine/v1beta/project_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public final class ProjectServiceProto {
  private ProjectServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/discoveryengine/v1beta/pr"
          + "oject_service.proto\022#google.cloud.discov"
          + "eryengine.v1beta\032\034google/api/annotations"
          + ".proto\032\027google/api/client.proto\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\0321google/cloud/discoveryengin"
          + "e/v1beta/project.proto\032#google/longrunni"
          + "ng/operations.proto\"\240\001\n\027ProvisionProject"
          + "Request\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&discovery"
          + "engine.googleapis.com/Project\022\"\n\025accept_"
          + "data_use_terms\030\002 \001(\010B\003\340A\002\022#\n\026data_use_te"
          + "rms_version\030\003 \001(\tB\003\340A\002\"\032\n\030ProvisionProje"
          + "ctMetadata2\374\002\n\016ProjectService\022\225\002\n\020Provis"
          + "ionProject\022<.google.cloud.discoveryengin"
          + "e.v1beta.ProvisionProjectRequest\032\035.googl"
          + "e.longrunning.Operation\"\243\001\312Ak\n+google.cl"
          + "oud.discoveryengine.v1beta.Project\022<goog"
          + "le.cloud.discoveryengine.v1beta.Provisio"
          + "nProjectMetadata\332A\004name\202\323\344\223\002(\"#/v1beta/{"
          + "name=projects/*}:provision:\001*\032R\312A\036discov"
          + "eryengine.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\232\002\n\'co"
          + "m.google.cloud.discoveryengine.v1betaB\023P"
          + "rojectServiceProtoP\001ZQcloud.google.com/g"
          + "o/discoveryengine/apiv1beta/discoveryeng"
          + "inepb;discoveryenginepb\242\002\017DISCOVERYENGIN"
          + "E\252\002#Google.Cloud.DiscoveryEngine.V1Beta\312"
          + "\002#Google\\Cloud\\DiscoveryEngine\\V1beta\352\002&"
          + "Google::Cloud::DiscoveryEngine::V1betab\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ProjectProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectRequest_descriptor,
            new java.lang.String[] {
              "Name", "AcceptDataUseTerms", "DataUseTermsVersion",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ProvisionProjectMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ProjectProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
