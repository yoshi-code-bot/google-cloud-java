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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.managedidentities.v1;

public interface CreateMicrosoftAdDomainRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.managedidentities.v1.CreateMicrosoftAdDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource project name and location using the form:
   * `projects/{project_id}/locations/global`
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
   * Required. The resource project name and location using the form:
   * `projects/{project_id}/locations/global`
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
   * Required. The fully qualified domain name.
   * e.g. mydomain.myorganization.com, with the following restrictions:
   *
   *  * Must contain only lowercase letters, numbers, periods and hyphens.
   *  * Must start with a letter.
   *  * Must contain between 2-64 characters.
   *  * Must end with a number or a letter.
   *  * Must not start with period.
   *  * First segement length (mydomain form example above) shouldn't exceed
   *    15 chars.
   *  * The last segment cannot be fully numeric.
   *  * Must be unique within the customer project.
   * </pre>
   *
   * <code>string domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The domainName.
   */
  java.lang.String getDomainName();

  /**
   *
   *
   * <pre>
   * Required. The fully qualified domain name.
   * e.g. mydomain.myorganization.com, with the following restrictions:
   *
   *  * Must contain only lowercase letters, numbers, periods and hyphens.
   *  * Must start with a letter.
   *  * Must contain between 2-64 characters.
   *  * Must end with a number or a letter.
   *  * Must not start with period.
   *  * First segement length (mydomain form example above) shouldn't exceed
   *    15 chars.
   *  * The last segment cannot be fully numeric.
   *  * Must be unique within the customer project.
   * </pre>
   *
   * <code>string domain_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for domainName.
   */
  com.google.protobuf.ByteString getDomainNameBytes();

  /**
   *
   *
   * <pre>
   * Required. A Managed Identity domain resource.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the domain field is set.
   */
  boolean hasDomain();

  /**
   *
   *
   * <pre>
   * Required. A Managed Identity domain resource.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The domain.
   */
  com.google.cloud.managedidentities.v1.Domain getDomain();

  /**
   *
   *
   * <pre>
   * Required. A Managed Identity domain resource.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Domain domain = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.managedidentities.v1.DomainOrBuilder getDomainOrBuilder();
}
