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
// source: google/cloud/aiplatform/v1/deployment_resource_pool.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface DeploymentResourcePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeploymentResourcePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the DeploymentResourcePool.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the DeploymentResourcePool.
   * Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool
   * uses.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dedicatedResources field is set.
   */
  boolean hasDedicatedResources();

  /**
   *
   *
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool
   * uses.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dedicatedResources.
   */
  com.google.cloud.aiplatform.v1.DedicatedResources getDedicatedResources();

  /**
   *
   *
   * <pre>
   * Required. The underlying DedicatedResources that the DeploymentResourcePool
   * uses.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DedicatedResources dedicated_resources = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.DedicatedResourcesOrBuilder getDedicatedResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DeploymentResourcePool. If set,
   * this DeploymentResourcePool will be secured by this key. Endpoints and the
   * DeploymentResourcePool they deploy in need to have the same EncryptionSpec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DeploymentResourcePool. If set,
   * this DeploymentResourcePool will be secured by this key. Endpoints and the
   * DeploymentResourcePool they deploy in need to have the same EncryptionSpec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for a DeploymentResourcePool. If set,
   * this DeploymentResourcePool will be secured by this key. Endpoints and the
   * DeploymentResourcePool they deploy in need to have the same EncryptionSpec.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 5;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * The service account that the DeploymentResourcePool's container(s) run as.
   * Specify the email address of the service account. If this service account
   * is not specified, the container(s) run as a service account that doesn't
   * have access to the resource project.
   *
   * Users deploying the Models to this DeploymentResourcePool must have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   * </pre>
   *
   * <code>string service_account = 6;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * The service account that the DeploymentResourcePool's container(s) run as.
   * Specify the email address of the service account. If this service account
   * is not specified, the container(s) run as a service account that doesn't
   * have access to the resource project.
   *
   * Users deploying the Models to this DeploymentResourcePool must have the
   * `iam.serviceAccounts.actAs` permission on this service account.
   * </pre>
   *
   * <code>string service_account = 6;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * If the DeploymentResourcePool is deployed with custom-trained Models or
   * AutoML Tabular Models, the container(s) of the DeploymentResourcePool will
   * send `stderr` and `stdout` streams to Cloud Logging by default.
   * Please note that the logs incur cost, which are subject to [Cloud Logging
   * pricing](https://cloud.google.com/logging/pricing).
   *
   * User can disable container logging by setting this flag to true.
   * </pre>
   *
   * <code>bool disable_container_logging = 7;</code>
   *
   * @return The disableContainerLogging.
   */
  boolean getDisableContainerLogging();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzs = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzi = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();
}
