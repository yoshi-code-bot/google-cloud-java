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

public interface HttpFaultDelayOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpFaultDelay)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   *
   * @return Whether the fixedDelay field is set.
   */
  boolean hasFixedDelay();

  /**
   *
   *
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   *
   * @return The fixedDelay.
   */
  com.google.cloud.compute.v1.Duration getFixedDelay();

  /**
   *
   *
   * <pre>
   * Specifies the value of the fixed delay interval.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Duration fixed_delay = 317037816;</code>
   */
  com.google.cloud.compute.v1.DurationOrBuilder getFixedDelayOrBuilder();

  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return Whether the percentage field is set.
   */
  boolean hasPercentage();

  /**
   *
   *
   * <pre>
   * The percentage of traffic for connections, operations, or requests for which a delay is introduced as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
   * </pre>
   *
   * <code>optional double percentage = 151909018;</code>
   *
   * @return The percentage.
   */
  double getPercentage();
}
