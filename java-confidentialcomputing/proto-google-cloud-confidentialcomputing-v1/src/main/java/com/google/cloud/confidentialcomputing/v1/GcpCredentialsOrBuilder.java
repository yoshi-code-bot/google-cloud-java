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
// source: google/cloud/confidentialcomputing/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.confidentialcomputing.v1;

public interface GcpCredentialsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1.GcpCredentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Same as id_tokens, but as a string.
   * </pre>
   *
   * <code>repeated string service_account_id_tokens = 2;</code>
   *
   * @return A list containing the serviceAccountIdTokens.
   */
  java.util.List<java.lang.String> getServiceAccountIdTokensList();

  /**
   *
   *
   * <pre>
   * Same as id_tokens, but as a string.
   * </pre>
   *
   * <code>repeated string service_account_id_tokens = 2;</code>
   *
   * @return The count of serviceAccountIdTokens.
   */
  int getServiceAccountIdTokensCount();

  /**
   *
   *
   * <pre>
   * Same as id_tokens, but as a string.
   * </pre>
   *
   * <code>repeated string service_account_id_tokens = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The serviceAccountIdTokens at the given index.
   */
  java.lang.String getServiceAccountIdTokens(int index);

  /**
   *
   *
   * <pre>
   * Same as id_tokens, but as a string.
   * </pre>
   *
   * <code>repeated string service_account_id_tokens = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the serviceAccountIdTokens at the given index.
   */
  com.google.protobuf.ByteString getServiceAccountIdTokensBytes(int index);
}
