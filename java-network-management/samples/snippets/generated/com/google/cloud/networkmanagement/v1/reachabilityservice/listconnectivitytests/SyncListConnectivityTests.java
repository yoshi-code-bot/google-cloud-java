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

package com.google.cloud.networkmanagement.v1.samples;

// [START networkmanagement_v1_generated_ReachabilityService_ListConnectivityTests_sync]
import com.google.cloud.networkmanagement.v1.ConnectivityTest;
import com.google.cloud.networkmanagement.v1.ListConnectivityTestsRequest;
import com.google.cloud.networkmanagement.v1.ProjectName;
import com.google.cloud.networkmanagement.v1.ReachabilityServiceClient;

public class SyncListConnectivityTests {

  public static void main(String[] args) throws Exception {
    syncListConnectivityTests();
  }

  public static void syncListConnectivityTests() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ReachabilityServiceClient reachabilityServiceClient = ReachabilityServiceClient.create()) {
      ListConnectivityTestsRequest request =
          ListConnectivityTestsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (ConnectivityTest element :
          reachabilityServiceClient.listConnectivityTests(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END networkmanagement_v1_generated_ReachabilityService_ListConnectivityTests_sync]
