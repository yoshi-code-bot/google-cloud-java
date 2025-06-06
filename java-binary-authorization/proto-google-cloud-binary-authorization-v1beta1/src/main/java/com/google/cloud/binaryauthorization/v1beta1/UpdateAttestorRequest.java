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
// source: google/cloud/binaryauthorization/v1beta1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.binaryauthorization.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [BinauthzManagementService.UpdateAttestor][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest}
 */
public final class UpdateAttestorRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest)
    UpdateAttestorRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateAttestorRequest.newBuilder() to construct.
  private UpdateAttestorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateAttestorRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateAttestorRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
        .internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
        .internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest.class,
            com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ATTESTOR_FIELD_NUMBER = 1;
  private com.google.cloud.binaryauthorization.v1beta1.Attestor attestor_;

  /**
   *
   *
   * <pre>
   * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
   * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the attestor field is set.
   */
  @java.lang.Override
  public boolean hasAttestor() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
   * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The attestor.
   */
  @java.lang.Override
  public com.google.cloud.binaryauthorization.v1beta1.Attestor getAttestor() {
    return attestor_ == null
        ? com.google.cloud.binaryauthorization.v1beta1.Attestor.getDefaultInstance()
        : attestor_;
  }

  /**
   *
   *
   * <pre>
   * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
   * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder getAttestorOrBuilder() {
    return attestor_ == null
        ? com.google.cloud.binaryauthorization.v1beta1.Attestor.getDefaultInstance()
        : attestor_;
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
      output.writeMessage(1, getAttestor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAttestor());
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
    if (!(obj instanceof com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest other =
        (com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest) obj;

    if (hasAttestor() != other.hasAttestor()) return false;
    if (hasAttestor()) {
      if (!getAttestor().equals(other.getAttestor())) return false;
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
    if (hasAttestor()) {
      hash = (37 * hash) + ATTESTOR_FIELD_NUMBER;
      hash = (53 * hash) + getAttestor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest parseFrom(
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
      com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest prototype) {
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
   * Request message for [BinauthzManagementService.UpdateAttestor][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest)
      com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest.class,
              com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAttestorFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attestor_ = null;
      if (attestorBuilder_ != null) {
        attestorBuilder_.dispose();
        attestorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.binaryauthorization.v1beta1.BinaryAuthorizationServiceProto
          .internal_static_google_cloud_binaryauthorization_v1beta1_UpdateAttestorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
        getDefaultInstanceForType() {
      return com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest build() {
      com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest buildPartial() {
      com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest result =
          new com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attestor_ = attestorBuilder_ == null ? attestor_ : attestorBuilder_.build();
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
      if (other instanceof com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest) {
        return mergeFrom(
            (com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest other) {
      if (other
          == com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
              .getDefaultInstance()) return this;
      if (other.hasAttestor()) {
        mergeAttestor(other.getAttestor());
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
                input.readMessage(getAttestorFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.binaryauthorization.v1beta1.Attestor attestor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.binaryauthorization.v1beta1.Attestor,
            com.google.cloud.binaryauthorization.v1beta1.Attestor.Builder,
            com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder>
        attestorBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the attestor field is set.
     */
    public boolean hasAttestor() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The attestor.
     */
    public com.google.cloud.binaryauthorization.v1beta1.Attestor getAttestor() {
      if (attestorBuilder_ == null) {
        return attestor_ == null
            ? com.google.cloud.binaryauthorization.v1beta1.Attestor.getDefaultInstance()
            : attestor_;
      } else {
        return attestorBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAttestor(com.google.cloud.binaryauthorization.v1beta1.Attestor value) {
      if (attestorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attestor_ = value;
      } else {
        attestorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAttestor(
        com.google.cloud.binaryauthorization.v1beta1.Attestor.Builder builderForValue) {
      if (attestorBuilder_ == null) {
        attestor_ = builderForValue.build();
      } else {
        attestorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAttestor(com.google.cloud.binaryauthorization.v1beta1.Attestor value) {
      if (attestorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && attestor_ != null
            && attestor_
                != com.google.cloud.binaryauthorization.v1beta1.Attestor.getDefaultInstance()) {
          getAttestorBuilder().mergeFrom(value);
        } else {
          attestor_ = value;
        }
      } else {
        attestorBuilder_.mergeFrom(value);
      }
      if (attestor_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAttestor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attestor_ = null;
      if (attestorBuilder_ != null) {
        attestorBuilder_.dispose();
        attestorBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.binaryauthorization.v1beta1.Attestor.Builder getAttestorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAttestorFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder getAttestorOrBuilder() {
      if (attestorBuilder_ != null) {
        return attestorBuilder_.getMessageOrBuilder();
      } else {
        return attestor_ == null
            ? com.google.cloud.binaryauthorization.v1beta1.Attestor.getDefaultInstance()
            : attestor_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The updated [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
     * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name
     * in the request URL, in the format `projects/&#42;&#47;attestors/&#42;`.
     * </pre>
     *
     * <code>
     * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.binaryauthorization.v1beta1.Attestor,
            com.google.cloud.binaryauthorization.v1beta1.Attestor.Builder,
            com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder>
        getAttestorFieldBuilder() {
      if (attestorBuilder_ == null) {
        attestorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.binaryauthorization.v1beta1.Attestor,
                com.google.cloud.binaryauthorization.v1beta1.Attestor.Builder,
                com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder>(
                getAttestor(), getParentForChildren(), isClean());
        attestor_ = null;
      }
      return attestorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest)
  private static final com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest();
  }

  public static com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAttestorRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateAttestorRequest>() {
        @java.lang.Override
        public UpdateAttestorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateAttestorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAttestorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.binaryauthorization.v1beta1.UpdateAttestorRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
