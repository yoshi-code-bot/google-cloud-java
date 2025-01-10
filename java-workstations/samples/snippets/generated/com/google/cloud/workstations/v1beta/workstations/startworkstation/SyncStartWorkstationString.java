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

package com.google.cloud.workstations.v1beta.samples;

// [START workstations_v1beta_generated_Workstations_StartWorkstation_String_sync]
import com.google.cloud.workstations.v1beta.Workstation;
import com.google.cloud.workstations.v1beta.WorkstationName;
import com.google.cloud.workstations.v1beta.WorkstationsClient;

public class SyncStartWorkstationString {

  public static void main(String[] args) throws Exception {
    syncStartWorkstationString();
  }

  public static void syncStartWorkstationString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (WorkstationsClient workstationsClient = WorkstationsClient.create()) {
      String name =
          WorkstationName.of(
                  "[PROJECT]",
                  "[LOCATION]",
                  "[WORKSTATION_CLUSTER]",
                  "[WORKSTATION_CONFIG]",
                  "[WORKSTATION]")
              .toString();
      Workstation response = workstationsClient.startWorkstationAsync(name).get();
    }
  }
}
// [END workstations_v1beta_generated_Workstations_StartWorkstation_String_sync]
