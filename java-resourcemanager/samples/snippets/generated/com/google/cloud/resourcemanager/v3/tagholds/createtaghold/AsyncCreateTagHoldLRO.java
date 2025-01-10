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

package com.google.cloud.resourcemanager.v3.samples;

// [START cloudresourcemanager_v3_generated_TagHolds_CreateTagHold_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.resourcemanager.v3.CreateTagHoldMetadata;
import com.google.cloud.resourcemanager.v3.CreateTagHoldRequest;
import com.google.cloud.resourcemanager.v3.TagHold;
import com.google.cloud.resourcemanager.v3.TagHoldsClient;
import com.google.cloud.resourcemanager.v3.TagValueName;

public class AsyncCreateTagHoldLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateTagHoldLRO();
  }

  public static void asyncCreateTagHoldLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TagHoldsClient tagHoldsClient = TagHoldsClient.create()) {
      CreateTagHoldRequest request =
          CreateTagHoldRequest.newBuilder()
              .setParent(TagValueName.of("[TAG_VALUE]").toString())
              .setTagHold(TagHold.newBuilder().build())
              .setValidateOnly(true)
              .build();
      OperationFuture<TagHold, CreateTagHoldMetadata> future =
          tagHoldsClient.createTagHoldOperationCallable().futureCall(request);
      // Do something.
      TagHold response = future.get();
    }
  }
}
// [END cloudresourcemanager_v3_generated_TagHolds_CreateTagHold_LRO_async]
