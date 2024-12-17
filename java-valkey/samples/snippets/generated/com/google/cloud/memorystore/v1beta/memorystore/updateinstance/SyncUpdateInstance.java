/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.memorystore.v1beta.samples;

// [START memorystore_v1beta_generated_Memorystore_UpdateInstance_sync]
import com.google.cloud.memorystore.v1beta.Instance;
import com.google.cloud.memorystore.v1beta.MemorystoreClient;
import com.google.cloud.memorystore.v1beta.UpdateInstanceRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateInstance {

  public static void main(String[] args) throws Exception {
    syncUpdateInstance();
  }

  public static void syncUpdateInstance() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MemorystoreClient memorystoreClient = MemorystoreClient.create()) {
      UpdateInstanceRequest request =
          UpdateInstanceRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setInstance(Instance.newBuilder().build())
              .setRequestId("requestId693933066")
              .build();
      Instance response = memorystoreClient.updateInstanceAsync(request).get();
    }
  }
}
// [END memorystore_v1beta_generated_Memorystore_UpdateInstance_sync]
