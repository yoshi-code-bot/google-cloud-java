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
// source: google/cloud/documentai/v1beta3/processor.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.documentai.v1beta3;

/**
 *
 *
 * <pre>
 * Contains the alias and the aliased resource name of processor version.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessorVersionAlias}
 */
public final class ProcessorVersionAlias extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta3.ProcessorVersionAlias)
    ProcessorVersionAliasOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ProcessorVersionAlias.newBuilder() to construct.
  private ProcessorVersionAlias(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ProcessorVersionAlias() {
    alias_ = "";
    processorVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ProcessorVersionAlias();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessor
        .internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta3.DocumentAiProcessor
        .internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.class,
            com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.Builder.class);
  }

  public static final int ALIAS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object alias_ = "";

  /**
   *
   *
   * <pre>
   * The alias in the form of `processor_version` resource name.
   * </pre>
   *
   * <code>string alias = 1;</code>
   *
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The alias in the form of `processor_version` resource name.
   * </pre>
   *
   * <code>string alias = 1;</code>
   *
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESSOR_VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object processorVersion_ = "";

  /**
   *
   *
   * <pre>
   * The resource name of aliased processor version.
   * </pre>
   *
   * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The processorVersion.
   */
  @java.lang.Override
  public java.lang.String getProcessorVersion() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processorVersion_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The resource name of aliased processor version.
   * </pre>
   *
   * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for processorVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProcessorVersionBytes() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      processorVersion_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alias_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, processorVersion_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alias_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, processorVersion_);
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta3.ProcessorVersionAlias)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta3.ProcessorVersionAlias other =
        (com.google.cloud.documentai.v1beta3.ProcessorVersionAlias) obj;

    if (!getAlias().equals(other.getAlias())) return false;
    if (!getProcessorVersion().equals(other.getProcessorVersion())) return false;
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
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    hash = (37 * hash) + PROCESSOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getProcessorVersion().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias parseFrom(
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
      com.google.cloud.documentai.v1beta3.ProcessorVersionAlias prototype) {
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
   * Contains the alias and the aliased resource name of processor version.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta3.ProcessorVersionAlias}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta3.ProcessorVersionAlias)
      com.google.cloud.documentai.v1beta3.ProcessorVersionAliasOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessor
          .internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessor
          .internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.class,
              com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      alias_ = "";
      processorVersion_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta3.DocumentAiProcessor
          .internal_static_google_cloud_documentai_v1beta3_ProcessorVersionAlias_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessorVersionAlias getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessorVersionAlias build() {
      com.google.cloud.documentai.v1beta3.ProcessorVersionAlias result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta3.ProcessorVersionAlias buildPartial() {
      com.google.cloud.documentai.v1beta3.ProcessorVersionAlias result =
          new com.google.cloud.documentai.v1beta3.ProcessorVersionAlias(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta3.ProcessorVersionAlias result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.alias_ = alias_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.processorVersion_ = processorVersion_;
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
      if (other instanceof com.google.cloud.documentai.v1beta3.ProcessorVersionAlias) {
        return mergeFrom((com.google.cloud.documentai.v1beta3.ProcessorVersionAlias) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta3.ProcessorVersionAlias other) {
      if (other == com.google.cloud.documentai.v1beta3.ProcessorVersionAlias.getDefaultInstance())
        return this;
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProcessorVersion().isEmpty()) {
        processorVersion_ = other.processorVersion_;
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
                alias_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                processorVersion_ = input.readStringRequireUtf8();
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

    private java.lang.Object alias_ = "";

    /**
     *
     *
     * <pre>
     * The alias in the form of `processor_version` resource name.
     * </pre>
     *
     * <code>string alias = 1;</code>
     *
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The alias in the form of `processor_version` resource name.
     * </pre>
     *
     * <code>string alias = 1;</code>
     *
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The alias in the form of `processor_version` resource name.
     * </pre>
     *
     * <code>string alias = 1;</code>
     *
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      alias_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The alias in the form of `processor_version` resource name.
     * </pre>
     *
     * <code>string alias = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      alias_ = getDefaultInstance().getAlias();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The alias in the form of `processor_version` resource name.
     * </pre>
     *
     * <code>string alias = 1;</code>
     *
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      alias_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object processorVersion_ = "";

    /**
     *
     *
     * <pre>
     * The resource name of aliased processor version.
     * </pre>
     *
     * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The processorVersion.
     */
    public java.lang.String getProcessorVersion() {
      java.lang.Object ref = processorVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processorVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The resource name of aliased processor version.
     * </pre>
     *
     * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for processorVersion.
     */
    public com.google.protobuf.ByteString getProcessorVersionBytes() {
      java.lang.Object ref = processorVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        processorVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The resource name of aliased processor version.
     * </pre>
     *
     * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      processorVersion_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource name of aliased processor version.
     * </pre>
     *
     * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProcessorVersion() {
      processorVersion_ = getDefaultInstance().getProcessorVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource name of aliased processor version.
     * </pre>
     *
     * <code>string processor_version = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      processorVersion_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta3.ProcessorVersionAlias)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta3.ProcessorVersionAlias)
  private static final com.google.cloud.documentai.v1beta3.ProcessorVersionAlias DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta3.ProcessorVersionAlias();
  }

  public static com.google.cloud.documentai.v1beta3.ProcessorVersionAlias getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessorVersionAlias> PARSER =
      new com.google.protobuf.AbstractParser<ProcessorVersionAlias>() {
        @java.lang.Override
        public ProcessorVersionAlias parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProcessorVersionAlias> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessorVersionAlias> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta3.ProcessorVersionAlias getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
