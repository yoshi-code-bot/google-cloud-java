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
// source: google/cloud/baremetalsolution/v2/network.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.baremetalsolution.v2;

public interface ListNetworkUsageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.ListNetworkUsageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.NetworkUsage> getNetworksList();

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkUsage getNetworks(int index);

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  int getNetworksCount();

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  java.util.List<? extends com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder>
      getNetworksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Networks with IPs.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.NetworkUsage networks = 1;</code>
   */
  com.google.cloud.baremetalsolution.v2.NetworkUsageOrBuilder getNetworksOrBuilder(int index);
}
