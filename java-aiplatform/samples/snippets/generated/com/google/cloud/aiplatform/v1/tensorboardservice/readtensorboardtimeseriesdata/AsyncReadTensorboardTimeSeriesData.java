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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_TensorboardService_ReadTensorboardTimeSeriesData_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataRequest;
import com.google.cloud.aiplatform.v1.ReadTensorboardTimeSeriesDataResponse;
import com.google.cloud.aiplatform.v1.TensorboardServiceClient;
import com.google.cloud.aiplatform.v1.TensorboardTimeSeriesName;

public class AsyncReadTensorboardTimeSeriesData {

  public static void main(String[] args) throws Exception {
    asyncReadTensorboardTimeSeriesData();
  }

  public static void asyncReadTensorboardTimeSeriesData() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TensorboardServiceClient tensorboardServiceClient = TensorboardServiceClient.create()) {
      ReadTensorboardTimeSeriesDataRequest request =
          ReadTensorboardTimeSeriesDataRequest.newBuilder()
              .setTensorboardTimeSeries(
                  TensorboardTimeSeriesName.of(
                          "[PROJECT]",
                          "[LOCATION]",
                          "[TENSORBOARD]",
                          "[EXPERIMENT]",
                          "[RUN]",
                          "[TIME_SERIES]")
                      .toString())
              .setMaxDataPoints(724001981)
              .setFilter("filter-1274492040")
              .build();
      ApiFuture<ReadTensorboardTimeSeriesDataResponse> future =
          tensorboardServiceClient.readTensorboardTimeSeriesDataCallable().futureCall(request);
      // Do something.
      ReadTensorboardTimeSeriesDataResponse response = future.get();
    }
  }
}
// [END aiplatform_v1_generated_TensorboardService_ReadTensorboardTimeSeriesData_async]
