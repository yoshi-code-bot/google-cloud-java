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
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1beta1.source;

public interface GitSourceContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.GitSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();

  /**
   *
   *
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The revisionId.
   */
  java.lang.String getRevisionId();

  /**
   *
   *
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   *
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString getRevisionIdBytes();
}
