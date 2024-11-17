/*
 * Copyright 2024 Google LLC
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

package com.google.maps.fleetengine.delivery.v1.samples;

// [START fleetengine_v1_generated_DeliveryService_CreateDeliveryVehicle_async]
import com.google.api.core.ApiFuture;
import com.google.maps.fleetengine.delivery.v1.CreateDeliveryVehicleRequest;
import com.google.maps.fleetengine.delivery.v1.DeliveryRequestHeader;
import com.google.maps.fleetengine.delivery.v1.DeliveryServiceClient;
import com.google.maps.fleetengine.delivery.v1.DeliveryVehicle;

public class AsyncCreateDeliveryVehicle {

  public static void main(String[] args) throws Exception {
    asyncCreateDeliveryVehicle();
  }

  public static void asyncCreateDeliveryVehicle() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DeliveryServiceClient deliveryServiceClient = DeliveryServiceClient.create()) {
      CreateDeliveryVehicleRequest request =
          CreateDeliveryVehicleRequest.newBuilder()
              .setHeader(DeliveryRequestHeader.newBuilder().build())
              .setParent("parent-995424086")
              .setDeliveryVehicleId("deliveryVehicleId-861424685")
              .setDeliveryVehicle(DeliveryVehicle.newBuilder().build())
              .build();
      ApiFuture<DeliveryVehicle> future =
          deliveryServiceClient.createDeliveryVehicleCallable().futureCall(request);
      // Do something.
      DeliveryVehicle response = future.get();
    }
  }
}
// [END fleetengine_v1_generated_DeliveryService_CreateDeliveryVehicle_async]
