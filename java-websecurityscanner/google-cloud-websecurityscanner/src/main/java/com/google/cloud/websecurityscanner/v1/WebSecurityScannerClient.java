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

package com.google.cloud.websecurityscanner.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.websecurityscanner.v1.stub.WebSecurityScannerStub;
import com.google.cloud.websecurityscanner.v1.stub.WebSecurityScannerStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Web Security Scanner Service identifies security vulnerabilities in web
 * applications hosted on Google Cloud. It crawls your application, and attempts to exercise as many
 * user inputs and event handlers as possible.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
 *   CreateScanConfigRequest request =
 *       CreateScanConfigRequest.newBuilder()
 *           .setParent("parent-995424086")
 *           .setScanConfig(ScanConfig.newBuilder().build())
 *           .build();
 *   ScanConfig response = webSecurityScannerClient.createScanConfig(request);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the WebSecurityScannerClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateScanConfig</td>
 *      <td><p> Creates a new ScanConfig.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createScanConfig(CreateScanConfigRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createScanConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteScanConfig</td>
 *      <td><p> Deletes an existing ScanConfig and its child resources.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteScanConfig(DeleteScanConfigRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteScanConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetScanConfig</td>
 *      <td><p> Gets a ScanConfig.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getScanConfig(GetScanConfigRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getScanConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListScanConfigs</td>
 *      <td><p> Lists ScanConfigs under a given project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listScanConfigs(ListScanConfigsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listScanConfigsPagedCallable()
 *           <li><p> listScanConfigsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateScanConfig</td>
 *      <td><p> Updates a ScanConfig. This method support partial update of a ScanConfig.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateScanConfig(UpdateScanConfigRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateScanConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StartScanRun</td>
 *      <td><p> Start a ScanRun according to the given ScanConfig.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> startScanRun(StartScanRunRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> startScanRunCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetScanRun</td>
 *      <td><p> Gets a ScanRun.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getScanRun(GetScanRunRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getScanRunCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListScanRuns</td>
 *      <td><p> Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listScanRuns(ListScanRunsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listScanRunsPagedCallable()
 *           <li><p> listScanRunsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StopScanRun</td>
 *      <td><p> Stops a ScanRun. The stopped ScanRun is returned.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> stopScanRun(StopScanRunRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> stopScanRunCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListCrawledUrls</td>
 *      <td><p> List CrawledUrls under a given ScanRun.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listCrawledUrls(ListCrawledUrlsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listCrawledUrlsPagedCallable()
 *           <li><p> listCrawledUrlsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFinding</td>
 *      <td><p> Gets a Finding.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFinding(GetFindingRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFindingCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFindings</td>
 *      <td><p> List Findings under a given ScanRun.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFindings(ListFindingsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFindingsPagedCallable()
 *           <li><p> listFindingsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFindingTypeStats</td>
 *      <td><p> List all FindingTypeStats under a given ScanRun.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFindingTypeStats(ListFindingTypeStatsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFindingTypeStatsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of WebSecurityScannerSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WebSecurityScannerSettings webSecurityScannerSettings =
 *     WebSecurityScannerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * WebSecurityScannerClient webSecurityScannerClient =
 *     WebSecurityScannerClient.create(webSecurityScannerSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WebSecurityScannerSettings webSecurityScannerSettings =
 *     WebSecurityScannerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * WebSecurityScannerClient webSecurityScannerClient =
 *     WebSecurityScannerClient.create(webSecurityScannerSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * WebSecurityScannerSettings webSecurityScannerSettings =
 *     WebSecurityScannerSettings.newHttpJsonBuilder().build();
 * WebSecurityScannerClient webSecurityScannerClient =
 *     WebSecurityScannerClient.create(webSecurityScannerSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class WebSecurityScannerClient implements BackgroundResource {
  private final WebSecurityScannerSettings settings;
  private final WebSecurityScannerStub stub;

  /** Constructs an instance of WebSecurityScannerClient with default settings. */
  public static final WebSecurityScannerClient create() throws IOException {
    return create(WebSecurityScannerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of WebSecurityScannerClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final WebSecurityScannerClient create(WebSecurityScannerSettings settings)
      throws IOException {
    return new WebSecurityScannerClient(settings);
  }

  /**
   * Constructs an instance of WebSecurityScannerClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(WebSecurityScannerSettings).
   */
  public static final WebSecurityScannerClient create(WebSecurityScannerStub stub) {
    return new WebSecurityScannerClient(stub);
  }

  /**
   * Constructs an instance of WebSecurityScannerClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected WebSecurityScannerClient(WebSecurityScannerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((WebSecurityScannerStubSettings) settings.getStubSettings()).createStub();
  }

  protected WebSecurityScannerClient(WebSecurityScannerStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final WebSecurityScannerSettings getSettings() {
    return settings;
  }

  public WebSecurityScannerStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   CreateScanConfigRequest request =
   *       CreateScanConfigRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setScanConfig(ScanConfig.newBuilder().build())
   *           .build();
   *   ScanConfig response = webSecurityScannerClient.createScanConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanConfig createScanConfig(CreateScanConfigRequest request) {
    return createScanConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   CreateScanConfigRequest request =
   *       CreateScanConfigRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setScanConfig(ScanConfig.newBuilder().build())
   *           .build();
   *   ApiFuture<ScanConfig> future =
   *       webSecurityScannerClient.createScanConfigCallable().futureCall(request);
   *   // Do something.
   *   ScanConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateScanConfigRequest, ScanConfig> createScanConfigCallable() {
    return stub.createScanConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing ScanConfig and its child resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   DeleteScanConfigRequest request =
   *       DeleteScanConfigRequest.newBuilder().setName("name3373707").build();
   *   webSecurityScannerClient.deleteScanConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteScanConfig(DeleteScanConfigRequest request) {
    deleteScanConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes an existing ScanConfig and its child resources.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   DeleteScanConfigRequest request =
   *       DeleteScanConfigRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Empty> future =
   *       webSecurityScannerClient.deleteScanConfigCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteScanConfigRequest, Empty> deleteScanConfigCallable() {
    return stub.deleteScanConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetScanConfigRequest request =
   *       GetScanConfigRequest.newBuilder().setName("name3373707").build();
   *   ScanConfig response = webSecurityScannerClient.getScanConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanConfig getScanConfig(GetScanConfigRequest request) {
    return getScanConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetScanConfigRequest request =
   *       GetScanConfigRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<ScanConfig> future =
   *       webSecurityScannerClient.getScanConfigCallable().futureCall(request);
   *   // Do something.
   *   ScanConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetScanConfigRequest, ScanConfig> getScanConfigCallable() {
    return stub.getScanConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanConfigs under a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanConfigsRequest request =
   *       ListScanConfigsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (ScanConfig element : webSecurityScannerClient.listScanConfigs(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListScanConfigsPagedResponse listScanConfigs(ListScanConfigsRequest request) {
    return listScanConfigsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanConfigs under a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanConfigsRequest request =
   *       ListScanConfigsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<ScanConfig> future =
   *       webSecurityScannerClient.listScanConfigsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ScanConfig element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListScanConfigsRequest, ListScanConfigsPagedResponse>
      listScanConfigsPagedCallable() {
    return stub.listScanConfigsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanConfigs under a given project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanConfigsRequest request =
   *       ListScanConfigsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListScanConfigsResponse response =
   *         webSecurityScannerClient.listScanConfigsCallable().call(request);
   *     for (ScanConfig element : response.getScanConfigsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListScanConfigsRequest, ListScanConfigsResponse>
      listScanConfigsCallable() {
    return stub.listScanConfigsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ScanConfig. This method support partial update of a ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   UpdateScanConfigRequest request =
   *       UpdateScanConfigRequest.newBuilder()
   *           .setScanConfig(ScanConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ScanConfig response = webSecurityScannerClient.updateScanConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanConfig updateScanConfig(UpdateScanConfigRequest request) {
    return updateScanConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a ScanConfig. This method support partial update of a ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   UpdateScanConfigRequest request =
   *       UpdateScanConfigRequest.newBuilder()
   *           .setScanConfig(ScanConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<ScanConfig> future =
   *       webSecurityScannerClient.updateScanConfigCallable().futureCall(request);
   *   // Do something.
   *   ScanConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateScanConfigRequest, ScanConfig> updateScanConfigCallable() {
    return stub.updateScanConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Start a ScanRun according to the given ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   StartScanRunRequest request = StartScanRunRequest.newBuilder().setName("name3373707").build();
   *   ScanRun response = webSecurityScannerClient.startScanRun(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanRun startScanRun(StartScanRunRequest request) {
    return startScanRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Start a ScanRun according to the given ScanConfig.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   StartScanRunRequest request = StartScanRunRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<ScanRun> future =
   *       webSecurityScannerClient.startScanRunCallable().futureCall(request);
   *   // Do something.
   *   ScanRun response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartScanRunRequest, ScanRun> startScanRunCallable() {
    return stub.startScanRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetScanRunRequest request = GetScanRunRequest.newBuilder().setName("name3373707").build();
   *   ScanRun response = webSecurityScannerClient.getScanRun(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanRun getScanRun(GetScanRunRequest request) {
    return getScanRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetScanRunRequest request = GetScanRunRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<ScanRun> future = webSecurityScannerClient.getScanRunCallable().futureCall(request);
   *   // Do something.
   *   ScanRun response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetScanRunRequest, ScanRun> getScanRunCallable() {
    return stub.getScanRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanRunsRequest request =
   *       ListScanRunsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (ScanRun element : webSecurityScannerClient.listScanRuns(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListScanRunsPagedResponse listScanRuns(ListScanRunsRequest request) {
    return listScanRunsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanRunsRequest request =
   *       ListScanRunsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<ScanRun> future =
   *       webSecurityScannerClient.listScanRunsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (ScanRun element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListScanRunsRequest, ListScanRunsPagedResponse>
      listScanRunsPagedCallable() {
    return stub.listScanRunsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists ScanRuns under a given ScanConfig, in descending order of ScanRun stop time.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListScanRunsRequest request =
   *       ListScanRunsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListScanRunsResponse response =
   *         webSecurityScannerClient.listScanRunsCallable().call(request);
   *     for (ScanRun element : response.getScanRunsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListScanRunsRequest, ListScanRunsResponse> listScanRunsCallable() {
    return stub.listScanRunsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a ScanRun. The stopped ScanRun is returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   StopScanRunRequest request = StopScanRunRequest.newBuilder().setName("name3373707").build();
   *   ScanRun response = webSecurityScannerClient.stopScanRun(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ScanRun stopScanRun(StopScanRunRequest request) {
    return stopScanRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Stops a ScanRun. The stopped ScanRun is returned.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   StopScanRunRequest request = StopScanRunRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<ScanRun> future =
   *       webSecurityScannerClient.stopScanRunCallable().futureCall(request);
   *   // Do something.
   *   ScanRun response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StopScanRunRequest, ScanRun> stopScanRunCallable() {
    return stub.stopScanRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List CrawledUrls under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListCrawledUrlsRequest request =
   *       ListCrawledUrlsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (CrawledUrl element : webSecurityScannerClient.listCrawledUrls(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListCrawledUrlsPagedResponse listCrawledUrls(ListCrawledUrlsRequest request) {
    return listCrawledUrlsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List CrawledUrls under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListCrawledUrlsRequest request =
   *       ListCrawledUrlsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<CrawledUrl> future =
   *       webSecurityScannerClient.listCrawledUrlsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (CrawledUrl element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCrawledUrlsRequest, ListCrawledUrlsPagedResponse>
      listCrawledUrlsPagedCallable() {
    return stub.listCrawledUrlsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List CrawledUrls under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListCrawledUrlsRequest request =
   *       ListCrawledUrlsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListCrawledUrlsResponse response =
   *         webSecurityScannerClient.listCrawledUrlsCallable().call(request);
   *     for (CrawledUrl element : response.getCrawledUrlsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListCrawledUrlsRequest, ListCrawledUrlsResponse>
      listCrawledUrlsCallable() {
    return stub.listCrawledUrlsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a Finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetFindingRequest request = GetFindingRequest.newBuilder().setName("name3373707").build();
   *   Finding response = webSecurityScannerClient.getFinding(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Finding getFinding(GetFindingRequest request) {
    return getFindingCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a Finding.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   GetFindingRequest request = GetFindingRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Finding> future = webSecurityScannerClient.getFindingCallable().futureCall(request);
   *   // Do something.
   *   Finding response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFindingRequest, Finding> getFindingCallable() {
    return stub.getFindingCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Findings under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (Finding element : webSecurityScannerClient.listFindings(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingsPagedResponse listFindings(ListFindingsRequest request) {
    return listFindingsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Findings under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<Finding> future =
   *       webSecurityScannerClient.listFindingsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Finding element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFindingsRequest, ListFindingsPagedResponse>
      listFindingsPagedCallable() {
    return stub.listFindingsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List Findings under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListFindingsRequest request =
   *       ListFindingsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setFilter("filter-1274492040")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListFindingsResponse response =
   *         webSecurityScannerClient.listFindingsCallable().call(request);
   *     for (Finding element : response.getFindingsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFindingsRequest, ListFindingsResponse> listFindingsCallable() {
    return stub.listFindingsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all FindingTypeStats under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListFindingTypeStatsRequest request =
   *       ListFindingTypeStatsRequest.newBuilder().setParent("parent-995424086").build();
   *   ListFindingTypeStatsResponse response =
   *       webSecurityScannerClient.listFindingTypeStats(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFindingTypeStatsResponse listFindingTypeStats(
      ListFindingTypeStatsRequest request) {
    return listFindingTypeStatsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List all FindingTypeStats under a given ScanRun.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
   *   ListFindingTypeStatsRequest request =
   *       ListFindingTypeStatsRequest.newBuilder().setParent("parent-995424086").build();
   *   ApiFuture<ListFindingTypeStatsResponse> future =
   *       webSecurityScannerClient.listFindingTypeStatsCallable().futureCall(request);
   *   // Do something.
   *   ListFindingTypeStatsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFindingTypeStatsRequest, ListFindingTypeStatsResponse>
      listFindingTypeStatsCallable() {
    return stub.listFindingTypeStatsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListScanConfigsPagedResponse
      extends AbstractPagedListResponse<
          ListScanConfigsRequest,
          ListScanConfigsResponse,
          ScanConfig,
          ListScanConfigsPage,
          ListScanConfigsFixedSizeCollection> {

    public static ApiFuture<ListScanConfigsPagedResponse> createAsync(
        PageContext<ListScanConfigsRequest, ListScanConfigsResponse, ScanConfig> context,
        ApiFuture<ListScanConfigsResponse> futureResponse) {
      ApiFuture<ListScanConfigsPage> futurePage =
          ListScanConfigsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListScanConfigsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListScanConfigsPagedResponse(ListScanConfigsPage page) {
      super(page, ListScanConfigsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListScanConfigsPage
      extends AbstractPage<
          ListScanConfigsRequest, ListScanConfigsResponse, ScanConfig, ListScanConfigsPage> {

    private ListScanConfigsPage(
        PageContext<ListScanConfigsRequest, ListScanConfigsResponse, ScanConfig> context,
        ListScanConfigsResponse response) {
      super(context, response);
    }

    private static ListScanConfigsPage createEmptyPage() {
      return new ListScanConfigsPage(null, null);
    }

    @Override
    protected ListScanConfigsPage createPage(
        PageContext<ListScanConfigsRequest, ListScanConfigsResponse, ScanConfig> context,
        ListScanConfigsResponse response) {
      return new ListScanConfigsPage(context, response);
    }

    @Override
    public ApiFuture<ListScanConfigsPage> createPageAsync(
        PageContext<ListScanConfigsRequest, ListScanConfigsResponse, ScanConfig> context,
        ApiFuture<ListScanConfigsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListScanConfigsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListScanConfigsRequest,
          ListScanConfigsResponse,
          ScanConfig,
          ListScanConfigsPage,
          ListScanConfigsFixedSizeCollection> {

    private ListScanConfigsFixedSizeCollection(
        List<ListScanConfigsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListScanConfigsFixedSizeCollection createEmptyCollection() {
      return new ListScanConfigsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListScanConfigsFixedSizeCollection createCollection(
        List<ListScanConfigsPage> pages, int collectionSize) {
      return new ListScanConfigsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListScanRunsPagedResponse
      extends AbstractPagedListResponse<
          ListScanRunsRequest,
          ListScanRunsResponse,
          ScanRun,
          ListScanRunsPage,
          ListScanRunsFixedSizeCollection> {

    public static ApiFuture<ListScanRunsPagedResponse> createAsync(
        PageContext<ListScanRunsRequest, ListScanRunsResponse, ScanRun> context,
        ApiFuture<ListScanRunsResponse> futureResponse) {
      ApiFuture<ListScanRunsPage> futurePage =
          ListScanRunsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListScanRunsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListScanRunsPagedResponse(ListScanRunsPage page) {
      super(page, ListScanRunsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListScanRunsPage
      extends AbstractPage<ListScanRunsRequest, ListScanRunsResponse, ScanRun, ListScanRunsPage> {

    private ListScanRunsPage(
        PageContext<ListScanRunsRequest, ListScanRunsResponse, ScanRun> context,
        ListScanRunsResponse response) {
      super(context, response);
    }

    private static ListScanRunsPage createEmptyPage() {
      return new ListScanRunsPage(null, null);
    }

    @Override
    protected ListScanRunsPage createPage(
        PageContext<ListScanRunsRequest, ListScanRunsResponse, ScanRun> context,
        ListScanRunsResponse response) {
      return new ListScanRunsPage(context, response);
    }

    @Override
    public ApiFuture<ListScanRunsPage> createPageAsync(
        PageContext<ListScanRunsRequest, ListScanRunsResponse, ScanRun> context,
        ApiFuture<ListScanRunsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListScanRunsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListScanRunsRequest,
          ListScanRunsResponse,
          ScanRun,
          ListScanRunsPage,
          ListScanRunsFixedSizeCollection> {

    private ListScanRunsFixedSizeCollection(List<ListScanRunsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListScanRunsFixedSizeCollection createEmptyCollection() {
      return new ListScanRunsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListScanRunsFixedSizeCollection createCollection(
        List<ListScanRunsPage> pages, int collectionSize) {
      return new ListScanRunsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListCrawledUrlsPagedResponse
      extends AbstractPagedListResponse<
          ListCrawledUrlsRequest,
          ListCrawledUrlsResponse,
          CrawledUrl,
          ListCrawledUrlsPage,
          ListCrawledUrlsFixedSizeCollection> {

    public static ApiFuture<ListCrawledUrlsPagedResponse> createAsync(
        PageContext<ListCrawledUrlsRequest, ListCrawledUrlsResponse, CrawledUrl> context,
        ApiFuture<ListCrawledUrlsResponse> futureResponse) {
      ApiFuture<ListCrawledUrlsPage> futurePage =
          ListCrawledUrlsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListCrawledUrlsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListCrawledUrlsPagedResponse(ListCrawledUrlsPage page) {
      super(page, ListCrawledUrlsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListCrawledUrlsPage
      extends AbstractPage<
          ListCrawledUrlsRequest, ListCrawledUrlsResponse, CrawledUrl, ListCrawledUrlsPage> {

    private ListCrawledUrlsPage(
        PageContext<ListCrawledUrlsRequest, ListCrawledUrlsResponse, CrawledUrl> context,
        ListCrawledUrlsResponse response) {
      super(context, response);
    }

    private static ListCrawledUrlsPage createEmptyPage() {
      return new ListCrawledUrlsPage(null, null);
    }

    @Override
    protected ListCrawledUrlsPage createPage(
        PageContext<ListCrawledUrlsRequest, ListCrawledUrlsResponse, CrawledUrl> context,
        ListCrawledUrlsResponse response) {
      return new ListCrawledUrlsPage(context, response);
    }

    @Override
    public ApiFuture<ListCrawledUrlsPage> createPageAsync(
        PageContext<ListCrawledUrlsRequest, ListCrawledUrlsResponse, CrawledUrl> context,
        ApiFuture<ListCrawledUrlsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListCrawledUrlsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListCrawledUrlsRequest,
          ListCrawledUrlsResponse,
          CrawledUrl,
          ListCrawledUrlsPage,
          ListCrawledUrlsFixedSizeCollection> {

    private ListCrawledUrlsFixedSizeCollection(
        List<ListCrawledUrlsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListCrawledUrlsFixedSizeCollection createEmptyCollection() {
      return new ListCrawledUrlsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListCrawledUrlsFixedSizeCollection createCollection(
        List<ListCrawledUrlsPage> pages, int collectionSize) {
      return new ListCrawledUrlsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFindingsPagedResponse
      extends AbstractPagedListResponse<
          ListFindingsRequest,
          ListFindingsResponse,
          Finding,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    public static ApiFuture<ListFindingsPagedResponse> createAsync(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      ApiFuture<ListFindingsPage> futurePage =
          ListFindingsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFindingsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFindingsPagedResponse(ListFindingsPage page) {
      super(page, ListFindingsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFindingsPage
      extends AbstractPage<ListFindingsRequest, ListFindingsResponse, Finding, ListFindingsPage> {

    private ListFindingsPage(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ListFindingsResponse response) {
      super(context, response);
    }

    private static ListFindingsPage createEmptyPage() {
      return new ListFindingsPage(null, null);
    }

    @Override
    protected ListFindingsPage createPage(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ListFindingsResponse response) {
      return new ListFindingsPage(context, response);
    }

    @Override
    public ApiFuture<ListFindingsPage> createPageAsync(
        PageContext<ListFindingsRequest, ListFindingsResponse, Finding> context,
        ApiFuture<ListFindingsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFindingsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFindingsRequest,
          ListFindingsResponse,
          Finding,
          ListFindingsPage,
          ListFindingsFixedSizeCollection> {

    private ListFindingsFixedSizeCollection(List<ListFindingsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFindingsFixedSizeCollection createEmptyCollection() {
      return new ListFindingsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFindingsFixedSizeCollection createCollection(
        List<ListFindingsPage> pages, int collectionSize) {
      return new ListFindingsFixedSizeCollection(pages, collectionSize);
    }
  }
}
