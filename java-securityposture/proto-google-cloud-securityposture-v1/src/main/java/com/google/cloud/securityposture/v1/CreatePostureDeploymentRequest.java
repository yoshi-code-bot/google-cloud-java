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
// source: google/cloud/securityposture/v1/securityposture.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securityposture.v1;

/**
 *
 *
 * <pre>
 * Message for creating a PostureDeployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securityposture.v1.CreatePostureDeploymentRequest}
 */
public final class CreatePostureDeploymentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securityposture.v1.CreatePostureDeploymentRequest)
    CreatePostureDeploymentRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreatePostureDeploymentRequest.newBuilder() to construct.
  private CreatePostureDeploymentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreatePostureDeploymentRequest() {
    parent_ = "";
    postureDeploymentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreatePostureDeploymentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_CreatePostureDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securityposture.v1.V1mainProto
        .internal_static_google_cloud_securityposture_v1_CreatePostureDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest.class,
            com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * Format: organizations/{org_id}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Value for parent.
   * Format: organizations/{org_id}/locations/{location}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTURE_DEPLOYMENT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object postureDeploymentId_ = "";

  /**
   *
   *
   * <pre>
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The postureDeploymentId.
   */
  @java.lang.Override
  public java.lang.String getPostureDeploymentId() {
    java.lang.Object ref = postureDeploymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      postureDeploymentId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. User provided identifier. It should be unique in scope of an
   * Organization and location.
   * </pre>
   *
   * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for postureDeploymentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPostureDeploymentIdBytes() {
    java.lang.Object ref = postureDeploymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      postureDeploymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTURE_DEPLOYMENT_FIELD_NUMBER = 3;
  private com.google.cloud.securityposture.v1.PostureDeployment postureDeployment_;

  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the postureDeployment field is set.
   */
  @java.lang.Override
  public boolean hasPostureDeployment() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The postureDeployment.
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PostureDeployment getPostureDeployment() {
    return postureDeployment_ == null
        ? com.google.cloud.securityposture.v1.PostureDeployment.getDefaultInstance()
        : postureDeployment_;
  }

  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securityposture.v1.PostureDeploymentOrBuilder
      getPostureDeploymentOrBuilder() {
    return postureDeployment_ == null
        ? com.google.cloud.securityposture.v1.PostureDeployment.getDefaultInstance()
        : postureDeployment_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(postureDeploymentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, postureDeploymentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getPostureDeployment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(postureDeploymentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, postureDeploymentId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPostureDeployment());
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
    if (!(obj instanceof com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest other =
        (com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getPostureDeploymentId().equals(other.getPostureDeploymentId())) return false;
    if (hasPostureDeployment() != other.hasPostureDeployment()) return false;
    if (hasPostureDeployment()) {
      if (!getPostureDeployment().equals(other.getPostureDeployment())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + POSTURE_DEPLOYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPostureDeploymentId().hashCode();
    if (hasPostureDeployment()) {
      hash = (37 * hash) + POSTURE_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getPostureDeployment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest parseFrom(
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
      com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest prototype) {
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
   * Message for creating a PostureDeployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securityposture.v1.CreatePostureDeploymentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securityposture.v1.CreatePostureDeploymentRequest)
      com.google.cloud.securityposture.v1.CreatePostureDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest.class,
              com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPostureDeploymentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      postureDeploymentId_ = "";
      postureDeployment_ = null;
      if (postureDeploymentBuilder_ != null) {
        postureDeploymentBuilder_.dispose();
        postureDeploymentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securityposture.v1.V1mainProto
          .internal_static_google_cloud_securityposture_v1_CreatePostureDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest build() {
      com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest buildPartial() {
      com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest result =
          new com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.postureDeploymentId_ = postureDeploymentId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.postureDeployment_ =
            postureDeploymentBuilder_ == null
                ? postureDeployment_
                : postureDeploymentBuilder_.build();
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
      if (other instanceof com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest) {
        return mergeFrom(
            (com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest other) {
      if (other
          == com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPostureDeploymentId().isEmpty()) {
        postureDeploymentId_ = other.postureDeploymentId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPostureDeployment()) {
        mergePostureDeployment(other.getPostureDeployment());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                postureDeploymentId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getPostureDeploymentFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * Format: organizations/{org_id}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * Format: organizations/{org_id}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * Format: organizations/{org_id}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * Format: organizations/{org_id}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Value for parent.
     * Format: organizations/{org_id}/locations/{location}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object postureDeploymentId_ = "";

    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The postureDeploymentId.
     */
    public java.lang.String getPostureDeploymentId() {
      java.lang.Object ref = postureDeploymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        postureDeploymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for postureDeploymentId.
     */
    public com.google.protobuf.ByteString getPostureDeploymentIdBytes() {
      java.lang.Object ref = postureDeploymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        postureDeploymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The postureDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setPostureDeploymentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      postureDeploymentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPostureDeploymentId() {
      postureDeploymentId_ = getDefaultInstance().getPostureDeploymentId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. User provided identifier. It should be unique in scope of an
     * Organization and location.
     * </pre>
     *
     * <code>string posture_deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for postureDeploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setPostureDeploymentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      postureDeploymentId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.cloud.securityposture.v1.PostureDeployment postureDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securityposture.v1.PostureDeployment,
            com.google.cloud.securityposture.v1.PostureDeployment.Builder,
            com.google.cloud.securityposture.v1.PostureDeploymentOrBuilder>
        postureDeploymentBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the postureDeployment field is set.
     */
    public boolean hasPostureDeployment() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The postureDeployment.
     */
    public com.google.cloud.securityposture.v1.PostureDeployment getPostureDeployment() {
      if (postureDeploymentBuilder_ == null) {
        return postureDeployment_ == null
            ? com.google.cloud.securityposture.v1.PostureDeployment.getDefaultInstance()
            : postureDeployment_;
      } else {
        return postureDeploymentBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPostureDeployment(
        com.google.cloud.securityposture.v1.PostureDeployment value) {
      if (postureDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        postureDeployment_ = value;
      } else {
        postureDeploymentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setPostureDeployment(
        com.google.cloud.securityposture.v1.PostureDeployment.Builder builderForValue) {
      if (postureDeploymentBuilder_ == null) {
        postureDeployment_ = builderForValue.build();
      } else {
        postureDeploymentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergePostureDeployment(
        com.google.cloud.securityposture.v1.PostureDeployment value) {
      if (postureDeploymentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && postureDeployment_ != null
            && postureDeployment_
                != com.google.cloud.securityposture.v1.PostureDeployment.getDefaultInstance()) {
          getPostureDeploymentBuilder().mergeFrom(value);
        } else {
          postureDeployment_ = value;
        }
      } else {
        postureDeploymentBuilder_.mergeFrom(value);
      }
      if (postureDeployment_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearPostureDeployment() {
      bitField0_ = (bitField0_ & ~0x00000004);
      postureDeployment_ = null;
      if (postureDeploymentBuilder_ != null) {
        postureDeploymentBuilder_.dispose();
        postureDeploymentBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securityposture.v1.PostureDeployment.Builder
        getPostureDeploymentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPostureDeploymentFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securityposture.v1.PostureDeploymentOrBuilder
        getPostureDeploymentOrBuilder() {
      if (postureDeploymentBuilder_ != null) {
        return postureDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return postureDeployment_ == null
            ? com.google.cloud.securityposture.v1.PostureDeployment.getDefaultInstance()
            : postureDeployment_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource being created.
     * </pre>
     *
     * <code>
     * .google.cloud.securityposture.v1.PostureDeployment posture_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securityposture.v1.PostureDeployment,
            com.google.cloud.securityposture.v1.PostureDeployment.Builder,
            com.google.cloud.securityposture.v1.PostureDeploymentOrBuilder>
        getPostureDeploymentFieldBuilder() {
      if (postureDeploymentBuilder_ == null) {
        postureDeploymentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securityposture.v1.PostureDeployment,
                com.google.cloud.securityposture.v1.PostureDeployment.Builder,
                com.google.cloud.securityposture.v1.PostureDeploymentOrBuilder>(
                getPostureDeployment(), getParentForChildren(), isClean());
        postureDeployment_ = null;
      }
      return postureDeploymentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securityposture.v1.CreatePostureDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securityposture.v1.CreatePostureDeploymentRequest)
  private static final com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest();
  }

  public static com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePostureDeploymentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreatePostureDeploymentRequest>() {
        @java.lang.Override
        public CreatePostureDeploymentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePostureDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePostureDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securityposture.v1.CreatePostureDeploymentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
