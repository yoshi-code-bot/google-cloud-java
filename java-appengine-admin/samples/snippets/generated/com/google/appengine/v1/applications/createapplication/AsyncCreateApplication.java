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

package com.google.appengine.v1.samples;

// [START appengine_v1_generated_Applications_CreateApplication_async]
import com.google.api.core.ApiFuture;
import com.google.appengine.v1.Application;
import com.google.appengine.v1.ApplicationsClient;
import com.google.appengine.v1.CreateApplicationRequest;
import com.google.longrunning.Operation;

public class AsyncCreateApplication {

  public static void main(String[] args) throws Exception {
    asyncCreateApplication();
  }

  public static void asyncCreateApplication() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ApplicationsClient applicationsClient = ApplicationsClient.create()) {
      CreateApplicationRequest request =
          CreateApplicationRequest.newBuilder()
              .setApplication(Application.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          applicationsClient.createApplicationCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END appengine_v1_generated_Applications_CreateApplication_async]
