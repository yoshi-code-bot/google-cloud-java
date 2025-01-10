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

package com.google.cloud.contentwarehouse.v1.samples;

// [START contentwarehouse_v1_generated_PipelineService_RunPipeline_sync]
import com.google.cloud.contentwarehouse.v1.LocationName;
import com.google.cloud.contentwarehouse.v1.PipelineServiceClient;
import com.google.cloud.contentwarehouse.v1.RequestMetadata;
import com.google.cloud.contentwarehouse.v1.RunPipelineRequest;
import com.google.cloud.contentwarehouse.v1.RunPipelineResponse;

public class SyncRunPipeline {

  public static void main(String[] args) throws Exception {
    syncRunPipeline();
  }

  public static void syncRunPipeline() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PipelineServiceClient pipelineServiceClient = PipelineServiceClient.create()) {
      RunPipelineRequest request =
          RunPipelineRequest.newBuilder()
              .setName(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setRequestMetadata(RequestMetadata.newBuilder().build())
              .build();
      RunPipelineResponse response = pipelineServiceClient.runPipelineAsync(request).get();
    }
  }
}
// [END contentwarehouse_v1_generated_PipelineService_RunPipeline_sync]
