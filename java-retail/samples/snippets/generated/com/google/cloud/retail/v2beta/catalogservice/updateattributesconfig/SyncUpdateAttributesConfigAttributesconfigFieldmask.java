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

package com.google.cloud.retail.v2beta.samples;

// [START retail_v2beta_generated_CatalogService_UpdateAttributesConfig_AttributesconfigFieldmask_sync]
import com.google.cloud.retail.v2beta.AttributesConfig;
import com.google.cloud.retail.v2beta.CatalogServiceClient;
import com.google.protobuf.FieldMask;

public class SyncUpdateAttributesConfigAttributesconfigFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateAttributesConfigAttributesconfigFieldmask();
  }

  public static void syncUpdateAttributesConfigAttributesconfigFieldmask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (CatalogServiceClient catalogServiceClient = CatalogServiceClient.create()) {
      AttributesConfig attributesConfig = AttributesConfig.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      AttributesConfig response =
          catalogServiceClient.updateAttributesConfig(attributesConfig, updateMask);
    }
  }
}
// [END retail_v2beta_generated_CatalogService_UpdateAttributesConfig_AttributesconfigFieldmask_sync]
