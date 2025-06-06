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
// source: google/maps/fleetengine/v1/trip_api.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

public interface CreateTripRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:maps.fleetengine.v1.CreateTripRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   *
   * @return Whether the header field is set.
   */
  boolean hasHeader();

  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   *
   * @return The header.
   */
  com.google.maps.fleetengine.v1.RequestHeader getHeader();

  /**
   *
   *
   * <pre>
   * The standard Fleet Engine request header.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.RequestHeader header = 1;</code>
   */
  com.google.maps.fleetengine.v1.RequestHeaderOrBuilder getHeaderOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. Must be in the format `providers/{provider}`.
   * The provider must be the Project ID (for example, `sample-cloud-project`)
   * of the Google Cloud Project of which the service account making
   * this call is a member.
   * </pre>
   *
   * <code>
   * string parent = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Unique Trip ID.
   * Subject to the following restrictions:
   *
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string trip_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tripId.
   */
  java.lang.String getTripId();

  /**
   *
   *
   * <pre>
   * Required. Unique Trip ID.
   * Subject to the following restrictions:
   *
   * * Must be a valid Unicode string.
   * * Limited to a maximum length of 64 characters.
   * * Normalized according to [Unicode Normalization Form C]
   * (http://www.unicode.org/reports/tr15/).
   * * May not contain any of the following ASCII characters: '/', ':', '?',
   * ',', or '#'.
   * </pre>
   *
   * <code>string trip_id = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tripId.
   */
  com.google.protobuf.ByteString getTripIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Trip entity to create.
   *
   * When creating a Trip, the following fields are required:
   *
   * * `trip_type`
   * * `pickup_point`
   *
   * The following fields are used if you provide them:
   *
   * * `number_of_passengers`
   * * `vehicle_id`
   * * `dropoff_point`
   * * `intermediate_destinations`
   * * `vehicle_waypoints`
   *
   * All other Trip fields are ignored. For example, all trips start with a
   * `trip_status` of `NEW` even if you pass in a `trip_status` of `CANCELED` in
   * the creation request.
   *
   * Only `EXCLUSIVE` trips support `intermediate_destinations`.
   *
   * When `vehicle_id` is set for a shared trip, you must supply
   * the list of `Trip.vehicle_waypoints` to specify the order of the remaining
   * waypoints for the vehicle, otherwise the waypoint order will be
   * undetermined.
   *
   * When you specify `Trip.vehicle_waypoints`, the list must contain all
   * the remaining waypoints of the vehicle's trips, with no extra waypoints.
   * You must order these waypoints such that for a given trip, the pickup
   * point is before intermediate destinations, and all intermediate
   * destinations come before the drop-off point. An `EXCLUSIVE` trip's
   * waypoints must not interleave with any other trips.
   *
   * The `trip_id`, `waypoint_type` and `location` fields are used, and all
   * other TripWaypoint fields in `vehicle_waypoints` are ignored.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Trip trip = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the trip field is set.
   */
  boolean hasTrip();

  /**
   *
   *
   * <pre>
   * Required. Trip entity to create.
   *
   * When creating a Trip, the following fields are required:
   *
   * * `trip_type`
   * * `pickup_point`
   *
   * The following fields are used if you provide them:
   *
   * * `number_of_passengers`
   * * `vehicle_id`
   * * `dropoff_point`
   * * `intermediate_destinations`
   * * `vehicle_waypoints`
   *
   * All other Trip fields are ignored. For example, all trips start with a
   * `trip_status` of `NEW` even if you pass in a `trip_status` of `CANCELED` in
   * the creation request.
   *
   * Only `EXCLUSIVE` trips support `intermediate_destinations`.
   *
   * When `vehicle_id` is set for a shared trip, you must supply
   * the list of `Trip.vehicle_waypoints` to specify the order of the remaining
   * waypoints for the vehicle, otherwise the waypoint order will be
   * undetermined.
   *
   * When you specify `Trip.vehicle_waypoints`, the list must contain all
   * the remaining waypoints of the vehicle's trips, with no extra waypoints.
   * You must order these waypoints such that for a given trip, the pickup
   * point is before intermediate destinations, and all intermediate
   * destinations come before the drop-off point. An `EXCLUSIVE` trip's
   * waypoints must not interleave with any other trips.
   *
   * The `trip_id`, `waypoint_type` and `location` fields are used, and all
   * other TripWaypoint fields in `vehicle_waypoints` are ignored.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Trip trip = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The trip.
   */
  com.google.maps.fleetengine.v1.Trip getTrip();

  /**
   *
   *
   * <pre>
   * Required. Trip entity to create.
   *
   * When creating a Trip, the following fields are required:
   *
   * * `trip_type`
   * * `pickup_point`
   *
   * The following fields are used if you provide them:
   *
   * * `number_of_passengers`
   * * `vehicle_id`
   * * `dropoff_point`
   * * `intermediate_destinations`
   * * `vehicle_waypoints`
   *
   * All other Trip fields are ignored. For example, all trips start with a
   * `trip_status` of `NEW` even if you pass in a `trip_status` of `CANCELED` in
   * the creation request.
   *
   * Only `EXCLUSIVE` trips support `intermediate_destinations`.
   *
   * When `vehicle_id` is set for a shared trip, you must supply
   * the list of `Trip.vehicle_waypoints` to specify the order of the remaining
   * waypoints for the vehicle, otherwise the waypoint order will be
   * undetermined.
   *
   * When you specify `Trip.vehicle_waypoints`, the list must contain all
   * the remaining waypoints of the vehicle's trips, with no extra waypoints.
   * You must order these waypoints such that for a given trip, the pickup
   * point is before intermediate destinations, and all intermediate
   * destinations come before the drop-off point. An `EXCLUSIVE` trip's
   * waypoints must not interleave with any other trips.
   *
   * The `trip_id`, `waypoint_type` and `location` fields are used, and all
   * other TripWaypoint fields in `vehicle_waypoints` are ignored.
   * </pre>
   *
   * <code>.maps.fleetengine.v1.Trip trip = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.maps.fleetengine.v1.TripOrBuilder getTripOrBuilder();
}
