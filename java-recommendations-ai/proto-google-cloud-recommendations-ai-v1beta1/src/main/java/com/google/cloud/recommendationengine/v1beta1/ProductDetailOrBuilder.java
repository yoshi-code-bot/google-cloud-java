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
// source: google/cloud/recommendationengine/v1beta1/user_event.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommendationengine.v1beta1;

public interface ProductDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ProductDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Catalog item ID. UTF-8 encoded string with a length limit of 128
   * characters.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * Required. Catalog item ID. UTF-8 encoded string with a length limit of 128
   * characters.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Currency code for price/costs. Use three-character ISO-4217
   * code. Required only if originalPrice or displayPrice is set.
   * </pre>
   *
   * <code>string currency_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();

  /**
   *
   *
   * <pre>
   * Optional. Currency code for price/costs. Use three-character ISO-4217
   * code. Required only if originalPrice or displayPrice is set.
   * </pre>
   *
   * <code>string currency_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Original price of the product. If provided, this will override
   * the original price in Catalog for this product.
   * </pre>
   *
   * <code>float original_price = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The originalPrice.
   */
  float getOriginalPrice();

  /**
   *
   *
   * <pre>
   * Optional. Display price of the product (e.g. discounted price). If
   * provided, this will override the display price in Catalog for this product.
   * </pre>
   *
   * <code>float display_price = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayPrice.
   */
  float getDisplayPrice();

  /**
   *
   *
   * <pre>
   * Optional. Item stock state. If provided, this overrides the stock state
   * in Catalog for items in this event.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState stock_state = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for stockState.
   */
  int getStockStateValue();

  /**
   *
   *
   * <pre>
   * Optional. Item stock state. If provided, this overrides the stock state
   * in Catalog for items in this event.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState stock_state = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The stockState.
   */
  com.google.cloud.recommendationengine.v1beta1.ProductCatalogItem.StockState getStockState();

  /**
   *
   *
   * <pre>
   * Optional. Quantity of the product associated with the user event. For
   * example, this field will be 2 if two products are added to the shopping
   * cart for `add-to-cart` event. Required for `add-to-cart`, `add-to-list`,
   * `remove-from-cart`, `checkout-start`, `purchase-complete`, `refund` event
   * types.
   * </pre>
   *
   * <code>int32 quantity = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The quantity.
   */
  int getQuantity();

  /**
   *
   *
   * <pre>
   * Optional. Quantity of the products in stock when a user event happens.
   * Optional. If provided, this overrides the available quantity in Catalog for
   * this event. and can only be set if `stock_status` is set to `IN_STOCK`.
   *
   * Note that if an item is out of stock, you must set the `stock_state` field
   * to be `OUT_OF_STOCK`. Leaving this field unspecified / as zero is not
   * sufficient to mark the item out of stock.
   * </pre>
   *
   * <code>int32 available_quantity = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The availableQuantity.
   */
  int getAvailableQuantity();

  /**
   *
   *
   * <pre>
   * Optional. Extra features associated with a product in the user event.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.FeatureMap item_attributes = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the itemAttributes field is set.
   */
  boolean hasItemAttributes();

  /**
   *
   *
   * <pre>
   * Optional. Extra features associated with a product in the user event.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.FeatureMap item_attributes = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The itemAttributes.
   */
  com.google.cloud.recommendationengine.v1beta1.FeatureMap getItemAttributes();

  /**
   *
   *
   * <pre>
   * Optional. Extra features associated with a product in the user event.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.FeatureMap item_attributes = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.FeatureMapOrBuilder getItemAttributesOrBuilder();
}
