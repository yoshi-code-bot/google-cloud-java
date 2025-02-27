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

package com.google.cloud.billing.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.billing.v1.stub.CloudCatalogStub;
import com.google.cloud.billing.v1.stub.CloudCatalogStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A catalog of Google Cloud Platform services and SKUs. Provides pricing
 * information and metadata on Google Cloud Platform services and SKUs.
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
 * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
 *   for (Service element : cloudCatalogClient.listServices().iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CloudCatalogClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListServices</td>
 *      <td><p> Lists all public cloud services.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listServices(ListServicesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listServices()
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listServicesPagedCallable()
 *           <li><p> listServicesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListSkus</td>
 *      <td><p> Lists all publicly available SKUs for a given cloud service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listSkus(ListSkusRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listSkus(ServiceName parent)
 *           <li><p> listSkus(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listSkusPagedCallable()
 *           <li><p> listSkusCallable()
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
 * <p>This class can be customized by passing in a custom instance of CloudCatalogSettings to
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
 * CloudCatalogSettings cloudCatalogSettings =
 *     CloudCatalogSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create(cloudCatalogSettings);
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
 * CloudCatalogSettings cloudCatalogSettings =
 *     CloudCatalogSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create(cloudCatalogSettings);
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
 * CloudCatalogSettings cloudCatalogSettings = CloudCatalogSettings.newHttpJsonBuilder().build();
 * CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create(cloudCatalogSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CloudCatalogClient implements BackgroundResource {
  private final CloudCatalogSettings settings;
  private final CloudCatalogStub stub;

  /** Constructs an instance of CloudCatalogClient with default settings. */
  public static final CloudCatalogClient create() throws IOException {
    return create(CloudCatalogSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CloudCatalogClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CloudCatalogClient create(CloudCatalogSettings settings) throws IOException {
    return new CloudCatalogClient(settings);
  }

  /**
   * Constructs an instance of CloudCatalogClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CloudCatalogSettings).
   */
  public static final CloudCatalogClient create(CloudCatalogStub stub) {
    return new CloudCatalogClient(stub);
  }

  /**
   * Constructs an instance of CloudCatalogClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CloudCatalogClient(CloudCatalogSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CloudCatalogStubSettings) settings.getStubSettings()).createStub();
  }

  protected CloudCatalogClient(CloudCatalogStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final CloudCatalogSettings getSettings() {
    return settings;
  }

  public CloudCatalogStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all public cloud services.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   for (Service element : cloudCatalogClient.listServices().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices() {
    ListServicesRequest request = ListServicesRequest.newBuilder().build();
    return listServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all public cloud services.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListServicesRequest request =
   *       ListServicesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Service element : cloudCatalogClient.listServices(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(ListServicesRequest request) {
    return listServicesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all public cloud services.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListServicesRequest request =
   *       ListServicesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Service> future =
   *       cloudCatalogClient.listServicesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Service element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListServicesRequest, ListServicesPagedResponse>
      listServicesPagedCallable() {
    return stub.listServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all public cloud services.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListServicesRequest request =
   *       ListServicesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListServicesResponse response = cloudCatalogClient.listServicesCallable().call(request);
   *     for (Service element : response.getServicesList()) {
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
  public final UnaryCallable<ListServicesRequest, ListServicesResponse> listServicesCallable() {
    return stub.listServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all publicly available SKUs for a given cloud service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ServiceName parent = ServiceName.of("[SERVICE]");
   *   for (Sku element : cloudCatalogClient.listSkus(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the service. Example: "services/6F81-5844-456A"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSkusPagedResponse listSkus(ServiceName parent) {
    ListSkusRequest request =
        ListSkusRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listSkus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all publicly available SKUs for a given cloud service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   String parent = ServiceName.of("[SERVICE]").toString();
   *   for (Sku element : cloudCatalogClient.listSkus(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the service. Example: "services/6F81-5844-456A"
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSkusPagedResponse listSkus(String parent) {
    ListSkusRequest request = ListSkusRequest.newBuilder().setParent(parent).build();
    return listSkus(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all publicly available SKUs for a given cloud service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListSkusRequest request =
   *       ListSkusRequest.newBuilder()
   *           .setParent(ServiceName.of("[SERVICE]").toString())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Sku element : cloudCatalogClient.listSkus(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSkusPagedResponse listSkus(ListSkusRequest request) {
    return listSkusPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all publicly available SKUs for a given cloud service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListSkusRequest request =
   *       ListSkusRequest.newBuilder()
   *           .setParent(ServiceName.of("[SERVICE]").toString())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Sku> future = cloudCatalogClient.listSkusPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Sku element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSkusRequest, ListSkusPagedResponse> listSkusPagedCallable() {
    return stub.listSkusPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all publicly available SKUs for a given cloud service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
   *   ListSkusRequest request =
   *       ListSkusRequest.newBuilder()
   *           .setParent(ServiceName.of("[SERVICE]").toString())
   *           .setStartTime(Timestamp.newBuilder().build())
   *           .setEndTime(Timestamp.newBuilder().build())
   *           .setCurrencyCode("currencyCode1004773790")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListSkusResponse response = cloudCatalogClient.listSkusCallable().call(request);
   *     for (Sku element : response.getSkusList()) {
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
  public final UnaryCallable<ListSkusRequest, ListSkusResponse> listSkusCallable() {
    return stub.listSkusCallable();
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

  public static class ListServicesPagedResponse
      extends AbstractPagedListResponse<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    public static ApiFuture<ListServicesPagedResponse> createAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      ApiFuture<ListServicesPage> futurePage =
          ListServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListServicesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListServicesPagedResponse(ListServicesPage page) {
      super(page, ListServicesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListServicesPage
      extends AbstractPage<ListServicesRequest, ListServicesResponse, Service, ListServicesPage> {

    private ListServicesPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      super(context, response);
    }

    private static ListServicesPage createEmptyPage() {
      return new ListServicesPage(null, null);
    }

    @Override
    protected ListServicesPage createPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      return new ListServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListServicesPage> createPageAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListServicesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    private ListServicesFixedSizeCollection(List<ListServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListServicesFixedSizeCollection createEmptyCollection() {
      return new ListServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListServicesFixedSizeCollection createCollection(
        List<ListServicesPage> pages, int collectionSize) {
      return new ListServicesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSkusPagedResponse
      extends AbstractPagedListResponse<
          ListSkusRequest, ListSkusResponse, Sku, ListSkusPage, ListSkusFixedSizeCollection> {

    public static ApiFuture<ListSkusPagedResponse> createAsync(
        PageContext<ListSkusRequest, ListSkusResponse, Sku> context,
        ApiFuture<ListSkusResponse> futureResponse) {
      ApiFuture<ListSkusPage> futurePage =
          ListSkusPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListSkusPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListSkusPagedResponse(ListSkusPage page) {
      super(page, ListSkusFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSkusPage
      extends AbstractPage<ListSkusRequest, ListSkusResponse, Sku, ListSkusPage> {

    private ListSkusPage(
        PageContext<ListSkusRequest, ListSkusResponse, Sku> context, ListSkusResponse response) {
      super(context, response);
    }

    private static ListSkusPage createEmptyPage() {
      return new ListSkusPage(null, null);
    }

    @Override
    protected ListSkusPage createPage(
        PageContext<ListSkusRequest, ListSkusResponse, Sku> context, ListSkusResponse response) {
      return new ListSkusPage(context, response);
    }

    @Override
    public ApiFuture<ListSkusPage> createPageAsync(
        PageContext<ListSkusRequest, ListSkusResponse, Sku> context,
        ApiFuture<ListSkusResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSkusFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSkusRequest, ListSkusResponse, Sku, ListSkusPage, ListSkusFixedSizeCollection> {

    private ListSkusFixedSizeCollection(List<ListSkusPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSkusFixedSizeCollection createEmptyCollection() {
      return new ListSkusFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSkusFixedSizeCollection createCollection(
        List<ListSkusPage> pages, int collectionSize) {
      return new ListSkusFixedSizeCollection(pages, collectionSize);
    }
  }
}
