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
// source: google/cloud/run/v2/task_template.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.run.v2;

public interface TaskTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.TaskTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 1;</code>
   */
  java.util.List<com.google.cloud.run.v2.Container> getContainersList();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 1;</code>
   */
  com.google.cloud.run.v2.Container getContainers(int index);

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 1;</code>
   */
  int getContainersCount();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 1;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ContainerOrBuilder> getContainersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * task.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 1;</code>
   */
  com.google.cloud.run.v2.ContainerOrBuilder getContainersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.run.v2.Volume> getVolumesList();

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.Volume getVolumes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getVolumesCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.run.v2.VolumeOrBuilder> getVolumesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.run.v2.Volume volumes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Number of retries allowed per Task, before marking this Task failed.
   * Defaults to 3.
   * </pre>
   *
   * <code>int32 max_retries = 3;</code>
   *
   * @return Whether the maxRetries field is set.
   */
  boolean hasMaxRetries();

  /**
   *
   *
   * <pre>
   * Number of retries allowed per Task, before marking this Task failed.
   * Defaults to 3.
   * </pre>
   *
   * <code>int32 max_retries = 3;</code>
   *
   * @return The maxRetries.
   */
  int getMaxRetries();

  /**
   *
   *
   * <pre>
   * Optional. Max allowed time duration the Task may be active before the
   * system will actively try to mark it failed and kill associated containers.
   * This applies per attempt of a task, meaning each retry can run for the full
   * timeout. Defaults to 600 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Max allowed time duration the Task may be active before the
   * system will actively try to mark it failed and kill associated containers.
   * This applies per attempt of a task, meaning each retry can run for the full
   * timeout. Defaults to 600 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();

  /**
   *
   *
   * <pre>
   * Optional. Max allowed time duration the Task may be active before the
   * system will actively try to mark it failed and kill associated containers.
   * This applies per attempt of a task, meaning each retry can run for the full
   * timeout. Defaults to 600 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Email address of the IAM service account associated with the Task
   * of a Job. The service account represents the identity of the running task,
   * and determines what permissions the task has. If not provided, the task
   * will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * Optional. Email address of the IAM service account associated with the Task
   * of a Job. The service account represents the identity of the running task,
   * and determines what permissions the task has. If not provided, the task
   * will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. The execution environment being used to host this Task.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionEnvironment execution_environment = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for executionEnvironment.
   */
  int getExecutionEnvironmentValue();

  /**
   *
   *
   * <pre>
   * Optional. The execution environment being used to host this Task.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.ExecutionEnvironment execution_environment = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The executionEnvironment.
   */
  com.google.cloud.run.v2.ExecutionEnvironment getExecutionEnvironment();

  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();

  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString getEncryptionKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the vpcAccess field is set.
   */
  boolean hasVpcAccess();

  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The vpcAccess.
   */
  com.google.cloud.run.v2.VpcAccess getVpcAccess();

  /**
   *
   *
   * <pre>
   * Optional. VPC Access configuration to use for this Task. For more
   * information, visit
   * https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.VpcAccessOrBuilder getVpcAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The node selector for the task template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the nodeSelector field is set.
   */
  boolean hasNodeSelector();

  /**
   *
   *
   * <pre>
   * Optional. The node selector for the task template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The nodeSelector.
   */
  com.google.cloud.run.v2.NodeSelector getNodeSelector();

  /**
   *
   *
   * <pre>
   * Optional. The node selector for the task template.
   * </pre>
   *
   * <code>
   * .google.cloud.run.v2.NodeSelector node_selector = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.run.v2.NodeSelectorOrBuilder getNodeSelectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. True if GPU zonal redundancy is disabled on this task template.
   * </pre>
   *
   * <code>
   * optional bool gpu_zonal_redundancy_disabled = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gpuZonalRedundancyDisabled field is set.
   */
  boolean hasGpuZonalRedundancyDisabled();

  /**
   *
   *
   * <pre>
   * Optional. True if GPU zonal redundancy is disabled on this task template.
   * </pre>
   *
   * <code>
   * optional bool gpu_zonal_redundancy_disabled = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gpuZonalRedundancyDisabled.
   */
  boolean getGpuZonalRedundancyDisabled();

  com.google.cloud.run.v2.TaskTemplate.RetriesCase getRetriesCase();
}
