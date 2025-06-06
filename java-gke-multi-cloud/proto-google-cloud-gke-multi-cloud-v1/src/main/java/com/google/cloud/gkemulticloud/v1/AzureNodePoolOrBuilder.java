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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AzureNodePoolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureNodePool)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of this resource.
   *
   * Node pool names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;/azureNodePools/&lt;node-pool-id&gt;`.
   *
   * For more details on Google Cloud resource names,
   * see [Resource Names](https://cloud.google.com/apis/design/resource_names)
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
   * The name of this resource.
   *
   * Node pool names are formatted as
   * `projects/&lt;project-number&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;/azureNodePools/&lt;node-pool-id&gt;`.
   *
   * For more details on Google Cloud resource names,
   * see [Resource Names](https://cloud.google.com/apis/design/resource_names)
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
   * Required. The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this
   * node pool.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();

  /**
   *
   *
   * <pre>
   * Required. The Kubernetes version (e.g. `1.19.10-gke.1000`) running on this
   * node pool.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. The node configuration of the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeConfig config = 22 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();

  /**
   *
   *
   * <pre>
   * Required. The node configuration of the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeConfig config = 22 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The config.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodeConfig getConfig();

  /**
   *
   *
   * <pre>
   * Required. The node configuration of the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeConfig config = 22 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodeConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the subnet where the node pool VMs run. Make sure
   * it's a subnet under the virtual network in the cluster configuration.
   * </pre>
   *
   * <code>string subnet_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The subnetId.
   */
  java.lang.String getSubnetId();

  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the subnet where the node pool VMs run. Make sure
   * it's a subnet under the virtual network in the cluster configuration.
   * </pre>
   *
   * <code>string subnet_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for subnetId.
   */
  com.google.protobuf.ByteString getSubnetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Autoscaler configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling autoscaling = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the autoscaling field is set.
   */
  boolean hasAutoscaling();

  /**
   *
   *
   * <pre>
   * Required. Autoscaler configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling autoscaling = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The autoscaling.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling getAutoscaling();

  /**
   *
   *
   * <pre>
   * Required. Autoscaler configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePoolAutoscaling autoscaling = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolAutoscalingOrBuilder getAutoscalingOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePool.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The current state of the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodePool.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePool.State getState();

  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier for the node pool.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();

  /**
   *
   *
   * <pre>
   * Output only. A globally unique identifier for the node pool.
   * </pre>
   *
   * <code>string uid = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. If set, there are currently pending changes to the node
   * pool.
   * </pre>
   *
   * <code>bool reconciling = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reconciling.
   */
  boolean getReconciling();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this node pool was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Allows clients to perform consistent read-modify-writes
   * through optimistic concurrency control.
   *
   * Can be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Allows clients to perform consistent read-modify-writes
   * through optimistic concurrency control.
   *
   * Can be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 12;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the node pool.
   *
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Keys can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the node pool.
   *
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Keys can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the node pool.
   *
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Keys can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the node pool.
   *
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Keys can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. Annotations on the node pool.
   *
   * This field has the same restrictions as Kubernetes annotations.
   * The total size of all keys and values combined is limited to 256k.
   * Keys can have 2 segments: prefix (optional) and name (required),
   * separated by a slash (/).
   * Prefix must be a DNS subdomain.
   * Name must be 63 characters or less, begin and end with alphanumerics,
   * with dashes (-), underscores (_), dots (.), and alphanumerics between.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MaxPodsConstraint max_pods_constraint = 21 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the maxPodsConstraint field is set.
   */
  boolean hasMaxPodsConstraint();

  /**
   *
   *
   * <pre>
   * Required. The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MaxPodsConstraint max_pods_constraint = 21 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The maxPodsConstraint.
   */
  com.google.cloud.gkemulticloud.v1.MaxPodsConstraint getMaxPodsConstraint();

  /**
   *
   *
   * <pre>
   * Required. The constraint on the maximum number of pods that can be run
   * simultaneously on a node in the node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.MaxPodsConstraint max_pods_constraint = 21 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.MaxPodsConstraintOrBuilder getMaxPodsConstraintOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Azure availability zone of the nodes in this nodepool.
   *
   * When unspecified, it defaults to `1`.
   * </pre>
   *
   * <code>string azure_availability_zone = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The azureAvailabilityZone.
   */
  java.lang.String getAzureAvailabilityZone();

  /**
   *
   *
   * <pre>
   * Optional. The Azure availability zone of the nodes in this nodepool.
   *
   * When unspecified, it defaults to `1`.
   * </pre>
   *
   * <code>string azure_availability_zone = 23 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for azureAvailabilityZone.
   */
  com.google.protobuf.ByteString getAzureAvailabilityZoneBytes();

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the node pool.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureNodePoolError errors = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AzureNodePoolError> getErrorsList();

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the node pool.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureNodePoolError errors = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolError getErrors(int index);

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the node pool.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureNodePoolError errors = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the node pool.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureNodePoolError errors = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureNodePoolErrorOrBuilder>
      getErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. A set of errors found in the node pool.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureNodePoolError errors = 29 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodePoolErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Management configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeManagement management = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the management field is set.
   */
  boolean hasManagement();

  /**
   *
   *
   * <pre>
   * Optional. The Management configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeManagement management = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The management.
   */
  com.google.cloud.gkemulticloud.v1.AzureNodeManagement getManagement();

  /**
   *
   *
   * <pre>
   * Optional. The Management configuration for this node pool.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureNodeManagement management = 30 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureNodeManagementOrBuilder getManagementOrBuilder();
}
