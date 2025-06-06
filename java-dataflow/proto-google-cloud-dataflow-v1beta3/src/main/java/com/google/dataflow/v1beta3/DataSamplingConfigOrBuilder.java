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
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

public interface DataSamplingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.DataSamplingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of given sampling behaviors to enable. For example, specifying
   * behaviors = [ALWAYS_ON] samples in-flight elements but does not sample
   * exceptions. Can be used to specify multiple behaviors like,
   * behaviors = [ALWAYS_ON, EXCEPTIONS] for specifying periodic sampling and
   * exception sampling.
   *
   * If DISABLED is in the list, then sampling will be disabled and ignore the
   * other given behaviors.
   *
   * Ordering does not matter.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior behaviors = 1;
   * </code>
   *
   * @return A list containing the behaviors.
   */
  java.util.List<com.google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior>
      getBehaviorsList();

  /**
   *
   *
   * <pre>
   * List of given sampling behaviors to enable. For example, specifying
   * behaviors = [ALWAYS_ON] samples in-flight elements but does not sample
   * exceptions. Can be used to specify multiple behaviors like,
   * behaviors = [ALWAYS_ON, EXCEPTIONS] for specifying periodic sampling and
   * exception sampling.
   *
   * If DISABLED is in the list, then sampling will be disabled and ignore the
   * other given behaviors.
   *
   * Ordering does not matter.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior behaviors = 1;
   * </code>
   *
   * @return The count of behaviors.
   */
  int getBehaviorsCount();

  /**
   *
   *
   * <pre>
   * List of given sampling behaviors to enable. For example, specifying
   * behaviors = [ALWAYS_ON] samples in-flight elements but does not sample
   * exceptions. Can be used to specify multiple behaviors like,
   * behaviors = [ALWAYS_ON, EXCEPTIONS] for specifying periodic sampling and
   * exception sampling.
   *
   * If DISABLED is in the list, then sampling will be disabled and ignore the
   * other given behaviors.
   *
   * Ordering does not matter.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior behaviors = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The behaviors at the given index.
   */
  com.google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior getBehaviors(int index);

  /**
   *
   *
   * <pre>
   * List of given sampling behaviors to enable. For example, specifying
   * behaviors = [ALWAYS_ON] samples in-flight elements but does not sample
   * exceptions. Can be used to specify multiple behaviors like,
   * behaviors = [ALWAYS_ON, EXCEPTIONS] for specifying periodic sampling and
   * exception sampling.
   *
   * If DISABLED is in the list, then sampling will be disabled and ignore the
   * other given behaviors.
   *
   * Ordering does not matter.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior behaviors = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for behaviors.
   */
  java.util.List<java.lang.Integer> getBehaviorsValueList();

  /**
   *
   *
   * <pre>
   * List of given sampling behaviors to enable. For example, specifying
   * behaviors = [ALWAYS_ON] samples in-flight elements but does not sample
   * exceptions. Can be used to specify multiple behaviors like,
   * behaviors = [ALWAYS_ON, EXCEPTIONS] for specifying periodic sampling and
   * exception sampling.
   *
   * If DISABLED is in the list, then sampling will be disabled and ignore the
   * other given behaviors.
   *
   * Ordering does not matter.
   * </pre>
   *
   * <code>repeated .google.dataflow.v1beta3.DataSamplingConfig.DataSamplingBehavior behaviors = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of behaviors at the given index.
   */
  int getBehaviorsValue(int index);
}
