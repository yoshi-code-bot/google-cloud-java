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
// source: google/cloud/aiplatform/v1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [FeatureOnlineStoreService.SearchNearestEntities][google.cloud.aiplatform.v1.FeatureOnlineStoreService.SearchNearestEntities]
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.SearchNearestEntitiesResponse}
 */
public final class SearchNearestEntitiesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.SearchNearestEntitiesResponse)
    SearchNearestEntitiesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchNearestEntitiesResponse.newBuilder() to construct.
  private SearchNearestEntitiesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchNearestEntitiesResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchNearestEntitiesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.class,
            com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int NEAREST_NEIGHBORS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.NearestNeighbors nearestNeighbors_;

  /**
   *
   *
   * <pre>
   * The nearest neighbors of the query entity.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
   *
   * @return Whether the nearestNeighbors field is set.
   */
  @java.lang.Override
  public boolean hasNearestNeighbors() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The nearest neighbors of the query entity.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
   *
   * @return The nearestNeighbors.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NearestNeighbors getNearestNeighbors() {
    return nearestNeighbors_ == null
        ? com.google.cloud.aiplatform.v1.NearestNeighbors.getDefaultInstance()
        : nearestNeighbors_;
  }

  /**
   *
   *
   * <pre>
   * The nearest neighbors of the query entity.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.NearestNeighborsOrBuilder getNearestNeighborsOrBuilder() {
    return nearestNeighbors_ == null
        ? com.google.cloud.aiplatform.v1.NearestNeighbors.getDefaultInstance()
        : nearestNeighbors_;
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
      output.writeMessage(1, getNearestNeighbors());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getNearestNeighbors());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse other =
        (com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse) obj;

    if (hasNearestNeighbors() != other.hasNearestNeighbors()) return false;
    if (hasNearestNeighbors()) {
      if (!getNearestNeighbors().equals(other.getNearestNeighbors())) return false;
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
    if (hasNearestNeighbors()) {
      hash = (37 * hash) + NEAREST_NEIGHBORS_FIELD_NUMBER;
      hash = (53 * hash) + getNearestNeighbors().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse prototype) {
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
   * [FeatureOnlineStoreService.SearchNearestEntities][google.cloud.aiplatform.v1.FeatureOnlineStoreService.SearchNearestEntities]
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.SearchNearestEntitiesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.SearchNearestEntitiesResponse)
      com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.class,
              com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getNearestNeighborsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      nearestNeighbors_ = null;
      if (nearestNeighborsBuilder_ != null) {
        nearestNeighborsBuilder_.dispose();
        nearestNeighborsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeatureOnlineStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1_SearchNearestEntitiesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse build() {
      com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse buildPartial() {
      com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse result =
          new com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nearestNeighbors_ =
            nearestNeighborsBuilder_ == null ? nearestNeighbors_ : nearestNeighborsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse.getDefaultInstance())
        return this;
      if (other.hasNearestNeighbors()) {
        mergeNearestNeighbors(other.getNearestNeighbors());
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
                input.readMessage(
                    getNearestNeighborsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.aiplatform.v1.NearestNeighbors nearestNeighbors_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.NearestNeighbors,
            com.google.cloud.aiplatform.v1.NearestNeighbors.Builder,
            com.google.cloud.aiplatform.v1.NearestNeighborsOrBuilder>
        nearestNeighborsBuilder_;

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     *
     * @return Whether the nearestNeighbors field is set.
     */
    public boolean hasNearestNeighbors() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     *
     * @return The nearestNeighbors.
     */
    public com.google.cloud.aiplatform.v1.NearestNeighbors getNearestNeighbors() {
      if (nearestNeighborsBuilder_ == null) {
        return nearestNeighbors_ == null
            ? com.google.cloud.aiplatform.v1.NearestNeighbors.getDefaultInstance()
            : nearestNeighbors_;
      } else {
        return nearestNeighborsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public Builder setNearestNeighbors(com.google.cloud.aiplatform.v1.NearestNeighbors value) {
      if (nearestNeighborsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nearestNeighbors_ = value;
      } else {
        nearestNeighborsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public Builder setNearestNeighbors(
        com.google.cloud.aiplatform.v1.NearestNeighbors.Builder builderForValue) {
      if (nearestNeighborsBuilder_ == null) {
        nearestNeighbors_ = builderForValue.build();
      } else {
        nearestNeighborsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public Builder mergeNearestNeighbors(com.google.cloud.aiplatform.v1.NearestNeighbors value) {
      if (nearestNeighborsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && nearestNeighbors_ != null
            && nearestNeighbors_
                != com.google.cloud.aiplatform.v1.NearestNeighbors.getDefaultInstance()) {
          getNearestNeighborsBuilder().mergeFrom(value);
        } else {
          nearestNeighbors_ = value;
        }
      } else {
        nearestNeighborsBuilder_.mergeFrom(value);
      }
      if (nearestNeighbors_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public Builder clearNearestNeighbors() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nearestNeighbors_ = null;
      if (nearestNeighborsBuilder_ != null) {
        nearestNeighborsBuilder_.dispose();
        nearestNeighborsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NearestNeighbors.Builder getNearestNeighborsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNearestNeighborsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    public com.google.cloud.aiplatform.v1.NearestNeighborsOrBuilder getNearestNeighborsOrBuilder() {
      if (nearestNeighborsBuilder_ != null) {
        return nearestNeighborsBuilder_.getMessageOrBuilder();
      } else {
        return nearestNeighbors_ == null
            ? com.google.cloud.aiplatform.v1.NearestNeighbors.getDefaultInstance()
            : nearestNeighbors_;
      }
    }

    /**
     *
     *
     * <pre>
     * The nearest neighbors of the query entity.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.NearestNeighbors nearest_neighbors = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.NearestNeighbors,
            com.google.cloud.aiplatform.v1.NearestNeighbors.Builder,
            com.google.cloud.aiplatform.v1.NearestNeighborsOrBuilder>
        getNearestNeighborsFieldBuilder() {
      if (nearestNeighborsBuilder_ == null) {
        nearestNeighborsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.NearestNeighbors,
                com.google.cloud.aiplatform.v1.NearestNeighbors.Builder,
                com.google.cloud.aiplatform.v1.NearestNeighborsOrBuilder>(
                getNearestNeighbors(), getParentForChildren(), isClean());
        nearestNeighbors_ = null;
      }
      return nearestNeighborsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.SearchNearestEntitiesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.SearchNearestEntitiesResponse)
  private static final com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse();
  }

  public static com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchNearestEntitiesResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchNearestEntitiesResponse>() {
        @java.lang.Override
        public SearchNearestEntitiesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchNearestEntitiesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchNearestEntitiesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.SearchNearestEntitiesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
