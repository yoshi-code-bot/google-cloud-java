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

package com.google.cloud.bigqueryconnection.v1.samples;

// [START bigqueryconnection_v1_generated_ConnectionService_CreateConnection_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.connection.v1.Connection;
import com.google.cloud.bigquery.connection.v1.CreateConnectionRequest;
import com.google.cloud.bigquery.connection.v1.LocationName;
import com.google.cloud.bigqueryconnection.v1.ConnectionServiceClient;

public class AsyncCreateConnection {

  public static void main(String[] args) throws Exception {
    asyncCreateConnection();
  }

  public static void asyncCreateConnection() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConnectionServiceClient connectionServiceClient = ConnectionServiceClient.create()) {
      CreateConnectionRequest request =
          CreateConnectionRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setConnectionId("connectionId1923106969")
              .setConnection(Connection.newBuilder().build())
              .build();
      ApiFuture<Connection> future =
          connectionServiceClient.createConnectionCallable().futureCall(request);
      // Do something.
      Connection response = future.get();
    }
  }
}
// [END bigqueryconnection_v1_generated_ConnectionService_CreateConnection_async]
