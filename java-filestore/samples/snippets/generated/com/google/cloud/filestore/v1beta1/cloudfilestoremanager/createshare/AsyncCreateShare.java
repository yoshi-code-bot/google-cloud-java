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

package com.google.cloud.filestore.v1beta1.samples;

// [START file_v1beta1_generated_CloudFilestoreManager_CreateShare_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.filestore.v1beta1.CloudFilestoreManagerClient;
import com.google.cloud.filestore.v1beta1.CreateShareRequest;
import com.google.cloud.filestore.v1beta1.InstanceName;
import com.google.cloud.filestore.v1beta1.Share;
import com.google.longrunning.Operation;

public class AsyncCreateShare {

  public static void main(String[] args) throws Exception {
    asyncCreateShare();
  }

  public static void asyncCreateShare() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CloudFilestoreManagerClient cloudFilestoreManagerClient =
        CloudFilestoreManagerClient.create()) {
      CreateShareRequest request =
          CreateShareRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
              .setShareId("shareId2054217050")
              .setShare(Share.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          cloudFilestoreManagerClient.createShareCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END file_v1beta1_generated_CloudFilestoreManager_CreateShare_async]
