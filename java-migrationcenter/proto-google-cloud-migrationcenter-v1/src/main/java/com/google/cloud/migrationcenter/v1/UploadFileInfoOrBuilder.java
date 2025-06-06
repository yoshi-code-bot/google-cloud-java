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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

public interface UploadFileInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.UploadFileInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Upload URI for the file.
   * </pre>
   *
   * <code>string signed_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The signedUri.
   */
  java.lang.String getSignedUri();

  /**
   *
   *
   * <pre>
   * Output only. Upload URI for the file.
   * </pre>
   *
   * <code>string signed_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for signedUri.
   */
  com.google.protobuf.ByteString getSignedUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The headers that were used to sign the URI.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getHeadersCount();

  /**
   *
   *
   * <pre>
   * Output only. The headers that were used to sign the URI.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsHeaders(java.lang.String key);

  /** Use {@link #getHeadersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getHeaders();

  /**
   *
   *
   * <pre>
   * Output only. The headers that were used to sign the URI.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getHeadersMap();

  /**
   *
   *
   * <pre>
   * Output only. The headers that were used to sign the URI.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Output only. The headers that were used to sign the URI.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.lang.String getHeadersOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Expiration time of the upload URI.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp uri_expiration_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the uriExpirationTime field is set.
   */
  boolean hasUriExpirationTime();

  /**
   *
   *
   * <pre>
   * Output only. Expiration time of the upload URI.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp uri_expiration_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The uriExpirationTime.
   */
  com.google.protobuf.Timestamp getUriExpirationTime();

  /**
   *
   *
   * <pre>
   * Output only. Expiration time of the upload URI.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp uri_expiration_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUriExpirationTimeOrBuilder();
}
