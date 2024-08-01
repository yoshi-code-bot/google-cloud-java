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

package com.google.cloud.video.livestream.v1.samples;

// [START livestream_v1_generated_LivestreamService_ListClips_sync]
import com.google.cloud.video.livestream.v1.ChannelName;
import com.google.cloud.video.livestream.v1.Clip;
import com.google.cloud.video.livestream.v1.ListClipsRequest;
import com.google.cloud.video.livestream.v1.LivestreamServiceClient;

public class SyncListClips {

  public static void main(String[] args) throws Exception {
    syncListClips();
  }

  public static void syncListClips() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LivestreamServiceClient livestreamServiceClient = LivestreamServiceClient.create()) {
      ListClipsRequest request =
          ListClipsRequest.newBuilder()
              .setParent(ChannelName.of("[PROJECT]", "[LOCATION]", "[CHANNEL]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (Clip element : livestreamServiceClient.listClips(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END livestream_v1_generated_LivestreamService_ListClips_sync]
