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
// source: google/devtools/cloudtrace/v1/trace.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudtrace.v1;

public interface TracesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudtrace.v1.Traces)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList();

  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  com.google.devtools.cloudtrace.v1.Trace getTraces(int index);

  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  int getTracesCount();

  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder>
      getTracesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(int index);
}
