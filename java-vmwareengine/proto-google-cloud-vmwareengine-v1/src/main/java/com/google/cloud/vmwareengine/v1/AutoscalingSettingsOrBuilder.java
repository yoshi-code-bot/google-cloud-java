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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmwareengine.v1;

public interface AutoscalingSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.AutoscalingSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The map with autoscaling policies applied to the cluster.
   * The key is the identifier of the policy.
   * It must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC
   * 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
   *
   * Currently there map must contain only one element
   * that describes the autoscaling policy for compute nodes.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy&gt; autoscaling_policies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getAutoscalingPoliciesCount();

  /**
   *
   *
   * <pre>
   * Required. The map with autoscaling policies applied to the cluster.
   * The key is the identifier of the policy.
   * It must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC
   * 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
   *
   * Currently there map must contain only one element
   * that describes the autoscaling policy for compute nodes.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy&gt; autoscaling_policies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsAutoscalingPolicies(java.lang.String key);

  /** Use {@link #getAutoscalingPoliciesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String, com.google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy>
      getAutoscalingPolicies();

  /**
   *
   *
   * <pre>
   * Required. The map with autoscaling policies applied to the cluster.
   * The key is the identifier of the policy.
   * It must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC
   * 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
   *
   * Currently there map must contain only one element
   * that describes the autoscaling policy for compute nodes.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy&gt; autoscaling_policies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<
          java.lang.String, com.google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy>
      getAutoscalingPoliciesMap();

  /**
   *
   *
   * <pre>
   * Required. The map with autoscaling policies applied to the cluster.
   * The key is the identifier of the policy.
   * It must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC
   * 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
   *
   * Currently there map must contain only one element
   * that describes the autoscaling policy for compute nodes.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy&gt; autoscaling_policies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  com.google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy
      getAutoscalingPoliciesOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy defaultValue);

  /**
   *
   *
   * <pre>
   * Required. The map with autoscaling policies applied to the cluster.
   * The key is the identifier of the policy.
   * It must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC
   * 1034](https://datatracker.ietf.org/doc/html/rfc1034) (section 3.5)
   *
   * Currently there map must contain only one element
   * that describes the autoscaling policy for compute nodes.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy&gt; autoscaling_policies = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vmwareengine.v1.AutoscalingSettings.AutoscalingPolicy
      getAutoscalingPoliciesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Minimum number of nodes of any type in a cluster.
   * If not specified the default limits apply.
   * </pre>
   *
   * <code>int32 min_cluster_node_count = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minClusterNodeCount.
   */
  int getMinClusterNodeCount();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of nodes of any type in a cluster.
   * If not specified the default limits apply.
   * </pre>
   *
   * <code>int32 max_cluster_node_count = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxClusterNodeCount.
   */
  int getMaxClusterNodeCount();

  /**
   *
   *
   * <pre>
   * Optional. The minimum duration between consecutive autoscale operations.
   * It starts once addition or removal of nodes is fully completed.
   * Defaults to 30 minutes if not specified. Cool down period must be in whole
   * minutes (for example, 30, 31, 50, 180 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the coolDownPeriod field is set.
   */
  boolean hasCoolDownPeriod();

  /**
   *
   *
   * <pre>
   * Optional. The minimum duration between consecutive autoscale operations.
   * It starts once addition or removal of nodes is fully completed.
   * Defaults to 30 minutes if not specified. Cool down period must be in whole
   * minutes (for example, 30, 31, 50, 180 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The coolDownPeriod.
   */
  com.google.protobuf.Duration getCoolDownPeriod();

  /**
   *
   *
   * <pre>
   * Optional. The minimum duration between consecutive autoscale operations.
   * It starts once addition or removal of nodes is fully completed.
   * Defaults to 30 minutes if not specified. Cool down period must be in whole
   * minutes (for example, 30, 31, 50, 180 minutes).
   * </pre>
   *
   * <code>.google.protobuf.Duration cool_down_period = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getCoolDownPeriodOrBuilder();
}
