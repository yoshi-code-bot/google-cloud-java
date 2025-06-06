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
// source: google/cloud/dialogflow/cx/v3/flow.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

/**
 *
 *
 * <pre>
 * The request message for
 * [Flows.ExportFlow][google.cloud.dialogflow.cx.v3.Flows.ExportFlow].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3.ExportFlowRequest}
 */
public final class ExportFlowRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3.ExportFlowRequest)
    ExportFlowRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ExportFlowRequest.newBuilder() to construct.
  private ExportFlowRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExportFlowRequest() {
    name_ = "";
    flowUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExportFlowRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.class,
            com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Required. The name of the flow to export.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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
   * Required. The name of the flow to export.
   * Format:
   * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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

  public static final int FLOW_URI_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object flowUri_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
   * unspecified, the serialized flow is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The flowUri.
   */
  @java.lang.Override
  public java.lang.String getFlowUri() {
    java.lang.Object ref = flowUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flowUri_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The [Google Cloud
   * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
   * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
   * unspecified, the serialized flow is returned inline.
   *
   * Dialogflow performs a write operation for the Cloud Storage object
   * on the caller's behalf, so your request authentication must
   * have write permissions for the object. For more information, see
   * [Dialogflow access
   * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
   * </pre>
   *
   * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for flowUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFlowUriBytes() {
    java.lang.Object ref = flowUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      flowUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCLUDE_REFERENCED_FLOWS_FIELD_NUMBER = 4;
  private boolean includeReferencedFlows_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Whether to export flows referenced by the specified flow.
   * </pre>
   *
   * <code>bool include_referenced_flows = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The includeReferencedFlows.
   */
  @java.lang.Override
  public boolean getIncludeReferencedFlows() {
    return includeReferencedFlows_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, flowUri_);
    }
    if (includeReferencedFlows_ != false) {
      output.writeBool(4, includeReferencedFlows_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flowUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, flowUri_);
    }
    if (includeReferencedFlows_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, includeReferencedFlows_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3.ExportFlowRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3.ExportFlowRequest other =
        (com.google.cloud.dialogflow.cx.v3.ExportFlowRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getFlowUri().equals(other.getFlowUri())) return false;
    if (getIncludeReferencedFlows() != other.getIncludeReferencedFlows()) return false;
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
    hash = (37 * hash) + FLOW_URI_FIELD_NUMBER;
    hash = (53 * hash) + getFlowUri().hashCode();
    hash = (37 * hash) + INCLUDE_REFERENCED_FLOWS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIncludeReferencedFlows());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3.ExportFlowRequest prototype) {
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
   * [Flows.ExportFlow][google.cloud.dialogflow.cx.v3.Flows.ExportFlow].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3.ExportFlowRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3.ExportFlowRequest)
      com.google.cloud.dialogflow.cx.v3.ExportFlowRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.class,
              com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      flowUri_ = "";
      includeReferencedFlows_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3_ExportFlowRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowRequest build() {
      com.google.cloud.dialogflow.cx.v3.ExportFlowRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3.ExportFlowRequest buildPartial() {
      com.google.cloud.dialogflow.cx.v3.ExportFlowRequest result =
          new com.google.cloud.dialogflow.cx.v3.ExportFlowRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3.ExportFlowRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.flowUri_ = flowUri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.includeReferencedFlows_ = includeReferencedFlows_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3.ExportFlowRequest) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3.ExportFlowRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3.ExportFlowRequest other) {
      if (other == com.google.cloud.dialogflow.cx.v3.ExportFlowRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFlowUri().isEmpty()) {
        flowUri_ = other.flowUri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getIncludeReferencedFlows() != false) {
        setIncludeReferencedFlows(other.getIncludeReferencedFlows());
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
            case 18:
              {
                flowUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 32:
              {
                includeReferencedFlows_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Required. The name of the flow to export.
     * Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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
     * Required. The name of the flow to export.
     * Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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
     * Required. The name of the flow to export.
     * Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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
     * Required. The name of the flow to export.
     * Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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
     * Required. The name of the flow to export.
     * Format:
     * `projects/&lt;ProjectID&gt;/locations/&lt;LocationID&gt;/agents/&lt;AgentID&gt;/flows/&lt;FlowID&gt;`.
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

    private java.lang.Object flowUri_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The [Google Cloud
     * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
     * unspecified, the serialized flow is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The flowUri.
     */
    public java.lang.String getFlowUri() {
      java.lang.Object ref = flowUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flowUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The [Google Cloud
     * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
     * unspecified, the serialized flow is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for flowUri.
     */
    public com.google.protobuf.ByteString getFlowUriBytes() {
      java.lang.Object ref = flowUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        flowUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The [Google Cloud
     * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
     * unspecified, the serialized flow is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The flowUri to set.
     * @return This builder for chaining.
     */
    public Builder setFlowUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      flowUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The [Google Cloud
     * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
     * unspecified, the serialized flow is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFlowUri() {
      flowUri_ = getDefaultInstance().getFlowUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The [Google Cloud
     * Storage](https://cloud.google.com/storage/docs/) URI to export the flow to.
     * The format of this URI must be `gs://&lt;bucket-name&gt;/&lt;object-name&gt;`. If left
     * unspecified, the serialized flow is returned inline.
     *
     * Dialogflow performs a write operation for the Cloud Storage object
     * on the caller's behalf, so your request authentication must
     * have write permissions for the object. For more information, see
     * [Dialogflow access
     * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
     * </pre>
     *
     * <code>string flow_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for flowUri to set.
     * @return This builder for chaining.
     */
    public Builder setFlowUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      flowUri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean includeReferencedFlows_;

    /**
     *
     *
     * <pre>
     * Optional. Whether to export flows referenced by the specified flow.
     * </pre>
     *
     * <code>bool include_referenced_flows = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The includeReferencedFlows.
     */
    @java.lang.Override
    public boolean getIncludeReferencedFlows() {
      return includeReferencedFlows_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to export flows referenced by the specified flow.
     * </pre>
     *
     * <code>bool include_referenced_flows = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The includeReferencedFlows to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeReferencedFlows(boolean value) {

      includeReferencedFlows_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Whether to export flows referenced by the specified flow.
     * </pre>
     *
     * <code>bool include_referenced_flows = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIncludeReferencedFlows() {
      bitField0_ = (bitField0_ & ~0x00000004);
      includeReferencedFlows_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3.ExportFlowRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3.ExportFlowRequest)
  private static final com.google.cloud.dialogflow.cx.v3.ExportFlowRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3.ExportFlowRequest();
  }

  public static com.google.cloud.dialogflow.cx.v3.ExportFlowRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportFlowRequest> PARSER =
      new com.google.protobuf.AbstractParser<ExportFlowRequest>() {
        @java.lang.Override
        public ExportFlowRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportFlowRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportFlowRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3.ExportFlowRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
