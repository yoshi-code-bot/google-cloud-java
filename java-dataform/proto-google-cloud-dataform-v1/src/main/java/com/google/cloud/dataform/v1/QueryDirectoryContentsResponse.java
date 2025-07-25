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
// source: google/cloud/dataform/v1/dataform.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataform.v1;

/**
 *
 *
 * <pre>
 * `QueryDirectoryContents` response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1.QueryDirectoryContentsResponse}
 */
public final class QueryDirectoryContentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1.QueryDirectoryContentsResponse)
    QueryDirectoryContentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use QueryDirectoryContentsResponse.newBuilder() to construct.
  private QueryDirectoryContentsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryDirectoryContentsResponse() {
    directoryEntries_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryDirectoryContentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1.DataformProto
        .internal_static_google_cloud_dataform_v1_QueryDirectoryContentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1.DataformProto
        .internal_static_google_cloud_dataform_v1_QueryDirectoryContentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.class,
            com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.Builder.class);
  }

  public static final int DIRECTORY_ENTRIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dataform.v1.DirectoryEntry> directoryEntries_;

  /**
   *
   *
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dataform.v1.DirectoryEntry> getDirectoryEntriesList() {
    return directoryEntries_;
  }

  /**
   *
   *
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dataform.v1.DirectoryEntryOrBuilder>
      getDirectoryEntriesOrBuilderList() {
    return directoryEntries_;
  }

  /**
   *
   *
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
   */
  @java.lang.Override
  public int getDirectoryEntriesCount() {
    return directoryEntries_.size();
  }

  /**
   *
   *
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.DirectoryEntry getDirectoryEntries(int index) {
    return directoryEntries_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of entries in the directory.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.DirectoryEntryOrBuilder getDirectoryEntriesOrBuilder(
      int index) {
    return directoryEntries_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < directoryEntries_.size(); i++) {
      output.writeMessage(1, directoryEntries_.get(i));
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
    for (int i = 0; i < directoryEntries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, directoryEntries_.get(i));
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
    if (!(obj instanceof com.google.cloud.dataform.v1.QueryDirectoryContentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1.QueryDirectoryContentsResponse other =
        (com.google.cloud.dataform.v1.QueryDirectoryContentsResponse) obj;

    if (!getDirectoryEntriesList().equals(other.getDirectoryEntriesList())) return false;
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
    if (getDirectoryEntriesCount() > 0) {
      hash = (37 * hash) + DIRECTORY_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getDirectoryEntriesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse parseFrom(
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
      com.google.cloud.dataform.v1.QueryDirectoryContentsResponse prototype) {
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
   * `QueryDirectoryContents` response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1.QueryDirectoryContentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1.QueryDirectoryContentsResponse)
      com.google.cloud.dataform.v1.QueryDirectoryContentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_QueryDirectoryContentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_QueryDirectoryContentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.class,
              com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (directoryEntriesBuilder_ == null) {
        directoryEntries_ = java.util.Collections.emptyList();
      } else {
        directoryEntries_ = null;
        directoryEntriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_QueryDirectoryContentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.QueryDirectoryContentsResponse getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.QueryDirectoryContentsResponse build() {
      com.google.cloud.dataform.v1.QueryDirectoryContentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.QueryDirectoryContentsResponse buildPartial() {
      com.google.cloud.dataform.v1.QueryDirectoryContentsResponse result =
          new com.google.cloud.dataform.v1.QueryDirectoryContentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.dataform.v1.QueryDirectoryContentsResponse result) {
      if (directoryEntriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          directoryEntries_ = java.util.Collections.unmodifiableList(directoryEntries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.directoryEntries_ = directoryEntries_;
      } else {
        result.directoryEntries_ = directoryEntriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dataform.v1.QueryDirectoryContentsResponse result) {
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
      if (other instanceof com.google.cloud.dataform.v1.QueryDirectoryContentsResponse) {
        return mergeFrom((com.google.cloud.dataform.v1.QueryDirectoryContentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1.QueryDirectoryContentsResponse other) {
      if (other == com.google.cloud.dataform.v1.QueryDirectoryContentsResponse.getDefaultInstance())
        return this;
      if (directoryEntriesBuilder_ == null) {
        if (!other.directoryEntries_.isEmpty()) {
          if (directoryEntries_.isEmpty()) {
            directoryEntries_ = other.directoryEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDirectoryEntriesIsMutable();
            directoryEntries_.addAll(other.directoryEntries_);
          }
          onChanged();
        }
      } else {
        if (!other.directoryEntries_.isEmpty()) {
          if (directoryEntriesBuilder_.isEmpty()) {
            directoryEntriesBuilder_.dispose();
            directoryEntriesBuilder_ = null;
            directoryEntries_ = other.directoryEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            directoryEntriesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDirectoryEntriesFieldBuilder()
                    : null;
          } else {
            directoryEntriesBuilder_.addAllMessages(other.directoryEntries_);
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
                com.google.cloud.dataform.v1.DirectoryEntry m =
                    input.readMessage(
                        com.google.cloud.dataform.v1.DirectoryEntry.parser(), extensionRegistry);
                if (directoryEntriesBuilder_ == null) {
                  ensureDirectoryEntriesIsMutable();
                  directoryEntries_.add(m);
                } else {
                  directoryEntriesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.dataform.v1.DirectoryEntry> directoryEntries_ =
        java.util.Collections.emptyList();

    private void ensureDirectoryEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        directoryEntries_ =
            new java.util.ArrayList<com.google.cloud.dataform.v1.DirectoryEntry>(directoryEntries_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataform.v1.DirectoryEntry,
            com.google.cloud.dataform.v1.DirectoryEntry.Builder,
            com.google.cloud.dataform.v1.DirectoryEntryOrBuilder>
        directoryEntriesBuilder_;

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public java.util.List<com.google.cloud.dataform.v1.DirectoryEntry> getDirectoryEntriesList() {
      if (directoryEntriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(directoryEntries_);
      } else {
        return directoryEntriesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public int getDirectoryEntriesCount() {
      if (directoryEntriesBuilder_ == null) {
        return directoryEntries_.size();
      } else {
        return directoryEntriesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public com.google.cloud.dataform.v1.DirectoryEntry getDirectoryEntries(int index) {
      if (directoryEntriesBuilder_ == null) {
        return directoryEntries_.get(index);
      } else {
        return directoryEntriesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder setDirectoryEntries(
        int index, com.google.cloud.dataform.v1.DirectoryEntry value) {
      if (directoryEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.set(index, value);
        onChanged();
      } else {
        directoryEntriesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder setDirectoryEntries(
        int index, com.google.cloud.dataform.v1.DirectoryEntry.Builder builderForValue) {
      if (directoryEntriesBuilder_ == null) {
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.set(index, builderForValue.build());
        onChanged();
      } else {
        directoryEntriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder addDirectoryEntries(com.google.cloud.dataform.v1.DirectoryEntry value) {
      if (directoryEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.add(value);
        onChanged();
      } else {
        directoryEntriesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder addDirectoryEntries(
        int index, com.google.cloud.dataform.v1.DirectoryEntry value) {
      if (directoryEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.add(index, value);
        onChanged();
      } else {
        directoryEntriesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder addDirectoryEntries(
        com.google.cloud.dataform.v1.DirectoryEntry.Builder builderForValue) {
      if (directoryEntriesBuilder_ == null) {
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.add(builderForValue.build());
        onChanged();
      } else {
        directoryEntriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder addDirectoryEntries(
        int index, com.google.cloud.dataform.v1.DirectoryEntry.Builder builderForValue) {
      if (directoryEntriesBuilder_ == null) {
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.add(index, builderForValue.build());
        onChanged();
      } else {
        directoryEntriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder addAllDirectoryEntries(
        java.lang.Iterable<? extends com.google.cloud.dataform.v1.DirectoryEntry> values) {
      if (directoryEntriesBuilder_ == null) {
        ensureDirectoryEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, directoryEntries_);
        onChanged();
      } else {
        directoryEntriesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder clearDirectoryEntries() {
      if (directoryEntriesBuilder_ == null) {
        directoryEntries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        directoryEntriesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public Builder removeDirectoryEntries(int index) {
      if (directoryEntriesBuilder_ == null) {
        ensureDirectoryEntriesIsMutable();
        directoryEntries_.remove(index);
        onChanged();
      } else {
        directoryEntriesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public com.google.cloud.dataform.v1.DirectoryEntry.Builder getDirectoryEntriesBuilder(
        int index) {
      return getDirectoryEntriesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public com.google.cloud.dataform.v1.DirectoryEntryOrBuilder getDirectoryEntriesOrBuilder(
        int index) {
      if (directoryEntriesBuilder_ == null) {
        return directoryEntries_.get(index);
      } else {
        return directoryEntriesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dataform.v1.DirectoryEntryOrBuilder>
        getDirectoryEntriesOrBuilderList() {
      if (directoryEntriesBuilder_ != null) {
        return directoryEntriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(directoryEntries_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public com.google.cloud.dataform.v1.DirectoryEntry.Builder addDirectoryEntriesBuilder() {
      return getDirectoryEntriesFieldBuilder()
          .addBuilder(com.google.cloud.dataform.v1.DirectoryEntry.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public com.google.cloud.dataform.v1.DirectoryEntry.Builder addDirectoryEntriesBuilder(
        int index) {
      return getDirectoryEntriesFieldBuilder()
          .addBuilder(index, com.google.cloud.dataform.v1.DirectoryEntry.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of entries in the directory.
     * </pre>
     *
     * <code>repeated .google.cloud.dataform.v1.DirectoryEntry directory_entries = 1;</code>
     */
    public java.util.List<com.google.cloud.dataform.v1.DirectoryEntry.Builder>
        getDirectoryEntriesBuilderList() {
      return getDirectoryEntriesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dataform.v1.DirectoryEntry,
            com.google.cloud.dataform.v1.DirectoryEntry.Builder,
            com.google.cloud.dataform.v1.DirectoryEntryOrBuilder>
        getDirectoryEntriesFieldBuilder() {
      if (directoryEntriesBuilder_ == null) {
        directoryEntriesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dataform.v1.DirectoryEntry,
                com.google.cloud.dataform.v1.DirectoryEntry.Builder,
                com.google.cloud.dataform.v1.DirectoryEntryOrBuilder>(
                directoryEntries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        directoryEntries_ = null;
      }
      return directoryEntriesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1.QueryDirectoryContentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1.QueryDirectoryContentsResponse)
  private static final com.google.cloud.dataform.v1.QueryDirectoryContentsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1.QueryDirectoryContentsResponse();
  }

  public static com.google.cloud.dataform.v1.QueryDirectoryContentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDirectoryContentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<QueryDirectoryContentsResponse>() {
        @java.lang.Override
        public QueryDirectoryContentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDirectoryContentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDirectoryContentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1.QueryDirectoryContentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
