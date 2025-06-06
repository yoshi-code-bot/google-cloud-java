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
// source: google/devtools/artifactregistry/v1beta2/tag.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1beta2;

public interface CreateTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.CreateTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the parent resource where the tag will be created.
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
   * The name of the parent resource where the tag will be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The tag id to use for this repository.
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The tagId.
   */
  java.lang.String getTagId();

  /**
   *
   *
   * <pre>
   * The tag id to use for this repository.
   * </pre>
   *
   * <code>string tag_id = 2;</code>
   *
   * @return The bytes for tagId.
   */
  com.google.protobuf.ByteString getTagIdBytes();

  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 3;</code>
   *
   * @return Whether the tag field is set.
   */
  boolean hasTag();

  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 3;</code>
   *
   * @return The tag.
   */
  com.google.devtools.artifactregistry.v1beta2.Tag getTag();

  /**
   *
   *
   * <pre>
   * The tag to be created.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.Tag tag = 3;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getTagOrBuilder();
}
