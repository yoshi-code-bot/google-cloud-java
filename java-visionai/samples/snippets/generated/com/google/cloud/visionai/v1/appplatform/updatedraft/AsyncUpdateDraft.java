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

package com.google.cloud.visionai.v1.samples;

// [START visionai_v1_generated_AppPlatform_UpdateDraft_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.visionai.v1.AppPlatformClient;
import com.google.cloud.visionai.v1.Draft;
import com.google.cloud.visionai.v1.UpdateDraftRequest;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;

public class AsyncUpdateDraft {

  public static void main(String[] args) throws Exception {
    asyncUpdateDraft();
  }

  public static void asyncUpdateDraft() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AppPlatformClient appPlatformClient = AppPlatformClient.create()) {
      UpdateDraftRequest request =
          UpdateDraftRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setDraft(Draft.newBuilder().build())
              .setRequestId("requestId693933066")
              .setAllowMissing(true)
              .build();
      ApiFuture<Operation> future = appPlatformClient.updateDraftCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END visionai_v1_generated_AppPlatform_UpdateDraft_async]
