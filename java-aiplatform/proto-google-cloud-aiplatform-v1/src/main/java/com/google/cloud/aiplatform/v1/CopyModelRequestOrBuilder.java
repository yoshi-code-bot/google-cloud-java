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
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface CopyModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CopyModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Copy source_model into a new Model with this ID. The ID will
   * become the final component of the model resource name.
   *
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the modelId field is set.
   */
  boolean hasModelId();

  /**
   *
   *
   * <pre>
   * Optional. Copy source_model into a new Model with this ID. The ID will
   * become the final component of the model resource name.
   *
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The modelId.
   */
  java.lang.String getModelId();

  /**
   *
   *
   * <pre>
   * Optional. Copy source_model into a new Model with this ID. The ID will
   * become the final component of the model resource name.
   *
   * This value may be up to 63 characters, and valid characters are
   * `[a-z0-9_-]`. The first character cannot be a number or hyphen.
   * </pre>
   *
   * <code>string model_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString getModelIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specify this field to copy source_model into this existing
   * Model as a new version. Format:
   * `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string parent_model = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the parentModel field is set.
   */
  boolean hasParentModel();

  /**
   *
   *
   * <pre>
   * Optional. Specify this field to copy source_model into this existing
   * Model as a new version. Format:
   * `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string parent_model = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parentModel.
   */
  java.lang.String getParentModel();

  /**
   *
   *
   * <pre>
   * Optional. Specify this field to copy source_model into this existing
   * Model as a new version. Format:
   * `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string parent_model = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parentModel.
   */
  com.google.protobuf.ByteString getParentModelBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location into which to copy the Model.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location into which to copy the Model.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Model to copy. That Model must be in the
   * same Project. Format:
   * `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string source_model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sourceModel.
   */
  java.lang.String getSourceModel();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Model to copy. That Model must be in the
   * same Project. Format:
   * `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string source_model = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sourceModel.
   */
  com.google.protobuf.ByteString getSourceModelBytes();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options. If this is set,
   * then the Model copy will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 3;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options. If this is set,
   * then the Model copy will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 3;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key options. If this is set,
   * then the Model copy will be encrypted with the provided encryption key.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 3;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  com.google.cloud.aiplatform.v1.CopyModelRequest.DestinationModelCase getDestinationModelCase();
}
