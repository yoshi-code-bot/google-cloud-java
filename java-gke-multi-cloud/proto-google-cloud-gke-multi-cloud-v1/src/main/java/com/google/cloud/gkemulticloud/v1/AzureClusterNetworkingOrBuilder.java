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

public interface AzureClusterNetworkingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureClusterNetworking)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Azure Resource Manager (ARM) ID of the VNet associated with
   * your cluster.
   *
   * All components in the cluster (i.e. control plane and node pools) run on a
   * single VNet.
   *
   * Example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.Network/virtualNetworks/&lt;vnet-id&gt;`
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>string virtual_network_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The virtualNetworkId.
   */
  java.lang.String getVirtualNetworkId();

  /**
   *
   *
   * <pre>
   * Required. The Azure Resource Manager (ARM) ID of the VNet associated with
   * your cluster.
   *
   * All components in the cluster (i.e. control plane and node pools) run on a
   * single VNet.
   *
   * Example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.Network/virtualNetworks/&lt;vnet-id&gt;`
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>string virtual_network_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for virtualNetworkId.
   */
  com.google.protobuf.ByteString getVirtualNetworkIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The IP address range of the pods in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All pods in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the podAddressCidrBlocks.
   */
  java.util.List<java.lang.String> getPodAddressCidrBlocksList();

  /**
   *
   *
   * <pre>
   * Required. The IP address range of the pods in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All pods in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of podAddressCidrBlocks.
   */
  int getPodAddressCidrBlocksCount();

  /**
   *
   *
   * <pre>
   * Required. The IP address range of the pods in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All pods in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The podAddressCidrBlocks at the given index.
   */
  java.lang.String getPodAddressCidrBlocks(int index);

  /**
   *
   *
   * <pre>
   * Required. The IP address range of the pods in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All pods in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creation.
   * </pre>
   *
   * <code>repeated string pod_address_cidr_blocks = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the podAddressCidrBlocks at the given index.
   */
  com.google.protobuf.ByteString getPodAddressCidrBlocksBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The IP address range for services in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All services in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creating a cluster.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the serviceAddressCidrBlocks.
   */
  java.util.List<java.lang.String> getServiceAddressCidrBlocksList();

  /**
   *
   *
   * <pre>
   * Required. The IP address range for services in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All services in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creating a cluster.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of serviceAddressCidrBlocks.
   */
  int getServiceAddressCidrBlocksCount();

  /**
   *
   *
   * <pre>
   * Required. The IP address range for services in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All services in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creating a cluster.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The serviceAddressCidrBlocks at the given index.
   */
  java.lang.String getServiceAddressCidrBlocks(int index);

  /**
   *
   *
   * <pre>
   * Required. The IP address range for services in this cluster, in CIDR
   * notation (e.g. `10.96.0.0/14`).
   *
   * All services in the cluster get assigned a unique IPv4 address from these
   * ranges. Only a single range is supported.
   *
   * This field cannot be changed after creating a cluster.
   * </pre>
   *
   * <code>
   * repeated string service_address_cidr_blocks = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the serviceAddressCidrBlocks at the given index.
   */
  com.google.protobuf.ByteString getServiceAddressCidrBlocksBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The ARM ID of the subnet where Kubernetes private service type
   * load balancers are deployed. When unspecified, it defaults to
   * AzureControlPlane.subnet_id.
   *
   * Example:
   * "/subscriptions/d00494d6-6f3c-4280-bbb2-899e163d1d30/resourceGroups/anthos_cluster_gkeust4/providers/Microsoft.Network/virtualNetworks/gke-vnet-gkeust4/subnets/subnetid456"
   * </pre>
   *
   * <code>string service_load_balancer_subnet_id = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceLoadBalancerSubnetId.
   */
  java.lang.String getServiceLoadBalancerSubnetId();

  /**
   *
   *
   * <pre>
   * Optional. The ARM ID of the subnet where Kubernetes private service type
   * load balancers are deployed. When unspecified, it defaults to
   * AzureControlPlane.subnet_id.
   *
   * Example:
   * "/subscriptions/d00494d6-6f3c-4280-bbb2-899e163d1d30/resourceGroups/anthos_cluster_gkeust4/providers/Microsoft.Network/virtualNetworks/gke-vnet-gkeust4/subnets/subnetid456"
   * </pre>
   *
   * <code>string service_load_balancer_subnet_id = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for serviceLoadBalancerSubnetId.
   */
  com.google.protobuf.ByteString getServiceLoadBalancerSubnetIdBytes();
}
