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
// source: google/shopping/merchant/accounts/v1beta/checkoutsettings.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * URL settings for cart or checkout URL.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.UriSettings}
 */
public final class UriSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.UriSettings)
    UriSettingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UriSettings.newBuilder() to construct.
  private UriSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UriSettings() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UriSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.CheckoutsettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_UriSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.CheckoutsettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_UriSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.UriSettings.class,
            com.google.shopping.merchant.accounts.v1beta.UriSettings.Builder.class);
  }

  private int uriTemplateCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object uriTemplate_;

  public enum UriTemplateCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CHECKOUT_URI_TEMPLATE(1),
    CART_URI_TEMPLATE(2),
    URITEMPLATE_NOT_SET(0);
    private final int value;

    private UriTemplateCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UriTemplateCase valueOf(int value) {
      return forNumber(value);
    }

    public static UriTemplateCase forNumber(int value) {
      switch (value) {
        case 1:
          return CHECKOUT_URI_TEMPLATE;
        case 2:
          return CART_URI_TEMPLATE;
        case 0:
          return URITEMPLATE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public UriTemplateCase getUriTemplateCase() {
    return UriTemplateCase.forNumber(uriTemplateCase_);
  }

  public static final int CHECKOUT_URI_TEMPLATE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Checkout URL template. When the placeholders are expanded will redirect
   * the buyer to the merchant checkout page with the item in the cart. For
   * more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string checkout_uri_template = 1;</code>
   *
   * @return Whether the checkoutUriTemplate field is set.
   */
  public boolean hasCheckoutUriTemplate() {
    return uriTemplateCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Checkout URL template. When the placeholders are expanded will redirect
   * the buyer to the merchant checkout page with the item in the cart. For
   * more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string checkout_uri_template = 1;</code>
   *
   * @return The checkoutUriTemplate.
   */
  public java.lang.String getCheckoutUriTemplate() {
    java.lang.Object ref = "";
    if (uriTemplateCase_ == 1) {
      ref = uriTemplate_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (uriTemplateCase_ == 1) {
        uriTemplate_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Checkout URL template. When the placeholders are expanded will redirect
   * the buyer to the merchant checkout page with the item in the cart. For
   * more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string checkout_uri_template = 1;</code>
   *
   * @return The bytes for checkoutUriTemplate.
   */
  public com.google.protobuf.ByteString getCheckoutUriTemplateBytes() {
    java.lang.Object ref = "";
    if (uriTemplateCase_ == 1) {
      ref = uriTemplate_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (uriTemplateCase_ == 1) {
        uriTemplate_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CART_URI_TEMPLATE_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Cart URL template. When the placeholders are expanded will redirect the
   * buyer to the cart page on the merchant website with the selected
   * item in cart. For more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string cart_uri_template = 2;</code>
   *
   * @return Whether the cartUriTemplate field is set.
   */
  public boolean hasCartUriTemplate() {
    return uriTemplateCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Cart URL template. When the placeholders are expanded will redirect the
   * buyer to the cart page on the merchant website with the selected
   * item in cart. For more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string cart_uri_template = 2;</code>
   *
   * @return The cartUriTemplate.
   */
  public java.lang.String getCartUriTemplate() {
    java.lang.Object ref = "";
    if (uriTemplateCase_ == 2) {
      ref = uriTemplate_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (uriTemplateCase_ == 2) {
        uriTemplate_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Cart URL template. When the placeholders are expanded will redirect the
   * buyer to the cart page on the merchant website with the selected
   * item in cart. For more details, check the [help center
   * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
   * </pre>
   *
   * <code>string cart_uri_template = 2;</code>
   *
   * @return The bytes for cartUriTemplate.
   */
  public com.google.protobuf.ByteString getCartUriTemplateBytes() {
    java.lang.Object ref = "";
    if (uriTemplateCase_ == 2) {
      ref = uriTemplate_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (uriTemplateCase_ == 2) {
        uriTemplate_ = b;
      }
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
    if (uriTemplateCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uriTemplate_);
    }
    if (uriTemplateCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uriTemplate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (uriTemplateCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uriTemplate_);
    }
    if (uriTemplateCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uriTemplate_);
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.UriSettings)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.UriSettings other =
        (com.google.shopping.merchant.accounts.v1beta.UriSettings) obj;

    if (!getUriTemplateCase().equals(other.getUriTemplateCase())) return false;
    switch (uriTemplateCase_) {
      case 1:
        if (!getCheckoutUriTemplate().equals(other.getCheckoutUriTemplate())) return false;
        break;
      case 2:
        if (!getCartUriTemplate().equals(other.getCartUriTemplate())) return false;
        break;
      case 0:
      default:
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
    switch (uriTemplateCase_) {
      case 1:
        hash = (37 * hash) + CHECKOUT_URI_TEMPLATE_FIELD_NUMBER;
        hash = (53 * hash) + getCheckoutUriTemplate().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CART_URI_TEMPLATE_FIELD_NUMBER;
        hash = (53 * hash) + getCartUriTemplate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.UriSettings prototype) {
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
   * URL settings for cart or checkout URL.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.UriSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.UriSettings)
      com.google.shopping.merchant.accounts.v1beta.UriSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.CheckoutsettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UriSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.CheckoutsettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UriSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.UriSettings.class,
              com.google.shopping.merchant.accounts.v1beta.UriSettings.Builder.class);
    }

    // Construct using com.google.shopping.merchant.accounts.v1beta.UriSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uriTemplateCase_ = 0;
      uriTemplate_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.CheckoutsettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UriSettings_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UriSettings getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.UriSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UriSettings build() {
      com.google.shopping.merchant.accounts.v1beta.UriSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UriSettings buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.UriSettings result =
          new com.google.shopping.merchant.accounts.v1beta.UriSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.merchant.accounts.v1beta.UriSettings result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.shopping.merchant.accounts.v1beta.UriSettings result) {
      result.uriTemplateCase_ = uriTemplateCase_;
      result.uriTemplate_ = this.uriTemplate_;
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.UriSettings) {
        return mergeFrom((com.google.shopping.merchant.accounts.v1beta.UriSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.accounts.v1beta.UriSettings other) {
      if (other == com.google.shopping.merchant.accounts.v1beta.UriSettings.getDefaultInstance())
        return this;
      switch (other.getUriTemplateCase()) {
        case CHECKOUT_URI_TEMPLATE:
          {
            uriTemplateCase_ = 1;
            uriTemplate_ = other.uriTemplate_;
            onChanged();
            break;
          }
        case CART_URI_TEMPLATE:
          {
            uriTemplateCase_ = 2;
            uriTemplate_ = other.uriTemplate_;
            onChanged();
            break;
          }
        case URITEMPLATE_NOT_SET:
          {
            break;
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
                java.lang.String s = input.readStringRequireUtf8();
                uriTemplateCase_ = 1;
                uriTemplate_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                uriTemplateCase_ = 2;
                uriTemplate_ = s;
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

    private int uriTemplateCase_ = 0;
    private java.lang.Object uriTemplate_;

    public UriTemplateCase getUriTemplateCase() {
      return UriTemplateCase.forNumber(uriTemplateCase_);
    }

    public Builder clearUriTemplate() {
      uriTemplateCase_ = 0;
      uriTemplate_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @return Whether the checkoutUriTemplate field is set.
     */
    @java.lang.Override
    public boolean hasCheckoutUriTemplate() {
      return uriTemplateCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @return The checkoutUriTemplate.
     */
    @java.lang.Override
    public java.lang.String getCheckoutUriTemplate() {
      java.lang.Object ref = "";
      if (uriTemplateCase_ == 1) {
        ref = uriTemplate_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (uriTemplateCase_ == 1) {
          uriTemplate_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @return The bytes for checkoutUriTemplate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCheckoutUriTemplateBytes() {
      java.lang.Object ref = "";
      if (uriTemplateCase_ == 1) {
        ref = uriTemplate_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (uriTemplateCase_ == 1) {
          uriTemplate_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @param value The checkoutUriTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckoutUriTemplate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uriTemplateCase_ = 1;
      uriTemplate_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCheckoutUriTemplate() {
      if (uriTemplateCase_ == 1) {
        uriTemplateCase_ = 0;
        uriTemplate_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Checkout URL template. When the placeholders are expanded will redirect
     * the buyer to the merchant checkout page with the item in the cart. For
     * more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string checkout_uri_template = 1;</code>
     *
     * @param value The bytes for checkoutUriTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setCheckoutUriTemplateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uriTemplateCase_ = 1;
      uriTemplate_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @return Whether the cartUriTemplate field is set.
     */
    @java.lang.Override
    public boolean hasCartUriTemplate() {
      return uriTemplateCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @return The cartUriTemplate.
     */
    @java.lang.Override
    public java.lang.String getCartUriTemplate() {
      java.lang.Object ref = "";
      if (uriTemplateCase_ == 2) {
        ref = uriTemplate_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (uriTemplateCase_ == 2) {
          uriTemplate_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @return The bytes for cartUriTemplate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCartUriTemplateBytes() {
      java.lang.Object ref = "";
      if (uriTemplateCase_ == 2) {
        ref = uriTemplate_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (uriTemplateCase_ == 2) {
          uriTemplate_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @param value The cartUriTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setCartUriTemplate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uriTemplateCase_ = 2;
      uriTemplate_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCartUriTemplate() {
      if (uriTemplateCase_ == 2) {
        uriTemplateCase_ = 0;
        uriTemplate_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Cart URL template. When the placeholders are expanded will redirect the
     * buyer to the cart page on the merchant website with the selected
     * item in cart. For more details, check the [help center
     * doc](https://support.google.com/merchants/answer/13945960#method1&amp;zippy=%2Cproduct-level-url-formatting%2Caccount-level-url-formatting)
     * </pre>
     *
     * <code>string cart_uri_template = 2;</code>
     *
     * @param value The bytes for cartUriTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setCartUriTemplateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uriTemplateCase_ = 2;
      uriTemplate_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.UriSettings)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.UriSettings)
  private static final com.google.shopping.merchant.accounts.v1beta.UriSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.UriSettings();
  }

  public static com.google.shopping.merchant.accounts.v1beta.UriSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UriSettings> PARSER =
      new com.google.protobuf.AbstractParser<UriSettings>() {
        @java.lang.Override
        public UriSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<UriSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UriSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.UriSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
