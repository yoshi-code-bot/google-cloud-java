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
// source: google/devtools/artifactregistry/v1/generic.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public final class GenericProto {
  private GenericProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GenericArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GenericArtifact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "1google/devtools/artifactregistry/v1/generic.proto\022#google.devtools.artifactreg"
          + "istry.v1\032\037google/api/field_behavior.prot"
          + "o\032\031google/api/resource.proto\032\037google/protobuf/timestamp.proto\"\273\002\n"
          + "\017GenericArtifact\022\014\n"
          + "\004name\030\001 \001(\t\022\017\n"
          + "\007version\030\002 \001(\t\0224\n"
          + "\013create_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003:\234\001\352A\230\001\n"
          + "/artifactregistry.googleapis.com/GenericArtifact\022epr"
          + "ojects/{project}/locations/{location}/re"
          + "positories/{repository}/genericArtifacts/{generic_artifact}B\367\001\n"
          + "\'com.google.devtools.artifactregistry.v1B\014GenericProtoP\001Z"
          + "Pcloud.google.com/go/artifactregistry/ap"
          + "iv1/artifactregistrypb;artifactregistrypb\252\002"
          + " Google.Cloud.ArtifactRegistry.V1\312\002 G"
          + "oogle\\Cloud\\ArtifactRegistry\\V1\352\002#Google"
          + "::Cloud::ArtifactRegistry::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_GenericArtifact_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_GenericArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GenericArtifact_descriptor,
            new java.lang.String[] {
              "Name", "Version", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
