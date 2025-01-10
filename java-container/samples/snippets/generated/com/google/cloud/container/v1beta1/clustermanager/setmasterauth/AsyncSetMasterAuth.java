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

package com.google.cloud.container.v1beta1.samples;

// [START container_v1beta1_generated_ClusterManager_SetMasterAuth_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.container.v1beta1.ClusterManagerClient;
import com.google.container.v1beta1.MasterAuth;
import com.google.container.v1beta1.Operation;
import com.google.container.v1beta1.SetMasterAuthRequest;

public class AsyncSetMasterAuth {

  public static void main(String[] args) throws Exception {
    asyncSetMasterAuth();
  }

  public static void asyncSetMasterAuth() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
      SetMasterAuthRequest request =
          SetMasterAuthRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setZone("zone3744684")
              .setClusterId("clusterId561939637")
              .setUpdate(MasterAuth.newBuilder().build())
              .setName("name3373707")
              .build();
      ApiFuture<Operation> future =
          clusterManagerClient.setMasterAuthCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END container_v1beta1_generated_ClusterManager_SetMasterAuth_async]
