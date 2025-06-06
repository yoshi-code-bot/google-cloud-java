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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.metastore.v1alpha;

public interface ErrorDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.ErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  int getDetailsCount();

  /**
   *
   *
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  boolean containsDetails(java.lang.String key);

  /** Use {@link #getDetailsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDetails();

  /**
   *
   *
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDetailsMap();

  /**
   *
   *
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  /* nullable */
  java.lang.String getDetailsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  java.lang.String getDetailsOrThrow(java.lang.String key);
}
