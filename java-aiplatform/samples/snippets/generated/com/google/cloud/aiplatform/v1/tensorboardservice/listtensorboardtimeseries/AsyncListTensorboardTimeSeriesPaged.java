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

// [START aiplatform_v1_generated_TensorboardService_ListTensorboardTimeSeries_Paged_async]
import com.google.cloud.aiplatform.v1.ListTensorboardTimeSeriesRequest;
import com.google.cloud.aiplatform.v1.ListTensorboardTimeSeriesResponse;
import com.google.cloud.aiplatform.v1.TensorboardRunName;
import com.google.cloud.aiplatform.v1.TensorboardServiceClient;
import com.google.cloud.aiplatform.v1.TensorboardTimeSeries;
import com.google.common.base.Strings;
import com.google.protobuf.FieldMask;

public class AsyncListTensorboardTimeSeriesPaged {

  public static void main(String[] args) throws Exception {
    asyncListTensorboardTimeSeriesPaged();
  }

  public static void asyncListTensorboardTimeSeriesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TensorboardServiceClient tensorboardServiceClient = TensorboardServiceClient.create()) {
      ListTensorboardTimeSeriesRequest request =
          ListTensorboardTimeSeriesRequest.newBuilder()
              .setParent(
                  TensorboardRunName.of(
                          "[PROJECT]", "[LOCATION]", "[TENSORBOARD]", "[EXPERIMENT]", "[RUN]")
                      .toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOrderBy("orderBy-1207110587")
              .setReadMask(FieldMask.newBuilder().build())
              .build();
      while (true) {
        ListTensorboardTimeSeriesResponse response =
            tensorboardServiceClient.listTensorboardTimeSeriesCallable().call(request);
        for (TensorboardTimeSeries element : response.getTensorboardTimeSeriesList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END aiplatform_v1_generated_TensorboardService_ListTensorboardTimeSeries_Paged_async]
