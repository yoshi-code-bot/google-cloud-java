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

package com.google.cloud.translate.v3;

import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtDatasetsPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtFilesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtSentencesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListDatasetsPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListExamplesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListGlossariesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListGlossaryEntriesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListModelsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
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
public class TranslationServiceClientTest {
  private static MockServiceHelper mockServiceHelper;
  private static MockTranslationService mockTranslationService;
  private LocalChannelProvider channelProvider;
  private TranslationServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockTranslationService = new MockTranslationService();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockTranslationService));
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
    TranslationServiceSettings settings =
        TranslationServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = TranslationServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void translateTextTest() throws Exception {
    TranslateTextResponse expectedResponse =
        TranslateTextResponse.newBuilder()
            .addAllTranslations(new ArrayList<Translation>())
            .addAllGlossaryTranslations(new ArrayList<Translation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    String targetLanguageCode = "targetLanguageCode-106414698";
    List<String> contents = new ArrayList<>();

    TranslateTextResponse actualResponse =
        client.translateText(parent, targetLanguageCode, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TranslateTextRequest actualRequest = ((TranslateTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(targetLanguageCode, actualRequest.getTargetLanguageCode());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void translateTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      String targetLanguageCode = "targetLanguageCode-106414698";
      List<String> contents = new ArrayList<>();
      client.translateText(parent, targetLanguageCode, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void translateTextTest2() throws Exception {
    TranslateTextResponse expectedResponse =
        TranslateTextResponse.newBuilder()
            .addAllTranslations(new ArrayList<Translation>())
            .addAllGlossaryTranslations(new ArrayList<Translation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String targetLanguageCode = "targetLanguageCode-106414698";
    List<String> contents = new ArrayList<>();

    TranslateTextResponse actualResponse =
        client.translateText(parent, targetLanguageCode, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TranslateTextRequest actualRequest = ((TranslateTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(targetLanguageCode, actualRequest.getTargetLanguageCode());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void translateTextExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      String targetLanguageCode = "targetLanguageCode-106414698";
      List<String> contents = new ArrayList<>();
      client.translateText(parent, targetLanguageCode, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void translateTextTest3() throws Exception {
    TranslateTextResponse expectedResponse =
        TranslateTextResponse.newBuilder()
            .addAllTranslations(new ArrayList<Translation>())
            .addAllGlossaryTranslations(new ArrayList<Translation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    String model = "model104069929";
    String mimeType = "mimeType-1392120434";
    String sourceLanguageCode = "sourceLanguageCode1645917472";
    String targetLanguageCode = "targetLanguageCode-106414698";
    List<String> contents = new ArrayList<>();

    TranslateTextResponse actualResponse =
        client.translateText(
            parent, model, mimeType, sourceLanguageCode, targetLanguageCode, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TranslateTextRequest actualRequest = ((TranslateTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(mimeType, actualRequest.getMimeType());
    Assert.assertEquals(sourceLanguageCode, actualRequest.getSourceLanguageCode());
    Assert.assertEquals(targetLanguageCode, actualRequest.getTargetLanguageCode());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void translateTextExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      String model = "model104069929";
      String mimeType = "mimeType-1392120434";
      String sourceLanguageCode = "sourceLanguageCode1645917472";
      String targetLanguageCode = "targetLanguageCode-106414698";
      List<String> contents = new ArrayList<>();
      client.translateText(
          parent, model, mimeType, sourceLanguageCode, targetLanguageCode, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void translateTextTest4() throws Exception {
    TranslateTextResponse expectedResponse =
        TranslateTextResponse.newBuilder()
            .addAllTranslations(new ArrayList<Translation>())
            .addAllGlossaryTranslations(new ArrayList<Translation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String model = "model104069929";
    String mimeType = "mimeType-1392120434";
    String sourceLanguageCode = "sourceLanguageCode1645917472";
    String targetLanguageCode = "targetLanguageCode-106414698";
    List<String> contents = new ArrayList<>();

    TranslateTextResponse actualResponse =
        client.translateText(
            parent, model, mimeType, sourceLanguageCode, targetLanguageCode, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TranslateTextRequest actualRequest = ((TranslateTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(mimeType, actualRequest.getMimeType());
    Assert.assertEquals(sourceLanguageCode, actualRequest.getSourceLanguageCode());
    Assert.assertEquals(targetLanguageCode, actualRequest.getTargetLanguageCode());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void translateTextExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      String model = "model104069929";
      String mimeType = "mimeType-1392120434";
      String sourceLanguageCode = "sourceLanguageCode1645917472";
      String targetLanguageCode = "targetLanguageCode-106414698";
      List<String> contents = new ArrayList<>();
      client.translateText(
          parent, model, mimeType, sourceLanguageCode, targetLanguageCode, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void romanizeTextTest() throws Exception {
    RomanizeTextResponse expectedResponse =
        RomanizeTextResponse.newBuilder()
            .addAllRomanizations(new ArrayList<Romanization>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    List<String> contents = new ArrayList<>();

    RomanizeTextResponse actualResponse = client.romanizeText(parent, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RomanizeTextRequest actualRequest = ((RomanizeTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void romanizeTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      List<String> contents = new ArrayList<>();
      client.romanizeText(parent, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void romanizeTextTest2() throws Exception {
    RomanizeTextResponse expectedResponse =
        RomanizeTextResponse.newBuilder()
            .addAllRomanizations(new ArrayList<Romanization>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    List<String> contents = new ArrayList<>();

    RomanizeTextResponse actualResponse = client.romanizeText(parent, contents);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RomanizeTextRequest actualRequest = ((RomanizeTextRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(contents, actualRequest.getContentsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void romanizeTextExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      List<String> contents = new ArrayList<>();
      client.romanizeText(parent, contents);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void detectLanguageTest() throws Exception {
    DetectLanguageResponse expectedResponse =
        DetectLanguageResponse.newBuilder()
            .addAllLanguages(new ArrayList<DetectedLanguage>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    String model = "model104069929";
    String mimeType = "mimeType-1392120434";
    String content = "content951530617";

    DetectLanguageResponse actualResponse = client.detectLanguage(parent, model, mimeType, content);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DetectLanguageRequest actualRequest = ((DetectLanguageRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(mimeType, actualRequest.getMimeType());
    Assert.assertEquals(content, actualRequest.getContent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void detectLanguageExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      String model = "model104069929";
      String mimeType = "mimeType-1392120434";
      String content = "content951530617";
      client.detectLanguage(parent, model, mimeType, content);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void detectLanguageTest2() throws Exception {
    DetectLanguageResponse expectedResponse =
        DetectLanguageResponse.newBuilder()
            .addAllLanguages(new ArrayList<DetectedLanguage>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String model = "model104069929";
    String mimeType = "mimeType-1392120434";
    String content = "content951530617";

    DetectLanguageResponse actualResponse = client.detectLanguage(parent, model, mimeType, content);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DetectLanguageRequest actualRequest = ((DetectLanguageRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(mimeType, actualRequest.getMimeType());
    Assert.assertEquals(content, actualRequest.getContent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void detectLanguageExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      String model = "model104069929";
      String mimeType = "mimeType-1392120434";
      String content = "content951530617";
      client.detectLanguage(parent, model, mimeType, content);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSupportedLanguagesTest() throws Exception {
    SupportedLanguages expectedResponse =
        SupportedLanguages.newBuilder().addAllLanguages(new ArrayList<SupportedLanguage>()).build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    String model = "model104069929";
    String displayLanguageCode = "displayLanguageCode-1457478841";

    SupportedLanguages actualResponse =
        client.getSupportedLanguages(parent, model, displayLanguageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSupportedLanguagesRequest actualRequest =
        ((GetSupportedLanguagesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(displayLanguageCode, actualRequest.getDisplayLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSupportedLanguagesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      String model = "model104069929";
      String displayLanguageCode = "displayLanguageCode-1457478841";
      client.getSupportedLanguages(parent, model, displayLanguageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSupportedLanguagesTest2() throws Exception {
    SupportedLanguages expectedResponse =
        SupportedLanguages.newBuilder().addAllLanguages(new ArrayList<SupportedLanguage>()).build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String model = "model104069929";
    String displayLanguageCode = "displayLanguageCode-1457478841";

    SupportedLanguages actualResponse =
        client.getSupportedLanguages(parent, model, displayLanguageCode);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSupportedLanguagesRequest actualRequest =
        ((GetSupportedLanguagesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertEquals(displayLanguageCode, actualRequest.getDisplayLanguageCode());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSupportedLanguagesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      String model = "model104069929";
      String displayLanguageCode = "displayLanguageCode-1457478841";
      client.getSupportedLanguages(parent, model, displayLanguageCode);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void translateDocumentTest() throws Exception {
    TranslateDocumentResponse expectedResponse =
        TranslateDocumentResponse.newBuilder()
            .setDocumentTranslation(DocumentTranslation.newBuilder().build())
            .setGlossaryDocumentTranslation(DocumentTranslation.newBuilder().build())
            .setModel("model104069929")
            .setGlossaryConfig(TranslateTextGlossaryConfig.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    TranslateDocumentRequest request =
        TranslateDocumentRequest.newBuilder()
            .setParent("parent-995424086")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setDocumentInputConfig(DocumentInputConfig.newBuilder().build())
            .setDocumentOutputConfig(DocumentOutputConfig.newBuilder().build())
            .setModel("model104069929")
            .setGlossaryConfig(TranslateTextGlossaryConfig.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setCustomizedAttribution("customizedAttribution557650238")
            .setIsTranslateNativePdfOnly(true)
            .setEnableShadowRemovalNativePdf(true)
            .setEnableRotationCorrection(true)
            .build();

    TranslateDocumentResponse actualResponse = client.translateDocument(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TranslateDocumentRequest actualRequest = ((TranslateDocumentRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getSourceLanguageCode(), actualRequest.getSourceLanguageCode());
    Assert.assertEquals(request.getTargetLanguageCode(), actualRequest.getTargetLanguageCode());
    Assert.assertEquals(request.getDocumentInputConfig(), actualRequest.getDocumentInputConfig());
    Assert.assertEquals(request.getDocumentOutputConfig(), actualRequest.getDocumentOutputConfig());
    Assert.assertEquals(request.getModel(), actualRequest.getModel());
    Assert.assertEquals(request.getGlossaryConfig(), actualRequest.getGlossaryConfig());
    Assert.assertEquals(request.getLabelsMap(), actualRequest.getLabelsMap());
    Assert.assertEquals(
        request.getCustomizedAttribution(), actualRequest.getCustomizedAttribution());
    Assert.assertEquals(
        request.getIsTranslateNativePdfOnly(), actualRequest.getIsTranslateNativePdfOnly());
    Assert.assertEquals(
        request.getEnableShadowRemovalNativePdf(), actualRequest.getEnableShadowRemovalNativePdf());
    Assert.assertEquals(
        request.getEnableRotationCorrection(), actualRequest.getEnableRotationCorrection());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void translateDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      TranslateDocumentRequest request =
          TranslateDocumentRequest.newBuilder()
              .setParent("parent-995424086")
              .setSourceLanguageCode("sourceLanguageCode1645917472")
              .setTargetLanguageCode("targetLanguageCode-106414698")
              .setDocumentInputConfig(DocumentInputConfig.newBuilder().build())
              .setDocumentOutputConfig(DocumentOutputConfig.newBuilder().build())
              .setModel("model104069929")
              .setGlossaryConfig(TranslateTextGlossaryConfig.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setCustomizedAttribution("customizedAttribution557650238")
              .setIsTranslateNativePdfOnly(true)
              .setEnableShadowRemovalNativePdf(true)
              .setEnableRotationCorrection(true)
              .build();
      client.translateDocument(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void batchTranslateTextTest() throws Exception {
    BatchTranslateResponse expectedResponse =
        BatchTranslateResponse.newBuilder()
            .setTotalCharacters(-1368640955)
            .setTranslatedCharacters(-1337326221)
            .setFailedCharacters(1723028396)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchTranslateTextTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    BatchTranslateTextRequest request =
        BatchTranslateTextRequest.newBuilder()
            .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .addAllTargetLanguageCodes(new ArrayList<String>())
            .putAllModels(new HashMap<String, String>())
            .addAllInputConfigs(new ArrayList<InputConfig>())
            .setOutputConfig(OutputConfig.newBuilder().build())
            .putAllGlossaries(new HashMap<String, TranslateTextGlossaryConfig>())
            .putAllLabels(new HashMap<String, String>())
            .build();

    BatchTranslateResponse actualResponse = client.batchTranslateTextAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchTranslateTextRequest actualRequest = ((BatchTranslateTextRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getSourceLanguageCode(), actualRequest.getSourceLanguageCode());
    Assert.assertEquals(
        request.getTargetLanguageCodesList(), actualRequest.getTargetLanguageCodesList());
    Assert.assertEquals(request.getModelsMap(), actualRequest.getModelsMap());
    Assert.assertEquals(request.getInputConfigsList(), actualRequest.getInputConfigsList());
    Assert.assertEquals(request.getOutputConfig(), actualRequest.getOutputConfig());
    Assert.assertEquals(request.getGlossariesMap(), actualRequest.getGlossariesMap());
    Assert.assertEquals(request.getLabelsMap(), actualRequest.getLabelsMap());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchTranslateTextExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      BatchTranslateTextRequest request =
          BatchTranslateTextRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setSourceLanguageCode("sourceLanguageCode1645917472")
              .addAllTargetLanguageCodes(new ArrayList<String>())
              .putAllModels(new HashMap<String, String>())
              .addAllInputConfigs(new ArrayList<InputConfig>())
              .setOutputConfig(OutputConfig.newBuilder().build())
              .putAllGlossaries(new HashMap<String, TranslateTextGlossaryConfig>())
              .putAllLabels(new HashMap<String, String>())
              .build();
      client.batchTranslateTextAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchTranslateDocumentTest() throws Exception {
    BatchTranslateDocumentResponse expectedResponse =
        BatchTranslateDocumentResponse.newBuilder()
            .setTotalPages(-396186871)
            .setTranslatedPages(-1652747493)
            .setFailedPages(-2002254526)
            .setTotalBillablePages(1292117569)
            .setTotalCharacters(-1368640955)
            .setTranslatedCharacters(-1337326221)
            .setFailedCharacters(1723028396)
            .setTotalBillableCharacters(1242495501)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchTranslateDocumentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    String sourceLanguageCode = "sourceLanguageCode1645917472";
    List<String> targetLanguageCodes = new ArrayList<>();
    List<BatchDocumentInputConfig> inputConfigs = new ArrayList<>();
    BatchDocumentOutputConfig outputConfig = BatchDocumentOutputConfig.newBuilder().build();

    BatchTranslateDocumentResponse actualResponse =
        client
            .batchTranslateDocumentAsync(
                parent, sourceLanguageCode, targetLanguageCodes, inputConfigs, outputConfig)
            .get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchTranslateDocumentRequest actualRequest =
        ((BatchTranslateDocumentRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(sourceLanguageCode, actualRequest.getSourceLanguageCode());
    Assert.assertEquals(targetLanguageCodes, actualRequest.getTargetLanguageCodesList());
    Assert.assertEquals(inputConfigs, actualRequest.getInputConfigsList());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchTranslateDocumentExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      String sourceLanguageCode = "sourceLanguageCode1645917472";
      List<String> targetLanguageCodes = new ArrayList<>();
      List<BatchDocumentInputConfig> inputConfigs = new ArrayList<>();
      BatchDocumentOutputConfig outputConfig = BatchDocumentOutputConfig.newBuilder().build();
      client
          .batchTranslateDocumentAsync(
              parent, sourceLanguageCode, targetLanguageCodes, inputConfigs, outputConfig)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void batchTranslateDocumentTest2() throws Exception {
    BatchTranslateDocumentResponse expectedResponse =
        BatchTranslateDocumentResponse.newBuilder()
            .setTotalPages(-396186871)
            .setTranslatedPages(-1652747493)
            .setFailedPages(-2002254526)
            .setTotalBillablePages(1292117569)
            .setTotalCharacters(-1368640955)
            .setTranslatedCharacters(-1337326221)
            .setFailedCharacters(1723028396)
            .setTotalBillableCharacters(1242495501)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("batchTranslateDocumentTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    String parent = "parent-995424086";
    String sourceLanguageCode = "sourceLanguageCode1645917472";
    List<String> targetLanguageCodes = new ArrayList<>();
    List<BatchDocumentInputConfig> inputConfigs = new ArrayList<>();
    BatchDocumentOutputConfig outputConfig = BatchDocumentOutputConfig.newBuilder().build();

    BatchTranslateDocumentResponse actualResponse =
        client
            .batchTranslateDocumentAsync(
                parent, sourceLanguageCode, targetLanguageCodes, inputConfigs, outputConfig)
            .get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    BatchTranslateDocumentRequest actualRequest =
        ((BatchTranslateDocumentRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(sourceLanguageCode, actualRequest.getSourceLanguageCode());
    Assert.assertEquals(targetLanguageCodes, actualRequest.getTargetLanguageCodesList());
    Assert.assertEquals(inputConfigs, actualRequest.getInputConfigsList());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void batchTranslateDocumentExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      String sourceLanguageCode = "sourceLanguageCode1645917472";
      List<String> targetLanguageCodes = new ArrayList<>();
      List<BatchDocumentInputConfig> inputConfigs = new ArrayList<>();
      BatchDocumentOutputConfig outputConfig = BatchDocumentOutputConfig.newBuilder().build();
      client
          .batchTranslateDocumentAsync(
              parent, sourceLanguageCode, targetLanguageCodes, inputConfigs, outputConfig)
          .get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createGlossaryTest() throws Exception {
    Glossary expectedResponse =
        Glossary.newBuilder()
            .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
            .setInputConfig(GlossaryInputConfig.newBuilder().build())
            .setEntryCount(-811131134)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createGlossaryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Glossary glossary = Glossary.newBuilder().build();

    Glossary actualResponse = client.createGlossaryAsync(parent, glossary).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGlossaryRequest actualRequest = ((CreateGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(glossary, actualRequest.getGlossary());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGlossaryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Glossary glossary = Glossary.newBuilder().build();
      client.createGlossaryAsync(parent, glossary).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createGlossaryTest2() throws Exception {
    Glossary expectedResponse =
        Glossary.newBuilder()
            .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
            .setInputConfig(GlossaryInputConfig.newBuilder().build())
            .setEntryCount(-811131134)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createGlossaryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    String parent = "parent-995424086";
    Glossary glossary = Glossary.newBuilder().build();

    Glossary actualResponse = client.createGlossaryAsync(parent, glossary).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGlossaryRequest actualRequest = ((CreateGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(glossary, actualRequest.getGlossary());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGlossaryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      Glossary glossary = Glossary.newBuilder().build();
      client.createGlossaryAsync(parent, glossary).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void updateGlossaryTest() throws Exception {
    Glossary expectedResponse =
        Glossary.newBuilder()
            .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
            .setInputConfig(GlossaryInputConfig.newBuilder().build())
            .setEntryCount(-811131134)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateGlossaryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    Glossary glossary = Glossary.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Glossary actualResponse = client.updateGlossaryAsync(glossary, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateGlossaryRequest actualRequest = ((UpdateGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(glossary, actualRequest.getGlossary());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateGlossaryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      Glossary glossary = Glossary.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateGlossaryAsync(glossary, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listGlossariesTest() throws Exception {
    Glossary responsesElement = Glossary.newBuilder().build();
    ListGlossariesResponse expectedResponse =
        ListGlossariesResponse.newBuilder()
            .setNextPageToken("")
            .addAllGlossaries(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListGlossariesPagedResponse pagedListResponse = client.listGlossaries(parent);

    List<Glossary> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGlossariesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGlossariesRequest actualRequest = ((ListGlossariesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGlossariesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listGlossaries(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGlossariesTest2() throws Exception {
    Glossary responsesElement = Glossary.newBuilder().build();
    ListGlossariesResponse expectedResponse =
        ListGlossariesResponse.newBuilder()
            .setNextPageToken("")
            .addAllGlossaries(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListGlossariesPagedResponse pagedListResponse = client.listGlossaries(parent);

    List<Glossary> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGlossariesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGlossariesRequest actualRequest = ((ListGlossariesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGlossariesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listGlossaries(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGlossaryTest() throws Exception {
    Glossary expectedResponse =
        Glossary.newBuilder()
            .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
            .setInputConfig(GlossaryInputConfig.newBuilder().build())
            .setEntryCount(-811131134)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryName name = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");

    Glossary actualResponse = client.getGlossary(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlossaryRequest actualRequest = ((GetGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlossaryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryName name = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");
      client.getGlossary(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGlossaryTest2() throws Exception {
    Glossary expectedResponse =
        Glossary.newBuilder()
            .setName(GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]").toString())
            .setInputConfig(GlossaryInputConfig.newBuilder().build())
            .setEntryCount(-811131134)
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setDisplayName("displayName1714148973")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    Glossary actualResponse = client.getGlossary(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlossaryRequest actualRequest = ((GetGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlossaryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.getGlossary(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteGlossaryTest() throws Exception {
    DeleteGlossaryResponse expectedResponse =
        DeleteGlossaryResponse.newBuilder()
            .setName("name3373707")
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteGlossaryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    GlossaryName name = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");

    DeleteGlossaryResponse actualResponse = client.deleteGlossaryAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGlossaryRequest actualRequest = ((DeleteGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGlossaryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryName name = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");
      client.deleteGlossaryAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteGlossaryTest2() throws Exception {
    DeleteGlossaryResponse expectedResponse =
        DeleteGlossaryResponse.newBuilder()
            .setName("name3373707")
            .setSubmitTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteGlossaryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    String name = "name3373707";

    DeleteGlossaryResponse actualResponse = client.deleteGlossaryAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGlossaryRequest actualRequest = ((DeleteGlossaryRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGlossaryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteGlossaryAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getGlossaryEntryTest() throws Exception {
    GlossaryEntry expectedResponse =
        GlossaryEntry.newBuilder()
            .setName(
                GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]")
                    .toString())
            .setDescription("description-1724546052")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryEntryName name =
        GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]");

    GlossaryEntry actualResponse = client.getGlossaryEntry(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlossaryEntryRequest actualRequest = ((GetGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlossaryEntryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryEntryName name =
          GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]");
      client.getGlossaryEntry(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getGlossaryEntryTest2() throws Exception {
    GlossaryEntry expectedResponse =
        GlossaryEntry.newBuilder()
            .setName(
                GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]")
                    .toString())
            .setDescription("description-1724546052")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    GlossaryEntry actualResponse = client.getGlossaryEntry(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetGlossaryEntryRequest actualRequest = ((GetGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getGlossaryEntryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.getGlossaryEntry(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGlossaryEntriesTest() throws Exception {
    GlossaryEntry responsesElement = GlossaryEntry.newBuilder().build();
    ListGlossaryEntriesResponse expectedResponse =
        ListGlossaryEntriesResponse.newBuilder()
            .setNextPageToken("")
            .addAllGlossaryEntries(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryName parent = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");

    ListGlossaryEntriesPagedResponse pagedListResponse = client.listGlossaryEntries(parent);

    List<GlossaryEntry> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGlossaryEntriesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGlossaryEntriesRequest actualRequest = ((ListGlossaryEntriesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGlossaryEntriesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryName parent = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");
      client.listGlossaryEntries(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listGlossaryEntriesTest2() throws Exception {
    GlossaryEntry responsesElement = GlossaryEntry.newBuilder().build();
    ListGlossaryEntriesResponse expectedResponse =
        ListGlossaryEntriesResponse.newBuilder()
            .setNextPageToken("")
            .addAllGlossaryEntries(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListGlossaryEntriesPagedResponse pagedListResponse = client.listGlossaryEntries(parent);

    List<GlossaryEntry> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getGlossaryEntriesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListGlossaryEntriesRequest actualRequest = ((ListGlossaryEntriesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listGlossaryEntriesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listGlossaryEntries(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createGlossaryEntryTest() throws Exception {
    GlossaryEntry expectedResponse =
        GlossaryEntry.newBuilder()
            .setName(
                GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]")
                    .toString())
            .setDescription("description-1724546052")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryName parent = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");
    GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();

    GlossaryEntry actualResponse = client.createGlossaryEntry(parent, glossaryEntry);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGlossaryEntryRequest actualRequest = ((CreateGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(glossaryEntry, actualRequest.getGlossaryEntry());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGlossaryEntryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryName parent = GlossaryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]");
      GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();
      client.createGlossaryEntry(parent, glossaryEntry);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createGlossaryEntryTest2() throws Exception {
    GlossaryEntry expectedResponse =
        GlossaryEntry.newBuilder()
            .setName(
                GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]")
                    .toString())
            .setDescription("description-1724546052")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();

    GlossaryEntry actualResponse = client.createGlossaryEntry(parent, glossaryEntry);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateGlossaryEntryRequest actualRequest = ((CreateGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(glossaryEntry, actualRequest.getGlossaryEntry());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createGlossaryEntryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();
      client.createGlossaryEntry(parent, glossaryEntry);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateGlossaryEntryTest() throws Exception {
    GlossaryEntry expectedResponse =
        GlossaryEntry.newBuilder()
            .setName(
                GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]")
                    .toString())
            .setDescription("description-1724546052")
            .build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();

    GlossaryEntry actualResponse = client.updateGlossaryEntry(glossaryEntry);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateGlossaryEntryRequest actualRequest = ((UpdateGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(glossaryEntry, actualRequest.getGlossaryEntry());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateGlossaryEntryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryEntry glossaryEntry = GlossaryEntry.newBuilder().build();
      client.updateGlossaryEntry(glossaryEntry);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteGlossaryEntryTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    GlossaryEntryName name =
        GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]");

    client.deleteGlossaryEntry(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGlossaryEntryRequest actualRequest = ((DeleteGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGlossaryEntryExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      GlossaryEntryName name =
          GlossaryEntryName.of("[PROJECT]", "[LOCATION]", "[GLOSSARY]", "[GLOSSARY_ENTRY]");
      client.deleteGlossaryEntry(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteGlossaryEntryTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteGlossaryEntry(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteGlossaryEntryRequest actualRequest = ((DeleteGlossaryEntryRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteGlossaryEntryExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteGlossaryEntry(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDatasetAsync(parent, dataset).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDatasetRequest actualRequest = ((CreateDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Dataset dataset = Dataset.newBuilder().build();
      client.createDatasetAsync(parent, dataset).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createDatasetTest2() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createDatasetTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    String parent = "parent-995424086";
    Dataset dataset = Dataset.newBuilder().build();

    Dataset actualResponse = client.createDatasetAsync(parent, dataset).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDatasetRequest actualRequest = ((CreateDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      Dataset dataset = Dataset.newBuilder().build();
      client.createDatasetAsync(parent, dataset).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getDatasetTest() throws Exception {
    Dataset expectedResponse =
        Dataset.newBuilder()
            .setName(DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    Dataset actualResponse = client.getDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDatasetRequest actualRequest = ((GetDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

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
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    Dataset actualResponse = client.getDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDatasetRequest actualRequest = ((GetDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
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
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDatasetsRequest actualRequest = ((ListDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDatasetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

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
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListDatasetsPagedResponse pagedListResponse = client.listDatasets(parent);

    List<Dataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDatasetsRequest actualRequest = ((ListDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDatasetsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listDatasets(parent);
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
    mockTranslationService.addResponse(resultOperation);

    DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    client.deleteDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDatasetRequest actualRequest = ((DeleteDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      DatasetName name = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
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
    mockTranslationService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteDatasetAsync(name).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDatasetRequest actualRequest = ((DeleteDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteDatasetAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createAdaptiveMtDatasetTest() throws Exception {
    AdaptiveMtDataset expectedResponse =
        AdaptiveMtDataset.newBuilder()
            .setName(AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    AdaptiveMtDataset adaptiveMtDataset = AdaptiveMtDataset.newBuilder().build();

    AdaptiveMtDataset actualResponse = client.createAdaptiveMtDataset(parent, adaptiveMtDataset);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAdaptiveMtDatasetRequest actualRequest =
        ((CreateAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(adaptiveMtDataset, actualRequest.getAdaptiveMtDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAdaptiveMtDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      AdaptiveMtDataset adaptiveMtDataset = AdaptiveMtDataset.newBuilder().build();
      client.createAdaptiveMtDataset(parent, adaptiveMtDataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createAdaptiveMtDatasetTest2() throws Exception {
    AdaptiveMtDataset expectedResponse =
        AdaptiveMtDataset.newBuilder()
            .setName(AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    AdaptiveMtDataset adaptiveMtDataset = AdaptiveMtDataset.newBuilder().build();

    AdaptiveMtDataset actualResponse = client.createAdaptiveMtDataset(parent, adaptiveMtDataset);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAdaptiveMtDatasetRequest actualRequest =
        ((CreateAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(adaptiveMtDataset, actualRequest.getAdaptiveMtDataset());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAdaptiveMtDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      AdaptiveMtDataset adaptiveMtDataset = AdaptiveMtDataset.newBuilder().build();
      client.createAdaptiveMtDataset(parent, adaptiveMtDataset);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdaptiveMtDatasetTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtDatasetName name = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    client.deleteAdaptiveMtDataset(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdaptiveMtDatasetRequest actualRequest =
        ((DeleteAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdaptiveMtDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtDatasetName name = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.deleteAdaptiveMtDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdaptiveMtDatasetTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAdaptiveMtDataset(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdaptiveMtDatasetRequest actualRequest =
        ((DeleteAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdaptiveMtDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAdaptiveMtDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdaptiveMtDatasetTest() throws Exception {
    AdaptiveMtDataset expectedResponse =
        AdaptiveMtDataset.newBuilder()
            .setName(AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtDatasetName name = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    AdaptiveMtDataset actualResponse = client.getAdaptiveMtDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdaptiveMtDatasetRequest actualRequest =
        ((GetAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdaptiveMtDatasetExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtDatasetName name = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.getAdaptiveMtDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdaptiveMtDatasetTest2() throws Exception {
    AdaptiveMtDataset expectedResponse =
        AdaptiveMtDataset.newBuilder()
            .setName(AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]").toString())
            .setDisplayName("displayName1714148973")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setExampleCount(1517063674)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    AdaptiveMtDataset actualResponse = client.getAdaptiveMtDataset(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdaptiveMtDatasetRequest actualRequest =
        ((GetAdaptiveMtDatasetRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdaptiveMtDatasetExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.getAdaptiveMtDataset(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtDatasetsTest() throws Exception {
    AdaptiveMtDataset responsesElement = AdaptiveMtDataset.newBuilder().build();
    ListAdaptiveMtDatasetsResponse expectedResponse =
        ListAdaptiveMtDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtDatasets(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListAdaptiveMtDatasetsPagedResponse pagedListResponse = client.listAdaptiveMtDatasets(parent);

    List<AdaptiveMtDataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtDatasetsRequest actualRequest =
        ((ListAdaptiveMtDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtDatasetsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listAdaptiveMtDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtDatasetsTest2() throws Exception {
    AdaptiveMtDataset responsesElement = AdaptiveMtDataset.newBuilder().build();
    ListAdaptiveMtDatasetsResponse expectedResponse =
        ListAdaptiveMtDatasetsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtDatasets(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAdaptiveMtDatasetsPagedResponse pagedListResponse = client.listAdaptiveMtDatasets(parent);

    List<AdaptiveMtDataset> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtDatasetsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtDatasetsRequest actualRequest =
        ((ListAdaptiveMtDatasetsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtDatasetsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAdaptiveMtDatasets(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void adaptiveMtTranslateTest() throws Exception {
    AdaptiveMtTranslateResponse expectedResponse =
        AdaptiveMtTranslateResponse.newBuilder()
            .addAllTranslations(new ArrayList<AdaptiveMtTranslation>())
            .setLanguageCode("languageCode-2092349083")
            .addAllGlossaryTranslations(new ArrayList<AdaptiveMtTranslation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    List<String> content = new ArrayList<>();

    AdaptiveMtTranslateResponse actualResponse = client.adaptiveMtTranslate(parent, content);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AdaptiveMtTranslateRequest actualRequest = ((AdaptiveMtTranslateRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(content, actualRequest.getContentList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void adaptiveMtTranslateExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      List<String> content = new ArrayList<>();
      client.adaptiveMtTranslate(parent, content);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void adaptiveMtTranslateTest2() throws Exception {
    AdaptiveMtTranslateResponse expectedResponse =
        AdaptiveMtTranslateResponse.newBuilder()
            .addAllTranslations(new ArrayList<AdaptiveMtTranslation>())
            .setLanguageCode("languageCode-2092349083")
            .addAllGlossaryTranslations(new ArrayList<AdaptiveMtTranslation>())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";
    List<String> content = new ArrayList<>();

    AdaptiveMtTranslateResponse actualResponse = client.adaptiveMtTranslate(parent, content);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    AdaptiveMtTranslateRequest actualRequest = ((AdaptiveMtTranslateRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(content, actualRequest.getContentList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void adaptiveMtTranslateExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      List<String> content = new ArrayList<>();
      client.adaptiveMtTranslate(parent, content);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdaptiveMtFileTest() throws Exception {
    AdaptiveMtFile expectedResponse =
        AdaptiveMtFile.newBuilder()
            .setName(
                AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]").toString())
            .setDisplayName("displayName1714148973")
            .setEntryCount(-811131134)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtFileName name =
        AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");

    AdaptiveMtFile actualResponse = client.getAdaptiveMtFile(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdaptiveMtFileRequest actualRequest = ((GetAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdaptiveMtFileExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtFileName name =
          AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");
      client.getAdaptiveMtFile(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAdaptiveMtFileTest2() throws Exception {
    AdaptiveMtFile expectedResponse =
        AdaptiveMtFile.newBuilder()
            .setName(
                AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]").toString())
            .setDisplayName("displayName1714148973")
            .setEntryCount(-811131134)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    AdaptiveMtFile actualResponse = client.getAdaptiveMtFile(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAdaptiveMtFileRequest actualRequest = ((GetAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAdaptiveMtFileExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.getAdaptiveMtFile(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdaptiveMtFileTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtFileName name =
        AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");

    client.deleteAdaptiveMtFile(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdaptiveMtFileRequest actualRequest =
        ((DeleteAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdaptiveMtFileExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtFileName name =
          AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");
      client.deleteAdaptiveMtFile(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAdaptiveMtFileTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAdaptiveMtFile(name);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAdaptiveMtFileRequest actualRequest =
        ((DeleteAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAdaptiveMtFileExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAdaptiveMtFile(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void importAdaptiveMtFileTest() throws Exception {
    ImportAdaptiveMtFileResponse expectedResponse =
        ImportAdaptiveMtFileResponse.newBuilder()
            .setAdaptiveMtFile(AdaptiveMtFile.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtDatasetName parent = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    ImportAdaptiveMtFileResponse actualResponse = client.importAdaptiveMtFile(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportAdaptiveMtFileRequest actualRequest =
        ((ImportAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importAdaptiveMtFileExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtDatasetName parent =
          AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.importAdaptiveMtFile(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void importAdaptiveMtFileTest2() throws Exception {
    ImportAdaptiveMtFileResponse expectedResponse =
        ImportAdaptiveMtFileResponse.newBuilder()
            .setAdaptiveMtFile(AdaptiveMtFile.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ImportAdaptiveMtFileResponse actualResponse = client.importAdaptiveMtFile(parent);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportAdaptiveMtFileRequest actualRequest =
        ((ImportAdaptiveMtFileRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importAdaptiveMtFileExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.importAdaptiveMtFile(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtFilesTest() throws Exception {
    AdaptiveMtFile responsesElement = AdaptiveMtFile.newBuilder().build();
    ListAdaptiveMtFilesResponse expectedResponse =
        ListAdaptiveMtFilesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtFiles(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtDatasetName parent = AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    ListAdaptiveMtFilesPagedResponse pagedListResponse = client.listAdaptiveMtFiles(parent);

    List<AdaptiveMtFile> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtFilesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtFilesRequest actualRequest = ((ListAdaptiveMtFilesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtFilesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtDatasetName parent =
          AdaptiveMtDatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.listAdaptiveMtFiles(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtFilesTest2() throws Exception {
    AdaptiveMtFile responsesElement = AdaptiveMtFile.newBuilder().build();
    ListAdaptiveMtFilesResponse expectedResponse =
        ListAdaptiveMtFilesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtFiles(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAdaptiveMtFilesPagedResponse pagedListResponse = client.listAdaptiveMtFiles(parent);

    List<AdaptiveMtFile> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtFilesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtFilesRequest actualRequest = ((ListAdaptiveMtFilesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtFilesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAdaptiveMtFiles(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtSentencesTest() throws Exception {
    AdaptiveMtSentence responsesElement = AdaptiveMtSentence.newBuilder().build();
    ListAdaptiveMtSentencesResponse expectedResponse =
        ListAdaptiveMtSentencesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtSentences(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    AdaptiveMtFileName parent =
        AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");

    ListAdaptiveMtSentencesPagedResponse pagedListResponse = client.listAdaptiveMtSentences(parent);

    List<AdaptiveMtSentence> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtSentencesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtSentencesRequest actualRequest =
        ((ListAdaptiveMtSentencesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtSentencesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      AdaptiveMtFileName parent =
          AdaptiveMtFileName.of("[PROJECT]", "[LOCATION]", "[DATASET]", "[FILE]");
      client.listAdaptiveMtSentences(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAdaptiveMtSentencesTest2() throws Exception {
    AdaptiveMtSentence responsesElement = AdaptiveMtSentence.newBuilder().build();
    ListAdaptiveMtSentencesResponse expectedResponse =
        ListAdaptiveMtSentencesResponse.newBuilder()
            .setNextPageToken("")
            .addAllAdaptiveMtSentences(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAdaptiveMtSentencesPagedResponse pagedListResponse = client.listAdaptiveMtSentences(parent);

    List<AdaptiveMtSentence> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAdaptiveMtSentencesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAdaptiveMtSentencesRequest actualRequest =
        ((ListAdaptiveMtSentencesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAdaptiveMtSentencesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAdaptiveMtSentences(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
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
    mockTranslationService.addResponse(resultOperation);

    String dataset = "dataset1443214456";
    DatasetInputConfig inputConfig = DatasetInputConfig.newBuilder().build();

    client.importDataAsync(dataset, inputConfig).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ImportDataRequest actualRequest = ((ImportDataRequest) actualRequests.get(0));

    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertEquals(inputConfig, actualRequest.getInputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void importDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String dataset = "dataset1443214456";
      DatasetInputConfig inputConfig = DatasetInputConfig.newBuilder().build();
      client.importDataAsync(dataset, inputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
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
    mockTranslationService.addResponse(resultOperation);

    String dataset = "dataset1443214456";
    DatasetOutputConfig outputConfig = DatasetOutputConfig.newBuilder().build();

    client.exportDataAsync(dataset, outputConfig).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ExportDataRequest actualRequest = ((ExportDataRequest) actualRequests.get(0));

    Assert.assertEquals(dataset, actualRequest.getDataset());
    Assert.assertEquals(outputConfig, actualRequest.getOutputConfig());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void exportDataExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String dataset = "dataset1443214456";
      DatasetOutputConfig outputConfig = DatasetOutputConfig.newBuilder().build();
      client.exportDataAsync(dataset, outputConfig).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listExamplesTest() throws Exception {
    Example responsesElement = Example.newBuilder().build();
    ListExamplesResponse expectedResponse =
        ListExamplesResponse.newBuilder()
            .setNextPageToken("")
            .addAllExamples(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");

    ListExamplesPagedResponse pagedListResponse = client.listExamples(parent);

    List<Example> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExamplesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExamplesRequest actualRequest = ((ListExamplesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExamplesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      DatasetName parent = DatasetName.of("[PROJECT]", "[LOCATION]", "[DATASET]");
      client.listExamples(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listExamplesTest2() throws Exception {
    Example responsesElement = Example.newBuilder().build();
    ListExamplesResponse expectedResponse =
        ListExamplesResponse.newBuilder()
            .setNextPageToken("")
            .addAllExamples(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListExamplesPagedResponse pagedListResponse = client.listExamples(parent);

    List<Example> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getExamplesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListExamplesRequest actualRequest = ((ListExamplesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listExamplesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listExamples(parent);
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
            .setDataset("dataset1443214456")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateModelRequest actualRequest = ((CreateModelRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createModelTest2() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDataset("dataset1443214456")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createModelTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockTranslationService.addResponse(resultOperation);

    String parent = "parent-995424086";
    Model model = Model.newBuilder().build();

    Model actualResponse = client.createModelAsync(parent, model).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateModelRequest actualRequest = ((CreateModelRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(model, actualRequest.getModel());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      Model model = Model.newBuilder().build();
      client.createModelAsync(parent, model).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listModelsTest() throws Exception {
    Model responsesElement = Model.newBuilder().build();
    ListModelsResponse expectedResponse =
        ListModelsResponse.newBuilder()
            .setNextPageToken("")
            .addAllModels(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelsRequest actualRequest = ((ListModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

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
            .addAllModels(Arrays.asList(responsesElement))
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListModelsPagedResponse pagedListResponse = client.listModels(parent);

    List<Model> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getModelsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListModelsRequest actualRequest = ((ListModelsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listModelsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listModels(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getModelTest() throws Exception {
    Model expectedResponse =
        Model.newBuilder()
            .setName(ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]").toString())
            .setDisplayName("displayName1714148973")
            .setDataset("dataset1443214456")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    Model actualResponse = client.getModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelRequest actualRequest = ((GetModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

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
            .setDataset("dataset1443214456")
            .setSourceLanguageCode("sourceLanguageCode1645917472")
            .setTargetLanguageCode("targetLanguageCode-106414698")
            .setTrainExampleCount(-1755438077)
            .setValidateExampleCount(159308433)
            .setTestExampleCount(483147021)
            .setCreateTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .build();
    mockTranslationService.addResponse(expectedResponse);

    String name = "name3373707";

    Model actualResponse = client.getModel(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetModelRequest actualRequest = ((GetModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.getModel(name);
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
    mockTranslationService.addResponse(resultOperation);

    ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");

    client.deleteModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteModelRequest actualRequest = ((DeleteModelRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteModelExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      ModelName name = ModelName.of("[PROJECT]", "[LOCATION]", "[MODEL]");
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
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
    mockTranslationService.addResponse(resultOperation);

    String name = "name3373707";

    client.deleteModelAsync(name).get();

    List<AbstractMessage> actualRequests = mockTranslationService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteModelRequest actualRequest = ((DeleteModelRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteModelExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockTranslationService.addException(exception);

    try {
      String name = "name3373707";
      client.deleteModelAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }
}
