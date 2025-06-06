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
// source: google/cloud/networkservices/v1/http_route.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkservices.v1;

/**
 *
 *
 * <pre>
 * Request used by the HttpRoute method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkservices.v1.CreateHttpRouteRequest}
 */
public final class CreateHttpRouteRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkservices.v1.CreateHttpRouteRequest)
    CreateHttpRouteRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateHttpRouteRequest.newBuilder() to construct.
  private CreateHttpRouteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateHttpRouteRequest() {
    parent_ = "";
    httpRouteId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateHttpRouteRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkservices.v1.HttpRouteProto
        .internal_static_google_cloud_networkservices_v1_CreateHttpRouteRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkservices.v1.HttpRouteProto
        .internal_static_google_cloud_networkservices_v1_CreateHttpRouteRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkservices.v1.CreateHttpRouteRequest.class,
            com.google.cloud.networkservices.v1.CreateHttpRouteRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the HttpRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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
   * Required. The parent resource of the HttpRoute. Must be in the
   * format `projects/&#42;&#47;locations/global`.
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

  public static final int HTTP_ROUTE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object httpRouteId_ = "";

  /**
   *
   *
   * <pre>
   * Required. Short name of the HttpRoute resource to be created.
   * </pre>
   *
   * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The httpRouteId.
   */
  @java.lang.Override
  public java.lang.String getHttpRouteId() {
    java.lang.Object ref = httpRouteId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      httpRouteId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Short name of the HttpRoute resource to be created.
   * </pre>
   *
   * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for httpRouteId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHttpRouteIdBytes() {
    java.lang.Object ref = httpRouteId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      httpRouteId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HTTP_ROUTE_FIELD_NUMBER = 3;
  private com.google.cloud.networkservices.v1.HttpRoute httpRoute_;

  /**
   *
   *
   * <pre>
   * Required. HttpRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the httpRoute field is set.
   */
  @java.lang.Override
  public boolean hasHttpRoute() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. HttpRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The httpRoute.
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.HttpRoute getHttpRoute() {
    return httpRoute_ == null
        ? com.google.cloud.networkservices.v1.HttpRoute.getDefaultInstance()
        : httpRoute_;
  }

  /**
   *
   *
   * <pre>
   * Required. HttpRoute resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.networkservices.v1.HttpRouteOrBuilder getHttpRouteOrBuilder() {
    return httpRoute_ == null
        ? com.google.cloud.networkservices.v1.HttpRoute.getDefaultInstance()
        : httpRoute_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(httpRouteId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, httpRouteId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getHttpRoute());
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(httpRouteId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, httpRouteId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getHttpRoute());
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
    if (!(obj instanceof com.google.cloud.networkservices.v1.CreateHttpRouteRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.networkservices.v1.CreateHttpRouteRequest other =
        (com.google.cloud.networkservices.v1.CreateHttpRouteRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getHttpRouteId().equals(other.getHttpRouteId())) return false;
    if (hasHttpRoute() != other.hasHttpRoute()) return false;
    if (hasHttpRoute()) {
      if (!getHttpRoute().equals(other.getHttpRoute())) return false;
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
    hash = (37 * hash) + HTTP_ROUTE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHttpRouteId().hashCode();
    if (hasHttpRoute()) {
      hash = (37 * hash) + HTTP_ROUTE_FIELD_NUMBER;
      hash = (53 * hash) + getHttpRoute().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest parseFrom(
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
      com.google.cloud.networkservices.v1.CreateHttpRouteRequest prototype) {
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
   * Request used by the HttpRoute method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkservices.v1.CreateHttpRouteRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkservices.v1.CreateHttpRouteRequest)
      com.google.cloud.networkservices.v1.CreateHttpRouteRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkservices.v1.HttpRouteProto
          .internal_static_google_cloud_networkservices_v1_CreateHttpRouteRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkservices.v1.HttpRouteProto
          .internal_static_google_cloud_networkservices_v1_CreateHttpRouteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkservices.v1.CreateHttpRouteRequest.class,
              com.google.cloud.networkservices.v1.CreateHttpRouteRequest.Builder.class);
    }

    // Construct using com.google.cloud.networkservices.v1.CreateHttpRouteRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getHttpRouteFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      httpRouteId_ = "";
      httpRoute_ = null;
      if (httpRouteBuilder_ != null) {
        httpRouteBuilder_.dispose();
        httpRouteBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkservices.v1.HttpRouteProto
          .internal_static_google_cloud_networkservices_v1_CreateHttpRouteRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateHttpRouteRequest getDefaultInstanceForType() {
      return com.google.cloud.networkservices.v1.CreateHttpRouteRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateHttpRouteRequest build() {
      com.google.cloud.networkservices.v1.CreateHttpRouteRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkservices.v1.CreateHttpRouteRequest buildPartial() {
      com.google.cloud.networkservices.v1.CreateHttpRouteRequest result =
          new com.google.cloud.networkservices.v1.CreateHttpRouteRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networkservices.v1.CreateHttpRouteRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.httpRouteId_ = httpRouteId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.httpRoute_ = httpRouteBuilder_ == null ? httpRoute_ : httpRouteBuilder_.build();
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
      if (other instanceof com.google.cloud.networkservices.v1.CreateHttpRouteRequest) {
        return mergeFrom((com.google.cloud.networkservices.v1.CreateHttpRouteRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkservices.v1.CreateHttpRouteRequest other) {
      if (other == com.google.cloud.networkservices.v1.CreateHttpRouteRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHttpRouteId().isEmpty()) {
        httpRouteId_ = other.httpRouteId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasHttpRoute()) {
        mergeHttpRoute(other.getHttpRoute());
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
                httpRouteId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getHttpRouteFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The parent resource of the HttpRoute. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the HttpRoute. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the HttpRoute. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the HttpRoute. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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
     * Required. The parent resource of the HttpRoute. Must be in the
     * format `projects/&#42;&#47;locations/global`.
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

    private java.lang.Object httpRouteId_ = "";

    /**
     *
     *
     * <pre>
     * Required. Short name of the HttpRoute resource to be created.
     * </pre>
     *
     * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The httpRouteId.
     */
    public java.lang.String getHttpRouteId() {
      java.lang.Object ref = httpRouteId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        httpRouteId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Short name of the HttpRoute resource to be created.
     * </pre>
     *
     * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for httpRouteId.
     */
    public com.google.protobuf.ByteString getHttpRouteIdBytes() {
      java.lang.Object ref = httpRouteId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        httpRouteId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Short name of the HttpRoute resource to be created.
     * </pre>
     *
     * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The httpRouteId to set.
     * @return This builder for chaining.
     */
    public Builder setHttpRouteId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      httpRouteId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Short name of the HttpRoute resource to be created.
     * </pre>
     *
     * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHttpRouteId() {
      httpRouteId_ = getDefaultInstance().getHttpRouteId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Short name of the HttpRoute resource to be created.
     * </pre>
     *
     * <code>string http_route_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for httpRouteId to set.
     * @return This builder for chaining.
     */
    public Builder setHttpRouteIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      httpRouteId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.networkservices.v1.HttpRoute httpRoute_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.HttpRoute,
            com.google.cloud.networkservices.v1.HttpRoute.Builder,
            com.google.cloud.networkservices.v1.HttpRouteOrBuilder>
        httpRouteBuilder_;

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the httpRoute field is set.
     */
    public boolean hasHttpRoute() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The httpRoute.
     */
    public com.google.cloud.networkservices.v1.HttpRoute getHttpRoute() {
      if (httpRouteBuilder_ == null) {
        return httpRoute_ == null
            ? com.google.cloud.networkservices.v1.HttpRoute.getDefaultInstance()
            : httpRoute_;
      } else {
        return httpRouteBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHttpRoute(com.google.cloud.networkservices.v1.HttpRoute value) {
      if (httpRouteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpRoute_ = value;
      } else {
        httpRouteBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setHttpRoute(
        com.google.cloud.networkservices.v1.HttpRoute.Builder builderForValue) {
      if (httpRouteBuilder_ == null) {
        httpRoute_ = builderForValue.build();
      } else {
        httpRouteBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeHttpRoute(com.google.cloud.networkservices.v1.HttpRoute value) {
      if (httpRouteBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && httpRoute_ != null
            && httpRoute_ != com.google.cloud.networkservices.v1.HttpRoute.getDefaultInstance()) {
          getHttpRouteBuilder().mergeFrom(value);
        } else {
          httpRoute_ = value;
        }
      } else {
        httpRouteBuilder_.mergeFrom(value);
      }
      if (httpRoute_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearHttpRoute() {
      bitField0_ = (bitField0_ & ~0x00000004);
      httpRoute_ = null;
      if (httpRouteBuilder_ != null) {
        httpRouteBuilder_.dispose();
        httpRouteBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkservices.v1.HttpRoute.Builder getHttpRouteBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getHttpRouteFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.networkservices.v1.HttpRouteOrBuilder getHttpRouteOrBuilder() {
      if (httpRouteBuilder_ != null) {
        return httpRouteBuilder_.getMessageOrBuilder();
      } else {
        return httpRoute_ == null
            ? com.google.cloud.networkservices.v1.HttpRoute.getDefaultInstance()
            : httpRoute_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. HttpRoute resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.networkservices.v1.HttpRoute http_route = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.networkservices.v1.HttpRoute,
            com.google.cloud.networkservices.v1.HttpRoute.Builder,
            com.google.cloud.networkservices.v1.HttpRouteOrBuilder>
        getHttpRouteFieldBuilder() {
      if (httpRouteBuilder_ == null) {
        httpRouteBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.networkservices.v1.HttpRoute,
                com.google.cloud.networkservices.v1.HttpRoute.Builder,
                com.google.cloud.networkservices.v1.HttpRouteOrBuilder>(
                getHttpRoute(), getParentForChildren(), isClean());
        httpRoute_ = null;
      }
      return httpRouteBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkservices.v1.CreateHttpRouteRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkservices.v1.CreateHttpRouteRequest)
  private static final com.google.cloud.networkservices.v1.CreateHttpRouteRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkservices.v1.CreateHttpRouteRequest();
  }

  public static com.google.cloud.networkservices.v1.CreateHttpRouteRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateHttpRouteRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateHttpRouteRequest>() {
        @java.lang.Override
        public CreateHttpRouteRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateHttpRouteRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateHttpRouteRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkservices.v1.CreateHttpRouteRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
