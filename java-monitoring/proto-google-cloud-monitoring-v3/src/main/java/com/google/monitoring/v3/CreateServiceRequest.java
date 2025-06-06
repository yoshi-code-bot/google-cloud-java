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
// source: google/monitoring/v3/service_service.proto

// Protobuf Java Version: 3.25.8
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `CreateService` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateServiceRequest}
 */
public final class CreateServiceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateServiceRequest)
    CreateServiceRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateServiceRequest.newBuilder() to construct.
  private CreateServiceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateServiceRequest() {
    parent_ = "";
    serviceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateServiceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_CreateServiceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringServiceProto
        .internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateServiceRequest.class,
            com.google.monitoring.v3.CreateServiceRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. Resource
   * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
   * parent Metrics Scope. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
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
   * Required. Resource
   * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
   * parent Metrics Scope. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
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

  public static final int SERVICE_ID_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceId_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
   * </pre>
   *
   * <code>string service_id = 3;</code>
   *
   * @return The serviceId.
   */
  @java.lang.Override
  public java.lang.String getServiceId() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The Service id to use for this Service. If omitted, an id will be
   * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
   * </pre>
   *
   * <code>string service_id = 3;</code>
   *
   * @return The bytes for serviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceIdBytes() {
    java.lang.Object ref = serviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.Service service_;

  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the service field is set.
   */
  @java.lang.Override
  public boolean hasService() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The service.
   */
  @java.lang.Override
  public com.google.monitoring.v3.Service getService() {
    return service_ == null ? com.google.monitoring.v3.Service.getDefaultInstance() : service_;
  }

  /**
   *
   *
   * <pre>
   * Required. The `Service` to create.
   * </pre>
   *
   * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.ServiceOrBuilder getServiceOrBuilder() {
    return service_ == null ? com.google.monitoring.v3.Service.getDefaultInstance() : service_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getService());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serviceId_);
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getService());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serviceId_);
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
    if (!(obj instanceof com.google.monitoring.v3.CreateServiceRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateServiceRequest other =
        (com.google.monitoring.v3.CreateServiceRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getServiceId().equals(other.getServiceId())) return false;
    if (hasService() != other.hasService()) return false;
    if (hasService()) {
      if (!getService().equals(other.getService())) return false;
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
    hash = (37 * hash) + SERVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceId().hashCode();
    if (hasService()) {
      hash = (37 * hash) + SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getService().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateServiceRequest parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.CreateServiceRequest prototype) {
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
   * The `CreateService` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateServiceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateServiceRequest)
      com.google.monitoring.v3.CreateServiceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateServiceRequest.class,
              com.google.monitoring.v3.CreateServiceRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateServiceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      serviceId_ = "";
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringServiceProto
          .internal_static_google_monitoring_v3_CreateServiceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateServiceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceRequest build() {
      com.google.monitoring.v3.CreateServiceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateServiceRequest buildPartial() {
      com.google.monitoring.v3.CreateServiceRequest result =
          new com.google.monitoring.v3.CreateServiceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.CreateServiceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.serviceId_ = serviceId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.service_ = serviceBuilder_ == null ? service_ : serviceBuilder_.build();
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
      if (other instanceof com.google.monitoring.v3.CreateServiceRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateServiceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateServiceRequest other) {
      if (other == com.google.monitoring.v3.CreateServiceRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getServiceId().isEmpty()) {
        serviceId_ = other.serviceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasService()) {
        mergeService(other.getService());
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
                input.readMessage(getServiceFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 18
            case 26:
              {
                serviceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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
     * Required. Resource
     * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
     * parent Metrics Scope. The format is:
     *
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. Resource
     * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
     * parent Metrics Scope. The format is:
     *
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. Resource
     * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
     * parent Metrics Scope. The format is:
     *
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. Resource
     * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
     * parent Metrics Scope. The format is:
     *
     *     projects/[PROJECT_ID_OR_NUMBER]
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
     * Required. Resource
     * [name](https://cloud.google.com/monitoring/api/v3#project_name) of the
     * parent Metrics Scope. The format is:
     *
     *     projects/[PROJECT_ID_OR_NUMBER]
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

    private java.lang.Object serviceId_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The Service id to use for this Service. If omitted, an id will be
     * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
     * </pre>
     *
     * <code>string service_id = 3;</code>
     *
     * @return The serviceId.
     */
    public java.lang.String getServiceId() {
      java.lang.Object ref = serviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Service id to use for this Service. If omitted, an id will be
     * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
     * </pre>
     *
     * <code>string service_id = 3;</code>
     *
     * @return The bytes for serviceId.
     */
    public com.google.protobuf.ByteString getServiceIdBytes() {
      java.lang.Object ref = serviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Service id to use for this Service. If omitted, an id will be
     * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
     * </pre>
     *
     * <code>string service_id = 3;</code>
     *
     * @param value The serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Service id to use for this Service. If omitted, an id will be
     * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
     * </pre>
     *
     * <code>string service_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceId() {
      serviceId_ = getDefaultInstance().getServiceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Service id to use for this Service. If omitted, an id will be
     * generated instead. Must match the pattern `[a-z0-9&#92;-]+`
     * </pre>
     *
     * <code>string service_id = 3;</code>
     *
     * @param value The bytes for serviceId to set.
     * @return This builder for chaining.
     */
    public Builder setServiceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.Service service_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Service,
            com.google.monitoring.v3.Service.Builder,
            com.google.monitoring.v3.ServiceOrBuilder>
        serviceBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the service field is set.
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The service.
     */
    public com.google.monitoring.v3.Service getService() {
      if (serviceBuilder_ == null) {
        return service_ == null ? com.google.monitoring.v3.Service.getDefaultInstance() : service_;
      } else {
        return serviceBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setService(com.google.monitoring.v3.Service value) {
      if (serviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        service_ = value;
      } else {
        serviceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setService(com.google.monitoring.v3.Service.Builder builderForValue) {
      if (serviceBuilder_ == null) {
        service_ = builderForValue.build();
      } else {
        serviceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeService(com.google.monitoring.v3.Service value) {
      if (serviceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && service_ != null
            && service_ != com.google.monitoring.v3.Service.getDefaultInstance()) {
          getServiceBuilder().mergeFrom(value);
        } else {
          service_ = value;
        }
      } else {
        serviceBuilder_.mergeFrom(value);
      }
      if (service_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearService() {
      bitField0_ = (bitField0_ & ~0x00000004);
      service_ = null;
      if (serviceBuilder_ != null) {
        serviceBuilder_.dispose();
        serviceBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.Service.Builder getServiceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getServiceFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.monitoring.v3.ServiceOrBuilder getServiceOrBuilder() {
      if (serviceBuilder_ != null) {
        return serviceBuilder_.getMessageOrBuilder();
      } else {
        return service_ == null ? com.google.monitoring.v3.Service.getDefaultInstance() : service_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The `Service` to create.
     * </pre>
     *
     * <code>.google.monitoring.v3.Service service = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Service,
            com.google.monitoring.v3.Service.Builder,
            com.google.monitoring.v3.ServiceOrBuilder>
        getServiceFieldBuilder() {
      if (serviceBuilder_ == null) {
        serviceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.Service,
                com.google.monitoring.v3.Service.Builder,
                com.google.monitoring.v3.ServiceOrBuilder>(
                getService(), getParentForChildren(), isClean());
        service_ = null;
      }
      return serviceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateServiceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateServiceRequest)
  private static final com.google.monitoring.v3.CreateServiceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateServiceRequest();
  }

  public static com.google.monitoring.v3.CreateServiceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateServiceRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateServiceRequest>() {
        @java.lang.Override
        public CreateServiceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateServiceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateServiceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateServiceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
