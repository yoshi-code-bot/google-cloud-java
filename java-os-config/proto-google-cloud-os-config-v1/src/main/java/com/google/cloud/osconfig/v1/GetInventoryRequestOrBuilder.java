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
// source: google/cloud/osconfig/v1/inventory.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.osconfig.v1;

public interface GetInventoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1.GetInventoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. API resource name for inventory resource.
   *
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/inventory`
   *
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance}`, either Compute Engine  `instance-id` or `instance-name`
   * can be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. API resource name for inventory resource.
   *
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/inventory`
   *
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance}`, either Compute Engine  `instance-id` or `instance-name`
   * can be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();

  /**
   *
   *
   * <pre>
   * Inventory view indicating what information should be included in the
   * inventory resource. If unspecified, the default view is BASIC.
   * </pre>
   *
   * <code>.google.cloud.osconfig.v1.InventoryView view = 2;</code>
   *
   * @return The view.
   */
  com.google.cloud.osconfig.v1.InventoryView getView();
}
