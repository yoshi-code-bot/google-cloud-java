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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface TimePeriodOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.TimePeriod)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The start of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * Required. The start of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The startTime.
   */
  com.google.type.TimeOfDay getStartTime();

  /**
   *
   *
   * <pre>
   * Required. The start of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay start_time = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.TimeOfDayOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The end of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * Required. The end of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endTime.
   */
  com.google.type.TimeOfDay getEndTime();

  /**
   *
   *
   * <pre>
   * Required. The end of the time period.
   * </pre>
   *
   * <code>.google.type.TimeOfDay end_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.type.TimeOfDayOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The days of the week that the time period is active.
   * </pre>
   *
   * <code>repeated .google.type.DayOfWeek days = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the days.
   */
  java.util.List<com.google.type.DayOfWeek> getDaysList();

  /**
   *
   *
   * <pre>
   * Required. The days of the week that the time period is active.
   * </pre>
   *
   * <code>repeated .google.type.DayOfWeek days = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of days.
   */
  int getDaysCount();

  /**
   *
   *
   * <pre>
   * Required. The days of the week that the time period is active.
   * </pre>
   *
   * <code>repeated .google.type.DayOfWeek days = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The days at the given index.
   */
  com.google.type.DayOfWeek getDays(int index);

  /**
   *
   *
   * <pre>
   * Required. The days of the week that the time period is active.
   * </pre>
   *
   * <code>repeated .google.type.DayOfWeek days = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for days.
   */
  java.util.List<java.lang.Integer> getDaysValueList();

  /**
   *
   *
   * <pre>
   * Required. The days of the week that the time period is active.
   * </pre>
   *
   * <code>repeated .google.type.DayOfWeek days = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of days at the given index.
   */
  int getDaysValue(int index);
}
