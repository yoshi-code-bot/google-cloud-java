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
// source: google/cloud/recommendationengine/v1beta1/import.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommendationengine.v1beta1;

/**
 *
 *
 * <pre>
 * The inline source for the input config for ImportCatalogItems method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CatalogInlineSource}
 */
public final class CatalogInlineSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
    CatalogInlineSourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CatalogInlineSource.newBuilder() to construct.
  private CatalogInlineSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CatalogInlineSource() {
    catalogItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CatalogInlineSource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommendationengine.v1beta1.Import
        .internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommendationengine.v1beta1.Import
        .internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.class,
            com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.Builder.class);
  }

  public static final int CATALOG_ITEMS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem> catalogItems_;

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem>
      getCatalogItemsList() {
    return catalogItems_;
  }

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
      getCatalogItemsOrBuilderList() {
    return catalogItems_;
  }

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public int getCatalogItemsCount() {
    return catalogItems_.size();
  }

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItems(int index) {
    return catalogItems_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Optional. A list of catalog items to update/create. Recommended max of 10k
   * items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder
      getCatalogItemsOrBuilder(int index) {
    return catalogItems_.get(index);
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
    for (int i = 0; i < catalogItems_.size(); i++) {
      output.writeMessage(1, catalogItems_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < catalogItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, catalogItems_.get(i));
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
    if (!(obj instanceof com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource)) {
      return super.equals(obj);
    }
    com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource other =
        (com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource) obj;

    if (!getCatalogItemsList().equals(other.getCatalogItemsList())) return false;
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
    if (getCatalogItemsCount() > 0) {
      hash = (37 * hash) + CATALOG_ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getCatalogItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource parseFrom(
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
      com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource prototype) {
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
   * The inline source for the input config for ImportCatalogItems method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommendationengine.v1beta1.CatalogInlineSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
      com.google.cloud.recommendationengine.v1beta1.CatalogInlineSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommendationengine.v1beta1.Import
          .internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommendationengine.v1beta1.Import
          .internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.class,
              com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.Builder.class);
    }

    // Construct using
    // com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (catalogItemsBuilder_ == null) {
        catalogItems_ = java.util.Collections.emptyList();
      } else {
        catalogItems_ = null;
        catalogItemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommendationengine.v1beta1.Import
          .internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
        getDefaultInstanceForType() {
      return com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource build() {
      com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource buildPartial() {
      com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource result =
          new com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource result) {
      if (catalogItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          catalogItems_ = java.util.Collections.unmodifiableList(catalogItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.catalogItems_ = catalogItems_;
      } else {
        result.catalogItems_ = catalogItemsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource result) {
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
      if (other instanceof com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource) {
        return mergeFrom((com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource other) {
      if (other
          == com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource.getDefaultInstance())
        return this;
      if (catalogItemsBuilder_ == null) {
        if (!other.catalogItems_.isEmpty()) {
          if (catalogItems_.isEmpty()) {
            catalogItems_ = other.catalogItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCatalogItemsIsMutable();
            catalogItems_.addAll(other.catalogItems_);
          }
          onChanged();
        }
      } else {
        if (!other.catalogItems_.isEmpty()) {
          if (catalogItemsBuilder_.isEmpty()) {
            catalogItemsBuilder_.dispose();
            catalogItemsBuilder_ = null;
            catalogItems_ = other.catalogItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            catalogItemsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCatalogItemsFieldBuilder()
                    : null;
          } else {
            catalogItemsBuilder_.addAllMessages(other.catalogItems_);
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
                com.google.cloud.recommendationengine.v1beta1.CatalogItem m =
                    input.readMessage(
                        com.google.cloud.recommendationengine.v1beta1.CatalogItem.parser(),
                        extensionRegistry);
                if (catalogItemsBuilder_ == null) {
                  ensureCatalogItemsIsMutable();
                  catalogItems_.add(m);
                } else {
                  catalogItemsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem>
        catalogItems_ = java.util.Collections.emptyList();

    private void ensureCatalogItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catalogItems_ =
            new java.util.ArrayList<com.google.cloud.recommendationengine.v1beta1.CatalogItem>(
                catalogItems_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.CatalogItem,
            com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
            com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
        catalogItemsBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem>
        getCatalogItemsList() {
      if (catalogItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(catalogItems_);
      } else {
        return catalogItemsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public int getCatalogItemsCount() {
      if (catalogItemsBuilder_ == null) {
        return catalogItems_.size();
      } else {
        return catalogItemsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem getCatalogItems(int index) {
      if (catalogItemsBuilder_ == null) {
        return catalogItems_.get(index);
      } else {
        return catalogItemsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCatalogItems(
        int index, com.google.cloud.recommendationengine.v1beta1.CatalogItem value) {
      if (catalogItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogItemsIsMutable();
        catalogItems_.set(index, value);
        onChanged();
      } else {
        catalogItemsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setCatalogItems(
        int index,
        com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder builderForValue) {
      if (catalogItemsBuilder_ == null) {
        ensureCatalogItemsIsMutable();
        catalogItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        catalogItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addCatalogItems(
        com.google.cloud.recommendationengine.v1beta1.CatalogItem value) {
      if (catalogItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogItemsIsMutable();
        catalogItems_.add(value);
        onChanged();
      } else {
        catalogItemsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addCatalogItems(
        int index, com.google.cloud.recommendationengine.v1beta1.CatalogItem value) {
      if (catalogItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCatalogItemsIsMutable();
        catalogItems_.add(index, value);
        onChanged();
      } else {
        catalogItemsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addCatalogItems(
        com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder builderForValue) {
      if (catalogItemsBuilder_ == null) {
        ensureCatalogItemsIsMutable();
        catalogItems_.add(builderForValue.build());
        onChanged();
      } else {
        catalogItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addCatalogItems(
        int index,
        com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder builderForValue) {
      if (catalogItemsBuilder_ == null) {
        ensureCatalogItemsIsMutable();
        catalogItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        catalogItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder addAllCatalogItems(
        java.lang.Iterable<? extends com.google.cloud.recommendationengine.v1beta1.CatalogItem>
            values) {
      if (catalogItemsBuilder_ == null) {
        ensureCatalogItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, catalogItems_);
        onChanged();
      } else {
        catalogItemsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearCatalogItems() {
      if (catalogItemsBuilder_ == null) {
        catalogItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        catalogItemsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder removeCatalogItems(int index) {
      if (catalogItemsBuilder_ == null) {
        ensureCatalogItemsIsMutable();
        catalogItems_.remove(index);
        onChanged();
      } else {
        catalogItemsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder getCatalogItemsBuilder(
        int index) {
      return getCatalogItemsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder
        getCatalogItemsOrBuilder(int index) {
      if (catalogItemsBuilder_ == null) {
        return catalogItems_.get(index);
      } else {
        return catalogItemsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
        getCatalogItemsOrBuilderList() {
      if (catalogItemsBuilder_ != null) {
        return catalogItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(catalogItems_);
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder
        addCatalogItemsBuilder() {
      return getCatalogItemsFieldBuilder()
          .addBuilder(
              com.google.cloud.recommendationengine.v1beta1.CatalogItem.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder addCatalogItemsBuilder(
        int index) {
      return getCatalogItemsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.recommendationengine.v1beta1.CatalogItem.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Optional. A list of catalog items to update/create. Recommended max of 10k
     * items.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recommendationengine.v1beta1.CatalogItem catalog_items = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public java.util.List<com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder>
        getCatalogItemsBuilderList() {
      return getCatalogItemsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommendationengine.v1beta1.CatalogItem,
            com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
            com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>
        getCatalogItemsFieldBuilder() {
      if (catalogItemsBuilder_ == null) {
        catalogItemsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.recommendationengine.v1beta1.CatalogItem,
                com.google.cloud.recommendationengine.v1beta1.CatalogItem.Builder,
                com.google.cloud.recommendationengine.v1beta1.CatalogItemOrBuilder>(
                catalogItems_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        catalogItems_ = null;
      }
      return catalogItemsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommendationengine.v1beta1.CatalogInlineSource)
  private static final com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource();
  }

  public static com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CatalogInlineSource> PARSER =
      new com.google.protobuf.AbstractParser<CatalogInlineSource>() {
        @java.lang.Override
        public CatalogInlineSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<CatalogInlineSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CatalogInlineSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommendationengine.v1beta1.CatalogInlineSource
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
