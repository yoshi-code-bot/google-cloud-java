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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Text entity extraction annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation}
 */
public final class TextEntityExtractionAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
    TextEntityExtractionAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TextEntityExtractionAnnotation.newBuilder() to construct.
  private TextEntityExtractionAnnotation(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextEntityExtractionAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextEntityExtractionAnnotation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation.class,
            com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation.Builder.class);
  }

  private int bitField0_;
  public static final int ANNOTATION_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;

  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return Whether the annotationSpec field is set.
   */
  @java.lang.Override
  public boolean hasAnnotationSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return The annotationSpec.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
    return annotationSpec_ == null
        ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
        : annotationSpec_;
  }

  /**
   *
   *
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder
      getAnnotationSpecOrBuilder() {
    return annotationSpec_ == null
        ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
        : annotationSpec_;
  }

  public static final int SEQUENTIAL_SEGMENT_FIELD_NUMBER = 2;
  private com.google.cloud.datalabeling.v1beta1.SequentialSegment sequentialSegment_;

  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   *
   * @return Whether the sequentialSegment field is set.
   */
  @java.lang.Override
  public boolean hasSequentialSegment() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   *
   * @return The sequentialSegment.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.SequentialSegment getSequentialSegment() {
    return sequentialSegment_ == null
        ? com.google.cloud.datalabeling.v1beta1.SequentialSegment.getDefaultInstance()
        : sequentialSegment_;
  }

  /**
   *
   *
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder
      getSequentialSegmentOrBuilder() {
    return sequentialSegment_ == null
        ? com.google.cloud.datalabeling.v1beta1.SequentialSegment.getDefaultInstance()
        : sequentialSegment_;
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
      output.writeMessage(1, getAnnotationSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getSequentialSegment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAnnotationSpec());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSequentialSegment());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation other =
        (com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation) obj;

    if (hasAnnotationSpec() != other.hasAnnotationSpec()) return false;
    if (hasAnnotationSpec()) {
      if (!getAnnotationSpec().equals(other.getAnnotationSpec())) return false;
    }
    if (hasSequentialSegment() != other.hasSequentialSegment()) return false;
    if (hasSequentialSegment()) {
      if (!getSequentialSegment().equals(other.getSequentialSegment())) return false;
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
    if (hasAnnotationSpec()) {
      hash = (37 * hash) + ANNOTATION_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpec().hashCode();
    }
    if (hasSequentialSegment()) {
      hash = (37 * hash) + SEQUENTIAL_SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getSequentialSegment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation prototype) {
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
   * Text entity extraction annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
      com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation.class,
              com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation.Builder.class);
    }

    // Construct using
    // com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAnnotationSpecFieldBuilder();
        getSequentialSegmentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      annotationSpec_ = null;
      if (annotationSpecBuilder_ != null) {
        annotationSpecBuilder_.dispose();
        annotationSpecBuilder_ = null;
      }
      sequentialSegment_ = null;
      if (sequentialSegmentBuilder_ != null) {
        sequentialSegmentBuilder_.dispose();
        sequentialSegmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation build() {
      com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation buildPartial() {
      com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation result =
          new com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.annotationSpec_ =
            annotationSpecBuilder_ == null ? annotationSpec_ : annotationSpecBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sequentialSegment_ =
            sequentialSegmentBuilder_ == null
                ? sequentialSegment_
                : sequentialSegmentBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation) {
        return mergeFrom(
            (com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
              .getDefaultInstance()) return this;
      if (other.hasAnnotationSpec()) {
        mergeAnnotationSpec(other.getAnnotationSpec());
      }
      if (other.hasSequentialSegment()) {
        mergeSequentialSegment(other.getSequentialSegment());
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
                input.readMessage(getAnnotationSpecFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSequentialSegmentFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>
        annotationSpecBuilder_;

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     *
     * @return Whether the annotationSpec field is set.
     */
    public boolean hasAnnotationSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     *
     * @return The annotationSpec.
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
      if (annotationSpecBuilder_ == null) {
        return annotationSpec_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
            : annotationSpec_;
      } else {
        return annotationSpecBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotationSpec_ = value;
      } else {
        annotationSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder builderForValue) {
      if (annotationSpecBuilder_ == null) {
        annotationSpec_ = builderForValue.build();
      } else {
        annotationSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder mergeAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && annotationSpec_ != null
            && annotationSpec_
                != com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()) {
          getAnnotationSpecBuilder().mergeFrom(value);
        } else {
          annotationSpec_ = value;
        }
      } else {
        annotationSpecBuilder_.mergeFrom(value);
      }
      if (annotationSpec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder clearAnnotationSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      annotationSpec_ = null;
      if (annotationSpecBuilder_ != null) {
        annotationSpecBuilder_.dispose();
        annotationSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder getAnnotationSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAnnotationSpecFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder
        getAnnotationSpecOrBuilder() {
      if (annotationSpecBuilder_ != null) {
        return annotationSpecBuilder_.getMessageOrBuilder();
      } else {
        return annotationSpec_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
            : annotationSpec_;
      }
    }

    /**
     *
     *
     * <pre>
     * Label of the text entities.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>
        getAnnotationSpecFieldBuilder() {
      if (annotationSpecBuilder_ == null) {
        annotationSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>(
                getAnnotationSpec(), getParentForChildren(), isClean());
        annotationSpec_ = null;
      }
      return annotationSpecBuilder_;
    }

    private com.google.cloud.datalabeling.v1beta1.SequentialSegment sequentialSegment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.SequentialSegment,
            com.google.cloud.datalabeling.v1beta1.SequentialSegment.Builder,
            com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder>
        sequentialSegmentBuilder_;

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     *
     * @return Whether the sequentialSegment field is set.
     */
    public boolean hasSequentialSegment() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     *
     * @return The sequentialSegment.
     */
    public com.google.cloud.datalabeling.v1beta1.SequentialSegment getSequentialSegment() {
      if (sequentialSegmentBuilder_ == null) {
        return sequentialSegment_ == null
            ? com.google.cloud.datalabeling.v1beta1.SequentialSegment.getDefaultInstance()
            : sequentialSegment_;
      } else {
        return sequentialSegmentBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public Builder setSequentialSegment(
        com.google.cloud.datalabeling.v1beta1.SequentialSegment value) {
      if (sequentialSegmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sequentialSegment_ = value;
      } else {
        sequentialSegmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public Builder setSequentialSegment(
        com.google.cloud.datalabeling.v1beta1.SequentialSegment.Builder builderForValue) {
      if (sequentialSegmentBuilder_ == null) {
        sequentialSegment_ = builderForValue.build();
      } else {
        sequentialSegmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public Builder mergeSequentialSegment(
        com.google.cloud.datalabeling.v1beta1.SequentialSegment value) {
      if (sequentialSegmentBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && sequentialSegment_ != null
            && sequentialSegment_
                != com.google.cloud.datalabeling.v1beta1.SequentialSegment.getDefaultInstance()) {
          getSequentialSegmentBuilder().mergeFrom(value);
        } else {
          sequentialSegment_ = value;
        }
      } else {
        sequentialSegmentBuilder_.mergeFrom(value);
      }
      if (sequentialSegment_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public Builder clearSequentialSegment() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sequentialSegment_ = null;
      if (sequentialSegmentBuilder_ != null) {
        sequentialSegmentBuilder_.dispose();
        sequentialSegmentBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.SequentialSegment.Builder
        getSequentialSegmentBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSequentialSegmentFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder
        getSequentialSegmentOrBuilder() {
      if (sequentialSegmentBuilder_ != null) {
        return sequentialSegmentBuilder_.getMessageOrBuilder();
      } else {
        return sequentialSegment_ == null
            ? com.google.cloud.datalabeling.v1beta1.SequentialSegment.getDefaultInstance()
            : sequentialSegment_;
      }
    }

    /**
     *
     *
     * <pre>
     * Position of the entity.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.SequentialSegment,
            com.google.cloud.datalabeling.v1beta1.SequentialSegment.Builder,
            com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder>
        getSequentialSegmentFieldBuilder() {
      if (sequentialSegmentBuilder_ == null) {
        sequentialSegmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.SequentialSegment,
                com.google.cloud.datalabeling.v1beta1.SequentialSegment.Builder,
                com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder>(
                getSequentialSegment(), getParentForChildren(), isClean());
        sequentialSegment_ = null;
      }
      return sequentialSegmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
  private static final com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation();
  }

  public static com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextEntityExtractionAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<TextEntityExtractionAnnotation>() {
        @java.lang.Override
        public TextEntityExtractionAnnotation parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextEntityExtractionAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextEntityExtractionAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
