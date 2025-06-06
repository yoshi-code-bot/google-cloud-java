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
// source: google/identity/accesscontextmanager/v1/service_perimeter.proto

// Protobuf Java Version: 3.25.8
package com.google.identity.accesscontextmanager.v1;

public interface ServicePerimeterConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.ServicePerimeterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of Google Cloud resources that are inside of the service perimeter.
   * Currently only projects are allowed. Format: `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string resources = 1;</code>
   *
   * @return A list containing the resources.
   */
  java.util.List<java.lang.String> getResourcesList();

  /**
   *
   *
   * <pre>
   * A list of Google Cloud resources that are inside of the service perimeter.
   * Currently only projects are allowed. Format: `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string resources = 1;</code>
   *
   * @return The count of resources.
   */
  int getResourcesCount();

  /**
   *
   *
   * <pre>
   * A list of Google Cloud resources that are inside of the service perimeter.
   * Currently only projects are allowed. Format: `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string resources = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The resources at the given index.
   */
  java.lang.String getResources(int index);

  /**
   *
   *
   * <pre>
   * A list of Google Cloud resources that are inside of the service perimeter.
   * Currently only projects are allowed. Format: `projects/{project_number}`
   * </pre>
   *
   * <code>repeated string resources = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resources at the given index.
   */
  com.google.protobuf.ByteString getResourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of `AccessLevel` resource names that allow resources within the
   * `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed
   * must be in the same policy as this `ServicePerimeter`. Referencing a
   * nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are
   * listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`.
   * For Service Perimeter Bridge, must be empty.
   * </pre>
   *
   * <code>repeated string access_levels = 2;</code>
   *
   * @return A list containing the accessLevels.
   */
  java.util.List<java.lang.String> getAccessLevelsList();

  /**
   *
   *
   * <pre>
   * A list of `AccessLevel` resource names that allow resources within the
   * `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed
   * must be in the same policy as this `ServicePerimeter`. Referencing a
   * nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are
   * listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`.
   * For Service Perimeter Bridge, must be empty.
   * </pre>
   *
   * <code>repeated string access_levels = 2;</code>
   *
   * @return The count of accessLevels.
   */
  int getAccessLevelsCount();

  /**
   *
   *
   * <pre>
   * A list of `AccessLevel` resource names that allow resources within the
   * `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed
   * must be in the same policy as this `ServicePerimeter`. Referencing a
   * nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are
   * listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`.
   * For Service Perimeter Bridge, must be empty.
   * </pre>
   *
   * <code>repeated string access_levels = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The accessLevels at the given index.
   */
  java.lang.String getAccessLevels(int index);

  /**
   *
   *
   * <pre>
   * A list of `AccessLevel` resource names that allow resources within the
   * `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed
   * must be in the same policy as this `ServicePerimeter`. Referencing a
   * nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are
   * listed, resources within the perimeter can only be accessed via Google
   * Cloud calls with request origins within the perimeter. Example:
   * `"accessPolicies/MY_POLICY/accessLevels/MY_LEVEL"`.
   * For Service Perimeter Bridge, must be empty.
   * </pre>
   *
   * <code>repeated string access_levels = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the accessLevels at the given index.
   */
  com.google.protobuf.ByteString getAccessLevelsBytes(int index);

  /**
   *
   *
   * <pre>
   * Google Cloud services that are subject to the Service Perimeter
   * restrictions. For example, if `storage.googleapis.com` is specified, access
   * to the storage buckets inside the perimeter must meet the perimeter's
   * access restrictions.
   * </pre>
   *
   * <code>repeated string restricted_services = 4;</code>
   *
   * @return A list containing the restrictedServices.
   */
  java.util.List<java.lang.String> getRestrictedServicesList();

  /**
   *
   *
   * <pre>
   * Google Cloud services that are subject to the Service Perimeter
   * restrictions. For example, if `storage.googleapis.com` is specified, access
   * to the storage buckets inside the perimeter must meet the perimeter's
   * access restrictions.
   * </pre>
   *
   * <code>repeated string restricted_services = 4;</code>
   *
   * @return The count of restrictedServices.
   */
  int getRestrictedServicesCount();

  /**
   *
   *
   * <pre>
   * Google Cloud services that are subject to the Service Perimeter
   * restrictions. For example, if `storage.googleapis.com` is specified, access
   * to the storage buckets inside the perimeter must meet the perimeter's
   * access restrictions.
   * </pre>
   *
   * <code>repeated string restricted_services = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The restrictedServices at the given index.
   */
  java.lang.String getRestrictedServices(int index);

  /**
   *
   *
   * <pre>
   * Google Cloud services that are subject to the Service Perimeter
   * restrictions. For example, if `storage.googleapis.com` is specified, access
   * to the storage buckets inside the perimeter must meet the perimeter's
   * access restrictions.
   * </pre>
   *
   * <code>repeated string restricted_services = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the restrictedServices at the given index.
   */
  com.google.protobuf.ByteString getRestrictedServicesBytes(int index);

  /**
   *
   *
   * <pre>
   * Configuration for APIs allowed within Perimeter.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServices vpc_accessible_services = 10;
   * </code>
   *
   * @return Whether the vpcAccessibleServices field is set.
   */
  boolean hasVpcAccessibleServices();

  /**
   *
   *
   * <pre>
   * Configuration for APIs allowed within Perimeter.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServices vpc_accessible_services = 10;
   * </code>
   *
   * @return The vpcAccessibleServices.
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServices
      getVpcAccessibleServices();

  /**
   *
   *
   * <pre>
   * Configuration for APIs allowed within Perimeter.
   * </pre>
   *
   * <code>
   * .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServices vpc_accessible_services = 10;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.VpcAccessibleServicesOrBuilder
      getVpcAccessibleServicesOrBuilder();

  /**
   *
   *
   * <pre>
   * List of [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy],
   * each of which is evaluated separately. Access is granted if any [Ingress
   * Policy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy ingress_policies = 8;
   * </code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy>
      getIngressPoliciesList();

  /**
   *
   *
   * <pre>
   * List of [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy],
   * each of which is evaluated separately. Access is granted if any [Ingress
   * Policy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy ingress_policies = 8;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy
      getIngressPolicies(int index);

  /**
   *
   *
   * <pre>
   * List of [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy],
   * each of which is evaluated separately. Access is granted if any [Ingress
   * Policy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy ingress_policies = 8;
   * </code>
   */
  int getIngressPoliciesCount();

  /**
   *
   *
   * <pre>
   * List of [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy],
   * each of which is evaluated separately. Access is granted if any [Ingress
   * Policy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy ingress_policies = 8;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig
                  .IngressPolicyOrBuilder>
      getIngressPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [IngressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy],
   * each of which is evaluated separately. Access is granted if any [Ingress
   * Policy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicy ingress_policies = 8;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.IngressPolicyOrBuilder
      getIngressPoliciesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy],
   * each of which is evaluated separately. Access is granted if any
   * [EgressPolicy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy egress_policies = 9;
   * </code>
   */
  java.util.List<com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy>
      getEgressPoliciesList();

  /**
   *
   *
   * <pre>
   * List of [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy],
   * each of which is evaluated separately. Access is granted if any
   * [EgressPolicy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy egress_policies = 9;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy getEgressPolicies(
      int index);

  /**
   *
   *
   * <pre>
   * List of [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy],
   * each of which is evaluated separately. Access is granted if any
   * [EgressPolicy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy egress_policies = 9;
   * </code>
   */
  int getEgressPoliciesCount();

  /**
   *
   *
   * <pre>
   * List of [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy],
   * each of which is evaluated separately. Access is granted if any
   * [EgressPolicy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy egress_policies = 9;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig
                  .EgressPolicyOrBuilder>
      getEgressPoliciesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * to apply to the perimeter. A perimeter may have multiple [EgressPolicies]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy],
   * each of which is evaluated separately. Access is granted if any
   * [EgressPolicy]
   * [google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy]
   * grants it. Must be empty for a perimeter bridge.
   * </pre>
   *
   * <code>
   * repeated .google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicy egress_policies = 9;
   * </code>
   */
  com.google.identity.accesscontextmanager.v1.ServicePerimeterConfig.EgressPolicyOrBuilder
      getEgressPoliciesOrBuilder(int index);
}
