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
// source: google/shopping/merchant/datasources/v1beta/datasourcetypes.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.datasources.v1beta;

public interface LocalInventoryDataSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.datasources.v1beta.LocalInventoryDataSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The feed label of the offers to which the local
   * inventory is provided.
   *
   * Must be less than or equal to 20 uppercase letters (A-Z), numbers (0-9),
   * and dashes (-).
   *
   * See also [migration to feed
   * labels](https://developers.google.com/shopping-content/guides/products/feed-labels).
   * </pre>
   *
   * <code>
   * string feed_label = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The feedLabel.
   */
  java.lang.String getFeedLabel();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The feed label of the offers to which the local
   * inventory is provided.
   *
   * Must be less than or equal to 20 uppercase letters (A-Z), numbers (0-9),
   * and dashes (-).
   *
   * See also [migration to feed
   * labels](https://developers.google.com/shopping-content/guides/products/feed-labels).
   * </pre>
   *
   * <code>
   * string feed_label = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for feedLabel.
   */
  com.google.protobuf.ByteString getFeedLabelBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The two-letter ISO 639-1 language of the items to
   * which the local inventory is provided.
   * </pre>
   *
   * <code>
   * string content_language = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The contentLanguage.
   */
  java.lang.String getContentLanguage();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The two-letter ISO 639-1 language of the items to
   * which the local inventory is provided.
   * </pre>
   *
   * <code>
   * string content_language = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for contentLanguage.
   */
  com.google.protobuf.ByteString getContentLanguageBytes();
}
