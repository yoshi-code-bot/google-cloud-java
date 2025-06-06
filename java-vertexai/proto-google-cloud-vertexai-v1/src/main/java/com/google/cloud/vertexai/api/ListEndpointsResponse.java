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
// source: google/cloud/vertexai/v1/endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vertexai.api;

/**
 *
 *
 * <pre>
 * Response message for
 * [EndpointService.ListEndpoints][google.cloud.aiplatform.v1.EndpointService.ListEndpoints].
 * </pre>
 *
 * Protobuf type {@code google.cloud.vertexai.v1.ListEndpointsResponse}
 */
public final class ListEndpointsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vertexai.v1.ListEndpointsResponse)
    ListEndpointsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListEndpointsResponse.newBuilder() to construct.
  private ListEndpointsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEndpointsResponse() {
    endpoints_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEndpointsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vertexai.api.EndpointServiceProto
        .internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vertexai.api.EndpointServiceProto
        .internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vertexai.api.ListEndpointsResponse.class,
            com.google.cloud.vertexai.api.ListEndpointsResponse.Builder.class);
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.vertexai.api.Endpoint> endpoints_;

  /**
   *
   *
   * <pre>
   * List of Endpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.vertexai.api.Endpoint> getEndpointsList() {
    return endpoints_;
  }

  /**
   *
   *
   * <pre>
   * List of Endpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.vertexai.api.EndpointOrBuilder>
      getEndpointsOrBuilderList() {
    return endpoints_;
  }

  /**
   *
   *
   * <pre>
   * List of Endpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
   */
  @java.lang.Override
  public int getEndpointsCount() {
    return endpoints_.size();
  }

  /**
   *
   *
   * <pre>
   * List of Endpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.Endpoint getEndpoints(int index) {
    return endpoints_.get(index);
  }

  /**
   *
   *
   * <pre>
   * List of Endpoints in the requested page.
   * </pre>
   *
   * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vertexai.api.EndpointOrBuilder getEndpointsOrBuilder(int index) {
    return endpoints_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
   * to obtain that page.
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
   * A token to retrieve the next page of results.
   * Pass to
   * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
   * to obtain that page.
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
    for (int i = 0; i < endpoints_.size(); i++) {
      output.writeMessage(1, endpoints_.get(i));
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
    for (int i = 0; i < endpoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, endpoints_.get(i));
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
    if (!(obj instanceof com.google.cloud.vertexai.api.ListEndpointsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vertexai.api.ListEndpointsResponse other =
        (com.google.cloud.vertexai.api.ListEndpointsResponse) obj;

    if (!getEndpointsList().equals(other.getEndpointsList())) return false;
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
    if (getEndpointsCount() > 0) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndpointsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vertexai.api.ListEndpointsResponse prototype) {
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
   * Response message for
   * [EndpointService.ListEndpoints][google.cloud.aiplatform.v1.EndpointService.ListEndpoints].
   * </pre>
   *
   * Protobuf type {@code google.cloud.vertexai.v1.ListEndpointsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vertexai.v1.ListEndpointsResponse)
      com.google.cloud.vertexai.api.ListEndpointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vertexai.api.EndpointServiceProto
          .internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vertexai.api.EndpointServiceProto
          .internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vertexai.api.ListEndpointsResponse.class,
              com.google.cloud.vertexai.api.ListEndpointsResponse.Builder.class);
    }

    // Construct using com.google.cloud.vertexai.api.ListEndpointsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (endpointsBuilder_ == null) {
        endpoints_ = java.util.Collections.emptyList();
      } else {
        endpoints_ = null;
        endpointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vertexai.api.EndpointServiceProto
          .internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ListEndpointsResponse getDefaultInstanceForType() {
      return com.google.cloud.vertexai.api.ListEndpointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ListEndpointsResponse build() {
      com.google.cloud.vertexai.api.ListEndpointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vertexai.api.ListEndpointsResponse buildPartial() {
      com.google.cloud.vertexai.api.ListEndpointsResponse result =
          new com.google.cloud.vertexai.api.ListEndpointsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.vertexai.api.ListEndpointsResponse result) {
      if (endpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          endpoints_ = java.util.Collections.unmodifiableList(endpoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.endpoints_ = endpoints_;
      } else {
        result.endpoints_ = endpointsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.vertexai.api.ListEndpointsResponse result) {
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
      if (other instanceof com.google.cloud.vertexai.api.ListEndpointsResponse) {
        return mergeFrom((com.google.cloud.vertexai.api.ListEndpointsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vertexai.api.ListEndpointsResponse other) {
      if (other == com.google.cloud.vertexai.api.ListEndpointsResponse.getDefaultInstance())
        return this;
      if (endpointsBuilder_ == null) {
        if (!other.endpoints_.isEmpty()) {
          if (endpoints_.isEmpty()) {
            endpoints_ = other.endpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEndpointsIsMutable();
            endpoints_.addAll(other.endpoints_);
          }
          onChanged();
        }
      } else {
        if (!other.endpoints_.isEmpty()) {
          if (endpointsBuilder_.isEmpty()) {
            endpointsBuilder_.dispose();
            endpointsBuilder_ = null;
            endpoints_ = other.endpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            endpointsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEndpointsFieldBuilder()
                    : null;
          } else {
            endpointsBuilder_.addAllMessages(other.endpoints_);
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
                com.google.cloud.vertexai.api.Endpoint m =
                    input.readMessage(
                        com.google.cloud.vertexai.api.Endpoint.parser(), extensionRegistry);
                if (endpointsBuilder_ == null) {
                  ensureEndpointsIsMutable();
                  endpoints_.add(m);
                } else {
                  endpointsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.vertexai.api.Endpoint> endpoints_ =
        java.util.Collections.emptyList();

    private void ensureEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        endpoints_ = new java.util.ArrayList<com.google.cloud.vertexai.api.Endpoint>(endpoints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.Endpoint,
            com.google.cloud.vertexai.api.Endpoint.Builder,
            com.google.cloud.vertexai.api.EndpointOrBuilder>
        endpointsBuilder_;

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public java.util.List<com.google.cloud.vertexai.api.Endpoint> getEndpointsList() {
      if (endpointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(endpoints_);
      } else {
        return endpointsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public int getEndpointsCount() {
      if (endpointsBuilder_ == null) {
        return endpoints_.size();
      } else {
        return endpointsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public com.google.cloud.vertexai.api.Endpoint getEndpoints(int index) {
      if (endpointsBuilder_ == null) {
        return endpoints_.get(index);
      } else {
        return endpointsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder setEndpoints(int index, com.google.cloud.vertexai.api.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.set(index, value);
        onChanged();
      } else {
        endpointsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder setEndpoints(
        int index, com.google.cloud.vertexai.api.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder addEndpoints(com.google.cloud.vertexai.api.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.add(value);
        onChanged();
      } else {
        endpointsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder addEndpoints(int index, com.google.cloud.vertexai.api.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.add(index, value);
        onChanged();
      } else {
        endpointsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder addEndpoints(com.google.cloud.vertexai.api.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.add(builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder addEndpoints(
        int index, com.google.cloud.vertexai.api.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder addAllEndpoints(
        java.lang.Iterable<? extends com.google.cloud.vertexai.api.Endpoint> values) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, endpoints_);
        onChanged();
      } else {
        endpointsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder clearEndpoints() {
      if (endpointsBuilder_ == null) {
        endpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        endpointsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public Builder removeEndpoints(int index) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.remove(index);
        onChanged();
      } else {
        endpointsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public com.google.cloud.vertexai.api.Endpoint.Builder getEndpointsBuilder(int index) {
      return getEndpointsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public com.google.cloud.vertexai.api.EndpointOrBuilder getEndpointsOrBuilder(int index) {
      if (endpointsBuilder_ == null) {
        return endpoints_.get(index);
      } else {
        return endpointsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vertexai.api.EndpointOrBuilder>
        getEndpointsOrBuilderList() {
      if (endpointsBuilder_ != null) {
        return endpointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(endpoints_);
      }
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public com.google.cloud.vertexai.api.Endpoint.Builder addEndpointsBuilder() {
      return getEndpointsFieldBuilder()
          .addBuilder(com.google.cloud.vertexai.api.Endpoint.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public com.google.cloud.vertexai.api.Endpoint.Builder addEndpointsBuilder(int index) {
      return getEndpointsFieldBuilder()
          .addBuilder(index, com.google.cloud.vertexai.api.Endpoint.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * List of Endpoints in the requested page.
     * </pre>
     *
     * <code>repeated .google.cloud.vertexai.v1.Endpoint endpoints = 1;</code>
     */
    public java.util.List<com.google.cloud.vertexai.api.Endpoint.Builder>
        getEndpointsBuilderList() {
      return getEndpointsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vertexai.api.Endpoint,
            com.google.cloud.vertexai.api.Endpoint.Builder,
            com.google.cloud.vertexai.api.EndpointOrBuilder>
        getEndpointsFieldBuilder() {
      if (endpointsBuilder_ == null) {
        endpointsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vertexai.api.Endpoint,
                com.google.cloud.vertexai.api.Endpoint.Builder,
                com.google.cloud.vertexai.api.EndpointOrBuilder>(
                endpoints_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        endpoints_ = null;
      }
      return endpointsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results.
     * Pass to
     * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
     * to obtain that page.
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
     * A token to retrieve the next page of results.
     * Pass to
     * [ListEndpointsRequest.page_token][google.cloud.aiplatform.v1.ListEndpointsRequest.page_token]
     * to obtain that page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vertexai.v1.ListEndpointsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vertexai.v1.ListEndpointsResponse)
  private static final com.google.cloud.vertexai.api.ListEndpointsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vertexai.api.ListEndpointsResponse();
  }

  public static com.google.cloud.vertexai.api.ListEndpointsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEndpointsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEndpointsResponse>() {
        @java.lang.Override
        public ListEndpointsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListEndpointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEndpointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vertexai.api.ListEndpointsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
