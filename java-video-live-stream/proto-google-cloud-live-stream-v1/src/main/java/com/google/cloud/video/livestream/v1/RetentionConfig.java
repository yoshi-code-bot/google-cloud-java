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
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.video.livestream.v1;

/**
 *
 *
 * <pre>
 * Configuration for retention of output files.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.livestream.v1.RetentionConfig}
 */
public final class RetentionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.livestream.v1.RetentionConfig)
    RetentionConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RetentionConfig.newBuilder() to construct.
  private RetentionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetentionConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetentionConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_RetentionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.livestream.v1.ResourcesProto
        .internal_static_google_cloud_video_livestream_v1_RetentionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.livestream.v1.RetentionConfig.class,
            com.google.cloud.video.livestream.v1.RetentionConfig.Builder.class);
  }

  private int bitField0_;
  public static final int RETENTION_WINDOW_DURATION_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retentionWindowDuration_;

  /**
   *
   *
   * <pre>
   * The minimum duration for which the output files from the channel will
   * remain in the output bucket. After this duration, output files are
   * deleted asynchronously.
   *
   * When the channel is deleted, all output files are deleted from the output
   * bucket asynchronously.
   *
   * If omitted or set to zero, output files will remain in the output bucket
   * based on
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
   * which defaults to 60s.
   *
   * If both retention_window_duration and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * are set, retention_window_duration is used and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
   *
   * @return Whether the retentionWindowDuration field is set.
   */
  @java.lang.Override
  public boolean hasRetentionWindowDuration() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The minimum duration for which the output files from the channel will
   * remain in the output bucket. After this duration, output files are
   * deleted asynchronously.
   *
   * When the channel is deleted, all output files are deleted from the output
   * bucket asynchronously.
   *
   * If omitted or set to zero, output files will remain in the output bucket
   * based on
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
   * which defaults to 60s.
   *
   * If both retention_window_duration and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * are set, retention_window_duration is used and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
   *
   * @return The retentionWindowDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetentionWindowDuration() {
    return retentionWindowDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : retentionWindowDuration_;
  }

  /**
   *
   *
   * <pre>
   * The minimum duration for which the output files from the channel will
   * remain in the output bucket. After this duration, output files are
   * deleted asynchronously.
   *
   * When the channel is deleted, all output files are deleted from the output
   * bucket asynchronously.
   *
   * If omitted or set to zero, output files will remain in the output bucket
   * based on
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
   * which defaults to 60s.
   *
   * If both retention_window_duration and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * are set, retention_window_duration is used and
   * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
   * is ignored.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRetentionWindowDurationOrBuilder() {
    return retentionWindowDuration_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : retentionWindowDuration_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getRetentionWindowDuration());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRetentionWindowDuration());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.video.livestream.v1.RetentionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.video.livestream.v1.RetentionConfig other =
        (com.google.cloud.video.livestream.v1.RetentionConfig) obj;

    if (hasRetentionWindowDuration() != other.hasRetentionWindowDuration()) return false;
    if (hasRetentionWindowDuration()) {
      if (!getRetentionWindowDuration().equals(other.getRetentionWindowDuration())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRetentionWindowDuration()) {
      hash = (37 * hash) + RETENTION_WINDOW_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getRetentionWindowDuration().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.video.livestream.v1.RetentionConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Configuration for retention of output files.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.livestream.v1.RetentionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.livestream.v1.RetentionConfig)
      com.google.cloud.video.livestream.v1.RetentionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_RetentionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_RetentionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.livestream.v1.RetentionConfig.class,
              com.google.cloud.video.livestream.v1.RetentionConfig.Builder.class);
    }

    // Construct using com.google.cloud.video.livestream.v1.RetentionConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRetentionWindowDurationFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      retentionWindowDuration_ = null;
      if (retentionWindowDurationBuilder_ != null) {
        retentionWindowDurationBuilder_.dispose();
        retentionWindowDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.livestream.v1.ResourcesProto
          .internal_static_google_cloud_video_livestream_v1_RetentionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.RetentionConfig getDefaultInstanceForType() {
      return com.google.cloud.video.livestream.v1.RetentionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.RetentionConfig build() {
      com.google.cloud.video.livestream.v1.RetentionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.livestream.v1.RetentionConfig buildPartial() {
      com.google.cloud.video.livestream.v1.RetentionConfig result =
          new com.google.cloud.video.livestream.v1.RetentionConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.video.livestream.v1.RetentionConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.retentionWindowDuration_ =
            retentionWindowDurationBuilder_ == null
                ? retentionWindowDuration_
                : retentionWindowDurationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.video.livestream.v1.RetentionConfig) {
        return mergeFrom((com.google.cloud.video.livestream.v1.RetentionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.livestream.v1.RetentionConfig other) {
      if (other == com.google.cloud.video.livestream.v1.RetentionConfig.getDefaultInstance())
        return this;
      if (other.hasRetentionWindowDuration()) {
        mergeRetentionWindowDuration(other.getRetentionWindowDuration());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getRetentionWindowDurationFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Duration retentionWindowDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        retentionWindowDurationBuilder_;

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     *
     * @return Whether the retentionWindowDuration field is set.
     */
    public boolean hasRetentionWindowDuration() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     *
     * @return The retentionWindowDuration.
     */
    public com.google.protobuf.Duration getRetentionWindowDuration() {
      if (retentionWindowDurationBuilder_ == null) {
        return retentionWindowDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retentionWindowDuration_;
      } else {
        return retentionWindowDurationBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public Builder setRetentionWindowDuration(com.google.protobuf.Duration value) {
      if (retentionWindowDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retentionWindowDuration_ = value;
      } else {
        retentionWindowDurationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public Builder setRetentionWindowDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (retentionWindowDurationBuilder_ == null) {
        retentionWindowDuration_ = builderForValue.build();
      } else {
        retentionWindowDurationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public Builder mergeRetentionWindowDuration(com.google.protobuf.Duration value) {
      if (retentionWindowDurationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && retentionWindowDuration_ != null
            && retentionWindowDuration_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getRetentionWindowDurationBuilder().mergeFrom(value);
        } else {
          retentionWindowDuration_ = value;
        }
      } else {
        retentionWindowDurationBuilder_.mergeFrom(value);
      }
      if (retentionWindowDuration_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public Builder clearRetentionWindowDuration() {
      bitField0_ = (bitField0_ & ~0x00000001);
      retentionWindowDuration_ = null;
      if (retentionWindowDurationBuilder_ != null) {
        retentionWindowDurationBuilder_.dispose();
        retentionWindowDurationBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getRetentionWindowDurationBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRetentionWindowDurationFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getRetentionWindowDurationOrBuilder() {
      if (retentionWindowDurationBuilder_ != null) {
        return retentionWindowDurationBuilder_.getMessageOrBuilder();
      } else {
        return retentionWindowDuration_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retentionWindowDuration_;
      }
    }

    /**
     *
     *
     * <pre>
     * The minimum duration for which the output files from the channel will
     * remain in the output bucket. After this duration, output files are
     * deleted asynchronously.
     *
     * When the channel is deleted, all output files are deleted from the output
     * bucket asynchronously.
     *
     * If omitted or set to zero, output files will remain in the output bucket
     * based on
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration],
     * which defaults to 60s.
     *
     * If both retention_window_duration and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * are set, retention_window_duration is used and
     * [Manifest.segment_keep_duration][google.cloud.video.livestream.v1.Manifest.segment_keep_duration]
     * is ignored.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_window_duration = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getRetentionWindowDurationFieldBuilder() {
      if (retentionWindowDurationBuilder_ == null) {
        retentionWindowDurationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getRetentionWindowDuration(), getParentForChildren(), isClean());
        retentionWindowDuration_ = null;
      }
      return retentionWindowDurationBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.video.livestream.v1.RetentionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.livestream.v1.RetentionConfig)
  private static final com.google.cloud.video.livestream.v1.RetentionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.livestream.v1.RetentionConfig();
  }

  public static com.google.cloud.video.livestream.v1.RetentionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetentionConfig> PARSER =
      new com.google.protobuf.AbstractParser<RetentionConfig>() {
        @java.lang.Override
        public RetentionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<RetentionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetentionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.livestream.v1.RetentionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
