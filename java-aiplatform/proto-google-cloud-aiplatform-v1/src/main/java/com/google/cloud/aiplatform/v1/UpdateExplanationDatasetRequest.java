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
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ModelService.UpdateExplanationDataset][google.cloud.aiplatform.v1.ModelService.UpdateExplanationDataset].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest}
 */
public final class UpdateExplanationDatasetRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest)
    UpdateExplanationDatasetRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateExplanationDatasetRequest.newBuilder() to construct.
  private UpdateExplanationDatasetRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateExplanationDatasetRequest() {
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateExplanationDatasetRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateExplanationDatasetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.ModelServiceProto
        .internal_static_google_cloud_aiplatform_v1_UpdateExplanationDatasetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.class,
            com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MODEL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object model_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Model to update.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Model to update.
   * Format: `projects/{project}/locations/{location}/models/{model}`
   * </pre>
   *
   * <code>
   * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXAMPLES_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.Examples examples_;

  /**
   *
   *
   * <pre>
   * The example config containing the location of the dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
   *
   * @return Whether the examples field is set.
   */
  @java.lang.Override
  public boolean hasExamples() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The example config containing the location of the dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
   *
   * @return The examples.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.Examples getExamples() {
    return examples_ == null
        ? com.google.cloud.aiplatform.v1.Examples.getDefaultInstance()
        : examples_;
  }

  /**
   *
   *
   * <pre>
   * The example config containing the location of the dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ExamplesOrBuilder getExamplesOrBuilder() {
    return examples_ == null
        ? com.google.cloud.aiplatform.v1.Examples.getDefaultInstance()
        : examples_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getExamples());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExamples());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest other =
        (com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest) obj;

    if (!getModel().equals(other.getModel())) return false;
    if (hasExamples() != other.hasExamples()) return false;
    if (hasExamples()) {
      if (!getExamples().equals(other.getExamples())) return false;
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    if (hasExamples()) {
      hash = (37 * hash) + EXAMPLES_FIELD_NUMBER;
      hash = (53 * hash) + getExamples().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest parseFrom(
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
      com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest prototype) {
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
   * Request message for
   * [ModelService.UpdateExplanationDataset][google.cloud.aiplatform.v1.ModelService.UpdateExplanationDataset].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest)
      com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExplanationDatasetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExplanationDatasetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.class,
              com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getExamplesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      model_ = "";
      examples_ = null;
      if (examplesBuilder_ != null) {
        examplesBuilder_.dispose();
        examplesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.ModelServiceProto
          .internal_static_google_cloud_aiplatform_v1_UpdateExplanationDatasetRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest build() {
      com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest buildPartial() {
      com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest result =
          new com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.model_ = model_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.examples_ = examplesBuilder_ == null ? examples_ : examplesBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest.getDefaultInstance())
        return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExamples()) {
        mergeExamples(other.getExamples());
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
                model_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExamplesFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object model_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Model to update.
     * Format: `projects/{project}/locations/{location}/models/{model}`
     * </pre>
     *
     * <code>
     * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Model to update.
     * Format: `projects/{project}/locations/{location}/models/{model}`
     * </pre>
     *
     * <code>
     * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Model to update.
     * Format: `projects/{project}/locations/{location}/models/{model}`
     * </pre>
     *
     * <code>
     * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Model to update.
     * Format: `projects/{project}/locations/{location}/models/{model}`
     * </pre>
     *
     * <code>
     * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      model_ = getDefaultInstance().getModel();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Model to update.
     * Format: `projects/{project}/locations/{location}/models/{model}`
     * </pre>
     *
     * <code>
     * string model = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      model_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1.Examples examples_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Examples,
            com.google.cloud.aiplatform.v1.Examples.Builder,
            com.google.cloud.aiplatform.v1.ExamplesOrBuilder>
        examplesBuilder_;

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     *
     * @return Whether the examples field is set.
     */
    public boolean hasExamples() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     *
     * @return The examples.
     */
    public com.google.cloud.aiplatform.v1.Examples getExamples() {
      if (examplesBuilder_ == null) {
        return examples_ == null
            ? com.google.cloud.aiplatform.v1.Examples.getDefaultInstance()
            : examples_;
      } else {
        return examplesBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public Builder setExamples(com.google.cloud.aiplatform.v1.Examples value) {
      if (examplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        examples_ = value;
      } else {
        examplesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public Builder setExamples(com.google.cloud.aiplatform.v1.Examples.Builder builderForValue) {
      if (examplesBuilder_ == null) {
        examples_ = builderForValue.build();
      } else {
        examplesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public Builder mergeExamples(com.google.cloud.aiplatform.v1.Examples value) {
      if (examplesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && examples_ != null
            && examples_ != com.google.cloud.aiplatform.v1.Examples.getDefaultInstance()) {
          getExamplesBuilder().mergeFrom(value);
        } else {
          examples_ = value;
        }
      } else {
        examplesBuilder_.mergeFrom(value);
      }
      if (examples_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public Builder clearExamples() {
      bitField0_ = (bitField0_ & ~0x00000002);
      examples_ = null;
      if (examplesBuilder_ != null) {
        examplesBuilder_.dispose();
        examplesBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.Examples.Builder getExamplesBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExamplesFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    public com.google.cloud.aiplatform.v1.ExamplesOrBuilder getExamplesOrBuilder() {
      if (examplesBuilder_ != null) {
        return examplesBuilder_.getMessageOrBuilder();
      } else {
        return examples_ == null
            ? com.google.cloud.aiplatform.v1.Examples.getDefaultInstance()
            : examples_;
      }
    }

    /**
     *
     *
     * <pre>
     * The example config containing the location of the dataset.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.Examples examples = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.Examples,
            com.google.cloud.aiplatform.v1.Examples.Builder,
            com.google.cloud.aiplatform.v1.ExamplesOrBuilder>
        getExamplesFieldBuilder() {
      if (examplesBuilder_ == null) {
        examplesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.Examples,
                com.google.cloud.aiplatform.v1.Examples.Builder,
                com.google.cloud.aiplatform.v1.ExamplesOrBuilder>(
                getExamples(), getParentForChildren(), isClean());
        examples_ = null;
      }
      return examplesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest)
  private static final com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest();
  }

  public static com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExplanationDatasetRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateExplanationDatasetRequest>() {
        @java.lang.Override
        public UpdateExplanationDatasetRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateExplanationDatasetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExplanationDatasetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.UpdateExplanationDatasetRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
