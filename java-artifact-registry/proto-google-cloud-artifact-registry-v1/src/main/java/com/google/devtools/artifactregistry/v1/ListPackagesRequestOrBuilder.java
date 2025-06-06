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
// source: google/devtools/artifactregistry/v1/package.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface ListPackagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.ListPackagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource whose packages will be listed.
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
   * Required. The name of the parent resource whose packages will be listed.
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
   * The maximum number of packages to return. Maximum page size is 1,000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The next_page_token value returned from a previous list request, if any.
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
   * The next_page_token value returned from a previous list request, if any.
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
   * Optional. An expression for filtering the results of the request. Filter
   * rules are case insensitive. The fields eligible for filtering are:
   *
   *   * `name`
   *   * `annotations`
   *
   * Examples of using a filter:
   *
   *  To filter the results of your request to packages with the name
   *  `my-package` in project `my-project` in the `us-central` region, in
   *  repository `my-repo`, append the following filter expression to your
   *  request:
   *
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/my-package"`
   *
   *  You can also use wildcards to match any number of characters before or
   *  after the value:
   *
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/my-*"`
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/&#42;package"`
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/&#42;pack*"`
   *
   *  To filter the results of your request to packages with the annotation
   *  key-value pair [`external_link`: `external_link_value`], append the
   *  following filter expression to your request":
   *
   *   * `"annotations.external_link:external_link_value"`
   *
   *  To filter the results just for a specific annotation key `external_link`,
   *  append the following filter expression to your request:
   *
   *   * `"annotations.external_link"`
   *
   *  If the annotation key or value contains special characters, you can escape
   *  them by surrounding the value with backticks. For example, to filter the
   *  results of your request to packages with the annotation key-value pair
   *  [`external.link`:`https://example.com/my-package`], append the following
   *  filter expression to your request:
   *
   *   * `` "annotations.`external.link`:`https://example.com/my-package`" ``
   *
   *  You can also filter with annotations with a wildcard to
   *  match any number of characters before or after the value:
   *
   *   * `` "annotations.*_link:`*example.com*`" ``
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. Filter
   * rules are case insensitive. The fields eligible for filtering are:
   *
   *   * `name`
   *   * `annotations`
   *
   * Examples of using a filter:
   *
   *  To filter the results of your request to packages with the name
   *  `my-package` in project `my-project` in the `us-central` region, in
   *  repository `my-repo`, append the following filter expression to your
   *  request:
   *
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/my-package"`
   *
   *  You can also use wildcards to match any number of characters before or
   *  after the value:
   *
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/my-*"`
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/&#42;package"`
   *   * `name="projects/my-project/locations/us-central1/repositories/my-repo/packages/&#42;pack*"`
   *
   *  To filter the results of your request to packages with the annotation
   *  key-value pair [`external_link`: `external_link_value`], append the
   *  following filter expression to your request":
   *
   *   * `"annotations.external_link:external_link_value"`
   *
   *  To filter the results just for a specific annotation key `external_link`,
   *  append the following filter expression to your request:
   *
   *   * `"annotations.external_link"`
   *
   *  If the annotation key or value contains special characters, you can escape
   *  them by surrounding the value with backticks. For example, to filter the
   *  results of your request to packages with the annotation key-value pair
   *  [`external.link`:`https://example.com/my-package`], append the following
   *  filter expression to your request:
   *
   *   * `` "annotations.`external.link`:`https://example.com/my-package`" ``
   *
   *  You can also filter with annotations with a wildcard to
   *  match any number of characters before or after the value:
   *
   *   * `` "annotations.*_link:`*example.com*`" ``
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The field to order the results by.
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
   * Optional. The field to order the results by.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
