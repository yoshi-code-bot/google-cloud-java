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
// source: google/cloud/talent/v4beta1/company_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4beta1;

public final class CompanyServiceProto {
  private CompanyServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/company_se"
          + "rvice.proto\022\033google.cloud.talent.v4beta1"
          + "\032\034google/api/annotations.proto\032\027google/a"
          + "pi/client.proto\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032(goo"
          + "gle/cloud/talent/v4beta1/common.proto\032)g"
          + "oogle/cloud/talent/v4beta1/company.proto"
          + "\032\033google/protobuf/empty.proto\032 google/pr"
          + "otobuf/field_mask.proto\"\207\001\n\024CreateCompan"
          + "yRequest\0223\n\006parent\030\001 \001(\tB#\340A\002\372A\035\022\033jobs.g"
          + "oogleapis.com/Company\022:\n\007company\030\002 \001(\0132$"
          + ".google.cloud.talent.v4beta1.CompanyB\003\340A"
          + "\002\"F\n\021GetCompanyRequest\0221\n\004name\030\001 \001(\tB#\340A"
          + "\002\372A\035\n\033jobs.googleapis.com/Company\"\203\001\n\024Up"
          + "dateCompanyRequest\022:\n\007company\030\001 \001(\0132$.go"
          + "ogle.cloud.talent.v4beta1.CompanyB\003\340A\002\022/"
          + "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi"
          + "eldMask\"I\n\024DeleteCompanyRequest\0221\n\004name\030"
          + "\001 \001(\tB#\340A\002\372A\035\n\033jobs.googleapis.com/Compa"
          + "ny\"\215\001\n\024ListCompaniesRequest\0223\n\006parent\030\001 "
          + "\001(\tB#\340A\002\372A\035\022\033jobs.googleapis.com/Company"
          + "\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022"
          + "\031\n\021require_open_jobs\030\004 \001(\010\"\252\001\n\025ListCompa"
          + "niesResponse\0227\n\tcompanies\030\001 \003(\0132$.google"
          + ".cloud.talent.v4beta1.Company\022\027\n\017next_pa"
          + "ge_token\030\002 \001(\t\022?\n\010metadata\030\003 \001(\0132-.googl"
          + "e.cloud.talent.v4beta1.ResponseMetadata2"
          + "\322\t\n\016CompanyService\022\343\001\n\rCreateCompany\0221.g"
          + "oogle.cloud.talent.v4beta1.CreateCompany"
          + "Request\032$.google.cloud.talent.v4beta1.Co"
          + "mpany\"y\332A\016parent,company\202\323\344\223\002b\"0/v4beta1"
          + "/{parent=projects/*/tenants/*}/companies"
          + ":\001*Z+\"&/v4beta1/{parent=projects/*}/comp"
          + "anies:\001*\022\315\001\n\nGetCompany\022..google.cloud.t"
          + "alent.v4beta1.GetCompanyRequest\032$.google"
          + ".cloud.talent.v4beta1.Company\"i\332A\004name\202\323"
          + "\344\223\002\\\0220/v4beta1/{name=projects/*/tenants/"
          + "*/companies/*}Z(\022&/v4beta1/{name=project"
          + "s/*/companies/*}\022\355\001\n\rUpdateCompany\0221.goo"
          + "gle.cloud.talent.v4beta1.UpdateCompanyRe"
          + "quest\032$.google.cloud.talent.v4beta1.Comp"
          + "any\"\202\001\332A\007company\202\323\344\223\002r28/v4beta1/{compan"
          + "y.name=projects/*/tenants/*/companies/*}"
          + ":\001*Z32./v4beta1/{company.name=projects/*"
          + "/companies/*}:\001*\022\305\001\n\rDeleteCompany\0221.goo"
          + "gle.cloud.talent.v4beta1.DeleteCompanyRe"
          + "quest\032\026.google.protobuf.Empty\"i\332A\004name\202\323"
          + "\344\223\002\\*0/v4beta1/{name=projects/*/tenants/"
          + "*/companies/*}Z(*&/v4beta1/{name=project"
          + "s/*/companies/*}\022\343\001\n\rListCompanies\0221.goo"
          + "gle.cloud.talent.v4beta1.ListCompaniesRe"
          + "quest\0322.google.cloud.talent.v4beta1.List"
          + "CompaniesResponse\"k\332A\006parent\202\323\344\223\002\\\0220/v4b"
          + "eta1/{parent=projects/*/tenants/*}/compa"
          + "niesZ(\022&/v4beta1/{parent=projects/*}/com"
          + "panies\032l\312A\023jobs.googleapis.com\322AShttps:/"
          + "/www.googleapis.com/auth/cloud-platform,"
          + "https://www.googleapis.com/auth/jobsBw\n\037"
          + "com.google.cloud.talent.v4beta1B\023Company"
          + "ServiceProtoP\001Z7cloud.google.com/go/tale"
          + "nt/apiv4beta1/talentpb;talentpb\242\002\003CTSb\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
              com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Company",
            });
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor,
            new java.lang.String[] {
              "Company", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize", "RequireOpenJobs",
            });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor,
            new java.lang.String[] {
              "Companies", "NextPageToken", "Metadata",
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
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
