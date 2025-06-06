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
// source: google/cloud/dialogflow/cx/v3beta1/page.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

public interface TransitionRouteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.TransitionRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this transition route.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this transition route.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the transition route. The maximum length is
   * 500 characters.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Optional. The description of the transition route. The maximum length is
   * 500 characters.
   * </pre>
   *
   * <code>string description = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The unique identifier of an
   * [Intent][google.cloud.dialogflow.cx.v3beta1.Intent]. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/intents/&lt;IntentID&gt;`.
   * Indicates that the transition can only happen when the given intent is
   * matched.
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string intent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The intent.
   */
  java.lang.String getIntent();

  /**
   *
   *
   * <pre>
   * The unique identifier of an
   * [Intent][google.cloud.dialogflow.cx.v3beta1.Intent]. Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/intents/&lt;IntentID&gt;`.
   * Indicates that the transition can only happen when the given intent is
   * matched.
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string intent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for intent.
   */
  com.google.protobuf.ByteString getIntentBytes();

  /**
   *
   *
   * <pre>
   * The condition to evaluate against [form
   * parameters][google.cloud.dialogflow.cx.v3beta1.Form.parameters] or [session
   * parameters][google.cloud.dialogflow.cx.v3beta1.SessionInfo.parameters].
   *
   * See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string condition = 2;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();

  /**
   *
   *
   * <pre>
   * The condition to evaluate against [form
   * parameters][google.cloud.dialogflow.cx.v3beta1.Form.parameters] or [session
   * parameters][google.cloud.dialogflow.cx.v3beta1.SessionInfo.parameters].
   *
   * See the [conditions
   * reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
   * At least one of `intent` or `condition` must be specified. When both
   * `intent` and `condition` are specified, the transition can only happen
   * when both are fulfilled.
   * </pre>
   *
   * <code>string condition = 2;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   *
   * @return Whether the triggerFulfillment field is set.
   */
  boolean hasTriggerFulfillment();

  /**
   *
   *
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   *
   * @return The triggerFulfillment.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Fulfillment getTriggerFulfillment();

  /**
   *
   *
   * <pre>
   * The fulfillment to call when the condition is satisfied. At least one of
   * `trigger_fulfillment` and `target` must be specified. When both are
   * defined, `trigger_fulfillment` is executed first.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Fulfillment trigger_fulfillment = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.FulfillmentOrBuilder getTriggerFulfillmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetPage field is set.
   */
  boolean hasTargetPage();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetPage.
   */
  java.lang.String getTargetPage();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;/pages/&lt;PageID&gt;`.
   * </pre>
   *
   * <code>string target_page = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetPage.
   */
  com.google.protobuf.ByteString getTargetPageBytes();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetFlow field is set.
   */
  boolean hasTargetFlow();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetFlow.
   */
  java.lang.String getTargetFlow();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetFlow.
   */
  com.google.protobuf.ByteString getTargetFlowBytes();

  com.google.cloud.dialogflow.cx.v3beta1.TransitionRoute.TargetCase getTargetCase();
}
