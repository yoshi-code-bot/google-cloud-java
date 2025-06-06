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
// source: google/cloud/contentwarehouse/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * The user information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.UserInfo}
 */
public final class UserInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.UserInfo)
    UserInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UserInfo.newBuilder() to construct.
  private UserInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserInfo() {
    id_ = "";
    groupIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.CommonProto
        .internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.CommonProto
        .internal_static_google_cloud_contentwarehouse_v1_UserInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.UserInfo.class,
            com.google.cloud.contentwarehouse.v1.UserInfo.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";

  /**
   *
   *
   * <pre>
   * A unique user identification string, as determined by the client.
   * The maximum number of allowed characters is 255.
   * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
   * and restricted special symbols (:, &#64;, +, -, _, ~)
   * The format is "user:xxxx&#64;example.com";
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * A unique user identification string, as determined by the client.
   * The maximum number of allowed characters is 255.
   * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
   * and restricted special symbols (:, &#64;, +, -, _, ~)
   * The format is "user:xxxx&#64;example.com";
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList groupIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The unique group identifications which the user is belong to.
   * The format is "group:yyyy&#64;example.com";
   * </pre>
   *
   * <code>repeated string group_ids = 2;</code>
   *
   * @return A list containing the groupIds.
   */
  public com.google.protobuf.ProtocolStringList getGroupIdsList() {
    return groupIds_;
  }

  /**
   *
   *
   * <pre>
   * The unique group identifications which the user is belong to.
   * The format is "group:yyyy&#64;example.com";
   * </pre>
   *
   * <code>repeated string group_ids = 2;</code>
   *
   * @return The count of groupIds.
   */
  public int getGroupIdsCount() {
    return groupIds_.size();
  }

  /**
   *
   *
   * <pre>
   * The unique group identifications which the user is belong to.
   * The format is "group:yyyy&#64;example.com";
   * </pre>
   *
   * <code>repeated string group_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The groupIds at the given index.
   */
  public java.lang.String getGroupIds(int index) {
    return groupIds_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The unique group identifications which the user is belong to.
   * The format is "group:yyyy&#64;example.com";
   * </pre>
   *
   * <code>repeated string group_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the groupIds at the given index.
   */
  public com.google.protobuf.ByteString getGroupIdsBytes(int index) {
    return groupIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    for (int i = 0; i < groupIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, groupIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < groupIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(groupIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getGroupIdsList().size();
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.UserInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.UserInfo other =
        (com.google.cloud.contentwarehouse.v1.UserInfo) obj;

    if (!getId().equals(other.getId())) return false;
    if (!getGroupIdsList().equals(other.getGroupIdsList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (getGroupIdsCount() > 0) {
      hash = (37 * hash) + GROUP_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getGroupIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.UserInfo prototype) {
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
   * The user information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.UserInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.UserInfo)
      com.google.cloud.contentwarehouse.v1.UserInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UserInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.UserInfo.class,
              com.google.cloud.contentwarehouse.v1.UserInfo.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.UserInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      groupIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UserInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UserInfo getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UserInfo build() {
      com.google.cloud.contentwarehouse.v1.UserInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UserInfo buildPartial() {
      com.google.cloud.contentwarehouse.v1.UserInfo result =
          new com.google.cloud.contentwarehouse.v1.UserInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.UserInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        groupIds_.makeImmutable();
        result.groupIds_ = groupIds_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.UserInfo) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.UserInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.UserInfo other) {
      if (other == com.google.cloud.contentwarehouse.v1.UserInfo.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.groupIds_.isEmpty()) {
        if (groupIds_.isEmpty()) {
          groupIds_ = other.groupIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureGroupIdsIsMutable();
          groupIds_.addAll(other.groupIds_);
        }
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
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureGroupIdsIsMutable();
                groupIds_.add(s);
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

    private java.lang.Object id_ = "";

    /**
     *
     *
     * <pre>
     * A unique user identification string, as determined by the client.
     * The maximum number of allowed characters is 255.
     * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
     * and restricted special symbols (:, &#64;, +, -, _, ~)
     * The format is "user:xxxx&#64;example.com";
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A unique user identification string, as determined by the client.
     * The maximum number of allowed characters is 255.
     * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
     * and restricted special symbols (:, &#64;, +, -, _, ~)
     * The format is "user:xxxx&#64;example.com";
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A unique user identification string, as determined by the client.
     * The maximum number of allowed characters is 255.
     * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
     * and restricted special symbols (:, &#64;, +, -, _, ~)
     * The format is "user:xxxx&#64;example.com";
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A unique user identification string, as determined by the client.
     * The maximum number of allowed characters is 255.
     * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
     * and restricted special symbols (:, &#64;, +, -, _, ~)
     * The format is "user:xxxx&#64;example.com";
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A unique user identification string, as determined by the client.
     * The maximum number of allowed characters is 255.
     * Allowed characters include numbers 0 to 9, uppercase and lowercase letters,
     * and restricted special symbols (:, &#64;, +, -, _, ~)
     * The format is "user:xxxx&#64;example.com";
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList groupIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureGroupIdsIsMutable() {
      if (!groupIds_.isModifiable()) {
        groupIds_ = new com.google.protobuf.LazyStringArrayList(groupIds_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @return A list containing the groupIds.
     */
    public com.google.protobuf.ProtocolStringList getGroupIdsList() {
      groupIds_.makeImmutable();
      return groupIds_;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @return The count of groupIds.
     */
    public int getGroupIdsCount() {
      return groupIds_.size();
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The groupIds at the given index.
     */
    public java.lang.String getGroupIds(int index) {
      return groupIds_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the groupIds at the given index.
     */
    public com.google.protobuf.ByteString getGroupIdsBytes(int index) {
      return groupIds_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The groupIds to set.
     * @return This builder for chaining.
     */
    public Builder setGroupIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupIdsIsMutable();
      groupIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param value The groupIds to add.
     * @return This builder for chaining.
     */
    public Builder addGroupIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGroupIdsIsMutable();
      groupIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param values The groupIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllGroupIds(java.lang.Iterable<java.lang.String> values) {
      ensureGroupIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, groupIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGroupIds() {
      groupIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The unique group identifications which the user is belong to.
     * The format is "group:yyyy&#64;example.com";
     * </pre>
     *
     * <code>repeated string group_ids = 2;</code>
     *
     * @param value The bytes of the groupIds to add.
     * @return This builder for chaining.
     */
    public Builder addGroupIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureGroupIdsIsMutable();
      groupIds_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.UserInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.UserInfo)
  private static final com.google.cloud.contentwarehouse.v1.UserInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.UserInfo();
  }

  public static com.google.cloud.contentwarehouse.v1.UserInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInfo> PARSER =
      new com.google.protobuf.AbstractParser<UserInfo>() {
        @java.lang.Override
        public UserInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UserInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
