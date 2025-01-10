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

package com.google.identity.accesscontextmanager.v1.samples;

// [START accesscontextmanager_v1_generated_AccessContextManager_DeleteGcpUserAccessBinding_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.identity.accesscontextmanager.v1.AccessContextManagerClient;
import com.google.identity.accesscontextmanager.v1.DeleteGcpUserAccessBindingRequest;
import com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingName;
import com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOperationMetadata;
import com.google.protobuf.Empty;

public class AsyncDeleteGcpUserAccessBindingLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteGcpUserAccessBindingLRO();
  }

  public static void asyncDeleteGcpUserAccessBindingLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AccessContextManagerClient accessContextManagerClient =
        AccessContextManagerClient.create()) {
      DeleteGcpUserAccessBindingRequest request =
          DeleteGcpUserAccessBindingRequest.newBuilder()
              .setName(
                  GcpUserAccessBindingName.of("[ORGANIZATION]", "[GCP_USER_ACCESS_BINDING]")
                      .toString())
              .build();
      OperationFuture<Empty, GcpUserAccessBindingOperationMetadata> future =
          accessContextManagerClient
              .deleteGcpUserAccessBindingOperationCallable()
              .futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END accesscontextmanager_v1_generated_AccessContextManager_DeleteGcpUserAccessBinding_LRO_async]
