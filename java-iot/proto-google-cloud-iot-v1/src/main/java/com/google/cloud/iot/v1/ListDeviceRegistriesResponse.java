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
 * Response for `ListDeviceRegistries`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.ListDeviceRegistriesResponse}
 */
public final class ListDeviceRegistriesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.ListDeviceRegistriesResponse)
    ListDeviceRegistriesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListDeviceRegistriesResponse.newBuilder() to construct.
  private ListDeviceRegistriesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDeviceRegistriesResponse() {
    deviceRegistries_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDeviceRegistriesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceRegistriesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_ListDeviceRegistriesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.ListDeviceRegistriesResponse.class,
            com.google.cloud.iot.v1.ListDeviceRegistriesResponse.Builder.class);
  }

  public static final int DEVICE_REGISTRIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.iot.v1.DeviceRegistry> deviceRegistries_;

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.iot.v1.DeviceRegistry> getDeviceRegistriesList() {
    return deviceRegistries_;
  }

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
      getDeviceRegistriesOrBuilderList() {
    return deviceRegistries_;
  }

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  @java.lang.Override
  public int getDeviceRegistriesCount() {
    return deviceRegistries_.size();
  }

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistries(int index) {
    return deviceRegistries_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The registries that matched the query.
   * </pre>
   *
   * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistriesOrBuilder(int index) {
    return deviceRegistries_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more registries that match the
   * request; this value should be passed in a new
   * `ListDeviceRegistriesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more registries that match the
   * request; this value should be passed in a new
   * `ListDeviceRegistriesRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < deviceRegistries_.size(); i++) {
      output.writeMessage(1, deviceRegistries_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deviceRegistries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, deviceRegistries_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.ListDeviceRegistriesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.ListDeviceRegistriesResponse other =
        (com.google.cloud.iot.v1.ListDeviceRegistriesResponse) obj;

    if (!getDeviceRegistriesList().equals(other.getDeviceRegistriesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDeviceRegistriesCount() > 0) {
      hash = (37 * hash) + DEVICE_REGISTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceRegistriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.ListDeviceRegistriesResponse prototype) {
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
   * Response for `ListDeviceRegistries`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.ListDeviceRegistriesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.ListDeviceRegistriesResponse)
      com.google.cloud.iot.v1.ListDeviceRegistriesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceRegistriesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceRegistriesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.ListDeviceRegistriesResponse.class,
              com.google.cloud.iot.v1.ListDeviceRegistriesResponse.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.ListDeviceRegistriesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (deviceRegistriesBuilder_ == null) {
        deviceRegistries_ = java.util.Collections.emptyList();
      } else {
        deviceRegistries_ = null;
        deviceRegistriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_ListDeviceRegistriesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesResponse getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.ListDeviceRegistriesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesResponse build() {
      com.google.cloud.iot.v1.ListDeviceRegistriesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.ListDeviceRegistriesResponse buildPartial() {
      com.google.cloud.iot.v1.ListDeviceRegistriesResponse result =
          new com.google.cloud.iot.v1.ListDeviceRegistriesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.iot.v1.ListDeviceRegistriesResponse result) {
      if (deviceRegistriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deviceRegistries_ = java.util.Collections.unmodifiableList(deviceRegistries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deviceRegistries_ = deviceRegistries_;
      } else {
        result.deviceRegistries_ = deviceRegistriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.iot.v1.ListDeviceRegistriesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.iot.v1.ListDeviceRegistriesResponse) {
        return mergeFrom((com.google.cloud.iot.v1.ListDeviceRegistriesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.ListDeviceRegistriesResponse other) {
      if (other == com.google.cloud.iot.v1.ListDeviceRegistriesResponse.getDefaultInstance())
        return this;
      if (deviceRegistriesBuilder_ == null) {
        if (!other.deviceRegistries_.isEmpty()) {
          if (deviceRegistries_.isEmpty()) {
            deviceRegistries_ = other.deviceRegistries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeviceRegistriesIsMutable();
            deviceRegistries_.addAll(other.deviceRegistries_);
          }
          onChanged();
        }
      } else {
        if (!other.deviceRegistries_.isEmpty()) {
          if (deviceRegistriesBuilder_.isEmpty()) {
            deviceRegistriesBuilder_.dispose();
            deviceRegistriesBuilder_ = null;
            deviceRegistries_ = other.deviceRegistries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deviceRegistriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDeviceRegistriesFieldBuilder()
                    : null;
          } else {
            deviceRegistriesBuilder_.addAllMessages(other.deviceRegistries_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.iot.v1.DeviceRegistry m =
                    input.readMessage(
                        com.google.cloud.iot.v1.DeviceRegistry.parser(), extensionRegistry);
                if (deviceRegistriesBuilder_ == null) {
                  ensureDeviceRegistriesIsMutable();
                  deviceRegistries_.add(m);
                } else {
                  deviceRegistriesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.iot.v1.DeviceRegistry> deviceRegistries_ =
        java.util.Collections.emptyList();

    private void ensureDeviceRegistriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deviceRegistries_ =
            new java.util.ArrayList<com.google.cloud.iot.v1.DeviceRegistry>(deviceRegistries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry,
            com.google.cloud.iot.v1.DeviceRegistry.Builder,
            com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
        deviceRegistriesBuilder_;

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceRegistry> getDeviceRegistriesList() {
      if (deviceRegistriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deviceRegistries_);
      } else {
        return deviceRegistriesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public int getDeviceRegistriesCount() {
      if (deviceRegistriesBuilder_ == null) {
        return deviceRegistries_.size();
      } else {
        return deviceRegistriesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistries(int index) {
      if (deviceRegistriesBuilder_ == null) {
        return deviceRegistries_.get(index);
      } else {
        return deviceRegistriesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder setDeviceRegistries(int index, com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.set(index, value);
        onChanged();
      } else {
        deviceRegistriesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder setDeviceRegistries(
        int index, com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistriesBuilder_ == null) {
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.set(index, builderForValue.build());
        onChanged();
      } else {
        deviceRegistriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder addDeviceRegistries(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.add(value);
        onChanged();
      } else {
        deviceRegistriesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder addDeviceRegistries(int index, com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.add(index, value);
        onChanged();
      } else {
        deviceRegistriesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder addDeviceRegistries(
        com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistriesBuilder_ == null) {
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.add(builderForValue.build());
        onChanged();
      } else {
        deviceRegistriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder addDeviceRegistries(
        int index, com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistriesBuilder_ == null) {
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.add(index, builderForValue.build());
        onChanged();
      } else {
        deviceRegistriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder addAllDeviceRegistries(
        java.lang.Iterable<? extends com.google.cloud.iot.v1.DeviceRegistry> values) {
      if (deviceRegistriesBuilder_ == null) {
        ensureDeviceRegistriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, deviceRegistries_);
        onChanged();
      } else {
        deviceRegistriesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder clearDeviceRegistries() {
      if (deviceRegistriesBuilder_ == null) {
        deviceRegistries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deviceRegistriesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public Builder removeDeviceRegistries(int index) {
      if (deviceRegistriesBuilder_ == null) {
        ensureDeviceRegistriesIsMutable();
        deviceRegistries_.remove(index);
        onChanged();
      } else {
        deviceRegistriesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder getDeviceRegistriesBuilder(int index) {
      return getDeviceRegistriesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistriesOrBuilder(int index) {
      if (deviceRegistriesBuilder_ == null) {
        return deviceRegistries_.get(index);
      } else {
        return deviceRegistriesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
        getDeviceRegistriesOrBuilderList() {
      if (deviceRegistriesBuilder_ != null) {
        return deviceRegistriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deviceRegistries_);
      }
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder addDeviceRegistriesBuilder() {
      return getDeviceRegistriesFieldBuilder()
          .addBuilder(com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder addDeviceRegistriesBuilder(int index) {
      return getDeviceRegistriesFieldBuilder()
          .addBuilder(index, com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The registries that matched the query.
     * </pre>
     *
     * <code>repeated .google.cloud.iot.v1.DeviceRegistry device_registries = 1;</code>
     */
    public java.util.List<com.google.cloud.iot.v1.DeviceRegistry.Builder>
        getDeviceRegistriesBuilderList() {
      return getDeviceRegistriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry,
            com.google.cloud.iot.v1.DeviceRegistry.Builder,
            com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
        getDeviceRegistriesFieldBuilder() {
      if (deviceRegistriesBuilder_ == null) {
        deviceRegistriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.iot.v1.DeviceRegistry,
                com.google.cloud.iot.v1.DeviceRegistry.Builder,
                com.google.cloud.iot.v1.DeviceRegistryOrBuilder>(
                deviceRegistries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deviceRegistries_ = null;
      }
      return deviceRegistriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more registries that match the
     * request; this value should be passed in a new
     * `ListDeviceRegistriesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more registries that match the
     * request; this value should be passed in a new
     * `ListDeviceRegistriesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more registries that match the
     * request; this value should be passed in a new
     * `ListDeviceRegistriesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more registries that match the
     * request; this value should be passed in a new
     * `ListDeviceRegistriesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more registries that match the
     * request; this value should be passed in a new
     * `ListDeviceRegistriesRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.ListDeviceRegistriesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.ListDeviceRegistriesResponse)
  private static final com.google.cloud.iot.v1.ListDeviceRegistriesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.ListDeviceRegistriesResponse();
  }

  public static com.google.cloud.iot.v1.ListDeviceRegistriesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDeviceRegistriesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDeviceRegistriesResponse>() {
        @java.lang.Override
        public ListDeviceRegistriesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDeviceRegistriesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDeviceRegistriesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.ListDeviceRegistriesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
