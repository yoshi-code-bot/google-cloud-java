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
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface CreateEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Featurestore to create EntityTypes.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
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
   * Required. The resource name of the Featurestore to create EntityTypes.
   * Format:
   * `projects/{project}/locations/{location}/featurestores/{featurestore}`
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
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   *
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();

  /**
   *
   *
   * <pre>
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   *
   * @return The entityType.
   */
  com.google.cloud.aiplatform.v1beta1.EntityType getEntityType();

  /**
   *
   *
   * <pre>
   * The EntityType to create.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.EntityType entity_type = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the EntityType, which will become the final
   * component of the EntityType's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a featurestore.
   * </pre>
   *
   * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The entityTypeId.
   */
  java.lang.String getEntityTypeId();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the EntityType, which will become the final
   * component of the EntityType's resource name.
   *
   * This value may be up to 60 characters, and valid characters are
   * `[a-z0-9_]`. The first character cannot be a number.
   *
   * The value must be unique within a featurestore.
   * </pre>
   *
   * <code>string entity_type_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for entityTypeId.
   */
  com.google.protobuf.ByteString getEntityTypeIdBytes();
}
