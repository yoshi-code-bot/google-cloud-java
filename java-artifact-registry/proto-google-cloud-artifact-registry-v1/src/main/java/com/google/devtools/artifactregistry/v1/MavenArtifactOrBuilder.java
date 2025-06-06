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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface MavenArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.MavenArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and maven_artifact
   * forms a unique artifact For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/mavenArtifacts/
   * com.google.guava:guava:31.0-jre",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * "com.google.guava:guava:31.0-jre"
   * is the maven artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. registry_location, project_id, repository_name and maven_artifact
   * forms a unique artifact For example,
   * "projects/test-project/locations/us-west4/repositories/test-repo/mavenArtifacts/
   * com.google.guava:guava:31.0-jre",
   * where "us-west4" is the registry_location, "test-project" is the
   * project_id, "test-repo" is the repository_name and
   * "com.google.guava:guava:31.0-jre"
   * is the maven artifact.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. URL to access the pom file of the artifact.
   * Example:
   * us-west4-maven.pkg.dev/test-project/test-repo/com/google/guava/guava/31.0/guava-31.0.pom
   * </pre>
   *
   * <code>string pom_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pomUri.
   */
  java.lang.String getPomUri();

  /**
   *
   *
   * <pre>
   * Required. URL to access the pom file of the artifact.
   * Example:
   * us-west4-maven.pkg.dev/test-project/test-repo/com/google/guava/guava/31.0/guava-31.0.pom
   * </pre>
   *
   * <code>string pom_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for pomUri.
   */
  com.google.protobuf.ByteString getPomUriBytes();

  /**
   *
   *
   * <pre>
   * Group ID for the artifact.
   * Example:
   * com.google.guava
   * </pre>
   *
   * <code>string group_id = 3;</code>
   *
   * @return The groupId.
   */
  java.lang.String getGroupId();

  /**
   *
   *
   * <pre>
   * Group ID for the artifact.
   * Example:
   * com.google.guava
   * </pre>
   *
   * <code>string group_id = 3;</code>
   *
   * @return The bytes for groupId.
   */
  com.google.protobuf.ByteString getGroupIdBytes();

  /**
   *
   *
   * <pre>
   * Artifact ID for the artifact.
   * </pre>
   *
   * <code>string artifact_id = 4;</code>
   *
   * @return The artifactId.
   */
  java.lang.String getArtifactId();

  /**
   *
   *
   * <pre>
   * Artifact ID for the artifact.
   * </pre>
   *
   * <code>string artifact_id = 4;</code>
   *
   * @return The bytes for artifactId.
   */
  com.google.protobuf.ByteString getArtifactIdBytes();

  /**
   *
   *
   * <pre>
   * Version of this artifact.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Version of this artifact.
   * </pre>
   *
   * <code>string version = 5;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Time the artifact was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
