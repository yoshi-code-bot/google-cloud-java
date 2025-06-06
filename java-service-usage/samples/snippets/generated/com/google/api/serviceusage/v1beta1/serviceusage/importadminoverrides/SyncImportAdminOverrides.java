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

package com.google.api.serviceusage.v1beta1.samples;

// [START serviceusage_v1beta1_generated_ServiceUsage_ImportAdminOverrides_sync]
import com.google.api.serviceusage.v1beta1.ImportAdminOverridesRequest;
import com.google.api.serviceusage.v1beta1.ImportAdminOverridesResponse;
import com.google.api.serviceusage.v1beta1.QuotaSafetyCheck;
import com.google.api.serviceusage.v1beta1.ServiceUsageClient;
import java.util.ArrayList;

public class SyncImportAdminOverrides {

  public static void main(String[] args) throws Exception {
    syncImportAdminOverrides();
  }

  public static void syncImportAdminOverrides() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceUsageClient serviceUsageClient = ServiceUsageClient.create()) {
      ImportAdminOverridesRequest request =
          ImportAdminOverridesRequest.newBuilder()
              .setParent("parent-995424086")
              .setForce(true)
              .addAllForceOnly(new ArrayList<QuotaSafetyCheck>())
              .build();
      ImportAdminOverridesResponse response =
          serviceUsageClient.importAdminOverridesAsync(request).get();
    }
  }
}
// [END serviceusage_v1beta1_generated_ServiceUsage_ImportAdminOverrides_sync]
