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
// source: google/maps/fleetengine/delivery/v1/tasks.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.delivery.v1;

public interface TaskTrackingViewConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.delivery.v1.TaskTrackingViewConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The field that specifies when route polyline points can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption route_polyline_points_visibility = 1;
   * </code>
   *
   * @return Whether the routePolylinePointsVisibility field is set.
   */
  boolean hasRoutePolylinePointsVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when route polyline points can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption route_polyline_points_visibility = 1;
   * </code>
   *
   * @return The routePolylinePointsVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getRoutePolylinePointsVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when route polyline points can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption route_polyline_points_visibility = 1;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getRoutePolylinePointsVisibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated arrival time can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_arrival_time_visibility = 2;
   * </code>
   *
   * @return Whether the estimatedArrivalTimeVisibility field is set.
   */
  boolean hasEstimatedArrivalTimeVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated arrival time can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_arrival_time_visibility = 2;
   * </code>
   *
   * @return The estimatedArrivalTimeVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getEstimatedArrivalTimeVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated arrival time can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_arrival_time_visibility = 2;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getEstimatedArrivalTimeVisibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated task completion time can be
   * visible. If this field is not specified, the project level default
   * visibility configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_task_completion_time_visibility = 3;
   * </code>
   *
   * @return Whether the estimatedTaskCompletionTimeVisibility field is set.
   */
  boolean hasEstimatedTaskCompletionTimeVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated task completion time can be
   * visible. If this field is not specified, the project level default
   * visibility configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_task_completion_time_visibility = 3;
   * </code>
   *
   * @return The estimatedTaskCompletionTimeVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getEstimatedTaskCompletionTimeVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when estimated task completion time can be
   * visible. If this field is not specified, the project level default
   * visibility configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption estimated_task_completion_time_visibility = 3;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getEstimatedTaskCompletionTimeVisibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining driving distance can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_driving_distance_visibility = 4;
   * </code>
   *
   * @return Whether the remainingDrivingDistanceVisibility field is set.
   */
  boolean hasRemainingDrivingDistanceVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining driving distance can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_driving_distance_visibility = 4;
   * </code>
   *
   * @return The remainingDrivingDistanceVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getRemainingDrivingDistanceVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining driving distance can be visible. If
   * this field is not specified, the project level default visibility
   * configuration for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_driving_distance_visibility = 4;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getRemainingDrivingDistanceVisibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining stop count can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_stop_count_visibility = 5;
   * </code>
   *
   * @return Whether the remainingStopCountVisibility field is set.
   */
  boolean hasRemainingStopCountVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining stop count can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_stop_count_visibility = 5;
   * </code>
   *
   * @return The remainingStopCountVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getRemainingStopCountVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when remaining stop count can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption remaining_stop_count_visibility = 5;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getRemainingStopCountVisibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * The field that specifies when vehicle location can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption vehicle_location_visibility = 6;
   * </code>
   *
   * @return Whether the vehicleLocationVisibility field is set.
   */
  boolean hasVehicleLocationVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when vehicle location can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption vehicle_location_visibility = 6;
   * </code>
   *
   * @return The vehicleLocationVisibility.
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption
      getVehicleLocationVisibility();

  /**
   *
   *
   * <pre>
   * The field that specifies when vehicle location can be visible. If this
   * field is not specified, the project level default visibility configuration
   * for this data will be used.
   * </pre>
   *
   * <code>
   * .maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOption vehicle_location_visibility = 6;
   * </code>
   */
  com.google.maps.fleetengine.delivery.v1.TaskTrackingViewConfig.VisibilityOptionOrBuilder
      getVehicleLocationVisibilityOrBuilder();
}
