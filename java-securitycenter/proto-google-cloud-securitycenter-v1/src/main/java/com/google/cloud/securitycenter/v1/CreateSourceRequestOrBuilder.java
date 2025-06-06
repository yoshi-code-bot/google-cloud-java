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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v1;

public interface CreateSourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the new source's parent. Its format should be
   * `organizations/[organization_id]`.
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
   * Required. Resource name of the new source's parent. Its format should be
   * `organizations/[organization_id]`.
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
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();

  /**
   *
   *
   * <pre>
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  com.google.cloud.securitycenter.v1.Source getSource();

  /**
   *
   *
   * <pre>
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder();
}
