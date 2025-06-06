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

package com.google.cloud.aiplatform.v1beta1;

import com.google.api.core.BetaApi;
import com.google.cloud.aiplatform.v1beta1.ModelGardenServiceGrpc.ModelGardenServiceImplBase;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockModelGardenServiceImpl extends ModelGardenServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockModelGardenServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void getPublisherModel(
      GetPublisherModelRequest request, StreamObserver<PublisherModel> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PublisherModel) {
      requests.add(request);
      responseObserver.onNext(((PublisherModel) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetPublisherModel, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PublisherModel.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listPublisherModels(
      ListPublisherModelsRequest request,
      StreamObserver<ListPublisherModelsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListPublisherModelsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListPublisherModelsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListPublisherModels, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListPublisherModelsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deploy(DeployRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Deploy, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deployPublisherModel(
      DeployPublisherModelRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeployPublisherModel, expected %s or"
                      + " %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void exportPublisherModel(
      ExportPublisherModelRequest request, StreamObserver<Operation> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Operation) {
      requests.add(request);
      responseObserver.onNext(((Operation) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ExportPublisherModel, expected %s or"
                      + " %s",
                  response == null ? "null" : response.getClass().getName(),
                  Operation.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void checkPublisherModelEulaAcceptance(
      CheckPublisherModelEulaAcceptanceRequest request,
      StreamObserver<PublisherModelEulaAcceptance> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PublisherModelEulaAcceptance) {
      requests.add(request);
      responseObserver.onNext(((PublisherModelEulaAcceptance) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CheckPublisherModelEulaAcceptance,"
                      + " expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PublisherModelEulaAcceptance.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void acceptPublisherModelEula(
      AcceptPublisherModelEulaRequest request,
      StreamObserver<PublisherModelEulaAcceptance> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PublisherModelEulaAcceptance) {
      requests.add(request);
      responseObserver.onNext(((PublisherModelEulaAcceptance) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method AcceptPublisherModelEula, expected %s"
                      + " or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PublisherModelEulaAcceptance.class.getName(),
                  Exception.class.getName())));
    }
  }
}
