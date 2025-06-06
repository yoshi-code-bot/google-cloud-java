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
// source: google/cloud/aiplatform/v1beta1/notebook_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [NotebookService.ListNotebookRuntimes][google.cloud.aiplatform.v1beta1.NotebookService.ListNotebookRuntimes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse}
 */
public final class ListNotebookRuntimesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse)
    ListNotebookRuntimesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListNotebookRuntimesResponse.newBuilder() to construct.
  private ListNotebookRuntimesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListNotebookRuntimesResponse() {
    notebookRuntimes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListNotebookRuntimesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.NotebookServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListNotebookRuntimesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.NotebookServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ListNotebookRuntimesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.class,
            com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.Builder.class);
  }

  public static final int NOTEBOOK_RUNTIMES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.NotebookRuntime> notebookRuntimes_;

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.NotebookRuntime>
      getNotebookRuntimesList() {
    return notebookRuntimes_;
  }

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder>
      getNotebookRuntimesOrBuilderList() {
    return notebookRuntimes_;
  }

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  @java.lang.Override
  public int getNotebookRuntimesCount() {
    return notebookRuntimes_.size();
  }

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NotebookRuntime getNotebookRuntimes(int index) {
    return notebookRuntimes_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of NotebookRuntimes in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder getNotebookRuntimesOrBuilder(
      int index) {
    return notebookRuntimes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve next page of results.
   * Pass to
   * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < notebookRuntimes_.size(); i++) {
      output.writeMessage(1, notebookRuntimes_.get(i));
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
    for (int i = 0; i < notebookRuntimes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, notebookRuntimes_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse other =
        (com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse) obj;

    if (!getNotebookRuntimesList().equals(other.getNotebookRuntimesList())) return false;
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
    if (getNotebookRuntimesCount() > 0) {
      hash = (37 * hash) + NOTEBOOK_RUNTIMES_FIELD_NUMBER;
      hash = (53 * hash) + getNotebookRuntimesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse prototype) {
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
   * Response message for
   * [NotebookService.ListNotebookRuntimes][google.cloud.aiplatform.v1beta1.NotebookService.ListNotebookRuntimes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse)
      com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.NotebookServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListNotebookRuntimesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.NotebookServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListNotebookRuntimesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.class,
              com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (notebookRuntimesBuilder_ == null) {
        notebookRuntimes_ = java.util.Collections.emptyList();
      } else {
        notebookRuntimes_ = null;
        notebookRuntimesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.NotebookServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ListNotebookRuntimesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse build() {
      com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse result =
          new com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse result) {
      if (notebookRuntimesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          notebookRuntimes_ = java.util.Collections.unmodifiableList(notebookRuntimes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.notebookRuntimes_ = notebookRuntimes_;
      } else {
        result.notebookRuntimes_ = notebookRuntimesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse.getDefaultInstance())
        return this;
      if (notebookRuntimesBuilder_ == null) {
        if (!other.notebookRuntimes_.isEmpty()) {
          if (notebookRuntimes_.isEmpty()) {
            notebookRuntimes_ = other.notebookRuntimes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNotebookRuntimesIsMutable();
            notebookRuntimes_.addAll(other.notebookRuntimes_);
          }
          onChanged();
        }
      } else {
        if (!other.notebookRuntimes_.isEmpty()) {
          if (notebookRuntimesBuilder_.isEmpty()) {
            notebookRuntimesBuilder_.dispose();
            notebookRuntimesBuilder_ = null;
            notebookRuntimes_ = other.notebookRuntimes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            notebookRuntimesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNotebookRuntimesFieldBuilder()
                    : null;
          } else {
            notebookRuntimesBuilder_.addAllMessages(other.notebookRuntimes_);
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
                com.google.cloud.aiplatform.v1beta1.NotebookRuntime m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.NotebookRuntime.parser(),
                        extensionRegistry);
                if (notebookRuntimesBuilder_ == null) {
                  ensureNotebookRuntimesIsMutable();
                  notebookRuntimes_.add(m);
                } else {
                  notebookRuntimesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.NotebookRuntime> notebookRuntimes_ =
        java.util.Collections.emptyList();

    private void ensureNotebookRuntimesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notebookRuntimes_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.NotebookRuntime>(
                notebookRuntimes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.NotebookRuntime,
            com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder,
            com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder>
        notebookRuntimesBuilder_;

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.NotebookRuntime>
        getNotebookRuntimesList() {
      if (notebookRuntimesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(notebookRuntimes_);
      } else {
        return notebookRuntimesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public int getNotebookRuntimesCount() {
      if (notebookRuntimesBuilder_ == null) {
        return notebookRuntimes_.size();
      } else {
        return notebookRuntimesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NotebookRuntime getNotebookRuntimes(int index) {
      if (notebookRuntimesBuilder_ == null) {
        return notebookRuntimes_.get(index);
      } else {
        return notebookRuntimesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder setNotebookRuntimes(
        int index, com.google.cloud.aiplatform.v1beta1.NotebookRuntime value) {
      if (notebookRuntimesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.set(index, value);
        onChanged();
      } else {
        notebookRuntimesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder setNotebookRuntimes(
        int index, com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder builderForValue) {
      if (notebookRuntimesBuilder_ == null) {
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.set(index, builderForValue.build());
        onChanged();
      } else {
        notebookRuntimesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder addNotebookRuntimes(com.google.cloud.aiplatform.v1beta1.NotebookRuntime value) {
      if (notebookRuntimesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.add(value);
        onChanged();
      } else {
        notebookRuntimesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder addNotebookRuntimes(
        int index, com.google.cloud.aiplatform.v1beta1.NotebookRuntime value) {
      if (notebookRuntimesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.add(index, value);
        onChanged();
      } else {
        notebookRuntimesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder addNotebookRuntimes(
        com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder builderForValue) {
      if (notebookRuntimesBuilder_ == null) {
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.add(builderForValue.build());
        onChanged();
      } else {
        notebookRuntimesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder addNotebookRuntimes(
        int index, com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder builderForValue) {
      if (notebookRuntimesBuilder_ == null) {
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.add(index, builderForValue.build());
        onChanged();
      } else {
        notebookRuntimesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder addAllNotebookRuntimes(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.NotebookRuntime> values) {
      if (notebookRuntimesBuilder_ == null) {
        ensureNotebookRuntimesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, notebookRuntimes_);
        onChanged();
      } else {
        notebookRuntimesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder clearNotebookRuntimes() {
      if (notebookRuntimesBuilder_ == null) {
        notebookRuntimes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        notebookRuntimesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public Builder removeNotebookRuntimes(int index) {
      if (notebookRuntimesBuilder_ == null) {
        ensureNotebookRuntimesIsMutable();
        notebookRuntimes_.remove(index);
        onChanged();
      } else {
        notebookRuntimesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder getNotebookRuntimesBuilder(
        int index) {
      return getNotebookRuntimesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder
        getNotebookRuntimesOrBuilder(int index) {
      if (notebookRuntimesBuilder_ == null) {
        return notebookRuntimes_.get(index);
      } else {
        return notebookRuntimesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder>
        getNotebookRuntimesOrBuilderList() {
      if (notebookRuntimesBuilder_ != null) {
        return notebookRuntimesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(notebookRuntimes_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder
        addNotebookRuntimesBuilder() {
      return getNotebookRuntimesFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.NotebookRuntime.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder addNotebookRuntimesBuilder(
        int index) {
      return getNotebookRuntimesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1beta1.NotebookRuntime.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of NotebookRuntimes in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.NotebookRuntime notebook_runtimes = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder>
        getNotebookRuntimesBuilderList() {
      return getNotebookRuntimesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.NotebookRuntime,
            com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder,
            com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder>
        getNotebookRuntimesFieldBuilder() {
      if (notebookRuntimesBuilder_ == null) {
        notebookRuntimesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.NotebookRuntime,
                com.google.cloud.aiplatform.v1beta1.NotebookRuntime.Builder,
                com.google.cloud.aiplatform.v1beta1.NotebookRuntimeOrBuilder>(
                notebookRuntimes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        notebookRuntimes_ = null;
      }
      return notebookRuntimesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * Pass to
     * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve next page of results.
     * Pass to
     * [ListNotebookRuntimesRequest.page_token][google.cloud.aiplatform.v1beta1.ListNotebookRuntimesRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListNotebookRuntimesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListNotebookRuntimesResponse>() {
        @java.lang.Override
        public ListNotebookRuntimesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListNotebookRuntimesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListNotebookRuntimesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ListNotebookRuntimesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
