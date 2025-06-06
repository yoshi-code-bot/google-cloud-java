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
// source: google/cloud/chronicle/v1/reference_list.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.chronicle.v1;

/**
 *
 *
 * <pre>
 * A request to create a reference list.
 * </pre>
 *
 * Protobuf type {@code google.cloud.chronicle.v1.CreateReferenceListRequest}
 */
public final class CreateReferenceListRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.chronicle.v1.CreateReferenceListRequest)
    CreateReferenceListRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateReferenceListRequest.newBuilder() to construct.
  private CreateReferenceListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReferenceListRequest() {
    parent_ = "";
    referenceListId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateReferenceListRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.chronicle.v1.ReferenceListProto
        .internal_static_google_cloud_chronicle_v1_CreateReferenceListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.chronicle.v1.ReferenceListProto
        .internal_static_google_cloud_chronicle_v1_CreateReferenceListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.chronicle.v1.CreateReferenceListRequest.class,
            com.google.cloud.chronicle.v1.CreateReferenceListRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this reference list will be created.
   * Format: `projects/{project}/locations/{location}/instances/{instance}`
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
   * Required. The parent resource where this reference list will be created.
   * Format: `projects/{project}/locations/{location}/instances/{instance}`
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

  public static final int REFERENCE_LIST_FIELD_NUMBER = 2;
  private com.google.cloud.chronicle.v1.ReferenceList referenceList_;

  /**
   *
   *
   * <pre>
   * Required. The reference list to create.
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the referenceList field is set.
   */
  @java.lang.Override
  public boolean hasReferenceList() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The reference list to create.
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The referenceList.
   */
  @java.lang.Override
  public com.google.cloud.chronicle.v1.ReferenceList getReferenceList() {
    return referenceList_ == null
        ? com.google.cloud.chronicle.v1.ReferenceList.getDefaultInstance()
        : referenceList_;
  }

  /**
   *
   *
   * <pre>
   * Required. The reference list to create.
   * </pre>
   *
   * <code>
   * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.chronicle.v1.ReferenceListOrBuilder getReferenceListOrBuilder() {
    return referenceList_ == null
        ? com.google.cloud.chronicle.v1.ReferenceList.getDefaultInstance()
        : referenceList_;
  }

  public static final int REFERENCE_LIST_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceListId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reference list. This is also the display
   * name for the reference list. It must satisfy the following requirements:
   * - Starts with letter.
   * - Contains only letters, numbers and underscore.
   * - Has length less than 256.
   * - Must be unique.
   * </pre>
   *
   * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The referenceListId.
   */
  @java.lang.Override
  public java.lang.String getReferenceListId() {
    java.lang.Object ref = referenceListId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceListId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the reference list. This is also the display
   * name for the reference list. It must satisfy the following requirements:
   * - Starts with letter.
   * - Contains only letters, numbers and underscore.
   * - Has length less than 256.
   * - Must be unique.
   * </pre>
   *
   * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for referenceListId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReferenceListIdBytes() {
    java.lang.Object ref = referenceListId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      referenceListId_ = b;
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
      output.writeMessage(2, getReferenceList());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceListId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, referenceListId_);
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReferenceList());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceListId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, referenceListId_);
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
    if (!(obj instanceof com.google.cloud.chronicle.v1.CreateReferenceListRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.chronicle.v1.CreateReferenceListRequest other =
        (com.google.cloud.chronicle.v1.CreateReferenceListRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReferenceList() != other.hasReferenceList()) return false;
    if (hasReferenceList()) {
      if (!getReferenceList().equals(other.getReferenceList())) return false;
    }
    if (!getReferenceListId().equals(other.getReferenceListId())) return false;
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
    if (hasReferenceList()) {
      hash = (37 * hash) + REFERENCE_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getReferenceList().hashCode();
    }
    hash = (37 * hash) + REFERENCE_LIST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceListId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest parseFrom(
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
      com.google.cloud.chronicle.v1.CreateReferenceListRequest prototype) {
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
   * A request to create a reference list.
   * </pre>
   *
   * Protobuf type {@code google.cloud.chronicle.v1.CreateReferenceListRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.chronicle.v1.CreateReferenceListRequest)
      com.google.cloud.chronicle.v1.CreateReferenceListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.chronicle.v1.ReferenceListProto
          .internal_static_google_cloud_chronicle_v1_CreateReferenceListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.chronicle.v1.ReferenceListProto
          .internal_static_google_cloud_chronicle_v1_CreateReferenceListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.chronicle.v1.CreateReferenceListRequest.class,
              com.google.cloud.chronicle.v1.CreateReferenceListRequest.Builder.class);
    }

    // Construct using com.google.cloud.chronicle.v1.CreateReferenceListRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getReferenceListFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      referenceList_ = null;
      if (referenceListBuilder_ != null) {
        referenceListBuilder_.dispose();
        referenceListBuilder_ = null;
      }
      referenceListId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.chronicle.v1.ReferenceListProto
          .internal_static_google_cloud_chronicle_v1_CreateReferenceListRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.CreateReferenceListRequest getDefaultInstanceForType() {
      return com.google.cloud.chronicle.v1.CreateReferenceListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.CreateReferenceListRequest build() {
      com.google.cloud.chronicle.v1.CreateReferenceListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.chronicle.v1.CreateReferenceListRequest buildPartial() {
      com.google.cloud.chronicle.v1.CreateReferenceListRequest result =
          new com.google.cloud.chronicle.v1.CreateReferenceListRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.chronicle.v1.CreateReferenceListRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.referenceList_ =
            referenceListBuilder_ == null ? referenceList_ : referenceListBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.referenceListId_ = referenceListId_;
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
      if (other instanceof com.google.cloud.chronicle.v1.CreateReferenceListRequest) {
        return mergeFrom((com.google.cloud.chronicle.v1.CreateReferenceListRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.chronicle.v1.CreateReferenceListRequest other) {
      if (other == com.google.cloud.chronicle.v1.CreateReferenceListRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReferenceList()) {
        mergeReferenceList(other.getReferenceList());
      }
      if (!other.getReferenceListId().isEmpty()) {
        referenceListId_ = other.referenceListId_;
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
                input.readMessage(getReferenceListFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                referenceListId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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
     * Required. The parent resource where this reference list will be created.
     * Format: `projects/{project}/locations/{location}/instances/{instance}`
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
     * Required. The parent resource where this reference list will be created.
     * Format: `projects/{project}/locations/{location}/instances/{instance}`
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
     * Required. The parent resource where this reference list will be created.
     * Format: `projects/{project}/locations/{location}/instances/{instance}`
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
     * Required. The parent resource where this reference list will be created.
     * Format: `projects/{project}/locations/{location}/instances/{instance}`
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
     * Required. The parent resource where this reference list will be created.
     * Format: `projects/{project}/locations/{location}/instances/{instance}`
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

    private com.google.cloud.chronicle.v1.ReferenceList referenceList_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.chronicle.v1.ReferenceList,
            com.google.cloud.chronicle.v1.ReferenceList.Builder,
            com.google.cloud.chronicle.v1.ReferenceListOrBuilder>
        referenceListBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the referenceList field is set.
     */
    public boolean hasReferenceList() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The referenceList.
     */
    public com.google.cloud.chronicle.v1.ReferenceList getReferenceList() {
      if (referenceListBuilder_ == null) {
        return referenceList_ == null
            ? com.google.cloud.chronicle.v1.ReferenceList.getDefaultInstance()
            : referenceList_;
      } else {
        return referenceListBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReferenceList(com.google.cloud.chronicle.v1.ReferenceList value) {
      if (referenceListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        referenceList_ = value;
      } else {
        referenceListBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReferenceList(
        com.google.cloud.chronicle.v1.ReferenceList.Builder builderForValue) {
      if (referenceListBuilder_ == null) {
        referenceList_ = builderForValue.build();
      } else {
        referenceListBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReferenceList(com.google.cloud.chronicle.v1.ReferenceList value) {
      if (referenceListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && referenceList_ != null
            && referenceList_ != com.google.cloud.chronicle.v1.ReferenceList.getDefaultInstance()) {
          getReferenceListBuilder().mergeFrom(value);
        } else {
          referenceList_ = value;
        }
      } else {
        referenceListBuilder_.mergeFrom(value);
      }
      if (referenceList_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReferenceList() {
      bitField0_ = (bitField0_ & ~0x00000002);
      referenceList_ = null;
      if (referenceListBuilder_ != null) {
        referenceListBuilder_.dispose();
        referenceListBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.chronicle.v1.ReferenceList.Builder getReferenceListBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReferenceListFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.chronicle.v1.ReferenceListOrBuilder getReferenceListOrBuilder() {
      if (referenceListBuilder_ != null) {
        return referenceListBuilder_.getMessageOrBuilder();
      } else {
        return referenceList_ == null
            ? com.google.cloud.chronicle.v1.ReferenceList.getDefaultInstance()
            : referenceList_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The reference list to create.
     * </pre>
     *
     * <code>
     * .google.cloud.chronicle.v1.ReferenceList reference_list = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.chronicle.v1.ReferenceList,
            com.google.cloud.chronicle.v1.ReferenceList.Builder,
            com.google.cloud.chronicle.v1.ReferenceListOrBuilder>
        getReferenceListFieldBuilder() {
      if (referenceListBuilder_ == null) {
        referenceListBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.chronicle.v1.ReferenceList,
                com.google.cloud.chronicle.v1.ReferenceList.Builder,
                com.google.cloud.chronicle.v1.ReferenceListOrBuilder>(
                getReferenceList(), getParentForChildren(), isClean());
        referenceList_ = null;
      }
      return referenceListBuilder_;
    }

    private java.lang.Object referenceListId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reference list. This is also the display
     * name for the reference list. It must satisfy the following requirements:
     * - Starts with letter.
     * - Contains only letters, numbers and underscore.
     * - Has length less than 256.
     * - Must be unique.
     * </pre>
     *
     * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The referenceListId.
     */
    public java.lang.String getReferenceListId() {
      java.lang.Object ref = referenceListId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceListId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reference list. This is also the display
     * name for the reference list. It must satisfy the following requirements:
     * - Starts with letter.
     * - Contains only letters, numbers and underscore.
     * - Has length less than 256.
     * - Must be unique.
     * </pre>
     *
     * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for referenceListId.
     */
    public com.google.protobuf.ByteString getReferenceListIdBytes() {
      java.lang.Object ref = referenceListId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        referenceListId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reference list. This is also the display
     * name for the reference list. It must satisfy the following requirements:
     * - Starts with letter.
     * - Contains only letters, numbers and underscore.
     * - Has length less than 256.
     * - Must be unique.
     * </pre>
     *
     * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The referenceListId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceListId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      referenceListId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reference list. This is also the display
     * name for the reference list. It must satisfy the following requirements:
     * - Starts with letter.
     * - Contains only letters, numbers and underscore.
     * - Has length less than 256.
     * - Must be unique.
     * </pre>
     *
     * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReferenceListId() {
      referenceListId_ = getDefaultInstance().getReferenceListId();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID to use for the reference list. This is also the display
     * name for the reference list. It must satisfy the following requirements:
     * - Starts with letter.
     * - Contains only letters, numbers and underscore.
     * - Has length less than 256.
     * - Must be unique.
     * </pre>
     *
     * <code>string reference_list_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for referenceListId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceListIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      referenceListId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.chronicle.v1.CreateReferenceListRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.chronicle.v1.CreateReferenceListRequest)
  private static final com.google.cloud.chronicle.v1.CreateReferenceListRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.chronicle.v1.CreateReferenceListRequest();
  }

  public static com.google.cloud.chronicle.v1.CreateReferenceListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReferenceListRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReferenceListRequest>() {
        @java.lang.Override
        public CreateReferenceListRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateReferenceListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReferenceListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.chronicle.v1.CreateReferenceListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
