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

package com.google.maps.mapsplatformdatasets.v1.samples;

// [START mapsplatformdatasets_v1_generated_MapsPlatformDatasets_ListDatasets_Paged_async]
import com.google.common.base.Strings;
import com.google.maps.mapsplatformdatasets.v1.Dataset;
import com.google.maps.mapsplatformdatasets.v1.ListDatasetsRequest;
import com.google.maps.mapsplatformdatasets.v1.ListDatasetsResponse;
import com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsClient;
import com.google.maps.mapsplatformdatasets.v1.ProjectName;

public class AsyncListDatasetsPaged {

  public static void main(String[] args) throws Exception {
    asyncListDatasetsPaged();
  }

  public static void asyncListDatasetsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MapsPlatformDatasetsClient mapsPlatformDatasetsClient =
        MapsPlatformDatasetsClient.create()) {
      ListDatasetsRequest request =
          ListDatasetsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setTag("tag114586")
              .build();
      while (true) {
        ListDatasetsResponse response =
            mapsPlatformDatasetsClient.listDatasetsCallable().call(request);
        for (Dataset element : response.getDatasetsList()) {
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
// [END mapsplatformdatasets_v1_generated_MapsPlatformDatasets_ListDatasets_Paged_async]
