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

package com.google.cloud.orchestration.airflow.service.v1.samples;

// [START composer_v1_generated_Environments_PollAirflowCommand_sync]
import com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse;

public class SyncPollAirflowCommand {

  public static void main(String[] args) throws Exception {
    syncPollAirflowCommand();
  }

  public static void syncPollAirflowCommand() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      PollAirflowCommandRequest request =
          PollAirflowCommandRequest.newBuilder()
              .setEnvironment("environment-85904877")
              .setExecutionId("executionId-454906285")
              .setPod("pod111173")
              .setPodNamespace("podNamespace463962262")
              .setNextLineNumber(1176642216)
              .build();
      PollAirflowCommandResponse response = environmentsClient.pollAirflowCommand(request);
    }
  }
}
// [END composer_v1_generated_Environments_PollAirflowCommand_sync]
