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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_ModelMonitoringService_SearchModelMonitoringStats_Paged_async]
import com.google.cloud.aiplatform.v1beta1.ModelMonitorName;
import com.google.cloud.aiplatform.v1beta1.ModelMonitoringServiceClient;
import com.google.cloud.aiplatform.v1beta1.ModelMonitoringStats;
import com.google.cloud.aiplatform.v1beta1.SearchModelMonitoringStatsFilter;
import com.google.cloud.aiplatform.v1beta1.SearchModelMonitoringStatsRequest;
import com.google.cloud.aiplatform.v1beta1.SearchModelMonitoringStatsResponse;
import com.google.common.base.Strings;
import com.google.type.Interval;

public class AsyncSearchModelMonitoringStatsPaged {

  public static void main(String[] args) throws Exception {
    asyncSearchModelMonitoringStatsPaged();
  }

  public static void asyncSearchModelMonitoringStatsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ModelMonitoringServiceClient modelMonitoringServiceClient =
        ModelMonitoringServiceClient.create()) {
      SearchModelMonitoringStatsRequest request =
          SearchModelMonitoringStatsRequest.newBuilder()
              .setModelMonitor(
                  ModelMonitorName.of("[PROJECT]", "[LOCATION]", "[MODEL_MONITOR]").toString())
              .setStatsFilter(SearchModelMonitoringStatsFilter.newBuilder().build())
              .setTimeInterval(Interval.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        SearchModelMonitoringStatsResponse response =
            modelMonitoringServiceClient.searchModelMonitoringStatsCallable().call(request);
        for (ModelMonitoringStats element : response.getMonitoringStatsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END aiplatform_v1beta1_generated_ModelMonitoringService_SearchModelMonitoringStats_Paged_async]
