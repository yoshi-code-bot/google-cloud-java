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

public interface ProtectedResourcesSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.inventory.v1.ProtectedResourcesSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full name of the ProtectedResourcesSummary resource.
   * Example:
   * projects/test-project/locations/us/keyRings/test-keyring/cryptoKeys/test-key/protectedResourcesSummary
   * </pre>
   *
   * <code>string name = 5;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The full name of the ProtectedResourcesSummary resource.
   * Example:
   * projects/test-project/locations/us/keyRings/test-keyring/cryptoKeys/test-key/protectedResourcesSummary
   * </pre>
   *
   * <code>string name = 5;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The total number of protected resources in the same Cloud organization as
   * the key.
   * </pre>
   *
   * <code>int64 resource_count = 1;</code>
   *
   * @return The resourceCount.
   */
  long getResourceCount();

  /**
   *
   *
   * <pre>
   * The number of distinct Cloud projects in the same Cloud organization as the
   * key that have resources protected by the key.
   * </pre>
   *
   * <code>int32 project_count = 2;</code>
   *
   * @return The projectCount.
   */
  int getProjectCount();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by resource type.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; resource_types = 3;</code>
   */
  int getResourceTypesCount();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by resource type.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; resource_types = 3;</code>
   */
  boolean containsResourceTypes(java.lang.String key);

  /** Use {@link #getResourceTypesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long> getResourceTypes();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by resource type.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; resource_types = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long> getResourceTypesMap();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by resource type.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; resource_types = 3;</code>
   */
  long getResourceTypesOrDefault(java.lang.String key, long defaultValue);

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by resource type.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; resource_types = 3;</code>
   */
  long getResourceTypesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by Cloud product.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cloud_products = 6;</code>
   */
  int getCloudProductsCount();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by Cloud product.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cloud_products = 6;</code>
   */
  boolean containsCloudProducts(java.lang.String key);

  /** Use {@link #getCloudProductsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long> getCloudProducts();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by Cloud product.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cloud_products = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long> getCloudProductsMap();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by Cloud product.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cloud_products = 6;</code>
   */
  long getCloudProductsOrDefault(java.lang.String key, long defaultValue);

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by Cloud product.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; cloud_products = 6;</code>
   */
  long getCloudProductsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by region.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; locations = 4;</code>
   */
  int getLocationsCount();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by region.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; locations = 4;</code>
   */
  boolean containsLocations(java.lang.String key);

  /** Use {@link #getLocationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long> getLocations();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by region.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; locations = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long> getLocationsMap();

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by region.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; locations = 4;</code>
   */
  long getLocationsOrDefault(java.lang.String key, long defaultValue);

  /**
   *
   *
   * <pre>
   * The number of resources protected by the key grouped by region.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; locations = 4;</code>
   */
  long getLocationsOrThrow(java.lang.String key);
}
