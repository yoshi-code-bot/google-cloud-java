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

// [START aiplatform_v1_generated_MetadataService_UpdateArtifact_ArtifactFieldmask_sync]
import com.google.cloud.aiplatform.v1.Artifact;
import com.google.cloud.aiplatform.v1.MetadataServiceClient;
import com.google.protobuf.FieldMask;

public class SyncUpdateArtifactArtifactFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateArtifactArtifactFieldmask();
  }

  public static void syncUpdateArtifactArtifactFieldmask() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (MetadataServiceClient metadataServiceClient = MetadataServiceClient.create()) {
      Artifact artifact = Artifact.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      Artifact response = metadataServiceClient.updateArtifact(artifact, updateMask);
    }
  }
}
// [END aiplatform_v1_generated_MetadataService_UpdateArtifact_ArtifactFieldmask_sync]
