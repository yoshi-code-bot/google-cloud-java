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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface SchemaKeySortingStrategyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.SchemaKeySortingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Options in the front have high priority than those in the back.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SchemaKeySortingStrategy.Option options = 1;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.SchemaKeySortingStrategy.Option> getOptionsList();

  /**
   *
   *
   * <pre>
   * Options in the front have high priority than those in the back.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SchemaKeySortingStrategy.Option options = 1;</code>
   */
  com.google.cloud.visionai.v1.SchemaKeySortingStrategy.Option getOptions(int index);

  /**
   *
   *
   * <pre>
   * Options in the front have high priority than those in the back.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SchemaKeySortingStrategy.Option options = 1;</code>
   */
  int getOptionsCount();

  /**
   *
   *
   * <pre>
   * Options in the front have high priority than those in the back.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SchemaKeySortingStrategy.Option options = 1;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.SchemaKeySortingStrategy.OptionOrBuilder>
      getOptionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Options in the front have high priority than those in the back.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.SchemaKeySortingStrategy.Option options = 1;</code>
   */
  com.google.cloud.visionai.v1.SchemaKeySortingStrategy.OptionOrBuilder getOptionsOrBuilder(
      int index);
}
