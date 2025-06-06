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
// source: google/cloud/support/v2beta/escalation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.support.v2beta;

public final class EscalationProto {
  private EscalationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_support_v2beta_Escalation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2beta_Escalation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/support/v2beta/escalation"
          + ".proto\022\033google.cloud.support.v2beta\032\037goo"
          + "gle/api/field_behavior.proto\"\322\001\n\nEscalat"
          + "ion\022C\n\006reason\030\004 \001(\0162..google.cloud.suppo"
          + "rt.v2beta.Escalation.ReasonB\003\340A\002\022\032\n\rjust"
          + "ification\030\005 \001(\tB\003\340A\002\"c\n\006Reason\022\026\n\022REASON"
          + "_UNSPECIFIED\020\000\022\023\n\017RESOLUTION_TIME\020\001\022\027\n\023T"
          + "ECHNICAL_EXPERTISE\020\002\022\023\n\017BUSINESS_IMPACT\020"
          + "\003B\314\001\n\037com.google.cloud.support.v2betaB\017E"
          + "scalationProtoP\001Z9cloud.google.com/go/su"
          + "pport/apiv2beta/supportpb;supportpb\252\002\033Go"
          + "ogle.Cloud.Support.V2Beta\312\002\033Google\\Cloud"
          + "\\Support\\V2beta\352\002\036Google::Cloud::Support"
          + "::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_support_v2beta_Escalation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_support_v2beta_Escalation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_support_v2beta_Escalation_descriptor,
            new java.lang.String[] {
              "Reason", "Justification",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
