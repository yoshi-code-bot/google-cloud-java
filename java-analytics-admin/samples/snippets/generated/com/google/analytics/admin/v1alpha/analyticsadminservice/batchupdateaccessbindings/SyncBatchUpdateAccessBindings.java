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

package com.google.analytics.admin.v1alpha.samples;

// [START analyticsadmin_v1alpha_generated_AnalyticsAdminService_BatchUpdateAccessBindings_sync]
import com.google.analytics.admin.v1alpha.AccountName;
import com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient;
import com.google.analytics.admin.v1alpha.BatchUpdateAccessBindingsRequest;
import com.google.analytics.admin.v1alpha.BatchUpdateAccessBindingsResponse;
import com.google.analytics.admin.v1alpha.UpdateAccessBindingRequest;
import java.util.ArrayList;

public class SyncBatchUpdateAccessBindings {

  public static void main(String[] args) throws Exception {
    syncBatchUpdateAccessBindings();
  }

  public static void syncBatchUpdateAccessBindings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsAdminServiceClient analyticsAdminServiceClient =
        AnalyticsAdminServiceClient.create()) {
      BatchUpdateAccessBindingsRequest request =
          BatchUpdateAccessBindingsRequest.newBuilder()
              .setParent(AccountName.of("[ACCOUNT]").toString())
              .addAllRequests(new ArrayList<UpdateAccessBindingRequest>())
              .build();
      BatchUpdateAccessBindingsResponse response =
          analyticsAdminServiceClient.batchUpdateAccessBindings(request);
    }
  }
}
// [END analyticsadmin_v1alpha_generated_AnalyticsAdminService_BatchUpdateAccessBindings_sync]
