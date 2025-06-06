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
// source: google/cloud/aiplatform/v1/vertex_rag_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class VertexRagServiceProto {
  private VertexRagServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RagQuery_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RagQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_RagResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_RagResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RagContexts_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RagContexts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RagContexts_Context_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RagContexts_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RetrieveContextsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_AugmentPromptResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AugmentPromptResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_Parameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_Parameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CorroborateContentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CorroborateContentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Fact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Fact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Claim_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Claim_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "3google/cloud/aiplatform/v1/vertex_rag_service.proto\022\032google.cloud.aiplatform.v"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032(go"
          + "ogle/cloud/aiplatform/v1/content.proto\032%google/cloud/aiplatform/v1/tool.proto\0320g"
          + "oogle/cloud/aiplatform/v1/vertex_rag_data.proto\"{\n"
          + "\010RagQuery\022\023\n"
          + "\004text\030\001 \001(\tB\003\340A\001H\000\022Q\n"
          + "\024rag_retrieval_config\030\006 \001(\0132..google."
          + "cloud.aiplatform.v1.RagRetrievalConfigB\003\340A\001B\007\n"
          + "\005query\"\264\004\n"
          + "\027RetrieveContextsRequest\022^\n"
          + "\020vertex_rag_store\030\002 \001(\0132B.google.clou"
          + "d.aiplatform.v1.RetrieveContextsRequest.VertexRagStoreH\000\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\0228\n"
          + "\005query\030\003"
          + " \001(\0132$.google.cloud.aiplatform.v1.RagQueryB\003\340A\002\032\264\002\n"
          + "\016VertexRagStore\022j\n\r"
          + "rag_resources\030\003 \003(\0132N.google.cloud.aiplatfor"
          + "m.v1.RetrieveContextsRequest.VertexRagStore.RagResourceB\003\340A\001\022-\n"
          + "\031vector_distance_threshold\030\002"
          + " \001(\001B\005\030\001\340A\001H\000\210\001\001\032i\n"
          + "\013RagResource\022?\n\n"
          + "rag_corpus\030\001 \001(\tB+\340A\001\372A%\n"
          + "#aiplatform.googleapis.com/RagCorpus\022\031\n"
          + "\014rag_file_ids\030\002 \003(\tB\003\340A\001B\034\n"
          + "\032_vector_distance_thresholdB\r\n"
          + "\013data_source\"\356\001\n"
          + "\013RagContexts\022A\n"
          + "\010contexts\030\001"
          + " \003(\0132/.google.cloud.aiplatform.v1.RagContexts.Context\032\233\001\n"
          + "\007Context\022\022\n\n"
          + "source_uri\030\001 \001(\t\022\033\n"
          + "\023source_display_name\030\005 \001(\t\022\014\n"
          + "\004text\030\002 \001(\t\022\022\n"
          + "\005score\030\006 \001(\001H\000\210\001\001\0223\n"
          + "\005chunk\030\007 \001(\0132$.google.cloud.aiplatform.v1.RagChunkB\010\n"
          + "\006_score\"U\n"
          + "\030RetrieveContextsResponse\0229\n"
          + "\010contexts\030\001 \001(\0132\'.google.cloud.aiplatform.v1.RagContexts\"\356\002\n"
          + "\024AugmentPromptRequest\022K\n"
          + "\020vertex_rag_store\030\004 \001(\0132*"
          + ".google.cloud.aiplatform.v1.VertexRagStoreB\003\340A\001H\000\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022:\n"
          + "\010contents\030\002"
          + " \003(\0132#.google.cloud.aiplatform.v1.ContentB\003\340A\001\022J\n"
          + "\005model\030\003 \001(\01326.google.cloud.a"
          + "iplatform.v1.AugmentPromptRequest.ModelB\003\340A\001\0327\n"
          + "\005Model\022\022\n"
          + "\005model\030\001 \001(\tB\003\340A\001\022\032\n\r"
          + "model_version\030\002 \001(\tB\003\340A\001B\r\n"
          + "\013data_source\"\207\001\n"
          + "\025AugmentPromptResponse\022=\n"
          + "\020augmented_prompt\030\001 \003(\0132#.google.cloud.aiplatform.v1.Content\022/\n"
          + "\005facts\030\002 \003(\0132 .google.cloud.aiplatform.v1.Fact\"\342\002\n"
          + "\031CorroborateContentRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022>\n"
          + "\007content\030\002 \001(\013"
          + "2#.google.cloud.aiplatform.v1.ContentB\003\340A\001H\000\210\001\001\0224\n"
          + "\005facts\030\003 \003(\0132 .google.cloud.aiplatform.v1.FactB\003\340A\001\022Y\n\n"
          + "parameters\030\004 \001("
          + "\0132@.google.cloud.aiplatform.v1.CorroborateContentRequest.ParametersB\003\340A\001\032-\n\n"
          + "Parameters\022\037\n"
          + "\022citation_threshold\030\001 \001(\001B\003\340A\001B\n\n"
          + "\010_content\"\211\001\n"
          + "\032CorroborateContentResponse\022 \n"
          + "\023corroboration_score\030\001 \001(\002H\000\210\001\001\0221\n"
          + "\006claims\030\002 \003(\0132!.google.cloud.aiplatform.v1.ClaimB\026\n"
          + "\024_corroboration_score\"\226\002\n"
          + "\004Fact\022\022\n"
          + "\005query\030\001 \001(\tH\000\210\001\001\022\022\n"
          + "\005title\030\002 \001(\tH\001\210\001\001\022\020\n"
          + "\003uri\030\003 \001(\tH\002\210\001\001\022\024\n"
          + "\007summary\030\004 \001(\tH\003\210\001\001\022 \n"
          + "\017vector_distance\030\005 \001(\001B\002\030\001H\004\210\001\001\022\022\n"
          + "\005score\030\006 \001(\001H\005\210\001\001\0228\n"
          + "\005chunk\030\007"
          + " \001(\0132$.google.cloud.aiplatform.v1.RagChunkH\006\210\001\001B\010\n"
          + "\006_queryB\010\n"
          + "\006_titleB\006\n"
          + "\004_uriB\n\n"
          + "\010_summaryB\022\n"
          + "\020_vector_distanceB\010\n"
          + "\006_scoreB\010\n"
          + "\006_chunk\"\213\001\n"
          + "\005Claim\022\030\n"
          + "\013start_index\030\001 \001(\005H\000\210\001\001\022\026\n"
          + "\tend_index\030\002 \001(\005H\001\210\001\001\022\024\n"
          + "\014fact_indexes\030\003 \003(\005\022\022\n"
          + "\005score\030\004 \001(\002H\002\210\001\001B\016\n"
          + "\014_start_indexB\014\n\n"
          + "_end_indexB\010\n"
          + "\006_score2\346\005\n"
          + "\020VertexRagService\022\315\001\n"
          + "\020RetrieveContexts\0223.google.cloud.aiplatfo"
          + "rm.v1.RetrieveContextsRequest\0324.google.cloud.aiplatform.v1.RetrieveContextsRespo"
          + "nse\"N\332A\014parent,query\202\323\344\223\0029\"4/v1/{parent="
          + "projects/*/locations/*}:retrieveContexts:\001*\022\322\001\n\r"
          + "AugmentPrompt\0220.google.cloud.aiplatform.v1.AugmentPromptRequest\0321.google"
          + ".cloud.aiplatform.v1.AugmentPromptRespon"
          + "se\"\\\332A\035parent,model,vertex_rag_store\202\323\344\223"
          + "\0026\"1/v1/{parent=projects/*/locations/*}:augmentPrompt:\001*\022\335\001\n"
          + "\022CorroborateContent\0225.google.cloud.aiplatform.v1.Corroborate"
          + "ContentRequest\0326.google.cloud.aiplatform"
          + ".v1.CorroborateContentResponse\"X\332A\024paren"
          + "t,content,facts\202\323\344\223\002;\"6/v1/{parent=proje"
          + "cts/*/locations/*}:corroborateContent:\001*"
          + "\032M\312A\031aiplatform.googleapis.com\322A.https:/"
          + "/www.googleapis.com/auth/cloud-platformB\323\001\n"
          + "\036com.google.cloud.aiplatform.v1B\025VertexRagServiceProtoP\001Z>cloud.google.com/go"
          + "/aiplatform/apiv1/aiplatformpb;aiplatfor"
          + "mpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Googl"
          + "e\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ContentProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ToolProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.VertexRagDataProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_RagQuery_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_RagQuery_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RagQuery_descriptor,
            new java.lang.String[] {
              "Text", "RagRetrievalConfig", "Query",
            });
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_descriptor,
            new java.lang.String[] {
              "VertexRagStore", "Parent", "Query", "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_descriptor =
        internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_descriptor,
            new java.lang.String[] {
              "RagResources", "VectorDistanceThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_RagResource_descriptor =
        internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_RagResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RetrieveContextsRequest_VertexRagStore_RagResource_descriptor,
            new java.lang.String[] {
              "RagCorpus", "RagFileIds",
            });
    internal_static_google_cloud_aiplatform_v1_RagContexts_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_RagContexts_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RagContexts_descriptor,
            new java.lang.String[] {
              "Contexts",
            });
    internal_static_google_cloud_aiplatform_v1_RagContexts_Context_descriptor =
        internal_static_google_cloud_aiplatform_v1_RagContexts_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_RagContexts_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RagContexts_Context_descriptor,
            new java.lang.String[] {
              "SourceUri", "SourceDisplayName", "Text", "Score", "Chunk",
            });
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_RetrieveContextsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RetrieveContextsResponse_descriptor,
            new java.lang.String[] {
              "Contexts",
            });
    internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_descriptor,
            new java.lang.String[] {
              "VertexRagStore", "Parent", "Contents", "Model", "DataSource",
            });
    internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_Model_descriptor =
        internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_AugmentPromptRequest_Model_descriptor,
            new java.lang.String[] {
              "Model", "ModelVersion",
            });
    internal_static_google_cloud_aiplatform_v1_AugmentPromptResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_AugmentPromptResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_AugmentPromptResponse_descriptor,
            new java.lang.String[] {
              "AugmentedPrompt", "Facts",
            });
    internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Content", "Facts", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_Parameters_descriptor =
        internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_Parameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CorroborateContentRequest_Parameters_descriptor,
            new java.lang.String[] {
              "CitationThreshold",
            });
    internal_static_google_cloud_aiplatform_v1_CorroborateContentResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_CorroborateContentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CorroborateContentResponse_descriptor,
            new java.lang.String[] {
              "CorroborationScore", "Claims",
            });
    internal_static_google_cloud_aiplatform_v1_Fact_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_Fact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Fact_descriptor,
            new java.lang.String[] {
              "Query", "Title", "Uri", "Summary", "VectorDistance", "Score", "Chunk",
            });
    internal_static_google_cloud_aiplatform_v1_Claim_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_Claim_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Claim_descriptor,
            new java.lang.String[] {
              "StartIndex", "EndIndex", "FactIndexes", "Score",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ContentProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ToolProto.getDescriptor();
    com.google.cloud.aiplatform.v1.VertexRagDataProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
