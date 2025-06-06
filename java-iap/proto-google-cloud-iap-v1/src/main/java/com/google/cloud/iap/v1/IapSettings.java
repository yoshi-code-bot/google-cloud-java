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
// source: google/cloud/iap/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.iap.v1;

/**
 *
 *
 * <pre>
 * The IAP configurable settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iap.v1.IapSettings}
 */
public final class IapSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iap.v1.IapSettings)
    IapSettingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use IapSettings.newBuilder() to construct.
  private IapSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IapSettings() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IapSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_IapSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iap.v1.Service
        .internal_static_google_cloud_iap_v1_IapSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iap.v1.IapSettings.class,
            com.google.cloud.iap.v1.IapSettings.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the IAP protected resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The resource name of the IAP protected resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int ACCESS_SETTINGS_FIELD_NUMBER = 5;
  private com.google.cloud.iap.v1.AccessSettings accessSettings_;

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the accessSettings field is set.
   */
  @java.lang.Override
  public boolean hasAccessSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The accessSettings.
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.AccessSettings getAccessSettings() {
    return accessSettings_ == null
        ? com.google.cloud.iap.v1.AccessSettings.getDefaultInstance()
        : accessSettings_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all access related setting in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.AccessSettingsOrBuilder getAccessSettingsOrBuilder() {
    return accessSettings_ == null
        ? com.google.cloud.iap.v1.AccessSettings.getDefaultInstance()
        : accessSettings_;
  }

  public static final int APPLICATION_SETTINGS_FIELD_NUMBER = 6;
  private com.google.cloud.iap.v1.ApplicationSettings applicationSettings_;

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the applicationSettings field is set.
   */
  @java.lang.Override
  public boolean hasApplicationSettings() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The applicationSettings.
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.ApplicationSettings getApplicationSettings() {
    return applicationSettings_ == null
        ? com.google.cloud.iap.v1.ApplicationSettings.getDefaultInstance()
        : applicationSettings_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Top level wrapper for all application related settings in IAP
   * </pre>
   *
   * <code>
   * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.iap.v1.ApplicationSettingsOrBuilder getApplicationSettingsOrBuilder() {
    return applicationSettings_ == null
        ? com.google.cloud.iap.v1.ApplicationSettings.getDefaultInstance()
        : applicationSettings_;
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
      output.writeMessage(5, getAccessSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(6, getApplicationSettings());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getAccessSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(6, getApplicationSettings());
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
    if (!(obj instanceof com.google.cloud.iap.v1.IapSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.iap.v1.IapSettings other = (com.google.cloud.iap.v1.IapSettings) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasAccessSettings() != other.hasAccessSettings()) return false;
    if (hasAccessSettings()) {
      if (!getAccessSettings().equals(other.getAccessSettings())) return false;
    }
    if (hasApplicationSettings() != other.hasApplicationSettings()) return false;
    if (hasApplicationSettings()) {
      if (!getApplicationSettings().equals(other.getApplicationSettings())) return false;
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
    if (hasAccessSettings()) {
      hash = (37 * hash) + ACCESS_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getAccessSettings().hashCode();
    }
    if (hasApplicationSettings()) {
      hash = (37 * hash) + APPLICATION_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getApplicationSettings().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.IapSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.IapSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iap.v1.IapSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iap.v1.IapSettings prototype) {
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
   * The IAP configurable settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iap.v1.IapSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iap.v1.IapSettings)
      com.google.cloud.iap.v1.IapSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_IapSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_IapSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iap.v1.IapSettings.class,
              com.google.cloud.iap.v1.IapSettings.Builder.class);
    }

    // Construct using com.google.cloud.iap.v1.IapSettings.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAccessSettingsFieldBuilder();
        getApplicationSettingsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      accessSettings_ = null;
      if (accessSettingsBuilder_ != null) {
        accessSettingsBuilder_.dispose();
        accessSettingsBuilder_ = null;
      }
      applicationSettings_ = null;
      if (applicationSettingsBuilder_ != null) {
        applicationSettingsBuilder_.dispose();
        applicationSettingsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iap.v1.Service
          .internal_static_google_cloud_iap_v1_IapSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.IapSettings getDefaultInstanceForType() {
      return com.google.cloud.iap.v1.IapSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.IapSettings build() {
      com.google.cloud.iap.v1.IapSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iap.v1.IapSettings buildPartial() {
      com.google.cloud.iap.v1.IapSettings result = new com.google.cloud.iap.v1.IapSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iap.v1.IapSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accessSettings_ =
            accessSettingsBuilder_ == null ? accessSettings_ : accessSettingsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.applicationSettings_ =
            applicationSettingsBuilder_ == null
                ? applicationSettings_
                : applicationSettingsBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.iap.v1.IapSettings) {
        return mergeFrom((com.google.cloud.iap.v1.IapSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iap.v1.IapSettings other) {
      if (other == com.google.cloud.iap.v1.IapSettings.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccessSettings()) {
        mergeAccessSettings(other.getAccessSettings());
      }
      if (other.hasApplicationSettings()) {
        mergeApplicationSettings(other.getApplicationSettings());
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
            case 42:
              {
                input.readMessage(getAccessSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 42
            case 50:
              {
                input.readMessage(
                    getApplicationSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 50
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
     * Required. The resource name of the IAP protected resource.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the IAP protected resource.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the IAP protected resource.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the IAP protected resource.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The resource name of the IAP protected resource.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.iap.v1.AccessSettings accessSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.AccessSettings,
            com.google.cloud.iap.v1.AccessSettings.Builder,
            com.google.cloud.iap.v1.AccessSettingsOrBuilder>
        accessSettingsBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the accessSettings field is set.
     */
    public boolean hasAccessSettings() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The accessSettings.
     */
    public com.google.cloud.iap.v1.AccessSettings getAccessSettings() {
      if (accessSettingsBuilder_ == null) {
        return accessSettings_ == null
            ? com.google.cloud.iap.v1.AccessSettings.getDefaultInstance()
            : accessSettings_;
      } else {
        return accessSettingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setAccessSettings(com.google.cloud.iap.v1.AccessSettings value) {
      if (accessSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessSettings_ = value;
      } else {
        accessSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setAccessSettings(
        com.google.cloud.iap.v1.AccessSettings.Builder builderForValue) {
      if (accessSettingsBuilder_ == null) {
        accessSettings_ = builderForValue.build();
      } else {
        accessSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeAccessSettings(com.google.cloud.iap.v1.AccessSettings value) {
      if (accessSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && accessSettings_ != null
            && accessSettings_ != com.google.cloud.iap.v1.AccessSettings.getDefaultInstance()) {
          getAccessSettingsBuilder().mergeFrom(value);
        } else {
          accessSettings_ = value;
        }
      } else {
        accessSettingsBuilder_.mergeFrom(value);
      }
      if (accessSettings_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearAccessSettings() {
      bitField0_ = (bitField0_ & ~0x00000002);
      accessSettings_ = null;
      if (accessSettingsBuilder_ != null) {
        accessSettingsBuilder_.dispose();
        accessSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.iap.v1.AccessSettings.Builder getAccessSettingsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAccessSettingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.iap.v1.AccessSettingsOrBuilder getAccessSettingsOrBuilder() {
      if (accessSettingsBuilder_ != null) {
        return accessSettingsBuilder_.getMessageOrBuilder();
      } else {
        return accessSettings_ == null
            ? com.google.cloud.iap.v1.AccessSettings.getDefaultInstance()
            : accessSettings_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all access related setting in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.AccessSettings access_settings = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.AccessSettings,
            com.google.cloud.iap.v1.AccessSettings.Builder,
            com.google.cloud.iap.v1.AccessSettingsOrBuilder>
        getAccessSettingsFieldBuilder() {
      if (accessSettingsBuilder_ == null) {
        accessSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.iap.v1.AccessSettings,
                com.google.cloud.iap.v1.AccessSettings.Builder,
                com.google.cloud.iap.v1.AccessSettingsOrBuilder>(
                getAccessSettings(), getParentForChildren(), isClean());
        accessSettings_ = null;
      }
      return accessSettingsBuilder_;
    }

    private com.google.cloud.iap.v1.ApplicationSettings applicationSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.ApplicationSettings,
            com.google.cloud.iap.v1.ApplicationSettings.Builder,
            com.google.cloud.iap.v1.ApplicationSettingsOrBuilder>
        applicationSettingsBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the applicationSettings field is set.
     */
    public boolean hasApplicationSettings() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The applicationSettings.
     */
    public com.google.cloud.iap.v1.ApplicationSettings getApplicationSettings() {
      if (applicationSettingsBuilder_ == null) {
        return applicationSettings_ == null
            ? com.google.cloud.iap.v1.ApplicationSettings.getDefaultInstance()
            : applicationSettings_;
      } else {
        return applicationSettingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setApplicationSettings(com.google.cloud.iap.v1.ApplicationSettings value) {
      if (applicationSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        applicationSettings_ = value;
      } else {
        applicationSettingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setApplicationSettings(
        com.google.cloud.iap.v1.ApplicationSettings.Builder builderForValue) {
      if (applicationSettingsBuilder_ == null) {
        applicationSettings_ = builderForValue.build();
      } else {
        applicationSettingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeApplicationSettings(com.google.cloud.iap.v1.ApplicationSettings value) {
      if (applicationSettingsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && applicationSettings_ != null
            && applicationSettings_
                != com.google.cloud.iap.v1.ApplicationSettings.getDefaultInstance()) {
          getApplicationSettingsBuilder().mergeFrom(value);
        } else {
          applicationSettings_ = value;
        }
      } else {
        applicationSettingsBuilder_.mergeFrom(value);
      }
      if (applicationSettings_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearApplicationSettings() {
      bitField0_ = (bitField0_ & ~0x00000004);
      applicationSettings_ = null;
      if (applicationSettingsBuilder_ != null) {
        applicationSettingsBuilder_.dispose();
        applicationSettingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.iap.v1.ApplicationSettings.Builder getApplicationSettingsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getApplicationSettingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.iap.v1.ApplicationSettingsOrBuilder getApplicationSettingsOrBuilder() {
      if (applicationSettingsBuilder_ != null) {
        return applicationSettingsBuilder_.getMessageOrBuilder();
      } else {
        return applicationSettings_ == null
            ? com.google.cloud.iap.v1.ApplicationSettings.getDefaultInstance()
            : applicationSettings_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Top level wrapper for all application related settings in IAP
     * </pre>
     *
     * <code>
     * .google.cloud.iap.v1.ApplicationSettings application_settings = 6 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iap.v1.ApplicationSettings,
            com.google.cloud.iap.v1.ApplicationSettings.Builder,
            com.google.cloud.iap.v1.ApplicationSettingsOrBuilder>
        getApplicationSettingsFieldBuilder() {
      if (applicationSettingsBuilder_ == null) {
        applicationSettingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.iap.v1.ApplicationSettings,
                com.google.cloud.iap.v1.ApplicationSettings.Builder,
                com.google.cloud.iap.v1.ApplicationSettingsOrBuilder>(
                getApplicationSettings(), getParentForChildren(), isClean());
        applicationSettings_ = null;
      }
      return applicationSettingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iap.v1.IapSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iap.v1.IapSettings)
  private static final com.google.cloud.iap.v1.IapSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iap.v1.IapSettings();
  }

  public static com.google.cloud.iap.v1.IapSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IapSettings> PARSER =
      new com.google.protobuf.AbstractParser<IapSettings>() {
        @java.lang.Override
        public IapSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<IapSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IapSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iap.v1.IapSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
