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

// [START visionai_v1_generated_LiveVideoAnalytics_DeleteAnalysis_sync]
import com.google.cloud.visionai.v1.AnalysisName;
import com.google.cloud.visionai.v1.DeleteAnalysisRequest;
import com.google.cloud.visionai.v1.LiveVideoAnalyticsClient;
import com.google.protobuf.Empty;

public class SyncDeleteAnalysis {

  public static void main(String[] args) throws Exception {
    syncDeleteAnalysis();
  }

  public static void syncDeleteAnalysis() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LiveVideoAnalyticsClient liveVideoAnalyticsClient = LiveVideoAnalyticsClient.create()) {
      DeleteAnalysisRequest request =
          DeleteAnalysisRequest.newBuilder()
              .setName(
                  AnalysisName.of("[PROJECT]", "[LOCATION]", "[CLUSTER]", "[ANALYSIS]").toString())
              .setRequestId("requestId693933066")
              .build();
      liveVideoAnalyticsClient.deleteAnalysisAsync(request).get();
    }
  }
}
// [END visionai_v1_generated_LiveVideoAnalytics_DeleteAnalysis_sync]
