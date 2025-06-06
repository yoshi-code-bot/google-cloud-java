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
// source: google/cloud/tasks/v2beta3/task.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.tasks.v2beta3;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/tasks/v2beta3/task.proto\022"
          + "\032google.cloud.tasks.v2beta3\032\031google/api/"
          + "resource.proto\032\'google/cloud/tasks/v2bet"
          + "a3/target.proto\032\036google/protobuf/duratio"
          + "n.proto\032\037google/protobuf/timestamp.proto"
          + "\032\027google/rpc/status.proto\"\216\006\n\004Task\022\014\n\004na"
          + "me\030\001 \001(\t\022S\n\027app_engine_http_request\030\003 \001("
          + "\01320.google.cloud.tasks.v2beta3.AppEngine"
          + "HttpRequestH\000\022?\n\014http_request\030\013 \001(\0132\'.go"
          + "ogle.cloud.tasks.v2beta3.HttpRequestH\000\022?"
          + "\n\014pull_message\030\r \001(\0132\'.google.cloud.task"
          + "s.v2beta3.PullMessageH\000\0221\n\rschedule_time"
          + "\030\004 \001(\0132\032.google.protobuf.Timestamp\022/\n\013cr"
          + "eate_time\030\005 \001(\0132\032.google.protobuf.Timest"
          + "amp\0224\n\021dispatch_deadline\030\014 \001(\0132\031.google."
          + "protobuf.Duration\022\026\n\016dispatch_count\030\006 \001("
          + "\005\022\026\n\016response_count\030\007 \001(\005\022:\n\rfirst_attem"
          + "pt\030\010 \001(\0132#.google.cloud.tasks.v2beta3.At"
          + "tempt\0229\n\014last_attempt\030\t \001(\0132#.google.clo"
          + "ud.tasks.v2beta3.Attempt\0223\n\004view\030\n \001(\0162%"
          + ".google.cloud.tasks.v2beta3.Task.View\"1\n"
          + "\004View\022\024\n\020VIEW_UNSPECIFIED\020\000\022\t\n\005BASIC\020\001\022\010"
          + "\n\004FULL\020\002:h\352Ae\n\036cloudtasks.googleapis.com"
          + "/Task\022Cprojects/{project}/locations/{loc"
          + "ation}/queues/{queue}/tasks/{task}B\016\n\014pa"
          + "yload_type\"\317\001\n\007Attempt\0221\n\rschedule_time\030"
          + "\001 \001(\0132\032.google.protobuf.Timestamp\0221\n\rdis"
          + "patch_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tamp\0221\n\rresponse_time\030\003 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022+\n\017response_status\030\004 \001(\013"
          + "2\022.google.rpc.StatusBr\n\036com.google.cloud"
          + ".tasks.v2beta3B\tTaskProtoP\001ZCcloud.googl"
          + "e.com/go/cloudtasks/apiv2beta3/cloudtask"
          + "spb;cloudtaskspbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta3_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineHttpRequest",
              "HttpRequest",
              "PullMessage",
              "ScheduleTime",
              "CreateTime",
              "DispatchDeadline",
              "DispatchCount",
              "ResponseCount",
              "FirstAttempt",
              "LastAttempt",
              "View",
              "PayloadType",
            });
    internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "DispatchTime", "ResponseTime", "ResponseStatus",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
