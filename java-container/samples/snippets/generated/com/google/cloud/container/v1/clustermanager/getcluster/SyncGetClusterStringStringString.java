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

package com.google.cloud.container.v1.samples;

// [START container_v1_generated_ClusterManager_GetCluster_StringStringString_sync]
import com.google.cloud.container.v1.ClusterManagerClient;
import com.google.container.v1.Cluster;

public class SyncGetClusterStringStringString {

  public static void main(String[] args) throws Exception {
    syncGetClusterStringStringString();
  }

  public static void syncGetClusterStringStringString() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ClusterManagerClient clusterManagerClient = ClusterManagerClient.create()) {
      String projectId = "projectId-894832108";
      String zone = "zone3744684";
      String clusterId = "clusterId561939637";
      Cluster response = clusterManagerClient.getCluster(projectId, zone, clusterId);
    }
  }
}
// [END container_v1_generated_ClusterManager_GetCluster_StringStringString_sync]
