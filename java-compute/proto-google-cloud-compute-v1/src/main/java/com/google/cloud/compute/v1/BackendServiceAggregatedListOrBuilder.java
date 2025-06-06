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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface BackendServiceAggregatedListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.BackendServiceAggregatedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();

  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * [Output Only] Unique identifier for the resource; defined by the server.
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * A list of BackendServicesScopedList resources.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.BackendServicesScopedList&gt; items = 100526016;
   * </code>
   */
  int getItemsCount();

  /**
   *
   *
   * <pre>
   * A list of BackendServicesScopedList resources.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.BackendServicesScopedList&gt; items = 100526016;
   * </code>
   */
  boolean containsItems(java.lang.String key);

  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.BackendServicesScopedList> getItems();

  /**
   *
   *
   * <pre>
   * A list of BackendServicesScopedList resources.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.BackendServicesScopedList&gt; items = 100526016;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.BackendServicesScopedList>
      getItemsMap();

  /**
   *
   *
   * <pre>
   * A list of BackendServicesScopedList resources.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.BackendServicesScopedList&gt; items = 100526016;
   * </code>
   */
  /* nullable */
  com.google.cloud.compute.v1.BackendServicesScopedList getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.compute.v1.BackendServicesScopedList defaultValue);

  /**
   *
   *
   * <pre>
   * A list of BackendServicesScopedList resources.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.BackendServicesScopedList&gt; items = 100526016;
   * </code>
   */
  com.google.cloud.compute.v1.BackendServicesScopedList getItemsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Type of resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * Type of resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * Type of resource.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return Whether the nextPageToken field is set.
   */
  boolean hasNextPageToken();

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * [Output Only] This token allows you to get the next page of results for list requests. If the number of results is larger than maxResults, use the nextPageToken as a value for the query parameter pageToken in the next list request. Subsequent list requests will have their own nextPageToken to continue paging through the results.
   * </pre>
   *
   * <code>optional string next_page_token = 79797525;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for this resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachables = 243372063;</code>
   *
   * @return A list containing the unreachables.
   */
  java.util.List<java.lang.String> getUnreachablesList();

  /**
   *
   *
   * <pre>
   * [Output Only] Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachables = 243372063;</code>
   *
   * @return The count of unreachables.
   */
  int getUnreachablesCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachables = 243372063;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachables at the given index.
   */
  java.lang.String getUnreachables(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Unreachable resources.
   * </pre>
   *
   * <code>repeated string unreachables = 243372063;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachables at the given index.
   */
  com.google.protobuf.ByteString getUnreachablesBytes(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  boolean hasWarning();

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();

  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning message.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
