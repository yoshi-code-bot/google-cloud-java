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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_Generators_ListGenerators_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.Generator;
import com.google.cloud.dialogflow.v2beta1.GeneratorsClient;
import com.google.cloud.dialogflow.v2beta1.ListGeneratorsRequest;
import com.google.cloud.dialogflow.v2beta1.ProjectName;

public class AsyncListGenerators {

  public static void main(String[] args) throws Exception {
    asyncListGenerators();
  }

  public static void asyncListGenerators() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GeneratorsClient generatorsClient = GeneratorsClient.create()) {
      ListGeneratorsRequest request =
          ListGeneratorsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Generator> future =
          generatorsClient.listGeneratorsPagedCallable().futureCall(request);
      // Do something.
      for (Generator element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END dialogflow_v2beta1_generated_Generators_ListGenerators_async]
