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

public interface SslCertificateSelfManagedSslCertificateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SslCertificateSelfManagedSslCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   *
   * @return Whether the certificate field is set.
   */
  boolean hasCertificate();

  /**
   *
   *
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   *
   * @return The certificate.
   */
  java.lang.String getCertificate();

  /**
   *
   *
   * <pre>
   * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
   * </pre>
   *
   * <code>optional string certificate = 341787031;</code>
   *
   * @return The bytes for certificate.
   */
  com.google.protobuf.ByteString getCertificateBytes();

  /**
   *
   *
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   *
   * @return Whether the privateKey field is set.
   */
  boolean hasPrivateKey();

  /**
   *
   *
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   *
   * @return The privateKey.
   */
  java.lang.String getPrivateKey();

  /**
   *
   *
   * <pre>
   * A write-only private key in PEM format. Only insert requests will include this field.
   * </pre>
   *
   * <code>optional string private_key = 361331107;</code>
   *
   * @return The bytes for privateKey.
   */
  com.google.protobuf.ByteString getPrivateKeyBytes();
}
