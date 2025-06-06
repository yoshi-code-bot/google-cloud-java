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
// source: google/cloud/discoveryengine/v1alpha/data_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1alpha;

public final class DataStoreServiceProto {
  private DataStoreServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetDataStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetDataStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateDataStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateDataStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GetDocumentProcessingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GetDocumentProcessingConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateDocumentProcessingConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_UpdateDocumentProcessingConfigRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/cloud/discoveryengine/v1alpha/d"
          + "ata_store_service.proto\022$google.cloud.di"
          + "scoveryengine.v1alpha\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\0325google/cloud/discovery"
          + "engine/v1alpha/data_store.proto\032Egoogle/"
          + "cloud/discoveryengine/v1alpha/document_p"
          + "rocessing_config.proto\032#google/longrunni"
          + "ng/operations.proto\032\033google/protobuf/emp"
          + "ty.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\214\002\n\026"
          + "CreateDataStoreRequest\022A\n\006parent\030\001 \001(\tB1"
          + "\340A\002\372A+\n)discoveryengine.googleapis.com/C"
          + "ollection\022H\n\ndata_store\030\002 \001(\0132/.google.c"
          + "loud.discoveryengine.v1alpha.DataStoreB\003"
          + "\340A\002\022\032\n\rdata_store_id\030\003 \001(\tB\003\340A\002\022#\n\033creat"
          + "e_advanced_site_search\030\004 \001(\010\022$\n\034skip_def"
          + "ault_schema_creation\030\007 \001(\010\"U\n\023GetDataSto"
          + "reRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(discove"
          + "ryengine.googleapis.com/DataStore\"{\n\027Cre"
          + "ateDataStoreMetadata\022/\n\013create_time\030\001 \001("
          + "\0132\032.google.protobuf.Timestamp\022/\n\013update_"
          + "time\030\002 \001(\0132\032.google.protobuf.Timestamp\"\221"
          + "\001\n\025ListDataStoresRequest\022A\n\006parent\030\001 \001(\t"
          + "B1\340A\002\372A+\n)discoveryengine.googleapis.com"
          + "/Collection\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"w\n\026ListDataSt"
          + "oresResponse\022D\n\013data_stores\030\001 \003(\0132/.goog"
          + "le.cloud.discoveryengine.v1alpha.DataSto"
          + "re\022\027\n\017next_page_token\030\002 \001(\t\"X\n\026DeleteDat"
          + "aStoreRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(dis"
          + "coveryengine.googleapis.com/DataStore\"\223\001"
          + "\n\026UpdateDataStoreRequest\022H\n\ndata_store\030\001"
          + " \001(\0132/.google.cloud.discoveryengine.v1al"
          + "pha.DataStoreB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMask\"{\n\027DeleteDat"
          + "aStoreMetadata\022/\n\013create_time\030\001 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022/\n\013update_time\030\002"
          + " \001(\0132\032.google.protobuf.Timestamp\"s\n\"GetD"
          + "ocumentProcessingConfigRequest\022M\n\004name\030\001"
          + " \001(\tB?\340A\002\372A9\n7discoveryengine.googleapis"
          + ".com/DocumentProcessingConfig\"\301\001\n%Update"
          + "DocumentProcessingConfigRequest\022g\n\032docum"
          + "ent_processing_config\030\001 \001(\0132>.google.clo"
          + "ud.discoveryengine.v1alpha.DocumentProce"
          + "ssingConfigB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032."
          + "google.protobuf.FieldMask2\255\024\n\020DataStoreS"
          + "ervice\022\235\003\n\017CreateDataStore\022<.google.clou"
          + "d.discoveryengine.v1alpha.CreateDataStor"
          + "eRequest\032\035.google.longrunning.Operation\""
          + "\254\002\312An\n.google.cloud.discoveryengine.v1al"
          + "pha.DataStore\022<google.cloud.discoveryeng"
          + "ine.v1alpha.CreateDataStoreMetadata\332A\037pa"
          + "rent,data_store,data_store_id\202\323\344\223\002\222\001\"3/v"
          + "1alpha/{parent=projects/*/locations/*}/d"
          + "ataStores:\ndata_storeZO\"A/v1alpha/{paren"
          + "t=projects/*/locations/*/collections/*}/"
          + "dataStores:\ndata_store\022\204\002\n\014GetDataStore\022"
          + "9.google.cloud.discoveryengine.v1alpha.G"
          + "etDataStoreRequest\032/.google.cloud.discov"
          + "eryengine.v1alpha.DataStore\"\207\001\332A\004name\202\323\344"
          + "\223\002z\0223/v1alpha/{name=projects/*/locations"
          + "/*/dataStores/*}ZC\022A/v1alpha/{name=proje"
          + "cts/*/locations/*/collections/*/dataStor"
          + "es/*}\022\227\002\n\016ListDataStores\022;.google.cloud."
          + "discoveryengine.v1alpha.ListDataStoresRe"
          + "quest\032<.google.cloud.discoveryengine.v1a"
          + "lpha.ListDataStoresResponse\"\211\001\332A\006parent\202"
          + "\323\344\223\002z\0223/v1alpha/{parent=projects/*/locat"
          + "ions/*}/dataStoresZC\022A/v1alpha/{parent=p"
          + "rojects/*/locations/*/collections/*}/dat"
          + "aStores\022\320\002\n\017DeleteDataStore\022<.google.clo"
          + "ud.discoveryengine.v1alpha.DeleteDataSto"
          + "reRequest\032\035.google.longrunning.Operation"
          + "\"\337\001\312AU\n\025google.protobuf.Empty\022<google.cl"
          + "oud.discoveryengine.v1alpha.DeleteDataSt"
          + "oreMetadata\332A\004name\202\323\344\223\002z*3/v1alpha/{name"
          + "=projects/*/locations/*/dataStores/*}ZC*"
          + "A/v1alpha/{name=projects/*/locations/*/c"
          + "ollections/*/dataStores/*}\022\313\002\n\017UpdateDat"
          + "aStore\022<.google.cloud.discoveryengine.v1"
          + "alpha.UpdateDataStoreRequest\032/.google.cl"
          + "oud.discoveryengine.v1alpha.DataStore\"\310\001"
          + "\332A\026data_store,update_mask\202\323\344\223\002\250\0012>/v1alp"
          + "ha/{data_store.name=projects/*/locations"
          + "/*/dataStores/*}:\ndata_storeZZ2L/v1alpha"
          + "/{data_store.name=projects/*/locations/*"
          + "/collections/*/dataStores/*}:\ndata_store"
          + "\022\344\002\n\033GetDocumentProcessingConfig\022H.googl"
          + "e.cloud.discoveryengine.v1alpha.GetDocum"
          + "entProcessingConfigRequest\032>.google.clou"
          + "d.discoveryengine.v1alpha.DocumentProces"
          + "singConfig\"\272\001\332A\004name\202\323\344\223\002\254\001\022L/v1alpha/{n"
          + "ame=projects/*/locations/*/dataStores/*/"
          + "documentProcessingConfig}Z\\\022Z/v1alpha/{n"
          + "ame=projects/*/locations/*/collections/*"
          + "/dataStores/*/documentProcessingConfig}\022"
          + "\373\003\n\036UpdateDocumentProcessingConfig\022K.goo"
          + "gle.cloud.discoveryengine.v1alpha.Update"
          + "DocumentProcessingConfigRequest\032>.google"
          + ".cloud.discoveryengine.v1alpha.DocumentP"
          + "rocessingConfig\"\313\002\332A&document_processing"
          + "_config,update_mask\202\323\344\223\002\233\0022g/v1alpha/{do"
          + "cument_processing_config.name=projects/*"
          + "/locations/*/dataStores/*/documentProces"
          + "singConfig}:\032document_processing_configZ"
          + "\223\0012u/v1alpha/{document_processing_config"
          + ".name=projects/*/locations/*/collections"
          + "/*/dataStores/*/documentProcessingConfig"
          + "}:\032document_processing_config\032R\312A\036discov"
          + "eryengine.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\241\002\n(co"
          + "m.google.cloud.discoveryengine.v1alphaB\025"
          + "DataStoreServiceProtoP\001ZRcloud.google.co"
          + "m/go/discoveryengine/apiv1alpha/discover"
          + "yenginepb;discoveryenginepb\242\002\017DISCOVERYE"
          + "NGINE\252\002$Google.Cloud.DiscoveryEngine.V1A"
          + "lpha\312\002$Google\\Cloud\\DiscoveryEngine\\V1al"
          + "pha\352\002\'Google::Cloud::DiscoveryEngine::V1"
          + "alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.DataStoreProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfigProto
                  .getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "DataStore",
              "DataStoreId",
              "CreateAdvancedSiteSearch",
              "SkipDefaultSchemaCreation",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetDataStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_GetDataStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetDataStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CreateDataStoreMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ListDataStoresResponse_descriptor,
            new java.lang.String[] {
              "DataStores", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateDataStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateDataStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateDataStoreRequest_descriptor,
            new java.lang.String[] {
              "DataStore", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_DeleteDataStoreMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GetDocumentProcessingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1alpha_GetDocumentProcessingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GetDocumentProcessingConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateDocumentProcessingConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1alpha_UpdateDocumentProcessingConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_UpdateDocumentProcessingConfigRequest_descriptor,
            new java.lang.String[] {
              "DocumentProcessingConfig", "UpdateMask",
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
    com.google.cloud.discoveryengine.v1alpha.DataStoreProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.DocumentProcessingConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
