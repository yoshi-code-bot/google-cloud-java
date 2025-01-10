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

package com.google.api.servicecontrol.v1.samples;

// [START servicecontrol_v1_generated_ServiceController_Report_sync]
import com.google.api.servicecontrol.v1.Operation;
import com.google.api.servicecontrol.v1.ReportRequest;
import com.google.api.servicecontrol.v1.ReportResponse;
import com.google.api.servicecontrol.v1.ServiceControllerClient;
import java.util.ArrayList;

public class SyncReport {

  public static void main(String[] args) throws Exception {
    syncReport();
  }

  public static void syncReport() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceControllerClient serviceControllerClient = ServiceControllerClient.create()) {
      ReportRequest request =
          ReportRequest.newBuilder()
              .setServiceName("serviceName-1928572192")
              .addAllOperations(new ArrayList<Operation>())
              .setServiceConfigId("serviceConfigId650537426")
              .build();
      ReportResponse response = serviceControllerClient.report(request);
    }
  }
}
// [END servicecontrol_v1_generated_ServiceController_Report_sync]
