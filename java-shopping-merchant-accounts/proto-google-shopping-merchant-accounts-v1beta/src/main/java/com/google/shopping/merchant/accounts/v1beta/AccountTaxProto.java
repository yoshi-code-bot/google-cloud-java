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
// source: google/shopping/merchant/accounts/v1beta/account_tax.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

public final class AccountTaxProto {
  private AccountTaxProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_AccountTax_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_AccountTax_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_GetAccountTaxRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_GetAccountTaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_UpdateAccountTaxRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_UpdateAccountTaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ":google/shopping/merchant/accounts/v1beta/account_tax.proto\022(google.shopping.me"
          + "rchant.accounts.v1beta\032\034google/api/annot"
          + "ations.proto\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/api/resource.proto\032"
          + " google/protobuf/field"
          + "_mask.proto\0327google/shopping/merchant/accounts/v1beta/tax_rule.proto\"\346\001\n\n"
          + "AccountTax\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\024\n"
          + "\007account\030\002 \001(\003B\003\340A\003\022D\n"
          + "\ttax_rules\030\003"
          + " \003(\01321.google.shopping.merchant.accounts.v1beta.TaxRule:i\352Af\n"
          + "%merchantapi.googleapis.com/AccountTax\022#"
          + "accounts/{account}/accounttax/{tax}*\014accountTaxes2\n"
          + "accountTax\"S\n"
          + "\024GetAccountTaxRequest\022;\n"
          + "\004name\030\001 \001(\tB-\340A\002\372A\'\n"
          + "%merchantapi.googleapis.com/AccountTax\"\232\001\n"
          + "\027UpdateAccountTaxRequest\022N\n"
          + "\013account_tax\030\001 \001(\01324.go"
          + "ogle.shopping.merchant.accounts.v1beta.AccountTaxB\003\340A\002\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"}\n"
          + "\025ListAccountTaxRequest\022=\n"
          + "\006parent\030\001 \001("
          + "\tB-\340A\002\372A\'\022%merchantapi.googleapis.com/AccountTax\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"~\n"
          + "\026ListAccountTaxResponse\022K\n\r"
          + "account_taxes\030\001 \003(\0132"
          + "4.google.shopping.merchant.accounts.v1beta.AccountTax\022\027\n"
          + "\017next_page_token\030\002 \001(\t2\204\006\n"
          + "\021AccountTaxService\022\305\001\n\r"
          + "GetAccountTax\022>.google.shopping.merchant.accounts.v1bet"
          + "a.GetAccountTaxRequest\0324.google.shopping"
          + ".merchant.accounts.v1beta.AccountTax\">\332A"
          + "\004name\202\323\344\223\0021\022//accounts/v1beta/{name=accounts/*/accounttax/*}\022\325\001\n"
          + "\016ListAccountTax\022?.google.shopping.merchant.accounts.v1be"
          + "ta.ListAccountTaxRequest\032@.google.shopping.merchant.accounts.v1beta.ListAccountT"
          + "axResponse\"@\332A\006parent\202\323\344\223\0021\022//accounts/v1beta/{parent=accounts/*}/accounttax\022\205\002\n"
          + "\020UpdateAccountTax\022A.google.shopping.merchant.accounts.v1beta.UpdateAccountTaxReq"
          + "uest\0324.google.shopping.merchant.accounts"
          + ".v1beta.AccountTax\"x\332A\027account_tax,updat"
          + "e_mask\332A\013account_tax\202\323\344\223\002J2;/accounts/v1"
          + "beta/{account_tax.name=accounts/*/accoun"
          + "ttax/*}:\013account_tax\032G\312A\032merchantapi.goo"
          + "gleapis.com\322A\'https://www.googleapis.com/auth/contentB\221\001\n"
          + ",com.google.shopping.merchant.accounts.v1betaB\017AccountTaxProtoP"
          + "\001ZNcloud.google.com/go/shopping/merchant/accounts/apiv1beta/accountspb;accountsp"
          + "bb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.shopping.merchant.accounts.v1beta.TaxRuleProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_accounts_v1beta_AccountTax_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_accounts_v1beta_AccountTax_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_AccountTax_descriptor,
            new java.lang.String[] {
              "Name", "Account", "TaxRules",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_GetAccountTaxRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_accounts_v1beta_GetAccountTaxRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_GetAccountTaxRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_UpdateAccountTaxRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_accounts_v1beta_UpdateAccountTaxRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_UpdateAccountTaxRequest_descriptor,
            new java.lang.String[] {
              "AccountTax", "UpdateMask",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_accounts_v1beta_ListAccountTaxResponse_descriptor,
            new java.lang.String[] {
              "AccountTaxes", "NextPageToken",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.shopping.merchant.accounts.v1beta.TaxRuleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
