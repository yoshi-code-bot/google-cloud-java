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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.data.v1alpha;

public interface SegmentFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.SegmentFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The dimension name or metric name.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The fieldName.
   */
  java.lang.String getFieldName();

  /**
   *
   *
   * <pre>
   * The dimension name or metric name.
   * </pre>
   *
   * <code>string field_name = 1;</code>
   *
   * @return The bytes for fieldName.
   */
  com.google.protobuf.ByteString getFieldNameBytes();

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   *
   * @return Whether the stringFilter field is set.
   */
  boolean hasStringFilter();

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   *
   * @return The stringFilter.
   */
  com.google.analytics.data.v1alpha.StringFilter getStringFilter();

  /**
   *
   *
   * <pre>
   * Strings related filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.StringFilter string_filter = 4;</code>
   */
  com.google.analytics.data.v1alpha.StringFilterOrBuilder getStringFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   *
   * @return Whether the inListFilter field is set.
   */
  boolean hasInListFilter();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   *
   * @return The inListFilter.
   */
  com.google.analytics.data.v1alpha.InListFilter getInListFilter();

  /**
   *
   *
   * <pre>
   * A filter for in list values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.InListFilter in_list_filter = 5;</code>
   */
  com.google.analytics.data.v1alpha.InListFilterOrBuilder getInListFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   *
   * @return Whether the numericFilter field is set.
   */
  boolean hasNumericFilter();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   *
   * @return The numericFilter.
   */
  com.google.analytics.data.v1alpha.NumericFilter getNumericFilter();

  /**
   *
   *
   * <pre>
   * A filter for numeric or date values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.NumericFilter numeric_filter = 6;</code>
   */
  com.google.analytics.data.v1alpha.NumericFilterOrBuilder getNumericFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   *
   * @return Whether the betweenFilter field is set.
   */
  boolean hasBetweenFilter();

  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   *
   * @return The betweenFilter.
   */
  com.google.analytics.data.v1alpha.BetweenFilter getBetweenFilter();

  /**
   *
   *
   * <pre>
   * A filter for between two values.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.BetweenFilter between_filter = 7;</code>
   */
  com.google.analytics.data.v1alpha.BetweenFilterOrBuilder getBetweenFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the scope for the filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterScoping filter_scoping = 8;</code>
   *
   * @return Whether the filterScoping field is set.
   */
  boolean hasFilterScoping();

  /**
   *
   *
   * <pre>
   * Specifies the scope for the filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterScoping filter_scoping = 8;</code>
   *
   * @return The filterScoping.
   */
  com.google.analytics.data.v1alpha.SegmentFilterScoping getFilterScoping();

  /**
   *
   *
   * <pre>
   * Specifies the scope for the filter.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterScoping filter_scoping = 8;</code>
   */
  com.google.analytics.data.v1alpha.SegmentFilterScopingOrBuilder getFilterScopingOrBuilder();

  com.google.analytics.data.v1alpha.SegmentFilter.OneFilterCase getOneFilterCase();
}
