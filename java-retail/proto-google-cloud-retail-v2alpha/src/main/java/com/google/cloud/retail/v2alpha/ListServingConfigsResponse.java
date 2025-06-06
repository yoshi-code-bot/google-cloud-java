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
// source: google/cloud/retail/v2alpha/serving_config_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Response for ListServingConfigs method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.ListServingConfigsResponse}
 */
public final class ListServingConfigsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.ListServingConfigsResponse)
    ListServingConfigsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListServingConfigsResponse.newBuilder() to construct.
  private ListServingConfigsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServingConfigsResponse() {
    servingConfigs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListServingConfigsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2alpha_ListServingConfigsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.ServingConfigServiceProto
        .internal_static_google_cloud_retail_v2alpha_ListServingConfigsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.ListServingConfigsResponse.class,
            com.google.cloud.retail.v2alpha.ListServingConfigsResponse.Builder.class);
  }

  public static final int SERVING_CONFIGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.retail.v2alpha.ServingConfig> servingConfigs_;

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2alpha.ServingConfig> getServingConfigsList() {
    return servingConfigs_;
  }

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.retail.v2alpha.ServingConfigOrBuilder>
      getServingConfigsOrBuilderList() {
    return servingConfigs_;
  }

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  @java.lang.Override
  public int getServingConfigsCount() {
    return servingConfigs_.size();
  }

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.ServingConfig getServingConfigs(int index) {
    return servingConfigs_.get(index);
  }

  /**
   *
   *
   * <pre>
   * All the ServingConfigs for a given catalog.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.ServingConfigOrBuilder getServingConfigsOrBuilder(
      int index) {
    return servingConfigs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * Pagination token, if not returned indicates the last page.
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
   * Pagination token, if not returned indicates the last page.
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
    for (int i = 0; i < servingConfigs_.size(); i++) {
      output.writeMessage(1, servingConfigs_.get(i));
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
    for (int i = 0; i < servingConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, servingConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.ListServingConfigsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.ListServingConfigsResponse other =
        (com.google.cloud.retail.v2alpha.ListServingConfigsResponse) obj;

    if (!getServingConfigsList().equals(other.getServingConfigsList())) return false;
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
    if (getServingConfigsCount() > 0) {
      hash = (37 * hash) + SERVING_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getServingConfigsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse parseFrom(
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
      com.google.cloud.retail.v2alpha.ListServingConfigsResponse prototype) {
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
   * Response for ListServingConfigs method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.ListServingConfigsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.ListServingConfigsResponse)
      com.google.cloud.retail.v2alpha.ListServingConfigsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListServingConfigsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListServingConfigsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.ListServingConfigsResponse.class,
              com.google.cloud.retail.v2alpha.ListServingConfigsResponse.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.ListServingConfigsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (servingConfigsBuilder_ == null) {
        servingConfigs_ = java.util.Collections.emptyList();
      } else {
        servingConfigs_ = null;
        servingConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.ServingConfigServiceProto
          .internal_static_google_cloud_retail_v2alpha_ListServingConfigsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListServingConfigsResponse getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.ListServingConfigsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListServingConfigsResponse build() {
      com.google.cloud.retail.v2alpha.ListServingConfigsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.ListServingConfigsResponse buildPartial() {
      com.google.cloud.retail.v2alpha.ListServingConfigsResponse result =
          new com.google.cloud.retail.v2alpha.ListServingConfigsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.retail.v2alpha.ListServingConfigsResponse result) {
      if (servingConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          servingConfigs_ = java.util.Collections.unmodifiableList(servingConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.servingConfigs_ = servingConfigs_;
      } else {
        result.servingConfigs_ = servingConfigsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.ListServingConfigsResponse result) {
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
      if (other instanceof com.google.cloud.retail.v2alpha.ListServingConfigsResponse) {
        return mergeFrom((com.google.cloud.retail.v2alpha.ListServingConfigsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.ListServingConfigsResponse other) {
      if (other == com.google.cloud.retail.v2alpha.ListServingConfigsResponse.getDefaultInstance())
        return this;
      if (servingConfigsBuilder_ == null) {
        if (!other.servingConfigs_.isEmpty()) {
          if (servingConfigs_.isEmpty()) {
            servingConfigs_ = other.servingConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServingConfigsIsMutable();
            servingConfigs_.addAll(other.servingConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.servingConfigs_.isEmpty()) {
          if (servingConfigsBuilder_.isEmpty()) {
            servingConfigsBuilder_.dispose();
            servingConfigsBuilder_ = null;
            servingConfigs_ = other.servingConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servingConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getServingConfigsFieldBuilder()
                    : null;
          } else {
            servingConfigsBuilder_.addAllMessages(other.servingConfigs_);
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
                com.google.cloud.retail.v2alpha.ServingConfig m =
                    input.readMessage(
                        com.google.cloud.retail.v2alpha.ServingConfig.parser(), extensionRegistry);
                if (servingConfigsBuilder_ == null) {
                  ensureServingConfigsIsMutable();
                  servingConfigs_.add(m);
                } else {
                  servingConfigsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.retail.v2alpha.ServingConfig> servingConfigs_ =
        java.util.Collections.emptyList();

    private void ensureServingConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        servingConfigs_ =
            new java.util.ArrayList<com.google.cloud.retail.v2alpha.ServingConfig>(servingConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2alpha.ServingConfig,
            com.google.cloud.retail.v2alpha.ServingConfig.Builder,
            com.google.cloud.retail.v2alpha.ServingConfigOrBuilder>
        servingConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2alpha.ServingConfig> getServingConfigsList() {
      if (servingConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(servingConfigs_);
      } else {
        return servingConfigsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public int getServingConfigsCount() {
      if (servingConfigsBuilder_ == null) {
        return servingConfigs_.size();
      } else {
        return servingConfigsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public com.google.cloud.retail.v2alpha.ServingConfig getServingConfigs(int index) {
      if (servingConfigsBuilder_ == null) {
        return servingConfigs_.get(index);
      } else {
        return servingConfigsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder setServingConfigs(
        int index, com.google.cloud.retail.v2alpha.ServingConfig value) {
      if (servingConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServingConfigsIsMutable();
        servingConfigs_.set(index, value);
        onChanged();
      } else {
        servingConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder setServingConfigs(
        int index, com.google.cloud.retail.v2alpha.ServingConfig.Builder builderForValue) {
      if (servingConfigsBuilder_ == null) {
        ensureServingConfigsIsMutable();
        servingConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        servingConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder addServingConfigs(com.google.cloud.retail.v2alpha.ServingConfig value) {
      if (servingConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServingConfigsIsMutable();
        servingConfigs_.add(value);
        onChanged();
      } else {
        servingConfigsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder addServingConfigs(
        int index, com.google.cloud.retail.v2alpha.ServingConfig value) {
      if (servingConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServingConfigsIsMutable();
        servingConfigs_.add(index, value);
        onChanged();
      } else {
        servingConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder addServingConfigs(
        com.google.cloud.retail.v2alpha.ServingConfig.Builder builderForValue) {
      if (servingConfigsBuilder_ == null) {
        ensureServingConfigsIsMutable();
        servingConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        servingConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder addServingConfigs(
        int index, com.google.cloud.retail.v2alpha.ServingConfig.Builder builderForValue) {
      if (servingConfigsBuilder_ == null) {
        ensureServingConfigsIsMutable();
        servingConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        servingConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder addAllServingConfigs(
        java.lang.Iterable<? extends com.google.cloud.retail.v2alpha.ServingConfig> values) {
      if (servingConfigsBuilder_ == null) {
        ensureServingConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, servingConfigs_);
        onChanged();
      } else {
        servingConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder clearServingConfigs() {
      if (servingConfigsBuilder_ == null) {
        servingConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servingConfigsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public Builder removeServingConfigs(int index) {
      if (servingConfigsBuilder_ == null) {
        ensureServingConfigsIsMutable();
        servingConfigs_.remove(index);
        onChanged();
      } else {
        servingConfigsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public com.google.cloud.retail.v2alpha.ServingConfig.Builder getServingConfigsBuilder(
        int index) {
      return getServingConfigsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public com.google.cloud.retail.v2alpha.ServingConfigOrBuilder getServingConfigsOrBuilder(
        int index) {
      if (servingConfigsBuilder_ == null) {
        return servingConfigs_.get(index);
      } else {
        return servingConfigsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.retail.v2alpha.ServingConfigOrBuilder>
        getServingConfigsOrBuilderList() {
      if (servingConfigsBuilder_ != null) {
        return servingConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(servingConfigs_);
      }
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public com.google.cloud.retail.v2alpha.ServingConfig.Builder addServingConfigsBuilder() {
      return getServingConfigsFieldBuilder()
          .addBuilder(com.google.cloud.retail.v2alpha.ServingConfig.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public com.google.cloud.retail.v2alpha.ServingConfig.Builder addServingConfigsBuilder(
        int index) {
      return getServingConfigsFieldBuilder()
          .addBuilder(index, com.google.cloud.retail.v2alpha.ServingConfig.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * All the ServingConfigs for a given catalog.
     * </pre>
     *
     * <code>repeated .google.cloud.retail.v2alpha.ServingConfig serving_configs = 1;</code>
     */
    public java.util.List<com.google.cloud.retail.v2alpha.ServingConfig.Builder>
        getServingConfigsBuilderList() {
      return getServingConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.retail.v2alpha.ServingConfig,
            com.google.cloud.retail.v2alpha.ServingConfig.Builder,
            com.google.cloud.retail.v2alpha.ServingConfigOrBuilder>
        getServingConfigsFieldBuilder() {
      if (servingConfigsBuilder_ == null) {
        servingConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.retail.v2alpha.ServingConfig,
                com.google.cloud.retail.v2alpha.ServingConfig.Builder,
                com.google.cloud.retail.v2alpha.ServingConfigOrBuilder>(
                servingConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        servingConfigs_ = null;
      }
      return servingConfigsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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
     * Pagination token, if not returned indicates the last page.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.ListServingConfigsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.ListServingConfigsResponse)
  private static final com.google.cloud.retail.v2alpha.ListServingConfigsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.ListServingConfigsResponse();
  }

  public static com.google.cloud.retail.v2alpha.ListServingConfigsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServingConfigsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServingConfigsResponse>() {
        @java.lang.Override
        public ListServingConfigsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListServingConfigsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServingConfigsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.ListServingConfigsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
