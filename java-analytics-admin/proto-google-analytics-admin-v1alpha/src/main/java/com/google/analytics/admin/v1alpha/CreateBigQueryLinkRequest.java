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
 * Request message for CreateBigQueryLink RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateBigQueryLinkRequest}
 */
public final class CreateBigQueryLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateBigQueryLinkRequest)
    CreateBigQueryLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateBigQueryLinkRequest.newBuilder() to construct.
  private CreateBigQueryLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBigQueryLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBigQueryLinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateBigQueryLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateBigQueryLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.class,
            com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BIGQUERY_LINK_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.BigQueryLink bigqueryLink_;

  /**
   *
   *
   * <pre>
   * Required. The BigQueryLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigqueryLink field is set.
   */
  @java.lang.Override
  public boolean hasBigqueryLink() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The BigQueryLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigqueryLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.BigQueryLink getBigqueryLink() {
    return bigqueryLink_ == null
        ? com.google.analytics.admin.v1alpha.BigQueryLink.getDefaultInstance()
        : bigqueryLink_;
  }

  /**
   *
   *
   * <pre>
   * Required. The BigQueryLink to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.BigQueryLinkOrBuilder getBigqueryLinkOrBuilder() {
    return bigqueryLink_ == null
        ? com.google.analytics.admin.v1alpha.BigQueryLink.getDefaultInstance()
        : bigqueryLink_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getBigqueryLink());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBigqueryLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest other =
        (com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasBigqueryLink() != other.hasBigqueryLink()) return false;
    if (hasBigqueryLink()) {
      if (!getBigqueryLink().equals(other.getBigqueryLink())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasBigqueryLink()) {
      hash = (37 * hash) + BIGQUERY_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getBigqueryLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest prototype) {
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
   * Request message for CreateBigQueryLink RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateBigQueryLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateBigQueryLinkRequest)
      com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateBigQueryLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateBigQueryLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.class,
              com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBigqueryLinkFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      bigqueryLink_ = null;
      if (bigqueryLinkBuilder_ != null) {
        bigqueryLinkBuilder_.dispose();
        bigqueryLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateBigQueryLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest build() {
      com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest result =
          new com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bigqueryLink_ =
            bigqueryLinkBuilder_ == null ? bigqueryLink_ : bigqueryLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasBigqueryLink()) {
        mergeBigqueryLink(other.getBigqueryLink());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getBigqueryLinkFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.BigQueryLink bigqueryLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.BigQueryLink,
            com.google.analytics.admin.v1alpha.BigQueryLink.Builder,
            com.google.analytics.admin.v1alpha.BigQueryLinkOrBuilder>
        bigqueryLinkBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the bigqueryLink field is set.
     */
    public boolean hasBigqueryLink() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The bigqueryLink.
     */
    public com.google.analytics.admin.v1alpha.BigQueryLink getBigqueryLink() {
      if (bigqueryLinkBuilder_ == null) {
        return bigqueryLink_ == null
            ? com.google.analytics.admin.v1alpha.BigQueryLink.getDefaultInstance()
            : bigqueryLink_;
      } else {
        return bigqueryLinkBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigqueryLink(com.google.analytics.admin.v1alpha.BigQueryLink value) {
      if (bigqueryLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bigqueryLink_ = value;
      } else {
        bigqueryLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBigqueryLink(
        com.google.analytics.admin.v1alpha.BigQueryLink.Builder builderForValue) {
      if (bigqueryLinkBuilder_ == null) {
        bigqueryLink_ = builderForValue.build();
      } else {
        bigqueryLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBigqueryLink(com.google.analytics.admin.v1alpha.BigQueryLink value) {
      if (bigqueryLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && bigqueryLink_ != null
            && bigqueryLink_
                != com.google.analytics.admin.v1alpha.BigQueryLink.getDefaultInstance()) {
          getBigqueryLinkBuilder().mergeFrom(value);
        } else {
          bigqueryLink_ = value;
        }
      } else {
        bigqueryLinkBuilder_.mergeFrom(value);
      }
      if (bigqueryLink_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBigqueryLink() {
      bitField0_ = (bitField0_ & ~0x00000002);
      bigqueryLink_ = null;
      if (bigqueryLinkBuilder_ != null) {
        bigqueryLinkBuilder_.dispose();
        bigqueryLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.BigQueryLink.Builder getBigqueryLinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getBigqueryLinkFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.BigQueryLinkOrBuilder getBigqueryLinkOrBuilder() {
      if (bigqueryLinkBuilder_ != null) {
        return bigqueryLinkBuilder_.getMessageOrBuilder();
      } else {
        return bigqueryLink_ == null
            ? com.google.analytics.admin.v1alpha.BigQueryLink.getDefaultInstance()
            : bigqueryLink_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The BigQueryLink to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.BigQueryLink bigquery_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.BigQueryLink,
            com.google.analytics.admin.v1alpha.BigQueryLink.Builder,
            com.google.analytics.admin.v1alpha.BigQueryLinkOrBuilder>
        getBigqueryLinkFieldBuilder() {
      if (bigqueryLinkBuilder_ == null) {
        bigqueryLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.BigQueryLink,
                com.google.analytics.admin.v1alpha.BigQueryLink.Builder,
                com.google.analytics.admin.v1alpha.BigQueryLinkOrBuilder>(
                getBigqueryLink(), getParentForChildren(), isClean());
        bigqueryLink_ = null;
      }
      return bigqueryLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateBigQueryLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateBigQueryLinkRequest)
  private static final com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBigQueryLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBigQueryLinkRequest>() {
        @java.lang.Override
        public CreateBigQueryLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBigQueryLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBigQueryLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateBigQueryLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
