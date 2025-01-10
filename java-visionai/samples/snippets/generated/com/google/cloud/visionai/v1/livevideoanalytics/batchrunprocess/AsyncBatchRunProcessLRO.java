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

package com.google.cloud.visionai.v1.samples;

// [START visionai_v1_generated_LiveVideoAnalytics_BatchRunProcess_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.visionai.v1.BatchRunProcessRequest;
import com.google.cloud.visionai.v1.BatchRunProcessResponse;
import com.google.cloud.visionai.v1.ClusterName;
import com.google.cloud.visionai.v1.CreateProcessRequest;
import com.google.cloud.visionai.v1.LiveVideoAnalyticsClient;
import com.google.cloud.visionai.v1.OperationMetadata;
import java.util.ArrayList;

public class AsyncBatchRunProcessLRO {

  public static void main(String[] args) throws Exception {
    asyncBatchRunProcessLRO();
  }

  public static void asyncBatchRunProcessLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LiveVideoAnalyticsClient liveVideoAnalyticsClient = LiveVideoAnalyticsClient.create()) {
      BatchRunProcessRequest request =
          BatchRunProcessRequest.newBuilder()
              .setParent(ClusterName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]").toString())
              .addAllRequests(new ArrayList<CreateProcessRequest>())
              .setOptions(BatchRunProcessRequest.BatchRunProcessOptions.newBuilder().build())
              .setBatchId("batchId-331744779")
              .build();
      OperationFuture<BatchRunProcessResponse, OperationMetadata> future =
          liveVideoAnalyticsClient.batchRunProcessOperationCallable().futureCall(request);
      // Do something.
      BatchRunProcessResponse response = future.get();
    }
  }
}
// [END visionai_v1_generated_LiveVideoAnalytics_BatchRunProcess_LRO_async]
