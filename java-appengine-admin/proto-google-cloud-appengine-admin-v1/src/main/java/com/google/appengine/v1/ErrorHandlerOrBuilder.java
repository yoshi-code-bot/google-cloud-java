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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface ErrorHandlerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.ErrorHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Error condition this handler applies to.
   * </pre>
   *
   * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
   *
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();

  /**
   *
   *
   * <pre>
   * Error condition this handler applies to.
   * </pre>
   *
   * <code>.google.appengine.v1.ErrorHandler.ErrorCode error_code = 1;</code>
   *
   * @return The errorCode.
   */
  com.google.appengine.v1.ErrorHandler.ErrorCode getErrorCode();

  /**
   *
   *
   * <pre>
   * Static file content to be served for this error.
   * </pre>
   *
   * <code>string static_file = 2;</code>
   *
   * @return The staticFile.
   */
  java.lang.String getStaticFile();

  /**
   *
   *
   * <pre>
   * Static file content to be served for this error.
   * </pre>
   *
   * <code>string static_file = 2;</code>
   *
   * @return The bytes for staticFile.
   */
  com.google.protobuf.ByteString getStaticFileBytes();

  /**
   *
   *
   * <pre>
   * MIME type of file. Defaults to `text/html`.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();

  /**
   *
   *
   * <pre>
   * MIME type of file. Defaults to `text/html`.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();
}
