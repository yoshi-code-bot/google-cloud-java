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

package com.google.cloud.discoveryengine.v1.samples;

// [START discoveryengine_v1_generated_CompletionService_ImportCompletionSuggestions_sync]
import com.google.cloud.discoveryengine.v1.CompletionServiceClient;
import com.google.cloud.discoveryengine.v1.DataStoreName;
import com.google.cloud.discoveryengine.v1.ImportCompletionSuggestionsRequest;
import com.google.cloud.discoveryengine.v1.ImportCompletionSuggestionsResponse;
import com.google.cloud.discoveryengine.v1.ImportErrorConfig;

public class SyncImportCompletionSuggestions {

  public static void main(String[] args) throws Exception {
    syncImportCompletionSuggestions();
  }

  public static void syncImportCompletionSuggestions() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CompletionServiceClient completionServiceClient = CompletionServiceClient.create()) {
      ImportCompletionSuggestionsRequest request =
          ImportCompletionSuggestionsRequest.newBuilder()
              .setParent(
                  DataStoreName.ofProjectLocationCollectionDataStoreName(
                          "[PROJECT]", "[LOCATION]", "[COLLECTION]", "[DATA_STORE]")
                      .toString())
              .setErrorConfig(ImportErrorConfig.newBuilder().build())
              .build();
      ImportCompletionSuggestionsResponse response =
          completionServiceClient.importCompletionSuggestionsAsync(request).get();
    }
  }
}
// [END discoveryengine_v1_generated_CompletionService_ImportCompletionSuggestions_sync]
