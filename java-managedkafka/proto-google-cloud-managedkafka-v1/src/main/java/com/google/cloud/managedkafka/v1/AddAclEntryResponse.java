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
 * Response for AddAclEntry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedkafka.v1.AddAclEntryResponse}
 */
public final class AddAclEntryResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedkafka.v1.AddAclEntryResponse)
    AddAclEntryResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AddAclEntryResponse.newBuilder() to construct.
  private AddAclEntryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddAclEntryResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddAclEntryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.managedkafka.v1.ManagedKafkaProto
        .internal_static_google_cloud_managedkafka_v1_AddAclEntryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedkafka.v1.ManagedKafkaProto
        .internal_static_google_cloud_managedkafka_v1_AddAclEntryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedkafka.v1.AddAclEntryResponse.class,
            com.google.cloud.managedkafka.v1.AddAclEntryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ACL_FIELD_NUMBER = 1;
  private com.google.cloud.managedkafka.v1.Acl acl_;

  /**
   *
   *
   * <pre>
   * The updated acl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
   *
   * @return Whether the acl field is set.
   */
  @java.lang.Override
  public boolean hasAcl() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The updated acl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
   *
   * @return The acl.
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.Acl getAcl() {
    return acl_ == null ? com.google.cloud.managedkafka.v1.Acl.getDefaultInstance() : acl_;
  }

  /**
   *
   *
   * <pre>
   * The updated acl.
   * </pre>
   *
   * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.AclOrBuilder getAclOrBuilder() {
    return acl_ == null ? com.google.cloud.managedkafka.v1.Acl.getDefaultInstance() : acl_;
  }

  public static final int ACL_CREATED_FIELD_NUMBER = 2;
  private boolean aclCreated_ = false;

  /**
   *
   *
   * <pre>
   * Whether the acl was created as a result of adding the acl entry.
   * </pre>
   *
   * <code>bool acl_created = 2;</code>
   *
   * @return The aclCreated.
   */
  @java.lang.Override
  public boolean getAclCreated() {
    return aclCreated_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getAcl());
    }
    if (aclCreated_ != false) {
      output.writeBool(2, aclCreated_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAcl());
    }
    if (aclCreated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, aclCreated_);
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
    if (!(obj instanceof com.google.cloud.managedkafka.v1.AddAclEntryResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.managedkafka.v1.AddAclEntryResponse other =
        (com.google.cloud.managedkafka.v1.AddAclEntryResponse) obj;

    if (hasAcl() != other.hasAcl()) return false;
    if (hasAcl()) {
      if (!getAcl().equals(other.getAcl())) return false;
    }
    if (getAclCreated() != other.getAclCreated()) return false;
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
    if (hasAcl()) {
      hash = (37 * hash) + ACL_FIELD_NUMBER;
      hash = (53 * hash) + getAcl().hashCode();
    }
    hash = (37 * hash) + ACL_CREATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAclCreated());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.managedkafka.v1.AddAclEntryResponse prototype) {
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
   * Response for AddAclEntry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedkafka.v1.AddAclEntryResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedkafka.v1.AddAclEntryResponse)
      com.google.cloud.managedkafka.v1.AddAclEntryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_AddAclEntryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_AddAclEntryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedkafka.v1.AddAclEntryResponse.class,
              com.google.cloud.managedkafka.v1.AddAclEntryResponse.Builder.class);
    }

    // Construct using com.google.cloud.managedkafka.v1.AddAclEntryResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAclFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      acl_ = null;
      if (aclBuilder_ != null) {
        aclBuilder_.dispose();
        aclBuilder_ = null;
      }
      aclCreated_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.managedkafka.v1.ManagedKafkaProto
          .internal_static_google_cloud_managedkafka_v1_AddAclEntryResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AddAclEntryResponse getDefaultInstanceForType() {
      return com.google.cloud.managedkafka.v1.AddAclEntryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AddAclEntryResponse build() {
      com.google.cloud.managedkafka.v1.AddAclEntryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AddAclEntryResponse buildPartial() {
      com.google.cloud.managedkafka.v1.AddAclEntryResponse result =
          new com.google.cloud.managedkafka.v1.AddAclEntryResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.managedkafka.v1.AddAclEntryResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acl_ = aclBuilder_ == null ? acl_ : aclBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.aclCreated_ = aclCreated_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.managedkafka.v1.AddAclEntryResponse) {
        return mergeFrom((com.google.cloud.managedkafka.v1.AddAclEntryResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedkafka.v1.AddAclEntryResponse other) {
      if (other == com.google.cloud.managedkafka.v1.AddAclEntryResponse.getDefaultInstance())
        return this;
      if (other.hasAcl()) {
        mergeAcl(other.getAcl());
      }
      if (other.getAclCreated() != false) {
        setAclCreated(other.getAclCreated());
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
                input.readMessage(getAclFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                aclCreated_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.cloud.managedkafka.v1.Acl acl_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedkafka.v1.Acl,
            com.google.cloud.managedkafka.v1.Acl.Builder,
            com.google.cloud.managedkafka.v1.AclOrBuilder>
        aclBuilder_;

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     *
     * @return Whether the acl field is set.
     */
    public boolean hasAcl() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     *
     * @return The acl.
     */
    public com.google.cloud.managedkafka.v1.Acl getAcl() {
      if (aclBuilder_ == null) {
        return acl_ == null ? com.google.cloud.managedkafka.v1.Acl.getDefaultInstance() : acl_;
      } else {
        return aclBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public Builder setAcl(com.google.cloud.managedkafka.v1.Acl value) {
      if (aclBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        acl_ = value;
      } else {
        aclBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public Builder setAcl(com.google.cloud.managedkafka.v1.Acl.Builder builderForValue) {
      if (aclBuilder_ == null) {
        acl_ = builderForValue.build();
      } else {
        aclBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public Builder mergeAcl(com.google.cloud.managedkafka.v1.Acl value) {
      if (aclBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && acl_ != null
            && acl_ != com.google.cloud.managedkafka.v1.Acl.getDefaultInstance()) {
          getAclBuilder().mergeFrom(value);
        } else {
          acl_ = value;
        }
      } else {
        aclBuilder_.mergeFrom(value);
      }
      if (acl_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public Builder clearAcl() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acl_ = null;
      if (aclBuilder_ != null) {
        aclBuilder_.dispose();
        aclBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.Acl.Builder getAclBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAclFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    public com.google.cloud.managedkafka.v1.AclOrBuilder getAclOrBuilder() {
      if (aclBuilder_ != null) {
        return aclBuilder_.getMessageOrBuilder();
      } else {
        return acl_ == null ? com.google.cloud.managedkafka.v1.Acl.getDefaultInstance() : acl_;
      }
    }

    /**
     *
     *
     * <pre>
     * The updated acl.
     * </pre>
     *
     * <code>.google.cloud.managedkafka.v1.Acl acl = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedkafka.v1.Acl,
            com.google.cloud.managedkafka.v1.Acl.Builder,
            com.google.cloud.managedkafka.v1.AclOrBuilder>
        getAclFieldBuilder() {
      if (aclBuilder_ == null) {
        aclBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.managedkafka.v1.Acl,
                com.google.cloud.managedkafka.v1.Acl.Builder,
                com.google.cloud.managedkafka.v1.AclOrBuilder>(
                getAcl(), getParentForChildren(), isClean());
        acl_ = null;
      }
      return aclBuilder_;
    }

    private boolean aclCreated_;

    /**
     *
     *
     * <pre>
     * Whether the acl was created as a result of adding the acl entry.
     * </pre>
     *
     * <code>bool acl_created = 2;</code>
     *
     * @return The aclCreated.
     */
    @java.lang.Override
    public boolean getAclCreated() {
      return aclCreated_;
    }

    /**
     *
     *
     * <pre>
     * Whether the acl was created as a result of adding the acl entry.
     * </pre>
     *
     * <code>bool acl_created = 2;</code>
     *
     * @param value The aclCreated to set.
     * @return This builder for chaining.
     */
    public Builder setAclCreated(boolean value) {

      aclCreated_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether the acl was created as a result of adding the acl entry.
     * </pre>
     *
     * <code>bool acl_created = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAclCreated() {
      bitField0_ = (bitField0_ & ~0x00000002);
      aclCreated_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.managedkafka.v1.AddAclEntryResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedkafka.v1.AddAclEntryResponse)
  private static final com.google.cloud.managedkafka.v1.AddAclEntryResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedkafka.v1.AddAclEntryResponse();
  }

  public static com.google.cloud.managedkafka.v1.AddAclEntryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddAclEntryResponse> PARSER =
      new com.google.protobuf.AbstractParser<AddAclEntryResponse>() {
        @java.lang.Override
        public AddAclEntryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddAclEntryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddAclEntryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedkafka.v1.AddAclEntryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
