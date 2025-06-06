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
// source: google/cloud/baremetalsolution/v2/ssh_key.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Message for response of ListSSHKeys.
 * </pre>
 *
 * Protobuf type {@code google.cloud.baremetalsolution.v2.ListSSHKeysResponse}
 */
public final class ListSSHKeysResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.baremetalsolution.v2.ListSSHKeysResponse)
    ListSSHKeysResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListSSHKeysResponse.newBuilder() to construct.
  private ListSSHKeysResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSSHKeysResponse() {
    sshKeys_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSSHKeysResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.SshKeyProto
        .internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.baremetalsolution.v2.SshKeyProto
        .internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.class,
            com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.Builder.class);
  }

  public static final int SSH_KEYS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.baremetalsolution.v2.SSHKey> sshKeys_;

  /**
   *
   *
   * <pre>
   * The SSH keys registered in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.baremetalsolution.v2.SSHKey> getSshKeysList() {
    return sshKeys_;
  }

  /**
   *
   *
   * <pre>
   * The SSH keys registered in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder>
      getSshKeysOrBuilderList() {
    return sshKeys_;
  }

  /**
   *
   *
   * <pre>
   * The SSH keys registered in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
   */
  @java.lang.Override
  public int getSshKeysCount() {
    return sshKeys_.size();
  }

  /**
   *
   *
   * <pre>
   * The SSH keys registered in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.SSHKey getSshKeys(int index) {
    return sshKeys_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The SSH keys registered in the project.
   * </pre>
   *
   * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder getSshKeysOrBuilder(int index) {
    return sshKeys_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 90;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 90;</code>
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
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 90;</code>
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
    for (int i = 0; i < sshKeys_.size(); i++) {
      output.writeMessage(1, sshKeys_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 90, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sshKeys_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sshKeys_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(90, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse other =
        (com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse) obj;

    if (!getSshKeysList().equals(other.getSshKeysList())) return false;
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
    if (getSshKeysCount() > 0) {
      hash = (37 * hash) + SSH_KEYS_FIELD_NUMBER;
      hash = (53 * hash) + getSshKeysList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse parseFrom(
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
      com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse prototype) {
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
   * Message for response of ListSSHKeys.
   * </pre>
   *
   * Protobuf type {@code google.cloud.baremetalsolution.v2.ListSSHKeysResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.baremetalsolution.v2.ListSSHKeysResponse)
      com.google.cloud.baremetalsolution.v2.ListSSHKeysResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.baremetalsolution.v2.SshKeyProto
          .internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.baremetalsolution.v2.SshKeyProto
          .internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.class,
              com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.Builder.class);
    }

    // Construct using com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (sshKeysBuilder_ == null) {
        sshKeys_ = java.util.Collections.emptyList();
      } else {
        sshKeys_ = null;
        sshKeysBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.baremetalsolution.v2.SshKeyProto
          .internal_static_google_cloud_baremetalsolution_v2_ListSSHKeysResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse getDefaultInstanceForType() {
      return com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse build() {
      com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse buildPartial() {
      com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse result =
          new com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse result) {
      if (sshKeysBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sshKeys_ = java.util.Collections.unmodifiableList(sshKeys_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sshKeys_ = sshKeys_;
      } else {
        result.sshKeys_ = sshKeysBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse result) {
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
      if (other instanceof com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse) {
        return mergeFrom((com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse other) {
      if (other == com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse.getDefaultInstance())
        return this;
      if (sshKeysBuilder_ == null) {
        if (!other.sshKeys_.isEmpty()) {
          if (sshKeys_.isEmpty()) {
            sshKeys_ = other.sshKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSshKeysIsMutable();
            sshKeys_.addAll(other.sshKeys_);
          }
          onChanged();
        }
      } else {
        if (!other.sshKeys_.isEmpty()) {
          if (sshKeysBuilder_.isEmpty()) {
            sshKeysBuilder_.dispose();
            sshKeysBuilder_ = null;
            sshKeys_ = other.sshKeys_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sshKeysBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSshKeysFieldBuilder()
                    : null;
          } else {
            sshKeysBuilder_.addAllMessages(other.sshKeys_);
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
                com.google.cloud.baremetalsolution.v2.SSHKey m =
                    input.readMessage(
                        com.google.cloud.baremetalsolution.v2.SSHKey.parser(), extensionRegistry);
                if (sshKeysBuilder_ == null) {
                  ensureSshKeysIsMutable();
                  sshKeys_.add(m);
                } else {
                  sshKeysBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 722:
              {
                nextPageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 722
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

    private java.util.List<com.google.cloud.baremetalsolution.v2.SSHKey> sshKeys_ =
        java.util.Collections.emptyList();

    private void ensureSshKeysIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sshKeys_ = new java.util.ArrayList<com.google.cloud.baremetalsolution.v2.SSHKey>(sshKeys_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.SSHKey,
            com.google.cloud.baremetalsolution.v2.SSHKey.Builder,
            com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder>
        sshKeysBuilder_;

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public java.util.List<com.google.cloud.baremetalsolution.v2.SSHKey> getSshKeysList() {
      if (sshKeysBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sshKeys_);
      } else {
        return sshKeysBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public int getSshKeysCount() {
      if (sshKeysBuilder_ == null) {
        return sshKeys_.size();
      } else {
        return sshKeysBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.SSHKey getSshKeys(int index) {
      if (sshKeysBuilder_ == null) {
        return sshKeys_.get(index);
      } else {
        return sshKeysBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder setSshKeys(int index, com.google.cloud.baremetalsolution.v2.SSHKey value) {
      if (sshKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSshKeysIsMutable();
        sshKeys_.set(index, value);
        onChanged();
      } else {
        sshKeysBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder setSshKeys(
        int index, com.google.cloud.baremetalsolution.v2.SSHKey.Builder builderForValue) {
      if (sshKeysBuilder_ == null) {
        ensureSshKeysIsMutable();
        sshKeys_.set(index, builderForValue.build());
        onChanged();
      } else {
        sshKeysBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder addSshKeys(com.google.cloud.baremetalsolution.v2.SSHKey value) {
      if (sshKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSshKeysIsMutable();
        sshKeys_.add(value);
        onChanged();
      } else {
        sshKeysBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder addSshKeys(int index, com.google.cloud.baremetalsolution.v2.SSHKey value) {
      if (sshKeysBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSshKeysIsMutable();
        sshKeys_.add(index, value);
        onChanged();
      } else {
        sshKeysBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder addSshKeys(
        com.google.cloud.baremetalsolution.v2.SSHKey.Builder builderForValue) {
      if (sshKeysBuilder_ == null) {
        ensureSshKeysIsMutable();
        sshKeys_.add(builderForValue.build());
        onChanged();
      } else {
        sshKeysBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder addSshKeys(
        int index, com.google.cloud.baremetalsolution.v2.SSHKey.Builder builderForValue) {
      if (sshKeysBuilder_ == null) {
        ensureSshKeysIsMutable();
        sshKeys_.add(index, builderForValue.build());
        onChanged();
      } else {
        sshKeysBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder addAllSshKeys(
        java.lang.Iterable<? extends com.google.cloud.baremetalsolution.v2.SSHKey> values) {
      if (sshKeysBuilder_ == null) {
        ensureSshKeysIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, sshKeys_);
        onChanged();
      } else {
        sshKeysBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder clearSshKeys() {
      if (sshKeysBuilder_ == null) {
        sshKeys_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sshKeysBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public Builder removeSshKeys(int index) {
      if (sshKeysBuilder_ == null) {
        ensureSshKeysIsMutable();
        sshKeys_.remove(index);
        onChanged();
      } else {
        sshKeysBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.SSHKey.Builder getSshKeysBuilder(int index) {
      return getSshKeysFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder getSshKeysOrBuilder(int index) {
      if (sshKeysBuilder_ == null) {
        return sshKeys_.get(index);
      } else {
        return sshKeysBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder>
        getSshKeysOrBuilderList() {
      if (sshKeysBuilder_ != null) {
        return sshKeysBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sshKeys_);
      }
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.SSHKey.Builder addSshKeysBuilder() {
      return getSshKeysFieldBuilder()
          .addBuilder(com.google.cloud.baremetalsolution.v2.SSHKey.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public com.google.cloud.baremetalsolution.v2.SSHKey.Builder addSshKeysBuilder(int index) {
      return getSshKeysFieldBuilder()
          .addBuilder(index, com.google.cloud.baremetalsolution.v2.SSHKey.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The SSH keys registered in the project.
     * </pre>
     *
     * <code>repeated .google.cloud.baremetalsolution.v2.SSHKey ssh_keys = 1;</code>
     */
    public java.util.List<com.google.cloud.baremetalsolution.v2.SSHKey.Builder>
        getSshKeysBuilderList() {
      return getSshKeysFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.baremetalsolution.v2.SSHKey,
            com.google.cloud.baremetalsolution.v2.SSHKey.Builder,
            com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder>
        getSshKeysFieldBuilder() {
      if (sshKeysBuilder_ == null) {
        sshKeysBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.baremetalsolution.v2.SSHKey,
                com.google.cloud.baremetalsolution.v2.SSHKey.Builder,
                com.google.cloud.baremetalsolution.v2.SSHKeyOrBuilder>(
                sshKeys_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        sshKeys_ = null;
      }
      return sshKeysBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 90;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 90;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 90;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 90;</code>
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
     * Token to retrieve the next page of results, or empty if there are no more
     * results in the list.
     * </pre>
     *
     * <code>string next_page_token = 90;</code>
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

    // @@protoc_insertion_point(builder_scope:google.cloud.baremetalsolution.v2.ListSSHKeysResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.baremetalsolution.v2.ListSSHKeysResponse)
  private static final com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse();
  }

  public static com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSSHKeysResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListSSHKeysResponse>() {
        @java.lang.Override
        public ListSSHKeysResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSSHKeysResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSSHKeysResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.baremetalsolution.v2.ListSSHKeysResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
