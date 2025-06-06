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
// source: google/cloud/batch/v1alpha/notification.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.batch.v1alpha;

public interface NotificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.Notification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Pub/Sub topic where notifications like the resource allowance
   * state changes will be published. The topic must exist in the same project
   * as the job and billings will be charged to this project. If not specified,
   * no Pub/Sub messages will be sent. Topic format:
   * `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();

  /**
   *
   *
   * <pre>
   * Required. The Pub/Sub topic where notifications like the resource allowance
   * state changes will be published. The topic must exist in the same project
   * as the job and billings will be charged to this project. If not specified,
   * no Pub/Sub messages will be sent. Topic format:
   * `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string pubsub_topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();
}
