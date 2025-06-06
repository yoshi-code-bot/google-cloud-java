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
// source: google/cloud/retail/v2beta/catalog_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

public interface UpdateCompletionConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.UpdateCompletionConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   *
   * If the caller does not have permission to update the
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig], then a
   * PERMISSION_DENIED error is returned.
   *
   * If the [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to
   * update does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.CompletionConfig completion_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the completionConfig field is set.
   */
  boolean hasCompletionConfig();

  /**
   *
   *
   * <pre>
   * Required. The
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   *
   * If the caller does not have permission to update the
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig], then a
   * PERMISSION_DENIED error is returned.
   *
   * If the [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to
   * update does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.CompletionConfig completion_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The completionConfig.
   */
  com.google.cloud.retail.v2beta.CompletionConfig getCompletionConfig();

  /**
   *
   *
   * <pre>
   * Required. The
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   *
   * If the caller does not have permission to update the
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig], then a
   * PERMISSION_DENIED error is returned.
   *
   * If the [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to
   * update does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2beta.CompletionConfig completion_config = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.CompletionConfigOrBuilder getCompletionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   * The following are the only supported fields:
   *
   * * [CompletionConfig.matching_order][google.cloud.retail.v2beta.CompletionConfig.matching_order]
   * * [CompletionConfig.max_suggestions][google.cloud.retail.v2beta.CompletionConfig.max_suggestions]
   * * [CompletionConfig.min_prefix_length][google.cloud.retail.v2beta.CompletionConfig.min_prefix_length]
   * * [CompletionConfig.auto_learning][google.cloud.retail.v2beta.CompletionConfig.auto_learning]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   * The following are the only supported fields:
   *
   * * [CompletionConfig.matching_order][google.cloud.retail.v2beta.CompletionConfig.matching_order]
   * * [CompletionConfig.max_suggestions][google.cloud.retail.v2beta.CompletionConfig.max_suggestions]
   * * [CompletionConfig.min_prefix_length][google.cloud.retail.v2beta.CompletionConfig.min_prefix_length]
   * * [CompletionConfig.auto_learning][google.cloud.retail.v2beta.CompletionConfig.auto_learning]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Indicates which fields in the provided
   * [CompletionConfig][google.cloud.retail.v2beta.CompletionConfig] to update.
   * The following are the only supported fields:
   *
   * * [CompletionConfig.matching_order][google.cloud.retail.v2beta.CompletionConfig.matching_order]
   * * [CompletionConfig.max_suggestions][google.cloud.retail.v2beta.CompletionConfig.max_suggestions]
   * * [CompletionConfig.min_prefix_length][google.cloud.retail.v2beta.CompletionConfig.min_prefix_length]
   * * [CompletionConfig.auto_learning][google.cloud.retail.v2beta.CompletionConfig.auto_learning]
   *
   * If not set, all supported fields are updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
