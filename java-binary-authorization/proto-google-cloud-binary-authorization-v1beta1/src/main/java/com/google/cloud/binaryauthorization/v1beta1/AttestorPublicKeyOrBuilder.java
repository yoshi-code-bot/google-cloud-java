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
// source: google/cloud/binaryauthorization/v1beta1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.binaryauthorization.v1beta1;

public interface AttestorPublicKeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.AttestorPublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A descriptive comment. This field may be updated.
   * </pre>
   *
   * <code>string comment = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The comment.
   */
  java.lang.String getComment();

  /**
   *
   *
   * <pre>
   * Optional. A descriptive comment. This field may be updated.
   * </pre>
   *
   * <code>string comment = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString getCommentBytes();

  /**
   *
   *
   * <pre>
   * The ID of this public key.
   * Signatures verified by BinAuthz must include the ID of the public key that
   * can be used to verify them, and that ID must match the contents of this
   * field exactly.
   * Additional restrictions on this field can be imposed based on which public
   * key type is encapsulated. See the documentation on `public_key` cases below
   * for details.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * The ID of this public key.
   * Signatures verified by BinAuthz must include the ID of the public key that
   * can be used to verify them, and that ID must match the contents of this
   * field exactly.
   * Additional restrictions on this field can be imposed based on which public
   * key type is encapsulated. See the documentation on `public_key` cases below
   * for details.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * ASCII-armored representation of a PGP public key, as the entire output by
   * the command `gpg --export --armor foo&#64;example.com` (either LF or CRLF
   * line endings).
   * When using this field, `id` should be left blank.  The BinAuthz API
   * handlers will calculate the ID and fill it in automatically.  BinAuthz
   * computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as
   * upper-case hex.  If `id` is provided by the caller, it will be
   * overwritten by the API-calculated ID.
   * </pre>
   *
   * <code>string ascii_armored_pgp_public_key = 3;</code>
   *
   * @return Whether the asciiArmoredPgpPublicKey field is set.
   */
  boolean hasAsciiArmoredPgpPublicKey();

  /**
   *
   *
   * <pre>
   * ASCII-armored representation of a PGP public key, as the entire output by
   * the command `gpg --export --armor foo&#64;example.com` (either LF or CRLF
   * line endings).
   * When using this field, `id` should be left blank.  The BinAuthz API
   * handlers will calculate the ID and fill it in automatically.  BinAuthz
   * computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as
   * upper-case hex.  If `id` is provided by the caller, it will be
   * overwritten by the API-calculated ID.
   * </pre>
   *
   * <code>string ascii_armored_pgp_public_key = 3;</code>
   *
   * @return The asciiArmoredPgpPublicKey.
   */
  java.lang.String getAsciiArmoredPgpPublicKey();

  /**
   *
   *
   * <pre>
   * ASCII-armored representation of a PGP public key, as the entire output by
   * the command `gpg --export --armor foo&#64;example.com` (either LF or CRLF
   * line endings).
   * When using this field, `id` should be left blank.  The BinAuthz API
   * handlers will calculate the ID and fill it in automatically.  BinAuthz
   * computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as
   * upper-case hex.  If `id` is provided by the caller, it will be
   * overwritten by the API-calculated ID.
   * </pre>
   *
   * <code>string ascii_armored_pgp_public_key = 3;</code>
   *
   * @return The bytes for asciiArmoredPgpPublicKey.
   */
  com.google.protobuf.ByteString getAsciiArmoredPgpPublicKeyBytes();

  /**
   *
   *
   * <pre>
   * A raw PKIX SubjectPublicKeyInfo format public key.
   *
   * NOTE: `id` may be explicitly provided by the caller when using this
   * type of public key, but it MUST be a valid RFC3986 URI. If `id` is left
   * blank, a default one will be computed based on the digest of the DER
   * encoding of the public key.
   * </pre>
   *
   * <code>.google.cloud.binaryauthorization.v1beta1.PkixPublicKey pkix_public_key = 5;</code>
   *
   * @return Whether the pkixPublicKey field is set.
   */
  boolean hasPkixPublicKey();

  /**
   *
   *
   * <pre>
   * A raw PKIX SubjectPublicKeyInfo format public key.
   *
   * NOTE: `id` may be explicitly provided by the caller when using this
   * type of public key, but it MUST be a valid RFC3986 URI. If `id` is left
   * blank, a default one will be computed based on the digest of the DER
   * encoding of the public key.
   * </pre>
   *
   * <code>.google.cloud.binaryauthorization.v1beta1.PkixPublicKey pkix_public_key = 5;</code>
   *
   * @return The pkixPublicKey.
   */
  com.google.cloud.binaryauthorization.v1beta1.PkixPublicKey getPkixPublicKey();

  /**
   *
   *
   * <pre>
   * A raw PKIX SubjectPublicKeyInfo format public key.
   *
   * NOTE: `id` may be explicitly provided by the caller when using this
   * type of public key, but it MUST be a valid RFC3986 URI. If `id` is left
   * blank, a default one will be computed based on the digest of the DER
   * encoding of the public key.
   * </pre>
   *
   * <code>.google.cloud.binaryauthorization.v1beta1.PkixPublicKey pkix_public_key = 5;</code>
   */
  com.google.cloud.binaryauthorization.v1beta1.PkixPublicKeyOrBuilder getPkixPublicKeyOrBuilder();

  com.google.cloud.binaryauthorization.v1beta1.AttestorPublicKey.PublicKeyCase getPublicKeyCase();
}
