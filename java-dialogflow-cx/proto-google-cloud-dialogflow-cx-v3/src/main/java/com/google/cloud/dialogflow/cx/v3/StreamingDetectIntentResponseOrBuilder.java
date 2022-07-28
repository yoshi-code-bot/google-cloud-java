/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface StreamingDetectIntentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult recognition_result = 1;</code>
   *
   * @return Whether the recognitionResult field is set.
   */
  boolean hasRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult recognition_result = 1;</code>
   *
   * @return The recognitionResult.
   */
  com.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult getRecognitionResult();
  /**
   *
   *
   * <pre>
   * The result of speech recognition.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.StreamingRecognitionResult recognition_result = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.StreamingRecognitionResultOrBuilder
      getRecognitionResultOrBuilder();

  /**
   *
   *
   * <pre>
   * The response from detect intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DetectIntentResponse detect_intent_response = 2;</code>
   *
   * @return Whether the detectIntentResponse field is set.
   */
  boolean hasDetectIntentResponse();
  /**
   *
   *
   * <pre>
   * The response from detect intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DetectIntentResponse detect_intent_response = 2;</code>
   *
   * @return The detectIntentResponse.
   */
  com.google.cloud.dialogflow.cx.v3.DetectIntentResponse getDetectIntentResponse();
  /**
   *
   *
   * <pre>
   * The response from detect intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.DetectIntentResponse detect_intent_response = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.DetectIntentResponseOrBuilder
      getDetectIntentResponseOrBuilder();

  public com.google.cloud.dialogflow.cx.v3.StreamingDetectIntentResponse.ResponseCase
      getResponseCase();
}