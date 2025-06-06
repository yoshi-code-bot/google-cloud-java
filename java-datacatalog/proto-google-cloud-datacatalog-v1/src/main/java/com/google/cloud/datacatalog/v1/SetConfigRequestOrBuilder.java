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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datacatalog.v1;

public interface SetConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SetConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The organization or project whose config is being specified.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The organization or project whose config is being specified.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Opt-in status for the migration of Tag Templates to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplateMigration tag_template_migration = 2;</code>
   *
   * @return Whether the tagTemplateMigration field is set.
   */
  boolean hasTagTemplateMigration();

  /**
   *
   *
   * <pre>
   * Opt-in status for the migration of Tag Templates to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplateMigration tag_template_migration = 2;</code>
   *
   * @return The enum numeric value on the wire for tagTemplateMigration.
   */
  int getTagTemplateMigrationValue();

  /**
   *
   *
   * <pre>
   * Opt-in status for the migration of Tag Templates to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplateMigration tag_template_migration = 2;</code>
   *
   * @return The tagTemplateMigration.
   */
  com.google.cloud.datacatalog.v1.TagTemplateMigration getTagTemplateMigration();

  /**
   *
   *
   * <pre>
   * Opt-in status for the UI switch to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CatalogUIExperience catalog_ui_experience = 3;</code>
   *
   * @return Whether the catalogUiExperience field is set.
   */
  boolean hasCatalogUiExperience();

  /**
   *
   *
   * <pre>
   * Opt-in status for the UI switch to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CatalogUIExperience catalog_ui_experience = 3;</code>
   *
   * @return The enum numeric value on the wire for catalogUiExperience.
   */
  int getCatalogUiExperienceValue();

  /**
   *
   *
   * <pre>
   * Opt-in status for the UI switch to Dataplex.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CatalogUIExperience catalog_ui_experience = 3;</code>
   *
   * @return The catalogUiExperience.
   */
  com.google.cloud.datacatalog.v1.CatalogUIExperience getCatalogUiExperience();

  com.google.cloud.datacatalog.v1.SetConfigRequest.ConfigurationCase getConfigurationCase();
}
