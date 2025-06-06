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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.reservation.v1;

public interface CreateReservationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.CreateReservationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project, location. E.g.,
   * `projects/myproject/locations/US`
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
   * Required. Project, location. E.g.,
   * `projects/myproject/locations/US`
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
   * The reservation ID. It must only contain lower case alphanumeric
   * characters or dashes. It must start with a letter and must not end
   * with a dash. Its maximum length is 64 characters.
   * </pre>
   *
   * <code>string reservation_id = 2;</code>
   *
   * @return The reservationId.
   */
  java.lang.String getReservationId();

  /**
   *
   *
   * <pre>
   * The reservation ID. It must only contain lower case alphanumeric
   * characters or dashes. It must start with a letter and must not end
   * with a dash. Its maximum length is 64 characters.
   * </pre>
   *
   * <code>string reservation_id = 2;</code>
   *
   * @return The bytes for reservationId.
   */
  com.google.protobuf.ByteString getReservationIdBytes();

  /**
   *
   *
   * <pre>
   * Definition of the new reservation to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 3;</code>
   *
   * @return Whether the reservation field is set.
   */
  boolean hasReservation();

  /**
   *
   *
   * <pre>
   * Definition of the new reservation to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 3;</code>
   *
   * @return The reservation.
   */
  com.google.cloud.bigquery.reservation.v1.Reservation getReservation();

  /**
   *
   *
   * <pre>
   * Definition of the new reservation to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Reservation reservation = 3;</code>
   */
  com.google.cloud.bigquery.reservation.v1.ReservationOrBuilder getReservationOrBuilder();
}
