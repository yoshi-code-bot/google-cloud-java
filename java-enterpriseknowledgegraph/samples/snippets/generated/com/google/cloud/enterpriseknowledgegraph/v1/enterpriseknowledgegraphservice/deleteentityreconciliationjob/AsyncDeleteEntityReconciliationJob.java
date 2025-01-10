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

package com.google.cloud.enterpriseknowledgegraph.v1.samples;

// [START enterpriseknowledgegraph_v1_generated_EnterpriseKnowledgeGraphService_DeleteEntityReconciliationJob_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.enterpriseknowledgegraph.v1.DeleteEntityReconciliationJobRequest;
import com.google.cloud.enterpriseknowledgegraph.v1.EnterpriseKnowledgeGraphServiceClient;
import com.google.cloud.enterpriseknowledgegraph.v1.EntityReconciliationJobName;
import com.google.protobuf.Empty;

public class AsyncDeleteEntityReconciliationJob {

  public static void main(String[] args) throws Exception {
    asyncDeleteEntityReconciliationJob();
  }

  public static void asyncDeleteEntityReconciliationJob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
        EnterpriseKnowledgeGraphServiceClient.create()) {
      DeleteEntityReconciliationJobRequest request =
          DeleteEntityReconciliationJobRequest.newBuilder()
              .setName(
                  EntityReconciliationJobName.of(
                          "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
                      .toString())
              .build();
      ApiFuture<Empty> future =
          enterpriseKnowledgeGraphServiceClient
              .deleteEntityReconciliationJobCallable()
              .futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END enterpriseknowledgegraph_v1_generated_EnterpriseKnowledgeGraphService_DeleteEntityReconciliationJob_async]
