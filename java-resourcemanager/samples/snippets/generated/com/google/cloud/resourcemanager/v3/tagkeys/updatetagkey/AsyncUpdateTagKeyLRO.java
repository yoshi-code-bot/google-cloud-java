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

// [START cloudresourcemanager_v3_generated_TagKeys_UpdateTagKey_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.resourcemanager.v3.TagKey;
import com.google.cloud.resourcemanager.v3.TagKeysClient;
import com.google.cloud.resourcemanager.v3.UpdateTagKeyMetadata;
import com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateTagKeyLRO {

  public static void main(String[] args) throws Exception {
    asyncUpdateTagKeyLRO();
  }

  public static void asyncUpdateTagKeyLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TagKeysClient tagKeysClient = TagKeysClient.create()) {
      UpdateTagKeyRequest request =
          UpdateTagKeyRequest.newBuilder()
              .setTagKey(TagKey.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setValidateOnly(true)
              .build();
      OperationFuture<TagKey, UpdateTagKeyMetadata> future =
          tagKeysClient.updateTagKeyOperationCallable().futureCall(request);
      // Do something.
      TagKey response = future.get();
    }
  }
}
// [END cloudresourcemanager_v3_generated_TagKeys_UpdateTagKey_LRO_async]
