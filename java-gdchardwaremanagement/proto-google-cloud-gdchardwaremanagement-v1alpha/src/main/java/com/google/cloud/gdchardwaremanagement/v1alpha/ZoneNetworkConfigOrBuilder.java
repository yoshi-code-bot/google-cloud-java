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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface ZoneNetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.ZoneNetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for machine management.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per machine in the Zone.
   * Should be in `management_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string machine_mgmt_ipv4_range = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The machineMgmtIpv4Range.
   */
  java.lang.String getMachineMgmtIpv4Range();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for machine management.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per machine in the Zone.
   * Should be in `management_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string machine_mgmt_ipv4_range = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for machineMgmtIpv4Range.
   */
  com.google.protobuf.ByteString getMachineMgmtIpv4RangeBytes();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for kubernetes nodes.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per machine in the Zone.
   * Should be in `kubernetes_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string kubernetes_node_ipv4_range = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The kubernetesNodeIpv4Range.
   */
  java.lang.String getKubernetesNodeIpv4Range();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for kubernetes nodes.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per machine in the Zone.
   * Should be in `kubernetes_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string kubernetes_node_ipv4_range = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for kubernetesNodeIpv4Range.
   */
  com.google.protobuf.ByteString getKubernetesNodeIpv4RangeBytes();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for kubernetes control plane.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per cluster in the Zone.
   * Should be in `kubernetes_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string kubernetes_control_plane_ipv4_range = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The kubernetesControlPlaneIpv4Range.
   */
  java.lang.String getKubernetesControlPlaneIpv4Range();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 address block for kubernetes control plane.
   * Should be a private RFC1918 or public CIDR block large enough to allocate
   * at least one address per cluster in the Zone.
   * Should be in `kubernetes_ipv4_subnet`, and disjoint with other address
   * ranges.
   * </pre>
   *
   * <code>
   * string kubernetes_control_plane_ipv4_range = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for kubernetesControlPlaneIpv4Range.
   */
  com.google.protobuf.ByteString getKubernetesControlPlaneIpv4RangeBytes();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 subnet for the management network.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet management_ipv4_subnet = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the managementIpv4Subnet field is set.
   */
  boolean hasManagementIpv4Subnet();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 subnet for the management network.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet management_ipv4_subnet = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The managementIpv4Subnet.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Subnet getManagementIpv4Subnet();

  /**
   *
   *
   * <pre>
   * Required. An IPv4 subnet for the management network.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet management_ipv4_subnet = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SubnetOrBuilder getManagementIpv4SubnetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An IPv4 subnet for the kubernetes network.
   * If unspecified, the kubernetes subnet will be the same as the management
   * subnet.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet kubernetes_ipv4_subnet = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the kubernetesIpv4Subnet field is set.
   */
  boolean hasKubernetesIpv4Subnet();

  /**
   *
   *
   * <pre>
   * Optional. An IPv4 subnet for the kubernetes network.
   * If unspecified, the kubernetes subnet will be the same as the management
   * subnet.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet kubernetes_ipv4_subnet = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The kubernetesIpv4Subnet.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Subnet getKubernetesIpv4Subnet();

  /**
   *
   *
   * <pre>
   * Optional. An IPv4 subnet for the kubernetes network.
   * If unspecified, the kubernetes subnet will be the same as the management
   * subnet.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Subnet kubernetes_ipv4_subnet = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.SubnetOrBuilder getKubernetesIpv4SubnetOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. DNS nameservers.
   * The GDC Infrastructure will resolve DNS queries via these IPs.
   * If unspecified, Google DNS is used.
   * </pre>
   *
   * <code>
   * repeated string dns_ipv4_addresses = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return A list containing the dnsIpv4Addresses.
   */
  java.util.List<java.lang.String> getDnsIpv4AddressesList();

  /**
   *
   *
   * <pre>
   * Optional. DNS nameservers.
   * The GDC Infrastructure will resolve DNS queries via these IPs.
   * If unspecified, Google DNS is used.
   * </pre>
   *
   * <code>
   * repeated string dns_ipv4_addresses = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The count of dnsIpv4Addresses.
   */
  int getDnsIpv4AddressesCount();

  /**
   *
   *
   * <pre>
   * Optional. DNS nameservers.
   * The GDC Infrastructure will resolve DNS queries via these IPs.
   * If unspecified, Google DNS is used.
   * </pre>
   *
   * <code>
   * repeated string dns_ipv4_addresses = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The dnsIpv4Addresses at the given index.
   */
  java.lang.String getDnsIpv4Addresses(int index);

  /**
   *
   *
   * <pre>
   * Optional. DNS nameservers.
   * The GDC Infrastructure will resolve DNS queries via these IPs.
   * If unspecified, Google DNS is used.
   * </pre>
   *
   * <code>
   * repeated string dns_ipv4_addresses = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dnsIpv4Addresses at the given index.
   */
  com.google.protobuf.ByteString getDnsIpv4AddressesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Kubernetes VLAN ID.
   * By default, the kubernetes node, including the primary kubernetes network,
   * are in the same VLAN as the machine management network.
   * For network segmentation purposes, these can optionally be separated.
   * </pre>
   *
   * <code>int32 kubernetes_primary_vlan_id = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kubernetesPrimaryVlanId.
   */
  int getKubernetesPrimaryVlanId();
}
