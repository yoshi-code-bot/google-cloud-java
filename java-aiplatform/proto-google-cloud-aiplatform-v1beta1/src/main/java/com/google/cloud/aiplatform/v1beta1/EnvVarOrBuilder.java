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
// source: google/cloud/aiplatform/v1beta1/env_var.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface EnvVarOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EnvVar)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the environment variable. Must be a valid C identifier.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Name of the environment variable. Must be a valid C identifier.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Variables that reference a $(VAR_NAME) are expanded
   * using the previous defined environment variables in the container and
   * any service environment variables. If a variable cannot be resolved,
   * the reference in the input string will be unchanged. The $(VAR_NAME)
   * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
   * references will never be expanded, regardless of whether the variable
   * exists or not.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  java.lang.String getValue();

  /**
   *
   *
   * <pre>
   * Required. Variables that reference a $(VAR_NAME) are expanded
   * using the previous defined environment variables in the container and
   * any service environment variables. If a variable cannot be resolved,
   * the reference in the input string will be unchanged. The $(VAR_NAME)
   * syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped
   * references will never be expanded, regardless of whether the variable
   * exists or not.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();
}
