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

package com.google.cloud.iap.v1.samples;

// [START iap_v1_generated_IdentityAwareProxyOAuthService_CreateIdentityAwareProxyClient_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.iap.v1.CreateIdentityAwareProxyClientRequest;
import com.google.cloud.iap.v1.IdentityAwareProxyClient;
import com.google.cloud.iap.v1.IdentityAwareProxyOAuthServiceClient;

public class AsyncCreateIdentityAwareProxyClient {

  public static void main(String[] args) throws Exception {
    asyncCreateIdentityAwareProxyClient();
  }

  public static void asyncCreateIdentityAwareProxyClient() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (IdentityAwareProxyOAuthServiceClient identityAwareProxyOAuthServiceClient =
        IdentityAwareProxyOAuthServiceClient.create()) {
      CreateIdentityAwareProxyClientRequest request =
          CreateIdentityAwareProxyClientRequest.newBuilder()
              .setParent("parent-995424086")
              .setIdentityAwareProxyClient(IdentityAwareProxyClient.newBuilder().build())
              .build();
      ApiFuture<IdentityAwareProxyClient> future =
          identityAwareProxyOAuthServiceClient
              .createIdentityAwareProxyClientCallable()
              .futureCall(request);
      // Do something.
      IdentityAwareProxyClient response = future.get();
    }
  }
}
// [END iap_v1_generated_IdentityAwareProxyOAuthService_CreateIdentityAwareProxyClient_async]
