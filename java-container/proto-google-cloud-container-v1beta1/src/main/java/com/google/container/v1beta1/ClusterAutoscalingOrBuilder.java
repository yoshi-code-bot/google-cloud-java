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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

public interface ClusterAutoscalingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ClusterAutoscaling)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Enables automatic node pool creation and deletion.
   * </pre>
   *
   * <code>bool enable_node_autoprovisioning = 1;</code>
   *
   * @return The enableNodeAutoprovisioning.
   */
  boolean getEnableNodeAutoprovisioning();

  /**
   *
   *
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.ResourceLimit resource_limits = 2;</code>
   */
  java.util.List<com.google.container.v1beta1.ResourceLimit> getResourceLimitsList();

  /**
   *
   *
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.ResourceLimit resource_limits = 2;</code>
   */
  com.google.container.v1beta1.ResourceLimit getResourceLimits(int index);

  /**
   *
   *
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.ResourceLimit resource_limits = 2;</code>
   */
  int getResourceLimitsCount();

  /**
   *
   *
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.ResourceLimit resource_limits = 2;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.ResourceLimitOrBuilder>
      getResourceLimitsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Contains global constraints regarding minimum and maximum
   * amount of resources in the cluster.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.ResourceLimit resource_limits = 2;</code>
   */
  com.google.container.v1beta1.ResourceLimitOrBuilder getResourceLimitsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Defines autoscaling behaviour.
   * </pre>
   *
   * <code>.google.container.v1beta1.ClusterAutoscaling.AutoscalingProfile autoscaling_profile = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for autoscalingProfile.
   */
  int getAutoscalingProfileValue();

  /**
   *
   *
   * <pre>
   * Defines autoscaling behaviour.
   * </pre>
   *
   * <code>.google.container.v1beta1.ClusterAutoscaling.AutoscalingProfile autoscaling_profile = 3;
   * </code>
   *
   * @return The autoscalingProfile.
   */
  com.google.container.v1beta1.ClusterAutoscaling.AutoscalingProfile getAutoscalingProfile();

  /**
   *
   *
   * <pre>
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool
   * created by NAP.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.AutoprovisioningNodePoolDefaults autoprovisioning_node_pool_defaults = 4;
   * </code>
   *
   * @return Whether the autoprovisioningNodePoolDefaults field is set.
   */
  boolean hasAutoprovisioningNodePoolDefaults();

  /**
   *
   *
   * <pre>
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool
   * created by NAP.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.AutoprovisioningNodePoolDefaults autoprovisioning_node_pool_defaults = 4;
   * </code>
   *
   * @return The autoprovisioningNodePoolDefaults.
   */
  com.google.container.v1beta1.AutoprovisioningNodePoolDefaults
      getAutoprovisioningNodePoolDefaults();

  /**
   *
   *
   * <pre>
   * AutoprovisioningNodePoolDefaults contains defaults for a node pool
   * created by NAP.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.AutoprovisioningNodePoolDefaults autoprovisioning_node_pool_defaults = 4;
   * </code>
   */
  com.google.container.v1beta1.AutoprovisioningNodePoolDefaultsOrBuilder
      getAutoprovisioningNodePoolDefaultsOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available)
   * in which the NodePool's nodes can be created by NAP.
   * </pre>
   *
   * <code>repeated string autoprovisioning_locations = 5;</code>
   *
   * @return A list containing the autoprovisioningLocations.
   */
  java.util.List<java.lang.String> getAutoprovisioningLocationsList();

  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available)
   * in which the NodePool's nodes can be created by NAP.
   * </pre>
   *
   * <code>repeated string autoprovisioning_locations = 5;</code>
   *
   * @return The count of autoprovisioningLocations.
   */
  int getAutoprovisioningLocationsCount();

  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available)
   * in which the NodePool's nodes can be created by NAP.
   * </pre>
   *
   * <code>repeated string autoprovisioning_locations = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The autoprovisioningLocations at the given index.
   */
  java.lang.String getAutoprovisioningLocations(int index);

  /**
   *
   *
   * <pre>
   * The list of Google Compute Engine
   * [zones](https://cloud.google.com/compute/docs/zones#available)
   * in which the NodePool's nodes can be created by NAP.
   * </pre>
   *
   * <code>repeated string autoprovisioning_locations = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the autoprovisioningLocations at the given index.
   */
  com.google.protobuf.ByteString getAutoprovisioningLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * Default compute class is a configuration for default compute class.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultComputeClassConfig default_compute_class_config = 9;
   * </code>
   *
   * @return Whether the defaultComputeClassConfig field is set.
   */
  boolean hasDefaultComputeClassConfig();

  /**
   *
   *
   * <pre>
   * Default compute class is a configuration for default compute class.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultComputeClassConfig default_compute_class_config = 9;
   * </code>
   *
   * @return The defaultComputeClassConfig.
   */
  com.google.container.v1beta1.DefaultComputeClassConfig getDefaultComputeClassConfig();

  /**
   *
   *
   * <pre>
   * Default compute class is a configuration for default compute class.
   * </pre>
   *
   * <code>.google.container.v1beta1.DefaultComputeClassConfig default_compute_class_config = 9;
   * </code>
   */
  com.google.container.v1beta1.DefaultComputeClassConfigOrBuilder
      getDefaultComputeClassConfigOrBuilder();
}
