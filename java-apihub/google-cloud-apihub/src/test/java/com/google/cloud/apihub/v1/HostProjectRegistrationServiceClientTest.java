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

package com.google.cloud.apihub.v1;

import static com.google.cloud.apihub.v1.HostProjectRegistrationServiceClient.ListHostProjectRegistrationsPagedResponse;
import static com.google.cloud.apihub.v1.HostProjectRegistrationServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.apihub.v1.stub.HttpJsonHostProjectRegistrationServiceStub;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import com.google.protobuf.Timestamp;
import java.io.IOException;
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
public class HostProjectRegistrationServiceClientTest {
  private static MockHttpService mockService;
  private static HostProjectRegistrationServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonHostProjectRegistrationServiceStub.getMethodDescriptors(),
            HostProjectRegistrationServiceSettings.getDefaultEndpoint());
    HostProjectRegistrationServiceSettings settings =
        HostProjectRegistrationServiceSettings.newBuilder()
            .setTransportChannelProvider(
                HostProjectRegistrationServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = HostProjectRegistrationServiceClient.create(settings);
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
  public void createHostProjectRegistrationTest() throws Exception {
    HostProjectRegistration expectedResponse =
        HostProjectRegistration.newBuilder()
            .setName(
                HostProjectRegistrationName.of(
                        "[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]")
                    .toString())
            .setGcpProject("gcpProject1666184549")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    HostProjectRegistration hostProjectRegistration = HostProjectRegistration.newBuilder().build();
    String hostProjectRegistrationId = "hostProjectRegistrationId1352651365";

    HostProjectRegistration actualResponse =
        client.createHostProjectRegistration(
            parent, hostProjectRegistration, hostProjectRegistrationId);
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
  public void createHostProjectRegistrationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      HostProjectRegistration hostProjectRegistration =
          HostProjectRegistration.newBuilder().build();
      String hostProjectRegistrationId = "hostProjectRegistrationId1352651365";
      client.createHostProjectRegistration(
          parent, hostProjectRegistration, hostProjectRegistrationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createHostProjectRegistrationTest2() throws Exception {
    HostProjectRegistration expectedResponse =
        HostProjectRegistration.newBuilder()
            .setName(
                HostProjectRegistrationName.of(
                        "[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]")
                    .toString())
            .setGcpProject("gcpProject1666184549")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";
    HostProjectRegistration hostProjectRegistration = HostProjectRegistration.newBuilder().build();
    String hostProjectRegistrationId = "hostProjectRegistrationId1352651365";

    HostProjectRegistration actualResponse =
        client.createHostProjectRegistration(
            parent, hostProjectRegistration, hostProjectRegistrationId);
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
  public void createHostProjectRegistrationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      HostProjectRegistration hostProjectRegistration =
          HostProjectRegistration.newBuilder().build();
      String hostProjectRegistrationId = "hostProjectRegistrationId1352651365";
      client.createHostProjectRegistration(
          parent, hostProjectRegistration, hostProjectRegistrationId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getHostProjectRegistrationTest() throws Exception {
    HostProjectRegistration expectedResponse =
        HostProjectRegistration.newBuilder()
            .setName(
                HostProjectRegistrationName.of(
                        "[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]")
                    .toString())
            .setGcpProject("gcpProject1666184549")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    HostProjectRegistrationName name =
        HostProjectRegistrationName.of("[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]");

    HostProjectRegistration actualResponse = client.getHostProjectRegistration(name);
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
  public void getHostProjectRegistrationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      HostProjectRegistrationName name =
          HostProjectRegistrationName.of("[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]");
      client.getHostProjectRegistration(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getHostProjectRegistrationTest2() throws Exception {
    HostProjectRegistration expectedResponse =
        HostProjectRegistration.newBuilder()
            .setName(
                HostProjectRegistrationName.of(
                        "[PROJECT]", "[LOCATION]", "[HOST_PROJECT_REGISTRATION]")
                    .toString())
            .setGcpProject("gcpProject1666184549")
            .setCreateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-9303/locations/location-9303/hostProjectRegistrations/hostProjectRegistration-9303";

    HostProjectRegistration actualResponse = client.getHostProjectRegistration(name);
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
  public void getHostProjectRegistrationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-9303/locations/location-9303/hostProjectRegistrations/hostProjectRegistration-9303";
      client.getHostProjectRegistration(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listHostProjectRegistrationsTest() throws Exception {
    HostProjectRegistration responsesElement = HostProjectRegistration.newBuilder().build();
    ListHostProjectRegistrationsResponse expectedResponse =
        ListHostProjectRegistrationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllHostProjectRegistrations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListHostProjectRegistrationsPagedResponse pagedListResponse =
        client.listHostProjectRegistrations(parent);

    List<HostProjectRegistration> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getHostProjectRegistrationsList().get(0), resources.get(0));

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
  public void listHostProjectRegistrationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listHostProjectRegistrations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listHostProjectRegistrationsTest2() throws Exception {
    HostProjectRegistration responsesElement = HostProjectRegistration.newBuilder().build();
    ListHostProjectRegistrationsResponse expectedResponse =
        ListHostProjectRegistrationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllHostProjectRegistrations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListHostProjectRegistrationsPagedResponse pagedListResponse =
        client.listHostProjectRegistrations(parent);

    List<HostProjectRegistration> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(
        expectedResponse.getHostProjectRegistrationsList().get(0), resources.get(0));

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
  public void listHostProjectRegistrationsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listHostProjectRegistrations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
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
}
