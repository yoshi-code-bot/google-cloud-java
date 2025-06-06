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
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3beta1;

public interface DetectLanguageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.DetectLanguageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}` or
   * `projects/{project-number-or-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Only models within the same region (has same location-id) can be used.
   * Otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}` or
   * `projects/{project-number-or-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Only models within the same region (has same location-id) can be used.
   * Otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 5 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language detection model to be used.
   *
   * Format:
   * `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/{model-id}`
   *
   * Only one language detection model is currently supported:
   * `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/default`.
   *
   * If not specified, the default model is used.
   * </pre>
   *
   * <code>string model = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();

  /**
   *
   *
   * <pre>
   * Optional. The language detection model to be used.
   *
   * Format:
   * `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/{model-id}`
   *
   * Only one language detection model is currently supported:
   * `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/default`.
   *
   * If not specified, the default model is used.
   * </pre>
   *
   * <code>string model = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * The content of the input stored as a string.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return Whether the content field is set.
   */
  boolean hasContent();

  /**
   *
   *
   * <pre>
   * The content of the input stored as a string.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();

  /**
   *
   *
   * <pre>
   * The content of the input stored as a string.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The format of the source text, for example, "text/html",
   * "text/plain". If left blank, the MIME type defaults to "text/html".
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();

  /**
   *
   *
   * <pre>
   * Optional. The format of the source text, for example, "text/html",
   * "text/plain". If left blank, the MIME type defaults to "text/html".
   * </pre>
   *
   * <code>string mime_type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/labels for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/labels for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/labels for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/labels for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. The labels with user-defined metadata for the request.
   *
   * Label keys and values can be no longer than 63 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * Label values are optional. Label keys must start with a letter.
   *
   * See https://cloud.google.com/translate/docs/labels for more information.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.translate.v3beta1.DetectLanguageRequest.SourceCase getSourceCase();
}
