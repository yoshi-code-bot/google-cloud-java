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
// source: google/cloud/discoveryengine/v1beta/control_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Request for UpdateControl method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.UpdateControlRequest}
 */
public final class UpdateControlRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.UpdateControlRequest)
    UpdateControlRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateControlRequest.newBuilder() to construct.
  private UpdateControlRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateControlRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateControlRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.ControlServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_UpdateControlRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.ControlServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_UpdateControlRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.class,
            com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CONTROL_FIELD_NUMBER = 1;
  private com.google.cloud.discoveryengine.v1beta.Control control_;

  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the control field is set.
   */
  @java.lang.Override
  public boolean hasControl() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The control.
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.Control getControl() {
    return control_ == null
        ? com.google.cloud.discoveryengine.v1beta.Control.getDefaultInstance()
        : control_;
  }

  /**
   *
   *
   * <pre>
   * Required. The Control to update.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.ControlOrBuilder getControlOrBuilder() {
    return control_ == null
        ? com.google.cloud.discoveryengine.v1beta.Control.getDefaultInstance()
        : control_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Optional. Indicates which fields in the provided
   * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
   * following are NOT supported:
   *
   * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
   * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
   *
   * If not set or empty, all supported fields are updated.
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
   * Optional. Indicates which fields in the provided
   * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
   * following are NOT supported:
   *
   * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
   * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
   *
   * If not set or empty, all supported fields are updated.
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
   * Optional. Indicates which fields in the provided
   * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
   * following are NOT supported:
   *
   * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
   * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
   *
   * If not set or empty, all supported fields are updated.
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
      output.writeMessage(1, getControl());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getControl());
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.UpdateControlRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.UpdateControlRequest other =
        (com.google.cloud.discoveryengine.v1beta.UpdateControlRequest) obj;

    if (hasControl() != other.hasControl()) return false;
    if (hasControl()) {
      if (!getControl().equals(other.getControl())) return false;
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
    if (hasControl()) {
      hash = (37 * hash) + CONTROL_FIELD_NUMBER;
      hash = (53 * hash) + getControl().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.UpdateControlRequest prototype) {
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
   * Request for UpdateControl method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.UpdateControlRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.UpdateControlRequest)
      com.google.cloud.discoveryengine.v1beta.UpdateControlRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.ControlServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateControlRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.ControlServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateControlRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.class,
              com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getControlFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      control_ = null;
      if (controlBuilder_ != null) {
        controlBuilder_.dispose();
        controlBuilder_ = null;
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
      return com.google.cloud.discoveryengine.v1beta.ControlServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_UpdateControlRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateControlRequest
        getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateControlRequest build() {
      com.google.cloud.discoveryengine.v1beta.UpdateControlRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.UpdateControlRequest buildPartial() {
      com.google.cloud.discoveryengine.v1beta.UpdateControlRequest result =
          new com.google.cloud.discoveryengine.v1beta.UpdateControlRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.discoveryengine.v1beta.UpdateControlRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.control_ = controlBuilder_ == null ? control_ : controlBuilder_.build();
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.UpdateControlRequest) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.UpdateControlRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.UpdateControlRequest other) {
      if (other
          == com.google.cloud.discoveryengine.v1beta.UpdateControlRequest.getDefaultInstance())
        return this;
      if (other.hasControl()) {
        mergeControl(other.getControl());
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
                input.readMessage(getControlFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.discoveryengine.v1beta.Control control_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.Control,
            com.google.cloud.discoveryengine.v1beta.Control.Builder,
            com.google.cloud.discoveryengine.v1beta.ControlOrBuilder>
        controlBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the control field is set.
     */
    public boolean hasControl() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The control.
     */
    public com.google.cloud.discoveryengine.v1beta.Control getControl() {
      if (controlBuilder_ == null) {
        return control_ == null
            ? com.google.cloud.discoveryengine.v1beta.Control.getDefaultInstance()
            : control_;
      } else {
        return controlBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setControl(com.google.cloud.discoveryengine.v1beta.Control value) {
      if (controlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        control_ = value;
      } else {
        controlBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setControl(
        com.google.cloud.discoveryengine.v1beta.Control.Builder builderForValue) {
      if (controlBuilder_ == null) {
        control_ = builderForValue.build();
      } else {
        controlBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeControl(com.google.cloud.discoveryengine.v1beta.Control value) {
      if (controlBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && control_ != null
            && control_ != com.google.cloud.discoveryengine.v1beta.Control.getDefaultInstance()) {
          getControlBuilder().mergeFrom(value);
        } else {
          control_ = value;
        }
      } else {
        controlBuilder_.mergeFrom(value);
      }
      if (control_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearControl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      control_ = null;
      if (controlBuilder_ != null) {
        controlBuilder_.dispose();
        controlBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1beta.Control.Builder getControlBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getControlFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.discoveryengine.v1beta.ControlOrBuilder getControlOrBuilder() {
      if (controlBuilder_ != null) {
        return controlBuilder_.getMessageOrBuilder();
      } else {
        return control_ == null
            ? com.google.cloud.discoveryengine.v1beta.Control.getDefaultInstance()
            : control_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The Control to update.
     * </pre>
     *
     * <code>
     * .google.cloud.discoveryengine.v1beta.Control control = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.discoveryengine.v1beta.Control,
            com.google.cloud.discoveryengine.v1beta.Control.Builder,
            com.google.cloud.discoveryengine.v1beta.ControlOrBuilder>
        getControlFieldBuilder() {
      if (controlBuilder_ == null) {
        controlBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.discoveryengine.v1beta.Control,
                com.google.cloud.discoveryengine.v1beta.Control.Builder,
                com.google.cloud.discoveryengine.v1beta.ControlOrBuilder>(
                getControl(), getParentForChildren(), isClean());
        control_ = null;
      }
      return controlBuilder_;
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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
     * Optional. Indicates which fields in the provided
     * [Control][google.cloud.discoveryengine.v1beta.Control] to update. The
     * following are NOT supported:
     *
     * * [Control.name][google.cloud.discoveryengine.v1beta.Control.name]
     * * [Control.solution_type][google.cloud.discoveryengine.v1beta.Control.solution_type]
     *
     * If not set or empty, all supported fields are updated.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.UpdateControlRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.UpdateControlRequest)
  private static final com.google.cloud.discoveryengine.v1beta.UpdateControlRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.UpdateControlRequest();
  }

  public static com.google.cloud.discoveryengine.v1beta.UpdateControlRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateControlRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateControlRequest>() {
        @java.lang.Override
        public UpdateControlRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateControlRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateControlRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.UpdateControlRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
