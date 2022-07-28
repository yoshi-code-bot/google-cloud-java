/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/video/stitcher/v1/cdn_keys.proto

package com.google.cloud.video.stitcher.v1;

/**
 *
 *
 * <pre>
 * Configuration for a Google Cloud CDN key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.video.stitcher.v1.GoogleCdnKey}
 */
public final class GoogleCdnKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.video.stitcher.v1.GoogleCdnKey)
    GoogleCdnKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GoogleCdnKey.newBuilder() to construct.
  private GoogleCdnKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GoogleCdnKey() {
    privateKey_ = com.google.protobuf.ByteString.EMPTY;
    keyName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GoogleCdnKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GoogleCdnKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              privateKey_ = input.readBytes();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              keyName_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.video.stitcher.v1.CdnKeysProto
        .internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.video.stitcher.v1.CdnKeysProto
        .internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.video.stitcher.v1.GoogleCdnKey.class,
            com.google.cloud.video.stitcher.v1.GoogleCdnKey.Builder.class);
  }

  public static final int PRIVATE_KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString privateKey_;
  /**
   *
   *
   * <pre>
   * Input only. Secret for this Google Cloud CDN key.
   * </pre>
   *
   * <code>bytes private_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The privateKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrivateKey() {
    return privateKey_;
  }

  public static final int KEY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object keyName_;
  /**
   *
   *
   * <pre>
   * The public name of the Google Cloud CDN key.
   * </pre>
   *
   * <code>string key_name = 2;</code>
   *
   * @return The keyName.
   */
  @java.lang.Override
  public java.lang.String getKeyName() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The public name of the Google Cloud CDN key.
   * </pre>
   *
   * <code>string key_name = 2;</code>
   *
   * @return The bytes for keyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyNameBytes() {
    java.lang.Object ref = keyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyName_ = b;
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
    if (!privateKey_.isEmpty()) {
      output.writeBytes(1, privateKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!privateKey_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, privateKey_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.video.stitcher.v1.GoogleCdnKey)) {
      return super.equals(obj);
    }
    com.google.cloud.video.stitcher.v1.GoogleCdnKey other =
        (com.google.cloud.video.stitcher.v1.GoogleCdnKey) obj;

    if (!getPrivateKey().equals(other.getPrivateKey())) return false;
    if (!getKeyName().equals(other.getKeyName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRIVATE_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrivateKey().hashCode();
    hash = (37 * hash) + KEY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getKeyName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey parseFrom(
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

  public static Builder newBuilder(com.google.cloud.video.stitcher.v1.GoogleCdnKey prototype) {
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
   * Configuration for a Google Cloud CDN key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.video.stitcher.v1.GoogleCdnKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.video.stitcher.v1.GoogleCdnKey)
      com.google.cloud.video.stitcher.v1.GoogleCdnKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto
          .internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto
          .internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.video.stitcher.v1.GoogleCdnKey.class,
              com.google.cloud.video.stitcher.v1.GoogleCdnKey.Builder.class);
    }

    // Construct using com.google.cloud.video.stitcher.v1.GoogleCdnKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      privateKey_ = com.google.protobuf.ByteString.EMPTY;

      keyName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.video.stitcher.v1.CdnKeysProto
          .internal_static_google_cloud_video_stitcher_v1_GoogleCdnKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.GoogleCdnKey getDefaultInstanceForType() {
      return com.google.cloud.video.stitcher.v1.GoogleCdnKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.GoogleCdnKey build() {
      com.google.cloud.video.stitcher.v1.GoogleCdnKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.video.stitcher.v1.GoogleCdnKey buildPartial() {
      com.google.cloud.video.stitcher.v1.GoogleCdnKey result =
          new com.google.cloud.video.stitcher.v1.GoogleCdnKey(this);
      result.privateKey_ = privateKey_;
      result.keyName_ = keyName_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.video.stitcher.v1.GoogleCdnKey) {
        return mergeFrom((com.google.cloud.video.stitcher.v1.GoogleCdnKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.video.stitcher.v1.GoogleCdnKey other) {
      if (other == com.google.cloud.video.stitcher.v1.GoogleCdnKey.getDefaultInstance())
        return this;
      if (other.getPrivateKey() != com.google.protobuf.ByteString.EMPTY) {
        setPrivateKey(other.getPrivateKey());
      }
      if (!other.getKeyName().isEmpty()) {
        keyName_ = other.keyName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.video.stitcher.v1.GoogleCdnKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.video.stitcher.v1.GoogleCdnKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString privateKey_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Input only. Secret for this Google Cloud CDN key.
     * </pre>
     *
     * <code>bytes private_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return The privateKey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPrivateKey() {
      return privateKey_;
    }
    /**
     *
     *
     * <pre>
     * Input only. Secret for this Google Cloud CDN key.
     * </pre>
     *
     * <code>bytes private_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @param value The privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKey(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      privateKey_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Input only. Secret for this Google Cloud CDN key.
     * </pre>
     *
     * <code>bytes private_key = 1 [(.google.api.field_behavior) = INPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivateKey() {

      privateKey_ = getDefaultInstance().getPrivateKey();
      onChanged();
      return this;
    }

    private java.lang.Object keyName_ = "";
    /**
     *
     *
     * <pre>
     * The public name of the Google Cloud CDN key.
     * </pre>
     *
     * <code>string key_name = 2;</code>
     *
     * @return The keyName.
     */
    public java.lang.String getKeyName() {
      java.lang.Object ref = keyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The public name of the Google Cloud CDN key.
     * </pre>
     *
     * <code>string key_name = 2;</code>
     *
     * @return The bytes for keyName.
     */
    public com.google.protobuf.ByteString getKeyNameBytes() {
      java.lang.Object ref = keyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The public name of the Google Cloud CDN key.
     * </pre>
     *
     * <code>string key_name = 2;</code>
     *
     * @param value The keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public name of the Google Cloud CDN key.
     * </pre>
     *
     * <code>string key_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeyName() {

      keyName_ = getDefaultInstance().getKeyName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The public name of the Google Cloud CDN key.
     * </pre>
     *
     * <code>string key_name = 2;</code>
     *
     * @param value The bytes for keyName to set.
     * @return This builder for chaining.
     */
    public Builder setKeyNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      keyName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.video.stitcher.v1.GoogleCdnKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.video.stitcher.v1.GoogleCdnKey)
  private static final com.google.cloud.video.stitcher.v1.GoogleCdnKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.video.stitcher.v1.GoogleCdnKey();
  }

  public static com.google.cloud.video.stitcher.v1.GoogleCdnKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleCdnKey> PARSER =
      new com.google.protobuf.AbstractParser<GoogleCdnKey>() {
        @java.lang.Override
        public GoogleCdnKey parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GoogleCdnKey(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GoogleCdnKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleCdnKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.video.stitcher.v1.GoogleCdnKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}