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
// source: google/cloud/managedkafka/v1/managed_kafka.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.managedkafka.v1;

/**
 *
 *
 * <pre>
 * Response for ListAcls.
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedkafka.v1.ListAclsResponse}
 */
public final class ListAclsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedkafka.v1.ListAclsResponse)
    ListAclsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListAclsResponse.newBuilder() to construct.
  private ListAclsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAclsResponse() {
    acls_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAclsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.managedkafka.v1.ManagedKafkaProto
        .internal_static_google_cloud_managedkafka_v1_ListAclsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedkafka.v1.ManagedKafkaProto
        .internal_static_google_cloud_managedkafka_v1_ListAclsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedkafka.v1.ListAclsResponse.class,
            com.google.cloud.managedkafka.v1.ListAclsResponse.Builder.class);
  }

  public static final int ACLS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.managedkafka.v1.Acl> acls_;

  /**
   *
   *
   * <pre>
   * The list of acls in the requested parent. The order of the acls is
   * unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.managedkafka.v1.Acl> getAclsList() {
    return acls_;
  }

  /**
   *
   *
   * <pre>
   * The list of acls in the requested parent. The order of the acls is
   * unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.managedkafka.v1.AclOrBuilder>
      getAclsOrBuilderList() {
    return acls_;
  }

  /**
   *
   *
   * <pre>
   * The list of acls in the requested parent. The order of the acls is
   * unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
   */
  @java.lang.Override
  public int getAclsCount() {
    return acls_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of acls in the requested parent. The order of the acls is
   * unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.Acl getAcls(int index) {
    return acls_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of acls in the requested parent. The order of the acls is
   * unspecified.
   * </pre>
   *
   * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.AclOrBuilder getAclsOrBuilder(int index) {
    return acls_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
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
   * A token that can be sent as `page_token` to retrieve the next page of
   * results. If this field is omitted, there are no more results.
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
    for (int i = 0; i < acls_.size(); i++) {
      output.writeMessage(1, acls_.get(i));
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
    for (int i = 0; i < acls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, acls_.get(i));
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
    if (!(obj instanceof com.google.cloud.managedkafka.v1.ListAclsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.managedkafka.v1.ListAclsResponse other =
        (com.google.cloud.managedkafka.v1.ListAclsResponse) obj;

    if (!getAclsList().equals(other.getAclsList())) return false;
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
    if (getAclsCount() > 0) {
      hash = (37 * hash) + ACLS_FIELD_NUMBER;
      hash = (53 * hash) + getAclsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.managedkafka.v1.ListAclsResponse prototype) {
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
   * Response for ListAcls.
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedkafka.v1.ListAclsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedkafka.v1.ListAclsResponse)
      com.google.cloud.managedkafka.v1.ListAclsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_ListAclsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_ListAclsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedkafka.v1.ListAclsResponse.class,
              com.google.cloud.managedkafka.v1.ListAclsResponse.Builder.class);
    }

    // Construct using com.google.cloud.managedkafka.v1.ListAclsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (aclsBuilder_ == null) {
        acls_ = java.util.Collections.emptyList();
      } else {
        acls_ = null;
        aclsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_ListAclsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.ListAclsResponse getDefaultInstanceForType() {
      return com.google.cloud.managedkafka.v1.ListAclsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.ListAclsResponse build() {
      com.google.cloud.managedkafka.v1.ListAclsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.ListAclsResponse buildPartial() {
      com.google.cloud.managedkafka.v1.ListAclsResponse result =
          new com.google.cloud.managedkafka.v1.ListAclsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.managedkafka.v1.ListAclsResponse result) {
      if (aclsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          acls_ = java.util.Collections.unmodifiableList(acls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.acls_ = acls_;
      } else {
        result.acls_ = aclsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.managedkafka.v1.ListAclsResponse result) {
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
      if (other instanceof com.google.cloud.managedkafka.v1.ListAclsResponse) {
        return mergeFrom((com.google.cloud.managedkafka.v1.ListAclsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedkafka.v1.ListAclsResponse other) {
      if (other == com.google.cloud.managedkafka.v1.ListAclsResponse.getDefaultInstance())
        return this;
      if (aclsBuilder_ == null) {
        if (!other.acls_.isEmpty()) {
          if (acls_.isEmpty()) {
            acls_ = other.acls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAclsIsMutable();
            acls_.addAll(other.acls_);
          }
          onChanged();
        }
      } else {
        if (!other.acls_.isEmpty()) {
          if (aclsBuilder_.isEmpty()) {
            aclsBuilder_.dispose();
            aclsBuilder_ = null;
            acls_ = other.acls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aclsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAclsFieldBuilder()
                    : null;
          } else {
            aclsBuilder_.addAllMessages(other.acls_);
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
                com.google.cloud.managedkafka.v1.Acl m =
                    input.readMessage(
                        com.google.cloud.managedkafka.v1.Acl.parser(), extensionRegistry);
                if (aclsBuilder_ == null) {
                  ensureAclsIsMutable();
                  acls_.add(m);
                } else {
                  aclsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.managedkafka.v1.Acl> acls_ =
        java.util.Collections.emptyList();

    private void ensureAclsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        acls_ = new java.util.ArrayList<com.google.cloud.managedkafka.v1.Acl>(acls_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.managedkafka.v1.Acl,
            com.google.cloud.managedkafka.v1.Acl.Builder,
            com.google.cloud.managedkafka.v1.AclOrBuilder>
        aclsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public java.util.List<com.google.cloud.managedkafka.v1.Acl> getAclsList() {
      if (aclsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(acls_);
      } else {
        return aclsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public int getAclsCount() {
      if (aclsBuilder_ == null) {
        return acls_.size();
      } else {
        return aclsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.Acl getAcls(int index) {
      if (aclsBuilder_ == null) {
        return acls_.get(index);
      } else {
        return aclsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder setAcls(int index, com.google.cloud.managedkafka.v1.Acl value) {
      if (aclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAclsIsMutable();
        acls_.set(index, value);
        onChanged();
      } else {
        aclsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder setAcls(
        int index, com.google.cloud.managedkafka.v1.Acl.Builder builderForValue) {
      if (aclsBuilder_ == null) {
        ensureAclsIsMutable();
        acls_.set(index, builderForValue.build());
        onChanged();
      } else {
        aclsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder addAcls(com.google.cloud.managedkafka.v1.Acl value) {
      if (aclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAclsIsMutable();
        acls_.add(value);
        onChanged();
      } else {
        aclsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder addAcls(int index, com.google.cloud.managedkafka.v1.Acl value) {
      if (aclsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAclsIsMutable();
        acls_.add(index, value);
        onChanged();
      } else {
        aclsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder addAcls(com.google.cloud.managedkafka.v1.Acl.Builder builderForValue) {
      if (aclsBuilder_ == null) {
        ensureAclsIsMutable();
        acls_.add(builderForValue.build());
        onChanged();
      } else {
        aclsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder addAcls(
        int index, com.google.cloud.managedkafka.v1.Acl.Builder builderForValue) {
      if (aclsBuilder_ == null) {
        ensureAclsIsMutable();
        acls_.add(index, builderForValue.build());
        onChanged();
      } else {
        aclsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder addAllAcls(
        java.lang.Iterable<? extends com.google.cloud.managedkafka.v1.Acl> values) {
      if (aclsBuilder_ == null) {
        ensureAclsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, acls_);
        onChanged();
      } else {
        aclsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder clearAcls() {
      if (aclsBuilder_ == null) {
        acls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aclsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public Builder removeAcls(int index) {
      if (aclsBuilder_ == null) {
        ensureAclsIsMutable();
        acls_.remove(index);
        onChanged();
      } else {
        aclsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.Acl.Builder getAclsBuilder(int index) {
      return getAclsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.AclOrBuilder getAclsOrBuilder(int index) {
      if (aclsBuilder_ == null) {
        return acls_.get(index);
      } else {
        return aclsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.managedkafka.v1.AclOrBuilder>
        getAclsOrBuilderList() {
      if (aclsBuilder_ != null) {
        return aclsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(acls_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.Acl.Builder addAclsBuilder() {
      return getAclsFieldBuilder()
          .addBuilder(com.google.cloud.managedkafka.v1.Acl.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.Acl.Builder addAclsBuilder(int index) {
      return getAclsFieldBuilder()
          .addBuilder(index, com.google.cloud.managedkafka.v1.Acl.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of acls in the requested parent. The order of the acls is
     * unspecified.
     * </pre>
     *
     * <code>repeated .google.cloud.managedkafka.v1.Acl acls = 1;</code>
     */
    public java.util.List<com.google.cloud.managedkafka.v1.Acl.Builder> getAclsBuilderList() {
      return getAclsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.managedkafka.v1.Acl,
            com.google.cloud.managedkafka.v1.Acl.Builder,
            com.google.cloud.managedkafka.v1.AclOrBuilder>
        getAclsFieldBuilder() {
      if (aclsBuilder_ == null) {
        aclsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.managedkafka.v1.Acl,
                com.google.cloud.managedkafka.v1.Acl.Builder,
                com.google.cloud.managedkafka.v1.AclOrBuilder>(
                acls_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        acls_ = null;
      }
      return aclsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
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
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
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
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
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
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
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
     * A token that can be sent as `page_token` to retrieve the next page of
     * results. If this field is omitted, there are no more results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.managedkafka.v1.ListAclsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedkafka.v1.ListAclsResponse)
  private static final com.google.cloud.managedkafka.v1.ListAclsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedkafka.v1.ListAclsResponse();
  }

  public static com.google.cloud.managedkafka.v1.ListAclsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAclsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAclsResponse>() {
        @java.lang.Override
        public ListAclsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAclsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAclsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedkafka.v1.ListAclsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
