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
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * A request for reporting an individual error event.
 * </pre>
 *
 * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest}
 */
public final class ReportErrorEventRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
    ReportErrorEventRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ReportErrorEventRequest.newBuilder() to construct.
  private ReportErrorEventRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReportErrorEventRequest() {
    projectName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReportErrorEventRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorsServiceProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorsServiceProto
        .internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.class,
            com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectName_ = "";

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectId}`, where `{projectId}` is the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   *
   * Example: // `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The projectName.
   */
  @java.lang.Override
  public java.lang.String getProjectName() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Google Cloud Platform project. Written
   * as `projects/{projectId}`, where `{projectId}` is the
   * [Google Cloud Platform project
   * ID](https://support.google.com/cloud/answer/6158840).
   *
   * Example: // `projects/my-project-123`.
   * </pre>
   *
   * <code>
   * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for projectName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectNameBytes() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_FIELD_NUMBER = 2;
  private com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event_;

  /**
   *
   *
   * <pre>
   * Required. The error event to be reported.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. The error event to be reported.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The event.
   */
  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent getEvent() {
    return event_ == null
        ? com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.getDefaultInstance()
        : event_;
  }

  /**
   *
   *
   * <pre>
   * Required. The error event to be reported.
   * </pre>
   *
   * <code>
   * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventOrBuilder
      getEventOrBuilder() {
    return event_ == null
        ? com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.getDefaultInstance()
        : event_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEvent());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEvent());
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
    if (!(obj instanceof com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest other =
        (com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest) obj;

    if (!getProjectName().equals(other.getProjectName())) return false;
    if (hasEvent() != other.hasEvent()) return false;
    if (hasEvent()) {
      if (!getEvent().equals(other.getEvent())) return false;
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
    hash = (37 * hash) + PROJECT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getProjectName().hashCode();
    if (hasEvent()) {
      hash = (37 * hash) + EVENT_FIELD_NUMBER;
      hash = (53 * hash) + getEvent().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest parseFrom(
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
      com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest prototype) {
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
   * A request for reporting an individual error event.
   * </pre>
   *
   * Protobuf type {@code google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
      com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.class,
              com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEventFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectName_ = "";
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorsServiceProto
          .internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
        getDefaultInstanceForType() {
      return com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest build() {
      com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest buildPartial() {
      com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest result =
          new com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectName_ = projectName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.event_ = eventBuilder_ == null ? event_ : eventBuilder_.build();
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
      if (other
          instanceof com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest) {
        return mergeFrom(
            (com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest other) {
      if (other
          == com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
              .getDefaultInstance()) return this;
      if (!other.getProjectName().isEmpty()) {
        projectName_ = other.projectName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEvent()) {
        mergeEvent(other.getEvent());
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
                projectName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getEventFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object projectName_ = "";

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Google Cloud Platform project. Written
     * as `projects/{projectId}`, where `{projectId}` is the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     *
     * Example: // `projects/my-project-123`.
     * </pre>
     *
     * <code>
     * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The projectName.
     */
    public java.lang.String getProjectName() {
      java.lang.Object ref = projectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Google Cloud Platform project. Written
     * as `projects/{projectId}`, where `{projectId}` is the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     *
     * Example: // `projects/my-project-123`.
     * </pre>
     *
     * <code>
     * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for projectName.
     */
    public com.google.protobuf.ByteString getProjectNameBytes() {
      java.lang.Object ref = projectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Google Cloud Platform project. Written
     * as `projects/{projectId}`, where `{projectId}` is the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     *
     * Example: // `projects/my-project-123`.
     * </pre>
     *
     * <code>
     * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The projectName to set.
     * @return This builder for chaining.
     */
    public Builder setProjectName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Google Cloud Platform project. Written
     * as `projects/{projectId}`, where `{projectId}` is the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     *
     * Example: // `projects/my-project-123`.
     * </pre>
     *
     * <code>
     * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectName() {
      projectName_ = getDefaultInstance().getProjectName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The resource name of the Google Cloud Platform project. Written
     * as `projects/{projectId}`, where `{projectId}` is the
     * [Google Cloud Platform project
     * ID](https://support.google.com/cloud/answer/6158840).
     *
     * Example: // `projects/my-project-123`.
     * </pre>
     *
     * <code>
     * string project_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for projectName to set.
     * @return This builder for chaining.
     */
    public Builder setProjectNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent,
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.Builder,
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventOrBuilder>
        eventBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the event field is set.
     */
    public boolean hasEvent() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The event.
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent getEvent() {
      if (eventBuilder_ == null) {
        return event_ == null
            ? com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent
                .getDefaultInstance()
            : event_;
      } else {
        return eventBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEvent(
        com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
      } else {
        eventBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEvent(
        com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.Builder
            builderForValue) {
      if (eventBuilder_ == null) {
        event_ = builderForValue.build();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEvent(
        com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent value) {
      if (eventBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && event_ != null
            && event_
                != com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent
                    .getDefaultInstance()) {
          getEventBuilder().mergeFrom(value);
        } else {
          event_ = value;
        }
      } else {
        eventBuilder_.mergeFrom(value);
      }
      if (event_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEvent() {
      bitField0_ = (bitField0_ & ~0x00000002);
      event_ = null;
      if (eventBuilder_ != null) {
        eventBuilder_.dispose();
        eventBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.Builder
        getEventBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEventFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventOrBuilder
        getEventOrBuilder() {
      if (eventBuilder_ != null) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        return event_ == null
            ? com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent
                .getDefaultInstance()
            : event_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The error event to be reported.
     * </pre>
     *
     * <code>
     * .google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent,
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.Builder,
            com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventOrBuilder>
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        eventBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent,
                com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent.Builder,
                com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEventOrBuilder>(
                getEvent(), getParentForChildren(), isClean());
        event_ = null;
      }
      return eventBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest)
  private static final com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest();
  }

  public static com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportErrorEventRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReportErrorEventRequest>() {
        @java.lang.Override
        public ReportErrorEventRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReportErrorEventRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportErrorEventRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
