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
// source: google/cloud/metastore/v1/metastore.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.metastore.v1;

public interface MetadataManagementActivityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.MetadataManagementActivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.metastore.v1.MetadataExport> getMetadataExportsList();

  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1.MetadataExport getMetadataExports(int index);

  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getMetadataExportsCount();

  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.metastore.v1.MetadataExportOrBuilder>
      getMetadataExportsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1.MetadataExportOrBuilder getMetadataExportsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The latest restores of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.Restore restores = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.metastore.v1.Restore> getRestoresList();

  /**
   *
   *
   * <pre>
   * Output only. The latest restores of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.Restore restores = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1.Restore getRestores(int index);

  /**
   *
   *
   * <pre>
   * Output only. The latest restores of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.Restore restores = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRestoresCount();

  /**
   *
   *
   * <pre>
   * Output only. The latest restores of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.Restore restores = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.metastore.v1.RestoreOrBuilder>
      getRestoresOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The latest restores of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.Restore restores = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.metastore.v1.RestoreOrBuilder getRestoresOrBuilder(int index);
}
