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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface UsableSubnetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UsableSubnetwork)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The external IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6_prefix = 139299190;</code>
   *
   * @return Whether the externalIpv6Prefix field is set.
   */
  boolean hasExternalIpv6Prefix();

  /**
   *
   *
   * <pre>
   * [Output Only] The external IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6_prefix = 139299190;</code>
   *
   * @return The externalIpv6Prefix.
   */
  java.lang.String getExternalIpv6Prefix();

  /**
   *
   *
   * <pre>
   * [Output Only] The external IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string external_ipv6_prefix = 139299190;</code>
   *
   * @return The bytes for externalIpv6Prefix.
   */
  com.google.protobuf.ByteString getExternalIpv6PrefixBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The internal IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string internal_ipv6_prefix = 506270056;</code>
   *
   * @return Whether the internalIpv6Prefix field is set.
   */
  boolean hasInternalIpv6Prefix();

  /**
   *
   *
   * <pre>
   * [Output Only] The internal IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string internal_ipv6_prefix = 506270056;</code>
   *
   * @return The internalIpv6Prefix.
   */
  java.lang.String getInternalIpv6Prefix();

  /**
   *
   *
   * <pre>
   * [Output Only] The internal IPv6 address range that is assigned to this subnetwork.
   * </pre>
   *
   * <code>optional string internal_ipv6_prefix = 506270056;</code>
   *
   * @return The bytes for internalIpv6Prefix.
   */
  com.google.protobuf.ByteString getInternalIpv6PrefixBytes();

  /**
   *
   *
   * <pre>
   * The range of internal addresses that are owned by this subnetwork.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();

  /**
   *
   *
   * <pre>
   * The range of internal addresses that are owned by this subnetwork.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();

  /**
   *
   *
   * <pre>
   * The range of internal addresses that are owned by this subnetwork.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   *
   * @return Whether the ipv6AccessType field is set.
   */
  boolean hasIpv6AccessType();

  /**
   *
   *
   * <pre>
   * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   *
   * @return The ipv6AccessType.
   */
  java.lang.String getIpv6AccessType();

  /**
   *
   *
   * <pre>
   * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   *
   * @return The bytes for ipv6AccessType.
   */
  com.google.protobuf.ByteString getIpv6AccessTypeBytes();

  /**
   *
   *
   * <pre>
   * Network URL.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();

  /**
   *
   *
   * <pre>
   * Network URL.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();

  /**
   *
   *
   * <pre>
   * Network URL.
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   *
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   *
   * @return Whether the purpose field is set.
   */
  boolean hasPurpose();

  /**
   *
   *
   * <pre>
   *
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   *
   * @return The purpose.
   */
  java.lang.String getPurpose();

  /**
   *
   *
   * <pre>
   *
   * Check the Purpose enum for the list of possible values.
   * </pre>
   *
   * <code>optional string purpose = 316407070;</code>
   *
   * @return The bytes for purpose.
   */
  com.google.protobuf.ByteString getPurposeBytes();

  /**
   *
   *
   * <pre>
   * The role of subnetwork. Currently, this field is only used when purpose is set to GLOBAL_MANAGED_PROXY or REGIONAL_MANAGED_PROXY. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Envoy-based load balancers in a region. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
   * Check the Role enum for the list of possible values.
   * </pre>
   *
   * <code>optional string role = 3506294;</code>
   *
   * @return Whether the role field is set.
   */
  boolean hasRole();

  /**
   *
   *
   * <pre>
   * The role of subnetwork. Currently, this field is only used when purpose is set to GLOBAL_MANAGED_PROXY or REGIONAL_MANAGED_PROXY. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Envoy-based load balancers in a region. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
   * Check the Role enum for the list of possible values.
   * </pre>
   *
   * <code>optional string role = 3506294;</code>
   *
   * @return The role.
   */
  java.lang.String getRole();

  /**
   *
   *
   * <pre>
   * The role of subnetwork. Currently, this field is only used when purpose is set to GLOBAL_MANAGED_PROXY or REGIONAL_MANAGED_PROXY. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Envoy-based load balancers in a region. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
   * Check the Role enum for the list of possible values.
   * </pre>
   *
   * <code>optional string role = 3506294;</code>
   *
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString getRoleBytes();

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 136658915;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange>
      getSecondaryIpRangesList();

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 136658915;
   * </code>
   */
  com.google.cloud.compute.v1.UsableSubnetworkSecondaryRange getSecondaryIpRanges(int index);

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 136658915;
   * </code>
   */
  int getSecondaryIpRangesCount();

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 136658915;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.UsableSubnetworkSecondaryRangeOrBuilder>
      getSecondaryIpRangesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Secondary IP ranges.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.UsableSubnetworkSecondaryRange secondary_ip_ranges = 136658915;
   * </code>
   */
  com.google.cloud.compute.v1.UsableSubnetworkSecondaryRangeOrBuilder getSecondaryIpRangesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return Whether the stackType field is set.
   */
  boolean hasStackType();

  /**
   *
   *
   * <pre>
   * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return The stackType.
   */
  java.lang.String getStackType();

  /**
   *
   *
   * <pre>
   * The stack type for the subnet. If set to IPV4_ONLY, new VMs in the subnet are assigned IPv4 addresses only. If set to IPV4_IPV6, new VMs in the subnet can be assigned both IPv4 and IPv6 addresses. If not specified, IPV4_ONLY is used. This field can be both set at resource creation time and updated using patch.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   *
   * @return The bytes for stackType.
   */
  com.google.protobuf.ByteString getStackTypeBytes();

  /**
   *
   *
   * <pre>
   * Subnetwork URL.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();

  /**
   *
   *
   * <pre>
   * Subnetwork URL.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();

  /**
   *
   *
   * <pre>
   * Subnetwork URL.
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();
}
