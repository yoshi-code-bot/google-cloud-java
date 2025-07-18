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
// source: google/cloud/licensemanager/v1/api_entities.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.licensemanager.v1;

/**
 *
 *
 * <pre>
 * Message describing total counts of users who accessed a VM.
 * </pre>
 *
 * Protobuf type {@code google.cloud.licensemanager.v1.Usage}
 */
public final class Usage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.licensemanager.v1.Usage)
    UsageOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Usage.newBuilder() to construct.
  private Usage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Usage() {
    limaInstance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Usage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.licensemanager.v1.ApiEntitiesProto
        .internal_static_google_cloud_licensemanager_v1_Usage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.licensemanager.v1.ApiEntitiesProto
        .internal_static_google_cloud_licensemanager_v1_Usage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.licensemanager.v1.Usage.class,
            com.google.cloud.licensemanager.v1.Usage.Builder.class);
  }

  public static final int LIMA_INSTANCE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object limaInstance_ = "";

  /**
   *
   *
   * <pre>
   * LiMa Instance resource name, i.e.
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The limaInstance.
   */
  @java.lang.Override
  public java.lang.String getLimaInstance() {
    java.lang.Object ref = limaInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      limaInstance_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * LiMa Instance resource name, i.e.
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for limaInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLimaInstanceBytes() {
    java.lang.Object ref = limaInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      limaInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERS_FIELD_NUMBER = 2;
  private int users_ = 0;

  /**
   *
   *
   * <pre>
   * Number of unique users accessing the VM.
   * </pre>
   *
   * <code>int32 users = 2;</code>
   *
   * @return The users.
   */
  @java.lang.Override
  public int getUsers() {
    return users_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(limaInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, limaInstance_);
    }
    if (users_ != 0) {
      output.writeInt32(2, users_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(limaInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, limaInstance_);
    }
    if (users_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, users_);
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
    if (!(obj instanceof com.google.cloud.licensemanager.v1.Usage)) {
      return super.equals(obj);
    }
    com.google.cloud.licensemanager.v1.Usage other = (com.google.cloud.licensemanager.v1.Usage) obj;

    if (!getLimaInstance().equals(other.getLimaInstance())) return false;
    if (getUsers() != other.getUsers()) return false;
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
    hash = (37 * hash) + LIMA_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getLimaInstance().hashCode();
    hash = (37 * hash) + USERS_FIELD_NUMBER;
    hash = (53 * hash) + getUsers();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.licensemanager.v1.Usage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.licensemanager.v1.Usage prototype) {
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
   * Message describing total counts of users who accessed a VM.
   * </pre>
   *
   * Protobuf type {@code google.cloud.licensemanager.v1.Usage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.licensemanager.v1.Usage)
      com.google.cloud.licensemanager.v1.UsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.licensemanager.v1.ApiEntitiesProto
          .internal_static_google_cloud_licensemanager_v1_Usage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.licensemanager.v1.ApiEntitiesProto
          .internal_static_google_cloud_licensemanager_v1_Usage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.licensemanager.v1.Usage.class,
              com.google.cloud.licensemanager.v1.Usage.Builder.class);
    }

    // Construct using com.google.cloud.licensemanager.v1.Usage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      limaInstance_ = "";
      users_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.licensemanager.v1.ApiEntitiesProto
          .internal_static_google_cloud_licensemanager_v1_Usage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.licensemanager.v1.Usage getDefaultInstanceForType() {
      return com.google.cloud.licensemanager.v1.Usage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.licensemanager.v1.Usage build() {
      com.google.cloud.licensemanager.v1.Usage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.licensemanager.v1.Usage buildPartial() {
      com.google.cloud.licensemanager.v1.Usage result =
          new com.google.cloud.licensemanager.v1.Usage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.licensemanager.v1.Usage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.limaInstance_ = limaInstance_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.users_ = users_;
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
      if (other instanceof com.google.cloud.licensemanager.v1.Usage) {
        return mergeFrom((com.google.cloud.licensemanager.v1.Usage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.licensemanager.v1.Usage other) {
      if (other == com.google.cloud.licensemanager.v1.Usage.getDefaultInstance()) return this;
      if (!other.getLimaInstance().isEmpty()) {
        limaInstance_ = other.limaInstance_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUsers() != 0) {
        setUsers(other.getUsers());
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
                limaInstance_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                users_ = input.readInt32();
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

    private java.lang.Object limaInstance_ = "";

    /**
     *
     *
     * <pre>
     * LiMa Instance resource name, i.e.
     * projects/{project}/locations/{location}/instances/{instance}
     * </pre>
     *
     * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The limaInstance.
     */
    public java.lang.String getLimaInstance() {
      java.lang.Object ref = limaInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        limaInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * LiMa Instance resource name, i.e.
     * projects/{project}/locations/{location}/instances/{instance}
     * </pre>
     *
     * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for limaInstance.
     */
    public com.google.protobuf.ByteString getLimaInstanceBytes() {
      java.lang.Object ref = limaInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        limaInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * LiMa Instance resource name, i.e.
     * projects/{project}/locations/{location}/instances/{instance}
     * </pre>
     *
     * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The limaInstance to set.
     * @return This builder for chaining.
     */
    public Builder setLimaInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      limaInstance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * LiMa Instance resource name, i.e.
     * projects/{project}/locations/{location}/instances/{instance}
     * </pre>
     *
     * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLimaInstance() {
      limaInstance_ = getDefaultInstance().getLimaInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * LiMa Instance resource name, i.e.
     * projects/{project}/locations/{location}/instances/{instance}
     * </pre>
     *
     * <code>string lima_instance = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for limaInstance to set.
     * @return This builder for chaining.
     */
    public Builder setLimaInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      limaInstance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int users_;

    /**
     *
     *
     * <pre>
     * Number of unique users accessing the VM.
     * </pre>
     *
     * <code>int32 users = 2;</code>
     *
     * @return The users.
     */
    @java.lang.Override
    public int getUsers() {
      return users_;
    }

    /**
     *
     *
     * <pre>
     * Number of unique users accessing the VM.
     * </pre>
     *
     * <code>int32 users = 2;</code>
     *
     * @param value The users to set.
     * @return This builder for chaining.
     */
    public Builder setUsers(int value) {

      users_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Number of unique users accessing the VM.
     * </pre>
     *
     * <code>int32 users = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsers() {
      bitField0_ = (bitField0_ & ~0x00000002);
      users_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.licensemanager.v1.Usage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.licensemanager.v1.Usage)
  private static final com.google.cloud.licensemanager.v1.Usage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.licensemanager.v1.Usage();
  }

  public static com.google.cloud.licensemanager.v1.Usage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Usage> PARSER =
      new com.google.protobuf.AbstractParser<Usage>() {
        @java.lang.Override
        public Usage parsePartialFrom(
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

  public static com.google.protobuf.Parser<Usage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Usage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.licensemanager.v1.Usage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
