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
// source: google/cloud/modelarmor/v1beta/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.modelarmor.v1beta;

/**
 *
 *
 * <pre>
 * Message for Updating a Floor Setting
 * </pre>
 *
 * Protobuf type {@code google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest}
 */
public final class UpdateFloorSettingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest)
    UpdateFloorSettingRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateFloorSettingRequest.newBuilder() to construct.
  private UpdateFloorSettingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateFloorSettingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateFloorSettingRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.modelarmor.v1beta.V1mainProto
        .internal_static_google_cloud_modelarmor_v1beta_UpdateFloorSettingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.modelarmor.v1beta.V1mainProto
        .internal_static_google_cloud_modelarmor_v1beta_UpdateFloorSettingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.class,
            com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FLOOR_SETTING_FIELD_NUMBER = 1;
  private com.google.cloud.modelarmor.v1beta.FloorSetting floorSetting_;

  /**
   *
   *
   * <pre>
   * Required. The floor setting being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the floorSetting field is set.
   */
  @java.lang.Override
  public boolean hasFloorSetting() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The floor setting being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The floorSetting.
   */
  @java.lang.Override
  public com.google.cloud.modelarmor.v1beta.FloorSetting getFloorSetting() {
    return floorSetting_ == null
        ? com.google.cloud.modelarmor.v1beta.FloorSetting.getDefaultInstance()
        : floorSetting_;
  }

  /**
   *
   *
   * <pre>
   * Required. The floor setting being updated.
   * </pre>
   *
   * <code>
   * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.modelarmor.v1beta.FloorSettingOrBuilder getFloorSettingOrBuilder() {
    return floorSetting_ == null
        ? com.google.cloud.modelarmor.v1beta.FloorSetting.getDefaultInstance()
        : floorSetting_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * FloorSetting resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * FloorSetting resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * FloorSetting resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
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
      output.writeMessage(1, getFloorSetting());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFloorSetting());
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
    if (!(obj instanceof com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest other =
        (com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest) obj;

    if (hasFloorSetting() != other.hasFloorSetting()) return false;
    if (hasFloorSetting()) {
      if (!getFloorSetting().equals(other.getFloorSetting())) return false;
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
    if (hasFloorSetting()) {
      hash = (37 * hash) + FLOOR_SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getFloorSetting().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest parseFrom(
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
      com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest prototype) {
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
   * Message for Updating a Floor Setting
   * </pre>
   *
   * Protobuf type {@code google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest)
      com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.modelarmor.v1beta.V1mainProto
          .internal_static_google_cloud_modelarmor_v1beta_UpdateFloorSettingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.modelarmor.v1beta.V1mainProto
          .internal_static_google_cloud_modelarmor_v1beta_UpdateFloorSettingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.class,
              com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.Builder.class);
    }

    // Construct using com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFloorSettingFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      floorSetting_ = null;
      if (floorSettingBuilder_ != null) {
        floorSettingBuilder_.dispose();
        floorSettingBuilder_ = null;
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
      return com.google.cloud.modelarmor.v1beta.V1mainProto
          .internal_static_google_cloud_modelarmor_v1beta_UpdateFloorSettingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest
        getDefaultInstanceForType() {
      return com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest build() {
      com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest buildPartial() {
      com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest result =
          new com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.floorSetting_ =
            floorSettingBuilder_ == null ? floorSetting_ : floorSettingBuilder_.build();
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
      if (other instanceof com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest) {
        return mergeFrom((com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest other) {
      if (other
          == com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest.getDefaultInstance())
        return this;
      if (other.hasFloorSetting()) {
        mergeFloorSetting(other.getFloorSetting());
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
                input.readMessage(getFloorSettingFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.modelarmor.v1beta.FloorSetting floorSetting_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.modelarmor.v1beta.FloorSetting,
            com.google.cloud.modelarmor.v1beta.FloorSetting.Builder,
            com.google.cloud.modelarmor.v1beta.FloorSettingOrBuilder>
        floorSettingBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the floorSetting field is set.
     */
    public boolean hasFloorSetting() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The floorSetting.
     */
    public com.google.cloud.modelarmor.v1beta.FloorSetting getFloorSetting() {
      if (floorSettingBuilder_ == null) {
        return floorSetting_ == null
            ? com.google.cloud.modelarmor.v1beta.FloorSetting.getDefaultInstance()
            : floorSetting_;
      } else {
        return floorSettingBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFloorSetting(com.google.cloud.modelarmor.v1beta.FloorSetting value) {
      if (floorSettingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        floorSetting_ = value;
      } else {
        floorSettingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFloorSetting(
        com.google.cloud.modelarmor.v1beta.FloorSetting.Builder builderForValue) {
      if (floorSettingBuilder_ == null) {
        floorSetting_ = builderForValue.build();
      } else {
        floorSettingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFloorSetting(com.google.cloud.modelarmor.v1beta.FloorSetting value) {
      if (floorSettingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && floorSetting_ != null
            && floorSetting_
                != com.google.cloud.modelarmor.v1beta.FloorSetting.getDefaultInstance()) {
          getFloorSettingBuilder().mergeFrom(value);
        } else {
          floorSetting_ = value;
        }
      } else {
        floorSettingBuilder_.mergeFrom(value);
      }
      if (floorSetting_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFloorSetting() {
      bitField0_ = (bitField0_ & ~0x00000001);
      floorSetting_ = null;
      if (floorSettingBuilder_ != null) {
        floorSettingBuilder_.dispose();
        floorSettingBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.modelarmor.v1beta.FloorSetting.Builder getFloorSettingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFloorSettingFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.modelarmor.v1beta.FloorSettingOrBuilder getFloorSettingOrBuilder() {
      if (floorSettingBuilder_ != null) {
        return floorSettingBuilder_.getMessageOrBuilder();
      } else {
        return floorSetting_ == null
            ? com.google.cloud.modelarmor.v1beta.FloorSetting.getDefaultInstance()
            : floorSetting_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The floor setting being updated.
     * </pre>
     *
     * <code>
     * .google.cloud.modelarmor.v1beta.FloorSetting floor_setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.modelarmor.v1beta.FloorSetting,
            com.google.cloud.modelarmor.v1beta.FloorSetting.Builder,
            com.google.cloud.modelarmor.v1beta.FloorSettingOrBuilder>
        getFloorSettingFieldBuilder() {
      if (floorSettingBuilder_ == null) {
        floorSettingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.modelarmor.v1beta.FloorSetting,
                com.google.cloud.modelarmor.v1beta.FloorSetting.Builder,
                com.google.cloud.modelarmor.v1beta.FloorSettingOrBuilder>(
                getFloorSetting(), getParentForChildren(), isClean());
        floorSetting_ = null;
      }
      return floorSettingBuilder_;
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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
     * Optional. Field mask is used to specify the fields to be overwritten in the
     * FloorSetting resource by the update.
     * The fields specified in the update_mask are relative to the resource, not
     * the full request. A field will be overwritten if it is in the mask. If the
     * user does not provide a mask then all fields will be overwritten.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest)
  private static final com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest();
  }

  public static com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFloorSettingRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateFloorSettingRequest>() {
        @java.lang.Override
        public UpdateFloorSettingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateFloorSettingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFloorSettingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.modelarmor.v1beta.UpdateFloorSettingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
