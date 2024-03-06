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

package com.google.cloud.dialogflow.cx.v3beta1.samples;

// [START dialogflow_v3beta1_generated_TransitionRouteGroups_ListTransitionRouteGroups_Paged_async]
import com.google.cloud.dialogflow.cx.v3beta1.FlowName;
import com.google.cloud.dialogflow.cx.v3beta1.ListTransitionRouteGroupsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListTransitionRouteGroupsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroup;
import com.google.cloud.dialogflow.cx.v3beta1.TransitionRouteGroupsClient;
import com.google.common.base.Strings;

public class AsyncListTransitionRouteGroupsPaged {

  public static void main(String[] args) throws Exception {
    asyncListTransitionRouteGroupsPaged();
  }

  public static void asyncListTransitionRouteGroupsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TransitionRouteGroupsClient transitionRouteGroupsClient =
        TransitionRouteGroupsClient.create()) {
      ListTransitionRouteGroupsRequest request =
          ListTransitionRouteGroupsRequest.newBuilder()
              .setParent(FlowName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[FLOW]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setLanguageCode("languageCode-2092349083")
              .build();
      while (true) {
        ListTransitionRouteGroupsResponse response =
            transitionRouteGroupsClient.listTransitionRouteGroupsCallable().call(request);
        for (TransitionRouteGroup element : response.getTransitionRouteGroupsList()) {
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
// [END dialogflow_v3beta1_generated_TransitionRouteGroups_ListTransitionRouteGroups_Paged_async]
