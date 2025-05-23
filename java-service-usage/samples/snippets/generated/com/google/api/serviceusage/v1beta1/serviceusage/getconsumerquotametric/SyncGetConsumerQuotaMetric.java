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

package com.google.api.serviceusage.v1beta1.samples;

// [START serviceusage_v1beta1_generated_ServiceUsage_GetConsumerQuotaMetric_sync]
import com.google.api.serviceusage.v1beta1.ConsumerQuotaMetric;
import com.google.api.serviceusage.v1beta1.GetConsumerQuotaMetricRequest;
import com.google.api.serviceusage.v1beta1.QuotaView;
import com.google.api.serviceusage.v1beta1.ServiceUsageClient;

public class SyncGetConsumerQuotaMetric {

  public static void main(String[] args) throws Exception {
    syncGetConsumerQuotaMetric();
  }

  public static void syncGetConsumerQuotaMetric() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServiceUsageClient serviceUsageClient = ServiceUsageClient.create()) {
      GetConsumerQuotaMetricRequest request =
          GetConsumerQuotaMetricRequest.newBuilder()
              .setName("name3373707")
              .setView(QuotaView.forNumber(0))
              .build();
      ConsumerQuotaMetric response = serviceUsageClient.getConsumerQuotaMetric(request);
    }
  }
}
// [END serviceusage_v1beta1_generated_ServiceUsage_GetConsumerQuotaMetric_sync]
