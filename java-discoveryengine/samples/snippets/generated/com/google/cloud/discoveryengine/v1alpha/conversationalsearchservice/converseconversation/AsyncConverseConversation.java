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

package com.google.cloud.discoveryengine.v1alpha.samples;

// [START discoveryengine_v1alpha_generated_ConversationalSearchService_ConverseConversation_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.discoveryengine.v1alpha.Conversation;
import com.google.cloud.discoveryengine.v1alpha.ConversationName;
import com.google.cloud.discoveryengine.v1alpha.ConversationalSearchServiceClient;
import com.google.cloud.discoveryengine.v1alpha.ConverseConversationRequest;
import com.google.cloud.discoveryengine.v1alpha.ConverseConversationResponse;
import com.google.cloud.discoveryengine.v1alpha.SearchRequest;
import com.google.cloud.discoveryengine.v1alpha.ServingConfigName;
import com.google.cloud.discoveryengine.v1alpha.TextInput;
import java.util.HashMap;

public class AsyncConverseConversation {

  public static void main(String[] args) throws Exception {
    asyncConverseConversation();
  }

  public static void asyncConverseConversation() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ConversationalSearchServiceClient conversationalSearchServiceClient =
        ConversationalSearchServiceClient.create()) {
      ConverseConversationRequest request =
          ConverseConversationRequest.newBuilder()
              .setName(
                  ConversationName.ofProjectLocationDataStoreConversationName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[CONVERSATION]")
                      .toString())
              .setQuery(TextInput.newBuilder().build())
              .setServingConfig(
                  ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                      .toString())
              .setConversation(Conversation.newBuilder().build())
              .setSafeSearch(true)
              .putAllUserLabels(new HashMap<String, String>())
              .setSummarySpec(SearchRequest.ContentSearchSpec.SummarySpec.newBuilder().build())
              .setFilter("filter-1274492040")
              .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
              .build();
      ApiFuture<ConverseConversationResponse> future =
          conversationalSearchServiceClient.converseConversationCallable().futureCall(request);
      // Do something.
      ConverseConversationResponse response = future.get();
    }
  }
}
// [END discoveryengine_v1alpha_generated_ConversationalSearchService_ConverseConversation_async]
