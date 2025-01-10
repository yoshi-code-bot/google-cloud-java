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

package com.google.cloud.datacatalog.lineage.v1.samples;

// [START datalineage_v1_generated_Lineage_ListRuns_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.lineage.v1.LineageClient;
import com.google.cloud.datacatalog.lineage.v1.ListRunsRequest;
import com.google.cloud.datacatalog.lineage.v1.ProcessName;
import com.google.cloud.datacatalog.lineage.v1.Run;

public class AsyncListRuns {

  public static void main(String[] args) throws Exception {
    asyncListRuns();
  }

  public static void asyncListRuns() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LineageClient lineageClient = LineageClient.create()) {
      ListRunsRequest request =
          ListRunsRequest.newBuilder()
              .setParent(ProcessName.of("[PROJECT]", "[LOCATION]", "[PROCESS]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Run> future = lineageClient.listRunsPagedCallable().futureCall(request);
      // Do something.
      for (Run element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END datalineage_v1_generated_Lineage_ListRuns_async]
