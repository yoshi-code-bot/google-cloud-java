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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface RouterAdvertisedIpRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterAdvertisedIpRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * User-specified description for the IP range.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();

  /**
   *
   *
   * <pre>
   * User-specified description for the IP range.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * User-specified description for the IP range.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The IP range to advertise. The value must be a CIDR-formatted string.
   * </pre>
   *
   * <code>optional string range = 108280125;</code>
   *
   * @return Whether the range field is set.
   */
  boolean hasRange();

  /**
   *
   *
   * <pre>
   * The IP range to advertise. The value must be a CIDR-formatted string.
   * </pre>
   *
   * <code>optional string range = 108280125;</code>
   *
   * @return The range.
   */
  java.lang.String getRange();

  /**
   *
   *
   * <pre>
   * The IP range to advertise. The value must be a CIDR-formatted string.
   * </pre>
   *
   * <code>optional string range = 108280125;</code>
   *
   * @return The bytes for range.
   */
  com.google.protobuf.ByteString getRangeBytes();
}
