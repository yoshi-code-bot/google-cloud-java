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
// source: google/cloud/aiplatform/v1beta1/example_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class ExampleStoreServiceProto {
  private ExampleStoreServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetExampleStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetExampleStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Example_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Example_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_UpsertResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_UpsertResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_SimilarExample_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_SimilarExample_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ";google/cloud/aiplatform/v1beta1/example_store_service.proto\022\037google.cloud.aipl"
          + "atform.v1beta1\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032-google/cloud/aiplatform/v1beta1/example.proto\0323google/cloud/aiplatfor"
          + "m/v1beta1/example_store.proto\032/google/cloud/aiplatform/v1beta1/operation.proto\032#"
          + "google/longrunning/operations.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobu"
          + "f/field_mask.proto\032\037google/protobuf/timestamp.proto\032\027google/rpc/status.proto\"\241\001\n"
          + "\031CreateExampleStoreRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022I\n\r"
          + "example_store\030\002 \001(\0132-.google.cl"
          + "oud.aiplatform.v1beta1.ExampleStoreB\003\340A\002\"z\n"
          + "#CreateExampleStoreOperationMetadata\022S\n"
          + "\020generic_metadata\030\001 \001(\01329.google.cloud"
          + ".aiplatform.v1beta1.GenericOperationMetadata\"V\n"
          + "\026GetExampleStoreRequest\022<\n"
          + "\004name\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\"\234\001\n"
          + "\031UpdateExampleStoreRequest\022I\n\r"
          + "example_store\030\001"
          + " \001(\0132-.google.cloud.aiplatform.v1beta1.ExampleStoreB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\001\"z\n"
          + "#UpdateExampleStoreOperationMetadata\022S\n"
          + "\020generic_metadata\030\001 \001(\01329.g"
          + "oogle.cloud.aiplatform.v1beta1.GenericOperationMetadata\"Y\n"
          + "\031DeleteExampleStoreRequest\022<\n"
          + "\004name\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\"z\n"
          + "#DeleteExampleStoreOperationMetadata\022S\n"
          + "\020generic_metadata\030\001"
          + " \001(\01329.google.cloud.aiplatform.v1beta1.GenericOperationMetadata\"\233\001\n"
          + "\030ListExampleStoresRequest\0229\n"
          + "\006parent\030\001 \001(\tB)\340A\002\372A#\n"
          + "!locations.googleapis.com/Location\022\023\n"
          + "\006filter\030\002 \001(\tB\003\340A\001\022\026\n"
          + "\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\004 \001(\tB\003\340A\001\"{\n"
          + "\031ListExampleStoresResponse\022E\n"
          + "\016example_stores\030\001 \003("
          + "\0132-.google.cloud.aiplatform.v1beta1.ExampleStore\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\341\001\n"
          + "\007Example\022Y\n"
          + "\027stored_contents_example\030\006 \001(\01326"
          + ".google.cloud.aiplatform.v1beta1.StoredContentsExampleH\000\022\031\n"
          + "\014display_name\030\001 \001(\tB\003\340A\001\022\032\n\n"
          + "example_id\030\004 \001(\tB\006\340A\001\340A\005\0224\n"
          + "\013create_time\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003B\016\n"
          + "\014example_type\"\267\001\n"
          + "\025UpsertExamplesRequest\022E\n\r"
          + "example_store\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\022?\n"
          + "\010examples\030\002"
          + " \003(\0132(.google.cloud.aiplatform.v1beta1.ExampleB\003\340A\002\022\026\n"
          + "\toverwrite\030\004 \001(\010B\003\340A\001\"\354\001\n"
          + "\026UpsertExamplesResponse\022U\n"
          + "\007results\030\001 \003(\0132D.google.cloud.aiplatform.v1"
          + "beta1.UpsertExamplesResponse.UpsertResult\032{\n"
          + "\014UpsertResult\022;\n"
          + "\007example\030\001 \001(\0132(.google.cloud.aiplatform.v1beta1.ExampleH\000\022$\n"
          + "\006status\030\002 \001(\0132\022.google.rpc.StatusH\000B\010\n"
          + "\006result\"\363\001\n"
          + "\025RemoveExamplesRequest\022f\n"
          + "\036stored_contents_example_filter\030\010 \001(\0132<.googl"
          + "e.cloud.aiplatform.v1beta1.StoredContentsExampleFilterH\000\022E\n\r"
          + "example_store\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\022\030\n"
          + "\013example_ids\030\006 \003(\tB\003\340A\001B\021\n"
          + "\017metadata_filter\"-\n"
          + "\026RemoveExamplesResponse\022\023\n"
          + "\013example_ids\030\001 \003(\t\"\360\001\n"
          + "\025SearchExamplesRequest\022n\n"
          + "\"stored_contents_example_parameters\030\006"
          + " \001(\0132@.google.cloud.aiplatform.v1beta1.StoredContentsExampleParametersH\000\022E\n"
          + "\r"
          + "example_store\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\022\022\n"
          + "\005top_k\030\002 \001(\003B\003\340A\001B\014\n\n"
          + "parameters\"\330\001\n"
          + "\026SearchExamplesResponse\022W\n"
          + "\007results\030\001 \003(\0132F.google.clou"
          + "d.aiplatform.v1beta1.SearchExamplesResponse.SimilarExample\032e\n"
          + "\016SimilarExample\0229\n"
          + "\007example\030\001 \001(\0132(.google.cloud.aiplatform.v1beta1.Example\022\030\n"
          + "\020similarity_score\030\002 \001(\002\"\243\002\n"
          + "\024FetchExamplesRequest\022f\n"
          + "\036stored_contents_example_filter\030\010 \001(\0132<.google.clou"
          + "d.aiplatform.v1beta1.StoredContentsExampleFilterH\000\022E\n\r"
          + "example_store\030\001 \001(\tB.\340A\002\372A(\n"
          + "&aiplatform.googleapis.com/ExampleStore\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\030\n"
          + "\013example_ids\030\006 \003(\tB\003\340A\001B\021\n"
          + "\017metadata_filter\"l\n"
          + "\025FetchExamplesResponse\022:\n"
          + "\010examples\030\001 \003(\0132(.google.cloud.aiplatform.v1beta1.Example\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\341\021\n"
          + "\023ExampleStoreService\022\316\002\n"
          + "\022CreateExampleStore\022:.google.cloud.aiplatform.v"
          + "1beta1.CreateExampleStoreRequest\032\035.google.longrunning.Operation\"\334\001\312A3\n"
          + "\014ExampleStore\022#CreateExampleStoreOperationMetadata"
          + "\332A\024parent,example_store\202\323\344\223\002\210\001\"6/v1beta1"
          + "/{parent=projects/*/locations/*}/exampleStores:\r"
          + "example_storeZ?\"=/v1beta1/{paren"
          + "t=projects/*/locations/*}/exampleStores:create\022\300\001\n"
          + "\017GetExampleStore\0227.google.cloud.aiplatform.v1beta1.GetExampleStoreRequ"
          + "est\032-.google.cloud.aiplatform.v1beta1.Ex"
          + "ampleStore\"E\332A\004name\202\323\344\223\0028\0226/v1beta1/{nam"
          + "e=projects/*/locations/*/exampleStores/*}\022\237\002\n"
          + "\022UpdateExampleStore\022:.google.cloud.aiplatform.v1beta1.UpdateExampleStoreReq"
          + "uest\032\035.google.longrunning.Operation\"\255\001\312A3\n"
          + "\014ExampleStore\022#UpdateExampleStoreOpera"
          + "tionMetadata\332A\031example_store,update_mask"
          + "\202\323\344\223\002U2D/v1beta1/{example_store.name=projects/*/locations/*/exampleStores/*}:\r"
          + "example_store\022\366\001\n"
          + "\022DeleteExampleStore\022:.google.cloud.aiplatform.v1beta1.DeleteExamp"
          + "leStoreRequest\032\035.google.longrunning.Operation\"\204\001\312A<\n"
          + "\025google.protobuf.Empty\022#DeleteExampleStoreOperationMetadata\332A\004name\202\323"
          + "\344\223\0028*6/v1beta1/{name=projects/*/locations/*/exampleStores/*}\022\323\001\n"
          + "\021ListExampleStores\0229.google.cloud.aiplatform.v1beta1.Lis"
          + "tExampleStoresRequest\032:.google.cloud.aiplatform.v1beta1.ListExampleStoresRespons"
          + "e\"G\332A\006parent\202\323\344\223\0028\0226/v1beta1/{parent=projects/*/locations/*}/exampleStores\022\334\001\n"
          + "\016UpsertExamples\0226.google.cloud.aiplatform."
          + "v1beta1.UpsertExamplesRequest\0327.google.cloud.aiplatform.v1beta1.UpsertExamplesRe"
          + "sponse\"Y\202\323\344\223\002S\"N/v1beta1/{example_store="
          + "projects/*/locations/*/exampleStores/*}:upsertExamples:\001*\022\334\001\n"
          + "\016RemoveExamples\0226.google.cloud.aiplatform.v1beta1.RemoveExa"
          + "mplesRequest\0327.google.cloud.aiplatform.v"
          + "1beta1.RemoveExamplesResponse\"Y\202\323\344\223\002S\"N/"
          + "v1beta1/{example_store=projects/*/locati"
          + "ons/*/exampleStores/*}:removeExamples:\001*\022\334\001\n"
          + "\016SearchExamples\0226.google.cloud.aiplatform.v1beta1.SearchExamplesRequest\0327.go"
          + "ogle.cloud.aiplatform.v1beta1.SearchExam"
          + "plesResponse\"Y\202\323\344\223\002S\"N/v1beta1/{example_"
          + "store=projects/*/locations/*/exampleStores/*}:searchExamples:\001*\022\330\001\n\r"
          + "FetchExamples\0225.google.cloud.aiplatform.v1beta1.Fetc"
          + "hExamplesRequest\0326.google.cloud.aiplatfo"
          + "rm.v1beta1.FetchExamplesResponse\"X\202\323\344\223\002R"
          + "\"M/v1beta1/{example_store=projects/*/locations/*/exampleStores/*}:fetchExamples:"
          + "\001*\032M\312A\031aiplatform.googleapis.com\322A.https"
          + "://www.googleapis.com/auth/cloud-platformB\357\001\n"
          + "#com.google.cloud.aiplatform.v1beta1B\030ExampleStoreServiceProtoP\001ZCcloud.goo"
          + "gle.com/go/aiplatform/apiv1beta1/aiplatf"
          + "ormpb;aiplatformpb\252\002\037Google.Cloud.AIPlat"
          + "form.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V"
          + "1beta1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExampleProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExampleStoreProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ExampleStore",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CreateExampleStoreOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetExampleStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetExampleStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetExampleStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreRequest_descriptor,
            new java.lang.String[] {
              "ExampleStore", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpdateExampleStoreOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeleteExampleStoreOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListExampleStoresResponse_descriptor,
            new java.lang.String[] {
              "ExampleStores", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Example_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_Example_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Example_descriptor,
            new java.lang.String[] {
              "StoredContentsExample", "DisplayName", "ExampleId", "CreateTime", "ExampleType",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesRequest_descriptor,
            new java.lang.String[] {
              "ExampleStore", "Examples", "Overwrite",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_descriptor,
            new java.lang.String[] {
              "Results",
            });
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_UpsertResult_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_UpsertResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_UpsertExamplesResponse_UpsertResult_descriptor,
            new java.lang.String[] {
              "Example", "Status", "Result",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesRequest_descriptor,
            new java.lang.String[] {
              "StoredContentsExampleFilter", "ExampleStore", "ExampleIds", "MetadataFilter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor,
            new java.lang.String[] {
              "ExampleIds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesRequest_descriptor,
            new java.lang.String[] {
              "StoredContentsExampleParameters", "ExampleStore", "TopK", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_descriptor,
            new java.lang.String[] {
              "Results",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_SimilarExample_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_SimilarExample_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SearchExamplesResponse_SimilarExample_descriptor,
            new java.lang.String[] {
              "Example", "SimilarityScore",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesRequest_descriptor,
            new java.lang.String[] {
              "StoredContentsExampleFilter",
              "ExampleStore",
              "PageSize",
              "PageToken",
              "ExampleIds",
              "MetadataFilter",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesResponse_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FetchExamplesResponse_descriptor,
            new java.lang.String[] {
              "Examples", "NextPageToken",
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
    com.google.cloud.aiplatform.v1beta1.ExampleProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExampleStoreProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
