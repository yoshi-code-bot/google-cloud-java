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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * An individual hybrid item to inspect. Will be stored temporarily during
 * processing.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.HybridContentItem}
 */
public final class HybridContentItem extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.HybridContentItem)
    HybridContentItemOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use HybridContentItem.newBuilder() to construct.
  private HybridContentItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HybridContentItem() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HybridContentItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_HybridContentItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_HybridContentItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.HybridContentItem.class,
            com.google.privacy.dlp.v2.HybridContentItem.Builder.class);
  }

  private int bitField0_;
  public static final int ITEM_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.ContentItem item_;

  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   *
   * @return The item.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ContentItem getItem() {
    return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
  }

  /**
   *
   *
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder() {
    return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
  }

  public static final int FINDING_DETAILS_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.HybridFindingDetails findingDetails_;

  /**
   *
   *
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   *
   * @return Whether the findingDetails field is set.
   */
  @java.lang.Override
  public boolean hasFindingDetails() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   *
   * @return The findingDetails.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridFindingDetails getFindingDetails() {
    return findingDetails_ == null
        ? com.google.privacy.dlp.v2.HybridFindingDetails.getDefaultInstance()
        : findingDetails_;
  }

  /**
   *
   *
   * <pre>
   * Supplementary information that will be added to each finding.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder getFindingDetailsOrBuilder() {
    return findingDetails_ == null
        ? com.google.privacy.dlp.v2.HybridFindingDetails.getDefaultInstance()
        : findingDetails_;
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
      output.writeMessage(1, getItem());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getFindingDetails());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getItem());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFindingDetails());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.HybridContentItem)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.HybridContentItem other =
        (com.google.privacy.dlp.v2.HybridContentItem) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem().equals(other.getItem())) return false;
    }
    if (hasFindingDetails() != other.hasFindingDetails()) return false;
    if (hasFindingDetails()) {
      if (!getFindingDetails().equals(other.getFindingDetails())) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    if (hasFindingDetails()) {
      hash = (37 * hash) + FINDING_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getFindingDetails().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.HybridContentItem parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.HybridContentItem prototype) {
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
   * An individual hybrid item to inspect. Will be stored temporarily during
   * processing.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.HybridContentItem}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.HybridContentItem)
      com.google.privacy.dlp.v2.HybridContentItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridContentItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridContentItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.HybridContentItem.class,
              com.google.privacy.dlp.v2.HybridContentItem.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.HybridContentItem.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getItemFieldBuilder();
        getFindingDetailsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      findingDetails_ = null;
      if (findingDetailsBuilder_ != null) {
        findingDetailsBuilder_.dispose();
        findingDetailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_HybridContentItem_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridContentItem getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridContentItem build() {
      com.google.privacy.dlp.v2.HybridContentItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.HybridContentItem buildPartial() {
      com.google.privacy.dlp.v2.HybridContentItem result =
          new com.google.privacy.dlp.v2.HybridContentItem(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.HybridContentItem result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.item_ = itemBuilder_ == null ? item_ : itemBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.findingDetails_ =
            findingDetailsBuilder_ == null ? findingDetails_ : findingDetailsBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.privacy.dlp.v2.HybridContentItem) {
        return mergeFrom((com.google.privacy.dlp.v2.HybridContentItem) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.HybridContentItem other) {
      if (other == com.google.privacy.dlp.v2.HybridContentItem.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (other.hasFindingDetails()) {
        mergeFindingDetails(other.getFindingDetails());
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
                input.readMessage(getItemFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getFindingDetailsFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.privacy.dlp.v2.ContentItem item_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.ContentItem,
            com.google.privacy.dlp.v2.ContentItem.Builder,
            com.google.privacy.dlp.v2.ContentItemOrBuilder>
        itemBuilder_;

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     *
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     *
     * @return The item.
     */
    public com.google.privacy.dlp.v2.ContentItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder setItem(com.google.privacy.dlp.v2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
      } else {
        itemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder setItem(com.google.privacy.dlp.v2.ContentItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder mergeItem(com.google.privacy.dlp.v2.ContentItem value) {
      if (itemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && item_ != null
            && item_ != com.google.privacy.dlp.v2.ContentItem.getDefaultInstance()) {
          getItemBuilder().mergeFrom(value);
        } else {
          item_ = value;
        }
      } else {
        itemBuilder_.mergeFrom(value);
      }
      if (item_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public Builder clearItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      item_ = null;
      if (itemBuilder_ != null) {
        itemBuilder_.dispose();
        itemBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2.ContentItem.Builder getItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    public com.google.privacy.dlp.v2.ContentItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ? com.google.privacy.dlp.v2.ContentItem.getDefaultInstance() : item_;
      }
    }

    /**
     *
     *
     * <pre>
     * The item to inspect.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ContentItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.ContentItem,
            com.google.privacy.dlp.v2.ContentItem.Builder,
            com.google.privacy.dlp.v2.ContentItemOrBuilder>
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.ContentItem,
                com.google.privacy.dlp.v2.ContentItem.Builder,
                com.google.privacy.dlp.v2.ContentItemOrBuilder>(
                getItem(), getParentForChildren(), isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private com.google.privacy.dlp.v2.HybridFindingDetails findingDetails_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.HybridFindingDetails,
            com.google.privacy.dlp.v2.HybridFindingDetails.Builder,
            com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder>
        findingDetailsBuilder_;

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     *
     * @return Whether the findingDetails field is set.
     */
    public boolean hasFindingDetails() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     *
     * @return The findingDetails.
     */
    public com.google.privacy.dlp.v2.HybridFindingDetails getFindingDetails() {
      if (findingDetailsBuilder_ == null) {
        return findingDetails_ == null
            ? com.google.privacy.dlp.v2.HybridFindingDetails.getDefaultInstance()
            : findingDetails_;
      } else {
        return findingDetailsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public Builder setFindingDetails(com.google.privacy.dlp.v2.HybridFindingDetails value) {
      if (findingDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        findingDetails_ = value;
      } else {
        findingDetailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public Builder setFindingDetails(
        com.google.privacy.dlp.v2.HybridFindingDetails.Builder builderForValue) {
      if (findingDetailsBuilder_ == null) {
        findingDetails_ = builderForValue.build();
      } else {
        findingDetailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public Builder mergeFindingDetails(com.google.privacy.dlp.v2.HybridFindingDetails value) {
      if (findingDetailsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && findingDetails_ != null
            && findingDetails_
                != com.google.privacy.dlp.v2.HybridFindingDetails.getDefaultInstance()) {
          getFindingDetailsBuilder().mergeFrom(value);
        } else {
          findingDetails_ = value;
        }
      } else {
        findingDetailsBuilder_.mergeFrom(value);
      }
      if (findingDetails_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public Builder clearFindingDetails() {
      bitField0_ = (bitField0_ & ~0x00000002);
      findingDetails_ = null;
      if (findingDetailsBuilder_ != null) {
        findingDetailsBuilder_.dispose();
        findingDetailsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public com.google.privacy.dlp.v2.HybridFindingDetails.Builder getFindingDetailsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFindingDetailsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    public com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder getFindingDetailsOrBuilder() {
      if (findingDetailsBuilder_ != null) {
        return findingDetailsBuilder_.getMessageOrBuilder();
      } else {
        return findingDetails_ == null
            ? com.google.privacy.dlp.v2.HybridFindingDetails.getDefaultInstance()
            : findingDetails_;
      }
    }

    /**
     *
     *
     * <pre>
     * Supplementary information that will be added to each finding.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.HybridFindingDetails finding_details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.HybridFindingDetails,
            com.google.privacy.dlp.v2.HybridFindingDetails.Builder,
            com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder>
        getFindingDetailsFieldBuilder() {
      if (findingDetailsBuilder_ == null) {
        findingDetailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.HybridFindingDetails,
                com.google.privacy.dlp.v2.HybridFindingDetails.Builder,
                com.google.privacy.dlp.v2.HybridFindingDetailsOrBuilder>(
                getFindingDetails(), getParentForChildren(), isClean());
        findingDetails_ = null;
      }
      return findingDetailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.HybridContentItem)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.HybridContentItem)
  private static final com.google.privacy.dlp.v2.HybridContentItem DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.HybridContentItem();
  }

  public static com.google.privacy.dlp.v2.HybridContentItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HybridContentItem> PARSER =
      new com.google.protobuf.AbstractParser<HybridContentItem>() {
        @java.lang.Override
        public HybridContentItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<HybridContentItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HybridContentItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.HybridContentItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
