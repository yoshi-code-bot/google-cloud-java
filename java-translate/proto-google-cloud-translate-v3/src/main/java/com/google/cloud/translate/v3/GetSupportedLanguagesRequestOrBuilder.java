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
// source: google/cloud/translate/v3/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3;

public interface GetSupportedLanguagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.GetSupportedLanguagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   *
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Non-global location is required for AutoML models.
   *
   * Only models within the same region (have same location-id) can be used,
   * otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
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
   * Format: `projects/{project-number-or-id}` or
   * `projects/{project-number-or-id}/locations/{location-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   *
   * Non-global location is required for AutoML models.
   *
   * Only models within the same region (have same location-id) can be used,
   * otherwise an INVALID_ARGUMENT (400) error is returned.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, then display names are not returned
   * in a response.
   * </pre>
   *
   * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayLanguageCode.
   */
  java.lang.String getDisplayLanguageCode();

  /**
   *
   *
   * <pre>
   * Optional. The language to use to return localized, human readable names
   * of supported languages. If missing, then display names are not returned
   * in a response.
   * </pre>
   *
   * <code>string display_language_code = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayLanguageCode.
   */
  com.google.protobuf.ByteString getDisplayLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   *
   * The format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general NMT model.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The model.
   */
  java.lang.String getModel();

  /**
   *
   *
   * <pre>
   * Optional. Get supported languages of this model.
   *
   * The format depends on model type:
   *
   * - AutoML Translation models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/{model-id}`
   *
   * - General (built-in) models:
   *   `projects/{project-number-or-id}/locations/{location-id}/models/general/nmt`,
   *
   *
   * Returns languages supported by the specified model.
   * If missing, we get supported languages of Google general NMT model.
   * </pre>
   *
   * <code>string model = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();
}
