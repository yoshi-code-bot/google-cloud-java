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
// source: google/appengine/v1/audit_data.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public final class AuditDataProto {
  private AuditDataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_AuditData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_AuditData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_UpdateServiceMethod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_UpdateServiceMethod_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_CreateVersionMethod_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_CreateVersionMethod_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/appengine/v1/audit_data.proto\022\023"
          + "google.appengine.v1\032#google/appengine/v1"
          + "/appengine.proto\"\235\001\n\tAuditData\022B\n\016update"
          + "_service\030\001 \001(\0132(.google.appengine.v1.Upd"
          + "ateServiceMethodH\000\022B\n\016create_version\030\002 \001"
          + "(\0132(.google.appengine.v1.CreateVersionMe"
          + "thodH\000B\010\n\006method\"Q\n\023UpdateServiceMethod\022"
          + ":\n\007request\030\001 \001(\0132).google.appengine.v1.U"
          + "pdateServiceRequest\"Q\n\023CreateVersionMeth"
          + "od\022:\n\007request\030\001 \001(\0132).google.appengine.v"
          + "1.CreateVersionRequestB\277\001\n\027com.google.ap"
          + "pengine.v1B\016AuditDataProtoP\001Z;cloud.goog"
          + "le.com/go/appengine/apiv1/appenginepb;ap"
          + "penginepb\252\002\031Google.Cloud.AppEngine.V1\312\002\031"
          + "Google\\Cloud\\AppEngine\\V1\352\002\034Google::Clou"
          + "d::AppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.appengine.v1.AppengineProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_AuditData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_AuditData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_AuditData_descriptor,
            new java.lang.String[] {
              "UpdateService", "CreateVersion", "Method",
            });
    internal_static_google_appengine_v1_UpdateServiceMethod_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_UpdateServiceMethod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_UpdateServiceMethod_descriptor,
            new java.lang.String[] {
              "Request",
            });
    internal_static_google_appengine_v1_CreateVersionMethod_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_CreateVersionMethod_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_CreateVersionMethod_descriptor,
            new java.lang.String[] {
              "Request",
            });
    com.google.appengine.v1.AppengineProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
