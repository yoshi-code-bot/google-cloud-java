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

package com.google.cloud.beyondcorp.clientgateways.v1.samples;

// [START beyondcorp_v1_generated_ClientGatewaysService_ListClientGateways_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.beyondcorp.clientgateways.v1.ClientGateway;
import com.google.cloud.beyondcorp.clientgateways.v1.ClientGatewaysServiceClient;
import com.google.cloud.beyondcorp.clientgateways.v1.ListClientGatewaysRequest;
import com.google.cloud.beyondcorp.clientgateways.v1.LocationName;

public class AsyncListClientGateways {

  public static void main(String[] args) throws Exception {
    asyncListClientGateways();
  }

  public static void asyncListClientGateways() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClientGatewaysServiceClient clientGatewaysServiceClient =
        ClientGatewaysServiceClient.create()) {
      ListClientGatewaysRequest request =
          ListClientGatewaysRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<ClientGateway> future =
          clientGatewaysServiceClient.listClientGatewaysPagedCallable().futureCall(request);
      // Do something.
      for (ClientGateway element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END beyondcorp_v1_generated_ClientGatewaysService_ListClientGateways_async]
