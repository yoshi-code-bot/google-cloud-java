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

package com.google.cloud.dialogflow.cx.v3beta1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.stub.SessionEntityTypesStub;
import com.google.cloud.dialogflow.cx.v3beta1.stub.SessionEntityTypesStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service for managing
 * [SessionEntityTypes][google.cloud.dialogflow.cx.v3beta1.SessionEntityType].
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
 * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
 *   SessionEntityTypeName name =
 *       SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
 *           "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]");
 *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the SessionEntityTypesClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListSessionEntityTypes</td>
 *      <td><p> Returns the list of all session entity types in the specified session.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listSessionEntityTypes(ListSessionEntityTypesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listSessionEntityTypes(SessionName parent)
 *           <li><p> listSessionEntityTypes(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listSessionEntityTypesPagedCallable()
 *           <li><p> listSessionEntityTypesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetSessionEntityType</td>
 *      <td><p> Retrieves the specified session entity type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getSessionEntityType(GetSessionEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getSessionEntityType(SessionEntityTypeName name)
 *           <li><p> getSessionEntityType(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getSessionEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateSessionEntityType</td>
 *      <td><p> Creates a session entity type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createSessionEntityType(CreateSessionEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createSessionEntityType(SessionName parent, SessionEntityType sessionEntityType)
 *           <li><p> createSessionEntityType(String parent, SessionEntityType sessionEntityType)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createSessionEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateSessionEntityType</td>
 *      <td><p> Updates the specified session entity type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateSessionEntityType(UpdateSessionEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateSessionEntityType(SessionEntityType sessionEntityType, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateSessionEntityTypeCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteSessionEntityType</td>
 *      <td><p> Deletes the specified session entity type.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteSessionEntityType(DeleteSessionEntityTypeRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteSessionEntityType(SessionEntityTypeName name)
 *           <li><p> deleteSessionEntityType(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteSessionEntityTypeCallable()
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
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SessionEntityTypesSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.create(sessionEntityTypesSettings);
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
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.create(sessionEntityTypesSettings);
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
 * SessionEntityTypesSettings sessionEntityTypesSettings =
 *     SessionEntityTypesSettings.newHttpJsonBuilder().build();
 * SessionEntityTypesClient sessionEntityTypesClient =
 *     SessionEntityTypesClient.create(sessionEntityTypesSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class SessionEntityTypesClient implements BackgroundResource {
  private final SessionEntityTypesSettings settings;
  private final SessionEntityTypesStub stub;

  /** Constructs an instance of SessionEntityTypesClient with default settings. */
  public static final SessionEntityTypesClient create() throws IOException {
    return create(SessionEntityTypesSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SessionEntityTypesClient create(SessionEntityTypesSettings settings)
      throws IOException {
    return new SessionEntityTypesClient(settings);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(SessionEntityTypesSettings).
   */
  public static final SessionEntityTypesClient create(SessionEntityTypesStub stub) {
    return new SessionEntityTypesClient(stub);
  }

  /**
   * Constructs an instance of SessionEntityTypesClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected SessionEntityTypesClient(SessionEntityTypesSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SessionEntityTypesStubSettings) settings.getStubSettings()).createStub();
  }

  protected SessionEntityTypesClient(SessionEntityTypesStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SessionEntityTypesSettings getSettings() {
    return settings;
  }

  public SessionEntityTypesStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   SessionName parent =
   *       SessionName.ofProjectLocationAgentSessionName(
   *           "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]");
   *   for (SessionEntityType element :
   *       sessionEntityTypesClient.listSessionEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The session to list all session entity types from. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(SessionName parent) {
    ListSessionEntityTypesRequest request =
        ListSessionEntityTypesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSessionEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   String parent =
   *       SessionName.ofProjectLocationAgentSessionName(
   *               "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *           .toString();
   *   for (SessionEntityType element :
   *       sessionEntityTypesClient.listSessionEntityTypes(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The session to list all session entity types from. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(String parent) {
    ListSessionEntityTypesRequest request =
        ListSessionEntityTypesRequest.newBuilder().setParent(parent).build();
    return listSessionEntityTypes(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListSessionEntityTypesRequest request =
   *       ListSessionEntityTypesRequest.newBuilder()
   *           .setParent(
   *               SessionName.ofProjectLocationAgentSessionName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (SessionEntityType element :
   *       sessionEntityTypesClient.listSessionEntityTypes(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionEntityTypesPagedResponse listSessionEntityTypes(
      ListSessionEntityTypesRequest request) {
    return listSessionEntityTypesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListSessionEntityTypesRequest request =
   *       ListSessionEntityTypesRequest.newBuilder()
   *           .setParent(
   *               SessionName.ofProjectLocationAgentSessionName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<SessionEntityType> future =
   *       sessionEntityTypesClient.listSessionEntityTypesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (SessionEntityType element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesPagedResponse>
      listSessionEntityTypesPagedCallable() {
    return stub.listSessionEntityTypesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all session entity types in the specified session.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListSessionEntityTypesRequest request =
   *       ListSessionEntityTypesRequest.newBuilder()
   *           .setParent(
   *               SessionName.ofProjectLocationAgentSessionName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *                   .toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListSessionEntityTypesResponse response =
   *         sessionEntityTypesClient.listSessionEntityTypesCallable().call(request);
   *     for (SessionEntityType element : response.getSessionEntityTypesList()) {
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
  public final UnaryCallable<ListSessionEntityTypesRequest, ListSessionEntityTypesResponse>
      listSessionEntityTypesCallable() {
    return stub.listSessionEntityTypesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   SessionEntityTypeName name =
   *       SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *           "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]");
   *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the session entity type. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(SessionEntityTypeName name) {
    GetSessionEntityTypeRequest request =
        GetSessionEntityTypeRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   String name =
   *       SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *               "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *           .toString();
   *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the session entity type. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(String name) {
    GetSessionEntityTypeRequest request =
        GetSessionEntityTypeRequest.newBuilder().setName(name).build();
    return getSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   GetSessionEntityTypeRequest request =
   *       GetSessionEntityTypeRequest.newBuilder()
   *           .setName(
   *               SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   SessionEntityType response = sessionEntityTypesClient.getSessionEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType getSessionEntityType(GetSessionEntityTypeRequest request) {
    return getSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   GetSessionEntityTypeRequest request =
   *       GetSessionEntityTypeRequest.newBuilder()
   *           .setName(
   *               SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<SessionEntityType> future =
   *       sessionEntityTypesClient.getSessionEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   SessionEntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSessionEntityTypeRequest, SessionEntityType>
      getSessionEntityTypeCallable() {
    return stub.getSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   SessionName parent =
   *       SessionName.ofProjectLocationAgentSessionName(
   *           "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]");
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   SessionEntityType response =
   *       sessionEntityTypesClient.createSessionEntityType(parent, sessionEntityType);
   * }
   * }</pre>
   *
   * @param parent Required. The session to create a session entity type for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @param sessionEntityType Required. The session entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(
      SessionName parent, SessionEntityType sessionEntityType) {
    CreateSessionEntityTypeRequest request =
        CreateSessionEntityTypeRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSessionEntityType(sessionEntityType)
            .build();
    return createSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   String parent =
   *       SessionName.ofProjectLocationAgentSessionName(
   *               "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *           .toString();
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   SessionEntityType response =
   *       sessionEntityTypesClient.createSessionEntityType(parent, sessionEntityType);
   * }
   * }</pre>
   *
   * @param parent Required. The session to create a session entity type for. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @param sessionEntityType Required. The session entity type to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(
      String parent, SessionEntityType sessionEntityType) {
    CreateSessionEntityTypeRequest request =
        CreateSessionEntityTypeRequest.newBuilder()
            .setParent(parent)
            .setSessionEntityType(sessionEntityType)
            .build();
    return createSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   CreateSessionEntityTypeRequest request =
   *       CreateSessionEntityTypeRequest.newBuilder()
   *           .setParent(
   *               SessionName.ofProjectLocationAgentSessionName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *                   .toString())
   *           .setSessionEntityType(SessionEntityType.newBuilder().build())
   *           .build();
   *   SessionEntityType response = sessionEntityTypesClient.createSessionEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType createSessionEntityType(CreateSessionEntityTypeRequest request) {
    return createSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   CreateSessionEntityTypeRequest request =
   *       CreateSessionEntityTypeRequest.newBuilder()
   *           .setParent(
   *               SessionName.ofProjectLocationAgentSessionName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]")
   *                   .toString())
   *           .setSessionEntityType(SessionEntityType.newBuilder().build())
   *           .build();
   *   ApiFuture<SessionEntityType> future =
   *       sessionEntityTypesClient.createSessionEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   SessionEntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateSessionEntityTypeRequest, SessionEntityType>
      createSessionEntityTypeCallable() {
    return stub.createSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   SessionEntityType sessionEntityType = SessionEntityType.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   SessionEntityType response =
   *       sessionEntityTypesClient.updateSessionEntityType(sessionEntityType, updateMask);
   * }
   * }</pre>
   *
   * @param sessionEntityType Required. The session entity type to update. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @param updateMask The mask to control which fields get updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(
      SessionEntityType sessionEntityType, FieldMask updateMask) {
    UpdateSessionEntityTypeRequest request =
        UpdateSessionEntityTypeRequest.newBuilder()
            .setSessionEntityType(sessionEntityType)
            .setUpdateMask(updateMask)
            .build();
    return updateSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   UpdateSessionEntityTypeRequest request =
   *       UpdateSessionEntityTypeRequest.newBuilder()
   *           .setSessionEntityType(SessionEntityType.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   SessionEntityType response = sessionEntityTypesClient.updateSessionEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SessionEntityType updateSessionEntityType(UpdateSessionEntityTypeRequest request) {
    return updateSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   UpdateSessionEntityTypeRequest request =
   *       UpdateSessionEntityTypeRequest.newBuilder()
   *           .setSessionEntityType(SessionEntityType.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<SessionEntityType> future =
   *       sessionEntityTypesClient.updateSessionEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   SessionEntityType response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSessionEntityTypeRequest, SessionEntityType>
      updateSessionEntityTypeCallable() {
    return stub.updateSessionEntityTypeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   SessionEntityTypeName name =
   *       SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *           "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]");
   *   sessionEntityTypesClient.deleteSessionEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the session entity type to delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(SessionEntityTypeName name) {
    DeleteSessionEntityTypeRequest request =
        DeleteSessionEntityTypeRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   String name =
   *       SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *               "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *           .toString();
   *   sessionEntityTypesClient.deleteSessionEntityType(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the session entity type to delete. Format:
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`
   *     or
   *     `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/environments/&lt;EnvironmentID&gt;/sessions/&lt;SessionID&gt;/entityTypes/&lt;EntityTypeID&gt;`.
   *     If `Environment ID` is not specified, we assume default 'draft' environment.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(String name) {
    DeleteSessionEntityTypeRequest request =
        DeleteSessionEntityTypeRequest.newBuilder().setName(name).build();
    deleteSessionEntityType(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   DeleteSessionEntityTypeRequest request =
   *       DeleteSessionEntityTypeRequest.newBuilder()
   *           .setName(
   *               SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   sessionEntityTypesClient.deleteSessionEntityType(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSessionEntityType(DeleteSessionEntityTypeRequest request) {
    deleteSessionEntityTypeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified session entity type.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   DeleteSessionEntityTypeRequest request =
   *       DeleteSessionEntityTypeRequest.newBuilder()
   *           .setName(
   *               SessionEntityTypeName.ofProjectLocationAgentSessionEntityTypeName(
   *                       "[PROJECT]", "[LOCATION]", "[AGENT]", "[SESSION]", "[ENTITY_TYPE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       sessionEntityTypesClient.deleteSessionEntityTypeCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteSessionEntityTypeRequest, Empty>
      deleteSessionEntityTypeCallable() {
    return stub.deleteSessionEntityTypeCallable();
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
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : sessionEntityTypesClient.listLocations(request).iterateAll()) {
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
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       sessionEntityTypesClient.listLocationsPagedCallable().futureCall(request);
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
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response =
   *         sessionEntityTypesClient.listLocationsCallable().call(request);
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
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = sessionEntityTypesClient.getLocation(request);
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
   * try (SessionEntityTypesClient sessionEntityTypesClient = SessionEntityTypesClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future =
   *       sessionEntityTypesClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
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

  public static class ListSessionEntityTypesPagedResponse
      extends AbstractPagedListResponse<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage,
          ListSessionEntityTypesFixedSizeCollection> {

    public static ApiFuture<ListSessionEntityTypesPagedResponse> createAsync(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ApiFuture<ListSessionEntityTypesResponse> futureResponse) {
      ApiFuture<ListSessionEntityTypesPage> futurePage =
          ListSessionEntityTypesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListSessionEntityTypesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListSessionEntityTypesPagedResponse(ListSessionEntityTypesPage page) {
      super(page, ListSessionEntityTypesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSessionEntityTypesPage
      extends AbstractPage<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage> {

    private ListSessionEntityTypesPage(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ListSessionEntityTypesResponse response) {
      super(context, response);
    }

    private static ListSessionEntityTypesPage createEmptyPage() {
      return new ListSessionEntityTypesPage(null, null);
    }

    @Override
    protected ListSessionEntityTypesPage createPage(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ListSessionEntityTypesResponse response) {
      return new ListSessionEntityTypesPage(context, response);
    }

    @Override
    public ApiFuture<ListSessionEntityTypesPage> createPageAsync(
        PageContext<
                ListSessionEntityTypesRequest, ListSessionEntityTypesResponse, SessionEntityType>
            context,
        ApiFuture<ListSessionEntityTypesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSessionEntityTypesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSessionEntityTypesRequest,
          ListSessionEntityTypesResponse,
          SessionEntityType,
          ListSessionEntityTypesPage,
          ListSessionEntityTypesFixedSizeCollection> {

    private ListSessionEntityTypesFixedSizeCollection(
        List<ListSessionEntityTypesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSessionEntityTypesFixedSizeCollection createEmptyCollection() {
      return new ListSessionEntityTypesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSessionEntityTypesFixedSizeCollection createCollection(
        List<ListSessionEntityTypesPage> pages, int collectionSize) {
      return new ListSessionEntityTypesFixedSizeCollection(pages, collectionSize);
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
