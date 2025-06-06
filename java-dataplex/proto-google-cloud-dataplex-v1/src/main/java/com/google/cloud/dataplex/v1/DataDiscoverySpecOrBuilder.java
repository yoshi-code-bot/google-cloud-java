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
// source: google/cloud/dataplex/v1/data_discovery.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public interface DataDiscoverySpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataDiscoverySpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Configuration for metadata publishing.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataDiscoverySpec.BigQueryPublishingConfig bigquery_publishing_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the bigqueryPublishingConfig field is set.
   */
  boolean hasBigqueryPublishingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for metadata publishing.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataDiscoverySpec.BigQueryPublishingConfig bigquery_publishing_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bigqueryPublishingConfig.
   */
  com.google.cloud.dataplex.v1.DataDiscoverySpec.BigQueryPublishingConfig
      getBigqueryPublishingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for metadata publishing.
   * </pre>
   *
   * <code>
   * .google.cloud.dataplex.v1.DataDiscoverySpec.BigQueryPublishingConfig bigquery_publishing_config = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataplex.v1.DataDiscoverySpec.BigQueryPublishingConfigOrBuilder
      getBigqueryPublishingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataDiscoverySpec.StorageConfig storage_config = 100;</code>
   *
   * @return Whether the storageConfig field is set.
   */
  boolean hasStorageConfig();

  /**
   *
   *
   * <pre>
   * Cloud Storage related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataDiscoverySpec.StorageConfig storage_config = 100;</code>
   *
   * @return The storageConfig.
   */
  com.google.cloud.dataplex.v1.DataDiscoverySpec.StorageConfig getStorageConfig();

  /**
   *
   *
   * <pre>
   * Cloud Storage related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataDiscoverySpec.StorageConfig storage_config = 100;</code>
   */
  com.google.cloud.dataplex.v1.DataDiscoverySpec.StorageConfigOrBuilder getStorageConfigOrBuilder();

  com.google.cloud.dataplex.v1.DataDiscoverySpec.ResourceConfigCase getResourceConfigCase();
}
