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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

public interface WorkloadCertificatesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WorkloadCertificates)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   *
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   *
   * @return Whether the enableCertificates field is set.
   */
  boolean hasEnableCertificates();

  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   *
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   *
   * @return The enableCertificates.
   */
  com.google.protobuf.BoolValue getEnableCertificates();

  /**
   *
   *
   * <pre>
   * enable_certificates controls issuance of workload mTLS certificates.
   *
   * If set, the GKE Workload Identity Certificates controller and node agent
   * will be deployed in the cluster, which can then be configured by creating a
   * WorkloadCertificateConfig Custom Resource.
   *
   * Requires Workload Identity
   * ([workload_pool][google.container.v1beta1.WorkloadIdentityConfig.workload_pool]
   * must be non-empty).
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enable_certificates = 1;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getEnableCertificatesOrBuilder();
}
