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
// source: google/ads/admanager/v1/ad_unit_messages.proto

// Protobuf Java Version: 3.25.8
package com.google.ads.admanager.v1;

public interface AdUnitSizeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.AdUnitSize)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Size of the AdUnit.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.Size size = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the size field is set.
   */
  boolean hasSize();

  /**
   *
   *
   * <pre>
   * Required. The Size of the AdUnit.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.Size size = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The size.
   */
  com.google.ads.admanager.v1.Size getSize();

  /**
   *
   *
   * <pre>
   * Required. The Size of the AdUnit.
   * </pre>
   *
   * <code>.google.ads.admanager.v1.Size size = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.admanager.v1.SizeOrBuilder getSizeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The EnvironmentType of the AdUnit
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType environment_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for environmentType.
   */
  int getEnvironmentTypeValue();

  /**
   *
   *
   * <pre>
   * Required. The EnvironmentType of the AdUnit
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType environment_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The environmentType.
   */
  com.google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType getEnvironmentType();

  /**
   *
   *
   * <pre>
   * The companions for this ad unit size. Companions are only valid if the
   * environment is
   * [VIDEO_PLAYER][google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType].
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Size companions = 3;</code>
   */
  java.util.List<com.google.ads.admanager.v1.Size> getCompanionsList();

  /**
   *
   *
   * <pre>
   * The companions for this ad unit size. Companions are only valid if the
   * environment is
   * [VIDEO_PLAYER][google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType].
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Size companions = 3;</code>
   */
  com.google.ads.admanager.v1.Size getCompanions(int index);

  /**
   *
   *
   * <pre>
   * The companions for this ad unit size. Companions are only valid if the
   * environment is
   * [VIDEO_PLAYER][google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType].
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Size companions = 3;</code>
   */
  int getCompanionsCount();

  /**
   *
   *
   * <pre>
   * The companions for this ad unit size. Companions are only valid if the
   * environment is
   * [VIDEO_PLAYER][google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType].
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Size companions = 3;</code>
   */
  java.util.List<? extends com.google.ads.admanager.v1.SizeOrBuilder> getCompanionsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The companions for this ad unit size. Companions are only valid if the
   * environment is
   * [VIDEO_PLAYER][google.ads.admanager.v1.EnvironmentTypeEnum.EnvironmentType].
   * </pre>
   *
   * <code>repeated .google.ads.admanager.v1.Size companions = 3;</code>
   */
  com.google.ads.admanager.v1.SizeOrBuilder getCompanionsOrBuilder(int index);
}
