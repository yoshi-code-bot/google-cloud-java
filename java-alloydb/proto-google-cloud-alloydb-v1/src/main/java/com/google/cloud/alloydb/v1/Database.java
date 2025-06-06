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
// source: google/cloud/alloydb/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * Message describing Database object.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.v1.Database}
 */
public final class Database extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.v1.Database)
    DatabaseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Database.newBuilder() to construct.
  private Database(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Database() {
    name_ = "";
    charset_ = "";
    collation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Database();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_Database_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.v1.ResourcesProto
        .internal_static_google_cloud_alloydb_v1_Database_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.v1.Database.class,
            com.google.cloud.alloydb.v1.Database.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Identifier. Name of the resource in the form of
   * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Identifier. Name of the resource in the form of
   * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHARSET_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object charset_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Charset for the database.
   * This field can contain any PostgreSQL supported charset name.
   * Example values include "UTF8", "SQL_ASCII", etc.
   * </pre>
   *
   * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The charset.
   */
  @java.lang.Override
  public java.lang.String getCharset() {
    java.lang.Object ref = charset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      charset_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Charset for the database.
   * This field can contain any PostgreSQL supported charset name.
   * Example values include "UTF8", "SQL_ASCII", etc.
   * </pre>
   *
   * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for charset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCharsetBytes() {
    java.lang.Object ref = charset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      charset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLLATION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object collation_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Collation for the database.
   * Name of the custom or native collation for postgres.
   * Example values include "C", "POSIX", etc
   * </pre>
   *
   * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The collation.
   */
  @java.lang.Override
  public java.lang.String getCollation() {
    java.lang.Object ref = collation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collation_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Collation for the database.
   * Name of the custom or native collation for postgres.
   * Example values include "C", "POSIX", etc
   * </pre>
   *
   * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for collation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCollationBytes() {
    java.lang.Object ref = collation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      collation_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(charset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, charset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, collation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(charset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, charset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, collation_);
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
    if (!(obj instanceof com.google.cloud.alloydb.v1.Database)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.v1.Database other = (com.google.cloud.alloydb.v1.Database) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCharset().equals(other.getCharset())) return false;
    if (!getCollation().equals(other.getCollation())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CHARSET_FIELD_NUMBER;
    hash = (53 * hash) + getCharset().hashCode();
    hash = (37 * hash) + COLLATION_FIELD_NUMBER;
    hash = (53 * hash) + getCollation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.Database parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.Database parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.v1.Database parseFrom(
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

  public static Builder newBuilder(com.google.cloud.alloydb.v1.Database prototype) {
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
   * Message describing Database object.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.v1.Database}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.v1.Database)
      com.google.cloud.alloydb.v1.DatabaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_Database_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_Database_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.v1.Database.class,
              com.google.cloud.alloydb.v1.Database.Builder.class);
    }

    // Construct using com.google.cloud.alloydb.v1.Database.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      charset_ = "";
      collation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.v1.ResourcesProto
          .internal_static_google_cloud_alloydb_v1_Database_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.Database getDefaultInstanceForType() {
      return com.google.cloud.alloydb.v1.Database.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.Database build() {
      com.google.cloud.alloydb.v1.Database result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.v1.Database buildPartial() {
      com.google.cloud.alloydb.v1.Database result = new com.google.cloud.alloydb.v1.Database(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.alloydb.v1.Database result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.charset_ = charset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.collation_ = collation_;
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
      if (other instanceof com.google.cloud.alloydb.v1.Database) {
        return mergeFrom((com.google.cloud.alloydb.v1.Database) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.alloydb.v1.Database other) {
      if (other == com.google.cloud.alloydb.v1.Database.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCharset().isEmpty()) {
        charset_ = other.charset_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getCollation().isEmpty()) {
        collation_ = other.collation_;
        bitField0_ |= 0x00000004;
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                charset_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                collation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Identifier. Name of the resource in the form of
     * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Identifier. Name of the resource in the form of
     * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Identifier. Name of the resource in the form of
     * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Identifier. Name of the resource in the form of
     * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Identifier. Name of the resource in the form of
     * `projects/{project}/locations/{location}/clusters/{cluster}/databases/{database}`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object charset_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Charset for the database.
     * This field can contain any PostgreSQL supported charset name.
     * Example values include "UTF8", "SQL_ASCII", etc.
     * </pre>
     *
     * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The charset.
     */
    public java.lang.String getCharset() {
      java.lang.Object ref = charset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        charset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Charset for the database.
     * This field can contain any PostgreSQL supported charset name.
     * Example values include "UTF8", "SQL_ASCII", etc.
     * </pre>
     *
     * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for charset.
     */
    public com.google.protobuf.ByteString getCharsetBytes() {
      java.lang.Object ref = charset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        charset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Charset for the database.
     * This field can contain any PostgreSQL supported charset name.
     * Example values include "UTF8", "SQL_ASCII", etc.
     * </pre>
     *
     * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The charset to set.
     * @return This builder for chaining.
     */
    public Builder setCharset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      charset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Charset for the database.
     * This field can contain any PostgreSQL supported charset name.
     * Example values include "UTF8", "SQL_ASCII", etc.
     * </pre>
     *
     * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCharset() {
      charset_ = getDefaultInstance().getCharset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Charset for the database.
     * This field can contain any PostgreSQL supported charset name.
     * Example values include "UTF8", "SQL_ASCII", etc.
     * </pre>
     *
     * <code>string charset = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for charset to set.
     * @return This builder for chaining.
     */
    public Builder setCharsetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      charset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object collation_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Collation for the database.
     * Name of the custom or native collation for postgres.
     * Example values include "C", "POSIX", etc
     * </pre>
     *
     * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The collation.
     */
    public java.lang.String getCollation() {
      java.lang.Object ref = collation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Collation for the database.
     * Name of the custom or native collation for postgres.
     * Example values include "C", "POSIX", etc
     * </pre>
     *
     * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for collation.
     */
    public com.google.protobuf.ByteString getCollationBytes() {
      java.lang.Object ref = collation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        collation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Collation for the database.
     * Name of the custom or native collation for postgres.
     * Example values include "C", "POSIX", etc
     * </pre>
     *
     * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The collation to set.
     * @return This builder for chaining.
     */
    public Builder setCollation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      collation_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Collation for the database.
     * Name of the custom or native collation for postgres.
     * Example values include "C", "POSIX", etc
     * </pre>
     *
     * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCollation() {
      collation_ = getDefaultInstance().getCollation();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Collation for the database.
     * Name of the custom or native collation for postgres.
     * Example values include "C", "POSIX", etc
     * </pre>
     *
     * <code>string collation = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for collation to set.
     * @return This builder for chaining.
     */
    public Builder setCollationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      collation_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.v1.Database)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.v1.Database)
  private static final com.google.cloud.alloydb.v1.Database DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.v1.Database();
  }

  public static com.google.cloud.alloydb.v1.Database getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Database> PARSER =
      new com.google.protobuf.AbstractParser<Database>() {
        @java.lang.Override
        public Database parsePartialFrom(
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

  public static com.google.protobuf.Parser<Database> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Database> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.v1.Database getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
