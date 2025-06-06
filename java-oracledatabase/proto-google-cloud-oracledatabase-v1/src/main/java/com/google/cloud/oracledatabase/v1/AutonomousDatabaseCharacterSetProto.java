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
// source: google/cloud/oracledatabase/v1/autonomous_database_character_set.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oracledatabase.v1;

public final class AutonomousDatabaseCharacterSetProto {
  private AutonomousDatabaseCharacterSetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_oracledatabase_v1_AutonomousDatabaseCharacterSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_oracledatabase_v1_AutonomousDatabaseCharacterSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/oracledatabase/v1/autonom"
          + "ous_database_character_set.proto\022\036google"
          + ".cloud.oracledatabase.v1\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\"\210\004\n\036AutonomousDatabaseCharacterSet\022"
          + "\021\n\004name\030\001 \001(\tB\003\340A\010\022p\n\022character_set_type"
          + "\030\002 \001(\0162O.google.cloud.oracledatabase.v1."
          + "AutonomousDatabaseCharacterSet.Character"
          + "SetTypeB\003\340A\003\022\032\n\rcharacter_set\030\003 \001(\tB\003\340A\003"
          + "\"R\n\020CharacterSetType\022\"\n\036CHARACTER_SET_TY"
          + "PE_UNSPECIFIED\020\000\022\014\n\010DATABASE\020\001\022\014\n\010NATION"
          + "AL\020\002:\360\001\352A\354\001\n<oracledatabase.googleapis.c"
          + "om/AutonomousDatabaseCharacterSet\022kproje"
          + "cts/{project}/locations/{location}/auton"
          + "omousDatabaseCharacterSets/{autonomous_d"
          + "atabase_character_set}*\037autonomousDataba"
          + "seCharacterSets2\036autonomousDatabaseChara"
          + "cterSetB\375\001\n\"com.google.cloud.oracledatab"
          + "ase.v1B#AutonomousDatabaseCharacterSetPr"
          + "otoP\001ZJcloud.google.com/go/oracledatabas"
          + "e/apiv1/oracledatabasepb;oracledatabasep"
          + "b\252\002\036Google.Cloud.OracleDatabase.V1\312\002\036Goo"
          + "gle\\Cloud\\OracleDatabase\\V1\352\002!Google::Cl"
          + "oud::OracleDatabase::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_oracledatabase_v1_AutonomousDatabaseCharacterSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_oracledatabase_v1_AutonomousDatabaseCharacterSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_oracledatabase_v1_AutonomousDatabaseCharacterSet_descriptor,
            new java.lang.String[] {
              "Name", "CharacterSetType", "CharacterSet",
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
