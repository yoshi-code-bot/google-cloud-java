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

package com.google.cloud.dialogflow.cx.v3.samples;

// [START dialogflow_v3_generated_Experiments_ListExperiments_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.cx.v3.EnvironmentName;
import com.google.cloud.dialogflow.cx.v3.Experiment;
import com.google.cloud.dialogflow.cx.v3.ExperimentsClient;
import com.google.cloud.dialogflow.cx.v3.ListExperimentsRequest;

public class AsyncListExperiments {

  public static void main(String[] args) throws Exception {
    asyncListExperiments();
  }

  public static void asyncListExperiments() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ExperimentsClient experimentsClient = ExperimentsClient.create()) {
      ListExperimentsRequest request =
          ListExperimentsRequest.newBuilder()
              .setParent(
                  EnvironmentName.of("[PROJECT]", "[LOCATION]", "[AGENT]", "[ENVIRONMENT]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Experiment> future =
          experimentsClient.listExperimentsPagedCallable().futureCall(request);
      // Do something.
      for (Experiment element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v3_generated_Experiments_ListExperiments_async]
