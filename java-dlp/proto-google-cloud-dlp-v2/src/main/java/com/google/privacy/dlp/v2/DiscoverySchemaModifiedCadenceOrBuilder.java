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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface DiscoverySchemaModifiedCadenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return A list containing the types.
   */
  java.util.List<com.google.privacy.dlp.v2.BigQuerySchemaModification> getTypesList();

  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return The count of types.
   */
  int getTypesCount();

  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The types at the given index.
   */
  com.google.privacy.dlp.v2.BigQuerySchemaModification getTypes(int index);

  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for types.
   */
  java.util.List<java.lang.Integer> getTypesValueList();

  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of types at the given index.
   */
  int getTypesValue(int index);

  /**
   *
   *
   * <pre>
   * How frequently profiles may be updated when schemas are
   * modified. Defaults to monthly.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
   *
   * @return The enum numeric value on the wire for frequency.
   */
  int getFrequencyValue();

  /**
   *
   *
   * <pre>
   * How frequently profiles may be updated when schemas are
   * modified. Defaults to monthly.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
   *
   * @return The frequency.
   */
  com.google.privacy.dlp.v2.DataProfileUpdateFrequency getFrequency();
}
