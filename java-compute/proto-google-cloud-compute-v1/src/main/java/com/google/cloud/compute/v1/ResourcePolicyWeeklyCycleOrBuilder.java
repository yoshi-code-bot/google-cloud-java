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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface ResourcePolicyWeeklyCycleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyWeeklyCycle)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek>
      getDayOfWeeksList();

  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek getDayOfWeeks(int index);

  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  int getDayOfWeeksCount();

  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder>
      getDayOfWeeksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Up to 7 intervals/windows, one for each day of the week.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeek day_of_weeks = 257871834;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicyWeeklyCycleDayOfWeekOrBuilder getDayOfWeeksOrBuilder(
      int index);
}
