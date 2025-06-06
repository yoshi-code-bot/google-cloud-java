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
// source: google/cloud/chronicle/v1/data_access_control.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.chronicle.v1;

/**
 *
 *
 * <pre>
 * Request message for UpdateDataAccessLabel method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.chronicle.v1.UpdateDataAccessLabelRequest}
 */
public final class UpdateDataAccessLabelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)
    UpdateDataAccessLabelRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateDataAccessLabelRequest.newBuilder() to construct.
  private UpdateDataAccessLabelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateDataAccessLabelRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateDataAccessLabelRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.chronicle.v1.DataAccessProto
        .internal_static_google_cloud_chronicle_v1_UpdateDataAccessLabelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.chronicle.v1.DataAccessProto
        .internal_static_google_cloud_chronicle_v1_UpdateDataAccessLabelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.class,
            com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_ACCESS_LABEL_FIELD_NUMBER = 1;
  private com.google.cloud.chronicle.v1.DataAccessLabel dataAccessLabel_;

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataAccessLabel field is set.
   */
  @java.lang.Override
  public boolean hasDataAccessLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataAccessLabel.
   */
  @java.lang.Override
  public com.google.cloud.chronicle.v1.DataAccessLabel getDataAccessLabel() {
    return dataAccessLabel_ == null
        ? com.google.cloud.chronicle.v1.DataAccessLabel.getDefaultInstance()
        : dataAccessLabel_;
  }

  /**
   *
   *
   * <pre>
   * Required. The data access label to update.
   *
   * The label's `name` field is used to identify the label to update.
   * Format:
   * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder getDataAccessLabelOrBuilder() {
    return dataAccessLabel_ == null
        ? com.google.cloud.chronicle.v1.DataAccessLabel.getDefaultInstance()
        : dataAccessLabel_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
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
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
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
   * The list of fields to update. If not included, all fields with a non-empty
   * value will be overwritten. Currently, only the description and definition
   * fields are supported for update; an update call that attempts to update any
   * other fields will return INVALID_ARGUMENT.
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
      output.writeMessage(1, getDataAccessLabel());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataAccessLabel());
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
    if (!(obj instanceof com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest other =
        (com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest) obj;

    if (hasDataAccessLabel() != other.hasDataAccessLabel()) return false;
    if (hasDataAccessLabel()) {
      if (!getDataAccessLabel().equals(other.getDataAccessLabel())) return false;
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
    if (hasDataAccessLabel()) {
      hash = (37 * hash) + DATA_ACCESS_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getDataAccessLabel().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest parseFrom(
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
      com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest prototype) {
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
   * Request message for UpdateDataAccessLabel method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.chronicle.v1.UpdateDataAccessLabelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)
      com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.chronicle.v1.DataAccessProto
          .internal_static_google_cloud_chronicle_v1_UpdateDataAccessLabelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.chronicle.v1.DataAccessProto
          .internal_static_google_cloud_chronicle_v1_UpdateDataAccessLabelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.class,
              com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.Builder.class);
    }

    // Construct using com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataAccessLabelFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataAccessLabel_ = null;
      if (dataAccessLabelBuilder_ != null) {
        dataAccessLabelBuilder_.dispose();
        dataAccessLabelBuilder_ = null;
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
      return com.google.cloud.chronicle.v1.DataAccessProto
          .internal_static_google_cloud_chronicle_v1_UpdateDataAccessLabelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest getDefaultInstanceForType() {
      return com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest build() {
      com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest buildPartial() {
      com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest result =
          new com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataAccessLabel_ =
            dataAccessLabelBuilder_ == null ? dataAccessLabel_ : dataAccessLabelBuilder_.build();
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
      if (other instanceof com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest) {
        return mergeFrom((com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest other) {
      if (other == com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest.getDefaultInstance())
        return this;
      if (other.hasDataAccessLabel()) {
        mergeDataAccessLabel(other.getDataAccessLabel());
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
                input.readMessage(getDataAccessLabelFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.chronicle.v1.DataAccessLabel dataAccessLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.chronicle.v1.DataAccessLabel,
            com.google.cloud.chronicle.v1.DataAccessLabel.Builder,
            com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder>
        dataAccessLabelBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the dataAccessLabel field is set.
     */
    public boolean hasDataAccessLabel() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The dataAccessLabel.
     */
    public com.google.cloud.chronicle.v1.DataAccessLabel getDataAccessLabel() {
      if (dataAccessLabelBuilder_ == null) {
        return dataAccessLabel_ == null
            ? com.google.cloud.chronicle.v1.DataAccessLabel.getDefaultInstance()
            : dataAccessLabel_;
      } else {
        return dataAccessLabelBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataAccessLabel(com.google.cloud.chronicle.v1.DataAccessLabel value) {
      if (dataAccessLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataAccessLabel_ = value;
      } else {
        dataAccessLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setDataAccessLabel(
        com.google.cloud.chronicle.v1.DataAccessLabel.Builder builderForValue) {
      if (dataAccessLabelBuilder_ == null) {
        dataAccessLabel_ = builderForValue.build();
      } else {
        dataAccessLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeDataAccessLabel(com.google.cloud.chronicle.v1.DataAccessLabel value) {
      if (dataAccessLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataAccessLabel_ != null
            && dataAccessLabel_
                != com.google.cloud.chronicle.v1.DataAccessLabel.getDefaultInstance()) {
          getDataAccessLabelBuilder().mergeFrom(value);
        } else {
          dataAccessLabel_ = value;
        }
      } else {
        dataAccessLabelBuilder_.mergeFrom(value);
      }
      if (dataAccessLabel_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearDataAccessLabel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataAccessLabel_ = null;
      if (dataAccessLabelBuilder_ != null) {
        dataAccessLabelBuilder_.dispose();
        dataAccessLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.chronicle.v1.DataAccessLabel.Builder getDataAccessLabelBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataAccessLabelFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder getDataAccessLabelOrBuilder() {
      if (dataAccessLabelBuilder_ != null) {
        return dataAccessLabelBuilder_.getMessageOrBuilder();
      } else {
        return dataAccessLabel_ == null
            ? com.google.cloud.chronicle.v1.DataAccessLabel.getDefaultInstance()
            : dataAccessLabel_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The data access label to update.
     *
     * The label's `name` field is used to identify the label to update.
     * Format:
     * `projects/{project}/locations/{location}/instances/{instance}/dataAccessLabels/{data_access_label}`
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.DataAccessLabel data_access_label = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.chronicle.v1.DataAccessLabel,
            com.google.cloud.chronicle.v1.DataAccessLabel.Builder,
            com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder>
        getDataAccessLabelFieldBuilder() {
      if (dataAccessLabelBuilder_ == null) {
        dataAccessLabelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.chronicle.v1.DataAccessLabel,
                com.google.cloud.chronicle.v1.DataAccessLabel.Builder,
                com.google.cloud.chronicle.v1.DataAccessLabelOrBuilder>(
                getDataAccessLabel(), getParentForChildren(), isClean());
        dataAccessLabel_ = null;
      }
      return dataAccessLabelBuilder_;
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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
     * The list of fields to update. If not included, all fields with a non-empty
     * value will be overwritten. Currently, only the description and definition
     * fields are supported for update; an update call that attempts to update any
     * other fields will return INVALID_ARGUMENT.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.chronicle.v1.UpdateDataAccessLabelRequest)
  private static final com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest();
  }

  public static com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDataAccessLabelRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateDataAccessLabelRequest>() {
        @java.lang.Override
        public UpdateDataAccessLabelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateDataAccessLabelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDataAccessLabelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.chronicle.v1.UpdateDataAccessLabelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
