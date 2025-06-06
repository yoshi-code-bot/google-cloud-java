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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.lineage.v1;

public interface BatchSearchLinkProcessesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.BatchSearchLinkProcessesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An array of processes associated with the specified links.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.ProcessLinks process_links = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.lineage.v1.ProcessLinks> getProcessLinksList();

  /**
   *
   *
   * <pre>
   * An array of processes associated with the specified links.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.ProcessLinks process_links = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.ProcessLinks getProcessLinks(int index);

  /**
   *
   *
   * <pre>
   * An array of processes associated with the specified links.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.ProcessLinks process_links = 1;</code>
   */
  int getProcessLinksCount();

  /**
   *
   *
   * <pre>
   * An array of processes associated with the specified links.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.ProcessLinks process_links = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.ProcessLinksOrBuilder>
      getProcessLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * An array of processes associated with the specified links.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.ProcessLinks process_links = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.ProcessLinksOrBuilder getProcessLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
