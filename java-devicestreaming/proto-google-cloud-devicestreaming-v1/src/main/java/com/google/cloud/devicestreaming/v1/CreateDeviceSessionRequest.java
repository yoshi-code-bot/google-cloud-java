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
// source: google/cloud/devicestreaming/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.devicestreaming.v1;

/**
 *
 *
 * <pre>
 * Request message for DirectAccessService.CreateDeviceSession.
 * </pre>
 *
 * Protobuf type {@code google.cloud.devicestreaming.v1.CreateDeviceSessionRequest}
 */
public final class CreateDeviceSessionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.devicestreaming.v1.CreateDeviceSessionRequest)
    CreateDeviceSessionRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateDeviceSessionRequest.newBuilder() to construct.
  private CreateDeviceSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDeviceSessionRequest() {
    parent_ = "";
    deviceSessionId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDeviceSessionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.devicestreaming.v1.ServiceProto
        .internal_static_google_cloud_devicestreaming_v1_CreateDeviceSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.devicestreaming.v1.ServiceProto
        .internal_static_google_cloud_devicestreaming_v1_CreateDeviceSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.class,
            com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The Compute Engine project under which this device will be
   * allocated. "projects/{project_id}"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The Compute Engine project under which this device will be
   * allocated. "projects/{project_id}"
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_SESSION_FIELD_NUMBER = 2;
  private com.google.cloud.devicestreaming.v1.DeviceSession deviceSession_;

  /**
   *
   *
   * <pre>
   * Required. A DeviceSession to create.
   * </pre>
   *
   * <code>
   * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deviceSession field is set.
   */
  @java.lang.Override
  public boolean hasDeviceSession() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. A DeviceSession to create.
   * </pre>
   *
   * <code>
   * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deviceSession.
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.DeviceSession getDeviceSession() {
    return deviceSession_ == null
        ? com.google.cloud.devicestreaming.v1.DeviceSession.getDefaultInstance()
        : deviceSession_;
  }

  /**
   *
   *
   * <pre>
   * Required. A DeviceSession to create.
   * </pre>
   *
   * <code>
   * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.DeviceSessionOrBuilder getDeviceSessionOrBuilder() {
    return deviceSession_ == null
        ? com.google.cloud.devicestreaming.v1.DeviceSession.getDefaultInstance()
        : deviceSession_;
  }

  public static final int DEVICE_SESSION_ID_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceSessionId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the DeviceSession, which will become the final
   * component of the DeviceSession's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deviceSessionId.
   */
  @java.lang.Override
  public java.lang.String getDeviceSessionId() {
    java.lang.Object ref = deviceSessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceSessionId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The ID to use for the DeviceSession, which will become the final
   * component of the DeviceSession's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deviceSessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeviceSessionIdBytes() {
    java.lang.Object ref = deviceSessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deviceSessionId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDeviceSession());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceSessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, deviceSessionId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeviceSession());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceSessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, deviceSessionId_);
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
    if (!(obj instanceof com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest other =
        (com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDeviceSession() != other.hasDeviceSession()) return false;
    if (hasDeviceSession()) {
      if (!getDeviceSession().equals(other.getDeviceSession())) return false;
    }
    if (!getDeviceSessionId().equals(other.getDeviceSessionId())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDeviceSession()) {
      hash = (37 * hash) + DEVICE_SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceSession().hashCode();
    }
    hash = (37 * hash) + DEVICE_SESSION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceSessionId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest parseFrom(
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
      com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest prototype) {
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
   * Request message for DirectAccessService.CreateDeviceSession.
   * </pre>
   *
   * Protobuf type {@code google.cloud.devicestreaming.v1.CreateDeviceSessionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.devicestreaming.v1.CreateDeviceSessionRequest)
      com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.devicestreaming.v1.ServiceProto
          .internal_static_google_cloud_devicestreaming_v1_CreateDeviceSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.devicestreaming.v1.ServiceProto
          .internal_static_google_cloud_devicestreaming_v1_CreateDeviceSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.class,
              com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.Builder.class);
    }

    // Construct using com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDeviceSessionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      deviceSession_ = null;
      if (deviceSessionBuilder_ != null) {
        deviceSessionBuilder_.dispose();
        deviceSessionBuilder_ = null;
      }
      deviceSessionId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.devicestreaming.v1.ServiceProto
          .internal_static_google_cloud_devicestreaming_v1_CreateDeviceSessionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest build() {
      com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest buildPartial() {
      com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest result =
          new com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deviceSession_ =
            deviceSessionBuilder_ == null ? deviceSession_ : deviceSessionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.deviceSessionId_ = deviceSessionId_;
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
      if (other instanceof com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest) {
        return mergeFrom((com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest other) {
      if (other
          == com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDeviceSession()) {
        mergeDeviceSession(other.getDeviceSession());
      }
      if (!other.getDeviceSessionId().isEmpty()) {
        deviceSessionId_ = other.deviceSessionId_;
        bitField0_ |= 0x00000004;
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getDeviceSessionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 34:
              {
                deviceSessionId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The Compute Engine project under which this device will be
     * allocated. "projects/{project_id}"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The Compute Engine project under which this device will be
     * allocated. "projects/{project_id}"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The Compute Engine project under which this device will be
     * allocated. "projects/{project_id}"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Compute Engine project under which this device will be
     * allocated. "projects/{project_id}"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Compute Engine project under which this device will be
     * allocated. "projects/{project_id}"
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.devicestreaming.v1.DeviceSession deviceSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.DeviceSession,
            com.google.cloud.devicestreaming.v1.DeviceSession.Builder,
            com.google.cloud.devicestreaming.v1.DeviceSessionOrBuilder>
        deviceSessionBuilder_;

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the deviceSession field is set.
     */
    public boolean hasDeviceSession() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The deviceSession.
     */
    public com.google.cloud.devicestreaming.v1.DeviceSession getDeviceSession() {
      if (deviceSessionBuilder_ == null) {
        return deviceSession_ == null
            ? com.google.cloud.devicestreaming.v1.DeviceSession.getDefaultInstance()
            : deviceSession_;
      } else {
        return deviceSessionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeviceSession(com.google.cloud.devicestreaming.v1.DeviceSession value) {
      if (deviceSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceSession_ = value;
      } else {
        deviceSessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDeviceSession(
        com.google.cloud.devicestreaming.v1.DeviceSession.Builder builderForValue) {
      if (deviceSessionBuilder_ == null) {
        deviceSession_ = builderForValue.build();
      } else {
        deviceSessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDeviceSession(com.google.cloud.devicestreaming.v1.DeviceSession value) {
      if (deviceSessionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && deviceSession_ != null
            && deviceSession_
                != com.google.cloud.devicestreaming.v1.DeviceSession.getDefaultInstance()) {
          getDeviceSessionBuilder().mergeFrom(value);
        } else {
          deviceSession_ = value;
        }
      } else {
        deviceSessionBuilder_.mergeFrom(value);
      }
      if (deviceSession_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDeviceSession() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deviceSession_ = null;
      if (deviceSessionBuilder_ != null) {
        deviceSessionBuilder_.dispose();
        deviceSessionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.devicestreaming.v1.DeviceSession.Builder getDeviceSessionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDeviceSessionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.devicestreaming.v1.DeviceSessionOrBuilder getDeviceSessionOrBuilder() {
      if (deviceSessionBuilder_ != null) {
        return deviceSessionBuilder_.getMessageOrBuilder();
      } else {
        return deviceSession_ == null
            ? com.google.cloud.devicestreaming.v1.DeviceSession.getDefaultInstance()
            : deviceSession_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. A DeviceSession to create.
     * </pre>
     *
     * <code>
     * .google.cloud.devicestreaming.v1.DeviceSession device_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.devicestreaming.v1.DeviceSession,
            com.google.cloud.devicestreaming.v1.DeviceSession.Builder,
            com.google.cloud.devicestreaming.v1.DeviceSessionOrBuilder>
        getDeviceSessionFieldBuilder() {
      if (deviceSessionBuilder_ == null) {
        deviceSessionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.devicestreaming.v1.DeviceSession,
                com.google.cloud.devicestreaming.v1.DeviceSession.Builder,
                com.google.cloud.devicestreaming.v1.DeviceSessionOrBuilder>(
                getDeviceSession(), getParentForChildren(), isClean());
        deviceSession_ = null;
      }
      return deviceSessionBuilder_;
    }

    private java.lang.Object deviceSessionId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the DeviceSession, which will become the final
     * component of the DeviceSession's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The deviceSessionId.
     */
    public java.lang.String getDeviceSessionId() {
      java.lang.Object ref = deviceSessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceSessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the DeviceSession, which will become the final
     * component of the DeviceSession's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for deviceSessionId.
     */
    public com.google.protobuf.ByteString getDeviceSessionIdBytes() {
      java.lang.Object ref = deviceSessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deviceSessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the DeviceSession, which will become the final
     * component of the DeviceSession's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The deviceSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceSessionId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deviceSessionId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the DeviceSession, which will become the final
     * component of the DeviceSession's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeviceSessionId() {
      deviceSessionId_ = getDefaultInstance().getDeviceSessionId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The ID to use for the DeviceSession, which will become the final
     * component of the DeviceSession's resource name.
     *
     * This value should be 4-63 characters, and valid characters
     * are /[a-z][0-9]-/.
     * </pre>
     *
     * <code>string device_session_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for deviceSessionId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceSessionIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deviceSessionId_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.devicestreaming.v1.CreateDeviceSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.devicestreaming.v1.CreateDeviceSessionRequest)
  private static final com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest();
  }

  public static com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeviceSessionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDeviceSessionRequest>() {
        @java.lang.Override
        public CreateDeviceSessionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDeviceSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeviceSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.devicestreaming.v1.CreateDeviceSessionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
