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

public interface NetworkEndpointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  int getAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Optional metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  boolean containsAnnotations(java.lang.String key);

  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();

  /**
   *
   *
   * <pre>
   * Optional metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();

  /**
   *
   *
   * <pre>
   * Optional metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional metadata defined as annotations on the network endpoint.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 112032548;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Represents the port number to which PSC consumer sends packets. Optional. Only valid for network endpoint groups created with GCE_VM_IP_PORTMAP endpoint type.
   * </pre>
   *
   * <code>optional int32 client_destination_port = 123765766;</code>
   *
   * @return Whether the clientDestinationPort field is set.
   */
  boolean hasClientDestinationPort();

  /**
   *
   *
   * <pre>
   * Represents the port number to which PSC consumer sends packets. Optional. Only valid for network endpoint groups created with GCE_VM_IP_PORTMAP endpoint type.
   * </pre>
   *
   * <code>optional int32 client_destination_port = 123765766;</code>
   *
   * @return The clientDestinationPort.
   */
  int getClientDestinationPort();

  /**
   *
   *
   * <pre>
   * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * </pre>
   *
   * <code>optional string fqdn = 3150485;</code>
   *
   * @return Whether the fqdn field is set.
   */
  boolean hasFqdn();

  /**
   *
   *
   * <pre>
   * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * </pre>
   *
   * <code>optional string fqdn = 3150485;</code>
   *
   * @return The fqdn.
   */
  java.lang.String getFqdn();

  /**
   *
   *
   * <pre>
   * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
   * </pre>
   *
   * <code>optional string fqdn = 3150485;</code>
   *
   * @return The bytes for fqdn.
   */
  com.google.protobuf.ByteString getFqdnBytes();

  /**
   *
   *
   * <pre>
   * The name or a URL of VM instance of this network endpoint. Optional, the field presence depends on the network endpoint type. The field is required for network endpoints of type GCE_VM_IP and GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group (for zonal NEGs) or in the zone within the region of the NEG (for regional NEGs). If the ipAddress is specified, it must belongs to the VM instance. The name must be 1-63 characters long, and comply with RFC1035 or be a valid URL pointing to an existing instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();

  /**
   *
   *
   * <pre>
   * The name or a URL of VM instance of this network endpoint. Optional, the field presence depends on the network endpoint type. The field is required for network endpoints of type GCE_VM_IP and GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group (for zonal NEGs) or in the zone within the region of the NEG (for regional NEGs). If the ipAddress is specified, it must belongs to the VM instance. The name must be 1-63 characters long, and comply with RFC1035 or be a valid URL pointing to an existing instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();

  /**
   *
   *
   * <pre>
   * The name or a URL of VM instance of this network endpoint. Optional, the field presence depends on the network endpoint type. The field is required for network endpoints of type GCE_VM_IP and GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group (for zonal NEGs) or in the zone within the region of the NEG (for regional NEGs). If the ipAddress is specified, it must belongs to the VM instance. The name must be 1-63 characters long, and comply with RFC1035 or be a valid URL pointing to an existing instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used. This field is redundant and need not be set for network endpoints of type GCE_VM_IP. If set, it must be set to the primary internal IP address of the attached VM instance that matches the subnetwork of the NEG. The primary internal IP address from any NIC of a multi-NIC VM instance can be added to a NEG as long as it matches the NEG subnetwork.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return Whether the ipAddress field is set.
   */
  boolean hasIpAddress();

  /**
   *
   *
   * <pre>
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used. This field is redundant and need not be set for network endpoints of type GCE_VM_IP. If set, it must be set to the primary internal IP address of the attached VM instance that matches the subnetwork of the NEG. The primary internal IP address from any NIC of a multi-NIC VM instance can be added to a NEG as long as it matches the NEG subnetwork.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();

  /**
   *
   *
   * <pre>
   * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used. This field is redundant and need not be set for network endpoints of type GCE_VM_IP. If set, it must be set to the primary internal IP address of the attached VM instance that matches the subnetwork of the NEG. The primary internal IP address from any NIC of a multi-NIC VM instance can be added to a NEG as long as it matches the NEG subnetwork.
   * </pre>
   *
   * <code>optional string ip_address = 406272220;</code>
   *
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString getIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional IPv6 address of network endpoint.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return Whether the ipv6Address field is set.
   */
  boolean hasIpv6Address();

  /**
   *
   *
   * <pre>
   * Optional IPv6 address of network endpoint.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return The ipv6Address.
   */
  java.lang.String getIpv6Address();

  /**
   *
   *
   * <pre>
   * Optional IPv6 address of network endpoint.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   *
   * @return The bytes for ipv6Address.
   */
  com.google.protobuf.ByteString getIpv6AddressBytes();

  /**
   *
   *
   * <pre>
   * Optional port number of network endpoint. If not specified, the defaultPort for the network endpoint group will be used. This field can not be set for network endpoints of type GCE_VM_IP.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();

  /**
   *
   *
   * <pre>
   * Optional port number of network endpoint. If not specified, the defaultPort for the network endpoint group will be used. This field can not be set for network endpoints of type GCE_VM_IP.
   * </pre>
   *
   * <code>optional int32 port = 3446913;</code>
   *
   * @return The port.
   */
  int getPort();
}
