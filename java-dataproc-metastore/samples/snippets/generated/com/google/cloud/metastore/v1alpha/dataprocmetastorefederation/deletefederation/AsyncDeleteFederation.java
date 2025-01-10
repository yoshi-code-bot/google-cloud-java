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

package com.google.cloud.metastore.v1alpha.samples;

// [START metastore_v1alpha_generated_DataprocMetastoreFederation_DeleteFederation_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.metastore.v1alpha.DataprocMetastoreFederationClient;
import com.google.cloud.metastore.v1alpha.DeleteFederationRequest;
import com.google.cloud.metastore.v1alpha.FederationName;
import com.google.longrunning.Operation;

public class AsyncDeleteFederation {

  public static void main(String[] args) throws Exception {
    asyncDeleteFederation();
  }

  public static void asyncDeleteFederation() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataprocMetastoreFederationClient dataprocMetastoreFederationClient =
        DataprocMetastoreFederationClient.create()) {
      DeleteFederationRequest request =
          DeleteFederationRequest.newBuilder()
              .setName(FederationName.of("[PROJECT]", "[LOCATION]", "[FEDERATION]").toString())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          dataprocMetastoreFederationClient.deleteFederationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END metastore_v1alpha_generated_DataprocMetastoreFederation_DeleteFederation_async]
