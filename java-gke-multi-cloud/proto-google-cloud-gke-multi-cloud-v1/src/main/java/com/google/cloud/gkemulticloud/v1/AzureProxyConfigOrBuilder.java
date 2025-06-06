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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkemulticloud.v1;

public interface AzureProxyConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureProxyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The ARM ID the of the resource group containing proxy keyvault.
   *
   * Resource group ids are formatted as
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
   * </pre>
   *
   * <code>string resource_group_id = 1;</code>
   *
   * @return The resourceGroupId.
   */
  java.lang.String getResourceGroupId();

  /**
   *
   *
   * <pre>
   * The ARM ID the of the resource group containing proxy keyvault.
   *
   * Resource group ids are formatted as
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-name&gt;`.
   * </pre>
   *
   * <code>string resource_group_id = 1;</code>
   *
   * @return The bytes for resourceGroupId.
   */
  com.google.protobuf.ByteString getResourceGroupIdBytes();

  /**
   *
   *
   * <pre>
   * The URL the of the proxy setting secret with its version.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/kubernetes-engine/multi-cloud/docs/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
   *
   * Secret ids are formatted as
   * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
   * </pre>
   *
   * <code>string secret_id = 2;</code>
   *
   * @return The secretId.
   */
  java.lang.String getSecretId();

  /**
   *
   *
   * <pre>
   * The URL the of the proxy setting secret with its version.
   *
   * The secret must be a JSON encoded proxy configuration
   * as described in
   * https://cloud.google.com/kubernetes-engine/multi-cloud/docs/azure/how-to/use-a-proxy#create_a_proxy_configuration_file
   *
   * Secret ids are formatted as
   * `https://&lt;key-vault-name&gt;.vault.azure.net/secrets/&lt;secret-name&gt;/&lt;secret-version&gt;`.
   * </pre>
   *
   * <code>string secret_id = 2;</code>
   *
   * @return The bytes for secretId.
   */
  com.google.protobuf.ByteString getSecretIdBytes();
}
