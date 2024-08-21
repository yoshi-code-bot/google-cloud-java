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

package com.google.cloud.dialogflow.v2beta1.samples;

// [START dialogflow_v2beta1_generated_Generators_CreateGenerator_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2beta1.CreateGeneratorRequest;
import com.google.cloud.dialogflow.v2beta1.Generator;
import com.google.cloud.dialogflow.v2beta1.GeneratorsClient;
import com.google.cloud.dialogflow.v2beta1.ProjectName;

public class AsyncCreateGenerator {

  public static void main(String[] args) throws Exception {
    asyncCreateGenerator();
  }

  public static void asyncCreateGenerator() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (GeneratorsClient generatorsClient = GeneratorsClient.create()) {
      CreateGeneratorRequest request =
          CreateGeneratorRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setGenerator(Generator.newBuilder().build())
              .setGeneratorId("generatorId887044942")
              .build();
      ApiFuture<Generator> future = generatorsClient.createGeneratorCallable().futureCall(request);
      // Do something.
      Generator response = future.get();
    }
  }
}
// [END dialogflow_v2beta1_generated_Generators_CreateGenerator_async]
