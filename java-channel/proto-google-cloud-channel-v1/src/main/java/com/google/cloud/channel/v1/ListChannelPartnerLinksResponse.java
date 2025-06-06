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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [CloudChannelService.ListChannelPartnerLinks][google.cloud.channel.v1.CloudChannelService.ListChannelPartnerLinks].
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.ListChannelPartnerLinksResponse}
 */
public final class ListChannelPartnerLinksResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
    ListChannelPartnerLinksResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListChannelPartnerLinksResponse.newBuilder() to construct.
  private ListChannelPartnerLinksResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListChannelPartnerLinksResponse() {
    channelPartnerLinks_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListChannelPartnerLinksResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListChannelPartnerLinksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_ListChannelPartnerLinksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.class,
            com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.Builder.class);
  }

  public static final int CHANNEL_PARTNER_LINKS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink> channelPartnerLinks_;

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink>
      getChannelPartnerLinksList() {
    return channelPartnerLinks_;
  }

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
      getChannelPartnerLinksOrBuilderList() {
    return channelPartnerLinks_;
  }

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  @java.lang.Override
  public int getChannelPartnerLinksCount() {
    return channelPartnerLinks_.size();
  }

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLinks(int index) {
    return channelPartnerLinks_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The Channel partner links for a reseller.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinksOrBuilder(
      int index) {
    return channelPartnerLinks_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
    for (int i = 0; i < channelPartnerLinks_.size(); i++) {
      output.writeMessage(1, channelPartnerLinks_.get(i));
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
    for (int i = 0; i < channelPartnerLinks_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, channelPartnerLinks_.get(i));
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
    if (!(obj instanceof com.google.cloud.channel.v1.ListChannelPartnerLinksResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.ListChannelPartnerLinksResponse other =
        (com.google.cloud.channel.v1.ListChannelPartnerLinksResponse) obj;

    if (!getChannelPartnerLinksList().equals(other.getChannelPartnerLinksList())) return false;
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
    if (getChannelPartnerLinksCount() > 0) {
      hash = (37 * hash) + CHANNEL_PARTNER_LINKS_FIELD_NUMBER;
      hash = (53 * hash) + getChannelPartnerLinksList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse parseFrom(
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
      com.google.cloud.channel.v1.ListChannelPartnerLinksResponse prototype) {
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
   * [CloudChannelService.ListChannelPartnerLinks][google.cloud.channel.v1.CloudChannelService.ListChannelPartnerLinks].
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.ListChannelPartnerLinksResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
      com.google.cloud.channel.v1.ListChannelPartnerLinksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListChannelPartnerLinksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListChannelPartnerLinksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.class,
              com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (channelPartnerLinksBuilder_ == null) {
        channelPartnerLinks_ = java.util.Collections.emptyList();
      } else {
        channelPartnerLinks_ = null;
        channelPartnerLinksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_ListChannelPartnerLinksResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListChannelPartnerLinksResponse getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListChannelPartnerLinksResponse build() {
      com.google.cloud.channel.v1.ListChannelPartnerLinksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.ListChannelPartnerLinksResponse buildPartial() {
      com.google.cloud.channel.v1.ListChannelPartnerLinksResponse result =
          new com.google.cloud.channel.v1.ListChannelPartnerLinksResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.channel.v1.ListChannelPartnerLinksResponse result) {
      if (channelPartnerLinksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          channelPartnerLinks_ = java.util.Collections.unmodifiableList(channelPartnerLinks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.channelPartnerLinks_ = channelPartnerLinks_;
      } else {
        result.channelPartnerLinks_ = channelPartnerLinksBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.channel.v1.ListChannelPartnerLinksResponse result) {
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
      if (other instanceof com.google.cloud.channel.v1.ListChannelPartnerLinksResponse) {
        return mergeFrom((com.google.cloud.channel.v1.ListChannelPartnerLinksResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.ListChannelPartnerLinksResponse other) {
      if (other == com.google.cloud.channel.v1.ListChannelPartnerLinksResponse.getDefaultInstance())
        return this;
      if (channelPartnerLinksBuilder_ == null) {
        if (!other.channelPartnerLinks_.isEmpty()) {
          if (channelPartnerLinks_.isEmpty()) {
            channelPartnerLinks_ = other.channelPartnerLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChannelPartnerLinksIsMutable();
            channelPartnerLinks_.addAll(other.channelPartnerLinks_);
          }
          onChanged();
        }
      } else {
        if (!other.channelPartnerLinks_.isEmpty()) {
          if (channelPartnerLinksBuilder_.isEmpty()) {
            channelPartnerLinksBuilder_.dispose();
            channelPartnerLinksBuilder_ = null;
            channelPartnerLinks_ = other.channelPartnerLinks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            channelPartnerLinksBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getChannelPartnerLinksFieldBuilder()
                    : null;
          } else {
            channelPartnerLinksBuilder_.addAllMessages(other.channelPartnerLinks_);
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
                com.google.cloud.channel.v1.ChannelPartnerLink m =
                    input.readMessage(
                        com.google.cloud.channel.v1.ChannelPartnerLink.parser(), extensionRegistry);
                if (channelPartnerLinksBuilder_ == null) {
                  ensureChannelPartnerLinksIsMutable();
                  channelPartnerLinks_.add(m);
                } else {
                  channelPartnerLinksBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink> channelPartnerLinks_ =
        java.util.Collections.emptyList();

    private void ensureChannelPartnerLinksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        channelPartnerLinks_ =
            new java.util.ArrayList<com.google.cloud.channel.v1.ChannelPartnerLink>(
                channelPartnerLinks_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerLink,
            com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
            com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
        channelPartnerLinksBuilder_;

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink>
        getChannelPartnerLinksList() {
      if (channelPartnerLinksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(channelPartnerLinks_);
      } else {
        return channelPartnerLinksBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public int getChannelPartnerLinksCount() {
      if (channelPartnerLinksBuilder_ == null) {
        return channelPartnerLinks_.size();
      } else {
        return channelPartnerLinksBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink getChannelPartnerLinks(int index) {
      if (channelPartnerLinksBuilder_ == null) {
        return channelPartnerLinks_.get(index);
      } else {
        return channelPartnerLinksBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder setChannelPartnerLinks(
        int index, com.google.cloud.channel.v1.ChannelPartnerLink value) {
      if (channelPartnerLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.set(index, value);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder setChannelPartnerLinks(
        int index, com.google.cloud.channel.v1.ChannelPartnerLink.Builder builderForValue) {
      if (channelPartnerLinksBuilder_ == null) {
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.set(index, builderForValue.build());
        onChanged();
      } else {
        channelPartnerLinksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder addChannelPartnerLinks(com.google.cloud.channel.v1.ChannelPartnerLink value) {
      if (channelPartnerLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.add(value);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder addChannelPartnerLinks(
        int index, com.google.cloud.channel.v1.ChannelPartnerLink value) {
      if (channelPartnerLinksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.add(index, value);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder addChannelPartnerLinks(
        com.google.cloud.channel.v1.ChannelPartnerLink.Builder builderForValue) {
      if (channelPartnerLinksBuilder_ == null) {
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.add(builderForValue.build());
        onChanged();
      } else {
        channelPartnerLinksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder addChannelPartnerLinks(
        int index, com.google.cloud.channel.v1.ChannelPartnerLink.Builder builderForValue) {
      if (channelPartnerLinksBuilder_ == null) {
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.add(index, builderForValue.build());
        onChanged();
      } else {
        channelPartnerLinksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder addAllChannelPartnerLinks(
        java.lang.Iterable<? extends com.google.cloud.channel.v1.ChannelPartnerLink> values) {
      if (channelPartnerLinksBuilder_ == null) {
        ensureChannelPartnerLinksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, channelPartnerLinks_);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder clearChannelPartnerLinks() {
      if (channelPartnerLinksBuilder_ == null) {
        channelPartnerLinks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public Builder removeChannelPartnerLinks(int index) {
      if (channelPartnerLinksBuilder_ == null) {
        ensureChannelPartnerLinksIsMutable();
        channelPartnerLinks_.remove(index);
        onChanged();
      } else {
        channelPartnerLinksBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink.Builder getChannelPartnerLinksBuilder(
        int index) {
      return getChannelPartnerLinksFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder getChannelPartnerLinksOrBuilder(
        int index) {
      if (channelPartnerLinksBuilder_ == null) {
        return channelPartnerLinks_.get(index);
      } else {
        return channelPartnerLinksBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
        getChannelPartnerLinksOrBuilderList() {
      if (channelPartnerLinksBuilder_ != null) {
        return channelPartnerLinksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(channelPartnerLinks_);
      }
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink.Builder addChannelPartnerLinksBuilder() {
      return getChannelPartnerLinksFieldBuilder()
          .addBuilder(com.google.cloud.channel.v1.ChannelPartnerLink.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public com.google.cloud.channel.v1.ChannelPartnerLink.Builder addChannelPartnerLinksBuilder(
        int index) {
      return getChannelPartnerLinksFieldBuilder()
          .addBuilder(index, com.google.cloud.channel.v1.ChannelPartnerLink.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The Channel partner links for a reseller.
     * </pre>
     *
     * <code>repeated .google.cloud.channel.v1.ChannelPartnerLink channel_partner_links = 1;</code>
     */
    public java.util.List<com.google.cloud.channel.v1.ChannelPartnerLink.Builder>
        getChannelPartnerLinksBuilderList() {
      return getChannelPartnerLinksFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.channel.v1.ChannelPartnerLink,
            com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
            com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>
        getChannelPartnerLinksFieldBuilder() {
      if (channelPartnerLinksBuilder_ == null) {
        channelPartnerLinksBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.channel.v1.ChannelPartnerLink,
                com.google.cloud.channel.v1.ChannelPartnerLink.Builder,
                com.google.cloud.channel.v1.ChannelPartnerLinkOrBuilder>(
                channelPartnerLinks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        channelPartnerLinks_ = null;
      }
      return channelPartnerLinksBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListChannelPartnerLinksRequest.page_token][google.cloud.channel.v1.ListChannelPartnerLinksRequest.page_token]
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.ListChannelPartnerLinksResponse)
  private static final com.google.cloud.channel.v1.ListChannelPartnerLinksResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.ListChannelPartnerLinksResponse();
  }

  public static com.google.cloud.channel.v1.ListChannelPartnerLinksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListChannelPartnerLinksResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListChannelPartnerLinksResponse>() {
        @java.lang.Override
        public ListChannelPartnerLinksResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListChannelPartnerLinksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListChannelPartnerLinksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.ListChannelPartnerLinksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
