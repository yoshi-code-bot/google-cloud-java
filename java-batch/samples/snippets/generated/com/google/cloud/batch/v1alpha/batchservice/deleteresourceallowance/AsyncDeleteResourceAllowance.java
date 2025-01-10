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

package com.google.cloud.batch.v1alpha.samples;

// [START batch_v1alpha_generated_BatchService_DeleteResourceAllowance_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.batch.v1alpha.BatchServiceClient;
import com.google.cloud.batch.v1alpha.DeleteResourceAllowanceRequest;
import com.google.cloud.batch.v1alpha.ResourceAllowanceName;
import com.google.longrunning.Operation;

public class AsyncDeleteResourceAllowance {

  public static void main(String[] args) throws Exception {
    asyncDeleteResourceAllowance();
  }

  public static void asyncDeleteResourceAllowance() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BatchServiceClient batchServiceClient = BatchServiceClient.create()) {
      DeleteResourceAllowanceRequest request =
          DeleteResourceAllowanceRequest.newBuilder()
              .setName(
                  ResourceAllowanceName.of("[PROJECT]", "[LOCATION]", "[RESOURCE_ALLOWANCE]")
                      .toString())
              .setReason("reason-934964668")
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future =
          batchServiceClient.deleteResourceAllowanceCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END batch_v1alpha_generated_BatchService_DeleteResourceAllowance_async]
