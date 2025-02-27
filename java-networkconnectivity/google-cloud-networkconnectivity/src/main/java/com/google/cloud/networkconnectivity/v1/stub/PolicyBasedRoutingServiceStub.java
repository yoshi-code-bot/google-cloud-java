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

package com.google.cloud.networkconnectivity.v1.stub;

import static com.google.cloud.networkconnectivity.v1.PolicyBasedRoutingServiceClient.ListLocationsPagedResponse;
import static com.google.cloud.networkconnectivity.v1.PolicyBasedRoutingServiceClient.ListPolicyBasedRoutesPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.networkconnectivity.v1.CreatePolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.DeletePolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.GetPolicyBasedRouteRequest;
import com.google.cloud.networkconnectivity.v1.ListPolicyBasedRoutesRequest;
import com.google.cloud.networkconnectivity.v1.ListPolicyBasedRoutesResponse;
import com.google.cloud.networkconnectivity.v1.OperationMetadata;
import com.google.cloud.networkconnectivity.v1.PolicyBasedRoute;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Base stub class for the PolicyBasedRoutingService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public abstract class PolicyBasedRoutingServiceStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesPagedResponse>
      listPolicyBasedRoutesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listPolicyBasedRoutesPagedCallable()");
  }

  public UnaryCallable<ListPolicyBasedRoutesRequest, ListPolicyBasedRoutesResponse>
      listPolicyBasedRoutesCallable() {
    throw new UnsupportedOperationException("Not implemented: listPolicyBasedRoutesCallable()");
  }

  public UnaryCallable<GetPolicyBasedRouteRequest, PolicyBasedRoute> getPolicyBasedRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: getPolicyBasedRouteCallable()");
  }

  public OperationCallable<CreatePolicyBasedRouteRequest, PolicyBasedRoute, OperationMetadata>
      createPolicyBasedRouteOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createPolicyBasedRouteOperationCallable()");
  }

  public UnaryCallable<CreatePolicyBasedRouteRequest, Operation> createPolicyBasedRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: createPolicyBasedRouteCallable()");
  }

  public OperationCallable<DeletePolicyBasedRouteRequest, Empty, OperationMetadata>
      deletePolicyBasedRouteOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deletePolicyBasedRouteOperationCallable()");
  }

  public UnaryCallable<DeletePolicyBasedRouteRequest, Operation> deletePolicyBasedRouteCallable() {
    throw new UnsupportedOperationException("Not implemented: deletePolicyBasedRouteCallable()");
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

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  @Override
  public abstract void close();
}
