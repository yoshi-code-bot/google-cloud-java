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
// source: google/cloud/dialogflow/v2beta1/session.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

public interface DetectIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.DetectIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the session this query is sent to. Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   *
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment
   * (`Environment ID` might be referred to as environment name at some places).
   * If `User ID` is not specified, we are using "-". It's up to the API caller
   * to choose an appropriate `Session ID` and `User Id`. They can be a random
   * number or some type of user and session identifiers (preferably hashed).
   * The length of the `Session ID` and `User ID` must not exceed 36 characters.
   * For more information, see the [API interactions
   * guide](https://cloud.google.com/dialogflow/docs/api-overview).
   *
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The session.
   */
  java.lang.String getSession();

  /**
   *
   *
   * <pre>
   * Required. The name of the session this query is sent to. Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session ID&gt;,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/sessions/&lt;Session
   *   ID&gt;`,
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User
   *   ID&gt;/sessions/&lt;Session ID&gt;`,
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;/users/&lt;User ID&gt;/sessions/&lt;Session
   *   ID&gt;`,
   *
   * If `Location ID` is not specified we assume default 'us' location. If
   * `Environment ID` is not specified, we assume default 'draft' environment
   * (`Environment ID` might be referred to as environment name at some places).
   * If `User ID` is not specified, we are using "-". It's up to the API caller
   * to choose an appropriate `Session ID` and `User Id`. They can be a random
   * number or some type of user and session identifiers (preferably hashed).
   * The length of the `Session ID` and `User ID` must not exceed 36 characters.
   * For more information, see the [API interactions
   * guide](https://cloud.google.com/dialogflow/docs/api-overview).
   *
   * Note: Always use agent versions for production traffic.
   * See [Versions and
   * environments](https://cloud.google.com/dialogflow/es/docs/agents-versions).
   * </pre>
   *
   * <code>
   * string session = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   *
   * @return Whether the queryParams field is set.
   */
  boolean hasQueryParams();

  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   *
   * @return The queryParams.
   */
  com.google.cloud.dialogflow.v2beta1.QueryParameters getQueryParams();

  /**
   *
   *
   * <pre>
   * The parameters of this query.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.QueryParameters query_params = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryParametersOrBuilder getQueryParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1. an audio config which instructs the speech recognizer how to process
   * the speech audio,
   *
   * 2. a conversational query in the form of text, or
   *
   * 3. an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the queryInput field is set.
   */
  boolean hasQueryInput();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1. an audio config which instructs the speech recognizer how to process
   * the speech audio,
   *
   * 2. a conversational query in the form of text, or
   *
   * 3. an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The queryInput.
   */
  com.google.cloud.dialogflow.v2beta1.QueryInput getQueryInput();

  /**
   *
   *
   * <pre>
   * Required. The input specification. It can be set to:
   *
   * 1. an audio config which instructs the speech recognizer how to process
   * the speech audio,
   *
   * 2. a conversational query in the form of text, or
   *
   * 3. an event that specifies which intent to trigger.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.QueryInput query_input = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.QueryInputOrBuilder getQueryInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   *
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   *
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfig getOutputAudioConfig();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate the output
   * audio. If this field is not set and agent-level speech synthesizer is not
   * configured, no output audio is generated.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.OutputAudioConfig output_audio_config = 4;</code>
   */
  com.google.cloud.dialogflow.v2beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   *
   * @return Whether the outputAudioConfigMask field is set.
   */
  boolean hasOutputAudioConfigMask();

  /**
   *
   *
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   *
   * @return The outputAudioConfigMask.
   */
  com.google.protobuf.FieldMask getOutputAudioConfigMask();

  /**
   *
   *
   * <pre>
   * Mask for
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * indicating which settings in this request-level config should override
   * speech synthesizer settings defined at agent-level.
   *
   * If unspecified or empty,
   * [output_audio_config][google.cloud.dialogflow.v2beta1.DetectIntentRequest.output_audio_config]
   * replaces the agent-level config in its entirety.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask output_audio_config_mask = 7;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getOutputAudioConfigMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The natural language speech audio to be processed. This field
   * should be populated iff `query_input` is set to an input audio config.
   * A single request can contain up to 1 minute of speech audio data.
   * </pre>
   *
   * <code>bytes input_audio = 5;</code>
   *
   * @return The inputAudio.
   */
  com.google.protobuf.ByteString getInputAudio();
}
