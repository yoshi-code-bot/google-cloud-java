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
// source: google/cloud/licensemanager/v1/licensemanager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.licensemanager.v1;

public interface AggregateUsageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.licensemanager.v1.AggregateUsageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent value for AggregateUsageRequest
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
   * Required. Parent value for AggregateUsageRequest
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
   * Optional. Requested page size. Server may return fewer items than
   * requested. If unspecified, server will pick an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * Optional. A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Filtering results
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. Filtering results
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. Hint for how to order the results
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * Optional. Hint for how to order the results
   * </pre>
   *
   * <code>string order_by = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Required. Licenses are purchased per month - so usage track needs start
   * time of a month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Required. Licenses are purchased per month - so usage track needs start
   * time of a month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Required. Licenses are purchased per month - so usage track needs start
   * time of a month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Usage track is always for a month. This parameter is for the end
   * time of the month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Required. Usage track is always for a month. This parameter is for the end
   * time of the month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Required. Usage track is always for a month. This parameter is for the end
   * time of the month.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
