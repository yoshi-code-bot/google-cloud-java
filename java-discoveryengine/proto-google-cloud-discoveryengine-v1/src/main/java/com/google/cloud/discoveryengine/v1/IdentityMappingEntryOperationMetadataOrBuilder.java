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
// source: google/cloud/discoveryengine/v1/identity_mapping_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface IdentityMappingEntryOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.IdentityMappingEntryOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of IdentityMappingEntries that were successfully processed.
   * </pre>
   *
   * <code>int64 success_count = 1;</code>
   *
   * @return The successCount.
   */
  long getSuccessCount();

  /**
   *
   *
   * <pre>
   * The number of IdentityMappingEntries that failed to be processed.
   * </pre>
   *
   * <code>int64 failure_count = 2;</code>
   *
   * @return The failureCount.
   */
  long getFailureCount();

  /**
   *
   *
   * <pre>
   * The total number of IdentityMappingEntries that were processed.
   * </pre>
   *
   * <code>int64 total_count = 3;</code>
   *
   * @return The totalCount.
   */
  long getTotalCount();
}
