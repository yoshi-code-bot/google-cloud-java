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
// source: google/cloud/automl/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1;

public interface ListModelEvaluationsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.ListModelEvaluationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the model to list the model evaluations for.
   * If modelId is set as "-", this will list model evaluations from across all
   * models of the parent location.
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
   * Required. Resource name of the model to list the model evaluations for.
   * If modelId is set as "-", this will list model evaluations from across all
   * models of the parent location.
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
   * Required. An expression for filtering the results of the request.
   *
   *   * `annotation_spec_id` - for =, !=  or existence. See example below for
   *                          the last.
   *
   * Some examples of using the filter are:
   *
   *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
   *                             annotation spec with ID different than 4.
   *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
   *                                aggregate of all annotation specs.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Required. An expression for filtering the results of the request.
   *
   *   * `annotation_spec_id` - for =, !=  or existence. See example below for
   *                          the last.
   *
   * Some examples of using the filter are:
   *
   *   * `annotation_spec_id!=4` --&gt; The model evaluation was done for
   *                             annotation spec with ID different than 4.
   *   * `NOT annotation_spec_id:*` --&gt; The model evaluation was done for
   *                                aggregate of all annotation specs.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Requested page size.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained via
   * [ListModelEvaluationsResponse.next_page_token][google.cloud.automl.v1.ListModelEvaluationsResponse.next_page_token] of the previous
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results for the server to return.
   * Typically obtained via
   * [ListModelEvaluationsResponse.next_page_token][google.cloud.automl.v1.ListModelEvaluationsResponse.next_page_token] of the previous
   * [AutoMl.ListModelEvaluations][google.cloud.automl.v1.AutoMl.ListModelEvaluations] call.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
