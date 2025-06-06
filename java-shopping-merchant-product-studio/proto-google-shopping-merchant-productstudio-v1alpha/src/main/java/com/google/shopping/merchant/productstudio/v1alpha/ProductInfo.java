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
// source: google/shopping/merchant/productstudio/v1alpha/textsuggestions.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.productstudio.v1alpha;

/**
 *
 *
 * <pre>
 * Available information about the product. Used to inform the genAI models.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.productstudio.v1alpha.ProductInfo}
 */
public final class ProductInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.productstudio.v1alpha.ProductInfo)
    ProductInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ProductInfo.newBuilder() to construct.
  private ProductInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProductInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProductInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
        .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetProductAttributes();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
        .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.class,
            com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCT_ATTRIBUTES_FIELD_NUMBER = 1;

  private static final class ProductAttributesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
                .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_ProductAttributesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> productAttributes_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
      internalGetProductAttributes() {
    if (productAttributes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ProductAttributesDefaultEntryHolder.defaultEntry);
    }
    return productAttributes_;
  }

  public int getProductAttributesCount() {
    return internalGetProductAttributes().getMap().size();
  }

  /**
   *
   *
   * <pre>
   * Required. A mapping of all available product attributes. This may include
   * title, description, brand, gender, color, size, etc.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public boolean containsProductAttributes(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetProductAttributes().getMap().containsKey(key);
  }

  /** Use {@link #getProductAttributesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getProductAttributes() {
    return getProductAttributesMap();
  }

  /**
   *
   *
   * <pre>
   * Required. A mapping of all available product attributes. This may include
   * title, description, brand, gender, color, size, etc.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getProductAttributesMap() {
    return internalGetProductAttributes().getMap();
  }

  /**
   *
   *
   * <pre>
   * Required. A mapping of all available product attributes. This may include
   * title, description, brand, gender, color, size, etc.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getProductAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetProductAttributes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   *
   *
   * <pre>
   * Required. A mapping of all available product attributes. This may include
   * title, description, brand, gender, color, size, etc.
   * </pre>
   *
   * <code>
   * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.lang.String getProductAttributesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetProductAttributes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int PRODUCT_IMAGE_FIELD_NUMBER = 2;
  private com.google.shopping.merchant.productstudio.v1alpha.Image productImage_;

  /**
   *
   *
   * <pre>
   * Optional. Image associated with the product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the productImage field is set.
   */
  @java.lang.Override
  public boolean hasProductImage() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Image associated with the product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The productImage.
   */
  @java.lang.Override
  public com.google.shopping.merchant.productstudio.v1alpha.Image getProductImage() {
    return productImage_ == null
        ? com.google.shopping.merchant.productstudio.v1alpha.Image.getDefaultInstance()
        : productImage_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Image associated with the product.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.productstudio.v1alpha.ImageOrBuilder
      getProductImageOrBuilder() {
    return productImage_ == null
        ? com.google.shopping.merchant.productstudio.v1alpha.Image.getDefaultInstance()
        : productImage_;
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetProductAttributes(),
        ProductAttributesDefaultEntryHolder.defaultEntry,
        1);
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getProductImage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetProductAttributes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> productAttributes__ =
          ProductAttributesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, productAttributes__);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProductImage());
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
    if (!(obj instanceof com.google.shopping.merchant.productstudio.v1alpha.ProductInfo)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.productstudio.v1alpha.ProductInfo other =
        (com.google.shopping.merchant.productstudio.v1alpha.ProductInfo) obj;

    if (!internalGetProductAttributes().equals(other.internalGetProductAttributes())) return false;
    if (hasProductImage() != other.hasProductImage()) return false;
    if (hasProductImage()) {
      if (!getProductImage().equals(other.getProductImage())) return false;
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
    if (!internalGetProductAttributes().getMap().isEmpty()) {
      hash = (37 * hash) + PRODUCT_ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProductAttributes().hashCode();
    }
    if (hasProductImage()) {
      hash = (37 * hash) + PRODUCT_IMAGE_FIELD_NUMBER;
      hash = (53 * hash) + getProductImage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo parseFrom(
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
      com.google.shopping.merchant.productstudio.v1alpha.ProductInfo prototype) {
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
   * Available information about the product. Used to inform the genAI models.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.productstudio.v1alpha.ProductInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.productstudio.v1alpha.ProductInfo)
      com.google.shopping.merchant.productstudio.v1alpha.ProductInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
          .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetProductAttributes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableProductAttributes();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
          .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.class,
              com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.Builder.class);
    }

    // Construct using com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProductImageFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableProductAttributes().clear();
      productImage_ = null;
      if (productImageBuilder_ != null) {
        productImageBuilder_.dispose();
        productImageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.productstudio.v1alpha.TextSuggestionsProto
          .internal_static_google_shopping_merchant_productstudio_v1alpha_ProductInfo_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.productstudio.v1alpha.ProductInfo
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.productstudio.v1alpha.ProductInfo build() {
      com.google.shopping.merchant.productstudio.v1alpha.ProductInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.productstudio.v1alpha.ProductInfo buildPartial() {
      com.google.shopping.merchant.productstudio.v1alpha.ProductInfo result =
          new com.google.shopping.merchant.productstudio.v1alpha.ProductInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.productstudio.v1alpha.ProductInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.productAttributes_ = internalGetProductAttributes();
        result.productAttributes_.makeImmutable();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.productImage_ =
            productImageBuilder_ == null ? productImage_ : productImageBuilder_.build();
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
      if (other instanceof com.google.shopping.merchant.productstudio.v1alpha.ProductInfo) {
        return mergeFrom((com.google.shopping.merchant.productstudio.v1alpha.ProductInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.productstudio.v1alpha.ProductInfo other) {
      if (other
          == com.google.shopping.merchant.productstudio.v1alpha.ProductInfo.getDefaultInstance())
        return this;
      internalGetMutableProductAttributes().mergeFrom(other.internalGetProductAttributes());
      bitField0_ |= 0x00000001;
      if (other.hasProductImage()) {
        mergeProductImage(other.getProductImage());
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
                    productAttributes__ =
                        input.readMessage(
                            ProductAttributesDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableProductAttributes()
                    .getMutableMap()
                    .put(productAttributes__.getKey(), productAttributes__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getProductImageFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> productAttributes_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetProductAttributes() {
      if (productAttributes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ProductAttributesDefaultEntryHolder.defaultEntry);
      }
      return productAttributes_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableProductAttributes() {
      if (productAttributes_ == null) {
        productAttributes_ =
            com.google.protobuf.MapField.newMapField(
                ProductAttributesDefaultEntryHolder.defaultEntry);
      }
      if (!productAttributes_.isMutable()) {
        productAttributes_ = productAttributes_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return productAttributes_;
    }

    public int getProductAttributesCount() {
      return internalGetProductAttributes().getMap().size();
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public boolean containsProductAttributes(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetProductAttributes().getMap().containsKey(key);
    }

    /** Use {@link #getProductAttributesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getProductAttributes() {
      return getProductAttributesMap();
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getProductAttributesMap() {
      return internalGetProductAttributes().getMap();
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getProductAttributesOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProductAttributes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    @java.lang.Override
    public java.lang.String getProductAttributesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetProductAttributes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearProductAttributes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableProductAttributes().getMutableMap().clear();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeProductAttributes(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableProductAttributes().getMutableMap().remove(key);
      return this;
    }

    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableProductAttributes() {
      bitField0_ |= 0x00000001;
      return internalGetMutableProductAttributes().getMutableMap();
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putProductAttributes(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableProductAttributes().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. A mapping of all available product attributes. This may include
     * title, description, brand, gender, color, size, etc.
     * </pre>
     *
     * <code>
     * map&lt;string, string&gt; product_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder putAllProductAttributes(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableProductAttributes().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.shopping.merchant.productstudio.v1alpha.Image productImage_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.merchant.productstudio.v1alpha.Image,
            com.google.shopping.merchant.productstudio.v1alpha.Image.Builder,
            com.google.shopping.merchant.productstudio.v1alpha.ImageOrBuilder>
        productImageBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the productImage field is set.
     */
    public boolean hasProductImage() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The productImage.
     */
    public com.google.shopping.merchant.productstudio.v1alpha.Image getProductImage() {
      if (productImageBuilder_ == null) {
        return productImage_ == null
            ? com.google.shopping.merchant.productstudio.v1alpha.Image.getDefaultInstance()
            : productImage_;
      } else {
        return productImageBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setProductImage(com.google.shopping.merchant.productstudio.v1alpha.Image value) {
      if (productImageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        productImage_ = value;
      } else {
        productImageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setProductImage(
        com.google.shopping.merchant.productstudio.v1alpha.Image.Builder builderForValue) {
      if (productImageBuilder_ == null) {
        productImage_ = builderForValue.build();
      } else {
        productImageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeProductImage(
        com.google.shopping.merchant.productstudio.v1alpha.Image value) {
      if (productImageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && productImage_ != null
            && productImage_
                != com.google.shopping.merchant.productstudio.v1alpha.Image.getDefaultInstance()) {
          getProductImageBuilder().mergeFrom(value);
        } else {
          productImage_ = value;
        }
      } else {
        productImageBuilder_.mergeFrom(value);
      }
      if (productImage_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearProductImage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      productImage_ = null;
      if (productImageBuilder_ != null) {
        productImageBuilder_.dispose();
        productImageBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.shopping.merchant.productstudio.v1alpha.Image.Builder
        getProductImageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProductImageFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.shopping.merchant.productstudio.v1alpha.ImageOrBuilder
        getProductImageOrBuilder() {
      if (productImageBuilder_ != null) {
        return productImageBuilder_.getMessageOrBuilder();
      } else {
        return productImage_ == null
            ? com.google.shopping.merchant.productstudio.v1alpha.Image.getDefaultInstance()
            : productImage_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Image associated with the product.
     * </pre>
     *
     * <code>
     * optional .google.shopping.merchant.productstudio.v1alpha.Image product_image = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.merchant.productstudio.v1alpha.Image,
            com.google.shopping.merchant.productstudio.v1alpha.Image.Builder,
            com.google.shopping.merchant.productstudio.v1alpha.ImageOrBuilder>
        getProductImageFieldBuilder() {
      if (productImageBuilder_ == null) {
        productImageBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.merchant.productstudio.v1alpha.Image,
                com.google.shopping.merchant.productstudio.v1alpha.Image.Builder,
                com.google.shopping.merchant.productstudio.v1alpha.ImageOrBuilder>(
                getProductImage(), getParentForChildren(), isClean());
        productImage_ = null;
      }
      return productImageBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.productstudio.v1alpha.ProductInfo)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.productstudio.v1alpha.ProductInfo)
  private static final com.google.shopping.merchant.productstudio.v1alpha.ProductInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.productstudio.v1alpha.ProductInfo();
  }

  public static com.google.shopping.merchant.productstudio.v1alpha.ProductInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductInfo> PARSER =
      new com.google.protobuf.AbstractParser<ProductInfo>() {
        @java.lang.Override
        public ProductInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProductInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.productstudio.v1alpha.ProductInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
