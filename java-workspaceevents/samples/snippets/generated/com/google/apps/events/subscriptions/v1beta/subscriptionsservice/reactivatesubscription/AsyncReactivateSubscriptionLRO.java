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

package com.google.apps.events.subscriptions.v1beta.samples;

// [START workspaceevents_v1beta_generated_SubscriptionsService_ReactivateSubscription_LRO_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.apps.events.subscriptions.v1beta.ReactivateSubscriptionMetadata;
import com.google.apps.events.subscriptions.v1beta.ReactivateSubscriptionRequest;
import com.google.apps.events.subscriptions.v1beta.Subscription;
import com.google.apps.events.subscriptions.v1beta.SubscriptionName;
import com.google.apps.events.subscriptions.v1beta.SubscriptionsServiceClient;

public class AsyncReactivateSubscriptionLRO {

  public static void main(String[] args) throws Exception {
    asyncReactivateSubscriptionLRO();
  }

  public static void asyncReactivateSubscriptionLRO() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SubscriptionsServiceClient subscriptionsServiceClient =
        SubscriptionsServiceClient.create()) {
      ReactivateSubscriptionRequest request =
          ReactivateSubscriptionRequest.newBuilder()
              .setName(SubscriptionName.of("[SUBSCRIPTION]").toString())
              .build();
      OperationFuture<Subscription, ReactivateSubscriptionMetadata> future =
          subscriptionsServiceClient.reactivateSubscriptionOperationCallable().futureCall(request);
      // Do something.
      Subscription response = future.get();
    }
  }
}
// [END workspaceevents_v1beta_generated_SubscriptionsService_ReactivateSubscription_LRO_async]
