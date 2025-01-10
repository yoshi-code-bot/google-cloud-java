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

package com.google.cloud.visionai.v1.samples;

// [START visionai_v1_generated_Warehouse_ListDataSchemas_Paged_async]
import com.google.cloud.visionai.v1.CorpusName;
import com.google.cloud.visionai.v1.DataSchema;
import com.google.cloud.visionai.v1.ListDataSchemasRequest;
import com.google.cloud.visionai.v1.ListDataSchemasResponse;
import com.google.cloud.visionai.v1.WarehouseClient;
import com.google.common.base.Strings;

public class AsyncListDataSchemasPaged {

  public static void main(String[] args) throws Exception {
    asyncListDataSchemasPaged();
  }

  public static void asyncListDataSchemasPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WarehouseClient warehouseClient = WarehouseClient.create()) {
      ListDataSchemasRequest request =
          ListDataSchemasRequest.newBuilder()
              .setParent(CorpusName.of("[PROJECT_NUMBER]", "[LOCATION]", "[CORPUS]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListDataSchemasResponse response = warehouseClient.listDataSchemasCallable().call(request);
        for (DataSchema element : response.getDataSchemasList()) {
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
// [END visionai_v1_generated_Warehouse_ListDataSchemas_Paged_async]
