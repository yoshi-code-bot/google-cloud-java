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

public interface ForwardingRuleServiceDirectoryRegistrationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ForwardingRuleServiceDirectoryRegistration)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return Whether the namespace field is set.
   */
  boolean hasNamespace();

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return The namespace.
   */
  java.lang.String getNamespace();

  /**
   *
   *
   * <pre>
   * Service Directory namespace to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string namespace = 178476379;</code>
   *
   * @return The bytes for namespace.
   */
  com.google.protobuf.ByteString getNamespaceBytes();

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return Whether the service field is set.
   */
  boolean hasService();

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The service.
   */
  java.lang.String getService();

  /**
   *
   *
   * <pre>
   * Service Directory service to register the forwarding rule under.
   * </pre>
   *
   * <code>optional string service = 373540533;</code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return Whether the serviceDirectoryRegion field is set.
   */
  boolean hasServiceDirectoryRegion();

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return The serviceDirectoryRegion.
   */
  java.lang.String getServiceDirectoryRegion();

  /**
   *
   *
   * <pre>
   * [Optional] Service Directory region to register this global forwarding rule under. Default to "us-central1". Only used for PSC for Google APIs. All PSC for Google APIs forwarding rules on the same network should use the same Service Directory region.
   * </pre>
   *
   * <code>optional string service_directory_region = 74030416;</code>
   *
   * @return The bytes for serviceDirectoryRegion.
   */
  com.google.protobuf.ByteString getServiceDirectoryRegionBytes();
}
