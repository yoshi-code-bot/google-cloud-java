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

public interface GenerateRandomBytesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.GenerateRandomBytesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The generated data.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   *
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   *
   * @return Whether the dataCrc32c field is set.
   */
  boolean hasDataCrc32C();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   *
   * @return The dataCrc32c.
   */
  com.google.protobuf.Int64Value getDataCrc32C();

  /**
   *
   *
   * <pre>
   * Integrity verification field. A CRC32C checksum of the returned
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data].
   * An integrity check of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * can be performed by computing the CRC32C checksum of
   * [GenerateRandomBytesResponse.data][google.cloud.kms.v1.GenerateRandomBytesResponse.data]
   * and comparing your results to this field. Discard the response in case of
   * non-matching checksum values, and perform a limited number of retries. A
   * persistent mismatch may indicate an issue in your computation of the CRC32C
   * checksum. Note: This field is defined as int64 for reasons of compatibility
   * across different languages. However, it is a non-negative integer, which
   * will never exceed 2^32-1, and can be safely downconverted to uint32 in
   * languages that support this type.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value data_crc32c = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getDataCrc32COrBuilder();
}
