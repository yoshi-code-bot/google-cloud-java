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
// source: google/devtools/artifactregistry/v1beta2/package.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1beta2;

public final class PackageProto {
  private PackageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_Package_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_Package_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_GetPackageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_GetPackageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1beta2_DeletePackageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_DeletePackageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1bet"
          + "a2/package.proto\022(google.devtools.artifa"
          + "ctregistry.v1beta2\032\037google/protobuf/time"
          + "stamp.proto\"\217\001\n\007Package\022\014\n\004name\030\001 \001(\t\022\024\n"
          + "\014display_name\030\002 \001(\t\022/\n\013create_time\030\005 \001(\013"
          + "2\032.google.protobuf.Timestamp\022/\n\013update_t"
          + "ime\030\006 \001(\0132\032.google.protobuf.Timestamp\"L\n"
          + "\023ListPackagesRequest\022\016\n\006parent\030\001 \001(\t\022\021\n\t"
          + "page_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"t\n\024L"
          + "istPackagesResponse\022C\n\010packages\030\001 \003(\01321."
          + "google.devtools.artifactregistry.v1beta2"
          + ".Package\022\027\n\017next_page_token\030\002 \001(\t\"!\n\021Get"
          + "PackageRequest\022\014\n\004name\030\001 \001(\t\"$\n\024DeletePa"
          + "ckageRequest\022\014\n\004name\030\001 \001(\tB\220\002\n,com.googl"
          + "e.devtools.artifactregistry.v1beta2B\014Pac"
          + "kageProtoP\001ZUcloud.google.com/go/artifac"
          + "tregistry/apiv1beta2/artifactregistrypb;"
          + "artifactregistrypb\252\002%Google.Cloud.Artifa"
          + "ctRegistry.V1Beta2\312\002%Google\\Cloud\\Artifa"
          + "ctRegistry\\V1beta2\352\002(Google::Cloud::Arti"
          + "factRegistry::V1beta2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1beta2_Package_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_Package_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_Package_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "CreateTime", "UpdateTime",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_ListPackagesResponse_descriptor,
            new java.lang.String[] {
              "Packages", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_GetPackageRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1beta2_GetPackageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_GetPackageRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1beta2_DeletePackageRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1beta2_DeletePackageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1beta2_DeletePackageRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
