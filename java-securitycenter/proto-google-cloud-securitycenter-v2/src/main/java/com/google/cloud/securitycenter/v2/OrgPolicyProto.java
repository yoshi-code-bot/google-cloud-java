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
// source: google/cloud/securitycenter/v2/org_policy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public final class OrgPolicyProto {
  private OrgPolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_OrgPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_OrgPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/securitycenter/v2/org_pol"
          + "icy.proto\022\036google.cloud.securitycenter.v"
          + "2\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\"\333\001\n\tOrgPolicy\022\021\n\004n"
          + "ame\030\001 \001(\tB\003\340A\010:\272\001\352A\266\001\n\037orgpolicy.googlea"
          + "pis.com/Policy\0227organizations/{organizat"
          + "ion}/policies/{constraint_name}\022+folders"
          + "/{folder}/policies/{constraint_name}\022-pr"
          + "ojects/{project}/policies/{constraint_na"
          + "me}B\350\001\n\"com.google.cloud.securitycenter."
          + "v2B\016OrgPolicyProtoP\001ZJcloud.google.com/g"
          + "o/securitycenter/apiv2/securitycenterpb;"
          + "securitycenterpb\252\002\036Google.Cloud.Security"
          + "Center.V2\312\002\036Google\\Cloud\\SecurityCenter\\"
          + "V2\352\002!Google::Cloud::SecurityCenter::V2b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_OrgPolicy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_OrgPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_OrgPolicy_descriptor,
            new java.lang.String[] {
              "Name",
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
