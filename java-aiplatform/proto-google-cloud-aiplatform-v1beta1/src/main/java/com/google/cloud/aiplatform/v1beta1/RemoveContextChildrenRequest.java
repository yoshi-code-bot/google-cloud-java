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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [MetadataService.DeleteContextChildrenRequest][].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest}
 */
public final class RemoveContextChildrenRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)
    RemoveContextChildrenRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RemoveContextChildrenRequest.newBuilder() to construct.
  private RemoveContextChildrenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RemoveContextChildrenRequest() {
    context_ = "";
    childContexts_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RemoveContextChildrenRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RemoveContextChildrenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RemoveContextChildrenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.class,
            com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object context_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent Context.
   *
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The context.
   */
  @java.lang.Override
  public java.lang.String getContext() {
    java.lang.Object ref = context_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      context_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the parent Context.
   *
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for context.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContextBytes() {
    java.lang.Object ref = context_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      context_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHILD_CONTEXTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList childContexts_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the childContexts.
   */
  public com.google.protobuf.ProtocolStringList getChildContextsList() {
    return childContexts_;
  }

  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of childContexts.
   */
  public int getChildContextsCount() {
    return childContexts_.size();
  }

  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The childContexts at the given index.
   */
  public java.lang.String getChildContexts(int index) {
    return childContexts_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The resource names of the child Contexts.
   * </pre>
   *
   * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the childContexts at the given index.
   */
  public com.google.protobuf.ByteString getChildContextsBytes(int index) {
    return childContexts_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(context_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, context_);
    }
    for (int i = 0; i < childContexts_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, childContexts_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(context_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, context_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < childContexts_.size(); i++) {
        dataSize += computeStringSizeNoTag(childContexts_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getChildContextsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest other =
        (com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest) obj;

    if (!getContext().equals(other.getContext())) return false;
    if (!getChildContextsList().equals(other.getChildContextsList())) return false;
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
    hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getContext().hashCode();
    if (getChildContextsCount() > 0) {
      hash = (37 * hash) + CHILD_CONTEXTS_FIELD_NUMBER;
      hash = (53 * hash) + getChildContextsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest prototype) {
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
   * [MetadataService.DeleteContextChildrenRequest][].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)
      com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveContextChildrenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveContextChildrenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.class,
              com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      context_ = "";
      childContexts_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MetadataServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RemoveContextChildrenRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest build() {
      com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest result =
          new com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.context_ = context_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        childContexts_.makeImmutable();
        result.childContexts_ = childContexts_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest.getDefaultInstance())
        return this;
      if (!other.getContext().isEmpty()) {
        context_ = other.context_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.childContexts_.isEmpty()) {
        if (childContexts_.isEmpty()) {
          childContexts_ = other.childContexts_;
          bitField0_ |= 0x00000002;
        } else {
          ensureChildContextsIsMutable();
          childContexts_.addAll(other.childContexts_);
        }
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
                context_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureChildContextsIsMutable();
                childContexts_.add(s);
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

    private java.lang.Object context_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent Context.
     *
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>
     * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The context.
     */
    public java.lang.String getContext() {
      java.lang.Object ref = context_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        context_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent Context.
     *
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>
     * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for context.
     */
    public com.google.protobuf.ByteString getContextBytes() {
      java.lang.Object ref = context_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        context_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent Context.
     *
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>
     * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The context to set.
     * @return This builder for chaining.
     */
    public Builder setContext(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      context_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent Context.
     *
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>
     * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContext() {
      context_ = getDefaultInstance().getContext();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the parent Context.
     *
     * Format:
     * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
     * </pre>
     *
     * <code>
     * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for context to set.
     * @return This builder for chaining.
     */
    public Builder setContextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      context_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList childContexts_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureChildContextsIsMutable() {
      if (!childContexts_.isModifiable()) {
        childContexts_ = new com.google.protobuf.LazyStringArrayList(childContexts_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return A list containing the childContexts.
     */
    public com.google.protobuf.ProtocolStringList getChildContextsList() {
      childContexts_.makeImmutable();
      return childContexts_;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The count of childContexts.
     */
    public int getChildContextsCount() {
      return childContexts_.size();
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the element to return.
     * @return The childContexts at the given index.
     */
    public java.lang.String getChildContexts(int index) {
      return childContexts_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the childContexts at the given index.
     */
    public com.google.protobuf.ByteString getChildContextsBytes(int index) {
      return childContexts_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param index The index to set the value at.
     * @param value The childContexts to set.
     * @return This builder for chaining.
     */
    public Builder setChildContexts(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChildContextsIsMutable();
      childContexts_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The childContexts to add.
     * @return This builder for chaining.
     */
    public Builder addChildContexts(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureChildContextsIsMutable();
      childContexts_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param values The childContexts to add.
     * @return This builder for chaining.
     */
    public Builder addAllChildContexts(java.lang.Iterable<java.lang.String> values) {
      ensureChildContextsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, childContexts_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearChildContexts() {
      childContexts_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The resource names of the child Contexts.
     * </pre>
     *
     * <code>repeated string child_contexts = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes of the childContexts to add.
     * @return This builder for chaining.
     */
    public Builder addChildContextsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureChildContextsIsMutable();
      childContexts_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest)
  private static final com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveContextChildrenRequest> PARSER =
      new com.google.protobuf.AbstractParser<RemoveContextChildrenRequest>() {
        @java.lang.Override
        public RemoveContextChildrenRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveContextChildrenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveContextChildrenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RemoveContextChildrenRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
