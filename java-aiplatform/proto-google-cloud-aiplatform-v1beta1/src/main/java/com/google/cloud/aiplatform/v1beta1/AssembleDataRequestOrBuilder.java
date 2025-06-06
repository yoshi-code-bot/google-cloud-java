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
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface AssembleDataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.AssembleDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Config for assembling templates with a Gemini API structure.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiTemplateConfig gemini_template_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the geminiTemplateConfig field is set.
   */
  boolean hasGeminiTemplateConfig();

  /**
   *
   *
   * <pre>
   * Optional. Config for assembling templates with a Gemini API structure.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiTemplateConfig gemini_template_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The geminiTemplateConfig.
   */
  com.google.cloud.aiplatform.v1beta1.GeminiTemplateConfig getGeminiTemplateConfig();

  /**
   *
   *
   * <pre>
   * Optional. Config for assembling templates with a Gemini API structure.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiTemplateConfig gemini_template_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GeminiTemplateConfigOrBuilder
      getGeminiTemplateConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The column name in the underlying table that contains already
   * fully assembled requests. If this field is set, the original request will
   * be copied to the output table.
   * </pre>
   *
   * <code>string request_column_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the requestColumnName field is set.
   */
  boolean hasRequestColumnName();

  /**
   *
   *
   * <pre>
   * Optional. The column name in the underlying table that contains already
   * fully assembled requests. If this field is set, the original request will
   * be copied to the output table.
   * </pre>
   *
   * <code>string request_column_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestColumnName.
   */
  java.lang.String getRequestColumnName();

  /**
   *
   *
   * <pre>
   * Optional. The column name in the underlying table that contains already
   * fully assembled requests. If this field is set, the original request will
   * be copied to the output table.
   * </pre>
   *
   * <code>string request_column_name = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestColumnName.
   */
  com.google.protobuf.ByteString getRequestColumnNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource (used only for MULTIMODAL
   * datasets). Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource (used only for MULTIMODAL
   * datasets). Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The read config for the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiRequestReadConfig gemini_request_read_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the geminiRequestReadConfig field is set.
   */
  boolean hasGeminiRequestReadConfig();

  /**
   *
   *
   * <pre>
   * Optional. The read config for the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiRequestReadConfig gemini_request_read_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The geminiRequestReadConfig.
   */
  com.google.cloud.aiplatform.v1beta1.GeminiRequestReadConfig getGeminiRequestReadConfig();

  /**
   *
   *
   * <pre>
   * Optional. The read config for the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.GeminiRequestReadConfig gemini_request_read_config = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.GeminiRequestReadConfigOrBuilder
      getGeminiRequestReadConfigOrBuilder();

  com.google.cloud.aiplatform.v1beta1.AssembleDataRequest.ReadConfigCase getReadConfigCase();
}
