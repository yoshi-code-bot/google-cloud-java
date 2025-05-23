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

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.AgentsClient.ListAgentsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.AgentsClient.ListLocationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.Agent;
import com.google.cloud.dialogflow.cx.v3beta1.AgentValidationResult;
import com.google.cloud.dialogflow.cx.v3beta1.CreateAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ExportAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ExportAgentResponse;
import com.google.cloud.dialogflow.cx.v3beta1.GenerativeSettings;
import com.google.cloud.dialogflow.cx.v3beta1.GetAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.GetAgentValidationResultRequest;
import com.google.cloud.dialogflow.cx.v3beta1.GetGenerativeSettingsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListAgentsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListAgentsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.RestoreAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateAgentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateGenerativeSettingsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ValidateAgentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import com.google.protobuf.Struct;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Agents service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public abstract class AgentsStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public UnaryCallable<ListAgentsRequest, ListAgentsPagedResponse> listAgentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAgentsPagedCallable()");
  }

  public UnaryCallable<ListAgentsRequest, ListAgentsResponse> listAgentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAgentsCallable()");
  }

  public UnaryCallable<GetAgentRequest, Agent> getAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: getAgentCallable()");
  }

  public UnaryCallable<CreateAgentRequest, Agent> createAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: createAgentCallable()");
  }

  public UnaryCallable<UpdateAgentRequest, Agent> updateAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateAgentCallable()");
  }

  public UnaryCallable<DeleteAgentRequest, Empty> deleteAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAgentCallable()");
  }

  public OperationCallable<ExportAgentRequest, ExportAgentResponse, Struct>
      exportAgentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: exportAgentOperationCallable()");
  }

  public UnaryCallable<ExportAgentRequest, Operation> exportAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: exportAgentCallable()");
  }

  public OperationCallable<RestoreAgentRequest, Empty, Struct> restoreAgentOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreAgentOperationCallable()");
  }

  public UnaryCallable<RestoreAgentRequest, Operation> restoreAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreAgentCallable()");
  }

  public UnaryCallable<ValidateAgentRequest, AgentValidationResult> validateAgentCallable() {
    throw new UnsupportedOperationException("Not implemented: validateAgentCallable()");
  }

  public UnaryCallable<GetAgentValidationResultRequest, AgentValidationResult>
      getAgentValidationResultCallable() {
    throw new UnsupportedOperationException("Not implemented: getAgentValidationResultCallable()");
  }

  public UnaryCallable<GetGenerativeSettingsRequest, GenerativeSettings>
      getGenerativeSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: getGenerativeSettingsCallable()");
  }

  public UnaryCallable<UpdateGenerativeSettingsRequest, GenerativeSettings>
      updateGenerativeSettingsCallable() {
    throw new UnsupportedOperationException("Not implemented: updateGenerativeSettingsCallable()");
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
