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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Spec for pairwise metric result.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseMetricResult}
 */
public final class PairwiseMetricResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.PairwiseMetricResult)
    PairwiseMetricResultOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PairwiseMetricResult.newBuilder() to construct.
  private PairwiseMetricResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PairwiseMetricResult() {
    pairwiseChoice_ = 0;
    explanation_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PairwiseMetricResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.class,
            com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.Builder.class);
  }

  private int bitField0_;
  public static final int PAIRWISE_CHOICE_FIELD_NUMBER = 1;
  private int pairwiseChoice_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. Pairwise metric choice.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for pairwiseChoice.
   */
  @java.lang.Override
  public int getPairwiseChoiceValue() {
    return pairwiseChoice_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Pairwise metric choice.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The pairwiseChoice.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PairwiseChoice getPairwiseChoice() {
    com.google.cloud.aiplatform.v1beta1.PairwiseChoice result =
        com.google.cloud.aiplatform.v1beta1.PairwiseChoice.forNumber(pairwiseChoice_);
    return result == null
        ? com.google.cloud.aiplatform.v1beta1.PairwiseChoice.UNRECOGNIZED
        : result;
  }

  public static final int EXPLANATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object explanation_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Explanation for pairwise metric score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The explanation.
   */
  @java.lang.Override
  public java.lang.String getExplanation() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      explanation_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. Explanation for pairwise metric score.
   * </pre>
   *
   * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for explanation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExplanationBytes() {
    java.lang.Object ref = explanation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      explanation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_OUTPUT_FIELD_NUMBER = 3;
  private com.google.cloud.aiplatform.v1beta1.CustomOutput customOutput_;

  /**
   *
   *
   * <pre>
   * Output only. Spec for custom output.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the customOutput field is set.
   */
  @java.lang.Override
  public boolean hasCustomOutput() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Output only. Spec for custom output.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The customOutput.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CustomOutput getCustomOutput() {
    return customOutput_ == null
        ? com.google.cloud.aiplatform.v1beta1.CustomOutput.getDefaultInstance()
        : customOutput_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Spec for custom output.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.CustomOutputOrBuilder getCustomOutputOrBuilder() {
    return customOutput_ == null
        ? com.google.cloud.aiplatform.v1beta1.CustomOutput.getDefaultInstance()
        : customOutput_;
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
    if (pairwiseChoice_
        != com.google.cloud.aiplatform.v1beta1.PairwiseChoice.PAIRWISE_CHOICE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, pairwiseChoice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, explanation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getCustomOutput());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pairwiseChoice_
        != com.google.cloud.aiplatform.v1beta1.PairwiseChoice.PAIRWISE_CHOICE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, pairwiseChoice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(explanation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, explanation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getCustomOutput());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult other =
        (com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult) obj;

    if (pairwiseChoice_ != other.pairwiseChoice_) return false;
    if (!getExplanation().equals(other.getExplanation())) return false;
    if (hasCustomOutput() != other.hasCustomOutput()) return false;
    if (hasCustomOutput()) {
      if (!getCustomOutput().equals(other.getCustomOutput())) return false;
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
    hash = (37 * hash) + PAIRWISE_CHOICE_FIELD_NUMBER;
    hash = (53 * hash) + pairwiseChoice_;
    hash = (37 * hash) + EXPLANATION_FIELD_NUMBER;
    hash = (53 * hash) + getExplanation().hashCode();
    if (hasCustomOutput()) {
      hash = (37 * hash) + CUSTOM_OUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getCustomOutput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult prototype) {
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
   * Spec for pairwise metric result.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.PairwiseMetricResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.PairwiseMetricResult)
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.class,
              com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCustomOutputFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pairwiseChoice_ = 0;
      explanation_ = "";
      customOutput_ = null;
      if (customOutputBuilder_ != null) {
        customOutputBuilder_.dispose();
        customOutputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.EvaluationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_PairwiseMetricResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult build() {
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult buildPartial() {
      com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult result =
          new com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pairwiseChoice_ = pairwiseChoice_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.explanation_ = explanation_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.customOutput_ =
            customOutputBuilder_ == null ? customOutput_ : customOutputBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult other) {
      if (other == com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult.getDefaultInstance())
        return this;
      if (other.pairwiseChoice_ != 0) {
        setPairwiseChoiceValue(other.getPairwiseChoiceValue());
      }
      if (!other.getExplanation().isEmpty()) {
        explanation_ = other.explanation_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasCustomOutput()) {
        mergeCustomOutput(other.getCustomOutput());
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
                pairwiseChoice_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                explanation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getCustomOutputFieldBuilder().getBuilder(), extensionRegistry);
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

    private int pairwiseChoice_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. Pairwise metric choice.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for pairwiseChoice.
     */
    @java.lang.Override
    public int getPairwiseChoiceValue() {
      return pairwiseChoice_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Pairwise metric choice.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for pairwiseChoice to set.
     * @return This builder for chaining.
     */
    public Builder setPairwiseChoiceValue(int value) {
      pairwiseChoice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Pairwise metric choice.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The pairwiseChoice.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.PairwiseChoice getPairwiseChoice() {
      com.google.cloud.aiplatform.v1beta1.PairwiseChoice result =
          com.google.cloud.aiplatform.v1beta1.PairwiseChoice.forNumber(pairwiseChoice_);
      return result == null
          ? com.google.cloud.aiplatform.v1beta1.PairwiseChoice.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. Pairwise metric choice.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The pairwiseChoice to set.
     * @return This builder for chaining.
     */
    public Builder setPairwiseChoice(com.google.cloud.aiplatform.v1beta1.PairwiseChoice value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      pairwiseChoice_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Pairwise metric choice.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.PairwiseChoice pairwise_choice = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPairwiseChoice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pairwiseChoice_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object explanation_ = "";

    /**
     *
     *
     * <pre>
     * Output only. Explanation for pairwise metric score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The explanation.
     */
    public java.lang.String getExplanation() {
      java.lang.Object ref = explanation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        explanation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Explanation for pairwise metric score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for explanation.
     */
    public com.google.protobuf.ByteString getExplanationBytes() {
      java.lang.Object ref = explanation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        explanation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Explanation for pairwise metric score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      explanation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Explanation for pairwise metric score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExplanation() {
      explanation_ = getDefaultInstance().getExplanation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Explanation for pairwise metric score.
     * </pre>
     *
     * <code>string explanation = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for explanation to set.
     * @return This builder for chaining.
     */
    public Builder setExplanationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      explanation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.CustomOutput customOutput_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.CustomOutput,
            com.google.cloud.aiplatform.v1beta1.CustomOutput.Builder,
            com.google.cloud.aiplatform.v1beta1.CustomOutputOrBuilder>
        customOutputBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the customOutput field is set.
     */
    public boolean hasCustomOutput() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The customOutput.
     */
    public com.google.cloud.aiplatform.v1beta1.CustomOutput getCustomOutput() {
      if (customOutputBuilder_ == null) {
        return customOutput_ == null
            ? com.google.cloud.aiplatform.v1beta1.CustomOutput.getDefaultInstance()
            : customOutput_;
      } else {
        return customOutputBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCustomOutput(com.google.cloud.aiplatform.v1beta1.CustomOutput value) {
      if (customOutputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customOutput_ = value;
      } else {
        customOutputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setCustomOutput(
        com.google.cloud.aiplatform.v1beta1.CustomOutput.Builder builderForValue) {
      if (customOutputBuilder_ == null) {
        customOutput_ = builderForValue.build();
      } else {
        customOutputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeCustomOutput(com.google.cloud.aiplatform.v1beta1.CustomOutput value) {
      if (customOutputBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && customOutput_ != null
            && customOutput_
                != com.google.cloud.aiplatform.v1beta1.CustomOutput.getDefaultInstance()) {
          getCustomOutputBuilder().mergeFrom(value);
        } else {
          customOutput_ = value;
        }
      } else {
        customOutputBuilder_.mergeFrom(value);
      }
      if (customOutput_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearCustomOutput() {
      bitField0_ = (bitField0_ & ~0x00000004);
      customOutput_ = null;
      if (customOutputBuilder_ != null) {
        customOutputBuilder_.dispose();
        customOutputBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.CustomOutput.Builder getCustomOutputBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCustomOutputFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.CustomOutputOrBuilder getCustomOutputOrBuilder() {
      if (customOutputBuilder_ != null) {
        return customOutputBuilder_.getMessageOrBuilder();
      } else {
        return customOutput_ == null
            ? com.google.cloud.aiplatform.v1beta1.CustomOutput.getDefaultInstance()
            : customOutput_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Spec for custom output.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1beta1.CustomOutput custom_output = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.CustomOutput,
            com.google.cloud.aiplatform.v1beta1.CustomOutput.Builder,
            com.google.cloud.aiplatform.v1beta1.CustomOutputOrBuilder>
        getCustomOutputFieldBuilder() {
      if (customOutputBuilder_ == null) {
        customOutputBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.CustomOutput,
                com.google.cloud.aiplatform.v1beta1.CustomOutput.Builder,
                com.google.cloud.aiplatform.v1beta1.CustomOutputOrBuilder>(
                getCustomOutput(), getParentForChildren(), isClean());
        customOutput_ = null;
      }
      return customOutputBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.PairwiseMetricResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.PairwiseMetricResult)
  private static final com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult();
  }

  public static com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PairwiseMetricResult> PARSER =
      new com.google.protobuf.AbstractParser<PairwiseMetricResult>() {
        @java.lang.Override
        public PairwiseMetricResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<PairwiseMetricResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PairwiseMetricResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.PairwiseMetricResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
