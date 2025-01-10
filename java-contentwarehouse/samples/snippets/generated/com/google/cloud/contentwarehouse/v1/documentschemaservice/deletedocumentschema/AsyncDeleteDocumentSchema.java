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

package com.google.cloud.contentwarehouse.v1.samples;

// [START contentwarehouse_v1_generated_DocumentSchemaService_DeleteDocumentSchema_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.contentwarehouse.v1.DeleteDocumentSchemaRequest;
import com.google.cloud.contentwarehouse.v1.DocumentSchemaName;
import com.google.cloud.contentwarehouse.v1.DocumentSchemaServiceClient;
import com.google.protobuf.Empty;

public class AsyncDeleteDocumentSchema {

  public static void main(String[] args) throws Exception {
    asyncDeleteDocumentSchema();
  }

  public static void asyncDeleteDocumentSchema() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (DocumentSchemaServiceClient documentSchemaServiceClient =
        DocumentSchemaServiceClient.create()) {
      DeleteDocumentSchemaRequest request =
          DeleteDocumentSchemaRequest.newBuilder()
              .setName(
                  DocumentSchemaName.of("[PROJECT]", "[LOCATION]", "[DOCUMENT_SCHEMA]").toString())
              .build();
      ApiFuture<Empty> future =
          documentSchemaServiceClient.deleteDocumentSchemaCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END contentwarehouse_v1_generated_DocumentSchemaService_DeleteDocumentSchema_async]
