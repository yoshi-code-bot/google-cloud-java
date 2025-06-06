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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

public interface SkaffoldModulesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.SkaffoldModules)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the configs.
   */
  java.util.List<java.lang.String> getConfigsList();

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of configs.
   */
  int getConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The configs at the given index.
   */
  java.lang.String getConfigs(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Skaffold Config modules to use from the specified source.
   * </pre>
   *
   * <code>repeated string configs = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the configs at the given index.
   */
  com.google.protobuf.ByteString getConfigsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the git field is set.
   */
  boolean hasGit();

  /**
   *
   *
   * <pre>
   * Optional. Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The git.
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource getGit();

  /**
   *
   *
   * <pre>
   * Optional. Remote git repository containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSource git = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGitSourceOrBuilder getGitOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the googleCloudStorage field is set.
   */
  boolean hasGoogleCloudStorage();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The googleCloudStorage.
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource getGoogleCloudStorage();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage bucket containing the Skaffold Config modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSource google_cloud_storage = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCSSourceOrBuilder
      getGoogleCloudStorageOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Build V2 repository containing the Skaffold Config
   * modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCBRepoSource google_cloud_build_repo = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the googleCloudBuildRepo field is set.
   */
  boolean hasGoogleCloudBuildRepo();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Build V2 repository containing the Skaffold Config
   * modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCBRepoSource google_cloud_build_repo = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The googleCloudBuildRepo.
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCBRepoSource getGoogleCloudBuildRepo();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Build V2 repository containing the Skaffold Config
   * modules.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCBRepoSource google_cloud_build_repo = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.SkaffoldModules.SkaffoldGCBRepoSourceOrBuilder
      getGoogleCloudBuildRepoOrBuilder();

  com.google.cloud.deploy.v1.SkaffoldModules.SourceCase getSourceCase();
}
