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
// source: google/cloud/confidentialcomputing/v1alpha1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.confidentialcomputing.v1alpha1;

public interface GcpCredentialsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.confidentialcomputing.v1alpha1.GcpCredentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @return A list containing the idTokens.
   */
  java.util.List<com.google.protobuf.ByteString> getIdTokensList();

  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @return The count of idTokens.
   */
  int getIdTokensCount();

  /**
   *
   *
   * <pre>
   * A list of service account OpenID Connect ID tokens identifying which
   * service account identities should be included in the claims_token. These
   * can be generated by calling `serviceAccounts.generateIdToken`. The
   * Challenge.name must be used as the `audience` parameter, and the
   * `includeEmail` parameter must be `true`.
   * --
   * </pre>
   *
   * <code>repeated bytes id_tokens = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The idTokens at the given index.
   */
  com.google.protobuf.ByteString getIdTokens(int index);
}
