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
// source: google/cloud/aiplatform/v1beta1/model_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public interface BatchImportModelEvaluationSlicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BatchImportModelEvaluationSlicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent ModelEvaluation resource.
   * Format:
   * `projects/{project}/locations/{location}/models/{model}/evaluations/{evaluation}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The name of the parent ModelEvaluation resource.
   * Format:
   * `projects/{project}/locations/{location}/models/{model}/evaluations/{evaluation}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Model evaluation slice resource to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice>
      getModelEvaluationSlicesList();

  /**
   *
   *
   * <pre>
   * Required. Model evaluation slice resource to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSlice getModelEvaluationSlices(int index);

  /**
   *
   *
   * <pre>
   * Required. Model evaluation slice resource to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getModelEvaluationSlicesCount();

  /**
   *
   *
   * <pre>
   * Required. Model evaluation slice resource to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceOrBuilder>
      getModelEvaluationSlicesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Model evaluation slice resource to be imported.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.ModelEvaluationSlice model_evaluation_slices = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelEvaluationSliceOrBuilder
      getModelEvaluationSlicesOrBuilder(int index);
}
