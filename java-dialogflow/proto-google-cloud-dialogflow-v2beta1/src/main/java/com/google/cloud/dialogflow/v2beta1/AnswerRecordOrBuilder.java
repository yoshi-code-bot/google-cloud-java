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
// source: google/cloud/dialogflow/v2beta1/answer_record.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface AnswerRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.AnswerRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of this answer record.
   * Required for
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2beta1.AnswerRecords.UpdateAnswerRecord]
   * method. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/answerRecords/&lt;Answer Record ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The unique identifier of this answer record.
   * Required for
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2beta1.AnswerRecords.UpdateAnswerRecord]
   * method. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/answerRecords/&lt;Answer Record ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2beta1.AnswerRecords.UpdateAnswerRecord]
   * in order to give us feedback about this answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AnswerFeedback answer_feedback = 3;</code>
   *
   * @return Whether the answerFeedback field is set.
   */
  boolean hasAnswerFeedback();

  /**
   *
   *
   * <pre>
   * Optional. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2beta1.AnswerRecords.UpdateAnswerRecord]
   * in order to give us feedback about this answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AnswerFeedback answer_feedback = 3;</code>
   *
   * @return The answerFeedback.
   */
  com.google.cloud.dialogflow.v2beta1.AnswerFeedback getAnswerFeedback();

  /**
   *
   *
   * <pre>
   * Optional. The AnswerFeedback for this record. You can set this with
   * [AnswerRecords.UpdateAnswerRecord][google.cloud.dialogflow.v2beta1.AnswerRecords.UpdateAnswerRecord]
   * in order to give us feedback about this answer.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AnswerFeedback answer_feedback = 3;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AnswerFeedbackOrBuilder getAnswerFeedbackOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantRecord agent_assistant_record = 4;</code>
   *
   * @return Whether the agentAssistantRecord field is set.
   */
  boolean hasAgentAssistantRecord();

  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantRecord agent_assistant_record = 4;</code>
   *
   * @return The agentAssistantRecord.
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantRecord getAgentAssistantRecord();

  /**
   *
   *
   * <pre>
   * Output only. The record for human agent assistant.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.AgentAssistantRecord agent_assistant_record = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentAssistantRecordOrBuilder
      getAgentAssistantRecordOrBuilder();

  com.google.cloud.dialogflow.v2beta1.AnswerRecord.RecordCase getRecordCase();
}
