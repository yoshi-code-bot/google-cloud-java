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

package com.google.cloud.bigquery.connection.v1beta1.samples;

// [START bigqueryconnection_v1beta1_generated_ConnectionService_ListConnections_sync]
import com.google.cloud.bigquery.connection.v1beta1.ConnectionProto;
import com.google.cloud.bigquery.connection.v1beta1.ConnectionServiceClient;
import com.google.cloud.bigquery.connection.v1beta1.LocationName;
import com.google.protobuf.UInt32Value;

public class SyncListConnections {

  public static void main(String[] args) throws Exception {
    syncListConnections();
  }

  public static void syncListConnections() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConnectionServiceClient connectionServiceClient = ConnectionServiceClient.create()) {
      ConnectionProto.ListConnectionsRequest request =
          ConnectionProto.ListConnectionsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setMaxResults(UInt32Value.newBuilder().build())
              .setPageToken("pageToken873572522")
              .build();
      ConnectionProto.ListConnectionsResponse response =
          connectionServiceClient.listConnections(request);
    }
  }
}
// [END bigqueryconnection_v1beta1_generated_ConnectionService_ListConnections_sync]
