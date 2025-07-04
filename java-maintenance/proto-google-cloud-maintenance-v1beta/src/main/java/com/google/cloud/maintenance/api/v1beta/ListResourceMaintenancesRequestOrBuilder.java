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
// source: google/cloud/maintenance/api/v1beta/maintenance_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.maintenance.api.v1beta;

public interface ListResourceMaintenancesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.maintenance.api.v1beta.ListResourceMaintenancesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent of the resource maintenance.
   * </pre>
   *
   * <code>
   * string parent = 10006 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent of the resource maintenance.
   * </pre>
   *
   * <code>
   * string parent = 10006 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of resource maintenances to send per page.
   * </pre>
   *
   * <code>int32 page_size = 10505;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The page token: If the next_page_token from a previous response
   * is provided, this request will send the subsequent page.
   * </pre>
   *
   * <code>string page_token = 10506;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * The page token: If the next_page_token from a previous response
   * is provided, this request will send the subsequent page.
   * </pre>
   *
   * <code>string page_token = 10506;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Filter the list as specified in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 10507;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Filter the list as specified in https://google.aip.dev/160.
   * </pre>
   *
   * <code>string filter = 10507;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Order results as specified in https://google.aip.dev/132.
   * </pre>
   *
   * <code>string order_by = 10508;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * Order results as specified in https://google.aip.dev/132.
   * </pre>
   *
   * <code>string order_by = 10508;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
