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

package com.google.cloud.orchestration.airflow.service.v1.stub;

import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListEnvironmentsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListUserWorkloadsConfigMapsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListUserWorkloadsSecretsPagedResponse;
import static com.google.cloud.orchestration.airflow.service.v1.EnvironmentsClient.ListWorkloadsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.orchestration.airflow.service.v1.CheckUpgradeRequest;
import com.google.cloud.orchestration.airflow.service.v1.CheckUpgradeResponse;
import com.google.cloud.orchestration.airflow.service.v1.CreateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsConfigMapRequest;
import com.google.cloud.orchestration.airflow.service.v1.CreateUserWorkloadsSecretRequest;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverRequest;
import com.google.cloud.orchestration.airflow.service.v1.DatabaseFailoverResponse;
import com.google.cloud.orchestration.airflow.service.v1.DeleteEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.DeleteUserWorkloadsConfigMapRequest;
import com.google.cloud.orchestration.airflow.service.v1.DeleteUserWorkloadsSecretRequest;
import com.google.cloud.orchestration.airflow.service.v1.Environment;
import com.google.cloud.orchestration.airflow.service.v1.ExecuteAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.ExecuteAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.FetchDatabasePropertiesRequest;
import com.google.cloud.orchestration.airflow.service.v1.FetchDatabasePropertiesResponse;
import com.google.cloud.orchestration.airflow.service.v1.GetEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.GetUserWorkloadsConfigMapRequest;
import com.google.cloud.orchestration.airflow.service.v1.GetUserWorkloadsSecretRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListEnvironmentsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListEnvironmentsResponse;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsConfigMapsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsConfigMapsResponse;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsSecretsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListUserWorkloadsSecretsResponse;
import com.google.cloud.orchestration.airflow.service.v1.ListWorkloadsRequest;
import com.google.cloud.orchestration.airflow.service.v1.ListWorkloadsResponse;
import com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1.LoadSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1.OperationMetadata;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotRequest;
import com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse;
import com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandRequest;
import com.google.cloud.orchestration.airflow.service.v1.StopAirflowCommandResponse;
import com.google.cloud.orchestration.airflow.service.v1.UpdateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1.UpdateUserWorkloadsConfigMapRequest;
import com.google.cloud.orchestration.airflow.service.v1.UpdateUserWorkloadsSecretRequest;
import com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsConfigMap;
import com.google.cloud.orchestration.airflow.service.v1.UserWorkloadsSecret;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the Environments service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class EnvironmentsStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    return null;
  }

  public com.google.api.gax.httpjson.longrunning.stub.OperationsStub getHttpJsonOperationsStub() {
    return null;
  }

  public OperationCallable<CreateEnvironmentRequest, Environment, OperationMetadata>
      createEnvironmentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createEnvironmentOperationCallable()");
  }

  public UnaryCallable<CreateEnvironmentRequest, Operation> createEnvironmentCallable() {
    throw new UnsupportedOperationException("Not implemented: createEnvironmentCallable()");
  }

  public UnaryCallable<GetEnvironmentRequest, Environment> getEnvironmentCallable() {
    throw new UnsupportedOperationException("Not implemented: getEnvironmentCallable()");
  }

  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsPagedResponse>
      listEnvironmentsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listEnvironmentsPagedCallable()");
  }

  public UnaryCallable<ListEnvironmentsRequest, ListEnvironmentsResponse>
      listEnvironmentsCallable() {
    throw new UnsupportedOperationException("Not implemented: listEnvironmentsCallable()");
  }

  public OperationCallable<UpdateEnvironmentRequest, Environment, OperationMetadata>
      updateEnvironmentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateEnvironmentOperationCallable()");
  }

  public UnaryCallable<UpdateEnvironmentRequest, Operation> updateEnvironmentCallable() {
    throw new UnsupportedOperationException("Not implemented: updateEnvironmentCallable()");
  }

  public OperationCallable<DeleteEnvironmentRequest, Empty, OperationMetadata>
      deleteEnvironmentOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteEnvironmentOperationCallable()");
  }

  public UnaryCallable<DeleteEnvironmentRequest, Operation> deleteEnvironmentCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteEnvironmentCallable()");
  }

  public UnaryCallable<ExecuteAirflowCommandRequest, ExecuteAirflowCommandResponse>
      executeAirflowCommandCallable() {
    throw new UnsupportedOperationException("Not implemented: executeAirflowCommandCallable()");
  }

  public UnaryCallable<StopAirflowCommandRequest, StopAirflowCommandResponse>
      stopAirflowCommandCallable() {
    throw new UnsupportedOperationException("Not implemented: stopAirflowCommandCallable()");
  }

  public UnaryCallable<PollAirflowCommandRequest, PollAirflowCommandResponse>
      pollAirflowCommandCallable() {
    throw new UnsupportedOperationException("Not implemented: pollAirflowCommandCallable()");
  }

  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsPagedResponse>
      listWorkloadsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listWorkloadsPagedCallable()");
  }

  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsCallable() {
    throw new UnsupportedOperationException("Not implemented: listWorkloadsCallable()");
  }

  public OperationCallable<CheckUpgradeRequest, CheckUpgradeResponse, OperationMetadata>
      checkUpgradeOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: checkUpgradeOperationCallable()");
  }

  public UnaryCallable<CheckUpgradeRequest, Operation> checkUpgradeCallable() {
    throw new UnsupportedOperationException("Not implemented: checkUpgradeCallable()");
  }

  public UnaryCallable<CreateUserWorkloadsSecretRequest, UserWorkloadsSecret>
      createUserWorkloadsSecretCallable() {
    throw new UnsupportedOperationException("Not implemented: createUserWorkloadsSecretCallable()");
  }

  public UnaryCallable<GetUserWorkloadsSecretRequest, UserWorkloadsSecret>
      getUserWorkloadsSecretCallable() {
    throw new UnsupportedOperationException("Not implemented: getUserWorkloadsSecretCallable()");
  }

  public UnaryCallable<ListUserWorkloadsSecretsRequest, ListUserWorkloadsSecretsPagedResponse>
      listUserWorkloadsSecretsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listUserWorkloadsSecretsPagedCallable()");
  }

  public UnaryCallable<ListUserWorkloadsSecretsRequest, ListUserWorkloadsSecretsResponse>
      listUserWorkloadsSecretsCallable() {
    throw new UnsupportedOperationException("Not implemented: listUserWorkloadsSecretsCallable()");
  }

  public UnaryCallable<UpdateUserWorkloadsSecretRequest, UserWorkloadsSecret>
      updateUserWorkloadsSecretCallable() {
    throw new UnsupportedOperationException("Not implemented: updateUserWorkloadsSecretCallable()");
  }

  public UnaryCallable<DeleteUserWorkloadsSecretRequest, Empty>
      deleteUserWorkloadsSecretCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteUserWorkloadsSecretCallable()");
  }

  public UnaryCallable<CreateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      createUserWorkloadsConfigMapCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createUserWorkloadsConfigMapCallable()");
  }

  public UnaryCallable<GetUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      getUserWorkloadsConfigMapCallable() {
    throw new UnsupportedOperationException("Not implemented: getUserWorkloadsConfigMapCallable()");
  }

  public UnaryCallable<ListUserWorkloadsConfigMapsRequest, ListUserWorkloadsConfigMapsPagedResponse>
      listUserWorkloadsConfigMapsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listUserWorkloadsConfigMapsPagedCallable()");
  }

  public UnaryCallable<ListUserWorkloadsConfigMapsRequest, ListUserWorkloadsConfigMapsResponse>
      listUserWorkloadsConfigMapsCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listUserWorkloadsConfigMapsCallable()");
  }

  public UnaryCallable<UpdateUserWorkloadsConfigMapRequest, UserWorkloadsConfigMap>
      updateUserWorkloadsConfigMapCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateUserWorkloadsConfigMapCallable()");
  }

  public UnaryCallable<DeleteUserWorkloadsConfigMapRequest, Empty>
      deleteUserWorkloadsConfigMapCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteUserWorkloadsConfigMapCallable()");
  }

  public OperationCallable<SaveSnapshotRequest, SaveSnapshotResponse, OperationMetadata>
      saveSnapshotOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: saveSnapshotOperationCallable()");
  }

  public UnaryCallable<SaveSnapshotRequest, Operation> saveSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: saveSnapshotCallable()");
  }

  public OperationCallable<LoadSnapshotRequest, LoadSnapshotResponse, OperationMetadata>
      loadSnapshotOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: loadSnapshotOperationCallable()");
  }

  public UnaryCallable<LoadSnapshotRequest, Operation> loadSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: loadSnapshotCallable()");
  }

  public OperationCallable<DatabaseFailoverRequest, DatabaseFailoverResponse, OperationMetadata>
      databaseFailoverOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: databaseFailoverOperationCallable()");
  }

  public UnaryCallable<DatabaseFailoverRequest, Operation> databaseFailoverCallable() {
    throw new UnsupportedOperationException("Not implemented: databaseFailoverCallable()");
  }

  public UnaryCallable<FetchDatabasePropertiesRequest, FetchDatabasePropertiesResponse>
      fetchDatabasePropertiesCallable() {
    throw new UnsupportedOperationException("Not implemented: fetchDatabasePropertiesCallable()");
  }

  @Override
  public abstract void close();
}
