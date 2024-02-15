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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_FeatureOnlineStoreService_FetchFeatureValues_sync]
import com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceClient;
import com.google.cloud.aiplatform.v1.FeatureViewDataFormat;
import com.google.cloud.aiplatform.v1.FeatureViewDataKey;
import com.google.cloud.aiplatform.v1.FeatureViewName;
import com.google.cloud.aiplatform.v1.FetchFeatureValuesRequest;
import com.google.cloud.aiplatform.v1.FetchFeatureValuesResponse;

public class SyncFetchFeatureValues {

  public static void main(String[] args) throws Exception {
    syncFetchFeatureValues();
  }

  public static void syncFetchFeatureValues() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (FeatureOnlineStoreServiceClient featureOnlineStoreServiceClient =
        FeatureOnlineStoreServiceClient.create()) {
      FetchFeatureValuesRequest request =
          FetchFeatureValuesRequest.newBuilder()
              .setFeatureView(
                  FeatureViewName.of(
                          "[PROJECT]", "[LOCATION]", "[FEATURE_ONLINE_STORE]", "[FEATURE_VIEW]")
                      .toString())
              .setDataKey(FeatureViewDataKey.newBuilder().build())
              .setDataFormat(FeatureViewDataFormat.forNumber(0))
              .build();
      FetchFeatureValuesResponse response =
          featureOnlineStoreServiceClient.fetchFeatureValues(request);
    }
  }
}
// [END aiplatform_v1_generated_FeatureOnlineStoreService_FetchFeatureValues_sync]
