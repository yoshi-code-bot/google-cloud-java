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

package com.google.cloud.bigquery.migration.v2.samples;

// [START bigquerymigration_v2_generated_MigrationService_CreateMigrationWorkflow_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.bigquery.migration.v2.CreateMigrationWorkflowRequest;
import com.google.cloud.bigquery.migration.v2.LocationName;
import com.google.cloud.bigquery.migration.v2.MigrationServiceClient;
import com.google.cloud.bigquery.migration.v2.MigrationWorkflow;

public class AsyncCreateMigrationWorkflow {

  public static void main(String[] args) throws Exception {
    asyncCreateMigrationWorkflow();
  }

  public static void asyncCreateMigrationWorkflow() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MigrationServiceClient migrationServiceClient = MigrationServiceClient.create()) {
      CreateMigrationWorkflowRequest request =
          CreateMigrationWorkflowRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setMigrationWorkflow(MigrationWorkflow.newBuilder().build())
              .build();
      ApiFuture<MigrationWorkflow> future =
          migrationServiceClient.createMigrationWorkflowCallable().futureCall(request);
      // Do something.
      MigrationWorkflow response = future.get();
    }
  }
}
// [END bigquerymigration_v2_generated_MigrationService_CreateMigrationWorkflow_async]
