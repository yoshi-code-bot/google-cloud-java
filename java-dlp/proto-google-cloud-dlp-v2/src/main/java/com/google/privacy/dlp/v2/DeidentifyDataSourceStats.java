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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Summary of what was modified during a transformation.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DeidentifyDataSourceStats}
 */
public final class DeidentifyDataSourceStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DeidentifyDataSourceStats)
    DeidentifyDataSourceStatsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DeidentifyDataSourceStats.newBuilder() to construct.
  private DeidentifyDataSourceStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeidentifyDataSourceStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeidentifyDataSourceStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DeidentifyDataSourceStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DeidentifyDataSourceStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DeidentifyDataSourceStats.class,
            com.google.privacy.dlp.v2.DeidentifyDataSourceStats.Builder.class);
  }

  public static final int TRANSFORMED_BYTES_FIELD_NUMBER = 1;
  private long transformedBytes_ = 0L;

  /**
   *
   *
   * <pre>
   * Total size in bytes that were transformed in some way.
   * </pre>
   *
   * <code>int64 transformed_bytes = 1;</code>
   *
   * @return The transformedBytes.
   */
  @java.lang.Override
  public long getTransformedBytes() {
    return transformedBytes_;
  }

  public static final int TRANSFORMATION_COUNT_FIELD_NUMBER = 2;
  private long transformationCount_ = 0L;

  /**
   *
   *
   * <pre>
   * Number of successfully applied transformations.
   * </pre>
   *
   * <code>int64 transformation_count = 2;</code>
   *
   * @return The transformationCount.
   */
  @java.lang.Override
  public long getTransformationCount() {
    return transformationCount_;
  }

  public static final int TRANSFORMATION_ERROR_COUNT_FIELD_NUMBER = 3;
  private long transformationErrorCount_ = 0L;

  /**
   *
   *
   * <pre>
   * Number of errors encountered while trying to apply transformations.
   * </pre>
   *
   * <code>int64 transformation_error_count = 3;</code>
   *
   * @return The transformationErrorCount.
   */
  @java.lang.Override
  public long getTransformationErrorCount() {
    return transformationErrorCount_;
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
    if (transformedBytes_ != 0L) {
      output.writeInt64(1, transformedBytes_);
    }
    if (transformationCount_ != 0L) {
      output.writeInt64(2, transformationCount_);
    }
    if (transformationErrorCount_ != 0L) {
      output.writeInt64(3, transformationErrorCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transformedBytes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, transformedBytes_);
    }
    if (transformationCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, transformationCount_);
    }
    if (transformationErrorCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, transformationErrorCount_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DeidentifyDataSourceStats)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DeidentifyDataSourceStats other =
        (com.google.privacy.dlp.v2.DeidentifyDataSourceStats) obj;

    if (getTransformedBytes() != other.getTransformedBytes()) return false;
    if (getTransformationCount() != other.getTransformationCount()) return false;
    if (getTransformationErrorCount() != other.getTransformationErrorCount()) return false;
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
    hash = (37 * hash) + TRANSFORMED_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTransformedBytes());
    hash = (37 * hash) + TRANSFORMATION_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTransformationCount());
    hash = (37 * hash) + TRANSFORMATION_ERROR_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTransformationErrorCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.DeidentifyDataSourceStats prototype) {
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
   * Summary of what was modified during a transformation.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DeidentifyDataSourceStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DeidentifyDataSourceStats)
      com.google.privacy.dlp.v2.DeidentifyDataSourceStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyDataSourceStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyDataSourceStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DeidentifyDataSourceStats.class,
              com.google.privacy.dlp.v2.DeidentifyDataSourceStats.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DeidentifyDataSourceStats.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      transformedBytes_ = 0L;
      transformationCount_ = 0L;
      transformationErrorCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DeidentifyDataSourceStats_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyDataSourceStats getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DeidentifyDataSourceStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyDataSourceStats build() {
      com.google.privacy.dlp.v2.DeidentifyDataSourceStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DeidentifyDataSourceStats buildPartial() {
      com.google.privacy.dlp.v2.DeidentifyDataSourceStats result =
          new com.google.privacy.dlp.v2.DeidentifyDataSourceStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DeidentifyDataSourceStats result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transformedBytes_ = transformedBytes_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transformationCount_ = transformationCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.transformationErrorCount_ = transformationErrorCount_;
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
      if (other instanceof com.google.privacy.dlp.v2.DeidentifyDataSourceStats) {
        return mergeFrom((com.google.privacy.dlp.v2.DeidentifyDataSourceStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DeidentifyDataSourceStats other) {
      if (other == com.google.privacy.dlp.v2.DeidentifyDataSourceStats.getDefaultInstance())
        return this;
      if (other.getTransformedBytes() != 0L) {
        setTransformedBytes(other.getTransformedBytes());
      }
      if (other.getTransformationCount() != 0L) {
        setTransformationCount(other.getTransformationCount());
      }
      if (other.getTransformationErrorCount() != 0L) {
        setTransformationErrorCount(other.getTransformationErrorCount());
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
                transformedBytes_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                transformationCount_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                transformationErrorCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private long transformedBytes_;

    /**
     *
     *
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 1;</code>
     *
     * @return The transformedBytes.
     */
    @java.lang.Override
    public long getTransformedBytes() {
      return transformedBytes_;
    }

    /**
     *
     *
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 1;</code>
     *
     * @param value The transformedBytes to set.
     * @return This builder for chaining.
     */
    public Builder setTransformedBytes(long value) {

      transformedBytes_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Total size in bytes that were transformed in some way.
     * </pre>
     *
     * <code>int64 transformed_bytes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransformedBytes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transformedBytes_ = 0L;
      onChanged();
      return this;
    }

    private long transformationCount_;

    /**
     *
     *
     * <pre>
     * Number of successfully applied transformations.
     * </pre>
     *
     * <code>int64 transformation_count = 2;</code>
     *
     * @return The transformationCount.
     */
    @java.lang.Override
    public long getTransformationCount() {
      return transformationCount_;
    }

    /**
     *
     *
     * <pre>
     * Number of successfully applied transformations.
     * </pre>
     *
     * <code>int64 transformation_count = 2;</code>
     *
     * @param value The transformationCount to set.
     * @return This builder for chaining.
     */
    public Builder setTransformationCount(long value) {

      transformationCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Number of successfully applied transformations.
     * </pre>
     *
     * <code>int64 transformation_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransformationCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transformationCount_ = 0L;
      onChanged();
      return this;
    }

    private long transformationErrorCount_;

    /**
     *
     *
     * <pre>
     * Number of errors encountered while trying to apply transformations.
     * </pre>
     *
     * <code>int64 transformation_error_count = 3;</code>
     *
     * @return The transformationErrorCount.
     */
    @java.lang.Override
    public long getTransformationErrorCount() {
      return transformationErrorCount_;
    }

    /**
     *
     *
     * <pre>
     * Number of errors encountered while trying to apply transformations.
     * </pre>
     *
     * <code>int64 transformation_error_count = 3;</code>
     *
     * @param value The transformationErrorCount to set.
     * @return This builder for chaining.
     */
    public Builder setTransformationErrorCount(long value) {

      transformationErrorCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Number of errors encountered while trying to apply transformations.
     * </pre>
     *
     * <code>int64 transformation_error_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransformationErrorCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      transformationErrorCount_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DeidentifyDataSourceStats)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DeidentifyDataSourceStats)
  private static final com.google.privacy.dlp.v2.DeidentifyDataSourceStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DeidentifyDataSourceStats();
  }

  public static com.google.privacy.dlp.v2.DeidentifyDataSourceStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeidentifyDataSourceStats> PARSER =
      new com.google.protobuf.AbstractParser<DeidentifyDataSourceStats>() {
        @java.lang.Override
        public DeidentifyDataSourceStats parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeidentifyDataSourceStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeidentifyDataSourceStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DeidentifyDataSourceStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
