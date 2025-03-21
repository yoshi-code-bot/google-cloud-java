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

package com.google.cloud.recaptchaenterprise.v1.stub;

import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListFirewallPoliciesPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListIpOverridesPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListKeysPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListRelatedAccountGroupMembershipsPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.ListRelatedAccountGroupsPagedResponse;
import static com.google.cloud.recaptchaenterprise.v1.RecaptchaEnterpriseServiceClient.SearchRelatedAccountGroupMembershipsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import com.google.recaptchaenterprise.v1.AddIpOverrideRequest;
import com.google.recaptchaenterprise.v1.AddIpOverrideResponse;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentRequest;
import com.google.recaptchaenterprise.v1.AnnotateAssessmentResponse;
import com.google.recaptchaenterprise.v1.Assessment;
import com.google.recaptchaenterprise.v1.CreateAssessmentRequest;
import com.google.recaptchaenterprise.v1.CreateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.CreateKeyRequest;
import com.google.recaptchaenterprise.v1.DeleteFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.DeleteKeyRequest;
import com.google.recaptchaenterprise.v1.FirewallPolicy;
import com.google.recaptchaenterprise.v1.GetFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.GetKeyRequest;
import com.google.recaptchaenterprise.v1.GetMetricsRequest;
import com.google.recaptchaenterprise.v1.IpOverrideData;
import com.google.recaptchaenterprise.v1.Key;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ListFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.ListIpOverridesRequest;
import com.google.recaptchaenterprise.v1.ListIpOverridesResponse;
import com.google.recaptchaenterprise.v1.ListKeysRequest;
import com.google.recaptchaenterprise.v1.ListKeysResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsRequest;
import com.google.recaptchaenterprise.v1.ListRelatedAccountGroupsResponse;
import com.google.recaptchaenterprise.v1.Metrics;
import com.google.recaptchaenterprise.v1.MigrateKeyRequest;
import com.google.recaptchaenterprise.v1.RelatedAccountGroup;
import com.google.recaptchaenterprise.v1.RelatedAccountGroupMembership;
import com.google.recaptchaenterprise.v1.RemoveIpOverrideRequest;
import com.google.recaptchaenterprise.v1.RemoveIpOverrideResponse;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesRequest;
import com.google.recaptchaenterprise.v1.ReorderFirewallPoliciesResponse;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyRequest;
import com.google.recaptchaenterprise.v1.RetrieveLegacySecretKeyResponse;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsRequest;
import com.google.recaptchaenterprise.v1.SearchRelatedAccountGroupMembershipsResponse;
import com.google.recaptchaenterprise.v1.UpdateFirewallPolicyRequest;
import com.google.recaptchaenterprise.v1.UpdateKeyRequest;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link RecaptchaEnterpriseServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (recaptchaenterprise.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createAssessment:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * RecaptchaEnterpriseServiceStubSettings.Builder recaptchaEnterpriseServiceSettingsBuilder =
 *     RecaptchaEnterpriseServiceStubSettings.newBuilder();
 * recaptchaEnterpriseServiceSettingsBuilder
 *     .createAssessmentSettings()
 *     .setRetrySettings(
 *         recaptchaEnterpriseServiceSettingsBuilder
 *             .createAssessmentSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * RecaptchaEnterpriseServiceStubSettings recaptchaEnterpriseServiceSettings =
 *     recaptchaEnterpriseServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class RecaptchaEnterpriseServiceStubSettings
    extends StubSettings<RecaptchaEnterpriseServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<CreateAssessmentRequest, Assessment> createAssessmentSettings;
  private final UnaryCallSettings<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
      annotateAssessmentSettings;
  private final UnaryCallSettings<CreateKeyRequest, Key> createKeySettings;
  private final PagedCallSettings<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
      listKeysSettings;
  private final UnaryCallSettings<RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
      retrieveLegacySecretKeySettings;
  private final UnaryCallSettings<GetKeyRequest, Key> getKeySettings;
  private final UnaryCallSettings<UpdateKeyRequest, Key> updateKeySettings;
  private final UnaryCallSettings<DeleteKeyRequest, Empty> deleteKeySettings;
  private final UnaryCallSettings<MigrateKeyRequest, Key> migrateKeySettings;
  private final UnaryCallSettings<AddIpOverrideRequest, AddIpOverrideResponse>
      addIpOverrideSettings;
  private final UnaryCallSettings<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
      removeIpOverrideSettings;
  private final PagedCallSettings<
          ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
      listIpOverridesSettings;
  private final UnaryCallSettings<GetMetricsRequest, Metrics> getMetricsSettings;
  private final UnaryCallSettings<CreateFirewallPolicyRequest, FirewallPolicy>
      createFirewallPolicySettings;
  private final PagedCallSettings<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          ListFirewallPoliciesPagedResponse>
      listFirewallPoliciesSettings;
  private final UnaryCallSettings<GetFirewallPolicyRequest, FirewallPolicy>
      getFirewallPolicySettings;
  private final UnaryCallSettings<UpdateFirewallPolicyRequest, FirewallPolicy>
      updateFirewallPolicySettings;
  private final UnaryCallSettings<DeleteFirewallPolicyRequest, Empty> deleteFirewallPolicySettings;
  private final UnaryCallSettings<ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
      reorderFirewallPoliciesSettings;
  private final PagedCallSettings<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          ListRelatedAccountGroupsPagedResponse>
      listRelatedAccountGroupsSettings;
  private final PagedCallSettings<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          ListRelatedAccountGroupMembershipsPagedResponse>
      listRelatedAccountGroupMembershipsSettings;
  private final PagedCallSettings<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          SearchRelatedAccountGroupMembershipsPagedResponse>
      searchRelatedAccountGroupMembershipsSettings;

  private static final PagedListDescriptor<ListKeysRequest, ListKeysResponse, Key>
      LIST_KEYS_PAGE_STR_DESC =
          new PagedListDescriptor<ListKeysRequest, ListKeysResponse, Key>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListKeysRequest injectToken(ListKeysRequest payload, String token) {
              return ListKeysRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListKeysRequest injectPageSize(ListKeysRequest payload, int pageSize) {
              return ListKeysRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListKeysRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListKeysResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Key> extractResources(ListKeysResponse payload) {
              return payload.getKeysList();
            }
          };

  private static final PagedListDescriptor<
          ListIpOverridesRequest, ListIpOverridesResponse, IpOverrideData>
      LIST_IP_OVERRIDES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListIpOverridesRequest, ListIpOverridesResponse, IpOverrideData>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListIpOverridesRequest injectToken(
                ListIpOverridesRequest payload, String token) {
              return ListIpOverridesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListIpOverridesRequest injectPageSize(
                ListIpOverridesRequest payload, int pageSize) {
              return ListIpOverridesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListIpOverridesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListIpOverridesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<IpOverrideData> extractResources(ListIpOverridesResponse payload) {
              return payload.getIpOverridesList();
            }
          };

  private static final PagedListDescriptor<
          ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
      LIST_FIREWALL_POLICIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListFirewallPoliciesRequest injectToken(
                ListFirewallPoliciesRequest payload, String token) {
              return ListFirewallPoliciesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListFirewallPoliciesRequest injectPageSize(
                ListFirewallPoliciesRequest payload, int pageSize) {
              return ListFirewallPoliciesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListFirewallPoliciesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListFirewallPoliciesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<FirewallPolicy> extractResources(ListFirewallPoliciesResponse payload) {
              return payload.getFirewallPoliciesList();
            }
          };

  private static final PagedListDescriptor<
          ListRelatedAccountGroupsRequest, ListRelatedAccountGroupsResponse, RelatedAccountGroup>
      LIST_RELATED_ACCOUNT_GROUPS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRelatedAccountGroupsRequest,
              ListRelatedAccountGroupsResponse,
              RelatedAccountGroup>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRelatedAccountGroupsRequest injectToken(
                ListRelatedAccountGroupsRequest payload, String token) {
              return ListRelatedAccountGroupsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRelatedAccountGroupsRequest injectPageSize(
                ListRelatedAccountGroupsRequest payload, int pageSize) {
              return ListRelatedAccountGroupsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRelatedAccountGroupsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRelatedAccountGroupsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<RelatedAccountGroup> extractResources(
                ListRelatedAccountGroupsResponse payload) {
              return payload.getRelatedAccountGroupsList();
            }
          };

  private static final PagedListDescriptor<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership>
      LIST_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListRelatedAccountGroupMembershipsRequest,
              ListRelatedAccountGroupMembershipsResponse,
              RelatedAccountGroupMembership>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListRelatedAccountGroupMembershipsRequest injectToken(
                ListRelatedAccountGroupMembershipsRequest payload, String token) {
              return ListRelatedAccountGroupMembershipsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListRelatedAccountGroupMembershipsRequest injectPageSize(
                ListRelatedAccountGroupMembershipsRequest payload, int pageSize) {
              return ListRelatedAccountGroupMembershipsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListRelatedAccountGroupMembershipsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListRelatedAccountGroupMembershipsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<RelatedAccountGroupMembership> extractResources(
                ListRelatedAccountGroupMembershipsResponse payload) {
              return payload.getRelatedAccountGroupMembershipsList();
            }
          };

  private static final PagedListDescriptor<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          RelatedAccountGroupMembership>
      SEARCH_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchRelatedAccountGroupMembershipsRequest,
              SearchRelatedAccountGroupMembershipsResponse,
              RelatedAccountGroupMembership>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchRelatedAccountGroupMembershipsRequest injectToken(
                SearchRelatedAccountGroupMembershipsRequest payload, String token) {
              return SearchRelatedAccountGroupMembershipsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public SearchRelatedAccountGroupMembershipsRequest injectPageSize(
                SearchRelatedAccountGroupMembershipsRequest payload, int pageSize) {
              return SearchRelatedAccountGroupMembershipsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(SearchRelatedAccountGroupMembershipsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchRelatedAccountGroupMembershipsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<RelatedAccountGroupMembership> extractResources(
                SearchRelatedAccountGroupMembershipsResponse payload) {
              return payload.getRelatedAccountGroupMembershipsList();
            }
          };

  private static final PagedListResponseFactory<
          ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
      LIST_KEYS_PAGE_STR_FACT =
          new PagedListResponseFactory<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>() {
            @Override
            public ApiFuture<ListKeysPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListKeysRequest, ListKeysResponse> callable,
                ListKeysRequest request,
                ApiCallContext context,
                ApiFuture<ListKeysResponse> futureResponse) {
              PageContext<ListKeysRequest, ListKeysResponse, Key> pageContext =
                  PageContext.create(callable, LIST_KEYS_PAGE_STR_DESC, request, context);
              return ListKeysPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
      LIST_IP_OVERRIDES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>() {
            @Override
            public ApiFuture<ListIpOverridesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListIpOverridesRequest, ListIpOverridesResponse> callable,
                ListIpOverridesRequest request,
                ApiCallContext context,
                ApiFuture<ListIpOverridesResponse> futureResponse) {
              PageContext<ListIpOverridesRequest, ListIpOverridesResponse, IpOverrideData>
                  pageContext =
                      PageContext.create(
                          callable, LIST_IP_OVERRIDES_PAGE_STR_DESC, request, context);
              return ListIpOverridesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          ListFirewallPoliciesPagedResponse>
      LIST_FIREWALL_POLICIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListFirewallPoliciesRequest,
              ListFirewallPoliciesResponse,
              ListFirewallPoliciesPagedResponse>() {
            @Override
            public ApiFuture<ListFirewallPoliciesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse> callable,
                ListFirewallPoliciesRequest request,
                ApiCallContext context,
                ApiFuture<ListFirewallPoliciesResponse> futureResponse) {
              PageContext<ListFirewallPoliciesRequest, ListFirewallPoliciesResponse, FirewallPolicy>
                  pageContext =
                      PageContext.create(
                          callable, LIST_FIREWALL_POLICIES_PAGE_STR_DESC, request, context);
              return ListFirewallPoliciesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          ListRelatedAccountGroupsPagedResponse>
      LIST_RELATED_ACCOUNT_GROUPS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRelatedAccountGroupsRequest,
              ListRelatedAccountGroupsResponse,
              ListRelatedAccountGroupsPagedResponse>() {
            @Override
            public ApiFuture<ListRelatedAccountGroupsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListRelatedAccountGroupsRequest, ListRelatedAccountGroupsResponse>
                    callable,
                ListRelatedAccountGroupsRequest request,
                ApiCallContext context,
                ApiFuture<ListRelatedAccountGroupsResponse> futureResponse) {
              PageContext<
                      ListRelatedAccountGroupsRequest,
                      ListRelatedAccountGroupsResponse,
                      RelatedAccountGroup>
                  pageContext =
                      PageContext.create(
                          callable, LIST_RELATED_ACCOUNT_GROUPS_PAGE_STR_DESC, request, context);
              return ListRelatedAccountGroupsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          ListRelatedAccountGroupMembershipsPagedResponse>
      LIST_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListRelatedAccountGroupMembershipsRequest,
              ListRelatedAccountGroupMembershipsResponse,
              ListRelatedAccountGroupMembershipsPagedResponse>() {
            @Override
            public ApiFuture<ListRelatedAccountGroupMembershipsPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            ListRelatedAccountGroupMembershipsRequest,
                            ListRelatedAccountGroupMembershipsResponse>
                        callable,
                    ListRelatedAccountGroupMembershipsRequest request,
                    ApiCallContext context,
                    ApiFuture<ListRelatedAccountGroupMembershipsResponse> futureResponse) {
              PageContext<
                      ListRelatedAccountGroupMembershipsRequest,
                      ListRelatedAccountGroupMembershipsResponse,
                      RelatedAccountGroupMembership>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_DESC,
                          request,
                          context);
              return ListRelatedAccountGroupMembershipsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          SearchRelatedAccountGroupMembershipsPagedResponse>
      SEARCH_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchRelatedAccountGroupMembershipsRequest,
              SearchRelatedAccountGroupMembershipsResponse,
              SearchRelatedAccountGroupMembershipsPagedResponse>() {
            @Override
            public ApiFuture<SearchRelatedAccountGroupMembershipsPagedResponse>
                getFuturePagedResponse(
                    UnaryCallable<
                            SearchRelatedAccountGroupMembershipsRequest,
                            SearchRelatedAccountGroupMembershipsResponse>
                        callable,
                    SearchRelatedAccountGroupMembershipsRequest request,
                    ApiCallContext context,
                    ApiFuture<SearchRelatedAccountGroupMembershipsResponse> futureResponse) {
              PageContext<
                      SearchRelatedAccountGroupMembershipsRequest,
                      SearchRelatedAccountGroupMembershipsResponse,
                      RelatedAccountGroupMembership>
                  pageContext =
                      PageContext.create(
                          callable,
                          SEARCH_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_DESC,
                          request,
                          context);
              return SearchRelatedAccountGroupMembershipsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to createAssessment. */
  public UnaryCallSettings<CreateAssessmentRequest, Assessment> createAssessmentSettings() {
    return createAssessmentSettings;
  }

  /** Returns the object with the settings used for calls to annotateAssessment. */
  public UnaryCallSettings<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
      annotateAssessmentSettings() {
    return annotateAssessmentSettings;
  }

  /** Returns the object with the settings used for calls to createKey. */
  public UnaryCallSettings<CreateKeyRequest, Key> createKeySettings() {
    return createKeySettings;
  }

  /** Returns the object with the settings used for calls to listKeys. */
  public PagedCallSettings<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
      listKeysSettings() {
    return listKeysSettings;
  }

  /** Returns the object with the settings used for calls to retrieveLegacySecretKey. */
  public UnaryCallSettings<RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
      retrieveLegacySecretKeySettings() {
    return retrieveLegacySecretKeySettings;
  }

  /** Returns the object with the settings used for calls to getKey. */
  public UnaryCallSettings<GetKeyRequest, Key> getKeySettings() {
    return getKeySettings;
  }

  /** Returns the object with the settings used for calls to updateKey. */
  public UnaryCallSettings<UpdateKeyRequest, Key> updateKeySettings() {
    return updateKeySettings;
  }

  /** Returns the object with the settings used for calls to deleteKey. */
  public UnaryCallSettings<DeleteKeyRequest, Empty> deleteKeySettings() {
    return deleteKeySettings;
  }

  /** Returns the object with the settings used for calls to migrateKey. */
  public UnaryCallSettings<MigrateKeyRequest, Key> migrateKeySettings() {
    return migrateKeySettings;
  }

  /** Returns the object with the settings used for calls to addIpOverride. */
  public UnaryCallSettings<AddIpOverrideRequest, AddIpOverrideResponse> addIpOverrideSettings() {
    return addIpOverrideSettings;
  }

  /** Returns the object with the settings used for calls to removeIpOverride. */
  public UnaryCallSettings<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
      removeIpOverrideSettings() {
    return removeIpOverrideSettings;
  }

  /** Returns the object with the settings used for calls to listIpOverrides. */
  public PagedCallSettings<
          ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
      listIpOverridesSettings() {
    return listIpOverridesSettings;
  }

  /** Returns the object with the settings used for calls to getMetrics. */
  public UnaryCallSettings<GetMetricsRequest, Metrics> getMetricsSettings() {
    return getMetricsSettings;
  }

  /** Returns the object with the settings used for calls to createFirewallPolicy. */
  public UnaryCallSettings<CreateFirewallPolicyRequest, FirewallPolicy>
      createFirewallPolicySettings() {
    return createFirewallPolicySettings;
  }

  /** Returns the object with the settings used for calls to listFirewallPolicies. */
  public PagedCallSettings<
          ListFirewallPoliciesRequest,
          ListFirewallPoliciesResponse,
          ListFirewallPoliciesPagedResponse>
      listFirewallPoliciesSettings() {
    return listFirewallPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to getFirewallPolicy. */
  public UnaryCallSettings<GetFirewallPolicyRequest, FirewallPolicy> getFirewallPolicySettings() {
    return getFirewallPolicySettings;
  }

  /** Returns the object with the settings used for calls to updateFirewallPolicy. */
  public UnaryCallSettings<UpdateFirewallPolicyRequest, FirewallPolicy>
      updateFirewallPolicySettings() {
    return updateFirewallPolicySettings;
  }

  /** Returns the object with the settings used for calls to deleteFirewallPolicy. */
  public UnaryCallSettings<DeleteFirewallPolicyRequest, Empty> deleteFirewallPolicySettings() {
    return deleteFirewallPolicySettings;
  }

  /** Returns the object with the settings used for calls to reorderFirewallPolicies. */
  public UnaryCallSettings<ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
      reorderFirewallPoliciesSettings() {
    return reorderFirewallPoliciesSettings;
  }

  /** Returns the object with the settings used for calls to listRelatedAccountGroups. */
  public PagedCallSettings<
          ListRelatedAccountGroupsRequest,
          ListRelatedAccountGroupsResponse,
          ListRelatedAccountGroupsPagedResponse>
      listRelatedAccountGroupsSettings() {
    return listRelatedAccountGroupsSettings;
  }

  /** Returns the object with the settings used for calls to listRelatedAccountGroupMemberships. */
  public PagedCallSettings<
          ListRelatedAccountGroupMembershipsRequest,
          ListRelatedAccountGroupMembershipsResponse,
          ListRelatedAccountGroupMembershipsPagedResponse>
      listRelatedAccountGroupMembershipsSettings() {
    return listRelatedAccountGroupMembershipsSettings;
  }

  /**
   * Returns the object with the settings used for calls to searchRelatedAccountGroupMemberships.
   */
  public PagedCallSettings<
          SearchRelatedAccountGroupMembershipsRequest,
          SearchRelatedAccountGroupMembershipsResponse,
          SearchRelatedAccountGroupMembershipsPagedResponse>
      searchRelatedAccountGroupMembershipsSettings() {
    return searchRelatedAccountGroupMembershipsSettings;
  }

  public RecaptchaEnterpriseServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcRecaptchaEnterpriseServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "recaptchaenterprise";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "recaptchaenterprise.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "recaptchaenterprise.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(RecaptchaEnterpriseServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected RecaptchaEnterpriseServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createAssessmentSettings = settingsBuilder.createAssessmentSettings().build();
    annotateAssessmentSettings = settingsBuilder.annotateAssessmentSettings().build();
    createKeySettings = settingsBuilder.createKeySettings().build();
    listKeysSettings = settingsBuilder.listKeysSettings().build();
    retrieveLegacySecretKeySettings = settingsBuilder.retrieveLegacySecretKeySettings().build();
    getKeySettings = settingsBuilder.getKeySettings().build();
    updateKeySettings = settingsBuilder.updateKeySettings().build();
    deleteKeySettings = settingsBuilder.deleteKeySettings().build();
    migrateKeySettings = settingsBuilder.migrateKeySettings().build();
    addIpOverrideSettings = settingsBuilder.addIpOverrideSettings().build();
    removeIpOverrideSettings = settingsBuilder.removeIpOverrideSettings().build();
    listIpOverridesSettings = settingsBuilder.listIpOverridesSettings().build();
    getMetricsSettings = settingsBuilder.getMetricsSettings().build();
    createFirewallPolicySettings = settingsBuilder.createFirewallPolicySettings().build();
    listFirewallPoliciesSettings = settingsBuilder.listFirewallPoliciesSettings().build();
    getFirewallPolicySettings = settingsBuilder.getFirewallPolicySettings().build();
    updateFirewallPolicySettings = settingsBuilder.updateFirewallPolicySettings().build();
    deleteFirewallPolicySettings = settingsBuilder.deleteFirewallPolicySettings().build();
    reorderFirewallPoliciesSettings = settingsBuilder.reorderFirewallPoliciesSettings().build();
    listRelatedAccountGroupsSettings = settingsBuilder.listRelatedAccountGroupsSettings().build();
    listRelatedAccountGroupMembershipsSettings =
        settingsBuilder.listRelatedAccountGroupMembershipsSettings().build();
    searchRelatedAccountGroupMembershipsSettings =
        settingsBuilder.searchRelatedAccountGroupMembershipsSettings().build();
  }

  /** Builder for RecaptchaEnterpriseServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<RecaptchaEnterpriseServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateAssessmentRequest, Assessment>
        createAssessmentSettings;
    private final UnaryCallSettings.Builder<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
        annotateAssessmentSettings;
    private final UnaryCallSettings.Builder<CreateKeyRequest, Key> createKeySettings;
    private final PagedCallSettings.Builder<
            ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
        listKeysSettings;
    private final UnaryCallSettings.Builder<
            RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
        retrieveLegacySecretKeySettings;
    private final UnaryCallSettings.Builder<GetKeyRequest, Key> getKeySettings;
    private final UnaryCallSettings.Builder<UpdateKeyRequest, Key> updateKeySettings;
    private final UnaryCallSettings.Builder<DeleteKeyRequest, Empty> deleteKeySettings;
    private final UnaryCallSettings.Builder<MigrateKeyRequest, Key> migrateKeySettings;
    private final UnaryCallSettings.Builder<AddIpOverrideRequest, AddIpOverrideResponse>
        addIpOverrideSettings;
    private final UnaryCallSettings.Builder<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
        removeIpOverrideSettings;
    private final PagedCallSettings.Builder<
            ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
        listIpOverridesSettings;
    private final UnaryCallSettings.Builder<GetMetricsRequest, Metrics> getMetricsSettings;
    private final UnaryCallSettings.Builder<CreateFirewallPolicyRequest, FirewallPolicy>
        createFirewallPolicySettings;
    private final PagedCallSettings.Builder<
            ListFirewallPoliciesRequest,
            ListFirewallPoliciesResponse,
            ListFirewallPoliciesPagedResponse>
        listFirewallPoliciesSettings;
    private final UnaryCallSettings.Builder<GetFirewallPolicyRequest, FirewallPolicy>
        getFirewallPolicySettings;
    private final UnaryCallSettings.Builder<UpdateFirewallPolicyRequest, FirewallPolicy>
        updateFirewallPolicySettings;
    private final UnaryCallSettings.Builder<DeleteFirewallPolicyRequest, Empty>
        deleteFirewallPolicySettings;
    private final UnaryCallSettings.Builder<
            ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
        reorderFirewallPoliciesSettings;
    private final PagedCallSettings.Builder<
            ListRelatedAccountGroupsRequest,
            ListRelatedAccountGroupsResponse,
            ListRelatedAccountGroupsPagedResponse>
        listRelatedAccountGroupsSettings;
    private final PagedCallSettings.Builder<
            ListRelatedAccountGroupMembershipsRequest,
            ListRelatedAccountGroupMembershipsResponse,
            ListRelatedAccountGroupMembershipsPagedResponse>
        listRelatedAccountGroupMembershipsSettings;
    private final PagedCallSettings.Builder<
            SearchRelatedAccountGroupMembershipsRequest,
            SearchRelatedAccountGroupMembershipsResponse,
            SearchRelatedAccountGroupMembershipsPagedResponse>
        searchRelatedAccountGroupMembershipsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createAssessmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      annotateAssessmentSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listKeysSettings = PagedCallSettings.newBuilder(LIST_KEYS_PAGE_STR_FACT);
      retrieveLegacySecretKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      migrateKeySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      addIpOverrideSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      removeIpOverrideSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listIpOverridesSettings = PagedCallSettings.newBuilder(LIST_IP_OVERRIDES_PAGE_STR_FACT);
      getMetricsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createFirewallPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listFirewallPoliciesSettings =
          PagedCallSettings.newBuilder(LIST_FIREWALL_POLICIES_PAGE_STR_FACT);
      getFirewallPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateFirewallPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteFirewallPolicySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      reorderFirewallPoliciesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listRelatedAccountGroupsSettings =
          PagedCallSettings.newBuilder(LIST_RELATED_ACCOUNT_GROUPS_PAGE_STR_FACT);
      listRelatedAccountGroupMembershipsSettings =
          PagedCallSettings.newBuilder(LIST_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_FACT);
      searchRelatedAccountGroupMembershipsSettings =
          PagedCallSettings.newBuilder(SEARCH_RELATED_ACCOUNT_GROUP_MEMBERSHIPS_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createAssessmentSettings,
              annotateAssessmentSettings,
              createKeySettings,
              listKeysSettings,
              retrieveLegacySecretKeySettings,
              getKeySettings,
              updateKeySettings,
              deleteKeySettings,
              migrateKeySettings,
              addIpOverrideSettings,
              removeIpOverrideSettings,
              listIpOverridesSettings,
              getMetricsSettings,
              createFirewallPolicySettings,
              listFirewallPoliciesSettings,
              getFirewallPolicySettings,
              updateFirewallPolicySettings,
              deleteFirewallPolicySettings,
              reorderFirewallPoliciesSettings,
              listRelatedAccountGroupsSettings,
              listRelatedAccountGroupMembershipsSettings,
              searchRelatedAccountGroupMembershipsSettings);
      initDefaults(this);
    }

    protected Builder(RecaptchaEnterpriseServiceStubSettings settings) {
      super(settings);

      createAssessmentSettings = settings.createAssessmentSettings.toBuilder();
      annotateAssessmentSettings = settings.annotateAssessmentSettings.toBuilder();
      createKeySettings = settings.createKeySettings.toBuilder();
      listKeysSettings = settings.listKeysSettings.toBuilder();
      retrieveLegacySecretKeySettings = settings.retrieveLegacySecretKeySettings.toBuilder();
      getKeySettings = settings.getKeySettings.toBuilder();
      updateKeySettings = settings.updateKeySettings.toBuilder();
      deleteKeySettings = settings.deleteKeySettings.toBuilder();
      migrateKeySettings = settings.migrateKeySettings.toBuilder();
      addIpOverrideSettings = settings.addIpOverrideSettings.toBuilder();
      removeIpOverrideSettings = settings.removeIpOverrideSettings.toBuilder();
      listIpOverridesSettings = settings.listIpOverridesSettings.toBuilder();
      getMetricsSettings = settings.getMetricsSettings.toBuilder();
      createFirewallPolicySettings = settings.createFirewallPolicySettings.toBuilder();
      listFirewallPoliciesSettings = settings.listFirewallPoliciesSettings.toBuilder();
      getFirewallPolicySettings = settings.getFirewallPolicySettings.toBuilder();
      updateFirewallPolicySettings = settings.updateFirewallPolicySettings.toBuilder();
      deleteFirewallPolicySettings = settings.deleteFirewallPolicySettings.toBuilder();
      reorderFirewallPoliciesSettings = settings.reorderFirewallPoliciesSettings.toBuilder();
      listRelatedAccountGroupsSettings = settings.listRelatedAccountGroupsSettings.toBuilder();
      listRelatedAccountGroupMembershipsSettings =
          settings.listRelatedAccountGroupMembershipsSettings.toBuilder();
      searchRelatedAccountGroupMembershipsSettings =
          settings.searchRelatedAccountGroupMembershipsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createAssessmentSettings,
              annotateAssessmentSettings,
              createKeySettings,
              listKeysSettings,
              retrieveLegacySecretKeySettings,
              getKeySettings,
              updateKeySettings,
              deleteKeySettings,
              migrateKeySettings,
              addIpOverrideSettings,
              removeIpOverrideSettings,
              listIpOverridesSettings,
              getMetricsSettings,
              createFirewallPolicySettings,
              listFirewallPoliciesSettings,
              getFirewallPolicySettings,
              updateFirewallPolicySettings,
              deleteFirewallPolicySettings,
              reorderFirewallPoliciesSettings,
              listRelatedAccountGroupsSettings,
              listRelatedAccountGroupMembershipsSettings,
              searchRelatedAccountGroupMembershipsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createAssessmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .annotateAssessmentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .createKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .listKeysSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .retrieveLegacySecretKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .updateKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .deleteKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .migrateKeySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .addIpOverrideSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .removeIpOverrideSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listIpOverridesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getMetricsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createFirewallPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listFirewallPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getFirewallPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateFirewallPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteFirewallPolicySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .reorderFirewallPoliciesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listRelatedAccountGroupsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listRelatedAccountGroupMembershipsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .searchRelatedAccountGroupMembershipsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createAssessment. */
    public UnaryCallSettings.Builder<CreateAssessmentRequest, Assessment>
        createAssessmentSettings() {
      return createAssessmentSettings;
    }

    /** Returns the builder for the settings used for calls to annotateAssessment. */
    public UnaryCallSettings.Builder<AnnotateAssessmentRequest, AnnotateAssessmentResponse>
        annotateAssessmentSettings() {
      return annotateAssessmentSettings;
    }

    /** Returns the builder for the settings used for calls to createKey. */
    public UnaryCallSettings.Builder<CreateKeyRequest, Key> createKeySettings() {
      return createKeySettings;
    }

    /** Returns the builder for the settings used for calls to listKeys. */
    public PagedCallSettings.Builder<ListKeysRequest, ListKeysResponse, ListKeysPagedResponse>
        listKeysSettings() {
      return listKeysSettings;
    }

    /** Returns the builder for the settings used for calls to retrieveLegacySecretKey. */
    public UnaryCallSettings.Builder<
            RetrieveLegacySecretKeyRequest, RetrieveLegacySecretKeyResponse>
        retrieveLegacySecretKeySettings() {
      return retrieveLegacySecretKeySettings;
    }

    /** Returns the builder for the settings used for calls to getKey. */
    public UnaryCallSettings.Builder<GetKeyRequest, Key> getKeySettings() {
      return getKeySettings;
    }

    /** Returns the builder for the settings used for calls to updateKey. */
    public UnaryCallSettings.Builder<UpdateKeyRequest, Key> updateKeySettings() {
      return updateKeySettings;
    }

    /** Returns the builder for the settings used for calls to deleteKey. */
    public UnaryCallSettings.Builder<DeleteKeyRequest, Empty> deleteKeySettings() {
      return deleteKeySettings;
    }

    /** Returns the builder for the settings used for calls to migrateKey. */
    public UnaryCallSettings.Builder<MigrateKeyRequest, Key> migrateKeySettings() {
      return migrateKeySettings;
    }

    /** Returns the builder for the settings used for calls to addIpOverride. */
    public UnaryCallSettings.Builder<AddIpOverrideRequest, AddIpOverrideResponse>
        addIpOverrideSettings() {
      return addIpOverrideSettings;
    }

    /** Returns the builder for the settings used for calls to removeIpOverride. */
    public UnaryCallSettings.Builder<RemoveIpOverrideRequest, RemoveIpOverrideResponse>
        removeIpOverrideSettings() {
      return removeIpOverrideSettings;
    }

    /** Returns the builder for the settings used for calls to listIpOverrides. */
    public PagedCallSettings.Builder<
            ListIpOverridesRequest, ListIpOverridesResponse, ListIpOverridesPagedResponse>
        listIpOverridesSettings() {
      return listIpOverridesSettings;
    }

    /** Returns the builder for the settings used for calls to getMetrics. */
    public UnaryCallSettings.Builder<GetMetricsRequest, Metrics> getMetricsSettings() {
      return getMetricsSettings;
    }

    /** Returns the builder for the settings used for calls to createFirewallPolicy. */
    public UnaryCallSettings.Builder<CreateFirewallPolicyRequest, FirewallPolicy>
        createFirewallPolicySettings() {
      return createFirewallPolicySettings;
    }

    /** Returns the builder for the settings used for calls to listFirewallPolicies. */
    public PagedCallSettings.Builder<
            ListFirewallPoliciesRequest,
            ListFirewallPoliciesResponse,
            ListFirewallPoliciesPagedResponse>
        listFirewallPoliciesSettings() {
      return listFirewallPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to getFirewallPolicy. */
    public UnaryCallSettings.Builder<GetFirewallPolicyRequest, FirewallPolicy>
        getFirewallPolicySettings() {
      return getFirewallPolicySettings;
    }

    /** Returns the builder for the settings used for calls to updateFirewallPolicy. */
    public UnaryCallSettings.Builder<UpdateFirewallPolicyRequest, FirewallPolicy>
        updateFirewallPolicySettings() {
      return updateFirewallPolicySettings;
    }

    /** Returns the builder for the settings used for calls to deleteFirewallPolicy. */
    public UnaryCallSettings.Builder<DeleteFirewallPolicyRequest, Empty>
        deleteFirewallPolicySettings() {
      return deleteFirewallPolicySettings;
    }

    /** Returns the builder for the settings used for calls to reorderFirewallPolicies. */
    public UnaryCallSettings.Builder<
            ReorderFirewallPoliciesRequest, ReorderFirewallPoliciesResponse>
        reorderFirewallPoliciesSettings() {
      return reorderFirewallPoliciesSettings;
    }

    /** Returns the builder for the settings used for calls to listRelatedAccountGroups. */
    public PagedCallSettings.Builder<
            ListRelatedAccountGroupsRequest,
            ListRelatedAccountGroupsResponse,
            ListRelatedAccountGroupsPagedResponse>
        listRelatedAccountGroupsSettings() {
      return listRelatedAccountGroupsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to listRelatedAccountGroupMemberships.
     */
    public PagedCallSettings.Builder<
            ListRelatedAccountGroupMembershipsRequest,
            ListRelatedAccountGroupMembershipsResponse,
            ListRelatedAccountGroupMembershipsPagedResponse>
        listRelatedAccountGroupMembershipsSettings() {
      return listRelatedAccountGroupMembershipsSettings;
    }

    /**
     * Returns the builder for the settings used for calls to searchRelatedAccountGroupMemberships.
     */
    public PagedCallSettings.Builder<
            SearchRelatedAccountGroupMembershipsRequest,
            SearchRelatedAccountGroupMembershipsResponse,
            SearchRelatedAccountGroupMembershipsPagedResponse>
        searchRelatedAccountGroupMembershipsSettings() {
      return searchRelatedAccountGroupMembershipsSettings;
    }

    @Override
    public RecaptchaEnterpriseServiceStubSettings build() throws IOException {
      return new RecaptchaEnterpriseServiceStubSettings(this);
    }
  }
}
