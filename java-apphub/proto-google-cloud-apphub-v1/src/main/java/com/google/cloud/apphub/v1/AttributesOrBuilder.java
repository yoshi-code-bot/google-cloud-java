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
// source: google/cloud/apphub/v1/attributes.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apphub.v1;

public interface AttributesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apphub.v1.Attributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. User-defined criticality information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Criticality criticality = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the criticality field is set.
   */
  boolean hasCriticality();

  /**
   *
   *
   * <pre>
   * Optional. User-defined criticality information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Criticality criticality = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The criticality.
   */
  com.google.cloud.apphub.v1.Criticality getCriticality();

  /**
   *
   *
   * <pre>
   * Optional. User-defined criticality information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Criticality criticality = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.CriticalityOrBuilder getCriticalityOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User-defined environment information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Environment environment = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();

  /**
   *
   *
   * <pre>
   * Optional. User-defined environment information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Environment environment = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The environment.
   */
  com.google.cloud.apphub.v1.Environment getEnvironment();

  /**
   *
   *
   * <pre>
   * Optional. User-defined environment information.
   * </pre>
   *
   * <code>
   * .google.cloud.apphub.v1.Environment environment = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Developer team that owns development and coding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo developer_owners = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.apphub.v1.ContactInfo> getDeveloperOwnersList();

  /**
   *
   *
   * <pre>
   * Optional. Developer team that owns development and coding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo developer_owners = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfo getDeveloperOwners(int index);

  /**
   *
   *
   * <pre>
   * Optional. Developer team that owns development and coding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo developer_owners = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getDeveloperOwnersCount();

  /**
   *
   *
   * <pre>
   * Optional. Developer team that owns development and coding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo developer_owners = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.apphub.v1.ContactInfoOrBuilder>
      getDeveloperOwnersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Developer team that owns development and coding.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo developer_owners = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfoOrBuilder getDeveloperOwnersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Operator team that ensures runtime and operations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo operator_owners = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.apphub.v1.ContactInfo> getOperatorOwnersList();

  /**
   *
   *
   * <pre>
   * Optional. Operator team that ensures runtime and operations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo operator_owners = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfo getOperatorOwners(int index);

  /**
   *
   *
   * <pre>
   * Optional. Operator team that ensures runtime and operations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo operator_owners = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getOperatorOwnersCount();

  /**
   *
   *
   * <pre>
   * Optional. Operator team that ensures runtime and operations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo operator_owners = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.apphub.v1.ContactInfoOrBuilder>
      getOperatorOwnersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Operator team that ensures runtime and operations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo operator_owners = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfoOrBuilder getOperatorOwnersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Business team that ensures user needs are met and value is
   * delivered
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo business_owners = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.apphub.v1.ContactInfo> getBusinessOwnersList();

  /**
   *
   *
   * <pre>
   * Optional. Business team that ensures user needs are met and value is
   * delivered
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo business_owners = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfo getBusinessOwners(int index);

  /**
   *
   *
   * <pre>
   * Optional. Business team that ensures user needs are met and value is
   * delivered
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo business_owners = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getBusinessOwnersCount();

  /**
   *
   *
   * <pre>
   * Optional. Business team that ensures user needs are met and value is
   * delivered
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo business_owners = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.apphub.v1.ContactInfoOrBuilder>
      getBusinessOwnersOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Business team that ensures user needs are met and value is
   * delivered
   * </pre>
   *
   * <code>
   * repeated .google.cloud.apphub.v1.ContactInfo business_owners = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.apphub.v1.ContactInfoOrBuilder getBusinessOwnersOrBuilder(int index);
}
