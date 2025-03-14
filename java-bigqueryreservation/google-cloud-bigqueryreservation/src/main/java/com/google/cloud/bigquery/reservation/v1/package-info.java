/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to BigQuery Reservation API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= ReservationServiceClient =======================
 *
 * <p>Service Description: This API allows users to manage their BigQuery reservations.
 *
 * <p>A reservation provides computational resource guarantees, in the form of
 * [slots](https://cloud.google.com/bigquery/docs/slots), to users. A slot is a unit of
 * computational power in BigQuery, and serves as the basic unit of parallelism. In a scan of a
 * multi-partitioned table, a single slot operates on a single partition of the table. A reservation
 * resource exists as a child resource of the admin project and location, e.g.:
 * `projects/myproject/locations/US/reservations/reservationName`.
 *
 * <p>A capacity commitment is a way to purchase compute capacity for BigQuery jobs (in the form of
 * slots) with some committed period of usage. A capacity commitment resource exists as a child
 * resource of the admin project and location, e.g.:
 * `projects/myproject/locations/US/capacityCommitments/id`.
 *
 * <p>Sample for ReservationServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (ReservationServiceClient reservationServiceClient = ReservationServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Reservation reservation = Reservation.newBuilder().build();
 *   String reservationId = "reservationId1116965383";
 *   Reservation response =
 *       reservationServiceClient.createReservation(parent, reservation, reservationId);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.bigquery.reservation.v1;

import javax.annotation.Generated;
