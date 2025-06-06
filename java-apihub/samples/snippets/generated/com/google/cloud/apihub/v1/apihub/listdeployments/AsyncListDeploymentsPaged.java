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

package com.google.cloud.apihub.v1.samples;

// [START apihub_v1_generated_ApiHub_ListDeployments_Paged_async]
import com.google.cloud.apihub.v1.ApiHubClient;
import com.google.cloud.apihub.v1.Deployment;
import com.google.cloud.apihub.v1.ListDeploymentsRequest;
import com.google.cloud.apihub.v1.ListDeploymentsResponse;
import com.google.cloud.apihub.v1.LocationName;
import com.google.common.base.Strings;

public class AsyncListDeploymentsPaged {

  public static void main(String[] args) throws Exception {
    asyncListDeploymentsPaged();
  }

  public static void asyncListDeploymentsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ApiHubClient apiHubClient = ApiHubClient.create()) {
      ListDeploymentsRequest request =
          ListDeploymentsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListDeploymentsResponse response = apiHubClient.listDeploymentsCallable().call(request);
        for (Deployment element : response.getDeploymentsList()) {
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
// [END apihub_v1_generated_ApiHub_ListDeployments_Paged_async]
