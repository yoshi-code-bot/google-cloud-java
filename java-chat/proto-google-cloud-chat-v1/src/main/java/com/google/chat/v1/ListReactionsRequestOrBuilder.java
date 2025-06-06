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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

public interface ListReactionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ListReactionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The message users reacted to.
   *
   * Format: `spaces/{space}/messages/{message}`
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
   * Required. The message users reacted to.
   *
   * Format: `spaces/{space}/messages/{message}`
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
   * Optional. The maximum number of reactions returned. The service can return
   * fewer reactions than this value. If unspecified, the default value is 25.
   * The maximum value is 200; values above 200 are changed to 200.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. (If resuming from a previous query.)
   *
   * A page token received from a previous list reactions call. Provide this
   * to retrieve the subsequent page.
   *
   * When paginating, the filter value should match the call that provided the
   * page token. Passing a different value might lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * Optional. (If resuming from a previous query.)
   *
   * A page token received from a previous list reactions call. Provide this
   * to retrieve the subsequent page.
   *
   * When paginating, the filter value should match the call that provided the
   * page token. Passing a different value might lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * You can filter reactions by
   * [emoji](https://developers.google.com/workspace/chat/api/reference/rest/v1/Emoji)
   * (either `emoji.unicode` or `emoji.custom_emoji.uid`) and
   * [user](https://developers.google.com/workspace/chat/api/reference/rest/v1/User)
   * (`user.name`).
   *
   * To filter reactions for multiple emojis or users, join similar fields
   * with the `OR` operator, such as `emoji.unicode = "🙂" OR emoji.unicode =
   * "👍"` and `user.name = "users/AAAAAA" OR user.name = "users/BBBBBB"`.
   *
   * To filter reactions by emoji and user, use the `AND` operator, such as
   * `emoji.unicode = "🙂" AND user.name = "users/AAAAAA"`.
   *
   * If your query uses both `AND` and `OR`, group them with parentheses.
   *
   * For example, the following queries are valid:
   *
   * ```
   * user.name = "users/{user}"
   * emoji.unicode = "🙂"
   * emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" OR emoji.unicode = "👍"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" AND user.name = "users/{user}"
   * (emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}")
   * AND user.name = "users/{user}"
   * ```
   *
   * The following queries are invalid:
   *
   * ```
   * emoji.unicode = "🙂" AND emoji.unicode = "👍"
   * emoji.unicode = "🙂" AND emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" OR user.name = "users/{user}"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}" OR
   * user.name = "users/{user}"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}"
   * AND user.name = "users/{user}"
   * ```
   *
   * Invalid queries are rejected with an `INVALID_ARGUMENT` error.
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
   * Optional. A query filter.
   *
   * You can filter reactions by
   * [emoji](https://developers.google.com/workspace/chat/api/reference/rest/v1/Emoji)
   * (either `emoji.unicode` or `emoji.custom_emoji.uid`) and
   * [user](https://developers.google.com/workspace/chat/api/reference/rest/v1/User)
   * (`user.name`).
   *
   * To filter reactions for multiple emojis or users, join similar fields
   * with the `OR` operator, such as `emoji.unicode = "🙂" OR emoji.unicode =
   * "👍"` and `user.name = "users/AAAAAA" OR user.name = "users/BBBBBB"`.
   *
   * To filter reactions by emoji and user, use the `AND` operator, such as
   * `emoji.unicode = "🙂" AND user.name = "users/AAAAAA"`.
   *
   * If your query uses both `AND` and `OR`, group them with parentheses.
   *
   * For example, the following queries are valid:
   *
   * ```
   * user.name = "users/{user}"
   * emoji.unicode = "🙂"
   * emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" OR emoji.unicode = "👍"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" AND user.name = "users/{user}"
   * (emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}")
   * AND user.name = "users/{user}"
   * ```
   *
   * The following queries are invalid:
   *
   * ```
   * emoji.unicode = "🙂" AND emoji.unicode = "👍"
   * emoji.unicode = "🙂" AND emoji.custom_emoji.uid = "{uid}"
   * emoji.unicode = "🙂" OR user.name = "users/{user}"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}" OR
   * user.name = "users/{user}"
   * emoji.unicode = "🙂" OR emoji.custom_emoji.uid = "{uid}"
   * AND user.name = "users/{user}"
   * ```
   *
   * Invalid queries are rejected with an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
