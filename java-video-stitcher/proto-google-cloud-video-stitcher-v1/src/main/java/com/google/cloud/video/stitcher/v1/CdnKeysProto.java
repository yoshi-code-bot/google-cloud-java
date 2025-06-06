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
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.video.stitcher.v1;

public final class CdnKeysProto {
  private CdnKeysProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_CdnKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_CdnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_TokenConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_TokenConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "-google/cloud/video/stitcher/v1/cdn_key"
          + "s.proto\022\036google.cloud.video.stitcher.v1\032"
          + "\037google/api/field_behavior.proto\032\031google/api/resource.proto\"\365\002\n"
          + "\006CdnKey\022F\n"
          + "\016google_cdn_key\030\005"
          + " \001(\0132,.google.cloud.video.stitcher.v1.GoogleCdnKeyH\000\022F\n"
          + "\016akamai_cdn_key\030\006"
          + " \001(\0132,.google.cloud.video.stitcher.v1.AkamaiCdnKeyH\000\022D\n\r"
          + "media_cdn_key\030\010 \001(\0132+."
          + "google.cloud.video.stitcher.v1.MediaCdnKeyH\000\022\014\n"
          + "\004name\030\001 \001(\t\022\020\n"
          + "\010hostname\030\004 \001(\t:c\352A`\n"
          + "#videostitcher.googleapis.com/CdnKey\0229"
          + "projects/{project}/locations/{location}/cdnKeys/{cdn_key}B\020\n"
          + "\016cdn_key_config\":\n"
          + "\014GoogleCdnKey\022\030\n"
          + "\013private_key\030\001 \001(\014B\003\340A\004\022\020\n"
          + "\010key_name\030\002 \001(\t\"&\n"
          + "\014AkamaiCdnKey\022\026\n"
          + "\ttoken_key\030\001 \001(\014B\003\340A\004\"\272\001\n"
          + "\013MediaCdnKey\022\030\n"
          + "\013private_key\030\001 \001(\014B\003\340A\004\022\020\n"
          + "\010key_name\030\002 \001(\t\022R\n"
          + "\014token_config\030\003 \001(\01327.google.cloud.video.s"
          + "titcher.v1.MediaCdnKey.TokenConfigB\003\340A\001\032+\n"
          + "\013TokenConfig\022\034\n"
          + "\017query_parameter\030\001 \001(\tB\003\340A\001Bt\n"
          + "\"com.google.cloud.video.stitcher.v1B\014CdnKeysProtoP\001Z>cloud.google.com/go/"
          + "video/stitcher/apiv1/stitcherpb;stitcherpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_video_stitcher_v1_CdnKey_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_video_stitcher_v1_CdnKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_CdnKey_descriptor,
            new java.lang.String[] {
              "GoogleCdnKey", "AkamaiCdnKey", "MediaCdnKey", "Name", "Hostname", "CdnKeyConfig",
            });
    internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor,
            new java.lang.String[] {
              "PrivateKey", "KeyName",
            });
    internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_AkamaiCdnKey_descriptor,
            new java.lang.String[] {
              "TokenKey",
            });
    internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_descriptor,
            new java.lang.String[] {
              "PrivateKey", "KeyName", "TokenConfig",
            });
    internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_TokenConfig_descriptor =
        internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_TokenConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_video_stitcher_v1_MediaCdnKey_TokenConfig_descriptor,
            new java.lang.String[] {
              "QueryParameter",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
