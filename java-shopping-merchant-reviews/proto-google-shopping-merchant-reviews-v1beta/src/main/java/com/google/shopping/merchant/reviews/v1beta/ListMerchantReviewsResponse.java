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
// source: google/shopping/merchant/reviews/v1beta/merchantreviews.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.reviews.v1beta;

/**
 *
 *
 * <pre>
 * Response message for the `ListMerchantsReview` method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse}
 */
public final class ListMerchantReviewsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse)
    ListMerchantReviewsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListMerchantReviewsResponse.newBuilder() to construct.
  private ListMerchantReviewsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListMerchantReviewsResponse() {
    merchantReviews_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListMerchantReviewsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.reviews.v1beta.MerchantReviewsProto
        .internal_static_google_shopping_merchant_reviews_v1beta_ListMerchantReviewsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.reviews.v1beta.MerchantReviewsProto
        .internal_static_google_shopping_merchant_reviews_v1beta_ListMerchantReviewsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse.class,
            com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse.Builder.class);
  }

  public static final int MERCHANT_REVIEWS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.shopping.merchant.reviews.v1beta.MerchantReview>
      merchantReviews_;

  /**
   *
   *
   * <pre>
   * The merchant review.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.shopping.merchant.reviews.v1beta.MerchantReview>
      getMerchantReviewsList() {
    return merchantReviews_;
  }

  /**
   *
   *
   * <pre>
   * The merchant review.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder>
      getMerchantReviewsOrBuilderList() {
    return merchantReviews_;
  }

  /**
   *
   *
   * <pre>
   * The merchant review.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
   * </code>
   */
  @java.lang.Override
  public int getMerchantReviewsCount() {
    return merchantReviews_.size();
  }

  /**
   *
   *
   * <pre>
   * The merchant review.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.reviews.v1beta.MerchantReview getMerchantReviews(int index) {
    return merchantReviews_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The merchant review.
   * </pre>
   *
   * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder
      getMerchantReviewsOrBuilder(int index) {
    return merchantReviews_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < merchantReviews_.size(); i++) {
      output.writeMessage(1, merchantReviews_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < merchantReviews_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, merchantReviews_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse other =
        (com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse) obj;

    if (!getMerchantReviewsList().equals(other.getMerchantReviewsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getMerchantReviewsCount() > 0) {
      hash = (37 * hash) + MERCHANT_REVIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getMerchantReviewsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse parseFrom(
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
      com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse prototype) {
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
   * Response message for the `ListMerchantsReview` method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse)
      com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.reviews.v1beta.MerchantReviewsProto
          .internal_static_google_shopping_merchant_reviews_v1beta_ListMerchantReviewsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.reviews.v1beta.MerchantReviewsProto
          .internal_static_google_shopping_merchant_reviews_v1beta_ListMerchantReviewsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse.class,
              com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (merchantReviewsBuilder_ == null) {
        merchantReviews_ = java.util.Collections.emptyList();
      } else {
        merchantReviews_ = null;
        merchantReviewsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.reviews.v1beta.MerchantReviewsProto
          .internal_static_google_shopping_merchant_reviews_v1beta_ListMerchantReviewsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse build() {
      com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse buildPartial() {
      com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse result =
          new com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse result) {
      if (merchantReviewsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          merchantReviews_ = java.util.Collections.unmodifiableList(merchantReviews_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.merchantReviews_ = merchantReviews_;
      } else {
        result.merchantReviews_ = merchantReviewsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other
          instanceof com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse) {
        return mergeFrom(
            (com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse other) {
      if (other
          == com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
              .getDefaultInstance()) return this;
      if (merchantReviewsBuilder_ == null) {
        if (!other.merchantReviews_.isEmpty()) {
          if (merchantReviews_.isEmpty()) {
            merchantReviews_ = other.merchantReviews_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMerchantReviewsIsMutable();
            merchantReviews_.addAll(other.merchantReviews_);
          }
          onChanged();
        }
      } else {
        if (!other.merchantReviews_.isEmpty()) {
          if (merchantReviewsBuilder_.isEmpty()) {
            merchantReviewsBuilder_.dispose();
            merchantReviewsBuilder_ = null;
            merchantReviews_ = other.merchantReviews_;
            bitField0_ = (bitField0_ & ~0x00000001);
            merchantReviewsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMerchantReviewsFieldBuilder()
                    : null;
          } else {
            merchantReviewsBuilder_.addAllMessages(other.merchantReviews_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.shopping.merchant.reviews.v1beta.MerchantReview m =
                    input.readMessage(
                        com.google.shopping.merchant.reviews.v1beta.MerchantReview.parser(),
                        extensionRegistry);
                if (merchantReviewsBuilder_ == null) {
                  ensureMerchantReviewsIsMutable();
                  merchantReviews_.add(m);
                } else {
                  merchantReviewsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.shopping.merchant.reviews.v1beta.MerchantReview>
        merchantReviews_ = java.util.Collections.emptyList();

    private void ensureMerchantReviewsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        merchantReviews_ =
            new java.util.ArrayList<com.google.shopping.merchant.reviews.v1beta.MerchantReview>(
                merchantReviews_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.reviews.v1beta.MerchantReview,
            com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder,
            com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder>
        merchantReviewsBuilder_;

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.reviews.v1beta.MerchantReview>
        getMerchantReviewsList() {
      if (merchantReviewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(merchantReviews_);
      } else {
        return merchantReviewsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public int getMerchantReviewsCount() {
      if (merchantReviewsBuilder_ == null) {
        return merchantReviews_.size();
      } else {
        return merchantReviewsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public com.google.shopping.merchant.reviews.v1beta.MerchantReview getMerchantReviews(
        int index) {
      if (merchantReviewsBuilder_ == null) {
        return merchantReviews_.get(index);
      } else {
        return merchantReviewsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder setMerchantReviews(
        int index, com.google.shopping.merchant.reviews.v1beta.MerchantReview value) {
      if (merchantReviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantReviewsIsMutable();
        merchantReviews_.set(index, value);
        onChanged();
      } else {
        merchantReviewsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder setMerchantReviews(
        int index,
        com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder builderForValue) {
      if (merchantReviewsBuilder_ == null) {
        ensureMerchantReviewsIsMutable();
        merchantReviews_.set(index, builderForValue.build());
        onChanged();
      } else {
        merchantReviewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder addMerchantReviews(
        com.google.shopping.merchant.reviews.v1beta.MerchantReview value) {
      if (merchantReviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantReviewsIsMutable();
        merchantReviews_.add(value);
        onChanged();
      } else {
        merchantReviewsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder addMerchantReviews(
        int index, com.google.shopping.merchant.reviews.v1beta.MerchantReview value) {
      if (merchantReviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMerchantReviewsIsMutable();
        merchantReviews_.add(index, value);
        onChanged();
      } else {
        merchantReviewsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder addMerchantReviews(
        com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder builderForValue) {
      if (merchantReviewsBuilder_ == null) {
        ensureMerchantReviewsIsMutable();
        merchantReviews_.add(builderForValue.build());
        onChanged();
      } else {
        merchantReviewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder addMerchantReviews(
        int index,
        com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder builderForValue) {
      if (merchantReviewsBuilder_ == null) {
        ensureMerchantReviewsIsMutable();
        merchantReviews_.add(index, builderForValue.build());
        onChanged();
      } else {
        merchantReviewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder addAllMerchantReviews(
        java.lang.Iterable<? extends com.google.shopping.merchant.reviews.v1beta.MerchantReview>
            values) {
      if (merchantReviewsBuilder_ == null) {
        ensureMerchantReviewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, merchantReviews_);
        onChanged();
      } else {
        merchantReviewsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder clearMerchantReviews() {
      if (merchantReviewsBuilder_ == null) {
        merchantReviews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        merchantReviewsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public Builder removeMerchantReviews(int index) {
      if (merchantReviewsBuilder_ == null) {
        ensureMerchantReviewsIsMutable();
        merchantReviews_.remove(index);
        onChanged();
      } else {
        merchantReviewsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder
        getMerchantReviewsBuilder(int index) {
      return getMerchantReviewsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder
        getMerchantReviewsOrBuilder(int index) {
      if (merchantReviewsBuilder_ == null) {
        return merchantReviews_.get(index);
      } else {
        return merchantReviewsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder>
        getMerchantReviewsOrBuilderList() {
      if (merchantReviewsBuilder_ != null) {
        return merchantReviewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(merchantReviews_);
      }
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder
        addMerchantReviewsBuilder() {
      return getMerchantReviewsFieldBuilder()
          .addBuilder(
              com.google.shopping.merchant.reviews.v1beta.MerchantReview.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder
        addMerchantReviewsBuilder(int index) {
      return getMerchantReviewsFieldBuilder()
          .addBuilder(
              index,
              com.google.shopping.merchant.reviews.v1beta.MerchantReview.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The merchant review.
     * </pre>
     *
     * <code>repeated .google.shopping.merchant.reviews.v1beta.MerchantReview merchant_reviews = 1;
     * </code>
     */
    public java.util.List<com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder>
        getMerchantReviewsBuilderList() {
      return getMerchantReviewsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.shopping.merchant.reviews.v1beta.MerchantReview,
            com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder,
            com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder>
        getMerchantReviewsFieldBuilder() {
      if (merchantReviewsBuilder_ == null) {
        merchantReviewsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.shopping.merchant.reviews.v1beta.MerchantReview,
                com.google.shopping.merchant.reviews.v1beta.MerchantReview.Builder,
                com.google.shopping.merchant.reviews.v1beta.MerchantReviewOrBuilder>(
                merchantReviews_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        merchantReviews_ = null;
      }
      return merchantReviewsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The token to retrieve the next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse)
  private static final com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse();
  }

  public static com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMerchantReviewsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListMerchantReviewsResponse>() {
        @java.lang.Override
        public ListMerchantReviewsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListMerchantReviewsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMerchantReviewsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.reviews.v1beta.ListMerchantReviewsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
