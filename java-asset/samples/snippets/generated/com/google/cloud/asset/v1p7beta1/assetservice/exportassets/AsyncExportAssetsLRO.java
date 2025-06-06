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

package com.google.cloud.asset.v1p7beta1.samples;

// [START cloudasset_v1p7beta1_generated_AssetService_ExportAssets_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.asset.v1p7beta1.AssetServiceClient;
import com.google.cloud.asset.v1p7beta1.ContentType;
import com.google.cloud.asset.v1p7beta1.ExportAssetsRequest;
import com.google.cloud.asset.v1p7beta1.ExportAssetsResponse;
import com.google.cloud.asset.v1p7beta1.OutputConfig;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;

public class AsyncExportAssetsLRO {

  public static void main(String[] args) throws Exception {
    asyncExportAssetsLRO();
  }

  public static void asyncExportAssetsLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ExportAssetsRequest request =
          ExportAssetsRequest.newBuilder()
              .setParent("ExportAssetsRequest-846449128".toString())
              .setReadTime(Timestamp.newBuilder().build())
              .addAllAssetTypes(new ArrayList<String>())
              .setContentType(ContentType.forNumber(0))
              .setOutputConfig(OutputConfig.newBuilder().build())
              .addAllRelationshipTypes(new ArrayList<String>())
              .build();
      OperationFuture<ExportAssetsResponse, ExportAssetsRequest> future =
          assetServiceClient.exportAssetsOperationCallable().futureCall(request);
      // Do something.
      ExportAssetsResponse response = future.get();
    }
  }
}
// [END cloudasset_v1p7beta1_generated_AssetService_ExportAssets_LRO_async]
