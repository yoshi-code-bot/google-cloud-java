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
// source: google/analytics/admin/v1alpha/access_report.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface AccessMetricHeaderOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AccessMetricHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The metric's name; for example 'accessCount'.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The metricName.
   */
  java.lang.String getMetricName();

  /**
   *
   *
   * <pre>
   * The metric's name; for example 'accessCount'.
   * </pre>
   *
   * <code>string metric_name = 1;</code>
   *
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString getMetricNameBytes();
}
