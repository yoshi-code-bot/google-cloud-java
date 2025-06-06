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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Results of listing annotated datasets for a dataset.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse}
 */
public final class ListAnnotatedDatasetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse)
    ListAnnotatedDatasetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListAnnotatedDatasetsResponse.newBuilder() to construct.
  private ListAnnotatedDatasetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAnnotatedDatasetsResponse() {
    annotatedDatasets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAnnotatedDatasetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotatedDatasetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotatedDatasetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.class,
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.Builder.class);
  }

  public static final int ANNOTATED_DATASETS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset> annotatedDatasets_;

  /**
   *
   *
   * <pre>
   * The list of annotated datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
      getAnnotatedDatasetsList() {
    return annotatedDatasets_;
  }

  /**
   *
   *
   * <pre>
   * The list of annotated datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder>
      getAnnotatedDatasetsOrBuilderList() {
    return annotatedDatasets_;
  }

  /**
   *
   *
   * <pre>
   * The list of annotated datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public int getAnnotatedDatasetsCount() {
    return annotatedDatasets_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of annotated datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset getAnnotatedDatasets(int index) {
    return annotatedDatasets_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of annotated datasets to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder
      getAnnotatedDatasetsOrBuilder(int index) {
    return annotatedDatasets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
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
   * A token to retrieve next page of results.
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
    for (int i = 0; i < annotatedDatasets_.size(); i++) {
      output.writeMessage(1, annotatedDatasets_.get(i));
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
    for (int i = 0; i < annotatedDatasets_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, annotatedDatasets_.get(i));
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse other =
        (com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse) obj;

    if (!getAnnotatedDatasetsList().equals(other.getAnnotatedDatasetsList())) return false;
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
    if (getAnnotatedDatasetsCount() > 0) {
      hash = (37 * hash) + ANNOTATED_DATASETS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotatedDatasetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse prototype) {
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
   * Results of listing annotated datasets for a dataset.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse)
      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotatedDatasetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotatedDatasetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.class,
              com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (annotatedDatasetsBuilder_ == null) {
        annotatedDatasets_ = java.util.Collections.emptyList();
      } else {
        annotatedDatasets_ = null;
        annotatedDatasetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotatedDatasetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse build() {
      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse result =
          new com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse result) {
      if (annotatedDatasetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotatedDatasets_ = java.util.Collections.unmodifiableList(annotatedDatasets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotatedDatasets_ = annotatedDatasets_;
      } else {
        result.annotatedDatasets_ = annotatedDatasetsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse result) {
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse) {
        return mergeFrom(
            (com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
              .getDefaultInstance()) return this;
      if (annotatedDatasetsBuilder_ == null) {
        if (!other.annotatedDatasets_.isEmpty()) {
          if (annotatedDatasets_.isEmpty()) {
            annotatedDatasets_ = other.annotatedDatasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotatedDatasetsIsMutable();
            annotatedDatasets_.addAll(other.annotatedDatasets_);
          }
          onChanged();
        }
      } else {
        if (!other.annotatedDatasets_.isEmpty()) {
          if (annotatedDatasetsBuilder_.isEmpty()) {
            annotatedDatasetsBuilder_.dispose();
            annotatedDatasetsBuilder_ = null;
            annotatedDatasets_ = other.annotatedDatasets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotatedDatasetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnnotatedDatasetsFieldBuilder()
                    : null;
          } else {
            annotatedDatasetsBuilder_.addAllMessages(other.annotatedDatasets_);
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
                com.google.cloud.datalabeling.v1beta1.AnnotatedDataset m =
                    input.readMessage(
                        com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.parser(),
                        extensionRegistry);
                if (annotatedDatasetsBuilder_ == null) {
                  ensureAnnotatedDatasetsIsMutable();
                  annotatedDatasets_.add(m);
                } else {
                  annotatedDatasetsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
        annotatedDatasets_ = java.util.Collections.emptyList();

    private void ensureAnnotatedDatasetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotatedDatasets_ =
            new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>(
                annotatedDatasets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder>
        annotatedDatasetsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
        getAnnotatedDatasetsList() {
      if (annotatedDatasetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotatedDatasets_);
      } else {
        return annotatedDatasetsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public int getAnnotatedDatasetsCount() {
      if (annotatedDatasetsBuilder_ == null) {
        return annotatedDatasets_.size();
      } else {
        return annotatedDatasetsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset getAnnotatedDatasets(int index) {
      if (annotatedDatasetsBuilder_ == null) {
        return annotatedDatasets_.get(index);
      } else {
        return annotatedDatasetsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder setAnnotatedDatasets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotatedDataset value) {
      if (annotatedDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.set(index, value);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder setAnnotatedDatasets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder builderForValue) {
      if (annotatedDatasetsBuilder_ == null) {
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotatedDatasetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder addAnnotatedDatasets(
        com.google.cloud.datalabeling.v1beta1.AnnotatedDataset value) {
      if (annotatedDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.add(value);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder addAnnotatedDatasets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotatedDataset value) {
      if (annotatedDatasetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.add(index, value);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder addAnnotatedDatasets(
        com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder builderForValue) {
      if (annotatedDatasetsBuilder_ == null) {
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.add(builderForValue.build());
        onChanged();
      } else {
        annotatedDatasetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder addAnnotatedDatasets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder builderForValue) {
      if (annotatedDatasetsBuilder_ == null) {
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotatedDatasetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder addAllAnnotatedDatasets(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
            values) {
      if (annotatedDatasetsBuilder_ == null) {
        ensureAnnotatedDatasetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotatedDatasets_);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder clearAnnotatedDatasets() {
      if (annotatedDatasetsBuilder_ == null) {
        annotatedDatasets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public Builder removeAnnotatedDatasets(int index) {
      if (annotatedDatasetsBuilder_ == null) {
        ensureAnnotatedDatasetsIsMutable();
        annotatedDatasets_.remove(index);
        onChanged();
      } else {
        annotatedDatasetsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder
        getAnnotatedDatasetsBuilder(int index) {
      return getAnnotatedDatasetsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder
        getAnnotatedDatasetsOrBuilder(int index) {
      if (annotatedDatasetsBuilder_ == null) {
        return annotatedDatasets_.get(index);
      } else {
        return annotatedDatasetsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder>
        getAnnotatedDatasetsOrBuilderList() {
      if (annotatedDatasetsBuilder_ != null) {
        return annotatedDatasetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotatedDatasets_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder
        addAnnotatedDatasetsBuilder() {
      return getAnnotatedDatasetsFieldBuilder()
          .addBuilder(com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder
        addAnnotatedDatasetsBuilder(int index) {
      return getAnnotatedDatasetsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of annotated datasets to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotatedDataset annotated_datasets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder>
        getAnnotatedDatasetsBuilderList() {
      return getAnnotatedDatasetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder>
        getAnnotatedDatasetsFieldBuilder() {
      if (annotatedDatasetsBuilder_ == null) {
        annotatedDatasetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.AnnotatedDataset,
                com.google.cloud.datalabeling.v1beta1.AnnotatedDataset.Builder,
                com.google.cloud.datalabeling.v1beta1.AnnotatedDatasetOrBuilder>(
                annotatedDatasets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotatedDatasets_ = null;
      }
      return annotatedDatasetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
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
     * A token to retrieve next page of results.
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
     * A token to retrieve next page of results.
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
     * A token to retrieve next page of results.
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
     * A token to retrieve next page of results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse)
  private static final com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse();
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAnnotatedDatasetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAnnotatedDatasetsResponse>() {
        @java.lang.Override
        public ListAnnotatedDatasetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAnnotatedDatasetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAnnotatedDatasetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
