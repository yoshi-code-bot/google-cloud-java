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
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.telcoautomation.v1alpha1;

public interface BlueprintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.Blueprint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the blueprint. If unspecified, the name will be autogenerated
   * from server side. Name of the blueprint must not contain `&#64;` character.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the blueprint. If unspecified, the name will be autogenerated
   * from server side. Name of the blueprint must not contain `&#64;` character.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the blueprint.
   * A new revision is committed whenever a blueprint is approved.
   * </pre>
   *
   * <code>
   * string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The revision ID of the blueprint.
   * A new revision is committed whenever a blueprint is approved.
   * </pre>
   *
   * <code>
   * string revision_id = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The public blueprint ID from which this blueprint was
   * created.
   * </pre>
   *
   * <code>
   * string source_blueprint = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The sourceBlueprint.
   */
  java.lang.String getSourceBlueprint();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The public blueprint ID from which this blueprint was
   * created.
   * </pre>
   *
   * <code>
   * string source_blueprint = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for sourceBlueprint.
   */
  com.google.protobuf.ByteString getSourceBlueprintBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the revisionCreateTime field is set.
   */
  boolean hasRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The revisionCreateTime.
   */
  com.google.protobuf.Timestamp getRevisionCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp revision_create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getRevisionCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Approval state of the blueprint (DRAFT, PROPOSED, APPROVED)
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Blueprint.ApprovalState approval_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for approvalState.
   */
  int getApprovalStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Approval state of the blueprint (DRAFT, PROPOSED, APPROVED)
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Blueprint.ApprovalState approval_state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The approvalState.
   */
  com.google.cloud.telcoautomation.v1alpha1.Blueprint.ApprovalState getApprovalState();

  /**
   *
   *
   * <pre>
   * Optional. Human readable name of a Blueprint.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. Human readable name of a Blueprint.
   * </pre>
   *
   * <code>string display_name = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Name of the repository where the blueprint files are stored.
   * </pre>
   *
   * <code>string repository = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The repository.
   */
  java.lang.String getRepository();

  /**
   *
   *
   * <pre>
   * Output only. Name of the repository where the blueprint files are stored.
   * </pre>
   *
   * <code>string repository = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for repository.
   */
  com.google.protobuf.ByteString getRepositoryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Files present in a blueprint.
   * When invoking UpdateBlueprint API, only the modified files should be
   * included in this. Files that are not included in the update of a blueprint
   * will not be changed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.File files = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.telcoautomation.v1alpha1.File> getFilesList();

  /**
   *
   *
   * <pre>
   * Optional. Files present in a blueprint.
   * When invoking UpdateBlueprint API, only the modified files should be
   * included in this. Files that are not included in the update of a blueprint
   * will not be changed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.File files = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.File getFiles(int index);

  /**
   *
   *
   * <pre>
   * Optional. Files present in a blueprint.
   * When invoking UpdateBlueprint API, only the modified files should be
   * included in this. Files that are not included in the update of a blueprint
   * will not be changed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.File files = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getFilesCount();

  /**
   *
   *
   * <pre>
   * Optional. Files present in a blueprint.
   * When invoking UpdateBlueprint API, only the modified files should be
   * included in this. Files that are not included in the update of a blueprint
   * will not be changed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.File files = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.telcoautomation.v1alpha1.FileOrBuilder>
      getFilesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Files present in a blueprint.
   * When invoking UpdateBlueprint API, only the modified files should be
   * included in this. Files that are not included in the update of a blueprint
   * will not be changed.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.telcoautomation.v1alpha1.File files = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.FileOrBuilder getFilesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a blueprint
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a blueprint
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a blueprint
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a blueprint
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Labels are key-value attributes that can be set on a blueprint
   * resource by the user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Blueprint creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Blueprint creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Blueprint creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the blueprint was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the blueprint was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the blueprint was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Source provider is the author of a public blueprint, from
   * which this blueprint is created.
   * </pre>
   *
   * <code>string source_provider = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The sourceProvider.
   */
  java.lang.String getSourceProvider();

  /**
   *
   *
   * <pre>
   * Output only. Source provider is the author of a public blueprint, from
   * which this blueprint is created.
   * </pre>
   *
   * <code>string source_provider = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for sourceProvider.
   */
  com.google.protobuf.ByteString getSourceProviderBytes();

  /**
   *
   *
   * <pre>
   * Output only. DeploymentLevel of a blueprint signifies where the blueprint
   * will be applied. e.g. [HYDRATION, SINGLE_DEPLOYMENT, MULTI_DEPLOYMENT]
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.DeploymentLevel deployment_level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for deploymentLevel.
   */
  int getDeploymentLevelValue();

  /**
   *
   *
   * <pre>
   * Output only. DeploymentLevel of a blueprint signifies where the blueprint
   * will be applied. e.g. [HYDRATION, SINGLE_DEPLOYMENT, MULTI_DEPLOYMENT]
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.DeploymentLevel deployment_level = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deploymentLevel.
   */
  com.google.cloud.telcoautomation.v1alpha1.DeploymentLevel getDeploymentLevel();

  /**
   *
   *
   * <pre>
   * Output only. Indicates if the deployment created from this blueprint can be
   * rolled back.
   * </pre>
   *
   * <code>bool rollback_support = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The rollbackSupport.
   */
  boolean getRollbackSupport();
}
