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

package com.google.cloud.chronicle.v1.samples;

// [START chronicle_v1_generated_RuleService_ListRetrohunts_Paged_async]
import com.google.cloud.chronicle.v1.ListRetrohuntsRequest;
import com.google.cloud.chronicle.v1.ListRetrohuntsResponse;
import com.google.cloud.chronicle.v1.Retrohunt;
import com.google.cloud.chronicle.v1.RuleName;
import com.google.cloud.chronicle.v1.RuleServiceClient;
import com.google.common.base.Strings;

public class AsyncListRetrohuntsPaged {

  public static void main(String[] args) throws Exception {
    asyncListRetrohuntsPaged();
  }

  public static void asyncListRetrohuntsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RuleServiceClient ruleServiceClient = RuleServiceClient.create()) {
      ListRetrohuntsRequest request =
          ListRetrohuntsRequest.newBuilder()
              .setParent(RuleName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]", "[RULE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .build();
      while (true) {
        ListRetrohuntsResponse response = ruleServiceClient.listRetrohuntsCallable().call(request);
        for (Retrohunt element : response.getRetrohuntsList()) {
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
// [END chronicle_v1_generated_RuleService_ListRetrohunts_Paged_async]
