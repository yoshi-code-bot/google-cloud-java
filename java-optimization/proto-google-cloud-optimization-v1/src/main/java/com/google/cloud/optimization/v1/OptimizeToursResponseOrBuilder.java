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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.optimization.v1;

public interface OptimizeToursResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.OptimizeToursResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Routes computed for each vehicle; the i-th route corresponds to the i-th
   * vehicle in the model.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.ShipmentRoute> getRoutesList();

  /**
   *
   *
   * <pre>
   * Routes computed for each vehicle; the i-th route corresponds to the i-th
   * vehicle in the model.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  com.google.cloud.optimization.v1.ShipmentRoute getRoutes(int index);

  /**
   *
   *
   * <pre>
   * Routes computed for each vehicle; the i-th route corresponds to the i-th
   * vehicle in the model.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  int getRoutesCount();

  /**
   *
   *
   * <pre>
   * Routes computed for each vehicle; the i-th route corresponds to the i-th
   * vehicle in the model.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.ShipmentRouteOrBuilder>
      getRoutesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Routes computed for each vehicle; the i-th route corresponds to the i-th
   * vehicle in the model.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.ShipmentRoute routes = 1;</code>
   */
  com.google.cloud.optimization.v1.ShipmentRouteOrBuilder getRoutesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Copy of the
   * [OptimizeToursRequest.label][google.cloud.optimization.v1.OptimizeToursRequest.label],
   * if a label was specified in the request.
   * </pre>
   *
   * <code>string request_label = 3;</code>
   *
   * @return The requestLabel.
   */
  java.lang.String getRequestLabel();

  /**
   *
   *
   * <pre>
   * Copy of the
   * [OptimizeToursRequest.label][google.cloud.optimization.v1.OptimizeToursRequest.label],
   * if a label was specified in the request.
   * </pre>
   *
   * <code>string request_label = 3;</code>
   *
   * @return The bytes for requestLabel.
   */
  com.google.protobuf.ByteString getRequestLabelBytes();

  /**
   *
   *
   * <pre>
   * The list of all shipments skipped.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 4;</code>
   */
  java.util.List<com.google.cloud.optimization.v1.SkippedShipment> getSkippedShipmentsList();

  /**
   *
   *
   * <pre>
   * The list of all shipments skipped.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 4;</code>
   */
  com.google.cloud.optimization.v1.SkippedShipment getSkippedShipments(int index);

  /**
   *
   *
   * <pre>
   * The list of all shipments skipped.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 4;</code>
   */
  int getSkippedShipmentsCount();

  /**
   *
   *
   * <pre>
   * The list of all shipments skipped.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 4;</code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.SkippedShipmentOrBuilder>
      getSkippedShipmentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of all shipments skipped.
   * </pre>
   *
   * <code>repeated .google.cloud.optimization.v1.SkippedShipment skipped_shipments = 4;</code>
   */
  com.google.cloud.optimization.v1.SkippedShipmentOrBuilder getSkippedShipmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of all the validation errors that we were able to detect
   * independently. See the "MULTIPLE ERRORS" explanation for the
   * [OptimizeToursValidationError][google.cloud.optimization.v1.OptimizeToursValidationError]
   * message.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError validation_errors = 5;
   * </code>
   */
  java.util.List<com.google.cloud.optimization.v1.OptimizeToursValidationError>
      getValidationErrorsList();

  /**
   *
   *
   * <pre>
   * List of all the validation errors that we were able to detect
   * independently. See the "MULTIPLE ERRORS" explanation for the
   * [OptimizeToursValidationError][google.cloud.optimization.v1.OptimizeToursValidationError]
   * message.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError validation_errors = 5;
   * </code>
   */
  com.google.cloud.optimization.v1.OptimizeToursValidationError getValidationErrors(int index);

  /**
   *
   *
   * <pre>
   * List of all the validation errors that we were able to detect
   * independently. See the "MULTIPLE ERRORS" explanation for the
   * [OptimizeToursValidationError][google.cloud.optimization.v1.OptimizeToursValidationError]
   * message.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError validation_errors = 5;
   * </code>
   */
  int getValidationErrorsCount();

  /**
   *
   *
   * <pre>
   * List of all the validation errors that we were able to detect
   * independently. See the "MULTIPLE ERRORS" explanation for the
   * [OptimizeToursValidationError][google.cloud.optimization.v1.OptimizeToursValidationError]
   * message.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError validation_errors = 5;
   * </code>
   */
  java.util.List<? extends com.google.cloud.optimization.v1.OptimizeToursValidationErrorOrBuilder>
      getValidationErrorsOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of all the validation errors that we were able to detect
   * independently. See the "MULTIPLE ERRORS" explanation for the
   * [OptimizeToursValidationError][google.cloud.optimization.v1.OptimizeToursValidationError]
   * message.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.OptimizeToursValidationError validation_errors = 5;
   * </code>
   */
  com.google.cloud.optimization.v1.OptimizeToursValidationErrorOrBuilder
      getValidationErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Duration, distance and usage metrics for this solution.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.OptimizeToursResponse.Metrics metrics = 6;</code>
   *
   * @return Whether the metrics field is set.
   */
  boolean hasMetrics();

  /**
   *
   *
   * <pre>
   * Duration, distance and usage metrics for this solution.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.OptimizeToursResponse.Metrics metrics = 6;</code>
   *
   * @return The metrics.
   */
  com.google.cloud.optimization.v1.OptimizeToursResponse.Metrics getMetrics();

  /**
   *
   *
   * <pre>
   * Duration, distance and usage metrics for this solution.
   * </pre>
   *
   * <code>.google.cloud.optimization.v1.OptimizeToursResponse.Metrics metrics = 6;</code>
   */
  com.google.cloud.optimization.v1.OptimizeToursResponse.MetricsOrBuilder getMetricsOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated: Use
   * [Metrics.total_cost][google.cloud.optimization.v1.OptimizeToursResponse.Metrics.total_cost]
   * instead. Total cost of the solution. This takes into account all costs:
   * costs per per hour and travel hour, fixed vehicle costs, unperformed
   * shipment penalty costs, global duration cost, etc.
   * </pre>
   *
   * <code>double total_cost = 2 [deprecated = true];</code>
   *
   * @deprecated google.cloud.optimization.v1.OptimizeToursResponse.total_cost is deprecated. See
   *     google/cloud/optimization/v1/fleet_routing.proto;l=433
   * @return The totalCost.
   */
  @java.lang.Deprecated
  double getTotalCost();
}
