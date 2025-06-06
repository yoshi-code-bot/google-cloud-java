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
// source: google/cloud/gkehub/v1alpha/multiclusteringress/multiclusteringress.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.multiclusteringress.v1alpha;

public interface FeatureSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.multiclusteringress.v1alpha.FeatureSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
   * Example: `projects/foo-proj/locations/global/memberships/bar`
   * </pre>
   *
   * <code>string config_membership = 1;</code>
   *
   * @return The configMembership.
   */
  java.lang.String getConfigMembership();

  /**
   *
   *
   * <pre>
   * Fully-qualified Membership name which hosts the MultiClusterIngress CRD.
   * Example: `projects/foo-proj/locations/global/memberships/bar`
   * </pre>
   *
   * <code>string config_membership = 1;</code>
   *
   * @return The bytes for configMembership.
   */
  com.google.protobuf.ByteString getConfigMembershipBytes();

  /**
   *
   *
   * <pre>
   * Customer's billing structure
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
   *
   * @return The enum numeric value on the wire for billing.
   */
  int getBillingValue();

  /**
   *
   *
   * <pre>
   * Customer's billing structure
   * </pre>
   *
   * <code>.google.cloud.gkehub.multiclusteringress.v1alpha.Billing billing = 2;</code>
   *
   * @return The billing.
   */
  com.google.cloud.gkehub.multiclusteringress.v1alpha.Billing getBilling();
}
