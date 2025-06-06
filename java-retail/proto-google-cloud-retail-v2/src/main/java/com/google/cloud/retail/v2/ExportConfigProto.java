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
// source: google/cloud/retail/v2/export_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public final class ExportConfigProto {
  private ExportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_OutputConfig_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_OutputConfig_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_OutputConfig_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_OutputConfig_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_OutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_OutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_BigQueryOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_BigQueryOutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_GcsOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_GcsOutputResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/retail/v2/export_config.p"
          + "roto\022\026google.cloud.retail.v2\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\027google/rpc/status.proto\"\340\002\n\014OutputCon"
          + "fig\022N\n\017gcs_destination\030\001 \001(\01323.google.cl"
          + "oud.retail.v2.OutputConfig.GcsDestinatio"
          + "nH\000\022X\n\024bigquery_destination\030\002 \001(\01328.goog"
          + "le.cloud.retail.v2.OutputConfig.BigQuery"
          + "DestinationH\000\0320\n\016GcsDestination\022\036\n\021outpu"
          + "t_uri_prefix\030\001 \001(\tB\003\340A\002\032e\n\023BigQueryDesti"
          + "nation\022\027\n\ndataset_id\030\001 \001(\tB\003\340A\002\022\034\n\017table"
          + "_id_prefix\030\002 \001(\tB\003\340A\002\022\027\n\ntable_type\030\003 \001("
          + "\tB\003\340A\002B\r\n\013destination\"9\n\022ExportErrorsCon"
          + "fig\022\024\n\ngcs_prefix\030\001 \001(\tH\000B\r\n\013destination"
          + "\"\207\001\n\035ExportAnalyticsMetricsRequest\022\024\n\007ca"
          + "talog\030\001 \001(\tB\003\340A\002\022@\n\routput_config\030\002 \001(\0132"
          + "$.google.cloud.retail.v2.OutputConfigB\003\340"
          + "A\002\022\016\n\006filter\030\003 \001(\t\"r\n\016ExportMetadata\022/\n\013"
          + "create_time\030\001 \001(\0132\032.google.protobuf.Time"
          + "stamp\022/\n\013update_time\030\002 \001(\0132\032.google.prot"
          + "obuf.Timestamp\"\313\001\n\036ExportAnalyticsMetric"
          + "sResponse\022)\n\rerror_samples\030\001 \003(\0132\022.googl"
          + "e.rpc.Status\022A\n\rerrors_config\030\002 \001(\0132*.go"
          + "ogle.cloud.retail.v2.ExportErrorsConfig\022"
          + ";\n\routput_result\030\003 \001(\0132$.google.cloud.re"
          + "tail.v2.OutputResult\"\222\001\n\014OutputResult\022E\n"
          + "\017bigquery_result\030\001 \003(\0132,.google.cloud.re"
          + "tail.v2.BigQueryOutputResult\022;\n\ngcs_resu"
          + "lt\030\002 \003(\0132\'.google.cloud.retail.v2.GcsOut"
          + "putResult\"<\n\024BigQueryOutputResult\022\022\n\ndat"
          + "aset_id\030\001 \001(\t\022\020\n\010table_id\030\002 \001(\t\"%\n\017GcsOu"
          + "tputResult\022\022\n\noutput_uri\030\001 \001(\tB\274\001\n\032com.g"
          + "oogle.cloud.retail.v2B\021ExportConfigProto"
          + "P\001Z2cloud.google.com/go/retail/apiv2/ret"
          + "ailpb;retailpb\242\002\006RETAIL\252\002\026Google.Cloud.R"
          + "etail.V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Goog"
          + "le::Cloud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_retail_v2_OutputConfig_GcsDestination_descriptor =
        internal_static_google_cloud_retail_v2_OutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2_OutputConfig_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_OutputConfig_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUriPrefix",
            });
    internal_static_google_cloud_retail_v2_OutputConfig_BigQueryDestination_descriptor =
        internal_static_google_cloud_retail_v2_OutputConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2_OutputConfig_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_OutputConfig_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableIdPrefix", "TableType",
            });
    internal_static_google_cloud_retail_v2_ExportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_ExportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsRequest_descriptor,
            new java.lang.String[] {
              "Catalog", "OutputConfig", "Filter",
            });
    internal_static_google_cloud_retail_v2_ExportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_ExportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ExportAnalyticsMetricsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2_OutputResult_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2_OutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_OutputResult_descriptor,
            new java.lang.String[] {
              "BigqueryResult", "GcsResult",
            });
    internal_static_google_cloud_retail_v2_BigQueryOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2_BigQueryOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_BigQueryOutputResult_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableId",
            });
    internal_static_google_cloud_retail_v2_GcsOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2_GcsOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_GcsOutputResult_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
