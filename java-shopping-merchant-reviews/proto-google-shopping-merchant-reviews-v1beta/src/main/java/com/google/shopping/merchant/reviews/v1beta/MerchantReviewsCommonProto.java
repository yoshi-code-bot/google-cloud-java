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
// source: google/shopping/merchant/reviews/v1beta/merchantreviews_common.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.reviews.v1beta;

public final class MerchantReviewsCommonProto {
  private MerchantReviewsCommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewAttributes_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewAttributes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewDestinationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewDestinationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewItemLevelIssue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewItemLevelIssue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "Dgoogle/shopping/merchant/reviews/v1beta/merchantreviews_common.proto\022\'google.s"
          + "hopping.merchant.reviews.v1beta\032\037google/"
          + "api/field_behavior.proto\032\037google/protobuf/timestamp.proto\032"
          + " google/shopping/type/types.proto\"\245\010\n"
          + "\030MerchantReviewAttributes\022\035\n"
          + "\013merchant_id\030\001 \001(\tB\003\340A\002H\000\210\001\001\022\'\n"
          + "\025merchant_display_name\030\002 \001(\tB\003\340A\001H\001\210\001\001\022\037\n\r"
          + "merchant_link\030\003 \001(\tB\003\340A\001H\002\210\001\001\022&\n"
          + "\024merchant_rating_link\030\004 \001(\tB\003\340A\001H\003\210\001\001\022\034\n\n"
          + "min_rating\030\005 \001(\003B\003\340A\001H\004\210\001\001\022\034\n\n"
          + "max_rating\030\006 \001(\003B\003\340A\001H\005\210\001\001\022\030\n"
          + "\006rating\030\007 \001(\001B\003\340A\001H\006\210\001\001\022\027\n"
          + "\005title\030\010 \001(\tB\003\340A\001H\007\210\001\001\022\031\n"
          + "\007content\030\t \001(\tB\003\340A\002H\010\210\001\001\022\035\n"
          + "\013reviewer_id\030\n"
          + " \001(\tB\003\340A\001H\t\210\001\001\022#\n"
          + "\021reviewer_username\030\013 \001(\tB\003\340A\001H\n"
          + "\210\001\001\022\036\n"
          + "\014is_anonymous\030\014 \001(\010B\003\340A\001H\013\210\001\001\022w\n"
          + "\021collection_method\030\r"
          + " \001(\0162R.google.shopping.merchant.re"
          + "views.v1beta.MerchantReviewAttributes.CollectionMethodB\003\340A\001H\014\210\001\001\0229\n"
          + "\013review_time\030\016 \001(\0132\032.google.protobuf.TimestampB\003\340A\002H\r"
          + "\210\001\001\022!\n"
          + "\017review_language\030\017 \001(\tB\003\340A\001H\016\210\001\001\022 \n"
          + "\016review_country\030\020 \001(\tB\003\340A\001H\017\210\001\001\"y\n"
          + "\020CollectionMethod\022!\n"
          + "\035COLLECTION_METHOD_UNSPECIFIED\020\000\022\030\n"
          + "\024MERCHANT_UNSOLICITED\020\001\022\021\n\r"
          + "POINT_OF_SALE\020\002\022\025\n"
          + "\021AFTER_FULFILLMENT\020\003B\016\n"
          + "\014_merchant_idB\030\n"
          + "\026_merchant_display_nameB\020\n"
          + "\016_merchant_linkB\027\n"
          + "\025_merchant_rating_linkB\r\n"
          + "\013_min_ratingB\r\n"
          + "\013_max_ratingB\t\n"
          + "\007_ratingB\010\n"
          + "\006_titleB\n\n"
          + "\010_contentB\016\n"
          + "\014_reviewer_idB\024\n"
          + "\022_reviewer_usernameB\017\n\r"
          + "_is_anonymousB\024\n"
          + "\022_collection_methodB\016\n"
          + "\014_review_timeB\022\n"
          + "\020_review_languageB\021\n"
          + "\017_review_country\"\330\007\n"
          + "\024MerchantReviewStatus\022\200\001\n"
          + "\024destination_statuses\030\003 \003(\0132].google.shopping.merchant.r"
          + "eviews.v1beta.MerchantReviewStatus.MerchantReviewDestinationStatusB\003\340A\003\022z\n"
          + "\021item_level_issues\030\004 \003(\0132Z.google.shopping.mer"
          + "chant.reviews.v1beta.MerchantReviewStatus.MerchantReviewItemLevelIssueB\003\340A\003\0224\n"
          + "\013create_time\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0229\n"
          + "\020last_update_time\030\006"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\032~\n"
          + "\037MerchantReviewDestinationStatus\022[\n"
          + "\021reporting_context\030\001"
          + " \001(\0162;.google.shopping.type.ReportingContext.ReportingContextEnumB\003\340A\003\032\317\003\n"
          + "\034MerchantReviewItemLevelIssue\022\021\n"
          + "\004code\030\001 \001(\tB\003\340A\003\022z\n"
          + "\010severity\030\002 \001(\0162c.google.shopping.merchant.reviews.v1beta.MerchantRev"
          + "iewStatus.MerchantReviewItemLevelIssue.SeverityB\003\340A\003\022\027\n\n"
          + "resolution\030\003 \001(\tB\003\340A\003\022\026\n"
          + "\tattribute\030\004 \001(\tB\003\340A\003\022[\n"
          + "\021reporting_context\030\005"
          + " \001(\0162;.google.shopping.type.ReportingContext.ReportingContextEnumB\003\340A\003\022\030\n"
          + "\013description\030\006 \001(\tB\003\340A\003\022\023\n"
          + "\006detail\030\007 \001(\tB\003\340A\003\022\032\n\r"
          + "documentation\030\010 \001(\tB\003\340A\003\"G\n"
          + "\010Severity\022\030\n"
          + "\024SEVERITY_UNSPECIFIED\020\000\022\020\n"
          + "\014NOT_IMPACTED\020\001\022\017\n"
          + "\013DISAPPROVED\020\002B\232\002\n"
          + "+com.google.shopping.merchant.reviews.v1betaB\032Merchant"
          + "ReviewsCommonProtoP\001ZKcloud.google.com/go/shopping/merchant/reviews/apiv1beta/re"
          + "viewspb;reviewspb\252\002\'Google.Shopping.Merc"
          + "hant.Reviews.V1Beta\312\002\'Google\\Shopping\\Me"
          + "rchant\\Reviews\\V1beta\352\002+Google::Shopping::Merchant::Reviews::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewAttributes_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewAttributes_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewAttributes_descriptor,
            new java.lang.String[] {
              "MerchantId",
              "MerchantDisplayName",
              "MerchantLink",
              "MerchantRatingLink",
              "MinRating",
              "MaxRating",
              "Rating",
              "Title",
              "Content",
              "ReviewerId",
              "ReviewerUsername",
              "IsAnonymous",
              "CollectionMethod",
              "ReviewTime",
              "ReviewLanguage",
              "ReviewCountry",
            });
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_descriptor,
            new java.lang.String[] {
              "DestinationStatuses", "ItemLevelIssues", "CreateTime", "LastUpdateTime",
            });
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewDestinationStatus_descriptor =
        internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewDestinationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewDestinationStatus_descriptor,
            new java.lang.String[] {
              "ReportingContext",
            });
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewItemLevelIssue_descriptor =
        internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewItemLevelIssue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_reviews_v1beta_MerchantReviewStatus_MerchantReviewItemLevelIssue_descriptor,
            new java.lang.String[] {
              "Code",
              "Severity",
              "Resolution",
              "Attribute",
              "ReportingContext",
              "Description",
              "Detail",
              "Documentation",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
