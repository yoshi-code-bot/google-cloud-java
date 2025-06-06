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
// source: google/cloud/discoveryengine/v1alpha/project_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class ProjectServiceProto {
  private ProjectServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ReportConsentChangeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ReportConsentChangeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/discoveryengine/v1alpha/p"
          + "roject_service.proto\022$google.cloud.disco"
          + "veryengine.v1alpha\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\0322google/cloud/discoveryeng"
          + "ine/v1alpha/project.proto\032#google/longru"
          + "nning/operations.proto\"Q\n\021GetProjectRequ"
          + "est\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&discoveryengi"
          + "ne.googleapis.com/Project\"\240\001\n\027ProvisionP"
          + "rojectRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n&dis"
          + "coveryengine.googleapis.com/Project\022\"\n\025a"
          + "ccept_data_use_terms\030\002 \001(\010B\003\340A\002\022#\n\026data_"
          + "use_terms_version\030\003 \001(\tB\003\340A\002\"\032\n\030Provisio"
          + "nProjectMetadata\"\342\002\n\032ReportConsentChange"
          + "Request\022x\n\025consent_change_action\030\001 \001(\0162T"
          + ".google.cloud.discoveryengine.v1alpha.Re"
          + "portConsentChangeRequest.ConsentChangeAc"
          + "tionB\003\340A\002\022?\n\007project\030\002 \001(\tB.\340A\002\372A(\n&disc"
          + "overyengine.googleapis.com/Project\022\034\n\017se"
          + "rvice_term_id\030\003 \001(\tB\003\340A\002\022!\n\024service_term"
          + "_version\030\004 \001(\tB\003\340A\002\"H\n\023ConsentChangeActi"
          + "on\022%\n!CONSENT_CHANGE_ACTION_UNSPECIFIED\020"
          + "\000\022\n\n\006ACCEPT\020\0012\257\006\n\016ProjectService\022\237\001\n\nGet"
          + "Project\0227.google.cloud.discoveryengine.v"
          + "1alpha.GetProjectRequest\032-.google.cloud."
          + "discoveryengine.v1alpha.Project\")\332A\004name"
          + "\202\323\344\223\002\034\022\032/v1alpha/{name=projects/*}\022\231\002\n\020P"
          + "rovisionProject\022=.google.cloud.discovery"
          + "engine.v1alpha.ProvisionProjectRequest\032\035"
          + ".google.longrunning.Operation\"\246\001\312Am\n,goo"
          + "gle.cloud.discoveryengine.v1alpha.Projec"
          + "t\022=google.cloud.discoveryengine.v1alpha."
          + "ProvisionProjectMetadata\332A\004name\202\323\344\223\002)\"$/"
          + "v1alpha/{name=projects/*}:provision:\001*\022\212"
          + "\002\n\023ReportConsentChange\022@.google.cloud.di"
          + "scoveryengine.v1alpha.ReportConsentChang"
          + "eRequest\032-.google.cloud.discoveryengine."
          + "v1alpha.Project\"\201\001\332ABconsent_change_acti"
          + "on,project,service_term_id,service_term_"
          + "version\202\323\344\223\0026\"1/v1alpha/{project=project"
          + "s/*}:reportConsentChange:\001*\032R\312A\036discover"
          + "yengine.googleapis.com\322A.https://www.goo"
          + "gleapis.com/auth/cloud-platformB\237\002\n(com."
          + "google.cloud.discoveryengine.v1alphaB\023Pr"
          + "ojectServiceProtoP\001ZRcloud.google.com/go"
          + "/discoveryengine/apiv1alpha/discoveryeng"
          + "inepb;discoveryenginepb\242\002\017DISCOVERYENGIN"
          + "E\252\002$Google.Cloud.DiscoveryEngine.V1Alpha"
          + "\312\002$Google\\Cloud\\DiscoveryEngine\\V1alpha\352"
          + "\002\'Google::Cloud::DiscoveryEngine::V1alph"
          + "ab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ProjectProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GetProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetProjectRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectRequest_descriptor,
            new java.lang.String[] {
              "Name", "AcceptDataUseTerms", "DataUseTermsVersion",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ProvisionProjectMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_discoveryengine_v1alpha_ReportConsentChangeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_ReportConsentChangeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ReportConsentChangeRequest_descriptor,
            new java.lang.String[] {
              "ConsentChangeAction", "Project", "ServiceTermId", "ServiceTermVersion",
            });
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
    com.google.cloud.discoveryengine.v1alpha.ProjectProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
