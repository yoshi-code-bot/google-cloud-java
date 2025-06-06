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
// source: google/cloud/beyondcorp/appconnectors/v1/app_connector_instance_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.beyondcorp.appconnectors.v1;

/**
 *
 *
 * <pre>
 * ImageConfig defines the control plane images to run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.beyondcorp.appconnectors.v1.ImageConfig}
 */
public final class ImageConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.beyondcorp.appconnectors.v1.ImageConfig)
    ImageConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ImageConfig.newBuilder() to construct.
  private ImageConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImageConfig() {
    targetImage_ = "";
    stableImage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImageConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfigProto
        .internal_static_google_cloud_beyondcorp_appconnectors_v1_ImageConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfigProto
        .internal_static_google_cloud_beyondcorp_appconnectors_v1_ImageConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.class,
            com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.Builder.class);
  }

  public static final int TARGET_IMAGE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object targetImage_ = "";

  /**
   *
   *
   * <pre>
   * The initial image the remote agent will attempt to run for the control
   * plane.
   * </pre>
   *
   * <code>string target_image = 1;</code>
   *
   * @return The targetImage.
   */
  @java.lang.Override
  public java.lang.String getTargetImage() {
    java.lang.Object ref = targetImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      targetImage_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The initial image the remote agent will attempt to run for the control
   * plane.
   * </pre>
   *
   * <code>string target_image = 1;</code>
   *
   * @return The bytes for targetImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTargetImageBytes() {
    java.lang.Object ref = targetImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      targetImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STABLE_IMAGE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object stableImage_ = "";

  /**
   *
   *
   * <pre>
   * The stable image that the remote agent will fallback to if the target image
   * fails.
   * </pre>
   *
   * <code>string stable_image = 2;</code>
   *
   * @return The stableImage.
   */
  @java.lang.Override
  public java.lang.String getStableImage() {
    java.lang.Object ref = stableImage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stableImage_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The stable image that the remote agent will fallback to if the target image
   * fails.
   * </pre>
   *
   * <code>string stable_image = 2;</code>
   *
   * @return The bytes for stableImage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStableImageBytes() {
    java.lang.Object ref = stableImage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      stableImage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetImage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stableImage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stableImage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(targetImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetImage_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stableImage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stableImage_);
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
    if (!(obj instanceof com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig other =
        (com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig) obj;

    if (!getTargetImage().equals(other.getTargetImage())) return false;
    if (!getStableImage().equals(other.getStableImage())) return false;
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
    hash = (37 * hash) + TARGET_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getTargetImage().hashCode();
    hash = (37 * hash) + STABLE_IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getStableImage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig prototype) {
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
   * ImageConfig defines the control plane images to run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.beyondcorp.appconnectors.v1.ImageConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.beyondcorp.appconnectors.v1.ImageConfig)
      com.google.cloud.beyondcorp.appconnectors.v1.ImageConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfigProto
          .internal_static_google_cloud_beyondcorp_appconnectors_v1_ImageConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfigProto
          .internal_static_google_cloud_beyondcorp_appconnectors_v1_ImageConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.class,
              com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.Builder.class);
    }

    // Construct using com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetImage_ = "";
      stableImage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.beyondcorp.appconnectors.v1.AppConnectorInstanceConfigProto
          .internal_static_google_cloud_beyondcorp_appconnectors_v1_ImageConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig getDefaultInstanceForType() {
      return com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig build() {
      com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig buildPartial() {
      com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig result =
          new com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetImage_ = targetImage_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stableImage_ = stableImage_;
      }
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
      if (other instanceof com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig) {
        return mergeFrom((com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig other) {
      if (other == com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig.getDefaultInstance())
        return this;
      if (!other.getTargetImage().isEmpty()) {
        targetImage_ = other.targetImage_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getStableImage().isEmpty()) {
        stableImage_ = other.stableImage_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                targetImage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                stableImage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object targetImage_ = "";

    /**
     *
     *
     * <pre>
     * The initial image the remote agent will attempt to run for the control
     * plane.
     * </pre>
     *
     * <code>string target_image = 1;</code>
     *
     * @return The targetImage.
     */
    public java.lang.String getTargetImage() {
      java.lang.Object ref = targetImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The initial image the remote agent will attempt to run for the control
     * plane.
     * </pre>
     *
     * <code>string target_image = 1;</code>
     *
     * @return The bytes for targetImage.
     */
    public com.google.protobuf.ByteString getTargetImageBytes() {
      java.lang.Object ref = targetImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        targetImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The initial image the remote agent will attempt to run for the control
     * plane.
     * </pre>
     *
     * <code>string target_image = 1;</code>
     *
     * @param value The targetImage to set.
     * @return This builder for chaining.
     */
    public Builder setTargetImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      targetImage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The initial image the remote agent will attempt to run for the control
     * plane.
     * </pre>
     *
     * <code>string target_image = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTargetImage() {
      targetImage_ = getDefaultInstance().getTargetImage();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The initial image the remote agent will attempt to run for the control
     * plane.
     * </pre>
     *
     * <code>string target_image = 1;</code>
     *
     * @param value The bytes for targetImage to set.
     * @return This builder for chaining.
     */
    public Builder setTargetImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      targetImage_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object stableImage_ = "";

    /**
     *
     *
     * <pre>
     * The stable image that the remote agent will fallback to if the target image
     * fails.
     * </pre>
     *
     * <code>string stable_image = 2;</code>
     *
     * @return The stableImage.
     */
    public java.lang.String getStableImage() {
      java.lang.Object ref = stableImage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stableImage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The stable image that the remote agent will fallback to if the target image
     * fails.
     * </pre>
     *
     * <code>string stable_image = 2;</code>
     *
     * @return The bytes for stableImage.
     */
    public com.google.protobuf.ByteString getStableImageBytes() {
      java.lang.Object ref = stableImage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stableImage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The stable image that the remote agent will fallback to if the target image
     * fails.
     * </pre>
     *
     * <code>string stable_image = 2;</code>
     *
     * @param value The stableImage to set.
     * @return This builder for chaining.
     */
    public Builder setStableImage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      stableImage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The stable image that the remote agent will fallback to if the target image
     * fails.
     * </pre>
     *
     * <code>string stable_image = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStableImage() {
      stableImage_ = getDefaultInstance().getStableImage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The stable image that the remote agent will fallback to if the target image
     * fails.
     * </pre>
     *
     * <code>string stable_image = 2;</code>
     *
     * @param value The bytes for stableImage to set.
     * @return This builder for chaining.
     */
    public Builder setStableImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      stableImage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.beyondcorp.appconnectors.v1.ImageConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.beyondcorp.appconnectors.v1.ImageConfig)
  private static final com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig();
  }

  public static com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageConfig> PARSER =
      new com.google.protobuf.AbstractParser<ImageConfig>() {
        @java.lang.Override
        public ImageConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.beyondcorp.appconnectors.v1.ImageConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
