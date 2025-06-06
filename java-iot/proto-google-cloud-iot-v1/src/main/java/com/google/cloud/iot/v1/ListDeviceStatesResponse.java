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
// source: google/cloud/iot/v1/device_manager.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Response for `ListDeviceStates`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.ListDeviceStatesResponse}
 */
public final class ListDeviceStatesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.ListDeviceStatesResponse)
    ListDeviceStatesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListDeviceStatesResponse.newBuilder() to construct.
  private ListDeviceStatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDeviceStatesResponse() {
    deviceStates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDeviceStatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceStatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceStatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.ListDeviceStatesResponse.class,
            com.google.cloud.iot.v1.ListDeviceStatesResponse.Builder.class);
  }

  public static final int DEVICE_STATES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.iot.v1.DeviceState> deviceStates_;

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.iot.v1.DeviceState> getDeviceStatesList() {
    return deviceStates_;
  }

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.iot.v1.DeviceStateOrBuilder>
      getDeviceStatesOrBuilderList() {
    return deviceStates_;
  }

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  @java.lang.Override
  public int getDeviceStatesCount() {
    return deviceStates_.size();
  }

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.DeviceState getDeviceStates(int index) {
    return deviceStates_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The last few device states. States are listed in descending order of server
   * update time, starting from the most recent one.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.DeviceStateOrBuilder getDeviceStatesOrBuilder(int index) {
    return deviceStates_.get(index);
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
    for (int i = 0; i < deviceStates_.size(); i++) {
      output.writeMessage(1, deviceStates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deviceStates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, deviceStates_.get(i));
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
    if (!(obj instanceof com.google.cloud.iot.v1.ListDeviceStatesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.ListDeviceStatesResponse other =
        (com.google.cloud.iot.v1.ListDeviceStatesResponse) obj;

    if (!getDeviceStatesList().equals(other.getDeviceStatesList())) return false;
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
    if (getDeviceStatesCount() > 0) {
      hash = (37 * hash) + DEVICE_STATES_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceStatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.ListDeviceStatesResponse prototype) {
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
   * Response for `ListDeviceStates`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.ListDeviceStatesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.ListDeviceStatesResponse)
      com.google.cloud.iot.v1.ListDeviceStatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceStatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceStatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.ListDeviceStatesResponse.class,
              com.google.cloud.iot.v1.ListDeviceStatesResponse.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.ListDeviceStatesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (deviceStatesBuilder_ == null) {
        deviceStates_ = java.util.Collections.emptyList();
      } else {
        deviceStates_ = null;
        deviceStatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceStatesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceStatesResponse getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.ListDeviceStatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceStatesResponse build() {
      com.google.cloud.iot.v1.ListDeviceStatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceStatesResponse buildPartial() {
      com.google.cloud.iot.v1.ListDeviceStatesResponse result =
          new com.google.cloud.iot.v1.ListDeviceStatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.iot.v1.ListDeviceStatesResponse result) {
      if (deviceStatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deviceStates_ = java.util.Collections.unmodifiableList(deviceStates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deviceStates_ = deviceStates_;
      } else {
        result.deviceStates_ = deviceStatesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.iot.v1.ListDeviceStatesResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.iot.v1.ListDeviceStatesResponse) {
        return mergeFrom((com.google.cloud.iot.v1.ListDeviceStatesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.ListDeviceStatesResponse other) {
      if (other == com.google.cloud.iot.v1.ListDeviceStatesResponse.getDefaultInstance())
        return this;
      if (deviceStatesBuilder_ == null) {
        if (!other.deviceStates_.isEmpty()) {
          if (deviceStates_.isEmpty()) {
            deviceStates_ = other.deviceStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeviceStatesIsMutable();
            deviceStates_.addAll(other.deviceStates_);
          }
          onChanged();
        }
      } else {
        if (!other.deviceStates_.isEmpty()) {
          if (deviceStatesBuilder_.isEmpty()) {
            deviceStatesBuilder_.dispose();
            deviceStatesBuilder_ = null;
            deviceStates_ = other.deviceStates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deviceStatesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDeviceStatesFieldBuilder()
                    : null;
          } else {
            deviceStatesBuilder_.addAllMessages(other.deviceStates_);
          }
        }
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
                com.google.cloud.iot.v1.DeviceState m =
                    input.readMessage(
                        com.google.cloud.iot.v1.DeviceState.parser(), extensionRegistry);
                if (deviceStatesBuilder_ == null) {
                  ensureDeviceStatesIsMutable();
                  deviceStates_.add(m);
                } else {
                  deviceStatesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.iot.v1.DeviceState> deviceStates_ =
        java.util.Collections.emptyList();

    private void ensureDeviceStatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deviceStates_ = new java.util.ArrayList<com.google.cloud.iot.v1.DeviceState>(deviceStates_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceState,
            com.google.cloud.iot.v1.DeviceState.Builder,
            com.google.cloud.iot.v1.DeviceStateOrBuilder>
        deviceStatesBuilder_;

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceState> getDeviceStatesList() {
      if (deviceStatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deviceStates_);
      } else {
        return deviceStatesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public int getDeviceStatesCount() {
      if (deviceStatesBuilder_ == null) {
        return deviceStates_.size();
      } else {
        return deviceStatesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceState getDeviceStates(int index) {
      if (deviceStatesBuilder_ == null) {
        return deviceStates_.get(index);
      } else {
        return deviceStatesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder setDeviceStates(int index, com.google.cloud.iot.v1.DeviceState value) {
      if (deviceStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceStatesIsMutable();
        deviceStates_.set(index, value);
        onChanged();
      } else {
        deviceStatesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder setDeviceStates(
        int index, com.google.cloud.iot.v1.DeviceState.Builder builderForValue) {
      if (deviceStatesBuilder_ == null) {
        ensureDeviceStatesIsMutable();
        deviceStates_.set(index, builderForValue.build());
        onChanged();
      } else {
        deviceStatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder addDeviceStates(com.google.cloud.iot.v1.DeviceState value) {
      if (deviceStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceStatesIsMutable();
        deviceStates_.add(value);
        onChanged();
      } else {
        deviceStatesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder addDeviceStates(int index, com.google.cloud.iot.v1.DeviceState value) {
      if (deviceStatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceStatesIsMutable();
        deviceStates_.add(index, value);
        onChanged();
      } else {
        deviceStatesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder addDeviceStates(com.google.cloud.iot.v1.DeviceState.Builder builderForValue) {
      if (deviceStatesBuilder_ == null) {
        ensureDeviceStatesIsMutable();
        deviceStates_.add(builderForValue.build());
        onChanged();
      } else {
        deviceStatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder addDeviceStates(
        int index, com.google.cloud.iot.v1.DeviceState.Builder builderForValue) {
      if (deviceStatesBuilder_ == null) {
        ensureDeviceStatesIsMutable();
        deviceStates_.add(index, builderForValue.build());
        onChanged();
      } else {
        deviceStatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder addAllDeviceStates(
        java.lang.Iterable<? extends com.google.cloud.iot.v1.DeviceState> values) {
      if (deviceStatesBuilder_ == null) {
        ensureDeviceStatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deviceStates_);
        onChanged();
      } else {
        deviceStatesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder clearDeviceStates() {
      if (deviceStatesBuilder_ == null) {
        deviceStates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deviceStatesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public Builder removeDeviceStates(int index) {
      if (deviceStatesBuilder_ == null) {
        ensureDeviceStatesIsMutable();
        deviceStates_.remove(index);
        onChanged();
      } else {
        deviceStatesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceState.Builder getDeviceStatesBuilder(int index) {
      return getDeviceStatesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceStateOrBuilder getDeviceStatesOrBuilder(int index) {
      if (deviceStatesBuilder_ == null) {
        return deviceStates_.get(index);
      } else {
        return deviceStatesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.iot.v1.DeviceStateOrBuilder>
        getDeviceStatesOrBuilderList() {
      if (deviceStatesBuilder_ != null) {
        return deviceStatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deviceStates_);
      }
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceState.Builder addDeviceStatesBuilder() {
      return getDeviceStatesFieldBuilder()
          .addBuilder(com.google.cloud.iot.v1.DeviceState.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceState.Builder addDeviceStatesBuilder(int index) {
      return getDeviceStatesFieldBuilder()
          .addBuilder(index, com.google.cloud.iot.v1.DeviceState.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The last few device states. States are listed in descending order of server
     * update time, starting from the most recent one.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceState device_states = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceState.Builder>
        getDeviceStatesBuilderList() {
      return getDeviceStatesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceState,
            com.google.cloud.iot.v1.DeviceState.Builder,
            com.google.cloud.iot.v1.DeviceStateOrBuilder>
        getDeviceStatesFieldBuilder() {
      if (deviceStatesBuilder_ == null) {
        deviceStatesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.iot.v1.DeviceState,
                com.google.cloud.iot.v1.DeviceState.Builder,
                com.google.cloud.iot.v1.DeviceStateOrBuilder>(
                deviceStates_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        deviceStates_ = null;
      }
      return deviceStatesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.ListDeviceStatesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.ListDeviceStatesResponse)
  private static final com.google.cloud.iot.v1.ListDeviceStatesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.ListDeviceStatesResponse();
  }

  public static com.google.cloud.iot.v1.ListDeviceStatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeviceStatesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDeviceStatesResponse>() {
        @java.lang.Override
        public ListDeviceStatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDeviceStatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeviceStatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.ListDeviceStatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
