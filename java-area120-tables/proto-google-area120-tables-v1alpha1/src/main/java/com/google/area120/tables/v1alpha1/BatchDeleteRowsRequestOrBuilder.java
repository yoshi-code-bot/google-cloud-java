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
// source: google/area120/tables/v1alpha1/tables.proto

// Protobuf Java Version: 3.25.8
package com.google.area120.tables.v1alpha1;

public interface BatchDeleteRowsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.area120.tables.v1alpha1.BatchDeleteRowsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent table shared by all rows being deleted.
   * Format: tables/{table}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent table shared by all rows being deleted.
   * Format: tables/{table}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The names of the rows to delete. All rows must belong to the parent table
   * or else the entire batch will fail. A maximum of 500 rows can be deleted
   * in a batch.
   * Format: tables/{table}/rows/{row}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the names.
   */
  java.util.List<java.lang.String> getNamesList();

  /**
   *
   *
   * <pre>
   * Required. The names of the rows to delete. All rows must belong to the parent table
   * or else the entire batch will fail. A maximum of 500 rows can be deleted
   * in a batch.
   * Format: tables/{table}/rows/{row}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of names.
   */
  int getNamesCount();

  /**
   *
   *
   * <pre>
   * Required. The names of the rows to delete. All rows must belong to the parent table
   * or else the entire batch will fail. A maximum of 500 rows can be deleted
   * in a batch.
   * Format: tables/{table}/rows/{row}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  java.lang.String getNames(int index);

  /**
   *
   *
   * <pre>
   * Required. The names of the rows to delete. All rows must belong to the parent table
   * or else the entire batch will fail. A maximum of 500 rows can be deleted
   * in a batch.
   * Format: tables/{table}/rows/{row}
   * </pre>
   *
   * <code>
   * repeated string names = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  com.google.protobuf.ByteString getNamesBytes(int index);
}
