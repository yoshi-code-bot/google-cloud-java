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
// source:
// google/cloud/beyondcorp/clientconnectorservices/v1/client_connector_services_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.beyondcorp.clientconnectorservices.v1;

public final class ClientConnectorServicesServiceProto {
  private ClientConnectorServicesServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_GetClientConnectorServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_GetClientConnectorServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_CreateClientConnectorServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_CreateClientConnectorServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_UpdateClientConnectorServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_UpdateClientConnectorServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_DeleteClientConnectorServiceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_DeleteClientConnectorServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Zgoogle/cloud/beyondcorp/clientconnectorservices/v1/client_connector_services_s"
          + "ervice.proto\0222google.cloud.beyondcorp.cl"
          + "ientconnectorservices.v1\032\034google/api/ann"
          + "otations.proto\032\027google/api/client.proto\032"
          + "\037google/api/field_behavior.proto\032\031google"
          + "/api/resource.proto\032#google/longrunning/operations.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.proto\"\334\013\n"
          + "\026ClientConnectorService\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\0224\n"
          + "\013create_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\031\n"
          + "\014display_name\030\004 \001(\tB\003\340A\001\022h\n"
          + "\007ingress\030\006 \001(\0132R.google.cloud.beyondcorp.clientconnec"
          + "torservices.v1.ClientConnectorService.IngressB\003\340A\002\022f\n"
          + "\006egress\030\007 \001(\0132Q.google.clou"
          + "d.beyondcorp.clientconnectorservices.v1.ClientConnectorService.EgressB\003\340A\002\022d\n"
          + "\005state\030\010 \001(\0162P.google.cloud.beyondcorp.clie"
          + "ntconnectorservices.v1.ClientConnectorService.StateB\003\340A\003\032\265\004\n"
          + "\007Ingress\022k\n"
          + "\006config\030\001 \001(\0132Y.google.cloud.beyondcorp.clientcon"
          + "nectorservices.v1.ClientConnectorService.Ingress.ConfigH\000\032\252\003\n"
          + "\006Config\022\217\001\n"
          + "\022transport_protocol\030\001 \001(\0162k.google.cloud.beyondc"
          + "orp.clientconnectorservices.v1.ClientCon"
          + "nectorService.Ingress.Config.TransportProtocolB\006\340A\002\340A\005\022\213\001\n"
          + "\022destination_routes\030\002 \003(\0132j.google.cloud.beyondcorp.clientconn"
          + "ectorservices.v1.ClientConnectorService.Ingress.Config.DestinationRouteB\003\340A\002\032>\n"
          + "\020DestinationRoute\022\024\n"
          + "\007address\030\001 \001(\tB\003\340A\002\022\024\n"
          + "\007netmask\030\002 \001(\tB\003\340A\002\"@\n"
          + "\021TransportProtocol\022\"\n"
          + "\036TRANSPORT_PROTOCOL_UNSPECIFIED\020\000\022\007\n"
          + "\003TCP\020\001B\020\n"
          + "\016ingress_config\032\266\001\n"
          + "\006Egress\022q\n\n"
          + "peered_vpc\030\001 \001(\0132[.google.cloud.beyondcor"
          + "p.clientconnectorservices.v1.ClientConnectorService.Egress.PeeredVpcH\000\032%\n"
          + "\tPeeredVpc\022\030\n"
          + "\013network_vpc\030\001 \001(\tB\003\340A\002B\022\n"
          + "\020destination_type\"j\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\014\n"
          + "\010UPDATING\020\002\022\014\n"
          + "\010DELETING\020\003\022\013\n"
          + "\007RUNNING\020\004\022\010\n"
          + "\004DOWN\020\005\022\t\n"
          + "\005ERROR\020\006:\222\001\352A\216\001\n"
          + "0beyondcorp.googleapis.com/ClientConnectorService\022Zprojects/{project}/locat"
          + "ions/{location}/clientConnectorServices/{client_connector_service}\"\313\001\n"
          + "\"ListClientConnectorServicesRequest\022H\n"
          + "\006parent\030\001 \001("
          + "\tB8\340A\002\372A2\0220beyondcorp.googleapis.com/ClientConnectorService\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\302\001\n"
          + "#ListClientConnectorServicesResponse\022m\n"
          + "\031client_connector_services\030\001 \003(\0132J.google.clo"
          + "ud.beyondcorp.clientconnectorservices.v1.ClientConnectorService\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"j\n"
          + " GetClientConnectorServiceRequest\022F\n"
          + "\004name\030\001 \001(\tB8\340A\002\372A2\n"
          + "0beyondcorp.googleapis.com/ClientConnectorService\"\301\002\n"
          + "#CreateClientConnectorServiceRequest\022H\n"
          + "\006parent\030\001 \001(\tB8\340A\002\372A"
          + "2\0220beyondcorp.googleapis.com/ClientConnectorService\022(\n"
          + "\033client_connector_service_id\030\002 \001(\tB\003\340A\001\022q\n"
          + "\030client_connector_service\030\003 \001(\0132J.google.cloud.beyondcorp.client"
          + "connectorservices.v1.ClientConnectorServiceB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\022\032\n\r"
          + "validate_only\030\005 \001(\010B\003\340A\001\"\237\002\n"
          + "#UpdateClientConnectorServiceRequest\0224\n"
          + "\013update_mask\030\001 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022q\n"
          + "\030client_connector_service\030\002 \001(\0132J.google.c"
          + "loud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceB\003\340A\002\022\027\n\n"
          + "request_id\030\003 \001(\tB\003\340A\001\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\001\022\032\n\r"
          + "allow_missing\030\005 \001(\010B\003\340A\001\"\242\001\n"
          + "#DeleteClientConnectorServiceRequest\022F\n"
          + "\004name\030\001 \001(\tB8\340A\002\372A2\n"
          + "0beyondcorp.googleapis.com/ClientConnectorService\022\027\n\n"
          + "request_id\030\002 \001(\tB\003\340A\001\022\032\n\r"
          + "validate_only\030\003 \001(\010B\003\340A\001\"\226\002\n"
          + "\'ClientConnectorServiceOperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\0032\273\r"
          + "\n"
          + "\036ClientConnectorServicesService\022\234\002\n"
          + "\033ListClientConnectorServices\022V.google.cloud."
          + "beyondcorp.clientconnectorservices.v1.ListClientConnectorServicesRequest\032W.googl"
          + "e.cloud.beyondcorp.clientconnectorservices.v1.ListClientConnectorServicesRespons"
          + "e\"L\332A\006parent\202\323\344\223\002=\022;/v1/{parent=projects"
          + "/*/locations/*}/clientConnectorServices\022\211\002\n"
          + "\031GetClientConnectorService\022T.google.cloud.beyondcorp.clientconnectorservices."
          + "v1.GetClientConnectorServiceRequest\032J.google.cloud.beyondcorp.clientconnectorser"
          + "vices.v1.ClientConnectorService\"J\332A\004name"
          + "\202\323\344\223\002=\022;/v1/{name=projects/*/locations/*/clientConnectorServices/*}\022\370\002\n"
          + "\034CreateClientConnectorService\022W.google.cloud.beyo"
          + "ndcorp.clientconnectorservices.v1.Create"
          + "ClientConnectorServiceRequest\032\035.google.longrunning.Operation\"\337\001\312AA\n"
          + "\026ClientConnectorService\022\'ClientConnectorServiceOperat"
          + "ionMetadata\332A;parent,client_connector_se"
          + "rvice,client_connector_service_id\202\323\344\223\002W\""
          + ";/v1/{parent=projects/*/locations/*}/cli"
          + "entConnectorServices:\030client_connector_service\022\372\002\n"
          + "\034UpdateClientConnectorService\022W.google.cloud.beyondcorp.clientconnecto"
          + "rservices.v1.UpdateClientConnectorServic"
          + "eRequest\032\035.google.longrunning.Operation\"\341\001\312AA\n"
          + "\026ClientConnectorService\022\'ClientConnectorServiceOperationMetadata\332A$client_"
          + "connector_service,update_mask\202\323\344\223\002p2T/v1"
          + "/{client_connector_service.name=projects"
          + "/*/locations/*/clientConnectorServices/*}:\030client_connector_service\022\246\002\n"
          + "\034DeleteClientConnectorService\022W.google.cloud.beyo"
          + "ndcorp.clientconnectorservices.v1.Delete"
          + "ClientConnectorServiceRequest\032\035.google.longrunning.Operation\"\215\001\312A@\n"
          + "\025google.protobuf.Empty\022\'ClientConnectorServiceOperati"
          + "onMetadata\332A\004name\202\323\344\223\002=*;/v1/{name=proje"
          + "cts/*/locations/*/clientConnectorService"
          + "s/*}\032M\312A\031beyondcorp.googleapis.com\322A.htt"
          + "ps://www.googleapis.com/auth/cloud-platformB\364\002\n"
          + "6com.google.cloud.beyondcorp.clientconnectorservices.v1B#ClientConnectorS"
          + "ervicesServiceProtoP\001Zpcloud.google.com/go/beyondcorp/clientconnectorservices/ap"
          + "iv1/clientconnectorservicespb;clientconnectorservicespb\252\0022Google.Cloud.BeyondCor"
          + "p.ClientConnectorServices.V1\312\0022Google\\Cl"
          + "oud\\BeyondCorp\\ClientConnectorServices\\V"
          + "1\352\0026Google::Cloud::BeyondCorp::ClientConnectorServices::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "DisplayName", "Ingress", "Egress", "State",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor =
        internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor,
            new java.lang.String[] {
              "Config", "IngressConfig",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor =
        internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor,
            new java.lang.String[] {
              "TransportProtocol", "DestinationRoutes",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor =
        internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Ingress_Config_DestinationRoute_descriptor,
            new java.lang.String[] {
              "Address", "Netmask",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor =
        internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor,
            new java.lang.String[] {
              "PeeredVpc", "DestinationType",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor =
        internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorService_Egress_PeeredVpc_descriptor,
            new java.lang.String[] {
              "NetworkVpc",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ListClientConnectorServicesResponse_descriptor,
            new java.lang.String[] {
              "ClientConnectorServices", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_GetClientConnectorServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_GetClientConnectorServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_GetClientConnectorServiceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_CreateClientConnectorServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_CreateClientConnectorServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_CreateClientConnectorServiceRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "ClientConnectorServiceId",
              "ClientConnectorService",
              "RequestId",
              "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_UpdateClientConnectorServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_UpdateClientConnectorServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_UpdateClientConnectorServiceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "ClientConnectorService", "RequestId", "ValidateOnly", "AllowMissing",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_DeleteClientConnectorServiceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_DeleteClientConnectorServiceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_DeleteClientConnectorServiceRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId", "ValidateOnly",
            });
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
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
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
