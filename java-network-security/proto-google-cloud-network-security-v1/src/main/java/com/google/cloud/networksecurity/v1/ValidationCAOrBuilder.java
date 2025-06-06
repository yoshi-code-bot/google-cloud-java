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
// source: google/cloud/networksecurity/v1/tls.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networksecurity.v1;

public interface ValidationCAOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.ValidationCA)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.GrpcEndpoint grpc_endpoint = 2;</code>
   *
   * @return Whether the grpcEndpoint field is set.
   */
  boolean hasGrpcEndpoint();

  /**
   *
   *
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.GrpcEndpoint grpc_endpoint = 2;</code>
   *
   * @return The grpcEndpoint.
   */
  com.google.cloud.networksecurity.v1.GrpcEndpoint getGrpcEndpoint();

  /**
   *
   *
   * <pre>
   * gRPC specific configuration to access the gRPC server to
   * obtain the CA certificate.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.GrpcEndpoint grpc_endpoint = 2;</code>
   */
  com.google.cloud.networksecurity.v1.GrpcEndpointOrBuilder getGrpcEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProviderInstance certificate_provider_instance = 3;
   * </code>
   *
   * @return Whether the certificateProviderInstance field is set.
   */
  boolean hasCertificateProviderInstance();

  /**
   *
   *
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProviderInstance certificate_provider_instance = 3;
   * </code>
   *
   * @return The certificateProviderInstance.
   */
  com.google.cloud.networksecurity.v1.CertificateProviderInstance getCertificateProviderInstance();

  /**
   *
   *
   * <pre>
   * The certificate provider instance specification that will be passed to
   * the data plane, which will be used to load necessary credential
   * information.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.CertificateProviderInstance certificate_provider_instance = 3;
   * </code>
   */
  com.google.cloud.networksecurity.v1.CertificateProviderInstanceOrBuilder
      getCertificateProviderInstanceOrBuilder();

  com.google.cloud.networksecurity.v1.ValidationCA.TypeCase getTypeCase();
}
