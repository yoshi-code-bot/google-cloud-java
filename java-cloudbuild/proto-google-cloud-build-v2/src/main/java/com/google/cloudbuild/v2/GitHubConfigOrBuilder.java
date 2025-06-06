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
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.8
package com.google.cloudbuild.v2;

public interface GitHubConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.GitHubConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * OAuth credential of the account that authorized the Cloud Build GitHub App.
   * It is recommended to use a robot account instead of a human user account.
   * The OAuth token must be tied to the Cloud Build GitHub App.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.OAuthCredential authorizer_credential = 1;</code>
   *
   * @return Whether the authorizerCredential field is set.
   */
  boolean hasAuthorizerCredential();

  /**
   *
   *
   * <pre>
   * OAuth credential of the account that authorized the Cloud Build GitHub App.
   * It is recommended to use a robot account instead of a human user account.
   * The OAuth token must be tied to the Cloud Build GitHub App.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.OAuthCredential authorizer_credential = 1;</code>
   *
   * @return The authorizerCredential.
   */
  com.google.cloudbuild.v2.OAuthCredential getAuthorizerCredential();

  /**
   *
   *
   * <pre>
   * OAuth credential of the account that authorized the Cloud Build GitHub App.
   * It is recommended to use a robot account instead of a human user account.
   * The OAuth token must be tied to the Cloud Build GitHub App.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v2.OAuthCredential authorizer_credential = 1;</code>
   */
  com.google.cloudbuild.v2.OAuthCredentialOrBuilder getAuthorizerCredentialOrBuilder();

  /**
   *
   *
   * <pre>
   * GitHub App installation id.
   * </pre>
   *
   * <code>int64 app_installation_id = 2;</code>
   *
   * @return The appInstallationId.
   */
  long getAppInstallationId();
}
