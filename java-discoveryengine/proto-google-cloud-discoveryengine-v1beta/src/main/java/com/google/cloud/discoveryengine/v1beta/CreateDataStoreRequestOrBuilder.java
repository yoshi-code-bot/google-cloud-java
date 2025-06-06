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
// source: google/cloud/discoveryengine/v1beta/data_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface CreateDataStoreRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.CreateDataStoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}`.
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
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}`.
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
   * Required. The [DataStore][google.cloud.discoveryengine.v1beta.DataStore] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.DataStore data_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataStore field is set.
   */
  boolean hasDataStore();

  /**
   *
   *
   * <pre>
   * Required. The [DataStore][google.cloud.discoveryengine.v1beta.DataStore] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.DataStore data_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataStore.
   */
  com.google.cloud.discoveryengine.v1beta.DataStore getDataStore();

  /**
   *
   *
   * <pre>
   * Required. The [DataStore][google.cloud.discoveryengine.v1beta.DataStore] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.DataStore data_store = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.DataStoreOrBuilder getDataStoreOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], which will
   * become the final component of the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore]'s resource name.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string data_store_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataStoreId.
   */
  java.lang.String getDataStoreId();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], which will
   * become the final component of the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore]'s resource name.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string data_store_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataStoreId.
   */
  com.google.protobuf.ByteString getDataStoreIdBytes();

  /**
   *
   *
   * <pre>
   * A boolean flag indicating whether user want to directly create an advanced
   * data store for site search.
   * If the data store is not configured as site
   * search (GENERIC vertical and PUBLIC_WEBSITE content_config), this flag will
   * be ignored.
   * </pre>
   *
   * <code>bool create_advanced_site_search = 4;</code>
   *
   * @return The createAdvancedSiteSearch.
   */
  boolean getCreateAdvancedSiteSearch();

  /**
   *
   *
   * <pre>
   * A boolean flag indicating whether to skip the default schema creation for
   * the data store. Only enable this flag if you are certain that the default
   * schema is incompatible with your use case.
   *
   * If set to true, you must manually create a schema for the data store before
   * any documents can be ingested.
   *
   * This flag cannot be specified if `data_store.starting_schema` is specified.
   * </pre>
   *
   * <code>bool skip_default_schema_creation = 7;</code>
   *
   * @return The skipDefaultSchemaCreation.
   */
  boolean getSkipDefaultSchemaCreation();
}
