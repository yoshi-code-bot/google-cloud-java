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

package com.google.cloud.networkmanagement.v1beta1;

import static com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceClient.ListConnectivityTestsPagedResponse;
import static com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.networkmanagement.v1beta1.stub.HttpJsonReachabilityServiceStub;
import com.google.common.collect.Lists;
import com.google.iam.v1.AuditConfig;
import com.google.iam.v1.Binding;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.GetPolicyOptions;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ReachabilityServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static ReachabilityServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonReachabilityServiceStub.getMethodDescriptors(),
            ReachabilityServiceSettings.getDefaultEndpoint());
    ReachabilityServiceSettings settings =
        ReachabilityServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                ReachabilityServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ReachabilityServiceClient.create(settings);
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

  @Ignore("See: https://github.com/googleapis/sdk-platform-java/issues/1839")
  @Test
  public void listConnectivityTestsTest() throws Exception {
    ConnectivityTest responsesElement = ConnectivityTest.newBuilder().build();
    ListConnectivityTestsResponse expectedResponse =
        ListConnectivityTestsResponse.newBuilder()
            .setNextPageToken("")
            .addAllResources(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListConnectivityTestsRequest request =
        ListConnectivityTestsRequest.newBuilder()
            .setParent(ProjectName.of("[PROJECT]").toString())
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .setFilter("filter-1274492040")
            .setOrderBy("orderBy-1207110587")
            .build();

    ListConnectivityTestsPagedResponse pagedListResponse = client.listConnectivityTests(request);

    List<ConnectivityTest> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getResourcesList().get(0), resources.get(0));

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
  public void listConnectivityTestsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListConnectivityTestsRequest request =
          ListConnectivityTestsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      client.listConnectivityTests(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getConnectivityTestTest() throws Exception {
    ConnectivityTest expectedResponse =
        ConnectivityTest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setDescription("description-1724546052")
            .setSource(Endpoint.newBuilder().build())
            .setDestination(Endpoint.newBuilder().build())
            .setProtocol("protocol-989163880")
            .addAllRelatedProjects(new ArrayList<String>())
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setProbingDetails(ProbingDetails.newBuilder().build())
            .setRoundTrip(true)
            .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setBypassFirewallChecks(true)
            .build();
    mockService.addResponse(expectedResponse);

    GetConnectivityTestRequest request =
        GetConnectivityTestRequest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .build();

    ConnectivityTest actualResponse = client.getConnectivityTest(request);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void getConnectivityTestExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetConnectivityTestRequest request =
          GetConnectivityTestRequest.newBuilder()
              .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .build();
      client.getConnectivityTest(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Ignore("See: https://github.com/googleapis/sdk-platform-java/issues/1839")
  @Test
  public void createConnectivityTestTest() throws Exception {
    ConnectivityTest expectedResponse =
        ConnectivityTest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setDescription("description-1724546052")
            .setSource(Endpoint.newBuilder().build())
            .setDestination(Endpoint.newBuilder().build())
            .setProtocol("protocol-989163880")
            .addAllRelatedProjects(new ArrayList<String>())
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setProbingDetails(ProbingDetails.newBuilder().build())
            .setRoundTrip(true)
            .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setBypassFirewallChecks(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createConnectivityTestTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    CreateConnectivityTestRequest request =
        CreateConnectivityTestRequest.newBuilder()
            .setParent(ProjectName.of("[PROJECT]").toString())
            .setTestId("testId-877170355")
            .setResource(ConnectivityTest.newBuilder().build())
            .build();

    ConnectivityTest actualResponse = client.createConnectivityTestAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void createConnectivityTestExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      CreateConnectivityTestRequest request =
          CreateConnectivityTestRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setTestId("testId-877170355")
              .setResource(ConnectivityTest.newBuilder().build())
              .build();
      client.createConnectivityTestAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateConnectivityTestTest() throws Exception {
    ConnectivityTest expectedResponse =
        ConnectivityTest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setDescription("description-1724546052")
            .setSource(Endpoint.newBuilder().build())
            .setDestination(Endpoint.newBuilder().build())
            .setProtocol("protocol-989163880")
            .addAllRelatedProjects(new ArrayList<String>())
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setProbingDetails(ProbingDetails.newBuilder().build())
            .setRoundTrip(true)
            .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setBypassFirewallChecks(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateConnectivityTestTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    UpdateConnectivityTestRequest request =
        UpdateConnectivityTestRequest.newBuilder()
            .setUpdateMask(FieldMask.newBuilder().build())
            .setResource(
                ConnectivityTest.newBuilder()
                    .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
                    .setDescription("description-1724546052")
                    .setSource(Endpoint.newBuilder().build())
                    .setDestination(Endpoint.newBuilder().build())
                    .setProtocol("protocol-989163880")
                    .addAllRelatedProjects(new ArrayList<String>())
                    .setDisplayName("displayName1714148973")
                    .putAllLabels(new HashMap<String, String>())
                    .setCreateTime(Timestamp.newBuilder().build())
                    .setUpdateTime(Timestamp.newBuilder().build())
                    .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
                    .setProbingDetails(ProbingDetails.newBuilder().build())
                    .setRoundTrip(true)
                    .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
                    .setBypassFirewallChecks(true)
                    .build())
            .build();

    ConnectivityTest actualResponse = client.updateConnectivityTestAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void updateConnectivityTestExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      UpdateConnectivityTestRequest request =
          UpdateConnectivityTestRequest.newBuilder()
              .setUpdateMask(FieldMask.newBuilder().build())
              .setResource(
                  ConnectivityTest.newBuilder()
                      .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
                      .setDescription("description-1724546052")
                      .setSource(Endpoint.newBuilder().build())
                      .setDestination(Endpoint.newBuilder().build())
                      .setProtocol("protocol-989163880")
                      .addAllRelatedProjects(new ArrayList<String>())
                      .setDisplayName("displayName1714148973")
                      .putAllLabels(new HashMap<String, String>())
                      .setCreateTime(Timestamp.newBuilder().build())
                      .setUpdateTime(Timestamp.newBuilder().build())
                      .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
                      .setProbingDetails(ProbingDetails.newBuilder().build())
                      .setRoundTrip(true)
                      .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
                      .setBypassFirewallChecks(true)
                      .build())
              .build();
      client.updateConnectivityTestAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void rerunConnectivityTestTest() throws Exception {
    ConnectivityTest expectedResponse =
        ConnectivityTest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setDescription("description-1724546052")
            .setSource(Endpoint.newBuilder().build())
            .setDestination(Endpoint.newBuilder().build())
            .setProtocol("protocol-989163880")
            .addAllRelatedProjects(new ArrayList<String>())
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setProbingDetails(ProbingDetails.newBuilder().build())
            .setRoundTrip(true)
            .setReturnReachabilityDetails(ReachabilityDetails.newBuilder().build())
            .setBypassFirewallChecks(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("rerunConnectivityTestTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    RerunConnectivityTestRequest request =
        RerunConnectivityTestRequest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .build();

    ConnectivityTest actualResponse = client.rerunConnectivityTestAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void rerunConnectivityTestExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RerunConnectivityTestRequest request =
          RerunConnectivityTestRequest.newBuilder()
              .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .build();
      client.rerunConnectivityTestAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteConnectivityTestTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteConnectivityTestTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    DeleteConnectivityTestRequest request =
        DeleteConnectivityTestRequest.newBuilder()
            .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .build();

    client.deleteConnectivityTestAsync(request).get();

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
  public void deleteConnectivityTestExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DeleteConnectivityTestRequest request =
          DeleteConnectivityTestRequest.newBuilder()
              .setName(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .build();
      client.deleteConnectivityTestAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

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
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Ignore("See: https://github.com/googleapis/sdk-platform-java/issues/1839")
  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockService.addResponse(expectedResponse);

    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setPolicy(Policy.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    Policy actualResponse = client.setIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void setIamPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SetIamPolicyRequest request =
          SetIamPolicyRequest.newBuilder()
              .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .setPolicy(Policy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.setIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Ignore("See: https://github.com/googleapis/sdk-platform-java/issues/1839")
  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockService.addResponse(expectedResponse);

    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .setOptions(GetPolicyOptions.newBuilder().build())
            .build();

    Policy actualResponse = client.getIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void getIamPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      client.getIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Ignore("See: https://github.com/googleapis/sdk-platform-java/issues/1839")
  @Test
  public void testIamPermissionsTest() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockService.addResponse(expectedResponse);

    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
            .addAllPermissions(new ArrayList<String>())
            .build();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(request);
    Assert.assertEquals(expectedResponse, actualResponse);

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
  public void testIamPermissionsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(ConnectivityTestName.of("[PROJECT]", "[TEST]").toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      client.testIamPermissions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
