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
// source: google/cloud/bigquery/migration/v2alpha/translation_task.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.migration.v2alpha;

public interface TranslationTaskDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Teradata SQL specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.TeradataOptions teradata_options = 10;</code>
   *
   * @return Whether the teradataOptions field is set.
   */
  boolean hasTeradataOptions();

  /**
   *
   *
   * <pre>
   * The Teradata SQL specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.TeradataOptions teradata_options = 10;</code>
   *
   * @return The teradataOptions.
   */
  com.google.cloud.bigquery.migration.v2alpha.TeradataOptions getTeradataOptions();

  /**
   *
   *
   * <pre>
   * The Teradata SQL specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.TeradataOptions teradata_options = 10;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.TeradataOptionsOrBuilder
      getTeradataOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The BTEQ specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.BteqOptions bteq_options = 11;</code>
   *
   * @return Whether the bteqOptions field is set.
   */
  boolean hasBteqOptions();

  /**
   *
   *
   * <pre>
   * The BTEQ specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.BteqOptions bteq_options = 11;</code>
   *
   * @return The bteqOptions.
   */
  com.google.cloud.bigquery.migration.v2alpha.BteqOptions getBteqOptions();

  /**
   *
   *
   * <pre>
   * The BTEQ specific settings for the translation task.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.BteqOptions bteq_options = 11;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.BteqOptionsOrBuilder getBteqOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path for translation input files.
   * </pre>
   *
   * <code>string input_path = 1;</code>
   *
   * @return The inputPath.
   */
  java.lang.String getInputPath();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path for translation input files.
   * </pre>
   *
   * <code>string input_path = 1;</code>
   *
   * @return The bytes for inputPath.
   */
  com.google.protobuf.ByteString getInputPathBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path for translation output files.
   * </pre>
   *
   * <code>string output_path = 2;</code>
   *
   * @return The outputPath.
   */
  java.lang.String getOutputPath();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path for translation output files.
   * </pre>
   *
   * <code>string output_path = 2;</code>
   *
   * @return The bytes for outputPath.
   */
  com.google.protobuf.ByteString getOutputPathBytes();

  /**
   *
   *
   * <pre>
   * Cloud Storage files to be processed for translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.TranslationFileMapping file_paths = 12;
   * </code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2alpha.TranslationFileMapping>
      getFilePathsList();

  /**
   *
   *
   * <pre>
   * Cloud Storage files to be processed for translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.TranslationFileMapping file_paths = 12;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.TranslationFileMapping getFilePaths(int index);

  /**
   *
   *
   * <pre>
   * Cloud Storage files to be processed for translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.TranslationFileMapping file_paths = 12;
   * </code>
   */
  int getFilePathsCount();

  /**
   *
   *
   * <pre>
   * Cloud Storage files to be processed for translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.TranslationFileMapping file_paths = 12;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.bigquery.migration.v2alpha.TranslationFileMappingOrBuilder>
      getFilePathsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Cloud Storage files to be processed for translation.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2alpha.TranslationFileMapping file_paths = 12;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.TranslationFileMappingOrBuilder getFilePathsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The Cloud Storage path to DDL files as table schema to assist semantic
   * translation.
   * </pre>
   *
   * <code>string schema_path = 3;</code>
   *
   * @return The schemaPath.
   */
  java.lang.String getSchemaPath();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path to DDL files as table schema to assist semantic
   * translation.
   * </pre>
   *
   * <code>string schema_path = 3;</code>
   *
   * @return The bytes for schemaPath.
   */
  com.google.protobuf.ByteString getSchemaPathBytes();

  /**
   *
   *
   * <pre>
   * The file encoding type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.FileEncoding file_encoding = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for fileEncoding.
   */
  int getFileEncodingValue();

  /**
   *
   *
   * <pre>
   * The file encoding type.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.FileEncoding file_encoding = 4;
   * </code>
   *
   * @return The fileEncoding.
   */
  com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.FileEncoding getFileEncoding();

  /**
   *
   *
   * <pre>
   * The settings for SQL identifiers.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.IdentifierSettings identifier_settings = 5;
   * </code>
   *
   * @return Whether the identifierSettings field is set.
   */
  boolean hasIdentifierSettings();

  /**
   *
   *
   * <pre>
   * The settings for SQL identifiers.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.IdentifierSettings identifier_settings = 5;
   * </code>
   *
   * @return The identifierSettings.
   */
  com.google.cloud.bigquery.migration.v2alpha.IdentifierSettings getIdentifierSettings();

  /**
   *
   *
   * <pre>
   * The settings for SQL identifiers.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.IdentifierSettings identifier_settings = 5;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.IdentifierSettingsOrBuilder
      getIdentifierSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  int getSpecialTokenMapCount();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  boolean containsSpecialTokenMap(java.lang.String key);

  /** Use {@link #getSpecialTokenMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType>
      getSpecialTokenMap();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType>
      getSpecialTokenMapMap();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  /* nullable */
  com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType
      getSpecialTokenMapOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType
              defaultValue);

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType
      getSpecialTokenMapOrThrow(java.lang.String key);

  /** Use {@link #getSpecialTokenMapValueMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getSpecialTokenMapValue();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getSpecialTokenMapValueMap();

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  int getSpecialTokenMapValueOrDefault(java.lang.String key, int defaultValue);

  /**
   *
   *
   * <pre>
   * The map capturing special tokens to be replaced during translation. The key
   * is special token in string. The value is the token data type. This is used
   * to translate SQL query template which contains special token as place
   * holder. The special token makes a query invalid to parse. This map will be
   * applied to annotate those special token with types to let parser understand
   * how to parse them into proper structure with type information.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.TokenType&gt; special_token_map = 6;
   * </code>
   */
  int getSpecialTokenMapValueOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The filter applied to translation details.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.Filter filter = 7;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();

  /**
   *
   *
   * <pre>
   * The filter applied to translation details.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.Filter filter = 7;</code>
   *
   * @return The filter.
   */
  com.google.cloud.bigquery.migration.v2alpha.Filter getFilter();

  /**
   *
   *
   * <pre>
   * The filter applied to translation details.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.Filter filter = 7;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.FilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the exact name of the bigquery table ("dataset.table") to be used
   * for surfacing raw translation errors. If the table does not exist, we will
   * create it. If it already exists and the schema is the same, we will re-use.
   * If the table exists and the schema is different, we will throw an error.
   * </pre>
   *
   * <code>string translation_exception_table = 13;</code>
   *
   * @return The translationExceptionTable.
   */
  java.lang.String getTranslationExceptionTable();

  /**
   *
   *
   * <pre>
   * Specifies the exact name of the bigquery table ("dataset.table") to be used
   * for surfacing raw translation errors. If the table does not exist, we will
   * create it. If it already exists and the schema is the same, we will re-use.
   * If the table exists and the schema is different, we will throw an error.
   * </pre>
   *
   * <code>string translation_exception_table = 13;</code>
   *
   * @return The bytes for translationExceptionTable.
   */
  com.google.protobuf.ByteString getTranslationExceptionTableBytes();

  com.google.cloud.bigquery.migration.v2alpha.TranslationTaskDetails.LanguageOptionsCase
      getLanguageOptionsCase();
}
