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

package com.google.cloud.bigquery.connection.v1beta1.samples;

// [START bigqueryconnection_v1beta1_generated_ConnectionService_GetConnection_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.connection.v1beta1.ConnectionName;
import com.google.cloud.bigquery.connection.v1beta1.ConnectionProto;
import com.google.cloud.bigquery.connection.v1beta1.ConnectionServiceClient;

public class AsyncGetConnection {

  public static void main(String[] args) throws Exception {
    asyncGetConnection();
  }

  public static void asyncGetConnection() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConnectionServiceClient connectionServiceClient = ConnectionServiceClient.create()) {
      ConnectionProto.GetConnectionRequest request =
          ConnectionProto.GetConnectionRequest.newBuilder()
              .setName(ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
              .build();
      ApiFuture<ConnectionProto.Connection> future =
          connectionServiceClient.getConnectionCallable().futureCall(request);
      // Do something.
      ConnectionProto.Connection response = future.get();
    }
  }
}
// [END bigqueryconnection_v1beta1_generated_ConnectionService_GetConnection_async]
