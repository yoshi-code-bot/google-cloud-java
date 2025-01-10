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

// [START appengine_v1_generated_Instances_DebugInstance_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.appengine.v1.DebugInstanceRequest;
import com.google.appengine.v1.Instance;
import com.google.appengine.v1.InstancesClient;
import com.google.appengine.v1.OperationMetadataV1;

public class AsyncDebugInstanceLRO {

  public static void main(String[] args) throws Exception {
    asyncDebugInstanceLRO();
  }

  public static void asyncDebugInstanceLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (InstancesClient instancesClient = InstancesClient.create()) {
      DebugInstanceRequest request =
          DebugInstanceRequest.newBuilder()
              .setName("name3373707")
              .setSshKey("sshKey-893236425")
              .build();
      OperationFuture<Instance, OperationMetadataV1> future =
          instancesClient.debugInstanceOperationCallable().futureCall(request);
      // Do something.
      Instance response = future.get();
    }
  }
}
// [END appengine_v1_generated_Instances_DebugInstance_LRO_async]
