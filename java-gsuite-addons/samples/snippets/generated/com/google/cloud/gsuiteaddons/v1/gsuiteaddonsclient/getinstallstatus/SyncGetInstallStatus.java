/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.gsuiteaddons.v1.samples;

// [START gsuiteaddons_v1_generated_gsuiteaddonsclient_getinstallstatus_sync]
import com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsClient;
import com.google.cloud.gsuiteaddons.v1.GetInstallStatusRequest;
import com.google.cloud.gsuiteaddons.v1.InstallStatus;
import com.google.cloud.gsuiteaddons.v1.InstallStatusName;

public class SyncGetInstallStatus {

  public static void main(String[] args) throws Exception {
    syncGetInstallStatus();
  }

  public static void syncGetInstallStatus() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GSuiteAddOnsClient gSuiteAddOnsClient = GSuiteAddOnsClient.create()) {
      GetInstallStatusRequest request =
          GetInstallStatusRequest.newBuilder()
              .setName(InstallStatusName.of("[PROJECT]", "[DEPLOYMENT]").toString())
              .build();
      InstallStatus response = gSuiteAddOnsClient.getInstallStatus(request);
    }
  }
}
// [END gsuiteaddons_v1_generated_gsuiteaddonsclient_getinstallstatus_sync]