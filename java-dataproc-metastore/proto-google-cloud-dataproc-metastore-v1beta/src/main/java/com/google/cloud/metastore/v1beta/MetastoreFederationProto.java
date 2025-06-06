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
// source: google/cloud/metastore/v1beta/metastore_federation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.metastore.v1beta;

public final class MetastoreFederationProto {
  private MetastoreFederationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_Federation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_GetFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "8google/cloud/metastore/v1beta/metastore_federation.proto\022\035google.cloud.metasto"
          + "re.v1beta\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032-google/cloud/metastore/v1beta/meta"
          + "store.proto\032#google/longrunning/operations.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\273\006\n\n"
          + "Federation\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022E\n"
          + "\006labels\030\004"
          + " \003(\01325.google.cloud.metastore.v1beta.Federation.LabelsEntry\022\024\n"
          + "\007version\030\005 \001(\tB\003\340A\005\022\\\n"
          + "\022backend_metastores\030\006"
          + " \003(\0132@.google.cloud.metastore.v1beta.Federation.BackendMetastoresEntry\022\031\n"
          + "\014endpoint_uri\030\007 \001(\tB\003\340A\003\022C\n"
          + "\005state\030\010 \001(\0162/.go"
          + "ogle.cloud.metastore.v1beta.Federation.StateB\003\340A\003\022\032\n\r"
          + "state_message\030\t \001(\tB\003\340A\003\022\020\n"
          + "\003uid\030\n"
          + " \001(\tB\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\032i\n"
          + "\026BackendMetastoresEntry\022\013\n"
          + "\003key\030\001 \001(\005\022>\n"
          + "\005value\030\002 \001(\0132/.g"
          + "oogle.cloud.metastore.v1beta.BackendMetastore:\0028\001\"_\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\n\n"
          + "\006ACTIVE\020\002\022\014\n"
          + "\010UPDATING\020\003\022\014\n"
          + "\010DELETING\020\004\022\t\n"
          + "\005ERROR\020\005:j\352Ag\n"
          + "#metastore.googleapis.com/Federation\022@projects/{"
          + "project}/locations/{location}/federations/{federation}\"\334\001\n"
          + "\020BackendMetastore\022\014\n"
          + "\004name\030\001 \001(\t\022U\n"
          + "\016metastore_type\030\002 \001(\0162=.goog"
          + "le.cloud.metastore.v1beta.BackendMetastore.MetastoreType\"c\n\r"
          + "MetastoreType\022\036\n"
          + "\032METASTORE_TYPE_UNSPECIFIED\020\000\022\014\n"
          + "\010DATAPLEX\020\001\022\014\n"
          + "\010BIGQUERY\020\002\022\026\n"
          + "\022DATAPROC_METASTORE\020\003\"\262\001\n"
          + "\026ListFederationsRequest\022;\n"
          + "\006parent\030\001 \001(\t"
          + "B+\340A\002\372A%\022#metastore.googleapis.com/Federation\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\207\001\n"
          + "\027ListFederationsResponse\022>\n"
          + "\013federations\030\001 \003(\0132).google.cloud.metastore.v1beta.Federation\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"Q\n"
          + "\024GetFederationRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#metastore.googleapis.com/Federation\"\317\001\n"
          + "\027CreateFederationRequest\022;\n"
          + "\006parent\030\001 \001("
          + "\tB+\340A\002\372A%\022#metastore.googleapis.com/Federation\022\032\n\r"
          + "federation_id\030\002 \001(\tB\003\340A\002\022B\n\n"
          + "federation\030\003"
          + " \001(\0132).google.cloud.metastore.v1beta.FederationB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"\254\001\n"
          + "\027UpdateFederationRequest\0224\n"
          + "\013update_mask\030\001"
          + " \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022B\n\n"
          + "federation\030\002 \001(\0132).google"
          + ".cloud.metastore.v1beta.FederationB\003\340A\002\022\027\n\n"
          + "request_id\030\003 \001(\tB\003\340A\001\"m\n"
          + "\027DeleteFederationRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#metastore.googleapis.com/Federation\022\027\n\n"
          + "request_id\030\002 \001(\tB\003\340A\0012\230\n\n"
          + "\033DataprocMetastoreFederation\022\306\001\n"
          + "\017ListFederations\0225.google.cloud.metastore.v1beta.ListFederationsReque"
          + "st\0326.google.cloud.metastore.v1beta.ListF"
          + "ederationsResponse\"D\332A\006parent\202\323\344\223\0025\0223/v1"
          + "beta/{parent=projects/*/locations/*}/federations\022\263\001\n\r"
          + "GetFederation\0223.google.cloud.metastore.v1beta.GetFederationRequest\032"
          + ").google.cloud.metastore.v1beta.Federati"
          + "on\"B\332A\004name\202\323\344\223\0025\0223/v1beta/{name=projects/*/locations/*/federations/*}\022\225\002\n"
          + "\020CreateFederation\0226.google.cloud.metastore.v1b"
          + "eta.CreateFederationRequest\032\035.google.longrunning.Operation\"\251\001\312A=\n\n"
          + "Federation\022/google.cloud.metastore.v1beta.OperationMet"
          + "adata\332A\037parent,federation,federation_id\202"
          + "\323\344\223\002A\"3/v1beta/{parent=projects/*/locations/*}/federations:\n"
          + "federation\022\227\002\n"
          + "\020UpdateFederation\0226.google.cloud.metastore.v1b"
          + "eta.UpdateFederationRequest\032\035.google.longrunning.Operation\"\253\001\312A=\n\n"
          + "Federation\022/google.cloud.metastore.v1beta.OperationMet"
          + "adata\332A\026federation,update_mask\202\323\344\223\002L2>/v"
          + "1beta/{federation.name=projects/*/locations/*/federations/*}:\n"
          + "federation\022\371\001\n"
          + "\020DeleteFederation\0226.google.cloud.metastore.v"
          + "1beta.DeleteFederationRequest\032\035.google.longrunning.Operation\"\215\001\312AH\n"
          + "\025google.protobuf.Empty\022/google.cloud.metastore.v1beta"
          + ".OperationMetadata\332A\004name\202\323\344\223\0025*3/v1beta"
          + "/{name=projects/*/locations/*/federation"
          + "s/*}\032L\312A\030metastore.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platformB\200\001\n"
          + "!com.google.cloud.metastore.v1betaB\030MetastoreFederationProtoP\001Z?cloud.goog"
          + "le.com/go/metastore/apiv1beta/metastorepb;metastorepbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.metastore.v1beta.MetastoreProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_metastore_v1beta_Federation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_metastore_v1beta_Federation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_Federation_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "UpdateTime",
              "Labels",
              "Version",
              "BackendMetastores",
              "EndpointUri",
              "State",
              "StateMessage",
              "Uid",
            });
    internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor =
        internal_static_google_cloud_metastore_v1beta_Federation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_Federation_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor =
        internal_static_google_cloud_metastore_v1beta_Federation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_Federation_BackendMetastoresEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor,
            new java.lang.String[] {
              "Name", "MetastoreType",
            });
    internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_ListFederationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_ListFederationsResponse_descriptor,
            new java.lang.String[] {
              "Federations", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_metastore_v1beta_GetFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_GetFederationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_CreateFederationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FederationId", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_UpdateFederationRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Federation", "RequestId",
            });
    internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_metastore_v1beta_DeleteFederationRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.metastore.v1beta.MetastoreProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
