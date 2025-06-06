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
// source: google/cloud/documentai/v1beta3/document_io.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

/**
 *
 *
 * <pre>
 * The common config to specify a set of documents used as input.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.BatchDocumentsInputConfig}
 */
public final class BatchDocumentsInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)
    BatchDocumentsInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BatchDocumentsInputConfig.newBuilder() to construct.
  private BatchDocumentsInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchDocumentsInputConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchDocumentsInputConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentIoProto
        .internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentIoProto
        .internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.class,
            com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_PREFIX(1),
    GCS_DOCUMENTS(2),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_PREFIX;
        case 2:
          return GCS_DOCUMENTS;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int GCS_PREFIX_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   *
   * @return Whether the gcsPrefix field is set.
   */
  @java.lang.Override
  public boolean hasGcsPrefix() {
    return sourceCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   *
   * @return The gcsPrefix.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsPrefix getGcsPrefix() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.documentai.v1beta3.GcsPrefix) source_;
    }
    return com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * The set of documents that match the specified Cloud Storage `gcs_prefix`.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder getGcsPrefixOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.documentai.v1beta3.GcsPrefix) source_;
    }
    return com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
  }

  public static final int GCS_DOCUMENTS_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   *
   * @return Whether the gcsDocuments field is set.
   */
  @java.lang.Override
  public boolean hasGcsDocuments() {
    return sourceCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   *
   * @return The gcsDocuments.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsDocuments getGcsDocuments() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.documentai.v1beta3.GcsDocuments) source_;
    }
    return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * The set of documents individually specified on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder getGcsDocumentsOrBuilder() {
    if (sourceCase_ == 2) {
      return (com.google.cloud.documentai.v1beta3.GcsDocuments) source_;
    }
    return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.documentai.v1beta3.GcsPrefix) source_);
    }
    if (sourceCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.documentai.v1beta3.GcsDocuments) source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.documentai.v1beta3.GcsPrefix) source_);
    }
    if (sourceCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.documentai.v1beta3.GcsDocuments) source_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig other =
        (com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getGcsPrefix().equals(other.getGcsPrefix())) return false;
        break;
      case 2:
        if (!getGcsDocuments().equals(other.getGcsDocuments())) return false;
        break;
      case 0:
      default:
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_PREFIX_FIELD_NUMBER;
        hash = (53 * hash) + getGcsPrefix().hashCode();
        break;
      case 2:
        hash = (37 * hash) + GCS_DOCUMENTS_FIELD_NUMBER;
        hash = (53 * hash) + getGcsDocuments().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig parseFrom(
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
      com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig prototype) {
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
   * The common config to specify a set of documents used as input.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.BatchDocumentsInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)
      com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.class,
              com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (gcsPrefixBuilder_ != null) {
        gcsPrefixBuilder_.clear();
      }
      if (gcsDocumentsBuilder_ != null) {
        gcsDocumentsBuilder_.clear();
      }
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentIoProto
          .internal_static_google_cloud_documentai_v1beta3_BatchDocumentsInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig
        getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig build() {
      com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig buildPartial() {
      com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig result =
          new com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
      if (sourceCase_ == 1 && gcsPrefixBuilder_ != null) {
        result.source_ = gcsPrefixBuilder_.build();
      }
      if (sourceCase_ == 2 && gcsDocumentsBuilder_ != null) {
        result.source_ = gcsDocumentsBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig other) {
      if (other
          == com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig.getDefaultInstance())
        return this;
      switch (other.getSourceCase()) {
        case GCS_PREFIX:
          {
            mergeGcsPrefix(other.getGcsPrefix());
            break;
          }
        case GCS_DOCUMENTS:
          {
            mergeGcsDocuments(other.getGcsDocuments());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getGcsPrefixFieldBuilder().getBuilder(), extensionRegistry);
                sourceCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getGcsDocumentsFieldBuilder().getBuilder(), extensionRegistry);
                sourceCase_ = 2;
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsPrefix,
            com.google.cloud.documentai.v1beta3.GcsPrefix.Builder,
            com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder>
        gcsPrefixBuilder_;

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     *
     * @return Whether the gcsPrefix field is set.
     */
    @java.lang.Override
    public boolean hasGcsPrefix() {
      return sourceCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     *
     * @return The gcsPrefix.
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsPrefix getGcsPrefix() {
      if (gcsPrefixBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.documentai.v1beta3.GcsPrefix) source_;
        }
        return com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsPrefixBuilder_.getMessage();
        }
        return com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    public Builder setGcsPrefix(com.google.cloud.documentai.v1beta3.GcsPrefix value) {
      if (gcsPrefixBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsPrefixBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    public Builder setGcsPrefix(
        com.google.cloud.documentai.v1beta3.GcsPrefix.Builder builderForValue) {
      if (gcsPrefixBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsPrefixBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    public Builder mergeGcsPrefix(com.google.cloud.documentai.v1beta3.GcsPrefix value) {
      if (gcsPrefixBuilder_ == null) {
        if (sourceCase_ == 1
            && source_ != com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance()) {
          source_ =
              com.google.cloud.documentai.v1beta3.GcsPrefix.newBuilder(
                      (com.google.cloud.documentai.v1beta3.GcsPrefix) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsPrefixBuilder_.mergeFrom(value);
        } else {
          gcsPrefixBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    public Builder clearGcsPrefix() {
      if (gcsPrefixBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsPrefixBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsPrefix.Builder getGcsPrefixBuilder() {
      return getGcsPrefixFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder getGcsPrefixOrBuilder() {
      if ((sourceCase_ == 1) && (gcsPrefixBuilder_ != null)) {
        return gcsPrefixBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.documentai.v1beta3.GcsPrefix) source_;
        }
        return com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of documents that match the specified Cloud Storage `gcs_prefix`.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsPrefix gcs_prefix = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsPrefix,
            com.google.cloud.documentai.v1beta3.GcsPrefix.Builder,
            com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder>
        getGcsPrefixFieldBuilder() {
      if (gcsPrefixBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.documentai.v1beta3.GcsPrefix.getDefaultInstance();
        }
        gcsPrefixBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta3.GcsPrefix,
                com.google.cloud.documentai.v1beta3.GcsPrefix.Builder,
                com.google.cloud.documentai.v1beta3.GcsPrefixOrBuilder>(
                (com.google.cloud.documentai.v1beta3.GcsPrefix) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      return gcsPrefixBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsDocuments,
            com.google.cloud.documentai.v1beta3.GcsDocuments.Builder,
            com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder>
        gcsDocumentsBuilder_;

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     *
     * @return Whether the gcsDocuments field is set.
     */
    @java.lang.Override
    public boolean hasGcsDocuments() {
      return sourceCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     *
     * @return The gcsDocuments.
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsDocuments getGcsDocuments() {
      if (gcsDocumentsBuilder_ == null) {
        if (sourceCase_ == 2) {
          return (com.google.cloud.documentai.v1beta3.GcsDocuments) source_;
        }
        return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
      } else {
        if (sourceCase_ == 2) {
          return gcsDocumentsBuilder_.getMessage();
        }
        return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    public Builder setGcsDocuments(com.google.cloud.documentai.v1beta3.GcsDocuments value) {
      if (gcsDocumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsDocumentsBuilder_.setMessage(value);
      }
      sourceCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    public Builder setGcsDocuments(
        com.google.cloud.documentai.v1beta3.GcsDocuments.Builder builderForValue) {
      if (gcsDocumentsBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsDocumentsBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    public Builder mergeGcsDocuments(com.google.cloud.documentai.v1beta3.GcsDocuments value) {
      if (gcsDocumentsBuilder_ == null) {
        if (sourceCase_ == 2
            && source_ != com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance()) {
          source_ =
              com.google.cloud.documentai.v1beta3.GcsDocuments.newBuilder(
                      (com.google.cloud.documentai.v1beta3.GcsDocuments) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 2) {
          gcsDocumentsBuilder_.mergeFrom(value);
        } else {
          gcsDocumentsBuilder_.setMessage(value);
        }
      }
      sourceCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    public Builder clearGcsDocuments() {
      if (gcsDocumentsBuilder_ == null) {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 2) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsDocumentsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    public com.google.cloud.documentai.v1beta3.GcsDocuments.Builder getGcsDocumentsBuilder() {
      return getGcsDocumentsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder getGcsDocumentsOrBuilder() {
      if ((sourceCase_ == 2) && (gcsDocumentsBuilder_ != null)) {
        return gcsDocumentsBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 2) {
          return (com.google.cloud.documentai.v1beta3.GcsDocuments) source_;
        }
        return com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * The set of documents individually specified on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta3.GcsDocuments gcs_documents = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta3.GcsDocuments,
            com.google.cloud.documentai.v1beta3.GcsDocuments.Builder,
            com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder>
        getGcsDocumentsFieldBuilder() {
      if (gcsDocumentsBuilder_ == null) {
        if (!(sourceCase_ == 2)) {
          source_ = com.google.cloud.documentai.v1beta3.GcsDocuments.getDefaultInstance();
        }
        gcsDocumentsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta3.GcsDocuments,
                com.google.cloud.documentai.v1beta3.GcsDocuments.Builder,
                com.google.cloud.documentai.v1beta3.GcsDocumentsOrBuilder>(
                (com.google.cloud.documentai.v1beta3.GcsDocuments) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 2;
      onChanged();
      return gcsDocumentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.BatchDocumentsInputConfig)
  private static final com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig();
  }

  public static com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchDocumentsInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<BatchDocumentsInputConfig>() {
        @java.lang.Override
        public BatchDocumentsInputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchDocumentsInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchDocumentsInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.BatchDocumentsInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
