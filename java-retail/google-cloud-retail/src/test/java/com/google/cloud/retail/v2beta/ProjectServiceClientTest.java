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

package com.google.cloud.retail.v2beta;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.FieldMask;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class ProjectServiceClientTest {
  private static MockLocations mockLocations;
  private static MockProjectService mockProjectService;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private ProjectServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockProjectService = new MockProjectService();
    mockLocations = new MockLocations();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockProjectService, mockLocations));
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
    ProjectServiceSettings settings =
        ProjectServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = ProjectServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void getAlertConfigTest() throws Exception {
    AlertConfig expectedResponse =
        AlertConfig.newBuilder()
            .setName(AlertConfigName.of("[PROJECT]").toString())
            .addAllAlertPolicies(new ArrayList<AlertConfig.AlertPolicy>())
            .build();
    mockProjectService.addResponse(expectedResponse);

    AlertConfigName name = AlertConfigName.of("[PROJECT]");

    AlertConfig actualResponse = client.getAlertConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProjectService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAlertConfigRequest actualRequest = ((GetAlertConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAlertConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProjectService.addException(exception);

    try {
      AlertConfigName name = AlertConfigName.of("[PROJECT]");
      client.getAlertConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAlertConfigTest2() throws Exception {
    AlertConfig expectedResponse =
        AlertConfig.newBuilder()
            .setName(AlertConfigName.of("[PROJECT]").toString())
            .addAllAlertPolicies(new ArrayList<AlertConfig.AlertPolicy>())
            .build();
    mockProjectService.addResponse(expectedResponse);

    String name = "name3373707";

    AlertConfig actualResponse = client.getAlertConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProjectService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAlertConfigRequest actualRequest = ((GetAlertConfigRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAlertConfigExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProjectService.addException(exception);

    try {
      String name = "name3373707";
      client.getAlertConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAlertConfigTest() throws Exception {
    AlertConfig expectedResponse =
        AlertConfig.newBuilder()
            .setName(AlertConfigName.of("[PROJECT]").toString())
            .addAllAlertPolicies(new ArrayList<AlertConfig.AlertPolicy>())
            .build();
    mockProjectService.addResponse(expectedResponse);

    AlertConfig alertConfig = AlertConfig.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    AlertConfig actualResponse = client.updateAlertConfig(alertConfig, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockProjectService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAlertConfigRequest actualRequest = ((UpdateAlertConfigRequest) actualRequests.get(0));

    Assert.assertEquals(alertConfig, actualRequest.getAlertConfig());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAlertConfigExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockProjectService.addException(exception);

    try {
      AlertConfig alertConfig = AlertConfig.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAlertConfig(alertConfig, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
