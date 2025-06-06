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
// source: google/cloud/retail/v2alpha/import_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ProductInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ProductInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_UserEventInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_UserEventInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportCompletionDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportCompletionDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ProductInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ProductInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_UserEventInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_UserEventInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_TransformedUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_TransformedUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ImportCompletionDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ImportCompletionDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "/google/cloud/retail/v2alpha/import_con"
          + "fig.proto\022\033google.cloud.retail.v2alpha\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032)google/cloud/retail/"
          + "v2alpha/product.proto\032,google/cloud/retail/v2alpha/user_event.proto\032 google/prot"
          + "obuf/field_mask.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\027google/rpc/status.proto\032\026google/type/date.proto\"9\n"
          + "\tGcsSource\022\027\n\n"
          + "input_uris\030\001 \003(\tB\003\340A\002\022\023\n"
          + "\013data_schema\030\002 \001(\t\"\274\001\n"
          + "\016BigQuerySource\022+\n"
          + "\016partition_date\030\006 \001(\0132\021.google.type.DateH\000\022\022\n\n"
          + "project_id\030\005 \001(\t\022\027\n\n"
          + "dataset_id\030\001 \001(\tB\003\340A\002\022\025\n"
          + "\010table_id\030\002 \001(\tB\003\340A\002\022\027\n"
          + "\017gcs_staging_dir\030\003 \001(\t\022\023\n"
          + "\013data_schema\030\004 \001(\tB\013\n"
          + "\tpartition\"R\n"
          + "\023ProductInlineSource\022;\n"
          + "\010products\030\001"
          + " \003(\0132$.google.cloud.retail.v2alpha.ProductB\003\340A\002\"Y\n"
          + "\025UserEventInlineSource\022@\n"
          + "\013user_events\030\001 "
          + "\003(\0132&.google.cloud.retail.v2alpha.UserEventB\003\340A\002\"9\n"
          + "\022ImportErrorsConfig\022\024\n\n"
          + "gcs_prefix\030\001 \001(\tH\000B\r\n"
          + "\013destination\"\257\004\n"
          + "\025ImportProductsRequest\0224\n"
          + "\006parent\030\001 \001(\tB$\340A\002\372A\036\n"
          + "\034retail.googleapis.com/Branch\022\026\n\n"
          + "request_id\030\006 \001(\tB\002\030\001\022J\n"
          + "\014input_config\030\002 \001(\0132/.goog"
          + "le.cloud.retail.v2alpha.ProductInputConfigB\003\340A\002\022F\n\r"
          + "errors_config\030\003 \001(\0132/.google."
          + "cloud.retail.v2alpha.ImportErrorsConfig\022/\n"
          + "\013update_mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022b\n"
          + "\023reconciliation_mode\030\005 \001(\0162E."
          + "google.cloud.retail.v2alpha.ImportProductsRequest.ReconciliationMode\022!\n"
          + "\031notification_pubsub_topic\030\007 \001(\t\022&\n"
          + "\036skip_default_branch_protection\030\010 \001(\010\"T\n"
          + "\022ReconciliationMode\022#\n"
          + "\037RECONCILIATION_MODE_UNSPECIFIED\020\000\022\017\n"
          + "\013INCREMENTAL\020\001\022\010\n"
          + "\004FULL\020\002\"\346\001\n"
          + "\027ImportUserEventsRequest\0225\n"
          + "\006parent\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035retail.googleapis.com/Catalog\022L\n"
          + "\014input_config\030\002"
          + " \001(\01321.google.cloud.retail.v2alpha.UserEventInputConfigB\003\340A\002\022F\n\r"
          + "errors_config\030\003"
          + " \001(\0132/.google.cloud.retail.v2alpha.ImportErrorsConfig\"\312\001\n"
          + "\033ImportCompletionDataRequest\0225\n"
          + "\006parent\030\001 \001(\tB%\340A\002\372A\037\n"
          + "\035retail.googleapis.com/Catalog\022Q\n"
          + "\014input_config\030\002"
          + " \001(\01326.google.cloud.retail.v2alpha.CompletionDataInputConfigB\003\340A\002\022!\n"
          + "\031notification_pubsub_topic\030\003 \001(\t\"\370\001\n"
          + "\022ProductInputConfig\022Q\n"
          + "\025product_inline_source\030\001 \001("
          + "\01320.google.cloud.retail.v2alpha.ProductInlineSourceH\000\022<\n\n"
          + "gcs_source\030\002 \001(\0132&.google.cloud.retail.v2alpha.GcsSourceH\000\022G\n"
          + "\020big_query_source\030\003"
          + " \001(\0132+.google.cloud.retail.v2alpha.BigQuerySourceH\000B\010\n"
          + "\006source\"\216\002\n"
          + "\024UserEventInputConfig\022[\n"
          + "\030user_event_inline_source\030\001"
          + " \001(\01322.google.cloud.retail.v2alpha.UserEventInlineSourceB\003\340A\002H\000\022A\n\n"
          + "gcs_source\030\002"
          + " \001(\0132&.google.cloud.retail.v2alpha.GcsSourceB\003\340A\002H\000\022L\n"
          + "\020big_query_source\030\003"
          + " \001(\0132+.google.cloud.retail.v2alpha.BigQuerySourceB\003\340A\002H\000B\010\n"
          + "\006source\"s\n"
          + "\031CompletionDataInputConfig\022L\n"
          + "\020big_query_source\030\001"
          + " \001(\0132+.google.cloud.retail.v2alpha.BigQuerySourceB\003\340A\002H\000B\010\n"
          + "\006source\"\301\002\n"
          + "\016ImportMetadata\022/\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022/\n"
          + "\013update_time\030\002 \001(\0132\032.google.protobuf.Timestamp\022\025\n\r"
          + "success_count\030\003 \001(\003\022\025\n\r"
          + "failure_count\030\004 \001(\003\022\026\n\n"
          + "request_id\030\005 \001(\tB\002\030\001\022!\n"
          + "\031notification_pubsub_topic\030\006 \001(\t\022d\n"
          + " transformed_user_events_metadata\030\007"
          + " \001(\0132:.google.cloud.retail.v2alpha.TransformedUserEventsMetadata\"^\n"
          + "\035TransformedUserEventsMetadata\022\033\n"
          + "\023source_events_count\030\001 \001(\003\022 \n"
          + "\030transformed_events_count\030\002 \001(\003\"\213\001\n"
          + "\026ImportProductsResponse\022)\n\r"
          + "error_samples\030\001 \003(\0132\022.google.rpc.Status\022F\n\r"
          + "errors_config\030\002"
          + " \001(\0132/.google.cloud.retail.v2alpha.ImportErrorsConfig\"\332\001\n"
          + "\030ImportUserEventsResponse\022)\n\r"
          + "error_samples\030\001 \003(\0132\022.google.rpc.Status\022F\n\r"
          + "errors_config\030\002"
          + " \001(\0132/.google.cloud.retail.v2alpha.ImportErrorsConfig\022K\n"
          + "\016import_summary\030\003 \001(\01323"
          + ".google.cloud.retail.v2alpha.UserEventImportSummary\"T\n"
          + "\026UserEventImportSummary\022\033\n"
          + "\023joined_events_count\030\001 \001(\003\022\035\n"
          + "\025unjoined_events_count\030\002 \001(\003\"I\n"
          + "\034ImportCompletionDataResponse\022)\n\r"
          + "error_samples\030\001 \003(\0132\022.google.rpc.StatusB\325\001\n"
          + "\037com.google.cloud.retail.v2alphaB\021ImportConfigProtoP\001Z7cloud.goo"
          + "gle.com/go/retail/apiv2alpha/retailpb;re"
          + "tailpb\242\002\006RETAIL\252\002\033Google.Cloud.Retail.V2"
          + "Alpha\312\002\033Google\\Cloud\\Retail\\V2alpha\352\002\036Go"
          + "ogle::Cloud::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.ProductProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.UserEventProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_retail_v2alpha_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_retail_v2alpha_ProductInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_ProductInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ProductInlineSource_descriptor,
            new java.lang.String[] {
              "Products",
            });
    internal_static_google_cloud_retail_v2alpha_UserEventInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_UserEventInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_UserEventInlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_retail_v2alpha_ImportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2alpha_ImportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2alpha_ImportProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2alpha_ImportProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportProductsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "RequestId",
              "InputConfig",
              "ErrorsConfig",
              "UpdateMask",
              "ReconciliationMode",
              "NotificationPubsubTopic",
              "SkipDefaultBranchProtection",
            });
    internal_static_google_cloud_retail_v2alpha_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2alpha_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InputConfig", "ErrorsConfig",
            });
    internal_static_google_cloud_retail_v2alpha_ImportCompletionDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2alpha_ImportCompletionDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportCompletionDataRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InputConfig", "NotificationPubsubTopic",
            });
    internal_static_google_cloud_retail_v2alpha_ProductInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2alpha_ProductInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ProductInputConfig_descriptor,
            new java.lang.String[] {
              "ProductInlineSource", "GcsSource", "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2alpha_UserEventInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2alpha_UserEventInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_UserEventInputConfig_descriptor,
            new java.lang.String[] {
              "UserEventInlineSource", "GcsSource", "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CompletionDataInputConfig_descriptor,
            new java.lang.String[] {
              "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2alpha_ImportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2alpha_ImportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "UpdateTime",
              "SuccessCount",
              "FailureCount",
              "RequestId",
              "NotificationPubsubTopic",
              "TransformedUserEventsMetadata",
            });
    internal_static_google_cloud_retail_v2alpha_TransformedUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_retail_v2alpha_TransformedUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_TransformedUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "SourceEventsCount", "TransformedEventsCount",
            });
    internal_static_google_cloud_retail_v2alpha_ImportProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_retail_v2alpha_ImportProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportProductsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig",
            });
    internal_static_google_cloud_retail_v2alpha_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_retail_v2alpha_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "ImportSummary",
            });
    internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_UserEventImportSummary_descriptor,
            new java.lang.String[] {
              "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_retail_v2alpha_ImportCompletionDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_retail_v2alpha_ImportCompletionDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ImportCompletionDataResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ProductProto.getDescriptor();
    com.google.cloud.retail.v2alpha.UserEventProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
