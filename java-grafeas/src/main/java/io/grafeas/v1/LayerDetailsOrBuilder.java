/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/common.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

public interface LayerDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.LayerDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The index of the layer in the container image.
   * </pre>
   *
   * <code>int32 index = 1;</code>
   *
   * @return The index.
   */
  int getIndex();

  /**
   *
   *
   * <pre>
   * The diff ID (typically a sha256 hash) of the layer in the container image.
   * </pre>
   *
   * <code>string diff_id = 2;</code>
   *
   * @return The diffId.
   */
  java.lang.String getDiffId();

  /**
   *
   *
   * <pre>
   * The diff ID (typically a sha256 hash) of the layer in the container image.
   * </pre>
   *
   * <code>string diff_id = 2;</code>
   *
   * @return The bytes for diffId.
   */
  com.google.protobuf.ByteString getDiffIdBytes();

  /**
   *
   *
   * <pre>
   * The layer chain ID (sha256 hash) of the layer in the container image.
   * https://github.com/opencontainers/image-spec/blob/main/config.md#layer-chainid
   * </pre>
   *
   * <code>string chain_id = 5;</code>
   *
   * @return The chainId.
   */
  java.lang.String getChainId();

  /**
   *
   *
   * <pre>
   * The layer chain ID (sha256 hash) of the layer in the container image.
   * https://github.com/opencontainers/image-spec/blob/main/config.md#layer-chainid
   * </pre>
   *
   * <code>string chain_id = 5;</code>
   *
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString getChainIdBytes();

  /**
   *
   *
   * <pre>
   * The layer build command that was used to build the layer. This may not be
   * found in all layers depending on how the container image is built.
   * </pre>
   *
   * <code>string command = 3;</code>
   *
   * @return The command.
   */
  java.lang.String getCommand();

  /**
   *
   *
   * <pre>
   * The layer build command that was used to build the layer. This may not be
   * found in all layers depending on how the container image is built.
   * </pre>
   *
   * <code>string command = 3;</code>
   *
   * @return The bytes for command.
   */
  com.google.protobuf.ByteString getCommandBytes();

  /**
   *
   *
   * <pre>
   * The base images the layer is found within.
   * </pre>
   *
   * <code>repeated .grafeas.v1.BaseImage base_images = 4;</code>
   */
  java.util.List<io.grafeas.v1.BaseImage> getBaseImagesList();

  /**
   *
   *
   * <pre>
   * The base images the layer is found within.
   * </pre>
   *
   * <code>repeated .grafeas.v1.BaseImage base_images = 4;</code>
   */
  io.grafeas.v1.BaseImage getBaseImages(int index);

  /**
   *
   *
   * <pre>
   * The base images the layer is found within.
   * </pre>
   *
   * <code>repeated .grafeas.v1.BaseImage base_images = 4;</code>
   */
  int getBaseImagesCount();

  /**
   *
   *
   * <pre>
   * The base images the layer is found within.
   * </pre>
   *
   * <code>repeated .grafeas.v1.BaseImage base_images = 4;</code>
   */
  java.util.List<? extends io.grafeas.v1.BaseImageOrBuilder> getBaseImagesOrBuilderList();

  /**
   *
   *
   * <pre>
   * The base images the layer is found within.
   * </pre>
   *
   * <code>repeated .grafeas.v1.BaseImage base_images = 4;</code>
   */
  io.grafeas.v1.BaseImageOrBuilder getBaseImagesOrBuilder(int index);
}
