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
// source: google/privacy/dlp/v2/storage.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface RecordKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RecordKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BigQuery key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
   *
   * @return Whether the datastoreKey field is set.
   */
  boolean hasDatastoreKey();

  /**
   *
   *
   * <pre>
   * BigQuery key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
   *
   * @return The datastoreKey.
   */
  com.google.privacy.dlp.v2.DatastoreKey getDatastoreKey();

  /**
   *
   *
   * <pre>
   * BigQuery key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code>
   */
  com.google.privacy.dlp.v2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Datastore key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
   *
   * @return Whether the bigQueryKey field is set.
   */
  boolean hasBigQueryKey();

  /**
   *
   *
   * <pre>
   * Datastore key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
   *
   * @return The bigQueryKey.
   */
  com.google.privacy.dlp.v2.BigQueryKey getBigQueryKey();

  /**
   *
   *
   * <pre>
   * Datastore key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code>
   */
  com.google.privacy.dlp.v2.BigQueryKeyOrBuilder getBigQueryKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @return A list containing the idValues.
   */
  java.util.List<java.lang.String> getIdValuesList();

  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @return The count of idValues.
   */
  int getIdValuesCount();

  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The idValues at the given index.
   */
  java.lang.String getIdValues(int index);

  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of `identifying_fields` specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the idValues at the given index.
   */
  com.google.protobuf.ByteString getIdValuesBytes(int index);

  com.google.privacy.dlp.v2.RecordKey.TypeCase getTypeCase();
}
