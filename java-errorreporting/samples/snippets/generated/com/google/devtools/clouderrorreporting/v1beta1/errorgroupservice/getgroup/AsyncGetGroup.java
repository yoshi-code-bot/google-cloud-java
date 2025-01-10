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

package com.google.devtools.clouderrorreporting.v1beta1.samples;

// [START clouderrorreporting_v1beta1_generated_ErrorGroupService_GetGroup_async]
import com.google.api.core.ApiFuture;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupName;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupServiceClient;
import com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest;

public class AsyncGetGroup {

  public static void main(String[] args) throws Exception {
    asyncGetGroup();
  }

  public static void asyncGetGroup() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
      GetGroupRequest request =
          GetGroupRequest.newBuilder()
              .setGroupName(ErrorGroupName.of("[PROJECT]", "[GROUP]").toString())
              .build();
      ApiFuture<ErrorGroup> future = errorGroupServiceClient.getGroupCallable().futureCall(request);
      // Do something.
      ErrorGroup response = future.get();
    }
  }
}
// [END clouderrorreporting_v1beta1_generated_ErrorGroupService_GetGroup_async]
