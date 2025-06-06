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
// source: google/cloud/aiplatform/v1/tensorboard_data.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface TimeSeriesDataPointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TimeSeriesDataPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A scalar value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Scalar scalar = 3;</code>
   *
   * @return Whether the scalar field is set.
   */
  boolean hasScalar();

  /**
   *
   *
   * <pre>
   * A scalar value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Scalar scalar = 3;</code>
   *
   * @return The scalar.
   */
  com.google.cloud.aiplatform.v1.Scalar getScalar();

  /**
   *
   *
   * <pre>
   * A scalar value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Scalar scalar = 3;</code>
   */
  com.google.cloud.aiplatform.v1.ScalarOrBuilder getScalarOrBuilder();

  /**
   *
   *
   * <pre>
   * A tensor value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTensor tensor = 4;</code>
   *
   * @return Whether the tensor field is set.
   */
  boolean hasTensor();

  /**
   *
   *
   * <pre>
   * A tensor value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTensor tensor = 4;</code>
   *
   * @return The tensor.
   */
  com.google.cloud.aiplatform.v1.TensorboardTensor getTensor();

  /**
   *
   *
   * <pre>
   * A tensor value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardTensor tensor = 4;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardTensorOrBuilder getTensorOrBuilder();

  /**
   *
   *
   * <pre>
   * A blob sequence value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardBlobSequence blobs = 5;</code>
   *
   * @return Whether the blobs field is set.
   */
  boolean hasBlobs();

  /**
   *
   *
   * <pre>
   * A blob sequence value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardBlobSequence blobs = 5;</code>
   *
   * @return The blobs.
   */
  com.google.cloud.aiplatform.v1.TensorboardBlobSequence getBlobs();

  /**
   *
   *
   * <pre>
   * A blob sequence value.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.TensorboardBlobSequence blobs = 5;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardBlobSequenceOrBuilder getBlobsOrBuilder();

  /**
   *
   *
   * <pre>
   * Wall clock timestamp when this data point is generated by the end user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp wall_time = 1;</code>
   *
   * @return Whether the wallTime field is set.
   */
  boolean hasWallTime();

  /**
   *
   *
   * <pre>
   * Wall clock timestamp when this data point is generated by the end user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp wall_time = 1;</code>
   *
   * @return The wallTime.
   */
  com.google.protobuf.Timestamp getWallTime();

  /**
   *
   *
   * <pre>
   * Wall clock timestamp when this data point is generated by the end user.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp wall_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWallTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Step index of this data point within the run.
   * </pre>
   *
   * <code>int64 step = 2;</code>
   *
   * @return The step.
   */
  long getStep();

  com.google.cloud.aiplatform.v1.TimeSeriesDataPoint.ValueCase getValueCase();
}
