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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tasks.v2beta2;

public interface AcknowledgeTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.AcknowledgeTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the scheduleTime field is set.
   */
  boolean hasScheduleTime();

  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The scheduleTime.
   */
  com.google.protobuf.Timestamp getScheduleTime();

  /**
   *
   *
   * <pre>
   * Required. The task's current schedule time, available in the
   * [schedule_time][google.cloud.tasks.v2beta2.Task.schedule_time] returned by
   * [LeaseTasks][google.cloud.tasks.v2beta2.CloudTasks.LeaseTasks] response or
   * [RenewLease][google.cloud.tasks.v2beta2.CloudTasks.RenewLease] response.
   * This restriction is to ensure that your worker currently holds the lease.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp schedule_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getScheduleTimeOrBuilder();
}
