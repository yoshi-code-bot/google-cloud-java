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

// [START appengine_v1_generated_AuthorizedCertificates_CreateAuthorizedCertificate_async]
import com.google.api.core.ApiFuture;
import com.google.appengine.v1.AuthorizedCertificate;
import com.google.appengine.v1.AuthorizedCertificatesClient;
import com.google.appengine.v1.CreateAuthorizedCertificateRequest;

public class AsyncCreateAuthorizedCertificate {

  public static void main(String[] args) throws Exception {
    asyncCreateAuthorizedCertificate();
  }

  public static void asyncCreateAuthorizedCertificate() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AuthorizedCertificatesClient authorizedCertificatesClient =
        AuthorizedCertificatesClient.create()) {
      CreateAuthorizedCertificateRequest request =
          CreateAuthorizedCertificateRequest.newBuilder()
              .setParent("parent-995424086")
              .setCertificate(AuthorizedCertificate.newBuilder().build())
              .build();
      ApiFuture<AuthorizedCertificate> future =
          authorizedCertificatesClient.createAuthorizedCertificateCallable().futureCall(request);
      // Do something.
      AuthorizedCertificate response = future.get();
    }
  }
}
// [END appengine_v1_generated_AuthorizedCertificates_CreateAuthorizedCertificate_async]
