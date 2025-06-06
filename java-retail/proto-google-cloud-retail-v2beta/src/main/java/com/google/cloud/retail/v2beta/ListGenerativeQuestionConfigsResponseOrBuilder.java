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
// source: google/cloud/retail/v2beta/generative_question_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2beta;

public interface ListGenerativeQuestionConfigsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.ListGenerativeQuestionConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2beta.GenerativeQuestionConfig>
      getGenerativeQuestionConfigsList();

  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  com.google.cloud.retail.v2beta.GenerativeQuestionConfig getGenerativeQuestionConfigs(int index);

  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  int getGenerativeQuestionConfigsCount();

  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.GenerativeQuestionConfigOrBuilder>
      getGenerativeQuestionConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * All the questions for a given catalog.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.GenerativeQuestionConfig generative_question_configs = 1;
   * </code>
   */
  com.google.cloud.retail.v2beta.GenerativeQuestionConfigOrBuilder
      getGenerativeQuestionConfigsOrBuilder(int index);
}
