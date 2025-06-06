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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgecontainer.v1;

public interface ServerConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.ServerConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Mapping from release channel to channel config.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.edgecontainer.v1.ChannelConfig&gt; channels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getChannelsCount();

  /**
   *
   *
   * <pre>
   * Output only. Mapping from release channel to channel config.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.edgecontainer.v1.ChannelConfig&gt; channels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsChannels(java.lang.String key);

  /** Use {@link #getChannelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ChannelConfig> getChannels();

  /**
   *
   *
   * <pre>
   * Output only. Mapping from release channel to channel config.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.edgecontainer.v1.ChannelConfig&gt; channels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ChannelConfig> getChannelsMap();

  /**
   *
   *
   * <pre>
   * Output only. Mapping from release channel to channel config.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.edgecontainer.v1.ChannelConfig&gt; channels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.edgecontainer.v1.ChannelConfig getChannelsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.edgecontainer.v1.ChannelConfig defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Mapping from release channel to channel config.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.edgecontainer.v1.ChannelConfig&gt; channels = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.ChannelConfig getChannelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Supported versions, e.g.: ["1.4.0", "1.5.0"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.Version versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.edgecontainer.v1.Version> getVersionsList();

  /**
   *
   *
   * <pre>
   * Output only. Supported versions, e.g.: ["1.4.0", "1.5.0"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.Version versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.Version getVersions(int index);

  /**
   *
   *
   * <pre>
   * Output only. Supported versions, e.g.: ["1.4.0", "1.5.0"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.Version versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getVersionsCount();

  /**
   *
   *
   * <pre>
   * Output only. Supported versions, e.g.: ["1.4.0", "1.5.0"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.Version versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.edgecontainer.v1.VersionOrBuilder>
      getVersionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Supported versions, e.g.: ["1.4.0", "1.5.0"].
   * </pre>
   *
   * <code>
   * repeated .google.cloud.edgecontainer.v1.Version versions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.edgecontainer.v1.VersionOrBuilder getVersionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Default version, e.g.: "1.4.0".
   * </pre>
   *
   * <code>string default_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The defaultVersion.
   */
  java.lang.String getDefaultVersion();

  /**
   *
   *
   * <pre>
   * Output only. Default version, e.g.: "1.4.0".
   * </pre>
   *
   * <code>string default_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for defaultVersion.
   */
  com.google.protobuf.ByteString getDefaultVersionBytes();
}
