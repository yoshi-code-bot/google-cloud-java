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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.policytroubleshooter.iam.v3;

public interface AllowBindingExplanationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this role binding_ gives the specified
   * permission to the specified principal on the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission on the resource. There might be another role binding that
   * overrides this role binding. To determine whether the principal actually
   * has the permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for allowAccessState.
   */
  int getAllowAccessStateValue();

  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this role binding_ gives the specified
   * permission to the specified principal on the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission on the resource. There might be another role binding that
   * overrides this role binding. To determine whether the principal actually
   * has the permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowAccessState allow_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The allowAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowAccessState getAllowAccessState();

  /**
   *
   *
   * <pre>
   * The role that this role binding grants. For example,
   * `roles/compute.admin`.
   *
   * For a complete list of predefined IAM roles, as well as the permissions in
   * each role, see https://cloud.google.com/iam/help/roles/reference.
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The role.
   */
  java.lang.String getRole();

  /**
   *
   *
   * <pre>
   * The role that this role binding grants. For example,
   * `roles/compute.admin`.
   *
   * For a complete list of predefined IAM roles, as well as the permissions in
   * each role, see https://cloud.google.com/iam/help/roles/reference.
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString getRoleBytes();

  /**
   *
   *
   * <pre>
   * Indicates whether the role granted by this role binding contains the
   * specified permission.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.RolePermissionInclusionState role_permission = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for rolePermission.
   */
  int getRolePermissionValue();

  /**
   *
   *
   * <pre>
   * Indicates whether the role granted by this role binding contains the
   * specified permission.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.RolePermissionInclusionState role_permission = 3;
   * </code>
   *
   * @return The rolePermission.
   */
  com.google.cloud.policytroubleshooter.iam.v3.RolePermissionInclusionState getRolePermission();

  /**
   *
   *
   * <pre>
   * The relevance of the permission's existence, or nonexistence, in the role
   * to the overall determination for the entire policy.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance role_permission_relevance = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for rolePermissionRelevance.
   */
  int getRolePermissionRelevanceValue();

  /**
   *
   *
   * <pre>
   * The relevance of the permission's existence, or nonexistence, in the role
   * to the overall determination for the entire policy.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance role_permission_relevance = 4;
   * </code>
   *
   * @return The rolePermissionRelevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRolePermissionRelevance();

  /**
   *
   *
   * <pre>
   * The combined result of all memberships. Indicates if the principal is
   * included in any role binding, either directly or indirectly.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership combined_membership = 5;
   * </code>
   *
   * @return Whether the combinedMembership field is set.
   */
  boolean hasCombinedMembership();

  /**
   *
   *
   * <pre>
   * The combined result of all memberships. Indicates if the principal is
   * included in any role binding, either directly or indirectly.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership combined_membership = 5;
   * </code>
   *
   * @return The combinedMembership.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership
      getCombinedMembership();

  /**
   *
   *
   * <pre>
   * The combined result of all memberships. Indicates if the principal is
   * included in any role binding, either directly or indirectly.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership combined_membership = 5;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation
          .AnnotatedAllowMembershipOrBuilder
      getCombinedMembershipOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether each role binding includes the principal specified in the
   * request, either directly or indirectly. Each key identifies a principal in
   * the role binding, and each value indicates whether the principal in the
   * role binding includes the principal in the request.
   *
   * For example, suppose that a role binding includes the following principals:
   *
   * * `user:alice&#64;example.com`
   * * `group:product-eng&#64;example.com`
   *
   * You want to troubleshoot access for `user:bob&#64;example.com`. This user is a
   * member of the group `group:product-eng&#64;example.com`.
   *
   * For the first principal in the role binding, the key is
   * `user:alice&#64;example.com`, and the `membership` field in the value is set to
   * `NOT_INCLUDED`.
   *
   * For the second principal in the role binding, the key is
   * `group:product-eng&#64;example.com`, and the `membership` field in the value is
   * set to `INCLUDED`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership&gt; memberships = 6;
   * </code>
   */
  int getMembershipsCount();

  /**
   *
   *
   * <pre>
   * Indicates whether each role binding includes the principal specified in the
   * request, either directly or indirectly. Each key identifies a principal in
   * the role binding, and each value indicates whether the principal in the
   * role binding includes the principal in the request.
   *
   * For example, suppose that a role binding includes the following principals:
   *
   * * `user:alice&#64;example.com`
   * * `group:product-eng&#64;example.com`
   *
   * You want to troubleshoot access for `user:bob&#64;example.com`. This user is a
   * member of the group `group:product-eng&#64;example.com`.
   *
   * For the first principal in the role binding, the key is
   * `user:alice&#64;example.com`, and the `membership` field in the value is set to
   * `NOT_INCLUDED`.
   *
   * For the second principal in the role binding, the key is
   * `group:product-eng&#64;example.com`, and the `membership` field in the value is
   * set to `INCLUDED`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership&gt; memberships = 6;
   * </code>
   */
  boolean containsMemberships(java.lang.String key);

  /** Use {@link #getMembershipsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation
              .AnnotatedAllowMembership>
      getMemberships();

  /**
   *
   *
   * <pre>
   * Indicates whether each role binding includes the principal specified in the
   * request, either directly or indirectly. Each key identifies a principal in
   * the role binding, and each value indicates whether the principal in the
   * role binding includes the principal in the request.
   *
   * For example, suppose that a role binding includes the following principals:
   *
   * * `user:alice&#64;example.com`
   * * `group:product-eng&#64;example.com`
   *
   * You want to troubleshoot access for `user:bob&#64;example.com`. This user is a
   * member of the group `group:product-eng&#64;example.com`.
   *
   * For the first principal in the role binding, the key is
   * `user:alice&#64;example.com`, and the `membership` field in the value is set to
   * `NOT_INCLUDED`.
   *
   * For the second principal in the role binding, the key is
   * `group:product-eng&#64;example.com`, and the `membership` field in the value is
   * set to `INCLUDED`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership&gt; memberships = 6;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation
              .AnnotatedAllowMembership>
      getMembershipsMap();

  /**
   *
   *
   * <pre>
   * Indicates whether each role binding includes the principal specified in the
   * request, either directly or indirectly. Each key identifies a principal in
   * the role binding, and each value indicates whether the principal in the
   * role binding includes the principal in the request.
   *
   * For example, suppose that a role binding includes the following principals:
   *
   * * `user:alice&#64;example.com`
   * * `group:product-eng&#64;example.com`
   *
   * You want to troubleshoot access for `user:bob&#64;example.com`. This user is a
   * member of the group `group:product-eng&#64;example.com`.
   *
   * For the first principal in the role binding, the key is
   * `user:alice&#64;example.com`, and the `membership` field in the value is set to
   * `NOT_INCLUDED`.
   *
   * For the second principal in the role binding, the key is
   * `group:product-eng&#64;example.com`, and the `membership` field in the value is
   * set to `INCLUDED`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership&gt; memberships = 6;
   * </code>
   */
  /* nullable */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership
      getMembershipsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation
                  .AnnotatedAllowMembership
              defaultValue);

  /**
   *
   *
   * <pre>
   * Indicates whether each role binding includes the principal specified in the
   * request, either directly or indirectly. Each key identifies a principal in
   * the role binding, and each value indicates whether the principal in the
   * role binding includes the principal in the request.
   *
   * For example, suppose that a role binding includes the following principals:
   *
   * * `user:alice&#64;example.com`
   * * `group:product-eng&#64;example.com`
   *
   * You want to troubleshoot access for `user:bob&#64;example.com`. This user is a
   * member of the group `group:product-eng&#64;example.com`.
   *
   * For the first principal in the role binding, the key is
   * `user:alice&#64;example.com`, and the `membership` field in the value is set to
   * `NOT_INCLUDED`.
   *
   * For the second principal in the role binding, the key is
   * `group:product-eng&#64;example.com`, and the `membership` field in the value is
   * set to `INCLUDED`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership&gt; memberships = 6;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowBindingExplanation.AnnotatedAllowMembership
      getMembershipsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The relevance of this role binding to the overall determination for the
   * entire policy.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 7;</code>
   *
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();

  /**
   *
   *
   * <pre>
   * The relevance of this role binding to the overall determination for the
   * entire policy.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 7;</code>
   *
   * @return The relevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRelevance();

  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the role binding grants access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 8;</code>
   *
   * @return Whether the condition field is set.
   */
  boolean hasCondition();

  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the role binding grants access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 8;</code>
   *
   * @return The condition.
   */
  com.google.type.Expr getCondition();

  /**
   *
   *
   * <pre>
   * A condition expression that specifies when the role binding grants access.
   *
   * To learn about IAM Conditions, see
   * https://cloud.google.com/iam/help/conditions/overview.
   * </pre>
   *
   * <code>.google.type.Expr condition = 8;</code>
   */
  com.google.type.ExprOrBuilder getConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 9;
   * </code>
   *
   * @return Whether the conditionExplanation field is set.
   */
  boolean hasConditionExplanation();

  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 9;
   * </code>
   *
   * @return The conditionExplanation.
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation getConditionExplanation();

  /**
   *
   *
   * <pre>
   * Condition evaluation state for this role binding.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.ConditionExplanation condition_explanation = 9;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.ConditionExplanationOrBuilder
      getConditionExplanationOrBuilder();
}
