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

package com.google.cloud.alloydb.v1beta.samples;

// [START alloydb_v1beta_generated_AlloyDBAdmin_CreateBackup_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.alloydb.v1beta.AlloyDBAdminClient;
import com.google.cloud.alloydb.v1beta.Backup;
import com.google.cloud.alloydb.v1beta.CreateBackupRequest;
import com.google.cloud.alloydb.v1beta.LocationName;
import com.google.cloud.alloydb.v1beta.OperationMetadata;

public class AsyncCreateBackupLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateBackupLRO();
  }

  public static void asyncCreateBackupLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AlloyDBAdminClient alloyDBAdminClient = AlloyDBAdminClient.create()) {
      CreateBackupRequest request =
          CreateBackupRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setBackupId("backupId2121930365")
              .setBackup(Backup.newBuilder().build())
              .setRequestId("requestId693933066")
              .setValidateOnly(true)
              .build();
      OperationFuture<Backup, OperationMetadata> future =
          alloyDBAdminClient.createBackupOperationCallable().futureCall(request);
      // Do something.
      Backup response = future.get();
    }
  }
}
// [END alloydb_v1beta_generated_AlloyDBAdmin_CreateBackup_LRO_async]
