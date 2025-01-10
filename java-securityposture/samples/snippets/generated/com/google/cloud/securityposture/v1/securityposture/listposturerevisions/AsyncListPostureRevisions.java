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

package com.google.cloud.securityposture.v1.samples;

// [START securityposture_v1_generated_SecurityPosture_ListPostureRevisions_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securityposture.v1.ListPostureRevisionsRequest;
import com.google.cloud.securityposture.v1.Posture;
import com.google.cloud.securityposture.v1.PostureName;
import com.google.cloud.securityposture.v1.SecurityPostureClient;

public class AsyncListPostureRevisions {

  public static void main(String[] args) throws Exception {
    asyncListPostureRevisions();
  }

  public static void asyncListPostureRevisions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityPostureClient securityPostureClient = SecurityPostureClient.create()) {
      ListPostureRevisionsRequest request =
          ListPostureRevisionsRequest.newBuilder()
              .setName(PostureName.of("[ORGANIZATION]", "[LOCATION]", "[POSTURE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Posture> future =
          securityPostureClient.listPostureRevisionsPagedCallable().futureCall(request);
      // Do something.
      for (Posture element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END securityposture_v1_generated_SecurityPosture_ListPostureRevisions_async]
