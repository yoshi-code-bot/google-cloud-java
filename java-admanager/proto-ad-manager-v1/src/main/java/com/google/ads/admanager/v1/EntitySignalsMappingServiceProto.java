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
// source: google/ads/admanager/v1/entity_signals_mapping_service.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public final class EntitySignalsMappingServiceProto {
  private EntitySignalsMappingServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_GetEntitySignalsMappingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_GetEntitySignalsMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_CreateEntitySignalsMappingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_CreateEntitySignalsMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_UpdateEntitySignalsMappingRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_UpdateEntitySignalsMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "<google/ads/admanager/v1/entity_signals_mapping_service.proto\022\027google.ads.adman"
          + "ager.v1\032=google/ads/admanager/v1/entity_"
          + "signals_mapping_messages.proto\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031google/api/resource.proto\032"
          + " google/protobuf/field_mask.proto\"e\n"
          + "\036GetEntitySignalsMappingRequest\022C\n"
          + "\004name\030\001 \001(\tB5\340A\002\372A/\n"
          + "-admanager.googleapis.com/EntitySignalsMapping\"\314\001\n"
          + " ListEntitySignalsMappingsRequest\0228\n"
          + "\006parent\030\001 \001(\tB(\340A\002\372A\"\n"
          + " admanager.googleapis.com/Network\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\022\021\n"
          + "\004skip\030\006 \001(\005B\003\340A\001\"\261\001\n"
          + "!CreateEntitySignalsMappingRequest\0228\n"
          + "\006parent\030\001 \001(\tB(\340A\002\372A\"\n"
          + " admanager.googleapis.com/Network\022R\n"
          + "\026entity_signals_mapping\030\002"
          + " \001(\0132-.google.ads.admanager.v1.EntitySignalsMappingB\003\340A\002\"\255\001\n"
          + "!UpdateEntitySignalsMappingRequest\022R\n"
          + "\026entity_signals_mapping\030\001"
          + " \001(\0132-.google.ads.admanager.v1.EntitySignalsMappingB\003\340A\002\0224\n"
          + "\013update_mask\030\002"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"\240\001\n"
          + "!ListEntitySignalsMappingsResponse\022N\n"
          + "\027entity_signals_mappings\030\001 \003(\0132-.g"
          + "oogle.ads.admanager.v1.EntitySignalsMapping\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\022\n\n"
          + "total_size\030\003 \001(\005\"\266\001\n"
          + "\'BatchCreateEntitySignalsMappingsRequest\0228\n"
          + "\006parent\030\001 \001(\tB(\340A\002\372A\"\n"
          + " admanager.googleapis.com/Network\022Q\n"
          + "\010requests\030\002"
          + " \003(\0132:.google.ads.admanager.v1.CreateEntitySignalsMappingRequestB\003\340A\002\"z\n"
          + "(BatchCreateEntitySignalsMappingsResponse\022N\n"
          + "\027entity_signals_mappings\030\001 \003(\0132-.google."
          + "ads.admanager.v1.EntitySignalsMapping\"\266\001\n"
          + "\'BatchUpdateEntitySignalsMappingsRequest\0228\n"
          + "\006parent\030\001 \001(\tB(\340A\002\372A\"\n"
          + " admanager.googleapis.com/Network\022Q\n"
          + "\010requests\030\002 \003(\0132:."
          + "google.ads.admanager.v1.UpdateEntitySignalsMappingRequestB\003\340A\002\"z\n"
          + "(BatchUpdateEntitySignalsMappingsResponse\022N\n"
          + "\027entity_signals_mappings\030\001"
          + " \003(\0132-.google.ads.admanager.v1.EntitySignalsMapping2\220\014\n"
          + "\033EntitySignalsMappingService\022\277\001\n"
          + "\027GetEntitySignalsMapping\0227.google.ads.admanager.v1.GetEnti"
          + "tySignalsMappingRequest\032-.google.ads.adm"
          + "anager.v1.EntitySignalsMapping\"<\332A\004name\202"
          + "\323\344\223\002/\022-/v1/{name=networks/*/entitySignalsMappings/*}\022\322\001\n"
          + "\031ListEntitySignalsMappings\0229.google.ads.admanager.v1.ListEntityS"
          + "ignalsMappingsRequest\032:.google.ads.admanager.v1.ListEntitySignalsMappingsRespons"
          + "e\">\332A\006parent\202\323\344\223\002/\022-/v1/{parent=networks/*}/entitySignalsMappings\022\366\001\n"
          + "\032CreateEntitySignalsMapping\022:.google.ads.admanager."
          + "v1.CreateEntitySignalsMappingRequest\032-.google.ads.admanager.v1.EntitySignalsMapp"
          + "ing\"m\332A\035parent,entity_signals_mapping\202\323\344"
          + "\223\002G\"-/v1/{parent=networks/*}/entitySignalsMappings:\026entity_signals_mapping\022\223\002\n"
          + "\032UpdateEntitySignalsMapping\022:.google.ads.a"
          + "dmanager.v1.UpdateEntitySignalsMappingRequest\032-.google.ads.admanager.v1.EntitySi"
          + "gnalsMapping\"\211\001\332A\"entity_signals_mapping"
          + ",update_mask\202\323\344\223\002^2D/v1/{entity_signals_"
          + "mapping.name=networks/*/entitySignalsMappings/*}:\026entity_signals_mapping\022\377\001\n"
          + " BatchCreateEntitySignalsMappings\022@.google.a"
          + "ds.admanager.v1.BatchCreateEntitySignalsMappingsRequest\032A.google.ads.admanager.v"
          + "1.BatchCreateEntitySignalsMappingsRespon"
          + "se\"V\332A\017parent,requests\202\323\344\223\002>\"9/v1/{paren"
          + "t=networks/*}/entitySignalsMappings:batchCreate:\001*\022\377\001\n"
          + " BatchUpdateEntitySignalsMappings\022@.google.ads.admanager.v1.BatchU"
          + "pdateEntitySignalsMappingsRequest\032A.google.ads.admanager.v1.BatchUpdateEntitySig"
          + "nalsMappingsResponse\"V\332A\017parent,requests"
          + "\202\323\344\223\002>\"9/v1/{parent=networks/*}/entitySi"
          + "gnalsMappings:batchUpdate:\001*\032G\312A\030admanag"
          + "er.googleapis.com\322A)https://www.googleapis.com/auth/admanagerB\324\001\n"
          + "\033com.google.ads.admanager.v1B EntitySignalsMappingServi"
          + "ceProtoP\001Z@google.golang.org/genproto/go"
          + "ogleapis/ads/admanager/v1;admanager\252\002\027Go"
          + "ogle.Ads.AdManager.V1\312\002\027Google\\Ads\\AdMan"
          + "ager\\V1\352\002\032Google::Ads::AdManager::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.ads.admanager.v1.EntitySignalsMappingMessagesProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_ads_admanager_v1_GetEntitySignalsMappingRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_admanager_v1_GetEntitySignalsMappingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_GetEntitySignalsMappingRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "Skip",
            });
    internal_static_google_ads_admanager_v1_CreateEntitySignalsMappingRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_admanager_v1_CreateEntitySignalsMappingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_CreateEntitySignalsMappingRequest_descriptor,
            new java.lang.String[] {
              "Parent", "EntitySignalsMapping",
            });
    internal_static_google_ads_admanager_v1_UpdateEntitySignalsMappingRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_admanager_v1_UpdateEntitySignalsMappingRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_UpdateEntitySignalsMappingRequest_descriptor,
            new java.lang.String[] {
              "EntitySignalsMapping", "UpdateMask",
            });
    internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_ListEntitySignalsMappingsResponse_descriptor,
            new java.lang.String[] {
              "EntitySignalsMappings", "NextPageToken", "TotalSize",
            });
    internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Requests",
            });
    internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_BatchCreateEntitySignalsMappingsResponse_descriptor,
            new java.lang.String[] {
              "EntitySignalsMappings",
            });
    internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Requests",
            });
    internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_ads_admanager_v1_BatchUpdateEntitySignalsMappingsResponse_descriptor,
            new java.lang.String[] {
              "EntitySignalsMappings",
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
    com.google.ads.admanager.v1.EntitySignalsMappingMessagesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
