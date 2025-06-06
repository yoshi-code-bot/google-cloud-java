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
// source: google/cloud/security/publicca/v1beta1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.security.publicca.v1beta1;

public interface ExternalAccountKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.security.publicca.v1beta1.ExternalAccountKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Resource name.
   * projects/{project}/locations/{location}/externalAccountKeys/{key_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Key ID.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The keyId.
   */
  java.lang.String getKeyId();

  /**
   *
   *
   * <pre>
   * Output only. Key ID.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>string key_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString getKeyIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Base64-URL-encoded HS256 key.
   * It is generated by the PublicCertificateAuthorityService
   * when the ExternalAccountKey is created
   * </pre>
   *
   * <code>bytes b64_mac_key = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The b64MacKey.
   */
  com.google.protobuf.ByteString getB64MacKey();
}
