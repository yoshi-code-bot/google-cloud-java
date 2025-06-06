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
// source: google/cloud/contentwarehouse/v1/filters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface WeightedSchemaPropertyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.WeightedSchemaProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The document schema name.
   * </pre>
   *
   * <code>string document_schema_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The documentSchemaName.
   */
  java.lang.String getDocumentSchemaName();

  /**
   *
   *
   * <pre>
   * The document schema name.
   * </pre>
   *
   * <code>string document_schema_name = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for documentSchemaName.
   */
  com.google.protobuf.ByteString getDocumentSchemaNameBytes();

  /**
   *
   *
   * <pre>
   * The property definition names in the schema.
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @return A list containing the propertyNames.
   */
  java.util.List<java.lang.String> getPropertyNamesList();

  /**
   *
   *
   * <pre>
   * The property definition names in the schema.
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @return The count of propertyNames.
   */
  int getPropertyNamesCount();

  /**
   *
   *
   * <pre>
   * The property definition names in the schema.
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The propertyNames at the given index.
   */
  java.lang.String getPropertyNames(int index);

  /**
   *
   *
   * <pre>
   * The property definition names in the schema.
   * </pre>
   *
   * <code>repeated string property_names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the propertyNames at the given index.
   */
  com.google.protobuf.ByteString getPropertyNamesBytes(int index);
}
