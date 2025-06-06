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
// source: google/cloud/discoveryengine/v1/identity_mapping_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface CreateIdentityMappingStoreRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.CreateIdentityMappingStoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the CmekConfig to use for protecting this Identity
   * Mapping Store.
   * </pre>
   *
   * <code>string cmek_config_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the cmekConfigName field is set.
   */
  boolean hasCmekConfigName();

  /**
   *
   *
   * <pre>
   * Resource name of the CmekConfig to use for protecting this Identity
   * Mapping Store.
   * </pre>
   *
   * <code>string cmek_config_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The cmekConfigName.
   */
  java.lang.String getCmekConfigName();

  /**
   *
   *
   * <pre>
   * Resource name of the CmekConfig to use for protecting this Identity
   * Mapping Store.
   * </pre>
   *
   * <code>string cmek_config_name = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for cmekConfigName.
   */
  com.google.protobuf.ByteString getCmekConfigNameBytes();

  /**
   *
   *
   * <pre>
   * Identity Mapping Store without CMEK protections. If a default CmekConfig
   * is set for the project, setting this field will override the default
   * CmekConfig as well.
   * </pre>
   *
   * <code>bool disable_cmek = 6;</code>
   *
   * @return Whether the disableCmek field is set.
   */
  boolean hasDisableCmek();

  /**
   *
   *
   * <pre>
   * Identity Mapping Store without CMEK protections. If a default CmekConfig
   * is set for the project, setting this field will override the default
   * CmekConfig as well.
   * </pre>
   *
   * <code>bool disable_cmek = 6;</code>
   *
   * @return The disableCmek.
   */
  boolean getDisableCmek();

  /**
   *
   *
   * <pre>
   * Required. The parent collection resource name, such as
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent collection resource name, such as
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID of the Identity Mapping Store to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 63 characters.
   * </pre>
   *
   * <code>string identity_mapping_store_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The identityMappingStoreId.
   */
  java.lang.String getIdentityMappingStoreId();

  /**
   *
   *
   * <pre>
   * Required. The ID of the Identity Mapping Store to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). The maximum length is 63 characters.
   * </pre>
   *
   * <code>string identity_mapping_store_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for identityMappingStoreId.
   */
  com.google.protobuf.ByteString getIdentityMappingStoreIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Identity Mapping Store to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.IdentityMappingStore identity_mapping_store = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the identityMappingStore field is set.
   */
  boolean hasIdentityMappingStore();

  /**
   *
   *
   * <pre>
   * Required. The Identity Mapping Store to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.IdentityMappingStore identity_mapping_store = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The identityMappingStore.
   */
  com.google.cloud.discoveryengine.v1.IdentityMappingStore getIdentityMappingStore();

  /**
   *
   *
   * <pre>
   * Required. The Identity Mapping Store to create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.IdentityMappingStore identity_mapping_store = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1.IdentityMappingStoreOrBuilder
      getIdentityMappingStoreOrBuilder();

  com.google.cloud.discoveryengine.v1.CreateIdentityMappingStoreRequest.CmekOptionsCase
      getCmekOptionsCase();
}
