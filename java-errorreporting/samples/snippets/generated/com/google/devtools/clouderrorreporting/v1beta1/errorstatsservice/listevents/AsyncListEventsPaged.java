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

package com.google.devtools.clouderrorreporting.v1beta1.samples;

// [START clouderrorreporting_v1beta1_generated_ErrorStatsService_ListEvents_Paged_async]
import com.google.common.base.Strings;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorEvent;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceClient;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ProjectName;
import com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange;
import com.google.devtools.clouderrorreporting.v1beta1.ServiceContextFilter;

public class AsyncListEventsPaged {

  public static void main(String[] args) throws Exception {
    asyncListEventsPaged();
  }

  public static void asyncListEventsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
      ListEventsRequest request =
          ListEventsRequest.newBuilder()
              .setProjectName(ProjectName.of("[PROJECT]").toString())
              .setGroupId("groupId293428218")
              .setServiceFilter(ServiceContextFilter.newBuilder().build())
              .setTimeRange(QueryTimeRange.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListEventsResponse response = errorStatsServiceClient.listEventsCallable().call(request);
        for (ErrorEvent element : response.getErrorEventsList()) {
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
// [END clouderrorreporting_v1beta1_generated_ErrorStatsService_ListEvents_Paged_async]
