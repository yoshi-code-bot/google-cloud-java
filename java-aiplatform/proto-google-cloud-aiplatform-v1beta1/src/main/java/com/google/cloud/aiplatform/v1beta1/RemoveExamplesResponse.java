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
// source: google/cloud/aiplatform/v1beta1/example_store_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [ExampleStoreService.RemoveExamples][google.cloud.aiplatform.v1beta1.ExampleStoreService.RemoveExamples].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RemoveExamplesResponse}
 */
public final class RemoveExamplesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RemoveExamplesResponse)
    RemoveExamplesResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RemoveExamplesResponse.newBuilder() to construct.
  private RemoveExamplesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveExamplesResponse() {
    exampleIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveExamplesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.class,
            com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.Builder.class);
  }

  public static final int EXAMPLE_IDS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList exampleIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The IDs for the removed examples.
   * </pre>
   *
   * <code>repeated string example_ids = 1;</code>
   *
   * @return A list containing the exampleIds.
   */
  public com.google.protobuf.ProtocolStringList getExampleIdsList() {
    return exampleIds_;
  }

  /**
   *
   *
   * <pre>
   * The IDs for the removed examples.
   * </pre>
   *
   * <code>repeated string example_ids = 1;</code>
   *
   * @return The count of exampleIds.
   */
  public int getExampleIdsCount() {
    return exampleIds_.size();
  }

  /**
   *
   *
   * <pre>
   * The IDs for the removed examples.
   * </pre>
   *
   * <code>repeated string example_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The exampleIds at the given index.
   */
  public java.lang.String getExampleIds(int index) {
    return exampleIds_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The IDs for the removed examples.
   * </pre>
   *
   * <code>repeated string example_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exampleIds at the given index.
   */
  public com.google.protobuf.ByteString getExampleIdsBytes(int index) {
    return exampleIds_.getByteString(index);
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
    for (int i = 0; i < exampleIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exampleIds_.getRaw(i));
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
      for (int i = 0; i < exampleIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(exampleIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getExampleIdsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse other =
        (com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse) obj;

    if (!getExampleIdsList().equals(other.getExampleIdsList())) return false;
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
    if (getExampleIdsCount() > 0) {
      hash = (37 * hash) + EXAMPLE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getExampleIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse prototype) {
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
   * [ExampleStoreService.RemoveExamples][google.cloud.aiplatform.v1beta1.ExampleStoreService.RemoveExamples].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RemoveExamplesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RemoveExamplesResponse)
      com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.class,
              com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      exampleIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ExampleStoreServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveExamplesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse build() {
      com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse result =
          new com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        exampleIds_.makeImmutable();
        result.exampleIds_ = exampleIds_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse other) {
      if (other == com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse.getDefaultInstance())
        return this;
      if (!other.exampleIds_.isEmpty()) {
        if (exampleIds_.isEmpty()) {
          exampleIds_ = other.exampleIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureExampleIdsIsMutable();
          exampleIds_.addAll(other.exampleIds_);
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
                ensureExampleIdsIsMutable();
                exampleIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList exampleIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureExampleIdsIsMutable() {
      if (!exampleIds_.isModifiable()) {
        exampleIds_ = new com.google.protobuf.LazyStringArrayList(exampleIds_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @return A list containing the exampleIds.
     */
    public com.google.protobuf.ProtocolStringList getExampleIdsList() {
      exampleIds_.makeImmutable();
      return exampleIds_;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @return The count of exampleIds.
     */
    public int getExampleIdsCount() {
      return exampleIds_.size();
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The exampleIds at the given index.
     */
    public java.lang.String getExampleIds(int index) {
      return exampleIds_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the exampleIds at the given index.
     */
    public com.google.protobuf.ByteString getExampleIdsBytes(int index) {
      return exampleIds_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The exampleIds to set.
     * @return This builder for chaining.
     */
    public Builder setExampleIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExampleIdsIsMutable();
      exampleIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param value The exampleIds to add.
     * @return This builder for chaining.
     */
    public Builder addExampleIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExampleIdsIsMutable();
      exampleIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param values The exampleIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllExampleIds(java.lang.Iterable<java.lang.String> values) {
      ensureExampleIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, exampleIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExampleIds() {
      exampleIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The IDs for the removed examples.
     * </pre>
     *
     * <code>repeated string example_ids = 1;</code>
     *
     * @param value The bytes of the exampleIds to add.
     * @return This builder for chaining.
     */
    public Builder addExampleIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureExampleIdsIsMutable();
      exampleIds_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RemoveExamplesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RemoveExamplesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveExamplesResponse> PARSER =
      new com.google.protobuf.AbstractParser<RemoveExamplesResponse>() {
        @java.lang.Override
        public RemoveExamplesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveExamplesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveExamplesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RemoveExamplesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
