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

package com.google.cloud.aiplatform.v1.samples;

// [START aiplatform_v1_generated_DatasetService_ListAnnotations_String_sync]
import com.google.cloud.aiplatform.v1.Annotation;
import com.google.cloud.aiplatform.v1.DataItemName;
import com.google.cloud.aiplatform.v1.DatasetServiceClient;

public class SyncListAnnotationsString {

  public static void main(String[] args) throws Exception {
    syncListAnnotationsString();
  }

  public static void syncListAnnotationsString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DatasetServiceClient datasetServiceClient = DatasetServiceClient.create()) {
      String parent =
          DataItemName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[DATA_ITEM]").toString();
      for (Annotation element : datasetServiceClient.listAnnotations(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END aiplatform_v1_generated_DatasetService_ListAnnotations_String_sync]
