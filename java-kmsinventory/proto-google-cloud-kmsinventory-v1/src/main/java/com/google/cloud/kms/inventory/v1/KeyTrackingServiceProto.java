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
// source: google/cloud/kms/inventory/v1/key_tracking_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.kms.inventory.v1;

public final class KeyTrackingServiceProto {
  private KeyTrackingServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_GetProtectedResourcesSummaryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_GetProtectedResourcesSummaryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_ResourceTypesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_ResourceTypesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_CloudProductsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_CloudProductsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_LocationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_LocationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_kms_inventory_v1_ProtectedResource_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_kms_inventory_v1_ProtectedResource_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "8google/cloud/kms/inventory/v1/key_tracking_service.proto\022\035google.cloud.kms.inv"
          + "entory.v1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.proto\032\037google/protobuf/timestamp.proto\"r\n"
          + "#GetProtectedResourcesSummaryRequest\022K\n"
          + "\004name\030\001 \001(\tB=\340A\002\372A7\n"
          + "5kmsinventory.googleapis.com/ProtectedResourcesSummary\"\340\006\n"
          + "\031ProtectedResourcesSummary\022\014\n"
          + "\004name\030\005 \001(\t\022\026\n"
          + "\016resource_count\030\001 \001(\003\022\025\n\r"
          + "project_count\030\002 \001(\005\022c\n"
          + "\016resource_types\030\003 \003(\0132K.google.cl"
          + "oud.kms.inventory.v1.ProtectedResourcesSummary.ResourceTypesEntry\022c\n"
          + "\016cloud_products\030\006 \003(\0132K.google.cloud.kms.inventory.v"
          + "1.ProtectedResourcesSummary.CloudProductsEntry\022Z\n"
          + "\tlocations\030\004 \003(\0132G.google.cloud"
          + ".kms.inventory.v1.ProtectedResourcesSummary.LocationsEntry\0324\n"
          + "\022ResourceTypesEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\003:\0028\001\0324\n"
          + "\022CloudProductsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\003:\0028\001\0320\n"
          + "\016LocationsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\003:\0028\001:\301\002\352A\275\002\n"
          + "5kmsinventory.googleapis.com/ProtectedResourcesSummary\022m"
          + "projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_k"
          + "ey}/protectedResourcesSummary\022\224\001projects"
          + "/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryp"
          + "toKeyVersions/{crypto_key_version}/protectedResourcesSummary\"\315\001\n"
          + "\037SearchProtectedResourcesRequest\022G\n"
          + "\005scope\030\002 \001(\tB8\340A\002\372A2\n"
          + "0cloudresourcemanager.googleapis.com/Organization\022\035\n\n"
          + "crypto_key\030\001 \001(\tB\t\340A\002\372A\003\n"
          + "\001*\022\021\n"
          + "\tpage_size\030\003 \001(\005\022\022\n\n"
          + "page_token\030\004 \001(\t\022\033\n"
          + "\016resource_types\030\005 \003(\tB\003\340A\001\"\212\001\n"
          + " SearchProtectedResourcesResponse\022M\n"
          + "\023protected_resources\030\001"
          + " \003(\01320.google.cloud.kms.inventory.v1.ProtectedResource\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\371\003\n"
          + "\021ProtectedResource\022\014\n"
          + "\004name\030\001 \001(\t\022\017\n"
          + "\007project\030\002 \001(\t\022\022\n\n"
          + "project_id\030\t \001(\t\022\025\n\r"
          + "cloud_product\030\010 \001(\t\022\025\n\r"
          + "resource_type\030\003 \001(\t\022\020\n"
          + "\010location\030\004 \001(\t\022L\n"
          + "\006labels\030\005 \003"
          + "(\0132<.google.cloud.kms.inventory.v1.ProtectedResource.LabelsEntry\022I\n"
          + "\022crypto_key_version\030\006 \001(\tB-\372A*\n"
          + "(cloudkms.googleapis.com/CryptoKeyVersion\022J\n"
          + "\023crypto_key_versions\030\n"
          + " \003(\tB-\372A*\n"
          + "(cloudkms.googleapis.com/CryptoKeyVersion\0224\n"
          + "\013create_time\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\'\352A$\n"
          + "\037cloudasset.googleapis.com/Asset\022\001*2\332\004\n"
          + "\022KeyTrackingService\022\201\002\n"
          + "\034GetProtectedResourcesSummary\022B.google.cloud.kms.invento"
          + "ry.v1.GetProtectedResourcesSummaryRequest\0328.google.cloud.kms.inventory.v1.Protec"
          + "tedResourcesSummary\"c\332A\004name\202\323\344\223\002V\022T/v1/"
          + "{name=projects/*/locations/*/keyRings/*/"
          + "cryptoKeys/**}/protectedResourcesSummary\022\356\001\n"
          + "\030SearchProtectedResources\022>.google.cloud.kms.inventory.v1.SearchProtectedRes"
          + "ourcesRequest\032?.google.cloud.kms.invento"
          + "ry.v1.SearchProtectedResourcesResponse\"Q\332A\021scope,"
          + " crypto_key\202\323\344\223\0027\0225/v1/{scope=o"
          + "rganizations/*}/protectedResources:searc"
          + "h\032O\312A\033kmsinventory.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platformB\302\001\n"
          + "!com.google.cloud.kms.inventory.v1B\027KeyTrackingServiceProtoP\001Z?cloud.googl"
          + "e.com/go/kms/inventory/apiv1/inventorypb"
          + ";inventorypb\370\001\001\252\002\035Google.Cloud.Kms.Inven"
          + "tory.V1\312\002\035Google\\Cloud\\Kms\\Inventory\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_kms_inventory_v1_GetProtectedResourcesSummaryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_kms_inventory_v1_GetProtectedResourcesSummaryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_GetProtectedResourcesSummaryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor,
            new java.lang.String[] {
              "Name",
              "ResourceCount",
              "ProjectCount",
              "ResourceTypes",
              "CloudProducts",
              "Locations",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_ResourceTypesEntry_descriptor =
        internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_ResourceTypesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_ResourceTypesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_CloudProductsEntry_descriptor =
        internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_CloudProductsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_CloudProductsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_LocationsEntry_descriptor =
        internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_LocationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResourcesSummary_LocationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesRequest_descriptor,
            new java.lang.String[] {
              "Scope", "CryptoKey", "PageSize", "PageToken", "ResourceTypes",
            });
    internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_SearchProtectedResourcesResponse_descriptor,
            new java.lang.String[] {
              "ProtectedResources", "NextPageToken",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResource_descriptor,
            new java.lang.String[] {
              "Name",
              "Project",
              "ProjectId",
              "CloudProduct",
              "ResourceType",
              "Location",
              "Labels",
              "CryptoKeyVersion",
              "CryptoKeyVersions",
              "CreateTime",
            });
    internal_static_google_cloud_kms_inventory_v1_ProtectedResource_LabelsEntry_descriptor =
        internal_static_google_cloud_kms_inventory_v1_ProtectedResource_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_kms_inventory_v1_ProtectedResource_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_kms_inventory_v1_ProtectedResource_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
