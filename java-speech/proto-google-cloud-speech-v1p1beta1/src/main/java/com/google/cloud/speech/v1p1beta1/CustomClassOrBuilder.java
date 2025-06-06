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
// source: google/cloud/speech/v1p1beta1/resource.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.speech.v1p1beta1;

public interface CustomClassOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.CustomClass)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the custom class.
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
   * The resource name of the custom class.
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
   * If this custom class is a resource, the custom_class_id is the resource id
   * of the CustomClass. Case sensitive.
   * </pre>
   *
   * <code>string custom_class_id = 2;</code>
   *
   * @return The customClassId.
   */
  java.lang.String getCustomClassId();

  /**
   *
   *
   * <pre>
   * If this custom class is a resource, the custom_class_id is the resource id
   * of the CustomClass. Case sensitive.
   * </pre>
   *
   * <code>string custom_class_id = 2;</code>
   *
   * @return The bytes for customClassId.
   */
  com.google.protobuf.ByteString getCustomClassIdBytes();

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.CustomClass.ClassItem items = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.CustomClass.ClassItem> getItemsList();

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.CustomClass.ClassItem items = 3;</code>
   */
  com.google.cloud.speech.v1p1beta1.CustomClass.ClassItem getItems(int index);

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.CustomClass.ClassItem items = 3;</code>
   */
  int getItemsCount();

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.CustomClass.ClassItem items = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder>
      getItemsOrBuilderList();

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.CustomClass.ClassItem items = 3;</code>
   */
  com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder getItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with which
   * the content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>
   * string kms_key_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();

  /**
   *
   *
   * <pre>
   * Output only. The [KMS key
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#keys) with which
   * the content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}`.
   * </pre>
   *
   * <code>
   * string kms_key_name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The [KMS key version
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#key_versions)
   * with which content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}`.
   * </pre>
   *
   * <code>
   * string kms_key_version_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The kmsKeyVersionName.
   */
  java.lang.String getKmsKeyVersionName();

  /**
   *
   *
   * <pre>
   * Output only. The [KMS key version
   * name](https://cloud.google.com/kms/docs/resource-hierarchy#key_versions)
   * with which content of the ClassItem is encrypted. The expected format is
   * `projects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVersions/{crypto_key_version}`.
   * </pre>
   *
   * <code>
   * string kms_key_version_name = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for kmsKeyVersionName.
   */
  com.google.protobuf.ByteString getKmsKeyVersionNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System-assigned unique identifier for the CustomClass.
   * This field is not used.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. System-assigned unique identifier for the CustomClass.
   * This field is not used.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. User-settable, human-readable name for the CustomClass. Must
   * be 63 characters or less. This field is not used.
   * </pre>
   *
   * <code>string display_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Output only. User-settable, human-readable name for the CustomClass. Must
   * be 63 characters or less. This field is not used.
   * </pre>
   *
   * <code>string display_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The CustomClass lifecycle state.
   * This field is not used.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.CustomClass.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The CustomClass lifecycle state.
   * This field is not used.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v1p1beta1.CustomClass.State state = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.speech.v1p1beta1.CustomClass.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource was requested for deletion.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource will be purged.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource will be purged.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this resource will be purged.
   * This field is not used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * This field is not used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Output only. Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * This field is not used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Output only. Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * This field is not used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Output only. Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * This field is not used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. Allows users to store small amounts of arbitrary data.
   * Both the key and the value must be 63 characters or less each.
   * At most 100 annotations.
   * This field is not used.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields. This may be sent on update, undelete, and delete requests to
   * ensure the client has an up-to-date value before proceeding. This field is
   * not used.
   * </pre>
   *
   * <code>string etag = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Output only. This checksum is computed by the server based on the value of
   * other fields. This may be sent on update, undelete, and delete requests to
   * ensure the client has an up-to-date value before proceeding. This field is
   * not used.
   * </pre>
   *
   * <code>string etag = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether or not this CustomClass is in the process of being
   * updated. This field is not used.
   * </pre>
   *
   * <code>bool reconciling = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();
}
