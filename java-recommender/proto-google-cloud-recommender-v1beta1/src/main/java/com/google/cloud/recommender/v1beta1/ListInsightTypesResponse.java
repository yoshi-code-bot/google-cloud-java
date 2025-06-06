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
// source: google/cloud/recommender/v1beta1/recommender_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * Response for the `ListInsightTypes` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.ListInsightTypesResponse}
 */
public final class ListInsightTypesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.ListInsightTypesResponse)
    ListInsightTypesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListInsightTypesResponse.newBuilder() to construct.
  private ListInsightTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListInsightTypesResponse() {
    insightTypes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListInsightTypesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_ListInsightTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommenderProto
        .internal_static_google_cloud_recommender_v1beta1_ListInsightTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.class,
            com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.Builder.class);
  }

  public static final int INSIGHT_TYPES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.recommender.v1beta1.InsightType> insightTypes_;

  /**
   *
   *
   * <pre>
   * The set of recommenders available
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.recommender.v1beta1.InsightType> getInsightTypesList() {
    return insightTypes_;
  }

  /**
   *
   *
   * <pre>
   * The set of recommenders available
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder>
      getInsightTypesOrBuilderList() {
    return insightTypes_;
  }

  /**
   *
   *
   * <pre>
   * The set of recommenders available
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
   */
  @java.lang.Override
  public int getInsightTypesCount() {
    return insightTypes_.size();
  }

  /**
   *
   *
   * <pre>
   * The set of recommenders available
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightType getInsightTypes(int index) {
    return insightTypes_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The set of recommenders available
   * </pre>
   *
   * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder getInsightTypesOrBuilder(
      int index) {
    return insightTypes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
    for (int i = 0; i < insightTypes_.size(); i++) {
      output.writeMessage(1, insightTypes_.get(i));
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
    for (int i = 0; i < insightTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, insightTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.ListInsightTypesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.ListInsightTypesResponse other =
        (com.google.cloud.recommender.v1beta1.ListInsightTypesResponse) obj;

    if (!getInsightTypesList().equals(other.getInsightTypesList())) return false;
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
    if (getInsightTypesCount() > 0) {
      hash = (37 * hash) + INSIGHT_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getInsightTypesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse parseFrom(
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
      com.google.cloud.recommender.v1beta1.ListInsightTypesResponse prototype) {
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
   * Response for the `ListInsightTypes` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.ListInsightTypesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.ListInsightTypesResponse)
      com.google.cloud.recommender.v1beta1.ListInsightTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListInsightTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListInsightTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.class,
              com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (insightTypesBuilder_ == null) {
        insightTypes_ = java.util.Collections.emptyList();
      } else {
        insightTypes_ = null;
        insightTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommenderProto
          .internal_static_google_cloud_recommender_v1beta1_ListInsightTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListInsightTypesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListInsightTypesResponse build() {
      com.google.cloud.recommender.v1beta1.ListInsightTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.ListInsightTypesResponse buildPartial() {
      com.google.cloud.recommender.v1beta1.ListInsightTypesResponse result =
          new com.google.cloud.recommender.v1beta1.ListInsightTypesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.recommender.v1beta1.ListInsightTypesResponse result) {
      if (insightTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          insightTypes_ = java.util.Collections.unmodifiableList(insightTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.insightTypes_ = insightTypes_;
      } else {
        result.insightTypes_ = insightTypesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.recommender.v1beta1.ListInsightTypesResponse result) {
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
      if (other instanceof com.google.cloud.recommender.v1beta1.ListInsightTypesResponse) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.ListInsightTypesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1beta1.ListInsightTypesResponse other) {
      if (other
          == com.google.cloud.recommender.v1beta1.ListInsightTypesResponse.getDefaultInstance())
        return this;
      if (insightTypesBuilder_ == null) {
        if (!other.insightTypes_.isEmpty()) {
          if (insightTypes_.isEmpty()) {
            insightTypes_ = other.insightTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInsightTypesIsMutable();
            insightTypes_.addAll(other.insightTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.insightTypes_.isEmpty()) {
          if (insightTypesBuilder_.isEmpty()) {
            insightTypesBuilder_.dispose();
            insightTypesBuilder_ = null;
            insightTypes_ = other.insightTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            insightTypesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getInsightTypesFieldBuilder()
                    : null;
          } else {
            insightTypesBuilder_.addAllMessages(other.insightTypes_);
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
                com.google.cloud.recommender.v1beta1.InsightType m =
                    input.readMessage(
                        com.google.cloud.recommender.v1beta1.InsightType.parser(),
                        extensionRegistry);
                if (insightTypesBuilder_ == null) {
                  ensureInsightTypesIsMutable();
                  insightTypes_.add(m);
                } else {
                  insightTypesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.recommender.v1beta1.InsightType> insightTypes_ =
        java.util.Collections.emptyList();

    private void ensureInsightTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        insightTypes_ =
            new java.util.ArrayList<com.google.cloud.recommender.v1beta1.InsightType>(
                insightTypes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.InsightType,
            com.google.cloud.recommender.v1beta1.InsightType.Builder,
            com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder>
        insightTypesBuilder_;

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public java.util.List<com.google.cloud.recommender.v1beta1.InsightType> getInsightTypesList() {
      if (insightTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(insightTypes_);
      } else {
        return insightTypesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public int getInsightTypesCount() {
      if (insightTypesBuilder_ == null) {
        return insightTypes_.size();
      } else {
        return insightTypesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.InsightType getInsightTypes(int index) {
      if (insightTypesBuilder_ == null) {
        return insightTypes_.get(index);
      } else {
        return insightTypesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder setInsightTypes(
        int index, com.google.cloud.recommender.v1beta1.InsightType value) {
      if (insightTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightTypesIsMutable();
        insightTypes_.set(index, value);
        onChanged();
      } else {
        insightTypesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder setInsightTypes(
        int index, com.google.cloud.recommender.v1beta1.InsightType.Builder builderForValue) {
      if (insightTypesBuilder_ == null) {
        ensureInsightTypesIsMutable();
        insightTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        insightTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder addInsightTypes(com.google.cloud.recommender.v1beta1.InsightType value) {
      if (insightTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightTypesIsMutable();
        insightTypes_.add(value);
        onChanged();
      } else {
        insightTypesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder addInsightTypes(
        int index, com.google.cloud.recommender.v1beta1.InsightType value) {
      if (insightTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInsightTypesIsMutable();
        insightTypes_.add(index, value);
        onChanged();
      } else {
        insightTypesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder addInsightTypes(
        com.google.cloud.recommender.v1beta1.InsightType.Builder builderForValue) {
      if (insightTypesBuilder_ == null) {
        ensureInsightTypesIsMutable();
        insightTypes_.add(builderForValue.build());
        onChanged();
      } else {
        insightTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder addInsightTypes(
        int index, com.google.cloud.recommender.v1beta1.InsightType.Builder builderForValue) {
      if (insightTypesBuilder_ == null) {
        ensureInsightTypesIsMutable();
        insightTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        insightTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder addAllInsightTypes(
        java.lang.Iterable<? extends com.google.cloud.recommender.v1beta1.InsightType> values) {
      if (insightTypesBuilder_ == null) {
        ensureInsightTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, insightTypes_);
        onChanged();
      } else {
        insightTypesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder clearInsightTypes() {
      if (insightTypesBuilder_ == null) {
        insightTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        insightTypesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public Builder removeInsightTypes(int index) {
      if (insightTypesBuilder_ == null) {
        ensureInsightTypesIsMutable();
        insightTypes_.remove(index);
        onChanged();
      } else {
        insightTypesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.InsightType.Builder getInsightTypesBuilder(
        int index) {
      return getInsightTypesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder getInsightTypesOrBuilder(
        int index) {
      if (insightTypesBuilder_ == null) {
        return insightTypes_.get(index);
      } else {
        return insightTypesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder>
        getInsightTypesOrBuilderList() {
      if (insightTypesBuilder_ != null) {
        return insightTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(insightTypes_);
      }
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.InsightType.Builder addInsightTypesBuilder() {
      return getInsightTypesFieldBuilder()
          .addBuilder(com.google.cloud.recommender.v1beta1.InsightType.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public com.google.cloud.recommender.v1beta1.InsightType.Builder addInsightTypesBuilder(
        int index) {
      return getInsightTypesFieldBuilder()
          .addBuilder(index, com.google.cloud.recommender.v1beta1.InsightType.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The set of recommenders available
     * </pre>
     *
     * <code>repeated .google.cloud.recommender.v1beta1.InsightType insight_types = 1;</code>
     */
    public java.util.List<com.google.cloud.recommender.v1beta1.InsightType.Builder>
        getInsightTypesBuilderList() {
      return getInsightTypesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.recommender.v1beta1.InsightType,
            com.google.cloud.recommender.v1beta1.InsightType.Builder,
            com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder>
        getInsightTypesFieldBuilder() {
      if (insightTypesBuilder_ == null) {
        insightTypesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.recommender.v1beta1.InsightType,
                com.google.cloud.recommender.v1beta1.InsightType.Builder,
                com.google.cloud.recommender.v1beta1.InsightTypeOrBuilder>(
                insightTypes_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        insightTypes_ = null;
      }
      return insightTypesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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
     * A token, which can be sent as `page_token` to retrieve the next page.
     * If this field is omitted, there are no subsequent pages.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.ListInsightTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.ListInsightTypesResponse)
  private static final com.google.cloud.recommender.v1beta1.ListInsightTypesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.ListInsightTypesResponse();
  }

  public static com.google.cloud.recommender.v1beta1.ListInsightTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInsightTypesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListInsightTypesResponse>() {
        @java.lang.Override
        public ListInsightTypesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInsightTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInsightTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.ListInsightTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
