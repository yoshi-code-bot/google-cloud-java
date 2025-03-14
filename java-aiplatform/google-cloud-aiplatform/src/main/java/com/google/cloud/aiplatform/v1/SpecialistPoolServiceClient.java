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

package com.google.cloud.aiplatform.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1.stub.SpecialistPoolServiceStub;
import com.google.cloud.aiplatform.v1.stub.SpecialistPoolServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service for creating and managing Customer SpecialistPools. When customers
 * start Data Labeling jobs, they can reuse/create Specialist Pools to bring their own Specialists
 * to label the data. Customers can add/remove Managers for the Specialist Pool on Cloud console,
 * then Managers will get email notifications to manage Specialists and tasks on CrowdCompute
 * console.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (SpecialistPoolServiceClient specialistPoolServiceClient =
 *     SpecialistPoolServiceClient.create()) {
 *   SpecialistPoolName name =
 *       SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]");
 *   SpecialistPool response = specialistPoolServiceClient.getSpecialistPool(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SpecialistPoolServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateSpecialistPool</td>
 *      <td><p> Creates a SpecialistPool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createSpecialistPoolAsync(CreateSpecialistPoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createSpecialistPoolAsync(LocationName parent, SpecialistPool specialistPool)
 *           <li><p> createSpecialistPoolAsync(String parent, SpecialistPool specialistPool)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createSpecialistPoolOperationCallable()
 *           <li><p> createSpecialistPoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetSpecialistPool</td>
 *      <td><p> Gets a SpecialistPool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getSpecialistPool(GetSpecialistPoolRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getSpecialistPool(SpecialistPoolName name)
 *           <li><p> getSpecialistPool(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getSpecialistPoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListSpecialistPools</td>
 *      <td><p> Lists SpecialistPools in a Location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listSpecialistPools(ListSpecialistPoolsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listSpecialistPools(LocationName parent)
 *           <li><p> listSpecialistPools(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listSpecialistPoolsPagedCallable()
 *           <li><p> listSpecialistPoolsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteSpecialistPool</td>
 *      <td><p> Deletes a SpecialistPool as well as all Specialists in the pool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteSpecialistPoolAsync(DeleteSpecialistPoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteSpecialistPoolAsync(SpecialistPoolName name)
 *           <li><p> deleteSpecialistPoolAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteSpecialistPoolOperationCallable()
 *           <li><p> deleteSpecialistPoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateSpecialistPool</td>
 *      <td><p> Updates a SpecialistPool.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateSpecialistPoolAsync(UpdateSpecialistPoolRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateSpecialistPoolAsync(SpecialistPool specialistPool, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateSpecialistPoolOperationCallable()
 *           <li><p> updateSpecialistPoolCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the access control policy on the specified resource. Replacesany existing policy.
 * <p> Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> setIamPolicy(SetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> setIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetIamPolicy</td>
 *      <td><p> Gets the access control policy for a resource. Returns an empty policyif the resource exists and does not have a policy set.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getIamPolicy(GetIamPolicyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getIamPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> TestIamPermissions</td>
 *      <td><p> Returns permissions that a caller has on the specified resource. If theresource does not exist, this will return an empty set ofpermissions, not a `NOT_FOUND` error.
 * <p> Note: This operation is designed to be used for buildingpermission-aware UIs and command-line tools, not for authorizationchecking. This operation may "fail open" without warning.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> testIamPermissions(TestIamPermissionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> testIamPermissionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SpecialistPoolServiceSettings
 * to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SpecialistPoolServiceSettings specialistPoolServiceSettings =
 *     SpecialistPoolServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SpecialistPoolServiceClient specialistPoolServiceClient =
 *     SpecialistPoolServiceClient.create(specialistPoolServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SpecialistPoolServiceSettings specialistPoolServiceSettings =
 *     SpecialistPoolServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SpecialistPoolServiceClient specialistPoolServiceClient =
 *     SpecialistPoolServiceClient.create(specialistPoolServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class SpecialistPoolServiceClient implements BackgroundResource {
  private final SpecialistPoolServiceSettings settings;
  private final SpecialistPoolServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of SpecialistPoolServiceClient with default settings. */
  public static final SpecialistPoolServiceClient create() throws IOException {
    return create(SpecialistPoolServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SpecialistPoolServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SpecialistPoolServiceClient create(SpecialistPoolServiceSettings settings)
      throws IOException {
    return new SpecialistPoolServiceClient(settings);
  }

  /**
   * Constructs an instance of SpecialistPoolServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(SpecialistPoolServiceSettings).
   */
  public static final SpecialistPoolServiceClient create(SpecialistPoolServiceStub stub) {
    return new SpecialistPoolServiceClient(stub);
  }

  /**
   * Constructs an instance of SpecialistPoolServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected SpecialistPoolServiceClient(SpecialistPoolServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SpecialistPoolServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected SpecialistPoolServiceClient(SpecialistPoolServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final SpecialistPoolServiceSettings getSettings() {
    return settings;
  }

  public SpecialistPoolServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   SpecialistPool specialistPool = SpecialistPool.newBuilder().build();
   *   SpecialistPool response =
   *       specialistPoolServiceClient.createSpecialistPoolAsync(parent, specialistPool).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent Project name for the new SpecialistPool. The form is
   *     `projects/{project}/locations/{location}`.
   * @param specialistPool Required. The SpecialistPool to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolAsync(LocationName parent, SpecialistPool specialistPool) {
    CreateSpecialistPoolRequest request =
        CreateSpecialistPoolRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSpecialistPool(specialistPool)
            .build();
    return createSpecialistPoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   SpecialistPool specialistPool = SpecialistPool.newBuilder().build();
   *   SpecialistPool response =
   *       specialistPoolServiceClient.createSpecialistPoolAsync(parent, specialistPool).get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent Project name for the new SpecialistPool. The form is
   *     `projects/{project}/locations/{location}`.
   * @param specialistPool Required. The SpecialistPool to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolAsync(String parent, SpecialistPool specialistPool) {
    CreateSpecialistPoolRequest request =
        CreateSpecialistPoolRequest.newBuilder()
            .setParent(parent)
            .setSpecialistPool(specialistPool)
            .build();
    return createSpecialistPoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   CreateSpecialistPoolRequest request =
   *       CreateSpecialistPoolRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .build();
   *   SpecialistPool response =
   *       specialistPoolServiceClient.createSpecialistPoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolAsync(CreateSpecialistPoolRequest request) {
    return createSpecialistPoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   CreateSpecialistPoolRequest request =
   *       CreateSpecialistPoolRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .build();
   *   OperationFuture<SpecialistPool, CreateSpecialistPoolOperationMetadata> future =
   *       specialistPoolServiceClient.createSpecialistPoolOperationCallable().futureCall(request);
   *   // Do something.
   *   SpecialistPool response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolOperationCallable() {
    return stub.createSpecialistPoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   CreateSpecialistPoolRequest request =
   *       CreateSpecialistPoolRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       specialistPoolServiceClient.createSpecialistPoolCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateSpecialistPoolRequest, Operation>
      createSpecialistPoolCallable() {
    return stub.createSpecialistPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   SpecialistPoolName name =
   *       SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]");
   *   SpecialistPool response = specialistPoolServiceClient.getSpecialistPool(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the SpecialistPool resource. The form is
   *     `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SpecialistPool getSpecialistPool(SpecialistPoolName name) {
    GetSpecialistPoolRequest request =
        GetSpecialistPoolRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getSpecialistPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   String name =
   *       SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString();
   *   SpecialistPool response = specialistPoolServiceClient.getSpecialistPool(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the SpecialistPool resource. The form is
   *     `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SpecialistPool getSpecialistPool(String name) {
    GetSpecialistPoolRequest request = GetSpecialistPoolRequest.newBuilder().setName(name).build();
    return getSpecialistPool(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetSpecialistPoolRequest request =
   *       GetSpecialistPoolRequest.newBuilder()
   *           .setName(
   *               SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString())
   *           .build();
   *   SpecialistPool response = specialistPoolServiceClient.getSpecialistPool(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SpecialistPool getSpecialistPool(GetSpecialistPoolRequest request) {
    return getSpecialistPoolCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetSpecialistPoolRequest request =
   *       GetSpecialistPoolRequest.newBuilder()
   *           .setName(
   *               SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString())
   *           .build();
   *   ApiFuture<SpecialistPool> future =
   *       specialistPoolServiceClient.getSpecialistPoolCallable().futureCall(request);
   *   // Do something.
   *   SpecialistPool response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSpecialistPoolRequest, SpecialistPool> getSpecialistPoolCallable() {
    return stub.getSpecialistPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists SpecialistPools in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (SpecialistPool element :
   *       specialistPoolServiceClient.listSpecialistPools(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the SpecialistPool's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSpecialistPoolsPagedResponse listSpecialistPools(LocationName parent) {
    ListSpecialistPoolsRequest request =
        ListSpecialistPoolsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSpecialistPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists SpecialistPools in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (SpecialistPool element :
   *       specialistPoolServiceClient.listSpecialistPools(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the SpecialistPool's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSpecialistPoolsPagedResponse listSpecialistPools(String parent) {
    ListSpecialistPoolsRequest request =
        ListSpecialistPoolsRequest.newBuilder().setParent(parent).build();
    return listSpecialistPools(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists SpecialistPools in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListSpecialistPoolsRequest request =
   *       ListSpecialistPoolsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   for (SpecialistPool element :
   *       specialistPoolServiceClient.listSpecialistPools(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSpecialistPoolsPagedResponse listSpecialistPools(
      ListSpecialistPoolsRequest request) {
    return listSpecialistPoolsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists SpecialistPools in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListSpecialistPoolsRequest request =
   *       ListSpecialistPoolsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<SpecialistPool> future =
   *       specialistPoolServiceClient.listSpecialistPoolsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (SpecialistPool element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSpecialistPoolsRequest, ListSpecialistPoolsPagedResponse>
      listSpecialistPoolsPagedCallable() {
    return stub.listSpecialistPoolsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists SpecialistPools in a Location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListSpecialistPoolsRequest request =
   *       ListSpecialistPoolsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setReadMask(FieldMask.newBuilder().build())
   *           .build();
   *   while (true) {
   *     ListSpecialistPoolsResponse response =
   *         specialistPoolServiceClient.listSpecialistPoolsCallable().call(request);
   *     for (SpecialistPool element : response.getSpecialistPoolsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse>
      listSpecialistPoolsCallable() {
    return stub.listSpecialistPoolsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a SpecialistPool as well as all Specialists in the pool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   SpecialistPoolName name =
   *       SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]");
   *   specialistPoolServiceClient.deleteSpecialistPoolAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the SpecialistPool to delete. Format:
   *     `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteSpecialistPoolAsync(
      SpecialistPoolName name) {
    DeleteSpecialistPoolRequest request =
        DeleteSpecialistPoolRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return deleteSpecialistPoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a SpecialistPool as well as all Specialists in the pool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   String name =
   *       SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString();
   *   specialistPoolServiceClient.deleteSpecialistPoolAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the SpecialistPool to delete. Format:
   *     `projects/{project}/locations/{location}/specialistPools/{specialist_pool}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteSpecialistPoolAsync(
      String name) {
    DeleteSpecialistPoolRequest request =
        DeleteSpecialistPoolRequest.newBuilder().setName(name).build();
    return deleteSpecialistPoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a SpecialistPool as well as all Specialists in the pool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   DeleteSpecialistPoolRequest request =
   *       DeleteSpecialistPoolRequest.newBuilder()
   *           .setName(
   *               SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString())
   *           .setForce(true)
   *           .build();
   *   specialistPoolServiceClient.deleteSpecialistPoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, DeleteOperationMetadata> deleteSpecialistPoolAsync(
      DeleteSpecialistPoolRequest request) {
    return deleteSpecialistPoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a SpecialistPool as well as all Specialists in the pool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   DeleteSpecialistPoolRequest request =
   *       DeleteSpecialistPoolRequest.newBuilder()
   *           .setName(
   *               SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString())
   *           .setForce(true)
   *           .build();
   *   OperationFuture<Empty, DeleteOperationMetadata> future =
   *       specialistPoolServiceClient.deleteSpecialistPoolOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
      deleteSpecialistPoolOperationCallable() {
    return stub.deleteSpecialistPoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a SpecialistPool as well as all Specialists in the pool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   DeleteSpecialistPoolRequest request =
   *       DeleteSpecialistPoolRequest.newBuilder()
   *           .setName(
   *               SpecialistPoolName.of("[PROJECT]", "[LOCATION]", "[SPECIALIST_POOL]").toString())
   *           .setForce(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       specialistPoolServiceClient.deleteSpecialistPoolCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteSpecialistPoolRequest, Operation>
      deleteSpecialistPoolCallable() {
    return stub.deleteSpecialistPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   SpecialistPool specialistPool = SpecialistPool.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   SpecialistPool response =
   *       specialistPoolServiceClient.updateSpecialistPoolAsync(specialistPool, updateMask).get();
   * }
   * }</pre>
   *
   * @param specialistPool Required. The SpecialistPool which replaces the resource on the server.
   * @param updateMask Required. The update mask applies to the resource.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolAsync(SpecialistPool specialistPool, FieldMask updateMask) {
    UpdateSpecialistPoolRequest request =
        UpdateSpecialistPoolRequest.newBuilder()
            .setSpecialistPool(specialistPool)
            .setUpdateMask(updateMask)
            .build();
    return updateSpecialistPoolAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   UpdateSpecialistPoolRequest request =
   *       UpdateSpecialistPoolRequest.newBuilder()
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   SpecialistPool response =
   *       specialistPoolServiceClient.updateSpecialistPoolAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolAsync(UpdateSpecialistPoolRequest request) {
    return updateSpecialistPoolOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   UpdateSpecialistPoolRequest request =
   *       UpdateSpecialistPoolRequest.newBuilder()
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<SpecialistPool, UpdateSpecialistPoolOperationMetadata> future =
   *       specialistPoolServiceClient.updateSpecialistPoolOperationCallable().futureCall(request);
   *   // Do something.
   *   SpecialistPool response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolOperationCallable() {
    return stub.updateSpecialistPoolOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a SpecialistPool.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   UpdateSpecialistPoolRequest request =
   *       UpdateSpecialistPoolRequest.newBuilder()
   *           .setSpecialistPool(SpecialistPool.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       specialistPoolServiceClient.updateSpecialistPoolCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSpecialistPoolRequest, Operation>
      updateSpecialistPoolCallable() {
    return stub.updateSpecialistPoolCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : specialistPoolServiceClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       specialistPoolServiceClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response =
   *         specialistPoolServiceClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = specialistPoolServiceClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future =
   *       specialistPoolServiceClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = specialistPoolServiceClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on the specified resource. Replacesany existing policy.
   *
   * <p>Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED`errors.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       specialistPoolServiceClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = specialistPoolServiceClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a resource. Returns an empty policyif the resource exists
   * and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       specialistPoolServiceClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = specialistPoolServiceClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that a caller has on the specified resource. If theresource does not exist,
   * this will return an empty set ofpermissions, not a `NOT_FOUND` error.
   *
   * <p>Note: This operation is designed to be used for buildingpermission-aware UIs and
   * command-line tools, not for authorizationchecking. This operation may "fail open" without
   * warning.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SpecialistPoolServiceClient specialistPoolServiceClient =
   *     SpecialistPoolServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               EndpointName.ofProjectLocationEndpointName(
   *                       "[PROJECT]", "[LOCATION]", "[ENDPOINT]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       specialistPoolServiceClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListSpecialistPoolsPagedResponse
      extends AbstractPagedListResponse<
          ListSpecialistPoolsRequest,
          ListSpecialistPoolsResponse,
          SpecialistPool,
          ListSpecialistPoolsPage,
          ListSpecialistPoolsFixedSizeCollection> {

    public static ApiFuture<ListSpecialistPoolsPagedResponse> createAsync(
        PageContext<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
            context,
        ApiFuture<ListSpecialistPoolsResponse> futureResponse) {
      ApiFuture<ListSpecialistPoolsPage> futurePage =
          ListSpecialistPoolsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListSpecialistPoolsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListSpecialistPoolsPagedResponse(ListSpecialistPoolsPage page) {
      super(page, ListSpecialistPoolsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSpecialistPoolsPage
      extends AbstractPage<
          ListSpecialistPoolsRequest,
          ListSpecialistPoolsResponse,
          SpecialistPool,
          ListSpecialistPoolsPage> {

    private ListSpecialistPoolsPage(
        PageContext<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
            context,
        ListSpecialistPoolsResponse response) {
      super(context, response);
    }

    private static ListSpecialistPoolsPage createEmptyPage() {
      return new ListSpecialistPoolsPage(null, null);
    }

    @Override
    protected ListSpecialistPoolsPage createPage(
        PageContext<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
            context,
        ListSpecialistPoolsResponse response) {
      return new ListSpecialistPoolsPage(context, response);
    }

    @Override
    public ApiFuture<ListSpecialistPoolsPage> createPageAsync(
        PageContext<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse, SpecialistPool>
            context,
        ApiFuture<ListSpecialistPoolsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSpecialistPoolsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSpecialistPoolsRequest,
          ListSpecialistPoolsResponse,
          SpecialistPool,
          ListSpecialistPoolsPage,
          ListSpecialistPoolsFixedSizeCollection> {

    private ListSpecialistPoolsFixedSizeCollection(
        List<ListSpecialistPoolsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSpecialistPoolsFixedSizeCollection createEmptyCollection() {
      return new ListSpecialistPoolsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSpecialistPoolsFixedSizeCollection createCollection(
        List<ListSpecialistPoolsPage> pages, int collectionSize) {
      return new ListSpecialistPoolsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
