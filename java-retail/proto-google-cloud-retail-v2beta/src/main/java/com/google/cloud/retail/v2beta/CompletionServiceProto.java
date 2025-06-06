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
// source: google/cloud/retail/v2beta/completion_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResultsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResultsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2beta/completion_"
          + "service.proto\022\032google.cloud.retail.v2bet"
          + "a\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\032\'go"
          + "ogle/cloud/retail/v2beta/common.proto\032.g"
          + "oogle/cloud/retail/v2beta/import_config."
          + "proto\032#google/longrunning/operations.pro"
          + "to\"\203\002\n\024CompleteQueryRequest\0226\n\007catalog\030\001"
          + " \001(\tB%\340A\002\372A\037\n\035retail.googleapis.com/Cata"
          + "log\022\022\n\005query\030\002 \001(\tB\003\340A\002\022\022\n\nvisitor_id\030\007 "
          + "\001(\t\022\026\n\016language_codes\030\003 \003(\t\022\023\n\013device_ty"
          + "pe\030\004 \001(\t\022\017\n\007dataset\030\006 \001(\t\022\027\n\017max_suggest"
          + "ions\030\005 \001(\005\022$\n\034enable_attribute_suggestio"
          + "ns\030\t \001(\010\022\016\n\006entity\030\n \001(\t\"\245\006\n\025CompleteQue"
          + "ryResponse\022^\n\022completion_results\030\001 \003(\0132B"
          + ".google.cloud.retail.v2beta.CompleteQuer"
          + "yResponse.CompletionResult\022\031\n\021attributio"
          + "n_token\030\002 \001(\t\022g\n\025recent_search_results\030\003"
          + " \003(\0132D.google.cloud.retail.v2beta.Comple"
          + "teQueryResponse.RecentSearchResultB\002\030\001\022b"
          + "\n\021attribute_results\030\004 \003(\0132G.google.cloud"
          + ".retail.v2beta.CompleteQueryResponse.Att"
          + "ributeResultsEntry\032\356\001\n\020CompletionResult\022"
          + "\022\n\nsuggestion\030\001 \001(\t\022f\n\nattributes\030\002 \003(\0132"
          + "R.google.cloud.retail.v2beta.CompleteQue"
          + "ryResponse.CompletionResult.AttributesEn"
          + "try\032^\n\017AttributesEntry\022\013\n\003key\030\001 \001(\t\022:\n\005v"
          + "alue\030\002 \001(\0132+.google.cloud.retail.v2beta."
          + "CustomAttribute:\0028\001\032/\n\022RecentSearchResul"
          + "t\022\025\n\rrecent_search\030\001 \001(\t:\002\030\001\032&\n\017Attribut"
          + "eResult\022\023\n\013suggestions\030\001 \003(\t\032z\n\025Attribut"
          + "eResultsEntry\022\013\n\003key\030\001 \001(\t\022P\n\005value\030\002 \001("
          + "\0132A.google.cloud.retail.v2beta.CompleteQ"
          + "ueryResponse.AttributeResult:\0028\0012\316\004\n\021Com"
          + "pletionService\022\277\001\n\rCompleteQuery\0220.googl"
          + "e.cloud.retail.v2beta.CompleteQueryReque"
          + "st\0321.google.cloud.retail.v2beta.Complete"
          + "QueryResponse\"I\202\323\344\223\002C\022A/v2beta/{catalog="
          + "projects/*/locations/*/catalogs/*}:compl"
          + "eteQuery\022\253\002\n\024ImportCompletionData\0227.goog"
          + "le.cloud.retail.v2beta.ImportCompletionD"
          + "ataRequest\032\035.google.longrunning.Operatio"
          + "n\"\272\001\312Ad\n7google.cloud.retail.v2beta.Impo"
          + "rtCompletionDataResponse\022)google.cloud.r"
          + "etail.v2beta.ImportMetadata\202\323\344\223\002M\"H/v2be"
          + "ta/{parent=projects/*/locations/*/catalo"
          + "gs/*}/completionData:import:\001*\032I\312A\025retai"
          + "l.googleapis.com\322A.https://www.googleapi"
          + "s.com/auth/cloud-platformB\325\001\n\036com.google"
          + ".cloud.retail.v2betaB\026CompletionServiceP"
          + "rotoP\001Z6cloud.google.com/go/retail/apiv2"
          + "beta/retailpb;retailpb\242\002\006RETAIL\252\002\032Google"
          + ".Cloud.Retail.V2Beta\312\002\032Google\\Cloud\\Reta"
          + "il\\V2beta\352\002\035Google::Cloud::Retail::V2bet"
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
              com.google.cloud.retail.v2beta.CommonProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "Catalog",
              "Query",
              "VisitorId",
              "LanguageCodes",
              "DeviceType",
              "Dataset",
              "MaxSuggestions",
              "EnableAttributeSuggestions",
              "Entity",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "CompletionResults", "AttributionToken", "RecentSearchResults", "AttributeResults",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor,
            new java.lang.String[] {
              "Suggestion", "Attributes",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_CompletionResult_AttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_RecentSearchResult_descriptor,
            new java.lang.String[] {
              "RecentSearch",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResult_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResult_descriptor,
            new java.lang.String[] {
              "Suggestions",
            });
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResultsEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResultsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CompleteQueryResponse_AttributeResultsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.CommonProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
