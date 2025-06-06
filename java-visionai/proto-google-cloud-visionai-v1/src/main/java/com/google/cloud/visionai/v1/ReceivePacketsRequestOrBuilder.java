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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface ReceivePacketsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.ReceivePacketsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The request to setup the initial state of session.
   *
   * The client must send and only send this as the first message.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ReceivePacketsRequest.SetupRequest setup_request = 6;</code>
   *
   * @return Whether the setupRequest field is set.
   */
  boolean hasSetupRequest();

  /**
   *
   *
   * <pre>
   * The request to setup the initial state of session.
   *
   * The client must send and only send this as the first message.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ReceivePacketsRequest.SetupRequest setup_request = 6;</code>
   *
   * @return The setupRequest.
   */
  com.google.cloud.visionai.v1.ReceivePacketsRequest.SetupRequest getSetupRequest();

  /**
   *
   *
   * <pre>
   * The request to setup the initial state of session.
   *
   * The client must send and only send this as the first message.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.ReceivePacketsRequest.SetupRequest setup_request = 6;</code>
   */
  com.google.cloud.visionai.v1.ReceivePacketsRequest.SetupRequestOrBuilder
      getSetupRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * This request checkpoints the consumer's read progress.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CommitRequest commit_request = 7;</code>
   *
   * @return Whether the commitRequest field is set.
   */
  boolean hasCommitRequest();

  /**
   *
   *
   * <pre>
   * This request checkpoints the consumer's read progress.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CommitRequest commit_request = 7;</code>
   *
   * @return The commitRequest.
   */
  com.google.cloud.visionai.v1.CommitRequest getCommitRequest();

  /**
   *
   *
   * <pre>
   * This request checkpoints the consumer's read progress.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.CommitRequest commit_request = 7;</code>
   */
  com.google.cloud.visionai.v1.CommitRequestOrBuilder getCommitRequestOrBuilder();

  com.google.cloud.visionai.v1.ReceivePacketsRequest.RequestCase getRequestCase();
}
