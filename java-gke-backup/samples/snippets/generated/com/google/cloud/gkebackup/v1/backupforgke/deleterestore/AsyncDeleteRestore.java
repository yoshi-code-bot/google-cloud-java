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

package com.google.cloud.gkebackup.v1.samples;

// [START gkebackup_v1_generated_BackupForGKE_DeleteRestore_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkebackup.v1.BackupForGKEClient;
import com.google.cloud.gkebackup.v1.DeleteRestoreRequest;
import com.google.cloud.gkebackup.v1.RestoreName;
import com.google.longrunning.Operation;

public class AsyncDeleteRestore {

  public static void main(String[] args) throws Exception {
    asyncDeleteRestore();
  }

  public static void asyncDeleteRestore() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackupForGKEClient backupForGKEClient = BackupForGKEClient.create()) {
      DeleteRestoreRequest request =
          DeleteRestoreRequest.newBuilder()
              .setName(
                  RestoreName.of("[PROJECT]", "[LOCATION]", "[RESTORE_PLAN]", "[RESTORE]")
                      .toString())
              .setEtag("etag3123477")
              .setForce(true)
              .build();
      ApiFuture<Operation> future = backupForGKEClient.deleteRestoreCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END gkebackup_v1_generated_BackupForGKE_DeleteRestore_async]
