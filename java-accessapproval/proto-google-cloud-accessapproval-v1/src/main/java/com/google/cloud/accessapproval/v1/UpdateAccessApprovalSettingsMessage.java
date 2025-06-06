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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * Request to update access approval settings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage}
 */
public final class UpdateAccessApprovalSettingsMessage
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
    UpdateAccessApprovalSettingsMessageOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateAccessApprovalSettingsMessage.newBuilder() to construct.
  private UpdateAccessApprovalSettingsMessage(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAccessApprovalSettingsMessage() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAccessApprovalSettingsMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.class,
            com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.Builder.class);
  }

  private int bitField0_;
  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.google.cloud.accessapproval.v1.AccessApprovalSettings settings_;

  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   *
   * @return Whether the settings field is set.
   */
  @java.lang.Override
  public boolean hasSettings() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   *
   * @return The settings.
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessApprovalSettings getSettings() {
    return settings_ == null
        ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance()
        : settings_;
  }

  /**
   *
   *
   * <pre>
   * The new AccessApprovalSettings.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder getSettingsOrBuilder() {
    return settings_ == null
        ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance()
        : settings_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  /**
   *
   *
   * <pre>
   * The update mask applies to the settings. Only the top level fields of
   * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
   * supported. For each field, if it is included, the currently stored value
   * will be entirely overwritten with the value of the field passed in this
   * request.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If this field is left unset, only the notification_emails field will be
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSettings());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage other =
        (com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) obj;

    if (hasSettings() != other.hasSettings()) return false;
    if (hasSettings()) {
      if (!getSettings().equals(other.getSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage parseFrom(
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
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage prototype) {
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
   * Request to update access approval settings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.class,
              com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.Builder.class);
    }

    // Construct using
    // com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSettingsFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_UpdateAccessApprovalSettingsMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
        getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage build() {
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage buildPartial() {
      com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage result =
          new com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.settings_ = settingsBuilder_ == null ? settings_ : settingsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) {
        return mergeFrom(
            (com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage other) {
      if (other
          == com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
              .getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.accessapproval.v1.AccessApprovalSettings settings_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.accessapproval.v1.AccessApprovalSettings,
            com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder,
            com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder>
        settingsBuilder_;

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     *
     * @return Whether the settings field is set.
     */
    public boolean hasSettings() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     *
     * @return The settings.
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null
            ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance()
            : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder setSettings(com.google.cloud.accessapproval.v1.AccessApprovalSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
      } else {
        settingsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder setSettings(
        com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder mergeSettings(com.google.cloud.accessapproval.v1.AccessApprovalSettings value) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && settings_ != null
            && settings_
                != com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance()) {
          getSettingsBuilder().mergeFrom(value);
        } else {
          settings_ = value;
        }
      } else {
        settingsBuilder_.mergeFrom(value);
      }
      if (settings_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public Builder clearSettings() {
      bitField0_ = (bitField0_ & ~0x00000001);
      settings_ = null;
      if (settingsBuilder_ != null) {
        settingsBuilder_.dispose();
        settingsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder getSettingsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    public com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder
        getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null
            ? com.google.cloud.accessapproval.v1.AccessApprovalSettings.getDefaultInstance()
            : settings_;
      }
    }

    /**
     *
     *
     * <pre>
     * The new AccessApprovalSettings.
     * </pre>
     *
     * <code>.google.cloud.accessapproval.v1.AccessApprovalSettings settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.accessapproval.v1.AccessApprovalSettings,
            com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder,
            com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder>
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.accessapproval.v1.AccessApprovalSettings,
                com.google.cloud.accessapproval.v1.AccessApprovalSettings.Builder,
                com.google.cloud.accessapproval.v1.AccessApprovalSettingsOrBuilder>(
                getSettings(), getParentForChildren(), isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }

    /**
     *
     *
     * <pre>
     * The update mask applies to the settings. Only the top level fields of
     * AccessApprovalSettings (notification_emails &amp; enrolled_services) are
     * supported. For each field, if it is included, the currently stored value
     * will be entirely overwritten with the value of the field passed in this
     * request.
     *
     * For the `FieldMask` definition, see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * If this field is left unset, only the notification_emails field will be
     * updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage)
  private static final com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage();
  }

  public static com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAccessApprovalSettingsMessage>() {
        @java.lang.Override
        public UpdateAccessApprovalSettingsMessage parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAccessApprovalSettingsMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.UpdateAccessApprovalSettingsMessage
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
