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
// source: google/cloud/discoveryengine/v1beta/sample_query_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public final class SampleQueryServiceProto {
  private SampleQueryServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQueryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ">google/cloud/discoveryengine/v1beta/sample_query_service.proto\022#google.cloud.d"
          + "iscoveryengine.v1beta\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\0327google/cloud/discoveryengine/v1beta/import_config.proto\0326googl"
          + "e/cloud/discoveryengine/v1beta/sample_qu"
          + "ery.proto\032#google/longrunning/operations.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"Y\n"
          + "\025GetSampleQueryRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*discoveryengine.googleapis.com/SampleQuery\"\210\001\n"
          + "\030ListSampleQueriesRequest\022E\n"
          + "\006parent\030\001 \001(\tB5\340A\002\372A/\n"
          + "-discoveryengine.googleapis.com/SampleQuerySet\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"~\n"
          + "\031ListSampleQueriesResponse\022H\n"
          + "\016sample_queries\030\001 \003(\01320.googl"
          + "e.cloud.discoveryengine.v1beta.SampleQuery\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\314\001\n"
          + "\030CreateSampleQueryRequest\022E\n"
          + "\006parent\030\001 \001(\tB5\340A\002\372A/\n"
          + "-discoveryengine.googleapis.com/SampleQuerySet\022K\n"
          + "\014sample_query\030\002 \001(\01320.google.c"
          + "loud.discoveryengine.v1beta.SampleQueryB\003\340A\002\022\034\n"
          + "\017sample_query_id\030\003 \001(\tB\003\340A\002\"\230\001\n"
          + "\030UpdateSampleQueryRequest\022K\n"
          + "\014sample_query\030\001"
          + " \001(\01320.google.cloud.discoveryengine.v1beta.SampleQueryB\003\340A\002\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"\\\n"
          + "\030DeleteSampleQueryRequest\022@\n"
          + "\004name\030\001 \001(\tB2\340A\002\372A,\n"
          + "*discoveryengine.googleapis.com/SampleQuery2\353\014\n"
          + "\022SampleQueryService\022\326\001\n"
          + "\016GetSampleQuery\022:.google.cloud.discoveryengine.v1b"
          + "eta.GetSampleQueryRequest\0320.google.cloud"
          + ".discoveryengine.v1beta.SampleQuery\"V\332A\004"
          + "name\202\323\344\223\002I\022G/v1beta/{name=projects/*/loc"
          + "ations/*/sampleQuerySets/*/sampleQueries/*}\022\354\001\n"
          + "\021ListSampleQueries\022=.google.cloud.discoveryengine.v1beta.ListSampleQuerie"
          + "sRequest\032>.google.cloud.discoveryengine."
          + "v1beta.ListSampleQueriesResponse\"X\332A\006par"
          + "ent\202\323\344\223\002I\022G/v1beta/{parent=projects/*/lo"
          + "cations/*/sampleQuerySets/*}/sampleQueries\022\212\002\n"
          + "\021CreateSampleQuery\022=.google.cloud.discoveryengine.v1beta.CreateSampleQuery"
          + "Request\0320.google.cloud.discoveryengine.v"
          + "1beta.SampleQuery\"\203\001\332A#parent,sample_que"
          + "ry,sample_query_id\202\323\344\223\002W\"G/v1beta/{paren"
          + "t=projects/*/locations/*/sampleQuerySets/*}/sampleQueries:\014sample_query\022\214\002\n"
          + "\021UpdateSampleQuery\022=.google.cloud.discoveryen"
          + "gine.v1beta.UpdateSampleQueryRequest\0320.google.cloud.discoveryengine.v1beta.Sampl"
          + "eQuery\"\205\001\332A\030sample_query,update_mask\202\323\344\223"
          + "\002d2T/v1beta/{sample_query.name=projects/"
          + "*/locations/*/sampleQuerySets/*/sampleQueries/*}:\014sample_query\022\302\001\n"
          + "\021DeleteSampleQuery\022=.google.cloud.discoveryengine.v1be"
          + "ta.DeleteSampleQueryRequest\032\026.google.pro"
          + "tobuf.Empty\"V\332A\004name\202\323\344\223\002I*G/v1beta/{nam"
          + "e=projects/*/locations/*/sampleQuerySets/*/sampleQueries/*}\022\327\002\n"
          + "\023ImportSampleQueries\022?.google.cloud.discoveryengine.v1bet"
          + "a.ImportSampleQueriesRequest\032\035.google.longrunning.Operation\"\337\001\312A\202\001\n"
          + "?google.cloud.discoveryengine.v1beta.ImportSampleQuer"
          + "iesResponse\022?google.cloud.discoveryengin"
          + "e.v1beta.ImportSampleQueriesMetadata\202\323\344\223"
          + "\002S\"N/v1beta/{parent=projects/*/locations/*/sampleQuerySets/*}/sampleQueries:impo"
          + "rt:\001*\032R\312A\036discoveryengine.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud-platformB\236\002\n"
          + "\'com.google.cloud.discoveryengine.v1betaB\027SampleQueryServiceProtoP\001"
          + "ZQcloud.google.com/go/discoveryengine/apiv1beta/discoveryenginepb;discoveryengin"
          + "epb\242\002\017DISCOVERYENGINE\252\002#Google.Cloud.Dis"
          + "coveryEngine.V1Beta\312\002#Google\\Cloud\\Disco"
          + "veryEngine\\V1beta\352\002&Google::Cloud::DiscoveryEngine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.SampleQueryProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_GetSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListSampleQueriesResponse_descriptor,
            new java.lang.String[] {
              "SampleQueries", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "SampleQuery", "SampleQueryId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "SampleQuery", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteSampleQueryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.SampleQueryProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
