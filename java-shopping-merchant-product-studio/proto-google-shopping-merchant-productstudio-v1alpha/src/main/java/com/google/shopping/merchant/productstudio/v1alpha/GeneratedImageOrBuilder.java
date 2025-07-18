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
// source: google/shopping/merchant/productstudio/v1alpha/image.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.productstudio.v1alpha;

public interface GeneratedImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.productstudio.v1alpha.GeneratedImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Generally web-requestable URI of the generated image. This is a temporary
   * URI and will expire after 6 months. A URI may not be populated
   * immediately after generation. Use get or list api using image_id to get
   * the URI.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return Whether the uri field is set.
   */
  boolean hasUri();

  /**
   *
   *
   * <pre>
   * Generally web-requestable URI of the generated image. This is a temporary
   * URI and will expire after 6 months. A URI may not be populated
   * immediately after generation. Use get or list api using image_id to get
   * the URI.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * Generally web-requestable URI of the generated image. This is a temporary
   * URI and will expire after 6 months. A URI may not be populated
   * immediately after generation. Use get or list api using image_id to get
   * the URI.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Raw bytes for the image.
   * </pre>
   *
   * <code>bytes image_bytes = 3;</code>
   *
   * @return Whether the imageBytes field is set.
   */
  boolean hasImageBytes();

  /**
   *
   *
   * <pre>
   * Raw bytes for the image.
   * </pre>
   *
   * <code>bytes image_bytes = 3;</code>
   *
   * @return The imageBytes.
   */
  com.google.protobuf.ByteString getImageBytes();

  /**
   *
   *
   * <pre>
   * Identifier. The unique key for the image.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The unique key for the image.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The timestamp when the image was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generation_time = 4;</code>
   *
   * @return Whether the generationTime field is set.
   */
  boolean hasGenerationTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the image was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generation_time = 4;</code>
   *
   * @return The generationTime.
   */
  com.google.protobuf.Timestamp getGenerationTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the image was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp generation_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getGenerationTimeOrBuilder();

  com.google.shopping.merchant.productstudio.v1alpha.GeneratedImage.ImageCase getImageCase();
}
