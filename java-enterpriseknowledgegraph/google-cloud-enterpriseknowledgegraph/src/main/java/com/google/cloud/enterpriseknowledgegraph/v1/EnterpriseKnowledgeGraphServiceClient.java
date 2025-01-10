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

package com.google.cloud.enterpriseknowledgegraph.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.enterpriseknowledgegraph.v1.stub.EnterpriseKnowledgeGraphServiceStub;
import com.google.cloud.enterpriseknowledgegraph.v1.stub.EnterpriseKnowledgeGraphServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: APIs for enterprise knowledge graph product.
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
 * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
 *     EnterpriseKnowledgeGraphServiceClient.create()) {
 *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
 *   EntityReconciliationJob entityReconciliationJob =
 *       EntityReconciliationJob.newBuilder().build();
 *   EntityReconciliationJob response =
 *       enterpriseKnowledgeGraphServiceClient.createEntityReconciliationJob(
 *           parent, entityReconciliationJob);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the EnterpriseKnowledgeGraphServiceClient object to clean
 * up resources such as threads. In the example above, try-with-resources is used, which
 * automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateEntityReconciliationJob</td>
 *      <td><p> Creates a EntityReconciliationJob. A EntityReconciliationJob once created will right away be attempted to start.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createEntityReconciliationJob(CreateEntityReconciliationJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createEntityReconciliationJob(LocationName parent, EntityReconciliationJob entityReconciliationJob)
 *           <li><p> createEntityReconciliationJob(String parent, EntityReconciliationJob entityReconciliationJob)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createEntityReconciliationJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetEntityReconciliationJob</td>
 *      <td><p> Gets a EntityReconciliationJob.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getEntityReconciliationJob(GetEntityReconciliationJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getEntityReconciliationJob(EntityReconciliationJobName name)
 *           <li><p> getEntityReconciliationJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getEntityReconciliationJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListEntityReconciliationJobs</td>
 *      <td><p> Lists Entity Reconciliation Jobs.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listEntityReconciliationJobs(ListEntityReconciliationJobsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listEntityReconciliationJobs(LocationName parent)
 *           <li><p> listEntityReconciliationJobs(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listEntityReconciliationJobsPagedCallable()
 *           <li><p> listEntityReconciliationJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CancelEntityReconciliationJob</td>
 *      <td><p> Cancels a EntityReconciliationJob. Success of cancellation is not guaranteed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> cancelEntityReconciliationJob(CancelEntityReconciliationJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> cancelEntityReconciliationJob(EntityReconciliationJobName name)
 *           <li><p> cancelEntityReconciliationJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> cancelEntityReconciliationJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteEntityReconciliationJob</td>
 *      <td><p> Deletes a EntityReconciliationJob. It only deletes the job when the job state is in FAILED, SUCCEEDED, and CANCELLED.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteEntityReconciliationJob(DeleteEntityReconciliationJobRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteEntityReconciliationJob(EntityReconciliationJobName name)
 *           <li><p> deleteEntityReconciliationJob(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteEntityReconciliationJobCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Lookup</td>
 *      <td><p> Finds the Cloud KG entities with CKG ID(s).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> lookup(LookupRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> lookup(LocationName parent, List&lt;String&gt; ids)
 *           <li><p> lookup(String parent, List&lt;String&gt; ids)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> lookupCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> Search</td>
 *      <td><p> Searches the Cloud KG entities with entity name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> search(SearchRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> search(LocationName parent, String query)
 *           <li><p> search(String parent, String query)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> searchCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> LookupPublicKg</td>
 *      <td><p> Finds the public KG entities with public KG ID(s).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> lookupPublicKg(LookupPublicKgRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> lookupPublicKg(LocationName parent, List&lt;String&gt; ids)
 *           <li><p> lookupPublicKg(String parent, List&lt;String&gt; ids)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> lookupPublicKgCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SearchPublicKg</td>
 *      <td><p> Searches the public KG entities with entity name.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> searchPublicKg(SearchPublicKgRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> searchPublicKg(LocationName parent, String query)
 *           <li><p> searchPublicKg(String parent, String query)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> searchPublicKgCallable()
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
 * <p>This class can be customized by passing in a custom instance of
 * EnterpriseKnowledgeGraphServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * EnterpriseKnowledgeGraphServiceSettings enterpriseKnowledgeGraphServiceSettings =
 *     EnterpriseKnowledgeGraphServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
 *     EnterpriseKnowledgeGraphServiceClient.create(enterpriseKnowledgeGraphServiceSettings);
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
 * EnterpriseKnowledgeGraphServiceSettings enterpriseKnowledgeGraphServiceSettings =
 *     EnterpriseKnowledgeGraphServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
 *     EnterpriseKnowledgeGraphServiceClient.create(enterpriseKnowledgeGraphServiceSettings);
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
 * EnterpriseKnowledgeGraphServiceSettings enterpriseKnowledgeGraphServiceSettings =
 *     EnterpriseKnowledgeGraphServiceSettings.newHttpJsonBuilder().build();
 * EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
 *     EnterpriseKnowledgeGraphServiceClient.create(enterpriseKnowledgeGraphServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class EnterpriseKnowledgeGraphServiceClient implements BackgroundResource {
  private final EnterpriseKnowledgeGraphServiceSettings settings;
  private final EnterpriseKnowledgeGraphServiceStub stub;

  /** Constructs an instance of EnterpriseKnowledgeGraphServiceClient with default settings. */
  public static final EnterpriseKnowledgeGraphServiceClient create() throws IOException {
    return create(EnterpriseKnowledgeGraphServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of EnterpriseKnowledgeGraphServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final EnterpriseKnowledgeGraphServiceClient create(
      EnterpriseKnowledgeGraphServiceSettings settings) throws IOException {
    return new EnterpriseKnowledgeGraphServiceClient(settings);
  }

  /**
   * Constructs an instance of EnterpriseKnowledgeGraphServiceClient, using the given stub for
   * making calls. This is for advanced usage - prefer using
   * create(EnterpriseKnowledgeGraphServiceSettings).
   */
  public static final EnterpriseKnowledgeGraphServiceClient create(
      EnterpriseKnowledgeGraphServiceStub stub) {
    return new EnterpriseKnowledgeGraphServiceClient(stub);
  }

  /**
   * Constructs an instance of EnterpriseKnowledgeGraphServiceClient, using the given settings. This
   * is protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected EnterpriseKnowledgeGraphServiceClient(EnterpriseKnowledgeGraphServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub =
        ((EnterpriseKnowledgeGraphServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected EnterpriseKnowledgeGraphServiceClient(EnterpriseKnowledgeGraphServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final EnterpriseKnowledgeGraphServiceSettings getSettings() {
    return settings;
  }

  public EnterpriseKnowledgeGraphServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a EntityReconciliationJob. A EntityReconciliationJob once created will right away be
   * attempted to start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   EntityReconciliationJob entityReconciliationJob =
   *       EntityReconciliationJob.newBuilder().build();
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.createEntityReconciliationJob(
   *           parent, entityReconciliationJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the EntityReconciliationJob
   *     in. Format: `projects/{project}/locations/{location}`
   * @param entityReconciliationJob Required. The EntityReconciliationJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob createEntityReconciliationJob(
      LocationName parent, EntityReconciliationJob entityReconciliationJob) {
    CreateEntityReconciliationJobRequest request =
        CreateEntityReconciliationJobRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setEntityReconciliationJob(entityReconciliationJob)
            .build();
    return createEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a EntityReconciliationJob. A EntityReconciliationJob once created will right away be
   * attempted to start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   EntityReconciliationJob entityReconciliationJob =
   *       EntityReconciliationJob.newBuilder().build();
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.createEntityReconciliationJob(
   *           parent, entityReconciliationJob);
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the Location to create the EntityReconciliationJob
   *     in. Format: `projects/{project}/locations/{location}`
   * @param entityReconciliationJob Required. The EntityReconciliationJob to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob createEntityReconciliationJob(
      String parent, EntityReconciliationJob entityReconciliationJob) {
    CreateEntityReconciliationJobRequest request =
        CreateEntityReconciliationJobRequest.newBuilder()
            .setParent(parent)
            .setEntityReconciliationJob(entityReconciliationJob)
            .build();
    return createEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a EntityReconciliationJob. A EntityReconciliationJob once created will right away be
   * attempted to start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   CreateEntityReconciliationJobRequest request =
   *       CreateEntityReconciliationJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setEntityReconciliationJob(EntityReconciliationJob.newBuilder().build())
   *           .build();
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.createEntityReconciliationJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob createEntityReconciliationJob(
      CreateEntityReconciliationJobRequest request) {
    return createEntityReconciliationJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a EntityReconciliationJob. A EntityReconciliationJob once created will right away be
   * attempted to start.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   CreateEntityReconciliationJobRequest request =
   *       CreateEntityReconciliationJobRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setEntityReconciliationJob(EntityReconciliationJob.newBuilder().build())
   *           .build();
   *   ApiFuture<EntityReconciliationJob> future =
   *       enterpriseKnowledgeGraphServiceClient
   *           .createEntityReconciliationJobCallable()
   *           .futureCall(request);
   *   // Do something.
   *   EntityReconciliationJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateEntityReconciliationJobRequest, EntityReconciliationJob>
      createEntityReconciliationJobCallable() {
    return stub.createEntityReconciliationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a EntityReconciliationJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   EntityReconciliationJobName name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]");
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.getEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob getEntityReconciliationJob(
      EntityReconciliationJobName name) {
    GetEntityReconciliationJobRequest request =
        GetEntityReconciliationJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a EntityReconciliationJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *           .toString();
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.getEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob getEntityReconciliationJob(String name) {
    GetEntityReconciliationJobRequest request =
        GetEntityReconciliationJobRequest.newBuilder().setName(name).build();
    return getEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a EntityReconciliationJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   GetEntityReconciliationJobRequest request =
   *       GetEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   EntityReconciliationJob response =
   *       enterpriseKnowledgeGraphServiceClient.getEntityReconciliationJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final EntityReconciliationJob getEntityReconciliationJob(
      GetEntityReconciliationJobRequest request) {
    return getEntityReconciliationJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a EntityReconciliationJob.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   GetEntityReconciliationJobRequest request =
   *       GetEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<EntityReconciliationJob> future =
   *       enterpriseKnowledgeGraphServiceClient
   *           .getEntityReconciliationJobCallable()
   *           .futureCall(request);
   *   // Do something.
   *   EntityReconciliationJob response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetEntityReconciliationJobRequest, EntityReconciliationJob>
      getEntityReconciliationJobCallable() {
    return stub.getEntityReconciliationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Entity Reconciliation Jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (EntityReconciliationJob element :
   *       enterpriseKnowledgeGraphServiceClient.listEntityReconciliationJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the EntityReconciliationJob's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityReconciliationJobsPagedResponse listEntityReconciliationJobs(
      LocationName parent) {
    ListEntityReconciliationJobsRequest request =
        ListEntityReconciliationJobsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listEntityReconciliationJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Entity Reconciliation Jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (EntityReconciliationJob element :
   *       enterpriseKnowledgeGraphServiceClient.listEntityReconciliationJobs(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the EntityReconciliationJob's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityReconciliationJobsPagedResponse listEntityReconciliationJobs(
      String parent) {
    ListEntityReconciliationJobsRequest request =
        ListEntityReconciliationJobsRequest.newBuilder().setParent(parent).build();
    return listEntityReconciliationJobs(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Entity Reconciliation Jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   ListEntityReconciliationJobsRequest request =
   *       ListEntityReconciliationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (EntityReconciliationJob element :
   *       enterpriseKnowledgeGraphServiceClient
   *           .listEntityReconciliationJobs(request)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListEntityReconciliationJobsPagedResponse listEntityReconciliationJobs(
      ListEntityReconciliationJobsRequest request) {
    return listEntityReconciliationJobsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Entity Reconciliation Jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   ListEntityReconciliationJobsRequest request =
   *       ListEntityReconciliationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<EntityReconciliationJob> future =
   *       enterpriseKnowledgeGraphServiceClient
   *           .listEntityReconciliationJobsPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (EntityReconciliationJob element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListEntityReconciliationJobsRequest, ListEntityReconciliationJobsPagedResponse>
      listEntityReconciliationJobsPagedCallable() {
    return stub.listEntityReconciliationJobsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Entity Reconciliation Jobs.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   ListEntityReconciliationJobsRequest request =
   *       ListEntityReconciliationJobsRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListEntityReconciliationJobsResponse response =
   *         enterpriseKnowledgeGraphServiceClient
   *             .listEntityReconciliationJobsCallable()
   *             .call(request);
   *     for (EntityReconciliationJob element : response.getEntityReconciliationJobsList()) {
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
  public final UnaryCallable<
          ListEntityReconciliationJobsRequest, ListEntityReconciliationJobsResponse>
      listEntityReconciliationJobsCallable() {
    return stub.listEntityReconciliationJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a EntityReconciliationJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   EntityReconciliationJobName name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]");
   *   enterpriseKnowledgeGraphServiceClient.cancelEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelEntityReconciliationJob(EntityReconciliationJobName name) {
    CancelEntityReconciliationJobRequest request =
        CancelEntityReconciliationJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    cancelEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a EntityReconciliationJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *           .toString();
   *   enterpriseKnowledgeGraphServiceClient.cancelEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelEntityReconciliationJob(String name) {
    CancelEntityReconciliationJobRequest request =
        CancelEntityReconciliationJobRequest.newBuilder().setName(name).build();
    cancelEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a EntityReconciliationJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   CancelEntityReconciliationJobRequest request =
   *       CancelEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   enterpriseKnowledgeGraphServiceClient.cancelEntityReconciliationJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void cancelEntityReconciliationJob(CancelEntityReconciliationJobRequest request) {
    cancelEntityReconciliationJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Cancels a EntityReconciliationJob. Success of cancellation is not guaranteed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   CancelEntityReconciliationJobRequest request =
   *       CancelEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       enterpriseKnowledgeGraphServiceClient
   *           .cancelEntityReconciliationJobCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CancelEntityReconciliationJobRequest, Empty>
      cancelEntityReconciliationJobCallable() {
    return stub.cancelEntityReconciliationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a EntityReconciliationJob. It only deletes the job when the job state is in FAILED,
   * SUCCEEDED, and CANCELLED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   EntityReconciliationJobName name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]");
   *   enterpriseKnowledgeGraphServiceClient.deleteEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityReconciliationJob(EntityReconciliationJobName name) {
    DeleteEntityReconciliationJobRequest request =
        DeleteEntityReconciliationJobRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a EntityReconciliationJob. It only deletes the job when the job state is in FAILED,
   * SUCCEEDED, and CANCELLED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String name =
   *       EntityReconciliationJobName.of("[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *           .toString();
   *   enterpriseKnowledgeGraphServiceClient.deleteEntityReconciliationJob(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the EntityReconciliationJob resource. Format:
   *     `projects/{project}/locations/{location}/entityReconciliationJobs/{entity_reconciliation_job}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityReconciliationJob(String name) {
    DeleteEntityReconciliationJobRequest request =
        DeleteEntityReconciliationJobRequest.newBuilder().setName(name).build();
    deleteEntityReconciliationJob(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a EntityReconciliationJob. It only deletes the job when the job state is in FAILED,
   * SUCCEEDED, and CANCELLED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   DeleteEntityReconciliationJobRequest request =
   *       DeleteEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   enterpriseKnowledgeGraphServiceClient.deleteEntityReconciliationJob(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteEntityReconciliationJob(DeleteEntityReconciliationJobRequest request) {
    deleteEntityReconciliationJobCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a EntityReconciliationJob. It only deletes the job when the job state is in FAILED,
   * SUCCEEDED, and CANCELLED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   DeleteEntityReconciliationJobRequest request =
   *       DeleteEntityReconciliationJobRequest.newBuilder()
   *           .setName(
   *               EntityReconciliationJobName.of(
   *                       "[PROJECT]", "[LOCATION]", "[ENTITY_RECONCILIATION_JOB]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       enterpriseKnowledgeGraphServiceClient
   *           .deleteEntityReconciliationJobCallable()
   *           .futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteEntityReconciliationJobRequest, Empty>
      deleteEntityReconciliationJobCallable() {
    return stub.deleteEntityReconciliationJobCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the Cloud KG entities with CKG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   List<String> ids = new ArrayList<>();
   *   LookupResponse response = enterpriseKnowledgeGraphServiceClient.lookup(parent, ids);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param ids Required. The list of entity ids to be used for lookup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupResponse lookup(LocationName parent, List<String> ids) {
    LookupRequest request =
        LookupRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllIds(ids)
            .build();
    return lookup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the Cloud KG entities with CKG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   List<String> ids = new ArrayList<>();
   *   LookupResponse response = enterpriseKnowledgeGraphServiceClient.lookup(parent, ids);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param ids Required. The list of entity ids to be used for lookup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupResponse lookup(String parent, List<String> ids) {
    LookupRequest request = LookupRequest.newBuilder().setParent(parent).addAllIds(ids).build();
    return lookup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the Cloud KG entities with CKG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LookupRequest request =
   *       LookupRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .addAllIds(new ArrayList<String>())
   *           .addAllLanguages(new ArrayList<String>())
   *           .build();
   *   LookupResponse response = enterpriseKnowledgeGraphServiceClient.lookup(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupResponse lookup(LookupRequest request) {
    return lookupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the Cloud KG entities with CKG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LookupRequest request =
   *       LookupRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .addAllIds(new ArrayList<String>())
   *           .addAllLanguages(new ArrayList<String>())
   *           .build();
   *   ApiFuture<LookupResponse> future =
   *       enterpriseKnowledgeGraphServiceClient.lookupCallable().futureCall(request);
   *   // Do something.
   *   LookupResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<LookupRequest, LookupResponse> lookupCallable() {
    return stub.lookupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the Cloud KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   String query = "query107944136";
   *   SearchResponse response = enterpriseKnowledgeGraphServiceClient.search(parent, query);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param query Required. The literal query string for search.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchResponse search(LocationName parent, String query) {
    SearchRequest request =
        SearchRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setQuery(query)
            .build();
    return search(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the Cloud KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   String query = "query107944136";
   *   SearchResponse response = enterpriseKnowledgeGraphServiceClient.search(parent, query);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param query Required. The literal query string for search.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchResponse search(String parent, String query) {
    SearchRequest request = SearchRequest.newBuilder().setParent(parent).setQuery(query).build();
    return search(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the Cloud KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   SearchRequest request =
   *       SearchRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguages(new ArrayList<String>())
   *           .addAllTypes(new ArrayList<String>())
   *           .setLimit(Int32Value.newBuilder().build())
   *           .build();
   *   SearchResponse response = enterpriseKnowledgeGraphServiceClient.search(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchResponse search(SearchRequest request) {
    return searchCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the Cloud KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   SearchRequest request =
   *       SearchRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguages(new ArrayList<String>())
   *           .addAllTypes(new ArrayList<String>())
   *           .setLimit(Int32Value.newBuilder().build())
   *           .build();
   *   ApiFuture<SearchResponse> future =
   *       enterpriseKnowledgeGraphServiceClient.searchCallable().futureCall(request);
   *   // Do something.
   *   SearchResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchRequest, SearchResponse> searchCallable() {
    return stub.searchCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the public KG entities with public KG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   List<String> ids = new ArrayList<>();
   *   LookupPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.lookupPublicKg(parent, ids);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param ids Required. The list of entity ids to be used for lookup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupPublicKgResponse lookupPublicKg(LocationName parent, List<String> ids) {
    LookupPublicKgRequest request =
        LookupPublicKgRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllIds(ids)
            .build();
    return lookupPublicKg(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the public KG entities with public KG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   List<String> ids = new ArrayList<>();
   *   LookupPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.lookupPublicKg(parent, ids);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param ids Required. The list of entity ids to be used for lookup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupPublicKgResponse lookupPublicKg(String parent, List<String> ids) {
    LookupPublicKgRequest request =
        LookupPublicKgRequest.newBuilder().setParent(parent).addAllIds(ids).build();
    return lookupPublicKg(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the public KG entities with public KG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LookupPublicKgRequest request =
   *       LookupPublicKgRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .addAllIds(new ArrayList<String>())
   *           .addAllLanguages(new ArrayList<String>())
   *           .build();
   *   LookupPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.lookupPublicKg(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final LookupPublicKgResponse lookupPublicKg(LookupPublicKgRequest request) {
    return lookupPublicKgCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Finds the public KG entities with public KG ID(s).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LookupPublicKgRequest request =
   *       LookupPublicKgRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .addAllIds(new ArrayList<String>())
   *           .addAllLanguages(new ArrayList<String>())
   *           .build();
   *   ApiFuture<LookupPublicKgResponse> future =
   *       enterpriseKnowledgeGraphServiceClient.lookupPublicKgCallable().futureCall(request);
   *   // Do something.
   *   LookupPublicKgResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<LookupPublicKgRequest, LookupPublicKgResponse>
      lookupPublicKgCallable() {
    return stub.lookupPublicKgCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the public KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   String query = "query107944136";
   *   SearchPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.searchPublicKg(parent, query);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param query Required. The literal query string for search.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPublicKgResponse searchPublicKg(LocationName parent, String query) {
    SearchPublicKgRequest request =
        SearchPublicKgRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setQuery(query)
            .build();
    return searchPublicKg(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the public KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   String query = "query107944136";
   *   SearchPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.searchPublicKg(parent, query);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the Entity's parent resource. Format:
   *     `projects/{project}/locations/{location}`
   * @param query Required. The literal query string for search.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPublicKgResponse searchPublicKg(String parent, String query) {
    SearchPublicKgRequest request =
        SearchPublicKgRequest.newBuilder().setParent(parent).setQuery(query).build();
    return searchPublicKg(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the public KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   SearchPublicKgRequest request =
   *       SearchPublicKgRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguages(new ArrayList<String>())
   *           .addAllTypes(new ArrayList<String>())
   *           .setLimit(Int32Value.newBuilder().build())
   *           .build();
   *   SearchPublicKgResponse response =
   *       enterpriseKnowledgeGraphServiceClient.searchPublicKg(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchPublicKgResponse searchPublicKg(SearchPublicKgRequest request) {
    return searchPublicKgCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Searches the public KG entities with entity name.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (EnterpriseKnowledgeGraphServiceClient enterpriseKnowledgeGraphServiceClient =
   *     EnterpriseKnowledgeGraphServiceClient.create()) {
   *   SearchPublicKgRequest request =
   *       SearchPublicKgRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setQuery("query107944136")
   *           .addAllLanguages(new ArrayList<String>())
   *           .addAllTypes(new ArrayList<String>())
   *           .setLimit(Int32Value.newBuilder().build())
   *           .build();
   *   ApiFuture<SearchPublicKgResponse> future =
   *       enterpriseKnowledgeGraphServiceClient.searchPublicKgCallable().futureCall(request);
   *   // Do something.
   *   SearchPublicKgResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SearchPublicKgRequest, SearchPublicKgResponse>
      searchPublicKgCallable() {
    return stub.searchPublicKgCallable();
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

  public static class ListEntityReconciliationJobsPagedResponse
      extends AbstractPagedListResponse<
          ListEntityReconciliationJobsRequest,
          ListEntityReconciliationJobsResponse,
          EntityReconciliationJob,
          ListEntityReconciliationJobsPage,
          ListEntityReconciliationJobsFixedSizeCollection> {

    public static ApiFuture<ListEntityReconciliationJobsPagedResponse> createAsync(
        PageContext<
                ListEntityReconciliationJobsRequest,
                ListEntityReconciliationJobsResponse,
                EntityReconciliationJob>
            context,
        ApiFuture<ListEntityReconciliationJobsResponse> futureResponse) {
      ApiFuture<ListEntityReconciliationJobsPage> futurePage =
          ListEntityReconciliationJobsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListEntityReconciliationJobsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListEntityReconciliationJobsPagedResponse(ListEntityReconciliationJobsPage page) {
      super(page, ListEntityReconciliationJobsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListEntityReconciliationJobsPage
      extends AbstractPage<
          ListEntityReconciliationJobsRequest,
          ListEntityReconciliationJobsResponse,
          EntityReconciliationJob,
          ListEntityReconciliationJobsPage> {

    private ListEntityReconciliationJobsPage(
        PageContext<
                ListEntityReconciliationJobsRequest,
                ListEntityReconciliationJobsResponse,
                EntityReconciliationJob>
            context,
        ListEntityReconciliationJobsResponse response) {
      super(context, response);
    }

    private static ListEntityReconciliationJobsPage createEmptyPage() {
      return new ListEntityReconciliationJobsPage(null, null);
    }

    @Override
    protected ListEntityReconciliationJobsPage createPage(
        PageContext<
                ListEntityReconciliationJobsRequest,
                ListEntityReconciliationJobsResponse,
                EntityReconciliationJob>
            context,
        ListEntityReconciliationJobsResponse response) {
      return new ListEntityReconciliationJobsPage(context, response);
    }

    @Override
    public ApiFuture<ListEntityReconciliationJobsPage> createPageAsync(
        PageContext<
                ListEntityReconciliationJobsRequest,
                ListEntityReconciliationJobsResponse,
                EntityReconciliationJob>
            context,
        ApiFuture<ListEntityReconciliationJobsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListEntityReconciliationJobsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListEntityReconciliationJobsRequest,
          ListEntityReconciliationJobsResponse,
          EntityReconciliationJob,
          ListEntityReconciliationJobsPage,
          ListEntityReconciliationJobsFixedSizeCollection> {

    private ListEntityReconciliationJobsFixedSizeCollection(
        List<ListEntityReconciliationJobsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListEntityReconciliationJobsFixedSizeCollection createEmptyCollection() {
      return new ListEntityReconciliationJobsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListEntityReconciliationJobsFixedSizeCollection createCollection(
        List<ListEntityReconciliationJobsPage> pages, int collectionSize) {
      return new ListEntityReconciliationJobsFixedSizeCollection(pages, collectionSize);
    }
  }
}
