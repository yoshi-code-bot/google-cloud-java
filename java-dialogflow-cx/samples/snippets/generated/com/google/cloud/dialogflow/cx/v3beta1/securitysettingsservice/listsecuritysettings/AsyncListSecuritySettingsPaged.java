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

package com.google.cloud.dialogflow.cx.v3beta1.samples;

// [START dialogflow_v3beta1_generated_SecuritySettingsService_ListSecuritySettings_Paged_async]
import com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListSecuritySettingsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.LocationName;
import com.google.cloud.dialogflow.cx.v3beta1.SecuritySettings;
import com.google.cloud.dialogflow.cx.v3beta1.SecuritySettingsServiceClient;
import com.google.common.base.Strings;

public class AsyncListSecuritySettingsPaged {

  public static void main(String[] args) throws Exception {
    asyncListSecuritySettingsPaged();
  }

  public static void asyncListSecuritySettingsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecuritySettingsServiceClient securitySettingsServiceClient =
        SecuritySettingsServiceClient.create()) {
      ListSecuritySettingsRequest request =
          ListSecuritySettingsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListSecuritySettingsResponse response =
            securitySettingsServiceClient.listSecuritySettingsCallable().call(request);
        for (SecuritySettings element : response.getSecuritySettingsList()) {
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
// [END dialogflow_v3beta1_generated_SecuritySettingsService_ListSecuritySettings_Paged_async]
