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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface ClusterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The cluster tier.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig.ClusterTier cluster_tier = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterTier.
   */
  int getClusterTierValue();

  /**
   *
   *
   * <pre>
   * Optional. The cluster tier.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.ClusterConfig.ClusterTier cluster_tier = 29 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The clusterTier.
   */
  com.google.cloud.dataproc.v1.ClusterConfig.ClusterTier getClusterTier();

  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The configBucket.
   */
  java.lang.String getConfigBucket();

  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage bucket used to stage job
   * dependencies, config files, and job driver console output.
   * If you do not specify a staging bucket, Cloud
   * Dataproc will determine a Cloud Storage location (US,
   * ASIA, or EU) for your cluster's staging bucket according to the
   * Compute Engine zone where your cluster is deployed, and then create
   * and manage this project-level, per-location bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string config_bucket = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for configBucket.
   */
  com.google.protobuf.ByteString getConfigBucketBytes();

  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs
   * data, such as Spark and MapReduce history files. If you do not specify a
   * temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or
   * EU) for your cluster's temp bucket according to the Compute Engine zone
   * where your cluster is deployed, and then create and manage this
   * project-level, per-location bucket. The default bucket has a TTL of 90
   * days, but you can use any TTL (or none) if you specify a bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string temp_bucket = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The tempBucket.
   */
  java.lang.String getTempBucket();

  /**
   *
   *
   * <pre>
   * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs
   * data, such as Spark and MapReduce history files. If you do not specify a
   * temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or
   * EU) for your cluster's temp bucket according to the Compute Engine zone
   * where your cluster is deployed, and then create and manage this
   * project-level, per-location bucket. The default bucket has a TTL of 90
   * days, but you can use any TTL (or none) if you specify a bucket (see
   * [Dataproc staging and temp
   * buckets](https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)).
   * **This field requires a Cloud Storage bucket name, not a `gs://...` URI to
   * a Cloud Storage bucket.**
   * </pre>
   *
   * <code>string temp_bucket = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for tempBucket.
   */
  com.google.protobuf.ByteString getTempBucketBytes();

  /**
   *
   *
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the gceClusterConfig field is set.
   */
  boolean hasGceClusterConfig();

  /**
   *
   *
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The gceClusterConfig.
   */
  com.google.cloud.dataproc.v1.GceClusterConfig getGceClusterConfig();

  /**
   *
   *
   * <pre>
   * Optional. The shared Compute Engine config settings for
   * all instances in a cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.GceClusterConfig gce_cluster_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.GceClusterConfigOrBuilder getGceClusterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's master instance.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the masterConfig field is set.
   */
  boolean hasMasterConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's master instance.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The masterConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getMasterConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's master instance.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig master_config = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getMasterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's worker instances.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the workerConfig field is set.
   */
  boolean hasWorkerConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's worker instances.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The workerConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getWorkerConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * the cluster's worker instances.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig worker_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getWorkerConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * a cluster's secondary worker instances
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the secondaryWorkerConfig field is set.
   */
  boolean hasSecondaryWorkerConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * a cluster's secondary worker instances
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The secondaryWorkerConfig.
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfig getSecondaryWorkerConfig();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine config settings for
   * a cluster's secondary worker instances
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.InstanceGroupConfig secondary_worker_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.InstanceGroupConfigOrBuilder getSecondaryWorkerConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The config settings for cluster software.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the softwareConfig field is set.
   */
  boolean hasSoftwareConfig();

  /**
   *
   *
   * <pre>
   * Optional. The config settings for cluster software.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The softwareConfig.
   */
  com.google.cloud.dataproc.v1.SoftwareConfig getSoftwareConfig();

  /**
   *
   *
   * <pre>
   * Optional. The config settings for cluster software.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SoftwareConfig software_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SoftwareConfigOrBuilder getSoftwareConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.NodeInitializationAction>
      getInitializationActionsList();

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.NodeInitializationAction getInitializationActions(int index);

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getInitializationActionsCount();

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.NodeInitializationActionOrBuilder>
      getInitializationActionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Commands to execute on each node after config is
   * completed. By default, executables are run on master and all worker nodes.
   * You can test a node's `role` metadata to run an executable on
   * a master or worker node, as shown below using `curl` (you can also use
   * `wget`):
   *
   *     ROLE=$(curl -H Metadata-Flavor:Google
   *     http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
   *     if [[ "${ROLE}" == 'Master' ]]; then
   *       ... master specific actions ...
   *     else
   *       ... worker specific actions ...
   *     fi
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.NodeInitializationAction initialization_actions = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.NodeInitializationActionOrBuilder getInitializationActionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.dataproc.v1.EncryptionConfig getEncryptionConfig();

  /**
   *
   *
   * <pre>
   * Optional. Encryption settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EncryptionConfig encryption_config = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingConfig autoscaling_config = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoscalingConfig field is set.
   */
  boolean hasAutoscalingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingConfig autoscaling_config = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoscalingConfig.
   */
  com.google.cloud.dataproc.v1.AutoscalingConfig getAutoscalingConfig();

  /**
   *
   *
   * <pre>
   * Optional. Autoscaling config for the policy associated with the cluster.
   * Cluster does not autoscale if this field is unset.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.AutoscalingConfig autoscaling_config = 18 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.AutoscalingConfigOrBuilder getAutoscalingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Security settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SecurityConfig security_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the securityConfig field is set.
   */
  boolean hasSecurityConfig();

  /**
   *
   *
   * <pre>
   * Optional. Security settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SecurityConfig security_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The securityConfig.
   */
  com.google.cloud.dataproc.v1.SecurityConfig getSecurityConfig();

  /**
   *
   *
   * <pre>
   * Optional. Security settings for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SecurityConfig security_config = 16 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SecurityConfigOrBuilder getSecurityConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Lifecycle setting for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LifecycleConfig lifecycle_config = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the lifecycleConfig field is set.
   */
  boolean hasLifecycleConfig();

  /**
   *
   *
   * <pre>
   * Optional. Lifecycle setting for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LifecycleConfig lifecycle_config = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The lifecycleConfig.
   */
  com.google.cloud.dataproc.v1.LifecycleConfig getLifecycleConfig();

  /**
   *
   *
   * <pre>
   * Optional. Lifecycle setting for the cluster.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.LifecycleConfig lifecycle_config = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.LifecycleConfigOrBuilder getLifecycleConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EndpointConfig endpoint_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the endpointConfig field is set.
   */
  boolean hasEndpointConfig();

  /**
   *
   *
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EndpointConfig endpoint_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The endpointConfig.
   */
  com.google.cloud.dataproc.v1.EndpointConfig getEndpointConfig();

  /**
   *
   *
   * <pre>
   * Optional. Port/endpoint configuration for this cluster
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EndpointConfig endpoint_config = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.EndpointConfigOrBuilder getEndpointConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Metastore configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the metastoreConfig field is set.
   */
  boolean hasMetastoreConfig();

  /**
   *
   *
   * <pre>
   * Optional. Metastore configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The metastoreConfig.
   */
  com.google.cloud.dataproc.v1.MetastoreConfig getMetastoreConfig();

  /**
   *
   *
   * <pre>
   * Optional. Metastore configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.MetastoreConfig metastore_config = 20 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.MetastoreConfigOrBuilder getMetastoreConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The config for Dataproc metrics.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DataprocMetricConfig dataproc_metric_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataprocMetricConfig field is set.
   */
  boolean hasDataprocMetricConfig();

  /**
   *
   *
   * <pre>
   * Optional. The config for Dataproc metrics.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DataprocMetricConfig dataproc_metric_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataprocMetricConfig.
   */
  com.google.cloud.dataproc.v1.DataprocMetricConfig getDataprocMetricConfig();

  /**
   *
   *
   * <pre>
   * Optional. The config for Dataproc metrics.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.DataprocMetricConfig dataproc_metric_config = 23 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.DataprocMetricConfigOrBuilder getDataprocMetricConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The node group settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AuxiliaryNodeGroup auxiliary_node_groups = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.AuxiliaryNodeGroup> getAuxiliaryNodeGroupsList();

  /**
   *
   *
   * <pre>
   * Optional. The node group settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AuxiliaryNodeGroup auxiliary_node_groups = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.AuxiliaryNodeGroup getAuxiliaryNodeGroups(int index);

  /**
   *
   *
   * <pre>
   * Optional. The node group settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AuxiliaryNodeGroup auxiliary_node_groups = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAuxiliaryNodeGroupsCount();

  /**
   *
   *
   * <pre>
   * Optional. The node group settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AuxiliaryNodeGroup auxiliary_node_groups = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.AuxiliaryNodeGroupOrBuilder>
      getAuxiliaryNodeGroupsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. The node group settings.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AuxiliaryNodeGroup auxiliary_node_groups = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.AuxiliaryNodeGroupOrBuilder getAuxiliaryNodeGroupsOrBuilder(
      int index);
}
