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
// source: google/cloud/securitycenter/v2/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

public interface ListValuedResourcesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.ListValuedResourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of parent to list exposed resources.
   *
   * Valid formats:
   * `organizations/{organization}`,
   * `organizations/{organization}/simulations/{simulation}`
   * `organizations/{organization}/simulations/{simulation}/attackExposureResults/{attack_exposure_result_v2}`
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
   * Required. Name of parent to list exposed resources.
   *
   * Valid formats:
   * `organizations/{organization}`,
   * `organizations/{organization}/simulations/{simulation}`
   * `organizations/{organization}/simulations/{simulation}/attackExposureResults/{attack_exposure_result_v2}`
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
   * The filter expression that filters the valued resources in the response.
   * Supported fields:
   *
   *   * `resource_value` supports =
   *   * `resource_type` supports =
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * The filter expression that filters the valued resources in the response.
   * Supported fields:
   *
   *   * `resource_value` supports =
   *   * `resource_type` supports =
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListValuedResourcesResponse`; indicates
   * that this is a continuation of a prior `ListValuedResources` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListValuedResourcesResponse`; indicates
   * that this is a continuation of a prior `ListValuedResources` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
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
   * Optional. The fields by which to order the valued resources response.
   *
   * Supported fields:
   *
   *   * `exposed_score`
   *
   *   * `resource_value`
   *
   *   * `resource_type`
   *
   * Values should be a comma separated list of fields. For example:
   * `exposed_score,resource_value`.
   *
   * The default sorting order is descending. To specify ascending or descending
   * order for a field, append a " ASC" or a " DESC" suffix, respectively; for
   * example: `exposed_score DESC`.
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
   * Optional. The fields by which to order the valued resources response.
   *
   * Supported fields:
   *
   *   * `exposed_score`
   *
   *   * `resource_value`
   *
   *   * `resource_type`
   *
   * Values should be a comma separated list of fields. For example:
   * `exposed_score,resource_value`.
   *
   * The default sorting order is descending. To specify ascending or descending
   * order for a field, append a " ASC" or a " DESC" suffix, respectively; for
   * example: `exposed_score DESC`.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
