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

package com.google.cloud.translate.v3beta1.samples;

// [START translate_v3beta1_generated_TranslationService_TranslateDocument_sync]
import com.google.cloud.translate.v3beta1.DocumentInputConfig;
import com.google.cloud.translate.v3beta1.DocumentOutputConfig;
import com.google.cloud.translate.v3beta1.TranslateDocumentRequest;
import com.google.cloud.translate.v3beta1.TranslateDocumentResponse;
import com.google.cloud.translate.v3beta1.TranslateTextGlossaryConfig;
import com.google.cloud.translate.v3beta1.TranslationServiceClient;
import java.util.HashMap;

public class SyncTranslateDocument {

  public static void main(String[] args) throws Exception {
    syncTranslateDocument();
  }

  public static void syncTranslateDocument() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
      TranslateDocumentRequest request =
          TranslateDocumentRequest.newBuilder()
              .setParent("parent-995424086")
              .setSourceLanguageCode("sourceLanguageCode1645917472")
              .setTargetLanguageCode("targetLanguageCode-106414698")
              .setDocumentInputConfig(DocumentInputConfig.newBuilder().build())
              .setDocumentOutputConfig(DocumentOutputConfig.newBuilder().build())
              .setModel("model104069929")
              .setGlossaryConfig(TranslateTextGlossaryConfig.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setCustomizedAttribution("customizedAttribution557650238")
              .setIsTranslateNativePdfOnly(true)
              .setEnableShadowRemovalNativePdf(true)
              .setEnableRotationCorrection(true)
              .build();
      TranslateDocumentResponse response = translationServiceClient.translateDocument(request);
    }
  }
}
// [END translate_v3beta1_generated_TranslationService_TranslateDocument_sync]
