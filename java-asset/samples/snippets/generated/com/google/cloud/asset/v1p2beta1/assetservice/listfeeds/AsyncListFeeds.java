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

package com.google.cloud.asset.v1p2beta1.samples;

// [START cloudasset_v1p2beta1_generated_AssetService_ListFeeds_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.asset.v1p2beta1.AssetServiceClient;
import com.google.cloud.asset.v1p2beta1.ListFeedsRequest;
import com.google.cloud.asset.v1p2beta1.ListFeedsResponse;

public class AsyncListFeeds {

  public static void main(String[] args) throws Exception {
    asyncListFeeds();
  }

  public static void asyncListFeeds() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
      ListFeedsRequest request =
          ListFeedsRequest.newBuilder().setParent("parent-995424086").build();
      ApiFuture<ListFeedsResponse> future =
          assetServiceClient.listFeedsCallable().futureCall(request);
      // Do something.
      ListFeedsResponse response = future.get();
    }
  }
}
// [END cloudasset_v1p2beta1_generated_AssetService_ListFeeds_async]
