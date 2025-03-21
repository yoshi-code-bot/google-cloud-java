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
// source: google/cloud/baremetalsolution/v2/osimage.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.baremetalsolution.v2;

public final class OsImageProto {
  private OsImageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_OSImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_OSImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListOSImagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListOSImagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListOSImagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListOSImagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/baremetalsolution/v2/osim"
          + "age.proto\022!google.cloud.baremetalsolutio"
          + "n.v2\032\037google/api/field_behavior.proto\032\031g"
          + "oogle/api/resource.proto\"\206\002\n\007OSImage\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\003\022\014\n\004code\030\002 \001(\t\022\023\n\013descrip"
          + "tion\030\003 \001(\t\022!\n\031applicable_instance_types\030"
          + "\004 \003(\t\022#\n\033supported_network_templates\030\005 \003"
          + "(\t:}\352Az\n(baremetalsolution.googleapis.co"
          + "m/OsImage\022;projects/{project}/locations/"
          + "{location}/osImages/{os_image}*\010osImages"
          + "2\007osImage\"w\n\023ListOSImagesRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.c"
          + "om/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\"n\n\024ListOSImagesResponse\022=\n\tos"
          + "_images\030\001 \003(\0132*.google.cloud.baremetalso"
          + "lution.v2.OSImage\022\027\n\017next_page_token\030\002 \001"
          + "(\tB\373\001\n%com.google.cloud.baremetalsolutio"
          + "n.v2B\014OsImageProtoP\001ZScloud.google.com/g"
          + "o/baremetalsolution/apiv2/baremetalsolut"
          + "ionpb;baremetalsolutionpb\252\002!Google.Cloud"
          + ".BareMetalSolution.V2\312\002!Google\\Cloud\\Bar"
          + "eMetalSolution\\V2\352\002$Google::Cloud::BareM"
          + "etalSolution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_OSImage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_OSImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_OSImage_descriptor,
            new java.lang.String[] {
              "Name", "Code", "Description", "ApplicableInstanceTypes", "SupportedNetworkTemplates",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListOSImagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_ListOSImagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListOSImagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListOSImagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListOSImagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListOSImagesResponse_descriptor,
            new java.lang.String[] {
              "OsImages", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
