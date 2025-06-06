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
// source: google/cloud/gkehub/policycontroller/v1beta/policycontroller.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.policycontroller.v1beta;

public interface PolicyControllerDeploymentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Pod replica count.
   * </pre>
   *
   * <code>optional int64 replica_count = 1;</code>
   *
   * @return Whether the replicaCount field is set.
   */
  boolean hasReplicaCount();

  /**
   *
   *
   * <pre>
   * Pod replica count.
   * </pre>
   *
   * <code>optional int64 replica_count = 1;</code>
   *
   * @return The replicaCount.
   */
  long getReplicaCount();

  /**
   *
   *
   * <pre>
   * Container resource requirements.
   * </pre>
   *
   * <code>
   * optional .google.cloud.gkehub.policycontroller.v1beta.ResourceRequirements container_resources = 2;
   * </code>
   *
   * @return Whether the containerResources field is set.
   */
  boolean hasContainerResources();

  /**
   *
   *
   * <pre>
   * Container resource requirements.
   * </pre>
   *
   * <code>
   * optional .google.cloud.gkehub.policycontroller.v1beta.ResourceRequirements container_resources = 2;
   * </code>
   *
   * @return The containerResources.
   */
  com.google.cloud.gkehub.policycontroller.v1beta.ResourceRequirements getContainerResources();

  /**
   *
   *
   * <pre>
   * Container resource requirements.
   * </pre>
   *
   * <code>
   * optional .google.cloud.gkehub.policycontroller.v1beta.ResourceRequirements container_resources = 2;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.ResourceRequirementsOrBuilder
      getContainerResourcesOrBuilder();

  /**
   *
   *
   * <pre>
   * Pod anti-affinity enablement. Deprecated: use `pod_affinity` instead.
   * </pre>
   *
   * <code>optional bool pod_anti_affinity = 3 [deprecated = true];</code>
   *
   * @deprecated
   *     google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.pod_anti_affinity
   *     is deprecated. See google/cloud/gkehub/policycontroller/v1beta/policycontroller.proto;l=233
   * @return Whether the podAntiAffinity field is set.
   */
  @java.lang.Deprecated
  boolean hasPodAntiAffinity();

  /**
   *
   *
   * <pre>
   * Pod anti-affinity enablement. Deprecated: use `pod_affinity` instead.
   * </pre>
   *
   * <code>optional bool pod_anti_affinity = 3 [deprecated = true];</code>
   *
   * @deprecated
   *     google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.pod_anti_affinity
   *     is deprecated. See google/cloud/gkehub/policycontroller/v1beta/policycontroller.proto;l=233
   * @return The podAntiAffinity.
   */
  @java.lang.Deprecated
  boolean getPodAntiAffinity();

  /**
   *
   *
   * <pre>
   * Pod tolerations of node taints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration pod_tolerations = 4;
   * </code>
   */
  java.util.List<
          com.google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig
              .Toleration>
      getPodTolerationsList();

  /**
   *
   *
   * <pre>
   * Pod tolerations of node taints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration pod_tolerations = 4;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration
      getPodTolerations(int index);

  /**
   *
   *
   * <pre>
   * Pod tolerations of node taints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration pod_tolerations = 4;
   * </code>
   */
  int getPodTolerationsCount();

  /**
   *
   *
   * <pre>
   * Pod tolerations of node taints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration pod_tolerations = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig
                  .TolerationOrBuilder>
      getPodTolerationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Pod tolerations of node taints.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Toleration pod_tolerations = 4;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig
          .TolerationOrBuilder
      getPodTolerationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pod affinity configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Affinity pod_affinity = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for podAffinity.
   */
  int getPodAffinityValue();

  /**
   *
   *
   * <pre>
   * Pod affinity configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Affinity pod_affinity = 5;
   * </code>
   *
   * @return The podAffinity.
   */
  com.google.cloud.gkehub.policycontroller.v1beta.PolicyControllerDeploymentConfig.Affinity
      getPodAffinity();
}
