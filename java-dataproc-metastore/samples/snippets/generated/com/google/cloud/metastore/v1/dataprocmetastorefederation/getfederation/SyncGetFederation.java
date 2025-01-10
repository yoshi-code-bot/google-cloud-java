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

package com.google.cloud.metastore.v1.samples;

// [START metastore_v1_generated_DataprocMetastoreFederation_GetFederation_sync]
import com.google.cloud.metastore.v1.DataprocMetastoreFederationClient;
import com.google.cloud.metastore.v1.Federation;
import com.google.cloud.metastore.v1.FederationName;
import com.google.cloud.metastore.v1.GetFederationRequest;

public class SyncGetFederation {

  public static void main(String[] args) throws Exception {
    syncGetFederation();
  }

  public static void syncGetFederation() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DataprocMetastoreFederationClient dataprocMetastoreFederationClient =
        DataprocMetastoreFederationClient.create()) {
      GetFederationRequest request =
          GetFederationRequest.newBuilder()
              .setName(FederationName.of("[PROJECT]", "[LOCATION]", "[FEDERATION]").toString())
              .build();
      Federation response = dataprocMetastoreFederationClient.getFederation(request);
    }
  }
}
// [END metastore_v1_generated_DataprocMetastoreFederation_GetFederation_sync]
