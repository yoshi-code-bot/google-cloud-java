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

package com.google.cloud.kms.inventory.v1.samples;

// [START kmsinventory_v1_generated_KeyDashboardServiceSettings_ListCryptoKeys_sync]
import com.google.cloud.kms.inventory.v1.KeyDashboardServiceSettings;
import java.time.Duration;

public class SyncListCryptoKeys {

  public static void main(String[] args) throws Exception {
    syncListCryptoKeys();
  }

  public static void syncListCryptoKeys() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    KeyDashboardServiceSettings.Builder keyDashboardServiceSettingsBuilder =
        KeyDashboardServiceSettings.newBuilder();
    keyDashboardServiceSettingsBuilder
        .listCryptoKeysSettings()
        .setRetrySettings(
            keyDashboardServiceSettingsBuilder
                .listCryptoKeysSettings()
                .getRetrySettings()
                .toBuilder()
                .setInitialRetryDelayDuration(Duration.ofSeconds(1))
                .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
                .setMaxAttempts(5)
                .setMaxRetryDelayDuration(Duration.ofSeconds(30))
                .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
                .setRetryDelayMultiplier(1.3)
                .setRpcTimeoutMultiplier(1.5)
                .setTotalTimeoutDuration(Duration.ofSeconds(300))
                .build());
    KeyDashboardServiceSettings keyDashboardServiceSettings =
        keyDashboardServiceSettingsBuilder.build();
  }
}
// [END kmsinventory_v1_generated_KeyDashboardServiceSettings_ListCryptoKeys_sync]
