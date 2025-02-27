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

package com.google.devtools.clouderrorreporting.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.devtools.clouderrorreporting.v1beta1.stub.ReportErrorsServiceStub;
import com.google.devtools.clouderrorreporting.v1beta1.stub.ReportErrorsServiceStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: An API for reporting error events.
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
 * try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
 *   ProjectName projectName = ProjectName.of("[PROJECT]");
 *   ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
 *   ReportErrorEventResponse response =
 *       reportErrorsServiceClient.reportErrorEvent(projectName, event);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the ReportErrorsServiceClient object to clean up resources
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
 *      <td><p> ReportErrorEvent</td>
 *      <td><p> Report an individual error event and record the event to a log.
 * <p>  This endpoint accepts &#42;&#42;either&#42;&#42; an OAuth token,
 * <ul>
 * <li> &#42;or&#42;&#42; an [API key](https://support.google.com/cloud/answer/6158862) for authentication. To use an API key, append it to the URL as the value of a `key` parameter. For example:
 * </ul>
 * <p>  `POST https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
 * <p>  &#42;&#42;Note:&#42;&#42; [Error Reporting] (https://cloud.google.com/error-reporting) is a service built on Cloud Logging and can analyze log entries when all of the following are true:
 * <ul>
 * <li>  Customer-managed encryption keys (CMEK) are disabled on the log bucket.
 * <li>  The log bucket satisfies one of the following:     &#42; The log bucket is stored in the same project where the logs     originated.     &#42; The logs were routed to a project, and then that project stored those     logs in a log bucket that it owns.
 * </ul></td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> reportErrorEvent(ReportErrorEventRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> reportErrorEvent(ProjectName projectName, ReportedErrorEvent event)
 *           <li><p> reportErrorEvent(String projectName, ReportedErrorEvent event)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> reportErrorEventCallable()
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
 * <p>This class can be customized by passing in a custom instance of ReportErrorsServiceSettings to
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
 * ReportErrorsServiceSettings reportErrorsServiceSettings =
 *     ReportErrorsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ReportErrorsServiceClient reportErrorsServiceClient =
 *     ReportErrorsServiceClient.create(reportErrorsServiceSettings);
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
 * ReportErrorsServiceSettings reportErrorsServiceSettings =
 *     ReportErrorsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ReportErrorsServiceClient reportErrorsServiceClient =
 *     ReportErrorsServiceClient.create(reportErrorsServiceSettings);
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
 * ReportErrorsServiceSettings reportErrorsServiceSettings =
 *     ReportErrorsServiceSettings.newHttpJsonBuilder().build();
 * ReportErrorsServiceClient reportErrorsServiceClient =
 *     ReportErrorsServiceClient.create(reportErrorsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class ReportErrorsServiceClient implements BackgroundResource {
  private final ReportErrorsServiceSettings settings;
  private final ReportErrorsServiceStub stub;

  /** Constructs an instance of ReportErrorsServiceClient with default settings. */
  public static final ReportErrorsServiceClient create() throws IOException {
    return create(ReportErrorsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ReportErrorsServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final ReportErrorsServiceClient create(ReportErrorsServiceSettings settings)
      throws IOException {
    return new ReportErrorsServiceClient(settings);
  }

  /**
   * Constructs an instance of ReportErrorsServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(ReportErrorsServiceSettings).
   */
  public static final ReportErrorsServiceClient create(ReportErrorsServiceStub stub) {
    return new ReportErrorsServiceClient(stub);
  }

  /**
   * Constructs an instance of ReportErrorsServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ReportErrorsServiceClient(ReportErrorsServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((ReportErrorsServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected ReportErrorsServiceClient(ReportErrorsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ReportErrorsServiceSettings getSettings() {
    return settings;
  }

  public ReportErrorsServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Report an individual error event and record the event to a log.
   *
   * <p>This endpoint accepts &#42;&#42;either&#42;&#42; an OAuth token,
   *
   * <ul>
   *   <li>&#42;or&#42;&#42; an [API key](https://support.google.com/cloud/answer/6158862) for
   *       authentication. To use an API key, append it to the URL as the value of a `key`
   *       parameter. For example:
   * </ul>
   *
   * <p>`POST
   * https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
   *
   * <p>&#42;&#42;Note:&#42;&#42; [Error Reporting] (https://cloud.google.com/error-reporting) is a
   * service built on Cloud Logging and can analyze log entries when all of the following are true:
   *
   * <ul>
   *   <li>Customer-managed encryption keys (CMEK) are disabled on the log bucket.
   *   <li>The log bucket satisfies one of the following: &#42; The log bucket is stored in the same
   *       project where the logs originated. &#42; The logs were routed to a project, and then that
   *       project stored those logs in a log bucket that it owns.
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
   *   ProjectName projectName = ProjectName.of("[PROJECT]");
   *   ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
   *   ReportErrorEventResponse response =
   *       reportErrorsServiceClient.reportErrorEvent(projectName, event);
   * }
   * }</pre>
   *
   * @param projectName Required. The resource name of the Google Cloud Platform project. Written as
   *     `projects/{projectId}`, where `{projectId}` is the [Google Cloud Platform project
   *     ID](https://support.google.com/cloud/answer/6158840).
   *     <p>Example: // `projects/my-project-123`.
   * @param event Required. The error event to be reported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportErrorEventResponse reportErrorEvent(
      ProjectName projectName, ReportedErrorEvent event) {
    ReportErrorEventRequest request =
        ReportErrorEventRequest.newBuilder()
            .setProjectName(projectName == null ? null : projectName.toString())
            .setEvent(event)
            .build();
    return reportErrorEvent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Report an individual error event and record the event to a log.
   *
   * <p>This endpoint accepts &#42;&#42;either&#42;&#42; an OAuth token,
   *
   * <ul>
   *   <li>&#42;or&#42;&#42; an [API key](https://support.google.com/cloud/answer/6158862) for
   *       authentication. To use an API key, append it to the URL as the value of a `key`
   *       parameter. For example:
   * </ul>
   *
   * <p>`POST
   * https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
   *
   * <p>&#42;&#42;Note:&#42;&#42; [Error Reporting] (https://cloud.google.com/error-reporting) is a
   * service built on Cloud Logging and can analyze log entries when all of the following are true:
   *
   * <ul>
   *   <li>Customer-managed encryption keys (CMEK) are disabled on the log bucket.
   *   <li>The log bucket satisfies one of the following: &#42; The log bucket is stored in the same
   *       project where the logs originated. &#42; The logs were routed to a project, and then that
   *       project stored those logs in a log bucket that it owns.
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
   *   String projectName = ProjectName.of("[PROJECT]").toString();
   *   ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
   *   ReportErrorEventResponse response =
   *       reportErrorsServiceClient.reportErrorEvent(projectName, event);
   * }
   * }</pre>
   *
   * @param projectName Required. The resource name of the Google Cloud Platform project. Written as
   *     `projects/{projectId}`, where `{projectId}` is the [Google Cloud Platform project
   *     ID](https://support.google.com/cloud/answer/6158840).
   *     <p>Example: // `projects/my-project-123`.
   * @param event Required. The error event to be reported.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportErrorEventResponse reportErrorEvent(
      String projectName, ReportedErrorEvent event) {
    ReportErrorEventRequest request =
        ReportErrorEventRequest.newBuilder().setProjectName(projectName).setEvent(event).build();
    return reportErrorEvent(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Report an individual error event and record the event to a log.
   *
   * <p>This endpoint accepts &#42;&#42;either&#42;&#42; an OAuth token,
   *
   * <ul>
   *   <li>&#42;or&#42;&#42; an [API key](https://support.google.com/cloud/answer/6158862) for
   *       authentication. To use an API key, append it to the URL as the value of a `key`
   *       parameter. For example:
   * </ul>
   *
   * <p>`POST
   * https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
   *
   * <p>&#42;&#42;Note:&#42;&#42; [Error Reporting] (https://cloud.google.com/error-reporting) is a
   * service built on Cloud Logging and can analyze log entries when all of the following are true:
   *
   * <ul>
   *   <li>Customer-managed encryption keys (CMEK) are disabled on the log bucket.
   *   <li>The log bucket satisfies one of the following: &#42; The log bucket is stored in the same
   *       project where the logs originated. &#42; The logs were routed to a project, and then that
   *       project stored those logs in a log bucket that it owns.
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
   *   ReportErrorEventRequest request =
   *       ReportErrorEventRequest.newBuilder()
   *           .setProjectName(ProjectName.of("[PROJECT]").toString())
   *           .setEvent(ReportedErrorEvent.newBuilder().build())
   *           .build();
   *   ReportErrorEventResponse response = reportErrorsServiceClient.reportErrorEvent(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReportErrorEventResponse reportErrorEvent(ReportErrorEventRequest request) {
    return reportErrorEventCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Report an individual error event and record the event to a log.
   *
   * <p>This endpoint accepts &#42;&#42;either&#42;&#42; an OAuth token,
   *
   * <ul>
   *   <li>&#42;or&#42;&#42; an [API key](https://support.google.com/cloud/answer/6158862) for
   *       authentication. To use an API key, append it to the URL as the value of a `key`
   *       parameter. For example:
   * </ul>
   *
   * <p>`POST
   * https://clouderrorreporting.googleapis.com/v1beta1/{projectName}/events:report?key=123ABC456`
   *
   * <p>&#42;&#42;Note:&#42;&#42; [Error Reporting] (https://cloud.google.com/error-reporting) is a
   * service built on Cloud Logging and can analyze log entries when all of the following are true:
   *
   * <ul>
   *   <li>Customer-managed encryption keys (CMEK) are disabled on the log bucket.
   *   <li>The log bucket satisfies one of the following: &#42; The log bucket is stored in the same
   *       project where the logs originated. &#42; The logs were routed to a project, and then that
   *       project stored those logs in a log bucket that it owns.
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
   *   ReportErrorEventRequest request =
   *       ReportErrorEventRequest.newBuilder()
   *           .setProjectName(ProjectName.of("[PROJECT]").toString())
   *           .setEvent(ReportedErrorEvent.newBuilder().build())
   *           .build();
   *   ApiFuture<ReportErrorEventResponse> future =
   *       reportErrorsServiceClient.reportErrorEventCallable().futureCall(request);
   *   // Do something.
   *   ReportErrorEventResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReportErrorEventRequest, ReportErrorEventResponse>
      reportErrorEventCallable() {
    return stub.reportErrorEventCallable();
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
}
