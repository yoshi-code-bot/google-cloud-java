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

// [START aiplatform_v1_generated_JobService_SearchModelDeploymentMonitoringStatsAnomalies_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.aiplatform.v1.JobServiceClient;
import com.google.cloud.aiplatform.v1.ModelDeploymentMonitoringJobName;
import com.google.cloud.aiplatform.v1.ModelMonitoringStatsAnomalies;
import com.google.cloud.aiplatform.v1.SearchModelDeploymentMonitoringStatsAnomaliesRequest;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;

public class AsyncSearchModelDeploymentMonitoringStatsAnomalies {

  public static void main(String[] args) throws Exception {
    asyncSearchModelDeploymentMonitoringStatsAnomalies();
  }

  public static void asyncSearchModelDeploymentMonitoringStatsAnomalies() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      SearchModelDeploymentMonitoringStatsAnomaliesRequest request =
          SearchModelDeploymentMonitoringStatsAnomaliesRequest.newBuilder()
              .setModelDeploymentMonitoringJob(
                  ModelDeploymentMonitoringJobName.of(
                          "[PROJECT]", "[LOCATION]", "[MODEL_DEPLOYMENT_MONITORING_JOB]")
                      .toString())
              .setDeployedModelId("deployedModelId-1817547906")
              .setFeatureDisplayName("featureDisplayName-1741181545")
              .addAllObjectives(
                  new ArrayList<
                      SearchModelDeploymentMonitoringStatsAnomaliesRequest
                          .StatsAnomaliesObjective>())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setStartTime(Timestamp.newBuilder().build())
              .setEndTime(Timestamp.newBuilder().build())
              .build();
      ApiFuture<ModelMonitoringStatsAnomalies> future =
          jobServiceClient
              .searchModelDeploymentMonitoringStatsAnomaliesPagedCallable()
              .futureCall(request);
      // Do something.
      for (ModelMonitoringStatsAnomalies element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END aiplatform_v1_generated_JobService_SearchModelDeploymentMonitoringStatsAnomalies_async]
