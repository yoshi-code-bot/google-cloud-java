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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.edgecontainer.v1;

public interface MaintenanceWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.MaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   *
   * @return Whether the recurringWindow field is set.
   */
  boolean hasRecurringWindow();

  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   *
   * @return The recurringWindow.
   */
  com.google.cloud.edgecontainer.v1.RecurringTimeWindow getRecurringWindow();

  /**
   *
   *
   * <pre>
   * Configuration of a recurring maintenance window.
   * </pre>
   *
   * <code>.google.cloud.edgecontainer.v1.RecurringTimeWindow recurring_window = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.RecurringTimeWindowOrBuilder getRecurringWindowOrBuilder();
}
