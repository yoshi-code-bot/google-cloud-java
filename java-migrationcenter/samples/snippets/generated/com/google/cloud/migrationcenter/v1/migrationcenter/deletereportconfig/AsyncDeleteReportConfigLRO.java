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

package com.google.cloud.migrationcenter.v1.samples;

// [START migrationcenter_v1_generated_MigrationCenter_DeleteReportConfig_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.migrationcenter.v1.DeleteReportConfigRequest;
import com.google.cloud.migrationcenter.v1.MigrationCenterClient;
import com.google.cloud.migrationcenter.v1.OperationMetadata;
import com.google.cloud.migrationcenter.v1.ReportConfigName;
import com.google.protobuf.Empty;

public class AsyncDeleteReportConfigLRO {

  public static void main(String[] args) throws Exception {
    asyncDeleteReportConfigLRO();
  }

  public static void asyncDeleteReportConfigLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MigrationCenterClient migrationCenterClient = MigrationCenterClient.create()) {
      DeleteReportConfigRequest request =
          DeleteReportConfigRequest.newBuilder()
              .setName(ReportConfigName.of("[PROJECT]", "[LOCATION]", "[REPORT_CONFIG]").toString())
              .setRequestId("requestId693933066")
              .setForce(true)
              .build();
      OperationFuture<Empty, OperationMetadata> future =
          migrationCenterClient.deleteReportConfigOperationCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END migrationcenter_v1_generated_MigrationCenter_DeleteReportConfig_LRO_async]
