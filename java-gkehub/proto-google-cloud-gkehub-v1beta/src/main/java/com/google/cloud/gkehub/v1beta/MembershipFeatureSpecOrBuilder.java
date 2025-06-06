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
// source: google/cloud/gkehub/v1beta/feature.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.v1beta;

public interface MembershipFeatureSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta.MembershipFeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec configmanagement = 106;
   * </code>
   *
   * @return Whether the configmanagement field is set.
   */
  boolean hasConfigmanagement();

  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec configmanagement = 106;
   * </code>
   *
   * @return The configmanagement.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec getConfigmanagement();

  /**
   *
   *
   * <pre>
   * Config Management-specific spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.MembershipSpec configmanagement = 106;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.MembershipSpecOrBuilder
      getConfigmanagementOrBuilder();

  /**
   *
   *
   * <pre>
   * Anthos Service Mesh-specific spec
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec mesh = 116;</code>
   *
   * @return Whether the mesh field is set.
   */
  boolean hasMesh();

  /**
   *
   *
   * <pre>
   * Anthos Service Mesh-specific spec
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec mesh = 116;</code>
   *
   * @return The mesh.
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec getMesh();

  /**
   *
   *
   * <pre>
   * Anthos Service Mesh-specific spec
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1beta.MembershipSpec mesh = 116;</code>
   */
  com.google.cloud.gkehub.servicemesh.v1beta.MembershipSpecOrBuilder getMeshOrBuilder();

  /**
   *
   *
   * <pre>
   * Policy Controller spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.MembershipSpec policycontroller = 118;
   * </code>
   *
   * @return Whether the policycontroller field is set.
   */
  boolean hasPolicycontroller();

  /**
   *
   *
   * <pre>
   * Policy Controller spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.MembershipSpec policycontroller = 118;
   * </code>
   *
   * @return The policycontroller.
   */
  com.google.cloud.gkehub.policycontroller.v1beta.MembershipSpec getPolicycontroller();

  /**
   *
   *
   * <pre>
   * Policy Controller spec.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.MembershipSpec policycontroller = 118;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.MembershipSpecOrBuilder
      getPolicycontrollerOrBuilder();

  com.google.cloud.gkehub.v1beta.MembershipFeatureSpec.FeatureSpecCase getFeatureSpecCase();
}
