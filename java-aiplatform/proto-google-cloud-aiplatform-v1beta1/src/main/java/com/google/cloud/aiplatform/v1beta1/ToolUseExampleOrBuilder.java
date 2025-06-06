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
// source: google/cloud/aiplatform/v1beta1/tool.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ToolUseExampleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ToolUseExample)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Extension operation to call.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolUseExample.ExtensionOperation extension_operation = 10;
   * </code>
   *
   * @return Whether the extensionOperation field is set.
   */
  boolean hasExtensionOperation();

  /**
   *
   *
   * <pre>
   * Extension operation to call.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolUseExample.ExtensionOperation extension_operation = 10;
   * </code>
   *
   * @return The extensionOperation.
   */
  com.google.cloud.aiplatform.v1beta1.ToolUseExample.ExtensionOperation getExtensionOperation();

  /**
   *
   *
   * <pre>
   * Extension operation to call.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ToolUseExample.ExtensionOperation extension_operation = 10;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ToolUseExample.ExtensionOperationOrBuilder
      getExtensionOperationOrBuilder();

  /**
   *
   *
   * <pre>
   * Function name to call.
   * </pre>
   *
   * <code>string function_name = 11;</code>
   *
   * @return Whether the functionName field is set.
   */
  boolean hasFunctionName();

  /**
   *
   *
   * <pre>
   * Function name to call.
   * </pre>
   *
   * <code>string function_name = 11;</code>
   *
   * @return The functionName.
   */
  java.lang.String getFunctionName();

  /**
   *
   *
   * <pre>
   * Function name to call.
   * </pre>
   *
   * <code>string function_name = 11;</code>
   *
   * @return The bytes for functionName.
   */
  com.google.protobuf.ByteString getFunctionNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name for example.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The display name for example.
   * </pre>
   *
   * <code>string display_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Query that should be routed to this tool.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();

  /**
   *
   *
   * <pre>
   * Required. Query that should be routed to this tool.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Request parameters used for executing this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct request_params = 3;</code>
   *
   * @return Whether the requestParams field is set.
   */
  boolean hasRequestParams();

  /**
   *
   *
   * <pre>
   * Request parameters used for executing this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct request_params = 3;</code>
   *
   * @return The requestParams.
   */
  com.google.protobuf.Struct getRequestParams();

  /**
   *
   *
   * <pre>
   * Request parameters used for executing this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct request_params = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getRequestParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Response parameters generated by this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct response_params = 4;</code>
   *
   * @return Whether the responseParams field is set.
   */
  boolean hasResponseParams();

  /**
   *
   *
   * <pre>
   * Response parameters generated by this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct response_params = 4;</code>
   *
   * @return The responseParams.
   */
  com.google.protobuf.Struct getResponseParams();

  /**
   *
   *
   * <pre>
   * Response parameters generated by this tool.
   * </pre>
   *
   * <code>.google.protobuf.Struct response_params = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getResponseParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Summary of the tool response to the user query.
   * </pre>
   *
   * <code>string response_summary = 5;</code>
   *
   * @return The responseSummary.
   */
  java.lang.String getResponseSummary();

  /**
   *
   *
   * <pre>
   * Summary of the tool response to the user query.
   * </pre>
   *
   * <code>string response_summary = 5;</code>
   *
   * @return The bytes for responseSummary.
   */
  com.google.protobuf.ByteString getResponseSummaryBytes();

  com.google.cloud.aiplatform.v1beta1.ToolUseExample.TargetCase getTargetCase();
}
