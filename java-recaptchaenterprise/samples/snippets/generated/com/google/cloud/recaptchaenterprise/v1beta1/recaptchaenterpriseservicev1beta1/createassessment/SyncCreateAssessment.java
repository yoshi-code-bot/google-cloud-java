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

package com.google.cloud.recaptchaenterprise.v1beta1.samples;

// [START recaptchaenterprise_v1beta1_generated_RecaptchaEnterpriseServiceV1Beta1_CreateAssessment_sync]
import com.google.cloud.recaptchaenterprise.v1beta1.RecaptchaEnterpriseServiceV1Beta1Client;
import com.google.recaptchaenterprise.v1beta1.Assessment;
import com.google.recaptchaenterprise.v1beta1.CreateAssessmentRequest;
import com.google.recaptchaenterprise.v1beta1.ProjectName;

public class SyncCreateAssessment {

  public static void main(String[] args) throws Exception {
    syncCreateAssessment();
  }

  public static void syncCreateAssessment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RecaptchaEnterpriseServiceV1Beta1Client recaptchaEnterpriseServiceV1Beta1Client =
        RecaptchaEnterpriseServiceV1Beta1Client.create()) {
      CreateAssessmentRequest request =
          CreateAssessmentRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setAssessment(Assessment.newBuilder().build())
              .build();
      Assessment response = recaptchaEnterpriseServiceV1Beta1Client.createAssessment(request);
    }
  }
}
// [END recaptchaenterprise_v1beta1_generated_RecaptchaEnterpriseServiceV1Beta1_CreateAssessment_sync]
