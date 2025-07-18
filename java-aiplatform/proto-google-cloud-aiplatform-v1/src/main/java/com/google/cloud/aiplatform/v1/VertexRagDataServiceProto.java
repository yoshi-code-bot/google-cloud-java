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
// source: google/cloud/aiplatform/v1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class VertexRagDataServiceProto {
  private VertexRagDataServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateRagCorpusRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateRagCorpusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetRagCorpusRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetRagCorpusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListRagCorporaRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListRagCorporaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListRagCorporaResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListRagCorporaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteRagCorpusRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteRagCorpusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UploadRagFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UploadRagFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UploadRagFileResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UploadRagFileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetRagFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetRagFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListRagFilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListRagFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListRagFilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListRagFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteRagFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteRagFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateRagCorpusOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateRagCorpusOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetRagEngineConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetRagEngineConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportRagFilesOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1/vertex_rag_"
          + "data_service.proto\022\032google.cloud.aiplatf"
          + "orm.v1\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032*google/cloud/aiplatform/v1/operation."
          + "proto\0320google/cloud/aiplatform/v1/vertex"
          + "_rag_data.proto\032#google/longrunning/oper"
          + "ations.proto\032\033google/protobuf/empty.prot"
          + "o\032\027google/rpc/status.proto\"\223\001\n\026CreateRag"
          + "CorpusRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022>\n\nrag_"
          + "corpus\030\002 \001(\0132%.google.cloud.aiplatform.v"
          + "1.RagCorpusB\003\340A\002\"P\n\023GetRagCorpusRequest\022"
          + "9\n\004name\030\001 \001(\tB+\340A\002\372A%\n#aiplatform.google"
          + "apis.com/RagCorpus\"\203\001\n\025ListRagCorporaReq"
          + "uest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations."
          + "googleapis.com/Location\022\026\n\tpage_size\030\002 \001"
          + "(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"m\n\026List"
          + "RagCorporaResponse\022:\n\013rag_corpora\030\001 \003(\0132"
          + "%.google.cloud.aiplatform.v1.RagCorpus\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"g\n\026DeleteRagCorp"
          + "usRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#aiplatf"
          + "orm.googleapis.com/RagCorpus\022\022\n\005force\030\002 "
          + "\001(\010B\003\340A\001\"\345\001\n\024UploadRagFileRequest\022;\n\006par"
          + "ent\030\001 \001(\tB+\340A\002\372A%\n#aiplatform.googleapis"
          + ".com/RagCorpus\022:\n\010rag_file\030\002 \001(\0132#.googl"
          + "e.cloud.aiplatform.v1.RagFileB\003\340A\002\022T\n\026up"
          + "load_rag_file_config\030\005 \001(\0132/.google.clou"
          + "d.aiplatform.v1.UploadRagFileConfigB\003\340A\002"
          + "\"\177\n\025UploadRagFileResponse\0227\n\010rag_file\030\001 "
          + "\001(\0132#.google.cloud.aiplatform.v1.RagFile"
          + "H\000\022#\n\005error\030\004 \001(\0132\022.google.rpc.StatusH\000B"
          + "\010\n\006result\"\254\001\n\025ImportRagFilesRequest\022;\n\006p"
          + "arent\030\001 \001(\tB+\340A\002\372A%\n#aiplatform.googleap"
          + "is.com/RagCorpus\022V\n\027import_rag_files_con"
          + "fig\030\002 \001(\01320.google.cloud.aiplatform.v1.I"
          + "mportRagFilesConfigB\003\340A\002\"\343\001\n\026ImportRagFi"
          + "lesResponse\022#\n\031partial_failures_gcs_path"
          + "\030\004 \001(\tH\000\022)\n\037partial_failures_bigquery_ta"
          + "ble\030\005 \001(\tH\000\022 \n\030imported_rag_files_count\030"
          + "\001 \001(\003\022\036\n\026failed_rag_files_count\030\002 \001(\003\022\037\n"
          + "\027skipped_rag_files_count\030\003 \001(\003B\026\n\024partia"
          + "l_failure_sink\"L\n\021GetRagFileRequest\0227\n\004n"
          + "ame\030\001 \001(\tB)\340A\002\372A#\n!aiplatform.googleapis"
          + ".com/RagFile\"\203\001\n\023ListRagFilesRequest\022;\n\006"
          + "parent\030\001 \001(\tB+\340A\002\372A%\n#aiplatform.googlea"
          + "pis.com/RagCorpus\022\026\n\tpage_size\030\002 \001(\005B\003\340A"
          + "\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"g\n\024ListRagFil"
          + "esResponse\0226\n\trag_files\030\001 \003(\0132#.google.c"
          + "loud.aiplatform.v1.RagFile\022\027\n\017next_page_"
          + "token\030\002 \001(\t\"O\n\024DeleteRagFileRequest\0227\n\004n"
          + "ame\030\001 \001(\tB)\340A\002\372A#\n!aiplatform.googleapis"
          + ".com/RagFile\"r\n CreateRagCorpusOperation"
          + "Metadata\022N\n\020generic_metadata\030\001 \001(\01324.goo"
          + "gle.cloud.aiplatform.v1.GenericOperation"
          + "Metadata\"\\\n\031GetRagEngineConfigRequest\022?\n"
          + "\004name\030\001 \001(\tB1\340A\002\372A+\n)aiplatform.googleap"
          + "is.com/RagEngineConfig\"X\n\026UpdateRagCorpu"
          + "sRequest\022>\n\nrag_corpus\030\001 \001(\0132%.google.cl"
          + "oud.aiplatform.v1.RagCorpusB\003\340A\002\"r\n Upda"
          + "teRagCorpusOperationMetadata\022N\n\020generic_"
          + "metadata\030\001 \001(\01324.google.cloud.aiplatform"
          + ".v1.GenericOperationMetadata\"\375\001\n\037ImportR"
          + "agFilesOperationMetadata\022N\n\020generic_meta"
          + "data\030\001 \001(\01324.google.cloud.aiplatform.v1."
          + "GenericOperationMetadata\022\025\n\rrag_corpus_i"
          + "d\030\002 \001(\003\022V\n\027import_rag_files_config\030\003 \001(\013"
          + "20.google.cloud.aiplatform.v1.ImportRagF"
          + "ilesConfigB\003\340A\003\022\033\n\023progress_percentage\030\004"
          + " \001(\005\"k\n\034UpdateRagEngineConfigRequest\022K\n\021"
          + "rag_engine_config\030\001 \001(\0132+.google.cloud.a"
          + "iplatform.v1.RagEngineConfigB\003\340A\002\"x\n&Upd"
          + "ateRagEngineConfigOperationMetadata\022N\n\020g"
          + "eneric_metadata\030\001 \001(\01324.google.cloud.aip"
          + "latform.v1.GenericOperationMetadata2\260\025\n\024"
          + "VertexRagDataService\022\355\001\n\017CreateRagCorpus"
          + "\0222.google.cloud.aiplatform.v1.CreateRagC"
          + "orpusRequest\032\035.google.longrunning.Operat"
          + "ion\"\206\001\312A-\n\tRagCorpus\022 CreateRagCorpusOpe"
          + "rationMetadata\332A\021parent,rag_corpus\202\323\344\223\002<"
          + "\"./v1/{parent=projects/*/locations/*}/ra"
          + "gCorpora:\nrag_corpus\022\361\001\n\017UpdateRagCorpus"
          + "\0222.google.cloud.aiplatform.v1.UpdateRagC"
          + "orpusRequest\032\035.google.longrunning.Operat"
          + "ion\"\212\001\312A-\n\tRagCorpus\022 UpdateRagCorpusOpe"
          + "rationMetadata\332A\nrag_corpus\202\323\344\223\002G29/v1/{"
          + "rag_corpus.name=projects/*/locations/*/r"
          + "agCorpora/*}:\nrag_corpus\022\245\001\n\014GetRagCorpu"
          + "s\022/.google.cloud.aiplatform.v1.GetRagCor"
          + "pusRequest\032%.google.cloud.aiplatform.v1."
          + "RagCorpus\"=\332A\004name\202\323\344\223\0020\022./v1/{name=proj"
          + "ects/*/locations/*/ragCorpora/*}\022\270\001\n\016Lis"
          + "tRagCorpora\0221.google.cloud.aiplatform.v1"
          + ".ListRagCorporaRequest\0322.google.cloud.ai"
          + "platform.v1.ListRagCorporaResponse\"?\332A\006p"
          + "arent\202\323\344\223\0020\022./v1/{parent=projects/*/loca"
          + "tions/*}/ragCorpora\022\326\001\n\017DeleteRagCorpus\022"
          + "2.google.cloud.aiplatform.v1.DeleteRagCo"
          + "rpusRequest\032\035.google.longrunning.Operati"
          + "on\"p\312A0\n\025google.protobuf.Empty\022\027DeleteOp"
          + "erationMetadata\332A\004name\202\323\344\223\0020*./v1/{name="
          + "projects/*/locations/*/ragCorpora/*}\022\352\001\n"
          + "\rUploadRagFile\0220.google.cloud.aiplatform"
          + ".v1.UploadRagFileRequest\0321.google.cloud."
          + "aiplatform.v1.UploadRagFileResponse\"t\332A&"
          + "parent,rag_file,upload_rag_file_config\202\323"
          + "\344\223\002E\"@/v1/{parent=projects/*/locations/*"
          + "/ragCorpora/*}/ragFiles:upload:\001*\022\215\002\n\016Im"
          + "portRagFiles\0221.google.cloud.aiplatform.v"
          + "1.ImportRagFilesRequest\032\035.google.longrun"
          + "ning.Operation\"\250\001\312A9\n\026ImportRagFilesResp"
          + "onse\022\037ImportRagFilesOperationMetadata\332A\036"
          + "parent,import_rag_files_config\202\323\344\223\002E\"@/v"
          + "1/{parent=projects/*/locations/*/ragCorp"
          + "ora/*}/ragFiles:import:\001*\022\252\001\n\nGetRagFile"
          + "\022-.google.cloud.aiplatform.v1.GetRagFile"
          + "Request\032#.google.cloud.aiplatform.v1.Rag"
          + "File\"H\332A\004name\202\323\344\223\002;\0229/v1/{name=projects/"
          + "*/locations/*/ragCorpora/*/ragFiles/*}\022\275"
          + "\001\n\014ListRagFiles\022/.google.cloud.aiplatfor"
          + "m.v1.ListRagFilesRequest\0320.google.cloud."
          + "aiplatform.v1.ListRagFilesResponse\"J\332A\006p"
          + "arent\202\323\344\223\002;\0229/v1/{parent=projects/*/loca"
          + "tions/*/ragCorpora/*}/ragFiles\022\335\001\n\rDelet"
          + "eRagFile\0220.google.cloud.aiplatform.v1.De"
          + "leteRagFileRequest\032\035.google.longrunning."
          + "Operation\"{\312A0\n\025google.protobuf.Empty\022\027D"
          + "eleteOperationMetadata\332A\004name\202\323\344\223\002;*9/v1"
          + "/{name=projects/*/locations/*/ragCorpora"
          + "/*/ragFiles/*}\022\241\002\n\025UpdateRagEngineConfig"
          + "\0228.google.cloud.aiplatform.v1.UpdateRagE"
          + "ngineConfigRequest\032\035.google.longrunning."
          + "Operation\"\256\001\312A9\n\017RagEngineConfig\022&Update"
          + "RagEngineConfigOperationMetadata\332A\021rag_e"
          + "ngine_config\202\323\344\223\002X2C/v1/{rag_engine_conf"
          + "ig.name=projects/*/locations/*/ragEngine"
          + "Config}:\021rag_engine_config\022\272\001\n\022GetRagEng"
          + "ineConfig\0225.google.cloud.aiplatform.v1.G"
          + "etRagEngineConfigRequest\032+.google.cloud."
          + "aiplatform.v1.RagEngineConfig\"@\332A\004name\202\323"
          + "\344\223\0023\0221/v1/{name=projects/*/locations/*/r"
          + "agEngineConfig}\032M\312A\031aiplatform.googleapi"
          + "s.com\322A.https://www.googleapis.com/auth/"
          + "cloud-platformB\327\001\n\036com.google.cloud.aipl"
          + "atform.v1B\031VertexRagDataServiceProtoP\001Z>"
          + "cloud.google.com/go/aiplatform/apiv1/aip"
          + "latformpb;aiplatformpb\252\002\032Google.Cloud.AI"
          + "Platform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1"
          + "\352\002\035Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.VertexRagDataProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateRagCorpusRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateRagCorpusRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateRagCorpusRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RagCorpus",
            });
    internal_static_google_cloud_aiplatform_v1_GetRagCorpusRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_GetRagCorpusRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetRagCorpusRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListRagCorporaRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ListRagCorporaRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListRagCorporaRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1_ListRagCorporaResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListRagCorporaResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListRagCorporaResponse_descriptor,
            new java.lang.String[] {
              "RagCorpora", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteRagCorpusRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_DeleteRagCorpusRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteRagCorpusRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_cloud_aiplatform_v1_UploadRagFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UploadRagFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UploadRagFileRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RagFile", "UploadRagFileConfig",
            });
    internal_static_google_cloud_aiplatform_v1_UploadRagFileResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UploadRagFileResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UploadRagFileResponse_descriptor,
            new java.lang.String[] {
              "RagFile", "Error", "Result",
            });
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportRagFilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ImportRagFilesConfig",
            });
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportRagFilesResponse_descriptor,
            new java.lang.String[] {
              "PartialFailuresGcsPath",
              "PartialFailuresBigqueryTable",
              "ImportedRagFilesCount",
              "FailedRagFilesCount",
              "SkippedRagFilesCount",
              "PartialFailureSink",
            });
    internal_static_google_cloud_aiplatform_v1_GetRagFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_GetRagFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetRagFileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListRagFilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_ListRagFilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListRagFilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1_ListRagFilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_ListRagFilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListRagFilesResponse_descriptor,
            new java.lang.String[] {
              "RagFiles", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteRagFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_DeleteRagFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteRagFileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_CreateRagCorpusOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1_CreateRagCorpusOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateRagCorpusOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetRagEngineConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1_GetRagEngineConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetRagEngineConfigRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusRequest_descriptor,
            new java.lang.String[] {
              "RagCorpus",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateRagCorpusOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1_ImportRagFilesOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportRagFilesOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "RagCorpusId", "ImportRagFilesConfig", "ProgressPercentage",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigRequest_descriptor,
            new java.lang.String[] {
              "RagEngineConfig",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateRagEngineConfigOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
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
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.VertexRagDataProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
