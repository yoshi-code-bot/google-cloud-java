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
// source: google/cloud/billing/budgets/v1/budget_model.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.billing.budgets.v1;

public interface ThresholdRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.budgets.v1.ThresholdRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Send an alert when this threshold is exceeded.
   * This is a 1.0-based percentage, so 0.5 = 50%.
   * Validation: non-negative number.
   * </pre>
   *
   * <code>double threshold_percent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The thresholdPercent.
   */
  double getThresholdPercent();

  /**
   *
   *
   * <pre>
   * Optional. The type of basis used to determine if spend has passed the
   * threshold. Behavior defaults to CURRENT_SPEND if not set.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for spendBasis.
   */
  int getSpendBasisValue();

  /**
   *
   *
   * <pre>
   * Optional. The type of basis used to determine if spend has passed the
   * threshold. Behavior defaults to CURRENT_SPEND if not set.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The spendBasis.
   */
  com.google.cloud.billing.budgets.v1.ThresholdRule.Basis getSpendBasis();
}
