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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1;

public interface AdvancedDatapathObservabilityConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AdvancedDatapathObservabilityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Expose flow metrics on nodes
   * </pre>
   *
   * <code>bool enable_metrics = 1;</code>
   *
   * @return The enableMetrics.
   */
  boolean getEnableMetrics();

  /**
   *
   *
   * <pre>
   * Method used to make Relay available
   * </pre>
   *
   * <code>.google.container.v1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;</code>
   *
   * @return The enum numeric value on the wire for relayMode.
   */
  int getRelayModeValue();

  /**
   *
   *
   * <pre>
   * Method used to make Relay available
   * </pre>
   *
   * <code>.google.container.v1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;</code>
   *
   * @return The relayMode.
   */
  com.google.container.v1.AdvancedDatapathObservabilityConfig.RelayMode getRelayMode();

  /**
   *
   *
   * <pre>
   * Enable Relay component
   * </pre>
   *
   * <code>optional bool enable_relay = 3;</code>
   *
   * @return Whether the enableRelay field is set.
   */
  boolean hasEnableRelay();

  /**
   *
   *
   * <pre>
   * Enable Relay component
   * </pre>
   *
   * <code>optional bool enable_relay = 3;</code>
   *
   * @return The enableRelay.
   */
  boolean getEnableRelay();
}
