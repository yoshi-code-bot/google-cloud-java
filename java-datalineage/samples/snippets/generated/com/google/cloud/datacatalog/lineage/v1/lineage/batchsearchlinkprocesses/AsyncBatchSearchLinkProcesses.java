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

// [START datalineage_v1_generated_Lineage_BatchSearchLinkProcesses_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.datacatalog.lineage.v1.BatchSearchLinkProcessesRequest;
import com.google.cloud.datacatalog.lineage.v1.LineageClient;
import com.google.cloud.datacatalog.lineage.v1.LocationName;
import com.google.cloud.datacatalog.lineage.v1.ProcessLinks;
import java.util.ArrayList;

public class AsyncBatchSearchLinkProcesses {

  public static void main(String[] args) throws Exception {
    asyncBatchSearchLinkProcesses();
  }

  public static void asyncBatchSearchLinkProcesses() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (LineageClient lineageClient = LineageClient.create()) {
      BatchSearchLinkProcessesRequest request =
          BatchSearchLinkProcessesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .addAllLinks(new ArrayList<String>())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<ProcessLinks> future =
          lineageClient.batchSearchLinkProcessesPagedCallable().futureCall(request);
      // Do something.
      for (ProcessLinks element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END datalineage_v1_generated_Lineage_BatchSearchLinkProcesses_async]
