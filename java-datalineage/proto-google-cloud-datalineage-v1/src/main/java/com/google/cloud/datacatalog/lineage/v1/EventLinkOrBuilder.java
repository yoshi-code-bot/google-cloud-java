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

public interface EventLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.EventLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();

  /**
   *
   *
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getSource();

  /**
   *
   *
   * <pre>
   * Required. Reference to the source entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the target field is set.
   */
  boolean hasTarget();

  /**
   *
   *
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The target.
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReference getTarget();

  /**
   *
   *
   * <pre>
   * Required. Reference to the target entity
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.lineage.v1.EntityReference target = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.lineage.v1.EntityReferenceOrBuilder getTargetOrBuilder();
}
