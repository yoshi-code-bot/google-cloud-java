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

package com.google.cloud.discoveryengine.v1alpha.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.discoveryengine.v1alpha.CompleteQueryRequest;
import com.google.cloud.discoveryengine.v1alpha.CompleteQueryResponse;
import com.google.cloud.discoveryengine.v1alpha.ImportCompletionSuggestionsMetadata;
import com.google.cloud.discoveryengine.v1alpha.ImportCompletionSuggestionsRequest;
import com.google.cloud.discoveryengine.v1alpha.ImportCompletionSuggestionsResponse;
import com.google.cloud.discoveryengine.v1alpha.ImportSuggestionDenyListEntriesMetadata;
import com.google.cloud.discoveryengine.v1alpha.ImportSuggestionDenyListEntriesRequest;
import com.google.cloud.discoveryengine.v1alpha.ImportSuggestionDenyListEntriesResponse;
import com.google.cloud.discoveryengine.v1alpha.PurgeCompletionSuggestionsMetadata;
import com.google.cloud.discoveryengine.v1alpha.PurgeCompletionSuggestionsRequest;
import com.google.cloud.discoveryengine.v1alpha.PurgeCompletionSuggestionsResponse;
import com.google.cloud.discoveryengine.v1alpha.PurgeSuggestionDenyListEntriesMetadata;
import com.google.cloud.discoveryengine.v1alpha.PurgeSuggestionDenyListEntriesRequest;
import com.google.cloud.discoveryengine.v1alpha.PurgeSuggestionDenyListEntriesResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the CompletionService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class CompletionServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<CompleteQueryRequest, CompleteQueryResponse> completeQueryCallable() {
    throw new UnsupportedOperationException("Not implemented: completeQueryCallable()");
  }

  public OperationCallable<
          ImportSuggestionDenyListEntriesRequest,
          ImportSuggestionDenyListEntriesResponse,
          ImportSuggestionDenyListEntriesMetadata>
      importSuggestionDenyListEntriesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importSuggestionDenyListEntriesOperationCallable()");
  }

  public UnaryCallable<ImportSuggestionDenyListEntriesRequest, Operation>
      importSuggestionDenyListEntriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importSuggestionDenyListEntriesCallable()");
  }

  public OperationCallable<
          PurgeSuggestionDenyListEntriesRequest,
          PurgeSuggestionDenyListEntriesResponse,
          PurgeSuggestionDenyListEntriesMetadata>
      purgeSuggestionDenyListEntriesOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: purgeSuggestionDenyListEntriesOperationCallable()");
  }

  public UnaryCallable<PurgeSuggestionDenyListEntriesRequest, Operation>
      purgeSuggestionDenyListEntriesCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: purgeSuggestionDenyListEntriesCallable()");
  }

  public OperationCallable<
          ImportCompletionSuggestionsRequest,
          ImportCompletionSuggestionsResponse,
          ImportCompletionSuggestionsMetadata>
      importCompletionSuggestionsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importCompletionSuggestionsOperationCallable()");
  }

  public UnaryCallable<ImportCompletionSuggestionsRequest, Operation>
      importCompletionSuggestionsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: importCompletionSuggestionsCallable()");
  }

  public OperationCallable<
          PurgeCompletionSuggestionsRequest,
          PurgeCompletionSuggestionsResponse,
          PurgeCompletionSuggestionsMetadata>
      purgeCompletionSuggestionsOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: purgeCompletionSuggestionsOperationCallable()");
  }

  public UnaryCallable<PurgeCompletionSuggestionsRequest, Operation>
      purgeCompletionSuggestionsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: purgeCompletionSuggestionsCallable()");
  }

  @Override
  public abstract void close();
}
