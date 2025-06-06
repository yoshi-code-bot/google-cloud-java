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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.lineage.v1;

public interface LineageEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.LineageEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the lineage event.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * Can be specified or auto-assigned.
   * {lineage_event} must be not longer than 200 characters and only
   * contain characters in a set: `a-zA-Z0-9_-:.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the lineage event.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * Can be specified or auto-assigned.
   * {lineage_event} must be not longer than 200 characters and only
   * contain characters in a set: `a-zA-Z0-9_-:.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. List of source-target pairs. Can't contain more than 100 tuples.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.lineage.v1.EventLink links = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.datacatalog.lineage.v1.EventLink> getLinksList();

  /**
   *
   *
   * <pre>
   * Optional. List of source-target pairs. Can't contain more than 100 tuples.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.lineage.v1.EventLink links = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.EventLink getLinks(int index);

  /**
   *
   *
   * <pre>
   * Optional. List of source-target pairs. Can't contain more than 100 tuples.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.lineage.v1.EventLink links = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getLinksCount();

  /**
   *
   *
   * <pre>
   * Optional. List of source-target pairs. Can't contain more than 100 tuples.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.lineage.v1.EventLink links = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.EventLinkOrBuilder>
      getLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. List of source-target pairs. Can't contain more than 100 tuples.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datacatalog.lineage.v1.EventLink links = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.EventLinkOrBuilder getLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Required. The beginning of the transformation which resulted in this
   * lineage event. For streaming scenarios, it should be the beginning of the
   * period from which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Required. The beginning of the transformation which resulted in this
   * lineage event. For streaming scenarios, it should be the beginning of the
   * period from which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * Required. The beginning of the transformation which resulted in this
   * lineage event. For streaming scenarios, it should be the beginning of the
   * period from which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The end of the transformation which resulted in this lineage
   * event.  For streaming scenarios, it should be the end of the period from
   * which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Optional. The end of the transformation which resulted in this lineage
   * event.  For streaming scenarios, it should be the end of the period from
   * which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * Optional. The end of the transformation which resulted in this lineage
   * event.  For streaming scenarios, it should be the end of the period from
   * which the lineage is being reported.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
