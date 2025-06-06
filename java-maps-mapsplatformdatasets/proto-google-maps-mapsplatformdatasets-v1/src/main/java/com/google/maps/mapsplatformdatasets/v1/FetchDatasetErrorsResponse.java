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
// source: google/maps/mapsplatformdatasets/v1/maps_platform_datasets.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.mapsplatformdatasets.v1;

/**
 *
 *
 * <pre>
 * Response object of FetchDatasetErrors.
 * </pre>
 *
 * Protobuf type {@code google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse}
 */
public final class FetchDatasetErrorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse)
    FetchDatasetErrorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FetchDatasetErrorsResponse.newBuilder() to construct.
  private FetchDatasetErrorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchDatasetErrorsResponse() {
    nextPageToken_ = "";
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchDatasetErrorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto
        .internal_static_google_maps_mapsplatformdatasets_v1_FetchDatasetErrorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto
        .internal_static_google_maps_mapsplatformdatasets_v1_FetchDatasetErrorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse.class,
            com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse.Builder.class);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page.
   *
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
   * A token that can be sent as `page_token` to retrieve the next page.
   *
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

  public static final int ERRORS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private java.util.List<com.google.rpc.Status> errors_;

  /**
   *
   *
   * <pre>
   * The errors associated with a dataset.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.rpc.Status> getErrorsList() {
    return errors_;
  }

  /**
   *
   *
   * <pre>
   * The errors associated with a dataset.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorsOrBuilderList() {
    return errors_;
  }

  /**
   *
   *
   * <pre>
   * The errors associated with a dataset.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }

  /**
   *
   *
   * <pre>
   * The errors associated with a dataset.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  @java.lang.Override
  public com.google.rpc.Status getErrors(int index) {
    return errors_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The errors associated with a dataset.
   * </pre>
   *
   * <code>repeated .google.rpc.Status errors = 3;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getErrorsOrBuilder(int index) {
    return errors_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(3, errors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, errors_.get(i));
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
    if (!(obj instanceof com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse)) {
      return super.equals(obj);
    }
    com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse other =
        (com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse) obj;

    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getErrorsList().equals(other.getErrorsList())) return false;
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse parseFrom(
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
      com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse prototype) {
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
   * Response object of FetchDatasetErrors.
   * </pre>
   *
   * Protobuf type {@code google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse)
      com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1_FetchDatasetErrorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1_FetchDatasetErrorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse.class,
              com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse.Builder.class);
    }

    // Construct using
    // com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nextPageToken_ = "";
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
      } else {
        errors_ = null;
        errorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto
          .internal_static_google_maps_mapsplatformdatasets_v1_FetchDatasetErrorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
        getDefaultInstanceForType() {
      return com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse build() {
      com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse buildPartial() {
      com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse result =
          new com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse result) {
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
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
      if (other instanceof com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse) {
        return mergeFrom(
            (com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse other) {
      if (other
          == com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
              .getDefaultInstance()) return this;
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000002);
            errorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getErrorsFieldBuilder()
                    : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
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
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 26:
              {
                com.google.rpc.Status m =
                    input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
                if (errorsBuilder_ == null) {
                  ensureErrorsIsMutable();
                  errors_.add(m);
                } else {
                  errorsBuilder_.addMessage(m);
                }
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

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     *
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
     * A token that can be sent as `page_token` to retrieve the next page.
     *
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
     * A token that can be sent as `page_token` to retrieve the next page.
     *
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     *
     * If this field is omitted, there are no subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page.
     *
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.rpc.Status> errors_ = java.util.Collections.emptyList();

    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        errors_ = new java.util.ArrayList<com.google.rpc.Status>(errors_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        errorsBuilder_;

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public java.util.List<com.google.rpc.Status> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public com.google.rpc.Status getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder setErrors(int index, com.google.rpc.Status value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder setErrors(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder addErrors(com.google.rpc.Status value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder addErrors(int index, com.google.rpc.Status value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder addErrors(com.google.rpc.Status.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder addErrors(int index, com.google.rpc.Status.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder addAllErrors(java.lang.Iterable<? extends com.google.rpc.Status> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public com.google.rpc.Status.Builder getErrorsBuilder(int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public com.google.rpc.StatusOrBuilder getErrorsOrBuilder(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public java.util.List<? extends com.google.rpc.StatusOrBuilder> getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public com.google.rpc.Status.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder().addBuilder(com.google.rpc.Status.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public com.google.rpc.Status.Builder addErrorsBuilder(int index) {
      return getErrorsFieldBuilder().addBuilder(index, com.google.rpc.Status.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The errors associated with a dataset.
     * </pre>
     *
     * <code>repeated .google.rpc.Status errors = 3;</code>
     */
    public java.util.List<com.google.rpc.Status.Builder> getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(
                errors_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        errors_ = null;
      }
      return errorsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse)
  private static final com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse();
  }

  public static com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchDatasetErrorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<FetchDatasetErrorsResponse>() {
        @java.lang.Override
        public FetchDatasetErrorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchDatasetErrorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchDatasetErrorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.mapsplatformdatasets.v1.FetchDatasetErrorsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
