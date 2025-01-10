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

package com.google.cloud.compute.v1.samples;

// [START compute_v1_generated_Reservations_Update_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Reservation;
import com.google.cloud.compute.v1.ReservationsClient;
import com.google.cloud.compute.v1.UpdateReservationRequest;

public class AsyncUpdateLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateLRO();
  }

  public static void asyncUpdateLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ReservationsClient reservationsClient = ReservationsClient.create()) {
      UpdateReservationRequest request =
          UpdateReservationRequest.newBuilder()
              .setPaths("paths106438894")
              .setProject("project-309310695")
              .setRequestId("requestId693933066")
              .setReservation("reservation-1563081780")
              .setReservationResource(Reservation.newBuilder().build())
              .setUpdateMask("updateMask-296147115")
              .setZone("zone3744684")
              .build();
      OperationFuture<Operation, Operation> future =
          reservationsClient.updateOperationCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END compute_v1_generated_Reservations_Update_LRO_async]
