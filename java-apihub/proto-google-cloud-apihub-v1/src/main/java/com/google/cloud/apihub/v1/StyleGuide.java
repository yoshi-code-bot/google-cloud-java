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
// source: google/cloud/apihub/v1/linting_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.apihub.v1;

/**
 *
 *
 * <pre>
 * Represents a singleton style guide resource to be used for linting Open API
 * specs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apihub.v1.StyleGuide}
 */
public final class StyleGuide extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apihub.v1.StyleGuide)
    StyleGuideOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use StyleGuide.newBuilder() to construct.
  private StyleGuide(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StyleGuide() {
    name_ = "";
    linter_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StyleGuide();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apihub.v1.LintingServiceProto
        .internal_static_google_cloud_apihub_v1_StyleGuide_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apihub.v1.LintingServiceProto
        .internal_static_google_cloud_apihub_v1_StyleGuide_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apihub.v1.StyleGuide.class,
            com.google.cloud.apihub.v1.StyleGuide.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Identifier. The name of the style guide.
   *
   * Format:
   * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Identifier. The name of the style guide.
   *
   * Format:
   * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINTER_FIELD_NUMBER = 2;
  private int linter_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Target linter for the style guide.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for linter.
   */
  @java.lang.Override
  public int getLinterValue() {
    return linter_;
  }

  /**
   *
   *
   * <pre>
   * Required. Target linter for the style guide.
   * </pre>
   *
   * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The linter.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.Linter getLinter() {
    com.google.cloud.apihub.v1.Linter result = com.google.cloud.apihub.v1.Linter.forNumber(linter_);
    return result == null ? com.google.cloud.apihub.v1.Linter.UNRECOGNIZED : result;
  }

  public static final int CONTENTS_FIELD_NUMBER = 3;
  private com.google.cloud.apihub.v1.StyleGuideContents contents_;

  /**
   *
   *
   * <pre>
   * Required. Input only. The contents of the uploaded style guide.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the contents field is set.
   */
  @java.lang.Override
  public boolean hasContents() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Input only. The contents of the uploaded style guide.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The contents.
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.StyleGuideContents getContents() {
    return contents_ == null
        ? com.google.cloud.apihub.v1.StyleGuideContents.getDefaultInstance()
        : contents_;
  }

  /**
   *
   *
   * <pre>
   * Required. Input only. The contents of the uploaded style guide.
   * </pre>
   *
   * <code>
   * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.apihub.v1.StyleGuideContentsOrBuilder getContentsOrBuilder() {
    return contents_ == null
        ? com.google.cloud.apihub.v1.StyleGuideContents.getDefaultInstance()
        : contents_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (linter_ != com.google.cloud.apihub.v1.Linter.LINTER_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, linter_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getContents());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (linter_ != com.google.cloud.apihub.v1.Linter.LINTER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, linter_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getContents());
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
    if (!(obj instanceof com.google.cloud.apihub.v1.StyleGuide)) {
      return super.equals(obj);
    }
    com.google.cloud.apihub.v1.StyleGuide other = (com.google.cloud.apihub.v1.StyleGuide) obj;

    if (!getName().equals(other.getName())) return false;
    if (linter_ != other.linter_) return false;
    if (hasContents() != other.hasContents()) return false;
    if (hasContents()) {
      if (!getContents().equals(other.getContents())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + LINTER_FIELD_NUMBER;
    hash = (53 * hash) + linter_;
    if (hasContents()) {
      hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
      hash = (53 * hash) + getContents().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apihub.v1.StyleGuide parseFrom(
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

  public static Builder newBuilder(com.google.cloud.apihub.v1.StyleGuide prototype) {
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
   * Represents a singleton style guide resource to be used for linting Open API
   * specs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apihub.v1.StyleGuide}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apihub.v1.StyleGuide)
      com.google.cloud.apihub.v1.StyleGuideOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apihub.v1.LintingServiceProto
          .internal_static_google_cloud_apihub_v1_StyleGuide_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apihub.v1.LintingServiceProto
          .internal_static_google_cloud_apihub_v1_StyleGuide_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apihub.v1.StyleGuide.class,
              com.google.cloud.apihub.v1.StyleGuide.Builder.class);
    }

    // Construct using com.google.cloud.apihub.v1.StyleGuide.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getContentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      linter_ = 0;
      contents_ = null;
      if (contentsBuilder_ != null) {
        contentsBuilder_.dispose();
        contentsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apihub.v1.LintingServiceProto
          .internal_static_google_cloud_apihub_v1_StyleGuide_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.StyleGuide getDefaultInstanceForType() {
      return com.google.cloud.apihub.v1.StyleGuide.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.StyleGuide build() {
      com.google.cloud.apihub.v1.StyleGuide result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apihub.v1.StyleGuide buildPartial() {
      com.google.cloud.apihub.v1.StyleGuide result =
          new com.google.cloud.apihub.v1.StyleGuide(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apihub.v1.StyleGuide result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.linter_ = linter_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contents_ = contentsBuilder_ == null ? contents_ : contentsBuilder_.build();
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
      if (other instanceof com.google.cloud.apihub.v1.StyleGuide) {
        return mergeFrom((com.google.cloud.apihub.v1.StyleGuide) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apihub.v1.StyleGuide other) {
      if (other == com.google.cloud.apihub.v1.StyleGuide.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.linter_ != 0) {
        setLinterValue(other.getLinterValue());
      }
      if (other.hasContents()) {
        mergeContents(other.getContents());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                linter_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getContentsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Identifier. The name of the style guide.
     *
     * Format:
     * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Identifier. The name of the style guide.
     *
     * Format:
     * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Identifier. The name of the style guide.
     *
     * Format:
     * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Identifier. The name of the style guide.
     *
     * Format:
     * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Identifier. The name of the style guide.
     *
     * Format:
     * `projects/{project}/locations/{location}/plugins/{plugin}/styleGuide`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int linter_ = 0;

    /**
     *
     *
     * <pre>
     * Required. Target linter for the style guide.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for linter.
     */
    @java.lang.Override
    public int getLinterValue() {
      return linter_;
    }

    /**
     *
     *
     * <pre>
     * Required. Target linter for the style guide.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for linter to set.
     * @return This builder for chaining.
     */
    public Builder setLinterValue(int value) {
      linter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Target linter for the style guide.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The linter.
     */
    @java.lang.Override
    public com.google.cloud.apihub.v1.Linter getLinter() {
      com.google.cloud.apihub.v1.Linter result =
          com.google.cloud.apihub.v1.Linter.forNumber(linter_);
      return result == null ? com.google.cloud.apihub.v1.Linter.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Required. Target linter for the style guide.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The linter to set.
     * @return This builder for chaining.
     */
    public Builder setLinter(com.google.cloud.apihub.v1.Linter value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      linter_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Target linter for the style guide.
     * </pre>
     *
     * <code>.google.cloud.apihub.v1.Linter linter = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLinter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      linter_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.apihub.v1.StyleGuideContents contents_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.StyleGuideContents,
            com.google.cloud.apihub.v1.StyleGuideContents.Builder,
            com.google.cloud.apihub.v1.StyleGuideContentsOrBuilder>
        contentsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     *
     * @return Whether the contents field is set.
     */
    public boolean hasContents() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     *
     * @return The contents.
     */
    public com.google.cloud.apihub.v1.StyleGuideContents getContents() {
      if (contentsBuilder_ == null) {
        return contents_ == null
            ? com.google.cloud.apihub.v1.StyleGuideContents.getDefaultInstance()
            : contents_;
      } else {
        return contentsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder setContents(com.google.cloud.apihub.v1.StyleGuideContents value) {
      if (contentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contents_ = value;
      } else {
        contentsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder setContents(
        com.google.cloud.apihub.v1.StyleGuideContents.Builder builderForValue) {
      if (contentsBuilder_ == null) {
        contents_ = builderForValue.build();
      } else {
        contentsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder mergeContents(com.google.cloud.apihub.v1.StyleGuideContents value) {
      if (contentsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && contents_ != null
            && contents_ != com.google.cloud.apihub.v1.StyleGuideContents.getDefaultInstance()) {
          getContentsBuilder().mergeFrom(value);
        } else {
          contents_ = value;
        }
      } else {
        contentsBuilder_.mergeFrom(value);
      }
      if (contents_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public Builder clearContents() {
      bitField0_ = (bitField0_ & ~0x00000004);
      contents_ = null;
      if (contentsBuilder_ != null) {
        contentsBuilder_.dispose();
        contentsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public com.google.cloud.apihub.v1.StyleGuideContents.Builder getContentsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getContentsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    public com.google.cloud.apihub.v1.StyleGuideContentsOrBuilder getContentsOrBuilder() {
      if (contentsBuilder_ != null) {
        return contentsBuilder_.getMessageOrBuilder();
      } else {
        return contents_ == null
            ? com.google.cloud.apihub.v1.StyleGuideContents.getDefaultInstance()
            : contents_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Input only. The contents of the uploaded style guide.
     * </pre>
     *
     * <code>
     * .google.cloud.apihub.v1.StyleGuideContents contents = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = INPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apihub.v1.StyleGuideContents,
            com.google.cloud.apihub.v1.StyleGuideContents.Builder,
            com.google.cloud.apihub.v1.StyleGuideContentsOrBuilder>
        getContentsFieldBuilder() {
      if (contentsBuilder_ == null) {
        contentsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apihub.v1.StyleGuideContents,
                com.google.cloud.apihub.v1.StyleGuideContents.Builder,
                com.google.cloud.apihub.v1.StyleGuideContentsOrBuilder>(
                getContents(), getParentForChildren(), isClean());
        contents_ = null;
      }
      return contentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apihub.v1.StyleGuide)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apihub.v1.StyleGuide)
  private static final com.google.cloud.apihub.v1.StyleGuide DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apihub.v1.StyleGuide();
  }

  public static com.google.cloud.apihub.v1.StyleGuide getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StyleGuide> PARSER =
      new com.google.protobuf.AbstractParser<StyleGuide>() {
        @java.lang.Override
        public StyleGuide parsePartialFrom(
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

  public static com.google.protobuf.Parser<StyleGuide> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StyleGuide> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apihub.v1.StyleGuide getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
