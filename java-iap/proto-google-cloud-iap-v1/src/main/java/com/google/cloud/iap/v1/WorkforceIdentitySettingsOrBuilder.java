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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iap.v1;

public interface WorkforceIdentitySettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iap.v1.WorkforceIdentitySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The workforce pool resources. Only one workforce pool is accepted.
   * </pre>
   *
   * <code>repeated string workforce_pools = 1;</code>
   *
   * @return A list containing the workforcePools.
   */
  java.util.List<java.lang.String> getWorkforcePoolsList();

  /**
   *
   *
   * <pre>
   * The workforce pool resources. Only one workforce pool is accepted.
   * </pre>
   *
   * <code>repeated string workforce_pools = 1;</code>
   *
   * @return The count of workforcePools.
   */
  int getWorkforcePoolsCount();

  /**
   *
   *
   * <pre>
   * The workforce pool resources. Only one workforce pool is accepted.
   * </pre>
   *
   * <code>repeated string workforce_pools = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The workforcePools at the given index.
   */
  java.lang.String getWorkforcePools(int index);

  /**
   *
   *
   * <pre>
   * The workforce pool resources. Only one workforce pool is accepted.
   * </pre>
   *
   * <code>repeated string workforce_pools = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the workforcePools at the given index.
   */
  com.google.protobuf.ByteString getWorkforcePoolsBytes(int index);

  /**
   *
   *
   * <pre>
   * OAuth 2.0 settings for IAP to perform OIDC flow with workforce identity
   * federation services.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.OAuth2 oauth2 = 2;</code>
   *
   * @return Whether the oauth2 field is set.
   */
  boolean hasOauth2();

  /**
   *
   *
   * <pre>
   * OAuth 2.0 settings for IAP to perform OIDC flow with workforce identity
   * federation services.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.OAuth2 oauth2 = 2;</code>
   *
   * @return The oauth2.
   */
  com.google.cloud.iap.v1.OAuth2 getOauth2();

  /**
   *
   *
   * <pre>
   * OAuth 2.0 settings for IAP to perform OIDC flow with workforce identity
   * federation services.
   * </pre>
   *
   * <code>.google.cloud.iap.v1.OAuth2 oauth2 = 2;</code>
   */
  com.google.cloud.iap.v1.OAuth2OrBuilder getOauth2OrBuilder();
}
