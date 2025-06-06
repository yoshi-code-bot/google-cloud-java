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
// source: google/api/cloudquotas/v1beta/cloudquotas.proto

// Protobuf Java Version: 3.25.8
package com.google.api.cloudquotas.v1beta;

/**
 *
 *
 * <pre>
 * Message for response to listing QuotaInfos
 * </pre>
 *
 * Protobuf type {@code google.api.cloudquotas.v1beta.ListQuotaInfosResponse}
 */
public final class ListQuotaInfosResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.cloudquotas.v1beta.ListQuotaInfosResponse)
    ListQuotaInfosResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListQuotaInfosResponse.newBuilder() to construct.
  private ListQuotaInfosResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListQuotaInfosResponse() {
    quotaInfos_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListQuotaInfosResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.cloudquotas.v1beta.CloudquotasProto
        .internal_static_google_api_cloudquotas_v1beta_ListQuotaInfosResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.cloudquotas.v1beta.CloudquotasProto
        .internal_static_google_api_cloudquotas_v1beta_ListQuotaInfosResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.class,
            com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.Builder.class);
  }

  public static final int QUOTA_INFOS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.api.cloudquotas.v1beta.QuotaInfo> quotaInfos_;

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.cloudquotas.v1beta.QuotaInfo> getQuotaInfosList() {
    return quotaInfos_;
  }

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder>
      getQuotaInfosOrBuilderList() {
    return quotaInfos_;
  }

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
   */
  @java.lang.Override
  public int getQuotaInfosCount() {
    return quotaInfos_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
   */
  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.QuotaInfo getQuotaInfos(int index) {
    return quotaInfos_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of QuotaInfo
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
   */
  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder getQuotaInfosOrBuilder(int index) {
    return quotaInfos_.get(index);
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
    for (int i = 0; i < quotaInfos_.size(); i++) {
      output.writeMessage(1, quotaInfos_.get(i));
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
    for (int i = 0; i < quotaInfos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, quotaInfos_.get(i));
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
    if (!(obj instanceof com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse)) {
      return super.equals(obj);
    }
    com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse other =
        (com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse) obj;

    if (!getQuotaInfosList().equals(other.getQuotaInfosList())) return false;
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
    if (getQuotaInfosCount() > 0) {
      hash = (37 * hash) + QUOTA_INFOS_FIELD_NUMBER;
      hash = (53 * hash) + getQuotaInfosList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse parseFrom(
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
      com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse prototype) {
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
   * Message for response to listing QuotaInfos
   * </pre>
   *
   * Protobuf type {@code google.api.cloudquotas.v1beta.ListQuotaInfosResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.cloudquotas.v1beta.ListQuotaInfosResponse)
      com.google.api.cloudquotas.v1beta.ListQuotaInfosResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.cloudquotas.v1beta.CloudquotasProto
          .internal_static_google_api_cloudquotas_v1beta_ListQuotaInfosResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.cloudquotas.v1beta.CloudquotasProto
          .internal_static_google_api_cloudquotas_v1beta_ListQuotaInfosResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.class,
              com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.Builder.class);
    }

    // Construct using com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (quotaInfosBuilder_ == null) {
        quotaInfos_ = java.util.Collections.emptyList();
      } else {
        quotaInfos_ = null;
        quotaInfosBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.cloudquotas.v1beta.CloudquotasProto
          .internal_static_google_api_cloudquotas_v1beta_ListQuotaInfosResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse getDefaultInstanceForType() {
      return com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse build() {
      com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse buildPartial() {
      com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse result =
          new com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse result) {
      if (quotaInfosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          quotaInfos_ = java.util.Collections.unmodifiableList(quotaInfos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.quotaInfos_ = quotaInfos_;
      } else {
        result.quotaInfos_ = quotaInfosBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse result) {
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
      if (other instanceof com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse) {
        return mergeFrom((com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse other) {
      if (other == com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse.getDefaultInstance())
        return this;
      if (quotaInfosBuilder_ == null) {
        if (!other.quotaInfos_.isEmpty()) {
          if (quotaInfos_.isEmpty()) {
            quotaInfos_ = other.quotaInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQuotaInfosIsMutable();
            quotaInfos_.addAll(other.quotaInfos_);
          }
          onChanged();
        }
      } else {
        if (!other.quotaInfos_.isEmpty()) {
          if (quotaInfosBuilder_.isEmpty()) {
            quotaInfosBuilder_.dispose();
            quotaInfosBuilder_ = null;
            quotaInfos_ = other.quotaInfos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            quotaInfosBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getQuotaInfosFieldBuilder()
                    : null;
          } else {
            quotaInfosBuilder_.addAllMessages(other.quotaInfos_);
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
                com.google.api.cloudquotas.v1beta.QuotaInfo m =
                    input.readMessage(
                        com.google.api.cloudquotas.v1beta.QuotaInfo.parser(), extensionRegistry);
                if (quotaInfosBuilder_ == null) {
                  ensureQuotaInfosIsMutable();
                  quotaInfos_.add(m);
                } else {
                  quotaInfosBuilder_.addMessage(m);
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

    private java.util.List<com.google.api.cloudquotas.v1beta.QuotaInfo> quotaInfos_ =
        java.util.Collections.emptyList();

    private void ensureQuotaInfosIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        quotaInfos_ =
            new java.util.ArrayList<com.google.api.cloudquotas.v1beta.QuotaInfo>(quotaInfos_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.cloudquotas.v1beta.QuotaInfo,
            com.google.api.cloudquotas.v1beta.QuotaInfo.Builder,
            com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder>
        quotaInfosBuilder_;

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public java.util.List<com.google.api.cloudquotas.v1beta.QuotaInfo> getQuotaInfosList() {
      if (quotaInfosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(quotaInfos_);
      } else {
        return quotaInfosBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public int getQuotaInfosCount() {
      if (quotaInfosBuilder_ == null) {
        return quotaInfos_.size();
      } else {
        return quotaInfosBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaInfo getQuotaInfos(int index) {
      if (quotaInfosBuilder_ == null) {
        return quotaInfos_.get(index);
      } else {
        return quotaInfosBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder setQuotaInfos(int index, com.google.api.cloudquotas.v1beta.QuotaInfo value) {
      if (quotaInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuotaInfosIsMutable();
        quotaInfos_.set(index, value);
        onChanged();
      } else {
        quotaInfosBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder setQuotaInfos(
        int index, com.google.api.cloudquotas.v1beta.QuotaInfo.Builder builderForValue) {
      if (quotaInfosBuilder_ == null) {
        ensureQuotaInfosIsMutable();
        quotaInfos_.set(index, builderForValue.build());
        onChanged();
      } else {
        quotaInfosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder addQuotaInfos(com.google.api.cloudquotas.v1beta.QuotaInfo value) {
      if (quotaInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuotaInfosIsMutable();
        quotaInfos_.add(value);
        onChanged();
      } else {
        quotaInfosBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder addQuotaInfos(int index, com.google.api.cloudquotas.v1beta.QuotaInfo value) {
      if (quotaInfosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureQuotaInfosIsMutable();
        quotaInfos_.add(index, value);
        onChanged();
      } else {
        quotaInfosBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder addQuotaInfos(
        com.google.api.cloudquotas.v1beta.QuotaInfo.Builder builderForValue) {
      if (quotaInfosBuilder_ == null) {
        ensureQuotaInfosIsMutable();
        quotaInfos_.add(builderForValue.build());
        onChanged();
      } else {
        quotaInfosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder addQuotaInfos(
        int index, com.google.api.cloudquotas.v1beta.QuotaInfo.Builder builderForValue) {
      if (quotaInfosBuilder_ == null) {
        ensureQuotaInfosIsMutable();
        quotaInfos_.add(index, builderForValue.build());
        onChanged();
      } else {
        quotaInfosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder addAllQuotaInfos(
        java.lang.Iterable<? extends com.google.api.cloudquotas.v1beta.QuotaInfo> values) {
      if (quotaInfosBuilder_ == null) {
        ensureQuotaInfosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, quotaInfos_);
        onChanged();
      } else {
        quotaInfosBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder clearQuotaInfos() {
      if (quotaInfosBuilder_ == null) {
        quotaInfos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        quotaInfosBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public Builder removeQuotaInfos(int index) {
      if (quotaInfosBuilder_ == null) {
        ensureQuotaInfosIsMutable();
        quotaInfos_.remove(index);
        onChanged();
      } else {
        quotaInfosBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaInfo.Builder getQuotaInfosBuilder(int index) {
      return getQuotaInfosFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder getQuotaInfosOrBuilder(int index) {
      if (quotaInfosBuilder_ == null) {
        return quotaInfos_.get(index);
      } else {
        return quotaInfosBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public java.util.List<? extends com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder>
        getQuotaInfosOrBuilderList() {
      if (quotaInfosBuilder_ != null) {
        return quotaInfosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(quotaInfos_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaInfo.Builder addQuotaInfosBuilder() {
      return getQuotaInfosFieldBuilder()
          .addBuilder(com.google.api.cloudquotas.v1beta.QuotaInfo.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public com.google.api.cloudquotas.v1beta.QuotaInfo.Builder addQuotaInfosBuilder(int index) {
      return getQuotaInfosFieldBuilder()
          .addBuilder(index, com.google.api.cloudquotas.v1beta.QuotaInfo.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of QuotaInfo
     * </pre>
     *
     * <code>repeated .google.api.cloudquotas.v1beta.QuotaInfo quota_infos = 1;</code>
     */
    public java.util.List<com.google.api.cloudquotas.v1beta.QuotaInfo.Builder>
        getQuotaInfosBuilderList() {
      return getQuotaInfosFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.cloudquotas.v1beta.QuotaInfo,
            com.google.api.cloudquotas.v1beta.QuotaInfo.Builder,
            com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder>
        getQuotaInfosFieldBuilder() {
      if (quotaInfosBuilder_ == null) {
        quotaInfosBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.cloudquotas.v1beta.QuotaInfo,
                com.google.api.cloudquotas.v1beta.QuotaInfo.Builder,
                com.google.api.cloudquotas.v1beta.QuotaInfoOrBuilder>(
                quotaInfos_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        quotaInfos_ = null;
      }
      return quotaInfosBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.cloudquotas.v1beta.ListQuotaInfosResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.cloudquotas.v1beta.ListQuotaInfosResponse)
  private static final com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse();
  }

  public static com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListQuotaInfosResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListQuotaInfosResponse>() {
        @java.lang.Override
        public ListQuotaInfosResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListQuotaInfosResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListQuotaInfosResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.ListQuotaInfosResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
