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

package com.google.cloud.eventarc.v1.samples;

// [START eventarc_v1_generated_Eventarc_DeleteEnrollment_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.eventarc.v1.DeleteEnrollmentRequest;
import com.google.cloud.eventarc.v1.EnrollmentName;
import com.google.cloud.eventarc.v1.EventarcClient;
import com.google.longrunning.Operation;

public class AsyncDeleteEnrollment {

  public static void main(String[] args) throws Exception {
    asyncDeleteEnrollment();
  }

  public static void asyncDeleteEnrollment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EventarcClient eventarcClient = EventarcClient.create()) {
      DeleteEnrollmentRequest request =
          DeleteEnrollmentRequest.newBuilder()
              .setName(EnrollmentName.of("[PROJECT]", "[LOCATION]", "[ENROLLMENT]").toString())
              .setEtag("etag3123477")
              .setAllowMissing(true)
              .setValidateOnly(true)
              .build();
      ApiFuture<Operation> future = eventarcClient.deleteEnrollmentCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END eventarc_v1_generated_Eventarc_DeleteEnrollment_async]
