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
// source: google/cloud/policytroubleshooter/v1/checker.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.policytroubleshooter.v1;

public interface TroubleshootIamPolicyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.v1.TroubleshootIamPolicyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all of the applicable IAM policies.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.v1.AccessState access = 1;</code>
   *
   * @return The enum numeric value on the wire for access.
   */
  int getAccessValue();

  /**
   *
   *
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all of the applicable IAM policies.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.v1.AccessState access = 1;</code>
   *
   * @return The access.
   */
  google.cloud.policytroubleshooter.v1.Explanations.AccessState getAccess();

  /**
   *
   *
   * <pre>
   * List of IAM policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies can include the policy for the resource itself. It can
   * also include policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.v1.ExplainedPolicy explained_policies = 2;
   * </code>
   */
  java.util.List<google.cloud.policytroubleshooter.v1.Explanations.ExplainedPolicy>
      getExplainedPoliciesList();

  /**
   *
   *
   * <pre>
   * List of IAM policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies can include the policy for the resource itself. It can
   * also include policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.v1.ExplainedPolicy explained_policies = 2;
   * </code>
   */
  google.cloud.policytroubleshooter.v1.Explanations.ExplainedPolicy getExplainedPolicies(int index);

  /**
   *
   *
   * <pre>
   * List of IAM policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies can include the policy for the resource itself. It can
   * also include policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.v1.ExplainedPolicy explained_policies = 2;
   * </code>
   */
  int getExplainedPoliciesCount();

  /**
   *
   *
   * <pre>
   * List of IAM policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies can include the policy for the resource itself. It can
   * also include policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.v1.ExplainedPolicy explained_policies = 2;
   * </code>
   */
  java.util.List<
          ? extends google.cloud.policytroubleshooter.v1.Explanations.ExplainedPolicyOrBuilder>
      getExplainedPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of IAM policies that were evaluated to check the principal's
   * permissions, with annotations to indicate how each policy contributed to
   * the final result.
   *
   * The list of policies can include the policy for the resource itself. It can
   * also include policies that are inherited from higher levels of the resource
   * hierarchy, including the organization, the folder, and the project.
   *
   * To learn more about the resource hierarchy, see
   * https://cloud.google.com/iam/help/resource-hierarchy.
   * </pre>
   *
   * <code>repeated .google.cloud.policytroubleshooter.v1.ExplainedPolicy explained_policies = 2;
   * </code>
   */
  google.cloud.policytroubleshooter.v1.Explanations.ExplainedPolicyOrBuilder
      getExplainedPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The general errors contained in the troubleshooting response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  java.util.List<com.google.rpc.Status> getErrorsList();

  /**
   *
   *
   * <pre>
   * The general errors contained in the troubleshooting response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  com.google.rpc.Status getErrors(int index);

  /**
   *
   *
   * <pre>
   * The general errors contained in the troubleshooting response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  int getErrorsCount();

  /**
   *
   *
   * <pre>
   * The general errors contained in the troubleshooting response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The general errors contained in the troubleshooting response.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorsOrBuilder(int index);
}
