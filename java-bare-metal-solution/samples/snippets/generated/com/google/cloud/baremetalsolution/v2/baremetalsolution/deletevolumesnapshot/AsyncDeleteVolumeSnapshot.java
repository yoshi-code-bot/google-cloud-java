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

package com.google.cloud.baremetalsolution.v2.samples;

// [START baremetalsolution_v2_generated_BareMetalSolution_DeleteVolumeSnapshot_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.baremetalsolution.v2.BareMetalSolutionClient;
import com.google.cloud.baremetalsolution.v2.DeleteVolumeSnapshotRequest;
import com.google.cloud.baremetalsolution.v2.VolumeSnapshotName;
import com.google.protobuf.Empty;

public class AsyncDeleteVolumeSnapshot {

  public static void main(String[] args) throws Exception {
    asyncDeleteVolumeSnapshot();
  }

  public static void asyncDeleteVolumeSnapshot() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BareMetalSolutionClient bareMetalSolutionClient = BareMetalSolutionClient.create()) {
      DeleteVolumeSnapshotRequest request =
          DeleteVolumeSnapshotRequest.newBuilder()
              .setName(
                  VolumeSnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]")
                      .toString())
              .build();
      ApiFuture<Empty> future =
          bareMetalSolutionClient.deleteVolumeSnapshotCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END baremetalsolution_v2_generated_BareMetalSolution_DeleteVolumeSnapshot_async]
