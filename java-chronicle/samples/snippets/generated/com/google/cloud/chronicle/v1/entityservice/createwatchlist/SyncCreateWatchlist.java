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

package com.google.cloud.chronicle.v1.samples;

// [START chronicle_v1_generated_EntityService_CreateWatchlist_sync]
import com.google.cloud.chronicle.v1.CreateWatchlistRequest;
import com.google.cloud.chronicle.v1.EntityServiceClient;
import com.google.cloud.chronicle.v1.InstanceName;
import com.google.cloud.chronicle.v1.Watchlist;

public class SyncCreateWatchlist {

  public static void main(String[] args) throws Exception {
    syncCreateWatchlist();
  }

  public static void syncCreateWatchlist() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EntityServiceClient entityServiceClient = EntityServiceClient.create()) {
      CreateWatchlistRequest request =
          CreateWatchlistRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setWatchlistId("watchlistId1560983528")
              .setWatchlist(Watchlist.newBuilder().build())
              .build();
      Watchlist response = entityServiceClient.createWatchlist(request);
    }
  }
}
// [END chronicle_v1_generated_EntityService_CreateWatchlist_sync]
