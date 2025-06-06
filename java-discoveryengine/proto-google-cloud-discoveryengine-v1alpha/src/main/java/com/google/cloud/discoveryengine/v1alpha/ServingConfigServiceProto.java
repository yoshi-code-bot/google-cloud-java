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
// source: google/cloud/discoveryengine/v1alpha/serving_config_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class ServingConfigServiceProto {
  private ServingConfigServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetServingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetServingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Agoogle/cloud/discoveryengine/v1alpha/serving_config_service.proto\022$google.clou"
          + "d.discoveryengine.v1alpha\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0329google/cloud/discoveryengine/v1alpha/serving_config.proto\032"
          + " google/protobuf/field_mask.proto\"\237\001\n"
          + "\032UpdateServingConfigRequest\022P\n"
          + "\016serving_config\030\001"
          + " \001(\01323.google.cloud.discoveryengine.v1alpha.ServingConfigB\003\340A\002\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"]\n"
          + "\027GetServingConfigRequest\022B\n"
          + "\004name\030\001 \001(\tB4\340A\002\372A.\n"
          + ",discoveryengine.googleapis.com/ServingConfig\"\222\001\n"
          + "\031ListServingConfigsRequest\022D\n"
          + "\006parent\030\001 \001("
          + "\tB4\340A\002\372A.\022,discoveryengine.googleapis.com/ServingConfig\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\"\203\001\n"
          + "\032ListServingConfigsResponse\022L\n"
          + "\017serving_configs\030\001"
          + " \003(\01323.google.cloud.discoveryengine.v1alpha.ServingConfig\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\221\013\n"
          + "\024ServingConfigService\022\377\003\n"
          + "\023UpdateServingConfig\022@.google.cloud.discoveryengine.v1alpha.UpdateServingConfi"
          + "gRequest\0323.google.cloud.discoveryengine."
          + "v1alpha.ServingConfig\"\360\002\332A\032serving_confi"
          + "g,update_mask\202\323\344\223\002\314\0022S/v1alpha/{serving_"
          + "config.name=projects/*/locations/*/dataStores/*/servingConfigs/*}:\016serving_confi"
          + "gZs2a/v1alpha/{serving_config.name=projects/*/locations/*/collections/*/dataStor"
          + "es/*/servingConfigs/*}:\016serving_configZp2^/v1alpha/{serving_config.name=projects"
          + "/*/locations/*/collections/*/engines/*/servingConfigs/*}:\016serving_config\022\206\003\n"
          + "\020GetServingConfig\022=.google.cloud.discoveryen"
          + "gine.v1alpha.GetServingConfigRequest\0323.google.cloud.discoveryengine.v1alpha.Serv"
          + "ingConfig\"\375\001\332A\004name\202\323\344\223\002\357\001\022D/v1alpha/{na"
          + "me=projects/*/locations/*/dataStores/*/servingConfigs/*}ZT\022R/v1alpha/{name=proje"
          + "cts/*/locations/*/collections/*/dataStores/*/servingConfigs/*}ZQ\022O/v1alpha/{name"
          + "=projects/*/locations/*/collections/*/engines/*/servingConfigs/*}\022\231\003\n"
          + "\022ListServingConfigs\022?.google.cloud.discoveryengine."
          + "v1alpha.ListServingConfigsRequest\032@.google.cloud.discoveryengine.v1alpha.ListSer"
          + "vingConfigsResponse\"\377\001\332A\006parent\202\323\344\223\002\357\001\022D"
          + "/v1alpha/{parent=projects/*/locations/*/dataStores/*}/servingConfigsZT\022R/v1alpha"
          + "/{parent=projects/*/locations/*/collections/*/dataStores/*}/servingConfigsZQ\022O/v"
          + "1alpha/{parent=projects/*/locations/*/collections/*/engines/*}/servingConfigs\032R\312"
          + "A\036discoveryengine.googleapis.com\322A.https"
          + "://www.googleapis.com/auth/cloud-platformB\245\002\n"
          + "(com.google.cloud.discoveryengine.v1alphaB\031ServingConfigServiceProtoP\001ZRclo"
          + "ud.google.com/go/discoveryengine/apiv1alpha/discoveryenginepb;discoveryenginepb\242"
          + "\002\017DISCOVERYENGINE\252\002$Google.Cloud.Discove"
          + "ryEngine.V1Alpha\312\002$Google\\Cloud\\Discover"
          + "yEngine\\V1alpha\352\002\'Google::Cloud::DiscoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.ServingConfigProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateServingConfigRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetServingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_GetServingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetServingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListServingConfigsResponse_descriptor,
            new java.lang.String[] {
              "ServingConfigs", "NextPageToken",
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
    com.google.cloud.discoveryengine.v1alpha.ServingConfigProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
