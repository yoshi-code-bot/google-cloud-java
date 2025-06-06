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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * The AddIpOverride request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest}
 */
public final class AddIpOverrideRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest)
    AddIpOverrideRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AddIpOverrideRequest.newBuilder() to construct.
  private AddIpOverrideRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddIpOverrideRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddIpOverrideRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_AddIpOverrideRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_AddIpOverrideRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.AddIpOverrideRequest.class,
            com.google.recaptchaenterprise.v1.AddIpOverrideRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the key to which the IP override is added, in the
   * format `projects/{project}/keys/{key}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. The name of the key to which the IP override is added, in the
   * format `projects/{project}/keys/{key}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int IP_OVERRIDE_DATA_FIELD_NUMBER = 2;
  private com.google.recaptchaenterprise.v1.IpOverrideData ipOverrideData_;

  /**
   *
   *
   * <pre>
   * Required. IP override added to the key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ipOverrideData field is set.
   */
  @java.lang.Override
  public boolean hasIpOverrideData() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. IP override added to the key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ipOverrideData.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.IpOverrideData getIpOverrideData() {
    return ipOverrideData_ == null
        ? com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance()
        : ipOverrideData_;
  }

  /**
   *
   *
   * <pre>
   * Required. IP override added to the key.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder getIpOverrideDataOrBuilder() {
    return ipOverrideData_ == null
        ? com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance()
        : ipOverrideData_;
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
      output.writeMessage(2, getIpOverrideData());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIpOverrideData());
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.AddIpOverrideRequest)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.AddIpOverrideRequest other =
        (com.google.recaptchaenterprise.v1.AddIpOverrideRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasIpOverrideData() != other.hasIpOverrideData()) return false;
    if (hasIpOverrideData()) {
      if (!getIpOverrideData().equals(other.getIpOverrideData())) return false;
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
    if (hasIpOverrideData()) {
      hash = (37 * hash) + IP_OVERRIDE_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getIpOverrideData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest parseFrom(
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
      com.google.recaptchaenterprise.v1.AddIpOverrideRequest prototype) {
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
   * The AddIpOverride request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest)
      com.google.recaptchaenterprise.v1.AddIpOverrideRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AddIpOverrideRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AddIpOverrideRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.AddIpOverrideRequest.class,
              com.google.recaptchaenterprise.v1.AddIpOverrideRequest.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.AddIpOverrideRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIpOverrideDataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      ipOverrideData_ = null;
      if (ipOverrideDataBuilder_ != null) {
        ipOverrideDataBuilder_.dispose();
        ipOverrideDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AddIpOverrideRequest_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AddIpOverrideRequest getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.AddIpOverrideRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AddIpOverrideRequest build() {
      com.google.recaptchaenterprise.v1.AddIpOverrideRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AddIpOverrideRequest buildPartial() {
      com.google.recaptchaenterprise.v1.AddIpOverrideRequest result =
          new com.google.recaptchaenterprise.v1.AddIpOverrideRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.AddIpOverrideRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ipOverrideData_ =
            ipOverrideDataBuilder_ == null ? ipOverrideData_ : ipOverrideDataBuilder_.build();
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
      if (other instanceof com.google.recaptchaenterprise.v1.AddIpOverrideRequest) {
        return mergeFrom((com.google.recaptchaenterprise.v1.AddIpOverrideRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.AddIpOverrideRequest other) {
      if (other == com.google.recaptchaenterprise.v1.AddIpOverrideRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasIpOverrideData()) {
        mergeIpOverrideData(other.getIpOverrideData());
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
                input.readMessage(getIpOverrideDataFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. The name of the key to which the IP override is added, in the
     * format `projects/{project}/keys/{key}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The name of the key to which the IP override is added, in the
     * format `projects/{project}/keys/{key}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The name of the key to which the IP override is added, in the
     * format `projects/{project}/keys/{key}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The name of the key to which the IP override is added, in the
     * format `projects/{project}/keys/{key}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. The name of the key to which the IP override is added, in the
     * format `projects/{project}/keys/{key}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private com.google.recaptchaenterprise.v1.IpOverrideData ipOverrideData_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.IpOverrideData,
            com.google.recaptchaenterprise.v1.IpOverrideData.Builder,
            com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder>
        ipOverrideDataBuilder_;

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the ipOverrideData field is set.
     */
    public boolean hasIpOverrideData() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The ipOverrideData.
     */
    public com.google.recaptchaenterprise.v1.IpOverrideData getIpOverrideData() {
      if (ipOverrideDataBuilder_ == null) {
        return ipOverrideData_ == null
            ? com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance()
            : ipOverrideData_;
      } else {
        return ipOverrideDataBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIpOverrideData(com.google.recaptchaenterprise.v1.IpOverrideData value) {
      if (ipOverrideDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ipOverrideData_ = value;
      } else {
        ipOverrideDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setIpOverrideData(
        com.google.recaptchaenterprise.v1.IpOverrideData.Builder builderForValue) {
      if (ipOverrideDataBuilder_ == null) {
        ipOverrideData_ = builderForValue.build();
      } else {
        ipOverrideDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeIpOverrideData(com.google.recaptchaenterprise.v1.IpOverrideData value) {
      if (ipOverrideDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && ipOverrideData_ != null
            && ipOverrideData_
                != com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance()) {
          getIpOverrideDataBuilder().mergeFrom(value);
        } else {
          ipOverrideData_ = value;
        }
      } else {
        ipOverrideDataBuilder_.mergeFrom(value);
      }
      if (ipOverrideData_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearIpOverrideData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ipOverrideData_ = null;
      if (ipOverrideDataBuilder_ != null) {
        ipOverrideDataBuilder_.dispose();
        ipOverrideDataBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.IpOverrideData.Builder getIpOverrideDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIpOverrideDataFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder getIpOverrideDataOrBuilder() {
      if (ipOverrideDataBuilder_ != null) {
        return ipOverrideDataBuilder_.getMessageOrBuilder();
      } else {
        return ipOverrideData_ == null
            ? com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance()
            : ipOverrideData_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. IP override added to the key.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData ip_override_data = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.IpOverrideData,
            com.google.recaptchaenterprise.v1.IpOverrideData.Builder,
            com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder>
        getIpOverrideDataFieldBuilder() {
      if (ipOverrideDataBuilder_ == null) {
        ipOverrideDataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.recaptchaenterprise.v1.IpOverrideData,
                com.google.recaptchaenterprise.v1.IpOverrideData.Builder,
                com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder>(
                getIpOverrideData(), getParentForChildren(), isClean());
        ipOverrideData_ = null;
      }
      return ipOverrideDataBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.AddIpOverrideRequest)
  private static final com.google.recaptchaenterprise.v1.AddIpOverrideRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.AddIpOverrideRequest();
  }

  public static com.google.recaptchaenterprise.v1.AddIpOverrideRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddIpOverrideRequest> PARSER =
      new com.google.protobuf.AbstractParser<AddIpOverrideRequest>() {
        @java.lang.Override
        public AddIpOverrideRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddIpOverrideRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddIpOverrideRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.AddIpOverrideRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
