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
// source: google/chat/v1/space.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface ListSpacesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ListSpacesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of spaces to return. The service might return
   * fewer than this value.
   *
   * If unspecified, at most 100 spaces are returned.
   *
   * The maximum value is 1000. If you use a value more than 1000, it's
   * automatically changed to 1000.
   *
   * Negative values return an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>int32 page_size = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous list spaces call.
   * Provide this parameter to retrieve the subsequent page.
   *
   * When paginating, the filter value should match the call that provided the
   * page token. Passing a different value may lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous list spaces call.
   * Provide this parameter to retrieve the subsequent page.
   *
   * When paginating, the filter value should match the call that provided the
   * page token. Passing a different value may lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A query filter.
   *
   * You can filter spaces by the space type
   * ([`space_type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces#spacetype)).
   *
   * To filter by space type, you must specify valid enum value, such as
   * `SPACE` or `GROUP_CHAT` (the `space_type` can't be
   * `SPACE_TYPE_UNSPECIFIED`). To query for multiple space types, use the `OR`
   * operator.
   *
   * For example, the following queries are valid:
   *
   * ```
   * space_type = "SPACE"
   * spaceType = "GROUP_CHAT" OR spaceType = "DIRECT_MESSAGE"
   * ```
   *
   * Invalid queries are rejected by the server with an `INVALID_ARGUMENT`
   * error.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();

  /**
   *
   *
   * <pre>
   * Optional. A query filter.
   *
   * You can filter spaces by the space type
   * ([`space_type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces#spacetype)).
   *
   * To filter by space type, you must specify valid enum value, such as
   * `SPACE` or `GROUP_CHAT` (the `space_type` can't be
   * `SPACE_TYPE_UNSPECIFIED`). To query for multiple space types, use the `OR`
   * operator.
   *
   * For example, the following queries are valid:
   *
   * ```
   * space_type = "SPACE"
   * spaceType = "GROUP_CHAT" OR spaceType = "DIRECT_MESSAGE"
   * ```
   *
   * Invalid queries are rejected by the server with an `INVALID_ARGUMENT`
   * error.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
