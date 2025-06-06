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
// source: google/cloud/domains/v1beta1/domains.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.domains.v1beta1;

public interface UpdateRegistrationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.UpdateRegistrationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 1;</code>
   *
   * @return Whether the registration field is set.
   */
  boolean hasRegistration();

  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 1;</code>
   *
   * @return The registration.
   */
  com.google.cloud.domains.v1beta1.Registration getRegistration();

  /**
   *
   *
   * <pre>
   * Fields of the `Registration` to update.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.Registration registration = 1;</code>
   */
  com.google.cloud.domains.v1beta1.RegistrationOrBuilder getRegistrationOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
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
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
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
   * Required. The field mask describing which fields to update as a comma-separated list.
   * For example, if only the labels are being updated, the `update_mask` is
   * `"labels"`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
