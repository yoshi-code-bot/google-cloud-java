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

package com.google.cloud.privilegedaccessmanager.v1.samples;

// [START privilegedaccessmanager_v1_generated_PrivilegedAccessManager_SearchGrants_sync]
import com.google.cloud.privilegedaccessmanager.v1.EntitlementName;
import com.google.cloud.privilegedaccessmanager.v1.Grant;
import com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessManagerClient;
import com.google.cloud.privilegedaccessmanager.v1.SearchGrantsRequest;

public class SyncSearchGrants {

  public static void main(String[] args) throws Exception {
    syncSearchGrants();
  }

  public static void syncSearchGrants() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PrivilegedAccessManagerClient privilegedAccessManagerClient =
        PrivilegedAccessManagerClient.create()) {
      SearchGrantsRequest request =
          SearchGrantsRequest.newBuilder()
              .setParent(
                  EntitlementName.ofProjectLocationEntitlementName(
                          "[PROJECT]", "[LOCATION]", "[ENTITLEMENT]")
                      .toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (Grant element : privilegedAccessManagerClient.searchGrants(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END privilegedaccessmanager_v1_generated_PrivilegedAccessManager_SearchGrants_sync]
