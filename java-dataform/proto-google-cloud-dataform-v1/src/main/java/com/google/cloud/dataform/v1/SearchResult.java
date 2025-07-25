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
 * Client-facing representation of a search result entry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataform.v1.SearchResult}
 */
public final class SearchResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataform.v1.SearchResult)
    SearchResultOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchResult.newBuilder() to construct.
  private SearchResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dataform.v1.DataformProto
        .internal_static_google_cloud_dataform_v1_SearchResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataform.v1.DataformProto
        .internal_static_google_cloud_dataform_v1_SearchResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataform.v1.SearchResult.class,
            com.google.cloud.dataform.v1.SearchResult.Builder.class);
  }

  private int entryCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object entry_;

  public enum EntryCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FILE(1),
    DIRECTORY(2),
    ENTRY_NOT_SET(0);
    private final int value;

    private EntryCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EntryCase valueOf(int value) {
      return forNumber(value);
    }

    public static EntryCase forNumber(int value) {
      switch (value) {
        case 1:
          return FILE;
        case 2:
          return DIRECTORY;
        case 0:
          return ENTRY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public EntryCase getEntryCase() {
    return EntryCase.forNumber(entryCase_);
  }

  public static final int FILE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Details when search result is a file.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
   *
   * @return Whether the file field is set.
   */
  @java.lang.Override
  public boolean hasFile() {
    return entryCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Details when search result is a file.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
   *
   * @return The file.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.FileSearchResult getFile() {
    if (entryCase_ == 1) {
      return (com.google.cloud.dataform.v1.FileSearchResult) entry_;
    }
    return com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Details when search result is a file.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.FileSearchResultOrBuilder getFileOrBuilder() {
    if (entryCase_ == 1) {
      return (com.google.cloud.dataform.v1.FileSearchResult) entry_;
    }
    return com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
  }

  public static final int DIRECTORY_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Details when search result is a directory.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
   *
   * @return Whether the directory field is set.
   */
  @java.lang.Override
  public boolean hasDirectory() {
    return entryCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Details when search result is a directory.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
   *
   * @return The directory.
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.DirectorySearchResult getDirectory() {
    if (entryCase_ == 2) {
      return (com.google.cloud.dataform.v1.DirectorySearchResult) entry_;
    }
    return com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Details when search result is a directory.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.dataform.v1.DirectorySearchResultOrBuilder getDirectoryOrBuilder() {
    if (entryCase_ == 2) {
      return (com.google.cloud.dataform.v1.DirectorySearchResult) entry_;
    }
    return com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
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
    if (entryCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.dataform.v1.FileSearchResult) entry_);
    }
    if (entryCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.dataform.v1.DirectorySearchResult) entry_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entryCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.dataform.v1.FileSearchResult) entry_);
    }
    if (entryCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.dataform.v1.DirectorySearchResult) entry_);
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
    if (!(obj instanceof com.google.cloud.dataform.v1.SearchResult)) {
      return super.equals(obj);
    }
    com.google.cloud.dataform.v1.SearchResult other =
        (com.google.cloud.dataform.v1.SearchResult) obj;

    if (!getEntryCase().equals(other.getEntryCase())) return false;
    switch (entryCase_) {
      case 1:
        if (!getFile().equals(other.getFile())) return false;
        break;
      case 2:
        if (!getDirectory().equals(other.getDirectory())) return false;
        break;
      case 0:
      default:
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
    switch (entryCase_) {
      case 1:
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DIRECTORY_FIELD_NUMBER;
        hash = (53 * hash) + getDirectory().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataform.v1.SearchResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dataform.v1.SearchResult prototype) {
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
   * Client-facing representation of a search result entry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataform.v1.SearchResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataform.v1.SearchResult)
      com.google.cloud.dataform.v1.SearchResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_SearchResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_SearchResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataform.v1.SearchResult.class,
              com.google.cloud.dataform.v1.SearchResult.Builder.class);
    }

    // Construct using com.google.cloud.dataform.v1.SearchResult.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (fileBuilder_ != null) {
        fileBuilder_.clear();
      }
      if (directoryBuilder_ != null) {
        directoryBuilder_.clear();
      }
      entryCase_ = 0;
      entry_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dataform.v1.DataformProto
          .internal_static_google_cloud_dataform_v1_SearchResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.SearchResult getDefaultInstanceForType() {
      return com.google.cloud.dataform.v1.SearchResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.SearchResult build() {
      com.google.cloud.dataform.v1.SearchResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataform.v1.SearchResult buildPartial() {
      com.google.cloud.dataform.v1.SearchResult result =
          new com.google.cloud.dataform.v1.SearchResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataform.v1.SearchResult result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.dataform.v1.SearchResult result) {
      result.entryCase_ = entryCase_;
      result.entry_ = this.entry_;
      if (entryCase_ == 1 && fileBuilder_ != null) {
        result.entry_ = fileBuilder_.build();
      }
      if (entryCase_ == 2 && directoryBuilder_ != null) {
        result.entry_ = directoryBuilder_.build();
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
      if (other instanceof com.google.cloud.dataform.v1.SearchResult) {
        return mergeFrom((com.google.cloud.dataform.v1.SearchResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataform.v1.SearchResult other) {
      if (other == com.google.cloud.dataform.v1.SearchResult.getDefaultInstance()) return this;
      switch (other.getEntryCase()) {
        case FILE:
          {
            mergeFile(other.getFile());
            break;
          }
        case DIRECTORY:
          {
            mergeDirectory(other.getDirectory());
            break;
          }
        case ENTRY_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getFileFieldBuilder().getBuilder(), extensionRegistry);
                entryCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getDirectoryFieldBuilder().getBuilder(), extensionRegistry);
                entryCase_ = 2;
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

    private int entryCase_ = 0;
    private java.lang.Object entry_;

    public EntryCase getEntryCase() {
      return EntryCase.forNumber(entryCase_);
    }

    public Builder clearEntry() {
      entryCase_ = 0;
      entry_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1.FileSearchResult,
            com.google.cloud.dataform.v1.FileSearchResult.Builder,
            com.google.cloud.dataform.v1.FileSearchResultOrBuilder>
        fileBuilder_;

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     *
     * @return Whether the file field is set.
     */
    @java.lang.Override
    public boolean hasFile() {
      return entryCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     *
     * @return The file.
     */
    @java.lang.Override
    public com.google.cloud.dataform.v1.FileSearchResult getFile() {
      if (fileBuilder_ == null) {
        if (entryCase_ == 1) {
          return (com.google.cloud.dataform.v1.FileSearchResult) entry_;
        }
        return com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
      } else {
        if (entryCase_ == 1) {
          return fileBuilder_.getMessage();
        }
        return com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    public Builder setFile(com.google.cloud.dataform.v1.FileSearchResult value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }
      entryCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    public Builder setFile(com.google.cloud.dataform.v1.FileSearchResult.Builder builderForValue) {
      if (fileBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      entryCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    public Builder mergeFile(com.google.cloud.dataform.v1.FileSearchResult value) {
      if (fileBuilder_ == null) {
        if (entryCase_ == 1
            && entry_ != com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance()) {
          entry_ =
              com.google.cloud.dataform.v1.FileSearchResult.newBuilder(
                      (com.google.cloud.dataform.v1.FileSearchResult) entry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        if (entryCase_ == 1) {
          fileBuilder_.mergeFrom(value);
        } else {
          fileBuilder_.setMessage(value);
        }
      }
      entryCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        if (entryCase_ == 1) {
          entryCase_ = 0;
          entry_ = null;
          onChanged();
        }
      } else {
        if (entryCase_ == 1) {
          entryCase_ = 0;
          entry_ = null;
        }
        fileBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    public com.google.cloud.dataform.v1.FileSearchResult.Builder getFileBuilder() {
      return getFileFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.dataform.v1.FileSearchResultOrBuilder getFileOrBuilder() {
      if ((entryCase_ == 1) && (fileBuilder_ != null)) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        if (entryCase_ == 1) {
          return (com.google.cloud.dataform.v1.FileSearchResult) entry_;
        }
        return com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a file.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.FileSearchResult file = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1.FileSearchResult,
            com.google.cloud.dataform.v1.FileSearchResult.Builder,
            com.google.cloud.dataform.v1.FileSearchResultOrBuilder>
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        if (!(entryCase_ == 1)) {
          entry_ = com.google.cloud.dataform.v1.FileSearchResult.getDefaultInstance();
        }
        fileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1.FileSearchResult,
                com.google.cloud.dataform.v1.FileSearchResult.Builder,
                com.google.cloud.dataform.v1.FileSearchResultOrBuilder>(
                (com.google.cloud.dataform.v1.FileSearchResult) entry_,
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      entryCase_ = 1;
      onChanged();
      return fileBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1.DirectorySearchResult,
            com.google.cloud.dataform.v1.DirectorySearchResult.Builder,
            com.google.cloud.dataform.v1.DirectorySearchResultOrBuilder>
        directoryBuilder_;

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     *
     * @return Whether the directory field is set.
     */
    @java.lang.Override
    public boolean hasDirectory() {
      return entryCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     *
     * @return The directory.
     */
    @java.lang.Override
    public com.google.cloud.dataform.v1.DirectorySearchResult getDirectory() {
      if (directoryBuilder_ == null) {
        if (entryCase_ == 2) {
          return (com.google.cloud.dataform.v1.DirectorySearchResult) entry_;
        }
        return com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
      } else {
        if (entryCase_ == 2) {
          return directoryBuilder_.getMessage();
        }
        return com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    public Builder setDirectory(com.google.cloud.dataform.v1.DirectorySearchResult value) {
      if (directoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entry_ = value;
        onChanged();
      } else {
        directoryBuilder_.setMessage(value);
      }
      entryCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    public Builder setDirectory(
        com.google.cloud.dataform.v1.DirectorySearchResult.Builder builderForValue) {
      if (directoryBuilder_ == null) {
        entry_ = builderForValue.build();
        onChanged();
      } else {
        directoryBuilder_.setMessage(builderForValue.build());
      }
      entryCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    public Builder mergeDirectory(com.google.cloud.dataform.v1.DirectorySearchResult value) {
      if (directoryBuilder_ == null) {
        if (entryCase_ == 2
            && entry_ != com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance()) {
          entry_ =
              com.google.cloud.dataform.v1.DirectorySearchResult.newBuilder(
                      (com.google.cloud.dataform.v1.DirectorySearchResult) entry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          entry_ = value;
        }
        onChanged();
      } else {
        if (entryCase_ == 2) {
          directoryBuilder_.mergeFrom(value);
        } else {
          directoryBuilder_.setMessage(value);
        }
      }
      entryCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    public Builder clearDirectory() {
      if (directoryBuilder_ == null) {
        if (entryCase_ == 2) {
          entryCase_ = 0;
          entry_ = null;
          onChanged();
        }
      } else {
        if (entryCase_ == 2) {
          entryCase_ = 0;
          entry_ = null;
        }
        directoryBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    public com.google.cloud.dataform.v1.DirectorySearchResult.Builder getDirectoryBuilder() {
      return getDirectoryFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.dataform.v1.DirectorySearchResultOrBuilder getDirectoryOrBuilder() {
      if ((entryCase_ == 2) && (directoryBuilder_ != null)) {
        return directoryBuilder_.getMessageOrBuilder();
      } else {
        if (entryCase_ == 2) {
          return (com.google.cloud.dataform.v1.DirectorySearchResult) entry_;
        }
        return com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Details when search result is a directory.
     * </pre>
     *
     * <code>.google.cloud.dataform.v1.DirectorySearchResult directory = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dataform.v1.DirectorySearchResult,
            com.google.cloud.dataform.v1.DirectorySearchResult.Builder,
            com.google.cloud.dataform.v1.DirectorySearchResultOrBuilder>
        getDirectoryFieldBuilder() {
      if (directoryBuilder_ == null) {
        if (!(entryCase_ == 2)) {
          entry_ = com.google.cloud.dataform.v1.DirectorySearchResult.getDefaultInstance();
        }
        directoryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dataform.v1.DirectorySearchResult,
                com.google.cloud.dataform.v1.DirectorySearchResult.Builder,
                com.google.cloud.dataform.v1.DirectorySearchResultOrBuilder>(
                (com.google.cloud.dataform.v1.DirectorySearchResult) entry_,
                getParentForChildren(),
                isClean());
        entry_ = null;
      }
      entryCase_ = 2;
      onChanged();
      return directoryBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dataform.v1.SearchResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataform.v1.SearchResult)
  private static final com.google.cloud.dataform.v1.SearchResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataform.v1.SearchResult();
  }

  public static com.google.cloud.dataform.v1.SearchResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchResult> PARSER =
      new com.google.protobuf.AbstractParser<SearchResult>() {
        @java.lang.Override
        public SearchResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataform.v1.SearchResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
