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

package com.google.cloud.backupdr.v1.samples;

// [START backupdr_v1_generated_BackupDR_AbandonBackup_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.backupdr.v1.AbandonBackupRequest;
import com.google.cloud.backupdr.v1.BackupDRClient;
import com.google.cloud.backupdr.v1.DataSourceName;
import com.google.longrunning.Operation;

public class AsyncAbandonBackup {

  public static void main(String[] args) throws Exception {
    asyncAbandonBackup();
  }

  public static void asyncAbandonBackup() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackupDRClient backupDRClient = BackupDRClient.create()) {
      AbandonBackupRequest request =
          AbandonBackupRequest.newBuilder()
              .setDataSource(
                  DataSourceName.of("[PROJECT]", "[LOCATION]", "[BACKUPVAULT]", "[DATASOURCE]")
                      .toString())
              .setRequestId("requestId693933066")
              .build();
      ApiFuture<Operation> future = backupDRClient.abandonBackupCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END backupdr_v1_generated_BackupDR_AbandonBackup_async]
