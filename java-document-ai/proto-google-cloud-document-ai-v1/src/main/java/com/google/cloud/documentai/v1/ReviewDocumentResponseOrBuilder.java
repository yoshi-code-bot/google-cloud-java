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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1;

public interface ReviewDocumentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.ReviewDocumentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   *
   * @return The gcsDestination.
   */
  java.lang.String getGcsDestination();

  /**
   *
   *
   * <pre>
   * The Cloud Storage uri for the human reviewed document if the review is
   * succeeded.
   * </pre>
   *
   * <code>string gcs_destination = 1;</code>
   *
   * @return The bytes for gcsDestination.
   */
  com.google.protobuf.ByteString getGcsDestinationBytes();

  /**
   *
   *
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * The state of the review operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1.ReviewDocumentResponse.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.documentai.v1.ReviewDocumentResponse.State getState();

  /**
   *
   *
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   *
   * @return The rejectionReason.
   */
  java.lang.String getRejectionReason();

  /**
   *
   *
   * <pre>
   * The reason why the review is rejected by reviewer.
   * </pre>
   *
   * <code>string rejection_reason = 3;</code>
   *
   * @return The bytes for rejectionReason.
   */
  com.google.protobuf.ByteString getRejectionReasonBytes();
}
