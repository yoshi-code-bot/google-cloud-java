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
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataplex.v1;

public interface CreateAssetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.CreateAssetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent zone:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Asset identifier.
   * This ID will be used to generate names such as table names when publishing
   * metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the zone.
   * </pre>
   *
   * <code>string asset_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The assetId.
   */
  java.lang.String getAssetId();

  /**
   *
   *
   * <pre>
   * Required. Asset identifier.
   * This ID will be used to generate names such as table names when publishing
   * metadata to Hive Metastore and BigQuery.
   * * Must contain only lowercase letters, numbers and hyphens.
   * * Must start with a letter.
   * * Must end with a number or a letter.
   * * Must be between 1-63 characters.
   * * Must be unique within the zone.
   * </pre>
   *
   * <code>string asset_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for assetId.
   */
  com.google.protobuf.ByteString getAssetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Asset resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Asset asset = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the asset field is set.
   */
  boolean hasAsset();

  /**
   *
   *
   * <pre>
   * Required. Asset resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Asset asset = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The asset.
   */
  com.google.cloud.dataplex.v1.Asset getAsset();

  /**
   *
   *
   * <pre>
   * Required. Asset resource.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Asset asset = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataplex.v1.AssetOrBuilder getAssetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Only validate the request, but do not perform mutations.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
