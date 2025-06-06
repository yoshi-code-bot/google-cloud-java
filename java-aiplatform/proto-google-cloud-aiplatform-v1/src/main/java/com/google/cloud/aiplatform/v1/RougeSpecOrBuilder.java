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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface RougeSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RougeSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
   * </pre>
   *
   * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rougeType.
   */
  java.lang.String getRougeType();

  /**
   *
   *
   * <pre>
   * Optional. Supported rouge types are rougen[1-9], rougeL, and rougeLsum.
   * </pre>
   *
   * <code>string rouge_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rougeType.
   */
  com.google.protobuf.ByteString getRougeTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Whether to use stemmer to compute rouge score.
   * </pre>
   *
   * <code>bool use_stemmer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useStemmer.
   */
  boolean getUseStemmer();

  /**
   *
   *
   * <pre>
   * Optional. Whether to split summaries while using rougeLsum.
   * </pre>
   *
   * <code>bool split_summaries = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The splitSummaries.
   */
  boolean getSplitSummaries();
}
