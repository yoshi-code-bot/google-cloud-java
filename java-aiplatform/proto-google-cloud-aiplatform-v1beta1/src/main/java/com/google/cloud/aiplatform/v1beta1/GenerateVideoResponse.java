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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Generate video response.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.GenerateVideoResponse}
 */
public final class GenerateVideoResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.GenerateVideoResponse)
    GenerateVideoResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use GenerateVideoResponse.newBuilder() to construct.
  private GenerateVideoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateVideoResponse() {
    generatedSamples_ = com.google.protobuf.LazyStringArrayList.emptyList();
    raiMediaFilteredReasons_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateVideoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_GenerateVideoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_GenerateVideoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.class,
            com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.Builder.class);
  }

  private int bitField0_;
  public static final int GENERATED_SAMPLES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList generatedSamples_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The cloud storage uris of the generated videos.
   * </pre>
   *
   * <code>repeated string generated_samples = 1;</code>
   *
   * @return A list containing the generatedSamples.
   */
  public com.google.protobuf.ProtocolStringList getGeneratedSamplesList() {
    return generatedSamples_;
  }

  /**
   *
   *
   * <pre>
   * The cloud storage uris of the generated videos.
   * </pre>
   *
   * <code>repeated string generated_samples = 1;</code>
   *
   * @return The count of generatedSamples.
   */
  public int getGeneratedSamplesCount() {
    return generatedSamples_.size();
  }

  /**
   *
   *
   * <pre>
   * The cloud storage uris of the generated videos.
   * </pre>
   *
   * <code>repeated string generated_samples = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The generatedSamples at the given index.
   */
  public java.lang.String getGeneratedSamples(int index) {
    return generatedSamples_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The cloud storage uris of the generated videos.
   * </pre>
   *
   * <code>repeated string generated_samples = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the generatedSamples at the given index.
   */
  public com.google.protobuf.ByteString getGeneratedSamplesBytes(int index) {
    return generatedSamples_.getByteString(index);
  }

  public static final int RAI_MEDIA_FILTERED_COUNT_FIELD_NUMBER = 2;
  private int raiMediaFilteredCount_ = 0;

  /**
   *
   *
   * <pre>
   * Returns if any videos were filtered due to RAI policies.
   * </pre>
   *
   * <code>optional int32 rai_media_filtered_count = 2;</code>
   *
   * @return Whether the raiMediaFilteredCount field is set.
   */
  @java.lang.Override
  public boolean hasRaiMediaFilteredCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Returns if any videos were filtered due to RAI policies.
   * </pre>
   *
   * <code>optional int32 rai_media_filtered_count = 2;</code>
   *
   * @return The raiMediaFilteredCount.
   */
  @java.lang.Override
  public int getRaiMediaFilteredCount() {
    return raiMediaFilteredCount_;
  }

  public static final int RAI_MEDIA_FILTERED_REASONS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList raiMediaFilteredReasons_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Returns rai failure reasons if any.
   * </pre>
   *
   * <code>repeated string rai_media_filtered_reasons = 3;</code>
   *
   * @return A list containing the raiMediaFilteredReasons.
   */
  public com.google.protobuf.ProtocolStringList getRaiMediaFilteredReasonsList() {
    return raiMediaFilteredReasons_;
  }

  /**
   *
   *
   * <pre>
   * Returns rai failure reasons if any.
   * </pre>
   *
   * <code>repeated string rai_media_filtered_reasons = 3;</code>
   *
   * @return The count of raiMediaFilteredReasons.
   */
  public int getRaiMediaFilteredReasonsCount() {
    return raiMediaFilteredReasons_.size();
  }

  /**
   *
   *
   * <pre>
   * Returns rai failure reasons if any.
   * </pre>
   *
   * <code>repeated string rai_media_filtered_reasons = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The raiMediaFilteredReasons at the given index.
   */
  public java.lang.String getRaiMediaFilteredReasons(int index) {
    return raiMediaFilteredReasons_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Returns rai failure reasons if any.
   * </pre>
   *
   * <code>repeated string rai_media_filtered_reasons = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the raiMediaFilteredReasons at the given index.
   */
  public com.google.protobuf.ByteString getRaiMediaFilteredReasonsBytes(int index) {
    return raiMediaFilteredReasons_.getByteString(index);
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
    for (int i = 0; i < generatedSamples_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, generatedSamples_.getRaw(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(2, raiMediaFilteredCount_);
    }
    for (int i = 0; i < raiMediaFilteredReasons_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 3, raiMediaFilteredReasons_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < generatedSamples_.size(); i++) {
        dataSize += computeStringSizeNoTag(generatedSamples_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getGeneratedSamplesList().size();
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, raiMediaFilteredCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < raiMediaFilteredReasons_.size(); i++) {
        dataSize += computeStringSizeNoTag(raiMediaFilteredReasons_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRaiMediaFilteredReasonsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse other =
        (com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse) obj;

    if (!getGeneratedSamplesList().equals(other.getGeneratedSamplesList())) return false;
    if (hasRaiMediaFilteredCount() != other.hasRaiMediaFilteredCount()) return false;
    if (hasRaiMediaFilteredCount()) {
      if (getRaiMediaFilteredCount() != other.getRaiMediaFilteredCount()) return false;
    }
    if (!getRaiMediaFilteredReasonsList().equals(other.getRaiMediaFilteredReasonsList()))
      return false;
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
    if (getGeneratedSamplesCount() > 0) {
      hash = (37 * hash) + GENERATED_SAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getGeneratedSamplesList().hashCode();
    }
    if (hasRaiMediaFilteredCount()) {
      hash = (37 * hash) + RAI_MEDIA_FILTERED_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getRaiMediaFilteredCount();
    }
    if (getRaiMediaFilteredReasonsCount() > 0) {
      hash = (37 * hash) + RAI_MEDIA_FILTERED_REASONS_FIELD_NUMBER;
      hash = (53 * hash) + getRaiMediaFilteredReasonsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse prototype) {
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
   * Generate video response.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.GenerateVideoResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.GenerateVideoResponse)
      com.google.cloud.aiplatform.v1beta1.GenerateVideoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_GenerateVideoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_GenerateVideoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.class,
              com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      generatedSamples_ = com.google.protobuf.LazyStringArrayList.emptyList();
      raiMediaFilteredCount_ = 0;
      raiMediaFilteredReasons_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.PredictionServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_GenerateVideoResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse build() {
      com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse result =
          new com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        generatedSamples_.makeImmutable();
        result.generatedSamples_ = generatedSamples_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.raiMediaFilteredCount_ = raiMediaFilteredCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        raiMediaFilteredReasons_.makeImmutable();
        result.raiMediaFilteredReasons_ = raiMediaFilteredReasons_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse.getDefaultInstance())
        return this;
      if (!other.generatedSamples_.isEmpty()) {
        if (generatedSamples_.isEmpty()) {
          generatedSamples_ = other.generatedSamples_;
          bitField0_ |= 0x00000001;
        } else {
          ensureGeneratedSamplesIsMutable();
          generatedSamples_.addAll(other.generatedSamples_);
        }
        onChanged();
      }
      if (other.hasRaiMediaFilteredCount()) {
        setRaiMediaFilteredCount(other.getRaiMediaFilteredCount());
      }
      if (!other.raiMediaFilteredReasons_.isEmpty()) {
        if (raiMediaFilteredReasons_.isEmpty()) {
          raiMediaFilteredReasons_ = other.raiMediaFilteredReasons_;
          bitField0_ |= 0x00000004;
        } else {
          ensureRaiMediaFilteredReasonsIsMutable();
          raiMediaFilteredReasons_.addAll(other.raiMediaFilteredReasons_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureGeneratedSamplesIsMutable();
                generatedSamples_.add(s);
                break;
              } // case 10
            case 16:
              {
                raiMediaFilteredCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureRaiMediaFilteredReasonsIsMutable();
                raiMediaFilteredReasons_.add(s);
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

    private com.google.protobuf.LazyStringArrayList generatedSamples_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureGeneratedSamplesIsMutable() {
      if (!generatedSamples_.isModifiable()) {
        generatedSamples_ = new com.google.protobuf.LazyStringArrayList(generatedSamples_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @return A list containing the generatedSamples.
     */
    public com.google.protobuf.ProtocolStringList getGeneratedSamplesList() {
      generatedSamples_.makeImmutable();
      return generatedSamples_;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @return The count of generatedSamples.
     */
    public int getGeneratedSamplesCount() {
      return generatedSamples_.size();
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The generatedSamples at the given index.
     */
    public java.lang.String getGeneratedSamples(int index) {
      return generatedSamples_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the generatedSamples at the given index.
     */
    public com.google.protobuf.ByteString getGeneratedSamplesBytes(int index) {
      return generatedSamples_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The generatedSamples to set.
     * @return This builder for chaining.
     */
    public Builder setGeneratedSamples(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGeneratedSamplesIsMutable();
      generatedSamples_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param value The generatedSamples to add.
     * @return This builder for chaining.
     */
    public Builder addGeneratedSamples(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureGeneratedSamplesIsMutable();
      generatedSamples_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param values The generatedSamples to add.
     * @return This builder for chaining.
     */
    public Builder addAllGeneratedSamples(java.lang.Iterable<java.lang.String> values) {
      ensureGeneratedSamplesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, generatedSamples_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGeneratedSamples() {
      generatedSamples_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The cloud storage uris of the generated videos.
     * </pre>
     *
     * <code>repeated string generated_samples = 1;</code>
     *
     * @param value The bytes of the generatedSamples to add.
     * @return This builder for chaining.
     */
    public Builder addGeneratedSamplesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureGeneratedSamplesIsMutable();
      generatedSamples_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int raiMediaFilteredCount_;

    /**
     *
     *
     * <pre>
     * Returns if any videos were filtered due to RAI policies.
     * </pre>
     *
     * <code>optional int32 rai_media_filtered_count = 2;</code>
     *
     * @return Whether the raiMediaFilteredCount field is set.
     */
    @java.lang.Override
    public boolean hasRaiMediaFilteredCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Returns if any videos were filtered due to RAI policies.
     * </pre>
     *
     * <code>optional int32 rai_media_filtered_count = 2;</code>
     *
     * @return The raiMediaFilteredCount.
     */
    @java.lang.Override
    public int getRaiMediaFilteredCount() {
      return raiMediaFilteredCount_;
    }

    /**
     *
     *
     * <pre>
     * Returns if any videos were filtered due to RAI policies.
     * </pre>
     *
     * <code>optional int32 rai_media_filtered_count = 2;</code>
     *
     * @param value The raiMediaFilteredCount to set.
     * @return This builder for chaining.
     */
    public Builder setRaiMediaFilteredCount(int value) {

      raiMediaFilteredCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Returns if any videos were filtered due to RAI policies.
     * </pre>
     *
     * <code>optional int32 rai_media_filtered_count = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRaiMediaFilteredCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      raiMediaFilteredCount_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList raiMediaFilteredReasons_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureRaiMediaFilteredReasonsIsMutable() {
      if (!raiMediaFilteredReasons_.isModifiable()) {
        raiMediaFilteredReasons_ =
            new com.google.protobuf.LazyStringArrayList(raiMediaFilteredReasons_);
      }
      bitField0_ |= 0x00000004;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @return A list containing the raiMediaFilteredReasons.
     */
    public com.google.protobuf.ProtocolStringList getRaiMediaFilteredReasonsList() {
      raiMediaFilteredReasons_.makeImmutable();
      return raiMediaFilteredReasons_;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @return The count of raiMediaFilteredReasons.
     */
    public int getRaiMediaFilteredReasonsCount() {
      return raiMediaFilteredReasons_.size();
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The raiMediaFilteredReasons at the given index.
     */
    public java.lang.String getRaiMediaFilteredReasons(int index) {
      return raiMediaFilteredReasons_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the raiMediaFilteredReasons at the given index.
     */
    public com.google.protobuf.ByteString getRaiMediaFilteredReasonsBytes(int index) {
      return raiMediaFilteredReasons_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param index The index to set the value at.
     * @param value The raiMediaFilteredReasons to set.
     * @return This builder for chaining.
     */
    public Builder setRaiMediaFilteredReasons(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRaiMediaFilteredReasonsIsMutable();
      raiMediaFilteredReasons_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param value The raiMediaFilteredReasons to add.
     * @return This builder for chaining.
     */
    public Builder addRaiMediaFilteredReasons(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRaiMediaFilteredReasonsIsMutable();
      raiMediaFilteredReasons_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param values The raiMediaFilteredReasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllRaiMediaFilteredReasons(java.lang.Iterable<java.lang.String> values) {
      ensureRaiMediaFilteredReasonsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, raiMediaFilteredReasons_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRaiMediaFilteredReasons() {
      raiMediaFilteredReasons_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Returns rai failure reasons if any.
     * </pre>
     *
     * <code>repeated string rai_media_filtered_reasons = 3;</code>
     *
     * @param value The bytes of the raiMediaFilteredReasons to add.
     * @return This builder for chaining.
     */
    public Builder addRaiMediaFilteredReasonsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureRaiMediaFilteredReasonsIsMutable();
      raiMediaFilteredReasons_.add(value);
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.GenerateVideoResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.GenerateVideoResponse)
  private static final com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateVideoResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateVideoResponse>() {
        @java.lang.Override
        public GenerateVideoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateVideoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateVideoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.GenerateVideoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
