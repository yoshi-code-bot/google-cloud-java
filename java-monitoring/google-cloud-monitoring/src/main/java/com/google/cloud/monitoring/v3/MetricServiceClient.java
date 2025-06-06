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

package com.google.cloud.monitoring.v3;

import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.monitoring.v3.stub.MetricServiceStub;
import com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.monitoring.v3.CreateMetricDescriptorRequest;
import com.google.monitoring.v3.CreateTimeSeriesRequest;
import com.google.monitoring.v3.DeleteMetricDescriptorRequest;
import com.google.monitoring.v3.GetMetricDescriptorRequest;
import com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ListMetricDescriptorsResponse;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse;
import com.google.monitoring.v3.ListTimeSeriesRequest;
import com.google.monitoring.v3.ListTimeSeriesResponse;
import com.google.monitoring.v3.MetricDescriptorName;
import com.google.monitoring.v3.MonitoredResourceDescriptorName;
import com.google.monitoring.v3.OrganizationName;
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.TimeInterval;
import com.google.monitoring.v3.TimeSeries;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Manages metric descriptors, monitored resource descriptors, and time series
 * data.
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
 * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
 *   MonitoredResourceDescriptorName name =
 *       MonitoredResourceDescriptorName.ofProjectMonitoredResourceDescriptorName(
 *           "[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
 *   MonitoredResourceDescriptor response =
 *       metricServiceClient.getMonitoredResourceDescriptor(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the MetricServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> ListMonitoredResourceDescriptors</td>
 *      <td><p> Lists monitored resource descriptors that match a filter.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listMonitoredResourceDescriptors(ListMonitoredResourceDescriptorsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listMonitoredResourceDescriptors(ResourceName name)
 *           <li><p> listMonitoredResourceDescriptors(OrganizationName name)
 *           <li><p> listMonitoredResourceDescriptors(ProjectName name)
 *           <li><p> listMonitoredResourceDescriptors(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listMonitoredResourceDescriptorsPagedCallable()
 *           <li><p> listMonitoredResourceDescriptorsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetMonitoredResourceDescriptor</td>
 *      <td><p> Gets a single monitored resource descriptor.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getMonitoredResourceDescriptor(GetMonitoredResourceDescriptorRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getMonitoredResourceDescriptor(MonitoredResourceDescriptorName name)
 *           <li><p> getMonitoredResourceDescriptor(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getMonitoredResourceDescriptorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListMetricDescriptors</td>
 *      <td><p> Lists metric descriptors that match a filter.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listMetricDescriptors(ListMetricDescriptorsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listMetricDescriptors(ResourceName name)
 *           <li><p> listMetricDescriptors(OrganizationName name)
 *           <li><p> listMetricDescriptors(ProjectName name)
 *           <li><p> listMetricDescriptors(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listMetricDescriptorsPagedCallable()
 *           <li><p> listMetricDescriptorsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetMetricDescriptor</td>
 *      <td><p> Gets a single metric descriptor.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getMetricDescriptor(GetMetricDescriptorRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getMetricDescriptor(MetricDescriptorName name)
 *           <li><p> getMetricDescriptor(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getMetricDescriptorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateMetricDescriptor</td>
 *      <td><p> Creates a new metric descriptor. The creation is executed asynchronously. User-created metric descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The metric descriptor is updated if it already exists, except that metric labels are never removed.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createMetricDescriptor(CreateMetricDescriptorRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createMetricDescriptor(ResourceName name, MetricDescriptor metricDescriptor)
 *           <li><p> createMetricDescriptor(OrganizationName name, MetricDescriptor metricDescriptor)
 *           <li><p> createMetricDescriptor(ProjectName name, MetricDescriptor metricDescriptor)
 *           <li><p> createMetricDescriptor(String name, MetricDescriptor metricDescriptor)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createMetricDescriptorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteMetricDescriptor</td>
 *      <td><p> Deletes a metric descriptor. Only user-created [custom metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteMetricDescriptor(DeleteMetricDescriptorRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteMetricDescriptor(MetricDescriptorName name)
 *           <li><p> deleteMetricDescriptor(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteMetricDescriptorCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListTimeSeries</td>
 *      <td><p> Lists time series that match a filter.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listTimeSeries(ListTimeSeriesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listTimeSeries(ResourceName name, String filter, TimeInterval interval, ListTimeSeriesRequest.TimeSeriesView view)
 *           <li><p> listTimeSeries(OrganizationName name, String filter, TimeInterval interval, ListTimeSeriesRequest.TimeSeriesView view)
 *           <li><p> listTimeSeries(ProjectName name, String filter, TimeInterval interval, ListTimeSeriesRequest.TimeSeriesView view)
 *           <li><p> listTimeSeries(String name, String filter, TimeInterval interval, ListTimeSeriesRequest.TimeSeriesView view)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listTimeSeriesPagedCallable()
 *           <li><p> listTimeSeriesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateTimeSeries</td>
 *      <td><p> Creates or adds data to one or more time series. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This method does not support [resource locations constraint of an organization policy](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createTimeSeries(CreateTimeSeriesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createTimeSeries(ProjectName name, List&lt;TimeSeries&gt; timeSeries)
 *           <li><p> createTimeSeries(String name, List&lt;TimeSeries&gt; timeSeries)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createTimeSeriesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateServiceTimeSeries</td>
 *      <td><p> Creates or adds data to one or more service time series. A service time series is a time series for a metric from a Google Cloud service. The response is empty if all time series in the request were written. If any time series could not be written, a corresponding failure message is included in the error response. This endpoint rejects writes to user-defined metrics. This method is only for use by Google Cloud services. Use [projects.timeSeries.create][google.monitoring.v3.MetricService.CreateTimeSeries] instead.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createServiceTimeSeries(CreateTimeSeriesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createServiceTimeSeries(ProjectName name, List&lt;TimeSeries&gt; timeSeries)
 *           <li><p> createServiceTimeSeries(String name, List&lt;TimeSeries&gt; timeSeries)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createServiceTimeSeriesCallable()
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
 * <p>This class can be customized by passing in a custom instance of MetricServiceSettings to
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
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MetricServiceClient metricServiceClient = MetricServiceClient.create(metricServiceSettings);
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
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MetricServiceClient metricServiceClient = MetricServiceClient.create(metricServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class MetricServiceClient implements BackgroundResource {
  private final MetricServiceSettings settings;
  private final MetricServiceStub stub;

  /** Constructs an instance of MetricServiceClient with default settings. */
  public static final MetricServiceClient create() throws IOException {
    return create(MetricServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MetricServiceClient create(MetricServiceSettings settings)
      throws IOException {
    return new MetricServiceClient(settings);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(MetricServiceSettings).
   */
  public static final MetricServiceClient create(MetricServiceStub stub) {
    return new MetricServiceClient(stub);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected MetricServiceClient(MetricServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((MetricServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected MetricServiceClient(MetricServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MetricServiceSettings getSettings() {
    return settings;
  }

  public MetricServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ResourceName name = ResourceName.of("[FOLDER]");
   *   for (MonitoredResourceDescriptor element :
   *       metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ResourceName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   OrganizationName name = OrganizationName.of("[ORGANIZATION]");
   *   for (MonitoredResourceDescriptor element :
   *       metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      OrganizationName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (MonitoredResourceDescriptor element :
   *       metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ProjectName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   for (MonitoredResourceDescriptor element :
   *       metricServiceClient.listMonitoredResourceDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      String name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder().setName(name).build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request =
   *       ListMonitoredResourceDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (MonitoredResourceDescriptor element :
   *       metricServiceClient.listMonitoredResourceDescriptors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ListMonitoredResourceDescriptorsRequest request) {
    return listMonitoredResourceDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request =
   *       ListMonitoredResourceDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<MonitoredResourceDescriptor> future =
   *       metricServiceClient.listMonitoredResourceDescriptorsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (MonitoredResourceDescriptor element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable() {
    return stub.listMonitoredResourceDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMonitoredResourceDescriptorsRequest request =
   *       ListMonitoredResourceDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListMonitoredResourceDescriptorsResponse response =
   *         metricServiceClient.listMonitoredResourceDescriptorsCallable().call(request);
   *     for (MonitoredResourceDescriptor element : response.getResourceDescriptorsList()) {
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
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return stub.listMonitoredResourceDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MonitoredResourceDescriptorName name =
   *       MonitoredResourceDescriptorName.ofProjectMonitoredResourceDescriptorName(
   *           "[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]");
   *   MonitoredResourceDescriptor response =
   *       metricServiceClient.getMonitoredResourceDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The monitored resource descriptor to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE]
   *     <p>The `[RESOURCE_TYPE]` is a predefined type, such as `cloudsql_database`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      MonitoredResourceDescriptorName name) {
    GetMonitoredResourceDescriptorRequest request =
        GetMonitoredResourceDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getMonitoredResourceDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name =
   *       MonitoredResourceDescriptorName.ofProjectMonitoredResourceDescriptorName(
   *               "[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")
   *           .toString();
   *   MonitoredResourceDescriptor response =
   *       metricServiceClient.getMonitoredResourceDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The monitored resource descriptor to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE]
   *     <p>The `[RESOURCE_TYPE]` is a predefined type, such as `cloudsql_database`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(String name) {
    GetMonitoredResourceDescriptorRequest request =
        GetMonitoredResourceDescriptorRequest.newBuilder().setName(name).build();
    return getMonitoredResourceDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   GetMonitoredResourceDescriptorRequest request =
   *       GetMonitoredResourceDescriptorRequest.newBuilder()
   *           .setName(
   *               MonitoredResourceDescriptorName.ofProjectMonitoredResourceDescriptorName(
   *                       "[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   MonitoredResourceDescriptor response =
   *       metricServiceClient.getMonitoredResourceDescriptor(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      GetMonitoredResourceDescriptorRequest request) {
    return getMonitoredResourceDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   GetMonitoredResourceDescriptorRequest request =
   *       GetMonitoredResourceDescriptorRequest.newBuilder()
   *           .setName(
   *               MonitoredResourceDescriptorName.ofProjectMonitoredResourceDescriptorName(
   *                       "[PROJECT]", "[MONITORED_RESOURCE_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   ApiFuture<MonitoredResourceDescriptor> future =
   *       metricServiceClient.getMonitoredResourceDescriptorCallable().futureCall(request);
   *   // Do something.
   *   MonitoredResourceDescriptor response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
      getMonitoredResourceDescriptorCallable() {
    return stub.getMonitoredResourceDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ResourceName name = ResourceName.of("[FOLDER]");
   *   for (MetricDescriptor element :
   *       metricServiceClient.listMetricDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(ResourceName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   OrganizationName name = OrganizationName.of("[ORGANIZATION]");
   *   for (MetricDescriptor element :
   *       metricServiceClient.listMetricDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(OrganizationName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   for (MetricDescriptor element :
   *       metricServiceClient.listMetricDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(ProjectName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   for (MetricDescriptor element :
   *       metricServiceClient.listMetricDescriptors(name).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(String name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder().setName(name).build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMetricDescriptorsRequest request =
   *       ListMetricDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setActiveOnly(true)
   *           .build();
   *   for (MetricDescriptor element :
   *       metricServiceClient.listMetricDescriptors(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(
      ListMetricDescriptorsRequest request) {
    return listMetricDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMetricDescriptorsRequest request =
   *       ListMetricDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setActiveOnly(true)
   *           .build();
   *   ApiFuture<MetricDescriptor> future =
   *       metricServiceClient.listMetricDescriptorsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (MetricDescriptor element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsPagedResponse>
      listMetricDescriptorsPagedCallable() {
    return stub.listMetricDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListMetricDescriptorsRequest request =
   *       ListMetricDescriptorsRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setActiveOnly(true)
   *           .build();
   *   while (true) {
   *     ListMetricDescriptorsResponse response =
   *         metricServiceClient.listMetricDescriptorsCallable().call(request);
   *     for (MetricDescriptor element : response.getMetricDescriptorsList()) {
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
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse>
      listMetricDescriptorsCallable() {
    return stub.listMetricDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name =
   *       MetricDescriptorName.ofProjectMetricDescriptorName("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   MetricDescriptor response = metricServiceClient.getMetricDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example value of `[METRIC_ID]` is
   *     `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(MetricDescriptorName name) {
    GetMetricDescriptorRequest request =
        GetMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name =
   *       MetricDescriptorName.ofProjectMetricDescriptorName("[PROJECT]", "[METRIC_DESCRIPTOR]")
   *           .toString();
   *   MetricDescriptor response = metricServiceClient.getMetricDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example value of `[METRIC_ID]` is
   *     `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(String name) {
    GetMetricDescriptorRequest request =
        GetMetricDescriptorRequest.newBuilder().setName(name).build();
    return getMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   GetMetricDescriptorRequest request =
   *       GetMetricDescriptorRequest.newBuilder()
   *           .setName(
   *               MetricDescriptorName.ofProjectMetricDescriptorName(
   *                       "[PROJECT]", "[METRIC_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   MetricDescriptor response = metricServiceClient.getMetricDescriptor(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(GetMetricDescriptorRequest request) {
    return getMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   GetMetricDescriptorRequest request =
   *       GetMetricDescriptorRequest.newBuilder()
   *           .setName(
   *               MetricDescriptorName.ofProjectMetricDescriptorName(
   *                       "[PROJECT]", "[METRIC_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   ApiFuture<MetricDescriptor> future =
   *       metricServiceClient.getMetricDescriptorCallable().futureCall(request);
   *   // Do something.
   *   MetricDescriptor response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMetricDescriptorRequest, MetricDescriptor>
      getMetricDescriptorCallable() {
    return stub.getMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ResourceName name = ResourceName.of("[FOLDER]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   MetricDescriptor response =
   *       metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is: 4 projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      ResourceName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   OrganizationName name = OrganizationName.of("[ORGANIZATION]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   MetricDescriptor response =
   *       metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is: 4 projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      OrganizationName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   MetricDescriptor response =
   *       metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is: 4 projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      ProjectName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   MetricDescriptor metricDescriptor = MetricDescriptor.newBuilder().build();
   *   MetricDescriptor response =
   *       metricServiceClient.createMetricDescriptor(name, metricDescriptor);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is: 4 projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      String name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name)
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateMetricDescriptorRequest request =
   *       CreateMetricDescriptorRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setMetricDescriptor(MetricDescriptor.newBuilder().build())
   *           .build();
   *   MetricDescriptor response = metricServiceClient.createMetricDescriptor(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(CreateMetricDescriptorRequest request) {
    return createMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. The creation is executed asynchronously. User-created metric
   * descriptors define [custom metrics](https://cloud.google.com/monitoring/custom-metrics). The
   * metric descriptor is updated if it already exists, except that metric labels are never removed.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateMetricDescriptorRequest request =
   *       CreateMetricDescriptorRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setMetricDescriptor(MetricDescriptor.newBuilder().build())
   *           .build();
   *   ApiFuture<MetricDescriptor> future =
   *       metricServiceClient.createMetricDescriptorCallable().futureCall(request);
   *   // Do something.
   *   MetricDescriptor response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateMetricDescriptorRequest, MetricDescriptor>
      createMetricDescriptorCallable() {
    return stub.createMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   MetricDescriptorName name =
   *       MetricDescriptorName.ofProjectMetricDescriptorName("[PROJECT]", "[METRIC_DESCRIPTOR]");
   *   metricServiceClient.deleteMetricDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example of `[METRIC_ID]` is: `"custom.googleapis.com/my_test_metric"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(MetricDescriptorName name) {
    DeleteMetricDescriptorRequest request =
        DeleteMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name =
   *       MetricDescriptorName.ofProjectMetricDescriptorName("[PROJECT]", "[METRIC_DESCRIPTOR]")
   *           .toString();
   *   metricServiceClient.deleteMetricDescriptor(name);
   * }
   * }</pre>
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example of `[METRIC_ID]` is: `"custom.googleapis.com/my_test_metric"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(String name) {
    DeleteMetricDescriptorRequest request =
        DeleteMetricDescriptorRequest.newBuilder().setName(name).build();
    deleteMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   DeleteMetricDescriptorRequest request =
   *       DeleteMetricDescriptorRequest.newBuilder()
   *           .setName(
   *               MetricDescriptorName.ofProjectMetricDescriptorName(
   *                       "[PROJECT]", "[METRIC_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   metricServiceClient.deleteMetricDescriptor(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(DeleteMetricDescriptorRequest request) {
    deleteMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   DeleteMetricDescriptorRequest request =
   *       DeleteMetricDescriptorRequest.newBuilder()
   *           .setName(
   *               MetricDescriptorName.ofProjectMetricDescriptorName(
   *                       "[PROJECT]", "[METRIC_DESCRIPTOR]")
   *                   .toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       metricServiceClient.deleteMetricDescriptorCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteMetricDescriptorRequest, Empty>
      deleteMetricDescriptorCallable() {
    return stub.deleteMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ResourceName name = ResourceName.of("[FOLDER]");
   *   String filter = "filter-1274492040";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.forNumber(0);
   *   for (TimeSeries element :
   *       metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   *     organization or folder on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] organizations/[ORGANIZATION_ID] folders/[FOLDER_ID]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      ResourceName name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   OrganizationName name = OrganizationName.of("[ORGANIZATION]");
   *   String filter = "filter-1274492040";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.forNumber(0);
   *   for (TimeSeries element :
   *       metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   *     organization or folder on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] organizations/[ORGANIZATION_ID] folders/[FOLDER_ID]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      OrganizationName name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   String filter = "filter-1274492040";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.forNumber(0);
   *   for (TimeSeries element :
   *       metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   *     organization or folder on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] organizations/[ORGANIZATION_ID] folders/[FOLDER_ID]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      ProjectName name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   String filter = "filter-1274492040";
   *   TimeInterval interval = TimeInterval.newBuilder().build();
   *   ListTimeSeriesRequest.TimeSeriesView view = ListTimeSeriesRequest.TimeSeriesView.forNumber(0);
   *   for (TimeSeries element :
   *       metricServiceClient.listTimeSeries(name, filter, interval, view).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name),
   *     organization or folder on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] organizations/[ORGANIZATION_ID] folders/[FOLDER_ID]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      String name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name)
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListTimeSeriesRequest request =
   *       ListTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setInterval(TimeInterval.newBuilder().build())
   *           .setAggregation(Aggregation.newBuilder().build())
   *           .setSecondaryAggregation(Aggregation.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (TimeSeries element : metricServiceClient.listTimeSeries(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(ListTimeSeriesRequest request) {
    return listTimeSeriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListTimeSeriesRequest request =
   *       ListTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setInterval(TimeInterval.newBuilder().build())
   *           .setAggregation(Aggregation.newBuilder().build())
   *           .setSecondaryAggregation(Aggregation.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<TimeSeries> future =
   *       metricServiceClient.listTimeSeriesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (TimeSeries element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesPagedResponse>
      listTimeSeriesPagedCallable() {
    return stub.listTimeSeriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ListTimeSeriesRequest request =
   *       ListTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .setFilter("filter-1274492040")
   *           .setInterval(TimeInterval.newBuilder().build())
   *           .setAggregation(Aggregation.newBuilder().build())
   *           .setSecondaryAggregation(Aggregation.newBuilder().build())
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListTimeSeriesResponse response =
   *         metricServiceClient.listTimeSeriesCallable().call(request);
   *     for (TimeSeries element : response.getTimeSeriesList()) {
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
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesResponse>
      listTimeSeriesCallable() {
    return stub.listTimeSeriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response. This method does not support [resource locations
   * constraint of an organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   List<TimeSeries> timeSeries = new ArrayList<>();
   *   metricServiceClient.createTimeSeries(name, timeSeries);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(ProjectName name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .addAllTimeSeries(timeSeries)
            .build();
    createTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response. This method does not support [resource locations
   * constraint of an organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   List<TimeSeries> timeSeries = new ArrayList<>();
   *   metricServiceClient.createTimeSeries(name, timeSeries);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(String name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder().setName(name).addAllTimeSeries(timeSeries).build();
    createTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response. This method does not support [resource locations
   * constraint of an organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateTimeSeriesRequest request =
   *       CreateTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .addAllTimeSeries(new ArrayList<TimeSeries>())
   *           .build();
   *   metricServiceClient.createTimeSeries(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(CreateTimeSeriesRequest request) {
    createTimeSeriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response. This method does not support [resource locations
   * constraint of an organization
   * policy](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations#setting_the_organization_policy).
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateTimeSeriesRequest request =
   *       CreateTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .addAllTimeSeries(new ArrayList<TimeSeries>())
   *           .build();
   *   ApiFuture<Empty> future = metricServiceClient.createTimeSeriesCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateTimeSeriesRequest, Empty> createTimeSeriesCallable() {
    return stub.createTimeSeriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more service time series. A service time series is a time series
   * for a metric from a Google Cloud service. The response is empty if all time series in the
   * request were written. If any time series could not be written, a corresponding failure message
   * is included in the error response. This endpoint rejects writes to user-defined metrics. This
   * method is only for use by Google Cloud services. Use
   * [projects.timeSeries.create][google.monitoring.v3.MetricService.CreateTimeSeries] instead.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   ProjectName name = ProjectName.of("[PROJECT]");
   *   List<TimeSeries> timeSeries = new ArrayList<>();
   *   metricServiceClient.createServiceTimeSeries(name, timeSeries);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createServiceTimeSeries(ProjectName name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .addAllTimeSeries(timeSeries)
            .build();
    createServiceTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more service time series. A service time series is a time series
   * for a metric from a Google Cloud service. The response is empty if all time series in the
   * request were written. If any time series could not be written, a corresponding failure message
   * is included in the error response. This endpoint rejects writes to user-defined metrics. This
   * method is only for use by Google Cloud services. Use
   * [projects.timeSeries.create][google.monitoring.v3.MetricService.CreateTimeSeries] instead.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   String name = ProjectName.of("[PROJECT]").toString();
   *   List<TimeSeries> timeSeries = new ArrayList<>();
   *   metricServiceClient.createServiceTimeSeries(name, timeSeries);
   * }
   * }</pre>
   *
   * @param name Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   *     which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createServiceTimeSeries(String name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder().setName(name).addAllTimeSeries(timeSeries).build();
    createServiceTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more service time series. A service time series is a time series
   * for a metric from a Google Cloud service. The response is empty if all time series in the
   * request were written. If any time series could not be written, a corresponding failure message
   * is included in the error response. This endpoint rejects writes to user-defined metrics. This
   * method is only for use by Google Cloud services. Use
   * [projects.timeSeries.create][google.monitoring.v3.MetricService.CreateTimeSeries] instead.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateTimeSeriesRequest request =
   *       CreateTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .addAllTimeSeries(new ArrayList<TimeSeries>())
   *           .build();
   *   metricServiceClient.createServiceTimeSeries(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createServiceTimeSeries(CreateTimeSeriesRequest request) {
    createServiceTimeSeriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more service time series. A service time series is a time series
   * for a metric from a Google Cloud service. The response is empty if all time series in the
   * request were written. If any time series could not be written, a corresponding failure message
   * is included in the error response. This endpoint rejects writes to user-defined metrics. This
   * method is only for use by Google Cloud services. Use
   * [projects.timeSeries.create][google.monitoring.v3.MetricService.CreateTimeSeries] instead.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
   *   CreateTimeSeriesRequest request =
   *       CreateTimeSeriesRequest.newBuilder()
   *           .setName(ProjectName.of("[PROJECT]").toString())
   *           .addAllTimeSeries(new ArrayList<TimeSeries>())
   *           .build();
   *   ApiFuture<Empty> future =
   *       metricServiceClient.createServiceTimeSeriesCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateTimeSeriesRequest, Empty> createServiceTimeSeriesCallable() {
    return stub.createServiceTimeSeriesCallable();
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

  public static class ListMonitoredResourceDescriptorsPagedResponse
      extends AbstractPagedListResponse<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage,
          ListMonitoredResourceDescriptorsFixedSizeCollection> {

    public static ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> createAsync(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
      ApiFuture<ListMonitoredResourceDescriptorsPage> futurePage =
          ListMonitoredResourceDescriptorsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListMonitoredResourceDescriptorsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListMonitoredResourceDescriptorsPagedResponse(
        ListMonitoredResourceDescriptorsPage page) {
      super(page, ListMonitoredResourceDescriptorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMonitoredResourceDescriptorsPage
      extends AbstractPage<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage> {

    private ListMonitoredResourceDescriptorsPage(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ListMonitoredResourceDescriptorsResponse response) {
      super(context, response);
    }

    private static ListMonitoredResourceDescriptorsPage createEmptyPage() {
      return new ListMonitoredResourceDescriptorsPage(null, null);
    }

    @Override
    protected ListMonitoredResourceDescriptorsPage createPage(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ListMonitoredResourceDescriptorsResponse response) {
      return new ListMonitoredResourceDescriptorsPage(context, response);
    }

    @Override
    public ApiFuture<ListMonitoredResourceDescriptorsPage> createPageAsync(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMonitoredResourceDescriptorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage,
          ListMonitoredResourceDescriptorsFixedSizeCollection> {

    private ListMonitoredResourceDescriptorsFixedSizeCollection(
        List<ListMonitoredResourceDescriptorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMonitoredResourceDescriptorsFixedSizeCollection createEmptyCollection() {
      return new ListMonitoredResourceDescriptorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMonitoredResourceDescriptorsFixedSizeCollection createCollection(
        List<ListMonitoredResourceDescriptorsPage> pages, int collectionSize) {
      return new ListMonitoredResourceDescriptorsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListMetricDescriptorsPagedResponse
      extends AbstractPagedListResponse<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage,
          ListMetricDescriptorsFixedSizeCollection> {

    public static ApiFuture<ListMetricDescriptorsPagedResponse> createAsync(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ApiFuture<ListMetricDescriptorsResponse> futureResponse) {
      ApiFuture<ListMetricDescriptorsPage> futurePage =
          ListMetricDescriptorsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListMetricDescriptorsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListMetricDescriptorsPagedResponse(ListMetricDescriptorsPage page) {
      super(page, ListMetricDescriptorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMetricDescriptorsPage
      extends AbstractPage<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage> {

    private ListMetricDescriptorsPage(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ListMetricDescriptorsResponse response) {
      super(context, response);
    }

    private static ListMetricDescriptorsPage createEmptyPage() {
      return new ListMetricDescriptorsPage(null, null);
    }

    @Override
    protected ListMetricDescriptorsPage createPage(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ListMetricDescriptorsResponse response) {
      return new ListMetricDescriptorsPage(context, response);
    }

    @Override
    public ApiFuture<ListMetricDescriptorsPage> createPageAsync(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ApiFuture<ListMetricDescriptorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMetricDescriptorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage,
          ListMetricDescriptorsFixedSizeCollection> {

    private ListMetricDescriptorsFixedSizeCollection(
        List<ListMetricDescriptorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMetricDescriptorsFixedSizeCollection createEmptyCollection() {
      return new ListMetricDescriptorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMetricDescriptorsFixedSizeCollection createCollection(
        List<ListMetricDescriptorsPage> pages, int collectionSize) {
      return new ListMetricDescriptorsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListTimeSeriesPagedResponse
      extends AbstractPagedListResponse<
          ListTimeSeriesRequest,
          ListTimeSeriesResponse,
          TimeSeries,
          ListTimeSeriesPage,
          ListTimeSeriesFixedSizeCollection> {

    public static ApiFuture<ListTimeSeriesPagedResponse> createAsync(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ApiFuture<ListTimeSeriesResponse> futureResponse) {
      ApiFuture<ListTimeSeriesPage> futurePage =
          ListTimeSeriesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListTimeSeriesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListTimeSeriesPagedResponse(ListTimeSeriesPage page) {
      super(page, ListTimeSeriesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTimeSeriesPage
      extends AbstractPage<
          ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries, ListTimeSeriesPage> {

    private ListTimeSeriesPage(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ListTimeSeriesResponse response) {
      super(context, response);
    }

    private static ListTimeSeriesPage createEmptyPage() {
      return new ListTimeSeriesPage(null, null);
    }

    @Override
    protected ListTimeSeriesPage createPage(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ListTimeSeriesResponse response) {
      return new ListTimeSeriesPage(context, response);
    }

    @Override
    public ApiFuture<ListTimeSeriesPage> createPageAsync(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ApiFuture<ListTimeSeriesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTimeSeriesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTimeSeriesRequest,
          ListTimeSeriesResponse,
          TimeSeries,
          ListTimeSeriesPage,
          ListTimeSeriesFixedSizeCollection> {

    private ListTimeSeriesFixedSizeCollection(List<ListTimeSeriesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTimeSeriesFixedSizeCollection createEmptyCollection() {
      return new ListTimeSeriesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTimeSeriesFixedSizeCollection createCollection(
        List<ListTimeSeriesPage> pages, int collectionSize) {
      return new ListTimeSeriesFixedSizeCollection(pages, collectionSize);
    }
  }
}
