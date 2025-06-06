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

package com.google.cloud.support.v2beta.samples;

// [START cloudsupport_v2beta_generated_FeedService_ShowFeed_Paged_async]
import com.google.cloud.support.v2beta.CaseName;
import com.google.cloud.support.v2beta.FeedItem;
import com.google.cloud.support.v2beta.FeedServiceClient;
import com.google.cloud.support.v2beta.ShowFeedRequest;
import com.google.cloud.support.v2beta.ShowFeedResponse;
import com.google.common.base.Strings;

public class AsyncShowFeedPaged {

  public static void main(String[] args) throws Exception {
    asyncShowFeedPaged();
  }

  public static void asyncShowFeedPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FeedServiceClient feedServiceClient = FeedServiceClient.create()) {
      ShowFeedRequest request =
          ShowFeedRequest.newBuilder()
              .setParent(CaseName.ofProjectCaseName("[PROJECT]", "[CASE]").toString())
              .setOrderBy("orderBy-1207110587")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ShowFeedResponse response = feedServiceClient.showFeedCallable().call(request);
        for (FeedItem element : response.getFeedItemsList()) {
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
// [END cloudsupport_v2beta_generated_FeedService_ShowFeed_Paged_async]
