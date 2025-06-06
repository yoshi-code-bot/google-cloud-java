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

package com.google.maps.mapsplatformdatasets.v1.samples;

// [START mapsplatformdatasets_v1_generated_MapsPlatformDatasets_FetchDatasetErrors_Paged_async]
import com.google.common.base.Strings;
import com.google.maps.mapsplatformdatasets.v1.DatasetName;
import com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsRequest;
import com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse;
import com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsClient;
import com.google.rpc.Status;

public class AsyncFetchDatasetErrorsPaged {

  public static void main(String[] args) throws Exception {
    asyncFetchDatasetErrorsPaged();
  }

  public static void asyncFetchDatasetErrorsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MapsPlatformDatasetsClient mapsPlatformDatasetsClient =
        MapsPlatformDatasetsClient.create()) {
      FetchDatasetErrorsRequest request =
          FetchDatasetErrorsRequest.newBuilder()
              .setDataset(DatasetName.of("[PROJECT]", "[DATASET]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        FetchDatasetErrorsResponse response =
            mapsPlatformDatasetsClient.fetchDatasetErrorsCallable().call(request);
        for (Status element : response.getErrorsList()) {
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
// [END mapsplatformdatasets_v1_generated_MapsPlatformDatasets_FetchDatasetErrors_Paged_async]
