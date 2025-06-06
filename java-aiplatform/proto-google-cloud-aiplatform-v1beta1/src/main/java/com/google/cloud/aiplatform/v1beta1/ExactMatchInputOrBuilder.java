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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface ExactMatchInputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExactMatchInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Spec for exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExactMatchSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricSpec field is set.
   */
  boolean hasMetricSpec();

  /**
   *
   *
   * <pre>
   * Required. Spec for exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExactMatchSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchSpec getMetricSpec();

  /**
   *
   *
   * <pre>
   * Required. Spec for exact match metric.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ExactMatchSpec metric_spec = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchSpecOrBuilder getMetricSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Repeated exact match instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ExactMatchInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ExactMatchInstance> getInstancesList();

  /**
   *
   *
   * <pre>
   * Required. Repeated exact match instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ExactMatchInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchInstance getInstances(int index);

  /**
   *
   *
   * <pre>
   * Required. Repeated exact match instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ExactMatchInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getInstancesCount();

  /**
   *
   *
   * <pre>
   * Required. Repeated exact match instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ExactMatchInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ExactMatchInstanceOrBuilder>
      getInstancesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Repeated exact match instances.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ExactMatchInstance instances = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ExactMatchInstanceOrBuilder getInstancesOrBuilder(int index);
}
