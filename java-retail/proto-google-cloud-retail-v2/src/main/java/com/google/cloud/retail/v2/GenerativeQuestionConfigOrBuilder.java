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
// source: google/cloud/retail/v2/generative_question.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public interface GenerativeQuestionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.GenerativeQuestionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the catalog.
   * Format: projects/{project}/locations/{location}/catalogs/{catalog}
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The catalog.
   */
  java.lang.String getCatalog();

  /**
   *
   *
   * <pre>
   * Required. Resource name of the catalog.
   * Format: projects/{project}/locations/{location}/catalogs/{catalog}
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for catalog.
   */
  com.google.protobuf.ByteString getCatalogBytes();

  /**
   *
   *
   * <pre>
   * Required. The facet to which the question is associated.
   * </pre>
   *
   * <code>string facet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The facet.
   */
  java.lang.String getFacet();

  /**
   *
   *
   * <pre>
   * Required. The facet to which the question is associated.
   * </pre>
   *
   * <code>string facet = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for facet.
   */
  com.google.protobuf.ByteString getFacetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The LLM generated question.
   * </pre>
   *
   * <code>string generated_question = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The generatedQuestion.
   */
  java.lang.String getGeneratedQuestion();

  /**
   *
   *
   * <pre>
   * Output only. The LLM generated question.
   * </pre>
   *
   * <code>string generated_question = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for generatedQuestion.
   */
  com.google.protobuf.ByteString getGeneratedQuestionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The question that will be used at serving time.
   * Question can have a max length of 300 bytes.
   * When not populated, generated_question should be used.
   * </pre>
   *
   * <code>string final_question = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The finalQuestion.
   */
  java.lang.String getFinalQuestion();

  /**
   *
   *
   * <pre>
   * Optional. The question that will be used at serving time.
   * Question can have a max length of 300 bytes.
   * When not populated, generated_question should be used.
   * </pre>
   *
   * <code>string final_question = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for finalQuestion.
   */
  com.google.protobuf.ByteString getFinalQuestionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Values that can be used to answer the question.
   * </pre>
   *
   * <code>repeated string example_values = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the exampleValues.
   */
  java.util.List<java.lang.String> getExampleValuesList();

  /**
   *
   *
   * <pre>
   * Output only. Values that can be used to answer the question.
   * </pre>
   *
   * <code>repeated string example_values = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of exampleValues.
   */
  int getExampleValuesCount();

  /**
   *
   *
   * <pre>
   * Output only. Values that can be used to answer the question.
   * </pre>
   *
   * <code>repeated string example_values = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The exampleValues at the given index.
   */
  java.lang.String getExampleValues(int index);

  /**
   *
   *
   * <pre>
   * Output only. Values that can be used to answer the question.
   * </pre>
   *
   * <code>repeated string example_values = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exampleValues at the given index.
   */
  com.google.protobuf.ByteString getExampleValuesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The ratio of how often a question was asked.
   * </pre>
   *
   * <code>float frequency = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The frequency.
   */
  float getFrequency();

  /**
   *
   *
   * <pre>
   * Optional. Whether the question is asked at serving time.
   * </pre>
   *
   * <code>bool allowed_in_conversation = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowedInConversation.
   */
  boolean getAllowedInConversation();
}
