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
// source: google/cloud/resourcemanager/v3/tag_keys.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The request message for updating a TagKey.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateTagKeyRequest}
 */
public final class UpdateTagKeyRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.UpdateTagKeyRequest)
    UpdateTagKeyRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateTagKeyRequest.newBuilder() to construct.
  private UpdateTagKeyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTagKeyRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTagKeyRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.TagKeysProto
        .internal_static_google_cloud_resourcemanager_v3_UpdateTagKeyRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.TagKeysProto
        .internal_static_google_cloud_resourcemanager_v3_UpdateTagKeyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.class,
            com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TAG_KEY_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.TagKey tagKey_;

  /**
   *
   *
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and
   * `etag` fields can be updated by this request. If the `etag` field is not
   * empty, it must match the `etag` field of the existing tag key. Otherwise,
   * `ABORTED` will be returned.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tagKey field is set.
   */
  @java.lang.Override
  public boolean hasTagKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and
   * `etag` fields can be updated by this request. If the `etag` field is not
   * empty, it must match the `etag` field of the existing tag key. Otherwise,
   * `ABORTED` will be returned.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tagKey.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagKey getTagKey() {
    return tagKey_ == null
        ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
        : tagKey_;
  }

  /**
   *
   *
   * <pre>
   * Required. The new definition of the TagKey. Only the `description` and
   * `etag` fields can be updated by this request. If the `etag` field is not
   * empty, it must match the `etag` field of the existing tag key. Otherwise,
   * `ABORTED` will be returned.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.TagKeyOrBuilder getTagKeyOrBuilder() {
    return tagKey_ == null
        ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
        : tagKey_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
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
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
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
   * Fields to be updated. The mask may only contain `description` or
   * `etag`. If omitted entirely, both `description` and `etag` are assumed to
   * be significant.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_ = false;

  /**
   *
   *
   * <pre>
   * Set as true to perform validations necessary for updating the resource, but
   * not actually perform the action.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
      output.writeMessage(1, getTagKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTagKey());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest other =
        (com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest) obj;

    if (hasTagKey() != other.hasTagKey()) return false;
    if (hasTagKey()) {
      if (!getTagKey().equals(other.getTagKey())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
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
    if (hasTagKey()) {
      hash = (37 * hash) + TAG_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getTagKey().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest parseFrom(
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
      com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest prototype) {
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
   * The request message for updating a TagKey.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateTagKeyRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.UpdateTagKeyRequest)
      com.google.cloud.resourcemanager.v3.UpdateTagKeyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateTagKeyRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateTagKeyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.class,
              com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTagKeyFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tagKey_ = null;
      if (tagKeyBuilder_ != null) {
        tagKeyBuilder_.dispose();
        tagKeyBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.TagKeysProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateTagKeyRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest build() {
      com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest result =
          new com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tagKey_ = tagKeyBuilder_ == null ? tagKey_ : tagKeyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest.getDefaultInstance())
        return this;
      if (other.hasTagKey()) {
        mergeTagKey(other.getTagKey());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
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
                input.readMessage(getTagKeyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private com.google.cloud.resourcemanager.v3.TagKey tagKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagKey,
            com.google.cloud.resourcemanager.v3.TagKey.Builder,
            com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>
        tagKeyBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the tagKey field is set.
     */
    public boolean hasTagKey() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The tagKey.
     */
    public com.google.cloud.resourcemanager.v3.TagKey getTagKey() {
      if (tagKeyBuilder_ == null) {
        return tagKey_ == null
            ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
            : tagKey_;
      } else {
        return tagKeyBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagKey(com.google.cloud.resourcemanager.v3.TagKey value) {
      if (tagKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tagKey_ = value;
      } else {
        tagKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTagKey(com.google.cloud.resourcemanager.v3.TagKey.Builder builderForValue) {
      if (tagKeyBuilder_ == null) {
        tagKey_ = builderForValue.build();
      } else {
        tagKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTagKey(com.google.cloud.resourcemanager.v3.TagKey value) {
      if (tagKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && tagKey_ != null
            && tagKey_ != com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()) {
          getTagKeyBuilder().mergeFrom(value);
        } else {
          tagKey_ = value;
        }
      } else {
        tagKeyBuilder_.mergeFrom(value);
      }
      if (tagKey_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTagKey() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tagKey_ = null;
      if (tagKeyBuilder_ != null) {
        tagKeyBuilder_.dispose();
        tagKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagKey.Builder getTagKeyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTagKeyFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.TagKeyOrBuilder getTagKeyOrBuilder() {
      if (tagKeyBuilder_ != null) {
        return tagKeyBuilder_.getMessageOrBuilder();
      } else {
        return tagKey_ == null
            ? com.google.cloud.resourcemanager.v3.TagKey.getDefaultInstance()
            : tagKey_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The new definition of the TagKey. Only the `description` and
     * `etag` fields can be updated by this request. If the `etag` field is not
     * empty, it must match the `etag` field of the existing tag key. Otherwise,
     * `ABORTED` will be returned.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.TagKey tag_key = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.TagKey,
            com.google.cloud.resourcemanager.v3.TagKey.Builder,
            com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>
        getTagKeyFieldBuilder() {
      if (tagKeyBuilder_ == null) {
        tagKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.TagKey,
                com.google.cloud.resourcemanager.v3.TagKey.Builder,
                com.google.cloud.resourcemanager.v3.TagKeyOrBuilder>(
                getTagKey(), getParentForChildren(), isClean());
        tagKey_ = null;
      }
      return tagKeyBuilder_;
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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
     * Fields to be updated. The mask may only contain `description` or
     * `etag`. If omitted entirely, both `description` and `etag` are assumed to
     * be significant.
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

    private boolean validateOnly_;

    /**
     *
     *
     * <pre>
     * Set as true to perform validations necessary for updating the resource, but
     * not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }

    /**
     *
     *
     * <pre>
     * Set as true to perform validations necessary for updating the resource, but
     * not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Set as true to perform validations necessary for updating the resource, but
     * not actually perform the action.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000004);
      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.UpdateTagKeyRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.UpdateTagKeyRequest)
  private static final com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest();
  }

  public static com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTagKeyRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTagKeyRequest>() {
        @java.lang.Override
        public UpdateTagKeyRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTagKeyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTagKeyRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.UpdateTagKeyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
