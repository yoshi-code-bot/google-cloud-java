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
// source: google/cloud/talent/v4beta1/event_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4beta1;

public final class EventServiceProto {
  private EventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/talent/v4beta1/event_serv"
          + "ice.proto\022\033google.cloud.talent.v4beta1\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\'googl"
          + "e/cloud/talent/v4beta1/event.proto\"\224\001\n\030C"
          + "reateClientEventRequest\0223\n\006parent\030\001 \001(\tB"
          + "#\340A\002\372A\035\022\033jobs.googleapis.com/Company\022C\n\014"
          + "client_event\030\002 \001(\0132(.google.cloud.talent"
          + ".v4beta1.ClientEventB\003\340A\0022\372\002\n\014EventServi"
          + "ce\022\373\001\n\021CreateClientEvent\0225.google.cloud."
          + "talent.v4beta1.CreateClientEventRequest\032"
          + "(.google.cloud.talent.v4beta1.ClientEven"
          + "t\"\204\001\332A\023parent,client_event\202\323\344\223\002h\"3/v4bet"
          + "a1/{parent=projects/*/tenants/*}/clientE"
          + "vents:\001*Z.\")/v4beta1/{parent=projects/*}"
          + "/clientEvents:\001*\032l\312A\023jobs.googleapis.com"
          + "\322AShttps://www.googleapis.com/auth/cloud"
          + "-platform,https://www.googleapis.com/aut"
          + "h/jobsBu\n\037com.google.cloud.talent.v4beta"
          + "1B\021EventServiceProtoP\001Z7cloud.google.com"
          + "/go/talent/apiv4beta1/talentpb;talentpb\242"
          + "\002\003CTSb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.EventProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateClientEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClientEvent",
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
    com.google.cloud.talent.v4beta1.EventProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
