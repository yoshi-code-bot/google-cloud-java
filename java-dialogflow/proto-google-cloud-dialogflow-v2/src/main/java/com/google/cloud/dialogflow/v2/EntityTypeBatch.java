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
// source: google/cloud/dialogflow/v2/entity_type.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * This message is a wrapper around a collection of entity types.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.EntityTypeBatch}
 */
public final class EntityTypeBatch extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.EntityTypeBatch)
    EntityTypeBatchOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use EntityTypeBatch.newBuilder() to construct.
  private EntityTypeBatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EntityTypeBatch() {
    entityTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EntityTypeBatch();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.EntityTypeBatch.class,
            com.google.cloud.dialogflow.v2.EntityTypeBatch.Builder.class);
  }

  public static final int ENTITY_TYPES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.dialogflow.v2.EntityType> entityTypes_;

  /**
   *
   *
   * <pre>
   * A collection of entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.dialogflow.v2.EntityType> getEntityTypesList() {
    return entityTypes_;
  }

  /**
   *
   *
   * <pre>
   * A collection of entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
      getEntityTypesOrBuilderList() {
    return entityTypes_;
  }

  /**
   *
   *
   * <pre>
   * A collection of entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  @java.lang.Override
  public int getEntityTypesCount() {
    return entityTypes_.size();
  }

  /**
   *
   *
   * <pre>
   * A collection of entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.EntityType getEntityTypes(int index) {
    return entityTypes_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A collection of entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.EntityTypeOrBuilder getEntityTypesOrBuilder(int index) {
    return entityTypes_.get(index);
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
    for (int i = 0; i < entityTypes_.size(); i++) {
      output.writeMessage(1, entityTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entityTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entityTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.EntityTypeBatch)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.EntityTypeBatch other =
        (com.google.cloud.dialogflow.v2.EntityTypeBatch) obj;

    if (!getEntityTypesList().equals(other.getEntityTypesList())) return false;
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
    if (getEntityTypesCount() > 0) {
      hash = (37 * hash) + ENTITY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.EntityTypeBatch prototype) {
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
   * This message is a wrapper around a collection of entity types.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.EntityTypeBatch}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.EntityTypeBatch)
      com.google.cloud.dialogflow.v2.EntityTypeBatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.EntityTypeBatch.class,
              com.google.cloud.dialogflow.v2.EntityTypeBatch.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.EntityTypeBatch.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (entityTypesBuilder_ == null) {
        entityTypes_ = java.util.Collections.emptyList();
      } else {
        entityTypes_ = null;
        entityTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_EntityTypeBatch_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.EntityTypeBatch getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeBatch.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.EntityTypeBatch build() {
      com.google.cloud.dialogflow.v2.EntityTypeBatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.EntityTypeBatch buildPartial() {
      com.google.cloud.dialogflow.v2.EntityTypeBatch result =
          new com.google.cloud.dialogflow.v2.EntityTypeBatch(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.dialogflow.v2.EntityTypeBatch result) {
      if (entityTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          entityTypes_ = java.util.Collections.unmodifiableList(entityTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityTypes_ = entityTypes_;
      } else {
        result.entityTypes_ = entityTypesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.EntityTypeBatch result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.EntityTypeBatch) {
        return mergeFrom((com.google.cloud.dialogflow.v2.EntityTypeBatch) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.EntityTypeBatch other) {
      if (other == com.google.cloud.dialogflow.v2.EntityTypeBatch.getDefaultInstance()) return this;
      if (entityTypesBuilder_ == null) {
        if (!other.entityTypes_.isEmpty()) {
          if (entityTypes_.isEmpty()) {
            entityTypes_ = other.entityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityTypesIsMutable();
            entityTypes_.addAll(other.entityTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.entityTypes_.isEmpty()) {
          if (entityTypesBuilder_.isEmpty()) {
            entityTypesBuilder_.dispose();
            entityTypesBuilder_ = null;
            entityTypes_ = other.entityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entityTypesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntityTypesFieldBuilder()
                    : null;
          } else {
            entityTypesBuilder_.addAllMessages(other.entityTypes_);
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
            case 10:
              {
                com.google.cloud.dialogflow.v2.EntityType m =
                    input.readMessage(
                        com.google.cloud.dialogflow.v2.EntityType.parser(), extensionRegistry);
                if (entityTypesBuilder_ == null) {
                  ensureEntityTypesIsMutable();
                  entityTypes_.add(m);
                } else {
                  entityTypesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.dialogflow.v2.EntityType> entityTypes_ =
        java.util.Collections.emptyList();

    private void ensureEntityTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        entityTypes_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.EntityType>(entityTypes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.EntityType,
            com.google.cloud.dialogflow.v2.EntityType.Builder,
            com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        entityTypesBuilder_;

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.EntityType> getEntityTypesList() {
      if (entityTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entityTypes_);
      } else {
        return entityTypesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public int getEntityTypesCount() {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.size();
      } else {
        return entityTypesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType getEntityTypes(int index) {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.get(index);
      } else {
        return entityTypesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder setEntityTypes(int index, com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.set(index, value);
        onChanged();
      } else {
        entityTypesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder setEntityTypes(
        int index, com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.add(value);
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(int index, com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.add(index, value);
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(
        com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.add(builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(
        int index, com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addAllEntityTypes(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.EntityType> values) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityTypes_);
        onChanged();
      } else {
        entityTypesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder clearEntityTypes() {
      if (entityTypesBuilder_ == null) {
        entityTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entityTypesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder removeEntityTypes(int index) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.remove(index);
        onChanged();
      } else {
        entityTypesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder getEntityTypesBuilder(int index) {
      return getEntityTypesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityTypeOrBuilder getEntityTypesOrBuilder(int index) {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.get(index);
      } else {
        return entityTypesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        getEntityTypesOrBuilderList() {
      if (entityTypesBuilder_ != null) {
        return entityTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entityTypes_);
      }
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder addEntityTypesBuilder() {
      return getEntityTypesFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.EntityType.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder addEntityTypesBuilder(int index) {
      return getEntityTypesFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.v2.EntityType.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A collection of entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.EntityType.Builder>
        getEntityTypesBuilderList() {
      return getEntityTypesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.EntityType,
            com.google.cloud.dialogflow.v2.EntityType.Builder,
            com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        getEntityTypesFieldBuilder() {
      if (entityTypesBuilder_ == null) {
        entityTypesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.EntityType,
                com.google.cloud.dialogflow.v2.EntityType.Builder,
                com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>(
                entityTypes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        entityTypes_ = null;
      }
      return entityTypesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.EntityTypeBatch)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.EntityTypeBatch)
  private static final com.google.cloud.dialogflow.v2.EntityTypeBatch DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.EntityTypeBatch();
  }

  public static com.google.cloud.dialogflow.v2.EntityTypeBatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityTypeBatch> PARSER =
      new com.google.protobuf.AbstractParser<EntityTypeBatch>() {
        @java.lang.Override
        public EntityTypeBatch parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntityTypeBatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityTypeBatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.EntityTypeBatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
