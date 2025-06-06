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
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.datatransfer.v1;

public interface UserInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.UserInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * E-mail address of the user.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   *
   * @return Whether the email field is set.
   */
  boolean hasEmail();

  /**
   *
   *
   * <pre>
   * E-mail address of the user.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();

  /**
   *
   *
   * <pre>
   * E-mail address of the user.
   * </pre>
   *
   * <code>optional string email = 1;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();
}
