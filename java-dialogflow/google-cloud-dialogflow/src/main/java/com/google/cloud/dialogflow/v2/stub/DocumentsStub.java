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

package com.google.cloud.dialogflow.v2.stub;

import static com.google.cloud.dialogflow.v2.DocumentsClient.ListDocumentsPagedResponse;
import static com.google.cloud.dialogflow.v2.DocumentsClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.v2.CreateDocumentRequest;
import com.google.cloud.dialogflow.v2.DeleteDocumentRequest;
import com.google.cloud.dialogflow.v2.Document;
import com.google.cloud.dialogflow.v2.ExportDocumentRequest;
import com.google.cloud.dialogflow.v2.GetDocumentRequest;
import com.google.cloud.dialogflow.v2.ImportDocumentsRequest;
import com.google.cloud.dialogflow.v2.ImportDocumentsResponse;
import com.google.cloud.dialogflow.v2.KnowledgeOperationMetadata;
import com.google.cloud.dialogflow.v2.ListDocumentsRequest;
import com.google.cloud.dialogflow.v2.ListDocumentsResponse;
import com.google.cloud.dialogflow.v2.ReloadDocumentRequest;
import com.google.cloud.dialogflow.v2.UpdateDocumentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Documents service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class DocumentsStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListDocumentsRequest, ListDocumentsPagedResponse>
      listDocumentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listDocumentsPagedCallable()");
  }

  public UnaryCallable<ListDocumentsRequest, ListDocumentsResponse> listDocumentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listDocumentsCallable()");
  }

  public UnaryCallable<GetDocumentRequest, Document> getDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: getDocumentCallable()");
  }

  public OperationCallable<CreateDocumentRequest, Document, KnowledgeOperationMetadata>
      createDocumentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createDocumentOperationCallable()");
  }

  public UnaryCallable<CreateDocumentRequest, Operation> createDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: createDocumentCallable()");
  }

  public OperationCallable<
          ImportDocumentsRequest, ImportDocumentsResponse, KnowledgeOperationMetadata>
      importDocumentsOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: importDocumentsOperationCallable()");
  }

  public UnaryCallable<ImportDocumentsRequest, Operation> importDocumentsCallable() {
    throw new UnsupportedOperationException("Not implemented: importDocumentsCallable()");
  }

  public OperationCallable<DeleteDocumentRequest, Empty, KnowledgeOperationMetadata>
      deleteDocumentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDocumentOperationCallable()");
  }

  public UnaryCallable<DeleteDocumentRequest, Operation> deleteDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteDocumentCallable()");
  }

  public OperationCallable<UpdateDocumentRequest, Document, KnowledgeOperationMetadata>
      updateDocumentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDocumentOperationCallable()");
  }

  public UnaryCallable<UpdateDocumentRequest, Operation> updateDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateDocumentCallable()");
  }

  public OperationCallable<ReloadDocumentRequest, Document, KnowledgeOperationMetadata>
      reloadDocumentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: reloadDocumentOperationCallable()");
  }

  public UnaryCallable<ReloadDocumentRequest, Operation> reloadDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: reloadDocumentCallable()");
  }

  public OperationCallable<ExportDocumentRequest, Document, KnowledgeOperationMetadata>
      exportDocumentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDocumentOperationCallable()");
  }

  public UnaryCallable<ExportDocumentRequest, Operation> exportDocumentCallable() {
    throw new UnsupportedOperationException("Not implemented: exportDocumentCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsPagedCallable()");
  }

  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    throw new UnsupportedOperationException("Not implemented: listLocationsCallable()");
  }

  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    throw new UnsupportedOperationException("Not implemented: getLocationCallable()");
  }

  @Override
  public abstract void close();
}
