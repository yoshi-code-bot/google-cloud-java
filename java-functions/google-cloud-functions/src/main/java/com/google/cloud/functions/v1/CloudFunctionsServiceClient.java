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

package com.google.cloud.functions.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.functions.v1.stub.CloudFunctionsServiceStub;
import com.google.cloud.functions.v1.stub.CloudFunctionsServiceStubSettings;
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
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: A service that application uses to manipulate triggers and functions.
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
 * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
 *     CloudFunctionsServiceClient.create()) {
 *   CloudFunctionName name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
 *   CloudFunction response = cloudFunctionsServiceClient.getFunction(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CloudFunctionsServiceClient object to clean up
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
 *      <td><p> ListFunctions</td>
 *      <td><p> Returns a list of functions that belong to the requested project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFunctions(ListFunctionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFunctionsPagedCallable()
 *           <li><p> listFunctionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFunction</td>
 *      <td><p> Returns a function with the given name from the requested project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFunction(GetFunctionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFunction(CloudFunctionName name)
 *           <li><p> getFunction(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFunctionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFunction</td>
 *      <td><p> Creates a new function. If a function with the given name already exists in the specified project, the long running operation will return `ALREADY_EXISTS` error.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFunctionAsync(CreateFunctionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> createFunctionAsync(LocationName location, CloudFunction function)
 *           <li><p> createFunctionAsync(String location, CloudFunction function)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFunctionOperationCallable()
 *           <li><p> createFunctionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFunction</td>
 *      <td><p> Updates existing function.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFunctionAsync(UpdateFunctionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> updateFunctionAsync(CloudFunction function)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFunctionOperationCallable()
 *           <li><p> updateFunctionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteFunction</td>
 *      <td><p> Deletes a function with the given name from the specified project. If the given function is used by some trigger, the trigger will be updated to remove this function.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteFunctionAsync(DeleteFunctionRequest request)
 *      </ul>
 *      <p>Methods that return long-running operations have "Async" method variants that return `OperationFuture`, which is used to track polling of the service.</p>
 *      <ul>
 *           <li><p> deleteFunctionAsync(CloudFunctionName name)
 *           <li><p> deleteFunctionAsync(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteFunctionOperationCallable()
 *           <li><p> deleteFunctionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CallFunction</td>
 *      <td><p> Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very limited traffic is allowed. For more information on the actual limits, refer to [Rate Limits](https://cloud.google.com/functions/quotas#rate_limits).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> callFunction(CallFunctionRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> callFunction(CloudFunctionName name, String data)
 *           <li><p> callFunction(String name, String data)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> callFunctionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateUploadUrl</td>
 *      <td><p> Returns a signed URL for uploading a function source code. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls. Once the function source code upload is complete, the used signed URL should be provided in CreateFunction or UpdateFunction request as a reference to the function source code.
 * <p>  When uploading source code to the generated signed URL, please follow these restrictions:
 * <ul>
 * <li>  Source file type should be a zip file.
 * <li>  Source file size should not exceed 100MB limit.
 * <li>  No credentials should be attached - the signed URLs provide access to the   target bucket using internal service identity; if credentials were   attached, the identity from the credentials would be used, but that   identity does not have permissions to upload files to the URL.
 * </ul>
 * <p>  When making a HTTP PUT request, these two headers need to be specified:
 * <ul>
 * <li>  `content-type: application/zip`
 * <li>  `x-goog-content-length-range: 0,104857600`
 * </ul>
 * <p>  And this header SHOULD NOT be specified:
 * <ul>
 * <li>  `Authorization: Bearer YOUR_TOKEN`
 * </ul></td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateUploadUrl(GenerateUploadUrlRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateUploadUrlCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GenerateDownloadUrl</td>
 *      <td><p> Returns a signed URL for downloading deployed function source code. The URL is only valid for a limited period and should be used within minutes after generation. For more information about the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> generateDownloadUrl(GenerateDownloadUrlRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> generateDownloadUrlCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SetIamPolicy</td>
 *      <td><p> Sets the IAM access control policy on the specified function. Replaces any existing policy.</td>
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
 *      <td><p> Gets the IAM access control policy for a function. Returns an empty policy if the function exists and does not have a policy set.</td>
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
 *      <td><p> Tests the specified permissions against the IAM access control policy for a function. If the function does not exist, this will return an empty set of permissions, not a NOT_FOUND error.</td>
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
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CloudFunctionsServiceSettings
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
 * CloudFunctionsServiceSettings cloudFunctionsServiceSettings =
 *     CloudFunctionsServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CloudFunctionsServiceClient cloudFunctionsServiceClient =
 *     CloudFunctionsServiceClient.create(cloudFunctionsServiceSettings);
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
 * CloudFunctionsServiceSettings cloudFunctionsServiceSettings =
 *     CloudFunctionsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CloudFunctionsServiceClient cloudFunctionsServiceClient =
 *     CloudFunctionsServiceClient.create(cloudFunctionsServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudFunctionsServiceSettings cloudFunctionsServiceSettings =
 *     CloudFunctionsServiceSettings.newHttpJsonBuilder().build();
 * CloudFunctionsServiceClient cloudFunctionsServiceClient =
 *     CloudFunctionsServiceClient.create(cloudFunctionsServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class CloudFunctionsServiceClient implements BackgroundResource {
  private final CloudFunctionsServiceSettings settings;
  private final CloudFunctionsServiceStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of CloudFunctionsServiceClient with default settings. */
  public static final CloudFunctionsServiceClient create() throws IOException {
    return create(CloudFunctionsServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CloudFunctionsServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CloudFunctionsServiceClient create(CloudFunctionsServiceSettings settings)
      throws IOException {
    return new CloudFunctionsServiceClient(settings);
  }

  /**
   * Constructs an instance of CloudFunctionsServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(CloudFunctionsServiceSettings).
   */
  public static final CloudFunctionsServiceClient create(CloudFunctionsServiceStub stub) {
    return new CloudFunctionsServiceClient(stub);
  }

  /**
   * Constructs an instance of CloudFunctionsServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected CloudFunctionsServiceClient(CloudFunctionsServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CloudFunctionsServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected CloudFunctionsServiceClient(CloudFunctionsServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final CloudFunctionsServiceSettings getSettings() {
    return settings;
  }

  public CloudFunctionsServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of functions that belong to the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListFunctionsRequest request =
   *       ListFunctionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (CloudFunction element :
   *       cloudFunctionsServiceClient.listFunctions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFunctionsPagedResponse listFunctions(ListFunctionsRequest request) {
    return listFunctionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of functions that belong to the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListFunctionsRequest request =
   *       ListFunctionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<CloudFunction> future =
   *       cloudFunctionsServiceClient.listFunctionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (CloudFunction element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFunctionsRequest, ListFunctionsPagedResponse>
      listFunctionsPagedCallable() {
    return stub.listFunctionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a list of functions that belong to the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListFunctionsRequest request =
   *       ListFunctionsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListFunctionsResponse response =
   *         cloudFunctionsServiceClient.listFunctionsCallable().call(request);
   *     for (CloudFunction element : response.getFunctionsList()) {
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
  public final UnaryCallable<ListFunctionsRequest, ListFunctionsResponse> listFunctionsCallable() {
    return stub.listFunctionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a function with the given name from the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CloudFunctionName name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
   *   CloudFunction response = cloudFunctionsServiceClient.getFunction(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the function which details should be obtained.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CloudFunction getFunction(CloudFunctionName name) {
    GetFunctionRequest request =
        GetFunctionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getFunction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a function with the given name from the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   String name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString();
   *   CloudFunction response = cloudFunctionsServiceClient.getFunction(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the function which details should be obtained.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CloudFunction getFunction(String name) {
    GetFunctionRequest request = GetFunctionRequest.newBuilder().setName(name).build();
    return getFunction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a function with the given name from the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GetFunctionRequest request =
   *       GetFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setVersionId(-670497310)
   *           .build();
   *   CloudFunction response = cloudFunctionsServiceClient.getFunction(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CloudFunction getFunction(GetFunctionRequest request) {
    return getFunctionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a function with the given name from the requested project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GetFunctionRequest request =
   *       GetFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setVersionId(-670497310)
   *           .build();
   *   ApiFuture<CloudFunction> future =
   *       cloudFunctionsServiceClient.getFunctionCallable().futureCall(request);
   *   // Do something.
   *   CloudFunction response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFunctionRequest, CloudFunction> getFunctionCallable() {
    return stub.getFunctionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new function. If a function with the given name already exists in the specified
   * project, the long running operation will return `ALREADY_EXISTS` error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   LocationName location = LocationName.of("[PROJECT]", "[LOCATION]");
   *   CloudFunction function = CloudFunction.newBuilder().build();
   *   CloudFunction response =
   *       cloudFunctionsServiceClient.createFunctionAsync(location, function).get();
   * }
   * }</pre>
   *
   * @param location Required. The project and location in which the function should be created,
   *     specified in the format `projects/&#42;/locations/&#42;`
   * @param function Required. Function to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CloudFunction, OperationMetadataV1> createFunctionAsync(
      LocationName location, CloudFunction function) {
    CreateFunctionRequest request =
        CreateFunctionRequest.newBuilder()
            .setLocation(location == null ? null : location.toString())
            .setFunction(function)
            .build();
    return createFunctionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new function. If a function with the given name already exists in the specified
   * project, the long running operation will return `ALREADY_EXISTS` error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   String location = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   CloudFunction function = CloudFunction.newBuilder().build();
   *   CloudFunction response =
   *       cloudFunctionsServiceClient.createFunctionAsync(location, function).get();
   * }
   * }</pre>
   *
   * @param location Required. The project and location in which the function should be created,
   *     specified in the format `projects/&#42;/locations/&#42;`
   * @param function Required. Function to be created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CloudFunction, OperationMetadataV1> createFunctionAsync(
      String location, CloudFunction function) {
    CreateFunctionRequest request =
        CreateFunctionRequest.newBuilder().setLocation(location).setFunction(function).build();
    return createFunctionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new function. If a function with the given name already exists in the specified
   * project, the long running operation will return `ALREADY_EXISTS` error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CreateFunctionRequest request =
   *       CreateFunctionRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .build();
   *   CloudFunction response = cloudFunctionsServiceClient.createFunctionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CloudFunction, OperationMetadataV1> createFunctionAsync(
      CreateFunctionRequest request) {
    return createFunctionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new function. If a function with the given name already exists in the specified
   * project, the long running operation will return `ALREADY_EXISTS` error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CreateFunctionRequest request =
   *       CreateFunctionRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .build();
   *   OperationFuture<CloudFunction, OperationMetadataV1> future =
   *       cloudFunctionsServiceClient.createFunctionOperationCallable().futureCall(request);
   *   // Do something.
   *   CloudFunction response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateFunctionRequest, CloudFunction, OperationMetadataV1>
      createFunctionOperationCallable() {
    return stub.createFunctionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new function. If a function with the given name already exists in the specified
   * project, the long running operation will return `ALREADY_EXISTS` error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CreateFunctionRequest request =
   *       CreateFunctionRequest.newBuilder()
   *           .setLocation(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudFunctionsServiceClient.createFunctionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFunctionRequest, Operation> createFunctionCallable() {
    return stub.createFunctionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates existing function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CloudFunction function = CloudFunction.newBuilder().build();
   *   CloudFunction response = cloudFunctionsServiceClient.updateFunctionAsync(function).get();
   * }
   * }</pre>
   *
   * @param function Required. New version of the function.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CloudFunction, OperationMetadataV1> updateFunctionAsync(
      CloudFunction function) {
    UpdateFunctionRequest request =
        UpdateFunctionRequest.newBuilder().setFunction(function).build();
    return updateFunctionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates existing function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   UpdateFunctionRequest request =
   *       UpdateFunctionRequest.newBuilder()
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   CloudFunction response = cloudFunctionsServiceClient.updateFunctionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<CloudFunction, OperationMetadataV1> updateFunctionAsync(
      UpdateFunctionRequest request) {
    return updateFunctionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates existing function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   UpdateFunctionRequest request =
   *       UpdateFunctionRequest.newBuilder()
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   OperationFuture<CloudFunction, OperationMetadataV1> future =
   *       cloudFunctionsServiceClient.updateFunctionOperationCallable().futureCall(request);
   *   // Do something.
   *   CloudFunction response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateFunctionRequest, CloudFunction, OperationMetadataV1>
      updateFunctionOperationCallable() {
    return stub.updateFunctionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates existing function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   UpdateFunctionRequest request =
   *       UpdateFunctionRequest.newBuilder()
   *           .setFunction(CloudFunction.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudFunctionsServiceClient.updateFunctionCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFunctionRequest, Operation> updateFunctionCallable() {
    return stub.updateFunctionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a function with the given name from the specified project. If the given function is
   * used by some trigger, the trigger will be updated to remove this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CloudFunctionName name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
   *   cloudFunctionsServiceClient.deleteFunctionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the function which should be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadataV1> deleteFunctionAsync(
      CloudFunctionName name) {
    DeleteFunctionRequest request =
        DeleteFunctionRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteFunctionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a function with the given name from the specified project. If the given function is
   * used by some trigger, the trigger will be updated to remove this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   String name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString();
   *   cloudFunctionsServiceClient.deleteFunctionAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The name of the function which should be deleted.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadataV1> deleteFunctionAsync(String name) {
    DeleteFunctionRequest request = DeleteFunctionRequest.newBuilder().setName(name).build();
    return deleteFunctionAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a function with the given name from the specified project. If the given function is
   * used by some trigger, the trigger will be updated to remove this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   DeleteFunctionRequest request =
   *       DeleteFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .build();
   *   cloudFunctionsServiceClient.deleteFunctionAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadataV1> deleteFunctionAsync(
      DeleteFunctionRequest request) {
    return deleteFunctionOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a function with the given name from the specified project. If the given function is
   * used by some trigger, the trigger will be updated to remove this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   DeleteFunctionRequest request =
   *       DeleteFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .build();
   *   OperationFuture<Empty, OperationMetadataV1> future =
   *       cloudFunctionsServiceClient.deleteFunctionOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteFunctionRequest, Empty, OperationMetadataV1>
      deleteFunctionOperationCallable() {
    return stub.deleteFunctionOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a function with the given name from the specified project. If the given function is
   * used by some trigger, the trigger will be updated to remove this function.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   DeleteFunctionRequest request =
   *       DeleteFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudFunctionsServiceClient.deleteFunctionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFunctionRequest, Operation> deleteFunctionCallable() {
    return stub.deleteFunctionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very
   * limited traffic is allowed. For more information on the actual limits, refer to [Rate
   * Limits](https://cloud.google.com/functions/quotas#rate_limits).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CloudFunctionName name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]");
   *   String data = "data3076010";
   *   CallFunctionResponse response = cloudFunctionsServiceClient.callFunction(name, data);
   * }
   * }</pre>
   *
   * @param name Required. The name of the function to be called.
   * @param data Required. Input to be passed to the function.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CallFunctionResponse callFunction(CloudFunctionName name, String data) {
    CallFunctionRequest request =
        CallFunctionRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setData(data)
            .build();
    return callFunction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very
   * limited traffic is allowed. For more information on the actual limits, refer to [Rate
   * Limits](https://cloud.google.com/functions/quotas#rate_limits).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   String name = CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString();
   *   String data = "data3076010";
   *   CallFunctionResponse response = cloudFunctionsServiceClient.callFunction(name, data);
   * }
   * }</pre>
   *
   * @param name Required. The name of the function to be called.
   * @param data Required. Input to be passed to the function.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CallFunctionResponse callFunction(String name, String data) {
    CallFunctionRequest request =
        CallFunctionRequest.newBuilder().setName(name).setData(data).build();
    return callFunction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very
   * limited traffic is allowed. For more information on the actual limits, refer to [Rate
   * Limits](https://cloud.google.com/functions/quotas#rate_limits).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CallFunctionRequest request =
   *       CallFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setData("data3076010")
   *           .build();
   *   CallFunctionResponse response = cloudFunctionsServiceClient.callFunction(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CallFunctionResponse callFunction(CallFunctionRequest request) {
    return callFunctionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Synchronously invokes a deployed Cloud Function. To be used for testing purposes as very
   * limited traffic is allowed. For more information on the actual limits, refer to [Rate
   * Limits](https://cloud.google.com/functions/quotas#rate_limits).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   CallFunctionRequest request =
   *       CallFunctionRequest.newBuilder()
   *           .setName(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setData("data3076010")
   *           .build();
   *   ApiFuture<CallFunctionResponse> future =
   *       cloudFunctionsServiceClient.callFunctionCallable().futureCall(request);
   *   // Do something.
   *   CallFunctionResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CallFunctionRequest, CallFunctionResponse> callFunctionCallable() {
    return stub.callFunctionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a signed URL for uploading a function source code. For more information about the
   * signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls. Once
   * the function source code upload is complete, the used signed URL should be provided in
   * CreateFunction or UpdateFunction request as a reference to the function source code.
   *
   * <p>When uploading source code to the generated signed URL, please follow these restrictions:
   *
   * <ul>
   *   <li>Source file type should be a zip file.
   *   <li>Source file size should not exceed 100MB limit.
   *   <li>No credentials should be attached - the signed URLs provide access to the target bucket
   *       using internal service identity; if credentials were attached, the identity from the
   *       credentials would be used, but that identity does not have permissions to upload files to
   *       the URL.
   * </ul>
   *
   * <p>When making a HTTP PUT request, these two headers need to be specified:
   *
   * <ul>
   *   <li>`content-type: application/zip`
   *   <li>`x-goog-content-length-range: 0,104857600`
   * </ul>
   *
   * <p>And this header SHOULD NOT be specified:
   *
   * <ul>
   *   <li>`Authorization: Bearer YOUR_TOKEN`
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GenerateUploadUrlRequest request =
   *       GenerateUploadUrlRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setKmsKeyName(
   *               CryptoKeyName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]", "[CRYPTO_KEY]")
   *                   .toString())
   *           .build();
   *   GenerateUploadUrlResponse response = cloudFunctionsServiceClient.generateUploadUrl(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateUploadUrlResponse generateUploadUrl(GenerateUploadUrlRequest request) {
    return generateUploadUrlCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a signed URL for uploading a function source code. For more information about the
   * signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls. Once
   * the function source code upload is complete, the used signed URL should be provided in
   * CreateFunction or UpdateFunction request as a reference to the function source code.
   *
   * <p>When uploading source code to the generated signed URL, please follow these restrictions:
   *
   * <ul>
   *   <li>Source file type should be a zip file.
   *   <li>Source file size should not exceed 100MB limit.
   *   <li>No credentials should be attached - the signed URLs provide access to the target bucket
   *       using internal service identity; if credentials were attached, the identity from the
   *       credentials would be used, but that identity does not have permissions to upload files to
   *       the URL.
   * </ul>
   *
   * <p>When making a HTTP PUT request, these two headers need to be specified:
   *
   * <ul>
   *   <li>`content-type: application/zip`
   *   <li>`x-goog-content-length-range: 0,104857600`
   * </ul>
   *
   * <p>And this header SHOULD NOT be specified:
   *
   * <ul>
   *   <li>`Authorization: Bearer YOUR_TOKEN`
   * </ul>
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GenerateUploadUrlRequest request =
   *       GenerateUploadUrlRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setKmsKeyName(
   *               CryptoKeyName.of("[PROJECT]", "[LOCATION]", "[KEY_RING]", "[CRYPTO_KEY]")
   *                   .toString())
   *           .build();
   *   ApiFuture<GenerateUploadUrlResponse> future =
   *       cloudFunctionsServiceClient.generateUploadUrlCallable().futureCall(request);
   *   // Do something.
   *   GenerateUploadUrlResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateUploadUrlRequest, GenerateUploadUrlResponse>
      generateUploadUrlCallable() {
    return stub.generateUploadUrlCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a signed URL for downloading deployed function source code. The URL is only valid for a
   * limited period and should be used within minutes after generation. For more information about
   * the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GenerateDownloadUrlRequest request =
   *       GenerateDownloadUrlRequest.newBuilder()
   *           .setName("name3373707")
   *           .setVersionId(-670497310)
   *           .build();
   *   GenerateDownloadUrlResponse response =
   *       cloudFunctionsServiceClient.generateDownloadUrl(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateDownloadUrlResponse generateDownloadUrl(GenerateDownloadUrlRequest request) {
    return generateDownloadUrlCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns a signed URL for downloading deployed function source code. The URL is only valid for a
   * limited period and should be used within minutes after generation. For more information about
   * the signed URL usage see: https://cloud.google.com/storage/docs/access-control/signed-urls
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GenerateDownloadUrlRequest request =
   *       GenerateDownloadUrlRequest.newBuilder()
   *           .setName("name3373707")
   *           .setVersionId(-670497310)
   *           .build();
   *   ApiFuture<GenerateDownloadUrlResponse> future =
   *       cloudFunctionsServiceClient.generateDownloadUrlCallable().futureCall(request);
   *   // Do something.
   *   GenerateDownloadUrlResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateDownloadUrlRequest, GenerateDownloadUrlResponse>
      generateDownloadUrlCallable() {
    return stub.generateDownloadUrlCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the IAM access control policy on the specified function. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = cloudFunctionsServiceClient.setIamPolicy(request);
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
   * Sets the IAM access control policy on the specified function. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       cloudFunctionsServiceClient.setIamPolicyCallable().futureCall(request);
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
   * Gets the IAM access control policy for a function. Returns an empty policy if the function
   * exists and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = cloudFunctionsServiceClient.getIamPolicy(request);
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
   * Gets the IAM access control policy for a function. Returns an empty policy if the function
   * exists and does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       cloudFunctionsServiceClient.getIamPolicyCallable().futureCall(request);
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
   * Tests the specified permissions against the IAM access control policy for a function. If the
   * function does not exist, this will return an empty set of permissions, not a NOT_FOUND error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response = cloudFunctionsServiceClient.testIamPermissions(request);
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
   * Tests the specified permissions against the IAM access control policy for a function. If the
   * function does not exist, this will return an empty set of permissions, not a NOT_FOUND error.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(CloudFunctionName.of("[PROJECT]", "[LOCATION]", "[FUNCTION]").toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       cloudFunctionsServiceClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
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
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : cloudFunctionsServiceClient.listLocations(request).iterateAll()) {
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
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       cloudFunctionsServiceClient.listLocationsPagedCallable().futureCall(request);
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
   * try (CloudFunctionsServiceClient cloudFunctionsServiceClient =
   *     CloudFunctionsServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response =
   *         cloudFunctionsServiceClient.listLocationsCallable().call(request);
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

  public static class ListFunctionsPagedResponse
      extends AbstractPagedListResponse<
          ListFunctionsRequest,
          ListFunctionsResponse,
          CloudFunction,
          ListFunctionsPage,
          ListFunctionsFixedSizeCollection> {

    public static ApiFuture<ListFunctionsPagedResponse> createAsync(
        PageContext<ListFunctionsRequest, ListFunctionsResponse, CloudFunction> context,
        ApiFuture<ListFunctionsResponse> futureResponse) {
      ApiFuture<ListFunctionsPage> futurePage =
          ListFunctionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFunctionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFunctionsPagedResponse(ListFunctionsPage page) {
      super(page, ListFunctionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFunctionsPage
      extends AbstractPage<
          ListFunctionsRequest, ListFunctionsResponse, CloudFunction, ListFunctionsPage> {

    private ListFunctionsPage(
        PageContext<ListFunctionsRequest, ListFunctionsResponse, CloudFunction> context,
        ListFunctionsResponse response) {
      super(context, response);
    }

    private static ListFunctionsPage createEmptyPage() {
      return new ListFunctionsPage(null, null);
    }

    @Override
    protected ListFunctionsPage createPage(
        PageContext<ListFunctionsRequest, ListFunctionsResponse, CloudFunction> context,
        ListFunctionsResponse response) {
      return new ListFunctionsPage(context, response);
    }

    @Override
    public ApiFuture<ListFunctionsPage> createPageAsync(
        PageContext<ListFunctionsRequest, ListFunctionsResponse, CloudFunction> context,
        ApiFuture<ListFunctionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFunctionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFunctionsRequest,
          ListFunctionsResponse,
          CloudFunction,
          ListFunctionsPage,
          ListFunctionsFixedSizeCollection> {

    private ListFunctionsFixedSizeCollection(List<ListFunctionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFunctionsFixedSizeCollection createEmptyCollection() {
      return new ListFunctionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFunctionsFixedSizeCollection createCollection(
        List<ListFunctionsPage> pages, int collectionSize) {
      return new ListFunctionsFixedSizeCollection(pages, collectionSize);
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
