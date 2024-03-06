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

package com.google.cloud.metastore.v1.samples;

// [START metastore_v1_generated_DataprocMetastore_ListMetadataImports_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.metastore.v1.DataprocMetastoreClient;
import com.google.cloud.metastore.v1.ListMetadataImportsRequest;
import com.google.cloud.metastore.v1.MetadataImport;
import com.google.cloud.metastore.v1.ServiceName;

public class AsyncListMetadataImports {

  public static void main(String[] args) throws Exception {
    asyncListMetadataImports();
  }

  public static void asyncListMetadataImports() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataprocMetastoreClient dataprocMetastoreClient = DataprocMetastoreClient.create()) {
      ListMetadataImportsRequest request =
          ListMetadataImportsRequest.newBuilder()
              .setParent(ServiceName.of("[PROJECT]", "[LOCATION]", "[SERVICE]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<MetadataImport> future =
          dataprocMetastoreClient.listMetadataImportsPagedCallable().futureCall(request);
      // Do something.
      for (MetadataImport element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END metastore_v1_generated_DataprocMetastore_ListMetadataImports_async]
