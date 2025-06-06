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
// source: google/cloud/aiplatform/v1beta1/extension_execution_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface QueryExtensionResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryExtensionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Content> getStepsList();

  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.Content getSteps(int index);

  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  int getStepsCount();

  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
      getStepsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Steps of extension or LLM interaction, can contain function call,
   * function response, or text response. The last step contains the final
   * response to the query.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.Content steps = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ContentOrBuilder getStepsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Failure message if any.
   * </pre>
   *
   * <code>string failure_message = 2;</code>
   *
   * @return The failureMessage.
   */
  java.lang.String getFailureMessage();

  /**
   *
   *
   * <pre>
   * Failure message if any.
   * </pre>
   *
   * <code>string failure_message = 2;</code>
   *
   * @return The bytes for failureMessage.
   */
  com.google.protobuf.ByteString getFailureMessageBytes();
}
