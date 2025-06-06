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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contactcenterinsights.v1;

public interface CreateIssueModelMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.CreateIssueModelMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Output only. The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The original request for creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.CreateIssueModelRequest request = 3;</code>
   *
   * @return Whether the request field is set.
   */
  boolean hasRequest();

  /**
   *
   *
   * <pre>
   * The original request for creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.CreateIssueModelRequest request = 3;</code>
   *
   * @return The request.
   */
  com.google.cloud.contactcenterinsights.v1.CreateIssueModelRequest getRequest();

  /**
   *
   *
   * <pre>
   * The original request for creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.CreateIssueModelRequest request = 3;</code>
   */
  com.google.cloud.contactcenterinsights.v1.CreateIssueModelRequestOrBuilder getRequestOrBuilder();
}
