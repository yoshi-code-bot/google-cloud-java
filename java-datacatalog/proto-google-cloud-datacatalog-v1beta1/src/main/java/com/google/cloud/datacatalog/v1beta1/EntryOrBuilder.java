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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1beta1;

public interface EntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. The Data Catalog resource name of the entry in URL
   * format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   *
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Identifier. The Data Catalog resource name of the entry in URL
   * format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   *
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The resource this metadata entry refers to.
   *
   * For Google Cloud Platform resources, `linked_resource` is the [full name of
   * the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   *
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *
   * Output only when Entry is of type in the EntryType enum. For entries with
   * user_specified_type, this field is optional and defaults to an empty
   * string.
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   *
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();

  /**
   *
   *
   * <pre>
   * The resource this metadata entry refers to.
   *
   * For Google Cloud Platform resources, `linked_resource` is the [full name of
   * the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   *
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   *
   * Output only when Entry is of type in the EntryType enum. For entries with
   * user_specified_type, this field is optional and defaults to an empty
   * string.
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   *
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * The type of the entry.
   * Only used for Entries with types in the EntryType enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();

  /**
   *
   *
   * <pre>
   * The type of the entry.
   * Only used for Entries with types in the EntryType enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * The type of the entry.
   * Only used for Entries with types in the EntryType enum.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.datacatalog.v1beta1.EntryType getType();

  /**
   *
   *
   * <pre>
   * Entry type if it does not fit any of the input-allowed values listed in
   * `EntryType` enum above. When creating an entry, users should check the
   * enum values first, if nothing matches the entry to be created, then
   * provide a custom value, for example "my_special_type".
   * `user_specified_type` strings must begin with a letter or underscore and
   * can only contain letters, numbers, and underscores; are case insensitive;
   * must be at least 1 character and at most 64 characters long.
   *
   * Currently, only FILESET enum value is allowed. All other entries created
   * through Data Catalog must use `user_specified_type`.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   *
   * @return Whether the userSpecifiedType field is set.
   */
  boolean hasUserSpecifiedType();

  /**
   *
   *
   * <pre>
   * Entry type if it does not fit any of the input-allowed values listed in
   * `EntryType` enum above. When creating an entry, users should check the
   * enum values first, if nothing matches the entry to be created, then
   * provide a custom value, for example "my_special_type".
   * `user_specified_type` strings must begin with a letter or underscore and
   * can only contain letters, numbers, and underscores; are case insensitive;
   * must be at least 1 character and at most 64 characters long.
   *
   * Currently, only FILESET enum value is allowed. All other entries created
   * through Data Catalog must use `user_specified_type`.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   *
   * @return The userSpecifiedType.
   */
  java.lang.String getUserSpecifiedType();

  /**
   *
   *
   * <pre>
   * Entry type if it does not fit any of the input-allowed values listed in
   * `EntryType` enum above. When creating an entry, users should check the
   * enum values first, if nothing matches the entry to be created, then
   * provide a custom value, for example "my_special_type".
   * `user_specified_type` strings must begin with a letter or underscore and
   * can only contain letters, numbers, and underscores; are case insensitive;
   * must be at least 1 character and at most 64 characters long.
   *
   * Currently, only FILESET enum value is allowed. All other entries created
   * through Data Catalog must use `user_specified_type`.
   * </pre>
   *
   * <code>string user_specified_type = 16;</code>
   *
   * @return The bytes for userSpecifiedType.
   */
  com.google.protobuf.ByteString getUserSpecifiedTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. This field indicates the entry's source system that Data
   * Catalog integrates with, such as BigQuery or Pub/Sub.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the integratedSystem field is set.
   */
  boolean hasIntegratedSystem();

  /**
   *
   *
   * <pre>
   * Output only. This field indicates the entry's source system that Data
   * Catalog integrates with, such as BigQuery or Pub/Sub.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for integratedSystem.
   */
  int getIntegratedSystemValue();

  /**
   *
   *
   * <pre>
   * Output only. This field indicates the entry's source system that Data
   * Catalog integrates with, such as BigQuery or Pub/Sub.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.IntegratedSystem integrated_system = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The integratedSystem.
   */
  com.google.cloud.datacatalog.v1beta1.IntegratedSystem getIntegratedSystem();

  /**
   *
   *
   * <pre>
   * This field indicates the entry's source system that Data Catalog does not
   * integrate with. `user_specified_system` strings must begin with a letter
   * or underscore and can only contain letters, numbers, and underscores; are
   * case insensitive; must be at least 1 character and at most 64 characters
   * long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   *
   * @return Whether the userSpecifiedSystem field is set.
   */
  boolean hasUserSpecifiedSystem();

  /**
   *
   *
   * <pre>
   * This field indicates the entry's source system that Data Catalog does not
   * integrate with. `user_specified_system` strings must begin with a letter
   * or underscore and can only contain letters, numbers, and underscores; are
   * case insensitive; must be at least 1 character and at most 64 characters
   * long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   *
   * @return The userSpecifiedSystem.
   */
  java.lang.String getUserSpecifiedSystem();

  /**
   *
   *
   * <pre>
   * This field indicates the entry's source system that Data Catalog does not
   * integrate with. `user_specified_system` strings must begin with a letter
   * or underscore and can only contain letters, numbers, and underscores; are
   * case insensitive; must be at least 1 character and at most 64 characters
   * long.
   * </pre>
   *
   * <code>string user_specified_system = 18;</code>
   *
   * @return The bytes for userSpecifiedSystem.
   */
  com.google.protobuf.ByteString getUserSpecifiedSystemBytes();

  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   *
   * @return Whether the gcsFilesetSpec field is set.
   */
  boolean hasGcsFilesetSpec();

  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   *
   * @return The gcsFilesetSpec.
   */
  com.google.cloud.datacatalog.v1beta1.GcsFilesetSpec getGcsFilesetSpec();

  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   */
  com.google.cloud.datacatalog.v1beta1.GcsFilesetSpecOrBuilder getGcsFilesetSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   *
   * @return Whether the bigqueryTableSpec field is set.
   */
  boolean hasBigqueryTableSpec();

  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   *
   * @return The bigqueryTableSpec.
   */
  com.google.cloud.datacatalog.v1beta1.BigQueryTableSpec getBigqueryTableSpec();

  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.v1beta1.BigQueryTableSpecOrBuilder getBigqueryTableSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   *
   * @return Whether the bigqueryDateShardedSpec field is set.
   */
  boolean hasBigqueryDateShardedSpec();

  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   *
   * @return The bigqueryDateShardedSpec.
   */
  com.google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec getBigqueryDateShardedSpec();

  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpecOrBuilder
      getBigqueryDateShardedSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information such as title and description. A short name to identify
   * the entry, for example, "Analytics Data - Jan 2011". Default value is an
   * empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Display information such as title and description. A short name to identify
   * the entry, for example, "Analytics Data - Jan 2011". Default value is an
   * empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents. Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents. Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   *
   * @return Whether the schema field is set.
   */
  boolean hasSchema();

  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   *
   * @return The schema.
   */
  com.google.cloud.datacatalog.v1beta1.Schema getSchema();

  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.v1beta1.SchemaOrBuilder getSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying resource, not about this Data
   * Catalog entry. Output only when Entry is of type in the EntryType enum. For
   * entries with user_specified_type, this field is optional and defaults to an
   * empty timestamp.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the sourceSystemTimestamps field is set.
   */
  boolean hasSourceSystemTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying resource, not about this Data
   * Catalog entry. Output only when Entry is of type in the EntryType enum. For
   * entries with user_specified_type, this field is optional and defaults to an
   * empty timestamp.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The sourceSystemTimestamps.
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestamps getSourceSystemTimestamps();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying resource, not about this Data
   * Catalog entry. Output only when Entry is of type in the EntryType enum. For
   * entries with user_specified_type, this field is optional and defaults to an
   * empty timestamp.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.SystemTimestampsOrBuilder
      getSourceSystemTimestampsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Statistics on the usage level of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the usageSignal field is set.
   */
  boolean hasUsageSignal();

  /**
   *
   *
   * <pre>
   * Output only. Statistics on the usage level of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The usageSignal.
   */
  com.google.cloud.datacatalog.v1beta1.UsageSignal getUsageSignal();

  /**
   *
   *
   * <pre>
   * Output only. Statistics on the usage level of the resource.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.UsageSignal usage_signal = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.v1beta1.UsageSignalOrBuilder getUsageSignalOrBuilder();

  com.google.cloud.datacatalog.v1beta1.Entry.EntryTypeCase getEntryTypeCase();

  com.google.cloud.datacatalog.v1beta1.Entry.SystemCase getSystemCase();

  com.google.cloud.datacatalog.v1beta1.Entry.TypeSpecCase getTypeSpecCase();
}
