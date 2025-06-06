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
// source: google/cloud/aiplatform/v1beta1/index_endpoint_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [IndexEndpointService.UndeployIndex][google.cloud.aiplatform.v1beta1.IndexEndpointService.UndeployIndex].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UndeployIndexRequest}
 */
public final class UndeployIndexRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UndeployIndexRequest)
    UndeployIndexRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UndeployIndexRequest.newBuilder() to construct.
  private UndeployIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UndeployIndexRequest() {
    indexEndpoint_ = "";
    deployedIndexId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UndeployIndexRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.class,
            com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.Builder.class);
  }

  public static final int INDEX_ENDPOINT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object indexEndpoint_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource from which to undeploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  @java.lang.Override
  public java.lang.String getIndexEndpoint() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      indexEndpoint_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource from which to undeploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIndexEndpointBytes() {
    java.lang.Object ref = indexEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      indexEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYED_INDEX_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deployedIndexId_ = "";

  /**
   *
   *
   * <pre>
   * Required. The ID of the DeployedIndex to be undeployed from the
   * IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deployedIndexId.
   */
  @java.lang.Override
  public java.lang.String getDeployedIndexId() {
    java.lang.Object ref = deployedIndexId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployedIndexId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The ID of the DeployedIndex to be undeployed from the
   * IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deployedIndexId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeployedIndexIdBytes() {
    java.lang.Object ref = deployedIndexId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deployedIndexId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, indexEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedIndexId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deployedIndexId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(indexEndpoint_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, indexEndpoint_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedIndexId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deployedIndexId_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest other =
        (com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest) obj;

    if (!getIndexEndpoint().equals(other.getIndexEndpoint())) return false;
    if (!getDeployedIndexId().equals(other.getDeployedIndexId())) return false;
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
    hash = (37 * hash) + INDEX_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getIndexEndpoint().hashCode();
    hash = (37 * hash) + DEPLOYED_INDEX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeployedIndexId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest prototype) {
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
   * [IndexEndpointService.UndeployIndex][google.cloud.aiplatform.v1beta1.IndexEndpointService.UndeployIndex].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UndeployIndexRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UndeployIndexRequest)
      com.google.cloud.aiplatform.v1beta1.UndeployIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.class,
              com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      indexEndpoint_ = "";
      deployedIndexId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.IndexEndpointServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UndeployIndexRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest build() {
      com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest result =
          new com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.indexEndpoint_ = indexEndpoint_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deployedIndexId_ = deployedIndexId_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest.getDefaultInstance())
        return this;
      if (!other.getIndexEndpoint().isEmpty()) {
        indexEndpoint_ = other.indexEndpoint_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDeployedIndexId().isEmpty()) {
        deployedIndexId_ = other.deployedIndexId_;
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
                indexEndpoint_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                deployedIndexId_ = input.readStringRequireUtf8();
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

    private java.lang.Object indexEndpoint_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource from which to undeploy an
     * Index. Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The indexEndpoint.
     */
    public java.lang.String getIndexEndpoint() {
      java.lang.Object ref = indexEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        indexEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource from which to undeploy an
     * Index. Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for indexEndpoint.
     */
    public com.google.protobuf.ByteString getIndexEndpointBytes() {
      java.lang.Object ref = indexEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        indexEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource from which to undeploy an
     * Index. Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      indexEndpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource from which to undeploy an
     * Index. Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndexEndpoint() {
      indexEndpoint_ = getDefaultInstance().getIndexEndpoint();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The name of the IndexEndpoint resource from which to undeploy an
     * Index. Format:
     * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
     * </pre>
     *
     * <code>
     * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for indexEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setIndexEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      indexEndpoint_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object deployedIndexId_ = "";

    /**
     *
     *
     * <pre>
     * Required. The ID of the DeployedIndex to be undeployed from the
     * IndexEndpoint.
     * </pre>
     *
     * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The deployedIndexId.
     */
    public java.lang.String getDeployedIndexId() {
      java.lang.Object ref = deployedIndexId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployedIndexId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the DeployedIndex to be undeployed from the
     * IndexEndpoint.
     * </pre>
     *
     * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for deployedIndexId.
     */
    public com.google.protobuf.ByteString getDeployedIndexIdBytes() {
      java.lang.Object ref = deployedIndexId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deployedIndexId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the DeployedIndex to be undeployed from the
     * IndexEndpoint.
     * </pre>
     *
     * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The deployedIndexId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedIndexId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deployedIndexId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the DeployedIndex to be undeployed from the
     * IndexEndpoint.
     * </pre>
     *
     * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeployedIndexId() {
      deployedIndexId_ = getDefaultInstance().getDeployedIndexId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The ID of the DeployedIndex to be undeployed from the
     * IndexEndpoint.
     * </pre>
     *
     * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for deployedIndexId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedIndexIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deployedIndexId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UndeployIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UndeployIndexRequest)
  private static final com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UndeployIndexRequest> PARSER =
      new com.google.protobuf.AbstractParser<UndeployIndexRequest>() {
        @java.lang.Override
        public UndeployIndexRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UndeployIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UndeployIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UndeployIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
