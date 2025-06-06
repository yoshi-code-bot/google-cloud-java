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
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

public interface GenerativeInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.GenerativeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The stack of [playbooks][google.cloud.dialogflow.cx.v3beta1.Playbook] that
   * the conversation has currently entered, with the most recent one on the
   * top.
   * </pre>
   *
   * <code>repeated string current_playbooks = 1;</code>
   *
   * @return A list containing the currentPlaybooks.
   */
  java.util.List<java.lang.String> getCurrentPlaybooksList();

  /**
   *
   *
   * <pre>
   * The stack of [playbooks][google.cloud.dialogflow.cx.v3beta1.Playbook] that
   * the conversation has currently entered, with the most recent one on the
   * top.
   * </pre>
   *
   * <code>repeated string current_playbooks = 1;</code>
   *
   * @return The count of currentPlaybooks.
   */
  int getCurrentPlaybooksCount();

  /**
   *
   *
   * <pre>
   * The stack of [playbooks][google.cloud.dialogflow.cx.v3beta1.Playbook] that
   * the conversation has currently entered, with the most recent one on the
   * top.
   * </pre>
   *
   * <code>repeated string current_playbooks = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The currentPlaybooks at the given index.
   */
  java.lang.String getCurrentPlaybooks(int index);

  /**
   *
   *
   * <pre>
   * The stack of [playbooks][google.cloud.dialogflow.cx.v3beta1.Playbook] that
   * the conversation has currently entered, with the most recent one on the
   * top.
   * </pre>
   *
   * <code>repeated string current_playbooks = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the currentPlaybooks at the given index.
   */
  com.google.protobuf.ByteString getCurrentPlaybooksBytes(int index);

  /**
   *
   *
   * <pre>
   * The actions performed by the generative playbook for the current agent
   * response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Example action_tracing_info = 2;</code>
   *
   * @return Whether the actionTracingInfo field is set.
   */
  boolean hasActionTracingInfo();

  /**
   *
   *
   * <pre>
   * The actions performed by the generative playbook for the current agent
   * response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Example action_tracing_info = 2;</code>
   *
   * @return The actionTracingInfo.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Example getActionTracingInfo();

  /**
   *
   *
   * <pre>
   * The actions performed by the generative playbook for the current agent
   * response.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Example action_tracing_info = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ExampleOrBuilder getActionTracingInfoOrBuilder();
}
