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

public interface RouterStatusNatStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouterStatusNatStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"]
   * </pre>
   *
   * <code>repeated string auto_allocated_nat_ips = 510794246;</code>
   *
   * @return A list containing the autoAllocatedNatIps.
   */
  java.util.List<java.lang.String> getAutoAllocatedNatIpsList();

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"]
   * </pre>
   *
   * <code>repeated string auto_allocated_nat_ips = 510794246;</code>
   *
   * @return The count of autoAllocatedNatIps.
   */
  int getAutoAllocatedNatIpsCount();

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"]
   * </pre>
   *
   * <code>repeated string auto_allocated_nat_ips = 510794246;</code>
   *
   * @param index The index of the element to return.
   * @return The autoAllocatedNatIps at the given index.
   */
  java.lang.String getAutoAllocatedNatIps(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT. Example: ["1.1.1.1", "129.2.16.89"]
   * </pre>
   *
   * <code>repeated string auto_allocated_nat_ips = 510794246;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the autoAllocatedNatIps at the given index.
   */
  com.google.protobuf.ByteString getAutoAllocatedNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_auto_allocated_nat_ips = 309184557;</code>
   *
   * @return A list containing the drainAutoAllocatedNatIps.
   */
  java.util.List<java.lang.String> getDrainAutoAllocatedNatIpsList();

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_auto_allocated_nat_ips = 309184557;</code>
   *
   * @return The count of drainAutoAllocatedNatIps.
   */
  int getDrainAutoAllocatedNatIpsCount();

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_auto_allocated_nat_ips = 309184557;</code>
   *
   * @param index The index of the element to return.
   * @return The drainAutoAllocatedNatIps at the given index.
   */
  java.lang.String getDrainAutoAllocatedNatIps(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs auto-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_auto_allocated_nat_ips = 309184557;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the drainAutoAllocatedNatIps at the given index.
   */
  com.google.protobuf.ByteString getDrainAutoAllocatedNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_user_allocated_nat_ips = 305268553;</code>
   *
   * @return A list containing the drainUserAllocatedNatIps.
   */
  java.util.List<java.lang.String> getDrainUserAllocatedNatIpsList();

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_user_allocated_nat_ips = 305268553;</code>
   *
   * @return The count of drainUserAllocatedNatIps.
   */
  int getDrainUserAllocatedNatIpsCount();

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_user_allocated_nat_ips = 305268553;</code>
   *
   * @param index The index of the element to return.
   * @return The drainUserAllocatedNatIps at the given index.
   */
  java.lang.String getDrainUserAllocatedNatIps(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT that are in drain mode. Example: ["1.1.1.1", "179.12.26.133"].
   * </pre>
   *
   * <code>repeated string drain_user_allocated_nat_ips = 305268553;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the drainUserAllocatedNatIps at the given index.
   */
  com.google.protobuf.ByteString getDrainUserAllocatedNatIpsBytes(int index);

  /**
   *
   *
   * <pre>
   * The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when auto-allocation of NAT IPs is *not* used.
   * </pre>
   *
   * <code>optional int32 min_extra_nat_ips_needed = 365786338;</code>
   *
   * @return Whether the minExtraNatIpsNeeded field is set.
   */
  boolean hasMinExtraNatIpsNeeded();

  /**
   *
   *
   * <pre>
   * The number of extra IPs to allocate. This will be greater than 0 only if user-specified IPs are NOT enough to allow all configured VMs to use NAT. This value is meaningful only when auto-allocation of NAT IPs is *not* used.
   * </pre>
   *
   * <code>optional int32 min_extra_nat_ips_needed = 365786338;</code>
   *
   * @return The minExtraNatIpsNeeded.
   */
  int getMinExtraNatIpsNeeded();

  /**
   *
   *
   * <pre>
   * Unique name of this NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();

  /**
   *
   *
   * <pre>
   * Unique name of this NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Unique name of this NAT.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Number of VM endpoints (i.e., Nics) that can use NAT.
   * </pre>
   *
   * <code>optional int32 num_vm_endpoints_with_nat_mappings = 512367468;</code>
   *
   * @return Whether the numVmEndpointsWithNatMappings field is set.
   */
  boolean hasNumVmEndpointsWithNatMappings();

  /**
   *
   *
   * <pre>
   * Number of VM endpoints (i.e., Nics) that can use NAT.
   * </pre>
   *
   * <code>optional int32 num_vm_endpoints_with_nat_mappings = 512367468;</code>
   *
   * @return The numVmEndpointsWithNatMappings.
   */
  int getNumVmEndpointsWithNatMappings();

  /**
   *
   *
   * <pre>
   * Status of rules in this NAT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus rule_status = 140223125;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus>
      getRuleStatusList();

  /**
   *
   *
   * <pre>
   * Status of rules in this NAT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus rule_status = 140223125;
   * </code>
   */
  com.google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus getRuleStatus(int index);

  /**
   *
   *
   * <pre>
   * Status of rules in this NAT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus rule_status = 140223125;
   * </code>
   */
  int getRuleStatusCount();

  /**
   *
   *
   * <pre>
   * Status of rules in this NAT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus rule_status = 140223125;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatusOrBuilder>
      getRuleStatusOrBuilderList();

  /**
   *
   *
   * <pre>
   * Status of rules in this NAT.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatus rule_status = 140223125;
   * </code>
   */
  com.google.cloud.compute.v1.RouterStatusNatStatusNatRuleStatusOrBuilder getRuleStatusOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A list of fully qualified URLs of reserved IP address resources.
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ip_resources = 212776151;</code>
   *
   * @return A list containing the userAllocatedNatIpResources.
   */
  java.util.List<java.lang.String> getUserAllocatedNatIpResourcesList();

  /**
   *
   *
   * <pre>
   * A list of fully qualified URLs of reserved IP address resources.
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ip_resources = 212776151;</code>
   *
   * @return The count of userAllocatedNatIpResources.
   */
  int getUserAllocatedNatIpResourcesCount();

  /**
   *
   *
   * <pre>
   * A list of fully qualified URLs of reserved IP address resources.
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ip_resources = 212776151;</code>
   *
   * @param index The index of the element to return.
   * @return The userAllocatedNatIpResources at the given index.
   */
  java.lang.String getUserAllocatedNatIpResources(int index);

  /**
   *
   *
   * <pre>
   * A list of fully qualified URLs of reserved IP address resources.
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ip_resources = 212776151;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the userAllocatedNatIpResources at the given index.
   */
  com.google.protobuf.ByteString getUserAllocatedNatIpResourcesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133".
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ips = 506878242;</code>
   *
   * @return A list containing the userAllocatedNatIps.
   */
  java.util.List<java.lang.String> getUserAllocatedNatIpsList();

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133".
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ips = 506878242;</code>
   *
   * @return The count of userAllocatedNatIps.
   */
  int getUserAllocatedNatIpsCount();

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133".
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ips = 506878242;</code>
   *
   * @param index The index of the element to return.
   * @return The userAllocatedNatIps at the given index.
   */
  java.lang.String getUserAllocatedNatIps(int index);

  /**
   *
   *
   * <pre>
   * A list of IPs user-allocated for NAT. They will be raw IP strings like "179.12.26.133".
   * </pre>
   *
   * <code>repeated string user_allocated_nat_ips = 506878242;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the userAllocatedNatIps at the given index.
   */
  com.google.protobuf.ByteString getUserAllocatedNatIpsBytes(int index);
}
