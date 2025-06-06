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
// source: google/cloud/discoveryengine/v1alpha/grounded_generation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class GroundedGenerationServiceProto {
  private GroundedGenerationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_Claim_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_Claim_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Fgoogle/cloud/discoveryengine/v1alpha/grounded_generation_service.proto\022$google"
          + ".cloud.discoveryengine.v1alpha\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\0324google/cloud/"
          + "discoveryengine/v1alpha/grounding.proto\"L\n"
          + "\022CheckGroundingSpec\022\037\n"
          + "\022citation_threshold\030\001 \001(\001H\000\210\001\001B\025\n"
          + "\023_citation_threshold\"\256\003\n"
          + "\025CheckGroundingRequest\022P\n"
          + "\020grounding_config\030\001 \001(\tB6\340A\002\372A0\n"
          + ".discoveryengine.googleapis.com/GroundingConfig\022\030\n"
          + "\020answer_candidate\030\002 \001(\t\022B\n"
          + "\005facts\030\003 \003(\01323.google.clou"
          + "d.discoveryengine.v1alpha.GroundingFact\022P\n"
          + "\016grounding_spec\030\004 \001(\01328.google.cloud.d"
          + "iscoveryengine.v1alpha.CheckGroundingSpec\022`\n"
          + "\013user_labels\030\005 \003(\0132K.google.cloud.di"
          + "scoveryengine.v1alpha.CheckGroundingRequest.UserLabelsEntry\0321\n"
          + "\017UserLabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"\245\003\n"
          + "\026CheckGroundingResponse\022\032\n\r"
          + "support_score\030\001 \001(\002H\000\210\001\001\022E\n"
          + "\014cited_chunks\030\003"
          + " \003(\0132/.google.cloud.discoveryengine.v1alpha.FactChunk\022R\n"
          + "\006claims\030\004 \003(\0132B.google.cloud.discoveryeng"
          + "ine.v1alpha.CheckGroundingResponse.Claim\032\301\001\n"
          + "\005Claim\022\026\n"
          + "\tstart_pos\030\001 \001(\005H\000\210\001\001\022\024\n"
          + "\007end_pos\030\002 \001(\005H\001\210\001\001\022\022\n\n"
          + "claim_text\030\003 \001(\t\022\030\n"
          + "\020citation_indices\030\004 \003(\005\022%\n"
          + "\030grounding_check_required\030\006 \001(\010H\002\210\001\001B\014\n\n"
          + "_start_posB\n\n"
          + "\010_end_posB\033\n"
          + "\031_grounding_check_requiredB\020\n"
          + "\016_support_score2\325\002\n"
          + "\031GroundedGenerationService\022\343\001\n"
          + "\016CheckGrounding\022;.google.cloud.discoveryengine.v1alpha.CheckGroundingReq"
          + "uest\032<.google.cloud.discoveryengine.v1al"
          + "pha.CheckGroundingResponse\"V\202\323\344\223\002P\"K/v1a"
          + "lpha/{grounding_config=projects/*/locati"
          + "ons/*/groundingConfigs/*}:check:\001*\032R\312A\036d"
          + "iscoveryengine.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformB\252\002\n"
          + "(com.google.cloud.discoveryengine.v1alphaB\036GroundedGenerationServiceProtoP\001ZRc"
          + "loud.google.com/go/discoveryengine/apiv1alpha/discoveryenginepb;discoveryenginep"
          + "b\242\002\017DISCOVERYENGINE\252\002$Google.Cloud.Disco"
          + "veryEngine.V1Alpha\312\002$Google\\Cloud\\Discov"
          + "eryEngine\\V1alpha\352\002\'Google::Cloud::DiscoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.GroundingProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingSpec_descriptor,
            new java.lang.String[] {
              "CitationThreshold",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_descriptor,
            new java.lang.String[] {
              "GroundingConfig", "AnswerCandidate", "Facts", "GroundingSpec", "UserLabels",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_UserLabelsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingRequest_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_descriptor,
            new java.lang.String[] {
              "SupportScore", "CitedChunks", "Claims",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_Claim_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_Claim_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CheckGroundingResponse_Claim_descriptor,
            new java.lang.String[] {
              "StartPos", "EndPos", "ClaimText", "CitationIndices", "GroundingCheckRequired",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.GroundingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
