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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_GenAiTuningService_RebaseTunedModel_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.aiplatform.v1.GcsDestination;
import com.google.cloud.aiplatform.v1.GenAiTuningServiceClient;
import com.google.cloud.aiplatform.v1.LocationName;
import com.google.cloud.aiplatform.v1.RebaseTunedModelOperationMetadata;
import com.google.cloud.aiplatform.v1.RebaseTunedModelRequest;
import com.google.cloud.aiplatform.v1.TunedModelRef;
import com.google.cloud.aiplatform.v1.TuningJob;

public class AsyncRebaseTunedModelLRO {

  public static void main(String[] args) throws Exception {
    asyncRebaseTunedModelLRO();
  }

  public static void asyncRebaseTunedModelLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GenAiTuningServiceClient genAiTuningServiceClient = GenAiTuningServiceClient.create()) {
      RebaseTunedModelRequest request =
          RebaseTunedModelRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setTunedModelRef(TunedModelRef.newBuilder().build())
              .setTuningJob(TuningJob.newBuilder().build())
              .setArtifactDestination(GcsDestination.newBuilder().build())
              .setDeployToSameEndpoint(true)
              .build();
      OperationFuture<TuningJob, RebaseTunedModelOperationMetadata> future =
          genAiTuningServiceClient.rebaseTunedModelOperationCallable().futureCall(request);
      // Do something.
      TuningJob response = future.get();
    }
  }
}
// [END aiplatform_v1_generated_GenAiTuningService_RebaseTunedModel_LRO_async]
