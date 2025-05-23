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

/**
 * A client to BigLake API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= MetastoreServiceClient =======================
 *
 * <p>Service Description: BigLake Metastore is a serverless, highly available, multi-tenant runtime
 * metastore for Google Cloud Data Analytics products.
 *
 * <p>The BigLake Metastore API defines the following resource model:
 *
 * <ul>
 *   <li>A collection of Google Cloud projects: `/projects/&#42;`
 *   <li>Each project has a collection of available locations: `/locations/&#42;`
 *   <li>Each location has a collection of catalogs: `/catalogs/&#42;`
 *   <li>Each catalog has a collection of databases: `/databases/&#42;`
 *   <li>Each database has a collection of tables: `/tables/&#42;`
 * </ul>
 *
 * <p>Sample for MetastoreServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (MetastoreServiceClient metastoreServiceClient = MetastoreServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   Catalog catalog = Catalog.newBuilder().build();
 *   String catalogId = "catalogId1455933204";
 *   Catalog response = metastoreServiceClient.createCatalog(parent, catalog, catalogId);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.bigquery.biglake.v1;

import javax.annotation.Generated;
