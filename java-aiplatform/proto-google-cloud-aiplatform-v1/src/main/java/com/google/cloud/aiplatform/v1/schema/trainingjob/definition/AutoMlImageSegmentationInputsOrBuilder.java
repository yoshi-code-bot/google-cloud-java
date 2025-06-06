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
// source: google/cloud/aiplatform/v1/schema/trainingjob/definition/automl_image_segmentation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1.schema.trainingjob.definition;

public interface AutoMlImageSegmentationInputsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for modelType.
   */
  int getModelTypeValue();

  /**
   * <code>
   * .google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs.ModelType model_type = 1;
   * </code>
   *
   * @return The modelType.
   */
  com.google.cloud.aiplatform.v1.schema.trainingjob.definition.AutoMlImageSegmentationInputs
          .ModelType
      getModelType();

  /**
   *
   *
   * <pre>
   * The training budget of creating this model, expressed in milli node
   * hours i.e. 1,000 value in this field means 1 node hour. The actual
   * metadata.costMilliNodeHours will be equal or less than this value.
   * If further model training ceases to provide any improvements, it will
   * stop without using the full budget and the metadata.successfulStopReason
   * will be `model-converged`.
   * Note, node_hour  = actual_hour * number_of_nodes_involved. Or
   * actaul_wall_clock_hours = train_budget_milli_node_hours /
   *                           (number_of_nodes_involved * 1000)
   * For modelType `cloud-high-accuracy-1`(default), the budget must be between
   * 20,000 and 2,000,000 milli node hours, inclusive. The default value is
   * 192,000 which represents one day in wall time
   * (1000 milli * 24 hours * 8 nodes).
   * </pre>
   *
   * <code>int64 budget_milli_node_hours = 2;</code>
   *
   * @return The budgetMilliNodeHours.
   */
  long getBudgetMilliNodeHours();

  /**
   *
   *
   * <pre>
   * The ID of the `base` model. If it is specified, the new model will be
   * trained based on the `base` model. Otherwise, the new model will be
   * trained from scratch. The `base` model must be in the same
   * Project and Location as the new Model to train, and have the same
   * modelType.
   * </pre>
   *
   * <code>string base_model_id = 3;</code>
   *
   * @return The baseModelId.
   */
  java.lang.String getBaseModelId();

  /**
   *
   *
   * <pre>
   * The ID of the `base` model. If it is specified, the new model will be
   * trained based on the `base` model. Otherwise, the new model will be
   * trained from scratch. The `base` model must be in the same
   * Project and Location as the new Model to train, and have the same
   * modelType.
   * </pre>
   *
   * <code>string base_model_id = 3;</code>
   *
   * @return The bytes for baseModelId.
   */
  com.google.protobuf.ByteString getBaseModelIdBytes();
}
