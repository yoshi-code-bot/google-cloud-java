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
// source: google/cloud/visionai/v1/lva_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface BatchRunProcessResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.BatchRunProcessResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The batch ID.
   * </pre>
   *
   * <code>string batch_id = 1;</code>
   *
   * @return The batchId.
   */
  java.lang.String getBatchId();

  /**
   *
   *
   * <pre>
   * The batch ID.
   * </pre>
   *
   * <code>string batch_id = 1;</code>
   *
   * @return The bytes for batchId.
   */
  com.google.protobuf.ByteString getBatchIdBytes();

  /**
   *
   *
   * <pre>
   * Processes created.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Process processes = 2;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Process> getProcessesList();

  /**
   *
   *
   * <pre>
   * Processes created.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Process processes = 2;</code>
   */
  com.google.cloud.visionai.v1.Process getProcesses(int index);

  /**
   *
   *
   * <pre>
   * Processes created.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Process processes = 2;</code>
   */
  int getProcessesCount();

  /**
   *
   *
   * <pre>
   * Processes created.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Process processes = 2;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.ProcessOrBuilder>
      getProcessesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Processes created.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Process processes = 2;</code>
   */
  com.google.cloud.visionai.v1.ProcessOrBuilder getProcessesOrBuilder(int index);
}
