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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Options to configure rule type SetTablePrimaryKey.
 * The rule is used to specify the columns and name to configure/alter the
 * primary key of a table.
 *
 * The rule filter field can refer to one entity.
 *
 * The rule scope can be one of: Table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SetTablePrimaryKey}
 */
public final class SetTablePrimaryKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SetTablePrimaryKey)
    SetTablePrimaryKeyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SetTablePrimaryKey.newBuilder() to construct.
  private SetTablePrimaryKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SetTablePrimaryKey() {
    primaryKeyColumns_ = com.google.protobuf.LazyStringArrayList.emptyList();
    primaryKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SetTablePrimaryKey();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SetTablePrimaryKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SetTablePrimaryKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SetTablePrimaryKey.class,
            com.google.cloud.clouddms.v1.SetTablePrimaryKey.Builder.class);
  }

  public static final int PRIMARY_KEY_COLUMNS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList primaryKeyColumns_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Required. List of column names for the primary key
   * </pre>
   *
   * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the primaryKeyColumns.
   */
  public com.google.protobuf.ProtocolStringList getPrimaryKeyColumnsList() {
    return primaryKeyColumns_;
  }

  /**
   *
   *
   * <pre>
   * Required. List of column names for the primary key
   * </pre>
   *
   * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of primaryKeyColumns.
   */
  public int getPrimaryKeyColumnsCount() {
    return primaryKeyColumns_.size();
  }

  /**
   *
   *
   * <pre>
   * Required. List of column names for the primary key
   * </pre>
   *
   * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The primaryKeyColumns at the given index.
   */
  public java.lang.String getPrimaryKeyColumns(int index) {
    return primaryKeyColumns_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Required. List of column names for the primary key
   * </pre>
   *
   * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the primaryKeyColumns at the given index.
   */
  public com.google.protobuf.ByteString getPrimaryKeyColumnsBytes(int index) {
    return primaryKeyColumns_.getByteString(index);
  }

  public static final int PRIMARY_KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object primaryKey_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Name for the primary key
   * </pre>
   *
   * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The primaryKey.
   */
  @java.lang.Override
  public java.lang.String getPrimaryKey() {
    java.lang.Object ref = primaryKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primaryKey_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Name for the primary key
   * </pre>
   *
   * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for primaryKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrimaryKeyBytes() {
    java.lang.Object ref = primaryKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      primaryKey_ = b;
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
    for (int i = 0; i < primaryKeyColumns_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, primaryKeyColumns_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, primaryKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < primaryKeyColumns_.size(); i++) {
        dataSize += computeStringSizeNoTag(primaryKeyColumns_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPrimaryKeyColumnsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, primaryKey_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SetTablePrimaryKey)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SetTablePrimaryKey other =
        (com.google.cloud.clouddms.v1.SetTablePrimaryKey) obj;

    if (!getPrimaryKeyColumnsList().equals(other.getPrimaryKeyColumnsList())) return false;
    if (!getPrimaryKey().equals(other.getPrimaryKey())) return false;
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
    if (getPrimaryKeyColumnsCount() > 0) {
      hash = (37 * hash) + PRIMARY_KEY_COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getPrimaryKeyColumnsList().hashCode();
    }
    hash = (37 * hash) + PRIMARY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.SetTablePrimaryKey prototype) {
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
   * Options to configure rule type SetTablePrimaryKey.
   * The rule is used to specify the columns and name to configure/alter the
   * primary key of a table.
   *
   * The rule filter field can refer to one entity.
   *
   * The rule scope can be one of: Table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SetTablePrimaryKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SetTablePrimaryKey)
      com.google.cloud.clouddms.v1.SetTablePrimaryKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SetTablePrimaryKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SetTablePrimaryKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SetTablePrimaryKey.class,
              com.google.cloud.clouddms.v1.SetTablePrimaryKey.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SetTablePrimaryKey.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      primaryKeyColumns_ = com.google.protobuf.LazyStringArrayList.emptyList();
      primaryKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SetTablePrimaryKey_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SetTablePrimaryKey getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SetTablePrimaryKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SetTablePrimaryKey build() {
      com.google.cloud.clouddms.v1.SetTablePrimaryKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SetTablePrimaryKey buildPartial() {
      com.google.cloud.clouddms.v1.SetTablePrimaryKey result =
          new com.google.cloud.clouddms.v1.SetTablePrimaryKey(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.SetTablePrimaryKey result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        primaryKeyColumns_.makeImmutable();
        result.primaryKeyColumns_ = primaryKeyColumns_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.primaryKey_ = primaryKey_;
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
      if (other instanceof com.google.cloud.clouddms.v1.SetTablePrimaryKey) {
        return mergeFrom((com.google.cloud.clouddms.v1.SetTablePrimaryKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SetTablePrimaryKey other) {
      if (other == com.google.cloud.clouddms.v1.SetTablePrimaryKey.getDefaultInstance())
        return this;
      if (!other.primaryKeyColumns_.isEmpty()) {
        if (primaryKeyColumns_.isEmpty()) {
          primaryKeyColumns_ = other.primaryKeyColumns_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePrimaryKeyColumnsIsMutable();
          primaryKeyColumns_.addAll(other.primaryKeyColumns_);
        }
        onChanged();
      }
      if (!other.getPrimaryKey().isEmpty()) {
        primaryKey_ = other.primaryKey_;
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
                java.lang.String s = input.readStringRequireUtf8();
                ensurePrimaryKeyColumnsIsMutable();
                primaryKeyColumns_.add(s);
                break;
              } // case 10
            case 18:
              {
                primaryKey_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.LazyStringArrayList primaryKeyColumns_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePrimaryKeyColumnsIsMutable() {
      if (!primaryKeyColumns_.isModifiable()) {
        primaryKeyColumns_ = new com.google.protobuf.LazyStringArrayList(primaryKeyColumns_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return A list containing the primaryKeyColumns.
     */
    public com.google.protobuf.ProtocolStringList getPrimaryKeyColumnsList() {
      primaryKeyColumns_.makeImmutable();
      return primaryKeyColumns_;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The count of primaryKeyColumns.
     */
    public int getPrimaryKeyColumnsCount() {
      return primaryKeyColumns_.size();
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The primaryKeyColumns at the given index.
     */
    public java.lang.String getPrimaryKeyColumns(int index) {
      return primaryKeyColumns_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the primaryKeyColumns at the given index.
     */
    public com.google.protobuf.ByteString getPrimaryKeyColumnsBytes(int index) {
      return primaryKeyColumns_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The primaryKeyColumns to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKeyColumns(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePrimaryKeyColumnsIsMutable();
      primaryKeyColumns_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The primaryKeyColumns to add.
     * @return This builder for chaining.
     */
    public Builder addPrimaryKeyColumns(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePrimaryKeyColumnsIsMutable();
      primaryKeyColumns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param values The primaryKeyColumns to add.
     * @return This builder for chaining.
     */
    public Builder addAllPrimaryKeyColumns(java.lang.Iterable<java.lang.String> values) {
      ensurePrimaryKeyColumnsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, primaryKeyColumns_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKeyColumns() {
      primaryKeyColumns_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of column names for the primary key
     * </pre>
     *
     * <code>repeated string primary_key_columns = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The bytes of the primaryKeyColumns to add.
     * @return This builder for chaining.
     */
    public Builder addPrimaryKeyColumnsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePrimaryKeyColumnsIsMutable();
      primaryKeyColumns_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object primaryKey_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Name for the primary key
     * </pre>
     *
     * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The primaryKey.
     */
    public java.lang.String getPrimaryKey() {
      java.lang.Object ref = primaryKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primaryKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Name for the primary key
     * </pre>
     *
     * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for primaryKey.
     */
    public com.google.protobuf.ByteString getPrimaryKeyBytes() {
      java.lang.Object ref = primaryKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        primaryKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Name for the primary key
     * </pre>
     *
     * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      primaryKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Name for the primary key
     * </pre>
     *
     * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryKey() {
      primaryKey_ = getDefaultInstance().getPrimaryKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Name for the primary key
     * </pre>
     *
     * <code>string primary_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for primaryKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      primaryKey_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SetTablePrimaryKey)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SetTablePrimaryKey)
  private static final com.google.cloud.clouddms.v1.SetTablePrimaryKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SetTablePrimaryKey();
  }

  public static com.google.cloud.clouddms.v1.SetTablePrimaryKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetTablePrimaryKey> PARSER =
      new com.google.protobuf.AbstractParser<SetTablePrimaryKey>() {
        @java.lang.Override
        public SetTablePrimaryKey parsePartialFrom(
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

  public static com.google.protobuf.Parser<SetTablePrimaryKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetTablePrimaryKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SetTablePrimaryKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
