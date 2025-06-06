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
// source: google/cloud/baremetalsolution/v2/nfs_share.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.baremetalsolution.v2;

public interface CreateNfsShareRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.CreateNfsShareRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent project and location.
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
   * Required. The parent project and location.
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
   * Required. The NfsShare to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the nfsShare field is set.
   */
  boolean hasNfsShare();

  /**
   *
   *
   * <pre>
   * Required. The NfsShare to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The nfsShare.
   */
  com.google.cloud.baremetalsolution.v2.NfsShare getNfsShare();

  /**
   *
   *
   * <pre>
   * Required. The NfsShare to create.
   * </pre>
   *
   * <code>
   * .google.cloud.baremetalsolution.v2.NfsShare nfs_share = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.NfsShareOrBuilder getNfsShareOrBuilder();
}
