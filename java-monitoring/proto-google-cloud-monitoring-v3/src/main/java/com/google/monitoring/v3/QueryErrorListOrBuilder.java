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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

public interface QueryErrorListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.QueryErrorList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.QueryError> getErrorsList();

  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  com.google.monitoring.v3.QueryError getErrors(int index);

  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  int getErrorsCount();

  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.QueryErrorOrBuilder> getErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Errors in parsing the time series query language text. The number of errors
   * in the response may be limited.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.QueryError errors = 1;</code>
   */
  com.google.monitoring.v3.QueryErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A summary of all the errors.
   * </pre>
   *
   * <code>string error_summary = 2;</code>
   *
   * @return The errorSummary.
   */
  java.lang.String getErrorSummary();

  /**
   *
   *
   * <pre>
   * A summary of all the errors.
   * </pre>
   *
   * <code>string error_summary = 2;</code>
   *
   * @return The bytes for errorSummary.
   */
  com.google.protobuf.ByteString getErrorSummaryBytes();
}
