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

package com.google.cloud.netapp.v1.samples;

// [START netapp_v1_generated_NetApp_UpdateReplication_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.netapp.v1.NetAppClient;
import com.google.cloud.netapp.v1.OperationMetadata;
import com.google.cloud.netapp.v1.Replication;
import com.google.cloud.netapp.v1.UpdateReplicationRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateReplicationLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateReplicationLRO();
  }

  public static void asyncUpdateReplicationLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetAppClient netAppClient = NetAppClient.create()) {
      UpdateReplicationRequest request =
          UpdateReplicationRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setReplication(Replication.newBuilder().build())
              .build();
      OperationFuture<Replication, OperationMetadata> future =
          netAppClient.updateReplicationOperationCallable().futureCall(request);
      // Do something.
      Replication response = future.get();
    }
  }
}
// [END netapp_v1_generated_NetApp_UpdateReplication_LRO_async]
