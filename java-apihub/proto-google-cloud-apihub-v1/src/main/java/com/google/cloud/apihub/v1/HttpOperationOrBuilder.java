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
// source: google/cloud/apihub/v1/common_fields.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

public interface HttpOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apihub.v1.HttpOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The path details for the Operation.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Path path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the path field is set.
   */
  boolean hasPath();

  /**
   *
   *
   * <pre>
   * Output only. The path details for the Operation.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Path path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The path.
   */
  com.google.cloud.apihub.v1.Path getPath();

  /**
   *
   *
   * <pre>
   * Output only. The path details for the Operation.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Path path = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.apihub.v1.PathOrBuilder getPathOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Operation method
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.HttpOperation.Method method = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for method.
   */
  int getMethodValue();

  /**
   *
   *
   * <pre>
   * Output only. Operation method
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.HttpOperation.Method method = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The method.
   */
  com.google.cloud.apihub.v1.HttpOperation.Method getMethod();
}
