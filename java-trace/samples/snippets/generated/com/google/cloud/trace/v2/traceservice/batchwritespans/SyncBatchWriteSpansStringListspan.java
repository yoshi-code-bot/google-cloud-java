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

package com.google.cloud.trace.v2.samples;

// [START cloudtrace_v2_generated_TraceService_BatchWriteSpans_StringListspan_sync]
import com.google.cloud.trace.v2.TraceServiceClient;
import com.google.devtools.cloudtrace.v2.ProjectName;
import com.google.devtools.cloudtrace.v2.Span;
import com.google.protobuf.Empty;
import java.util.ArrayList;
import java.util.List;

public class SyncBatchWriteSpansStringListspan {

  public static void main(String[] args) throws Exception {
    syncBatchWriteSpansStringListspan();
  }

  public static void syncBatchWriteSpansStringListspan() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (TraceServiceClient traceServiceClient = TraceServiceClient.create()) {
      String name = ProjectName.of("[PROJECT]").toString();
      List<Span> spans = new ArrayList<>();
      traceServiceClient.batchWriteSpans(name, spans);
    }
  }
}
// [END cloudtrace_v2_generated_TraceService_BatchWriteSpans_StringListspan_sync]
