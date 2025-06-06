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
// source: google/devtools/artifactregistry/v1beta2/apt_artifact.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1beta2;

public interface ImportAptArtifactsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;
   * </code>
   *
   * @return The gcsSource.
   */
  com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource getGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location where input content is located.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSource gcs_source = 2;
   * </code>
   */
  com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsGcsSourceOrBuilder
      getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The name of the parent resource where the artifacts will be imported.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * The name of the parent resource where the artifacts will be imported.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsRequest.SourceCase getSourceCase();
}
