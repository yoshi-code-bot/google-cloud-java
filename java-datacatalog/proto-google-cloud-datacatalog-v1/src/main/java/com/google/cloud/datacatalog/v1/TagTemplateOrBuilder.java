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
// source: google/cloud/datacatalog/v1/tags.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

public interface TagTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.TagTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the tag template in URL format.
   *
   * Note: The tag template itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the tag template in URL format.
   *
   * Note: The tag template itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Display name for this template. Defaults to an empty string.
   *
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum length is 200 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Display name for this template. Defaults to an empty string.
   *
   * The name must contain only Unicode letters, numbers (0-9), underscores (_),
   * dashes (-), spaces ( ), and can't start or end with spaces.
   * The maximum length is 200 characters.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether tags created with this template are public. Public tags
   * do not require tag template access to appear in
   * [ListTags][google.cloud.datacatalog.v1.DataCatalog.ListTags] API response.
   *
   * Additionally, you can search for a public tag by value with a
   * simple search query in addition to using a ``tag:`` predicate.
   * </pre>
   *
   * <code>bool is_publicly_readable = 5;</code>
   *
   * @return The isPubliclyReadable.
   */
  boolean getIsPubliclyReadable();

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. The map must contain
   * at least one field and at most 500 fields.
   *
   * The keys to this map are tag template field IDs. The IDs have the
   * following limitations:
   *
   * * Can contain uppercase and lowercase letters, numbers (0-9) and
   *   underscores (_).
   * * Must be at least 1 character and at most 64 characters long.
   * * Must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getFieldsCount();

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. The map must contain
   * at least one field and at most 500 fields.
   *
   * The keys to this map are tag template field IDs. The IDs have the
   * following limitations:
   *
   * * Can contain uppercase and lowercase letters, numbers (0-9) and
   *   underscores (_).
   * * Must be at least 1 character and at most 64 characters long.
   * * Must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsFields(java.lang.String key);

  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.TagTemplateField> getFields();

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. The map must contain
   * at least one field and at most 500 fields.
   *
   * The keys to this map are tag template field IDs. The IDs have the
   * following limitations:
   *
   * * Can contain uppercase and lowercase letters, numbers (0-9) and
   *   underscores (_).
   * * Must be at least 1 character and at most 64 characters long.
   * * Must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.TagTemplateField> getFieldsMap();

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. The map must contain
   * at least one field and at most 500 fields.
   *
   * The keys to this map are tag template field IDs. The IDs have the
   * following limitations:
   *
   * * Can contain uppercase and lowercase letters, numbers (0-9) and
   *   underscores (_).
   * * Must be at least 1 character and at most 64 characters long.
   * * Must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  com.google.cloud.datacatalog.v1.TagTemplateField getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.datacatalog.v1.TagTemplateField defaultValue);

  /**
   *
   *
   * <pre>
   * Required. Map of tag template field IDs to the settings for the field.
   * This map is an exhaustive list of the allowed fields. The map must contain
   * at least one field and at most 500 fields.
   *
   * The keys to this map are tag template field IDs. The IDs have the
   * following limitations:
   *
   * * Can contain uppercase and lowercase letters, numbers (0-9) and
   *   underscores (_).
   * * Must be at least 1 character and at most 64 characters long.
   * * Must start with a letter or underscore.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.TagTemplateField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datacatalog.v1.TagTemplateField getFieldsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Transfer status of the TagTemplate
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TagTemplate.DataplexTransferStatus dataplex_transfer_status = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for dataplexTransferStatus.
   */
  int getDataplexTransferStatusValue();

  /**
   *
   *
   * <pre>
   * Optional. Transfer status of the TagTemplate
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TagTemplate.DataplexTransferStatus dataplex_transfer_status = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataplexTransferStatus.
   */
  com.google.cloud.datacatalog.v1.TagTemplate.DataplexTransferStatus getDataplexTransferStatus();
}
