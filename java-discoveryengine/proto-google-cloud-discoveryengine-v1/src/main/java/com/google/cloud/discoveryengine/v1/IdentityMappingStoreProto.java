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
// source: google/cloud/discoveryengine/v1/identity_mapping_store.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public final class IdentityMappingStoreProto {
  private IdentityMappingStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_IdentityMappingStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_IdentityMappingStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_IdentityMappingEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_IdentityMappingEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/discoveryengine/v1/identi"
          + "ty_mapping_store.proto\022\037google.cloud.dis"
          + "coveryengine.v1\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\0329goo"
          + "gle/cloud/discoveryengine/v1/cmek_config"
          + "_service.proto\"\237\002\n\024IdentityMappingStore\022"
          + "\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014kms_key_name\030\003 \001(\t"
          + "B\003\340A\004\022E\n\013cmek_config\030\004 \001(\0132+.google.clou"
          + "d.discoveryengine.v1.CmekConfigB\003\340A\003:\221\001\352"
          + "A\215\001\n3discoveryengine.googleapis.com/Iden"
          + "tityMappingStore\022Vprojects/{project}/loc"
          + "ations/{location}/identityMappingStores/"
          + "{identity_mapping_store}\"u\n\024IdentityMapp"
          + "ingEntry\022\021\n\007user_id\030\002 \001(\tH\000\022\022\n\010group_id\030"
          + "\003 \001(\tH\000\022\036\n\021external_identity\030\001 \001(\tB\003\340A\002B"
          + "\026\n\024identity_provider_idB\214\002\n#com.google.c"
          + "loud.discoveryengine.v1B\031IdentityMapping"
          + "StoreProtoP\001ZMcloud.google.com/go/discov"
          + "eryengine/apiv1/discoveryenginepb;discov"
          + "eryenginepb\242\002\017DISCOVERYENGINE\252\002\037Google.C"
          + "loud.DiscoveryEngine.V1\312\002\037Google\\Cloud\\D"
          + "iscoveryEngine\\V1\352\002\"Google::Cloud::Disco"
          + "veryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.CmekConfigServiceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_IdentityMappingStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_IdentityMappingStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_IdentityMappingStore_descriptor,
            new java.lang.String[] {
              "Name", "KmsKeyName", "CmekConfig",
            });
    internal_static_google_cloud_discoveryengine_v1_IdentityMappingEntry_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_IdentityMappingEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_IdentityMappingEntry_descriptor,
            new java.lang.String[] {
              "UserId", "GroupId", "ExternalIdentity", "IdentityProviderId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.CmekConfigServiceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
