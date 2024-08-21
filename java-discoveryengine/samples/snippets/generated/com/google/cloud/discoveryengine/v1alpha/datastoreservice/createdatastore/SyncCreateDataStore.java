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

package com.google.cloud.discoveryengine.v1alpha.samples;

// [START discoveryengine_v1alpha_generated_DataStoreService_CreateDataStore_sync]
import com.google.cloud.discoveryengine.v1alpha.CollectionName;
import com.google.cloud.discoveryengine.v1alpha.CreateDataStoreRequest;
import com.google.cloud.discoveryengine.v1alpha.DataStore;
import com.google.cloud.discoveryengine.v1alpha.DataStoreServiceClient;

public class SyncCreateDataStore {

  public static void main(String[] args) throws Exception {
    syncCreateDataStore();
  }

  public static void syncCreateDataStore() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataStoreServiceClient dataStoreServiceClient = DataStoreServiceClient.create()) {
      CreateDataStoreRequest request =
          CreateDataStoreRequest.newBuilder()
              .setParent(CollectionName.of("[PROJECT]", "[LOCATION]", "[COLLECTION]").toString())
              .setDataStore(DataStore.newBuilder().build())
              .setDataStoreId("dataStoreId929489618")
              .setCreateAdvancedSiteSearch(true)
              .setSkipDefaultSchemaCreation(true)
              .build();
      DataStore response = dataStoreServiceClient.createDataStoreAsync(request).get();
    }
  }
}
// [END discoveryengine_v1alpha_generated_DataStoreService_CreateDataStore_sync]
