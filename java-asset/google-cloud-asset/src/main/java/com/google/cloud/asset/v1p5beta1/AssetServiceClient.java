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

package com.google.cloud.asset.v1p5beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.asset.v1p5beta1.stub.AssetServiceStub;
import com.google.cloud.asset.v1p5beta1.stub.AssetServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Asset service definition.
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
 * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
 *   ResourceName parent =
 *       new ResourceName() {
 *         {@literal @}Override
 *         public Map<String, String> getFieldValuesMap() {
 *           Map<String, String> fieldValuesMap = new HashMap<>();
 *           fieldValuesMap.put("parent", "parent-4715/parent-4715");
 *           return fieldValuesMap;
 *         }
 *
 *         {@literal @}Override
 *         public String getFieldValue(String fieldName) {
 *           return getFieldValuesMap().get(fieldName);
 *         }
 *
 *         {@literal @}Override
 *         public String toString() {
 *           return "parent-4715/parent-4715";
 *         }
 *       };
 *   for (Asset element : assetServiceClient.listAssets(parent).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the AssetServiceClient object to clean up resources such
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
 *      <td><p> ListAssets</td>
 *      <td><p> Lists assets with time and resource types and returns paged results in response.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listAssets(ListAssetsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listAssets(ResourceName parent)
 *           <li><p> listAssets(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listAssetsPagedCallable()
 *           <li><p> listAssetsCallable()
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
 * <p>This class can be customized by passing in a custom instance of AssetServiceSettings to
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
 * AssetServiceSettings assetServiceSettings =
 *     AssetServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
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
 * AssetServiceSettings assetServiceSettings =
 *     AssetServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
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
 * AssetServiceSettings assetServiceSettings = AssetServiceSettings.newHttpJsonBuilder().build();
 * AssetServiceClient assetServiceClient = AssetServiceClient.create(assetServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AssetServiceClient implements BackgroundResource {
  private final AssetServiceSettings settings;
  private final AssetServiceStub stub;

  /** Constructs an instance of AssetServiceClient with default settings. */
  public static final AssetServiceClient create() throws IOException {
    return create(AssetServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final AssetServiceClient create(AssetServiceSettings settings) throws IOException {
    return new AssetServiceClient(settings);
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(AssetServiceSettings).
   */
  public static final AssetServiceClient create(AssetServiceStub stub) {
    return new AssetServiceClient(stub);
  }

  /**
   * Constructs an instance of AssetServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected AssetServiceClient(AssetServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((AssetServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected AssetServiceClient(AssetServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final AssetServiceSettings getSettings() {
    return settings;
  }

  public AssetServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists assets with time and resource types and returns paged results in response.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   ResourceName parent =
   *       new ResourceName() {
   *         {@literal @}Override
   *         public Map<String, String> getFieldValuesMap() {
   *           Map<String, String> fieldValuesMap = new HashMap<>();
   *           fieldValuesMap.put("parent", "parent-4715/parent-4715");
   *           return fieldValuesMap;
   *         }
   *
   *         {@literal @}Override
   *         public String getFieldValue(String fieldName) {
   *           return getFieldValuesMap().get(fieldName);
   *         }
   *
   *         {@literal @}Override
   *         public String toString() {
   *           return "parent-4715/parent-4715";
   *         }
   *       };
   *   for (Asset element : assetServiceClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization or project the assets belong to. Format:
   *     "organizations/[organization-number]" (such as "organizations/123"),
   *     "projects/[project-id]" (such as "projects/my-project-id"), or "projects/[project-number]"
   *     (such as "projects/12345").
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(ResourceName parent) {
    ListAssetsRequest request =
        ListAssetsRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists assets with time and resource types and returns paged results in response.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   String parent =
   *       new ResourceName() {
   *         {@literal @}Override
   *         public Map<String, String> getFieldValuesMap() {
   *           Map<String, String> fieldValuesMap = new HashMap<>();
   *           fieldValuesMap.put("parent", "parent-995424086");
   *           return fieldValuesMap;
   *         }
   *
   *         {@literal @}Override
   *         public String getFieldValue(String fieldName) {
   *           return getFieldValuesMap().get(fieldName);
   *         }
   *
   *         {@literal @}Override
   *         public String toString() {
   *           return "parent-995424086";
   *         }
   *       }.toString();
   *   for (Asset element : assetServiceClient.listAssets(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. Name of the organization or project the assets belong to. Format:
   *     "organizations/[organization-number]" (such as "organizations/123"),
   *     "projects/[project-id]" (such as "projects/my-project-id"), or "projects/[project-number]"
   *     (such as "projects/12345").
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(String parent) {
    ListAssetsRequest request = ListAssetsRequest.newBuilder().setParent(parent).build();
    return listAssets(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists assets with time and resource types and returns paged results in response.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent("ListAssetsRequest-221586066".toString())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setContentType(ContentType.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Asset element : assetServiceClient.listAssets(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAssetsPagedResponse listAssets(ListAssetsRequest request) {
    return listAssetsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists assets with time and resource types and returns paged results in response.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent("ListAssetsRequest-221586066".toString())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setContentType(ContentType.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Asset> future = assetServiceClient.listAssetsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Asset element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAssetsRequest, ListAssetsPagedResponse> listAssetsPagedCallable() {
    return stub.listAssetsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists assets with time and resource types and returns paged results in response.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (AssetServiceClient assetServiceClient = AssetServiceClient.create()) {
   *   ListAssetsRequest request =
   *       ListAssetsRequest.newBuilder()
   *           .setParent("ListAssetsRequest-221586066".toString())
   *           .setReadTime(Timestamp.newBuilder().build())
   *           .addAllAssetTypes(new ArrayList<String>())
   *           .setContentType(ContentType.forNumber(0))
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListAssetsResponse response = assetServiceClient.listAssetsCallable().call(request);
   *     for (Asset element : response.getAssetsList()) {
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
  public final UnaryCallable<ListAssetsRequest, ListAssetsResponse> listAssetsCallable() {
    return stub.listAssetsCallable();
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

  public static class ListAssetsPagedResponse
      extends AbstractPagedListResponse<
          ListAssetsRequest,
          ListAssetsResponse,
          Asset,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    public static ApiFuture<ListAssetsPagedResponse> createAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, Asset> context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      ApiFuture<ListAssetsPage> futurePage =
          ListAssetsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListAssetsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListAssetsPagedResponse(ListAssetsPage page) {
      super(page, ListAssetsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAssetsPage
      extends AbstractPage<ListAssetsRequest, ListAssetsResponse, Asset, ListAssetsPage> {

    private ListAssetsPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, Asset> context,
        ListAssetsResponse response) {
      super(context, response);
    }

    private static ListAssetsPage createEmptyPage() {
      return new ListAssetsPage(null, null);
    }

    @Override
    protected ListAssetsPage createPage(
        PageContext<ListAssetsRequest, ListAssetsResponse, Asset> context,
        ListAssetsResponse response) {
      return new ListAssetsPage(context, response);
    }

    @Override
    public ApiFuture<ListAssetsPage> createPageAsync(
        PageContext<ListAssetsRequest, ListAssetsResponse, Asset> context,
        ApiFuture<ListAssetsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAssetsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAssetsRequest,
          ListAssetsResponse,
          Asset,
          ListAssetsPage,
          ListAssetsFixedSizeCollection> {

    private ListAssetsFixedSizeCollection(List<ListAssetsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAssetsFixedSizeCollection createEmptyCollection() {
      return new ListAssetsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAssetsFixedSizeCollection createCollection(
        List<ListAssetsPage> pages, int collectionSize) {
      return new ListAssetsFixedSizeCollection(pages, collectionSize);
    }
  }
}
