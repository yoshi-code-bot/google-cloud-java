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
// source: google/cloud/recommendationengine/v1beta1/import.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommendationengine.v1beta1;

public interface ImportUserEventsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ImportUserEventsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required.
   * `projects/1234/locations/global/catalogs/default_catalog/eventStores/default_event_store`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. Unique identifier provided by client, within the ancestor
   * dataset scope. Ensures idempotency for expensive long running operations.
   * Server-generated if unspecified. Up to 128 characters long. This is
   * returned as google.longrunning.Operation.name in the response. Note that
   * this field must not be set if the desired input config is
   * catalog_inline_source.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();

  /**
   *
   *
   * <pre>
   * Optional. Unique identifier provided by client, within the ancestor
   * dataset scope. Ensures idempotency for expensive long running operations.
   * Server-generated if unspecified. Up to 128 characters long. This is
   * returned as google.longrunning.Operation.name in the response. Note that
   * this field must not be set if the desired input config is
   * catalog_inline_source.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  boolean hasInputConfig();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  com.google.cloud.recommendationengine.v1beta1.InputConfig getInputConfig();

  /**
   *
   *
   * <pre>
   * Required. The desired input location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the errorsConfig field is set.
   */
  boolean hasErrorsConfig();

  /**
   *
   *
   * <pre>
   * Optional. The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The errorsConfig.
   */
  com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfig getErrorsConfig();

  /**
   *
   *
   * <pre>
   * Optional. The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>
   * .google.cloud.recommendationengine.v1beta1.ImportErrorsConfig errors_config = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.recommendationengine.v1beta1.ImportErrorsConfigOrBuilder
      getErrorsConfigOrBuilder();
}
