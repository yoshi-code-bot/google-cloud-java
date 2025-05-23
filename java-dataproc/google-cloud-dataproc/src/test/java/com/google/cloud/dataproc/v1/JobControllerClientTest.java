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

package com.google.cloud.dataproc.v1;

import static com.google.cloud.dataproc.v1.JobControllerClient.ListJobsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
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
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
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
public class JobControllerClientTest {
  private static MockIAMPolicy mockIAMPolicy;
  private static MockJobController mockJobController;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private JobControllerClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockJobController = new MockJobController();
    mockIAMPolicy = new MockIAMPolicy();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockJobController, mockIAMPolicy));
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
    JobControllerSettings settings =
        JobControllerSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = JobControllerClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void submitJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setReference(JobReference.newBuilder().build())
            .setPlacement(JobPlacement.newBuilder().build())
            .setStatus(JobStatus.newBuilder().build())
            .addAllStatusHistory(new ArrayList<JobStatus>())
            .addAllYarnApplications(new ArrayList<YarnApplication>())
            .setDriverOutputResourceUri("driverOutputResourceUri794556277")
            .setDriverControlFilesUri("driverControlFilesUri1491948202")
            .putAllLabels(new HashMap<String, String>())
            .setScheduling(JobScheduling.newBuilder().build())
            .setJobUuid("jobUuid-1437868776")
            .setDone(true)
            .setDriverSchedulingConfig(DriverSchedulingConfig.newBuilder().build())
            .build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    Job job = Job.newBuilder().build();

    Job actualResponse = client.submitJob(projectId, region, job);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SubmitJobRequest actualRequest = ((SubmitJobRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(job, actualRequest.getJob());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void submitJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      Job job = Job.newBuilder().build();
      client.submitJob(projectId, region, job);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void submitJobAsOperationTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setReference(JobReference.newBuilder().build())
            .setPlacement(JobPlacement.newBuilder().build())
            .setStatus(JobStatus.newBuilder().build())
            .addAllStatusHistory(new ArrayList<JobStatus>())
            .addAllYarnApplications(new ArrayList<YarnApplication>())
            .setDriverOutputResourceUri("driverOutputResourceUri794556277")
            .setDriverControlFilesUri("driverControlFilesUri1491948202")
            .putAllLabels(new HashMap<String, String>())
            .setScheduling(JobScheduling.newBuilder().build())
            .setJobUuid("jobUuid-1437868776")
            .setDone(true)
            .setDriverSchedulingConfig(DriverSchedulingConfig.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("submitJobAsOperationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockJobController.addResponse(resultOperation);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    Job job = Job.newBuilder().build();

    Job actualResponse = client.submitJobAsOperationAsync(projectId, region, job).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SubmitJobRequest actualRequest = ((SubmitJobRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(job, actualRequest.getJob());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void submitJobAsOperationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      Job job = Job.newBuilder().build();
      client.submitJobAsOperationAsync(projectId, region, job).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setReference(JobReference.newBuilder().build())
            .setPlacement(JobPlacement.newBuilder().build())
            .setStatus(JobStatus.newBuilder().build())
            .addAllStatusHistory(new ArrayList<JobStatus>())
            .addAllYarnApplications(new ArrayList<YarnApplication>())
            .setDriverOutputResourceUri("driverOutputResourceUri794556277")
            .setDriverControlFilesUri("driverControlFilesUri1491948202")
            .putAllLabels(new HashMap<String, String>())
            .setScheduling(JobScheduling.newBuilder().build())
            .setJobUuid("jobUuid-1437868776")
            .setDone(true)
            .setDriverSchedulingConfig(DriverSchedulingConfig.newBuilder().build())
            .build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    String jobId = "jobId101296568";

    Job actualResponse = client.getJob(projectId, region, jobId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetJobRequest actualRequest = ((GetJobRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(jobId, actualRequest.getJobId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      String jobId = "jobId101296568";
      client.getJob(projectId, region, jobId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listJobsTest() throws Exception {
    Job responsesElement = Job.newBuilder().build();
    ListJobsResponse expectedResponse =
        ListJobsResponse.newBuilder()
            .setNextPageToken("")
            .addAllJobs(Arrays.asList(responsesElement))
            .build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";

    ListJobsPagedResponse pagedListResponse = client.listJobs(projectId, region);

    List<Job> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getJobsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListJobsRequest actualRequest = ((ListJobsRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listJobsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      client.listJobs(projectId, region);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listJobsTest2() throws Exception {
    Job responsesElement = Job.newBuilder().build();
    ListJobsResponse expectedResponse =
        ListJobsResponse.newBuilder()
            .setNextPageToken("")
            .addAllJobs(Arrays.asList(responsesElement))
            .build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    String filter = "filter-1274492040";

    ListJobsPagedResponse pagedListResponse = client.listJobs(projectId, region, filter);

    List<Job> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getJobsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListJobsRequest actualRequest = ((ListJobsRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(filter, actualRequest.getFilter());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listJobsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      String filter = "filter-1274492040";
      client.listJobs(projectId, region, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setReference(JobReference.newBuilder().build())
            .setPlacement(JobPlacement.newBuilder().build())
            .setStatus(JobStatus.newBuilder().build())
            .addAllStatusHistory(new ArrayList<JobStatus>())
            .addAllYarnApplications(new ArrayList<YarnApplication>())
            .setDriverOutputResourceUri("driverOutputResourceUri794556277")
            .setDriverControlFilesUri("driverControlFilesUri1491948202")
            .putAllLabels(new HashMap<String, String>())
            .setScheduling(JobScheduling.newBuilder().build())
            .setJobUuid("jobUuid-1437868776")
            .setDone(true)
            .setDriverSchedulingConfig(DriverSchedulingConfig.newBuilder().build())
            .build();
    mockJobController.addResponse(expectedResponse);

    UpdateJobRequest request =
        UpdateJobRequest.newBuilder()
            .setProjectId("projectId-894832108")
            .setRegion("region-934795532")
            .setJobId("jobId101296568")
            .setJob(Job.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    Job actualResponse = client.updateJob(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateJobRequest actualRequest = ((UpdateJobRequest) actualRequests.get(0));

    Assert.assertEquals(request.getProjectId(), actualRequest.getProjectId());
    Assert.assertEquals(request.getRegion(), actualRequest.getRegion());
    Assert.assertEquals(request.getJobId(), actualRequest.getJobId());
    Assert.assertEquals(request.getJob(), actualRequest.getJob());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      UpdateJobRequest request =
          UpdateJobRequest.newBuilder()
              .setProjectId("projectId-894832108")
              .setRegion("region-934795532")
              .setJobId("jobId101296568")
              .setJob(Job.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.updateJob(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void cancelJobTest() throws Exception {
    Job expectedResponse =
        Job.newBuilder()
            .setReference(JobReference.newBuilder().build())
            .setPlacement(JobPlacement.newBuilder().build())
            .setStatus(JobStatus.newBuilder().build())
            .addAllStatusHistory(new ArrayList<JobStatus>())
            .addAllYarnApplications(new ArrayList<YarnApplication>())
            .setDriverOutputResourceUri("driverOutputResourceUri794556277")
            .setDriverControlFilesUri("driverControlFilesUri1491948202")
            .putAllLabels(new HashMap<String, String>())
            .setScheduling(JobScheduling.newBuilder().build())
            .setJobUuid("jobUuid-1437868776")
            .setDone(true)
            .setDriverSchedulingConfig(DriverSchedulingConfig.newBuilder().build())
            .build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    String jobId = "jobId101296568";

    Job actualResponse = client.cancelJob(projectId, region, jobId);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CancelJobRequest actualRequest = ((CancelJobRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(jobId, actualRequest.getJobId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void cancelJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      String jobId = "jobId101296568";
      client.cancelJob(projectId, region, jobId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteJobTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockJobController.addResponse(expectedResponse);

    String projectId = "projectId-894832108";
    String region = "region-934795532";
    String jobId = "jobId101296568";

    client.deleteJob(projectId, region, jobId);

    List<AbstractMessage> actualRequests = mockJobController.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteJobRequest actualRequest = ((DeleteJobRequest) actualRequests.get(0));

    Assert.assertEquals(projectId, actualRequest.getProjectId());
    Assert.assertEquals(region, actualRequest.getRegion());
    Assert.assertEquals(jobId, actualRequest.getJobId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteJobExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockJobController.addException(exception);

    try {
      String projectId = "projectId-894832108";
      String region = "region-934795532";
      String jobId = "jobId101296568";
      client.deleteJob(projectId, region, jobId);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .setPolicy(Policy.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    Policy actualResponse = client.setIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = ((SetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPolicy(), actualRequest.getPolicy());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      SetIamPolicyRequest request =
          SetIamPolicyRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .setPolicy(Policy.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.setIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockIAMPolicy.addResponse(expectedResponse);

    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .setOptions(GetPolicyOptions.newBuilder().build())
            .build();

    Policy actualResponse = client.getIamPolicy(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = ((GetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getOptions(), actualRequest.getOptions());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      GetIamPolicyRequest request =
          GetIamPolicyRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .setOptions(GetPolicyOptions.newBuilder().build())
              .build();
      client.getIamPolicy(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockIAMPolicy.addResponse(expectedResponse);

    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(
                AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                        "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                    .toString())
            .addAllPermissions(new ArrayList<String>())
            .build();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockIAMPolicy.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = ((TestIamPermissionsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getResource(), actualRequest.getResource());
    Assert.assertEquals(request.getPermissionsList(), actualRequest.getPermissionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void testIamPermissionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockIAMPolicy.addException(exception);

    try {
      TestIamPermissionsRequest request =
          TestIamPermissionsRequest.newBuilder()
              .setResource(
                  AutoscalingPolicyName.ofProjectRegionAutoscalingPolicyName(
                          "[PROJECT]", "[REGION]", "[AUTOSCALING_POLICY]")
                      .toString())
              .addAllPermissions(new ArrayList<String>())
              .build();
      client.testIamPermissions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
