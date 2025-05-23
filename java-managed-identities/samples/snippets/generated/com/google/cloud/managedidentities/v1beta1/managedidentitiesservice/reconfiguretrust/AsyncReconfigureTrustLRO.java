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

package com.google.cloud.managedidentities.v1beta1.samples;

// [START managedidentities_v1beta1_generated_ManagedIdentitiesService_ReconfigureTrust_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.managedidentities.v1beta1.Domain;
import com.google.cloud.managedidentities.v1beta1.DomainName;
import com.google.cloud.managedidentities.v1beta1.ManagedIdentitiesServiceClient;
import com.google.cloud.managedidentities.v1beta1.OpMetadata;
import com.google.cloud.managedidentities.v1beta1.ReconfigureTrustRequest;
import java.util.ArrayList;

public class AsyncReconfigureTrustLRO {

  public static void main(String[] args) throws Exception {
    asyncReconfigureTrustLRO();
  }

  public static void asyncReconfigureTrustLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ManagedIdentitiesServiceClient managedIdentitiesServiceClient =
        ManagedIdentitiesServiceClient.create()) {
      ReconfigureTrustRequest request =
          ReconfigureTrustRequest.newBuilder()
              .setName(DomainName.of("[PROJECT]", "[LOCATION]", "[DOMAIN]").toString())
              .setTargetDomainName("targetDomainName2065239520")
              .addAllTargetDnsIpAddresses(new ArrayList<String>())
              .build();
      OperationFuture<Domain, OpMetadata> future =
          managedIdentitiesServiceClient.reconfigureTrustOperationCallable().futureCall(request);
      // Do something.
      Domain response = future.get();
    }
  }
}
// [END managedidentities_v1beta1_generated_ManagedIdentitiesService_ReconfigureTrust_LRO_async]
