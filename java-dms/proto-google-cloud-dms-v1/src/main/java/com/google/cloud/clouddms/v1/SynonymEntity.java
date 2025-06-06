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
 * Synonym's parent is a schema.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.SynonymEntity}
 */
public final class SynonymEntity extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.SynonymEntity)
    SynonymEntityOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SynonymEntity.newBuilder() to construct.
  private SynonymEntity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SynonymEntity() {
    sourceEntity_ = "";
    sourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SynonymEntity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SynonymEntity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_SynonymEntity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.SynonymEntity.class,
            com.google.cloud.clouddms.v1.SynonymEntity.Builder.class);
  }

  private int bitField0_;
  public static final int SOURCE_ENTITY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceEntity_ = "";

  /**
   *
   *
   * <pre>
   * The name of the entity for which the synonym is being created (the source).
   * </pre>
   *
   * <code>string source_entity = 1;</code>
   *
   * @return The sourceEntity.
   */
  @java.lang.Override
  public java.lang.String getSourceEntity() {
    java.lang.Object ref = sourceEntity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceEntity_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The name of the entity for which the synonym is being created (the source).
   * </pre>
   *
   * <code>string source_entity = 1;</code>
   *
   * @return The bytes for sourceEntity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceEntityBytes() {
    java.lang.Object ref = sourceEntity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceEntity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_TYPE_FIELD_NUMBER = 2;
  private int sourceType_ = 0;

  /**
   *
   *
   * <pre>
   * The type of the entity for which the synonym is being created
   * (usually a table or a sequence).
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  @java.lang.Override
  public int getSourceTypeValue() {
    return sourceType_;
  }

  /**
   *
   *
   * <pre>
   * The type of the entity for which the synonym is being created
   * (usually a table or a sequence).
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
   *
   * @return The sourceType.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.DatabaseEntityType getSourceType() {
    com.google.cloud.clouddms.v1.DatabaseEntityType result =
        com.google.cloud.clouddms.v1.DatabaseEntityType.forNumber(sourceType_);
    return result == null ? com.google.cloud.clouddms.v1.DatabaseEntityType.UNRECOGNIZED : result;
  }

  public static final int CUSTOM_FEATURES_FIELD_NUMBER = 3;
  private com.google.protobuf.Struct customFeatures_;

  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 3;</code>
   *
   * @return Whether the customFeatures field is set.
   */
  @java.lang.Override
  public boolean hasCustomFeatures() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 3;</code>
   *
   * @return The customFeatures.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getCustomFeatures() {
    return customFeatures_ == null
        ? com.google.protobuf.Struct.getDefaultInstance()
        : customFeatures_;
  }

  /**
   *
   *
   * <pre>
   * Custom engine specific features.
   * </pre>
   *
   * <code>.google.protobuf.Struct custom_features = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder() {
    return customFeatures_ == null
        ? com.google.protobuf.Struct.getDefaultInstance()
        : customFeatures_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceEntity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceEntity_);
    }
    if (sourceType_
        != com.google.cloud.clouddms.v1.DatabaseEntityType.DATABASE_ENTITY_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, sourceType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getCustomFeatures());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceEntity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceEntity_);
    }
    if (sourceType_
        != com.google.cloud.clouddms.v1.DatabaseEntityType.DATABASE_ENTITY_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, sourceType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCustomFeatures());
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.SynonymEntity)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.SynonymEntity other =
        (com.google.cloud.clouddms.v1.SynonymEntity) obj;

    if (!getSourceEntity().equals(other.getSourceEntity())) return false;
    if (sourceType_ != other.sourceType_) return false;
    if (hasCustomFeatures() != other.hasCustomFeatures()) return false;
    if (hasCustomFeatures()) {
      if (!getCustomFeatures().equals(other.getCustomFeatures())) return false;
    }
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
    hash = (37 * hash) + SOURCE_ENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getSourceEntity().hashCode();
    hash = (37 * hash) + SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + sourceType_;
    if (hasCustomFeatures()) {
      hash = (37 * hash) + CUSTOM_FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getCustomFeatures().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.SynonymEntity prototype) {
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
   * Synonym's parent is a schema.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.SynonymEntity}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.SynonymEntity)
      com.google.cloud.clouddms.v1.SynonymEntityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SynonymEntity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SynonymEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.SynonymEntity.class,
              com.google.cloud.clouddms.v1.SynonymEntity.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.SynonymEntity.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCustomFeaturesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceEntity_ = "";
      sourceType_ = 0;
      customFeatures_ = null;
      if (customFeaturesBuilder_ != null) {
        customFeaturesBuilder_.dispose();
        customFeaturesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_SynonymEntity_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SynonymEntity getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.SynonymEntity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SynonymEntity build() {
      com.google.cloud.clouddms.v1.SynonymEntity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.SynonymEntity buildPartial() {
      com.google.cloud.clouddms.v1.SynonymEntity result =
          new com.google.cloud.clouddms.v1.SynonymEntity(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.SynonymEntity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceEntity_ = sourceEntity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceType_ = sourceType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customFeatures_ =
            customFeaturesBuilder_ == null ? customFeatures_ : customFeaturesBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.clouddms.v1.SynonymEntity) {
        return mergeFrom((com.google.cloud.clouddms.v1.SynonymEntity) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.SynonymEntity other) {
      if (other == com.google.cloud.clouddms.v1.SynonymEntity.getDefaultInstance()) return this;
      if (!other.getSourceEntity().isEmpty()) {
        sourceEntity_ = other.sourceEntity_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.sourceType_ != 0) {
        setSourceTypeValue(other.getSourceTypeValue());
      }
      if (other.hasCustomFeatures()) {
        mergeCustomFeatures(other.getCustomFeatures());
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
                sourceEntity_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                sourceType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getCustomFeaturesFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object sourceEntity_ = "";

    /**
     *
     *
     * <pre>
     * The name of the entity for which the synonym is being created (the source).
     * </pre>
     *
     * <code>string source_entity = 1;</code>
     *
     * @return The sourceEntity.
     */
    public java.lang.String getSourceEntity() {
      java.lang.Object ref = sourceEntity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceEntity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the entity for which the synonym is being created (the source).
     * </pre>
     *
     * <code>string source_entity = 1;</code>
     *
     * @return The bytes for sourceEntity.
     */
    public com.google.protobuf.ByteString getSourceEntityBytes() {
      java.lang.Object ref = sourceEntity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceEntity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The name of the entity for which the synonym is being created (the source).
     * </pre>
     *
     * <code>string source_entity = 1;</code>
     *
     * @param value The sourceEntity to set.
     * @return This builder for chaining.
     */
    public Builder setSourceEntity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceEntity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the entity for which the synonym is being created (the source).
     * </pre>
     *
     * <code>string source_entity = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceEntity() {
      sourceEntity_ = getDefaultInstance().getSourceEntity();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The name of the entity for which the synonym is being created (the source).
     * </pre>
     *
     * <code>string source_entity = 1;</code>
     *
     * @param value The bytes for sourceEntity to set.
     * @return This builder for chaining.
     */
    public Builder setSourceEntityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceEntity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int sourceType_ = 0;

    /**
     *
     *
     * <pre>
     * The type of the entity for which the synonym is being created
     * (usually a table or a sequence).
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
     *
     * @return The enum numeric value on the wire for sourceType.
     */
    @java.lang.Override
    public int getSourceTypeValue() {
      return sourceType_;
    }

    /**
     *
     *
     * <pre>
     * The type of the entity for which the synonym is being created
     * (usually a table or a sequence).
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTypeValue(int value) {
      sourceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The type of the entity for which the synonym is being created
     * (usually a table or a sequence).
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
     *
     * @return The sourceType.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.v1.DatabaseEntityType getSourceType() {
      com.google.cloud.clouddms.v1.DatabaseEntityType result =
          com.google.cloud.clouddms.v1.DatabaseEntityType.forNumber(sourceType_);
      return result == null ? com.google.cloud.clouddms.v1.DatabaseEntityType.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * The type of the entity for which the synonym is being created
     * (usually a table or a sequence).
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
     *
     * @param value The sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceType(com.google.cloud.clouddms.v1.DatabaseEntityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      sourceType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The type of the entity for which the synonym is being created
     * (usually a table or a sequence).
     * </pre>
     *
     * <code>.google.cloud.clouddms.v1.DatabaseEntityType source_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sourceType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct customFeatures_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        customFeaturesBuilder_;

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     *
     * @return Whether the customFeatures field is set.
     */
    public boolean hasCustomFeatures() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     *
     * @return The customFeatures.
     */
    public com.google.protobuf.Struct getCustomFeatures() {
      if (customFeaturesBuilder_ == null) {
        return customFeatures_ == null
            ? com.google.protobuf.Struct.getDefaultInstance()
            : customFeatures_;
      } else {
        return customFeaturesBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public Builder setCustomFeatures(com.google.protobuf.Struct value) {
      if (customFeaturesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customFeatures_ = value;
      } else {
        customFeaturesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public Builder setCustomFeatures(com.google.protobuf.Struct.Builder builderForValue) {
      if (customFeaturesBuilder_ == null) {
        customFeatures_ = builderForValue.build();
      } else {
        customFeaturesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public Builder mergeCustomFeatures(com.google.protobuf.Struct value) {
      if (customFeaturesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && customFeatures_ != null
            && customFeatures_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getCustomFeaturesBuilder().mergeFrom(value);
        } else {
          customFeatures_ = value;
        }
      } else {
        customFeaturesBuilder_.mergeFrom(value);
      }
      if (customFeatures_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public Builder clearCustomFeatures() {
      bitField0_ = (bitField0_ & ~0x00000004);
      customFeatures_ = null;
      if (customFeaturesBuilder_ != null) {
        customFeaturesBuilder_.dispose();
        customFeaturesBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public com.google.protobuf.Struct.Builder getCustomFeaturesBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCustomFeaturesFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    public com.google.protobuf.StructOrBuilder getCustomFeaturesOrBuilder() {
      if (customFeaturesBuilder_ != null) {
        return customFeaturesBuilder_.getMessageOrBuilder();
      } else {
        return customFeatures_ == null
            ? com.google.protobuf.Struct.getDefaultInstance()
            : customFeatures_;
      }
    }

    /**
     *
     *
     * <pre>
     * Custom engine specific features.
     * </pre>
     *
     * <code>.google.protobuf.Struct custom_features = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getCustomFeaturesFieldBuilder() {
      if (customFeaturesBuilder_ == null) {
        customFeaturesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getCustomFeatures(), getParentForChildren(), isClean());
        customFeatures_ = null;
      }
      return customFeaturesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.SynonymEntity)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.SynonymEntity)
  private static final com.google.cloud.clouddms.v1.SynonymEntity DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.SynonymEntity();
  }

  public static com.google.cloud.clouddms.v1.SynonymEntity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SynonymEntity> PARSER =
      new com.google.protobuf.AbstractParser<SynonymEntity>() {
        @java.lang.Override
        public SynonymEntity parsePartialFrom(
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

  public static com.google.protobuf.Parser<SynonymEntity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SynonymEntity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.SynonymEntity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
