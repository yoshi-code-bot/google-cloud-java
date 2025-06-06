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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

public interface SkuPurchaseGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.SkuPurchaseGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource names of the SKUs included in this group.
   * Format: products/{product_id}/skus/{sku_id}.
   * </pre>
   *
   * <code>repeated string skus = 1;</code>
   *
   * @return A list containing the skus.
   */
  java.util.List<java.lang.String> getSkusList();

  /**
   *
   *
   * <pre>
   * Resource names of the SKUs included in this group.
   * Format: products/{product_id}/skus/{sku_id}.
   * </pre>
   *
   * <code>repeated string skus = 1;</code>
   *
   * @return The count of skus.
   */
  int getSkusCount();

  /**
   *
   *
   * <pre>
   * Resource names of the SKUs included in this group.
   * Format: products/{product_id}/skus/{sku_id}.
   * </pre>
   *
   * <code>repeated string skus = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The skus at the given index.
   */
  java.lang.String getSkus(int index);

  /**
   *
   *
   * <pre>
   * Resource names of the SKUs included in this group.
   * Format: products/{product_id}/skus/{sku_id}.
   * </pre>
   *
   * <code>repeated string skus = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the skus at the given index.
   */
  com.google.protobuf.ByteString getSkusBytes(int index);

  /**
   *
   *
   * <pre>
   * List of billing accounts that are eligible to purhcase these SKUs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.BillingAccountPurchaseInfo billing_account_purchase_infos = 2;
   * </code>
   */
  java.util.List<com.google.cloud.channel.v1.BillingAccountPurchaseInfo>
      getBillingAccountPurchaseInfosList();

  /**
   *
   *
   * <pre>
   * List of billing accounts that are eligible to purhcase these SKUs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.BillingAccountPurchaseInfo billing_account_purchase_infos = 2;
   * </code>
   */
  com.google.cloud.channel.v1.BillingAccountPurchaseInfo getBillingAccountPurchaseInfos(int index);

  /**
   *
   *
   * <pre>
   * List of billing accounts that are eligible to purhcase these SKUs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.BillingAccountPurchaseInfo billing_account_purchase_infos = 2;
   * </code>
   */
  int getBillingAccountPurchaseInfosCount();

  /**
   *
   *
   * <pre>
   * List of billing accounts that are eligible to purhcase these SKUs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.BillingAccountPurchaseInfo billing_account_purchase_infos = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.BillingAccountPurchaseInfoOrBuilder>
      getBillingAccountPurchaseInfosOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of billing accounts that are eligible to purhcase these SKUs.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.channel.v1.BillingAccountPurchaseInfo billing_account_purchase_infos = 2;
   * </code>
   */
  com.google.cloud.channel.v1.BillingAccountPurchaseInfoOrBuilder
      getBillingAccountPurchaseInfosOrBuilder(int index);
}
