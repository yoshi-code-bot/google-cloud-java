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
// source: google/cloud/dialogflow/v2/document.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Request message for
 * [Documents.ReloadDocument][google.cloud.dialogflow.v2.Documents.ReloadDocument].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ReloadDocumentRequest}
 */
public final class ReloadDocumentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ReloadDocumentRequest)
    ReloadDocumentRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ReloadDocumentRequest.newBuilder() to construct.
  private ReloadDocumentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReloadDocumentRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReloadDocumentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.DocumentProto
        .internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.DocumentProto
        .internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ReloadDocumentRequest.class,
            com.google.cloud.dialogflow.v2.ReloadDocumentRequest.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONTENT_URI(3),
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
        case 3:
          return CONTENT_URI;
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

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The name of the document to reload.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_URI_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the contentUri field is set.
   */
  public boolean hasContentUri() {
    return sourceCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The contentUri.
   */
  public java.lang.String getContentUri() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 3) {
        source_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The path of gcs source file for reloading document content. For
   * now, only gcs uri is supported.
   *
   * For documents stored in Google Cloud Storage, these URIs must have
   * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
   * </pre>
   *
   * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for contentUri.
   */
  public com.google.protobuf.ByteString getContentUriBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 3) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (sourceCase_ == 3) {
        source_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_GCS_CUSTOM_METADATA_FIELD_NUMBER = 4;
  private boolean importGcsCustomMetadata_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Whether to import custom metadata from Google Cloud Storage.
   * Only valid when the document source is Google Cloud Storage URI.
   * </pre>
   *
   * <code>bool import_gcs_custom_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The importGcsCustomMetadata.
   */
  @java.lang.Override
  public boolean getImportGcsCustomMetadata() {
    return importGcsCustomMetadata_;
  }

  public static final int SMART_MESSAGING_PARTIAL_UPDATE_FIELD_NUMBER = 5;
  private boolean smartMessagingPartialUpdate_ = false;

  /**
   *
   *
   * <pre>
   * Optional. When enabled, the reload request is to apply partial update to
   * the smart messaging allowlist.
   * </pre>
   *
   * <code>bool smart_messaging_partial_update = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The smartMessagingPartialUpdate.
   */
  @java.lang.Override
  public boolean getSmartMessagingPartialUpdate() {
    return smartMessagingPartialUpdate_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (sourceCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, source_);
    }
    if (importGcsCustomMetadata_ != false) {
      output.writeBool(4, importGcsCustomMetadata_);
    }
    if (smartMessagingPartialUpdate_ != false) {
      output.writeBool(5, smartMessagingPartialUpdate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (sourceCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, source_);
    }
    if (importGcsCustomMetadata_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, importGcsCustomMetadata_);
    }
    if (smartMessagingPartialUpdate_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(5, smartMessagingPartialUpdate_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ReloadDocumentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ReloadDocumentRequest other =
        (com.google.cloud.dialogflow.v2.ReloadDocumentRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getImportGcsCustomMetadata() != other.getImportGcsCustomMetadata()) return false;
    if (getSmartMessagingPartialUpdate() != other.getSmartMessagingPartialUpdate()) return false;
    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 3:
        if (!getContentUri().equals(other.getContentUri())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + IMPORT_GCS_CUSTOM_METADATA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getImportGcsCustomMetadata());
    hash = (37 * hash) + SMART_MESSAGING_PARTIAL_UPDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSmartMessagingPartialUpdate());
    switch (sourceCase_) {
      case 3:
        hash = (37 * hash) + CONTENT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getContentUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.v2.ReloadDocumentRequest prototype) {
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
   * [Documents.ReloadDocument][google.cloud.dialogflow.v2.Documents.ReloadDocument].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ReloadDocumentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ReloadDocumentRequest)
      com.google.cloud.dialogflow.v2.ReloadDocumentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ReloadDocumentRequest.class,
              com.google.cloud.dialogflow.v2.ReloadDocumentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ReloadDocumentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      importGcsCustomMetadata_ = false;
      smartMessagingPartialUpdate_ = false;
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.DocumentProto
          .internal_static_google_cloud_dialogflow_v2_ReloadDocumentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ReloadDocumentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ReloadDocumentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ReloadDocumentRequest build() {
      com.google.cloud.dialogflow.v2.ReloadDocumentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ReloadDocumentRequest buildPartial() {
      com.google.cloud.dialogflow.v2.ReloadDocumentRequest result =
          new com.google.cloud.dialogflow.v2.ReloadDocumentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2.ReloadDocumentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.importGcsCustomMetadata_ = importGcsCustomMetadata_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.smartMessagingPartialUpdate_ = smartMessagingPartialUpdate_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.dialogflow.v2.ReloadDocumentRequest result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ReloadDocumentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ReloadDocumentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ReloadDocumentRequest other) {
      if (other == com.google.cloud.dialogflow.v2.ReloadDocumentRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getImportGcsCustomMetadata() != false) {
        setImportGcsCustomMetadata(other.getImportGcsCustomMetadata());
      }
      if (other.getSmartMessagingPartialUpdate() != false) {
        setSmartMessagingPartialUpdate(other.getSmartMessagingPartialUpdate());
      }
      switch (other.getSourceCase()) {
        case CONTENT_URI:
          {
            sourceCase_ = 3;
            source_ = other.source_;
            onChanged();
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                sourceCase_ = 3;
                source_ = s;
                break;
              } // case 26
            case 32:
              {
                importGcsCustomMetadata_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
            case 40:
              {
                smartMessagingPartialUpdate_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 40
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the document to reload.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;/documents/&lt;Document ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the contentUri field is set.
     */
    @java.lang.Override
    public boolean hasContentUri() {
      return sourceCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The contentUri.
     */
    @java.lang.Override
    public java.lang.String getContentUri() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 3) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for contentUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContentUriBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 3) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (sourceCase_ == 3) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The contentUri to set.
     * @return This builder for chaining.
     */
    public Builder setContentUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContentUri() {
      if (sourceCase_ == 3) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The path of gcs source file for reloading document content. For
     * now, only gcs uri is supported.
     *
     * For documents stored in Google Cloud Storage, these URIs must have
     * the form `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`.
     * </pre>
     *
     * <code>string content_uri = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for contentUri to set.
     * @return This builder for chaining.
     */
    public Builder setContentUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceCase_ = 3;
      source_ = value;
      onChanged();
      return this;
    }

    private boolean importGcsCustomMetadata_;

    /**
     *
     *
     * <pre>
     * Optional. Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The importGcsCustomMetadata.
     */
    @java.lang.Override
    public boolean getImportGcsCustomMetadata() {
      return importGcsCustomMetadata_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The importGcsCustomMetadata to set.
     * @return This builder for chaining.
     */
    public Builder setImportGcsCustomMetadata(boolean value) {

      importGcsCustomMetadata_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to import custom metadata from Google Cloud Storage.
     * Only valid when the document source is Google Cloud Storage URI.
     * </pre>
     *
     * <code>bool import_gcs_custom_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImportGcsCustomMetadata() {
      bitField0_ = (bitField0_ & ~0x00000004);
      importGcsCustomMetadata_ = false;
      onChanged();
      return this;
    }

    private boolean smartMessagingPartialUpdate_;

    /**
     *
     *
     * <pre>
     * Optional. When enabled, the reload request is to apply partial update to
     * the smart messaging allowlist.
     * </pre>
     *
     * <code>bool smart_messaging_partial_update = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The smartMessagingPartialUpdate.
     */
    @java.lang.Override
    public boolean getSmartMessagingPartialUpdate() {
      return smartMessagingPartialUpdate_;
    }

    /**
     *
     *
     * <pre>
     * Optional. When enabled, the reload request is to apply partial update to
     * the smart messaging allowlist.
     * </pre>
     *
     * <code>bool smart_messaging_partial_update = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The smartMessagingPartialUpdate to set.
     * @return This builder for chaining.
     */
    public Builder setSmartMessagingPartialUpdate(boolean value) {

      smartMessagingPartialUpdate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. When enabled, the reload request is to apply partial update to
     * the smart messaging allowlist.
     * </pre>
     *
     * <code>bool smart_messaging_partial_update = 5 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSmartMessagingPartialUpdate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      smartMessagingPartialUpdate_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ReloadDocumentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ReloadDocumentRequest)
  private static final com.google.cloud.dialogflow.v2.ReloadDocumentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ReloadDocumentRequest();
  }

  public static com.google.cloud.dialogflow.v2.ReloadDocumentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReloadDocumentRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReloadDocumentRequest>() {
        @java.lang.Override
        public ReloadDocumentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReloadDocumentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReloadDocumentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ReloadDocumentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
