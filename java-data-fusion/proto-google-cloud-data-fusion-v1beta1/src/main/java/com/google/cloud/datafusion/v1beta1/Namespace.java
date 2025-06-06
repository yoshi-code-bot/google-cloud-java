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
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datafusion.v1beta1;

/**
 *
 *
 * <pre>
 * Represents the information of a namespace
 * </pre>
 *
 * Protobuf type {@code google.cloud.datafusion.v1beta1.Namespace}
 */
public final class Namespace extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datafusion.v1beta1.Namespace)
    NamespaceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Namespace.newBuilder() to construct.
  private Namespace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Namespace() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Namespace();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_Namespace_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datafusion.v1beta1.V1Beta1
        .internal_static_google_cloud_datafusion_v1beta1_Namespace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datafusion.v1beta1.Namespace.class,
            com.google.cloud.datafusion.v1beta1.Namespace.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Name of the given namespace.
   * </pre>
   *
   * <code>string name = 1;</code>
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
   * Name of the given namespace.
   * </pre>
   *
   * <code>string name = 1;</code>
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

  public static final int IAM_POLICY_FIELD_NUMBER = 2;
  private com.google.cloud.datafusion.v1beta1.IAMPolicy iamPolicy_;

  /**
   *
   *
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   *
   * @return Whether the iamPolicy field is set.
   */
  @java.lang.Override
  public boolean hasIamPolicy() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   *
   * @return The iamPolicy.
   */
  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.IAMPolicy getIamPolicy() {
    return iamPolicy_ == null
        ? com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()
        : iamPolicy_;
  }

  /**
   *
   *
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder getIamPolicyOrBuilder() {
    return iamPolicy_ == null
        ? com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()
        : iamPolicy_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getIamPolicy());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIamPolicy());
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
    if (!(obj instanceof com.google.cloud.datafusion.v1beta1.Namespace)) {
      return super.equals(obj);
    }
    com.google.cloud.datafusion.v1beta1.Namespace other =
        (com.google.cloud.datafusion.v1beta1.Namespace) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasIamPolicy() != other.hasIamPolicy()) return false;
    if (hasIamPolicy()) {
      if (!getIamPolicy().equals(other.getIamPolicy())) return false;
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
    if (hasIamPolicy()) {
      hash = (37 * hash) + IAM_POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getIamPolicy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datafusion.v1beta1.Namespace prototype) {
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
   * Represents the information of a namespace
   * </pre>
   *
   * Protobuf type {@code google.cloud.datafusion.v1beta1.Namespace}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datafusion.v1beta1.Namespace)
      com.google.cloud.datafusion.v1beta1.NamespaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Namespace_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Namespace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datafusion.v1beta1.Namespace.class,
              com.google.cloud.datafusion.v1beta1.Namespace.Builder.class);
    }

    // Construct using com.google.cloud.datafusion.v1beta1.Namespace.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIamPolicyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      iamPolicy_ = null;
      if (iamPolicyBuilder_ != null) {
        iamPolicyBuilder_.dispose();
        iamPolicyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datafusion.v1beta1.V1Beta1
          .internal_static_google_cloud_datafusion_v1beta1_Namespace_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Namespace getDefaultInstanceForType() {
      return com.google.cloud.datafusion.v1beta1.Namespace.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Namespace build() {
      com.google.cloud.datafusion.v1beta1.Namespace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datafusion.v1beta1.Namespace buildPartial() {
      com.google.cloud.datafusion.v1beta1.Namespace result =
          new com.google.cloud.datafusion.v1beta1.Namespace(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datafusion.v1beta1.Namespace result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.iamPolicy_ = iamPolicyBuilder_ == null ? iamPolicy_ : iamPolicyBuilder_.build();
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
      if (other instanceof com.google.cloud.datafusion.v1beta1.Namespace) {
        return mergeFrom((com.google.cloud.datafusion.v1beta1.Namespace) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datafusion.v1beta1.Namespace other) {
      if (other == com.google.cloud.datafusion.v1beta1.Namespace.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasIamPolicy()) {
        mergeIamPolicy(other.getIamPolicy());
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
            case 18:
              {
                input.readMessage(getIamPolicyFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Name of the given namespace.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the given namespace.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the given namespace.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the given namespace.
     * </pre>
     *
     * <code>string name = 1;</code>
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
     * Name of the given namespace.
     * </pre>
     *
     * <code>string name = 1;</code>
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

    private com.google.cloud.datafusion.v1beta1.IAMPolicy iamPolicy_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datafusion.v1beta1.IAMPolicy,
            com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder,
            com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder>
        iamPolicyBuilder_;

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     *
     * @return Whether the iamPolicy field is set.
     */
    public boolean hasIamPolicy() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     *
     * @return The iamPolicy.
     */
    public com.google.cloud.datafusion.v1beta1.IAMPolicy getIamPolicy() {
      if (iamPolicyBuilder_ == null) {
        return iamPolicy_ == null
            ? com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()
            : iamPolicy_;
      } else {
        return iamPolicyBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public Builder setIamPolicy(com.google.cloud.datafusion.v1beta1.IAMPolicy value) {
      if (iamPolicyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iamPolicy_ = value;
      } else {
        iamPolicyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public Builder setIamPolicy(
        com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder builderForValue) {
      if (iamPolicyBuilder_ == null) {
        iamPolicy_ = builderForValue.build();
      } else {
        iamPolicyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public Builder mergeIamPolicy(com.google.cloud.datafusion.v1beta1.IAMPolicy value) {
      if (iamPolicyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && iamPolicy_ != null
            && iamPolicy_ != com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()) {
          getIamPolicyBuilder().mergeFrom(value);
        } else {
          iamPolicy_ = value;
        }
      } else {
        iamPolicyBuilder_.mergeFrom(value);
      }
      if (iamPolicy_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public Builder clearIamPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      iamPolicy_ = null;
      if (iamPolicyBuilder_ != null) {
        iamPolicyBuilder_.dispose();
        iamPolicyBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder getIamPolicyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIamPolicyFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    public com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder getIamPolicyOrBuilder() {
      if (iamPolicyBuilder_ != null) {
        return iamPolicyBuilder_.getMessageOrBuilder();
      } else {
        return iamPolicy_ == null
            ? com.google.cloud.datafusion.v1beta1.IAMPolicy.getDefaultInstance()
            : iamPolicy_;
      }
    }

    /**
     *
     *
     * <pre>
     * IAM policy associated with this namespace.
     * </pre>
     *
     * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datafusion.v1beta1.IAMPolicy,
            com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder,
            com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder>
        getIamPolicyFieldBuilder() {
      if (iamPolicyBuilder_ == null) {
        iamPolicyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datafusion.v1beta1.IAMPolicy,
                com.google.cloud.datafusion.v1beta1.IAMPolicy.Builder,
                com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder>(
                getIamPolicy(), getParentForChildren(), isClean());
        iamPolicy_ = null;
      }
      return iamPolicyBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datafusion.v1beta1.Namespace)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datafusion.v1beta1.Namespace)
  private static final com.google.cloud.datafusion.v1beta1.Namespace DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datafusion.v1beta1.Namespace();
  }

  public static com.google.cloud.datafusion.v1beta1.Namespace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Namespace> PARSER =
      new com.google.protobuf.AbstractParser<Namespace>() {
        @java.lang.Override
        public Namespace parsePartialFrom(
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

  public static com.google.protobuf.Parser<Namespace> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Namespace> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datafusion.v1beta1.Namespace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
