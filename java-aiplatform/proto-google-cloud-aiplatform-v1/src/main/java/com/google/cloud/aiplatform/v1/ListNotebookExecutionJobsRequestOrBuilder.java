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
// source: google/cloud/aiplatform/v1/notebook_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface ListNotebookExecutionJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListNotebookExecutionJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location from which to list the
   * NotebookExecutionJobs.
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
   * Required. The resource name of the Location from which to list the
   * NotebookExecutionJobs.
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
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `notebookExecutionJob` supports = and !=. `notebookExecutionJob`
   *   represents the NotebookExecutionJob ID.
   *   * `displayName` supports = and != and regex.
   *   * `schedule` supports = and != and regex.
   *
   * Some examples:
   *   * `notebookExecutionJob="123"`
   *   * `notebookExecutionJob="my-execution-job"`
   *   * `displayName="myDisplayName"` and `displayName=~"myDisplayNameRegex"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `notebookExecutionJob` supports = and !=. `notebookExecutionJob`
   *   represents the NotebookExecutionJob ID.
   *   * `displayName` supports = and != and regex.
   *   * `schedule` supports = and != and regex.
   *
   * Some examples:
   *   * `notebookExecutionJob="123"`
   *   * `notebookExecutionJob="my-execution-job"`
   *   * `displayName="myDisplayName"` and `displayName=~"myDisplayNameRegex"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The standard list page size.
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
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListNotebookExecutionJobsResponse.next_page_token][google.cloud.aiplatform.v1.ListNotebookExecutionJobsResponse.next_page_token]
   * of the previous
   * [NotebookService.ListNotebookExecutionJobs][google.cloud.aiplatform.v1.NotebookService.ListNotebookExecutionJobs]
   * call.
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
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListNotebookExecutionJobsResponse.next_page_token][google.cloud.aiplatform.v1.ListNotebookExecutionJobsResponse.next_page_token]
   * of the previous
   * [NotebookService.ListNotebookExecutionJobs][google.cloud.aiplatform.v1.NotebookService.ListNotebookExecutionJobs]
   * call.
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
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();

  /**
   *
   *
   * <pre>
   * Optional. A comma-separated list of fields to order by, sorted in ascending
   * order. Use "desc" after a field name for descending. Supported fields:
   *
   *   * `display_name`
   *   * `create_time`
   *   * `update_time`
   *
   * Example: `display_name, create_time desc`.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Optional. The NotebookExecutionJob view. Defaults to BASIC.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookExecutionJobView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();

  /**
   *
   *
   * <pre>
   * Optional. The NotebookExecutionJob view. Defaults to BASIC.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookExecutionJobView view = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.aiplatform.v1.NotebookExecutionJobView getView();
}
