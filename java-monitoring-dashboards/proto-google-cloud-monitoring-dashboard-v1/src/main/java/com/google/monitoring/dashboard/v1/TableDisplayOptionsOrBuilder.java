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
// source: google/monitoring/dashboard/v1/table_display_options.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.dashboard.v1;

public interface TableDisplayOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.TableDisplayOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. This field is unused and has been replaced by
   * TimeSeriesTable.column_settings
   * </pre>
   *
   * <code>
   * repeated string shown_columns = 1 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TableDisplayOptions.shown_columns is deprecated. See
   *     google/monitoring/dashboard/v1/table_display_options.proto;l=32
   * @return A list containing the shownColumns.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getShownColumnsList();

  /**
   *
   *
   * <pre>
   * Optional. This field is unused and has been replaced by
   * TimeSeriesTable.column_settings
   * </pre>
   *
   * <code>
   * repeated string shown_columns = 1 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TableDisplayOptions.shown_columns is deprecated. See
   *     google/monitoring/dashboard/v1/table_display_options.proto;l=32
   * @return The count of shownColumns.
   */
  @java.lang.Deprecated
  int getShownColumnsCount();

  /**
   *
   *
   * <pre>
   * Optional. This field is unused and has been replaced by
   * TimeSeriesTable.column_settings
   * </pre>
   *
   * <code>
   * repeated string shown_columns = 1 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TableDisplayOptions.shown_columns is deprecated. See
   *     google/monitoring/dashboard/v1/table_display_options.proto;l=32
   * @param index The index of the element to return.
   * @return The shownColumns at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getShownColumns(int index);

  /**
   *
   *
   * <pre>
   * Optional. This field is unused and has been replaced by
   * TimeSeriesTable.column_settings
   * </pre>
   *
   * <code>
   * repeated string shown_columns = 1 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.monitoring.dashboard.v1.TableDisplayOptions.shown_columns is deprecated. See
   *     google/monitoring/dashboard/v1/table_display_options.proto;l=32
   * @param index The index of the value to return.
   * @return The bytes of the shownColumns at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getShownColumnsBytes(int index);
}
