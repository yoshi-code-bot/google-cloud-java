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
// source: google/cloud/visionai/v1/streaming_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * The message that represents server metadata.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ServerMetadata}
 */
public final class ServerMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ServerMetadata)
    ServerMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ServerMetadata.newBuilder() to construct.
  private ServerMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ServerMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ServerMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.StreamingResourcesProto
        .internal_static_google_cloud_visionai_v1_ServerMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.StreamingResourcesProto
        .internal_static_google_cloud_visionai_v1_ServerMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ServerMetadata.class,
            com.google.cloud.visionai.v1.ServerMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int OFFSET_FIELD_NUMBER = 1;
  private long offset_ = 0L;

  /**
   *
   *
   * <pre>
   * The offset position for the packet in its stream.
   * </pre>
   *
   * <code>int64 offset = 1;</code>
   *
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int INGEST_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp ingestTime_;

  /**
   *
   *
   * <pre>
   * The timestamp at which the stream server receives this packet. This is
   * based on the local clock of on the server side. It is guaranteed to be
   * monotonically increasing for the packets within each session; however
   * this timestamp is not comparable across packets sent to the same stream
   * different sessions. Session here refers to one individual gRPC streaming
   * request to the stream server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
   *
   * @return Whether the ingestTime field is set.
   */
  @java.lang.Override
  public boolean hasIngestTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The timestamp at which the stream server receives this packet. This is
   * based on the local clock of on the server side. It is guaranteed to be
   * monotonically increasing for the packets within each session; however
   * this timestamp is not comparable across packets sent to the same stream
   * different sessions. Session here refers to one individual gRPC streaming
   * request to the stream server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
   *
   * @return The ingestTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getIngestTime() {
    return ingestTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : ingestTime_;
  }

  /**
   *
   *
   * <pre>
   * The timestamp at which the stream server receives this packet. This is
   * based on the local clock of on the server side. It is guaranteed to be
   * monotonically increasing for the packets within each session; however
   * this timestamp is not comparable across packets sent to the same stream
   * different sessions. Session here refers to one individual gRPC streaming
   * request to the stream server.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getIngestTimeOrBuilder() {
    return ingestTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : ingestTime_;
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
    if (offset_ != 0L) {
      output.writeInt64(1, offset_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getIngestTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, offset_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIngestTime());
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ServerMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ServerMetadata other =
        (com.google.cloud.visionai.v1.ServerMetadata) obj;

    if (getOffset() != other.getOffset()) return false;
    if (hasIngestTime() != other.hasIngestTime()) return false;
    if (hasIngestTime()) {
      if (!getIngestTime().equals(other.getIngestTime())) return false;
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
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getOffset());
    if (hasIngestTime()) {
      hash = (37 * hash) + INGEST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getIngestTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ServerMetadata parseFrom(
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

  public static Builder newBuilder(com.google.cloud.visionai.v1.ServerMetadata prototype) {
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
   * The message that represents server metadata.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ServerMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ServerMetadata)
      com.google.cloud.visionai.v1.ServerMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.StreamingResourcesProto
          .internal_static_google_cloud_visionai_v1_ServerMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.StreamingResourcesProto
          .internal_static_google_cloud_visionai_v1_ServerMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ServerMetadata.class,
              com.google.cloud.visionai.v1.ServerMetadata.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ServerMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIngestTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      offset_ = 0L;
      ingestTime_ = null;
      if (ingestTimeBuilder_ != null) {
        ingestTimeBuilder_.dispose();
        ingestTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.StreamingResourcesProto
          .internal_static_google_cloud_visionai_v1_ServerMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ServerMetadata getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ServerMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ServerMetadata build() {
      com.google.cloud.visionai.v1.ServerMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ServerMetadata buildPartial() {
      com.google.cloud.visionai.v1.ServerMetadata result =
          new com.google.cloud.visionai.v1.ServerMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ServerMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.offset_ = offset_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ingestTime_ = ingestTimeBuilder_ == null ? ingestTime_ : ingestTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.visionai.v1.ServerMetadata) {
        return mergeFrom((com.google.cloud.visionai.v1.ServerMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ServerMetadata other) {
      if (other == com.google.cloud.visionai.v1.ServerMetadata.getDefaultInstance()) return this;
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.hasIngestTime()) {
        mergeIngestTime(other.getIngestTime());
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
            case 8:
              {
                offset_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getIngestTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private long offset_;

    /**
     *
     *
     * <pre>
     * The offset position for the packet in its stream.
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     *
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }

    /**
     *
     *
     * <pre>
     * The offset position for the packet in its stream.
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     *
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The offset position for the packet in its stream.
     * </pre>
     *
     * <code>int64 offset = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      offset_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp ingestTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        ingestTimeBuilder_;

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     *
     * @return Whether the ingestTime field is set.
     */
    public boolean hasIngestTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     *
     * @return The ingestTime.
     */
    public com.google.protobuf.Timestamp getIngestTime() {
      if (ingestTimeBuilder_ == null) {
        return ingestTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : ingestTime_;
      } else {
        return ingestTimeBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public Builder setIngestTime(com.google.protobuf.Timestamp value) {
      if (ingestTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ingestTime_ = value;
      } else {
        ingestTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public Builder setIngestTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (ingestTimeBuilder_ == null) {
        ingestTime_ = builderForValue.build();
      } else {
        ingestTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public Builder mergeIngestTime(com.google.protobuf.Timestamp value) {
      if (ingestTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && ingestTime_ != null
            && ingestTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getIngestTimeBuilder().mergeFrom(value);
        } else {
          ingestTime_ = value;
        }
      } else {
        ingestTimeBuilder_.mergeFrom(value);
      }
      if (ingestTime_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public Builder clearIngestTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ingestTime_ = null;
      if (ingestTimeBuilder_ != null) {
        ingestTimeBuilder_.dispose();
        ingestTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getIngestTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getIngestTimeFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getIngestTimeOrBuilder() {
      if (ingestTimeBuilder_ != null) {
        return ingestTimeBuilder_.getMessageOrBuilder();
      } else {
        return ingestTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : ingestTime_;
      }
    }

    /**
     *
     *
     * <pre>
     * The timestamp at which the stream server receives this packet. This is
     * based on the local clock of on the server side. It is guaranteed to be
     * monotonically increasing for the packets within each session; however
     * this timestamp is not comparable across packets sent to the same stream
     * different sessions. Session here refers to one individual gRPC streaming
     * request to the stream server.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ingest_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getIngestTimeFieldBuilder() {
      if (ingestTimeBuilder_ == null) {
        ingestTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getIngestTime(), getParentForChildren(), isClean());
        ingestTime_ = null;
      }
      return ingestTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ServerMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ServerMetadata)
  private static final com.google.cloud.visionai.v1.ServerMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ServerMetadata();
  }

  public static com.google.cloud.visionai.v1.ServerMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ServerMetadata>() {
        @java.lang.Override
        public ServerMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ServerMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ServerMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
