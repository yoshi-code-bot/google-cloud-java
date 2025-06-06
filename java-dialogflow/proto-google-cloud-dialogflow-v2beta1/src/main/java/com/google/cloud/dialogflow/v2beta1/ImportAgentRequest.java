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
// source: google/cloud/dialogflow/v2beta1/agent.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [Agents.ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.ImportAgentRequest}
 */
public final class ImportAgentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
    ImportAgentRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ImportAgentRequest.newBuilder() to construct.
  private ImportAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportAgentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportAgentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.AgentProto
        .internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.class,
            com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.Builder.class);
  }

  private int agentCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object agent_;

  public enum AgentCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AGENT_URI(2),
    AGENT_CONTENT(3),
    AGENT_NOT_SET(0);
    private final int value;

    private AgentCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AgentCase valueOf(int value) {
      return forNumber(value);
    }

    public static AgentCase forNumber(int value) {
      switch (value) {
        case 2:
          return AGENT_URI;
        case 3:
          return AGENT_CONTENT;
        case 0:
          return AGENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AgentCase getAgentCase() {
    return AgentCase.forNumber(agentCase_);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
   * Required. The project that the agent to import is associated with.
   * Format: `projects/&lt;Project ID&gt;` or
   *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

  public static final int AGENT_URI_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return Whether the agentUri field is set.
   */
  public boolean hasAgentUri() {
    return agentCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The agentUri.
   */
  public java.lang.String getAgentUri() {
    java.lang.Object ref = "";
    if (agentCase_ == 2) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (agentCase_ == 2) {
        agent_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The URI to a Google Cloud Storage file containing the agent to import.
   * Note: The URI must start with "gs://".
   *
   * Dialogflow performs a read operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have read permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string agent_uri = 2;</code>
   *
   * @return The bytes for agentUri.
   */
  public com.google.protobuf.ByteString getAgentUriBytes() {
    java.lang.Object ref = "";
    if (agentCase_ == 2) {
      ref = agent_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (agentCase_ == 2) {
        agent_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_CONTENT_FIELD_NUMBER = 3;

  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return Whether the agentContent field is set.
   */
  @java.lang.Override
  public boolean hasAgentContent() {
    return agentCase_ == 3;
  }

  /**
   *
   *
   * <pre>
   * Zip compressed raw byte content for agent.
   * </pre>
   *
   * <code>bytes agent_content = 3;</code>
   *
   * @return The agentContent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAgentContent() {
    if (agentCase_ == 3) {
      return (com.google.protobuf.ByteString) agent_;
    }
    return com.google.protobuf.ByteString.EMPTY;
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
    if (agentCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agent_);
    }
    if (agentCase_ == 3) {
      output.writeBytes(3, (com.google.protobuf.ByteString) agent_);
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
    if (agentCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agent_);
    }
    if (agentCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              3, (com.google.protobuf.ByteString) agent_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.ImportAgentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.ImportAgentRequest other =
        (com.google.cloud.dialogflow.v2beta1.ImportAgentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getAgentCase().equals(other.getAgentCase())) return false;
    switch (agentCase_) {
      case 2:
        if (!getAgentUri().equals(other.getAgentUri())) return false;
        break;
      case 3:
        if (!getAgentContent().equals(other.getAgentContent())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    switch (agentCase_) {
      case 2:
        hash = (37 * hash) + AGENT_URI_FIELD_NUMBER;
        hash = (53 * hash) + getAgentUri().hashCode();
        break;
      case 3:
        hash = (37 * hash) + AGENT_CONTENT_FIELD_NUMBER;
        hash = (53 * hash) + getAgentContent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.ImportAgentRequest prototype) {
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
   * The request message for
   * [Agents.ImportAgent][google.cloud.dialogflow.v2beta1.Agents.ImportAgent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.ImportAgentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
      com.google.cloud.dialogflow.v2beta1.ImportAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.class,
              com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      agentCase_ = 0;
      agent_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.AgentProto
          .internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest build() {
      com.google.cloud.dialogflow.v2beta1.ImportAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.ImportAgentRequest result =
          new com.google.cloud.dialogflow.v2beta1.ImportAgentRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest result) {
      result.agentCase_ = agentCase_;
      result.agent_ = this.agent_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.ImportAgentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.ImportAgentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.ImportAgentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.ImportAgentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getAgentCase()) {
        case AGENT_URI:
          {
            agentCase_ = 2;
            agent_ = other.agent_;
            onChanged();
            break;
          }
        case AGENT_CONTENT:
          {
            setAgentContent(other.getAgentContent());
            break;
          }
        case AGENT_NOT_SET:
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                agentCase_ = 2;
                agent_ = s;
                break;
              } // case 18
            case 26:
              {
                agent_ = input.readBytes();
                agentCase_ = 3;
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

    private int agentCase_ = 0;
    private java.lang.Object agent_;

    public AgentCase getAgentCase() {
      return AgentCase.forNumber(agentCase_);
    }

    public Builder clearAgent() {
      agentCase_ = 0;
      agent_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The project that the agent to import is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project that the agent to import is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project that the agent to import is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project that the agent to import is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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
     * Required. The project that the agent to import is associated with.
     * Format: `projects/&lt;Project ID&gt;` or
     *         `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
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

    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return Whether the agentUri field is set.
     */
    @java.lang.Override
    public boolean hasAgentUri() {
      return agentCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return The agentUri.
     */
    @java.lang.Override
    public java.lang.String getAgentUri() {
      java.lang.Object ref = "";
      if (agentCase_ == 2) {
        ref = agent_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (agentCase_ == 2) {
          agent_ = s;
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
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return The bytes for agentUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAgentUriBytes() {
      java.lang.Object ref = "";
      if (agentCase_ == 2) {
        ref = agent_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (agentCase_ == 2) {
          agent_ = b;
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
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @param value The agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      agentCase_ = 2;
      agent_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAgentUri() {
      if (agentCase_ == 2) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URI to a Google Cloud Storage file containing the agent to import.
     * Note: The URI must start with "gs://".
     *
     * Dialogflow performs a read operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have read permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string agent_uri = 2;</code>
     *
     * @param value The bytes for agentUri to set.
     * @return This builder for chaining.
     */
    public Builder setAgentUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      agentCase_ = 2;
      agent_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return Whether the agentContent field is set.
     */
    public boolean hasAgentContent() {
      return agentCase_ == 3;
    }

    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return The agentContent.
     */
    public com.google.protobuf.ByteString getAgentContent() {
      if (agentCase_ == 3) {
        return (com.google.protobuf.ByteString) agent_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }

    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @param value The agentContent to set.
     * @return This builder for chaining.
     */
    public Builder setAgentContent(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      agentCase_ = 3;
      agent_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Zip compressed raw byte content for agent.
     * </pre>
     *
     * <code>bytes agent_content = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAgentContent() {
      if (agentCase_ == 3) {
        agentCase_ = 0;
        agent_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.ImportAgentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.ImportAgentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.ImportAgentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.ImportAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportAgentRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportAgentRequest>() {
        @java.lang.Override
        public ImportAgentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.ImportAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
