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

package com.google.cloud.retail.v2beta.stub;

import static com.google.cloud.retail.v2beta.ModelServiceClient.ListModelsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.retail.v2beta.CreateModelMetadata;
import com.google.cloud.retail.v2beta.CreateModelRequest;
import com.google.cloud.retail.v2beta.DeleteModelRequest;
import com.google.cloud.retail.v2beta.GetModelRequest;
import com.google.cloud.retail.v2beta.ListModelsRequest;
import com.google.cloud.retail.v2beta.ListModelsResponse;
import com.google.cloud.retail.v2beta.Model;
import com.google.cloud.retail.v2beta.PauseModelRequest;
import com.google.cloud.retail.v2beta.ResumeModelRequest;
import com.google.cloud.retail.v2beta.TuneModelMetadata;
import com.google.cloud.retail.v2beta.TuneModelRequest;
import com.google.cloud.retail.v2beta.TuneModelResponse;
import com.google.cloud.retail.v2beta.UpdateModelRequest;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the ModelService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class ModelServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<CreateModelRequest, Model, CreateModelMetadata>
      createModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createModelOperationCallable()");
  }

  public UnaryCallable<CreateModelRequest, Operation> createModelCallable() {
    throw new UnsupportedOperationException("Not implemented: createModelCallable()");
  }

  public UnaryCallable<GetModelRequest, Model> getModelCallable() {
    throw new UnsupportedOperationException("Not implemented: getModelCallable()");
  }

  public UnaryCallable<PauseModelRequest, Model> pauseModelCallable() {
    throw new UnsupportedOperationException("Not implemented: pauseModelCallable()");
  }

  public UnaryCallable<ResumeModelRequest, Model> resumeModelCallable() {
    throw new UnsupportedOperationException("Not implemented: resumeModelCallable()");
  }

  public UnaryCallable<DeleteModelRequest, Empty> deleteModelCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteModelCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsPagedResponse> listModelsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsPagedCallable()");
  }

  public UnaryCallable<ListModelsRequest, ListModelsResponse> listModelsCallable() {
    throw new UnsupportedOperationException("Not implemented: listModelsCallable()");
  }

  public UnaryCallable<UpdateModelRequest, Model> updateModelCallable() {
    throw new UnsupportedOperationException("Not implemented: updateModelCallable()");
  }

  public OperationCallable<TuneModelRequest, TuneModelResponse, TuneModelMetadata>
      tuneModelOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: tuneModelOperationCallable()");
  }

  public UnaryCallable<TuneModelRequest, Operation> tuneModelCallable() {
    throw new UnsupportedOperationException("Not implemented: tuneModelCallable()");
  }

  @Override
  public abstract void close();
}
