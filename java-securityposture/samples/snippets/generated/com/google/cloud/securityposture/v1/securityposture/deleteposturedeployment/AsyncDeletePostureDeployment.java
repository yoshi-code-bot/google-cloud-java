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

package com.google.cloud.securityposture.v1.samples;

// [START securityposture_v1_generated_SecurityPosture_DeletePostureDeployment_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securityposture.v1.DeletePostureDeploymentRequest;
import com.google.cloud.securityposture.v1.PostureDeploymentName;
import com.google.cloud.securityposture.v1.SecurityPostureClient;
import com.google.longrunning.Operation;

public class AsyncDeletePostureDeployment {

  public static void main(String[] args) throws Exception {
    asyncDeletePostureDeployment();
  }

  public static void asyncDeletePostureDeployment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityPostureClient securityPostureClient = SecurityPostureClient.create()) {
      DeletePostureDeploymentRequest request =
          DeletePostureDeploymentRequest.newBuilder()
              .setName(
                  PostureDeploymentName.of("[ORGANIZATION]", "[LOCATION]", "[POSTURE_DEPLOYMENT]")
                      .toString())
              .setEtag("etag3123477")
              .build();
      ApiFuture<Operation> future =
          securityPostureClient.deletePostureDeploymentCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END securityposture_v1_generated_SecurityPosture_DeletePostureDeployment_async]
