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
// source: google/cloud/functions/v2beta/functions.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.functions.v2beta;

public interface ListRuntimesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.ListRuntimesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The runtimes that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.ListRuntimesResponse.Runtime runtimes = 1;</code>
   */
  java.util.List<com.google.cloud.functions.v2beta.ListRuntimesResponse.Runtime> getRuntimesList();

  /**
   *
   *
   * <pre>
   * The runtimes that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.ListRuntimesResponse.Runtime runtimes = 1;</code>
   */
  com.google.cloud.functions.v2beta.ListRuntimesResponse.Runtime getRuntimes(int index);

  /**
   *
   *
   * <pre>
   * The runtimes that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.ListRuntimesResponse.Runtime runtimes = 1;</code>
   */
  int getRuntimesCount();

  /**
   *
   *
   * <pre>
   * The runtimes that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.ListRuntimesResponse.Runtime runtimes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.functions.v2beta.ListRuntimesResponse.RuntimeOrBuilder>
      getRuntimesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The runtimes that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.functions.v2beta.ListRuntimesResponse.Runtime runtimes = 1;</code>
   */
  com.google.cloud.functions.v2beta.ListRuntimesResponse.RuntimeOrBuilder getRuntimesOrBuilder(
      int index);
}
