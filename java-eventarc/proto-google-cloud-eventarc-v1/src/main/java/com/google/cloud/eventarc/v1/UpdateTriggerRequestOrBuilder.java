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
// source: google/cloud/eventarc/v1/eventarc.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.eventarc.v1;

public interface UpdateTriggerRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.UpdateTriggerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The trigger to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 1;</code>
   *
   * @return Whether the trigger field is set.
   */
  boolean hasTrigger();

  /**
   *
   *
   * <pre>
   * The trigger to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 1;</code>
   *
   * @return The trigger.
   */
  com.google.cloud.eventarc.v1.Trigger getTrigger();

  /**
   *
   *
   * <pre>
   * The trigger to be updated.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Trigger trigger = 1;</code>
   */
  com.google.cloud.eventarc.v1.TriggerOrBuilder getTriggerOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * The fields to be updated; only fields explicitly provided are updated.
   * If no field mask is provided, all provided fields in the request are
   * updated. To update all fields, provide a field mask of "*".
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the trigger is not found, a new trigger will be
   * created. In this situation, `update_mask` is ignored.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();

  /**
   *
   *
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * post it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
