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
// source: google/cloud/dialogflow/cx/v3/data_store_connection.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

public final class DataStoreConnectionProto {
  private DataStoreConnectionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_RewriterModelCallSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SearchSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SearchSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerPart_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerPart_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_CitedSnippet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_CitedSnippet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_GroundingSignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_GroundingSignals_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SafetySignals_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SafetySignals_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "9google/cloud/dialogflow/cx/v3/data_store_connection.proto\022\035google.cloud.dialog"
          + "flow.cx.v3\032\037google/api/field_behavior.proto\"\311\001\n"
          + "\023DataStoreConnection\022E\n"
          + "\017data_store_type\030\001"
          + " \001(\0162,.google.cloud.dialogflow.cx.v3.DataStoreType\022\022\n\n"
          + "data_store\030\002 \001(\t\022W\n"
          + "\030document_processing_mode\030\004 \001(\01625.googl"
          + "e.cloud.dialogflow.cx.v3.DocumentProcessingMode\"\242\022\n"
          + "\032DataStoreConnectionSignals\022|\n"
          + "\033rewriter_model_call_signals\030\001 \001(\0132R.go"
          + "ogle.cloud.dialogflow.cx.v3.DataStoreCon"
          + "nectionSignals.RewriterModelCallSignalsB\003\340A\001\022\034\n"
          + "\017rewritten_query\030\002 \001(\tB\003\340A\001\022e\n"
          + "\017search_snippets\030\003 \003(\0132G.google.cloud.dialo"
          + "gflow.cx.v3.DataStoreConnectionSignals.SearchSnippetB\003\340A\001\022\215\001\n"
          + "$answer_generation_model_call_signals\030\004 \001(\0132Z.google.cloud."
          + "dialogflow.cx.v3.DataStoreConnectionSign"
          + "als.AnswerGenerationModelCallSignalsB\003\340A\001\022\023\n"
          + "\006answer\030\005 \001(\tB\003\340A\001\022_\n"
          + "\014answer_parts\030\006 \003(\0132D.google.cloud.dialogflow.cx.v3.Dat"
          + "aStoreConnectionSignals.AnswerPartB\003\340A\001\022c\n"
          + "\016cited_snippets\030\007 \003(\0132F.google.cloud.d"
          + "ialogflow.cx.v3.DataStoreConnectionSignals.CitedSnippetB\003\340A\001\022j\n"
          + "\021grounding_signals\030\010 \001(\0132J.google.cloud.dialogflow.cx.v3."
          + "DataStoreConnectionSignals.GroundingSignalsB\003\340A\001\022d\n"
          + "\016safety_signals\030\t \001(\0132G.googl"
          + "e.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SafetySignalsB\003\340A\001\032X\n"
          + "\030RewriterModelCallSignals\022\027\n"
          + "\017rendered_prompt\030\001 \001(\t\022\024\n"
          + "\014model_output\030\002 \001(\t\022\r\n"
          + "\005model\030\003 \001(\t\032K\n\r"
          + "SearchSnippet\022\026\n"
          + "\016document_title\030\001 \001(\t\022\024\n"
          + "\014document_uri\030\002 \001(\t\022\014\n"
          + "\004text\030\003 \001(\t\032`\n"
          + " AnswerGenerationModelCallSignals\022\027\n"
          + "\017rendered_prompt\030\001 \001(\t\022\024\n"
          + "\014model_output\030\002 \001(\t\022\r\n"
          + "\005model\030\003 \001(\t\0326\n\n"
          + "AnswerPart\022\014\n"
          + "\004text\030\001 \001(\t\022\032\n"
          + "\022supporting_indices\030\002 \003(\005\032\206\001\n"
          + "\014CitedSnippet\022_\n"
          + "\016search_snippet\030\001 \001(\0132G.googl"
          + "e.cloud.dialogflow.cx.v3.DataStoreConnectionSignals.SearchSnippet\022\025\n\r"
          + "snippet_index\030\002 \001(\005\032\335\003\n"
          + "\020GroundingSignals\022n\n"
          + "\010decision\030\001 \001(\0162\\.google.cloud.dialogflow.cx.v3."
          + "DataStoreConnectionSignals.GroundingSignals.GroundingDecision\022n\n"
          + "\005score\030\002 \001(\0162_.google.cloud.dialogflow.cx.v3.DataStoreCo"
          + "nnectionSignals.GroundingSignals.GroundingScoreBucket\"m\n"
          + "\021GroundingDecision\022\"\n"
          + "\036GROUNDING_DECISION_UNSPECIFIED\020\000\022\031\n"
          + "\025ACCEPTED_BY_GROUNDING\020\001\022\031\n"
          + "\025REJECTED_BY_GROUNDING\020\002\"z\n"
          + "\024GroundingScoreBucket\022&\n"
          + "\"GROUNDING_SCORE_BUCKET_UNSPECIFIED\020\000\022\014\n"
          + "\010VERY_LOW\020\001\022\007\n"
          + "\003LOW\020\003\022\n\n"
          + "\006MEDIUM\020\004\022\010\n"
          + "\004HIGH\020\005\022\r\n"
          + "\tVERY_HIGH\020\006\032\231\004\n\r"
          + "SafetySignals\022h\n"
          + "\010decision\030\001 \001(\0162V.google.cloud.dialogflow.cx.v3.Dat"
          + "aStoreConnectionSignals.SafetySignals.SafetyDecision\022v\n"
          + "\023banned_phrase_match\030\002 \001(\0162Y.google.cloud.dialogflow.cx.v3.DataSt"
          + "oreConnectionSignals.SafetySignals.BannedPhraseMatch\022\035\n"
          + "\025matched_banned_phrase\030\003 \001(\t\"m\n"
          + "\016SafetyDecision\022\037\n"
          + "\033SAFETY_DECISION_UNSPECIFIED\020\000\022\034\n"
          + "\030ACCEPTED_BY_SAFETY_CHECK\020\001\022\034\n"
          + "\030REJECTED_BY_SAFETY_CHECK\020\002\"\227\001\n"
          + "\021BannedPhraseMatch\022#\n"
          + "\037BANNED_PHRASE_MATCH_UNSPECIFIED\020\000\022\034\n"
          + "\030BANNED_PHRASE_MATCH_NONE\020\001\022\035\n"
          + "\031BANNED_PHRASE_MATCH_QUERY\020\002\022 \n"
          + "\034BANNED_PHRASE_MATCH_RESPONSE\020\003*b\n\r"
          + "DataStoreType\022\037\n"
          + "\033DATA_STORE_TYPE_UNSPECIFIED\020\000\022\016\n\n"
          + "PUBLIC_WEB\020\001\022\020\n"
          + "\014UNSTRUCTURED\020\002\022\016\n\n"
          + "STRUCTURED\020\003*]\n"
          + "\026DocumentProcessingMode\022(\n"
          + "$DOCUMENT_PROCESSING_MODE_UNSPECIFIED\020\000\022\r\n"
          + "\tDOCUMENTS\020\001\022\n\n"
          + "\006CHUNKS\020\002B\273\001\n"
          + "!com.google.cloud.dialogflow.cx.v3B\030DataStoreConnecti"
          + "onProtoP\001Z1cloud.google.com/go/dialogflo"
          + "w/cx/apiv3/cxpb;cxpb\242\002\002DF\252\002\035Google.Cloud"
          + ".Dialogflow.Cx.V3\352\002!Google::Cloud::Dialogflow::CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnection_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnection_descriptor,
            new java.lang.String[] {
              "DataStoreType", "DataStore", "DocumentProcessingMode",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor,
            new java.lang.String[] {
              "RewriterModelCallSignals",
              "RewrittenQuery",
              "SearchSnippets",
              "AnswerGenerationModelCallSignals",
              "Answer",
              "AnswerParts",
              "CitedSnippets",
              "GroundingSignals",
              "SafetySignals",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_RewriterModelCallSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_RewriterModelCallSignals_descriptor,
            new java.lang.String[] {
              "RenderedPrompt", "ModelOutput", "Model",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SearchSnippet_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SearchSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SearchSnippet_descriptor,
            new java.lang.String[] {
              "DocumentTitle", "DocumentUri", "Text",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerGenerationModelCallSignals_descriptor,
            new java.lang.String[] {
              "RenderedPrompt", "ModelOutput", "Model",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerPart_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerPart_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_AnswerPart_descriptor,
            new java.lang.String[] {
              "Text", "SupportingIndices",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_CitedSnippet_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_CitedSnippet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_CitedSnippet_descriptor,
            new java.lang.String[] {
              "SearchSnippet", "SnippetIndex",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_GroundingSignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_GroundingSignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_GroundingSignals_descriptor,
            new java.lang.String[] {
              "Decision", "Score",
            });
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SafetySignals_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SafetySignals_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_DataStoreConnectionSignals_SafetySignals_descriptor,
            new java.lang.String[] {
              "Decision", "BannedPhraseMatch", "MatchedBannedPhrase",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
