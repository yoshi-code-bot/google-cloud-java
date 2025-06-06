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
// source: google/cloud/kms/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.kms.v1;

public interface GetPublicKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.GetPublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key to get.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKeyVersion.name] of the
   * [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] public key to get.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The [PublicKey][google.cloud.kms.v1.PublicKey] format specified
   * by the user. This field is required for PQC algorithms. If specified, the
   * public key will be exported through the
   * [public_key][google.cloud.kms.v1.PublicKey.public_key] field in the
   * requested format. Otherwise, the [pem][google.cloud.kms.v1.PublicKey.pem]
   * field will be populated for non-PQC algorithms, and an error will be
   * returned for PQC algorithms.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.PublicKey.PublicKeyFormat public_key_format = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for publicKeyFormat.
   */
  int getPublicKeyFormatValue();

  /**
   *
   *
   * <pre>
   * Optional. The [PublicKey][google.cloud.kms.v1.PublicKey] format specified
   * by the user. This field is required for PQC algorithms. If specified, the
   * public key will be exported through the
   * [public_key][google.cloud.kms.v1.PublicKey.public_key] field in the
   * requested format. Otherwise, the [pem][google.cloud.kms.v1.PublicKey.pem]
   * field will be populated for non-PQC algorithms, and an error will be
   * returned for PQC algorithms.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.PublicKey.PublicKeyFormat public_key_format = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The publicKeyFormat.
   */
  com.google.cloud.kms.v1.PublicKey.PublicKeyFormat getPublicKeyFormat();
}
