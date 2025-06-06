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
// source: google/cloud/certificatemanager/v1/trust_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.certificatemanager.v1;

public interface TrustConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.certificatemanager.v1.TrustConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-defined name of the trust config. TrustConfig names must be
   * unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;trustConfigs/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * A user-defined name of the trust config. TrustConfig names must be
   * unique globally and match pattern
   * `projects/&#42;&#47;locations/&#42;&#47;trustConfigs/&#42;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a TrustConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a TrustConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a TrustConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a TrustConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Set of labels associated with a TrustConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Set of labels associated with a TrustConfig.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of a TrustConfig.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of a TrustConfig.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * This checksum is computed by the server based on the value of other
   * fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 6;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Set of trust stores to perform validation against.
   *
   * This field is supported when TrustConfig is configured with Load Balancers,
   * currently not supported for SPIFFE certificate validation.
   *
   * Only one TrustStore specified is currently allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.certificatemanager.v1.TrustConfig.TrustStore trust_stores = 8;
   * </code>
   */
  java.util.List<com.google.cloud.certificatemanager.v1.TrustConfig.TrustStore>
      getTrustStoresList();

  /**
   *
   *
   * <pre>
   * Set of trust stores to perform validation against.
   *
   * This field is supported when TrustConfig is configured with Load Balancers,
   * currently not supported for SPIFFE certificate validation.
   *
   * Only one TrustStore specified is currently allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.certificatemanager.v1.TrustConfig.TrustStore trust_stores = 8;
   * </code>
   */
  com.google.cloud.certificatemanager.v1.TrustConfig.TrustStore getTrustStores(int index);

  /**
   *
   *
   * <pre>
   * Set of trust stores to perform validation against.
   *
   * This field is supported when TrustConfig is configured with Load Balancers,
   * currently not supported for SPIFFE certificate validation.
   *
   * Only one TrustStore specified is currently allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.certificatemanager.v1.TrustConfig.TrustStore trust_stores = 8;
   * </code>
   */
  int getTrustStoresCount();

  /**
   *
   *
   * <pre>
   * Set of trust stores to perform validation against.
   *
   * This field is supported when TrustConfig is configured with Load Balancers,
   * currently not supported for SPIFFE certificate validation.
   *
   * Only one TrustStore specified is currently allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.certificatemanager.v1.TrustConfig.TrustStore trust_stores = 8;
   * </code>
   */
  java.util.List<? extends com.google.cloud.certificatemanager.v1.TrustConfig.TrustStoreOrBuilder>
      getTrustStoresOrBuilderList();

  /**
   *
   *
   * <pre>
   * Set of trust stores to perform validation against.
   *
   * This field is supported when TrustConfig is configured with Load Balancers,
   * currently not supported for SPIFFE certificate validation.
   *
   * Only one TrustStore specified is currently allowed.
   * </pre>
   *
   * <code>repeated .google.cloud.certificatemanager.v1.TrustConfig.TrustStore trust_stores = 8;
   * </code>
   */
  com.google.cloud.certificatemanager.v1.TrustConfig.TrustStoreOrBuilder getTrustStoresOrBuilder(
      int index);
}
