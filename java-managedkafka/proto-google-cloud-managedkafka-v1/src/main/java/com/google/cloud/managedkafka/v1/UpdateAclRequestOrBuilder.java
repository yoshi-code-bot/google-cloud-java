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
// source: google/cloud/managedkafka/v1/managed_kafka.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.managedkafka.v1;

public interface UpdateAclRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedkafka.v1.UpdateAclRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The updated acl. Its `name` and `etag` fields must be populated.
   * `acl_entries` must not be empty in the updated acl; to remove all acl
   * entries for an acl, use DeleteAcl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the acl field is set.
   */
  boolean hasAcl();

  /**
   *
   *
   * <pre>
   * Required. The updated acl. Its `name` and `etag` fields must be populated.
   * `acl_entries` must not be empty in the updated acl; to remove all acl
   * entries for an acl, use DeleteAcl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The acl.
   */
  com.google.cloud.managedkafka.v1.Acl getAcl();

  /**
   *
   *
   * <pre>
   * Required. The updated acl. Its `name` and `etag` fields must be populated.
   * `acl_entries` must not be empty in the updated acl; to remove all acl
   * entries for an acl, use DeleteAcl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedkafka.v1.AclOrBuilder getAclOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Acl resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Acl resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * Acl resource by the update. The fields specified in the update_mask are
   * relative to the resource, not the full request. A field will be overwritten
   * if it is in the mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
