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

// [START analyticsadmin_v1alpha_generated_AnalyticsAdminService_CreateRollupProperty_async]
import com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient;
import com.google.analytics.admin.v1alpha.CreateRollupPropertyRequest;
import com.google.analytics.admin.v1alpha.CreateRollupPropertyResponse;
import com.google.analytics.admin.v1alpha.Property;
import com.google.api.core.ApiFuture;
import java.util.ArrayList;

public class AsyncCreateRollupProperty {

  public static void main(String[] args) throws Exception {
    asyncCreateRollupProperty();
  }

  public static void asyncCreateRollupProperty() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsAdminServiceClient analyticsAdminServiceClient =
        AnalyticsAdminServiceClient.create()) {
      CreateRollupPropertyRequest request =
          CreateRollupPropertyRequest.newBuilder()
              .setRollupProperty(Property.newBuilder().build())
              .addAllSourceProperties(new ArrayList<String>())
              .build();
      ApiFuture<CreateRollupPropertyResponse> future =
          analyticsAdminServiceClient.createRollupPropertyCallable().futureCall(request);
      // Do something.
      CreateRollupPropertyResponse response = future.get();
    }
  }
}
// [END analyticsadmin_v1alpha_generated_AnalyticsAdminService_CreateRollupProperty_async]
