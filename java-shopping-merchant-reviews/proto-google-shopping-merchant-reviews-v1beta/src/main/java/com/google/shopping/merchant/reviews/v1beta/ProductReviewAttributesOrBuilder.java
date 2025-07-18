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
// source: google/shopping/merchant/reviews/v1beta/productreviews_common.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.reviews.v1beta;

public interface ProductReviewAttributesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reviews.v1beta.ProductReviewAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the aggregator of the product reviews.
   *
   * A publisher may use a reviews aggregator to manage reviews and provide
   * the feeds. This element indicates the use of an aggregator and contains
   * information about the aggregator.
   * </pre>
   *
   * <code>optional string aggregator_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the aggregatorName field is set.
   */
  boolean hasAggregatorName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the aggregator of the product reviews.
   *
   * A publisher may use a reviews aggregator to manage reviews and provide
   * the feeds. This element indicates the use of an aggregator and contains
   * information about the aggregator.
   * </pre>
   *
   * <code>optional string aggregator_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The aggregatorName.
   */
  java.lang.String getAggregatorName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the aggregator of the product reviews.
   *
   * A publisher may use a reviews aggregator to manage reviews and provide
   * the feeds. This element indicates the use of an aggregator and contains
   * information about the aggregator.
   * </pre>
   *
   * <code>optional string aggregator_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for aggregatorName.
   */
  com.google.protobuf.ByteString getAggregatorNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the subclient of the product reviews.
   *
   * The subclient is an identifier of the product review source.
   * It should be equivalent to the directory provided in the file data source
   * path.
   * </pre>
   *
   * <code>optional string subclient_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the subclientName field is set.
   */
  boolean hasSubclientName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the subclient of the product reviews.
   *
   * The subclient is an identifier of the product review source.
   * It should be equivalent to the directory provided in the file data source
   * path.
   * </pre>
   *
   * <code>optional string subclient_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The subclientName.
   */
  java.lang.String getSubclientName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the subclient of the product reviews.
   *
   * The subclient is an identifier of the product review source.
   * It should be equivalent to the directory provided in the file data source
   * path.
   * </pre>
   *
   * <code>optional string subclient_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for subclientName.
   */
  com.google.protobuf.ByteString getSubclientNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the publisher of the product reviews.
   *
   * The information about the publisher, which may be a retailer,
   * manufacturer, reviews service company, or any entity that publishes
   * product reviews.
   * </pre>
   *
   * <code>optional string publisher_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the publisherName field is set.
   */
  boolean hasPublisherName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the publisher of the product reviews.
   *
   * The information about the publisher, which may be a retailer,
   * manufacturer, reviews service company, or any entity that publishes
   * product reviews.
   * </pre>
   *
   * <code>optional string publisher_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The publisherName.
   */
  java.lang.String getPublisherName();

  /**
   *
   *
   * <pre>
   * Optional. The name of the publisher of the product reviews.
   *
   * The information about the publisher, which may be a retailer,
   * manufacturer, reviews service company, or any entity that publishes
   * product reviews.
   * </pre>
   *
   * <code>optional string publisher_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for publisherName.
   */
  com.google.protobuf.ByteString getPublisherNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A link to the company favicon of the publisher. The image
   * dimensions should be favicon size: 16x16 pixels. The image format should be
   * GIF, JPG or PNG.
   * </pre>
   *
   * <code>optional string publisher_favicon = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the publisherFavicon field is set.
   */
  boolean hasPublisherFavicon();

  /**
   *
   *
   * <pre>
   * Optional. A link to the company favicon of the publisher. The image
   * dimensions should be favicon size: 16x16 pixels. The image format should be
   * GIF, JPG or PNG.
   * </pre>
   *
   * <code>optional string publisher_favicon = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The publisherFavicon.
   */
  java.lang.String getPublisherFavicon();

  /**
   *
   *
   * <pre>
   * Optional. A link to the company favicon of the publisher. The image
   * dimensions should be favicon size: 16x16 pixels. The image format should be
   * GIF, JPG or PNG.
   * </pre>
   *
   * <code>optional string publisher_favicon = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for publisherFavicon.
   */
  com.google.protobuf.ByteString getPublisherFaviconBytes();

  /**
   *
   *
   * <pre>
   * Optional. The author of the product review.
   *
   * A permanent, unique identifier for the author of the review in the
   * publisher's system.
   * </pre>
   *
   * <code>optional string reviewer_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reviewerId field is set.
   */
  boolean hasReviewerId();

  /**
   *
   *
   * <pre>
   * Optional. The author of the product review.
   *
   * A permanent, unique identifier for the author of the review in the
   * publisher's system.
   * </pre>
   *
   * <code>optional string reviewer_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reviewerId.
   */
  java.lang.String getReviewerId();

  /**
   *
   *
   * <pre>
   * Optional. The author of the product review.
   *
   * A permanent, unique identifier for the author of the review in the
   * publisher's system.
   * </pre>
   *
   * <code>optional string reviewer_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reviewerId.
   */
  com.google.protobuf.ByteString getReviewerIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Set to true if the reviewer should remain anonymous.
   * </pre>
   *
   * <code>optional bool reviewer_is_anonymous = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reviewerIsAnonymous field is set.
   */
  boolean hasReviewerIsAnonymous();

  /**
   *
   *
   * <pre>
   * Optional. Set to true if the reviewer should remain anonymous.
   * </pre>
   *
   * <code>optional bool reviewer_is_anonymous = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reviewerIsAnonymous.
   */
  boolean getReviewerIsAnonymous();

  /**
   *
   *
   * <pre>
   * Optional. The name of the reviewer of the product review.
   * </pre>
   *
   * <code>optional string reviewer_username = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reviewerUsername field is set.
   */
  boolean hasReviewerUsername();

  /**
   *
   *
   * <pre>
   * Optional. The name of the reviewer of the product review.
   * </pre>
   *
   * <code>optional string reviewer_username = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reviewerUsername.
   */
  java.lang.String getReviewerUsername();

  /**
   *
   *
   * <pre>
   * Optional. The name of the reviewer of the product review.
   * </pre>
   *
   * <code>optional string reviewer_username = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reviewerUsername.
   */
  com.google.protobuf.ByteString getReviewerUsernameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language of the review defined by BCP-47 language code.
   * </pre>
   *
   * <code>optional string review_language = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reviewLanguage field is set.
   */
  boolean hasReviewLanguage();

  /**
   *
   *
   * <pre>
   * Optional. The language of the review defined by BCP-47 language code.
   * </pre>
   *
   * <code>optional string review_language = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reviewLanguage.
   */
  java.lang.String getReviewLanguage();

  /**
   *
   *
   * <pre>
   * Optional. The language of the review defined by BCP-47 language code.
   * </pre>
   *
   * <code>optional string review_language = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reviewLanguage.
   */
  com.google.protobuf.ByteString getReviewLanguageBytes();

  /**
   *
   *
   * <pre>
   * Optional. The country of the review defined by ISO 3166-1 Alpha-2 Country
   * Code.
   * </pre>
   *
   * <code>optional string review_country = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reviewCountry field is set.
   */
  boolean hasReviewCountry();

  /**
   *
   *
   * <pre>
   * Optional. The country of the review defined by ISO 3166-1 Alpha-2 Country
   * Code.
   * </pre>
   *
   * <code>optional string review_country = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reviewCountry.
   */
  java.lang.String getReviewCountry();

  /**
   *
   *
   * <pre>
   * Optional. The country of the review defined by ISO 3166-1 Alpha-2 Country
   * Code.
   * </pre>
   *
   * <code>optional string review_country = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reviewCountry.
   */
  com.google.protobuf.ByteString getReviewCountryBytes();

  /**
   *
   *
   * <pre>
   * Required. The timestamp indicating when the review was written.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp review_time = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reviewTime field is set.
   */
  boolean hasReviewTime();

  /**
   *
   *
   * <pre>
   * Required. The timestamp indicating when the review was written.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp review_time = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reviewTime.
   */
  com.google.protobuf.Timestamp getReviewTime();

  /**
   *
   *
   * <pre>
   * Required. The timestamp indicating when the review was written.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp review_time = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getReviewTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The title of the review.
   * </pre>
   *
   * <code>optional string title = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the title field is set.
   */
  boolean hasTitle();

  /**
   *
   *
   * <pre>
   * Optional. The title of the review.
   * </pre>
   *
   * <code>optional string title = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();

  /**
   *
   *
   * <pre>
   * Optional. The title of the review.
   * </pre>
   *
   * <code>optional string title = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional. The content of the review. If empty, the content might still get
   * populated from pros and cons.
   * </pre>
   *
   * <code>optional string content = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();

  /**
   *
   *
   * <pre>
   * Optional. The content of the review. If empty, the content might still get
   * populated from pros and cons.
   * </pre>
   *
   * <code>optional string content = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The content.
   */
  java.lang.String getContent();

  /**
   *
   *
   * <pre>
   * Optional. The content of the review. If empty, the content might still get
   * populated from pros and cons.
   * </pre>
   *
   * <code>optional string content = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Contains the advantages based on the opinion of the reviewer.
   * Omit boilerplate text like "pro:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string pros = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the pros.
   */
  java.util.List<java.lang.String> getProsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains the advantages based on the opinion of the reviewer.
   * Omit boilerplate text like "pro:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string pros = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of pros.
   */
  int getProsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains the advantages based on the opinion of the reviewer.
   * Omit boilerplate text like "pro:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string pros = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The pros at the given index.
   */
  java.lang.String getPros(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains the advantages based on the opinion of the reviewer.
   * Omit boilerplate text like "pro:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string pros = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the pros at the given index.
   */
  com.google.protobuf.ByteString getProsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains the disadvantages based on the opinion of the reviewer.
   * Omit boilerplate text like "con:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string cons = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the cons.
   */
  java.util.List<java.lang.String> getConsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains the disadvantages based on the opinion of the reviewer.
   * Omit boilerplate text like "con:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string cons = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of cons.
   */
  int getConsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains the disadvantages based on the opinion of the reviewer.
   * Omit boilerplate text like "con:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string cons = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The cons at the given index.
   */
  java.lang.String getCons(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains the disadvantages based on the opinion of the reviewer.
   * Omit boilerplate text like "con:" unless it was written by the reviewer.
   * </pre>
   *
   * <code>repeated string cons = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cons at the given index.
   */
  com.google.protobuf.ByteString getConsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The URI of the review landing page.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.ReviewLink review_link = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the reviewLink field is set.
   */
  boolean hasReviewLink();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the review landing page.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.ReviewLink review_link = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The reviewLink.
   */
  com.google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.ReviewLink getReviewLink();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the review landing page.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.ReviewLink review_link = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.ReviewLinkOrBuilder
      getReviewLinkOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A URI to an image of the reviewed product created by the review
   * author. The URI does not have to end with an image file extension.
   * </pre>
   *
   * <code>repeated string reviewer_image_links = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the reviewerImageLinks.
   */
  java.util.List<java.lang.String> getReviewerImageLinksList();

  /**
   *
   *
   * <pre>
   * Optional. A URI to an image of the reviewed product created by the review
   * author. The URI does not have to end with an image file extension.
   * </pre>
   *
   * <code>repeated string reviewer_image_links = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of reviewerImageLinks.
   */
  int getReviewerImageLinksCount();

  /**
   *
   *
   * <pre>
   * Optional. A URI to an image of the reviewed product created by the review
   * author. The URI does not have to end with an image file extension.
   * </pre>
   *
   * <code>repeated string reviewer_image_links = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The reviewerImageLinks at the given index.
   */
  java.lang.String getReviewerImageLinks(int index);

  /**
   *
   *
   * <pre>
   * Optional. A URI to an image of the reviewed product created by the review
   * author. The URI does not have to end with an image file extension.
   * </pre>
   *
   * <code>repeated string reviewer_image_links = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the reviewerImageLinks at the given index.
   */
  com.google.protobuf.ByteString getReviewerImageLinksBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains the ratings associated with the review.
   * The minimum possible number for the rating. This should be the worst
   * possible rating and should not be a value for no rating.
   * </pre>
   *
   * <code>optional int64 min_rating = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the minRating field is set.
   */
  boolean hasMinRating();

  /**
   *
   *
   * <pre>
   * Optional. Contains the ratings associated with the review.
   * The minimum possible number for the rating. This should be the worst
   * possible rating and should not be a value for no rating.
   * </pre>
   *
   * <code>optional int64 min_rating = 17 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minRating.
   */
  long getMinRating();

  /**
   *
   *
   * <pre>
   * Optional. The maximum possible number for the rating. The value of the max
   * rating must be greater than the value of the min attribute.
   * </pre>
   *
   * <code>optional int64 max_rating = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the maxRating field is set.
   */
  boolean hasMaxRating();

  /**
   *
   *
   * <pre>
   * Optional. The maximum possible number for the rating. The value of the max
   * rating must be greater than the value of the min attribute.
   * </pre>
   *
   * <code>optional int64 max_rating = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxRating.
   */
  long getMaxRating();

  /**
   *
   *
   * <pre>
   * Optional. The reviewer's overall rating of the product.
   * </pre>
   *
   * <code>optional double rating = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the rating field is set.
   */
  boolean hasRating();

  /**
   *
   *
   * <pre>
   * Optional. The reviewer's overall rating of the product.
   * </pre>
   *
   * <code>optional double rating = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rating.
   */
  double getRating();

  /**
   *
   *
   * <pre>
   * Optional. Descriptive name of a product.
   * </pre>
   *
   * <code>repeated string product_names = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the productNames.
   */
  java.util.List<java.lang.String> getProductNamesList();

  /**
   *
   *
   * <pre>
   * Optional. Descriptive name of a product.
   * </pre>
   *
   * <code>repeated string product_names = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of productNames.
   */
  int getProductNamesCount();

  /**
   *
   *
   * <pre>
   * Optional. Descriptive name of a product.
   * </pre>
   *
   * <code>repeated string product_names = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The productNames at the given index.
   */
  java.lang.String getProductNames(int index);

  /**
   *
   *
   * <pre>
   * Optional. Descriptive name of a product.
   * </pre>
   *
   * <code>repeated string product_names = 20 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the productNames at the given index.
   */
  com.google.protobuf.ByteString getProductNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The URI of the product. This URI can have the same value as the
   * `review_link` element, if the review URI and the product URI are the
   * same.
   * </pre>
   *
   * <code>repeated string product_links = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the productLinks.
   */
  java.util.List<java.lang.String> getProductLinksList();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the product. This URI can have the same value as the
   * `review_link` element, if the review URI and the product URI are the
   * same.
   * </pre>
   *
   * <code>repeated string product_links = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of productLinks.
   */
  int getProductLinksCount();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the product. This URI can have the same value as the
   * `review_link` element, if the review URI and the product URI are the
   * same.
   * </pre>
   *
   * <code>repeated string product_links = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The productLinks at the given index.
   */
  java.lang.String getProductLinks(int index);

  /**
   *
   *
   * <pre>
   * Optional. The URI of the product. This URI can have the same value as the
   * `review_link` element, if the review URI and the product URI are the
   * same.
   * </pre>
   *
   * <code>repeated string product_links = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the productLinks at the given index.
   */
  com.google.protobuf.ByteString getProductLinksBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains ASINs (Amazon Standard Identification Numbers)
   * associated with a product.
   * </pre>
   *
   * <code>repeated string asins = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the asins.
   */
  java.util.List<java.lang.String> getAsinsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains ASINs (Amazon Standard Identification Numbers)
   * associated with a product.
   * </pre>
   *
   * <code>repeated string asins = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of asins.
   */
  int getAsinsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains ASINs (Amazon Standard Identification Numbers)
   * associated with a product.
   * </pre>
   *
   * <code>repeated string asins = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The asins at the given index.
   */
  java.lang.String getAsins(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains ASINs (Amazon Standard Identification Numbers)
   * associated with a product.
   * </pre>
   *
   * <code>repeated string asins = 22 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the asins at the given index.
   */
  com.google.protobuf.ByteString getAsinsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains GTINs (global trade item numbers) associated with a
   * product. Sub-types of GTINs (e.g. UPC, EAN, ISBN, JAN) are supported.
   * </pre>
   *
   * <code>repeated string gtins = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the gtins.
   */
  java.util.List<java.lang.String> getGtinsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains GTINs (global trade item numbers) associated with a
   * product. Sub-types of GTINs (e.g. UPC, EAN, ISBN, JAN) are supported.
   * </pre>
   *
   * <code>repeated string gtins = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of gtins.
   */
  int getGtinsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains GTINs (global trade item numbers) associated with a
   * product. Sub-types of GTINs (e.g. UPC, EAN, ISBN, JAN) are supported.
   * </pre>
   *
   * <code>repeated string gtins = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The gtins at the given index.
   */
  java.lang.String getGtins(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains GTINs (global trade item numbers) associated with a
   * product. Sub-types of GTINs (e.g. UPC, EAN, ISBN, JAN) are supported.
   * </pre>
   *
   * <code>repeated string gtins = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the gtins at the given index.
   */
  com.google.protobuf.ByteString getGtinsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains MPNs (manufacturer part numbers) associated with a
   * product.
   * </pre>
   *
   * <code>repeated string mpns = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the mpns.
   */
  java.util.List<java.lang.String> getMpnsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains MPNs (manufacturer part numbers) associated with a
   * product.
   * </pre>
   *
   * <code>repeated string mpns = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of mpns.
   */
  int getMpnsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains MPNs (manufacturer part numbers) associated with a
   * product.
   * </pre>
   *
   * <code>repeated string mpns = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The mpns at the given index.
   */
  java.lang.String getMpns(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains MPNs (manufacturer part numbers) associated with a
   * product.
   * </pre>
   *
   * <code>repeated string mpns = 24 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the mpns at the given index.
   */
  com.google.protobuf.ByteString getMpnsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains SKUs (stock keeping units) associated with a product.
   * Often this matches the product Offer Id in the product feed.
   * </pre>
   *
   * <code>repeated string skus = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the skus.
   */
  java.util.List<java.lang.String> getSkusList();

  /**
   *
   *
   * <pre>
   * Optional. Contains SKUs (stock keeping units) associated with a product.
   * Often this matches the product Offer Id in the product feed.
   * </pre>
   *
   * <code>repeated string skus = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of skus.
   */
  int getSkusCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains SKUs (stock keeping units) associated with a product.
   * Often this matches the product Offer Id in the product feed.
   * </pre>
   *
   * <code>repeated string skus = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The skus at the given index.
   */
  java.lang.String getSkus(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains SKUs (stock keeping units) associated with a product.
   * Often this matches the product Offer Id in the product feed.
   * </pre>
   *
   * <code>repeated string skus = 25 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the skus at the given index.
   */
  com.google.protobuf.ByteString getSkusBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains brand names associated with a product.
   * </pre>
   *
   * <code>repeated string brands = 26 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the brands.
   */
  java.util.List<java.lang.String> getBrandsList();

  /**
   *
   *
   * <pre>
   * Optional. Contains brand names associated with a product.
   * </pre>
   *
   * <code>repeated string brands = 26 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of brands.
   */
  int getBrandsCount();

  /**
   *
   *
   * <pre>
   * Optional. Contains brand names associated with a product.
   * </pre>
   *
   * <code>repeated string brands = 26 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The brands at the given index.
   */
  java.lang.String getBrands(int index);

  /**
   *
   *
   * <pre>
   * Optional. Contains brand names associated with a product.
   * </pre>
   *
   * <code>repeated string brands = 26 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the brands at the given index.
   */
  com.google.protobuf.ByteString getBrandsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the review is marked as spam in the publisher's
   * system.
   * </pre>
   *
   * <code>optional bool is_spam = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the isSpam field is set.
   */
  boolean hasIsSpam();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the review is marked as spam in the publisher's
   * system.
   * </pre>
   *
   * <code>optional bool is_spam = 27 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isSpam.
   */
  boolean getIsSpam();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the reviewer's purchase is verified.
   * </pre>
   *
   * <code>optional bool is_verified_purchase = 30 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the isVerifiedPurchase field is set.
   */
  boolean hasIsVerifiedPurchase();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the reviewer's purchase is verified.
   * </pre>
   *
   * <code>optional bool is_verified_purchase = 30 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isVerifiedPurchase.
   */
  boolean getIsVerifiedPurchase();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the review is incentivized.
   * </pre>
   *
   * <code>optional bool is_incentivized_review = 31 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the isIncentivizedReview field is set.
   */
  boolean hasIsIncentivizedReview();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the review is incentivized.
   * </pre>
   *
   * <code>optional bool is_incentivized_review = 31 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The isIncentivizedReview.
   */
  boolean getIsIncentivizedReview();

  /**
   *
   *
   * <pre>
   * Optional. The method used to collect the review.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.CollectionMethod collection_method = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for collectionMethod.
   */
  int getCollectionMethodValue();

  /**
   *
   *
   * <pre>
   * Optional. The method used to collect the review.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.CollectionMethod collection_method = 28 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The collectionMethod.
   */
  com.google.shopping.merchant.reviews.v1beta.ProductReviewAttributes.CollectionMethod
      getCollectionMethod();

  /**
   *
   *
   * <pre>
   * Optional. A permanent, unique identifier for the transaction associated
   * with the review in the publisher's system. This ID can be used to indicate
   * that multiple reviews are associated with the same transaction.
   * </pre>
   *
   * <code>string transaction_id = 29 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The transactionId.
   */
  java.lang.String getTransactionId();

  /**
   *
   *
   * <pre>
   * Optional. A permanent, unique identifier for the transaction associated
   * with the review in the publisher's system. This ID can be used to indicate
   * that multiple reviews are associated with the same transaction.
   * </pre>
   *
   * <code>string transaction_id = 29 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for transactionId.
   */
  com.google.protobuf.ByteString getTransactionIdBytes();
}
