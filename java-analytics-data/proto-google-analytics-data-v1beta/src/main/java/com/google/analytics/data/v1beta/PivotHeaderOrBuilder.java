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
// source: google/analytics/data/v1beta/data.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.data.v1beta;

public interface PivotHeaderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.PivotHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  java.util.List<com.google.analytics.data.v1beta.PivotDimensionHeader>
      getPivotDimensionHeadersList();

  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  com.google.analytics.data.v1beta.PivotDimensionHeader getPivotDimensionHeaders(int index);

  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  int getPivotDimensionHeadersCount();

  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.PivotDimensionHeaderOrBuilder>
      getPivotDimensionHeadersOrBuilderList();

  /**
   *
   *
   * <pre>
   * The size is the same as the cardinality of the corresponding dimension
   * combinations.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.PivotDimensionHeader pivot_dimension_headers = 1;
   * </code>
   */
  com.google.analytics.data.v1beta.PivotDimensionHeaderOrBuilder getPivotDimensionHeadersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The cardinality of the pivot. The total number of rows for this pivot's
   * fields regardless of how the parameters `offset` and `limit` are specified
   * in the request.
   * </pre>
   *
   * <code>int32 row_count = 2;</code>
   *
   * @return The rowCount.
   */
  int getRowCount();
}
