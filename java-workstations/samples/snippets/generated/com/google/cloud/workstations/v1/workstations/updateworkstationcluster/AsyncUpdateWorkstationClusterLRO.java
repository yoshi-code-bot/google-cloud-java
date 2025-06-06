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

package com.google.cloud.workstations.v1.samples;

// [START workstations_v1_generated_Workstations_UpdateWorkstationCluster_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.workstations.v1.OperationMetadata;
import com.google.cloud.workstations.v1.UpdateWorkstationClusterRequest;
import com.google.cloud.workstations.v1.WorkstationCluster;
import com.google.cloud.workstations.v1.WorkstationsClient;
import com.google.protobuf.FieldMask;

public class AsyncUpdateWorkstationClusterLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateWorkstationClusterLRO();
  }

  public static void asyncUpdateWorkstationClusterLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WorkstationsClient workstationsClient = WorkstationsClient.create()) {
      UpdateWorkstationClusterRequest request =
          UpdateWorkstationClusterRequest.newBuilder()
              .setWorkstationCluster(WorkstationCluster.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setValidateOnly(true)
              .setAllowMissing(true)
              .build();
      OperationFuture<WorkstationCluster, OperationMetadata> future =
          workstationsClient.updateWorkstationClusterOperationCallable().futureCall(request);
      // Do something.
      WorkstationCluster response = future.get();
    }
  }
}
// [END workstations_v1_generated_Workstations_UpdateWorkstationCluster_LRO_async]
