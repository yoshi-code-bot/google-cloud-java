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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface PairwiseMetricSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PairwiseMetricSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Metric prompt template for pairwise metric.
   * </pre>
   *
   * <code>optional string metric_prompt_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricPromptTemplate field is set.
   */
  boolean hasMetricPromptTemplate();

  /**
   *
   *
   * <pre>
   * Required. Metric prompt template for pairwise metric.
   * </pre>
   *
   * <code>optional string metric_prompt_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricPromptTemplate.
   */
  java.lang.String getMetricPromptTemplate();

  /**
   *
   *
   * <pre>
   * Required. Metric prompt template for pairwise metric.
   * </pre>
   *
   * <code>optional string metric_prompt_template = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for metricPromptTemplate.
   */
  com.google.protobuf.ByteString getMetricPromptTemplateBytes();

  /**
   *
   *
   * <pre>
   * Optional. The field name of the candidate response.
   * </pre>
   *
   * <code>string candidate_response_field_name = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The candidateResponseFieldName.
   */
  java.lang.String getCandidateResponseFieldName();

  /**
   *
   *
   * <pre>
   * Optional. The field name of the candidate response.
   * </pre>
   *
   * <code>string candidate_response_field_name = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for candidateResponseFieldName.
   */
  com.google.protobuf.ByteString getCandidateResponseFieldNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The field name of the baseline response.
   * </pre>
   *
   * <code>string baseline_response_field_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The baselineResponseFieldName.
   */
  java.lang.String getBaselineResponseFieldName();

  /**
   *
   *
   * <pre>
   * Optional. The field name of the baseline response.
   * </pre>
   *
   * <code>string baseline_response_field_name = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for baselineResponseFieldName.
   */
  com.google.protobuf.ByteString getBaselineResponseFieldNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. System instructions for pairwise metric.
   * </pre>
   *
   * <code>optional string system_instruction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the systemInstruction field is set.
   */
  boolean hasSystemInstruction();

  /**
   *
   *
   * <pre>
   * Optional. System instructions for pairwise metric.
   * </pre>
   *
   * <code>optional string system_instruction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The systemInstruction.
   */
  java.lang.String getSystemInstruction();

  /**
   *
   *
   * <pre>
   * Optional. System instructions for pairwise metric.
   * </pre>
   *
   * <code>optional string system_instruction = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for systemInstruction.
   */
  com.google.protobuf.ByteString getSystemInstructionBytes();

  /**
   *
   *
   * <pre>
   * Optional. CustomOutputFormatConfig allows customization of metric output.
   * When this config is set, the default output is replaced with
   * the raw output string.
   * If a custom format is chosen, the `pairwise_choice` and `explanation`
   * fields in the corresponding metric result will be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutputFormatConfig custom_output_format_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the customOutputFormatConfig field is set.
   */
  boolean hasCustomOutputFormatConfig();

  /**
   *
   *
   * <pre>
   * Optional. CustomOutputFormatConfig allows customization of metric output.
   * When this config is set, the default output is replaced with
   * the raw output string.
   * If a custom format is chosen, the `pairwise_choice` and `explanation`
   * fields in the corresponding metric result will be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutputFormatConfig custom_output_format_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The customOutputFormatConfig.
   */
  com.google.cloud.aiplatform.v1beta1.CustomOutputFormatConfig getCustomOutputFormatConfig();

  /**
   *
   *
   * <pre>
   * Optional. CustomOutputFormatConfig allows customization of metric output.
   * When this config is set, the default output is replaced with
   * the raw output string.
   * If a custom format is chosen, the `pairwise_choice` and `explanation`
   * fields in the corresponding metric result will be empty.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutputFormatConfig custom_output_format_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CustomOutputFormatConfigOrBuilder
      getCustomOutputFormatConfigOrBuilder();
}
