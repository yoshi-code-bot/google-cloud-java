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

package com.google.maps.fleetengine.v1.samples;

// [START fleetengine_v1_generated_VehicleService_SearchVehicles_sync]
import com.google.maps.fleetengine.v1.RequestHeader;
import com.google.maps.fleetengine.v1.SearchVehiclesRequest;
import com.google.maps.fleetengine.v1.SearchVehiclesResponse;
import com.google.maps.fleetengine.v1.TerminalLocation;
import com.google.maps.fleetengine.v1.TripType;
import com.google.maps.fleetengine.v1.Vehicle;
import com.google.maps.fleetengine.v1.VehicleAttribute;
import com.google.maps.fleetengine.v1.VehicleAttributeList;
import com.google.maps.fleetengine.v1.VehicleServiceClient;
import com.google.protobuf.Duration;
import java.util.ArrayList;

public class SyncSearchVehicles {

  public static void main(String[] args) throws Exception {
    syncSearchVehicles();
  }

  public static void syncSearchVehicles() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (VehicleServiceClient vehicleServiceClient = VehicleServiceClient.create()) {
      SearchVehiclesRequest request =
          SearchVehiclesRequest.newBuilder()
              .setHeader(RequestHeader.newBuilder().build())
              .setParent("parent-995424086")
              .setPickupPoint(TerminalLocation.newBuilder().build())
              .setDropoffPoint(TerminalLocation.newBuilder().build())
              .setPickupRadiusMeters(-254656044)
              .setCount(94851343)
              .setMinimumCapacity(518841803)
              .addAllTripTypes(new ArrayList<TripType>())
              .setMaximumStaleness(Duration.newBuilder().build())
              .addAllVehicleTypes(new ArrayList<Vehicle.VehicleType>())
              .addAllRequiredAttributes(new ArrayList<VehicleAttribute>())
              .addAllRequiredOneOfAttributes(new ArrayList<VehicleAttributeList>())
              .addAllRequiredOneOfAttributeSets(new ArrayList<VehicleAttributeList>())
              .setIncludeBackToBack(true)
              .setTripId("tripId-865466336")
              .setFilter("filter-1274492040")
              .build();
      SearchVehiclesResponse response = vehicleServiceClient.searchVehicles(request);
    }
  }
}
// [END fleetengine_v1_generated_VehicleService_SearchVehicles_sync]
