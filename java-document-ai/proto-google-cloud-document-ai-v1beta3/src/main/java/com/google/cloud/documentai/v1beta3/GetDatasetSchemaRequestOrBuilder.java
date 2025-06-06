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
// source: google/cloud/documentai/v1beta3/document_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

public interface GetDatasetSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.GetDatasetSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The dataset schema resource name.
   * Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset/datasetSchema
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The dataset schema resource name.
   * Format:
   * projects/{project}/locations/{location}/processors/{processor}/dataset/datasetSchema
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If set, only returns the visible fields of the schema.
   * </pre>
   *
   * <code>bool visible_fields_only = 2;</code>
   *
   * @return The visibleFieldsOnly.
   */
  boolean getVisibleFieldsOnly();
}
