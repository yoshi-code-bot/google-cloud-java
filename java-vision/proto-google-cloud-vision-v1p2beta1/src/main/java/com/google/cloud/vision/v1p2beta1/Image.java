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
// source: google/cloud/vision/v1p2beta1/image_annotator.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vision.v1p2beta1;

/**
 *
 *
 * <pre>
 * Client image to perform Google Cloud Vision API tasks over.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p2beta1.Image}
 */
public final class Image extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p2beta1.Image)
    ImageOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Image() {
    content_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Image();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p2beta1_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p2beta1_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p2beta1.Image.class,
            com.google.cloud.vision.v1p2beta1.Image.Builder.class);
  }

  private int bitField0_;
  public static final int CONTENT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;

  /**
   *
   *
   * <pre>
   * Image content, represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  public static final int SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.vision.v1p2beta1.ImageSource source_;

  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
   *
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
   *
   * @return The source.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p2beta1.ImageSource getSource() {
    return source_ == null
        ? com.google.cloud.vision.v1p2beta1.ImageSource.getDefaultInstance()
        : source_;
  }

  /**
   *
   *
   * <pre>
   * Google Cloud Storage image location, or publicly-accessible image
   * URL. If both `content` and `source` are provided for an image, `content`
   * takes precedence and is used to perform the image annotation request.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1p2beta1.ImageSourceOrBuilder getSourceOrBuilder() {
    return source_ == null
        ? com.google.cloud.vision.v1p2beta1.ImageSource.getDefaultInstance()
        : source_;
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
    if (!content_.isEmpty()) {
      output.writeBytes(1, content_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSource());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, content_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSource());
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
    if (!(obj instanceof com.google.cloud.vision.v1p2beta1.Image)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p2beta1.Image other = (com.google.cloud.vision.v1p2beta1.Image) obj;

    if (!getContent().equals(other.getContent())) return false;
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p2beta1.Image parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1p2beta1.Image prototype) {
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
   * Client image to perform Google Cloud Vision API tasks over.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p2beta1.Image}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p2beta1.Image)
      com.google.cloud.vision.v1p2beta1.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p2beta1.Image.class,
              com.google.cloud.vision.v1p2beta1.Image.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p2beta1.Image.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSourceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      content_ = com.google.protobuf.ByteString.EMPTY;
      source_ = null;
      if (sourceBuilder_ != null) {
        sourceBuilder_.dispose();
        sourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p2beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p2beta1_Image_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.Image getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p2beta1.Image.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.Image build() {
      com.google.cloud.vision.v1p2beta1.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p2beta1.Image buildPartial() {
      com.google.cloud.vision.v1p2beta1.Image result =
          new com.google.cloud.vision.v1p2beta1.Image(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vision.v1p2beta1.Image result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.content_ = content_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.source_ = sourceBuilder_ == null ? source_ : sourceBuilder_.build();
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
      if (other instanceof com.google.cloud.vision.v1p2beta1.Image) {
        return mergeFrom((com.google.cloud.vision.v1p2beta1.Image) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p2beta1.Image other) {
      if (other == com.google.cloud.vision.v1p2beta1.Image.getDefaultInstance()) return this;
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      if (other.hasSource()) {
        mergeSource(other.getSource());
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
                content_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSourceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;

    /**
     *
     *
     * <pre>
     * Image content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return The content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    /**
     *
     *
     * <pre>
     * Image content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      content_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Image content, represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1p2beta1.ImageSource source_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p2beta1.ImageSource,
            com.google.cloud.vision.v1p2beta1.ImageSource.Builder,
            com.google.cloud.vision.v1p2beta1.ImageSourceOrBuilder>
        sourceBuilder_;

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     *
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     *
     * @return The source.
     */
    public com.google.cloud.vision.v1p2beta1.ImageSource getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null
            ? com.google.cloud.vision.v1p2beta1.ImageSource.getDefaultInstance()
            : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public Builder setSource(com.google.cloud.vision.v1p2beta1.ImageSource value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
      } else {
        sourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public Builder setSource(
        com.google.cloud.vision.v1p2beta1.ImageSource.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public Builder mergeSource(com.google.cloud.vision.v1p2beta1.ImageSource value) {
      if (sourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && source_ != null
            && source_ != com.google.cloud.vision.v1p2beta1.ImageSource.getDefaultInstance()) {
          getSourceBuilder().mergeFrom(value);
        } else {
          source_ = value;
        }
      } else {
        sourceBuilder_.mergeFrom(value);
      }
      if (source_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public Builder clearSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      source_ = null;
      if (sourceBuilder_ != null) {
        sourceBuilder_.dispose();
        sourceBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public com.google.cloud.vision.v1p2beta1.ImageSource.Builder getSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    public com.google.cloud.vision.v1p2beta1.ImageSourceOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null
            ? com.google.cloud.vision.v1p2beta1.ImageSource.getDefaultInstance()
            : source_;
      }
    }

    /**
     *
     *
     * <pre>
     * Google Cloud Storage image location, or publicly-accessible image
     * URL. If both `content` and `source` are provided for an image, `content`
     * takes precedence and is used to perform the image annotation request.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p2beta1.ImageSource source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1p2beta1.ImageSource,
            com.google.cloud.vision.v1p2beta1.ImageSource.Builder,
            com.google.cloud.vision.v1p2beta1.ImageSourceOrBuilder>
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1p2beta1.ImageSource,
                com.google.cloud.vision.v1p2beta1.ImageSource.Builder,
                com.google.cloud.vision.v1p2beta1.ImageSourceOrBuilder>(
                getSource(), getParentForChildren(), isClean());
        source_ = null;
      }
      return sourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p2beta1.Image)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p2beta1.Image)
  private static final com.google.cloud.vision.v1p2beta1.Image DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p2beta1.Image();
  }

  public static com.google.cloud.vision.v1p2beta1.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image> PARSER =
      new com.google.protobuf.AbstractParser<Image>() {
        @java.lang.Override
        public Image parsePartialFrom(
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

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p2beta1.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
