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

package com.google.cloud.aiplatform.v1beta1.samples;

// [START aiplatform_v1beta1_generated_PredictionService_CountTokens_sync]
import com.google.cloud.aiplatform.v1beta1.Content;
import com.google.cloud.aiplatform.v1beta1.CountTokensRequest;
import com.google.cloud.aiplatform.v1beta1.CountTokensResponse;
import com.google.cloud.aiplatform.v1beta1.EndpointName;
import com.google.cloud.aiplatform.v1beta1.PredictionServiceClient;
import com.google.protobuf.Value;
import java.util.ArrayList;

public class SyncCountTokens {

  public static void main(String[] args) throws Exception {
    syncCountTokens();
  }

  public static void syncCountTokens() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (PredictionServiceClient predictionServiceClient = PredictionServiceClient.create()) {
      CountTokensRequest request =
          CountTokensRequest.newBuilder()
              .setEndpoint(
                  EndpointName.ofProjectLocationEndpointName(
                          "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
                      .toString())
              .setModel("model104069929")
              .addAllInstances(new ArrayList<Value>())
              .addAllContents(new ArrayList<Content>())
              .build();
      CountTokensResponse response = predictionServiceClient.countTokens(request);
    }
  }
}
// [END aiplatform_v1beta1_generated_PredictionService_CountTokens_sync]
