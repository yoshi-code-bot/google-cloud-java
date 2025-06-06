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

public interface ListNotebookRuntimeTemplatesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimeTemplates in the requested page.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NotebookRuntimeTemplate notebook_runtime_templates = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.NotebookRuntimeTemplate>
      getNotebookRuntimeTemplatesList();

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimeTemplates in the requested page.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NotebookRuntimeTemplate notebook_runtime_templates = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.NotebookRuntimeTemplate getNotebookRuntimeTemplates(int index);

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimeTemplates in the requested page.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NotebookRuntimeTemplate notebook_runtime_templates = 1;
   * </code>
   */
  int getNotebookRuntimeTemplatesCount();

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimeTemplates in the requested page.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NotebookRuntimeTemplate notebook_runtime_templates = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.NotebookRuntimeTemplateOrBuilder>
      getNotebookRuntimeTemplatesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimeTemplates in the requested page.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.NotebookRuntimeTemplate notebook_runtime_templates = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.NotebookRuntimeTemplateOrBuilder
      getNotebookRuntimeTemplatesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimeTemplatesRequest.page_token][google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimeTemplatesRequest.page_token][google.cloud.aiplatform.v1.ListNotebookRuntimeTemplatesRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
