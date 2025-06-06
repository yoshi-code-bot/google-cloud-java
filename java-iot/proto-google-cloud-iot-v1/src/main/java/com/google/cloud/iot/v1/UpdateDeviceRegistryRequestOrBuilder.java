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
// source: google/cloud/iot/v1/device_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iot.v1;

public interface UpdateDeviceRegistryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deviceRegistry field is set.
   */
  boolean hasDeviceRegistry();

  /**
   *
   *
   * <pre>
   * Required. The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deviceRegistry.
   */
  com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry();

  /**
   *
   *
   * <pre>
   * Required. The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
