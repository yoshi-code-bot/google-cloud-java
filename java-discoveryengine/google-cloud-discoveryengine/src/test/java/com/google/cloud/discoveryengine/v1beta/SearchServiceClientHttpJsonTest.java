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

package com.google.cloud.discoveryengine.v1beta;

import static com.google.cloud.discoveryengine.v1beta.SearchServiceClient.SearchLitePagedResponse;
import static com.google.cloud.discoveryengine.v1beta.SearchServiceClient.SearchPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.discoveryengine.v1beta.stub.HttpJsonSearchServiceStub;
import com.google.common.collect.Lists;
import com.google.protobuf.Value;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class SearchServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static SearchServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonSearchServiceStub.getMethodDescriptors(),
            SearchServiceSettings.getDefaultEndpoint());
    SearchServiceSettings settings =
        SearchServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                SearchServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SearchServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void searchTest() throws Exception {
    SearchResponse.SearchResult responsesElement = SearchResponse.SearchResult.newBuilder().build();
    SearchResponse expectedResponse =
        SearchResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    SearchRequest request =
        SearchRequest.newBuilder()
            .setServingConfig(
                ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                    .toString())
            .setBranch(
                BranchName.ofProjectLocationDataStoreBranchName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                    .toString())
            .setQuery("query107944136")
            .setImageQuery(SearchRequest.ImageQuery.newBuilder().build())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .setOffset(-1019779949)
            .setOneBoxPageSize(1988477988)
            .addAllDataStoreSpecs(new ArrayList<SearchRequest.DataStoreSpec>())
            .setFilter("filter-1274492040")
            .setCanonicalFilter("canonicalFilter-722283124")
            .setOrderBy("orderBy-1207110587")
            .setUserInfo(UserInfo.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setRegionCode("regionCode-1991004415")
            .addAllFacetSpecs(new ArrayList<SearchRequest.FacetSpec>())
            .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
            .putAllParams(new HashMap<String, Value>())
            .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
            .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
            .setUserPseudoId("userPseudoId-1155274652")
            .setContentSearchSpec(SearchRequest.ContentSearchSpec.newBuilder().build())
            .setEmbeddingSpec(SearchRequest.EmbeddingSpec.newBuilder().build())
            .setRankingExpression("rankingExpression2110320494")
            .setSafeSearch(true)
            .putAllUserLabels(new HashMap<String, String>())
            .setNaturalLanguageQueryUnderstandingSpec(
                SearchRequest.NaturalLanguageQueryUnderstandingSpec.newBuilder().build())
            .setSearchAsYouTypeSpec(SearchRequest.SearchAsYouTypeSpec.newBuilder().build())
            .setSession(
                SessionName.ofProjectLocationDataStoreSessionName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SESSION]")
                    .toString())
            .setSessionSpec(SearchRequest.SessionSpec.newBuilder().build())
            .setPersonalizationSpec(SearchRequest.PersonalizationSpec.newBuilder().build())
            .build();

    SearchPagedResponse pagedListResponse = client.search(request);

    List<SearchResponse.SearchResult> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void searchExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SearchRequest request =
          SearchRequest.newBuilder()
              .setServingConfig(
                  ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                      .toString())
              .setBranch(
                  BranchName.ofProjectLocationDataStoreBranchName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                      .toString())
              .setQuery("query107944136")
              .setImageQuery(SearchRequest.ImageQuery.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOffset(-1019779949)
              .setOneBoxPageSize(1988477988)
              .addAllDataStoreSpecs(new ArrayList<SearchRequest.DataStoreSpec>())
              .setFilter("filter-1274492040")
              .setCanonicalFilter("canonicalFilter-722283124")
              .setOrderBy("orderBy-1207110587")
              .setUserInfo(UserInfo.newBuilder().build())
              .setLanguageCode("languageCode-2092349083")
              .setRegionCode("regionCode-1991004415")
              .addAllFacetSpecs(new ArrayList<SearchRequest.FacetSpec>())
              .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
              .putAllParams(new HashMap<String, Value>())
              .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
              .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
              .setUserPseudoId("userPseudoId-1155274652")
              .setContentSearchSpec(SearchRequest.ContentSearchSpec.newBuilder().build())
              .setEmbeddingSpec(SearchRequest.EmbeddingSpec.newBuilder().build())
              .setRankingExpression("rankingExpression2110320494")
              .setSafeSearch(true)
              .putAllUserLabels(new HashMap<String, String>())
              .setNaturalLanguageQueryUnderstandingSpec(
                  SearchRequest.NaturalLanguageQueryUnderstandingSpec.newBuilder().build())
              .setSearchAsYouTypeSpec(SearchRequest.SearchAsYouTypeSpec.newBuilder().build())
              .setSession(
                  SessionName.ofProjectLocationDataStoreSessionName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SESSION]")
                      .toString())
              .setSessionSpec(SearchRequest.SessionSpec.newBuilder().build())
              .setPersonalizationSpec(SearchRequest.PersonalizationSpec.newBuilder().build())
              .build();
      client.search(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void searchLiteTest() throws Exception {
    SearchResponse.SearchResult responsesElement = SearchResponse.SearchResult.newBuilder().build();
    SearchResponse expectedResponse =
        SearchResponse.newBuilder()
            .setNextPageToken("")
            .addAllResults(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    SearchRequest request =
        SearchRequest.newBuilder()
            .setServingConfig(
                ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                    .toString())
            .setBranch(
                BranchName.ofProjectLocationDataStoreBranchName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                    .toString())
            .setQuery("query107944136")
            .setImageQuery(SearchRequest.ImageQuery.newBuilder().build())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .setOffset(-1019779949)
            .setOneBoxPageSize(1988477988)
            .addAllDataStoreSpecs(new ArrayList<SearchRequest.DataStoreSpec>())
            .setFilter("filter-1274492040")
            .setCanonicalFilter("canonicalFilter-722283124")
            .setOrderBy("orderBy-1207110587")
            .setUserInfo(UserInfo.newBuilder().build())
            .setLanguageCode("languageCode-2092349083")
            .setRegionCode("regionCode-1991004415")
            .addAllFacetSpecs(new ArrayList<SearchRequest.FacetSpec>())
            .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
            .putAllParams(new HashMap<String, Value>())
            .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
            .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
            .setUserPseudoId("userPseudoId-1155274652")
            .setContentSearchSpec(SearchRequest.ContentSearchSpec.newBuilder().build())
            .setEmbeddingSpec(SearchRequest.EmbeddingSpec.newBuilder().build())
            .setRankingExpression("rankingExpression2110320494")
            .setSafeSearch(true)
            .putAllUserLabels(new HashMap<String, String>())
            .setNaturalLanguageQueryUnderstandingSpec(
                SearchRequest.NaturalLanguageQueryUnderstandingSpec.newBuilder().build())
            .setSearchAsYouTypeSpec(SearchRequest.SearchAsYouTypeSpec.newBuilder().build())
            .setSession(
                SessionName.ofProjectLocationDataStoreSessionName(
                        "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SESSION]")
                    .toString())
            .setSessionSpec(SearchRequest.SessionSpec.newBuilder().build())
            .setPersonalizationSpec(SearchRequest.PersonalizationSpec.newBuilder().build())
            .build();

    SearchLitePagedResponse pagedListResponse = client.searchLite(request);

    List<SearchResponse.SearchResult> resources =
        Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResultsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void searchLiteExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SearchRequest request =
          SearchRequest.newBuilder()
              .setServingConfig(
                  ServingConfigName.ofProjectLocationDataStoreServingConfigName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SERVING_CONFIG]")
                      .toString())
              .setBranch(
                  BranchName.ofProjectLocationDataStoreBranchName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[BRANCH]")
                      .toString())
              .setQuery("query107944136")
              .setImageQuery(SearchRequest.ImageQuery.newBuilder().build())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setOffset(-1019779949)
              .setOneBoxPageSize(1988477988)
              .addAllDataStoreSpecs(new ArrayList<SearchRequest.DataStoreSpec>())
              .setFilter("filter-1274492040")
              .setCanonicalFilter("canonicalFilter-722283124")
              .setOrderBy("orderBy-1207110587")
              .setUserInfo(UserInfo.newBuilder().build())
              .setLanguageCode("languageCode-2092349083")
              .setRegionCode("regionCode-1991004415")
              .addAllFacetSpecs(new ArrayList<SearchRequest.FacetSpec>())
              .setBoostSpec(SearchRequest.BoostSpec.newBuilder().build())
              .putAllParams(new HashMap<String, Value>())
              .setQueryExpansionSpec(SearchRequest.QueryExpansionSpec.newBuilder().build())
              .setSpellCorrectionSpec(SearchRequest.SpellCorrectionSpec.newBuilder().build())
              .setUserPseudoId("userPseudoId-1155274652")
              .setContentSearchSpec(SearchRequest.ContentSearchSpec.newBuilder().build())
              .setEmbeddingSpec(SearchRequest.EmbeddingSpec.newBuilder().build())
              .setRankingExpression("rankingExpression2110320494")
              .setSafeSearch(true)
              .putAllUserLabels(new HashMap<String, String>())
              .setNaturalLanguageQueryUnderstandingSpec(
                  SearchRequest.NaturalLanguageQueryUnderstandingSpec.newBuilder().build())
              .setSearchAsYouTypeSpec(SearchRequest.SearchAsYouTypeSpec.newBuilder().build())
              .setSession(
                  SessionName.ofProjectLocationDataStoreSessionName(
                          "[PROJECT]", "[LOCATION]", "[DATA_STORE]", "[SESSION]")
                      .toString())
              .setSessionSpec(SearchRequest.SessionSpec.newBuilder().build())
              .setPersonalizationSpec(SearchRequest.PersonalizationSpec.newBuilder().build())
              .build();
      client.searchLite(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
