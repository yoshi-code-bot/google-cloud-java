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

package com.google.cloud.recommender.v1beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recommender.v1beta1.stub.RecommenderStub;
import com.google.cloud.recommender.v1beta1.stub.RecommenderStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Provides insights and recommendations for cloud customers for various
 * categories like performance optimization, cost savings, reliability, feature discovery, etc.
 * Insights and recommendations are generated automatically based on analysis of user resources,
 * configuration and monitoring metrics.
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
 * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
 *   InsightName name =
 *       InsightName.ofProjectLocationInsightTypeInsightName(
 *           "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
 *   Insight response = recommenderClient.getInsight(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RecommenderClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListInsights</td>
 *      <td><p> Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM permission for the specified insight type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listInsights(ListInsightsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listInsights(InsightTypeName parent)
 *           <li><p> listInsights(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listInsightsPagedCallable()
 *           <li><p> listInsightsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetInsight</td>
 *      <td><p> Gets the requested insight. Requires the recommender.&#42;.get IAM permission for the specified insight type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getInsight(GetInsightRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getInsight(InsightName name)
 *           <li><p> getInsight(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getInsightCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MarkInsightAccepted</td>
 *      <td><p> Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender API that they have applied some action based on the insight. This stops the insight content from being updated.
 * <p>  MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the recommender.&#42;.update IAM permission for the specified insight.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> markInsightAccepted(MarkInsightAcceptedRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> markInsightAccepted(InsightName name, Map&lt;String, String&gt; stateMetadata, String etag)
 *           <li><p> markInsightAccepted(String name, Map&lt;String, String&gt; stateMetadata, String etag)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> markInsightAcceptedCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListRecommendations</td>
 *      <td><p> Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM permission for the specified recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listRecommendations(ListRecommendationsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listRecommendations(RecommenderName parent, String filter)
 *           <li><p> listRecommendations(String parent, String filter)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listRecommendationsPagedCallable()
 *           <li><p> listRecommendationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetRecommendation</td>
 *      <td><p> Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the specified recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getRecommendation(GetRecommendationRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getRecommendation(RecommendationName name)
 *           <li><p> getRecommendation(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getRecommendationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MarkRecommendationClaimed</td>
 *      <td><p> Marks the Recommendation State as Claimed. Users can use this method to indicate to the Recommender API that they are starting to apply the recommendation themselves. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state.
 * <p>  MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state.
 * <p>  Requires the recommender.&#42;.update IAM permission for the specified recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> markRecommendationClaimed(MarkRecommendationClaimedRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> markRecommendationClaimed(RecommendationName name, Map&lt;String, String&gt; stateMetadata, String etag)
 *           <li><p> markRecommendationClaimed(String name, Map&lt;String, String&gt; stateMetadata, String etag)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> markRecommendationClaimedCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MarkRecommendationSucceeded</td>
 *      <td><p> Marks the Recommendation State as Succeeded. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation was successful. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state.
 * <p>  MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state.
 * <p>  Requires the recommender.&#42;.update IAM permission for the specified recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> markRecommendationSucceeded(MarkRecommendationSucceededRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> markRecommendationSucceeded(RecommendationName name, Map&lt;String, String&gt; stateMetadata, String etag)
 *           <li><p> markRecommendationSucceeded(String name, Map&lt;String, String&gt; stateMetadata, String etag)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> markRecommendationSucceededCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MarkRecommendationFailed</td>
 *      <td><p> Marks the Recommendation State as Failed. Users can use this method to indicate to the Recommender API that they have applied the recommendation themselves, and the operation failed. This stops the recommendation content from being updated. Associated insights are frozen and placed in the ACCEPTED state.
 * <p>  MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or FAILED state.
 * <p>  Requires the recommender.&#42;.update IAM permission for the specified recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> markRecommendationFailed(MarkRecommendationFailedRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> markRecommendationFailed(RecommendationName name, Map&lt;String, String&gt; stateMetadata, String etag)
 *           <li><p> markRecommendationFailed(String name, Map&lt;String, String&gt; stateMetadata, String etag)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> markRecommendationFailedCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetRecommenderConfig</td>
 *      <td><p> Gets the requested Recommender Config. There is only one instance of the config for each Recommender.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getRecommenderConfig(GetRecommenderConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getRecommenderConfig(RecommenderConfigName name)
 *           <li><p> getRecommenderConfig(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getRecommenderConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateRecommenderConfig</td>
 *      <td><p> Updates a Recommender Config. This will create a new revision of the config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateRecommenderConfig(UpdateRecommenderConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateRecommenderConfig(RecommenderConfig recommenderConfig, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateRecommenderConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetInsightTypeConfig</td>
 *      <td><p> Gets the requested InsightTypeConfig. There is only one instance of the config for each InsightType.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getInsightTypeConfig(GetInsightTypeConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getInsightTypeConfig(InsightTypeConfigName name)
 *           <li><p> getInsightTypeConfig(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getInsightTypeConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateInsightTypeConfig</td>
 *      <td><p> Updates an InsightTypeConfig change. This will create a new revision of the config.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateInsightTypeConfig(UpdateInsightTypeConfigRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateInsightTypeConfig(InsightTypeConfig insightTypeConfig, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateInsightTypeConfigCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListRecommenders</td>
 *      <td><p> Lists all available Recommenders. No IAM permissions are required.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listRecommenders(ListRecommendersRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listRecommendersPagedCallable()
 *           <li><p> listRecommendersCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListInsightTypes</td>
 *      <td><p> Lists available InsightTypes. No IAM permissions are required.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listInsightTypes(ListInsightTypesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listInsightTypesPagedCallable()
 *           <li><p> listInsightTypesCallable()
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
 * <p>This class can be customized by passing in a custom instance of RecommenderSettings to
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
 * RecommenderSettings recommenderSettings =
 *     RecommenderSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RecommenderClient recommenderClient = RecommenderClient.create(recommenderSettings);
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
 * RecommenderSettings recommenderSettings =
 *     RecommenderSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RecommenderClient recommenderClient = RecommenderClient.create(recommenderSettings);
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
 * RecommenderSettings recommenderSettings = RecommenderSettings.newHttpJsonBuilder().build();
 * RecommenderClient recommenderClient = RecommenderClient.create(recommenderSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class RecommenderClient implements BackgroundResource {
  private final RecommenderSettings settings;
  private final RecommenderStub stub;

  /** Constructs an instance of RecommenderClient with default settings. */
  public static final RecommenderClient create() throws IOException {
    return create(RecommenderSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RecommenderClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RecommenderClient create(RecommenderSettings settings) throws IOException {
    return new RecommenderClient(settings);
  }

  /**
   * Constructs an instance of RecommenderClient, using the given stub for making calls. This is for
   * advanced usage - prefer using create(RecommenderSettings).
   */
  public static final RecommenderClient create(RecommenderStub stub) {
    return new RecommenderClient(stub);
  }

  /**
   * Constructs an instance of RecommenderClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected RecommenderClient(RecommenderSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RecommenderStubSettings) settings.getStubSettings()).createStub();
  }

  protected RecommenderClient(RecommenderStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RecommenderSettings getSettings() {
    return settings;
  }

  public RecommenderStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   InsightTypeName parent =
   *       InsightTypeName.ofProjectLocationInsightTypeName(
   *           "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]");
   *   for (Insight element : recommenderClient.listInsights(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The container resource on which to execute the request. Acceptable
   *     formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`folders/[FOLDER_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <p>LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/
   *     INSIGHT_TYPE_ID refers to supported insight types:
   *     https://cloud.google.com/recommender/docs/insights/insight-types.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInsightsPagedResponse listInsights(InsightTypeName parent) {
    ListInsightsRequest request =
        ListInsightsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listInsights(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String parent =
   *       InsightTypeName.ofProjectLocationInsightTypeName(
   *               "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *           .toString();
   *   for (Insight element : recommenderClient.listInsights(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The container resource on which to execute the request. Acceptable
   *     formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`folders/[FOLDER_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/insightTypes/[INSIGHT_TYPE_ID]`
   *     </ul>
   *     <p>LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/
   *     INSIGHT_TYPE_ID refers to supported insight types:
   *     https://cloud.google.com/recommender/docs/insights/insight-types.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInsightsPagedResponse listInsights(String parent) {
    ListInsightsRequest request = ListInsightsRequest.newBuilder().setParent(parent).build();
    return listInsights(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightsRequest request =
   *       ListInsightsRequest.newBuilder()
   *           .setParent(
   *               InsightTypeName.ofProjectLocationInsightTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   for (Insight element : recommenderClient.listInsights(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInsightsPagedResponse listInsights(ListInsightsRequest request) {
    return listInsightsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightsRequest request =
   *       ListInsightsRequest.newBuilder()
   *           .setParent(
   *               InsightTypeName.ofProjectLocationInsightTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<Insight> future = recommenderClient.listInsightsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Insight element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInsightsRequest, ListInsightsPagedResponse>
      listInsightsPagedCallable() {
    return stub.listInsightsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists insights for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightsRequest request =
   *       ListInsightsRequest.newBuilder()
   *           .setParent(
   *               InsightTypeName.ofProjectLocationInsightTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   while (true) {
   *     ListInsightsResponse response = recommenderClient.listInsightsCallable().call(request);
   *     for (Insight element : response.getInsightsList()) {
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
  public final UnaryCallable<ListInsightsRequest, ListInsightsResponse> listInsightsCallable() {
    return stub.listInsightsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested insight. Requires the recommender.&#42;.get IAM permission for the specified
   * insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   InsightName name =
   *       InsightName.ofProjectLocationInsightTypeInsightName(
   *           "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
   *   Insight response = recommenderClient.getInsight(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the insight.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight getInsight(InsightName name) {
    GetInsightRequest request =
        GetInsightRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getInsight(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested insight. Requires the recommender.&#42;.get IAM permission for the specified
   * insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       InsightName.ofProjectLocationInsightTypeInsightName(
   *               "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *           .toString();
   *   Insight response = recommenderClient.getInsight(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the insight.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight getInsight(String name) {
    GetInsightRequest request = GetInsightRequest.newBuilder().setName(name).build();
    return getInsight(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested insight. Requires the recommender.&#42;.get IAM permission for the specified
   * insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetInsightRequest request =
   *       GetInsightRequest.newBuilder()
   *           .setName(
   *               InsightName.ofProjectLocationInsightTypeInsightName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *                   .toString())
   *           .build();
   *   Insight response = recommenderClient.getInsight(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight getInsight(GetInsightRequest request) {
    return getInsightCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested insight. Requires the recommender.&#42;.get IAM permission for the specified
   * insight type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetInsightRequest request =
   *       GetInsightRequest.newBuilder()
   *           .setName(
   *               InsightName.ofProjectLocationInsightTypeInsightName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Insight> future = recommenderClient.getInsightCallable().futureCall(request);
   *   // Do something.
   *   Insight response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInsightRequest, Insight> getInsightCallable() {
    return stub.getInsightCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender
   * API that they have applied some action based on the insight. This stops the insight content
   * from being updated.
   *
   * <p>MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the
   * recommender.&#42;.update IAM permission for the specified insight.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   InsightName name =
   *       InsightName.ofProjectLocationInsightTypeInsightName(
   *           "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]");
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Insight response = recommenderClient.markInsightAccepted(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the insight.
   * @param stateMetadata Optional. State properties user wish to include with this state. Full
   *     replace of the current state_metadata.
   * @param etag Required. Fingerprint of the Insight. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight markInsightAccepted(
      InsightName name, Map<String, String> stateMetadata, String etag) {
    MarkInsightAcceptedRequest request =
        MarkInsightAcceptedRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markInsightAccepted(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender
   * API that they have applied some action based on the insight. This stops the insight content
   * from being updated.
   *
   * <p>MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the
   * recommender.&#42;.update IAM permission for the specified insight.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       InsightName.ofProjectLocationInsightTypeInsightName(
   *               "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *           .toString();
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Insight response = recommenderClient.markInsightAccepted(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the insight.
   * @param stateMetadata Optional. State properties user wish to include with this state. Full
   *     replace of the current state_metadata.
   * @param etag Required. Fingerprint of the Insight. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight markInsightAccepted(
      String name, Map<String, String> stateMetadata, String etag) {
    MarkInsightAcceptedRequest request =
        MarkInsightAcceptedRequest.newBuilder()
            .setName(name)
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markInsightAccepted(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender
   * API that they have applied some action based on the insight. This stops the insight content
   * from being updated.
   *
   * <p>MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the
   * recommender.&#42;.update IAM permission for the specified insight.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkInsightAcceptedRequest request =
   *       MarkInsightAcceptedRequest.newBuilder()
   *           .setName(
   *               InsightName.ofProjectLocationInsightTypeInsightName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   Insight response = recommenderClient.markInsightAccepted(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Insight markInsightAccepted(MarkInsightAcceptedRequest request) {
    return markInsightAcceptedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Insight State as Accepted. Users can use this method to indicate to the Recommender
   * API that they have applied some action based on the insight. This stops the insight content
   * from being updated.
   *
   * <p>MarkInsightAccepted can be applied to insights in ACTIVE state. Requires the
   * recommender.&#42;.update IAM permission for the specified insight.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkInsightAcceptedRequest request =
   *       MarkInsightAcceptedRequest.newBuilder()
   *           .setName(
   *               InsightName.ofProjectLocationInsightTypeInsightName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]", "[INSIGHT]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Insight> future =
   *       recommenderClient.markInsightAcceptedCallable().futureCall(request);
   *   // Do something.
   *   Insight response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MarkInsightAcceptedRequest, Insight> markInsightAcceptedCallable() {
    return stub.markInsightAcceptedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommenderName parent =
   *       RecommenderName.ofProjectLocationRecommenderName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   String filter = "filter-1274492040";
   *   for (Recommendation element :
   *       recommenderClient.listRecommendations(parent, filter).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The container resource on which to execute the request. Acceptable
   *     formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`folders/[FOLDER_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <p>LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/
   *     RECOMMENDER_ID refers to supported recommenders:
   *     https://cloud.google.com/recommender/docs/recommenders.
   * @param filter Filter expression to restrict the recommendations returned. Supported filter
   *     fields:
   *     <ul>
   *       <li>`state_info.state`
   *     </ul>
   *     <ul>
   *       <li>`recommenderSubtype`
   *     </ul>
   *     <ul>
   *       <li>`priority`
   *     </ul>
   *     <p>Examples:
   *     <ul>
   *       <li>`stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED`
   *     </ul>
   *     <ul>
   *       <li>`recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE`
   *     </ul>
   *     <ul>
   *       <li>`priority = P1 OR priority = P2`
   *     </ul>
   *     <ul>
   *       <li>`stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)`
   *     </ul>
   *     <p>(These expressions are based on the filter language described at
   *     https://google.aip.dev/160)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendationsPagedResponse listRecommendations(
      RecommenderName parent, String filter) {
    ListRecommendationsRequest request =
        ListRecommendationsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFilter(filter)
            .build();
    return listRecommendations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String parent =
   *       RecommenderName.ofProjectLocationRecommenderName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *           .toString();
   *   String filter = "filter-1274492040";
   *   for (Recommendation element :
   *       recommenderClient.listRecommendations(parent, filter).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The container resource on which to execute the request. Acceptable
   *     formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`folders/[FOLDER_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]`
   *     </ul>
   *     <p>LOCATION here refers to GCP Locations: https://cloud.google.com/about/locations/
   *     RECOMMENDER_ID refers to supported recommenders:
   *     https://cloud.google.com/recommender/docs/recommenders.
   * @param filter Filter expression to restrict the recommendations returned. Supported filter
   *     fields:
   *     <ul>
   *       <li>`state_info.state`
   *     </ul>
   *     <ul>
   *       <li>`recommenderSubtype`
   *     </ul>
   *     <ul>
   *       <li>`priority`
   *     </ul>
   *     <p>Examples:
   *     <ul>
   *       <li>`stateInfo.state = ACTIVE OR stateInfo.state = DISMISSED`
   *     </ul>
   *     <ul>
   *       <li>`recommenderSubtype = REMOVE_ROLE OR recommenderSubtype = REPLACE_ROLE`
   *     </ul>
   *     <ul>
   *       <li>`priority = P1 OR priority = P2`
   *     </ul>
   *     <ul>
   *       <li>`stateInfo.state = ACTIVE AND (priority = P1 OR priority = P2)`
   *     </ul>
   *     <p>(These expressions are based on the filter language described at
   *     https://google.aip.dev/160)
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendationsPagedResponse listRecommendations(String parent, String filter) {
    ListRecommendationsRequest request =
        ListRecommendationsRequest.newBuilder().setParent(parent).setFilter(filter).build();
    return listRecommendations(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendationsRequest request =
   *       ListRecommendationsRequest.newBuilder()
   *           .setParent(
   *               RecommenderName.ofProjectLocationRecommenderName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   for (Recommendation element : recommenderClient.listRecommendations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendationsPagedResponse listRecommendations(
      ListRecommendationsRequest request) {
    return listRecommendationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendationsRequest request =
   *       ListRecommendationsRequest.newBuilder()
   *           .setParent(
   *               RecommenderName.ofProjectLocationRecommenderName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   ApiFuture<Recommendation> future =
   *       recommenderClient.listRecommendationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Recommendation element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRecommendationsRequest, ListRecommendationsPagedResponse>
      listRecommendationsPagedCallable() {
    return stub.listRecommendationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists recommendations for the specified Cloud Resource. Requires the recommender.&#42;.list IAM
   * permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendationsRequest request =
   *       ListRecommendationsRequest.newBuilder()
   *           .setParent(
   *               RecommenderName.ofProjectLocationRecommenderName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .build();
   *   while (true) {
   *     ListRecommendationsResponse response =
   *         recommenderClient.listRecommendationsCallable().call(request);
   *     for (Recommendation element : response.getRecommendationsList()) {
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
  public final UnaryCallable<ListRecommendationsRequest, ListRecommendationsResponse>
      listRecommendationsCallable() {
    return stub.listRecommendationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommendationName name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   Recommendation response = recommenderClient.getRecommendation(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(RecommendationName name) {
    GetRecommendationRequest request =
        GetRecommendationRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *           .toString();
   *   Recommendation response = recommenderClient.getRecommendation(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(String name) {
    GetRecommendationRequest request = GetRecommendationRequest.newBuilder().setName(name).build();
    return getRecommendation(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetRecommendationRequest request =
   *       GetRecommendationRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .build();
   *   Recommendation response = recommenderClient.getRecommendation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation getRecommendation(GetRecommendationRequest request) {
    return getRecommendationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested recommendation. Requires the recommender.&#42;.get IAM permission for the
   * specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetRecommendationRequest request =
   *       GetRecommendationRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Recommendation> future =
   *       recommenderClient.getRecommendationCallable().futureCall(request);
   *   // Do something.
   *   Recommendation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRecommendationRequest, Recommendation> getRecommendationCallable() {
    return stub.getRecommendationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated. Associated insights are frozen and placed in the
   * ACCEPTED state.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommendationName name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationClaimed(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationClaimed(
      RecommendationName name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationClaimedRequest request =
        MarkRecommendationClaimedRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationClaimed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated. Associated insights are frozen and placed in the
   * ACCEPTED state.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *           .toString();
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationClaimed(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationClaimed(
      String name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationClaimedRequest request =
        MarkRecommendationClaimedRequest.newBuilder()
            .setName(name)
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationClaimed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated. Associated insights are frozen and placed in the
   * ACCEPTED state.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationClaimedRequest request =
   *       MarkRecommendationClaimedRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   Recommendation response = recommenderClient.markRecommendationClaimed(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationClaimed(MarkRecommendationClaimedRequest request) {
    return markRecommendationClaimedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Claimed. Users can use this method to indicate to the
   * Recommender API that they are starting to apply the recommendation themselves. This stops the
   * recommendation content from being updated. Associated insights are frozen and placed in the
   * ACCEPTED state.
   *
   * <p>MarkRecommendationClaimed can be applied to recommendations in CLAIMED or ACTIVE state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationClaimedRequest request =
   *       MarkRecommendationClaimedRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Recommendation> future =
   *       recommenderClient.markRecommendationClaimedCallable().futureCall(request);
   *   // Do something.
   *   Recommendation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MarkRecommendationClaimedRequest, Recommendation>
      markRecommendationClaimedCallable() {
    return stub.markRecommendationClaimedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated. Associated insights are
   * frozen and placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommendationName name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationSucceeded(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationSucceeded(
      RecommendationName name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationSucceededRequest request =
        MarkRecommendationSucceededRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationSucceeded(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated. Associated insights are
   * frozen and placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *           .toString();
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationSucceeded(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationSucceeded(
      String name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationSucceededRequest request =
        MarkRecommendationSucceededRequest.newBuilder()
            .setName(name)
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationSucceeded(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated. Associated insights are
   * frozen and placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationSucceededRequest request =
   *       MarkRecommendationSucceededRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   Recommendation response = recommenderClient.markRecommendationSucceeded(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationSucceeded(
      MarkRecommendationSucceededRequest request) {
    return markRecommendationSucceededCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Succeeded. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation was
   * successful. This stops the recommendation content from being updated. Associated insights are
   * frozen and placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationSucceeded can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED,
   * or FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationSucceededRequest request =
   *       MarkRecommendationSucceededRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Recommendation> future =
   *       recommenderClient.markRecommendationSucceededCallable().futureCall(request);
   *   // Do something.
   *   Recommendation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MarkRecommendationSucceededRequest, Recommendation>
      markRecommendationSucceededCallable() {
    return stub.markRecommendationSucceededCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated. Associated insights are frozen and
   * placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommendationName name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]");
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationFailed(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationFailed(
      RecommendationName name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationFailedRequest request =
        MarkRecommendationFailedRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationFailed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated. Associated insights are frozen and
   * placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *           .toString();
   *   Map<String, String> stateMetadata = new HashMap<>();
   *   String etag = "etag3123477";
   *   Recommendation response =
   *       recommenderClient.markRecommendationFailed(name, stateMetadata, etag);
   * }
   * }</pre>
   *
   * @param name Required. Name of the recommendation.
   * @param stateMetadata State properties to include with this state. Overwrites any existing
   *     `state_metadata`. Keys must match the regex `/^[a-z0-9][a-z0-9_.-]{0,62}$/`. Values must
   *     match the regex `/^[a-zA-Z0-9_./-]{0,255}$/`.
   * @param etag Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationFailed(
      String name, Map<String, String> stateMetadata, String etag) {
    MarkRecommendationFailedRequest request =
        MarkRecommendationFailedRequest.newBuilder()
            .setName(name)
            .putAllStateMetadata(stateMetadata)
            .setEtag(etag)
            .build();
    return markRecommendationFailed(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated. Associated insights are frozen and
   * placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationFailedRequest request =
   *       MarkRecommendationFailedRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   Recommendation response = recommenderClient.markRecommendationFailed(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Recommendation markRecommendationFailed(MarkRecommendationFailedRequest request) {
    return markRecommendationFailedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Marks the Recommendation State as Failed. Users can use this method to indicate to the
   * Recommender API that they have applied the recommendation themselves, and the operation failed.
   * This stops the recommendation content from being updated. Associated insights are frozen and
   * placed in the ACCEPTED state.
   *
   * <p>MarkRecommendationFailed can be applied to recommendations in ACTIVE, CLAIMED, SUCCEEDED, or
   * FAILED state.
   *
   * <p>Requires the recommender.&#42;.update IAM permission for the specified recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   MarkRecommendationFailedRequest request =
   *       MarkRecommendationFailedRequest.newBuilder()
   *           .setName(
   *               RecommendationName.ofProjectLocationRecommenderRecommendationName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]", "[RECOMMENDATION]")
   *                   .toString())
   *           .putAllStateMetadata(new HashMap<String, String>())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Recommendation> future =
   *       recommenderClient.markRecommendationFailedCallable().futureCall(request);
   *   // Do something.
   *   Recommendation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MarkRecommendationFailedRequest, Recommendation>
      markRecommendationFailedCallable() {
    return stub.markRecommendationFailedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested Recommender Config. There is only one instance of the config for each
   * Recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommenderConfigName name =
   *       RecommenderConfigName.ofProjectLocationRecommenderName(
   *           "[PROJECT]", "[LOCATION]", "[RECOMMENDER]");
   *   RecommenderConfig response = recommenderClient.getRecommenderConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the Recommendation Config to get.
   *     <p>Acceptable formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RecommenderConfig getRecommenderConfig(RecommenderConfigName name) {
    GetRecommenderConfigRequest request =
        GetRecommenderConfigRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getRecommenderConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested Recommender Config. There is only one instance of the config for each
   * Recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       RecommenderConfigName.ofProjectLocationRecommenderName(
   *               "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *           .toString();
   *   RecommenderConfig response = recommenderClient.getRecommenderConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the Recommendation Config to get.
   *     <p>Acceptable formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/[LOCATION]/recommenders/[RECOMMENDER_ID]/config`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RecommenderConfig getRecommenderConfig(String name) {
    GetRecommenderConfigRequest request =
        GetRecommenderConfigRequest.newBuilder().setName(name).build();
    return getRecommenderConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested Recommender Config. There is only one instance of the config for each
   * Recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetRecommenderConfigRequest request =
   *       GetRecommenderConfigRequest.newBuilder()
   *           .setName(
   *               RecommenderConfigName.ofProjectLocationRecommenderName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *                   .toString())
   *           .build();
   *   RecommenderConfig response = recommenderClient.getRecommenderConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RecommenderConfig getRecommenderConfig(GetRecommenderConfigRequest request) {
    return getRecommenderConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested Recommender Config. There is only one instance of the config for each
   * Recommender.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetRecommenderConfigRequest request =
   *       GetRecommenderConfigRequest.newBuilder()
   *           .setName(
   *               RecommenderConfigName.ofProjectLocationRecommenderName(
   *                       "[PROJECT]", "[LOCATION]", "[RECOMMENDER]")
   *                   .toString())
   *           .build();
   *   ApiFuture<RecommenderConfig> future =
   *       recommenderClient.getRecommenderConfigCallable().futureCall(request);
   *   // Do something.
   *   RecommenderConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetRecommenderConfigRequest, RecommenderConfig>
      getRecommenderConfigCallable() {
    return stub.getRecommenderConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a Recommender Config. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   RecommenderConfig recommenderConfig = RecommenderConfig.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   RecommenderConfig response =
   *       recommenderClient.updateRecommenderConfig(recommenderConfig, updateMask);
   * }
   * }</pre>
   *
   * @param recommenderConfig Required. The RecommenderConfig to update.
   * @param updateMask The list of fields to be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RecommenderConfig updateRecommenderConfig(
      RecommenderConfig recommenderConfig, FieldMask updateMask) {
    UpdateRecommenderConfigRequest request =
        UpdateRecommenderConfigRequest.newBuilder()
            .setRecommenderConfig(recommenderConfig)
            .setUpdateMask(updateMask)
            .build();
    return updateRecommenderConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a Recommender Config. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   UpdateRecommenderConfigRequest request =
   *       UpdateRecommenderConfigRequest.newBuilder()
   *           .setRecommenderConfig(RecommenderConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   RecommenderConfig response = recommenderClient.updateRecommenderConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RecommenderConfig updateRecommenderConfig(UpdateRecommenderConfigRequest request) {
    return updateRecommenderConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a Recommender Config. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   UpdateRecommenderConfigRequest request =
   *       UpdateRecommenderConfigRequest.newBuilder()
   *           .setRecommenderConfig(RecommenderConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<RecommenderConfig> future =
   *       recommenderClient.updateRecommenderConfigCallable().futureCall(request);
   *   // Do something.
   *   RecommenderConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateRecommenderConfigRequest, RecommenderConfig>
      updateRecommenderConfigCallable() {
    return stub.updateRecommenderConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested InsightTypeConfig. There is only one instance of the config for each
   * InsightType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   InsightTypeConfigName name =
   *       InsightTypeConfigName.ofProjectLocationInsightTypeName(
   *           "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]");
   *   InsightTypeConfig response = recommenderClient.getInsightTypeConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the InsightTypeConfig to get.
   *     <p>Acceptable formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InsightTypeConfig getInsightTypeConfig(InsightTypeConfigName name) {
    GetInsightTypeConfigRequest request =
        GetInsightTypeConfigRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getInsightTypeConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested InsightTypeConfig. There is only one instance of the config for each
   * InsightType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   String name =
   *       InsightTypeConfigName.ofProjectLocationInsightTypeName(
   *               "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *           .toString();
   *   InsightTypeConfig response = recommenderClient.getInsightTypeConfig(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the InsightTypeConfig to get.
   *     <p>Acceptable formats:
   *     <ul>
   *       <li>`projects/[PROJECT_NUMBER]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`projects/[PROJECT_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *     <ul>
   *       <li>`organizations/[ORGANIZATION_ID]/locations/global/recommenders/[INSIGHT_TYPE_ID]/config`
   *     </ul>
   *
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InsightTypeConfig getInsightTypeConfig(String name) {
    GetInsightTypeConfigRequest request =
        GetInsightTypeConfigRequest.newBuilder().setName(name).build();
    return getInsightTypeConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested InsightTypeConfig. There is only one instance of the config for each
   * InsightType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetInsightTypeConfigRequest request =
   *       GetInsightTypeConfigRequest.newBuilder()
   *           .setName(
   *               InsightTypeConfigName.ofProjectLocationInsightTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *                   .toString())
   *           .build();
   *   InsightTypeConfig response = recommenderClient.getInsightTypeConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InsightTypeConfig getInsightTypeConfig(GetInsightTypeConfigRequest request) {
    return getInsightTypeConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the requested InsightTypeConfig. There is only one instance of the config for each
   * InsightType.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   GetInsightTypeConfigRequest request =
   *       GetInsightTypeConfigRequest.newBuilder()
   *           .setName(
   *               InsightTypeConfigName.ofProjectLocationInsightTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[INSIGHT_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<InsightTypeConfig> future =
   *       recommenderClient.getInsightTypeConfigCallable().futureCall(request);
   *   // Do something.
   *   InsightTypeConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInsightTypeConfigRequest, InsightTypeConfig>
      getInsightTypeConfigCallable() {
    return stub.getInsightTypeConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an InsightTypeConfig change. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   InsightTypeConfig insightTypeConfig = InsightTypeConfig.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   InsightTypeConfig response =
   *       recommenderClient.updateInsightTypeConfig(insightTypeConfig, updateMask);
   * }
   * }</pre>
   *
   * @param insightTypeConfig Required. The InsightTypeConfig to update.
   * @param updateMask The list of fields to be updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InsightTypeConfig updateInsightTypeConfig(
      InsightTypeConfig insightTypeConfig, FieldMask updateMask) {
    UpdateInsightTypeConfigRequest request =
        UpdateInsightTypeConfigRequest.newBuilder()
            .setInsightTypeConfig(insightTypeConfig)
            .setUpdateMask(updateMask)
            .build();
    return updateInsightTypeConfig(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an InsightTypeConfig change. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   UpdateInsightTypeConfigRequest request =
   *       UpdateInsightTypeConfigRequest.newBuilder()
   *           .setInsightTypeConfig(InsightTypeConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   InsightTypeConfig response = recommenderClient.updateInsightTypeConfig(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final InsightTypeConfig updateInsightTypeConfig(UpdateInsightTypeConfigRequest request) {
    return updateInsightTypeConfigCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an InsightTypeConfig change. This will create a new revision of the config.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   UpdateInsightTypeConfigRequest request =
   *       UpdateInsightTypeConfigRequest.newBuilder()
   *           .setInsightTypeConfig(InsightTypeConfig.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setValidateOnly(true)
   *           .build();
   *   ApiFuture<InsightTypeConfig> future =
   *       recommenderClient.updateInsightTypeConfigCallable().futureCall(request);
   *   // Do something.
   *   InsightTypeConfig response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateInsightTypeConfigRequest, InsightTypeConfig>
      updateInsightTypeConfigCallable() {
    return stub.updateInsightTypeConfigCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all available Recommenders. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendersRequest request =
   *       ListRecommendersRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (RecommenderType element : recommenderClient.listRecommenders(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRecommendersPagedResponse listRecommenders(ListRecommendersRequest request) {
    return listRecommendersPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all available Recommenders. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendersRequest request =
   *       ListRecommendersRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<RecommenderType> future =
   *       recommenderClient.listRecommendersPagedCallable().futureCall(request);
   *   // Do something.
   *   for (RecommenderType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRecommendersRequest, ListRecommendersPagedResponse>
      listRecommendersPagedCallable() {
    return stub.listRecommendersPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all available Recommenders. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListRecommendersRequest request =
   *       ListRecommendersRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListRecommendersResponse response =
   *         recommenderClient.listRecommendersCallable().call(request);
   *     for (RecommenderType element : response.getRecommendersList()) {
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
  public final UnaryCallable<ListRecommendersRequest, ListRecommendersResponse>
      listRecommendersCallable() {
    return stub.listRecommendersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists available InsightTypes. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightTypesRequest request =
   *       ListInsightTypesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (InsightType element : recommenderClient.listInsightTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInsightTypesPagedResponse listInsightTypes(ListInsightTypesRequest request) {
    return listInsightTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists available InsightTypes. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightTypesRequest request =
   *       ListInsightTypesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<InsightType> future =
   *       recommenderClient.listInsightTypesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (InsightType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInsightTypesRequest, ListInsightTypesPagedResponse>
      listInsightTypesPagedCallable() {
    return stub.listInsightTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists available InsightTypes. No IAM permissions are required.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecommenderClient recommenderClient = RecommenderClient.create()) {
   *   ListInsightTypesRequest request =
   *       ListInsightTypesRequest.newBuilder()
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListInsightTypesResponse response =
   *         recommenderClient.listInsightTypesCallable().call(request);
   *     for (InsightType element : response.getInsightTypesList()) {
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
  public final UnaryCallable<ListInsightTypesRequest, ListInsightTypesResponse>
      listInsightTypesCallable() {
    return stub.listInsightTypesCallable();
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

  public static class ListInsightsPagedResponse
      extends AbstractPagedListResponse<
          ListInsightsRequest,
          ListInsightsResponse,
          Insight,
          ListInsightsPage,
          ListInsightsFixedSizeCollection> {

    public static ApiFuture<ListInsightsPagedResponse> createAsync(
        PageContext<ListInsightsRequest, ListInsightsResponse, Insight> context,
        ApiFuture<ListInsightsResponse> futureResponse) {
      ApiFuture<ListInsightsPage> futurePage =
          ListInsightsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListInsightsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListInsightsPagedResponse(ListInsightsPage page) {
      super(page, ListInsightsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInsightsPage
      extends AbstractPage<ListInsightsRequest, ListInsightsResponse, Insight, ListInsightsPage> {

    private ListInsightsPage(
        PageContext<ListInsightsRequest, ListInsightsResponse, Insight> context,
        ListInsightsResponse response) {
      super(context, response);
    }

    private static ListInsightsPage createEmptyPage() {
      return new ListInsightsPage(null, null);
    }

    @Override
    protected ListInsightsPage createPage(
        PageContext<ListInsightsRequest, ListInsightsResponse, Insight> context,
        ListInsightsResponse response) {
      return new ListInsightsPage(context, response);
    }

    @Override
    public ApiFuture<ListInsightsPage> createPageAsync(
        PageContext<ListInsightsRequest, ListInsightsResponse, Insight> context,
        ApiFuture<ListInsightsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInsightsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInsightsRequest,
          ListInsightsResponse,
          Insight,
          ListInsightsPage,
          ListInsightsFixedSizeCollection> {

    private ListInsightsFixedSizeCollection(List<ListInsightsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInsightsFixedSizeCollection createEmptyCollection() {
      return new ListInsightsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInsightsFixedSizeCollection createCollection(
        List<ListInsightsPage> pages, int collectionSize) {
      return new ListInsightsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRecommendationsPagedResponse
      extends AbstractPagedListResponse<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage,
          ListRecommendationsFixedSizeCollection> {

    public static ApiFuture<ListRecommendationsPagedResponse> createAsync(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ApiFuture<ListRecommendationsResponse> futureResponse) {
      ApiFuture<ListRecommendationsPage> futurePage =
          ListRecommendationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRecommendationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRecommendationsPagedResponse(ListRecommendationsPage page) {
      super(page, ListRecommendationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRecommendationsPage
      extends AbstractPage<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage> {

    private ListRecommendationsPage(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ListRecommendationsResponse response) {
      super(context, response);
    }

    private static ListRecommendationsPage createEmptyPage() {
      return new ListRecommendationsPage(null, null);
    }

    @Override
    protected ListRecommendationsPage createPage(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ListRecommendationsResponse response) {
      return new ListRecommendationsPage(context, response);
    }

    @Override
    public ApiFuture<ListRecommendationsPage> createPageAsync(
        PageContext<ListRecommendationsRequest, ListRecommendationsResponse, Recommendation>
            context,
        ApiFuture<ListRecommendationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRecommendationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRecommendationsRequest,
          ListRecommendationsResponse,
          Recommendation,
          ListRecommendationsPage,
          ListRecommendationsFixedSizeCollection> {

    private ListRecommendationsFixedSizeCollection(
        List<ListRecommendationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRecommendationsFixedSizeCollection createEmptyCollection() {
      return new ListRecommendationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRecommendationsFixedSizeCollection createCollection(
        List<ListRecommendationsPage> pages, int collectionSize) {
      return new ListRecommendationsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRecommendersPagedResponse
      extends AbstractPagedListResponse<
          ListRecommendersRequest,
          ListRecommendersResponse,
          RecommenderType,
          ListRecommendersPage,
          ListRecommendersFixedSizeCollection> {

    public static ApiFuture<ListRecommendersPagedResponse> createAsync(
        PageContext<ListRecommendersRequest, ListRecommendersResponse, RecommenderType> context,
        ApiFuture<ListRecommendersResponse> futureResponse) {
      ApiFuture<ListRecommendersPage> futurePage =
          ListRecommendersPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRecommendersPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRecommendersPagedResponse(ListRecommendersPage page) {
      super(page, ListRecommendersFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRecommendersPage
      extends AbstractPage<
          ListRecommendersRequest,
          ListRecommendersResponse,
          RecommenderType,
          ListRecommendersPage> {

    private ListRecommendersPage(
        PageContext<ListRecommendersRequest, ListRecommendersResponse, RecommenderType> context,
        ListRecommendersResponse response) {
      super(context, response);
    }

    private static ListRecommendersPage createEmptyPage() {
      return new ListRecommendersPage(null, null);
    }

    @Override
    protected ListRecommendersPage createPage(
        PageContext<ListRecommendersRequest, ListRecommendersResponse, RecommenderType> context,
        ListRecommendersResponse response) {
      return new ListRecommendersPage(context, response);
    }

    @Override
    public ApiFuture<ListRecommendersPage> createPageAsync(
        PageContext<ListRecommendersRequest, ListRecommendersResponse, RecommenderType> context,
        ApiFuture<ListRecommendersResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRecommendersFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRecommendersRequest,
          ListRecommendersResponse,
          RecommenderType,
          ListRecommendersPage,
          ListRecommendersFixedSizeCollection> {

    private ListRecommendersFixedSizeCollection(
        List<ListRecommendersPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRecommendersFixedSizeCollection createEmptyCollection() {
      return new ListRecommendersFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRecommendersFixedSizeCollection createCollection(
        List<ListRecommendersPage> pages, int collectionSize) {
      return new ListRecommendersFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListInsightTypesPagedResponse
      extends AbstractPagedListResponse<
          ListInsightTypesRequest,
          ListInsightTypesResponse,
          InsightType,
          ListInsightTypesPage,
          ListInsightTypesFixedSizeCollection> {

    public static ApiFuture<ListInsightTypesPagedResponse> createAsync(
        PageContext<ListInsightTypesRequest, ListInsightTypesResponse, InsightType> context,
        ApiFuture<ListInsightTypesResponse> futureResponse) {
      ApiFuture<ListInsightTypesPage> futurePage =
          ListInsightTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListInsightTypesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListInsightTypesPagedResponse(ListInsightTypesPage page) {
      super(page, ListInsightTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInsightTypesPage
      extends AbstractPage<
          ListInsightTypesRequest, ListInsightTypesResponse, InsightType, ListInsightTypesPage> {

    private ListInsightTypesPage(
        PageContext<ListInsightTypesRequest, ListInsightTypesResponse, InsightType> context,
        ListInsightTypesResponse response) {
      super(context, response);
    }

    private static ListInsightTypesPage createEmptyPage() {
      return new ListInsightTypesPage(null, null);
    }

    @Override
    protected ListInsightTypesPage createPage(
        PageContext<ListInsightTypesRequest, ListInsightTypesResponse, InsightType> context,
        ListInsightTypesResponse response) {
      return new ListInsightTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListInsightTypesPage> createPageAsync(
        PageContext<ListInsightTypesRequest, ListInsightTypesResponse, InsightType> context,
        ApiFuture<ListInsightTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInsightTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInsightTypesRequest,
          ListInsightTypesResponse,
          InsightType,
          ListInsightTypesPage,
          ListInsightTypesFixedSizeCollection> {

    private ListInsightTypesFixedSizeCollection(
        List<ListInsightTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInsightTypesFixedSizeCollection createEmptyCollection() {
      return new ListInsightTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInsightTypesFixedSizeCollection createCollection(
        List<ListInsightTypesPage> pages, int collectionSize) {
      return new ListInsightTypesFixedSizeCollection(pages, collectionSize);
    }
  }
}
