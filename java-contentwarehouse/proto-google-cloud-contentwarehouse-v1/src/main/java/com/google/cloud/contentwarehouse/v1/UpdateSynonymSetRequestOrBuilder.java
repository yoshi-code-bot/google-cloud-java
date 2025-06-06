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
// source: google/cloud/contentwarehouse/v1/synonymset_service_request.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface UpdateSynonymSetRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.UpdateSynonymSetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the synonymSet to update
   * Format:
   * projects/{project_number}/locations/{location}/synonymSets/{context}.
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
   * Required. The name of the synonymSet to update
   * Format:
   * projects/{project_number}/locations/{location}/synonymSets/{context}.
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
   * Required. The synonymSet to be updated for the customer
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the synonymSet field is set.
   */
  boolean hasSynonymSet();

  /**
   *
   *
   * <pre>
   * Required. The synonymSet to be updated for the customer
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The synonymSet.
   */
  com.google.cloud.contentwarehouse.v1.SynonymSet getSynonymSet();

  /**
   *
   *
   * <pre>
   * Required. The synonymSet to be updated for the customer
   * </pre>
   *
   * <code>
   * .google.cloud.contentwarehouse.v1.SynonymSet synonym_set = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.contentwarehouse.v1.SynonymSetOrBuilder getSynonymSetOrBuilder();
}
