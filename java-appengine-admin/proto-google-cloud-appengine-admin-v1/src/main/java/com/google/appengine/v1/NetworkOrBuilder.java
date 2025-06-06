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
// source: google/appengine/v1/version.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface NetworkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   *
   * @return A list containing the forwardedPorts.
   */
  java.util.List<java.lang.String> getForwardedPortsList();

  /**
   *
   *
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   *
   * @return The count of forwardedPorts.
   */
  int getForwardedPortsCount();

  /**
   *
   *
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The forwardedPorts at the given index.
   */
  java.lang.String getForwardedPorts(int index);

  /**
   *
   *
   * <pre>
   * List of ports, or port pairs, to forward from the virtual machine to the
   * application container.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>repeated string forwarded_ports = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the forwardedPorts at the given index.
   */
  com.google.protobuf.ByteString getForwardedPortsBytes(int index);

  /**
   *
   *
   * <pre>
   * Tag to apply to the instance during creation.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   *
   * @return The instanceTag.
   */
  java.lang.String getInstanceTag();

  /**
   *
   *
   * <pre>
   * Tag to apply to the instance during creation.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>string instance_tag = 2;</code>
   *
   * @return The bytes for instanceTag.
   */
  com.google.protobuf.ByteString getInstanceTagBytes();

  /**
   *
   *
   * <pre>
   * Google Compute Engine network where the virtual machines are created.
   * Specify the short name, not the resource path.
   *
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Google Compute Engine network where the virtual machines are created.
   * Specify the short name, not the resource path.
   *
   * Defaults to `default`.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Platform sub-network where the virtual machines are created.
   * Specify the short name, not the resource path.
   *
   * If a subnetwork name is specified, a network name will also be required
   * unless it is for the default network.
   *
   * * If the network that the instance is being created in is a Legacy network,
   * then the IP address is allocated from the IPv4Range.
   * * If the network that the instance is being created in is an auto Subnet
   * Mode Network, then only network name should be specified (not the
   * subnetwork_name) and the IP address is created from the IPCidrRange of the
   * subnetwork that exists in that zone for that network.
   * * If the network that the instance is being created in is a custom Subnet
   * Mode Network, then the subnetwork_name must be specified and the
   * IP address is created from the IPCidrRange of the subnetwork.
   *
   * If specified, the subnetwork must exist in the same region as the
   * App Engine flexible environment application.
   * </pre>
   *
   * <code>string subnetwork_name = 4;</code>
   *
   * @return The subnetworkName.
   */
  java.lang.String getSubnetworkName();

  /**
   *
   *
   * <pre>
   * Google Cloud Platform sub-network where the virtual machines are created.
   * Specify the short name, not the resource path.
   *
   * If a subnetwork name is specified, a network name will also be required
   * unless it is for the default network.
   *
   * * If the network that the instance is being created in is a Legacy network,
   * then the IP address is allocated from the IPv4Range.
   * * If the network that the instance is being created in is an auto Subnet
   * Mode Network, then only network name should be specified (not the
   * subnetwork_name) and the IP address is created from the IPCidrRange of the
   * subnetwork that exists in that zone for that network.
   * * If the network that the instance is being created in is a custom Subnet
   * Mode Network, then the subnetwork_name must be specified and the
   * IP address is created from the IPCidrRange of the subnetwork.
   *
   * If specified, the subnetwork must exist in the same region as the
   * App Engine flexible environment application.
   * </pre>
   *
   * <code>string subnetwork_name = 4;</code>
   *
   * @return The bytes for subnetworkName.
   */
  com.google.protobuf.ByteString getSubnetworkNameBytes();

  /**
   *
   *
   * <pre>
   * Enable session affinity.
   * Only applicable in the App Engine flexible environment.
   * </pre>
   *
   * <code>bool session_affinity = 5;</code>
   *
   * @return The sessionAffinity.
   */
  boolean getSessionAffinity();
}
