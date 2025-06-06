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
// source: google/cloud/retail/v2beta/user_event_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

public final class UserEventServiceProto {
  private UserEventServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "3google/cloud/retail/v2beta/user_event_service.proto\022\032google.cloud.retail.v2bet"
          + "a\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/httpbody.proto\032\031go"
          + "ogle/api/resource.proto\032.google/cloud/retail/v2beta/export_config.proto\032.google/"
          + "cloud/retail/v2beta/import_config.proto\032-google/cloud/retail/v2beta/purge_config"
          + ".proto\032+google/cloud/retail/v2beta/user_"
          + "event.proto\032#google/longrunning/operations.proto\"\201\001\n"
          + "\025WriteUserEventRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022>\n\n"
          + "user_event\030\002 \001(\0132%.go"
          + "ogle.cloud.retail.v2beta.UserEventB\003\340A\002\022\023\n"
          + "\013write_async\030\003 \001(\010\"\237\001\n"
          + "\027CollectUserEventRequest\022\027\n\r"
          + "prebuilt_rule\030\006 \001(\tH\000\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\027\n\n"
          + "user_event\030\002 \001(\tB\003\340A\002\022\013\n"
          + "\003uri\030\003 \001(\t\022\013\n"
          + "\003ets\030\004 \001(\003\022\020\n"
          + "\010raw_json\030\005 \001(\tB\021\n"
          + "\017conversion_rule\"\202\002\n"
          + "\027RejoinUserEventsRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022i\n"
          + "\027user_event_rejoin_scope\030\002 \001(\0162H.google.cloud."
          + "retail.v2beta.RejoinUserEventsRequest.UserEventRejoinScope\"g\n"
          + "\024UserEventRejoinScope\022\'\n"
          + "#USER_EVENT_REJOIN_SCOPE_UNSPECIFIED\020\000\022\021\n\r"
          + "JOINED_EVENTS\020\001\022\023\n"
          + "\017UNJOINED_EVENTS\020\002\">\n"
          + "\030RejoinUserEventsResponse\022\"\n"
          + "\032rejoined_user_events_count\030\001 \001(\003\"\032\n"
          + "\030RejoinUserEventsMetadata2\347\014\n"
          + "\020UserEventService\022\303\001\n"
          + "\016WriteUserEvent\0221.google.cloud.retail.v2"
          + "beta.WriteUserEventRequest\032%.google.clou"
          + "d.retail.v2beta.UserEvent\"W\202\323\344\223\002Q\"C/v2be"
          + "ta/{parent=projects/*/locations/*/catalogs/*}/userEvents:write:\n"
          + "user_event\022\372\001\n"
          + "\020CollectUserEvent\0223.google.cloud.retail.v2"
          + "beta.CollectUserEventRequest\032\024.google.ap"
          + "i.HttpBody\"\232\001\202\323\344\223\002\223\001\022E/v2beta/{parent=pr"
          + "ojects/*/locations/*/catalogs/*}/userEvents:collectZJ\"E/v2beta/{parent=projects/"
          + "*/locations/*/catalogs/*}/userEvents:collect:\001*\022\226\002\n"
          + "\017PurgeUserEvents\0222.google.clo"
          + "ud.retail.v2beta.PurgeUserEventsRequest\032\035.google.longrunning.Operation\"\257\001\312A^\n"
          + "2google.cloud.retail.v2beta.PurgeUserEventsResponse\022(google.cloud.retail.v2beta.Pur"
          + "geMetadata\202\323\344\223\002H\"C/v2beta/{parent=projec"
          + "ts/*/locations/*/catalogs/*}/userEvents:purge:\001*\022\233\002\n"
          + "\020ImportUserEvents\0223.google.c"
          + "loud.retail.v2beta.ImportUserEventsRequest\032\035.google.longrunning.Operation\"\262\001\312A`\n"
          + "3google.cloud.retail.v2beta.ImportUserEventsResponse\022)google.cloud.retail.v2beta"
          + ".ImportMetadata\202\323\344\223\002I\"D/v2beta/{parent=p"
          + "rojects/*/locations/*/catalogs/*}/userEvents:import:\001*\022\233\002\n"
          + "\020ExportUserEvents\0223.google.cloud.retail.v2beta.ExportUserEvent"
          + "sRequest\032\035.google.longrunning.Operation\"\262\001\312A`\n"
          + "3google.cloud.retail.v2beta.ExportUserEventsResponse\022)google.cloud.retail."
          + "v2beta.ExportMetadata\202\323\344\223\002I\"D/v2beta/{pa"
          + "rent=projects/*/locations/*/catalogs/*}/userEvents:export:\001*\022\357\001\n"
          + "\020RejoinUserEvents\0223.google.cloud.retail.v2beta.RejoinUse"
          + "rEventsRequest\032\035.google.longrunning.Operation\"\206\001\312A4\n"
          + "\030RejoinUserEventsResponse\022\030R"
          + "ejoinUserEventsMetadata\202\323\344\223\002I\"D/v2beta/{"
          + "parent=projects/*/locations/*/catalogs/*"
          + "}/userEvents:rejoin:\001*\032I\312A\025retail.google"
          + "apis.com\322A.https://www.googleapis.com/auth/cloud-platformB\324\001\n"
          + "\036com.google.cloud.retail.v2betaB\025UserEventServiceProtoP\001Z6c"
          + "loud.google.com/go/retail/apiv2beta/reta"
          + "ilpb;retailpb\242\002\006RETAIL\252\002\032Google.Cloud.Re"
          + "tail.V2Beta\312\002\032Google\\Cloud\\Retail\\V2beta"
          + "\352\002\035Google::Cloud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ExportConfigProto.getDescriptor(),
              com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor(),
              com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor(),
              com.google.cloud.retail.v2beta.UserEventProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "WriteAsync",
            });
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "PrebuiltRule", "Parent", "UserEvent", "Uri", "Ets", "RawJson", "ConversionRule",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEventRejoinScope",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsResponse_descriptor,
            new java.lang.String[] {
              "RejoinedUserEventsCount",
            });
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_RejoinUserEventsMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2beta.ExportConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.ImportConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.PurgeConfigProto.getDescriptor();
    com.google.cloud.retail.v2beta.UserEventProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
