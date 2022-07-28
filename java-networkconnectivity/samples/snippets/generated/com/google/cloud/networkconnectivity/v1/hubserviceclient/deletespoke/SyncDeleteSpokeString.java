/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.networkconnectivity.v1.samples;

// [START networkconnectivity_v1_generated_hubserviceclient_deletespoke_string_sync]
import com.google.cloud.networkconnectivity.v1.HubServiceClient;
import com.google.cloud.networkconnectivity.v1.SpokeName;
import com.google.protobuf.Empty;

public class SyncDeleteSpokeString {

  public static void main(String[] args) throws Exception {
    syncDeleteSpokeString();
  }

  public static void syncDeleteSpokeString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (HubServiceClient hubServiceClient = HubServiceClient.create()) {
      String name = SpokeName.of("[PROJECT]", "[LOCATION]", "[SPOKE]").toString();
      hubServiceClient.deleteSpokeAsync(name).get();
    }
  }
}
// [END networkconnectivity_v1_generated_hubserviceclient_deletespoke_string_sync]