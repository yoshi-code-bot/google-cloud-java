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
// source: google/cloud/dataproc/v1/shared.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface AutotuningConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.AutotuningConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Scenarios for which tunings are applied.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AutotuningConfig.Scenario scenarios = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the scenarios.
   */
  java.util.List<com.google.cloud.dataproc.v1.AutotuningConfig.Scenario> getScenariosList();

  /**
   *
   *
   * <pre>
   * Optional. Scenarios for which tunings are applied.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AutotuningConfig.Scenario scenarios = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of scenarios.
   */
  int getScenariosCount();

  /**
   *
   *
   * <pre>
   * Optional. Scenarios for which tunings are applied.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AutotuningConfig.Scenario scenarios = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The scenarios at the given index.
   */
  com.google.cloud.dataproc.v1.AutotuningConfig.Scenario getScenarios(int index);

  /**
   *
   *
   * <pre>
   * Optional. Scenarios for which tunings are applied.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AutotuningConfig.Scenario scenarios = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for scenarios.
   */
  java.util.List<java.lang.Integer> getScenariosValueList();

  /**
   *
   *
   * <pre>
   * Optional. Scenarios for which tunings are applied.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.AutotuningConfig.Scenario scenarios = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of scenarios at the given index.
   */
  int getScenariosValue(int index);
}
