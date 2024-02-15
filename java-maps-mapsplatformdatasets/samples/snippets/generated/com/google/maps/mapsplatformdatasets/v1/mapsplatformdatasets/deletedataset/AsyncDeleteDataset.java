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

// [START mapsplatformdatasets_v1_generated_MapsPlatformDatasets_DeleteDataset_async]
import com.google.api.core.ApiFuture;
import com.google.maps.mapsplatformdatasets.v1.DatasetName;
import com.google.maps.mapsplatformdatasets.v1.DeleteDatasetRequest;
import com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsClient;
import com.google.protobuf.Empty;

public class AsyncDeleteDataset {

  public static void main(String[] args) throws Exception {
    asyncDeleteDataset();
  }

  public static void asyncDeleteDataset() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MapsPlatformDatasetsClient mapsPlatformDatasetsClient =
        MapsPlatformDatasetsClient.create()) {
      DeleteDatasetRequest request =
          DeleteDatasetRequest.newBuilder()
              .setName(DatasetName.of("[PROJECT]", "[DATASET]").toString())
              .build();
      ApiFuture<Empty> future =
          mapsPlatformDatasetsClient.deleteDatasetCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END mapsplatformdatasets_v1_generated_MapsPlatformDatasets_DeleteDataset_async]
