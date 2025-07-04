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

package com.google.cloud.developerconnect.v1;

import static com.google.cloud.developerconnect.v1.InsightsConfigServiceClient.ListInsightsConfigsPagedResponse;
import static com.google.cloud.developerconnect.v1.InsightsConfigServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class InsightsConfigServiceClientTest {
  private static MockInsightsConfigService mockInsightsConfigService;
  private static MockLocations mockLocations;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private InsightsConfigServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockInsightsConfigService = new MockInsightsConfigService();
    mockLocations = new MockLocations();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockInsightsConfigService, mockLocations));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    InsightsConfigServiceSettings settings =
        InsightsConfigServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = InsightsConfigServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void listInsightsConfigsTest() throws Exception {
    InsightsConfig responsesElement = InsightsConfig.newBuilder().build();
    ListInsightsConfigsResponse expectedResponse =
        ListInsightsConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllInsightsConfigs(Arrays.asList(responsesElement))
            .build();
    mockInsightsConfigService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListInsightsConfigsPagedResponse pagedListResponse = client.listInsightsConfigs(parent);

    List<InsightsConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInsightsConfigsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInsightsConfigsRequest actualRequest = ((ListInsightsConfigsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listInsightsConfigsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listInsightsConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listInsightsConfigsTest2() throws Exception {
    InsightsConfig responsesElement = InsightsConfig.newBuilder().build();
    ListInsightsConfigsResponse expectedResponse =
        ListInsightsConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllInsightsConfigs(Arrays.asList(responsesElement))
            .build();
    mockInsightsConfigService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListInsightsConfigsPagedResponse pagedListResponse = client.listInsightsConfigs(parent);

    List<InsightsConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getInsightsConfigsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListInsightsConfigsRequest actualRequest = ((ListInsightsConfigsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listInsightsConfigsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listInsightsConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createInsightsConfigTest() throws Exception {
    InsightsConfig expectedResponse =
        InsightsConfig.newBuilder()
            .setName(
                InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .addAllRuntimeConfigs(new ArrayList<RuntimeConfig>())
            .addAllArtifactConfigs(new ArrayList<ArtifactConfig>())
            .putAllAnnotations(new HashMap<String, String>())
            .putAllLabels(new HashMap<String, String>())
            .setReconciling(true)
            .addAllErrors(new ArrayList<Status>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInsightsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInsightsConfigService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    InsightsConfig insightsConfig = InsightsConfig.newBuilder().build();
    String insightsConfigId = "insightsConfigId774395128";

    InsightsConfig actualResponse =
        client.createInsightsConfigAsync(parent, insightsConfig, insightsConfigId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateInsightsConfigRequest actualRequest =
        ((CreateInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(insightsConfig, actualRequest.getInsightsConfig());
    Assert.assertEquals(insightsConfigId, actualRequest.getInsightsConfigId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createInsightsConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      InsightsConfig insightsConfig = InsightsConfig.newBuilder().build();
      String insightsConfigId = "insightsConfigId774395128";
      client.createInsightsConfigAsync(parent, insightsConfig, insightsConfigId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createInsightsConfigTest2() throws Exception {
    InsightsConfig expectedResponse =
        InsightsConfig.newBuilder()
            .setName(
                InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .addAllRuntimeConfigs(new ArrayList<RuntimeConfig>())
            .addAllArtifactConfigs(new ArrayList<ArtifactConfig>())
            .putAllAnnotations(new HashMap<String, String>())
            .putAllLabels(new HashMap<String, String>())
            .setReconciling(true)
            .addAllErrors(new ArrayList<Status>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createInsightsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInsightsConfigService.addResponse(resultOperation);

    String parent = "parent-995424086";
    InsightsConfig insightsConfig = InsightsConfig.newBuilder().build();
    String insightsConfigId = "insightsConfigId774395128";

    InsightsConfig actualResponse =
        client.createInsightsConfigAsync(parent, insightsConfig, insightsConfigId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateInsightsConfigRequest actualRequest =
        ((CreateInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(insightsConfig, actualRequest.getInsightsConfig());
    Assert.assertEquals(insightsConfigId, actualRequest.getInsightsConfigId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createInsightsConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      String parent = "parent-995424086";
      InsightsConfig insightsConfig = InsightsConfig.newBuilder().build();
      String insightsConfigId = "insightsConfigId774395128";
      client.createInsightsConfigAsync(parent, insightsConfig, insightsConfigId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getInsightsConfigTest() throws Exception {
    InsightsConfig expectedResponse =
        InsightsConfig.newBuilder()
            .setName(
                InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .addAllRuntimeConfigs(new ArrayList<RuntimeConfig>())
            .addAllArtifactConfigs(new ArrayList<ArtifactConfig>())
            .putAllAnnotations(new HashMap<String, String>())
            .putAllLabels(new HashMap<String, String>())
            .setReconciling(true)
            .addAllErrors(new ArrayList<Status>())
            .build();
    mockInsightsConfigService.addResponse(expectedResponse);

    InsightsConfigName name = InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]");

    InsightsConfig actualResponse = client.getInsightsConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInsightsConfigRequest actualRequest = ((GetInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getInsightsConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      InsightsConfigName name =
          InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]");
      client.getInsightsConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getInsightsConfigTest2() throws Exception {
    InsightsConfig expectedResponse =
        InsightsConfig.newBuilder()
            .setName(
                InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .addAllRuntimeConfigs(new ArrayList<RuntimeConfig>())
            .addAllArtifactConfigs(new ArrayList<ArtifactConfig>())
            .putAllAnnotations(new HashMap<String, String>())
            .putAllLabels(new HashMap<String, String>())
            .setReconciling(true)
            .addAllErrors(new ArrayList<Status>())
            .build();
    mockInsightsConfigService.addResponse(expectedResponse);

    String name = "name3373707";

    InsightsConfig actualResponse = client.getInsightsConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetInsightsConfigRequest actualRequest = ((GetInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getInsightsConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      String name = "name3373707";
      client.getInsightsConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateInsightsConfigTest() throws Exception {
    InsightsConfig expectedResponse =
        InsightsConfig.newBuilder()
            .setName(
                InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .addAllRuntimeConfigs(new ArrayList<RuntimeConfig>())
            .addAllArtifactConfigs(new ArrayList<ArtifactConfig>())
            .putAllAnnotations(new HashMap<String, String>())
            .putAllLabels(new HashMap<String, String>())
            .setReconciling(true)
            .addAllErrors(new ArrayList<Status>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateInsightsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInsightsConfigService.addResponse(resultOperation);

    UpdateInsightsConfigRequest request =
        UpdateInsightsConfigRequest.newBuilder()
            .setInsightsConfig(InsightsConfig.newBuilder().build())
            .setRequestId("requestId693933066")
            .setAllowMissing(true)
            .setValidateOnly(true)
            .build();

    InsightsConfig actualResponse = client.updateInsightsConfigAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateInsightsConfigRequest actualRequest =
        ((UpdateInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(request.getInsightsConfig(), actualRequest.getInsightsConfig());
    Assert.assertEquals(request.getRequestId(), actualRequest.getRequestId());
    Assert.assertEquals(request.getAllowMissing(), actualRequest.getAllowMissing());
    Assert.assertEquals(request.getValidateOnly(), actualRequest.getValidateOnly());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateInsightsConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      UpdateInsightsConfigRequest request =
          UpdateInsightsConfigRequest.newBuilder()
              .setInsightsConfig(InsightsConfig.newBuilder().build())
              .setRequestId("requestId693933066")
              .setAllowMissing(true)
              .setValidateOnly(true)
              .build();
      client.updateInsightsConfigAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteInsightsConfigTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInsightsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInsightsConfigService.addResponse(resultOperation);

    InsightsConfigName name = InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]");

    client.deleteInsightsConfigAsync(name).get();

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInsightsConfigRequest actualRequest =
        ((DeleteInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteInsightsConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      InsightsConfigName name =
          InsightsConfigName.of("[PROJECT]", "[LOCATION]", "[INSIGHTS_CONFIG]");
      client.deleteInsightsConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteInsightsConfigTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteInsightsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockInsightsConfigService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteInsightsConfigAsync(name).get();

    List<AbstractMessage> actualRequests = mockInsightsConfigService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteInsightsConfigRequest actualRequest =
        ((DeleteInsightsConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteInsightsConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockInsightsConfigService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteInsightsConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
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
    mockLocations.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("name3373707")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListLocationsRequest actualRequest = ((ListLocationsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getFilter(), actualRequest.getFilter());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("name3373707")
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
    mockLocations.addResponse(expectedResponse);

    GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLocationRequest actualRequest = ((GetLocationRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
