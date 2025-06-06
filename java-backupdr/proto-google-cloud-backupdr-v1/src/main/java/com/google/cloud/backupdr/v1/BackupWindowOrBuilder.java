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
// source: google/cloud/backupdr/v1/backupplan.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface BackupWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.BackupWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The hour of day (0-23) when the window starts for e.g. if value
   * of start hour of day is 6 that mean backup window start at 6:00.
   * </pre>
   *
   * <code>int32 start_hour_of_day = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The startHourOfDay.
   */
  int getStartHourOfDay();

  /**
   *
   *
   * <pre>
   * Required. The hour of day (1-24) when the window end for e.g. if value of
   * end hour of day is 10 that mean backup window end time is 10:00.
   *
   * End hour of day should be greater than start hour of day.
   * 0 &lt;= start_hour_of_day &lt; end_hour_of_day &lt;= 24
   *
   * End hour of day is not include in backup window that mean if
   * end_hour_of_day= 10 jobs should start before 10:00.
   * </pre>
   *
   * <code>int32 end_hour_of_day = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The endHourOfDay.
   */
  int getEndHourOfDay();
}
