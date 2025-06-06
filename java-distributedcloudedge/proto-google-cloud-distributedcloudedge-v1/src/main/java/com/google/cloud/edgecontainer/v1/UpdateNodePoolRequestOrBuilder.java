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
// source: google/cloud/edgecontainer/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgecontainer.v1;

public interface UpdateNodePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.UpdateNodePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * NodePool resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * NodePool resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * NodePool resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * The updated node pool.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.NodePool node_pool = 2;</code>
   *
   * @return Whether the nodePool field is set.
   */
  boolean hasNodePool();

  /**
   *
   *
   * <pre>
   * The updated node pool.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.NodePool node_pool = 2;</code>
   *
   * @return The nodePool.
   */
  com.google.cloud.edgecontainer.v1.NodePool getNodePool();

  /**
   *
   *
   * <pre>
   * The updated node pool.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.NodePool node_pool = 2;</code>
   */
  com.google.cloud.edgecontainer.v1.NodePoolOrBuilder getNodePoolOrBuilder();

  /**
   *
   *
   * <pre>
   * A unique identifier for this request. Restricted to 36 ASCII characters. A
   * random UUID is recommended. This request is only idempotent if
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
   * A unique identifier for this request. Restricted to 36 ASCII characters. A
   * random UUID is recommended. This request is only idempotent if
   * `request_id` is provided.
   * </pre>
   *
   * <code>string request_id = 3;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
