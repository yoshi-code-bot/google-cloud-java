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

package com.google.cloud.beyondcorp.clientconnectorservices.v1.samples;

// [START beyondcorp_v1_generated_ClientConnectorServicesService_CreateClientConnectorService_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService;
import com.google.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServicesServiceClient;
import com.google.cloud.beyondcorp.clientconnectorservices.v1.CreateClientConnectorServiceRequest;
import com.google.cloud.beyondcorp.clientconnectorservices.v1.LocationName;
import com.google.longrunning.Operation;

public class AsyncCreateClientConnectorService {

  public static void main(String[] args) throws Exception {
    asyncCreateClientConnectorService();
  }

  public static void asyncCreateClientConnectorService() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClientConnectorServicesServiceClient clientConnectorServicesServiceClient =
        ClientConnectorServicesServiceClient.create()) {
      CreateClientConnectorServiceRequest request =
          CreateClientConnectorServiceRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setClientConnectorServiceId("clientConnectorServiceId766123022")
              .setClientConnectorService(ClientConnectorService.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .build();
      ApiFuture<Operation> future =
          clientConnectorServicesServiceClient
              .createClientConnectorServiceCallable()
              .futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END beyondcorp_v1_generated_ClientConnectorServicesService_CreateClientConnectorService_async]
