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
// source: google/cloud/discoveryengine/v1beta/conversation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

public interface TextInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.TextInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Text input.
   * </pre>
   *
   * <code>string input = 1;</code>
   *
   * @return The input.
   */
  java.lang.String getInput();

  /**
   *
   *
   * <pre>
   * Text input.
   * </pre>
   *
   * <code>string input = 1;</code>
   *
   * @return The bytes for input.
   */
  com.google.protobuf.ByteString getInputBytes();

  /**
   *
   *
   * <pre>
   * Conversation context of the input.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ConversationContext context = 2;</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();

  /**
   *
   *
   * <pre>
   * Conversation context of the input.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ConversationContext context = 2;</code>
   *
   * @return The context.
   */
  com.google.cloud.discoveryengine.v1beta.ConversationContext getContext();

  /**
   *
   *
   * <pre>
   * Conversation context of the input.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ConversationContext context = 2;</code>
   */
  com.google.cloud.discoveryengine.v1beta.ConversationContextOrBuilder getContextOrBuilder();
}
