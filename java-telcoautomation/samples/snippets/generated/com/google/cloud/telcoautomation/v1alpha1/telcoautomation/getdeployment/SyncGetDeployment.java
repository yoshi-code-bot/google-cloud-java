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

package com.google.cloud.telcoautomation.v1alpha1.samples;

// [START telcoautomation_v1alpha1_generated_TelcoAutomation_GetDeployment_sync]
import com.google.cloud.telcoautomation.v1alpha1.Deployment;
import com.google.cloud.telcoautomation.v1alpha1.DeploymentName;
import com.google.cloud.telcoautomation.v1alpha1.DeploymentView;
import com.google.cloud.telcoautomation.v1alpha1.GetDeploymentRequest;
import com.google.cloud.telcoautomation.v1alpha1.TelcoAutomationClient;

public class SyncGetDeployment {

  public static void main(String[] args) throws Exception {
    syncGetDeployment();
  }

  public static void syncGetDeployment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TelcoAutomationClient telcoAutomationClient = TelcoAutomationClient.create()) {
      GetDeploymentRequest request =
          GetDeploymentRequest.newBuilder()
              .setName(
                  DeploymentName.of(
                          "[PROJECT]", "[LOCATION]", "[ORCHESTRATION_CLUSTER]", "[DEPLOYMENT]")
                      .toString())
              .setView(DeploymentView.forNumber(0))
              .build();
      Deployment response = telcoAutomationClient.getDeployment(request);
    }
  }
}
// [END telcoautomation_v1alpha1_generated_TelcoAutomation_GetDeployment_sync]
