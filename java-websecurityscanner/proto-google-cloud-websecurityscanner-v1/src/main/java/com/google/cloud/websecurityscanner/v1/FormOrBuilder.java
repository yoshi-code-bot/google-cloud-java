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
// source: google/cloud/websecurityscanner/v1/finding_addon.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.websecurityscanner.v1;

public interface FormOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.Form)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * ! The URI where to send the form when it's submitted.
   * </pre>
   *
   * <code>string action_uri = 1;</code>
   *
   * @return The actionUri.
   */
  java.lang.String getActionUri();

  /**
   *
   *
   * <pre>
   * ! The URI where to send the form when it's submitted.
   * </pre>
   *
   * <code>string action_uri = 1;</code>
   *
   * @return The bytes for actionUri.
   */
  com.google.protobuf.ByteString getActionUriBytes();

  /**
   *
   *
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   *
   * @return A list containing the fields.
   */
  java.util.List<java.lang.String> getFieldsList();

  /**
   *
   *
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   *
   * @return The count of fields.
   */
  int getFieldsCount();

  /**
   *
   *
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  java.lang.String getFields(int index);

  /**
   *
   *
   * <pre>
   * ! The names of form fields related to the vulnerability.
   * </pre>
   *
   * <code>repeated string fields = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the fields at the given index.
   */
  com.google.protobuf.ByteString getFieldsBytes(int index);
}
