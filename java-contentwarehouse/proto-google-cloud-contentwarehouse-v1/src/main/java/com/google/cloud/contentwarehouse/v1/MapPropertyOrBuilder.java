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
// source: google/cloud/contentwarehouse/v1/document.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface MapPropertyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.MapProperty)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unordered map of dynamically typed values.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.contentwarehouse.v1.Value&gt; fields = 1;</code>
   */
  int getFieldsCount();

  /**
   *
   *
   * <pre>
   * Unordered map of dynamically typed values.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.contentwarehouse.v1.Value&gt; fields = 1;</code>
   */
  boolean containsFields(java.lang.String key);

  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.contentwarehouse.v1.Value> getFields();

  /**
   *
   *
   * <pre>
   * Unordered map of dynamically typed values.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.contentwarehouse.v1.Value&gt; fields = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.contentwarehouse.v1.Value> getFieldsMap();

  /**
   *
   *
   * <pre>
   * Unordered map of dynamically typed values.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.contentwarehouse.v1.Value&gt; fields = 1;</code>
   */
  /* nullable */
  com.google.cloud.contentwarehouse.v1.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.contentwarehouse.v1.Value defaultValue);

  /**
   *
   *
   * <pre>
   * Unordered map of dynamically typed values.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.contentwarehouse.v1.Value&gt; fields = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.Value getFieldsOrThrow(java.lang.String key);
}
