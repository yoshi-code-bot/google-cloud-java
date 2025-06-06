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
// source: google/cloud/automl/v1beta1/tables.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.automl.v1beta1;

public interface TablesAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TablesAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. A confidence estimate between 0.0 and 1.0, inclusive. A higher
   * value means greater confidence in the returned value.
   * For
   *
   * [target_column_spec][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * of FLOAT64 data type the score is not populated.
   * </pre>
   *
   * <code>float score = 1;</code>
   *
   * @return The score.
   */
  float getScore();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when
   *
   * [target_column_spec][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * has FLOAT64 data type. An interval in which the exactly correct target
   * value has 95% chance to be in.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DoubleRange prediction_interval = 4;</code>
   *
   * @return Whether the predictionInterval field is set.
   */
  boolean hasPredictionInterval();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when
   *
   * [target_column_spec][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * has FLOAT64 data type. An interval in which the exactly correct target
   * value has 95% chance to be in.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DoubleRange prediction_interval = 4;</code>
   *
   * @return The predictionInterval.
   */
  com.google.cloud.automl.v1beta1.DoubleRange getPredictionInterval();

  /**
   *
   *
   * <pre>
   * Output only. Only populated when
   *
   * [target_column_spec][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec]
   * has FLOAT64 data type. An interval in which the exactly correct target
   * value has 95% chance to be in.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.DoubleRange prediction_interval = 4;</code>
   */
  com.google.cloud.automl.v1beta1.DoubleRangeOrBuilder getPredictionIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The predicted value of the row's
   *
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec].
   * The value depends on the column's DataType:
   *
   * * CATEGORY - the predicted (with the above confidence `score`) CATEGORY
   *   value.
   *
   * * FLOAT64 - the predicted (with above `prediction_interval`) FLOAT64 value.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();

  /**
   *
   *
   * <pre>
   * The predicted value of the row's
   *
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec].
   * The value depends on the column's DataType:
   *
   * * CATEGORY - the predicted (with the above confidence `score`) CATEGORY
   *   value.
   *
   * * FLOAT64 - the predicted (with above `prediction_interval`) FLOAT64 value.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   *
   * @return The value.
   */
  com.google.protobuf.Value getValue();

  /**
   *
   *
   * <pre>
   * The predicted value of the row's
   *
   * [target_column][google.cloud.automl.v1beta1.TablesModelMetadata.target_column_spec].
   * The value depends on the column's DataType:
   *
   * * CATEGORY - the predicted (with the above confidence `score`) CATEGORY
   *   value.
   *
   * * FLOAT64 - the predicted (with above `prediction_interval`) FLOAT64 value.
   * </pre>
   *
   * <code>.google.protobuf.Value value = 2;</code>
   */
  com.google.protobuf.ValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the model's
   *
   * [input_feature_column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * with respect to this particular prediction.
   * If no other fields than
   *
   * [column_spec_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_spec_name]
   * and
   *
   * [column_display_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_display_name]
   * would be populated, then this whole field is not.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 3;
   * </code>
   */
  java.util.List<com.google.cloud.automl.v1beta1.TablesModelColumnInfo>
      getTablesModelColumnInfoList();

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the model's
   *
   * [input_feature_column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * with respect to this particular prediction.
   * If no other fields than
   *
   * [column_spec_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_spec_name]
   * and
   *
   * [column_display_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_display_name]
   * would be populated, then this whole field is not.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 3;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TablesModelColumnInfo getTablesModelColumnInfo(int index);

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the model's
   *
   * [input_feature_column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * with respect to this particular prediction.
   * If no other fields than
   *
   * [column_spec_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_spec_name]
   * and
   *
   * [column_display_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_display_name]
   * would be populated, then this whole field is not.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 3;
   * </code>
   */
  int getTablesModelColumnInfoCount();

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the model's
   *
   * [input_feature_column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * with respect to this particular prediction.
   * If no other fields than
   *
   * [column_spec_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_spec_name]
   * and
   *
   * [column_display_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_display_name]
   * would be populated, then this whole field is not.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.automl.v1beta1.TablesModelColumnInfoOrBuilder>
      getTablesModelColumnInfoOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Auxiliary information for each of the model's
   *
   * [input_feature_column_specs][google.cloud.automl.v1beta1.TablesModelMetadata.input_feature_column_specs]
   * with respect to this particular prediction.
   * If no other fields than
   *
   * [column_spec_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_spec_name]
   * and
   *
   * [column_display_name][google.cloud.automl.v1beta1.TablesModelColumnInfo.column_display_name]
   * would be populated, then this whole field is not.
   * </pre>
   *
   * <code>repeated .google.cloud.automl.v1beta1.TablesModelColumnInfo tables_model_column_info = 3;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TablesModelColumnInfoOrBuilder getTablesModelColumnInfoOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. Stores the prediction score for the baseline example, which
   * is defined as the example with all values set to their baseline values.
   * This is used as part of the Sampled Shapley explanation of the model's
   * prediction. This field is populated only when feature importance is
   * requested. For regression models, this holds the baseline prediction for
   * the baseline example. For classification models, this holds the baseline
   * prediction for the baseline example for the argmax class.
   * </pre>
   *
   * <code>float baseline_score = 5;</code>
   *
   * @return The baselineScore.
   */
  float getBaselineScore();
}
