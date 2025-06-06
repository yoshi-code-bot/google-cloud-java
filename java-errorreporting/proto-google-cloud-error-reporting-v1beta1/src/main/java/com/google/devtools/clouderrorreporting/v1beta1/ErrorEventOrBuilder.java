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
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.clouderrorreporting.v1beta1;

public interface ErrorEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ErrorEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time when the event occurred as provided in the error report.
   * If the report did not contain a timestamp, the time the error was received
   * by the Error Reporting system is used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();

  /**
   *
   *
   * <pre>
   * Time when the event occurred as provided in the error report.
   * If the report did not contain a timestamp, the time the error was received
   * by the Error Reporting system is used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();

  /**
   *
   *
   * <pre>
   * Time when the event occurred as provided in the error report.
   * If the report did not contain a timestamp, the time the error was received
   * by the Error Reporting system is used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The `ServiceContext` for which this error was reported.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   *
   * @return Whether the serviceContext field is set.
   */
  boolean hasServiceContext();

  /**
   *
   *
   * <pre>
   * The `ServiceContext` for which this error was reported.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   *
   * @return The serviceContext.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContext getServiceContext();

  /**
   *
   *
   * <pre>
   * The `ServiceContext` for which this error was reported.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder
      getServiceContextOrBuilder();

  /**
   *
   *
   * <pre>
   * The stack trace that was reported or logged by the service.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();

  /**
   *
   *
   * <pre>
   * The stack trace that was reported or logged by the service.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * Data about the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 5;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();

  /**
   *
   *
   * <pre>
   * Data about the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 5;</code>
   *
   * @return The context.
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContext getContext();

  /**
   *
   *
   * <pre>
   * Data about the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 5;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContextOrBuilder getContextOrBuilder();
}
