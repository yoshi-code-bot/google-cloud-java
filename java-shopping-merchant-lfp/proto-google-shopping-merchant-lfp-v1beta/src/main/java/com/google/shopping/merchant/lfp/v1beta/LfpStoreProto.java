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
// source: google/shopping/merchant/lfp/v1beta/lfpstore.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.lfp.v1beta;

public final class LfpStoreProto {
  private LfpStoreProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_LfpStore_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_LfpStore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_GetLfpStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_GetLfpStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_DeleteLfpStoreRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_DeleteLfpStoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "2google/shopping/merchant/lfp/v1beta/lfpstore.proto\022#google.shopping.merchant.l"
          + "fp.v1beta\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.proto\032\033google/protobuf/empty.proto\"\346\005\n"
          + "\010LfpStore\022\024\n"
          + "\004name\030\001 \001(\tB\006\340A\003\340A\010\022\033\n"
          + "\016target_account\030\002 \001(\003B\003\340A\002\022\032\n\n"
          + "store_code\030\003 \001(\tB\006\340A\002\340A\005\022\032\n\r"
          + "store_address\030\004 \001(\tB\003\340A\002\022\034\n\n"
          + "store_name\030\005 \001(\tB\003\340A\001H\000\210\001\001\022\036\n"
          + "\014phone_number\030\006 \001(\tB\003\340A\001H\001\210\001\001\022\035\n"
          + "\013website_uri\030\007 \001(\tB\003\340A\001H\002\210\001\001\022\032\n\r"
          + "gcid_category\030\010 \003(\tB\003\340A\001\022\032\n"
          + "\010place_id\030\t \001(\tB\003\340A\001H\003\210\001\001\022`\n"
          + "\016matching_state\030\n"
          + " \001(\0162@.google.shopping.merchant.lfp.v1"
          + "beta.LfpStore.StoreMatchingStateB\006\340A\001\340A\003\022(\n"
          + "\023matching_state_hint\030\013 \001(\tB\006\340A\001\340A\003H\004\210\001\001\"}\n"
          + "\022StoreMatchingState\022$\n"
          + " STORE_MATCHING_STATE_UNSPECIFIED\020\000\022 \n"
          + "\034STORE_MATCHING_STATE_MATCHED\020\001\022\037\n"
          + "\033STORE_MATCHING_STATE_FAILED\020\002:z\352Aw\n"
          + "#merchantapi.googleapis.c"
          + "om/LfpStore\022;accounts/{account}/lfpStores/{target_merchant}~{store_code}*"
          + "\tlfpStores2\010lfpStoreB\r\n"
          + "\013_store_nameB\017\n\r"
          + "_phone_numberB\016\n"
          + "\014_website_uriB\013\n"
          + "\t_place_idB\026\n"
          + "\024_matching_state_hint\"O\n"
          + "\022GetLfpStoreRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#merchantapi.googleapis.com/LfpStore\"\233\001\n"
          + "\025InsertLfpStoreRequest\022;\n"
          + "\006parent\030\001 \001("
          + "\tB+\340A\002\372A%\022#merchantapi.googleapis.com/LfpStore\022E\n"
          + "\tlfp_store\030\002"
          + " \001(\0132-.google.shopping.merchant.lfp.v1beta.LfpStoreB\003\340A\002\"R\n"
          + "\025DeleteLfpStoreRequest\0229\n"
          + "\004name\030\001 \001(\tB+\340A\002\372A%\n"
          + "#merchantapi.googleapis.com/LfpStore\"\241\001\n"
          + "\024ListLfpStoresRequest\022;\n"
          + "\006parent\030\001 \001("
          + "\tB+\340A\002\372A%\022#merchantapi.googleapis.com/LfpStore\022\033\n"
          + "\016target_account\030\002 \001(\003B\003\340A\002\022\026\n"
          + "\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\004 \001(\tB\003\340A\001\"s\n"
          + "\025ListLfpStoresResponse\022A\n\n"
          + "lfp_stores\030\001 \003(\0132-.google.shopping.merchant.lfp.v1beta.LfpStore\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\310\006\n"
          + "\017LfpStoreService\022\257\001\n"
          + "\013GetLfpStore\0227.google.shopping.merchant.lfp.v1beta.GetLfpStoreRequest\032-.go"
          + "ogle.shopping.merchant.lfp.v1beta.LfpSto"
          + "re\"8\332A\004name\202\323\344\223\002+\022)/lfp/v1beta/{name=accounts/*/lfpStores/*}\022\323\001\n"
          + "\016InsertLfpStore\022:.google.shopping.merchant.lfp.v1beta.In"
          + "sertLfpStoreRequest\032-.google.shopping.me"
          + "rchant.lfp.v1beta.LfpStore\"V\332A\020parent,lf"
          + "p_store\202\323\344\223\002=\"0/lfp/v1beta/{parent=accounts/*}/lfpStores:insert:"
          + "\tlfp_store\022\236\001\n"
          + "\016DeleteLfpStore\022:.google.shopping.merchant"
          + ".lfp.v1beta.DeleteLfpStoreRequest\032\026.goog"
          + "le.protobuf.Empty\"8\332A\004name\202\323\344\223\002+*)/lfp/v1beta/{name=accounts/*/lfpStores/*}\022\302\001\n\r"
          + "ListLfpStores\0229.google.shopping.merchant.lfp.v1beta.ListLfpStoresRequest\032:.googl"
          + "e.shopping.merchant.lfp.v1beta.ListLfpSt"
          + "oresResponse\":\332A\006parent\202\323\344\223\002+\022)/lfp/v1be"
          + "ta/{parent=accounts/*}/lfpStores\032G\312A\032mer"
          + "chantapi.googleapis.com\322A\'https://www.googleapis.com/auth/contentB{\n"
          + "\'com.google.shopping.merchant.lfp.v1betaB\r"
          + "LfpStoreProtoP\001Z?cloud.google.com/go/shopping/merc"
          + "hant/lfp/apiv1beta/lfppb;lfppbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_lfp_v1beta_LfpStore_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_lfp_v1beta_LfpStore_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_LfpStore_descriptor,
            new java.lang.String[] {
              "Name",
              "TargetAccount",
              "StoreCode",
              "StoreAddress",
              "StoreName",
              "PhoneNumber",
              "WebsiteUri",
              "GcidCategory",
              "PlaceId",
              "MatchingState",
              "MatchingStateHint",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_GetLfpStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_lfp_v1beta_GetLfpStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_GetLfpStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpStoreRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LfpStore",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_DeleteLfpStoreRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_lfp_v1beta_DeleteLfpStoreRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_DeleteLfpStoreRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TargetAccount", "PageSize", "PageToken",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_ListLfpStoresResponse_descriptor,
            new java.lang.String[] {
              "LfpStores", "NextPageToken",
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
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
