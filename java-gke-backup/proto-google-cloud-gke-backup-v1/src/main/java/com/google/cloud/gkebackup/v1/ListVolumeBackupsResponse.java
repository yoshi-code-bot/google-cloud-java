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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Response message for ListVolumeBackups.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.ListVolumeBackupsResponse}
 */
public final class ListVolumeBackupsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.ListVolumeBackupsResponse)
    ListVolumeBackupsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListVolumeBackupsResponse.newBuilder() to construct.
  private ListVolumeBackupsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListVolumeBackupsResponse() {
    volumeBackups_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListVolumeBackupsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_ListVolumeBackupsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_ListVolumeBackupsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.class,
            com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.Builder.class);
  }

  public static final int VOLUME_BACKUPS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkebackup.v1.VolumeBackup> volumeBackups_;

  /**
   *
   *
   * <pre>
   * The list of VolumeBackups matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkebackup.v1.VolumeBackup> getVolumeBackupsList() {
    return volumeBackups_;
  }

  /**
   *
   *
   * <pre>
   * The list of VolumeBackups matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder>
      getVolumeBackupsOrBuilderList() {
    return volumeBackups_;
  }

  /**
   *
   *
   * <pre>
   * The list of VolumeBackups matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
   */
  @java.lang.Override
  public int getVolumeBackupsCount() {
    return volumeBackups_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of VolumeBackups matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.VolumeBackup getVolumeBackups(int index) {
    return volumeBackups_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of VolumeBackups matching the given criteria.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder getVolumeBackupsOrBuilder(int index) {
    return volumeBackups_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token which may be sent as
   * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
   * in a subsequent `ListVolumeBackups` call to retrieve the next page of
   * results. If this field is omitted or empty, then there are no more results
   * to return.
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
   * A token which may be sent as
   * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
   * in a subsequent `ListVolumeBackups` call to retrieve the next page of
   * results. If this field is omitted or empty, then there are no more results
   * to return.
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
    for (int i = 0; i < volumeBackups_.size(); i++) {
      output.writeMessage(1, volumeBackups_.get(i));
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
    for (int i = 0; i < volumeBackups_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, volumeBackups_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse other =
        (com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse) obj;

    if (!getVolumeBackupsList().equals(other.getVolumeBackupsList())) return false;
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
    if (getVolumeBackupsCount() > 0) {
      hash = (37 * hash) + VOLUME_BACKUPS_FIELD_NUMBER;
      hash = (53 * hash) + getVolumeBackupsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse parseFrom(
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
      com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse prototype) {
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
   * Response message for ListVolumeBackups.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.ListVolumeBackupsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.ListVolumeBackupsResponse)
      com.google.cloud.gkebackup.v1.ListVolumeBackupsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeBackupsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeBackupsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.class,
              com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (volumeBackupsBuilder_ == null) {
        volumeBackups_ = java.util.Collections.emptyList();
      } else {
        volumeBackups_ = null;
        volumeBackupsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_ListVolumeBackupsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse build() {
      com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse buildPartial() {
      com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse result =
          new com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse result) {
      if (volumeBackupsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          volumeBackups_ = java.util.Collections.unmodifiableList(volumeBackups_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.volumeBackups_ = volumeBackups_;
      } else {
        result.volumeBackups_ = volumeBackupsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse result) {
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
      if (other instanceof com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse) {
        return mergeFrom((com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse other) {
      if (other == com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse.getDefaultInstance())
        return this;
      if (volumeBackupsBuilder_ == null) {
        if (!other.volumeBackups_.isEmpty()) {
          if (volumeBackups_.isEmpty()) {
            volumeBackups_ = other.volumeBackups_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVolumeBackupsIsMutable();
            volumeBackups_.addAll(other.volumeBackups_);
          }
          onChanged();
        }
      } else {
        if (!other.volumeBackups_.isEmpty()) {
          if (volumeBackupsBuilder_.isEmpty()) {
            volumeBackupsBuilder_.dispose();
            volumeBackupsBuilder_ = null;
            volumeBackups_ = other.volumeBackups_;
            bitField0_ = (bitField0_ & ~0x00000001);
            volumeBackupsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVolumeBackupsFieldBuilder()
                    : null;
          } else {
            volumeBackupsBuilder_.addAllMessages(other.volumeBackups_);
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
                com.google.cloud.gkebackup.v1.VolumeBackup m =
                    input.readMessage(
                        com.google.cloud.gkebackup.v1.VolumeBackup.parser(), extensionRegistry);
                if (volumeBackupsBuilder_ == null) {
                  ensureVolumeBackupsIsMutable();
                  volumeBackups_.add(m);
                } else {
                  volumeBackupsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkebackup.v1.VolumeBackup> volumeBackups_ =
        java.util.Collections.emptyList();

    private void ensureVolumeBackupsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        volumeBackups_ =
            new java.util.ArrayList<com.google.cloud.gkebackup.v1.VolumeBackup>(volumeBackups_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.VolumeBackup,
            com.google.cloud.gkebackup.v1.VolumeBackup.Builder,
            com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder>
        volumeBackupsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.VolumeBackup> getVolumeBackupsList() {
      if (volumeBackupsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(volumeBackups_);
      } else {
        return volumeBackupsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public int getVolumeBackupsCount() {
      if (volumeBackupsBuilder_ == null) {
        return volumeBackups_.size();
      } else {
        return volumeBackupsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeBackup getVolumeBackups(int index) {
      if (volumeBackupsBuilder_ == null) {
        return volumeBackups_.get(index);
      } else {
        return volumeBackupsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder setVolumeBackups(int index, com.google.cloud.gkebackup.v1.VolumeBackup value) {
      if (volumeBackupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeBackupsIsMutable();
        volumeBackups_.set(index, value);
        onChanged();
      } else {
        volumeBackupsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder setVolumeBackups(
        int index, com.google.cloud.gkebackup.v1.VolumeBackup.Builder builderForValue) {
      if (volumeBackupsBuilder_ == null) {
        ensureVolumeBackupsIsMutable();
        volumeBackups_.set(index, builderForValue.build());
        onChanged();
      } else {
        volumeBackupsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder addVolumeBackups(com.google.cloud.gkebackup.v1.VolumeBackup value) {
      if (volumeBackupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeBackupsIsMutable();
        volumeBackups_.add(value);
        onChanged();
      } else {
        volumeBackupsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder addVolumeBackups(int index, com.google.cloud.gkebackup.v1.VolumeBackup value) {
      if (volumeBackupsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVolumeBackupsIsMutable();
        volumeBackups_.add(index, value);
        onChanged();
      } else {
        volumeBackupsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder addVolumeBackups(
        com.google.cloud.gkebackup.v1.VolumeBackup.Builder builderForValue) {
      if (volumeBackupsBuilder_ == null) {
        ensureVolumeBackupsIsMutable();
        volumeBackups_.add(builderForValue.build());
        onChanged();
      } else {
        volumeBackupsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder addVolumeBackups(
        int index, com.google.cloud.gkebackup.v1.VolumeBackup.Builder builderForValue) {
      if (volumeBackupsBuilder_ == null) {
        ensureVolumeBackupsIsMutable();
        volumeBackups_.add(index, builderForValue.build());
        onChanged();
      } else {
        volumeBackupsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder addAllVolumeBackups(
        java.lang.Iterable<? extends com.google.cloud.gkebackup.v1.VolumeBackup> values) {
      if (volumeBackupsBuilder_ == null) {
        ensureVolumeBackupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, volumeBackups_);
        onChanged();
      } else {
        volumeBackupsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder clearVolumeBackups() {
      if (volumeBackupsBuilder_ == null) {
        volumeBackups_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        volumeBackupsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public Builder removeVolumeBackups(int index) {
      if (volumeBackupsBuilder_ == null) {
        ensureVolumeBackupsIsMutable();
        volumeBackups_.remove(index);
        onChanged();
      } else {
        volumeBackupsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeBackup.Builder getVolumeBackupsBuilder(int index) {
      return getVolumeBackupsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder getVolumeBackupsOrBuilder(
        int index) {
      if (volumeBackupsBuilder_ == null) {
        return volumeBackups_.get(index);
      } else {
        return volumeBackupsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder>
        getVolumeBackupsOrBuilderList() {
      if (volumeBackupsBuilder_ != null) {
        return volumeBackupsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(volumeBackups_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeBackup.Builder addVolumeBackupsBuilder() {
      return getVolumeBackupsFieldBuilder()
          .addBuilder(com.google.cloud.gkebackup.v1.VolumeBackup.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public com.google.cloud.gkebackup.v1.VolumeBackup.Builder addVolumeBackupsBuilder(int index) {
      return getVolumeBackupsFieldBuilder()
          .addBuilder(index, com.google.cloud.gkebackup.v1.VolumeBackup.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of VolumeBackups matching the given criteria.
     * </pre>
     *
     * <code>repeated .google.cloud.gkebackup.v1.VolumeBackup volume_backups = 1;</code>
     */
    public java.util.List<com.google.cloud.gkebackup.v1.VolumeBackup.Builder>
        getVolumeBackupsBuilderList() {
      return getVolumeBackupsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkebackup.v1.VolumeBackup,
            com.google.cloud.gkebackup.v1.VolumeBackup.Builder,
            com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder>
        getVolumeBackupsFieldBuilder() {
      if (volumeBackupsBuilder_ == null) {
        volumeBackupsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkebackup.v1.VolumeBackup,
                com.google.cloud.gkebackup.v1.VolumeBackup.Builder,
                com.google.cloud.gkebackup.v1.VolumeBackupOrBuilder>(
                volumeBackups_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        volumeBackups_ = null;
      }
      return volumeBackupsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
     * in a subsequent `ListVolumeBackups` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
     * in a subsequent `ListVolumeBackups` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
     * in a subsequent `ListVolumeBackups` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
     * in a subsequent `ListVolumeBackups` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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
     * A token which may be sent as
     * [page_token][google.cloud.gkebackup.v1.ListVolumeBackupsRequest.page_token]
     * in a subsequent `ListVolumeBackups` call to retrieve the next page of
     * results. If this field is omitted or empty, then there are no more results
     * to return.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.ListVolumeBackupsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.ListVolumeBackupsResponse)
  private static final com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse();
  }

  public static com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListVolumeBackupsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListVolumeBackupsResponse>() {
        @java.lang.Override
        public ListVolumeBackupsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListVolumeBackupsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListVolumeBackupsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.ListVolumeBackupsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
