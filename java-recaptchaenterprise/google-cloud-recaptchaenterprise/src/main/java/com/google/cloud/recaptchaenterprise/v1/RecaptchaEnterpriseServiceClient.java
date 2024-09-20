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

package com.google.cloud.recaptchaenterprise.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.recaptchaenterprise.v1.stub.RecaptchaEnterpriseServiceStub;
import com.google.cloud.recaptchaenterprise.v1.stub.RecaptchaEnterpriseServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.recaptchaenterprise.v1.AddIpOverrideRequest;
import com.google.recaptchaenterprise.v1.AddIpOverrideResponse;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentResponse;
import com.google.recaptchaenterprise.v1.Assessment;
import com.google.recaptchaenterprise.v1.AssessmentName;
import com.google.recaptchaenterprise.v1.CreateAssessmentRequest;
import com.google.recaptchaenterprise.v1.CreateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.CreateKeyRequest;
import com.google.recaptchaenterprise.v1.DeleteFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.DeleteKeyRequest;
import com.google.recaptchaenterprise.v1.FirewallPolicy;
import com.google.recaptchaenterprise.v1.FirewallPolicyName;
import com.google.recaptchaenterprise.v1.GetFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.GetKeyRequest;
import com.google.recaptchaenterprise.v1.GetMetricsRequest;
import com.google.recaptchaenterprise.v1.IpOverrideData;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.KeyName;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.ListKeysRequest;
import com.google.recaptchaenterprise.v1.ListKeysResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse;
import com.google.recaptchaenterprise.v1.Metrics;
import com.google.recaptchaenterprise.v1.MetricsName;
import com.google.recaptchaenterprise.v1.MigrateKeyRequest;
import com.google.recaptchaenterprise.v1.ProjectName;
import com.google.recaptchaenterprise.v1.RelatedAccountGroup;
import com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership;
import com.google.recaptchaenterprise.v1.RelatedAccountGroupName;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyRequest;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.UpdateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.UpdateKeyRequest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Service to determine the likelihood an event is legitimate.
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
 * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
 *     RecaptchaEnterpriseServiceClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Assessment assessment = Assessment.newBuilder().build();
 *   Assessment response = recaptchaEnterpriseServiceClient.createAssessment(parent, assessment);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the RecaptchaEnterpriseServiceClient object to clean up
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
 *      <td><p> CreateAssessment</td>
 *      <td><p> Creates an Assessment of the likelihood an event is legitimate.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createAssessment(CreateAssessmentRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createAssessment(ProjectName parent, Assessment assessment)
 *           <li><p> createAssessment(String parent, Assessment assessment)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createAssessmentCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> AnnotateAssessment</td>
 *      <td><p> Annotates a previously created Assessment to provide additional information on whether the event turned out to be authentic or fraudulent.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> annotateAssessment(AnnotateAssessmentRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> annotateAssessment(AssessmentName name, AnnotateAssessmentRequest.Annotation annotation)
 *           <li><p> annotateAssessment(String name, AnnotateAssessmentRequest.Annotation annotation)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> annotateAssessmentCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateKey</td>
 *      <td><p> Creates a new reCAPTCHA Enterprise key.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createKey(CreateKeyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createKey(ProjectName parent, Key key)
 *           <li><p> createKey(String parent, Key key)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListKeys</td>
 *      <td><p> Returns the list of all keys that belong to a project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listKeys(ListKeysRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listKeys(ProjectName parent)
 *           <li><p> listKeys(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listKeysPagedCallable()
 *           <li><p> listKeysCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> RetrieveLegacySecretKey</td>
 *      <td><p> Returns the secret key related to the specified public key. You must use the legacy secret key only in a 3rd party integration with legacy reCAPTCHA.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> retrieveLegacySecretKey(RetrieveLegacySecretKeyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> retrieveLegacySecretKey(KeyName key)
 *           <li><p> retrieveLegacySecretKey(String key)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> retrieveLegacySecretKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetKey</td>
 *      <td><p> Returns the specified key.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getKey(GetKeyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getKey(KeyName name)
 *           <li><p> getKey(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateKey</td>
 *      <td><p> Updates the specified key.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateKey(UpdateKeyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateKey(Key key, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteKey</td>
 *      <td><p> Deletes the specified key.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteKey(DeleteKeyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteKey(KeyName name)
 *           <li><p> deleteKey(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> MigrateKey</td>
 *      <td><p> Migrates an existing key from reCAPTCHA to reCAPTCHA Enterprise. Once a key is migrated, it can be used from either product. SiteVerify requests are billed as CreateAssessment calls. You must be authenticated as one of the current owners of the reCAPTCHA Key, and your user must have the reCAPTCHA Enterprise Admin IAM role in the destination project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> migrateKey(MigrateKeyRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> migrateKeyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> AddIpOverride</td>
 *      <td><p> Adds an IP override to a key. The following restrictions hold:
 * <ul>
 * <li>  The maximum number of IP overrides per key is 100.
 * <li>  For any conflict (such as IP already exists or IP part of an existing   IP range), an error is returned.
 * </ul></td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> addIpOverride(AddIpOverrideRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> addIpOverride(KeyName name, IpOverrideData ipOverrideData)
 *           <li><p> addIpOverride(String name, IpOverrideData ipOverrideData)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> addIpOverrideCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetMetrics</td>
 *      <td><p> Get some aggregated metrics for a Key. This data can be used to build dashboards.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getMetrics(GetMetricsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getMetrics(MetricsName name)
 *           <li><p> getMetrics(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getMetricsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateFirewallPolicy</td>
 *      <td><p> Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can be executed. A project may have a maximum of 1000 policies.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createFirewallPolicy(CreateFirewallPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> createFirewallPolicy(ProjectName parent, FirewallPolicy firewallPolicy)
 *           <li><p> createFirewallPolicy(String parent, FirewallPolicy firewallPolicy)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createFirewallPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListFirewallPolicies</td>
 *      <td><p> Returns the list of all firewall policies that belong to a project.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listFirewallPolicies(ListFirewallPoliciesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listFirewallPolicies(ProjectName parent)
 *           <li><p> listFirewallPolicies(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listFirewallPoliciesPagedCallable()
 *           <li><p> listFirewallPoliciesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetFirewallPolicy</td>
 *      <td><p> Returns the specified firewall policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getFirewallPolicy(GetFirewallPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> getFirewallPolicy(FirewallPolicyName name)
 *           <li><p> getFirewallPolicy(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getFirewallPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateFirewallPolicy</td>
 *      <td><p> Updates the specified firewall policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateFirewallPolicy(UpdateFirewallPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> updateFirewallPolicy(FirewallPolicy firewallPolicy, FieldMask updateMask)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateFirewallPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteFirewallPolicy</td>
 *      <td><p> Deletes the specified firewall policy.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteFirewallPolicy(DeleteFirewallPolicyRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> deleteFirewallPolicy(FirewallPolicyName name)
 *           <li><p> deleteFirewallPolicy(String name)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteFirewallPolicyCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ReorderFirewallPolicies</td>
 *      <td><p> Reorders all firewall policies.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> reorderFirewallPolicies(ReorderFirewallPoliciesRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> reorderFirewallPolicies(ProjectName parent, List&lt;String&gt; names)
 *           <li><p> reorderFirewallPolicies(String parent, List&lt;String&gt; names)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> reorderFirewallPoliciesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListRelatedAccountGroups</td>
 *      <td><p> List groups of related accounts.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroups(ListRelatedAccountGroupsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroups(ProjectName parent)
 *           <li><p> listRelatedAccountGroups(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroupsPagedCallable()
 *           <li><p> listRelatedAccountGroupsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListRelatedAccountGroupMemberships</td>
 *      <td><p> Get memberships in a group of related accounts.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroupMemberships(ListRelatedAccountGroupMembershipsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroupMemberships(RelatedAccountGroupName parent)
 *           <li><p> listRelatedAccountGroupMemberships(String parent)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listRelatedAccountGroupMembershipsPagedCallable()
 *           <li><p> listRelatedAccountGroupMembershipsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SearchRelatedAccountGroupMemberships</td>
 *      <td><p> Search group memberships related to a given account.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> searchRelatedAccountGroupMemberships(SearchRelatedAccountGroupMembershipsRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> searchRelatedAccountGroupMemberships(ProjectName project, ByteString hashedAccountId)
 *           <li><p> searchRelatedAccountGroupMemberships(String project, ByteString hashedAccountId)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> searchRelatedAccountGroupMembershipsPagedCallable()
 *           <li><p> searchRelatedAccountGroupMembershipsCallable()
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
 * RecaptchaEnterpriseServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RecaptchaEnterpriseServiceSettings recaptchaEnterpriseServiceSettings =
 *     RecaptchaEnterpriseServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
 *     RecaptchaEnterpriseServiceClient.create(recaptchaEnterpriseServiceSettings);
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
 * RecaptchaEnterpriseServiceSettings recaptchaEnterpriseServiceSettings =
 *     RecaptchaEnterpriseServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
 *     RecaptchaEnterpriseServiceClient.create(recaptchaEnterpriseServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class RecaptchaEnterpriseServiceClient implements BackgroundResource {
  private final RecaptchaEnterpriseServiceSettings settings;
  private final RecaptchaEnterpriseServiceStub stub;

  /** Constructs an instance of RecaptchaEnterpriseServiceClient with default settings. */
  public static final RecaptchaEnterpriseServiceClient create() throws IOException {
    return create(RecaptchaEnterpriseServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RecaptchaEnterpriseServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final RecaptchaEnterpriseServiceClient create(
      RecaptchaEnterpriseServiceSettings settings) throws IOException {
    return new RecaptchaEnterpriseServiceClient(settings);
  }

  /**
   * Constructs an instance of RecaptchaEnterpriseServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer using create(RecaptchaEnterpriseServiceSettings).
   */
  public static final RecaptchaEnterpriseServiceClient create(RecaptchaEnterpriseServiceStub stub) {
    return new RecaptchaEnterpriseServiceClient(stub);
  }

  /**
   * Constructs an instance of RecaptchaEnterpriseServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected RecaptchaEnterpriseServiceClient(RecaptchaEnterpriseServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((RecaptchaEnterpriseServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected RecaptchaEnterpriseServiceClient(RecaptchaEnterpriseServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RecaptchaEnterpriseServiceSettings getSettings() {
    return settings;
  }

  public RecaptchaEnterpriseServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Assessment of the likelihood an event is legitimate.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Assessment assessment = Assessment.newBuilder().build();
   *   Assessment response = recaptchaEnterpriseServiceClient.createAssessment(parent, assessment);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project in which the assessment is created, in the
   *     format `projects/{project}`.
   * @param assessment Required. The assessment details.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Assessment createAssessment(ProjectName parent, Assessment assessment) {
    CreateAssessmentRequest request =
        CreateAssessmentRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setAssessment(assessment)
            .build();
    return createAssessment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Assessment of the likelihood an event is legitimate.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   Assessment assessment = Assessment.newBuilder().build();
   *   Assessment response = recaptchaEnterpriseServiceClient.createAssessment(parent, assessment);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project in which the assessment is created, in the
   *     format `projects/{project}`.
   * @param assessment Required. The assessment details.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Assessment createAssessment(String parent, Assessment assessment) {
    CreateAssessmentRequest request =
        CreateAssessmentRequest.newBuilder().setParent(parent).setAssessment(assessment).build();
    return createAssessment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Assessment of the likelihood an event is legitimate.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateAssessmentRequest request =
   *       CreateAssessmentRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setAssessment(Assessment.newBuilder().build())
   *           .build();
   *   Assessment response = recaptchaEnterpriseServiceClient.createAssessment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Assessment createAssessment(CreateAssessmentRequest request) {
    return createAssessmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates an Assessment of the likelihood an event is legitimate.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateAssessmentRequest request =
   *       CreateAssessmentRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setAssessment(Assessment.newBuilder().build())
   *           .build();
   *   ApiFuture<Assessment> future =
   *       recaptchaEnterpriseServiceClient.createAssessmentCallable().futureCall(request);
   *   // Do something.
   *   Assessment response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateAssessmentRequest, Assessment> createAssessmentCallable() {
    return stub.createAssessmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Annotates a previously created Assessment to provide additional information on whether the
   * event turned out to be authentic or fraudulent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   AssessmentName name = AssessmentName.of("[PROJECT]", "[ASSESSMENT]");
   *   AnnotateAssessmentRequest.Annotation annotation =
   *       AnnotateAssessmentRequest.Annotation.forNumber(0);
   *   AnnotateAssessmentResponse response =
   *       recaptchaEnterpriseServiceClient.annotateAssessment(name, annotation);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Assessment, in the format
   *     `projects/{project}/assessments/{assessment}`.
   * @param annotation Optional. The annotation that is assigned to the Event. This field can be
   *     left empty to provide reasons that apply to an event without concluding whether the event
   *     is legitimate or fraudulent.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotateAssessmentResponse annotateAssessment(
      AssessmentName name, AnnotateAssessmentRequest.Annotation annotation) {
    AnnotateAssessmentRequest request =
        AnnotateAssessmentRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setAnnotation(annotation)
            .build();
    return annotateAssessment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Annotates a previously created Assessment to provide additional information on whether the
   * event turned out to be authentic or fraudulent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = AssessmentName.of("[PROJECT]", "[ASSESSMENT]").toString();
   *   AnnotateAssessmentRequest.Annotation annotation =
   *       AnnotateAssessmentRequest.Annotation.forNumber(0);
   *   AnnotateAssessmentResponse response =
   *       recaptchaEnterpriseServiceClient.annotateAssessment(name, annotation);
   * }
   * }</pre>
   *
   * @param name Required. The resource name of the Assessment, in the format
   *     `projects/{project}/assessments/{assessment}`.
   * @param annotation Optional. The annotation that is assigned to the Event. This field can be
   *     left empty to provide reasons that apply to an event without concluding whether the event
   *     is legitimate or fraudulent.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotateAssessmentResponse annotateAssessment(
      String name, AnnotateAssessmentRequest.Annotation annotation) {
    AnnotateAssessmentRequest request =
        AnnotateAssessmentRequest.newBuilder().setName(name).setAnnotation(annotation).build();
    return annotateAssessment(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Annotates a previously created Assessment to provide additional information on whether the
   * event turned out to be authentic or fraudulent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   AnnotateAssessmentRequest request =
   *       AnnotateAssessmentRequest.newBuilder()
   *           .setName(AssessmentName.of("[PROJECT]", "[ASSESSMENT]").toString())
   *           .addAllReasons(new ArrayList<AnnotateAssessmentRequest.Reason>())
   *           .setAccountId("accountId-1827029976")
   *           .setHashedAccountId(ByteString.EMPTY)
   *           .setTransactionEvent(TransactionEvent.newBuilder().build())
   *           .build();
   *   AnnotateAssessmentResponse response =
   *       recaptchaEnterpriseServiceClient.annotateAssessment(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AnnotateAssessmentResponse annotateAssessment(AnnotateAssessmentRequest request) {
    return annotateAssessmentCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Annotates a previously created Assessment to provide additional information on whether the
   * event turned out to be authentic or fraudulent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   AnnotateAssessmentRequest request =
   *       AnnotateAssessmentRequest.newBuilder()
   *           .setName(AssessmentName.of("[PROJECT]", "[ASSESSMENT]").toString())
   *           .addAllReasons(new ArrayList<AnnotateAssessmentRequest.Reason>())
   *           .setAccountId("accountId-1827029976")
   *           .setHashedAccountId(ByteString.EMPTY)
   *           .setTransactionEvent(TransactionEvent.newBuilder().build())
   *           .build();
   *   ApiFuture<AnnotateAssessmentResponse> future =
   *       recaptchaEnterpriseServiceClient.annotateAssessmentCallable().futureCall(request);
   *   // Do something.
   *   AnnotateAssessmentResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
      annotateAssessmentCallable() {
    return stub.annotateAssessmentCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new reCAPTCHA Enterprise key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Key key = Key.newBuilder().build();
   *   Key response = recaptchaEnterpriseServiceClient.createKey(parent, key);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project in which the key is created, in the format
   *     `projects/{project}`.
   * @param key Required. Information to create a reCAPTCHA Enterprise key.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key createKey(ProjectName parent, Key key) {
    CreateKeyRequest request =
        CreateKeyRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setKey(key)
            .build();
    return createKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new reCAPTCHA Enterprise key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   Key key = Key.newBuilder().build();
   *   Key response = recaptchaEnterpriseServiceClient.createKey(parent, key);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project in which the key is created, in the format
   *     `projects/{project}`.
   * @param key Required. Information to create a reCAPTCHA Enterprise key.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key createKey(String parent, Key key) {
    CreateKeyRequest request = CreateKeyRequest.newBuilder().setParent(parent).setKey(key).build();
    return createKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new reCAPTCHA Enterprise key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateKeyRequest request =
   *       CreateKeyRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setKey(Key.newBuilder().build())
   *           .build();
   *   Key response = recaptchaEnterpriseServiceClient.createKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key createKey(CreateKeyRequest request) {
    return createKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new reCAPTCHA Enterprise key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateKeyRequest request =
   *       CreateKeyRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setKey(Key.newBuilder().build())
   *           .build();
   *   ApiFuture<Key> future =
   *       recaptchaEnterpriseServiceClient.createKeyCallable().futureCall(request);
   *   // Do something.
   *   Key response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateKeyRequest, Key> createKeyCallable() {
    return stub.createKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all keys that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Key element : recaptchaEnterpriseServiceClient.listKeys(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project that contains the keys that are listed, in the
   *     format `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListKeysPagedResponse listKeys(ProjectName parent) {
    ListKeysRequest request =
        ListKeysRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listKeys(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all keys that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   for (Key element : recaptchaEnterpriseServiceClient.listKeys(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project that contains the keys that are listed, in the
   *     format `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListKeysPagedResponse listKeys(String parent) {
    ListKeysRequest request = ListKeysRequest.newBuilder().setParent(parent).build();
    return listKeys(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all keys that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListKeysRequest request =
   *       ListKeysRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Key element : recaptchaEnterpriseServiceClient.listKeys(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListKeysPagedResponse listKeys(ListKeysRequest request) {
    return listKeysPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all keys that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListKeysRequest request =
   *       ListKeysRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Key> future =
   *       recaptchaEnterpriseServiceClient.listKeysPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Key element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListKeysRequest, ListKeysPagedResponse> listKeysPagedCallable() {
    return stub.listKeysPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all keys that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListKeysRequest request =
   *       ListKeysRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListKeysResponse response =
   *         recaptchaEnterpriseServiceClient.listKeysCallable().call(request);
   *     for (Key element : response.getKeysList()) {
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
  public final UnaryCallable<ListKeysRequest, ListKeysResponse> listKeysCallable() {
    return stub.listKeysCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the secret key related to the specified public key. You must use the legacy secret key
   * only in a 3rd party integration with legacy reCAPTCHA.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   KeyName key = KeyName.of("[PROJECT]", "[KEY]");
   *   RetrieveLegacySecretKeyResponse response =
   *       recaptchaEnterpriseServiceClient.retrieveLegacySecretKey(key);
   * }
   * }</pre>
   *
   * @param key Required. The public key name linked to the requested secret key in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RetrieveLegacySecretKeyResponse retrieveLegacySecretKey(KeyName key) {
    RetrieveLegacySecretKeyRequest request =
        RetrieveLegacySecretKeyRequest.newBuilder()
            .setKey(key == null ? null : key.toString())
            .build();
    return retrieveLegacySecretKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the secret key related to the specified public key. You must use the legacy secret key
   * only in a 3rd party integration with legacy reCAPTCHA.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String key = KeyName.of("[PROJECT]", "[KEY]").toString();
   *   RetrieveLegacySecretKeyResponse response =
   *       recaptchaEnterpriseServiceClient.retrieveLegacySecretKey(key);
   * }
   * }</pre>
   *
   * @param key Required. The public key name linked to the requested secret key in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RetrieveLegacySecretKeyResponse retrieveLegacySecretKey(String key) {
    RetrieveLegacySecretKeyRequest request =
        RetrieveLegacySecretKeyRequest.newBuilder().setKey(key).build();
    return retrieveLegacySecretKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the secret key related to the specified public key. You must use the legacy secret key
   * only in a 3rd party integration with legacy reCAPTCHA.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   RetrieveLegacySecretKeyRequest request =
   *       RetrieveLegacySecretKeyRequest.newBuilder()
   *           .setKey(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   RetrieveLegacySecretKeyResponse response =
   *       recaptchaEnterpriseServiceClient.retrieveLegacySecretKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final RetrieveLegacySecretKeyResponse retrieveLegacySecretKey(
      RetrieveLegacySecretKeyRequest request) {
    return retrieveLegacySecretKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the secret key related to the specified public key. You must use the legacy secret key
   * only in a 3rd party integration with legacy reCAPTCHA.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   RetrieveLegacySecretKeyRequest request =
   *       RetrieveLegacySecretKeyRequest.newBuilder()
   *           .setKey(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   ApiFuture<RetrieveLegacySecretKeyResponse> future =
   *       recaptchaEnterpriseServiceClient.retrieveLegacySecretKeyCallable().futureCall(request);
   *   // Do something.
   *   RetrieveLegacySecretKeyResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
      retrieveLegacySecretKeyCallable() {
    return stub.retrieveLegacySecretKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   KeyName name = KeyName.of("[PROJECT]", "[KEY]");
   *   Key response = recaptchaEnterpriseServiceClient.getKey(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested key, in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key getKey(KeyName name) {
    GetKeyRequest request =
        GetKeyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = KeyName.of("[PROJECT]", "[KEY]").toString();
   *   Key response = recaptchaEnterpriseServiceClient.getKey(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested key, in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key getKey(String name) {
    GetKeyRequest request = GetKeyRequest.newBuilder().setName(name).build();
    return getKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetKeyRequest request =
   *       GetKeyRequest.newBuilder().setName(KeyName.of("[PROJECT]", "[KEY]").toString()).build();
   *   Key response = recaptchaEnterpriseServiceClient.getKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key getKey(GetKeyRequest request) {
    return getKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetKeyRequest request =
   *       GetKeyRequest.newBuilder().setName(KeyName.of("[PROJECT]", "[KEY]").toString()).build();
   *   ApiFuture<Key> future = recaptchaEnterpriseServiceClient.getKeyCallable().futureCall(request);
   *   // Do something.
   *   Key response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetKeyRequest, Key> getKeyCallable() {
    return stub.getKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   Key key = Key.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Key response = recaptchaEnterpriseServiceClient.updateKey(key, updateMask);
   * }
   * }</pre>
   *
   * @param key Required. The key to update.
   * @param updateMask Optional. The mask to control which fields of the key get updated. If the
   *     mask is not present, all fields are updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key updateKey(Key key, FieldMask updateMask) {
    UpdateKeyRequest request =
        UpdateKeyRequest.newBuilder().setKey(key).setUpdateMask(updateMask).build();
    return updateKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   UpdateKeyRequest request =
   *       UpdateKeyRequest.newBuilder()
   *           .setKey(Key.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Key response = recaptchaEnterpriseServiceClient.updateKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key updateKey(UpdateKeyRequest request) {
    return updateKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   UpdateKeyRequest request =
   *       UpdateKeyRequest.newBuilder()
   *           .setKey(Key.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Key> future =
   *       recaptchaEnterpriseServiceClient.updateKeyCallable().futureCall(request);
   *   // Do something.
   *   Key response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateKeyRequest, Key> updateKeyCallable() {
    return stub.updateKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   KeyName name = KeyName.of("[PROJECT]", "[KEY]");
   *   recaptchaEnterpriseServiceClient.deleteKey(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the key to be deleted, in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteKey(KeyName name) {
    DeleteKeyRequest request =
        DeleteKeyRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = KeyName.of("[PROJECT]", "[KEY]").toString();
   *   recaptchaEnterpriseServiceClient.deleteKey(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the key to be deleted, in the format
   *     `projects/{project}/keys/{key}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteKey(String name) {
    DeleteKeyRequest request = DeleteKeyRequest.newBuilder().setName(name).build();
    deleteKey(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   DeleteKeyRequest request =
   *       DeleteKeyRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   recaptchaEnterpriseServiceClient.deleteKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteKey(DeleteKeyRequest request) {
    deleteKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified key.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   DeleteKeyRequest request =
   *       DeleteKeyRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       recaptchaEnterpriseServiceClient.deleteKeyCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteKeyRequest, Empty> deleteKeyCallable() {
    return stub.deleteKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Migrates an existing key from reCAPTCHA to reCAPTCHA Enterprise. Once a key is migrated, it can
   * be used from either product. SiteVerify requests are billed as CreateAssessment calls. You must
   * be authenticated as one of the current owners of the reCAPTCHA Key, and your user must have the
   * reCAPTCHA Enterprise Admin IAM role in the destination project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   MigrateKeyRequest request =
   *       MigrateKeyRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .setSkipBillingCheck(true)
   *           .build();
   *   Key response = recaptchaEnterpriseServiceClient.migrateKey(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Key migrateKey(MigrateKeyRequest request) {
    return migrateKeyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Migrates an existing key from reCAPTCHA to reCAPTCHA Enterprise. Once a key is migrated, it can
   * be used from either product. SiteVerify requests are billed as CreateAssessment calls. You must
   * be authenticated as one of the current owners of the reCAPTCHA Key, and your user must have the
   * reCAPTCHA Enterprise Admin IAM role in the destination project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   MigrateKeyRequest request =
   *       MigrateKeyRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .setSkipBillingCheck(true)
   *           .build();
   *   ApiFuture<Key> future =
   *       recaptchaEnterpriseServiceClient.migrateKeyCallable().futureCall(request);
   *   // Do something.
   *   Key response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<MigrateKeyRequest, Key> migrateKeyCallable() {
    return stub.migrateKeyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds an IP override to a key. The following restrictions hold:
   *
   * <ul>
   *   <li>The maximum number of IP overrides per key is 100.
   *   <li>For any conflict (such as IP already exists or IP part of an existing IP range), an error
   *       is returned.
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
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   KeyName name = KeyName.of("[PROJECT]", "[KEY]");
   *   IpOverrideData ipOverrideData = IpOverrideData.newBuilder().build();
   *   AddIpOverrideResponse response =
   *       recaptchaEnterpriseServiceClient.addIpOverride(name, ipOverrideData);
   * }
   * }</pre>
   *
   * @param name Required. The name of the key to which the IP override is added, in the format
   *     `projects/{project}/keys/{key}`.
   * @param ipOverrideData Required. IP override added to the key.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddIpOverrideResponse addIpOverride(KeyName name, IpOverrideData ipOverrideData) {
    AddIpOverrideRequest request =
        AddIpOverrideRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setIpOverrideData(ipOverrideData)
            .build();
    return addIpOverride(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds an IP override to a key. The following restrictions hold:
   *
   * <ul>
   *   <li>The maximum number of IP overrides per key is 100.
   *   <li>For any conflict (such as IP already exists or IP part of an existing IP range), an error
   *       is returned.
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
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = KeyName.of("[PROJECT]", "[KEY]").toString();
   *   IpOverrideData ipOverrideData = IpOverrideData.newBuilder().build();
   *   AddIpOverrideResponse response =
   *       recaptchaEnterpriseServiceClient.addIpOverride(name, ipOverrideData);
   * }
   * }</pre>
   *
   * @param name Required. The name of the key to which the IP override is added, in the format
   *     `projects/{project}/keys/{key}`.
   * @param ipOverrideData Required. IP override added to the key.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddIpOverrideResponse addIpOverride(String name, IpOverrideData ipOverrideData) {
    AddIpOverrideRequest request =
        AddIpOverrideRequest.newBuilder().setName(name).setIpOverrideData(ipOverrideData).build();
    return addIpOverride(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds an IP override to a key. The following restrictions hold:
   *
   * <ul>
   *   <li>The maximum number of IP overrides per key is 100.
   *   <li>For any conflict (such as IP already exists or IP part of an existing IP range), an error
   *       is returned.
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
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   AddIpOverrideRequest request =
   *       AddIpOverrideRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .setIpOverrideData(IpOverrideData.newBuilder().build())
   *           .build();
   *   AddIpOverrideResponse response = recaptchaEnterpriseServiceClient.addIpOverride(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AddIpOverrideResponse addIpOverride(AddIpOverrideRequest request) {
    return addIpOverrideCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Adds an IP override to a key. The following restrictions hold:
   *
   * <ul>
   *   <li>The maximum number of IP overrides per key is 100.
   *   <li>For any conflict (such as IP already exists or IP part of an existing IP range), an error
   *       is returned.
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
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   AddIpOverrideRequest request =
   *       AddIpOverrideRequest.newBuilder()
   *           .setName(KeyName.of("[PROJECT]", "[KEY]").toString())
   *           .setIpOverrideData(IpOverrideData.newBuilder().build())
   *           .build();
   *   ApiFuture<AddIpOverrideResponse> future =
   *       recaptchaEnterpriseServiceClient.addIpOverrideCallable().futureCall(request);
   *   // Do something.
   *   AddIpOverrideResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<AddIpOverrideRequest, AddIpOverrideResponse> addIpOverrideCallable() {
    return stub.addIpOverrideCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get some aggregated metrics for a Key. This data can be used to build dashboards.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   MetricsName name = MetricsName.of("[PROJECT]", "[KEY]");
   *   Metrics response = recaptchaEnterpriseServiceClient.getMetrics(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested metrics, in the format
   *     `projects/{project}/keys/{key}/metrics`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Metrics getMetrics(MetricsName name) {
    GetMetricsRequest request =
        GetMetricsRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get some aggregated metrics for a Key. This data can be used to build dashboards.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = MetricsName.of("[PROJECT]", "[KEY]").toString();
   *   Metrics response = recaptchaEnterpriseServiceClient.getMetrics(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested metrics, in the format
   *     `projects/{project}/keys/{key}/metrics`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Metrics getMetrics(String name) {
    GetMetricsRequest request = GetMetricsRequest.newBuilder().setName(name).build();
    return getMetrics(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get some aggregated metrics for a Key. This data can be used to build dashboards.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetMetricsRequest request =
   *       GetMetricsRequest.newBuilder()
   *           .setName(MetricsName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   Metrics response = recaptchaEnterpriseServiceClient.getMetrics(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Metrics getMetrics(GetMetricsRequest request) {
    return getMetricsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get some aggregated metrics for a Key. This data can be used to build dashboards.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetMetricsRequest request =
   *       GetMetricsRequest.newBuilder()
   *           .setName(MetricsName.of("[PROJECT]", "[KEY]").toString())
   *           .build();
   *   ApiFuture<Metrics> future =
   *       recaptchaEnterpriseServiceClient.getMetricsCallable().futureCall(request);
   *   // Do something.
   *   Metrics response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetMetricsRequest, Metrics> getMetricsCallable() {
    return stub.getMetricsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can
   * be executed. A project may have a maximum of 1000 policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   FirewallPolicy firewallPolicy = FirewallPolicy.newBuilder().build();
   *   FirewallPolicy response =
   *       recaptchaEnterpriseServiceClient.createFirewallPolicy(parent, firewallPolicy);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project this policy will apply to, in the format
   *     `projects/{project}`.
   * @param firewallPolicy Required. Information to create the policy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy createFirewallPolicy(
      ProjectName parent, FirewallPolicy firewallPolicy) {
    CreateFirewallPolicyRequest request =
        CreateFirewallPolicyRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setFirewallPolicy(firewallPolicy)
            .build();
    return createFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can
   * be executed. A project may have a maximum of 1000 policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   FirewallPolicy firewallPolicy = FirewallPolicy.newBuilder().build();
   *   FirewallPolicy response =
   *       recaptchaEnterpriseServiceClient.createFirewallPolicy(parent, firewallPolicy);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project this policy will apply to, in the format
   *     `projects/{project}`.
   * @param firewallPolicy Required. Information to create the policy.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy createFirewallPolicy(String parent, FirewallPolicy firewallPolicy) {
    CreateFirewallPolicyRequest request =
        CreateFirewallPolicyRequest.newBuilder()
            .setParent(parent)
            .setFirewallPolicy(firewallPolicy)
            .build();
    return createFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can
   * be executed. A project may have a maximum of 1000 policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateFirewallPolicyRequest request =
   *       CreateFirewallPolicyRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setFirewallPolicy(FirewallPolicy.newBuilder().build())
   *           .build();
   *   FirewallPolicy response = recaptchaEnterpriseServiceClient.createFirewallPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy createFirewallPolicy(CreateFirewallPolicyRequest request) {
    return createFirewallPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new FirewallPolicy, specifying conditions at which reCAPTCHA Enterprise actions can
   * be executed. A project may have a maximum of 1000 policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   CreateFirewallPolicyRequest request =
   *       CreateFirewallPolicyRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setFirewallPolicy(FirewallPolicy.newBuilder().build())
   *           .build();
   *   ApiFuture<FirewallPolicy> future =
   *       recaptchaEnterpriseServiceClient.createFirewallPolicyCallable().futureCall(request);
   *   // Do something.
   *   FirewallPolicy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateFirewallPolicyRequest, FirewallPolicy>
      createFirewallPolicyCallable() {
    return stub.createFirewallPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all firewall policies that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (FirewallPolicy element :
   *       recaptchaEnterpriseServiceClient.listFirewallPolicies(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list the policies for, in the format
   *     `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFirewallPoliciesPagedResponse listFirewallPolicies(ProjectName parent) {
    ListFirewallPoliciesRequest request =
        ListFirewallPoliciesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listFirewallPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all firewall policies that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   for (FirewallPolicy element :
   *       recaptchaEnterpriseServiceClient.listFirewallPolicies(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list the policies for, in the format
   *     `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFirewallPoliciesPagedResponse listFirewallPolicies(String parent) {
    ListFirewallPoliciesRequest request =
        ListFirewallPoliciesRequest.newBuilder().setParent(parent).build();
    return listFirewallPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all firewall policies that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListFirewallPoliciesRequest request =
   *       ListFirewallPoliciesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (FirewallPolicy element :
   *       recaptchaEnterpriseServiceClient.listFirewallPolicies(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListFirewallPoliciesPagedResponse listFirewallPolicies(
      ListFirewallPoliciesRequest request) {
    return listFirewallPoliciesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all firewall policies that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListFirewallPoliciesRequest request =
   *       ListFirewallPoliciesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<FirewallPolicy> future =
   *       recaptchaEnterpriseServiceClient.listFirewallPoliciesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (FirewallPolicy element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListFirewallPoliciesRequest, ListFirewallPoliciesPagedResponse>
      listFirewallPoliciesPagedCallable() {
    return stub.listFirewallPoliciesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the list of all firewall policies that belong to a project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListFirewallPoliciesRequest request =
   *       ListFirewallPoliciesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListFirewallPoliciesResponse response =
   *         recaptchaEnterpriseServiceClient.listFirewallPoliciesCallable().call(request);
   *     for (FirewallPolicy element : response.getFirewallPoliciesList()) {
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
  public final UnaryCallable<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse>
      listFirewallPoliciesCallable() {
    return stub.listFirewallPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   FirewallPolicyName name = FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]");
   *   FirewallPolicy response = recaptchaEnterpriseServiceClient.getFirewallPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested policy, in the format
   *     `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy getFirewallPolicy(FirewallPolicyName name) {
    GetFirewallPolicyRequest request =
        GetFirewallPolicyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString();
   *   FirewallPolicy response = recaptchaEnterpriseServiceClient.getFirewallPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the requested policy, in the format
   *     `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy getFirewallPolicy(String name) {
    GetFirewallPolicyRequest request = GetFirewallPolicyRequest.newBuilder().setName(name).build();
    return getFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetFirewallPolicyRequest request =
   *       GetFirewallPolicyRequest.newBuilder()
   *           .setName(FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString())
   *           .build();
   *   FirewallPolicy response = recaptchaEnterpriseServiceClient.getFirewallPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy getFirewallPolicy(GetFirewallPolicyRequest request) {
    return getFirewallPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   GetFirewallPolicyRequest request =
   *       GetFirewallPolicyRequest.newBuilder()
   *           .setName(FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString())
   *           .build();
   *   ApiFuture<FirewallPolicy> future =
   *       recaptchaEnterpriseServiceClient.getFirewallPolicyCallable().futureCall(request);
   *   // Do something.
   *   FirewallPolicy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetFirewallPolicyRequest, FirewallPolicy> getFirewallPolicyCallable() {
    return stub.getFirewallPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   FirewallPolicy firewallPolicy = FirewallPolicy.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   FirewallPolicy response =
   *       recaptchaEnterpriseServiceClient.updateFirewallPolicy(firewallPolicy, updateMask);
   * }
   * }</pre>
   *
   * @param firewallPolicy Required. The policy to update.
   * @param updateMask Optional. The mask to control which fields of the policy get updated. If the
   *     mask is not present, all fields are updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy updateFirewallPolicy(
      FirewallPolicy firewallPolicy, FieldMask updateMask) {
    UpdateFirewallPolicyRequest request =
        UpdateFirewallPolicyRequest.newBuilder()
            .setFirewallPolicy(firewallPolicy)
            .setUpdateMask(updateMask)
            .build();
    return updateFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   UpdateFirewallPolicyRequest request =
   *       UpdateFirewallPolicyRequest.newBuilder()
   *           .setFirewallPolicy(FirewallPolicy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   FirewallPolicy response = recaptchaEnterpriseServiceClient.updateFirewallPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final FirewallPolicy updateFirewallPolicy(UpdateFirewallPolicyRequest request) {
    return updateFirewallPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   UpdateFirewallPolicyRequest request =
   *       UpdateFirewallPolicyRequest.newBuilder()
   *           .setFirewallPolicy(FirewallPolicy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<FirewallPolicy> future =
   *       recaptchaEnterpriseServiceClient.updateFirewallPolicyCallable().futureCall(request);
   *   // Do something.
   *   FirewallPolicy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateFirewallPolicyRequest, FirewallPolicy>
      updateFirewallPolicyCallable() {
    return stub.updateFirewallPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   FirewallPolicyName name = FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]");
   *   recaptchaEnterpriseServiceClient.deleteFirewallPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the policy to be deleted, in the format
   *     `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteFirewallPolicy(FirewallPolicyName name) {
    DeleteFirewallPolicyRequest request =
        DeleteFirewallPolicyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String name = FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString();
   *   recaptchaEnterpriseServiceClient.deleteFirewallPolicy(name);
   * }
   * }</pre>
   *
   * @param name Required. The name of the policy to be deleted, in the format
   *     `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteFirewallPolicy(String name) {
    DeleteFirewallPolicyRequest request =
        DeleteFirewallPolicyRequest.newBuilder().setName(name).build();
    deleteFirewallPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   DeleteFirewallPolicyRequest request =
   *       DeleteFirewallPolicyRequest.newBuilder()
   *           .setName(FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString())
   *           .build();
   *   recaptchaEnterpriseServiceClient.deleteFirewallPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteFirewallPolicy(DeleteFirewallPolicyRequest request) {
    deleteFirewallPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes the specified firewall policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   DeleteFirewallPolicyRequest request =
   *       DeleteFirewallPolicyRequest.newBuilder()
   *           .setName(FirewallPolicyName.of("[PROJECT]", "[FIREWALLPOLICY]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       recaptchaEnterpriseServiceClient.deleteFirewallPolicyCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteFirewallPolicyRequest, Empty> deleteFirewallPolicyCallable() {
    return stub.deleteFirewallPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reorders all firewall policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   List<String> names = new ArrayList<>();
   *   ReorderFirewallPoliciesResponse response =
   *       recaptchaEnterpriseServiceClient.reorderFirewallPolicies(parent, names);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list the policies for, in the format
   *     `projects/{project}`.
   * @param names Required. A list containing all policy names, in the new order. Each name is in
   *     the format `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReorderFirewallPoliciesResponse reorderFirewallPolicies(
      ProjectName parent, List<String> names) {
    ReorderFirewallPoliciesRequest request =
        ReorderFirewallPoliciesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .addAllNames(names)
            .build();
    return reorderFirewallPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reorders all firewall policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   List<String> names = new ArrayList<>();
   *   ReorderFirewallPoliciesResponse response =
   *       recaptchaEnterpriseServiceClient.reorderFirewallPolicies(parent, names);
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list the policies for, in the format
   *     `projects/{project}`.
   * @param names Required. A list containing all policy names, in the new order. Each name is in
   *     the format `projects/{project}/firewallpolicies/{firewallpolicy}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReorderFirewallPoliciesResponse reorderFirewallPolicies(
      String parent, List<String> names) {
    ReorderFirewallPoliciesRequest request =
        ReorderFirewallPoliciesRequest.newBuilder().setParent(parent).addAllNames(names).build();
    return reorderFirewallPolicies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reorders all firewall policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ReorderFirewallPoliciesRequest request =
   *       ReorderFirewallPoliciesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .addAllNames(new ArrayList<String>())
   *           .build();
   *   ReorderFirewallPoliciesResponse response =
   *       recaptchaEnterpriseServiceClient.reorderFirewallPolicies(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ReorderFirewallPoliciesResponse reorderFirewallPolicies(
      ReorderFirewallPoliciesRequest request) {
    return reorderFirewallPoliciesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reorders all firewall policies.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ReorderFirewallPoliciesRequest request =
   *       ReorderFirewallPoliciesRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .addAllNames(new ArrayList<String>())
   *           .build();
   *   ApiFuture<ReorderFirewallPoliciesResponse> future =
   *       recaptchaEnterpriseServiceClient.reorderFirewallPoliciesCallable().futureCall(request);
   *   // Do something.
   *   ReorderFirewallPoliciesResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
      reorderFirewallPoliciesCallable() {
    return stub.reorderFirewallPoliciesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List groups of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (RelatedAccountGroup element :
   *       recaptchaEnterpriseServiceClient.listRelatedAccountGroups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list related account groups from, in the
   *     format `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupsPagedResponse listRelatedAccountGroups(ProjectName parent) {
    ListRelatedAccountGroupsRequest request =
        ListRelatedAccountGroupsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listRelatedAccountGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List groups of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   for (RelatedAccountGroup element :
   *       recaptchaEnterpriseServiceClient.listRelatedAccountGroups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The name of the project to list related account groups from, in the
   *     format `projects/{project}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupsPagedResponse listRelatedAccountGroups(String parent) {
    ListRelatedAccountGroupsRequest request =
        ListRelatedAccountGroupsRequest.newBuilder().setParent(parent).build();
    return listRelatedAccountGroups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List groups of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupsRequest request =
   *       ListRelatedAccountGroupsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (RelatedAccountGroup element :
   *       recaptchaEnterpriseServiceClient.listRelatedAccountGroups(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupsPagedResponse listRelatedAccountGroups(
      ListRelatedAccountGroupsRequest request) {
    return listRelatedAccountGroupsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List groups of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupsRequest request =
   *       ListRelatedAccountGroupsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<RelatedAccountGroup> future =
   *       recaptchaEnterpriseServiceClient
   *           .listRelatedAccountGroupsPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (RelatedAccountGroup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListRelatedAccountGroupsRequest, ListRelatedAccountGroupsPagedResponse>
      listRelatedAccountGroupsPagedCallable() {
    return stub.listRelatedAccountGroupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * List groups of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupsRequest request =
   *       ListRelatedAccountGroupsRequest.newBuilder()
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListRelatedAccountGroupsResponse response =
   *         recaptchaEnterpriseServiceClient.listRelatedAccountGroupsCallable().call(request);
   *     for (RelatedAccountGroup element : response.getRelatedAccountGroupsList()) {
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
  public final UnaryCallable<ListRelatedAccountGroupsRequest, ListRelatedAccountGroupsResponse>
      listRelatedAccountGroupsCallable() {
    return stub.listRelatedAccountGroupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get memberships in a group of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   RelatedAccountGroupName parent =
   *       RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]");
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .listRelatedAccountGroupMemberships(parent)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name for the related account group in the format
   *     `projects/{project}/relatedaccountgroups/{relatedaccountgroup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupMembershipsPagedResponse listRelatedAccountGroupMemberships(
      RelatedAccountGroupName parent) {
    ListRelatedAccountGroupMembershipsRequest request =
        ListRelatedAccountGroupMembershipsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listRelatedAccountGroupMemberships(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get memberships in a group of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String parent = RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]").toString();
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .listRelatedAccountGroupMemberships(parent)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name for the related account group in the format
   *     `projects/{project}/relatedaccountgroups/{relatedaccountgroup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupMembershipsPagedResponse listRelatedAccountGroupMemberships(
      String parent) {
    ListRelatedAccountGroupMembershipsRequest request =
        ListRelatedAccountGroupMembershipsRequest.newBuilder().setParent(parent).build();
    return listRelatedAccountGroupMemberships(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get memberships in a group of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupMembershipsRequest request =
   *       ListRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setParent(
   *               RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .listRelatedAccountGroupMemberships(request)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListRelatedAccountGroupMembershipsPagedResponse listRelatedAccountGroupMemberships(
      ListRelatedAccountGroupMembershipsRequest request) {
    return listRelatedAccountGroupMembershipsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get memberships in a group of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupMembershipsRequest request =
   *       ListRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setParent(
   *               RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<RelatedAccountGroupMembership> future =
   *       recaptchaEnterpriseServiceClient
   *           .listRelatedAccountGroupMembershipsPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (RelatedAccountGroupMembership element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsPagedResponse>
      listRelatedAccountGroupMembershipsPagedCallable() {
    return stub.listRelatedAccountGroupMembershipsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Get memberships in a group of related accounts.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ListRelatedAccountGroupMembershipsRequest request =
   *       ListRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setParent(
   *               RelatedAccountGroupName.of("[PROJECT]", "[RELATEDACCOUNTGROUP]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListRelatedAccountGroupMembershipsResponse response =
   *         recaptchaEnterpriseServiceClient
   *             .listRelatedAccountGroupMembershipsCallable()
   *             .call(request);
   *     for (RelatedAccountGroupMembership element :
   *         response.getRelatedAccountGroupMembershipsList()) {
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
          ListRelatedAccountGroupMembershipsRequest, ListRelatedAccountGroupMembershipsResponse>
      listRelatedAccountGroupMembershipsCallable() {
    return stub.listRelatedAccountGroupMembershipsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Search group memberships related to a given account.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   ProjectName project = ProjectName.of("[PROJECT]");
   *   ByteString hashedAccountId = ByteString.EMPTY;
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .searchRelatedAccountGroupMemberships(project, hashedAccountId)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Required. The name of the project to search related account group memberships
   *     from. Specify the project name in the following format: `projects/{project}`.
   * @param hashedAccountId Optional. Deprecated: use `account_id` instead. The unique stable hashed
   *     account identifier used to search connections. The identifier should correspond to a
   *     `hashed_account_id` provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
   *     Either hashed_account_id or account_id must be set, but not both.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchRelatedAccountGroupMembershipsPagedResponse
      searchRelatedAccountGroupMemberships(ProjectName project, ByteString hashedAccountId) {
    SearchRelatedAccountGroupMembershipsRequest request =
        SearchRelatedAccountGroupMembershipsRequest.newBuilder()
            .setProject(project == null ? null : project.toString())
            .setHashedAccountId(hashedAccountId)
            .build();
    return searchRelatedAccountGroupMemberships(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Search group memberships related to a given account.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   String project = ProjectName.of("[PROJECT]").toString();
   *   ByteString hashedAccountId = ByteString.EMPTY;
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .searchRelatedAccountGroupMemberships(project, hashedAccountId)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param project Required. The name of the project to search related account group memberships
   *     from. Specify the project name in the following format: `projects/{project}`.
   * @param hashedAccountId Optional. Deprecated: use `account_id` instead. The unique stable hashed
   *     account identifier used to search connections. The identifier should correspond to a
   *     `hashed_account_id` provided in a previous `CreateAssessment` or `AnnotateAssessment` call.
   *     Either hashed_account_id or account_id must be set, but not both.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchRelatedAccountGroupMembershipsPagedResponse
      searchRelatedAccountGroupMemberships(String project, ByteString hashedAccountId) {
    SearchRelatedAccountGroupMembershipsRequest request =
        SearchRelatedAccountGroupMembershipsRequest.newBuilder()
            .setProject(project)
            .setHashedAccountId(hashedAccountId)
            .build();
    return searchRelatedAccountGroupMemberships(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Search group memberships related to a given account.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   SearchRelatedAccountGroupMembershipsRequest request =
   *       SearchRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setProject(ProjectName.of("[PROJECT]").toString())
   *           .setAccountId("accountId-1827029976")
   *           .setHashedAccountId(ByteString.EMPTY)
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (RelatedAccountGroupMembership element :
   *       recaptchaEnterpriseServiceClient
   *           .searchRelatedAccountGroupMemberships(request)
   *           .iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SearchRelatedAccountGroupMembershipsPagedResponse
      searchRelatedAccountGroupMemberships(SearchRelatedAccountGroupMembershipsRequest request) {
    return searchRelatedAccountGroupMembershipsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Search group memberships related to a given account.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   SearchRelatedAccountGroupMembershipsRequest request =
   *       SearchRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setProject(ProjectName.of("[PROJECT]").toString())
   *           .setAccountId("accountId-1827029976")
   *           .setHashedAccountId(ByteString.EMPTY)
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<RelatedAccountGroupMembership> future =
   *       recaptchaEnterpriseServiceClient
   *           .searchRelatedAccountGroupMembershipsPagedCallable()
   *           .futureCall(request);
   *   // Do something.
   *   for (RelatedAccountGroupMembership element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsPagedResponse>
      searchRelatedAccountGroupMembershipsPagedCallable() {
    return stub.searchRelatedAccountGroupMembershipsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Search group memberships related to a given account.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (RecaptchaEnterpriseServiceClient recaptchaEnterpriseServiceClient =
   *     RecaptchaEnterpriseServiceClient.create()) {
   *   SearchRelatedAccountGroupMembershipsRequest request =
   *       SearchRelatedAccountGroupMembershipsRequest.newBuilder()
   *           .setProject(ProjectName.of("[PROJECT]").toString())
   *           .setAccountId("accountId-1827029976")
   *           .setHashedAccountId(ByteString.EMPTY)
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     SearchRelatedAccountGroupMembershipsResponse response =
   *         recaptchaEnterpriseServiceClient
   *             .searchRelatedAccountGroupMembershipsCallable()
   *             .call(request);
   *     for (RelatedAccountGroupMembership element :
   *         response.getRelatedAccountGroupMembershipsList()) {
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
          SearchRelatedAccountGroupMembershipsRequest, SearchRelatedAccountGroupMembershipsResponse>
      searchRelatedAccountGroupMembershipsCallable() {
    return stub.searchRelatedAccountGroupMembershipsCallable();
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

  public static class ListKeysPagedResponse
      extends AbstractPagedListResponse<
          ListKeysRequest, ListKeysResponse, Key, ListKeysPage, ListKeysFixedSizeCollection> {

    public static ApiFuture<ListKeysPagedResponse> createAsync(
        PageContext<ListKeysRequest, ListKeysResponse, Key> context,
        ApiFuture<ListKeysResponse> futureResponse) {
      ApiFuture<ListKeysPage> futurePage =
          ListKeysPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListKeysPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListKeysPagedResponse(ListKeysPage page) {
      super(page, ListKeysFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListKeysPage
      extends AbstractPage<ListKeysRequest, ListKeysResponse, Key, ListKeysPage> {

    private ListKeysPage(
        PageContext<ListKeysRequest, ListKeysResponse, Key> context, ListKeysResponse response) {
      super(context, response);
    }

    private static ListKeysPage createEmptyPage() {
      return new ListKeysPage(null, null);
    }

    @Override
    protected ListKeysPage createPage(
        PageContext<ListKeysRequest, ListKeysResponse, Key> context, ListKeysResponse response) {
      return new ListKeysPage(context, response);
    }

    @Override
    public ApiFuture<ListKeysPage> createPageAsync(
        PageContext<ListKeysRequest, ListKeysResponse, Key> context,
        ApiFuture<ListKeysResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListKeysFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListKeysRequest, ListKeysResponse, Key, ListKeysPage, ListKeysFixedSizeCollection> {

    private ListKeysFixedSizeCollection(List<ListKeysPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListKeysFixedSizeCollection createEmptyCollection() {
      return new ListKeysFixedSizeCollection(null, 0);
    }

    @Override
    protected ListKeysFixedSizeCollection createCollection(
        List<ListKeysPage> pages, int collectionSize) {
      return new ListKeysFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListFirewallPoliciesPagedResponse
      extends AbstractPagedListResponse<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          FirewallPolicy,
          ListFirewallPoliciesPage,
          ListFirewallPoliciesFixedSizeCollection> {

    public static ApiFuture<ListFirewallPoliciesPagedResponse> createAsync(
        PageContext<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
            context,
        ApiFuture<ListFirewallPoliciesResponse> futureResponse) {
      ApiFuture<ListFirewallPoliciesPage> futurePage =
          ListFirewallPoliciesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListFirewallPoliciesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListFirewallPoliciesPagedResponse(ListFirewallPoliciesPage page) {
      super(page, ListFirewallPoliciesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListFirewallPoliciesPage
      extends AbstractPage<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          FirewallPolicy,
          ListFirewallPoliciesPage> {

    private ListFirewallPoliciesPage(
        PageContext<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
            context,
        ListFirewallPoliciesResponse response) {
      super(context, response);
    }

    private static ListFirewallPoliciesPage createEmptyPage() {
      return new ListFirewallPoliciesPage(null, null);
    }

    @Override
    protected ListFirewallPoliciesPage createPage(
        PageContext<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
            context,
        ListFirewallPoliciesResponse response) {
      return new ListFirewallPoliciesPage(context, response);
    }

    @Override
    public ApiFuture<ListFirewallPoliciesPage> createPageAsync(
        PageContext<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
            context,
        ApiFuture<ListFirewallPoliciesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListFirewallPoliciesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          FirewallPolicy,
          ListFirewallPoliciesPage,
          ListFirewallPoliciesFixedSizeCollection> {

    private ListFirewallPoliciesFixedSizeCollection(
        List<ListFirewallPoliciesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListFirewallPoliciesFixedSizeCollection createEmptyCollection() {
      return new ListFirewallPoliciesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListFirewallPoliciesFixedSizeCollection createCollection(
        List<ListFirewallPoliciesPage> pages, int collectionSize) {
      return new ListFirewallPoliciesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRelatedAccountGroupsPagedResponse
      extends AbstractPagedListResponse<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          RelatedAccountGroup,
          ListRelatedAccountGroupsPage,
          ListRelatedAccountGroupsFixedSizeCollection> {

    public static ApiFuture<ListRelatedAccountGroupsPagedResponse> createAsync(
        PageContext<
                ListRelatedAccountGroupsRequest,
                ListRelatedAccountGroupsResponse,
                RelatedAccountGroup>
            context,
        ApiFuture<ListRelatedAccountGroupsResponse> futureResponse) {
      ApiFuture<ListRelatedAccountGroupsPage> futurePage =
          ListRelatedAccountGroupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRelatedAccountGroupsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRelatedAccountGroupsPagedResponse(ListRelatedAccountGroupsPage page) {
      super(page, ListRelatedAccountGroupsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRelatedAccountGroupsPage
      extends AbstractPage<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          RelatedAccountGroup,
          ListRelatedAccountGroupsPage> {

    private ListRelatedAccountGroupsPage(
        PageContext<
                ListRelatedAccountGroupsRequest,
                ListRelatedAccountGroupsResponse,
                RelatedAccountGroup>
            context,
        ListRelatedAccountGroupsResponse response) {
      super(context, response);
    }

    private static ListRelatedAccountGroupsPage createEmptyPage() {
      return new ListRelatedAccountGroupsPage(null, null);
    }

    @Override
    protected ListRelatedAccountGroupsPage createPage(
        PageContext<
                ListRelatedAccountGroupsRequest,
                ListRelatedAccountGroupsResponse,
                RelatedAccountGroup>
            context,
        ListRelatedAccountGroupsResponse response) {
      return new ListRelatedAccountGroupsPage(context, response);
    }

    @Override
    public ApiFuture<ListRelatedAccountGroupsPage> createPageAsync(
        PageContext<
                ListRelatedAccountGroupsRequest,
                ListRelatedAccountGroupsResponse,
                RelatedAccountGroup>
            context,
        ApiFuture<ListRelatedAccountGroupsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRelatedAccountGroupsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          RelatedAccountGroup,
          ListRelatedAccountGroupsPage,
          ListRelatedAccountGroupsFixedSizeCollection> {

    private ListRelatedAccountGroupsFixedSizeCollection(
        List<ListRelatedAccountGroupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRelatedAccountGroupsFixedSizeCollection createEmptyCollection() {
      return new ListRelatedAccountGroupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRelatedAccountGroupsFixedSizeCollection createCollection(
        List<ListRelatedAccountGroupsPage> pages, int collectionSize) {
      return new ListRelatedAccountGroupsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListRelatedAccountGroupMembershipsPagedResponse
      extends AbstractPagedListResponse<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          ListRelatedAccountGroupMembershipsPage,
          ListRelatedAccountGroupMembershipsFixedSizeCollection> {

    public static ApiFuture<ListRelatedAccountGroupMembershipsPagedResponse> createAsync(
        PageContext<
                ListRelatedAccountGroupMembershipsRequest,
                ListRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ApiFuture<ListRelatedAccountGroupMembershipsResponse> futureResponse) {
      ApiFuture<ListRelatedAccountGroupMembershipsPage> futurePage =
          ListRelatedAccountGroupMembershipsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListRelatedAccountGroupMembershipsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListRelatedAccountGroupMembershipsPagedResponse(
        ListRelatedAccountGroupMembershipsPage page) {
      super(page, ListRelatedAccountGroupMembershipsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListRelatedAccountGroupMembershipsPage
      extends AbstractPage<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          ListRelatedAccountGroupMembershipsPage> {

    private ListRelatedAccountGroupMembershipsPage(
        PageContext<
                ListRelatedAccountGroupMembershipsRequest,
                ListRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ListRelatedAccountGroupMembershipsResponse response) {
      super(context, response);
    }

    private static ListRelatedAccountGroupMembershipsPage createEmptyPage() {
      return new ListRelatedAccountGroupMembershipsPage(null, null);
    }

    @Override
    protected ListRelatedAccountGroupMembershipsPage createPage(
        PageContext<
                ListRelatedAccountGroupMembershipsRequest,
                ListRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ListRelatedAccountGroupMembershipsResponse response) {
      return new ListRelatedAccountGroupMembershipsPage(context, response);
    }

    @Override
    public ApiFuture<ListRelatedAccountGroupMembershipsPage> createPageAsync(
        PageContext<
                ListRelatedAccountGroupMembershipsRequest,
                ListRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ApiFuture<ListRelatedAccountGroupMembershipsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListRelatedAccountGroupMembershipsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          ListRelatedAccountGroupMembershipsPage,
          ListRelatedAccountGroupMembershipsFixedSizeCollection> {

    private ListRelatedAccountGroupMembershipsFixedSizeCollection(
        List<ListRelatedAccountGroupMembershipsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListRelatedAccountGroupMembershipsFixedSizeCollection createEmptyCollection() {
      return new ListRelatedAccountGroupMembershipsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListRelatedAccountGroupMembershipsFixedSizeCollection createCollection(
        List<ListRelatedAccountGroupMembershipsPage> pages, int collectionSize) {
      return new ListRelatedAccountGroupMembershipsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class SearchRelatedAccountGroupMembershipsPagedResponse
      extends AbstractPagedListResponse<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          SearchRelatedAccountGroupMembershipsPage,
          SearchRelatedAccountGroupMembershipsFixedSizeCollection> {

    public static ApiFuture<SearchRelatedAccountGroupMembershipsPagedResponse> createAsync(
        PageContext<
                SearchRelatedAccountGroupMembershipsRequest,
                SearchRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ApiFuture<SearchRelatedAccountGroupMembershipsResponse> futureResponse) {
      ApiFuture<SearchRelatedAccountGroupMembershipsPage> futurePage =
          SearchRelatedAccountGroupMembershipsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new SearchRelatedAccountGroupMembershipsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private SearchRelatedAccountGroupMembershipsPagedResponse(
        SearchRelatedAccountGroupMembershipsPage page) {
      super(page, SearchRelatedAccountGroupMembershipsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class SearchRelatedAccountGroupMembershipsPage
      extends AbstractPage<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          SearchRelatedAccountGroupMembershipsPage> {

    private SearchRelatedAccountGroupMembershipsPage(
        PageContext<
                SearchRelatedAccountGroupMembershipsRequest,
                SearchRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        SearchRelatedAccountGroupMembershipsResponse response) {
      super(context, response);
    }

    private static SearchRelatedAccountGroupMembershipsPage createEmptyPage() {
      return new SearchRelatedAccountGroupMembershipsPage(null, null);
    }

    @Override
    protected SearchRelatedAccountGroupMembershipsPage createPage(
        PageContext<
                SearchRelatedAccountGroupMembershipsRequest,
                SearchRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        SearchRelatedAccountGroupMembershipsResponse response) {
      return new SearchRelatedAccountGroupMembershipsPage(context, response);
    }

    @Override
    public ApiFuture<SearchRelatedAccountGroupMembershipsPage> createPageAsync(
        PageContext<
                SearchRelatedAccountGroupMembershipsRequest,
                SearchRelatedAccountGroupMembershipsResponse,
                RelatedAccountGroupMembership>
            context,
        ApiFuture<SearchRelatedAccountGroupMembershipsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class SearchRelatedAccountGroupMembershipsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership,
          SearchRelatedAccountGroupMembershipsPage,
          SearchRelatedAccountGroupMembershipsFixedSizeCollection> {

    private SearchRelatedAccountGroupMembershipsFixedSizeCollection(
        List<SearchRelatedAccountGroupMembershipsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static SearchRelatedAccountGroupMembershipsFixedSizeCollection createEmptyCollection() {
      return new SearchRelatedAccountGroupMembershipsFixedSizeCollection(null, 0);
    }

    @Override
    protected SearchRelatedAccountGroupMembershipsFixedSizeCollection createCollection(
        List<SearchRelatedAccountGroupMembershipsPage> pages, int collectionSize) {
      return new SearchRelatedAccountGroupMembershipsFixedSizeCollection(pages, collectionSize);
    }
  }
}
