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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.8
package com.google.cloudbuild.v1;

public interface GitRepoSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.GitRepoSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of the repo (e.g. https://github.com/user/repo.git).
   * Either `uri` or `repository` can be specified and is required.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();

  /**
   *
   *
   * <pre>
   * The URI of the repo (e.g. https://github.com/user/repo.git).
   * Either `uri` or `repository` can be specified and is required.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The connected repository resource name, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`. Either `uri` or
   * `repository` can be specified and is required.
   * </pre>
   *
   * <code>string repository = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();

  /**
   *
   *
   * <pre>
   * The connected repository resource name, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`. Either `uri` or
   * `repository` can be specified and is required.
   * </pre>
   *
   * <code>string repository = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The repository.
   */
  java.lang.String getRepository();

  /**
   *
   *
   * <pre>
   * The connected repository resource name, in the format
   * `projects/&#42;&#47;locations/&#42;&#47;connections/&#42;&#47;repositories/&#42;`. Either `uri` or
   * `repository` can be specified and is required.
   * </pre>
   *
   * <code>string repository = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString getRepositoryBytes();

  /**
   *
   *
   * <pre>
   * The branch or tag to use. Must start with "refs/" (required).
   * </pre>
   *
   * <code>string ref = 2;</code>
   *
   * @return The ref.
   */
  java.lang.String getRef();

  /**
   *
   *
   * <pre>
   * The branch or tag to use. Must start with "refs/" (required).
   * </pre>
   *
   * <code>string ref = 2;</code>
   *
   * @return The bytes for ref.
   */
  com.google.protobuf.ByteString getRefBytes();

  /**
   *
   *
   * <pre>
   * See RepoType below.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource.RepoType repo_type = 3;</code>
   *
   * @return The enum numeric value on the wire for repoType.
   */
  int getRepoTypeValue();

  /**
   *
   *
   * <pre>
   * See RepoType below.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.GitFileSource.RepoType repo_type = 3;</code>
   *
   * @return The repoType.
   */
  com.google.cloudbuild.v1.GitFileSource.RepoType getRepoType();

  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the githubEnterpriseConfig field is set.
   */
  boolean hasGithubEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The githubEnterpriseConfig.
   */
  java.lang.String getGithubEnterpriseConfig();

  /**
   *
   *
   * <pre>
   * The full resource name of the github enterprise config.
   * Format:
   * `projects/{project}/locations/{location}/githubEnterpriseConfigs/{id}`.
   * `projects/{project}/githubEnterpriseConfigs/{id}`.
   * </pre>
   *
   * <code>string github_enterprise_config = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for githubEnterpriseConfig.
   */
  com.google.protobuf.ByteString getGithubEnterpriseConfigBytes();

  com.google.cloudbuild.v1.GitRepoSource.SourceCase getSourceCase();

  com.google.cloudbuild.v1.GitRepoSource.EnterpriseConfigCase getEnterpriseConfigCase();
}
