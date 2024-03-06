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

package com.google.cloud.compute.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.PublicDelegatedPrefixesStub;
import com.google.cloud.compute.v1.stub.PublicDelegatedPrefixesStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The PublicDelegatedPrefixes API.
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
 * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
 *     PublicDelegatedPrefixesClient.create()) {
 *   String project = "project-309310695";
 *   String region = "region-934795532";
 *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
 *   PublicDelegatedPrefix response =
 *       publicDelegatedPrefixesClient.get(project, region, publicDelegatedPrefix);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the PublicDelegatedPrefixesClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> AggregatedList</td>
 *      <td><p> Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. To prevent failure, Google recommends that you set the `returnPartialSuccess` parameter to `true`.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> aggregatedList(AggregatedListPublicDelegatedPrefixesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> aggregatedList(String project)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> aggregatedListPagedCallable()
 *           <li><p> aggregatedListCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Announce</td>
 *      <td><p> Announces the specified PublicDelegatedPrefix in the given region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> announceAsync(AnnouncePublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> announceAsync(String project, String region, String publicDelegatedPrefix)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> announceOperationCallable()
 *           <li><p> announceCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Delete</td>
 *      <td><p> Deletes the specified PublicDelegatedPrefix in the given region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteAsync(DeletePublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteAsync(String project, String region, String publicDelegatedPrefix)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteOperationCallable()
 *           <li><p> deleteCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Get</td>
 *      <td><p> Returns the specified PublicDelegatedPrefix resource in the given region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> get(GetPublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> get(String project, String region, String publicDelegatedPrefix)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Insert</td>
 *      <td><p> Creates a PublicDelegatedPrefix in the specified project in the given region using the parameters that are included in the request.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> insertAsync(InsertPublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> insertAsync(String project, String region, PublicDelegatedPrefix publicDelegatedPrefixResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> insertOperationCallable()
 *           <li><p> insertCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> List</td>
 *      <td><p> Lists the PublicDelegatedPrefixes for a project in the given region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> list(ListPublicDelegatedPrefixesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> list(String project, String region)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listPagedCallable()
 *           <li><p> listCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Patch</td>
 *      <td><p> Patches the specified PublicDelegatedPrefix resource with the data included in the request. This method supports PATCH semantics and uses JSON merge patch format and processing rules.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> patchAsync(PatchPublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> patchAsync(String project, String region, String publicDelegatedPrefix, PublicDelegatedPrefix publicDelegatedPrefixResource)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> patchOperationCallable()
 *           <li><p> patchCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Withdraw</td>
 *      <td><p> Withdraws the specified PublicDelegatedPrefix in the given region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> withdrawAsync(WithdrawPublicDelegatedPrefixeRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> withdrawAsync(String project, String region, String publicDelegatedPrefix)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> withdrawOperationCallable()
 *           <li><p> withdrawCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * PublicDelegatedPrefixesSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * PublicDelegatedPrefixesSettings publicDelegatedPrefixesSettings =
 *     PublicDelegatedPrefixesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
 *     PublicDelegatedPrefixesClient.create(publicDelegatedPrefixesSettings);
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
 * PublicDelegatedPrefixesSettings publicDelegatedPrefixesSettings =
 *     PublicDelegatedPrefixesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
 *     PublicDelegatedPrefixesClient.create(publicDelegatedPrefixesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class PublicDelegatedPrefixesClient implements BackgroundResource {
  private final PublicDelegatedPrefixesSettings settings;
  private final PublicDelegatedPrefixesStub stub;

  /** Constructs an instance of PublicDelegatedPrefixesClient with default settings. */
  public static final PublicDelegatedPrefixesClient create() throws IOException {
    return create(PublicDelegatedPrefixesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of PublicDelegatedPrefixesClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final PublicDelegatedPrefixesClient create(PublicDelegatedPrefixesSettings settings)
      throws IOException {
    return new PublicDelegatedPrefixesClient(settings);
  }

  /**
   * Constructs an instance of PublicDelegatedPrefixesClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(PublicDelegatedPrefixesSettings).
   */
  public static final PublicDelegatedPrefixesClient create(PublicDelegatedPrefixesStub stub) {
    return new PublicDelegatedPrefixesClient(stub);
  }

  /**
   * Constructs an instance of PublicDelegatedPrefixesClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected PublicDelegatedPrefixesClient(PublicDelegatedPrefixesSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((PublicDelegatedPrefixesStubSettings) settings.getStubSettings()).createStub();
  }

  protected PublicDelegatedPrefixesClient(PublicDelegatedPrefixesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final PublicDelegatedPrefixesSettings getSettings() {
    return settings;
  }

  public PublicDelegatedPrefixesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. To
   * prevent failure, Google recommends that you set the `returnPartialSuccess` parameter to `true`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   for (Map.Entry<String, PublicDelegatedPrefixesScopedList> element :
   *       publicDelegatedPrefixesClient.aggregatedList(project).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Name of the project scoping this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(String project) {
    AggregatedListPublicDelegatedPrefixesRequest request =
        AggregatedListPublicDelegatedPrefixesRequest.newBuilder().setProject(project).build();
    return aggregatedList(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. To
   * prevent failure, Google recommends that you set the `returnPartialSuccess` parameter to `true`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AggregatedListPublicDelegatedPrefixesRequest request =
   *       AggregatedListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .setServiceProjectNumber(-1293855239)
   *           .build();
   *   for (Map.Entry<String, PublicDelegatedPrefixesScopedList> element :
   *       publicDelegatedPrefixesClient.aggregatedList(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AggregatedListPagedResponse aggregatedList(
      AggregatedListPublicDelegatedPrefixesRequest request) {
    return aggregatedListPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. To
   * prevent failure, Google recommends that you set the `returnPartialSuccess` parameter to `true`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AggregatedListPublicDelegatedPrefixesRequest request =
   *       AggregatedListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .setServiceProjectNumber(-1293855239)
   *           .build();
   *   ApiFuture<Map.Entry<String, PublicDelegatedPrefixesScopedList>> future =
   *       publicDelegatedPrefixesClient.aggregatedListPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Map.Entry<String, PublicDelegatedPrefixesScopedList> element :
   *       future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          AggregatedListPublicDelegatedPrefixesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return stub.aggregatedListPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all PublicDelegatedPrefix resources owned by the specific project across all scopes. To
   * prevent failure, Google recommends that you set the `returnPartialSuccess` parameter to `true`.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AggregatedListPublicDelegatedPrefixesRequest request =
   *       AggregatedListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setIncludeAllScopes(true)
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setReturnPartialSuccess(true)
   *           .setServiceProjectNumber(-1293855239)
   *           .build();
   *   while (true) {
   *     PublicDelegatedPrefixAggregatedList response =
   *         publicDelegatedPrefixesClient.aggregatedListCallable().call(request);
   *     for (Map.Entry<String, PublicDelegatedPrefixesScopedList> element :
   *         response.getItemsList()) {
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
  public final UnaryCallable<
          AggregatedListPublicDelegatedPrefixesRequest, PublicDelegatedPrefixAggregatedList>
      aggregatedListCallable() {
    return stub.aggregatedListCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Announces the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
   *   Operation response =
   *       publicDelegatedPrefixesClient.announceAsync(project, region, publicDelegatedPrefix).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region where the public delegated prefix is located. It should
   *     comply with RFC1035.
   * @param publicDelegatedPrefix The name of the public delegated prefix. It should comply with
   *     RFC1035.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> announceAsync(
      String project, String region, String publicDelegatedPrefix) {
    AnnouncePublicDelegatedPrefixeRequest request =
        AnnouncePublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefix(publicDelegatedPrefix)
            .build();
    return announceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Announces the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AnnouncePublicDelegatedPrefixeRequest request =
   *       AnnouncePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = publicDelegatedPrefixesClient.announceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> announceAsync(
      AnnouncePublicDelegatedPrefixeRequest request) {
    return announceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Announces the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AnnouncePublicDelegatedPrefixeRequest request =
   *       AnnouncePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       publicDelegatedPrefixesClient.announceOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<AnnouncePublicDelegatedPrefixeRequest, Operation, Operation>
      announceOperationCallable() {
    return stub.announceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Announces the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   AnnouncePublicDelegatedPrefixeRequest request =
   *       AnnouncePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       publicDelegatedPrefixesClient.announceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AnnouncePublicDelegatedPrefixeRequest, Operation> announceCallable() {
    return stub.announceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
   *   Operation response =
   *       publicDelegatedPrefixesClient.deleteAsync(project, region, publicDelegatedPrefix).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region of this request.
   * @param publicDelegatedPrefix Name of the PublicDelegatedPrefix resource to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      String project, String region, String publicDelegatedPrefix) {
    DeletePublicDelegatedPrefixeRequest request =
        DeletePublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefix(publicDelegatedPrefix)
            .build();
    return deleteAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   DeletePublicDelegatedPrefixeRequest request =
   *       DeletePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = publicDelegatedPrefixesClient.deleteAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> deleteAsync(
      DeletePublicDelegatedPrefixeRequest request) {
    return deleteOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   DeletePublicDelegatedPrefixeRequest request =
   *       DeletePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       publicDelegatedPrefixesClient.deleteOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeletePublicDelegatedPrefixeRequest, Operation, Operation>
      deleteOperationCallable() {
    return stub.deleteOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   DeletePublicDelegatedPrefixeRequest request =
   *       DeletePublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       publicDelegatedPrefixesClient.deleteCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeletePublicDelegatedPrefixeRequest, Operation> deleteCallable() {
    return stub.deleteCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified PublicDelegatedPrefix resource in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
   *   PublicDelegatedPrefix response =
   *       publicDelegatedPrefixesClient.get(project, region, publicDelegatedPrefix);
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region of this request.
   * @param publicDelegatedPrefix Name of the PublicDelegatedPrefix resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PublicDelegatedPrefix get(
      String project, String region, String publicDelegatedPrefix) {
    GetPublicDelegatedPrefixeRequest request =
        GetPublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefix(publicDelegatedPrefix)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified PublicDelegatedPrefix resource in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   GetPublicDelegatedPrefixeRequest request =
   *       GetPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .build();
   *   PublicDelegatedPrefix response = publicDelegatedPrefixesClient.get(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final PublicDelegatedPrefix get(GetPublicDelegatedPrefixeRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified PublicDelegatedPrefix resource in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   GetPublicDelegatedPrefixeRequest request =
   *       GetPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .build();
   *   ApiFuture<PublicDelegatedPrefix> future =
   *       publicDelegatedPrefixesClient.getCallable().futureCall(request);
   *   // Do something.
   *   PublicDelegatedPrefix response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetPublicDelegatedPrefixeRequest, PublicDelegatedPrefix>
      getCallable() {
    return stub.getCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a PublicDelegatedPrefix in the specified project in the given region using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   PublicDelegatedPrefix publicDelegatedPrefixResource =
   *       PublicDelegatedPrefix.newBuilder().build();
   *   Operation response =
   *       publicDelegatedPrefixesClient
   *           .insertAsync(project, region, publicDelegatedPrefixResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region of this request.
   * @param publicDelegatedPrefixResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      String project, String region, PublicDelegatedPrefix publicDelegatedPrefixResource) {
    InsertPublicDelegatedPrefixeRequest request =
        InsertPublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefixResource(publicDelegatedPrefixResource)
            .build();
    return insertAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a PublicDelegatedPrefix in the specified project in the given region using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   InsertPublicDelegatedPrefixeRequest request =
   *       InsertPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = publicDelegatedPrefixesClient.insertAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> insertAsync(
      InsertPublicDelegatedPrefixeRequest request) {
    return insertOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a PublicDelegatedPrefix in the specified project in the given region using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   InsertPublicDelegatedPrefixeRequest request =
   *       InsertPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       publicDelegatedPrefixesClient.insertOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<InsertPublicDelegatedPrefixeRequest, Operation, Operation>
      insertOperationCallable() {
    return stub.insertOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a PublicDelegatedPrefix in the specified project in the given region using the
   * parameters that are included in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   InsertPublicDelegatedPrefixeRequest request =
   *       InsertPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       publicDelegatedPrefixesClient.insertCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<InsertPublicDelegatedPrefixeRequest, Operation> insertCallable() {
    return stub.insertCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the PublicDelegatedPrefixes for a project in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   for (PublicDelegatedPrefix element :
   *       publicDelegatedPrefixesClient.list(project, region).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region of this request.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(String project, String region) {
    ListPublicDelegatedPrefixesRequest request =
        ListPublicDelegatedPrefixesRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .build();
    return list(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the PublicDelegatedPrefixes for a project in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   ListPublicDelegatedPrefixesRequest request =
   *       ListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   for (PublicDelegatedPrefix element :
   *       publicDelegatedPrefixesClient.list(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListPagedResponse list(ListPublicDelegatedPrefixesRequest request) {
    return listPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the PublicDelegatedPrefixes for a project in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   ListPublicDelegatedPrefixesRequest request =
   *       ListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   ApiFuture<PublicDelegatedPrefix> future =
   *       publicDelegatedPrefixesClient.listPagedCallable().futureCall(request);
   *   // Do something.
   *   for (PublicDelegatedPrefix element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListPublicDelegatedPrefixesRequest, ListPagedResponse>
      listPagedCallable() {
    return stub.listPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists the PublicDelegatedPrefixes for a project in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   ListPublicDelegatedPrefixesRequest request =
   *       ListPublicDelegatedPrefixesRequest.newBuilder()
   *           .setFilter("filter-1274492040")
   *           .setMaxResults(1128457243)
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageToken("pageToken873572522")
   *           .setProject("project-309310695")
   *           .setRegion("region-934795532")
   *           .setReturnPartialSuccess(true)
   *           .build();
   *   while (true) {
   *     PublicDelegatedPrefixList response =
   *         publicDelegatedPrefixesClient.listCallable().call(request);
   *     for (PublicDelegatedPrefix element : response.getItemsList()) {
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
  public final UnaryCallable<ListPublicDelegatedPrefixesRequest, PublicDelegatedPrefixList>
      listCallable() {
    return stub.listCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified PublicDelegatedPrefix resource with the data included in the request.
   * This method supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
   *   PublicDelegatedPrefix publicDelegatedPrefixResource =
   *       PublicDelegatedPrefix.newBuilder().build();
   *   Operation response =
   *       publicDelegatedPrefixesClient
   *           .patchAsync(project, region, publicDelegatedPrefix, publicDelegatedPrefixResource)
   *           .get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param publicDelegatedPrefix Name of the PublicDelegatedPrefix resource to patch.
   * @param publicDelegatedPrefixResource The body resource for this request
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      String project,
      String region,
      String publicDelegatedPrefix,
      PublicDelegatedPrefix publicDelegatedPrefixResource) {
    PatchPublicDelegatedPrefixeRequest request =
        PatchPublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefix(publicDelegatedPrefix)
            .setPublicDelegatedPrefixResource(publicDelegatedPrefixResource)
            .build();
    return patchAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified PublicDelegatedPrefix resource with the data included in the request.
   * This method supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   PatchPublicDelegatedPrefixeRequest request =
   *       PatchPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = publicDelegatedPrefixesClient.patchAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> patchAsync(
      PatchPublicDelegatedPrefixeRequest request) {
    return patchOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified PublicDelegatedPrefix resource with the data included in the request.
   * This method supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   PatchPublicDelegatedPrefixeRequest request =
   *       PatchPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       publicDelegatedPrefixesClient.patchOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<PatchPublicDelegatedPrefixeRequest, Operation, Operation>
      patchOperationCallable() {
    return stub.patchOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Patches the specified PublicDelegatedPrefix resource with the data included in the request.
   * This method supports PATCH semantics and uses JSON merge patch format and processing rules.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   PatchPublicDelegatedPrefixeRequest request =
   *       PatchPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setPublicDelegatedPrefixResource(PublicDelegatedPrefix.newBuilder().build())
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       publicDelegatedPrefixesClient.patchCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<PatchPublicDelegatedPrefixeRequest, Operation> patchCallable() {
    return stub.patchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Withdraws the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   String project = "project-309310695";
   *   String region = "region-934795532";
   *   String publicDelegatedPrefix = "publicDelegatedPrefix-663003832";
   *   Operation response =
   *       publicDelegatedPrefixesClient.withdrawAsync(project, region, publicDelegatedPrefix).get();
   * }
   * }</pre>
   *
   * @param project Project ID for this request.
   * @param region The name of the region where the public delegated prefix is located. It should
   *     comply with RFC1035.
   * @param publicDelegatedPrefix The name of the public delegated prefix. It should comply with
   *     RFC1035.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> withdrawAsync(
      String project, String region, String publicDelegatedPrefix) {
    WithdrawPublicDelegatedPrefixeRequest request =
        WithdrawPublicDelegatedPrefixeRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setPublicDelegatedPrefix(publicDelegatedPrefix)
            .build();
    return withdrawAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Withdraws the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   WithdrawPublicDelegatedPrefixeRequest request =
   *       WithdrawPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   Operation response = publicDelegatedPrefixesClient.withdrawAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Operation, Operation> withdrawAsync(
      WithdrawPublicDelegatedPrefixeRequest request) {
    return withdrawOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Withdraws the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   WithdrawPublicDelegatedPrefixeRequest request =
   *       WithdrawPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   OperationFuture<Operation, Operation> future =
   *       publicDelegatedPrefixesClient.withdrawOperationCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<WithdrawPublicDelegatedPrefixeRequest, Operation, Operation>
      withdrawOperationCallable() {
    return stub.withdrawOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Withdraws the specified PublicDelegatedPrefix in the given region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (PublicDelegatedPrefixesClient publicDelegatedPrefixesClient =
   *     PublicDelegatedPrefixesClient.create()) {
   *   WithdrawPublicDelegatedPrefixeRequest request =
   *       WithdrawPublicDelegatedPrefixeRequest.newBuilder()
   *           .setProject("project-309310695")
   *           .setPublicDelegatedPrefix("publicDelegatedPrefix-663003832")
   *           .setRegion("region-934795532")
   *           .setRequestId("requestId693933066")
   *           .build();
   *   ApiFuture<Operation> future =
   *       publicDelegatedPrefixesClient.withdrawCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<WithdrawPublicDelegatedPrefixeRequest, Operation> withdrawCallable() {
    return stub.withdrawCallable();
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

  public static class AggregatedListPagedResponse
      extends AbstractPagedListResponse<
          AggregatedListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixAggregatedList,
          Map.Entry<String, PublicDelegatedPrefixesScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    public static ApiFuture<AggregatedListPagedResponse> createAsync(
        PageContext<
                AggregatedListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixAggregatedList,
                Map.Entry<String, PublicDelegatedPrefixesScopedList>>
            context,
        ApiFuture<PublicDelegatedPrefixAggregatedList> futureResponse) {
      ApiFuture<AggregatedListPage> futurePage =
          AggregatedListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new AggregatedListPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private AggregatedListPagedResponse(AggregatedListPage page) {
      super(page, AggregatedListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class AggregatedListPage
      extends AbstractPage<
          AggregatedListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixAggregatedList,
          Map.Entry<String, PublicDelegatedPrefixesScopedList>,
          AggregatedListPage> {

    private AggregatedListPage(
        PageContext<
                AggregatedListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixAggregatedList,
                Map.Entry<String, PublicDelegatedPrefixesScopedList>>
            context,
        PublicDelegatedPrefixAggregatedList response) {
      super(context, response);
    }

    private static AggregatedListPage createEmptyPage() {
      return new AggregatedListPage(null, null);
    }

    @Override
    protected AggregatedListPage createPage(
        PageContext<
                AggregatedListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixAggregatedList,
                Map.Entry<String, PublicDelegatedPrefixesScopedList>>
            context,
        PublicDelegatedPrefixAggregatedList response) {
      return new AggregatedListPage(context, response);
    }

    @Override
    public ApiFuture<AggregatedListPage> createPageAsync(
        PageContext<
                AggregatedListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixAggregatedList,
                Map.Entry<String, PublicDelegatedPrefixesScopedList>>
            context,
        ApiFuture<PublicDelegatedPrefixAggregatedList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class AggregatedListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          AggregatedListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixAggregatedList,
          Map.Entry<String, PublicDelegatedPrefixesScopedList>,
          AggregatedListPage,
          AggregatedListFixedSizeCollection> {

    private AggregatedListFixedSizeCollection(List<AggregatedListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static AggregatedListFixedSizeCollection createEmptyCollection() {
      return new AggregatedListFixedSizeCollection(null, 0);
    }

    @Override
    protected AggregatedListFixedSizeCollection createCollection(
        List<AggregatedListPage> pages, int collectionSize) {
      return new AggregatedListFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListPagedResponse
      extends AbstractPagedListResponse<
          ListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixList,
          PublicDelegatedPrefix,
          ListPage,
          ListFixedSizeCollection> {

    public static ApiFuture<ListPagedResponse> createAsync(
        PageContext<
                ListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixList,
                PublicDelegatedPrefix>
            context,
        ApiFuture<PublicDelegatedPrefixList> futureResponse) {
      ApiFuture<ListPage> futurePage =
          ListPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListPagedResponse(ListPage page) {
      super(page, ListFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListPage
      extends AbstractPage<
          ListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixList,
          PublicDelegatedPrefix,
          ListPage> {

    private ListPage(
        PageContext<
                ListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixList,
                PublicDelegatedPrefix>
            context,
        PublicDelegatedPrefixList response) {
      super(context, response);
    }

    private static ListPage createEmptyPage() {
      return new ListPage(null, null);
    }

    @Override
    protected ListPage createPage(
        PageContext<
                ListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixList,
                PublicDelegatedPrefix>
            context,
        PublicDelegatedPrefixList response) {
      return new ListPage(context, response);
    }

    @Override
    public ApiFuture<ListPage> createPageAsync(
        PageContext<
                ListPublicDelegatedPrefixesRequest,
                PublicDelegatedPrefixList,
                PublicDelegatedPrefix>
            context,
        ApiFuture<PublicDelegatedPrefixList> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListPublicDelegatedPrefixesRequest,
          PublicDelegatedPrefixList,
          PublicDelegatedPrefix,
          ListPage,
          ListFixedSizeCollection> {

    private ListFixedSizeCollection(List<ListPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFixedSizeCollection createEmptyCollection() {
      return new ListFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFixedSizeCollection createCollection(List<ListPage> pages, int collectionSize) {
      return new ListFixedSizeCollection(pages, collectionSize);
    }
  }
}
