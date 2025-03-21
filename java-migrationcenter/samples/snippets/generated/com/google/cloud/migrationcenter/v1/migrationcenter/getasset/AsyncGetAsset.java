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

package com.google.cloud.migrationcenter.v1.samples;

// [START migrationcenter_v1_generated_MigrationCenter_GetAsset_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.migrationcenter.v1.Asset;
import com.google.cloud.migrationcenter.v1.AssetName;
import com.google.cloud.migrationcenter.v1.AssetView;
import com.google.cloud.migrationcenter.v1.GetAssetRequest;
import com.google.cloud.migrationcenter.v1.MigrationCenterClient;

public class AsyncGetAsset {

  public static void main(String[] args) throws Exception {
    asyncGetAsset();
  }

  public static void asyncGetAsset() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MigrationCenterClient migrationCenterClient = MigrationCenterClient.create()) {
      GetAssetRequest request =
          GetAssetRequest.newBuilder()
              .setName(AssetName.of("[PROJECT]", "[LOCATION]", "[ASSET]").toString())
              .setView(AssetView.forNumber(0))
              .build();
      ApiFuture<Asset> future = migrationCenterClient.getAssetCallable().futureCall(request);
      // Do something.
      Asset response = future.get();
    }
  }
}
// [END migrationcenter_v1_generated_MigrationCenter_GetAsset_async]
