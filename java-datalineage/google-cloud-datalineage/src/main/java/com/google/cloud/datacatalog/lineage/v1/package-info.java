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

/**
 * A client to Data Lineage API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= LineageClient =======================
 *
 * <p>Service Description: Lineage is used to track data flows between assets over time. You can
 * create [LineageEvents][google.cloud.datacatalog.lineage.v1.LineageEvent] to record lineage
 * between multiple sources and a single target, for example, when table data is based on data from
 * multiple tables.
 *
 * <p>Sample for LineageClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (LineageClient lineageClient = LineageClient.create()) {
 *   String parent = "parent-995424086";
 *   Struct openLineage = Struct.newBuilder().build();
 *   ProcessOpenLineageRunEventResponse response =
 *       lineageClient.processOpenLineageRunEvent(parent, openLineage);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.datacatalog.lineage.v1;

import javax.annotation.Generated;
