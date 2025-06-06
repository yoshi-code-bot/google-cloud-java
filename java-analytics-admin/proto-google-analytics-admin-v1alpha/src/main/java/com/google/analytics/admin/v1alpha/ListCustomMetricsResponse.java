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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for ListCustomMetrics RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ListCustomMetricsResponse}
 */
public final class ListCustomMetricsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ListCustomMetricsResponse)
    ListCustomMetricsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListCustomMetricsResponse.newBuilder() to construct.
  private ListCustomMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListCustomMetricsResponse() {
    customMetrics_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListCustomMetricsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListCustomMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_ListCustomMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.class,
            com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.Builder.class);
  }

  public static final int CUSTOM_METRICS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.CustomMetric> customMetrics_;

  /**
   *
   *
   * <pre>
   * List of CustomMetrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.CustomMetric> getCustomMetricsList() {
    return customMetrics_;
  }

  /**
   *
   *
   * <pre>
   * List of CustomMetrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
      getCustomMetricsOrBuilderList() {
    return customMetrics_;
  }

  /**
   *
   *
   * <pre>
   * List of CustomMetrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
   */
  @java.lang.Override
  public int getCustomMetricsCount() {
    return customMetrics_.size();
  }

  /**
   *
   *
   * <pre>
   * List of CustomMetrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetrics(int index) {
    return customMetrics_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of CustomMetrics.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricsOrBuilder(
      int index) {
    return customMetrics_.get(index);
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
    for (int i = 0; i < customMetrics_.size(); i++) {
      output.writeMessage(1, customMetrics_.get(i));
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
    for (int i = 0; i < customMetrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, customMetrics_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ListCustomMetricsResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ListCustomMetricsResponse other =
        (com.google.analytics.admin.v1alpha.ListCustomMetricsResponse) obj;

    if (!getCustomMetricsList().equals(other.getCustomMetricsList())) return false;
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
    if (getCustomMetricsCount() > 0) {
      hash = (37 * hash) + CUSTOM_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomMetricsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse parseFrom(
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
      com.google.analytics.admin.v1alpha.ListCustomMetricsResponse prototype) {
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
   * Response message for ListCustomMetrics RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ListCustomMetricsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ListCustomMetricsResponse)
      com.google.analytics.admin.v1alpha.ListCustomMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListCustomMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListCustomMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.class,
              com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (customMetricsBuilder_ == null) {
        customMetrics_ = java.util.Collections.emptyList();
      } else {
        customMetrics_ = null;
        customMetricsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_ListCustomMetricsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListCustomMetricsResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListCustomMetricsResponse build() {
      com.google.analytics.admin.v1alpha.ListCustomMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ListCustomMetricsResponse buildPartial() {
      com.google.analytics.admin.v1alpha.ListCustomMetricsResponse result =
          new com.google.analytics.admin.v1alpha.ListCustomMetricsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1alpha.ListCustomMetricsResponse result) {
      if (customMetricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          customMetrics_ = java.util.Collections.unmodifiableList(customMetrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customMetrics_ = customMetrics_;
      } else {
        result.customMetrics_ = customMetricsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.ListCustomMetricsResponse result) {
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
      if (other instanceof com.google.analytics.admin.v1alpha.ListCustomMetricsResponse) {
        return mergeFrom((com.google.analytics.admin.v1alpha.ListCustomMetricsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.ListCustomMetricsResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.ListCustomMetricsResponse.getDefaultInstance())
        return this;
      if (customMetricsBuilder_ == null) {
        if (!other.customMetrics_.isEmpty()) {
          if (customMetrics_.isEmpty()) {
            customMetrics_ = other.customMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomMetricsIsMutable();
            customMetrics_.addAll(other.customMetrics_);
          }
          onChanged();
        }
      } else {
        if (!other.customMetrics_.isEmpty()) {
          if (customMetricsBuilder_.isEmpty()) {
            customMetricsBuilder_.dispose();
            customMetricsBuilder_ = null;
            customMetrics_ = other.customMetrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customMetricsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCustomMetricsFieldBuilder()
                    : null;
          } else {
            customMetricsBuilder_.addAllMessages(other.customMetrics_);
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
                com.google.analytics.admin.v1alpha.CustomMetric m =
                    input.readMessage(
                        com.google.analytics.admin.v1alpha.CustomMetric.parser(),
                        extensionRegistry);
                if (customMetricsBuilder_ == null) {
                  ensureCustomMetricsIsMutable();
                  customMetrics_.add(m);
                } else {
                  customMetricsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1alpha.CustomMetric> customMetrics_ =
        java.util.Collections.emptyList();

    private void ensureCustomMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        customMetrics_ =
            new java.util.ArrayList<com.google.analytics.admin.v1alpha.CustomMetric>(
                customMetrics_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomMetric,
            com.google.analytics.admin.v1alpha.CustomMetric.Builder,
            com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
        customMetricsBuilder_;

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.CustomMetric> getCustomMetricsList() {
      if (customMetricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customMetrics_);
      } else {
        return customMetricsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public int getCustomMetricsCount() {
      if (customMetricsBuilder_ == null) {
        return customMetrics_.size();
      } else {
        return customMetricsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric getCustomMetrics(int index) {
      if (customMetricsBuilder_ == null) {
        return customMetrics_.get(index);
      } else {
        return customMetricsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder setCustomMetrics(
        int index, com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomMetricsIsMutable();
        customMetrics_.set(index, value);
        onChanged();
      } else {
        customMetricsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder setCustomMetrics(
        int index, com.google.analytics.admin.v1alpha.CustomMetric.Builder builderForValue) {
      if (customMetricsBuilder_ == null) {
        ensureCustomMetricsIsMutable();
        customMetrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        customMetricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder addCustomMetrics(com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomMetricsIsMutable();
        customMetrics_.add(value);
        onChanged();
      } else {
        customMetricsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder addCustomMetrics(
        int index, com.google.analytics.admin.v1alpha.CustomMetric value) {
      if (customMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomMetricsIsMutable();
        customMetrics_.add(index, value);
        onChanged();
      } else {
        customMetricsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder addCustomMetrics(
        com.google.analytics.admin.v1alpha.CustomMetric.Builder builderForValue) {
      if (customMetricsBuilder_ == null) {
        ensureCustomMetricsIsMutable();
        customMetrics_.add(builderForValue.build());
        onChanged();
      } else {
        customMetricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder addCustomMetrics(
        int index, com.google.analytics.admin.v1alpha.CustomMetric.Builder builderForValue) {
      if (customMetricsBuilder_ == null) {
        ensureCustomMetricsIsMutable();
        customMetrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        customMetricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder addAllCustomMetrics(
        java.lang.Iterable<? extends com.google.analytics.admin.v1alpha.CustomMetric> values) {
      if (customMetricsBuilder_ == null) {
        ensureCustomMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, customMetrics_);
        onChanged();
      } else {
        customMetricsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder clearCustomMetrics() {
      if (customMetricsBuilder_ == null) {
        customMetrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customMetricsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public Builder removeCustomMetrics(int index) {
      if (customMetricsBuilder_ == null) {
        ensureCustomMetricsIsMutable();
        customMetrics_.remove(index);
        onChanged();
      } else {
        customMetricsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric.Builder getCustomMetricsBuilder(
        int index) {
      return getCustomMetricsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricsOrBuilder(
        int index) {
      if (customMetricsBuilder_ == null) {
        return customMetrics_.get(index);
      } else {
        return customMetricsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public java.util.List<? extends com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
        getCustomMetricsOrBuilderList() {
      if (customMetricsBuilder_ != null) {
        return customMetricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customMetrics_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric.Builder addCustomMetricsBuilder() {
      return getCustomMetricsFieldBuilder()
          .addBuilder(com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.CustomMetric.Builder addCustomMetricsBuilder(
        int index) {
      return getCustomMetricsFieldBuilder()
          .addBuilder(index, com.google.analytics.admin.v1alpha.CustomMetric.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of CustomMetrics.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1alpha.CustomMetric custom_metrics = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.CustomMetric.Builder>
        getCustomMetricsBuilderList() {
      return getCustomMetricsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.CustomMetric,
            com.google.analytics.admin.v1alpha.CustomMetric.Builder,
            com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>
        getCustomMetricsFieldBuilder() {
      if (customMetricsBuilder_ == null) {
        customMetricsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.CustomMetric,
                com.google.analytics.admin.v1alpha.CustomMetric.Builder,
                com.google.analytics.admin.v1alpha.CustomMetricOrBuilder>(
                customMetrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        customMetrics_ = null;
      }
      return customMetricsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ListCustomMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ListCustomMetricsResponse)
  private static final com.google.analytics.admin.v1alpha.ListCustomMetricsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ListCustomMetricsResponse();
  }

  public static com.google.analytics.admin.v1alpha.ListCustomMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomMetricsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListCustomMetricsResponse>() {
        @java.lang.Override
        public ListCustomMetricsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListCustomMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ListCustomMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
