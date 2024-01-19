/*
 * Copyright 2023 Google LLC
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

package com.google.apps.meet.v2beta.samples;

// [START meet_v2beta_generated_ConferenceRecordsService_ListRecordings_Paged_async]
import com.google.apps.meet.v2beta.ConferenceRecordName;
import com.google.apps.meet.v2beta.ConferenceRecordsServiceClient;
import com.google.apps.meet.v2beta.ListRecordingsRequest;
import com.google.apps.meet.v2beta.ListRecordingsResponse;
import com.google.apps.meet.v2beta.Recording;
import com.google.common.base.Strings;

public class AsyncListRecordingsPaged {

  public static void main(String[] args) throws Exception {
    asyncListRecordingsPaged();
  }

  public static void asyncListRecordingsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConferenceRecordsServiceClient conferenceRecordsServiceClient =
        ConferenceRecordsServiceClient.create()) {
      ListRecordingsRequest request =
          ListRecordingsRequest.newBuilder()
              .setParent(ConferenceRecordName.of("[CONFERENCE_RECORD]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListRecordingsResponse response =
            conferenceRecordsServiceClient.listRecordingsCallable().call(request);
        for (Recording element : response.getRecordingsList()) {
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
// [END meet_v2beta_generated_ConferenceRecordsService_ListRecordings_Paged_async]
