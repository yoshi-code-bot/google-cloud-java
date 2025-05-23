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

package com.google.shopping.merchant.accounts.v1beta;

import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.shopping.merchant.accounts.v1beta.OnlineReturnPolicyServiceGrpc.OnlineReturnPolicyServiceImplBase;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockOnlineReturnPolicyServiceImpl extends OnlineReturnPolicyServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockOnlineReturnPolicyServiceImpl() {
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
  public void getOnlineReturnPolicy(
      GetOnlineReturnPolicyRequest request, StreamObserver<OnlineReturnPolicy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof OnlineReturnPolicy) {
      requests.add(request);
      responseObserver.onNext(((OnlineReturnPolicy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetOnlineReturnPolicy, expected %s or"
                      + " %s",
                  response == null ? "null" : response.getClass().getName(),
                  OnlineReturnPolicy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listOnlineReturnPolicies(
      ListOnlineReturnPoliciesRequest request,
      StreamObserver<ListOnlineReturnPoliciesResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListOnlineReturnPoliciesResponse) {
      requests.add(request);
      responseObserver.onNext(((ListOnlineReturnPoliciesResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListOnlineReturnPolicies, expected %s"
                      + " or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListOnlineReturnPoliciesResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createOnlineReturnPolicy(
      CreateOnlineReturnPolicyRequest request,
      StreamObserver<OnlineReturnPolicy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof OnlineReturnPolicy) {
      requests.add(request);
      responseObserver.onNext(((OnlineReturnPolicy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateOnlineReturnPolicy, expected %s"
                      + " or %s",
                  response == null ? "null" : response.getClass().getName(),
                  OnlineReturnPolicy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateOnlineReturnPolicy(
      UpdateOnlineReturnPolicyRequest request,
      StreamObserver<OnlineReturnPolicy> responseObserver) {
    Object response = responses.poll();
    if (response instanceof OnlineReturnPolicy) {
      requests.add(request);
      responseObserver.onNext(((OnlineReturnPolicy) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateOnlineReturnPolicy, expected %s"
                      + " or %s",
                  response == null ? "null" : response.getClass().getName(),
                  OnlineReturnPolicy.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteOnlineReturnPolicy(
      DeleteOnlineReturnPolicyRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteOnlineReturnPolicy, expected %s"
                      + " or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }
}
