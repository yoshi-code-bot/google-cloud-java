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

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_AwsClusters_GenerateAwsClusterAgentToken_sync]
import com.google.cloud.gkemulticloud.v1.AwsClusterName;
import com.google.cloud.gkemulticloud.v1.AwsClustersClient;
import com.google.cloud.gkemulticloud.v1.GenerateAwsClusterAgentTokenRequest;
import com.google.cloud.gkemulticloud.v1.GenerateAwsClusterAgentTokenResponse;

public class SyncGenerateAwsClusterAgentToken {

  public static void main(String[] args) throws Exception {
    syncGenerateAwsClusterAgentToken();
  }

  public static void syncGenerateAwsClusterAgentToken() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AwsClustersClient awsClustersClient = AwsClustersClient.create()) {
      GenerateAwsClusterAgentTokenRequest request =
          GenerateAwsClusterAgentTokenRequest.newBuilder()
              .setAwsCluster(
                  AwsClusterName.of("[PROJECT]", "[LOCATION]", "[AWS_CLUSTER]").toString())
              .setSubjectToken("subjectToken-1519661011")
              .setSubjectTokenType("subjectTokenType1839592711")
              .setVersion("version351608024")
              .setNodePoolId("nodePoolId1121557241")
              .setGrantType("grantType-1219832202")
              .setAudience("audience975628804")
              .setScope("scope109264468")
              .setRequestedTokenType("requestedTokenType1733106949")
              .setOptions("options-1249474914")
              .build();
      GenerateAwsClusterAgentTokenResponse response =
          awsClustersClient.generateAwsClusterAgentToken(request);
    }
  }
}
// [END gkemulticloud_v1_generated_AwsClusters_GenerateAwsClusterAgentToken_sync]
