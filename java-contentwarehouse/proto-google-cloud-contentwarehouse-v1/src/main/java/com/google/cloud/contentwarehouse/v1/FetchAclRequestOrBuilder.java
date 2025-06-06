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
// source: google/cloud/contentwarehouse/v1/document_service_request.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface FetchAclRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.FetchAclRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The resource for which the policy is being requested.
   * Format for document:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * Format for collection:
   * projects/{project_number}/locations/{location}/collections/{collection_id}.
   * Format for project: projects/{project_number}.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The resource.
   */
  java.lang.String getResource();

  /**
   *
   *
   * <pre>
   * Required. REQUIRED: The resource for which the policy is being requested.
   * Format for document:
   * projects/{project_number}/locations/{location}/documents/{document_id}.
   * Format for collection:
   * projects/{project_number}/locations/{location}/collections/{collection_id}.
   * Format for project: projects/{project_number}.
   * </pre>
   *
   * <code>string resource = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString getResourceBytes();

  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return Whether the requestMetadata field is set.
   */
  boolean hasRequestMetadata();

  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   *
   * @return The requestMetadata.
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadata getRequestMetadata();

  /**
   *
   *
   * <pre>
   * The meta information collected about the end user, used to enforce access
   * control for the service.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.RequestMetadata request_metadata = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.RequestMetadataOrBuilder getRequestMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * For Get Project ACL only. Authorization check for end user will be ignored
   * when project_owner=true.
   * </pre>
   *
   * <code>bool project_owner = 3;</code>
   *
   * @return The projectOwner.
   */
  boolean getProjectOwner();
}
