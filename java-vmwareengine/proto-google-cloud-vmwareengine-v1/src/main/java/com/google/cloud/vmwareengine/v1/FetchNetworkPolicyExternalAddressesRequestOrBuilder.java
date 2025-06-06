/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmwareengine.v1;

public interface FetchNetworkPolicyExternalAddressesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.FetchNetworkPolicyExternalAddressesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the network policy to query for assigned
   * external IP addresses. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names. For
   * example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-policy`
   * </pre>
   *
   * <code>
   * string network_policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The networkPolicy.
   */
  java.lang.String getNetworkPolicy();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the network policy to query for assigned
   * external IP addresses. Resource names are schemeless URIs that follow the
   * conventions in https://cloud.google.com/apis/design/resource_names. For
   * example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-policy`
   * </pre>
   *
   * <code>
   * string network_policy = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for networkPolicy.
   */
  com.google.protobuf.ByteString getNetworkPolicyBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of external IP addresses to return in one page.
   * The service may return fewer than this value.
   * The maximum value is coerced to 1000.
   * The default value of this field is 500.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * `FetchNetworkPolicyExternalAddresses` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all parameters provided to
   * `FetchNetworkPolicyExternalAddresses`, except for `page_size` and
   * `page_token`, must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * `FetchNetworkPolicyExternalAddresses` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all parameters provided to
   * `FetchNetworkPolicyExternalAddresses`, except for `page_size` and
   * `page_token`, must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
