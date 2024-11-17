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

package com.google.maps.fleetengine.v1.samples;

// [START fleetengine_v1_generated_VehicleService_UpdateVehicleAttributes_async]
import com.google.api.core.ApiFuture;
import com.google.maps.fleetengine.v1.RequestHeader;
import com.google.maps.fleetengine.v1.UpdateVehicleAttributesRequest;
import com.google.maps.fleetengine.v1.UpdateVehicleAttributesResponse;
import com.google.maps.fleetengine.v1.VehicleAttribute;
import com.google.maps.fleetengine.v1.VehicleServiceClient;
import java.util.ArrayList;

public class AsyncUpdateVehicleAttributes {

  public static void main(String[] args) throws Exception {
    asyncUpdateVehicleAttributes();
  }

  public static void asyncUpdateVehicleAttributes() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VehicleServiceClient vehicleServiceClient = VehicleServiceClient.create()) {
      UpdateVehicleAttributesRequest request =
          UpdateVehicleAttributesRequest.newBuilder()
              .setHeader(RequestHeader.newBuilder().build())
              .setName("name3373707")
              .addAllAttributes(new ArrayList<VehicleAttribute>())
              .build();
      ApiFuture<UpdateVehicleAttributesResponse> future =
          vehicleServiceClient.updateVehicleAttributesCallable().futureCall(request);
      // Do something.
      UpdateVehicleAttributesResponse response = future.get();
    }
  }
}
// [END fleetengine_v1_generated_VehicleService_UpdateVehicleAttributes_async]
