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

package com.google.maps.places.v1.samples;

// [START places_v1_generated_Places_SearchNearby_async]
import com.google.api.core.ApiFuture;
import com.google.maps.places.v1.PlacesClient;
import com.google.maps.places.v1.RoutingParameters;
import com.google.maps.places.v1.SearchNearbyRequest;
import com.google.maps.places.v1.SearchNearbyResponse;
import java.util.ArrayList;

public class AsyncSearchNearby {

  public static void main(String[] args) throws Exception {
    asyncSearchNearby();
  }

  public static void asyncSearchNearby() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PlacesClient placesClient = PlacesClient.create()) {
      SearchNearbyRequest request =
          SearchNearbyRequest.newBuilder()
              .setLanguageCode("languageCode-2092349083")
              .setRegionCode("regionCode-1991004415")
              .addAllIncludedTypes(new ArrayList<String>())
              .addAllExcludedTypes(new ArrayList<String>())
              .addAllIncludedPrimaryTypes(new ArrayList<String>())
              .addAllExcludedPrimaryTypes(new ArrayList<String>())
              .setMaxResultCount(-1736124056)
              .setLocationRestriction(SearchNearbyRequest.LocationRestriction.newBuilder().build())
              .setRoutingParameters(RoutingParameters.newBuilder().build())
              .build();
      ApiFuture<SearchNearbyResponse> future =
          placesClient.searchNearbyCallable().futureCall(request);
      // Do something.
      SearchNearbyResponse response = future.get();
    }
  }
}
// [END places_v1_generated_Places_SearchNearby_async]
