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
// source: google/cloud/storageinsights/v1/storageinsights.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.storageinsights.v1;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.storageinsights.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If true, `storageinsights.googleapis.com/ReportConfig` resource is
   * available at the location.
   * </pre>
   *
   * <code>bool report_config_available = 1;</code>
   *
   * @return The reportConfigAvailable.
   */
  boolean getReportConfigAvailable();

  /**
   *
   *
   * <pre>
   * If true, `storageinsights.googleapis.com/DatasetConfig` resource is
   * available at the location.
   * </pre>
   *
   * <code>bool dataset_config_available = 2;</code>
   *
   * @return The datasetConfigAvailable.
   */
  boolean getDatasetConfigAvailable();
}
