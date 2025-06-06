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

public interface BillableSkuOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.BillableSku)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of Billable SKU. Format:
   * billableSkus/{sku}.
   * Example:
   * billableSkus/6E1B-6634-470F".
   * </pre>
   *
   * <code>string sku = 1;</code>
   *
   * @return The sku.
   */
  java.lang.String getSku();

  /**
   *
   *
   * <pre>
   * Resource name of Billable SKU. Format:
   * billableSkus/{sku}.
   * Example:
   * billableSkus/6E1B-6634-470F".
   * </pre>
   *
   * <code>string sku = 1;</code>
   *
   * @return The bytes for sku.
   */
  com.google.protobuf.ByteString getSkuBytes();

  /**
   *
   *
   * <pre>
   * Unique human readable name for the SKU.
   * </pre>
   *
   * <code>string sku_display_name = 2;</code>
   *
   * @return The skuDisplayName.
   */
  java.lang.String getSkuDisplayName();

  /**
   *
   *
   * <pre>
   * Unique human readable name for the SKU.
   * </pre>
   *
   * <code>string sku_display_name = 2;</code>
   *
   * @return The bytes for skuDisplayName.
   */
  com.google.protobuf.ByteString getSkuDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Resource name of Service which contains Repricing SKU. Format:
   * services/{service}.
   * Example:
   * "services/B7D9-FDCB-15D8".
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * Resource name of Service which contains Repricing SKU. Format:
   * services/{service}.
   * Example:
   * "services/B7D9-FDCB-15D8".
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Unique human readable name for the Service.
   * </pre>
   *
   * <code>string service_display_name = 4;</code>
   *
   * @return The serviceDisplayName.
   */
  java.lang.String getServiceDisplayName();

  /**
   *
   *
   * <pre>
   * Unique human readable name for the Service.
   * </pre>
   *
   * <code>string service_display_name = 4;</code>
   *
   * @return The bytes for serviceDisplayName.
   */
  com.google.protobuf.ByteString getServiceDisplayNameBytes();
}
