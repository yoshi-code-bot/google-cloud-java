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

package com.google.cloud.translate.v3.stub;

import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtDatasetsPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtFilesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListAdaptiveMtSentencesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListDatasetsPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListExamplesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListGlossariesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListGlossaryEntriesPagedResponse;
import static com.google.cloud.translate.v3.TranslationServiceClient.ListModelsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.translate.v3.AdaptiveMtDataset;
import com.google.cloud.translate.v3.AdaptiveMtFile;
import com.google.cloud.translate.v3.AdaptiveMtTranslateRequest;
import com.google.cloud.translate.v3.AdaptiveMtTranslateResponse;
import com.google.cloud.translate.v3.BatchTranslateDocumentMetadata;
import com.google.cloud.translate.v3.BatchTranslateDocumentRequest;
import com.google.cloud.translate.v3.BatchTranslateDocumentResponse;
import com.google.cloud.translate.v3.BatchTranslateMetadata;
import com.google.cloud.translate.v3.BatchTranslateResponse;
import com.google.cloud.translate.v3.BatchTranslateTextRequest;
import com.google.cloud.translate.v3.CreateAdaptiveMtDatasetRequest;
import com.google.cloud.translate.v3.CreateDatasetMetadata;
import com.google.cloud.translate.v3.CreateDatasetRequest;
import com.google.cloud.translate.v3.CreateGlossaryEntryRequest;
import com.google.cloud.translate.v3.CreateGlossaryMetadata;
import com.google.cloud.translate.v3.CreateGlossaryRequest;
import com.google.cloud.translate.v3.CreateModelMetadata;
import com.google.cloud.translate.v3.CreateModelRequest;
import com.google.cloud.translate.v3.Dataset;
import com.google.cloud.translate.v3.DeleteAdaptiveMtDatasetRequest;
import com.google.cloud.translate.v3.DeleteAdaptiveMtFileRequest;
import com.google.cloud.translate.v3.DeleteDatasetMetadata;
import com.google.cloud.translate.v3.DeleteDatasetRequest;
import com.google.cloud.translate.v3.DeleteGlossaryEntryRequest;
import com.google.cloud.translate.v3.DeleteGlossaryMetadata;
import com.google.cloud.translate.v3.DeleteGlossaryRequest;
import com.google.cloud.translate.v3.DeleteGlossaryResponse;
import com.google.cloud.translate.v3.DeleteModelMetadata;
import com.google.cloud.translate.v3.DeleteModelRequest;
import com.google.cloud.translate.v3.DetectLanguageRequest;
import com.google.cloud.translate.v3.DetectLanguageResponse;
import com.google.cloud.translate.v3.ExportDataMetadata;
import com.google.cloud.translate.v3.ExportDataRequest;
import com.google.cloud.translate.v3.GetAdaptiveMtDatasetRequest;
import com.google.cloud.translate.v3.GetAdaptiveMtFileRequest;
import com.google.cloud.translate.v3.GetDatasetRequest;
import com.google.cloud.translate.v3.GetGlossaryEntryRequest;
import com.google.cloud.translate.v3.GetGlossaryRequest;
import com.google.cloud.translate.v3.GetModelRequest;
import com.google.cloud.translate.v3.GetSupportedLanguagesRequest;
import com.google.cloud.translate.v3.Glossary;
import com.google.cloud.translate.v3.GlossaryEntry;
import com.google.cloud.translate.v3.ImportAdaptiveMtFileRequest;
import com.google.cloud.translate.v3.ImportAdaptiveMtFileResponse;
import com.google.cloud.translate.v3.ImportDataMetadata;
import com.google.cloud.translate.v3.ImportDataRequest;
import com.google.cloud.translate.v3.ListAdaptiveMtDatasetsRequest;
import com.google.cloud.translate.v3.ListAdaptiveMtDatasetsResponse;
import com.google.cloud.translate.v3.ListAdaptiveMtFilesRequest;
import com.google.cloud.translate.v3.ListAdaptiveMtFilesResponse;
import com.google.cloud.translate.v3.ListAdaptiveMtSentencesRequest;
import com.google.cloud.translate.v3.ListAdaptiveMtSentencesResponse;
import com.google.cloud.translate.v3.ListDatasetsRequest;
import com.google.cloud.translate.v3.ListDatasetsResponse;
import com.google.cloud.translate.v3.ListExamplesRequest;
import com.google.cloud.translate.v3.ListExamplesResponse;
import com.google.cloud.translate.v3.ListGlossariesRequest;
import com.google.cloud.translate.v3.ListGlossariesResponse;
import com.google.cloud.translate.v3.ListGlossaryEntriesRequest;
import com.google.cloud.translate.v3.ListGlossaryEntriesResponse;
import com.google.cloud.translate.v3.ListModelsRequest;
import com.google.cloud.translate.v3.ListModelsResponse;
import com.google.cloud.translate.v3.Model;
import com.google.cloud.translate.v3.RomanizeTextRequest;
import com.google.cloud.translate.v3.RomanizeTextResponse;
import com.google.cloud.translate.v3.SupportedLanguages;
import com.google.cloud.translate.v3.TranslateDocumentRequest;
import com.google.cloud.translate.v3.TranslateDocumentResponse;
import com.google.cloud.translate.v3.TranslateTextRequest;
import com.google.cloud.translate.v3.TranslateTextResponse;
import com.google.cloud.translate.v3.UpdateGlossaryEntryRequest;
import com.google.cloud.translate.v3.UpdateGlossaryMetadata;
import com.google.cloud.translate.v3.UpdateGlossaryRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the TranslationService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class TranslationServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<TranslateTextRequest, TranslateTextResponse> translateTextCallable() {
    throw new UnsupportedOperationException("Not implemented: translateTextCallable()");
  }

  public UnaryCallable<RomanizeTextRequest, RomanizeTextResponse> romanizeTextCallable() {
    throw new UnsupportedOperationException("Not implemented: romanizeTextCallable()");
  }

  public UnaryCallable<DetectLanguageRequest, DetectLanguageResponse> detectLanguageCallable() {
    throw new UnsupportedOperationException("Not implemented: detectLanguageCallable()");
  }

  public UnaryCallable<GetSupportedLanguagesRequest, SupportedLanguages>
      getSupportedLanguagesCallable() {
    throw new UnsupportedOperationException("Not implemented: getSupportedLanguagesCallable()");
  }

  public UnaryCallable<TranslateDocumentRequest, TranslateDocumentResponse>
      translateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: translateDocumentCallable()");
  }

  public OperationCallable<
          BatchTranslateTextRequest, BatchTranslateResponse, BatchTranslateMetadata>
      batchTranslateTextOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchTranslateTextOperationCallable()");
  }

  public UnaryCallable<BatchTranslateTextRequest, Operation> batchTranslateTextCallable() {
    throw new UnsupportedOperationException("Not implemented: batchTranslateTextCallable()");
  }

  public OperationCallable<
          BatchTranslateDocumentRequest,
          BatchTranslateDocumentResponse,
          BatchTranslateDocumentMetadata>
      batchTranslateDocumentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: batchTranslateDocumentOperationCallable()");
  }

  public UnaryCallable<BatchTranslateDocumentRequest, Operation> batchTranslateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: batchTranslateDocumentCallable()");
  }

  public OperationCallable<CreateGlossaryRequest, Glossary, CreateGlossaryMetadata>
      createGlossaryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createGlossaryOperationCallable()");
  }

  public UnaryCallable<CreateGlossaryRequest, Operation> createGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: createGlossaryCallable()");
  }

  public OperationCallable<UpdateGlossaryRequest, Glossary, UpdateGlossaryMetadata>
      updateGlossaryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateGlossaryOperationCallable()");
  }

  public UnaryCallable<UpdateGlossaryRequest, Operation> updateGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateGlossaryCallable()");
  }

  public UnaryCallable<ListGlossariesRequest, ListGlossariesPagedResponse>
      listGlossariesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossariesPagedCallable()");
  }

  public UnaryCallable<ListGlossariesRequest, ListGlossariesResponse> listGlossariesCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossariesCallable()");
  }

  public UnaryCallable<GetGlossaryRequest, Glossary> getGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: getGlossaryCallable()");
  }

  public OperationCallable<DeleteGlossaryRequest, DeleteGlossaryResponse, DeleteGlossaryMetadata>
      deleteGlossaryOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlossaryOperationCallable()");
  }

  public UnaryCallable<DeleteGlossaryRequest, Operation> deleteGlossaryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlossaryCallable()");
  }

  public UnaryCallable<GetGlossaryEntryRequest, GlossaryEntry> getGlossaryEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: getGlossaryEntryCallable()");
  }

  public UnaryCallable<ListGlossaryEntriesRequest, ListGlossaryEntriesPagedResponse>
      listGlossaryEntriesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossaryEntriesPagedCallable()");
  }

  public UnaryCallable<ListGlossaryEntriesRequest, ListGlossaryEntriesResponse>
      listGlossaryEntriesCallable() {
    throw new UnsupportedOperationException("Not implemented: listGlossaryEntriesCallable()");
  }

  public UnaryCallable<CreateGlossaryEntryRequest, GlossaryEntry> createGlossaryEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: createGlossaryEntryCallable()");
  }

  public UnaryCallable<UpdateGlossaryEntryRequest, GlossaryEntry> updateGlossaryEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: updateGlossaryEntryCallable()");
  }

  public UnaryCallable<DeleteGlossaryEntryRequest, Empty> deleteGlossaryEntryCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteGlossaryEntryCallable()");
  }

  public OperationCallable<CreateDatasetRequest, Dataset, CreateDatasetMetadata>
      createDatasetOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createDatasetOperationCallable()");
  }

  public UnaryCallable<CreateDatasetRequest, Operation> createDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: createDatasetCallable()");
  }

  public UnaryCallable<GetDatasetRequest, Dataset> getDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: getDatasetCallable()");
  }

  public UnaryCallable<ListDatasetsRequest, ListDatasetsPagedResponse> listDatasetsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDatasetsPagedCallable()");
  }

  public UnaryCallable<ListDatasetsRequest, ListDatasetsResponse> listDatasetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDatasetsCallable()");
  }

  public OperationCallable<DeleteDatasetRequest, Empty, DeleteDatasetMetadata>
      deleteDatasetOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDatasetOperationCallable()");
  }

  public UnaryCallable<DeleteDatasetRequest, Operation> deleteDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDatasetCallable()");
  }

  public UnaryCallable<CreateAdaptiveMtDatasetRequest, AdaptiveMtDataset>
      createAdaptiveMtDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: createAdaptiveMtDatasetCallable()");
  }

  public UnaryCallable<DeleteAdaptiveMtDatasetRequest, Empty> deleteAdaptiveMtDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAdaptiveMtDatasetCallable()");
  }

  public UnaryCallable<GetAdaptiveMtDatasetRequest, AdaptiveMtDataset>
      getAdaptiveMtDatasetCallable() {
    throw new UnsupportedOperationException("Not implemented: getAdaptiveMtDatasetCallable()");
  }

  public UnaryCallable<ListAdaptiveMtDatasetsRequest, ListAdaptiveMtDatasetsPagedResponse>
      listAdaptiveMtDatasetsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listAdaptiveMtDatasetsPagedCallable()");
  }

  public UnaryCallable<ListAdaptiveMtDatasetsRequest, ListAdaptiveMtDatasetsResponse>
      listAdaptiveMtDatasetsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAdaptiveMtDatasetsCallable()");
  }

  public UnaryCallable<AdaptiveMtTranslateRequest, AdaptiveMtTranslateResponse>
      adaptiveMtTranslateCallable() {
    throw new UnsupportedOperationException("Not implemented: adaptiveMtTranslateCallable()");
  }

  public UnaryCallable<GetAdaptiveMtFileRequest, AdaptiveMtFile> getAdaptiveMtFileCallable() {
    throw new UnsupportedOperationException("Not implemented: getAdaptiveMtFileCallable()");
  }

  public UnaryCallable<DeleteAdaptiveMtFileRequest, Empty> deleteAdaptiveMtFileCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAdaptiveMtFileCallable()");
  }

  public UnaryCallable<ImportAdaptiveMtFileRequest, ImportAdaptiveMtFileResponse>
      importAdaptiveMtFileCallable() {
    throw new UnsupportedOperationException("Not implemented: importAdaptiveMtFileCallable()");
  }

  public UnaryCallable<ListAdaptiveMtFilesRequest, ListAdaptiveMtFilesPagedResponse>
      listAdaptiveMtFilesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAdaptiveMtFilesPagedCallable()");
  }

  public UnaryCallable<ListAdaptiveMtFilesRequest, ListAdaptiveMtFilesResponse>
      listAdaptiveMtFilesCallable() {
    throw new UnsupportedOperationException("Not implemented: listAdaptiveMtFilesCallable()");
  }

  public UnaryCallable<ListAdaptiveMtSentencesRequest, ListAdaptiveMtSentencesPagedResponse>
      listAdaptiveMtSentencesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listAdaptiveMtSentencesPagedCallable()");
  }

  public UnaryCallable<ListAdaptiveMtSentencesRequest, ListAdaptiveMtSentencesResponse>
      listAdaptiveMtSentencesCallable() {
    throw new UnsupportedOperationException("Not implemented: listAdaptiveMtSentencesCallable()");
  }

  public OperationCallable<ImportDataRequest, Empty, ImportDataMetadata>
      importDataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importDataOperationCallable()");
  }

  public UnaryCallable<ImportDataRequest, Operation> importDataCallable() {
    throw new UnsupportedOperationException("Not implemented: importDataCallable()");
  }

  public OperationCallable<ExportDataRequest, Empty, ExportDataMetadata>
      exportDataOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDataOperationCallable()");
  }

  public UnaryCallable<ExportDataRequest, Operation> exportDataCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDataCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesPagedResponse> listExamplesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesPagedCallable()");
  }

  public UnaryCallable<ListExamplesRequest, ListExamplesResponse> listExamplesCallable() {
    throw new UnsupportedOperationException("Not implemented: listExamplesCallable()");
  }

  public OperationCallable<CreateModelRequest, Model, CreateModelMetadata>
      createModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createModelOperationCallable()");
  }

  public UnaryCallable<CreateModelRequest, Operation> createModelCallable() {
    throw new UnsupportedOperationException("Not implemented: createModelCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsPagedResponse> listModelsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsPagedCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsResponse> listModelsCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsCallable()");
  }

  public UnaryCallable<GetModelRequest, Model> getModelCallable() {
    throw new UnsupportedOperationException("Not implemented: getModelCallable()");
  }

  public OperationCallable<DeleteModelRequest, Empty, DeleteModelMetadata>
      deleteModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelOperationCallable()");
  }

  public UnaryCallable<DeleteModelRequest, Operation> deleteModelCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelCallable()");
  }

  @Override
  public abstract void close();
}
