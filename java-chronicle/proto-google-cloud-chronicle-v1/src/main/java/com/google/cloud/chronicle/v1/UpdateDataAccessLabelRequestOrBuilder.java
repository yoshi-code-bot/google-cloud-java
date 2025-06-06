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
// source: google/cloud/chronicle/v1/data_access_control.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.chronicle.v1;

public interface UpdateDataAccessLabelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataAccessLabel field is set.
   */
  boolean hasDataAccessLabel();

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataAccessLabel.
   */
  com.google.cloud.chronicle.v1.DataAccessLabel getDataAccessLabel();

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder getDataAccessLabelOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
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
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
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
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
