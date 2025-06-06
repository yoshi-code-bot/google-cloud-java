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

public interface CreateLineageEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.CreateLineageEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the run that should own the lineage event.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The name of the run that should own the lineage event.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The lineage event to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the lineageEvent field is set.
   */
  boolean hasLineageEvent();

  /**
   *
   *
   * <pre>
   * Required. The lineage event to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The lineageEvent.
   */
  com.google.cloud.datacatalog.lineage.v1.LineageEvent getLineageEvent();

  /**
   *
   *
   * <pre>
   * Required. The lineage event to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.LineageEvent lineage_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.LineageEventOrBuilder getLineageEventOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters.
   * A random UUID is recommended. This request is idempotent only if a
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
