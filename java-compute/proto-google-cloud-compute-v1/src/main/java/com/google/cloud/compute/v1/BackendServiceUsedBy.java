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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.BackendServiceUsedBy}
 */
public final class BackendServiceUsedBy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BackendServiceUsedBy)
    BackendServiceUsedByOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BackendServiceUsedBy.newBuilder() to construct.
  private BackendServiceUsedBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BackendServiceUsedBy() {
    reference_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BackendServiceUsedBy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceUsedBy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BackendServiceUsedBy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BackendServiceUsedBy.class,
            com.google.cloud.compute.v1.BackendServiceUsedBy.Builder.class);
  }

  private int bitField0_;
  public static final int REFERENCE_FIELD_NUMBER = 148586315;

  @SuppressWarnings("serial")
  private volatile java.lang.Object reference_ = "";

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
   * </pre>
   *
   * <code>optional string reference = 148586315;</code>
   *
   * @return Whether the reference field is set.
   */
  @java.lang.Override
  public boolean hasReference() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
   * </pre>
   *
   * <code>optional string reference = 148586315;</code>
   *
   * @return The reference.
   */
  @java.lang.Override
  public java.lang.String getReference() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reference_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
   * </pre>
   *
   * <code>optional string reference = 148586315;</code>
   *
   * @return The bytes for reference.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReferenceBytes() {
    java.lang.Object ref = reference_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reference_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 148586315, reference_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(148586315, reference_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BackendServiceUsedBy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BackendServiceUsedBy other =
        (com.google.cloud.compute.v1.BackendServiceUsedBy) obj;

    if (hasReference() != other.hasReference()) return false;
    if (hasReference()) {
      if (!getReference().equals(other.getReference())) return false;
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
    if (hasReference()) {
      hash = (37 * hash) + REFERENCE_FIELD_NUMBER;
      hash = (53 * hash) + getReference().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.BackendServiceUsedBy prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.BackendServiceUsedBy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BackendServiceUsedBy)
      com.google.cloud.compute.v1.BackendServiceUsedByOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceUsedBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceUsedBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BackendServiceUsedBy.class,
              com.google.cloud.compute.v1.BackendServiceUsedBy.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BackendServiceUsedBy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      reference_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BackendServiceUsedBy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceUsedBy getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BackendServiceUsedBy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceUsedBy build() {
      com.google.cloud.compute.v1.BackendServiceUsedBy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BackendServiceUsedBy buildPartial() {
      com.google.cloud.compute.v1.BackendServiceUsedBy result =
          new com.google.cloud.compute.v1.BackendServiceUsedBy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BackendServiceUsedBy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reference_ = reference_;
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
      if (other instanceof com.google.cloud.compute.v1.BackendServiceUsedBy) {
        return mergeFrom((com.google.cloud.compute.v1.BackendServiceUsedBy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BackendServiceUsedBy other) {
      if (other == com.google.cloud.compute.v1.BackendServiceUsedBy.getDefaultInstance())
        return this;
      if (other.hasReference()) {
        reference_ = other.reference_;
        bitField0_ |= 0x00000001;
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
            case 1188690522:
              {
                reference_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 1188690522
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

    private java.lang.Object reference_ = "";

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @return Whether the reference field is set.
     */
    public boolean hasReference() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @return The reference.
     */
    public java.lang.String getReference() {
      java.lang.Object ref = reference_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reference_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @return The bytes for reference.
     */
    public com.google.protobuf.ByteString getReferenceBytes() {
      java.lang.Object ref = reference_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reference_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @param value The reference to set.
     * @return This builder for chaining.
     */
    public Builder setReference(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      reference_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReference() {
      reference_ = getDefaultInstance().getReference();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * [Output Only] Server-defined URL for resources referencing given BackendService like UrlMaps, TargetTcpProxies, TargetSslProxies and ForwardingRule.
     * </pre>
     *
     * <code>optional string reference = 148586315;</code>
     *
     * @param value The bytes for reference to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      reference_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BackendServiceUsedBy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BackendServiceUsedBy)
  private static final com.google.cloud.compute.v1.BackendServiceUsedBy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BackendServiceUsedBy();
  }

  public static com.google.cloud.compute.v1.BackendServiceUsedBy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendServiceUsedBy> PARSER =
      new com.google.protobuf.AbstractParser<BackendServiceUsedBy>() {
        @java.lang.Override
        public BackendServiceUsedBy parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackendServiceUsedBy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendServiceUsedBy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BackendServiceUsedBy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
