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

package com.google.cloud.telcoautomation.v1alpha1.samples;

// [START telcoautomation_v1alpha1_generated_TelcoAutomation_CreateOrchestrationCluster_sync]
import com.google.cloud.telcoautomation.v1alpha1.CreateOrchestrationClusterRequest;
import com.google.cloud.telcoautomation.v1alpha1.LocationName;
import com.google.cloud.telcoautomation.v1alpha1.OrchestrationCluster;
import com.google.cloud.telcoautomation.v1alpha1.TelcoAutomationClient;

public class SyncCreateOrchestrationCluster {

  public static void main(String[] args) throws Exception {
    syncCreateOrchestrationCluster();
  }

  public static void syncCreateOrchestrationCluster() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TelcoAutomationClient telcoAutomationClient = TelcoAutomationClient.create()) {
      CreateOrchestrationClusterRequest request =
          CreateOrchestrationClusterRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setOrchestrationClusterId("orchestrationClusterId75469684")
              .setOrchestrationCluster(OrchestrationCluster.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      OrchestrationCluster response =
          telcoAutomationClient.createOrchestrationClusterAsync(request).get();
    }
  }
}
// [END telcoautomation_v1alpha1_generated_TelcoAutomation_CreateOrchestrationCluster_sync]
