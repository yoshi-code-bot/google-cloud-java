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

package com.google.cloud.automl.v1beta1;

import static com.google.cloud.automl.v1beta1.AutoMlClient.ListColumnSpecsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListDatasetsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelEvaluationsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListModelsPagedResponse;
import static com.google.cloud.automl.v1beta1.AutoMlClient.ListTableSpecsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.automl.v1beta1.stub.HttpJsonAutoMlStub;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class AutoMlClientHttpJsonTest {
  private static MockHttpService mockService;
  private static AutoMlClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonAutoMlStub.getMethodDescriptors(), AutoMlSettings.getDefaultEndpoint());
    AutoMlSettings settings =
        AutoMlSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                AutoMlSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = AutoMlClient.create(settings);
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
  public void createDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDataset(parent, dataset);
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
  public void createDatasetExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Dataset dataset = Dataset.newBuilder().build();
      client.createDataset(parent, dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDatasetTest2() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDataset(parent, dataset);
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
  public void createDatasetExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Dataset dataset = Dataset.newBuilder().build();
      client.createDataset(parent, dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    Dataset actualResponse = client.getDataset(name);
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
  public void getDatasetExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.getDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDatasetTest2() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";

    Dataset actualResponse = client.getDataset(name);
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
  public void getDatasetExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
      client.getDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDatasetsTest() throws Exception {
    Dataset responsesElement = Dataset.newBuilder().build();
    ListDatasetsResponse expectedResponse =
        ListDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDatasets(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

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
  public void listDatasetsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDatasetsTest2() throws Exception {
    Dataset responsesElement = Dataset.newBuilder().build();
    ListDatasetsResponse expectedResponse =
        ListDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDatasets(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

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
  public void listDatasetsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    Dataset dataset =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setDescription("description-1724546052")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setEtag("etag3123477")
            .build();

    Dataset actualResponse = client.updateDataset(dataset);
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
  public void updateDatasetExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Dataset dataset =
          Dataset.newBuilder()
              .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
              .setDisplayName("displayName1714148973")
              .setDescription("description-1724546052")
              .setExampleCount(1517063674)
              .setCreateTime(Timestamp.newBuilder().build())
              .setEtag("etag3123477")
              .build();
      client.updateDataset(dataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDatasetTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    client.deleteDatasetAsync(name).get();

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
  public void deleteDatasetExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteDatasetTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";

    client.deleteDatasetAsync(name).get();

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
  public void deleteDatasetExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void importDataTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
    InputConfig inputConfig = InputConfig.newBuilder().build();

    client.importDataAsync(name, inputConfig).get();

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
  public void importDataExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      InputConfig inputConfig = InputConfig.newBuilder().build();
      client.importDataAsync(name, inputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void importDataTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("importDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
    InputConfig inputConfig = InputConfig.newBuilder().build();

    client.importDataAsync(name, inputConfig).get();

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
  public void importDataExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
      InputConfig inputConfig = InputConfig.newBuilder().build();
      client.importDataAsync(name, inputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportDataTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
    OutputConfig outputConfig = OutputConfig.newBuilder().build();

    client.exportDataAsync(name, outputConfig).get();

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
  public void exportDataExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      OutputConfig outputConfig = OutputConfig.newBuilder().build();
      client.exportDataAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportDataTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportDataTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
    OutputConfig outputConfig = OutputConfig.newBuilder().build();

    client.exportDataAsync(name, outputConfig).get();

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
  public void exportDataExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1333/locations/location-1333/datasets/dataset-1333";
      OutputConfig outputConfig = OutputConfig.newBuilder().build();
      client.exportDataAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getAnnotationSpecTest() throws Exception {
    AnnotationSpec expectedResponse =
        AnnotationSpec.newBuilder()
            .setName(
                AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setExampleCount(1517063674)
            .build();
    mockService.addResponse(expectedResponse);

    AnnotationSpecName name =
        AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");

    AnnotationSpec actualResponse = client.getAnnotationSpec(name);
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
  public void getAnnotationSpecExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      AnnotationSpecName name =
          AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]");
      client.getAnnotationSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAnnotationSpecTest2() throws Exception {
    AnnotationSpec expectedResponse =
        AnnotationSpec.newBuilder()
            .setName(
                AnnotationSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[ANNOTATION_SPEC]")
                    .toString())
            .setDisplayName("displayName1714148973")
            .setExampleCount(1517063674)
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-1312/locations/location-1312/datasets/dataset-1312/annotationSpecs/annotationSpec-1312";

    AnnotationSpec actualResponse = client.getAnnotationSpec(name);
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
  public void getAnnotationSpecExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1312/locations/location-1312/datasets/dataset-1312/annotationSpecs/annotationSpec-1312";
      client.getAnnotationSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableSpecTest() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("timeColumnSpecId1156268185")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    TableSpecName name = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");

    TableSpec actualResponse = client.getTableSpec(name);
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
  public void getTableSpecExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TableSpecName name = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");
      client.getTableSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableSpecTest2() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("timeColumnSpecId1156268185")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-5321/locations/location-5321/datasets/dataset-5321/tableSpecs/tableSpec-5321";

    TableSpec actualResponse = client.getTableSpec(name);
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
  public void getTableSpecExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-5321/locations/location-5321/datasets/dataset-5321/tableSpecs/tableSpec-5321";
      client.getTableSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTableSpecsTest() throws Exception {
    TableSpec responsesElement = TableSpec.newBuilder().build();
    ListTableSpecsResponse expectedResponse =
        ListTableSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTableSpecs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    ListTableSpecsPagedResponse pagedListResponse = client.listTableSpecs(parent);

    List<TableSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTableSpecsList().get(0), resources.get(0));

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
  public void listTableSpecsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.listTableSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTableSpecsTest2() throws Exception {
    TableSpec responsesElement = TableSpec.newBuilder().build();
    ListTableSpecsResponse expectedResponse =
        ListTableSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllTableSpecs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-8892/locations/location-8892/datasets/dataset-8892";

    ListTableSpecsPagedResponse pagedListResponse = client.listTableSpecs(parent);

    List<TableSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTableSpecsList().get(0), resources.get(0));

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
  public void listTableSpecsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-8892/locations/location-8892/datasets/dataset-8892";
      client.listTableSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateTableSpecTest() throws Exception {
    TableSpec expectedResponse =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("timeColumnSpecId1156268185")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    TableSpec tableSpec =
        TableSpec.newBuilder()
            .setName(
                TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]").toString())
            .setTimeColumnSpecId("timeColumnSpecId1156268185")
            .setRowCount(1340416618)
            .setValidRowCount(-406068761)
            .setColumnCount(-122671386)
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setEtag("etag3123477")
            .build();

    TableSpec actualResponse = client.updateTableSpec(tableSpec);
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
  public void updateTableSpecExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TableSpec tableSpec =
          TableSpec.newBuilder()
              .setName(
                  TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]")
                      .toString())
              .setTimeColumnSpecId("timeColumnSpecId1156268185")
              .setRowCount(1340416618)
              .setValidRowCount(-406068761)
              .setColumnCount(-122671386)
              .addAllInputConfigs(new ArrayList<InputConfig>())
              .setEtag("etag3123477")
              .build();
      client.updateTableSpec(tableSpec);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getColumnSpecTest() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    ColumnSpecName name =
        ColumnSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]");

    ColumnSpec actualResponse = client.getColumnSpec(name);
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
  public void getColumnSpecExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ColumnSpecName name =
          ColumnSpecName.of(
              "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]");
      client.getColumnSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getColumnSpecTest2() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-4873/locations/location-4873/datasets/dataset-4873/tableSpecs/tableSpec-4873/columnSpecs/columnSpec-4873";

    ColumnSpec actualResponse = client.getColumnSpec(name);
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
  public void getColumnSpecExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4873/locations/location-4873/datasets/dataset-4873/tableSpecs/tableSpec-4873/columnSpecs/columnSpec-4873";
      client.getColumnSpec(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listColumnSpecsTest() throws Exception {
    ColumnSpec responsesElement = ColumnSpec.newBuilder().build();
    ListColumnSpecsResponse expectedResponse =
        ListColumnSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllColumnSpecs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    TableSpecName parent = TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");

    ListColumnSpecsPagedResponse pagedListResponse = client.listColumnSpecs(parent);

    List<ColumnSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getColumnSpecsList().get(0), resources.get(0));

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
  public void listColumnSpecsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      TableSpecName parent =
          TableSpecName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]");
      client.listColumnSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listColumnSpecsTest2() throws Exception {
    ColumnSpec responsesElement = ColumnSpec.newBuilder().build();
    ListColumnSpecsResponse expectedResponse =
        ListColumnSpecsResponse.newBuilder()
            .setNextPageToken("")
            .addAllColumnSpecs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent =
        "projects/project-7240/locations/location-7240/datasets/dataset-7240/tableSpecs/tableSpec-7240";

    ListColumnSpecsPagedResponse pagedListResponse = client.listColumnSpecs(parent);

    List<ColumnSpec> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getColumnSpecsList().get(0), resources.get(0));

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
  public void listColumnSpecsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent =
          "projects/project-7240/locations/location-7240/datasets/dataset-7240/tableSpecs/tableSpec-7240";
      client.listColumnSpecs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateColumnSpecTest() throws Exception {
    ColumnSpec expectedResponse =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();
    mockService.addResponse(expectedResponse);

    ColumnSpec columnSpec =
        ColumnSpec.newBuilder()
            .setName(
                ColumnSpecName.of(
                        "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                    .toString())
            .setDataType(DataType.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .setDataStats(DataStats.newBuilder().build())
            .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
            .setEtag("etag3123477")
            .build();

    ColumnSpec actualResponse = client.updateColumnSpec(columnSpec);
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
  public void updateColumnSpecExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ColumnSpec columnSpec =
          ColumnSpec.newBuilder()
              .setName(
                  ColumnSpecName.of(
                          "[PROJECT]", "[LOCATION]", "[DATASET]", "[TABLE_SPEC]", "[COLUMN_SPEC]")
                      .toString())
              .setDataType(DataType.newBuilder().build())
              .setDisplayName("displayName1714148973")
              .setDataStats(DataStats.newBuilder().build())
              .addAllTopCorrelatedColumns(new ArrayList<ColumnSpec.CorrelatedColumn>())
              .setEtag("etag3123477")
              .build();
      client.updateColumnSpec(columnSpec);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createModelTest() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDatasetId("datasetId-345342029")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
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
  public void createModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createModelTest2() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDatasetId("datasetId-345342029")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
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
  public void createModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getModelTest() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDatasetId("datasetId-345342029")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    Model actualResponse = client.getModel(name);
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
  public void getModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.getModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getModelTest2() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDatasetId("datasetId-345342029")
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";

    Model actualResponse = client.getModel(name);
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
  public void getModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      client.getModel(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelsTest() throws Exception {
    Model responsesElement = Model.newBuilder().build();
    ListModelsResponse expectedResponse =
        ListModelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModel(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelList().get(0), resources.get(0));

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
  public void listModelsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelsTest2() throws Exception {
    Model responsesElement = Model.newBuilder().build();
    ListModelsResponse expectedResponse =
        ListModelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModel(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelList().get(0), resources.get(0));

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
  public void listModelsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.deleteModelAsync(name).get();

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
  public void deleteModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";

    client.deleteModelAsync(name).get();

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
  public void deleteModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deployModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.deployModelAsync(name).get();

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
  public void deployModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.deployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deployModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";

    client.deployModelAsync(name).get();

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
  public void deployModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      client.deployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void undeployModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.undeployModelAsync(name).get();

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
  public void undeployModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.undeployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void undeployModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeployModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";

    client.undeployModelAsync(name).get();

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
  public void undeployModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      client.undeployModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportModelTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();

    client.exportModelAsync(name, outputConfig).get();

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
  public void exportModelExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
      client.exportModelAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportModelTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";
    ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();

    client.exportModelAsync(name, outputConfig).get();

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
  public void exportModelExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      ModelExportOutputConfig outputConfig = ModelExportOutputConfig.newBuilder().build();
      client.exportModelAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportEvaluatedExamplesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportEvaluatedExamplesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
    ExportEvaluatedExamplesOutputConfig outputConfig =
        ExportEvaluatedExamplesOutputConfig.newBuilder().build();

    client.exportEvaluatedExamplesAsync(name, outputConfig).get();

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
  public void exportEvaluatedExamplesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      ExportEvaluatedExamplesOutputConfig outputConfig =
          ExportEvaluatedExamplesOutputConfig.newBuilder().build();
      client.exportEvaluatedExamplesAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void exportEvaluatedExamplesTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("exportEvaluatedExamplesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7594/locations/location-7594/models/model-7594";
    ExportEvaluatedExamplesOutputConfig outputConfig =
        ExportEvaluatedExamplesOutputConfig.newBuilder().build();

    client.exportEvaluatedExamplesAsync(name, outputConfig).get();

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
  public void exportEvaluatedExamplesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7594/locations/location-7594/models/model-7594";
      ExportEvaluatedExamplesOutputConfig outputConfig =
          ExportEvaluatedExamplesOutputConfig.newBuilder().build();
      client.exportEvaluatedExamplesAsync(name, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getModelEvaluationTest() throws Exception {
    ModelEvaluation expectedResponse =
        ModelEvaluation.newBuilder()
            .setName(
                ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]")
                    .toString())
            .setAnnotationSpecId("annotationSpecId1320449605")
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setEvaluatedExampleCount(277565350)
            .build();
    mockService.addResponse(expectedResponse);

    ModelEvaluationName name =
        ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");

    ModelEvaluation actualResponse = client.getModelEvaluation(name);
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
  public void getModelEvaluationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelEvaluationName name =
          ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]");
      client.getModelEvaluation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getModelEvaluationTest2() throws Exception {
    ModelEvaluation expectedResponse =
        ModelEvaluation.newBuilder()
            .setName(
                ModelEvaluationName.of("[PROJECT]", "[LOCATION]", "[MODEL]", "[MODEL_EVALUATION]")
                    .toString())
            .setAnnotationSpecId("annotationSpecId1320449605")
            .setDisplayName("displayName1714148973")
            .setCreateTime(Timestamp.newBuilder().build())
            .setEvaluatedExampleCount(277565350)
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-4542/locations/location-4542/models/model-4542/modelEvaluations/modelEvaluation-4542";

    ModelEvaluation actualResponse = client.getModelEvaluation(name);
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
  public void getModelEvaluationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4542/locations/location-4542/models/model-4542/modelEvaluations/modelEvaluation-4542";
      client.getModelEvaluation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelEvaluationsTest() throws Exception {
    ModelEvaluation responsesElement = ModelEvaluation.newBuilder().build();
    ListModelEvaluationsResponse expectedResponse =
        ListModelEvaluationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModelEvaluation(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    ListModelEvaluationsPagedResponse pagedListResponse = client.listModelEvaluations(parent);

    List<ModelEvaluation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelEvaluationList().get(0), resources.get(0));

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
  public void listModelEvaluationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ModelName parent = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.listModelEvaluations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listModelEvaluationsTest2() throws Exception {
    ModelEvaluation responsesElement = ModelEvaluation.newBuilder().build();
    ListModelEvaluationsResponse expectedResponse =
        ListModelEvaluationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModelEvaluation(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5605/locations/location-5605/models/model-5605";

    ListModelEvaluationsPagedResponse pagedListResponse = client.listModelEvaluations(parent);

    List<ModelEvaluation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelEvaluationList().get(0), resources.get(0));

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
  public void listModelEvaluationsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5605/locations/location-5605/models/model-5605";
      client.listModelEvaluations(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
